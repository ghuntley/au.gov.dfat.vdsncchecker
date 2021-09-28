package com.dynamsoft.dbr;

import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.widget.C0131a0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0001b;
import p016c0.C0559c;
import p063k.C1142f;
import p099q.C1599h;
import p155j$.util.DesugarTimeZone;

public class BarcodeLicenseUtil {
    private static final HostnameVerifier HOSTNAME_VERIFIER = new HostnameVerifier() {
        public boolean verify(String str, SSLSession sSLSession) {
            if (!str.contains("dynamsoft") && !str.contains("192")) {
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
            return true;
        }
    };
    private static X509TrustManager dbrTrustManager;
    private static X509TrustManager[] dbrTrustMangers;

    static {
        C06572 r0 = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                if (x509CertificateArr == null) {
                    throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
                } else if (x509CertificateArr.length <= 0) {
                    throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
                } else if (str == null || !str.contains("RSA")) {
                    throw new CertificateException("checkServerTrusted: AuthType is not RSA");
                }
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        dbrTrustManager = r0;
        dbrTrustMangers = new X509TrustManager[]{r0};
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001c A[SYNTHETIC, Splitter:B:16:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0027 A[SYNTHETIC, Splitter:B:21:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void appendStringToFile(java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0016 }
            r2 = 1
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x0016 }
            r1.write(r4)     // Catch:{ IOException -> 0x0011, all -> 0x000e }
            r1.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x000e:
            r3 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0011:
            r3 = move-exception
            r0 = r1
            goto L_0x0017
        L_0x0014:
            r3 = move-exception
            goto L_0x0025
        L_0x0016:
            r3 = move-exception
        L_0x0017:
            r3.printStackTrace()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0024:
            return
        L_0x0025:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r4 = move-exception
            r4.printStackTrace()
        L_0x002f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeLicenseUtil.appendStringToFile(java.io.File, java.lang.String):void");
    }

    public static String base64(String str) {
        return base64(str.getBytes());
    }

    public static String base64(byte[] bArr) {
        return Base64.encodeToString(bArr, 0).replace("\r", "").replace("\n", "");
    }

    public static String checkLastTime(String str, String str2, String str3) {
        File file = new File(getApplication().getExternalFilesDir("").getPath(), C1142f.m3365a(getCacheFilePath(str, str2, str3), "/lu"));
        String str4 = file.exists() ? new String(Base64.decode(readStringFromFile(file), 0)) : null;
        saveStringToFile(file, base64(getCurrentDataString()));
        return str4;
    }

    private static DBRUUID generateHardwareUuid(DMDLSConnectionParameters dMDLSConnectionParameters) {
        String hardwareUuID = getHardwareUuID();
        if (hardwareUuID != null) {
            return new DBRUUID(hardwareUuID, true);
        }
        String cacheFilePath = getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, dMDLSConnectionParameters.mainServerURL);
        String path = getApplication().getExternalFilesDir("").getPath();
        StringBuilder a = C1599h.m4503a(cacheFilePath, "/");
        a.append(base64("sd"));
        File file = new File(path, a.toString());
        if (file.exists()) {
            return new DBRUUID(readStringFromFile(file), false);
        }
        String uuid = UUID.randomUUID().toString();
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            saveStringToFile(file, uuid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DBRUUID(readStringFromFile(file), false);
    }

    private static DBRUUID generateHardwareUuid(DMLTSConnectionParameters dMLTSConnectionParameters) {
        String hardwareUuID = getHardwareUuID();
        if (hardwareUuID != null) {
            return new DBRUUID(hardwareUuID, true);
        }
        String cacheFilePath = getCacheFilePath(dMLTSConnectionParameters.handshakeCode, dMLTSConnectionParameters.organizationID, dMLTSConnectionParameters.mainServerURL);
        String path = getApplication().getExternalFilesDir("").getPath();
        StringBuilder a = C1599h.m4503a(cacheFilePath, "/");
        a.append(base64("sd"));
        File file = new File(path, a.toString());
        if (file.exists()) {
            return new DBRUUID(readStringFromFile(file), false);
        }
        String uuid = UUID.randomUUID().toString();
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            saveStringToFile(file, uuid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DBRUUID(readStringFromFile(file), false);
    }

    public static String generateUuid(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2.getBytes();
        System.arraycopy(bytes2, 9, bytes, 9, 4);
        System.arraycopy(bytes2, 24, bytes, 24, 12);
        return new String(bytes);
    }

    public static Application getApplication() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, (Object[]) null);
            declaredField.setAccessible(true);
            return (Application) declaredField.get(invoke);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return null;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static String getCacheFilePath(String str, String str2) {
        if ("".equals(str)) {
            if (!"".equals(str2)) {
                return base64(str2);
            }
            str = "trial";
        }
        return base64(str);
    }

    public static String getCacheFilePath(String str, String str2, String str3) {
        StringBuilder sb;
        String sb2;
        if (!"".equals(str)) {
            sb2 = str + str3;
        } else {
            if (!"".equals(str2)) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
                str2 = "trial";
            }
            sb.append(str2);
            sb.append(str3);
            sb2 = sb.toString();
        }
        return base64(sb2);
    }

    public static String getCurrentDataString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getHardwareUuID() {
        /*
            java.lang.String r0 = android.os.Build.SERIAL
            r1 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = "UNKNOWN"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x001c
            java.lang.String r2 = "utf8"
            byte[] r0 = r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0018 }
            java.util.UUID r0 = java.util.UUID.nameUUIDFromBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 != 0) goto L_0x003d
            android.app.Application r2 = getApplication()
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r3)
            java.lang.String r3 = "9774d56d682e549c"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x003d
            byte[] r0 = r2.getBytes()
            java.util.UUID r0 = java.util.UUID.nameUUIDFromBytes(r0)
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = r0.toString()
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeLicenseUtil.getHardwareUuID():java.lang.String");
    }

    public static JSONObject getLicense(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        byte[] bytes = jSONObject.toString().getBytes();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
        httpURLConnection.setRequestProperty("action", "NETWORK_POST_JSON");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String str2 = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return new JSONObject(str2);
                }
                str2 = C1142f.m3365a(str2, readLine);
            }
        } else {
            throw new IOException(C0131a0.m344a("Server returned HTTP response code: ", responseCode));
        }
    }

    public static String getLicenseEx(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C0559c.m1823a(str, "/auth/?ext=", URLEncoder.encode(base64(jSONObject.toString())))).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            httpURLConnection.setConnectTimeout(15000);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = C1142f.m3365a(str2, readLine);
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream != null) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream));
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        str2 = C1142f.m3365a(str2, readLine2);
                    }
                    JSONObject jSONObject2 = new JSONObject(str2);
                    if (jSONObject2.has("message")) {
                        throw new BarcodeReaderException(jSONObject2.getInt("errorCode"), jSONObject2.getString("message"));
                    }
                    throw new IOException("Server returned HTTP response code: " + responseCode + ". " + str2);
                }
                throw new IOException(C0131a0.m344a("Server returned HTTP response code: ", responseCode));
            }
        }
        return str2;
    }

    public static DBRUUID getUuid(DMDLSConnectionParameters dMDLSConnectionParameters) {
        if (dMDLSConnectionParameters.uuidGenerationMethod != 1) {
            return generateHardwareUuid(dMDLSConnectionParameters);
        }
        DBRUUID dbruuid = new DBRUUID((String) null, false);
        String cacheFilePath = getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, dMDLSConnectionParameters.mainServerURL);
        String str = getApplication().getExternalFilesDir("").getPath() + "/" + cacheFilePath + "/";
        File file = new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder a = C0001b.m0a(str);
        a.append(base64("sd"));
        File file2 = new File(a.toString());
        StringBuilder a2 = C0001b.m0a(str);
        a2.append(base64("gd"));
        File file3 = new File(a2.toString());
        if (file2.exists()) {
            dbruuid.deviceId = readStringFromFile(file2);
        } else if (file3.exists()) {
            JSONObject jSONObject = new JSONObject(readStringFromFile(file3));
            String hardwareUuID = getHardwareUuID();
            String string = jSONObject.getString("sId");
            String string2 = jSONObject.getString("dId");
            dbruuid.deviceId = string2;
            if (!string2.equals(generateUuid(hardwareUuID, string))) {
                file3.delete();
                dbruuid.deviceId = null;
            }
        }
        if (dbruuid.deviceId == null) {
            String hardwareUuID2 = getHardwareUuID();
            String uuid = UUID.randomUUID().toString();
            String generateUuid = generateUuid(hardwareUuID2, uuid);
            dbruuid.deviceId = generateUuid;
            if (uuid.equals(generateUuid)) {
                file2.createNewFile();
                saveStringToFile(file2, dbruuid.deviceId);
            } else {
                file3.createNewFile();
                saveStringToFile(file3, "{\"sId\":\"" + uuid + "\",\"dId\":\"" + dbruuid.deviceId + "\"}");
            }
        }
        return dbruuid;
    }

    public static DBRUUID getUuid(DMLTSConnectionParameters dMLTSConnectionParameters) {
        if (dMLTSConnectionParameters.uuidGenerationMethod != 1) {
            return generateHardwareUuid(dMLTSConnectionParameters);
        }
        DBRUUID dbruuid = new DBRUUID((String) null, false);
        String cacheFilePath = getCacheFilePath(dMLTSConnectionParameters.handshakeCode, dMLTSConnectionParameters.organizationID, dMLTSConnectionParameters.mainServerURL);
        String str = getApplication().getExternalFilesDir("").getPath() + "/" + cacheFilePath + "/";
        File file = new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder a = C0001b.m0a(str);
        a.append(base64("sd"));
        File file2 = new File(a.toString());
        StringBuilder a2 = C0001b.m0a(str);
        a2.append(base64("gd"));
        File file3 = new File(a2.toString());
        if (file2.exists()) {
            dbruuid.deviceId = readStringFromFile(file2);
        } else if (file3.exists()) {
            JSONObject jSONObject = new JSONObject(readStringFromFile(file3));
            String hardwareUuID = getHardwareUuID();
            String string = jSONObject.getString("sId");
            String string2 = jSONObject.getString("dId");
            dbruuid.deviceId = string2;
            if (!string2.equals(generateUuid(hardwareUuID, string))) {
                file3.delete();
                dbruuid.deviceId = null;
            }
        }
        if (dbruuid.deviceId == null) {
            String hardwareUuID2 = getHardwareUuID();
            String uuid = UUID.randomUUID().toString();
            String generateUuid = generateUuid(hardwareUuID2, uuid);
            dbruuid.deviceId = generateUuid;
            if (uuid.equals(generateUuid)) {
                file2.createNewFile();
                saveStringToFile(file2, dbruuid.deviceId);
            } else {
                file3.createNewFile();
                saveStringToFile(file3, "{\"sId\":\"" + uuid + "\",\"dId\":\"" + dbruuid.deviceId + "\"}");
            }
        }
        return dbruuid;
    }

    public static boolean isEmulator() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.toLowerCase().contains("vbox")) {
            String str2 = Build.MODEL;
            return str2.contains("google_sdk") || str2.contains("Emulator") || Build.SERIAL.equalsIgnoreCase("android") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT) || ((TelephonyManager) getApplication().getSystemService("phone")).getNetworkOperatorName().toLowerCase().equals("android");
        }
    }

    public static String readStringFromFile(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return new String(bArr);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[SYNTHETIC, Splitter:B:16:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC, Splitter:B:21:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveStringToFile(java.io.File r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0018 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0018 }
            r1.flush()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.write(r3)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0026
        L_0x0010:
            r2 = move-exception
            r0 = r1
            goto L_0x0027
        L_0x0013:
            r2 = move-exception
            r0 = r1
            goto L_0x0019
        L_0x0016:
            r2 = move-exception
            goto L_0x0027
        L_0x0018:
            r2 = move-exception
        L_0x0019:
            r2.printStackTrace()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0026:
            return
        L_0x0027:
            if (r0 == 0) goto L_0x0031
            r0.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0031:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeLicenseUtil.saveStringToFile(java.io.File, java.lang.String):void");
    }

    public static void sendUsage(String str, String str2, JSONObject jSONObject, DMLTSConnectionParameters dMLTSConnectionParameters, BarcodeReader barcodeReader) {
        if (str != null) {
            try {
                if ("".equals(str2) || str2 == null) {
                    str2 = "https://mlts.dynamsoft.com";
                }
                byte[] bytes = str.getBytes();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2 + "/verify").openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("POST");
                boolean z = true;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                httpURLConnection.setRequestProperty("action", "NETWORK_POST_JSON");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    String str3 = "";
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str3 = str3 + readLine;
                    }
                    if (!"".equals(str3)) {
                        String string = new JSONObject(str3).getString("handshakeUpdateTime");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                        Date parse = simpleDateFormat.parse(string);
                        String cacheFilePath = getCacheFilePath(jSONObject.getString("hs"), jSONObject.getString("og"), str2);
                        String cacheFilePath2 = getCacheFilePath(jSONObject.getString("hs"), jSONObject.getString("og"));
                        File file = new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath + "/" + cacheFilePath2);
                        JSONObject jSONObject2 = new JSONObject(readStringFromFile(file));
                        File file2 = new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath + "/cr");
                        if (!file2.exists()) {
                            file2.createNewFile();
                        } else {
                            saveStringToFile(file2, "");
                        }
                        boolean z2 = false;
                        if (jSONObject2.has("hsut")) {
                            if (parse.after(simpleDateFormat.parse(jSONObject2.getString("hsut")))) {
                                jSONObject2.put("needAuth", true);
                                BarcodeReader.nativeRemoveLTSLicense();
                            } else {
                                jSONObject2.put("needAuth", false);
                                z = false;
                            }
                            z2 = z;
                        } else {
                            jSONObject2.put("hsut", getCurrentDataString());
                        }
                        saveStringToFile(file, jSONObject2.toString());
                        if (z2) {
                            barcodeReader.initLicenseFromLTS(dMLTSConnectionParameters, (DBRLTSLicenseVerificationListener) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IOException("Server returned HTTP response code: " + responseCode);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String sha2Encode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("sha-256").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String DLSUploadSend(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "jasdja200"
            r1 = -1
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x00a9 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00a9 }
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ Exception -> 0x00a9 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00a9 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "POST"
            r5.setRequestMethod(r2)     // Catch:{ Exception -> 0x00a9 }
            r2 = 1
            r5.setDoOutput(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "Content-Length"
            int r3 = r6.length     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00a9 }
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "action"
            java.lang.String r3 = "NETWORK_POST_JSON"
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch:{ Exception -> 0x00a9 }
            r2.write(r6)     // Catch:{ Exception -> 0x00a9 }
            r2.flush()     // Catch:{ Exception -> 0x00a9 }
            r2.close()     // Catch:{ Exception -> 0x00a9 }
            int r6 = r5.getResponseCode()     // Catch:{ Exception -> 0x00a9 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto L_0x0071
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x005b:
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r3.<init>()     // Catch:{ Exception -> 0x00a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r3.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005b
        L_0x0071:
            java.io.InputStream r5 = r5.getErrorStream()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x0081:
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r3.<init>()     // Catch:{ Exception -> 0x00a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r3.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0081
        L_0x0097:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r5.<init>()     // Catch:{ Exception -> 0x00a7 }
            r5.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00b5
        L_0x00a7:
            r5 = move-exception
            goto L_0x00ab
        L_0x00a9:
            r5 = move-exception
            r6 = r1
        L_0x00ab:
            if (r6 != r1) goto L_0x00b0
            java.lang.String r6 = "404"
            goto L_0x00b1
        L_0x00b0:
            r6 = r0
        L_0x00b1:
            r5.printStackTrace()
            r5 = r6
        L_0x00b5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeLicenseUtil.DLSUploadSend(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String LTSUploadSend(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "jasdja200"
            r1 = -1
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x00a9 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00a9 }
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ Exception -> 0x00a9 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00a9 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "POST"
            r5.setRequestMethod(r2)     // Catch:{ Exception -> 0x00a9 }
            r2 = 1
            r5.setDoOutput(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "Content-Length"
            int r3 = r6.length     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00a9 }
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = "action"
            java.lang.String r3 = "NETWORK_POST_JSON"
            r5.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch:{ Exception -> 0x00a9 }
            r2.write(r6)     // Catch:{ Exception -> 0x00a9 }
            r2.flush()     // Catch:{ Exception -> 0x00a9 }
            r2.close()     // Catch:{ Exception -> 0x00a9 }
            int r6 = r5.getResponseCode()     // Catch:{ Exception -> 0x00a9 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto L_0x0071
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x005b:
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r3.<init>()     // Catch:{ Exception -> 0x00a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r3.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005b
        L_0x0071:
            java.io.InputStream r5 = r5.getErrorStream()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00a7 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a7 }
        L_0x0081:
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00a7 }
            if (r5 == 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r3.<init>()     // Catch:{ Exception -> 0x00a7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r3.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0081
        L_0x0097:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r5.<init>()     // Catch:{ Exception -> 0x00a7 }
            r5.append(r0)     // Catch:{ Exception -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00b5
        L_0x00a7:
            r5 = move-exception
            goto L_0x00ab
        L_0x00a9:
            r5 = move-exception
            r6 = r1
        L_0x00ab:
            if (r6 != r1) goto L_0x00b0
            java.lang.String r6 = "404"
            goto L_0x00b1
        L_0x00b0:
            r6 = r0
        L_0x00b1:
            r5.printStackTrace()
            r5 = r6
        L_0x00b5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dbr.BarcodeLicenseUtil.LTSUploadSend(java.lang.String, java.lang.String):java.lang.String");
    }

    public String getDLSAuthSend(String str) {
        String str2;
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str3 = str3 + readLine;
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream != null) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream));
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        str3 = str3 + readLine2;
                    }
                }
            }
            str2 = str3 + responseCode;
        } catch (Exception e) {
            try {
                jSONObject.put("errorCode", 200);
                jSONObject.put("message", e.getMessage());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            str2 = str3;
        }
        if (!str2.isEmpty()) {
            return str2;
        }
        return jSONObject.toString() + "404";
    }

    public String getLTSAuthSend(String str) {
        String str2;
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str3 = str3 + readLine;
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream != null) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream));
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        str3 = str3 + readLine2;
                    }
                }
            }
            str2 = str3 + responseCode;
        } catch (Exception e) {
            try {
                jSONObject.put("errorCode", 200);
                jSONObject.put("message", e.getMessage());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            str2 = str3;
        }
        if (!str2.isEmpty()) {
            return str2;
        }
        return jSONObject.toString() + "404";
    }
}
