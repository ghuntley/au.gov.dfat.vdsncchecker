package com.dynamsoft.dce;

import android.app.Application;
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
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;
import p000a.C0001b;
import p016c0.C0559c;
import p063k.C1142f;
import p099q.C1599h;
import p155j$.util.DesugarTimeZone;

public class CameraLicenseUtil {
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
        C06812 r0 = new X509TrustManager() {
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

    private static CameraUUID generateHardwareUuid(DMDLSConnectionParameters dMDLSConnectionParameters) {
        String hardwareUuID = getHardwareUuID();
        if (hardwareUuID != null) {
            return new CameraUUID(hardwareUuID, true);
        }
        String cacheFilePath = getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, dMDLSConnectionParameters.mainServerURL);
        String path = getApplication().getExternalFilesDir("").getPath();
        StringBuilder a = C1599h.m4503a(cacheFilePath, "/");
        a.append(base64("sd"));
        File file = new File(path, a.toString());
        if (file.exists()) {
            return new CameraUUID(readStringFromFile(file), false);
        }
        String uuid = UUID.randomUUID().toString();
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            saveStringToFile(file, uuid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CameraUUID(readStringFromFile(file), false);
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
        String str3;
        if (!"".equals(str)) {
            str3 = "DCE" + str;
        } else if (!"".equals(str2)) {
            str3 = "DCE" + str2;
        } else {
            str3 = "DCEtrial";
        }
        return base64(str3);
    }

    public static String getCacheFilePath(String str, String str2, String str3) {
        StringBuilder sb;
        String sb2;
        if (!"".equals(str)) {
            sb2 = "DCE" + str + str3;
        } else {
            if (!"".equals(str2)) {
                sb = new StringBuilder();
                sb.append("DCE");
            } else {
                sb = new StringBuilder();
                str2 = "DCEtrial";
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
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraLicenseUtil.getHardwareUuID():java.lang.String");
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
                        throw new CameraEnhancerException(jSONObject2.getInt("errorCode"), jSONObject2.getString("message"));
                    }
                    throw new IOException("Server returned HTTP response code: " + responseCode + ". " + str2);
                }
                throw new IOException(C0131a0.m344a("Server returned HTTP response code: ", responseCode));
            }
        }
        return str2;
    }

    public static CameraUUID getUuid(DMDLSConnectionParameters dMDLSConnectionParameters) {
        if (dMDLSConnectionParameters.uuidGenerationMethod != 1) {
            return generateHardwareUuid(dMDLSConnectionParameters);
        }
        CameraUUID cameraUUID = new CameraUUID((String) null, false);
        String str = getApplication().getExternalFilesDir("").getPath() + "/" + getCacheFilePath(dMDLSConnectionParameters.handshakeCode, dMDLSConnectionParameters.organizationID, dMDLSConnectionParameters.mainServerURL) + "/";
        StringBuilder a = C0001b.m0a(str);
        a.append(base64("sd"));
        File file = new File(a.toString());
        StringBuilder a2 = C0001b.m0a(str);
        a2.append(base64("gd"));
        File file2 = new File(a2.toString());
        if (file.exists()) {
            cameraUUID.deviceId = readStringFromFile(file);
        } else if (file2.exists()) {
            JSONObject jSONObject = new JSONObject(readStringFromFile(file2));
            String hardwareUuID = getHardwareUuID();
            String string = jSONObject.getString("sId");
            String string2 = jSONObject.getString("dId");
            cameraUUID.deviceId = string2;
            if (!string2.equals(generateUuid(hardwareUuID, string))) {
                file2.delete();
                cameraUUID.deviceId = null;
            }
        }
        if (cameraUUID.deviceId == null) {
            String hardwareUuID2 = getHardwareUuID();
            String uuid = UUID.randomUUID().toString();
            String generateUuid = generateUuid(hardwareUuID2, uuid);
            cameraUUID.deviceId = generateUuid;
            if (uuid.equals(generateUuid)) {
                file.createNewFile();
                saveStringToFile(file, cameraUUID.deviceId);
            } else {
                file2.createNewFile();
                saveStringToFile(file2, "{\"sId\":\"" + uuid + "\",\"dId\":\"" + cameraUUID.deviceId + "\"}");
            }
        }
        return cameraUUID;
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
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraLicenseUtil.saveStringToFile(java.io.File, java.lang.String):void");
    }

    public static void sendUsage(String str, String str2, JSONObject jSONObject, DMDLSConnectionParameters dMDLSConnectionParameters) {
        if (str != null) {
            try {
                if ("".equals(str2) || str2 == null) {
                    str2 = "https://mlts.dynamsoft.com";
                }
                byte[] bytes = str.getBytes();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2 + "/verify").openConnection();
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
                    String str3 = "";
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str3 = str3 + readLine;
                    }
                    if (!"".equals(str3)) {
                        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(new JSONObject(str3).getString("handshakeUpdateTime"));
                        String cacheFilePath = getCacheFilePath(jSONObject.getString("hs"), jSONObject.getString("og"), str2);
                        String cacheFilePath2 = getCacheFilePath(jSONObject.getString("hs"), jSONObject.getString("og"));
                        new JSONObject(readStringFromFile(new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath + "/" + cacheFilePath2)));
                        File file = new File(getApplication().getExternalFilesDir("").getPath(), cacheFilePath + "/cr");
                        if (!file.exists()) {
                            file.createNewFile();
                        } else {
                            saveStringToFile(file, "");
                        }
                    }
                } else {
                    throw new IOException("Server returned HTTP response code: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
