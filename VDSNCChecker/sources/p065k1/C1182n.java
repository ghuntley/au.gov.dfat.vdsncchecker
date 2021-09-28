package p065k1;

import com.dynamsoft.dbr.TextResult;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;

/* renamed from: k1.n */
public final /* synthetic */ class C1182n implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ScanActivity f4065e;

    /* renamed from: f */
    public final /* synthetic */ TextResult[] f4066f;

    public /* synthetic */ C1182n(ScanActivity scanActivity, TextResult[] textResultArr) {
        this.f4065e = scanActivity;
        this.f4066f = textResultArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0394 A[SYNTHETIC, Splitter:B:126:0x0394] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x051e A[Catch:{ Exception -> 0x0546 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            au.gov.dfat.vdsncchecker.ui.ScanActivity r2 = r1.f4065e
            com.dynamsoft.dbr.TextResult[] r0 = r1.f4066f
            int r3 = p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity.f2246H
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            java.lang.String r10 = "params"
            java.lang.String r11 = "msg"
            java.lang.String r12 = "tag"
            java.lang.String r13 = "LogTagForVDS"
            java.lang.String r4 = "this$0"
            p072l2.C1241e.m3517j(r2, r4)
            boolean r4 = r2.f2250D
            if (r4 == 0) goto L_0x075d
            if (r0 == 0) goto L_0x075d
            int r4 = r0.length
            r14 = 0
            r15 = 1
            if (r4 != 0) goto L_0x0024
            r4 = r15
            goto L_0x0025
        L_0x0024:
            r4 = r14
        L_0x0025:
            r4 = r4 ^ r15
            if (r4 == 0) goto L_0x075d
            java.lang.String r9 = "context"
            p072l2.C1241e.m3517j(r2, r9)
            r0 = r0[r14]
            java.lang.String r0 = r0.barcodeText
            java.lang.String r4 = "textResults[0].barcodeText"
            p072l2.C1241e.m3516f(r0, r4)
            java.lang.String r4 = "jsonString"
            p072l2.C1241e.m3517j(r0, r4)
            r16 = 0
            t3.a$a r4 = p121t3.C1799a.f5447d     // Catch:{ Exception -> 0x0056 }
            au.gov.dfat.vdsncchecker.vds.VDS$b r5 = p007au.gov.dfat.vdsncchecker.vds.VDS.Companion     // Catch:{ Exception -> 0x0056 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ Exception -> 0x0056 }
            au.gov.dfat.vdsncchecker.vds.VDS$a r5 = p007au.gov.dfat.vdsncchecker.vds.VDS.C0500a.f2274a     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.mo6084a(r5, r0)     // Catch:{ Exception -> 0x0056 }
            r5 = r4
            au.gov.dfat.vdsncchecker.vds.VDS r5 = (p007au.gov.dfat.vdsncchecker.vds.VDS) r5     // Catch:{ Exception -> 0x0056 }
            r5.setOriginalJson(r0)     // Catch:{ Exception -> 0x0056 }
            au.gov.dfat.vdsncchecker.vds.VDS r4 = (p007au.gov.dfat.vdsncchecker.vds.VDS) r4     // Catch:{ Exception -> 0x0056 }
            r18 = r9
            r9 = r4
            goto L_0x007e
        L_0x0056:
            r0 = move-exception
            java.lang.String r8 = "[VDS] Error decoding VDS from JSON string %1$s"
            java.lang.Object[] r7 = new java.lang.Object[r15]
            r7[r14] = r0
            r4 = r13
            r5 = r12
            r6 = r8
            r0 = r7
            r7 = r11
            r17 = r8
            r8 = r0
            r18 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            boolean r4 = r0 instanceof java.lang.Throwable
            if (r4 == 0) goto L_0x0073
            r7 = r0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            goto L_0x007c
        L_0x0073:
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r14] = r0
            r0 = r17
            p136w0.C2035q.m5362a(r4, r15, r0, r3)
        L_0x007c:
            r9 = r16
        L_0x007e:
            if (r9 != 0) goto L_0x0097
            android.widget.TextView r0 = r2.f2247A
            if (r0 == 0) goto L_0x0091
            r0.setVisibility(r14)
            k1.q r0 = new k1.q
            r0.<init>(r2)
            r0.start()
            goto L_0x075d
        L_0x0091:
            java.lang.String r0 = "invalidCode"
            p072l2.C1241e.m3524r(r0)
            throw r16
        L_0x0097:
            int r0 = r2.mo2466b()
            if (r0 != r15) goto L_0x009f
            r0 = r15
            goto L_0x00a0
        L_0x009f:
            r0 = r14
        L_0x00a0:
            if (r0 != 0) goto L_0x0750
            java.lang.String r8 = "$this$asList"
            java.lang.String r0 = "vds"
            p072l2.C1241e.m3517j(r9, r0)
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ Exception -> 0x00b1 }
            r7 = r0
            goto L_0x00b3
        L_0x00b1:
            r7 = r16
        L_0x00b3:
            if (r7 != 0) goto L_0x00d1
            java.lang.String r0 = "[VDS] Failed to create X.509 certificate factory"
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r11 = r8
            r12 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r14] = r11
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r15)
            java.lang.String r0 = java.lang.String.format(r0, r4)
            goto L_0x0129
        L_0x00d1:
            r0 = 8
            au.gov.dfat.vdsncchecker.vds.VDSSig r4 = r9.getSig()     // Catch:{ Exception -> 0x00df }
            java.lang.String r4 = r4.getCer()     // Catch:{ Exception -> 0x00df }
            byte[] r16 = android.util.Base64.decode(r4, r0)     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            r6 = r16
            if (r6 != 0) goto L_0x00fe
            java.lang.String r0 = "[VDS] Failed to parse BSC sec cert data"
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r11 = r8
            r12 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r14] = r11
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r15)
            java.lang.String r0 = java.lang.String.format(r0, r4)
            goto L_0x0129
        L_0x00fe:
            au.gov.dfat.vdsncchecker.vds.VDSSig r4 = r9.getSig()     // Catch:{ Exception -> 0x010b }
            java.lang.String r4 = r4.getSigvl()     // Catch:{ Exception -> 0x010b }
            byte[] r0 = android.util.Base64.decode(r4, r0)     // Catch:{ Exception -> 0x010b }
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            r5 = r0
            if (r5 != 0) goto L_0x0130
            java.lang.String r0 = "[VDS] Failed to parse VDS signature"
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r11 = r8
            r12 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r14] = r11
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r15)
            java.lang.String r0 = java.lang.String.format(r0, r4)
        L_0x0129:
            p072l2.C1241e.m3516f(r0, r3)
            r19 = r12
            goto L_0x042f
        L_0x0130:
            r14 = r9
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015b }
            java.lang.String r4 = r14.getOriginalJson()     // Catch:{ Exception -> 0x015b }
            r0.<init>(r4)     // Catch:{ Exception -> 0x015b }
            java.lang.String r4 = "data"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x015b }
            t4.a r4 = new t4.a     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015b }
            r4.<init>(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.StringBuilder r0 = r4.f5468a     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015b }
            r4 = 0
            r17 = r5
            r1 = r6
            r20 = r8
            r19 = r14
            r9 = r15
            r15 = r4
            r14 = r7
            goto L_0x018d
        L_0x015b:
            r0 = move-exception
            java.lang.String r9 = "[VDS] Error encoding VDS to JSON string %1$s"
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r16 = 0
            r15[r16] = r0
            r4 = r13
            r1 = r5
            r5 = r12
            r17 = r1
            r1 = r6
            r6 = r9
            r19 = r14
            r14 = r7
            r7 = r11
            r20 = r8
            r8 = r15
            r0 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            boolean r4 = r15 instanceof java.lang.Throwable
            if (r4 == 0) goto L_0x0180
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            r0 = 1
            r15 = r0
            goto L_0x0189
        L_0x0180:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r16] = r15
            p136w0.C2035q.m5362a(r5, r4, r0, r3)
            r15 = r4
        L_0x0189:
            r0 = 0
            r9 = r15
            r15 = r16
        L_0x018d:
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = "[VDS] Failed to get canonical JSON from VDS"
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r1
            r11 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            r4[r15] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r11)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x01ab:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x01bb }
            r4.<init>(r1)     // Catch:{ Exception -> 0x01bb }
            java.security.cert.Certificate r1 = r14.generateCertificate(r4)     // Catch:{ Exception -> 0x01bb }
            boolean r4 = r1 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x01bb }
            if (r4 == 0) goto L_0x01bb
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch:{ Exception -> 0x01bb }
            goto L_0x01bc
        L_0x01bb:
            r1 = 0
        L_0x01bc:
            if (r1 != 0) goto L_0x01db
            java.lang.String r0 = "[VDS] Failed to create BSC cert from BSC cert data"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x01db:
            r15 = 0
            r9 = 1
            java.security.PublicKey r4 = r1.getPublicKey()
            if (r4 != 0) goto L_0x01ff
            java.lang.String r0 = "[VDS] Failed to get BSC public key spec from BSC cert"
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r1
            r11 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            r4[r15] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r11)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x01ff:
            android.content.res.AssetManager r4 = r2.getAssets()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r5 = "certificates/CSCA_AUS.der"
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x0213 }
            java.lang.String r5 = "context.assets.open(Constants.Assets.Certificates.CSCA_AUS)"
            p072l2.C1241e.m3516f(r4, r5)     // Catch:{ Exception -> 0x0213 }
            byte[] r4 = p042g2.C0955a.m2752z(r4)     // Catch:{ Exception -> 0x0213 }
            goto L_0x0214
        L_0x0213:
            r4 = 0
        L_0x0214:
            if (r4 != 0) goto L_0x0232
            java.lang.String r0 = "[VDS] Failed to load CSCA cert data from resources"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x0232:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0242 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0242 }
            java.security.cert.Certificate r5 = r14.generateCertificate(r5)     // Catch:{ Exception -> 0x0242 }
            boolean r6 = r5 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x0242 }
            if (r6 == 0) goto L_0x0242
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ Exception -> 0x0242 }
            goto L_0x0243
        L_0x0242:
            r5 = 0
        L_0x0243:
            r15 = r5
            if (r15 != 0) goto L_0x0266
            java.lang.String r0 = "[VDS] Failed to create CSCA cert from CSCA cert data"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0261:
            p072l2.C1241e.m3516f(r0, r3)
            goto L_0x042e
        L_0x0266:
            java.lang.String r5 = "SHA-256"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x02a6 }
            byte[] r4 = r5.digest(r4)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r5 = "getInstance(\"SHA-256\")\n                .digest(cscaCertData)"
            p072l2.C1241e.m3516f(r4, r5)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r5 = ""
            int r6 = r4.length     // Catch:{ Exception -> 0x02a6 }
            r7 = 0
        L_0x0279:
            if (r7 >= r6) goto L_0x02a7
            byte r8 = r4[r7]     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r9 = "%02x"
            r16 = r4
            r4 = 1
            r21 = r6
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02a6 }
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)     // Catch:{ Exception -> 0x02a6 }
            r22 = 0
            r6[r22] = r8     // Catch:{ Exception -> 0x02a6 }
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r6, r4)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r4 = java.lang.String.format(r9, r4)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r6 = "java.lang.String.format(this, *args)"
            p072l2.C1241e.m3516f(r4, r6)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r5 = p072l2.C1241e.m3522p(r5, r4)     // Catch:{ Exception -> 0x02a6 }
            int r7 = r7 + 1
            r4 = r16
            r6 = r21
            goto L_0x0279
        L_0x02a6:
            r5 = 0
        L_0x02a7:
            java.lang.String r4 = "35623a89f6b40cb4888e05147f7d16d27f7bf754aad563c37fef6e1a0e7ff5cf"
            boolean r4 = p072l2.C1241e.m3513b(r5, r4)
            if (r4 != 0) goto L_0x02cb
            java.lang.String r0 = "[VDS] CSCA cert SHA256 hash does not match trusted hash"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x02cb:
            r4 = r18
            p072l2.C1241e.m3517j(r2, r4)
            p072l2.C1241e.m3517j(r2, r4)
            android.content.SharedPreferences r4 = p136w0.C2036r.m5367e(r2)
            java.lang.String r5 = "PREF_CRL_DATA"
            r6 = 0
            java.lang.String r4 = r4.getString(r5, r6)
            if (r4 == 0) goto L_0x02e7
            r5 = 8
            byte[] r4 = android.util.Base64.decode(r4, r5)
            goto L_0x02e8
        L_0x02e7:
            r4 = 0
        L_0x02e8:
            r16 = r4
            java.lang.String r4 = "CRLHelper"
            if (r16 == 0) goto L_0x030e
            java.lang.String r9 = "Using downloaded CRL data"
            r8 = 0
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r5 = r12
            r6 = r9
            r18 = r7
            r7 = r11
            r21 = r8
            r8 = r18
            r22 = r0
            r0 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r21] = r18
            p136w0.C2035q.m5362a(r5, r4, r0, r3)
        L_0x030b:
            r0 = r16
            goto L_0x0345
        L_0x030e:
            r22 = r0
            r0 = 0
            r9 = 1
            java.lang.String r8 = "Using pre-bundled CRL data"
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r5 = r12
            r6 = r8
            r16 = r7
            r7 = r11
            r23 = r8
            r8 = r16
            r0 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r5 = 0
            r4[r5] = r16
            r5 = r23
            p136w0.C2035q.m5362a(r4, r0, r5, r3)
            android.content.res.AssetManager r0 = r2.getAssets()     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = "crls/CRL_AUS.crl"
            java.io.InputStream r0 = r0.open(r4)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = "context.assets.open(Constants.Assets.CertificateRevocationLists.CRL_AUS)"
            p072l2.C1241e.m3516f(r0, r4)     // Catch:{ Exception -> 0x0342 }
            byte[] r16 = p042g2.C0955a.m2752z(r0)     // Catch:{ Exception -> 0x0342 }
            goto L_0x030b
        L_0x0342:
            r16 = 0
            goto L_0x030b
        L_0x0345:
            if (r0 != 0) goto L_0x0364
            java.lang.String r0 = "[VDS] Failed to load CRL data from resources"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x0364:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0374 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0374 }
            java.security.cert.CRL r0 = r14.generateCRL(r4)     // Catch:{ Exception -> 0x0374 }
            boolean r4 = r0 instanceof java.security.cert.X509CRL     // Catch:{ Exception -> 0x0374 }
            if (r4 == 0) goto L_0x0374
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0     // Catch:{ Exception -> 0x0374 }
            goto L_0x0375
        L_0x0374:
            r0 = 0
        L_0x0375:
            if (r0 != 0) goto L_0x0394
            java.lang.String r0 = "[VDS] Failed to create CRL from CRL data"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x0394:
            java.security.PublicKey r4 = r15.getPublicKey()     // Catch:{ Exception -> 0x059e }
            r0.verify(r4)     // Catch:{ Exception -> 0x059e }
            boolean r0 = r0.isRevoked(r1)
            if (r0 == 0) goto L_0x03be
            java.lang.String r0 = "[VDS] BSC cert is revoked in CRL"
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r14
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r14
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0261
        L_0x03be:
            l4.o r0 = p098p4.C1584b.f4914e
            java.lang.String r0 = r0.f4416e
            byte[] r4 = r1.getExtensionValue(r0)     // Catch:{ Exception -> 0x0586 }
            l4.p r4 = p074l4.C1384p.m3959q(r4)     // Catch:{ Exception -> 0x0586 }
            byte[] r4 = r4.f4424e     // Catch:{ Exception -> 0x0586 }
            p4.a r4 = p098p4.C1583a.m4428i(r4)     // Catch:{ Exception -> 0x0586 }
            l4.p r4 = r4.f4911e     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x03d7
            byte[] r4 = r4.f4424e     // Catch:{ Exception -> 0x0586 }
            goto L_0x03d8
        L_0x03d7:
            r4 = 0
        L_0x03d8:
            java.lang.String r5 = "bscAKI.keyIdentifier"
            p072l2.C1241e.m3516f(r4, r5)     // Catch:{ Exception -> 0x0586 }
            r5 = r20
            p072l2.C1241e.m3517j(r4, r5)     // Catch:{ Exception -> 0x0586 }
            u2.e r6 = new u2.e     // Catch:{ Exception -> 0x0586 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0586 }
            byte[] r0 = r15.getExtensionValue(r0)     // Catch:{ Exception -> 0x0586 }
            l4.p r0 = p074l4.C1384p.m3959q(r0)     // Catch:{ Exception -> 0x0586 }
            byte[] r0 = r0.f4424e     // Catch:{ Exception -> 0x0586 }
            p4.a r0 = p098p4.C1583a.m4428i(r0)     // Catch:{ Exception -> 0x0586 }
            l4.p r0 = r0.f4911e     // Catch:{ Exception -> 0x0586 }
            if (r0 == 0) goto L_0x03fc
            byte[] r0 = r0.f4424e     // Catch:{ Exception -> 0x0586 }
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            java.lang.String r4 = "cscaAKI.keyIdentifier"
            p072l2.C1241e.m3516f(r0, r4)     // Catch:{ Exception -> 0x0586 }
            p072l2.C1241e.m3517j(r0, r5)     // Catch:{ Exception -> 0x0586 }
            u2.e r4 = new u2.e     // Catch:{ Exception -> 0x0586 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0586 }
            boolean r0 = p072l2.C1241e.m3513b(r6, r4)     // Catch:{ Exception -> 0x0586 }
            if (r0 != 0) goto L_0x0432
            java.lang.String r0 = "[VDS] BSC AKI does not equal CSCA AKI"
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0586 }
            p072l2.C1241e.m3517j(r13, r12)     // Catch:{ Exception -> 0x0586 }
            p072l2.C1241e.m3517j(r0, r11)     // Catch:{ Exception -> 0x0586 }
            p072l2.C1241e.m3517j(r4, r10)     // Catch:{ Exception -> 0x0586 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0586 }
            r6[r1] = r4     // Catch:{ Exception -> 0x0586 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r6, r5)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0586 }
            p072l2.C1241e.m3516f(r0, r3)     // Catch:{ Exception -> 0x0586 }
        L_0x042e:
            r14 = 0
        L_0x042f:
            r0 = 0
            goto L_0x05c0
        L_0x0432:
            java.lang.String r0 = "PKIX"
            java.security.cert.CertPathValidator r0 = java.security.cert.CertPathValidator.getInstance(r0)     // Catch:{ Exception -> 0x0569 }
            java.util.List r4 = p042g2.C0955a.m2747u(r1)     // Catch:{ Exception -> 0x0569 }
            java.security.cert.CertPath r4 = r14.generateCertPath(r4)     // Catch:{ Exception -> 0x0569 }
            r5 = 1
            java.security.cert.TrustAnchor[] r5 = new java.security.cert.TrustAnchor[r5]     // Catch:{ Exception -> 0x0569 }
            java.security.cert.TrustAnchor r6 = new java.security.cert.TrustAnchor     // Catch:{ Exception -> 0x0569 }
            r14 = 0
            r6.<init>(r15, r14)     // Catch:{ Exception -> 0x056a }
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x056a }
            java.lang.String r6 = "elements"
            p072l2.C1241e.m3517j(r5, r6)     // Catch:{ Exception -> 0x056a }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ Exception -> 0x056a }
            r7 = 1
            int r7 = p042g2.C0955a.m2749w(r7)     // Catch:{ Exception -> 0x056a }
            r6.<init>(r7)     // Catch:{ Exception -> 0x056a }
            java.lang.String r7 = "$this$toCollection"
            p072l2.C1241e.m3517j(r5, r7)     // Catch:{ Exception -> 0x056a }
            java.lang.String r7 = "destination"
            p072l2.C1241e.m3517j(r6, r7)     // Catch:{ Exception -> 0x056a }
            r7 = 0
        L_0x0466:
            r8 = 1
            if (r7 >= r8) goto L_0x0471
            r8 = r5[r7]     // Catch:{ Exception -> 0x056a }
            r6.add(r8)     // Catch:{ Exception -> 0x056a }
            int r7 = r7 + 1
            goto L_0x0466
        L_0x0471:
            java.security.cert.PKIXParameters r5 = new java.security.cert.PKIXParameters     // Catch:{ Exception -> 0x056a }
            r5.<init>(r6)     // Catch:{ Exception -> 0x056a }
            r6 = 0
            r5.setRevocationEnabled(r6)     // Catch:{ Exception -> 0x056a }
            java.security.cert.CertPathValidatorResult r0 = r0.validate(r4, r5)     // Catch:{ Exception -> 0x056a }
            if (r0 == 0) goto L_0x0563
            au.gov.dfat.vdsncchecker.vds.VDSSig r0 = r19.getSig()
            java.lang.String r0 = r0.getAlg()
            int r4 = r0.hashCode()
            r5 = 66245349(0x3f2d2e5, float:1.4271901E-36)
            if (r4 == r5) goto L_0x04b4
            r5 = 66246401(0x3f2d701, float:1.4272844E-36)
            if (r4 == r5) goto L_0x04a8
            r5 = 66248104(0x3f2dda8, float:1.4274371E-36)
            if (r4 == r5) goto L_0x049c
            goto L_0x04bc
        L_0x049c:
            java.lang.String r4 = "ES512"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x04a5
            goto L_0x04bc
        L_0x04a5:
            java.lang.String r0 = "SHA512withECDSA"
            goto L_0x04c0
        L_0x04a8:
            java.lang.String r4 = "ES384"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x04b1
            goto L_0x04bc
        L_0x04b1:
            java.lang.String r0 = "SHA384withECDSA"
            goto L_0x04c0
        L_0x04b4:
            java.lang.String r4 = "ES256"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x04be
        L_0x04bc:
            r0 = r14
            goto L_0x04c0
        L_0x04be:
            java.lang.String r0 = "SHA256withECDSA"
        L_0x04c0:
            java.security.Signature r0 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x0546 }
            r0.initVerify(r1)     // Catch:{ Exception -> 0x0546 }
            java.lang.String r1 = "$this$encodeToByteArray"
            r4 = r22
            p072l2.C1241e.m3517j(r4, r1)     // Catch:{ Exception -> 0x0546 }
            java.nio.charset.Charset r1 = p067k3.C1197a.f4098a     // Catch:{ Exception -> 0x0546 }
            byte[] r1 = r4.getBytes(r1)     // Catch:{ Exception -> 0x0546 }
            java.lang.String r4 = "(this as java.lang.String).getBytes(charset)"
            p072l2.C1241e.m3516f(r1, r4)     // Catch:{ Exception -> 0x0546 }
            r0.update(r1)     // Catch:{ Exception -> 0x0546 }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x0546 }
            r4 = 32
            r5 = 0
            r6 = r17
            byte[] r5 = p104q4.C1625a.m4535b(r6, r5, r4)     // Catch:{ Exception -> 0x0546 }
            r7 = 1
            r1.<init>(r7, r5)     // Catch:{ Exception -> 0x0546 }
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ Exception -> 0x0546 }
            r8 = 64
            byte[] r4 = p104q4.C1625a.m4535b(r6, r4, r8)     // Catch:{ Exception -> 0x0546 }
            r5.<init>(r7, r4)     // Catch:{ Exception -> 0x0546 }
            l4.f r4 = new l4.f     // Catch:{ Exception -> 0x0546 }
            r6 = 10
            r4.<init>(r6)     // Catch:{ Exception -> 0x0546 }
            l4.l r6 = new l4.l     // Catch:{ Exception -> 0x0546 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0546 }
            r4.mo5173a(r6)     // Catch:{ Exception -> 0x0546 }
            l4.l r1 = new l4.l     // Catch:{ Exception -> 0x0546 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0546 }
            r4.mo5173a(r1)     // Catch:{ Exception -> 0x0546 }
            l4.d1 r1 = new l4.d1     // Catch:{ Exception -> 0x0546 }
            r1.<init>((p074l4.C1351f) r4)     // Catch:{ Exception -> 0x0546 }
            java.lang.String r4 = "DER"
            byte[] r1 = r1.mo5199h(r4)     // Catch:{ Exception -> 0x0546 }
            boolean r0 = r0.verify(r1)     // Catch:{ Exception -> 0x0546 }
            if (r0 != 0) goto L_0x053e
            java.lang.String r0 = "[VDS] Signature failed verification"
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0546 }
            p072l2.C1241e.m3517j(r13, r12)     // Catch:{ Exception -> 0x0546 }
            p072l2.C1241e.m3517j(r0, r11)     // Catch:{ Exception -> 0x0546 }
            p072l2.C1241e.m3517j(r4, r10)     // Catch:{ Exception -> 0x0546 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0546 }
            r6[r1] = r4     // Catch:{ Exception -> 0x0546 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r6, r5)     // Catch:{ Exception -> 0x0546 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0546 }
            p072l2.C1241e.m3516f(r0, r3)     // Catch:{ Exception -> 0x0546 }
            goto L_0x05be
        L_0x053e:
            r0 = 1
            r24 = r14
            r14 = r0
            r0 = r24
            goto L_0x05c0
        L_0x0546:
            java.lang.String r0 = "[VDS] Error when verifying signature"
            r1 = 0
            java.lang.Object[] r15 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r15
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r15
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x05bb
        L_0x0563:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x056a }
            r0.<init>()     // Catch:{ Exception -> 0x056a }
            throw r0     // Catch:{ Exception -> 0x056a }
        L_0x0569:
            r14 = 0
        L_0x056a:
            java.lang.String r0 = "[VDS] BSC certification path does not include CSCA"
            r1 = 0
            java.lang.Object[] r15 = new java.lang.Object[r1]
            r4 = r13
            r5 = r12
            r6 = r0
            r7 = r11
            r8 = r15
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r15
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x05bb
        L_0x0586:
            r0 = 0
            java.lang.String r1 = "[VDS] Failed to compare BSC AKI and CSCA AKI"
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r4 = r13
            r5 = r12
            r6 = r1
            r7 = r11
            r8 = r15
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r14] = r15
            p136w0.C2035q.m5362a(r5, r4, r1, r3)
            goto L_0x05c0
        L_0x059e:
            r0 = 0
            r1 = 1
            r14 = 0
            java.lang.String r15 = "[VDS] Error verifying CRL"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r4 = r13
            r5 = r12
            r6 = r15
            r7 = r11
            r8 = r9
            r11 = r9
            r9 = r10
            p136w0.C2034p.m5361a(r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r11
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r0 = java.lang.String.format(r15, r0)
        L_0x05bb:
            p072l2.C1241e.m3516f(r0, r3)
        L_0x05be:
            r0 = r14
            r14 = 0
        L_0x05c0:
            if (r14 == 0) goto L_0x0750
            au.gov.dfat.vdsncchecker.vds.VDSData r1 = r19.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r1 = r1.getMsg()
            java.lang.String r1 = r1.getUvci()
            m1.b r1 = p136w0.C2036r.m5370h(r1)
            m1.b r3 = p077m1.C1427b.INVALID
            if (r1 != r3) goto L_0x05d8
            goto L_0x0750
        L_0x05d8:
            r2.mo2464A()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<au.gov.dfat.vdsncchecker.ui.VdsActivity> r3 = p007au.gov.dfat.vdsncchecker.p008ui.VdsActivity.class
            r1.<init>(r2, r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "<this>"
            r5 = r19
            p072l2.C1241e.m3517j(r5, r4)
            au.gov.dfat.vdsncchecker.vds.VdsHdrParcel r4 = new au.gov.dfat.vdsncchecker.vds.VdsHdrParcel
            au.gov.dfat.vdsncchecker.vds.VDSData r6 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSHdr r6 = r6.getHdr()
            long r6 = r6.getV()
            au.gov.dfat.vdsncchecker.vds.VDSData r8 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSHdr r8 = r8.getHdr()
            java.lang.String r8 = r8.getT()
            au.gov.dfat.vdsncchecker.vds.VDSData r9 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSHdr r9 = r9.getHdr()
            java.lang.String r9 = r9.getHdrIs()
            r4.<init>(r6, r8, r9)
            au.gov.dfat.vdsncchecker.vds.VDSData r6 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r6 = r6.getMsg()
            java.lang.String r6 = r6.getUvci()
            au.gov.dfat.vdsncchecker.vds.VdsPidParcel r13 = new au.gov.dfat.vdsncchecker.vds.VdsPidParcel
            au.gov.dfat.vdsncchecker.vds.VDSData r7 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r7 = r7.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r7 = r7.getPid()
            java.lang.String r7 = r7.getDob()
            if (r7 == 0) goto L_0x064b
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r0 = r0.getPid()
            java.lang.String r0 = r0.getDob()
            j$.time.LocalDate r0 = p155j$.time.LocalDate.parse(r0)
        L_0x064b:
            r8 = r0
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r0 = r0.getPid()
            java.lang.String r0 = r0.getN()
            r7 = 4
            java.lang.String r9 = "  "
            java.lang.String r10 = ", "
            r11 = 0
            java.lang.String r9 = p067k3.C1205h.m3430N(r0, r9, r10, r11, r7)
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r0 = r0.getPid()
            java.lang.String r10 = r0.getSex()
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r0 = r0.getPid()
            java.lang.String r11 = r0.getI()
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            au.gov.dfat.vdsncchecker.vds.VDSPID r0 = r0.getPid()
            java.lang.String r12 = r0.getAi()
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            au.gov.dfat.vdsncchecker.vds.VDSData r0 = r5.getData()
            au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = r0.getMsg()
            java.util.List r0 = r0.getVe()
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = p126u2.C1846g.m5046H(r0, r7)
            r5.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x06b5:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x073a
            java.lang.Object r7 = r0.next()
            au.gov.dfat.vdsncchecker.vds.VDSVe r7 = (p007au.gov.dfat.vdsncchecker.vds.VDSVe) r7
            java.lang.String r8 = r7.getDes()
            java.lang.String r9 = r7.getNam()
            java.lang.String r10 = r7.getDis()
            java.util.List r7 = r7.getVd()
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = p126u2.C1846g.m5046H(r7, r12)
            r11.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x06e0:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x072c
            java.lang.Object r12 = r7.next()
            au.gov.dfat.vdsncchecker.vds.VDSVd r12 = (p007au.gov.dfat.vdsncchecker.vds.VDSVd) r12
            au.gov.dfat.vdsncchecker.vds.VdsVdParcel r15 = new au.gov.dfat.vdsncchecker.vds.VdsVdParcel
            java.lang.String r14 = r12.getDvc()
            j$.time.LocalDate r14 = p155j$.time.LocalDate.parse(r14)
            r22 = r0
            java.lang.String r0 = "parse(vd.dvc)"
            p072l2.C1241e.m3516f(r14, r0)
            long r16 = r12.getSeq()
            java.lang.String r18 = r12.getCtr()
            java.lang.String r19 = r12.getAdm()
            java.lang.String r20 = r12.getLot()
            java.lang.String r0 = r12.getDvn()
            if (r0 == 0) goto L_0x071c
            java.lang.String r0 = r12.getDvn()
            j$.time.LocalDate r0 = p155j$.time.LocalDate.parse(r0)
            goto L_0x071d
        L_0x071c:
            r0 = 0
        L_0x071d:
            r21 = r0
            r0 = r14
            r14 = r15
            r12 = r15
            r15 = r0
            r14.<init>(r15, r16, r18, r19, r20, r21)
            r11.add(r12)
            r0 = r22
            goto L_0x06e0
        L_0x072c:
            r22 = r0
            au.gov.dfat.vdsncchecker.vds.VdsVeParcel r0 = new au.gov.dfat.vdsncchecker.vds.VdsVeParcel
            r0.<init>(r8, r9, r10, r11)
            r5.add(r0)
            r0 = r22
            goto L_0x06b5
        L_0x073a:
            au.gov.dfat.vdsncchecker.vds.VdsMsgParcel r0 = new au.gov.dfat.vdsncchecker.vds.VdsMsgParcel
            r0.<init>(r6, r13, r5)
            au.gov.dfat.vdsncchecker.vds.VdsParcel r5 = new au.gov.dfat.vdsncchecker.vds.VdsParcel
            r5.<init>(r4, r0)
            java.lang.String r0 = "VDS_DATA"
            r3.putParcelable(r0, r5)
            r1.putExtras(r3)
            r2.startActivity(r1)
            goto L_0x075d
        L_0x0750:
            r2.mo2464A()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<au.gov.dfat.vdsncchecker.ui.InvalidCodeActivity> r1 = p007au.gov.dfat.vdsncchecker.p008ui.InvalidCodeActivity.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
        L_0x075d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p065k1.C1182n.run():void");
    }
}
