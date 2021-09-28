package com.dynamsoft.dce;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0002a;
import p016c0.C0559c;
import p150z.C2145a;

public class CameraEnhancer extends CameraController {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CAMERA_FACING_BACK = 1;
    private static final int CAMERA_FACING_FRONT = 0;
    private static final int CLEAR_POINT = 2;
    public static final String DCE_VERSION = "1.0.3";
    public static final String MAIN_DLS_URL = "https://mlts.dynamsoft.com";
    private static final String NET_WORK_ERROR = "Failed to reach the Dynamsoft License Server.";
    private static final int REQUEST_CAMERA_PERMISSION = 1;
    private static final int RESULT_POINT = 1;
    private static final int SEND_USAGE = 3;
    public static final String STANDBY_DLS_URL = "https://slts.dynamsoft.com";
    /* access modifiers changed from: private */
    public static final float[] ZOOM_RATIO = {10.0f, 100.0f, 114.0f, 132.0f, 151.0f, 174.0f, 190.0f, 210.0f, 221.0f, 230.0f, 249.0f, 268.0f, 283.0f, 295.0f, 308.0f, 322.0f, 336.0f, 346.0f, 356.0f};
    /* access modifiers changed from: private */
    public static ReentrantLock framelock;
    /* access modifiers changed from: private */
    public static Condition framelockcondition;
    /* access modifiers changed from: private */
    public static int mFrameId = 0;
    /* access modifiers changed from: private */
    public DMDLSConnectionParameters DLSParameters;
    /* access modifiers changed from: private */
    public float autoFocusX;
    /* access modifiers changed from: private */
    public float autoFocusY;
    /* access modifiers changed from: private */
    public Handler backgroundHandler;
    private HandlerThread backgroundThread;
    /* access modifiers changed from: private */
    public String consume;
    /* access modifiers changed from: private */
    public long endTime;
    /* access modifiers changed from: private */
    public int filterCount;
    /* access modifiers changed from: private */
    public boolean ifDoingJob;
    /* access modifiers changed from: private */
    public JSONObject info;
    /* access modifiers changed from: private */
    public long lastHandleUsageTime;
    /* access modifiers changed from: private */
    public boolean lastIsZoom;
    private long lastSendUsageTime;
    private boolean last_mIfNeedZoom;
    /* access modifiers changed from: private */
    public long lasttime;
    private MeteringRectangle[] mAERegions = AutoFocusHelper.getZeroWeightRegion();
    private MeteringRectangle[] mAFRegions = AutoFocusHelper.getZeroWeightRegion();
    private final Runnable mAutoFocusRunnable;
    private boolean mAutoFocusSupported;
    /* access modifiers changed from: private */
    public BoxView mBoxView;
    /* access modifiers changed from: private */
    public CameraEnhancerAlgorithm mCamAlgorithm;
    private CameraCharacteristics mCameraCharacteristics;
    /* access modifiers changed from: private */
    public CameraDevice mCameraDevice;
    /* access modifiers changed from: private */
    public CameraFocusUtil mCameraFocusUtil;
    private String mCameraId;
    /* access modifiers changed from: private */
    public CameraListener mCameraListener;
    /* access modifiers changed from: private */
    public CameraListenerInner mCameraListenerInner;
    private CameraManager mCameraManager;
    /* access modifiers changed from: private */
    public Semaphore mCameraOpenCloseLock = new Semaphore(1);
    private CameraPosition mCameraPosition;
    /* access modifiers changed from: private */
    public CameraView mCameraView;
    /* access modifiers changed from: private */
    public CanvasView mCanvasView;
    /* access modifiers changed from: private */
    public CameraCaptureSession.CaptureCallback mCaptureCallback;
    /* access modifiers changed from: private */
    public CameraCaptureSession mCaptureSession;
    /* access modifiers changed from: private */
    public Context mContext;
    private int mCpuFreq1;
    private int mCpuFreq2;
    private Rect mCropRegion;
    private CameraState mCurrentCameraState;
    private TorchState mCurrentTorchState;
    private CameraState mDesiredCameraState;
    private TorchState mDesiredTorchState;
    /* access modifiers changed from: private */
    public int mErrorCode;
    private long mExposureTime;
    /* access modifiers changed from: private */
    public int mFastFrameId;
    private float mFocalLength;
    private float mFoucusLength;
    /* access modifiers changed from: private */
    public int mFrameListLength;
    private int mFrameRateValue;
    /* access modifiers changed from: private */
    public long mFrameTime;
    private int mISO;
    /* access modifiers changed from: private */
    public boolean mIfAutoFocus;
    /* access modifiers changed from: private */
    public boolean mIfAutoZoom = false;
    /* access modifiers changed from: private */
    public boolean mIfFastMode = false;
    private boolean mIfForceAutoFocus = false;
    private boolean mIfNeedSwitch;
    /* access modifiers changed from: private */
    public boolean mIfNeedZoom;
    /* access modifiers changed from: private */
    public boolean mIfSensorControl = false;
    /* access modifiers changed from: private */
    public boolean mIfUseClarityFocus = false;
    private boolean mIfUseFocalLength;
    /* access modifiers changed from: private */
    public boolean mIfUseFrameFilter = false;
    /* access modifiers changed from: private */
    public boolean mIfUseTimeFocus = false;
    private ImageReader mImageReader;
    /* access modifiers changed from: private */
    public Rect mInterestRect;
    private boolean mIsPaused;
    private ImageReader.OnImageAvailableListener mOnImageAvailableListener;
    /* access modifiers changed from: private */
    public CaptureRequest mPreviewRequest;
    /* access modifiers changed from: private */
    public CaptureRequest.Builder mPreviewRequestBuilder;
    private int mRam1;
    private int mRam2;
    /* access modifiers changed from: private */
    public RegionDefinitionInterface mRegion;
    private Size mResolution;
    private List<Size> mResolutions;
    /* access modifiers changed from: private */
    public int mRotation;
    private final CameraDevice.StateCallback mStateCallback;
    private Range<Integer> mSuitableRange;
    private final TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private AutoFitTextureView mTextureView;
    private TorchListener mTorchListener;
    private TorchState mTorchState;
    @SuppressLint({"HandlerLeak"})
    private Handler mUIHandler;
    private float mZoomLevel;
    /* access modifiers changed from: private */
    public int mZoomRatIndex = 0;
    /* access modifiers changed from: private */
    public int mZoomState = 0;
    public HashMap<String, Long> map;
    /* access modifiers changed from: private */
    public List<Frame> mframeList;
    /* access modifiers changed from: private */
    public int overedCountFrame;
    public String path;
    public Handler sendHandler;
    public HandlerThread sendThread;
    /* access modifiers changed from: private */
    public boolean startDCE;
    /* access modifiers changed from: private */
    public long startTime;
    /* access modifiers changed from: private */
    public long timeOfStartMove;
    /* access modifiers changed from: private */
    public long timeToStartZoom;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f2526u;

    public class CameraEnhancerGetLicenseTask extends AsyncTask<Void, Integer, String> {
        private CameraDLSLicenseVerificationListener mListener;
        private DMDLSConnectionParameters mParameter;
        private JSONObject params;
        private String spareUrl;
        private String url;

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r2 = r3.mainServerURL;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private CameraEnhancerGetLicenseTask(com.dynamsoft.dce.DMDLSConnectionParameters r3, org.json.JSONObject r4, com.dynamsoft.dce.CameraDLSLicenseVerificationListener r5) {
            /*
                r1 = this;
                com.dynamsoft.dce.CameraEnhancer.this = r2
                r1.<init>()
                java.lang.String r2 = r3.mainServerURL
                java.lang.String r0 = ""
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0014
                java.lang.String r2 = r3.mainServerURL
                if (r2 == 0) goto L_0x0014
                goto L_0x0016
            L_0x0014:
                java.lang.String r2 = "https://mlts.dynamsoft.com"
            L_0x0016:
                r1.url = r2
                java.lang.String r2 = r3.standbyServerURL
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0025
                java.lang.String r2 = r3.standbyServerURL
                if (r2 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                java.lang.String r2 = "https://slts.dynamsoft.com"
            L_0x0027:
                r1.spareUrl = r2
                r1.params = r4
                r1.mListener = r5
                r1.mParameter = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraEnhancer.CameraEnhancerGetLicenseTask.<init>(com.dynamsoft.dce.CameraEnhancer, com.dynamsoft.dce.DMDLSConnectionParameters, org.json.JSONObject, com.dynamsoft.dce.CameraDLSLicenseVerificationListener):void");
        }

        public String doInBackground(Void... voidArr) {
            CameraDLSLicenseVerificationListener cameraDLSLicenseVerificationListener;
            try {
                String licenseEx = CameraLicenseUtil.getLicenseEx(this.url, this.params);
                if (!"151".equals(licenseEx)) {
                    return licenseEx;
                }
                for (File delete : new File(CameraLicenseUtil.getApplication().getExternalFilesDir("").getPath(), CameraLicenseUtil.getCacheFilePath(this.params.getString("hs"), this.params.getString("hs"), this.url)).listFiles()) {
                    delete.delete();
                }
                this.params.put("cu", CameraLicenseUtil.getUuid(this.mParameter).deviceId);
                JSONObject jSONObject = this.params;
                DMDLSConnectionParameters dMDLSConnectionParameters = this.mParameter;
                jSONObject.put("lu", CameraLicenseUtil.checkLastTime(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, this.url));
                return CameraLicenseUtil.getLicenseEx(this.url, this.params);
            } catch (Exception e) {
                e = e;
                if (e instanceof IOException) {
                    try {
                        return CameraLicenseUtil.getLicenseEx(this.spareUrl, this.params);
                    } catch (Exception e2) {
                        e = e2;
                        if (!(e instanceof IOException) && (e instanceof CameraEnhancerException)) {
                            int errorCode = ((CameraEnhancerException) e).getErrorCode();
                            if (errorCode == 151) {
                                DMDLSConnectionParameters dMDLSConnectionParameters2 = this.mParameter;
                                File file = new File(CameraLicenseUtil.getApplication().getExternalFilesDir("").getPath(), CameraLicenseUtil.getCacheFilePath(dMDLSConnectionParameters2.handshakeCode, dMDLSConnectionParameters2.organizationID, dMDLSConnectionParameters2.mainServerURL));
                                if (file.exists()) {
                                    for (File file2 : file.listFiles()) {
                                        if (file2.exists()) {
                                            file2.delete();
                                        }
                                    }
                                }
                            } else if (errorCode > 100 && errorCode < 200) {
                                DMDLSConnectionParameters dMDLSConnectionParameters3 = this.mParameter;
                                String cacheFilePath = CameraLicenseUtil.getCacheFilePath(dMDLSConnectionParameters3.handshakeCode, dMDLSConnectionParameters3.organizationID, dMDLSConnectionParameters3.mainServerURL);
                                DMDLSConnectionParameters dMDLSConnectionParameters4 = this.mParameter;
                                File file3 = new File(CameraLicenseUtil.getApplication().getExternalFilesDir("").getPath(), C0559c.m1823a(cacheFilePath, "/", CameraLicenseUtil.getCacheFilePath(dMDLSConnectionParameters4.handshakeCode, dMDLSConnectionParameters4.organizationID)));
                                if (file3.exists()) {
                                    file3.delete();
                                }
                            }
                        }
                        int unused = CameraEnhancer.this.mErrorCode = -1;
                        cameraDLSLicenseVerificationListener = this.mListener;
                        if (cameraDLSLicenseVerificationListener == null) {
                            return "error";
                        }
                        cameraDLSLicenseVerificationListener.DLSLicenseVerificationCallback(false, e);
                        return "error";
                    }
                } else {
                    if (e instanceof CameraEnhancerException) {
                        int errorCode2 = ((CameraEnhancerException) e).getErrorCode();
                        DMDLSConnectionParameters dMDLSConnectionParameters5 = this.mParameter;
                        String cacheFilePath2 = CameraLicenseUtil.getCacheFilePath(dMDLSConnectionParameters5.handshakeCode, dMDLSConnectionParameters5.organizationID, dMDLSConnectionParameters5.mainServerURL);
                        if (errorCode2 == 151) {
                            File file4 = new File(CameraLicenseUtil.getApplication().getExternalFilesDir("").getPath(), cacheFilePath2);
                            if (file4.exists()) {
                                for (File file5 : file4.listFiles()) {
                                    if (file5.exists()) {
                                        file5.delete();
                                    }
                                }
                            }
                        } else if (errorCode2 > 100 && errorCode2 < 200) {
                            DMDLSConnectionParameters dMDLSConnectionParameters6 = this.mParameter;
                            File file6 = new File(CameraLicenseUtil.getApplication().getExternalFilesDir("").getPath(), C0559c.m1823a(cacheFilePath2, "/", CameraLicenseUtil.getCacheFilePath(dMDLSConnectionParameters6.handshakeCode, dMDLSConnectionParameters6.organizationID)));
                            if (file6.exists()) {
                                file6.delete();
                            }
                        }
                    }
                    int unused2 = CameraEnhancer.this.mErrorCode = -1;
                    cameraDLSLicenseVerificationListener = this.mListener;
                    if (cameraDLSLicenseVerificationListener == null) {
                        return "error";
                    }
                    cameraDLSLicenseVerificationListener.DLSLicenseVerificationCallback(false, e);
                    return "error";
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ Exception -> 0x01d5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0191 A[Catch:{ Exception -> 0x01d5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01ab A[Catch:{ Exception -> 0x01d5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "usu"
                java.lang.String r1 = ""
                r2 = 0
                if (r12 == 0) goto L_0x01bf
                boolean r3 = r1.equals(r12)     // Catch:{ Exception -> 0x01d5 }
                if (r3 == 0) goto L_0x000f
                goto L_0x01bf
            L_0x000f:
                java.lang.String r3 = "error"
                boolean r3 = r3.equals(r12)     // Catch:{ Exception -> 0x01d5 }
                if (r3 != 0) goto L_0x01be
                java.lang.String r3 = "151"
                boolean r3 = r3.equals(r12)     // Catch:{ Exception -> 0x01d5 }
                if (r3 == 0) goto L_0x0021
                goto L_0x01be
            L_0x0021:
                com.dynamsoft.dce.CameraEnhancer r3 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancerAlgorithm r3 = r3.mCamAlgorithm     // Catch:{ Exception -> 0x01d5 }
                byte[] r12 = android.util.Base64.decode(r12, r2)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String[] r12 = r3.NativeSplitForDLS(r12)     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d5 }
                r3.<init>()     // Catch:{ Exception -> 0x01d5 }
                r4 = 1
                r5 = r12[r4]     // Catch:{ Exception -> 0x01d5 }
                if (r5 == 0) goto L_0x006e
                r5 = r12[r4]     // Catch:{ Exception -> 0x01d5 }
                boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x01d5 }
                if (r5 != 0) goto L_0x006e
                java.lang.String r5 = "*.*"
                r6 = r12[r4]     // Catch:{ Exception -> 0x01d5 }
                boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x01d5 }
                if (r5 == 0) goto L_0x004c
                goto L_0x006e
            L_0x004c:
                r5 = r12[r4]     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r6 = ";"
                java.lang.String[] r5 = r5.split(r6)     // Catch:{ Exception -> 0x01d5 }
                int r6 = r5.length     // Catch:{ Exception -> 0x01d5 }
                r7 = r2
            L_0x0056:
                if (r7 >= r6) goto L_0x006c
                r8 = r5[r7]     // Catch:{ Exception -> 0x01d5 }
                android.app.Application r9 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r9 = r9.getPackageName()     // Catch:{ Exception -> 0x01d5 }
                boolean r8 = r9.equals(r8)     // Catch:{ Exception -> 0x01d5 }
                if (r8 == 0) goto L_0x0069
                goto L_0x006e
            L_0x0069:
                int r7 = r7 + 1
                goto L_0x0056
            L_0x006c:
                r5 = r2
                goto L_0x006f
            L_0x006e:
                r5 = r4
            L_0x006f:
                if (r5 == 0) goto L_0x01ab
                com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancerAlgorithm r5 = r5.mCamAlgorithm     // Catch:{ Exception -> 0x01d5 }
                r6 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                r7 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                int r7 = r7.length()     // Catch:{ Exception -> 0x01d5 }
                int r7 = r7 + -36
                java.lang.String r6 = r6.substring(r2, r7)     // Catch:{ Exception -> 0x01d5 }
                r7 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                r8 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                int r8 = r8.length()     // Catch:{ Exception -> 0x01d5 }
                int r8 = r8 + -36
                java.lang.String r7 = r7.substring(r8)     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject r8 = r11.params     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r9 = "cu"
                java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x01d5 }
                int r5 = r5.initLicenseInfo(r6, r7, r8)     // Catch:{ Exception -> 0x01d5 }
                if (r5 != 0) goto L_0x0195
                com.dynamsoft.dce.DMDLSConnectionParameters r5 = r11.mParameter     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r6 = r5.handshakeCode     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r7 = r5.organizationID     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r5 = r5.mainServerURL     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r5 = com.dynamsoft.dce.CameraLicenseUtil.getCacheFilePath(r6, r7, r5)     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.DMDLSConnectionParameters r6 = r11.mParameter     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r7 = r6.handshakeCode     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r6 = r6.organizationID     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r6 = com.dynamsoft.dce.CameraLicenseUtil.getCacheFilePath(r7, r6)     // Catch:{ Exception -> 0x01d5 }
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01d5 }
                android.app.Application r8 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x01d5 }
                java.io.File r8 = r8.getExternalFilesDir(r1)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r8 = r8.getPath()     // Catch:{ Exception -> 0x01d5 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d5 }
                r9.<init>()     // Catch:{ Exception -> 0x01d5 }
                r9.append(r5)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r10 = "/"
                r9.append(r10)     // Catch:{ Exception -> 0x01d5 }
                r9.append(r6)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x01d5 }
                r7.<init>(r8, r6)     // Catch:{ Exception -> 0x01d5 }
                boolean r6 = r7.exists()     // Catch:{ Exception -> 0x01d5 }
                if (r6 != 0) goto L_0x010a
                r7.createNewFile()     // Catch:{ Exception -> 0x01d5 }
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01d5 }
                android.app.Application r8 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x01d5 }
                java.io.File r8 = r8.getExternalFilesDir(r1)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r8 = r8.getPath()     // Catch:{ Exception -> 0x01d5 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d5 }
                r9.<init>()     // Catch:{ Exception -> 0x01d5 }
                r9.append(r5)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r5 = "/cr"
                r9.append(r5)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x01d5 }
                r6.<init>(r8, r5)     // Catch:{ Exception -> 0x01d5 }
                r6.createNewFile()     // Catch:{ Exception -> 0x01d5 }
            L_0x010a:
                java.lang.String r5 = "in"
                r6 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                r12 = r12[r2]     // Catch:{ Exception -> 0x01d5 }
                int r12 = r12.length()     // Catch:{ Exception -> 0x01d5 }
                int r12 = r12 + -36
                java.lang.String r12 = r6.substring(r2, r12)     // Catch:{ Exception -> 0x01d5 }
                r3.put(r5, r12)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r12 = "sd"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d5 }
                r5.<init>()     // Catch:{ Exception -> 0x01d5 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01d5 }
                r5.append(r8)     // Catch:{ Exception -> 0x01d5 }
                r5.append(r1)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x01d5 }
                r3.put(r12, r1)     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r1 = r11.url     // Catch:{ Exception -> 0x01d5 }
                java.lang.String unused = r12.f2526u = r1     // Catch:{ Exception -> 0x01d5 }
                boolean r12 = r3.has(r0)     // Catch:{ Exception -> 0x01d5 }
                r1 = 0
                if (r12 == 0) goto L_0x0161
                boolean r12 = r3.getBoolean(r0)     // Catch:{ Exception -> 0x01d5 }
                if (r12 != 0) goto L_0x015b
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject r0 = r11.params     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject unused = r12.info = r0     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                r12.sendUsage()     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
            L_0x0157:
                r12.startSendThread()     // Catch:{ Exception -> 0x01d5 }
                goto L_0x0173
            L_0x015b:
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject unused = r12.info = r1     // Catch:{ Exception -> 0x01d5 }
                goto L_0x0173
            L_0x0161:
                r3.put(r0, r2)     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject r0 = r11.params     // Catch:{ Exception -> 0x01d5 }
                org.json.JSONObject unused = r12.info = r0     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                r12.sendUsage()     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                goto L_0x0157
            L_0x0173:
                java.lang.String r12 = "needAuth"
                r3.put(r12, r2)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r12 = "hsut"
                java.lang.String r0 = com.dynamsoft.dce.CameraLicenseUtil.getCurrentDataString()     // Catch:{ Exception -> 0x01d5 }
                r3.put(r12, r0)     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r12 = r3.toString()     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraLicenseUtil.saveStringToFile(r7, r12)     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                int unused = r12.mErrorCode = r2     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraDLSLicenseVerificationListener r12 = r11.mListener     // Catch:{ Exception -> 0x01d5 }
                if (r12 == 0) goto L_0x01e3
                r12.DLSLicenseVerificationCallback(r4, r1)     // Catch:{ Exception -> 0x01d5 }
                goto L_0x01e3
            L_0x0195:
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                r0 = -10003(0xffffffffffffd8ed, float:NaN)
                int unused = r12.mErrorCode = r0     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraDLSLicenseVerificationListener r12 = r11.mListener     // Catch:{ Exception -> 0x01d5 }
                if (r12 == 0) goto L_0x01e3
                com.dynamsoft.dce.CameraEnhancerException r1 = new com.dynamsoft.dce.CameraEnhancerException     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r3 = "Not exist camera module."
                r1.<init>((int) r0, (java.lang.String) r3)     // Catch:{ Exception -> 0x01d5 }
            L_0x01a7:
                r12.DLSLicenseVerificationCallback(r2, r1)     // Catch:{ Exception -> 0x01d5 }
                goto L_0x01e3
            L_0x01ab:
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                r0 = -10043(0xffffffffffffd8c5, float:NaN)
                int unused = r12.mErrorCode = r0     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraDLSLicenseVerificationListener r12 = r11.mListener     // Catch:{ Exception -> 0x01d5 }
                if (r12 == 0) goto L_0x01e3
                com.dynamsoft.dce.CameraEnhancerException r1 = new com.dynamsoft.dce.CameraEnhancerException     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r3 = "App id and handshake do not match."
                r1.<init>((int) r0, (java.lang.String) r3)     // Catch:{ Exception -> 0x01d5 }
                goto L_0x01a7
            L_0x01be:
                return
            L_0x01bf:
                com.dynamsoft.dce.CameraEnhancer r12 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x01d5 }
                r0 = -10001(0xffffffffffffd8ef, float:NaN)
                int unused = r12.mErrorCode = r0     // Catch:{ Exception -> 0x01d5 }
                com.dynamsoft.dce.CameraDLSLicenseVerificationListener r12 = r11.mListener     // Catch:{ Exception -> 0x01d5 }
                if (r12 == 0) goto L_0x01d4
                com.dynamsoft.dce.CameraEnhancerException r1 = new com.dynamsoft.dce.CameraEnhancerException     // Catch:{ Exception -> 0x01d5 }
                java.lang.String r3 = "License invalid."
                r1.<init>((int) r0, (java.lang.String) r3)     // Catch:{ Exception -> 0x01d5 }
                r12.DLSLicenseVerificationCallback(r2, r1)     // Catch:{ Exception -> 0x01d5 }
            L_0x01d4:
                return
            L_0x01d5:
                r12 = move-exception
                com.dynamsoft.dce.CameraEnhancer r0 = com.dynamsoft.dce.CameraEnhancer.this
                r1 = -1
                int unused = r0.mErrorCode = r1
                com.dynamsoft.dce.CameraDLSLicenseVerificationListener r0 = r11.mListener
                if (r0 == 0) goto L_0x01e3
                r0.DLSLicenseVerificationCallback(r2, r12)
            L_0x01e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraEnhancer.CameraEnhancerGetLicenseTask.onPostExecute(java.lang.String):void");
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        framelock = reentrantLock;
        framelockcondition = reentrantLock.newCondition();
    }

    public CameraEnhancer(Context context) {
        TorchState torchState = TorchState.TORCH_STATE_OFF;
        this.mCurrentTorchState = torchState;
        this.mDesiredTorchState = torchState;
        CameraState cameraState = CameraState.CAMERA_STATE_OFF;
        this.mCurrentCameraState = cameraState;
        this.mDesiredCameraState = cameraState;
        this.mCameraListenerInner = null;
        this.mIsPaused = false;
        this.mIfNeedSwitch = false;
        this.mCameraPosition = CameraPosition.CAMERA_POSITION_WORLD;
        this.mCamAlgorithm = new CameraEnhancerAlgorithm();
        this.mFrameListLength = 10;
        this.mframeList = new ArrayList();
        this.mExposureTime = -1;
        this.mISO = -1;
        this.mFoucusLength = -1.0f;
        this.mFocalLength = -1.0f;
        this.mSuitableRange = null;
        this.mFrameRateValue = 0;
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                try {
                    CameraEnhancer.this.open(i, i2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                CameraEnhancer.this.closeCamera();
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                CameraEnhancer.this.configureTransform(i, i2);
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mUIHandler = new Handler() {
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        CameraEnhancer.this.mCanvasView.clear();
                    }
                } else if (CameraEnhancer.this.mZoomState == 2 || CameraEnhancer.this.mZoomRatIndex == 0) {
                    CameraEnhancer cameraEnhancer = CameraEnhancer.this;
                    cameraEnhancer.drawBox((ArrayList) message.obj, cameraEnhancer.mRotation);
                }
            }
        };
        this.map = new HashMap<>();
        this.mIfNeedZoom = false;
        this.timeToStartZoom = 0;
        this.timeOfStartMove = 0;
        this.last_mIfNeedZoom = false;
        this.lastIsZoom = false;
        this.filterCount = 0;
        this.consume = "";
        this.startDCE = true;
        this.startTime = 0;
        this.endTime = 0;
        this.lastHandleUsageTime = 0;
        this.lastSendUsageTime = 0;
        this.overedCountFrame = 0;
        this.mFrameTime = 0;
        this.mAutoFocusRunnable = new Runnable() {
            public void run() {
                if (CameraEnhancer.this.mPreviewRequestBuilder != null) {
                    if (!CameraEnhancer.this.mIfAutoFocus) {
                        CameraEnhancer.this.updateAutoFocus();
                    } else {
                        CameraEnhancer cameraEnhancer = CameraEnhancer.this;
                        cameraEnhancer.updateManualFocus(cameraEnhancer.autoFocusX, CameraEnhancer.this.autoFocusY);
                    }
                    if (CameraEnhancer.this.mCaptureSession != null) {
                        try {
                            CameraEnhancer.this.mCaptureSession.setRepeatingRequest(CameraEnhancer.this.mPreviewRequestBuilder.build(), CameraEnhancer.this.mCaptureCallback, CameraEnhancer.this.backgroundHandler);
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        this.mCpuFreq1 = 0;
        this.mCpuFreq2 = 0;
        this.mRam1 = 0;
        this.mRam2 = 0;
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (CameraEnhancer.this.mCameraFocusUtil != null && CameraEnhancer.this.mIfUseFrameFilter) {
                    ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)).intValue();
                }
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }

            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }

            public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        };
        this.mStateCallback = new CameraDevice.StateCallback() {
            public void onDisconnected(CameraDevice cameraDevice) {
                CameraEnhancer.this.closeCamera();
            }

            public void onError(CameraDevice cameraDevice, int i) {
                CameraEnhancer.this.closeCamera();
            }

            public void onOpened(CameraDevice cameraDevice) {
                CameraEnhancer.this.mCameraOpenCloseLock.release();
                CameraDevice unused = CameraEnhancer.this.mCameraDevice = cameraDevice;
                try {
                    CameraEnhancer.this.createCameraPreviewSession();
                } catch (CameraEnhancerException e) {
                    e.printStackTrace();
                }
            }
        };
        this.ifDoingJob = false;
        this.mFastFrameId = 0;
        this.mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() {
            public void onImageAvailable(ImageReader imageReader) {
                Frame frame;
                CameraEnhancer cameraEnhancer;
                float f;
                if (imageReader != null) {
                    long unused = CameraEnhancer.this.lasttime = System.currentTimeMillis();
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    try {
                        if (CameraEnhancer.this.mIfAutoZoom) {
                            if (CameraEnhancer.this.mZoomState == 1) {
                                if (CameraEnhancer.this.mZoomRatIndex < CameraEnhancer.ZOOM_RATIO.length) {
                                    cameraEnhancer = CameraEnhancer.this;
                                    f = CameraEnhancer.ZOOM_RATIO[CameraEnhancer.access$408(CameraEnhancer.this)];
                                }
                            } else if (CameraEnhancer.this.mZoomState == 3) {
                                if (CameraEnhancer.this.mZoomRatIndex < CameraEnhancer.ZOOM_RATIO.length - 3) {
                                    cameraEnhancer = CameraEnhancer.this;
                                    f = CameraEnhancer.ZOOM_RATIO[CameraEnhancer.access$408(CameraEnhancer.this)];
                                }
                            } else if (CameraEnhancer.this.mZoomState == 0 && CameraEnhancer.this.mZoomRatIndex > 0) {
                                CameraEnhancer.access$410(CameraEnhancer.this);
                                cameraEnhancer = CameraEnhancer.this;
                                f = CameraEnhancer.ZOOM_RATIO[CameraEnhancer.this.mZoomRatIndex];
                            }
                            cameraEnhancer.setZoomFactor(f / 10.0f);
                        }
                    } catch (CameraEnhancerException e) {
                        e.printStackTrace();
                    }
                    if (acquireLatestImage != null) {
                        ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                        int rowStride = acquireLatestImage.getPlanes()[0].getRowStride() / acquireLatestImage.getPlanes()[0].getPixelStride();
                        int remaining = buffer.remaining();
                        byte[] bArr = new byte[remaining];
                        buffer.get(bArr);
                        if (CameraEnhancer.this.mCameraListener != null) {
                            ByteBuffer buffer2 = acquireLatestImage.getPlanes()[1].getBuffer();
                            int remaining2 = buffer2.remaining();
                            byte[] bArr2 = new byte[remaining2];
                            buffer2.get(bArr2);
                            int rowStride2 = acquireLatestImage.getPlanes()[1].getRowStride() / acquireLatestImage.getPlanes()[1].getPixelStride();
                            ByteBuffer buffer3 = acquireLatestImage.getPlanes()[2].getBuffer();
                            int remaining3 = buffer3.remaining();
                            byte[] bArr3 = new byte[remaining3];
                            buffer3.get(bArr3);
                            int[] iArr = {rowStride, acquireLatestImage.getPlanes()[2].getRowStride() / acquireLatestImage.getPlanes()[2].getPixelStride(), rowStride2};
                            byte[] bArr4 = new byte[(remaining + remaining2 + remaining3)];
                            System.arraycopy(bArr, 0, bArr4, 0, remaining);
                            System.arraycopy(bArr3, 0, bArr4, remaining, remaining3);
                            System.arraycopy(bArr2, 0, bArr4, remaining + remaining3, remaining2);
                            frame = new Frame(bArr4, rowStride, acquireLatestImage.getHeight(), iArr, 3, CameraEnhancer.mFrameId);
                        } else {
                            frame = new Frame(bArr, rowStride, acquireLatestImage.getHeight(), new int[]{rowStride}, 3, CameraEnhancer.mFrameId);
                        }
                        if (!CameraEnhancer.this.ifDoingJob) {
                            boolean unused2 = CameraEnhancer.this.ifDoingJob = true;
                            Message obtainMessage = CameraEnhancer.this.backgroundHandler.obtainMessage();
                            obtainMessage.obj = frame;
                            CameraEnhancer.this.backgroundHandler.sendMessage(obtainMessage);
                            CameraEnhancer.access$6308();
                        }
                    }
                    if (acquireLatestImage != null) {
                        acquireLatestImage.close();
                    }
                }
            }
        };
        this.mErrorCode = -10001;
        this.mTorchState = torchState;
        this.mZoomLevel = -1.0f;
        this.autoFocusX = -1.0f;
        this.autoFocusY = -1.0f;
        this.mIfUseFocalLength = false;
        this.mContext = context;
        CameraFocusUtil cameraFocusUtil = new CameraFocusUtil(context, this);
        this.mCameraFocusUtil = cameraFocusUtil;
        cameraFocusUtil.addCamAlgorithmFilter(this.mCamAlgorithm);
        this.mCameraManager = (CameraManager) this.mContext.getSystemService("camera");
    }

    public static /* synthetic */ int access$1308(CameraEnhancer cameraEnhancer) {
        int i = cameraEnhancer.overedCountFrame;
        cameraEnhancer.overedCountFrame = i + 1;
        return i;
    }

    public static /* synthetic */ int access$3108(CameraEnhancer cameraEnhancer) {
        int i = cameraEnhancer.filterCount;
        cameraEnhancer.filterCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$3308(CameraEnhancer cameraEnhancer) {
        int i = cameraEnhancer.mFastFrameId;
        cameraEnhancer.mFastFrameId = i + 1;
        return i;
    }

    public static /* synthetic */ int access$408(CameraEnhancer cameraEnhancer) {
        int i = cameraEnhancer.mZoomRatIndex;
        cameraEnhancer.mZoomRatIndex = i + 1;
        return i;
    }

    public static /* synthetic */ int access$410(CameraEnhancer cameraEnhancer) {
        int i = cameraEnhancer.mZoomRatIndex;
        cameraEnhancer.mZoomRatIndex = i - 1;
        return i;
    }

    public static /* synthetic */ int access$6308() {
        int i = mFrameId;
        mFrameId = i + 1;
        return i;
    }

    private void checkAutoFocusSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        boolean z = true;
        if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
            z = false;
        }
        this.mAutoFocusSupported = z;
    }

    /* access modifiers changed from: private */
    public void closeCamera() {
        try {
            this.mCameraOpenCloseLock.acquire();
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            CameraDevice cameraDevice = this.mCameraDevice;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.mCameraDevice = null;
            }
            ImageReader imageReader = this.mImageReader;
            if (imageReader != null) {
                imageReader.close();
                this.mImageReader = null;
            }
            this.mCameraFocusUtil.destroy();
            this.mCameraOpenCloseLock.release();
            destroyThread();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
        } catch (Throwable th) {
            this.mCameraFocusUtil.destroy();
            this.mCameraOpenCloseLock.release();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void configureTransform(int i, int i2) {
        Context context;
        float f;
        if (this.mTextureView != null && this.mResolution != null && (context = this.mContext) != null) {
            this.mRotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            Matrix matrix = new Matrix();
            float f2 = (float) i;
            float f3 = (float) i2;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) this.mResolution.getHeight(), (float) this.mResolution.getWidth());
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            int i3 = this.mRotation;
            if (1 == i3 || 3 == i3) {
                rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                float max = Math.max(f3 / ((float) this.mResolution.getHeight()), f2 / ((float) this.mResolution.getWidth()));
                matrix.postScale(max, max, centerX, centerY);
                f = (float) ((this.mRotation - 2) * 90);
            } else {
                if (2 == i3) {
                    f = 180.0f;
                }
                this.mTextureView.setTransform(matrix);
            }
            matrix.postRotate(f, centerX, centerY);
            this.mTextureView.setTransform(matrix);
        }
    }

    /* access modifiers changed from: private */
    public void createCameraPreviewSession() {
        List list;
        try {
            this.mPreviewRequestBuilder = this.mCameraDevice.createCaptureRequest(1);
            AutoFitTextureView autoFitTextureView = this.mTextureView;
            if (autoFitTextureView != null) {
                SurfaceTexture surfaceTexture = autoFitTextureView.getSurfaceTexture();
                surfaceTexture.setDefaultBufferSize(this.mResolution.getWidth(), this.mResolution.getHeight());
                Surface surface = new Surface(surfaceTexture);
                this.mPreviewRequestBuilder.addTarget(surface);
                list = Arrays.asList(new Surface[]{surface, this.mImageReader.getSurface()});
            } else {
                list = Arrays.asList(new Surface[]{this.mImageReader.getSurface()});
            }
            this.mPreviewRequestBuilder.addTarget(this.mImageReader.getSurface());
            int width = (this.mResolution.getWidth() * 3) / 4;
            int height = (this.mResolution.getHeight() * 3) / 4;
            if (width >= height) {
                width = height;
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(new Point((this.mResolution.getWidth() - width) / 2, (this.mResolution.getHeight() - width) / 2), new Size(width, width), 1000)});
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(new Point((this.mResolution.getWidth() - width) / 2, (this.mResolution.getHeight() - width) / 2), new Size(width, width), 1000)});
            this.mCameraDevice.createCaptureSession(list, new CameraCaptureSession.StateCallback() {
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                }

                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    if (CameraEnhancer.this.mCameraDevice != null) {
                        CameraCaptureSession unused = CameraEnhancer.this.mCaptureSession = cameraCaptureSession;
                        CameraEnhancer.this.initCameraSetting();
                        try {
                            CameraEnhancer cameraEnhancer = CameraEnhancer.this;
                            CaptureRequest unused2 = cameraEnhancer.mPreviewRequest = cameraEnhancer.mPreviewRequestBuilder.build();
                            CameraEnhancer.this.mCaptureSession.setRepeatingRequest(CameraEnhancer.this.mPreviewRequest, CameraEnhancer.this.mCaptureCallback, CameraEnhancer.this.backgroundHandler);
                        } catch (CameraAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, this.backgroundHandler);
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    private byte[] cropData(byte[] bArr, int i, int i2, Rect rect) {
        byte[] bArr2 = new byte[(rect.height() * rect.width())];
        for (int i3 = rect.top; i3 < rect.bottom; i3++) {
            System.arraycopy(bArr, (i * i3) + rect.left, bArr2, rect.width() * (i3 - rect.top), rect.width());
        }
        return bArr2;
    }

    private byte[] cropDataUV(byte[] bArr, int i, int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = new byte[(((rect.height() * rect.width()) / 2) - 1)];
        int i6 = rect.top / 2;
        while (true) {
            int i7 = rect.bottom;
            if (i6 >= i7 / 2) {
                return bArr2;
            }
            if (i6 < (i7 / 2) - 1) {
                i4 = (rect.left / 2) + (i * i6);
                i3 = rect.width() * (i6 - (rect.top / 2));
                i5 = rect.width();
            } else {
                i4 = (rect.left / 2) + (i * i6);
                i3 = rect.width() * (i6 - (rect.top / 2));
                i5 = rect.width() - 1;
            }
            System.arraycopy(bArr, i4, bArr2, i3, i5);
            i6++;
        }
    }

    /* access modifiers changed from: private */
    public Frame cropFrame(Frame frame, Rect rect) {
        Rect rect2 = rect;
        if (frame.getStrides().length == 1) {
            return new Frame(cropData(frame.getData(), frame.getWidth(), frame.getHeight(), rect2), rect.width(), rect.height(), new int[]{rect.width()}, frame.getFormat(), frame.getFrameId());
        }
        byte[] bArr = new byte[(((rect.height() * rect.width()) * 2) - 2)];
        int height = frame.getHeight() * frame.getWidth();
        int height2 = (((frame.getHeight() * frame.getWidth()) * 3) / 2) - 1;
        int height3 = rect.height() * rect.width();
        int height4 = (((rect.height() * rect.width()) * 3) / 2) - 1;
        for (int i = rect2.top; i < rect2.bottom; i++) {
            System.arraycopy(frame.getData(), (frame.getWidth() * i) + rect2.left, bArr, rect.width() * (i - rect2.top), rect.width());
        }
        int i2 = rect2.top / 2;
        while (true) {
            int i3 = rect2.bottom;
            if (i2 < i3 / 2) {
                if (i2 < (i3 / 2) - 1) {
                    System.arraycopy(frame.getData(), (rect2.left / 2) + (frame.getWidth() * i2) + height, bArr, (rect.width() * (i2 - (rect2.top / 2))) + height3, rect.width());
                    System.arraycopy(frame.getData(), (rect2.left / 2) + (frame.getWidth() * i2) + height2, bArr, (rect.width() * (i2 - (rect2.top / 2))) + height4, rect.width());
                } else {
                    System.arraycopy(frame.getData(), (rect2.left / 2) + (frame.getWidth() * i2) + height, bArr, (rect.width() * (i2 - (rect2.top / 2))) + height3, rect.width() - 1);
                    System.arraycopy(frame.getData(), (rect2.left / 2) + (frame.getWidth() * i2) + height2, bArr, (rect.width() * (i2 - (rect2.top / 2))) + height4, rect.width() - 1);
                }
                i2++;
            } else {
                return new Frame(bArr, rect.width(), rect.height(), new int[]{rect.width(), rect.width() / 2, rect.width() / 2}, frame.getFormat(), frame.getFrameId());
            }
        }
    }

    private void destroyThread() {
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

    /* access modifiers changed from: private */
    public void drawBox(ArrayList<Point> arrayList, int i) {
        CanvasView canvasView = this.mCanvasView;
        if (canvasView != null) {
            canvasView.clear();
            this.mCanvasView.setBoundaryPoints(arrayList, i);
            this.mCanvasView.invalidate();
        }
    }

    private void focusAtPoint(int i, int i2) {
        if (this.mCameraView != null) {
            int rotation = ((Activity) this.mContext).getWindowManager().getDefaultDisplay().getRotation();
            float[] fArr = {((float) i) / ((float) this.mCameraView.getWidth()), ((float) i2) / ((float) this.mCameraView.getHeight())};
            Matrix matrix = new Matrix();
            matrix.setRotate((float) rotation, 0.5f, 0.5f);
            matrix.mapPoints(fArr);
            if (this.mPreviewRequestBuilder != null) {
                updateManualFocus(fArr[0], fArr[1]);
                if (this.mCaptureSession != null) {
                    try {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                    } catch (Exception e) {
                        throw new CameraEnhancerException(e.getMessage());
                    }
                }
                resumeAutoFocusAfterManualFocus();
            }
        }
    }

    private CameraCharacteristics getCameraCharacteristics(int i) {
        if (i != 0 && i != 1) {
            return null;
        }
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        this.mCameraManager = cameraManager;
        for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics2 = this.mCameraManager.getCameraCharacteristics(cameraCharacteristics);
            Integer num = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i) {
                return cameraCharacteristics2;
            }
        }
        return null;
    }

    private CameraCharacteristics getCameraCharacteristicsAndId(int i) {
        if (i != 0 && i != 1) {
            return null;
        }
        try {
            this.mResolutions = getSizeList(i);
            if (this.mResolution == null) {
                setResolution(Resolution.RESOLUTION_AUTO);
            }
        } catch (CameraEnhancerException e) {
            e.printStackTrace();
        }
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        this.mCameraManager = cameraManager;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = cameraIdList[i2];
            CameraCharacteristics cameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i) {
                i2++;
            } else {
                this.mCameraId = str;
                return cameraCharacteristics;
            }
        }
        return null;
    }

    private Frame getGrayFrame(Frame frame) {
        int length = (frame.getData().length + 2) / 2;
        byte[] bArr = new byte[length];
        System.arraycopy(frame.getData(), 0, bArr, 0, length);
        return new Frame(bArr, frame.getWidth(), frame.getHeight(), new int[]{frame.getStrides()[0]}, frame.getFormat(), frame.getFrameId());
    }

    private List<Size> getSizeList(int i) {
        try {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i);
            if (cameraCharacteristics == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                for (Size size : streamConfigurationMap.getOutputSizes(35)) {
                    if (size.getWidth() > size.getHeight()) {
                        if (((float) size.getHeight()) / ((float) size.getWidth()) != 0.5625f) {
                        }
                    } else if (((float) size.getWidth()) / ((float) size.getHeight()) != 0.5625f) {
                    }
                    arrayList.add(size);
                }
            }
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                int i3 = 0;
                while (i3 < (arrayList.size() - 1) - i2) {
                    int i4 = i3 + 1;
                    if (((Size) arrayList.get(i3)).getHeight() * ((Size) arrayList.get(i3)).getWidth() < ((Size) arrayList.get(i4)).getHeight() * ((Size) arrayList.get(i4)).getWidth()) {
                        Size size2 = new Size(((Size) arrayList.get(i4)).getWidth(), ((Size) arrayList.get(i4)).getHeight());
                        arrayList.set(i4, new Size(((Size) arrayList.get(i3)).getWidth(), ((Size) arrayList.get(i3)).getHeight()));
                        arrayList.set(i3, size2);
                    }
                    i3 = i4;
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void handleUsage(DCEUsage dCEUsage) {
        String str;
        String str2 = "";
        byte[] bArr = dCEUsage.inner;
        if (bArr != null && this.info != null && this.f2526u != null) {
            try {
                String base64 = CameraLicenseUtil.base64(bArr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("in", base64);
                jSONObject.put("time", dCEUsage.stamp);
                String cacheFilePath = CameraLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"), this.f2526u);
                File file = new File(CameraLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/cr");
                if (file.exists()) {
                    String readStringFromFile = CameraLicenseUtil.readStringFromFile(file);
                    if (TextUtils.isEmpty(readStringFromFile)) {
                        str = "@" + jSONObject.toString();
                    } else {
                        String[] split = readStringFromFile.split("@");
                        if (dCEUsage.stamp == new JSONObject(split[split.length - 1]).getLong("time")) {
                            split[split.length - 1] = jSONObject.toString();
                            for (int i = 1; i < split.length; i++) {
                                str2 = str2 + "@" + split[i];
                            }
                            CameraLicenseUtil.saveStringToFile(file, str2);
                        } else {
                            str = readStringFromFile + "@" + jSONObject.toString();
                        }
                    }
                    CameraLicenseUtil.saveStringToFile(file, str);
                } else {
                    try {
                        file.createNewFile();
                        CameraLicenseUtil.saveStringToFile(file, jSONObject.toString());
                        String cacheFilePath2 = CameraLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"));
                        new JSONObject(CameraLicenseUtil.readStringFromFile(new File(CameraLicenseUtil.getApplication().getExternalFilesDir(str2).getPath(), cacheFilePath + "/" + cacheFilePath2))).put("needAuth", true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (System.currentTimeMillis() - this.lastSendUsageTime > 180000) {
                    this.lastSendUsageTime = System.currentTimeMillis();
                    this.sendHandler.sendEmptyMessage(3);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void initCameraSetting() {
        try {
            Range<Integer> range = this.mSuitableRange;
            if (range != null) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            } else {
                int i = this.mFrameRateValue;
                if (i != 0) {
                    setMaxFrameRate(i);
                    this.mFrameRateValue = 0;
                }
            }
            if (this.mFocalLength > 0.0f) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.mPreviewRequestBuilder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(this.mFocalLength));
            }
            if (this.mExposureTime > 0) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 0);
                this.mPreviewRequestBuilder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(this.mExposureTime));
            }
            if (this.mISO > 0) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 0);
                this.mPreviewRequestBuilder.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(this.mISO));
            }
            float f = this.autoFocusX;
            if (f > 0.0f) {
                float f2 = this.autoFocusY;
                if (f2 > 0.0f) {
                    updateManualFocus(f, f2);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, (Handler) null);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                }
            }
            TorchState torchState = this.mTorchState;
            if (torchState != this.mCurrentTorchState) {
                setTorchDesiredState(torchState);
            }
            float f3 = this.mZoomLevel;
            if (f3 > 0.0f) {
                setZoomFactor(f3);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void open(int i, int i2) {
        int i3;
        int i4;
        AutoFitTextureView autoFitTextureView;
        try {
            if (C0002a.m1a(this.mContext, "android.permission.CAMERA") != 0) {
                requestPermissions();
                return;
            }
        } catch (CameraEnhancerException e) {
            e.printStackTrace();
        }
        setupImageReader();
        this.mCanvasView.calculatePreviewScale(this.mResolution.getWidth(), this.mResolution.getHeight());
        if (this.mContext.getResources().getConfiguration().orientation == 2) {
            autoFitTextureView = this.mTextureView;
            i4 = this.mResolution.getWidth();
            i3 = this.mResolution.getHeight();
        } else {
            autoFitTextureView = this.mTextureView;
            i4 = this.mResolution.getHeight();
            i3 = this.mResolution.getWidth();
        }
        autoFitTextureView.setAspectRatio(i4, i3);
        configureTransform(i, i2);
        if (this.mCameraOpenCloseLock.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
            this.mCameraManager.openCamera(this.mCameraId, this.mStateCallback, this.backgroundHandler);
            return;
        }
        throw new RuntimeException("Time out waiting to lock camera opening.");
    }

    private void openCamera() {
        try {
            startBackgroundThread();
            if (C0002a.m1a(this.mContext, "android.permission.CAMERA") != 0) {
                requestPermissions();
                return;
            }
            this.mIsPaused = false;
            this.mCameraCharacteristics = getCameraCharacteristicsAndId(this.mCameraPosition.ordinal());
            checkAutoFocusSupported();
            this.mCropRegion = AutoFocusHelper.cropRegionForZoom(this.mCameraCharacteristics, 1.0f);
            AutoFitTextureView autoFitTextureView = this.mTextureView;
            if (autoFitTextureView == null) {
                setupImageReader();
                if (this.mCameraOpenCloseLock.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                    this.mCameraManager.openCamera(this.mCameraId, this.mStateCallback, this.backgroundHandler);
                    return;
                }
                throw new RuntimeException("Time out waiting to lock camera opening.");
            } else if (autoFitTextureView.isAvailable()) {
                open(this.mTextureView.getWidth(), this.mTextureView.getHeight());
            } else {
                this.mTextureView.setSurfaceTextureListener(this.mSurfaceTextureListener);
            }
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    private void requestPermissions() {
        try {
            if (C0002a.m1a(this.mContext, "android.permission.CAMERA") != 0) {
                C2145a.m5561b((Activity) this.mContext, new String[]{"android.permission.CAMERA"}, 1);
            }
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    private void resumeAutoFocusAfterManualFocus() {
        this.backgroundHandler.removeCallbacks(this.mAutoFocusRunnable);
        this.backgroundHandler.postDelayed(this.mAutoFocusRunnable, 3000);
    }

    private void returnOriginalZoom() {
        try {
            setZoomFactor(ZOOM_RATIO[0] / 10.0f);
            this.mZoomState = 0;
            this.mZoomRatIndex = 0;
        } catch (CameraEnhancerException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final RegionDefinitionInterface rotateRegion(int i, RegionDefinitionInterface regionDefinitionInterface, CameraView cameraView) {
        int i2;
        int i3;
        int i4 = regionDefinitionInterface.regionLeft;
        int i5 = regionDefinitionInterface.regionRight;
        int i6 = regionDefinitionInterface.regionTop;
        int i7 = regionDefinitionInterface.regionBottom;
        if (i == 0) {
            int i8 = regionDefinitionInterface.regionMeasuredByPercentage;
            if (i8 == 0) {
                regionDefinitionInterface.regionTop = i4;
                regionDefinitionInterface.regionBottom = i5;
                regionDefinitionInterface.regionLeft = cameraView.getWidth() - i7;
                i3 = cameraView.getWidth() - i6;
            } else if (i8 == 1) {
                regionDefinitionInterface.regionTop = i4;
                regionDefinitionInterface.regionBottom = i5;
                regionDefinitionInterface.regionLeft = 100 - i7;
                i3 = 100 - i6;
            }
            regionDefinitionInterface.regionRight = i3;
        }
        if (i == 3) {
            int i9 = regionDefinitionInterface.regionMeasuredByPercentage;
            if (i9 == 0) {
                regionDefinitionInterface.regionTop = cameraView.getHeight() - i7;
                regionDefinitionInterface.regionBottom = cameraView.getHeight() - i6;
                regionDefinitionInterface.regionLeft = cameraView.getWidth() - i5;
                i2 = cameraView.getWidth() - i4;
            } else if (i9 == 1) {
                regionDefinitionInterface.regionTop = 100 - i7;
                regionDefinitionInterface.regionBottom = 100 - i6;
                regionDefinitionInterface.regionLeft = 100 - i5;
                i2 = 100 - i4;
            }
            regionDefinitionInterface.regionRight = i2;
        }
        return regionDefinitionInterface;
    }

    private void saveByte(byte[] bArr, String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read != -1) {
                    fileOutputStream.write(bArr2, 0, read);
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void sendUsage() {
        String str = "";
        try {
            String cacheFilePath = CameraLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"), this.f2526u);
            File file = new File(CameraLicenseUtil.getApplication().getExternalFilesDir(str).getPath(), cacheFilePath + "/cr");
            if (file.exists()) {
                String[] split = CameraLicenseUtil.readStringFromFile(file).split("@");
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
                        CameraLicenseUtil.saveStringToFile(file, str);
                        String[] split2 = CameraLicenseUtil.readStringFromFile(file).split("@");
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
                                        CameraLicenseUtil.sendUsage(str3, CameraEnhancer.this.f2526u, CameraEnhancer.this.info, CameraEnhancer.this.DLSParameters);
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
                    String cacheFilePath2 = CameraLicenseUtil.getCacheFilePath(this.info.getString("hs"), this.info.getString("og"));
                    new JSONObject(CameraLicenseUtil.readStringFromFile(new File(CameraLicenseUtil.getApplication().getExternalFilesDir(str).getPath(), cacheFilePath + "/" + cacheFilePath2))).put("needAuth", true);
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private void setBoxView(Object obj) {
        RegionDefinitionInterface regionDefinitionInterface = new RegionDefinitionInterface(obj);
        this.mRegion = regionDefinitionInterface;
        if (this.mCameraView != null) {
            if (regionDefinitionInterface.regionLeft != 0 || regionDefinitionInterface.regionRight != 0 || regionDefinitionInterface.regionBottom != 0 || regionDefinitionInterface.regionTop != 0) {
                this.mRotation = ((Activity) this.mContext).getWindowManager().getDefaultDisplay().getRotation();
                this.mCameraView.post(new Runnable() {
                    public void run() {
                        Rect rect;
                        CameraEnhancer cameraEnhancer;
                        CameraEnhancer cameraEnhancer2;
                        Rect rect2;
                        CameraEnhancer cameraEnhancer3 = CameraEnhancer.this;
                        RegionDefinitionInterface unused = cameraEnhancer3.mRegion = cameraEnhancer3.rotateRegion(cameraEnhancer3.mRotation, CameraEnhancer.this.mRegion, CameraEnhancer.this.mCameraView);
                        if (CameraEnhancer.this.mRegion.regionMeasuredByPercentage == 1) {
                            if (CameraEnhancer.this.mRegion.regionTop < 0 || CameraEnhancer.this.mRegion.regionTop > 100 || CameraEnhancer.this.mRegion.regionLeft < 0 || CameraEnhancer.this.mRegion.regionLeft > 100 || CameraEnhancer.this.mRegion.regionRight < 0 || CameraEnhancer.this.mRegion.regionRight > 100 || CameraEnhancer.this.mRegion.regionBottom < 0 || CameraEnhancer.this.mRegion.regionBottom > 100 || CameraEnhancer.this.mRegion.regionBottom < CameraEnhancer.this.mRegion.regionTop || CameraEnhancer.this.mRegion.regionRight < CameraEnhancer.this.mRegion.regionLeft) {
                                CameraEnhancer.this.mBoxView.setVisibility(8);
                                cameraEnhancer2 = CameraEnhancer.this;
                                rect2 = new Rect(0, 0, CameraEnhancer.this.mCameraView.getWidth(), CameraEnhancer.this.mCameraView.getHeight());
                            } else {
                                cameraEnhancer = CameraEnhancer.this;
                                rect = new Rect((CameraEnhancer.this.mCameraView.getWidth() * CameraEnhancer.this.mRegion.regionLeft) / 100, (CameraEnhancer.this.mCameraView.getHeight() * CameraEnhancer.this.mRegion.regionTop) / 100, (CameraEnhancer.this.mCameraView.getWidth() * CameraEnhancer.this.mRegion.regionRight) / 100, (CameraEnhancer.this.mCameraView.getHeight() * CameraEnhancer.this.mRegion.regionBottom) / 100);
                                Rect unused2 = cameraEnhancer.mInterestRect = rect;
                                CameraEnhancer.this.mBoxView.reSetboxview(CameraEnhancer.this.mInterestRect.left, CameraEnhancer.this.mInterestRect.top, CameraEnhancer.this.mInterestRect.width(), CameraEnhancer.this.mInterestRect.height());
                                CameraEnhancer.this.mBoxView.setVisibility(0);
                                return;
                            }
                        } else if (CameraEnhancer.this.mRegion.regionTop < 0 || CameraEnhancer.this.mRegion.regionTop > CameraEnhancer.this.mCameraView.getHeight() || CameraEnhancer.this.mRegion.regionLeft < 0 || CameraEnhancer.this.mRegion.regionLeft > CameraEnhancer.this.mCameraView.getWidth() || CameraEnhancer.this.mRegion.regionRight < 0 || CameraEnhancer.this.mRegion.regionRight > CameraEnhancer.this.mCameraView.getWidth() || CameraEnhancer.this.mRegion.regionBottom < 0 || CameraEnhancer.this.mRegion.regionBottom > CameraEnhancer.this.mCameraView.getHeight() || CameraEnhancer.this.mRegion.regionBottom < CameraEnhancer.this.mRegion.regionTop || CameraEnhancer.this.mRegion.regionRight < CameraEnhancer.this.mRegion.regionLeft) {
                            CameraEnhancer.this.mBoxView.setVisibility(8);
                            cameraEnhancer2 = CameraEnhancer.this;
                            rect2 = new Rect(0, 0, CameraEnhancer.this.mCameraView.getWidth(), CameraEnhancer.this.mCameraView.getHeight());
                        } else {
                            cameraEnhancer = CameraEnhancer.this;
                            rect = new Rect(CameraEnhancer.this.mRegion.regionLeft, CameraEnhancer.this.mRegion.regionTop, CameraEnhancer.this.mRegion.regionRight, CameraEnhancer.this.mRegion.regionBottom);
                            Rect unused3 = cameraEnhancer.mInterestRect = rect;
                            CameraEnhancer.this.mBoxView.reSetboxview(CameraEnhancer.this.mInterestRect.left, CameraEnhancer.this.mInterestRect.top, CameraEnhancer.this.mInterestRect.width(), CameraEnhancer.this.mInterestRect.height());
                            CameraEnhancer.this.mBoxView.setVisibility(0);
                            return;
                        }
                        Rect unused4 = cameraEnhancer2.mInterestRect = rect2;
                    }
                });
            }
        }
    }

    private void setupImageReader() {
        ImageReader newInstance = ImageReader.newInstance(this.mResolution.getWidth(), this.mResolution.getHeight(), 35, 3);
        this.mImageReader = newInstance;
        newInstance.setOnImageAvailableListener(this.mOnImageAvailableListener, (Handler) null);
    }

    private void startBackgroundThread() {
        HandlerThread handlerThread = new HandlerThread("backgroundThread");
        this.backgroundThread = handlerThread;
        handlerThread.start();
        this.backgroundHandler = new Handler(this.backgroundThread.getLooper()) {
            /* JADX WARNING: Removed duplicated region for block: B:80:0x0292 A[Catch:{ Exception -> 0x0340, all -> 0x033e }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r13) {
                /*
                    r12 = this;
                    com.dynamsoft.dce.CameraEnhancer r0 = com.dynamsoft.dce.CameraEnhancer.this
                    long r0 = r0.endTime
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 != 0) goto L_0x0015
                    com.dynamsoft.dce.CameraEnhancer r0 = com.dynamsoft.dce.CameraEnhancer.this
                    long r4 = java.lang.System.currentTimeMillis()
                    long unused = r0.endTime = r4
                L_0x0015:
                    java.lang.Object r13 = r13.obj
                    com.dynamsoft.dce.Frame r13 = (com.dynamsoft.dce.Frame) r13
                    r0 = 0
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r1 = r1.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    if (r1 == 0) goto L_0x002b
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r1 = r1.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    r1.onPreviewOriginalFrame(r13)     // Catch:{ Exception -> 0x0340 }
                L_0x002b:
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListenerInner r1 = r1.mCameraListenerInner     // Catch:{ Exception -> 0x0340 }
                    if (r1 == 0) goto L_0x0074
                    java.util.concurrent.locks.ReentrantLock r1 = com.dynamsoft.dce.CameraEnhancer.framelock     // Catch:{ Exception -> 0x0340 }
                    r1.lock()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer.access$1308(r1)     // Catch:{ Exception -> 0x0340 }
                    java.util.concurrent.locks.ReentrantLock r1 = com.dynamsoft.dce.CameraEnhancer.framelock     // Catch:{ Exception -> 0x0340 }
                    r1.unlock()     // Catch:{ Exception -> 0x0340 }
                    long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = r1.mFrameTime     // Catch:{ Exception -> 0x0340 }
                    int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r1 == 0) goto L_0x006f
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = r1.mFrameTime     // Catch:{ Exception -> 0x0340 }
                    long r6 = r4 - r6
                    r1 = 1000(0x3e8, float:1.401E-42)
                    int r6 = (int) r6     // Catch:{ Exception -> 0x0340 }
                    int r1 = r1 / r6
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListenerInner r6 = r6.mCameraListenerInner     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r7 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r7 = r7.overedCountFrame     // Catch:{ Exception -> 0x0340 }
                    r6.OnProcess(r1, r7)     // Catch:{ Exception -> 0x0340 }
                L_0x006f:
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long unused = r1.mFrameTime = r4     // Catch:{ Exception -> 0x0340 }
                L_0x0074:
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r1 = r1.mErrorCode     // Catch:{ Exception -> 0x0340 }
                    r4 = 1
                    if (r1 != 0) goto L_0x007f
                    r1 = r4
                    goto L_0x0080
                L_0x007f:
                    r1 = r0
                L_0x0080:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.startDCE     // Catch:{ Exception -> 0x0340 }
                    if (r5 == 0) goto L_0x0097
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    long unused = r5.startTime = r6     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean unused = r5.startDCE = r0     // Catch:{ Exception -> 0x0340 }
                    goto L_0x00a0
                L_0x0097:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    long unused = r5.endTime = r6     // Catch:{ Exception -> 0x0340 }
                L_0x00a0:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    org.json.JSONObject r5 = r5.info     // Catch:{ Exception -> 0x0340 }
                    if (r5 == 0) goto L_0x010f
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r7 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r7 = r7.lastHandleUsageTime     // Catch:{ Exception -> 0x0340 }
                    long r5 = r5 - r7
                    r7 = 15000(0x3a98, double:7.411E-320)
                    int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r5 <= 0) goto L_0x010f
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    long unused = r5.lastHandleUsageTime = r6     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r6 = r5.endTime     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r8 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r8 = r8.startTime     // Catch:{ Exception -> 0x0340 }
                    long r6 = r6 - r8
                    r8 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 / r8
                    int r6 = (int) r6     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0340 }
                    java.lang.String unused = r5.consume = r6     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancerAlgorithm r6 = r5.mCamAlgorithm     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r7 = r5.consume     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.DMDLSConnectionParameters r5 = r5.DLSParameters     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r8 = r5.handshakeCode     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.DMDLSConnectionParameters r5 = r5.DLSParameters     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r9 = r5.organizationID     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    org.json.JSONObject r5 = r5.info     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r10 = "cu"
                    java.lang.String r10 = r5.getString(r10)     // Catch:{ Exception -> 0x0340 }
                    java.lang.String r11 = ""
                    java.lang.Object r5 = r6.NativeConsumePkg(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.DCEUsage r5 = (com.dynamsoft.dce.DCEUsage) r5     // Catch:{ Exception -> 0x0340 }
                    r6.handleUsage(r5)     // Catch:{ Exception -> 0x0340 }
                L_0x010f:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancerAlgorithm r6 = r5.mCamAlgorithm     // Catch:{ Exception -> 0x0340 }
                    byte[] r7 = r13.data     // Catch:{ Exception -> 0x0340 }
                    int r8 = r13.width     // Catch:{ Exception -> 0x0340 }
                    int r9 = r13.height     // Catch:{ Exception -> 0x0340 }
                    int[] r5 = r13.strides     // Catch:{ Exception -> 0x0340 }
                    r10 = r5[r0]     // Catch:{ Exception -> 0x0340 }
                    int r11 = r13.frameId     // Catch:{ Exception -> 0x0340 }
                    r6.setCurFrameData(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0340 }
                    if (r1 == 0) goto L_0x0147
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.mIfUseFrameFilter     // Catch:{ Exception -> 0x0340 }
                    if (r5 != 0) goto L_0x013e
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.mIfUseClarityFocus     // Catch:{ Exception -> 0x0340 }
                    if (r5 != 0) goto L_0x013e
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.mIfUseTimeFocus     // Catch:{ Exception -> 0x0340 }
                    if (r5 == 0) goto L_0x0147
                L_0x013e:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraFocusUtil r5 = r5.mCameraFocusUtil     // Catch:{ Exception -> 0x0340 }
                    r5.process(r13)     // Catch:{ Exception -> 0x0340 }
                L_0x0147:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraFocusUtil r5 = r5.mCameraFocusUtil     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.endZoomBySensor()     // Catch:{ Exception -> 0x0340 }
                    if (r5 == 0) goto L_0x017c
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r5 = r5.timeToStartZoom     // Catch:{ Exception -> 0x0340 }
                    int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                    if (r2 == 0) goto L_0x017c
                    long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r5 = r5.timeToStartZoom     // Catch:{ Exception -> 0x0340 }
                    long r2 = r2 - r5
                    r5 = 2000(0x7d0, double:9.88E-321)
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 <= 0) goto L_0x017c
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int unused = r2.mZoomState = r0     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    long unused = r2.timeOfStartMove = r5     // Catch:{ Exception -> 0x0340 }
                L_0x017c:
                    if (r1 == 0) goto L_0x01c8
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r2 = r2.mIfUseFrameFilter     // Catch:{ Exception -> 0x0340 }
                    if (r2 != 0) goto L_0x018e
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r2 = r2.mIfSensorControl     // Catch:{ Exception -> 0x0340 }
                    if (r2 == 0) goto L_0x01c8
                L_0x018e:
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraFocusUtil r2 = r2.mCameraFocusUtil     // Catch:{ Exception -> 0x0340 }
                    boolean r2 = r2.isNeedDecode()     // Catch:{ Exception -> 0x0340 }
                    if (r2 != 0) goto L_0x01c3
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer.access$3108(r13)     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r13 = r13.filterCount     // Catch:{ Exception -> 0x0340 }
                    r1 = 15
                    if (r13 <= r1) goto L_0x01b3
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int unused = r13.mZoomState = r0     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int unused = r13.filterCount = r0     // Catch:{ Exception -> 0x0340 }
                L_0x01b3:
                    java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x0340 }
                    r13.<init>()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    r1.setResultPoints(r13)     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this
                    boolean unused = r13.ifDoingJob = r0
                    return
                L_0x01c3:
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int unused = r2.filterCount = r0     // Catch:{ Exception -> 0x0340 }
                L_0x01c8:
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r2 = r2.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    if (r2 == 0) goto L_0x01d9
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r2 = r2.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    r2.onPreviewFilterFrame(r13)     // Catch:{ Exception -> 0x0340 }
                L_0x01d9:
                    int r2 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r3 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0340 }
                    int r6 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r7 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    r5.<init>(r0, r0, r6, r7)     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r6 = r6.mIfFastMode     // Catch:{ Exception -> 0x0340 }
                    if (r6 == 0) goto L_0x02ab
                    if (r1 == 0) goto L_0x02ab
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6.mFastFrameId     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 % 4
                    r7 = 2
                    r8 = 3
                    if (r6 != r4) goto L_0x0247
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    android.content.Context r6 = r6.mContext     // Catch:{ Exception -> 0x0340 }
                    android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x0340 }
                    android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6.orientation     // Catch:{ Exception -> 0x0340 }
                    if (r6 != r7) goto L_0x022d
                    android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0340 }
                    int r6 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 / 4
                    int r9 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r10 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    int r10 = r10 * r8
                    int r10 = r10 / 4
                    r5.<init>(r0, r6, r9, r10)     // Catch:{ Exception -> 0x0340 }
                    goto L_0x027e
                L_0x022d:
                    if (r6 != r4) goto L_0x025c
                    android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0340 }
                    int r6 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 / 4
                    int r7 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r7 = r7 * r8
                    int r7 = r7 / 4
                    int r8 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    r5.<init>(r6, r0, r7, r8)     // Catch:{ Exception -> 0x0340 }
                    r7 = r4
                    goto L_0x027e
                L_0x0247:
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6.mFastFrameId     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 % 4
                    if (r6 == r8) goto L_0x025e
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6.mFastFrameId     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 % 4
                    if (r6 != r7) goto L_0x025c
                    goto L_0x025e
                L_0x025c:
                    r7 = r0
                    goto L_0x027e
                L_0x025e:
                    android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0340 }
                    int r6 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 / 4
                    int r7 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    int r7 = r7 / 4
                    int r9 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r9 = r9 * r8
                    int r9 = r9 / 4
                    int r10 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    int r10 = r10 * r8
                    int r10 = r10 / 4
                    r5.<init>(r6, r7, r9, r10)     // Catch:{ Exception -> 0x0340 }
                    goto L_0x025c
                L_0x027e:
                    int r6 = r5.height()     // Catch:{ Exception -> 0x0340 }
                    int r8 = r5.width()     // Catch:{ Exception -> 0x0340 }
                    int r6 = r6 * r8
                    int r8 = r13.getHeight()     // Catch:{ Exception -> 0x0340 }
                    int r9 = r13.getWidth()     // Catch:{ Exception -> 0x0340 }
                    int r8 = r8 * r9
                    if (r6 == r8) goto L_0x029a
                    com.dynamsoft.dce.CameraEnhancer r6 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.Frame r13 = r6.cropFrame(r13, r5)     // Catch:{ Exception -> 0x0340 }
                    r13.mCropRect = r5     // Catch:{ Exception -> 0x0340 }
                L_0x029a:
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r5 = r5.mFastFrameId     // Catch:{ Exception -> 0x0340 }
                    r13.mFastFrameId = r5     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r5 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer.access$3308(r5)     // Catch:{ Exception -> 0x0340 }
                    r13.mIsFastFrame = r4     // Catch:{ Exception -> 0x0340 }
                    r13.mOrientation = r7     // Catch:{ Exception -> 0x0340 }
                L_0x02ab:
                    com.dynamsoft.dce.CameraEnhancer r4 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r4 = r4.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    if (r4 == 0) goto L_0x02bc
                    com.dynamsoft.dce.CameraEnhancer r4 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraListener r4 = r4.mCameraListener     // Catch:{ Exception -> 0x0340 }
                    r4.onPreviewFastFrame(r13)     // Catch:{ Exception -> 0x0340 }
                L_0x02bc:
                    com.dynamsoft.dce.CameraEnhancer r4 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r4 = r4.mIfAutoZoom     // Catch:{ Exception -> 0x0340 }
                    if (r4 == 0) goto L_0x02d3
                    if (r1 == 0) goto L_0x02d3
                    com.dynamsoft.dce.CameraEnhancer r4 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancerAlgorithm r5 = r4.mCamAlgorithm     // Catch:{ Exception -> 0x0340 }
                    boolean r5 = r5.isNeedZoom(r2, r3)     // Catch:{ Exception -> 0x0340 }
                    boolean unused = r4.mIfNeedZoom = r5     // Catch:{ Exception -> 0x0340 }
                L_0x02d3:
                    r13.mOriw = r2     // Catch:{ Exception -> 0x0340 }
                    r13.mOriH = r3     // Catch:{ Exception -> 0x0340 }
                    java.util.concurrent.locks.ReentrantLock r2 = com.dynamsoft.dce.CameraEnhancer.framelock     // Catch:{ Exception -> 0x0340 }
                    r2.lock()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    java.util.List r2 = r2.mframeList     // Catch:{ Exception -> 0x0340 }
                    int r2 = r2.size()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r3 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int r3 = r3.mFrameListLength     // Catch:{ Exception -> 0x0340 }
                    if (r2 < r3) goto L_0x02f9
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    java.util.List r2 = r2.mframeList     // Catch:{ Exception -> 0x0340 }
                    r2.clear()     // Catch:{ Exception -> 0x0340 }
                L_0x02f9:
                    com.dynamsoft.dce.CameraEnhancer r2 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    java.util.List r2 = r2.mframeList     // Catch:{ Exception -> 0x0340 }
                    r2.add(r13)     // Catch:{ Exception -> 0x0340 }
                    java.util.concurrent.locks.Condition r13 = com.dynamsoft.dce.CameraEnhancer.framelockcondition     // Catch:{ Exception -> 0x0340 }
                    r13.signal()     // Catch:{ Exception -> 0x0340 }
                    java.util.concurrent.locks.ReentrantLock r13 = com.dynamsoft.dce.CameraEnhancer.framelock     // Catch:{ Exception -> 0x0340 }
                    r13.unlock()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r13 = r13.mIfAutoZoom     // Catch:{ Exception -> 0x0340 }
                    if (r13 == 0) goto L_0x0344
                    if (r1 == 0) goto L_0x0344
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    long r3 = r13.timeToStartZoom     // Catch:{ Exception -> 0x0340 }
                    long r1 = r1 - r3
                    r3 = 1500(0x5dc, double:7.41E-321)
                    int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r13 <= 0) goto L_0x0344
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    int unused = r13.mZoomState = r0     // Catch:{ Exception -> 0x0340 }
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean r13 = r13.lastIsZoom     // Catch:{ Exception -> 0x0340 }
                    if (r13 == 0) goto L_0x0344
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this     // Catch:{ Exception -> 0x0340 }
                    boolean unused = r13.lastIsZoom = r0     // Catch:{ Exception -> 0x0340 }
                    goto L_0x0344
                L_0x033e:
                    r13 = move-exception
                    goto L_0x034a
                L_0x0340:
                    r13 = move-exception
                    r13.printStackTrace()     // Catch:{ all -> 0x033e }
                L_0x0344:
                    com.dynamsoft.dce.CameraEnhancer r13 = com.dynamsoft.dce.CameraEnhancer.this
                    boolean unused = r13.ifDoingJob = r0
                    return
                L_0x034a:
                    com.dynamsoft.dce.CameraEnhancer r1 = com.dynamsoft.dce.CameraEnhancer.this
                    boolean unused = r1.ifDoingJob = r0
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraEnhancer.C06734.handleMessage(android.os.Message):void");
            }
        };
    }

    /* access modifiers changed from: private */
    public void startSendThread() {
        HandlerThread handlerThread = new HandlerThread("sendThread");
        this.sendThread = handlerThread;
        handlerThread.start();
        this.sendHandler = new Handler(this.sendThread.getLooper()) {
            public void handleMessage(Message message) {
                try {
                    if (message.what == 3) {
                        CameraEnhancer.this.sendUsage();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                super.handleMessage(message);
            }
        };
    }

    private void stopSendThread() {
        HandlerThread handlerThread = this.sendThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.sendThread.join();
                this.sendThread = null;
                this.sendHandler = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateManualFocus(float f, float f2) {
        if (!this.mIfUseFocalLength) {
            int intValue = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            Rect cropRegionForZoom = AutoFocusHelper.cropRegionForZoom(this.mCameraCharacteristics, 1.0f);
            this.mCropRegion = cropRegionForZoom;
            this.mAFRegions = AutoFocusHelper.afRegionsForNormalizedCoord(f, f2, cropRegionForZoom, intValue);
            this.mAERegions = AutoFocusHelper.aeRegionsForNormalizedCoord(f, f2, this.mCropRegion, intValue);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, this.mAFRegions);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, this.mAERegions);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        }
    }

    public Frame AcquireListFrame(boolean z) {
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused) {
            return null;
        }
        framelock.lock();
        try {
            if (this.mframeList.isEmpty() && z) {
                framelockcondition.await();
            }
            if (!this.mframeList.isEmpty()) {
                List<Frame> list = this.mframeList;
                Frame frame = list.get(list.size() - 1);
                List<Frame> list2 = this.mframeList;
                list2.remove(list2.size() - 1);
                this.overedCountFrame = 0;
                framelock.unlock();
                return frame;
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            framelock.unlock();
            throw th;
        }
        framelock.unlock();
        return null;
    }

    public int addCameraListener(CameraListener cameraListener) {
        this.mCameraListener = cameraListener;
        return 0;
    }

    public int addCameraListenerInner(final Object obj) {
        this.mCameraListenerInner = new CameraListenerInner() {
            public void OnProcess(int i, int i2) {
                try {
                    Class<?> cls = obj.getClass();
                    Class cls2 = Integer.TYPE;
                    cls.getMethod("process", new Class[]{cls2, cls2}).invoke(obj, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                } catch (Exception unused) {
                }
            }
        };
        return 0;
    }

    public void addCameraView(CameraView cameraView) {
        this.mCameraView = cameraView;
        this.mCanvasView = cameraView.getCanvasView();
        this.mTextureView = cameraView.getAutoFitTextureView();
        this.mBoxView = cameraView.getBoxView();
    }

    public int addTorchListener(TorchListener torchListener) {
        this.mTorchListener = torchListener;
        return 0;
    }

    public int enableAutoFocusOnSharpnessChange(boolean z) {
        if (!this.mIfForceAutoFocus) {
            return 0;
        }
        this.mIfUseClarityFocus = z;
        this.mCameraFocusUtil.setIfFocusClarity(z);
        return 0;
    }

    public int enableAutoZoom(boolean z) {
        this.mIfAutoZoom = z;
        if (z) {
            return 0;
        }
        returnOriginalZoom();
        return 0;
    }

    public int enableDCEAutoFocus(boolean z) {
        this.mIfForceAutoFocus = z;
        int deviceLevel = getDeviceLevel();
        boolean z2 = this.mIfForceAutoFocus;
        if (!z2) {
            this.mCameraFocusUtil.setIfFocusTime(false);
            this.mCameraFocusUtil.setIfFocusClarity(false);
            this.mIfUseClarityFocus = false;
            this.mIfUseTimeFocus = false;
        } else if (deviceLevel == 0 || deviceLevel == -2) {
            this.mCameraFocusUtil.setIfFocusTime(z2);
            this.mIfUseTimeFocus = true;
        } else if (deviceLevel == 1 || deviceLevel == 2) {
            this.mCameraFocusUtil.setIfFocusClarity(z2);
            this.mIfUseClarityFocus = true;
        }
        return 0;
    }

    public void enableDefaultAutoFocus(boolean z) {
        this.mIfAutoFocus = z;
        setAutoFocusPosition(0.5f, 0.5f);
    }

    public int enableFastMode(boolean z) {
        this.mIfFastMode = z;
        return 0;
    }

    public int enableFrameFilter(boolean z) {
        this.mIfUseFrameFilter = z;
        this.mCameraFocusUtil.setIfFocusStateFilter(z);
        this.mCameraFocusUtil.setIfSharpnessFilter(z);
        return 0;
    }

    public int enableRegularAutoFocus(boolean z) {
        if (!this.mIfForceAutoFocus) {
            return 0;
        }
        this.mIfUseTimeFocus = z;
        this.mCameraFocusUtil.setIfFocusTime(z);
        return 0;
    }

    public int enableSensorControl(boolean z) {
        if (!HardwareUtil.judgeSensorSupport(this.mContext)) {
            return -1;
        }
        this.mIfSensorControl = z;
        this.mCameraFocusUtil.setIfFocusSensor(z);
        return 0;
    }

    public void focusAtCenter() {
        CameraView cameraView;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState != cameraState2 && this.mDesiredCameraState != cameraState2 && !this.mIsPaused && (cameraView = this.mCameraView) != null) {
            int rotation = ((Activity) this.mContext).getWindowManager().getDefaultDisplay().getRotation();
            float[] fArr = {((float) (cameraView.getWidth() / 2)) / ((float) this.mCameraView.getWidth()), ((float) (this.mCameraView.getHeight() / 2)) / ((float) this.mCameraView.getHeight())};
            Matrix matrix = new Matrix();
            matrix.setRotate((float) rotation, 0.5f, 0.5f);
            matrix.mapPoints(fArr);
            if (this.mPreviewRequestBuilder != null) {
                updateManualFocus(fArr[0], fArr[1]);
                if (this.mCaptureSession != null) {
                    try {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, (Handler) null);
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                    } catch (Exception e) {
                        throw new CameraEnhancerException(e.getMessage());
                    }
                }
                resumeAutoFocusAfterManualFocus();
            }
        }
    }

    public CameraState getCameraCurrentState() {
        return this.mCurrentCameraState;
    }

    public CameraState getCameraDesireState() {
        return this.mDesiredCameraState;
    }

    public CameraPosition getCameraPosition() {
        return this.mCameraPosition;
    }

    public int getDeviceLevel() {
        return HardwareUtil.judgeDeviceLevel(this.mContext, this.mCpuFreq1, this.mCpuFreq2, this.mRam1, this.mRam2);
    }

    public boolean getEnabledAutoFocusOnSharpnessChangeStatus() {
        return this.mIfUseClarityFocus;
    }

    public boolean getEnabledAutoZoomStatus() {
        return this.mIfAutoZoom;
    }

    public boolean getEnabledDCEAutoFocusStatus() {
        return this.mIfForceAutoFocus;
    }

    public boolean getEnabledDefaultAutoFocusStatus() {
        return this.mIfAutoFocus;
    }

    public boolean getEnabledFastModeStatus() {
        return this.mIfFastMode;
    }

    public boolean getEnabledFrameFilterStatus() {
        return this.mIfUseFrameFilter;
    }

    public boolean getEnabledRegularAutoFocusStatus() {
        return this.mIfUseTimeFocus;
    }

    public boolean getEnabledSensorControlStatus() {
        return this.mIfSensorControl;
    }

    public Size getResolution() {
        return this.mResolution;
    }

    public List<Size> getResolutionList() {
        return getSizeList(this.mCameraPosition.ordinal());
    }

    public TorchState getTorchCurrentState() {
        return this.mCurrentTorchState;
    }

    public TorchState getTorchDesiredState() {
        return this.mDesiredTorchState;
    }

    public String getVersion() {
        return DCE_VERSION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0158 A[Catch:{ Exception -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0185 A[Catch:{ Exception -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0295 A[Catch:{ Exception -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initLicenseFromDLS(com.dynamsoft.dce.DMDLSConnectionParameters r30, com.dynamsoft.dce.CameraDLSLicenseVerificationListener r31) {
        /*
            r29 = this;
            r7 = r29
            r0 = r30
            r8 = r31
            java.lang.String r1 = "sd"
            java.lang.String r2 = r0.handshakeCode
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x000f
            r2 = r3
        L_0x000f:
            r0.handshakeCode = r2
            java.lang.String r2 = r0.organizationID
            if (r2 != 0) goto L_0x0016
            r2 = r3
        L_0x0016:
            r0.organizationID = r2
            java.lang.String r2 = r0.mainServerURL
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r0.standbyServerURL
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "https://mlts.dynamsoft.com"
            r0.mainServerURL = r2
            java.lang.String r2 = "https://slts.dynamsoft.com"
            r0.standbyServerURL = r2
            goto L_0x0035
        L_0x0031:
            java.lang.String r2 = r0.standbyServerURL
            r0.mainServerURL = r2
        L_0x0035:
            int r2 = r0.uuidGenerationMethod
            r4 = 1
            if (r2 != 0) goto L_0x003c
            r0.uuidGenerationMethod = r4
        L_0x003c:
            r7.DLSParameters = r0
            java.lang.String r2 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            java.lang.String r5 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            java.lang.String r6 = r0.mainServerURL     // Catch:{ Exception -> 0x0342 }
            java.lang.String r2 = com.dynamsoft.dce.CameraLicenseUtil.getCacheFilePath(r2, r5, r6)     // Catch:{ Exception -> 0x0342 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0342 }
            android.app.Application r6 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x0342 }
            java.io.File r6 = r6.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0342 }
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x0342 }
            boolean r2 = r5.exists()     // Catch:{ Exception -> 0x0342 }
            java.lang.String r6 = "os"
            java.lang.String r10 = "sp"
            java.lang.String r11 = "cu"
            java.lang.String r12 = "lu"
            java.lang.String r13 = "ad"
            java.lang.String r14 = "Android"
            java.lang.String r15 = "ed"
            java.lang.String r9 = "mobile"
            java.lang.String r4 = "dt"
            r17 = r6
            java.lang.String r6 = "1"
            r18 = r10
            java.lang.String r10 = "vm"
            r19 = r11
            java.lang.String r11 = "dce"
            r20 = r12
            java.lang.String r12 = "pd"
            r21 = r13
            java.lang.String r13 = "og"
            r22 = r14
            java.lang.String r14 = "hs"
            if (r2 != 0) goto L_0x009b
            r5.mkdirs()     // Catch:{ Exception -> 0x0342 }
            com.dynamsoft.dce.CameraUUID r1 = com.dynamsoft.dce.CameraLicenseUtil.getUuid(r30)     // Catch:{ Exception -> 0x0342 }
            r2 = r1
            r5 = r20
            r1 = r22
            r22 = r15
            r15 = r4
        L_0x0098:
            r4 = 1
            goto L_0x0293
        L_0x009b:
            java.lang.String r2 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            r23 = r15
            java.lang.String r15 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            java.lang.String r2 = com.dynamsoft.dce.CameraLicenseUtil.getCacheFilePath(r2, r15)     // Catch:{ Exception -> 0x0342 }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x0342 }
            r24 = r4
            java.lang.String r4 = r5.getPath()     // Catch:{ Exception -> 0x0342 }
            r15.<init>(r4, r2)     // Catch:{ Exception -> 0x0342 }
            com.dynamsoft.dce.CameraUUID r2 = com.dynamsoft.dce.CameraLicenseUtil.getUuid(r30)     // Catch:{ Exception -> 0x0342 }
            boolean r4 = r15.exists()     // Catch:{ Exception -> 0x0342 }
            if (r4 == 0) goto L_0x0289
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0342 }
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x0342 }
            r25 = r9
            java.lang.String r9 = "cr"
            r4.<init>(r5, r9)     // Catch:{ Exception -> 0x0342 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x0342 }
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r5 = com.dynamsoft.dce.CameraLicenseUtil.readStringFromFile(r15)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0342 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x0342 }
            boolean r5 = r9.has(r1)     // Catch:{ Exception -> 0x0342 }
            if (r5 == 0) goto L_0x012a
            java.lang.String r5 = r9.getString(r1)     // Catch:{ Exception -> 0x0342 }
            r26 = r4
            java.util.Date r4 = new java.util.Date     // Catch:{ Exception -> 0x0342 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0342 }
            r27 = r6
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x0342 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0342 }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0342 }
            r5.setTime(r4)     // Catch:{ Exception -> 0x0342 }
            r4 = 5
            r6 = 1
            r5.add(r4, r6)     // Catch:{ Exception -> 0x0342 }
            java.util.Date r4 = r5.getTime()     // Catch:{ Exception -> 0x0342 }
            java.util.Date r5 = new java.util.Date     // Catch:{ Exception -> 0x0342 }
            r5.<init>()     // Catch:{ Exception -> 0x0342 }
            boolean r4 = r5.after(r4)     // Catch:{ Exception -> 0x0342 }
            if (r4 == 0) goto L_0x0127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0342 }
            r4.<init>()     // Catch:{ Exception -> 0x0342 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0342 }
            r4.append(r5)     // Catch:{ Exception -> 0x0342 }
            r4.append(r3)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0342 }
            r9.put(r1, r4)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x0342 }
            goto L_0x0146
        L_0x0127:
            r5 = r26
            goto L_0x014a
        L_0x012a:
            r27 = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0342 }
            r4.<init>()     // Catch:{ Exception -> 0x0342 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0342 }
            r4.append(r5)     // Catch:{ Exception -> 0x0342 }
            r4.append(r3)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0342 }
            r9.put(r1, r4)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x0342 }
        L_0x0146:
            com.dynamsoft.dce.CameraLicenseUtil.saveStringToFile(r15, r1)     // Catch:{ Exception -> 0x0342 }
            r5 = 1
        L_0x014a:
            java.lang.String r1 = "in"
            java.lang.String r1 = r9.getString(r1)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = "needAuth"
            boolean r4 = r9.getBoolean(r4)     // Catch:{ Exception -> 0x0342 }
            if (r4 == 0) goto L_0x0166
        L_0x0158:
            r5 = r20
            r1 = r22
            r22 = r23
            r15 = r24
            r9 = r25
            r6 = r27
            goto L_0x0098
        L_0x0166:
            com.dynamsoft.dce.CameraEnhancerAlgorithm r4 = r7.mCamAlgorithm     // Catch:{ Exception -> 0x0342 }
            int r6 = r1.length()     // Catch:{ Exception -> 0x0342 }
            int r6 = r6 + -36
            r15 = 0
            java.lang.String r6 = r1.substring(r15, r6)     // Catch:{ Exception -> 0x0342 }
            int r15 = r1.length()     // Catch:{ Exception -> 0x0342 }
            int r15 = r15 + -36
            java.lang.String r1 = r1.substring(r15)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = r2.deviceId     // Catch:{ Exception -> 0x0342 }
            int r1 = r4.initLicenseInfo(r6, r1, r15)     // Catch:{ Exception -> 0x0342 }
            if (r1 != 0) goto L_0x0158
            r1 = 0
            r7.mErrorCode = r1     // Catch:{ Exception -> 0x0342 }
            r1 = 0
            if (r8 == 0) goto L_0x018f
            r4 = 1
            r8.DLSLicenseVerificationCallback(r4, r1)     // Catch:{ Exception -> 0x0342 }
        L_0x018f:
            java.lang.String r4 = r0.mainServerURL     // Catch:{ Exception -> 0x0342 }
            r7.f2526u = r4     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = "usu"
            boolean r4 = r9.getBoolean(r4)     // Catch:{ Exception -> 0x0342 }
            if (r4 != 0) goto L_0x0272
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0342 }
            r1.<init>()     // Catch:{ Exception -> 0x0342 }
            r7.info = r1     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            if (r4 != 0) goto L_0x01aa
            r1.put(r14, r3)     // Catch:{ Exception -> 0x0342 }
            goto L_0x01ad
        L_0x01aa:
            r1.put(r14, r4)     // Catch:{ Exception -> 0x0342 }
        L_0x01ad:
            java.lang.String r1 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            if (r1 != 0) goto L_0x01b7
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            r1.put(r13, r3)     // Catch:{ Exception -> 0x0342 }
            goto L_0x01bc
        L_0x01b7:
            org.json.JSONObject r4 = r7.info     // Catch:{ Exception -> 0x0342 }
            r4.put(r13, r1)     // Catch:{ Exception -> 0x0342 }
        L_0x01bc:
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            r1.put(r12, r11)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            r6 = r27
            r1.put(r10, r6)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            r15 = r24
            r9 = r25
            r1.put(r15, r9)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            r16 = r5
            r4 = r22
            r5 = r23
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            android.app.Application r22 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x0342 }
            r23 = r4
            java.lang.String r4 = r22.getPackageName()     // Catch:{ Exception -> 0x0342 }
            r8 = r21
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            r21 = r8
            java.lang.String r8 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            r22 = r5
            java.lang.String r5 = r0.mainServerURL     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = com.dynamsoft.dce.CameraLicenseUtil.checkLastTime(r4, r8, r5)     // Catch:{ Exception -> 0x0342 }
            r5 = r20
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r2.deviceId     // Catch:{ Exception -> 0x0342 }
            r8 = r19
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r0.sessionPassword     // Catch:{ Exception -> 0x0342 }
            r19 = r8
            r8 = r18
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r1 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0342 }
            r4.<init>()     // Catch:{ Exception -> 0x0342 }
            r18 = r8
            java.lang.String r8 = "Android "
            r4.append(r8)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0342 }
            r4.append(r8)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0342 }
            r8 = r17
            r1.put(r8, r4)     // Catch:{ Exception -> 0x0342 }
            java.util.List<java.lang.Integer> r1 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            if (r1 == 0) goto L_0x025a
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0342 }
            r1.<init>()     // Catch:{ Exception -> 0x0342 }
            r17 = r8
            r4 = 0
        L_0x023e:
            java.util.List<java.lang.Integer> r8 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0342 }
            if (r4 >= r8) goto L_0x0252
            java.util.List<java.lang.Integer> r8 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x0342 }
            r1.put(r8)     // Catch:{ Exception -> 0x0342 }
            int r4 = r4 + 1
            goto L_0x023e
        L_0x0252:
            org.json.JSONObject r4 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.String r8 = "lm"
            r4.put(r8, r1)     // Catch:{ Exception -> 0x0342 }
            goto L_0x025c
        L_0x025a:
            r17 = r8
        L_0x025c:
            int r1 = r0.maxBufferDays     // Catch:{ Exception -> 0x0342 }
            if (r1 <= 0) goto L_0x026b
            boolean r4 = r2.ifSoft     // Catch:{ Exception -> 0x0342 }
            if (r4 == 0) goto L_0x026b
            org.json.JSONObject r4 = r7.info     // Catch:{ Exception -> 0x0342 }
            java.lang.String r8 = "mcd"
            r4.put(r8, r1)     // Catch:{ Exception -> 0x0342 }
        L_0x026b:
            r29.sendUsage()     // Catch:{ Exception -> 0x0342 }
            r29.startSendThread()     // Catch:{ Exception -> 0x0342 }
            goto L_0x0284
        L_0x0272:
            r16 = r5
            r5 = r20
            r15 = r24
            r9 = r25
            r6 = r27
            r28 = r23
            r23 = r22
            r22 = r28
            r7.info = r1     // Catch:{ Exception -> 0x0342 }
        L_0x0284:
            r4 = r16
            r1 = r23
            goto L_0x0293
        L_0x0289:
            r5 = r20
            r1 = r22
            r22 = r23
            r15 = r24
            goto L_0x0098
        L_0x0293:
            if (r4 == 0) goto L_0x0359
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0342 }
            r4.<init>()     // Catch:{ Exception -> 0x0342 }
            java.lang.String r8 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            if (r8 != 0) goto L_0x02a2
            r4.put(r14, r3)     // Catch:{ Exception -> 0x0342 }
            goto L_0x02a5
        L_0x02a2:
            r4.put(r14, r8)     // Catch:{ Exception -> 0x0342 }
        L_0x02a5:
            java.lang.String r8 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            if (r8 != 0) goto L_0x02ad
            r4.put(r13, r3)     // Catch:{ Exception -> 0x0342 }
            goto L_0x02b0
        L_0x02ad:
            r4.put(r13, r8)     // Catch:{ Exception -> 0x0342 }
        L_0x02b0:
            r4.put(r12, r11)     // Catch:{ Exception -> 0x0342 }
            r4.put(r10, r6)     // Catch:{ Exception -> 0x0342 }
            r4.put(r15, r9)     // Catch:{ Exception -> 0x0342 }
            r3 = r22
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
            android.app.Application r1 = com.dynamsoft.dce.CameraLicenseUtil.getApplication()     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0342 }
            r3 = r21
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r0.handshakeCode     // Catch:{ Exception -> 0x0342 }
            java.lang.String r3 = r0.organizationID     // Catch:{ Exception -> 0x0342 }
            java.lang.String r6 = r0.mainServerURL     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = com.dynamsoft.dce.CameraLicenseUtil.checkLastTime(r1, r3, r6)     // Catch:{ Exception -> 0x0342 }
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r2.deviceId     // Catch:{ Exception -> 0x0342 }
            r3 = r19
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r0.sessionPassword     // Catch:{ Exception -> 0x0342 }
            r3 = r18
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0342 }
            r1.<init>()     // Catch:{ Exception -> 0x0342 }
            java.lang.String r3 = "Android "
            r1.append(r3)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0342 }
            r1.append(r3)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0342 }
            r3 = r17
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
            java.util.List<java.lang.Integer> r1 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            if (r1 == 0) goto L_0x0321
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0342 }
            r1.<init>()     // Catch:{ Exception -> 0x0342 }
            r3 = 0
        L_0x0308:
            java.util.List<java.lang.Integer> r5 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0342 }
            if (r3 >= r5) goto L_0x031c
            java.util.List<java.lang.Integer> r5 = r0.limitedLicenseModules     // Catch:{ Exception -> 0x0342 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x0342 }
            r1.put(r5)     // Catch:{ Exception -> 0x0342 }
            int r3 = r3 + 1
            goto L_0x0308
        L_0x031c:
            java.lang.String r3 = "lm"
            r4.put(r3, r1)     // Catch:{ Exception -> 0x0342 }
        L_0x0321:
            int r1 = r0.maxBufferDays     // Catch:{ Exception -> 0x0342 }
            if (r1 <= 0) goto L_0x032e
            boolean r2 = r2.ifSoft     // Catch:{ Exception -> 0x0342 }
            if (r2 == 0) goto L_0x032e
            java.lang.String r2 = "mcd"
            r4.put(r2, r1)     // Catch:{ Exception -> 0x0342 }
        L_0x032e:
            com.dynamsoft.dce.CameraEnhancer$CameraEnhancerGetLicenseTask r8 = new com.dynamsoft.dce.CameraEnhancer$CameraEnhancerGetLicenseTask     // Catch:{ Exception -> 0x0342 }
            r6 = 0
            r1 = r8
            r2 = r29
            r3 = r30
            r5 = r31
            r1.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x0342 }
            r1 = 0
            java.lang.Void[] r0 = new java.lang.Void[r1]     // Catch:{ Exception -> 0x0342 }
            r8.execute(r0)     // Catch:{ Exception -> 0x0342 }
            goto L_0x0359
        L_0x0342:
            r0 = move-exception
            r1 = -20002(0xffffffffffffb1de, float:NaN)
            r7.mErrorCode = r1
            r2 = r31
            if (r2 == 0) goto L_0x0356
            com.dynamsoft.dce.CameraEnhancerException r3 = new com.dynamsoft.dce.CameraEnhancerException
            java.lang.String r4 = "Caching failed."
            r3.<init>((int) r1, (java.lang.String) r4)
            r1 = 0
            r2.DLSLicenseVerificationCallback(r1, r3)
        L_0x0356:
            r0.printStackTrace()
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraEnhancer.initLicenseFromDLS(com.dynamsoft.dce.DMDLSConnectionParameters, com.dynamsoft.dce.CameraDLSLicenseVerificationListener):void");
    }

    public void pauseCamera() {
        CameraCaptureSession cameraCaptureSession;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState != cameraState2 && this.mDesiredCameraState != cameraState2 && !this.mIsPaused && (cameraCaptureSession = this.mCaptureSession) != null) {
            try {
                cameraCaptureSession.stopRepeating();
                this.mIsPaused = true;
            } catch (Exception e) {
                throw new CameraEnhancerException(e.getMessage());
            }
        }
    }

    public void removeCameraListener() {
        this.mCameraListener = null;
    }

    public void resumeCamera() {
        CameraCaptureSession cameraCaptureSession;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState != cameraState2 && this.mDesiredCameraState != cameraState2 && (cameraCaptureSession = this.mCaptureSession) != null) {
            try {
                cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                this.mIsPaused = false;
            } catch (Exception e) {
                throw new CameraEnhancerException(e.getMessage());
            }
        }
    }

    public void setAutoFocusPosition(float f, float f2) {
        if (this.mIfAutoFocus) {
            if (this.mPreviewRequestBuilder != null) {
                updateManualFocus(f, f2);
                if (this.mCaptureSession != null) {
                    try {
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, (Handler) null);
                        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                    } catch (Exception e) {
                        throw new CameraEnhancerException(e.getMessage());
                    }
                }
            } else {
                this.autoFocusX = f;
                this.autoFocusY = f2;
            }
        }
    }

    public void setAutoModeLevelParam(int i, int i2, int i3, int i4) {
        this.mCpuFreq1 = i;
        this.mCpuFreq2 = i2;
        this.mRam1 = i3;
        this.mRam2 = i4;
    }

    public int setCameraDesiredState(CameraState cameraState) {
        if (cameraState == this.mCurrentCameraState) {
            return 0;
        }
        CameraState cameraState2 = CameraState.CAMERA_STATE_ON;
        if (cameraState == cameraState2) {
            this.mDesiredCameraState = cameraState2;
            openCamera();
        } else {
            cameraState2 = CameraState.CAMERA_STATE_OFF;
            if (cameraState == cameraState2) {
                this.mDesiredCameraState = cameraState2;
                closeCamera();
            }
            return 0;
        }
        this.mCurrentCameraState = cameraState2;
        return 0;
    }

    public int setExposureTime(long j) {
        CameraCaptureSession cameraCaptureSession;
        int i;
        CaptureRequest.Key key;
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder != null) {
            if (j > 0) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 0);
                builder = this.mPreviewRequestBuilder;
                key = CaptureRequest.SENSOR_EXPOSURE_TIME;
                i = Long.valueOf(j);
            } else {
                key = CaptureRequest.CONTROL_AE_MODE;
                i = 1;
            }
            builder.set(key, i);
        }
        this.mExposureTime = j;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused || (cameraCaptureSession = this.mCaptureSession) == null) {
            return 0;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
            return 0;
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    public int setFocalLength(float f) {
        CameraCaptureSession cameraCaptureSession;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        this.mIfUseFocalLength = i >= 0;
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder != null) {
            if (i >= 0) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.mPreviewRequestBuilder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
            } else if (this.mIfAutoFocus) {
                updateManualFocus(this.autoFocusX, this.autoFocusY);
            } else {
                updateAutoFocus();
            }
        }
        this.mFocalLength = f;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused || (cameraCaptureSession = this.mCaptureSession) == null) {
            return 0;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
            return 0;
        } catch (CameraAccessException e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    public int setISO(int i) {
        CameraCaptureSession cameraCaptureSession;
        int i2;
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder != null) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            if (i > 0) {
                builder.set(key, 0);
                builder = this.mPreviewRequestBuilder;
                key = CaptureRequest.SENSOR_SENSITIVITY;
                i2 = Integer.valueOf(i);
            } else {
                i2 = 1;
            }
            builder.set(key, i2);
        }
        this.mISO = i;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused || (cameraCaptureSession = this.mCaptureSession) == null) {
            return 0;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
            return 0;
        } catch (Exception e) {
            throw new CameraEnhancerException(e.getMessage());
        }
    }

    public int setManualFocusPosition(int i, int i2) {
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (!(cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused)) {
            try {
                focusAtPoint(i, i2);
            } catch (CameraEnhancerException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int setMaxFrameRate(int i) {
        Range<Integer>[] rangeArr;
        Range<Integer> range;
        CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
        if (cameraCharacteristics == null) {
            this.mFrameRateValue = i;
        } else if (!(cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null || rangeArr.length <= 0)) {
            for (int i2 = 0; i2 < rangeArr.length; i2++) {
                for (int length = rangeArr.length - 1; length > i2; length--) {
                    int i3 = length - 1;
                    if (rangeArr[length].getUpper().intValue() < rangeArr[i3].getUpper().intValue()) {
                        Range<Integer> range2 = new Range<>(rangeArr[i3].getLower(), rangeArr[i3].getUpper());
                        rangeArr[i3] = new Range<>(rangeArr[length].getLower(), rangeArr[length].getUpper());
                        rangeArr[length] = range2;
                    } else if (rangeArr[length].getUpper().equals(rangeArr[i3].getUpper()) && rangeArr[length].getLower().intValue() < rangeArr[i3].getLower().intValue()) {
                        Range<Integer> range3 = new Range<>(rangeArr[i3].getLower(), rangeArr[i3].getUpper());
                        rangeArr[i3] = new Range<>(rangeArr[length].getLower(), rangeArr[length].getUpper());
                        rangeArr[length] = range3;
                    }
                }
            }
            int length2 = rangeArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    range = null;
                    break;
                }
                range = rangeArr[i4];
                if (range.getUpper().intValue() >= i) {
                    break;
                }
                i4++;
            }
            if (range == null) {
                range = rangeArr[rangeArr.length - 1];
            }
            if (i > 0) {
                this.mSuitableRange = range;
            } else {
                this.mSuitableRange = null;
            }
            CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                CameraState cameraState = this.mCurrentCameraState;
                CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
                if (!(cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused)) {
                    try {
                        this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                    } catch (CameraAccessException e) {
                        throw new CameraEnhancerException(e.getMessage());
                    }
                }
            }
        }
        return 0;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public int setRegularAutoFocusParam(int i, int i2) {
        this.mCameraFocusUtil.setFocusTimems((long) i);
        this.mCameraFocusUtil.setTerminateFocusByTime((long) i2);
        return 0;
    }

    public void setResolution(Resolution resolution) {
        Size size;
        StreamConfigurationMap streamConfigurationMap;
        if (this.mResolutions == null) {
            this.mResolutions = getSizeList(this.mCameraPosition.ordinal());
        }
        List<Size> list = this.mResolutions;
        if (list == null) {
            try {
                CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mCameraPosition.ordinal());
                if (cameraCharacteristics != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                    for (int i = 0; i < outputSizes.length - 1; i++) {
                        int i2 = 0;
                        while (i2 < (outputSizes.length - 1) - i) {
                            int i3 = i2 + 1;
                            if (outputSizes[i2].getHeight() * outputSizes[i2].getWidth() < outputSizes[i3].getHeight() * outputSizes[i3].getWidth()) {
                                Size size2 = new Size(outputSizes[i3].getWidth(), outputSizes[i3].getHeight());
                                outputSizes[i3] = new Size(outputSizes[i2].getWidth(), outputSizes[i2].getHeight());
                                outputSizes[i2] = size2;
                            }
                            i2 = i3;
                        }
                    }
                    for (Size size3 : outputSizes) {
                        if (size3.getWidth() * size3.getHeight() <= 2073600) {
                            this.mResolution = size3;
                            return;
                        }
                    }
                }
            } catch (CameraAccessException e) {
                throw new CameraEnhancerException(e.getMessage());
            }
        } else {
            if (resolution == Resolution.RESOLUTION_AUTO) {
                Iterator<Size> it = list.iterator();
                while (it.hasNext()) {
                    size = it.next();
                    if (size.getHeight() * size.getWidth() <= 2073600) {
                    }
                }
                return;
            } else if (resolution == Resolution.RESOLUTION_480P) {
                Iterator<Size> it2 = list.iterator();
                while (it2.hasNext()) {
                    size = it2.next();
                    if (size.getHeight() * size.getWidth() <= 307200) {
                    }
                }
                return;
            } else if (resolution == Resolution.RESOLUTION_720P) {
                Iterator<Size> it3 = list.iterator();
                while (it3.hasNext()) {
                    size = it3.next();
                    if (size.getHeight() * size.getWidth() <= 921600) {
                    }
                }
                return;
            } else if (resolution == Resolution.RESOLUTION_1080P) {
                Iterator<Size> it4 = list.iterator();
                while (it4.hasNext()) {
                    size = it4.next();
                    if (size.getHeight() * size.getWidth() <= 2073600) {
                    }
                }
                return;
            } else if (resolution == Resolution.RESOLUTION_2K) {
                Iterator<Size> it5 = list.iterator();
                while (it5.hasNext()) {
                    size = it5.next();
                    if (size.getHeight() * size.getWidth() <= 4064256) {
                    }
                }
                return;
            } else if (resolution == Resolution.RESOLUTION_4K) {
                Iterator<Size> it6 = list.iterator();
                while (it6.hasNext()) {
                    size = it6.next();
                    if (size.getHeight() * size.getWidth() <= 9000000) {
                    }
                }
                return;
            } else {
                return;
            }
            this.mResolution = size;
        }
    }

    public void setResultPoints(ArrayList<Point> arrayList) {
        Message obtainMessage = this.mUIHandler.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = arrayList;
        this.mUIHandler.sendMessage(obtainMessage);
    }

    public int setSensorControlThreshold(int i) {
        this.mCameraFocusUtil.setSensorThreshold(i);
        return 0;
    }

    public int setTorchDesiredState(TorchState torchState) {
        CaptureRequest.Builder builder;
        CameraState cameraState = this.mCurrentCameraState;
        CameraState cameraState2 = CameraState.CAMERA_STATE_OFF;
        if (cameraState == cameraState2 || this.mDesiredCameraState == cameraState2 || this.mIsPaused || (builder = this.mPreviewRequestBuilder) == null || this.mCaptureSession == null) {
            this.mTorchState = torchState;
            return 0;
        }
        TorchState torchState2 = TorchState.TORCH_STATE_ON;
        if (torchState != torchState2) {
            TorchState torchState3 = TorchState.TORCH_STATE_OFF;
            if (torchState != torchState3) {
                TorchState torchState4 = TorchState.TORCH_STATE_AUTO;
                if (torchState == torchState4) {
                    this.mDesiredTorchState = torchState4;
                }
            } else if (this.mCurrentTorchState == torchState3) {
                return 0;
            } else {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                this.mDesiredTorchState = torchState3;
                try {
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                    this.mCurrentTorchState = torchState3;
                    TorchListener torchListener = this.mTorchListener;
                    if (torchListener != null) {
                        torchListener.onTorchStateChanged(torchState3);
                    }
                } catch (CameraAccessException e) {
                    throw new CameraEnhancerException(e.getMessage());
                }
            }
        } else if (this.mCurrentTorchState == torchState2) {
            return 0;
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
            this.mDesiredTorchState = torchState2;
            try {
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
                this.mCurrentTorchState = torchState2;
                TorchListener torchListener2 = this.mTorchListener;
                if (torchListener2 != null) {
                    torchListener2.onTorchStateChanged(torchState2);
                }
            } catch (CameraAccessException e2) {
                throw new CameraEnhancerException(e2.getMessage());
            }
        }
        return 0;
    }

    public void setZoomFactor(float f) {
        this.mZoomLevel = f;
        if (f > 0.0f && this.mPreviewRequestBuilder != null && this.mCaptureSession != null) {
            Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            double floatValue = (double) (((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() * 10.0f);
            double width = ((double) rect.width()) - ((((double) rect.width()) * 1.0d) / floatValue);
            double d = (double) f;
            int i = (int) ((width / 100.0d) * d);
            int height = (int) (((((double) rect.height()) - ((((double) rect.height()) * 1.0d) / floatValue)) / 100.0d) * d);
            int i2 = i - (i & 3);
            int i3 = height - (height & 3);
            this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
            try {
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
            } catch (CameraAccessException e) {
                throw new CameraEnhancerException(e.getMessage());
            }
        }
    }

    public void setZoomRegion(Rect rect, int i) {
        if (this.mErrorCode == 0 && this.mIfAutoZoom && System.currentTimeMillis() - this.timeOfStartMove > 100) {
            if (rect != null) {
                Rect rect2 = new Rect((int) (((double) this.mCameraView.getWidth()) * 0.3d), (int) (((double) this.mCameraView.getHeight()) * 0.15d), (int) (((double) this.mCameraView.getWidth()) * 0.7d), (int) (((double) this.mCameraView.getHeight()) * 0.85d));
                Rect ConvertFrameRegionToViewRegion = CameraUtil.ConvertFrameRegionToViewRegion(rect, new Rect(0, 0, this.mResolution.getWidth(), this.mResolution.getHeight()), i * 90, new Size(this.mCameraView.getWidth(), this.mCameraView.getHeight()));
                if (rect2.contains(ConvertFrameRegionToViewRegion) || ConvertFrameRegionToViewRegion.contains(rect2) || rect2.intersect(ConvertFrameRegionToViewRegion)) {
                    if (rect2.contains(ConvertFrameRegionToViewRegion)) {
                        this.mZoomState = 1;
                    } else {
                        this.mZoomState = 2;
                    }
                    this.lastIsZoom = true;
                    this.timeToStartZoom = System.currentTimeMillis();
                }
            } else if (this.mIfNeedZoom || this.last_mIfNeedZoom) {
                this.mZoomState = 3;
                this.lastIsZoom = true;
                this.timeToStartZoom = System.currentTimeMillis();
                this.last_mIfNeedZoom = this.mIfNeedZoom;
            }
        }
    }

    public void startScanning() {
        if (this.mIsPaused) {
            this.mIsPaused = false;
            try {
                this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.backgroundHandler);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setCameraDesiredState(CameraState.CAMERA_STATE_ON);
        framelock.lock();
        this.mframeList.clear();
        framelockcondition.signalAll();
        framelock.unlock();
    }

    public void stopScanning() {
        this.mIsPaused = false;
        setCameraDesiredState(CameraState.CAMERA_STATE_OFF);
        framelock.lock();
        this.mframeList.clear();
        framelockcondition.signalAll();
        framelock.unlock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r3 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r3 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int switchCameraPosition(com.dynamsoft.dce.CameraPosition r3) {
        /*
            r2 = this;
            com.dynamsoft.dce.CameraPosition r0 = r2.mCameraPosition
            r1 = 0
            if (r3 != r0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            r2.mIfNeedSwitch = r0
            r2.mCameraPosition = r3
            com.dynamsoft.dce.CameraPosition r0 = com.dynamsoft.dce.CameraPosition.CAMERA_POSITION_WORLD
            if (r3 != r0) goto L_0x0024
            java.lang.String r3 = "1"
            r2.mCameraId = r3
            android.hardware.camera2.CameraDevice r3 = r2.mCameraDevice
            if (r3 == 0) goto L_0x001a
        L_0x0017:
            r3.close()
        L_0x001a:
            com.dynamsoft.dce.CameraState r3 = com.dynamsoft.dce.CameraState.CAMERA_STATE_ON
            r2.mDesiredCameraState = r3
            r2.openCamera()
            r2.mCurrentCameraState = r3
            goto L_0x0031
        L_0x0024:
            com.dynamsoft.dce.CameraPosition r0 = com.dynamsoft.dce.CameraPosition.CAMERA_POSITION_USER
            if (r3 != r0) goto L_0x0031
            java.lang.String r3 = "0"
            r2.mCameraId = r3
            android.hardware.camera2.CameraDevice r3 = r2.mCameraDevice
            if (r3 == 0) goto L_0x001a
            goto L_0x0017
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraEnhancer.switchCameraPosition(com.dynamsoft.dce.CameraPosition):int");
    }

    public void updateAutoFocus() {
        int i;
        CaptureRequest.Key key;
        CaptureRequest.Builder builder;
        if (!this.mIfUseFocalLength) {
            if (!this.mAutoFocusSupported) {
                builder = this.mPreviewRequestBuilder;
                key = CaptureRequest.CONTROL_AF_MODE;
                i = 0;
            } else {
                builder = this.mPreviewRequestBuilder;
                key = CaptureRequest.CONTROL_AF_MODE;
                i = 4;
            }
            builder.set(key, Integer.valueOf(i));
            this.mAFRegions = AutoFocusHelper.getZeroWeightRegion();
            this.mAERegions = AutoFocusHelper.getZeroWeightRegion();
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, this.mAFRegions);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, this.mAERegions);
        }
    }

    public void updateCameraSetting(String str) {
        int loadParamJson = this.mCamAlgorithm.loadParamJson(str);
        if (loadParamJson == -10004) {
            throw new CameraEnhancerException(loadParamJson, "Can not find the file");
        } else if (loadParamJson == -10005) {
            throw new CameraEnhancerException(loadParamJson, "File Format error");
        }
    }

    public void updateCameraSetting(JSONObject jSONObject) {
        int LoadParamJsonString = this.mCamAlgorithm.LoadParamJsonString(jSONObject.toString());
        if (LoadParamJsonString == -10005) {
            throw new CameraEnhancerException(LoadParamJsonString, "File Format error");
        }
    }
}
