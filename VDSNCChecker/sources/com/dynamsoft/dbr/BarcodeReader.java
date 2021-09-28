package com.dynamsoft.dbr;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p016c0.C0559c;

public class BarcodeReader {
    public static final String MAIN_LTS_URL = "https://mlts.dynamsoft.com";
    private static final String NET_WORK_ERROR = "Failed to reach the Dynamsoft License Server.";
    public static final String STANDBY_LTS_URL = "https://slts.dynamsoft.com";
    private static final String S_VERSION = "8.6.0";
    private static final String TAG = "BarcodeReader";
    /* access modifiers changed from: private */
    public DMLTSConnectionParameters LTSParameters;
    public Handler backgroundHandler;
    public HandlerThread backgroundThread;
    /* access modifiers changed from: private */
    public BarcodeReader dbr;
    /* access modifiers changed from: private */
    public JSONObject info;
    private String licenseKeys;
    private CameraInterfaceFunc mCEFunc = null;
    private CameraEnhancerReadBarcodeTask mCERTask = null;
    private boolean mIfUseDuplicateFilter = false;
    private boolean mIfUseResulterification = false;
    private IntermediateResultCallback mIrtCallback = null;
    private Object mIrtCallback_UserData = null;
    public int mRound = 0;
    private TextResultCallback mTextResultCallback = null;
    private Object mTextResultCallback_UserData = null;
    /* access modifiers changed from: private */
    public long m_instance;
    private long m_userData;
    public HashMap<String, DecodeRecord> map = new HashMap<>();
    public HashMap<String, Long> map1 = new HashMap<>();
    public int oneDTrustFrameCount = 2;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f2522u;

    public class BarcodeGetLicenseTask extends AsyncTask<Void, Integer, JSONObject> {
        private static final String url1 = "https://dbrauthorize.dynamsoft.com/api/DbrLicense/Authorize";
        private static final String url2 = "https://dbrauthorize.dynamsoft.net/api/DbrLicense/Authorize";
        private DBRServerLicenseVerificationListener mDBRServerLicenseVerificationCallback;
        private JSONObject params;
        private String url;

        private BarcodeGetLicenseTask(String str, JSONObject jSONObject, DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener) {
            this.url = "";
            if ("".equals(str) || str == null) {
                this.url = url1;
            } else {
                this.url = str;
            }
            this.params = jSONObject;
            if (dBRServerLicenseVerificationListener != null) {
                this.mDBRServerLicenseVerificationCallback = dBRServerLicenseVerificationListener;
            }
        }

        public JSONObject doInBackground(Void... voidArr) {
            JSONObject jSONObject = new JSONObject();
            try {
                return BarcodeLicenseUtil.getLicense(this.url, this.params);
            } catch (Exception e) {
                DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener = this.mDBRServerLicenseVerificationCallback;
                if (dBRServerLicenseVerificationListener != null) {
                    dBRServerLicenseVerificationListener.licenseVerificationCallback(false, e);
                }
                if (!url1.equals(this.url)) {
                    return jSONObject;
                }
                try {
                    return BarcodeLicenseUtil.getLicense(url2, this.params);
                } catch (Exception e2) {
                    DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener2 = this.mDBRServerLicenseVerificationCallback;
                    if (dBRServerLicenseVerificationListener2 == null) {
                        return jSONObject;
                    }
                    dBRServerLicenseVerificationListener2.licenseVerificationCallback(false, e2);
                    return jSONObject;
                }
            }
        }

        public void onPostExecute(JSONObject jSONObject) {
            try {
                String obj = jSONObject.get("status").toString();
                if ("success".equals(obj)) {
                    String obj2 = this.params.get("licensekey").toString();
                    String obj3 = jSONObject.get("licenseinfo").toString();
                    String obj4 = this.params.get("machineid").toString();
                    File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir("").getPath(), obj4);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BarcodeLicenseUtil.saveStringToFile(file, "{\"licensecontent\":\"" + obj3 + "\",\"licensekey\":\"" + obj2 + "\",\"savedDate\":\"" + System.currentTimeMillis() + "\"}");
                    BarcodeLicenseNeedRefresh barcodeLicenseNeedRefresh = new BarcodeLicenseNeedRefresh();
                    BarcodeReader barcodeReader = BarcodeReader.this;
                    BarcodeReader.throwExceptionIfNeeded(barcodeReader.nativeSetLicenseInfo(barcodeReader.m_instance, obj, obj2, obj3, barcodeLicenseNeedRefresh, obj4, true));
                    DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener = this.mDBRServerLicenseVerificationCallback;
                    if (dBRServerLicenseVerificationListener != null) {
                        dBRServerLicenseVerificationListener.licenseVerificationCallback(true, (Exception) null);
                        return;
                    }
                    return;
                }
                DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener2 = this.mDBRServerLicenseVerificationCallback;
                if (dBRServerLicenseVerificationListener2 != null) {
                    dBRServerLicenseVerificationListener2.licenseVerificationCallback(false, new BarcodeReaderException(-10003, obj));
                }
            } catch (BarcodeReaderException | IOException e) {
                DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener3 = this.mDBRServerLicenseVerificationCallback;
                if (dBRServerLicenseVerificationListener3 != null) {
                    dBRServerLicenseVerificationListener3.licenseVerificationCallback(false, e);
                }
            } catch (JSONException unused) {
                DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener4 = this.mDBRServerLicenseVerificationCallback;
                if (dBRServerLicenseVerificationListener4 != null) {
                    dBRServerLicenseVerificationListener4.licenseVerificationCallback(false, new BarcodeReaderException((int) EnumErrorCode.DBR_REQUESTED_FAILED, "Request license failed"));
                }
            }
        }
    }

    public class BarcodeGetLicenseTaskEx extends AsyncTask<Void, Integer, String> {
        private DBRDLSLicenseVerificationListener mDLSListener;
        private DMDLSConnectionParameters mDLSParameter;
        private DBRLTSLicenseVerificationListener mLTSListener;
        private DMLTSConnectionParameters mLTSParameter;

        private BarcodeGetLicenseTaskEx(DMDLSConnectionParameters dMDLSConnectionParameters, DBRDLSLicenseVerificationListener dBRDLSLicenseVerificationListener) {
            this.mDLSListener = dBRDLSLicenseVerificationListener;
            this.mDLSParameter = dMDLSConnectionParameters;
            this.mLTSListener = null;
            this.mLTSParameter = null;
        }

        private BarcodeGetLicenseTaskEx(DMLTSConnectionParameters dMLTSConnectionParameters, DBRLTSLicenseVerificationListener dBRLTSLicenseVerificationListener) {
            this.mLTSListener = dBRLTSLicenseVerificationListener;
            this.mLTSParameter = dMLTSConnectionParameters;
            this.mDLSListener = null;
            this.mDLSParameter = null;
        }

        public String doInBackground(Void... voidArr) {
            BarcodeReaderException barcodeReaderException;
            if (this.mLTSParameter != null) {
                BarcodeReader barcodeReader = BarcodeReader.this;
                barcodeReaderException = barcodeReader.nativeInitLicenseFromLTSEx(barcodeReader.m_instance, this.mLTSParameter);
                BarcodeReader.this.nativeSetInitLicenseFromLTSFlag(false);
            } else {
                BarcodeReader barcodeReader2 = BarcodeReader.this;
                barcodeReaderException = barcodeReader2.nativeInitLicenseFromDLSEx(barcodeReader2.m_instance, this.mDLSParameter);
                BarcodeReader.this.nativeSetInitLicenseFromDLSFlag(false);
            }
            if (barcodeReaderException.errorCode == 0) {
                DBRLTSLicenseVerificationListener dBRLTSLicenseVerificationListener = this.mLTSListener;
                if (dBRLTSLicenseVerificationListener != null) {
                    dBRLTSLicenseVerificationListener.LTSLicenseVerificationCallback(true, (Exception) null);
                } else {
                    DBRDLSLicenseVerificationListener dBRDLSLicenseVerificationListener = this.mDLSListener;
                    if (dBRDLSLicenseVerificationListener != null) {
                        dBRDLSLicenseVerificationListener.DLSLicenseVerificationCallback(true, (Exception) null);
                    }
                }
            } else {
                DBRLTSLicenseVerificationListener dBRLTSLicenseVerificationListener2 = this.mLTSListener;
                if (dBRLTSLicenseVerificationListener2 != null) {
                    dBRLTSLicenseVerificationListener2.LTSLicenseVerificationCallback(false, barcodeReaderException);
                } else {
                    DBRDLSLicenseVerificationListener dBRDLSLicenseVerificationListener2 = this.mDLSListener;
                    if (dBRDLSLicenseVerificationListener2 != null) {
                        dBRDLSLicenseVerificationListener2.DLSLicenseVerificationCallback(false, barcodeReaderException);
                    }
                }
            }
            return null;
        }
    }

    public static class CameraEnhancerReadBarcodeTask extends AsyncTask<Void, Integer, String> {
        public Comparator<LocalizationResult> cmpFormat;
        private boolean irtIsSet;
        private TextResultCallback mCameraEnhanceTextCB;
        private CameraInterfaceFunc mCameraEnhancer;
        private IntermediateResultCallback mIrtCallback;
        private Object mIrtCallback_UserData;
        private Object mTextResultCallback_UserData;
        private BarcodeReader mdbr;
        private long mlastTime;

        private CameraEnhancerReadBarcodeTask(CameraInterfaceFunc cameraInterfaceFunc, BarcodeReader barcodeReader, TextResultCallback textResultCallback, Object obj, IntermediateResultCallback intermediateResultCallback, Object obj2) {
            this.mCameraEnhancer = null;
            this.mCameraEnhanceTextCB = null;
            this.mTextResultCallback_UserData = null;
            this.mIrtCallback = null;
            this.mIrtCallback_UserData = null;
            this.mlastTime = 0;
            this.cmpFormat = new Comparator<LocalizationResult>() {
                public int compare(LocalizationResult localizationResult, LocalizationResult localizationResult2) {
                    int i = localizationResult.barcodeFormat;
                    if (i == 67108864 || i == 134217728) {
                        return 1;
                    }
                    int i2 = localizationResult2.barcodeFormat;
                    if (i2 == 67108864 || i == 134217728 || (i & EnumBarcodeFormat.BF_ONED) != 0) {
                        return -1;
                    }
                    if ((1050623 & i2) != 0) {
                        return 1;
                    }
                    return i2 - i;
                }
            };
            this.irtIsSet = false;
            this.mCameraEnhancer = cameraInterfaceFunc;
            this.mdbr = barcodeReader;
            this.mCameraEnhanceTextCB = textResultCallback;
            this.mTextResultCallback_UserData = obj;
            this.mIrtCallback = intermediateResultCallback;
            this.mIrtCallback_UserData = obj2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
            if (r19.getOrientation() == 2) goto L_0x0122;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Rect GetRect(com.dynamsoft.dbr.IntermediateResult[] r18, com.dynamsoft.dbr.FrameInterfaceFunc r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = 0
                if (r1 == 0) goto L_0x012c
                int r3 = r1.length
                if (r3 != 0) goto L_0x000c
                goto L_0x012c
            L_0x000c:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                int r4 = r1.length
                r5 = 0
                r6 = r5
            L_0x0014:
                if (r6 >= r4) goto L_0x0031
                r7 = r1[r6]
                int r8 = r7.resultType
                r9 = 4096(0x1000, float:5.74E-42)
                if (r8 != r9) goto L_0x002e
                r8 = r5
            L_0x001f:
                java.lang.Object[] r9 = r7.results
                int r10 = r9.length
                if (r8 >= r10) goto L_0x002e
                r9 = r9[r8]
                com.dynamsoft.dbr.LocalizationResult r9 = (com.dynamsoft.dbr.LocalizationResult) r9
                r3.add(r9)
                int r8 = r8 + 1
                goto L_0x001f
            L_0x002e:
                int r6 = r6 + 1
                goto L_0x0014
            L_0x0031:
                int r1 = r19.getWidth()
                int r4 = r19.getHeight()
                int r6 = r3.size()
                r7 = 1
                if (r6 <= 0) goto L_0x00c3
                java.util.Comparator<com.dynamsoft.dbr.LocalizationResult> r6 = r0.cmpFormat
                java.util.Collections.sort(r3, r6)
                java.lang.Object r6 = r3.get(r5)
                com.dynamsoft.dbr.LocalizationResult r6 = (com.dynamsoft.dbr.LocalizationResult) r6
                com.dynamsoft.dbr.Point[] r8 = r6.resultPoints
                double r8 = r0.getDistanceSquare(r8, r1, r4)
                r10 = r7
            L_0x0052:
                int r11 = r3.size()
                if (r10 >= r11) goto L_0x00c4
                java.lang.Object r11 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r11 = (com.dynamsoft.dbr.LocalizationResult) r11
                int r11 = r11.barcodeFormat
                java.lang.Object r12 = r3.get(r5)
                com.dynamsoft.dbr.LocalizationResult r12 = (com.dynamsoft.dbr.LocalizationResult) r12
                int r12 = r12.barcodeFormat
                if (r11 == r12) goto L_0x006b
                goto L_0x00c4
            L_0x006b:
                java.lang.Object r11 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r11 = (com.dynamsoft.dbr.LocalizationResult) r11
                int r11 = r11.confidence
                double r11 = (double) r11
                int r13 = r6.confidence
                double r13 = (double) r13
                r15 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                double r13 = r13 * r15
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 <= 0) goto L_0x008e
                java.lang.Object r6 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r6 = (com.dynamsoft.dbr.LocalizationResult) r6
                com.dynamsoft.dbr.Point[] r8 = r6.resultPoints
                double r8 = r0.getDistanceSquare(r8, r1, r4)
                goto L_0x00c0
            L_0x008e:
                java.lang.Object r11 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r11 = (com.dynamsoft.dbr.LocalizationResult) r11
                int r11 = r11.confidence
                double r11 = (double) r11
                int r13 = r6.confidence
                double r13 = (double) r13
                r15 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
                double r13 = r13 * r15
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 <= 0) goto L_0x00c0
                java.lang.Object r11 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r11 = (com.dynamsoft.dbr.LocalizationResult) r11
                com.dynamsoft.dbr.Point[] r11 = r11.resultPoints
                double r11 = r0.getDistanceSquare(r11, r1, r4)
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 >= 0) goto L_0x00c0
                java.lang.Object r6 = r3.get(r10)
                com.dynamsoft.dbr.LocalizationResult r6 = (com.dynamsoft.dbr.LocalizationResult) r6
                com.dynamsoft.dbr.Point[] r8 = r6.resultPoints
                double r8 = r0.getDistanceSquare(r8, r1, r4)
            L_0x00c0:
                int r10 = r10 + 1
                goto L_0x0052
            L_0x00c3:
                r6 = r2
            L_0x00c4:
                if (r6 != 0) goto L_0x00c7
                return r2
            L_0x00c7:
                com.dynamsoft.dbr.Point[] r1 = r6.resultPoints
                r2 = r1[r5]
                int r2 = r2.f2523x
                r3 = r1[r5]
                int r3 = r3.f2524y
                int r4 = r1.length
                r6 = r3
                r8 = r5
                r3 = r2
                r5 = r6
            L_0x00d6:
                if (r8 >= r4) goto L_0x00ed
                r9 = r1[r8]
                int r10 = r9.f2523x
                if (r10 >= r2) goto L_0x00df
                r2 = r10
            L_0x00df:
                int r9 = r9.f2524y
                if (r9 >= r5) goto L_0x00e4
                r5 = r9
            L_0x00e4:
                if (r10 <= r3) goto L_0x00e7
                r3 = r10
            L_0x00e7:
                if (r9 <= r6) goto L_0x00ea
                r6 = r9
            L_0x00ea:
                int r8 = r8 + 1
                goto L_0x00d6
            L_0x00ed:
                boolean r1 = r19.isFastFrame()
                if (r1 == 0) goto L_0x0126
                int r1 = r19.getOriW()
                int r4 = r19.getOriH()
                int r8 = r19.getFastFrameId()
                int r8 = r8 % 4
                if (r8 != r7) goto L_0x0116
                int r8 = r19.getOrientation()
                if (r8 != r7) goto L_0x010e
                int r1 = r1 / 4
                int r2 = r2 + r1
                int r3 = r3 + r1
                goto L_0x0126
            L_0x010e:
                int r1 = r19.getOrientation()
                r7 = 2
                if (r1 != r7) goto L_0x0126
                goto L_0x0122
            L_0x0116:
                int r7 = r19.getFastFrameId()
                int r7 = r7 % 4
                if (r7 == 0) goto L_0x0126
                int r1 = r1 / 4
                int r2 = r2 + r1
                int r3 = r3 + r1
            L_0x0122:
                int r4 = r4 / 4
                int r5 = r5 + r4
                int r6 = r6 + r4
            L_0x0126:
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r2, r5, r3, r6)
                return r1
            L_0x012c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeReader.CameraEnhancerReadBarcodeTask.GetRect(com.dynamsoft.dbr.IntermediateResult[], com.dynamsoft.dbr.FrameInterfaceFunc):android.graphics.Rect");
        }

        private ArrayList<Point> GetResultPoints(TextResult[] textResultArr) {
            ArrayList<Point> arrayList = new ArrayList<>();
            if (textResultArr != null && textResultArr.length > 0) {
                for (int i = 0; i < textResultArr.length; i++) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        arrayList.add(new Point(textResultArr[i].localizationResult.resultPoints[i2].f2523x, textResultArr[i].localizationResult.resultPoints[i2].f2524y));
                    }
                }
            }
            return arrayList;
        }

        private double getDistanceSquare(Point[] pointArr, int i, int i2) {
            double d = 0.0d;
            double d2 = 0.0d;
            for (int i3 = 0; i3 < pointArr.length; i3++) {
                d += (double) pointArr[i3].f2523x;
                d2 += (double) pointArr[i3].f2524y;
            }
            double length = (d / ((double) pointArr.length)) - ((double) (i / 2));
            double length2 = (d2 / ((double) pointArr.length)) - ((double) (i2 / 2));
            return (length2 * length2) + (length * length);
        }

        public String doInBackground(Void... voidArr) {
            Rect cropRect;
            while (!isCancelled()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.mlastTime;
                if (currentTimeMillis - j < 20) {
                    try {
                        Thread.sleep((20 - currentTimeMillis) + j);
                    } catch (Exception unused) {
                    }
                }
                FrameInterfaceFunc AcquireListFrame = this.mCameraEnhancer.AcquireListFrame(true);
                if (AcquireListFrame != null) {
                    try {
                        if (!this.mCameraEnhancer.getAutoZoomStatus() || this.irtIsSet) {
                            this.irtIsSet = false;
                        } else {
                            PublicRuntimeSettings runtimeSettings = this.mdbr.getRuntimeSettings();
                            runtimeSettings.intermediateResultTypes |= 4096;
                            this.mdbr.updateRuntimeSettings(runtimeSettings);
                            this.irtIsSet = true;
                        }
                        System.currentTimeMillis();
                        TextResult[] decodeBuffer = this.mdbr.decodeBuffer(AcquireListFrame.getData(), AcquireListFrame.getWidth(), AcquireListFrame.getHeight(), AcquireListFrame.getStrides()[0], AcquireListFrame.getFormat(), "");
                        System.currentTimeMillis();
                        if (decodeBuffer != null && decodeBuffer.length > 0 && AcquireListFrame.isFastFrame() && (cropRect = AcquireListFrame.getCropRect()) != null) {
                            for (int i = 0; i < decodeBuffer.length; i++) {
                                for (int i2 = 0; i2 < 4; i2++) {
                                    decodeBuffer[i].localizationResult.resultPoints[i2].f2523x += cropRect.left;
                                    decodeBuffer[i].localizationResult.resultPoints[i2].f2524y += cropRect.top;
                                }
                            }
                        }
                        this.mCameraEnhancer.SetResultPoints(GetResultPoints(decodeBuffer));
                        TextResultCallback textResultCallback = this.mCameraEnhanceTextCB;
                        if (textResultCallback != null) {
                            textResultCallback.textResultCallback(AcquireListFrame.getFrameId(), decodeBuffer, this.mTextResultCallback_UserData);
                        }
                        if (decodeBuffer == null || decodeBuffer.length == 0 || this.mIrtCallback != null) {
                            IntermediateResult[] intermediateResults = this.mdbr.getIntermediateResults();
                            IntermediateResultCallback intermediateResultCallback = this.mIrtCallback;
                            if (!(intermediateResultCallback == null || intermediateResults == null || intermediateResults.length <= 0)) {
                                intermediateResultCallback.intermediateResultCallback(AcquireListFrame.getFrameId(), intermediateResults, this.mIrtCallback_UserData);
                            }
                            if (decodeBuffer == null || decodeBuffer.length == 0) {
                                this.mCameraEnhancer.SetZoomRegion(GetRect(intermediateResults, AcquireListFrame), AcquireListFrame.getOrientation());
                            }
                        }
                    } catch (BarcodeReaderException e) {
                        e.getMessage();
                    }
                    if (isCancelled()) {
                        return null;
                    }
                }
            }
            return null;
        }

        public void onPostExecute(String str) {
        }
    }

    public class DecodeRecord {
        public boolean bShow = false;
        public long lastTime = 0;
        public List<Integer> round = null;

        public DecodeRecord(long j, List<Integer> list, boolean z) {
            this.lastTime = j;
            this.round = list;
            this.bShow = z;
        }
    }

    static {
        try {
            System.loadLibrary("DynamsoftBarcodeReaderAndroid");
            nativeBinding();
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public BarcodeReader() {
        long nativeCreateInstance = nativeCreateInstance();
        this.m_instance = nativeCreateInstance;
        if (0 != nativeCreateInstance) {
            this.dbr = this;
            String packageName = BarcodeLicenseUtil.getApplication().getPackageName();
            if (this.m_userData == 0) {
                this.m_userData = nativeCreateUserData();
            }
            nativeSetArg(this.m_userData, BarcodeLicenseUtil.getApplication().getExternalFilesDir("").getPath(), (String) null, packageName, new BarcodeLicenseUtil());
            return;
        }
        throw new BarcodeReaderException(-10002, "Return null when create an DBR instance");
    }

    public BarcodeReader(String str) {
        long nativeCreateInstance = nativeCreateInstance();
        this.m_instance = nativeCreateInstance;
        if (0 != nativeCreateInstance) {
            this.licenseKeys = null;
            throwExceptionIfNeeded(nativeInitLicense(nativeCreateInstance, str));
            this.licenseKeys = str;
            this.dbr = this;
            return;
        }
        throw new BarcodeReaderException(-10002, "Return null when create an DBR instance");
    }

    private void connectServer(String str, DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", "getlicense");
        jSONObject.put("licensekey", str2);
        jSONObject.put("os", "4");
        jSONObject.put("devicename", BarcodeLicenseUtil.sha2Encode(str3));
        jSONObject.put("version", "8.6.0");
        jSONObject.put("machineid", str4);
        jSONObject.put("machinetype", BarcodeLicenseUtil.isEmulator() ? 100 : 101);
        new BarcodeGetLicenseTask(str, jSONObject, dBRServerLicenseVerificationListener).execute(new Void[0]);
    }

    private TextResult[] getUnduplicateResults(TextResult[] textResultArr) {
        long currentTimeMillis = System.currentTimeMillis();
        if (textResultArr == null || textResultArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TextResult textResult : textResultArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(textResult.barcodeFormat != 0 ? textResult.barcodeFormatString : textResult.barcodeFormatString_2);
            sb.append("_dbrkey_");
            sb.append(textResult.barcodeText);
            String sb2 = sb.toString();
            boolean z = true;
            if (this.map1.containsKey(sb2) && currentTimeMillis - this.map1.get(sb2).longValue() <= 3000) {
                z = false;
            }
            if (z) {
                arrayList.add(textResult);
                this.map1.put(sb2, Long.valueOf(currentTimeMillis));
            }
        }
        return (TextResult[]) arrayList.toArray(new TextResult[arrayList.size()]);
    }

    private String getUsu(int i) {
        if (i == 1) {
            return "DEVICE_COUNT";
        }
        if (i == 2) {
            return "SCAN_COUNT";
        }
        if (i == 3) {
            return "CONCURRENT_DEVICE_COUNT";
        }
        if (i == 6) {
            return "APP_DOMAIN_COUNT";
        }
        switch (i) {
            case 8:
                return "ACTIVE_DEVICE_COUNT";
            case 9:
                return "INSTANCE_COUNT";
            case 10:
                return "CONCURRENT_INSTANCE_COUNT";
            default:
                return "AUTO";
        }
    }

    private TextResult[] getVerifiedResults(TextResult[] textResultArr) {
        TextResult[] textResultArr2 = textResultArr;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        this.mRound++;
        if (textResultArr2 == null || textResultArr2.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, DecodeRecord>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            String str = (String) next.getKey();
            DecodeRecord decodeRecord = (DecodeRecord) next.getValue();
            int i = this.mRound;
            List<Integer> list = decodeRecord.round;
            if (i - list.get(list.size() - 1).intValue() > 5 || (currentTimeMillis - decodeRecord.lastTime > 3000 && decodeRecord.bShow)) {
                it.remove();
            }
        }
        boolean z2 = false;
        int i2 = 0;
        while (i2 < textResultArr2.length) {
            TextResult textResult = textResultArr2[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(textResult.barcodeFormat != 0 ? textResult.barcodeFormatString : textResult.barcodeFormatString_2);
            sb.append("_dbrkey_");
            sb.append(textResult.barcodeText);
            String sb2 = sb.toString();
            int i3 = textResult.barcodeFormat;
            boolean z3 = ((1050623 & i3) == 0 && (i3 & EnumBarcodeFormat.BF_GS1_DATABAR) == 0) ? z2 : z;
            if (this.map.containsKey(sb2)) {
                DecodeRecord decodeRecord2 = this.map.get(sb2);
                decodeRecord2.lastTime = currentTimeMillis;
                if (z3) {
                    decodeRecord2.round.add(Integer.valueOf(this.mRound));
                    int size = decodeRecord2.round.size();
                    int i4 = this.oneDTrustFrameCount;
                    if (size == i4) {
                        arrayList.add(textResult);
                        decodeRecord2.bShow = z;
                    } else if (size > i4) {
                        decodeRecord2.round.remove(z2 ? 1 : 0);
                        decodeRecord2.bShow = z;
                    }
                    i2++;
                    z = true;
                    z2 = false;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.mRound));
                DecodeRecord decodeRecord3 = r0;
                DecodeRecord decodeRecord4 = new DecodeRecord(currentTimeMillis, arrayList2, false);
                this.map.put(sb2, decodeRecord3);
                if (z3) {
                    i2++;
                    z = true;
                    z2 = false;
                }
            }
            arrayList.add(textResult);
            i2++;
            z = true;
            z2 = false;
        }
        return (TextResult[]) arrayList.toArray(new TextResult[arrayList.size()]);
    }

    /* access modifiers changed from: private */
    public void innerCalculate(IRTInnerResult iRTInnerResult) {
        String str;
        String str2 = "";
        byte[] bArr = iRTInnerResult.inner;
        if (bArr != null && this.info != null && this.f2522u != null) {
            try {
                String base64 = BarcodeLicenseUtil.base64(bArr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("in", base64);
                jSONObject.put("time", iRTInnerResult.stamp);
                String cacheFilePath = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"), this.f2522u);
                File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/cr");
                if (file.exists()) {
                    String readStringFromFile = BarcodeLicenseUtil.readStringFromFile(file);
                    if (TextUtils.isEmpty(readStringFromFile)) {
                        str = "@" + jSONObject.toString();
                    } else {
                        String[] split = readStringFromFile.split("@");
                        if (iRTInnerResult.stamp == new JSONObject(split[split.length - 1]).getLong("time")) {
                            split[split.length - 1] = jSONObject.toString();
                            for (int i = 1; i < split.length; i++) {
                                str2 = str2 + "@" + split[i];
                            }
                            BarcodeLicenseUtil.saveStringToFile(file, str2);
                        } else {
                            str = readStringFromFile + "@" + jSONObject.toString();
                        }
                    }
                    BarcodeLicenseUtil.saveStringToFile(file, str);
                } else {
                    try {
                        file.createNewFile();
                        BarcodeLicenseUtil.saveStringToFile(file, jSONObject.toString());
                        String cacheFilePath2 = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"));
                        new JSONObject(BarcodeLicenseUtil.readStringFromFile(new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/" + cacheFilePath2))).put("needAuth", true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (iRTInnerResult.ifNeedSend) {
                    this.backgroundHandler.removeMessages(0);
                    sendUsage();
                    return;
                }
                this.backgroundHandler.sendEmptyMessageDelayed(0, 180000);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void innerCalculate(InnerResult innerResult) {
        String str;
        String str2 = "";
        byte[] bArr = innerResult.inner;
        if (bArr != null && this.info != null && this.f2522u != null) {
            try {
                String base64 = BarcodeLicenseUtil.base64(bArr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("in", base64);
                jSONObject.put("time", innerResult.stamp);
                String cacheFilePath = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"), this.f2522u);
                File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/cr");
                if (file.exists()) {
                    String readStringFromFile = BarcodeLicenseUtil.readStringFromFile(file);
                    if (TextUtils.isEmpty(readStringFromFile)) {
                        str = "@" + jSONObject.toString();
                    } else {
                        String[] split = readStringFromFile.split("@");
                        if (innerResult.stamp == new JSONObject(split[split.length - 1]).getLong("time")) {
                            split[split.length - 1] = jSONObject.toString();
                            for (int i = 1; i < split.length; i++) {
                                str2 = str2 + "@" + split[i];
                            }
                            BarcodeLicenseUtil.saveStringToFile(file, str2);
                        } else {
                            str = readStringFromFile + "@" + jSONObject.toString();
                        }
                    }
                    BarcodeLicenseUtil.saveStringToFile(file, str);
                } else {
                    try {
                        file.createNewFile();
                        BarcodeLicenseUtil.saveStringToFile(file, jSONObject.toString());
                        String cacheFilePath2 = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"));
                        new JSONObject(BarcodeLicenseUtil.readStringFromFile(new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/" + cacheFilePath2))).put("needAuth", true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (innerResult.ifNeedSend) {
                    this.backgroundHandler.removeMessages(0);
                    sendUsage();
                    return;
                }
                this.backgroundHandler.sendEmptyMessageDelayed(0, 180000);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private native int nativeAppendFrame(long j, byte[] bArr);

    private native BarcodeReaderException nativeAppendTplFileToRuntimeSettings(long j, String str, int i);

    private native BarcodeReaderException nativeAppendTplStringToRuntimeSettings(long j, String str, int i);

    private static native void nativeBinding();

    private native long nativeCreateInstance();

    private native long nativeCreateUserData();

    private native Object nativeDecodeBase64String(long j, String str, String str2);

    private native Object nativeDecodeBuffer(long j, byte[] bArr, int i, int i2, int i3, int i4, String str);

    private native Object nativeDecodeFile(long j, String str, String str2);

    private native Object nativeDecodeFileInMemory(long j, byte[] bArr, String str);

    private native Object nativeDecodeIntermediateResult(long j, IntermediateResult[] intermediateResultArr, String str);

    private native void nativeDestroyInstance(long j);

    private native void nativeDestroyUserData(long j);

    private native String[] nativeGetAllParameterTemplateNames(long j);

    private native Object nativeGetIntermediateResults(long j);

    private native int nativeGetLengthOfFrameQueue(long j);

    private native Object nativeGetModeArgument(long j, String str, int i, String str2);

    private native Object nativeGetRuntimeSettings(long j);

    private native String nativeGetVersion(long j);

    private native Object nativeInitFrameDecodingParameters(long j);

    private native Object nativeInitIntermediateResult(long j, int i);

    private native BarcodeReaderException nativeInitLicense(long j, String str);

    private native BarcodeReaderException nativeInitLicenseFromDLS(String str, String str2, String str3, String str4, String str5, String str6, int i);

    /* access modifiers changed from: private */
    public native BarcodeReaderException nativeInitLicenseFromDLSEx(long j, DMDLSConnectionParameters dMDLSConnectionParameters);

    private native BarcodeReaderException nativeInitLicenseFromLTS(String str, String str2, String str3, String str4, String str5, String str6, int i);

    /* access modifiers changed from: private */
    public native BarcodeReaderException nativeInitLicenseFromLTSEx(long j, DMLTSConnectionParameters dMLTSConnectionParameters);

    private native BarcodeReaderException nativeInitRuntimeSettingsWithFile(long j, String str, int i);

    private native BarcodeReaderException nativeInitRuntimeSettingsWithString(long j, String str, int i);

    private native Object nativeOutputLicenseToString(long j);

    private native BarcodeReaderException nativeOutputSettingsToFile(long j, String str, String str2);

    private native Object nativeOutputSettingsToString(long j, String str);

    public static native void nativeRemoveDLSLicense();

    public static native void nativeRemoveLTSLicense();

    private native BarcodeReaderException nativeResetRuntimeSettings(long j);

    private native void nativeSetArg(long j, String str, String str2, String str3, BarcodeLicenseUtil barcodeLicenseUtil);

    /* access modifiers changed from: private */
    public native int nativeSetCountOveredFrame(long j, int i);

    public static native void nativeSetDLSInitFinalError(int i, String str);

    private native BarcodeReaderException nativeSetErrorCallback(long j, long j2, ErrorCallback errorCallback, Object obj);

    /* access modifiers changed from: private */
    public native int nativeSetFrameFrequency(long j, int i);

    /* access modifiers changed from: private */
    public native void nativeSetInitLicenseFromDLSFlag(boolean z);

    /* access modifiers changed from: private */
    public native void nativeSetInitLicenseFromLTSFlag(boolean z);

    private native BarcodeReaderException nativeSetIntermediateResultCallback(long j, long j2, IRTInnerCallback iRTInnerCallback, Object obj);

    public static native void nativeSetLTSInitFinalError(int i, String str);

    /* access modifiers changed from: private */
    public native BarcodeReaderException nativeSetLicenseInfo(long j, String str, String str2, String str3, BarcodeLicenseNeedRefresh barcodeLicenseNeedRefresh, String str4, boolean z);

    private native BarcodeReaderException nativeSetModeArgument(long j, String str, int i, String str2, String str3);

    private native BarcodeReaderException nativeSetTextResultCallback(long j, long j2, InnerCallback innerCallback, Object obj);

    private native String[] nativeSplitForDLS(byte[] bArr);

    private native String[] nativeSplitForLTS(byte[] bArr);

    private native BarcodeReaderException nativeStartFrameDecoding(long j, int i, int i2, int i3, int i4, int i5, int i6, String str);

    private native BarcodeReaderException nativeStartFrameDecodingEx(long j, FrameDecodingParameters frameDecodingParameters, String str);

    private native BarcodeReaderException nativeStopFrameDecoding(long j);

    private native BarcodeReaderException nativeUpdateRuntimeSettings(long j, PublicRuntimeSettings publicRuntimeSettings);

    /* access modifiers changed from: private */
    public void sendUsage() {
        String str = "";
        try {
            String cacheFilePath = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"), this.f2522u);
            File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str).getPath(), cacheFilePath + "/cr");
            if (file.exists()) {
                String[] split = BarcodeLicenseUtil.readStringFromFile(file).split("@");
                if (split != null && split.length != 0) {
                    if (split.length != 1) {
                        for (int i = 0; i < split.length; i++) {
                            if (!TextUtils.isEmpty(split[i])) {
                                try {
                                    long j = new JSONObject(split[i]).getLong("time");
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                                    Date parse = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j)));
                                    Calendar instance = Calendar.getInstance();
                                    instance.setTime(parse);
                                    instance.add(5, 30);
                                    if (instance.getTime().after(new Date())) {
                                        str = str + "@" + split[i];
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        BarcodeLicenseUtil.saveStringToFile(file, str);
                        String[] split2 = BarcodeLicenseUtil.readStringFromFile(file).split("@");
                        String str2 = "[";
                        int length = split2.length / 1000;
                        for (int i2 = 0; i2 <= length; i2++) {
                            new JSONArray();
                            int i3 = i2 * 1000;
                            if (i2 < length) {
                                while (i3 < (i2 + 1) * 1000) {
                                    if (TextUtils.isEmpty(split2[i3])) {
                                        str2 = str2 + "\"" + new JSONObject(split2[i3]).getString("in") + "\",";
                                    }
                                    i3++;
                                }
                            } else {
                                while (i3 < split2.length) {
                                    if (!TextUtils.isEmpty(split2[i3])) {
                                        str2 = str2 + "\"" + new JSONObject(split2[i3]).getString("in") + "\",";
                                    }
                                    i3++;
                                }
                            }
                        }
                        final String str3 = str2.substring(0, str2.length() - 1) + "]";
                        try {
                            if (!TextUtils.isEmpty(str2)) {
                                new Thread(new Runnable() {
                                    public void run() {
                                        BarcodeLicenseUtil.sendUsage(str3, BarcodeReader.this.f2522u, BarcodeReader.this.info, BarcodeReader.this.LTSParameters, BarcodeReader.this.dbr);
                                    }
                                }).start();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                try {
                    file.createNewFile();
                    String cacheFilePath2 = BarcodeLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"));
                    new JSONObject(BarcodeLicenseUtil.readStringFromFile(new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir(str).getPath(), cacheFilePath + "/" + cacheFilePath2))).put("needAuth", true);
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private void startBackgroundThread() {
        HandlerThread handlerThread = new HandlerThread("BackgroundThread");
        this.backgroundThread = handlerThread;
        handlerThread.start();
        this.backgroundHandler = new Handler(this.backgroundThread.getLooper()) {
            public void handleMessage(Message message) {
                try {
                    if (message.what == 0) {
                        BarcodeReader.this.sendUsage();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                super.handleMessage(message);
            }
        };
    }

    private void stopBackgroundThread() {
        HandlerThread handlerThread = this.backgroundThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.backgroundThread.join();
                this.backgroundThread = null;
                this.backgroundHandler = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void throwExceptionIfNeeded(BarcodeReaderException barcodeReaderException) {
        int i = barcodeReaderException.errorCode;
        if (i != -20200 && i != -20007 && i != -20000 && i != -10061 && i != -10041 && i != -10026 && i != 0 && i != -20010 && i != -20009 && i != -10020 && i != -10019 && i != -10017 && i != -10016 && i != -10004 && i != -10003) {
            switch (i) {
                case -20005:
                case -20004:
                case -20003:
                case -20002:
                    return;
                default:
                    switch (i) {
                        case EnumErrorCode.DBR_GS1_COMPOSITE_LICENSE_INVALID:
                        case EnumErrorCode.DBR_GS1_DATABAR_LICENSE_INVALID:
                        case EnumErrorCode.DBR_MAXICODE_LICENSE_INVALID:
                        case EnumErrorCode.DBR_IRT_LICENSE_INVALID:
                            return;
                        default:
                            switch (i) {
                                case EnumErrorCode.DBR_DPM_LICENSE_INVALID:
                                case EnumErrorCode.DBR_POSTALCODE_LICENSE_INVALID:
                                case EnumErrorCode.DBR_PATCHCODE_LICENSE_INVALID:
                                    return;
                                default:
                                    throw barcodeReaderException;
                            }
                    }
            }
        }
    }

    public void PauseCameraEnhancer() {
        this.mCEFunc.pause();
    }

    public void ResumeCameraEnhancer() {
        this.mCEFunc.resume();
    }

    public void SetCameraEnhancerParam(DCESettingParameters dCESettingParameters) {
        Object obj = dCESettingParameters.cameraInstance;
        if (obj != null) {
            CameraInterfaceFunc cameraInterfaceFunc = new CameraInterfaceFunc(obj);
            this.mCEFunc = cameraInterfaceFunc;
            cameraInterfaceFunc.addCameraListener(new CameraInnerListener() {
                public void process(int i, int i2) {
                    BarcodeReader barcodeReader = BarcodeReader.this;
                    int unused = barcodeReader.nativeSetFrameFrequency(barcodeReader.m_instance, i);
                    BarcodeReader barcodeReader2 = BarcodeReader.this;
                    int unused2 = barcodeReader2.nativeSetCountOveredFrame(barcodeReader2.m_instance, i2);
                }
            });
        }
        TextResultCallback textResultCallback = dCESettingParameters.textResultCallback;
        if (textResultCallback != null) {
            this.mTextResultCallback = textResultCallback;
        }
        Object obj2 = dCESettingParameters.textResultCallback_UserData;
        if (obj2 != null) {
            this.mTextResultCallback_UserData = obj2;
        }
        IntermediateResultCallback intermediateResultCallback = dCESettingParameters.intermediateResultCallback;
        if (intermediateResultCallback != null) {
            this.mIrtCallback = intermediateResultCallback;
        }
        Object obj3 = dCESettingParameters.intermediateResultCallback_UserData;
        if (obj3 != null) {
            this.mIrtCallback_UserData = obj3;
        }
    }

    public void StartCameraEnhancer() {
        CameraEnhancerReadBarcodeTask cameraEnhancerReadBarcodeTask = new CameraEnhancerReadBarcodeTask(this.mCEFunc, this, this.mTextResultCallback, this.mTextResultCallback_UserData, this.mIrtCallback, this.mIrtCallback_UserData);
        this.mCERTask = cameraEnhancerReadBarcodeTask;
        cameraEnhancerReadBarcodeTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        this.mCEFunc.start();
        try {
            this.mCEFunc.SetBoxViewByRegionDefinition(getRuntimeSettings().region);
        } catch (BarcodeReaderException e) {
            e.printStackTrace();
        }
    }

    public void StopCameraEnhancer() {
        this.mCEFunc.stop();
        this.mCERTask.cancel(true);
        this.mCERTask = null;
    }

    public int appendFrame(byte[] bArr) {
        return nativeAppendFrame(this.m_instance, bArr);
    }

    public void appendTplFileToRuntimeSettings(String str, int i) {
        throwExceptionIfNeeded(nativeAppendTplFileToRuntimeSettings(this.m_instance, str, i));
    }

    public void appendTplStringToRuntimeSettings(String str, int i) {
        throwExceptionIfNeeded(nativeAppendTplStringToRuntimeSettings(this.m_instance, str, i));
    }

    public void clearCache(DMDLSConnectionParameters dMDLSConnectionParameters) {
        if (TextUtils.isEmpty(dMDLSConnectionParameters.mainServerURL)) {
            if (TextUtils.isEmpty(dMDLSConnectionParameters.standbyServerURL)) {
                dMDLSConnectionParameters.mainServerURL = "https://mlts.dynamsoft.com";
                dMDLSConnectionParameters.standbyServerURL = "https://slts.dynamsoft.com";
            } else {
                dMDLSConnectionParameters.mainServerURL = dMDLSConnectionParameters.standbyServerURL;
            }
        }
        File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir("").getPath(), C0559c.m1823a(BarcodeLicenseUtil.getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, dMDLSConnectionParameters.mainServerURL), "/", BarcodeLicenseUtil.getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID)));
        if (file.exists()) {
            file.delete();
        }
    }

    public void clearCache(DMLTSConnectionParameters dMLTSConnectionParameters) {
        if (TextUtils.isEmpty(dMLTSConnectionParameters.mainServerURL)) {
            if (TextUtils.isEmpty(dMLTSConnectionParameters.standbyServerURL)) {
                dMLTSConnectionParameters.mainServerURL = "https://mlts.dynamsoft.com";
                dMLTSConnectionParameters.standbyServerURL = "https://slts.dynamsoft.com";
            } else {
                dMLTSConnectionParameters.mainServerURL = dMLTSConnectionParameters.standbyServerURL;
            }
        }
        File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir("").getPath(), C0559c.m1823a(BarcodeLicenseUtil.getCacheFilePath(dMLTSConnectionParameters.handshakeCode, dMLTSConnectionParameters.organizationID, dMLTSConnectionParameters.mainServerURL), "/", BarcodeLicenseUtil.getCacheFilePath(dMLTSConnectionParameters.handshakeCode, dMLTSConnectionParameters.organizationID)));
        if (file.exists()) {
            file.delete();
        }
    }

    public TextResult[] decodeBase64(String str, String str2) {
        Object nativeDecodeBase64String = nativeDecodeBase64String(this.m_instance, str, str2);
        if (!(nativeDecodeBase64String instanceof BarcodeReaderException)) {
            InnerResult innerResult = (InnerResult) nativeDecodeBase64String;
            innerCalculate(innerResult);
            return innerResult.textResults;
        }
        throw ((BarcodeReaderException) nativeDecodeBase64String);
    }

    public TextResult[] decodeBase64String(String str, String str2) {
        return decodeBase64(str, str2);
    }

    public TextResult[] decodeBuffer(byte[] bArr, int i, int i2, int i3, int i4, String str) {
        TextResult[] decodeRawImage = decodeRawImage(bArr, i, i2, i3, i4, str);
        if (this.mIfUseResulterification) {
            decodeRawImage = getVerifiedResults(decodeRawImage);
        }
        return this.mIfUseDuplicateFilter ? getUnduplicateResults(decodeRawImage) : decodeRawImage;
    }

    public TextResult[] decodeBufferedImage(Bitmap bitmap, String str) {
        return decodeImage(bitmap, str);
    }

    public TextResult[] decodeFile(String str, String str2) {
        return decodeImage(str, str2);
    }

    public TextResult[] decodeFileInMemory(InputStream inputStream, String str) {
        return decodeImage(inputStream, str);
    }

    public TextResult[] decodeFileInMemory(byte[] bArr, String str) {
        return decodeImage(bArr, str);
    }

    public TextResult[] decodeImage(Bitmap bitmap, String str) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        return decodeRawImage(allocate.array(), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth() * 4, 7, str);
    }

    public TextResult[] decodeImage(InputStream inputStream, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return decodeImage(byteArrayOutputStream.toByteArray(), str);
            }
        }
    }

    public TextResult[] decodeImage(String str, String str2) {
        Object nativeDecodeFile = nativeDecodeFile(this.m_instance, str, str2);
        if (!(nativeDecodeFile instanceof BarcodeReaderException)) {
            InnerResult innerResult = (InnerResult) nativeDecodeFile;
            innerCalculate(innerResult);
            return innerResult.textResults;
        }
        throw ((BarcodeReaderException) nativeDecodeFile);
    }

    public TextResult[] decodeImage(byte[] bArr, String str) {
        Object nativeDecodeFileInMemory = nativeDecodeFileInMemory(this.m_instance, bArr, str);
        if (!(nativeDecodeFileInMemory instanceof BarcodeReaderException)) {
            InnerResult innerResult = (InnerResult) nativeDecodeFileInMemory;
            innerCalculate(innerResult);
            return innerResult.textResults;
        }
        throw ((BarcodeReaderException) nativeDecodeFileInMemory);
    }

    public TextResult[] decodeIntermediateResults(IntermediateResult[] intermediateResultArr, String str) {
        Object nativeDecodeIntermediateResult = nativeDecodeIntermediateResult(this.m_instance, intermediateResultArr, str);
        if (!(nativeDecodeIntermediateResult instanceof BarcodeReaderException)) {
            InnerResult innerResult = (InnerResult) nativeDecodeIntermediateResult;
            innerCalculate(innerResult);
            return innerResult.textResults;
        }
        throw ((BarcodeReaderException) nativeDecodeIntermediateResult);
    }

    public TextResult[] decodeRawImage(byte[] bArr, int i, int i2, int i3, int i4, String str) {
        Object nativeDecodeBuffer = nativeDecodeBuffer(this.m_instance, bArr, i, i2, i3, i4, str);
        if (!(nativeDecodeBuffer instanceof BarcodeReaderException)) {
            InnerResult innerResult = (InnerResult) nativeDecodeBuffer;
            innerCalculate(innerResult);
            return innerResult.textResults;
        }
        throw ((BarcodeReaderException) nativeDecodeBuffer);
    }

    public void destroy() {
        long j = this.m_instance;
        if (j != 0) {
            nativeDestroyInstance(j);
            this.dbr = null;
            this.m_instance = 0;
        }
        stopBackgroundThread();
    }

    public void enableDuplicateFilter(boolean z) {
        this.mIfUseDuplicateFilter = z;
    }

    public void enableResultVerification(boolean z) {
        this.mIfUseResulterification = z;
    }

    public void finalize() {
        destroy();
        super.finalize();
    }

    public String[] getAllParameterTemplateNames() {
        return nativeGetAllParameterTemplateNames(this.m_instance);
    }

    public boolean getEnabledDuplicateFilterStatus() {
        return this.mIfUseDuplicateFilter;
    }

    public boolean getEnabledResultVerificationStatus() {
        return this.mIfUseResulterification;
    }

    public IntermediateResult[] getIntermediateResults() {
        Object nativeGetIntermediateResults = nativeGetIntermediateResults(this.m_instance);
        if (!(nativeGetIntermediateResults instanceof BarcodeReaderException)) {
            return ((IRTInnerResult) nativeGetIntermediateResults).irtResults;
        }
        throw ((BarcodeReaderException) nativeGetIntermediateResults);
    }

    public int getLengthOfFrameQueue() {
        return nativeGetLengthOfFrameQueue(this.m_instance);
    }

    public String getModeArgument(String str, int i, String str2) {
        Object nativeGetModeArgument = nativeGetModeArgument(this.m_instance, str, i, str2);
        if (!(nativeGetModeArgument instanceof BarcodeReaderException)) {
            return (String) nativeGetModeArgument;
        }
        throw ((BarcodeReaderException) nativeGetModeArgument);
    }

    public PublicRuntimeSettings getRuntimeSettings() {
        Object nativeGetRuntimeSettings = nativeGetRuntimeSettings(this.m_instance);
        if (!(nativeGetRuntimeSettings instanceof BarcodeReaderException)) {
            return (PublicRuntimeSettings) nativeGetRuntimeSettings;
        }
        throw ((BarcodeReaderException) nativeGetRuntimeSettings);
    }

    public String getVersion() {
        return nativeGetVersion(this.m_instance);
    }

    public FrameDecodingParameters initFrameDecodingParameters() {
        Object nativeInitFrameDecodingParameters = nativeInitFrameDecodingParameters(this.m_instance);
        if (!(nativeInitFrameDecodingParameters instanceof BarcodeReaderException)) {
            return (FrameDecodingParameters) nativeInitFrameDecodingParameters;
        }
        throw ((BarcodeReaderException) nativeInitFrameDecodingParameters);
    }

    public IntermediateResult initIntermediateResults(int i) {
        Object nativeInitIntermediateResult = nativeInitIntermediateResult(this.m_instance, i);
        if (!(nativeInitIntermediateResult instanceof BarcodeReaderException)) {
            return (IntermediateResult) nativeInitIntermediateResult;
        }
        throw ((BarcodeReaderException) nativeInitIntermediateResult);
    }

    public void initLicense(String str) {
        this.licenseKeys = null;
        throwExceptionIfNeeded(nativeInitLicense(this.m_instance, str));
        this.licenseKeys = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initLicenseFromDLS(com.dynamsoft.dbr.DMDLSConnectionParameters r11, com.dynamsoft.dbr.DBRDLSLicenseVerificationListener r12) {
        /*
            r10 = this;
            r0 = 1
            r10.nativeSetInitLicenseFromDLSFlag(r0)
            r0 = 0
            com.dynamsoft.dbr.DBRUUID r1 = com.dynamsoft.dbr.BarcodeLicenseUtil.getUuid((com.dynamsoft.dbr.DMDLSConnectionParameters) r11)     // Catch:{ IOException -> 0x000f, JSONException -> 0x000a }
            goto L_0x0014
        L_0x000a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0013
        L_0x000f:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0013:
            r1 = r0
        L_0x0014:
            android.app.Application r2 = com.dynamsoft.dbr.BarcodeLicenseUtil.getApplication()
            java.lang.String r8 = r2.getPackageName()
            long r2 = r10.m_userData
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x002a
            long r2 = r10.nativeCreateUserData()
            r10.m_userData = r2
        L_0x002a:
            android.app.Application r2 = com.dynamsoft.dbr.BarcodeLicenseUtil.getApplication()
            java.lang.String r3 = ""
            java.io.File r2 = r2.getExternalFilesDir(r3)
            java.lang.String r6 = r2.getPath()
            long r4 = r10.m_userData
            java.lang.String r7 = r1.deviceId
            com.dynamsoft.dbr.BarcodeLicenseUtil r9 = new com.dynamsoft.dbr.BarcodeLicenseUtil
            r9.<init>()
            r3 = r10
            r3.nativeSetArg(r4, r6, r7, r8, r9)
            com.dynamsoft.dbr.BarcodeReader$BarcodeGetLicenseTaskEx r1 = new com.dynamsoft.dbr.BarcodeReader$BarcodeGetLicenseTaskEx
            r1.<init>((com.dynamsoft.dbr.DMDLSConnectionParameters) r11, (com.dynamsoft.dbr.DBRDLSLicenseVerificationListener) r12)
            r11 = 0
            java.lang.Void[] r11 = new java.lang.Void[r11]
            r1.execute(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeReader.initLicenseFromDLS(com.dynamsoft.dbr.DMDLSConnectionParameters, com.dynamsoft.dbr.DBRDLSLicenseVerificationListener):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initLicenseFromLTS(com.dynamsoft.dbr.DMLTSConnectionParameters r11, com.dynamsoft.dbr.DBRLTSLicenseVerificationListener r12) {
        /*
            r10 = this;
            r0 = 1
            r10.nativeSetInitLicenseFromLTSFlag(r0)
            r0 = 0
            com.dynamsoft.dbr.DBRUUID r1 = com.dynamsoft.dbr.BarcodeLicenseUtil.getUuid((com.dynamsoft.dbr.DMLTSConnectionParameters) r11)     // Catch:{ IOException -> 0x000f, JSONException -> 0x000a }
            goto L_0x0014
        L_0x000a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0013
        L_0x000f:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0013:
            r1 = r0
        L_0x0014:
            android.app.Application r2 = com.dynamsoft.dbr.BarcodeLicenseUtil.getApplication()
            java.lang.String r8 = r2.getPackageName()
            long r2 = r10.m_userData
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x002a
            long r2 = r10.nativeCreateUserData()
            r10.m_userData = r2
        L_0x002a:
            android.app.Application r2 = com.dynamsoft.dbr.BarcodeLicenseUtil.getApplication()
            java.lang.String r3 = ""
            java.io.File r2 = r2.getExternalFilesDir(r3)
            java.lang.String r6 = r2.getPath()
            long r4 = r10.m_userData
            java.lang.String r7 = r1.deviceId
            com.dynamsoft.dbr.BarcodeLicenseUtil r9 = new com.dynamsoft.dbr.BarcodeLicenseUtil
            r9.<init>()
            r3 = r10
            r3.nativeSetArg(r4, r6, r7, r8, r9)
            com.dynamsoft.dbr.BarcodeReader$BarcodeGetLicenseTaskEx r1 = new com.dynamsoft.dbr.BarcodeReader$BarcodeGetLicenseTaskEx
            r1.<init>((com.dynamsoft.dbr.DMLTSConnectionParameters) r11, (com.dynamsoft.dbr.DBRLTSLicenseVerificationListener) r12)
            r11 = 0
            java.lang.Void[] r11 = new java.lang.Void[r11]
            r1.execute(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeReader.initLicenseFromLTS(com.dynamsoft.dbr.DMLTSConnectionParameters, com.dynamsoft.dbr.DBRLTSLicenseVerificationListener):void");
    }

    public void initLicenseFromServer(String str, String str2, DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener) {
        boolean z;
        DBRServerLicenseVerificationListener dBRServerLicenseVerificationListener2 = dBRServerLicenseVerificationListener;
        String packageName = BarcodeLicenseUtil.getApplication().getPackageName();
        String hardwareUuID = BarcodeLicenseUtil.getHardwareUuID();
        String str3 = Build.MODEL;
        String sha2Encode = BarcodeLicenseUtil.sha2Encode(hardwareUuID + "-" + packageName);
        File file = new File(BarcodeLicenseUtil.getApplication().getExternalFilesDir("").getPath(), sha2Encode);
        if (file.exists()) {
            try {
                JSONObject jSONObject = new JSONObject(BarcodeLicenseUtil.readStringFromFile(file));
                String string = jSONObject.getString("licensecontent");
                if (!str2.equals(jSONObject.getString("licensekey"))) {
                    connectServer(str, dBRServerLicenseVerificationListener, str2, str3, sha2Encode);
                } else if (jSONObject.has("savedDate")) {
                    Date date = new Date(Long.valueOf(jSONObject.getString("savedDate")).longValue());
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(date);
                    instance.add(5, 1);
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    if (new Date().after(instance.getTime())) {
                        jSONObject.put("savedDate", System.currentTimeMillis() + "");
                        BarcodeLicenseUtil.saveStringToFile(file, jSONObject.toString());
                        connectServer(str, (DBRServerLicenseVerificationListener) null, str2, str3, sha2Encode);
                    }
                    BarcodeLicenseNeedRefresh barcodeLicenseNeedRefresh = new BarcodeLicenseNeedRefresh();
                    throwExceptionIfNeeded(nativeSetLicenseInfo(this.m_instance, "success", str2, string, barcodeLicenseNeedRefresh, sha2Encode, true));
                    if (barcodeLicenseNeedRefresh.value == 1) {
                        z = false;
                        try {
                            connectServer(str, dBRServerLicenseVerificationListener, str2, str3, sha2Encode);
                        } catch (BarcodeReaderException | JSONException e) {
                            e = e;
                            dBRServerLicenseVerificationListener2.licenseVerificationCallback(z, e);
                        }
                    } else {
                        dBRServerLicenseVerificationListener2.licenseVerificationCallback(true, (Exception) null);
                    }
                } else {
                    jSONObject.put("savedDate", System.currentTimeMillis() + "");
                    BarcodeLicenseUtil.saveStringToFile(file, jSONObject.toString());
                    connectServer(str, dBRServerLicenseVerificationListener, str2, str3, sha2Encode);
                }
            } catch (BarcodeReaderException | JSONException e2) {
                e = e2;
                z = false;
                dBRServerLicenseVerificationListener2.licenseVerificationCallback(z, e);
            }
        } else {
            try {
                connectServer(str, dBRServerLicenseVerificationListener, str2, str3, sha2Encode);
            } catch (JSONException e3) {
                dBRServerLicenseVerificationListener2.licenseVerificationCallback(false, e3);
            }
        }
    }

    public void initRuntimeSettingsWithFile(String str, int i) {
        throwExceptionIfNeeded(nativeInitRuntimeSettingsWithFile(this.m_instance, str, i));
    }

    public void initRuntimeSettingsWithString(String str, int i) {
        throwExceptionIfNeeded(nativeInitRuntimeSettingsWithString(this.m_instance, str, i));
    }

    public String outputLicenseToString() {
        Object nativeOutputLicenseToString = nativeOutputLicenseToString(this.m_instance);
        if (!(nativeOutputLicenseToString instanceof BarcodeReaderException)) {
            return (String) nativeOutputLicenseToString;
        }
        throw ((BarcodeReaderException) nativeOutputLicenseToString);
    }

    public void outputSettingsToFile(String str, String str2) {
        throwExceptionIfNeeded(nativeOutputSettingsToFile(this.m_instance, str, str2));
    }

    public String outputSettingsToString(String str) {
        Object nativeOutputSettingsToString = nativeOutputSettingsToString(this.m_instance, str);
        if (!(nativeOutputSettingsToString instanceof BarcodeReaderException)) {
            return (String) nativeOutputSettingsToString;
        }
        throw ((BarcodeReaderException) nativeOutputSettingsToString);
    }

    public void resetRuntimeSettings() {
        throwExceptionIfNeeded(nativeResetRuntimeSettings(this.m_instance));
    }

    public void setErrorCallback(ErrorCallback errorCallback, Object obj) {
        if (this.m_userData == 0) {
            this.m_userData = nativeCreateUserData();
        }
        throwExceptionIfNeeded(nativeSetErrorCallback(this.m_instance, this.m_userData, errorCallback, obj));
    }

    public void setIntermediateResultCallback(final IntermediateResultCallback intermediateResultCallback, Object obj) {
        if (this.m_userData == 0) {
            this.m_userData = nativeCreateUserData();
        }
        throwExceptionIfNeeded(nativeSetIntermediateResultCallback(this.m_instance, this.m_userData, new IRTInnerCallback() {
            public void IRTInnerCallback(int i, IRTInnerResult iRTInnerResult, Object obj) {
                BarcodeReader.this.innerCalculate(iRTInnerResult);
                intermediateResultCallback.intermediateResultCallback(i, iRTInnerResult.irtResults, obj);
            }
        }, obj));
    }

    public void setModeArgument(String str, int i, String str2, String str3) {
        throwExceptionIfNeeded(nativeSetModeArgument(this.m_instance, str, i, str2, str3));
    }

    public void setTextResultCallback(final TextResultCallback textResultCallback, Object obj) {
        if (this.m_userData == 0) {
            this.m_userData = nativeCreateUserData();
        }
        throwExceptionIfNeeded(nativeSetTextResultCallback(this.m_instance, this.m_userData, new InnerCallback() {
            public void innerCallback(int i, InnerResult innerResult, Object obj) {
                BarcodeReader.this.innerCalculate(innerResult);
                textResultCallback.textResultCallback(i, innerResult.textResults, obj);
            }
        }, obj));
    }

    public void startFrameDecoding(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        throwExceptionIfNeeded(nativeStartFrameDecoding(this.m_instance, i, i2, i3, i4, i5, i6, str));
    }

    public void startFrameDecodingEx(FrameDecodingParameters frameDecodingParameters, String str) {
        throwExceptionIfNeeded(nativeStartFrameDecodingEx(this.m_instance, frameDecodingParameters, str));
    }

    public void stopFrameDecoding() {
        throwExceptionIfNeeded(nativeStopFrameDecoding(this.m_instance));
        if (this.m_userData != 0) {
            this.m_userData = 0;
        }
    }

    public void updateRuntimeSettings(PublicRuntimeSettings publicRuntimeSettings) {
        throwExceptionIfNeeded(nativeUpdateRuntimeSettings(this.m_instance, publicRuntimeSettings));
    }
}
