package p032e4;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p000a.C0001b;
import p025d3.C0802f;
import p050h4.C1016a;
import p050h4.C1017b;
import p050h4.C1018c;
import p050h4.C1020e;
import p062j4.C1112f;
import p063k.C1142f;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2057b0;
import p139w3.C2061c0;

/* renamed from: e4.e */
public class C0879e {

    /* renamed from: a */
    public static volatile C0879e f3345a;

    /* renamed from: b */
    public static final Logger f3346b = Logger.getLogger(C2057b0.class.getName());

    /* renamed from: c */
    public static final C0880a f3347c;

    /* renamed from: e4.e$a */
    public static final class C0880a {
        public C0880a(C0802f fVar) {
        }

        /* renamed from: a */
        public final List<String> mo4186a(List<? extends C2061c0> list) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C2061c0) next) != C2061c0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C1846g.m5046H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C2061c0) it.next()).f5971e);
            }
            return arrayList2;
        }

        /* renamed from: b */
        public final byte[] mo4187b(List<? extends C2061c0> list) {
            C1112f fVar = new C1112f();
            Iterator it = ((ArrayList) mo4186a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.mo4633X(str.length());
                fVar.mo4639c0(str);
            }
            return fVar.mo4614D();
        }

        /* renamed from: c */
        public final boolean mo4188c() {
            return C1241e.m3513b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: e4.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    static {
        /*
            e4.e$a r0 = new e4.e$a
            r1 = 0
            r0.<init>(r1)
            f3347c = r0
            boolean r0 = r0.mo4188c()
            r2 = 0
            if (r0 == 0) goto L_0x0088
            f4.c r0 = p038f4.C0918c.f3441c
            java.util.Map<java.lang.String, java.lang.String> r0 = p038f4.C0918c.f3440b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = p038f4.C0918c.f3439a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "logger"
            p072l2.C1241e.m3516f(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0051
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005d
        L_0x0051:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x005b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005d
        L_0x005b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005d:
            r4.setLevel(r3)
            f4.d r3 = p038f4.C0919d.f3442a
            r4.addHandler(r3)
            goto L_0x001b
        L_0x0066:
            e4.a r0 = p032e4.C0871a.f3327f
            boolean r0 = p032e4.C0871a.f3326e
            if (r0 == 0) goto L_0x0072
            e4.a r0 = new e4.a
            r0.<init>()
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x018c
        L_0x0077:
            e4.b$a r0 = p032e4.C0872b.f3330g
            boolean r0 = p032e4.C0872b.f3329f
            if (r0 == 0) goto L_0x0082
            e4.b r1 = new e4.b
            r1.<init>()
        L_0x0082:
            p072l2.C1241e.m3515e(r1)
        L_0x0085:
            r0 = r1
            goto L_0x018c
        L_0x0088:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            p072l2.C1241e.m3516f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = p072l2.C1241e.m3513b(r4, r0)
            if (r0 == 0) goto L_0x00b0
            okhttp3.internal.platform.b$a r0 = okhttp3.internal.platform.C1539b.f4777f
            boolean r0 = okhttp3.internal.platform.C1539b.f4776e
            if (r0 == 0) goto L_0x00ab
            okhttp3.internal.platform.b r0 = new okhttp3.internal.platform.b
            r0.<init>()
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x018c
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p072l2.C1241e.m3516f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = p072l2.C1241e.m3513b(r4, r0)
            if (r0 == 0) goto L_0x00d6
            okhttp3.internal.platform.a$a r0 = okhttp3.internal.platform.C1537a.f4774f
            boolean r0 = okhttp3.internal.platform.C1537a.f4773e
            if (r0 == 0) goto L_0x00d1
            okhttp3.internal.platform.a r0 = new okhttp3.internal.platform.a
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x018c
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p072l2.C1241e.m3516f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = p072l2.C1241e.m3513b(r3, r0)
            if (r0 == 0) goto L_0x00fc
            okhttp3.internal.platform.c$a r0 = okhttp3.internal.platform.C1542c.f4781f
            boolean r0 = okhttp3.internal.platform.C1542c.f4780e
            if (r0 == 0) goto L_0x00f7
            okhttp3.internal.platform.c r0 = new okhttp3.internal.platform.c
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x018c
        L_0x00fc:
            e4.d$a r0 = p032e4.C0877d.f3344e
            boolean r0 = p032e4.C0877d.f3343d
            if (r0 == 0) goto L_0x0108
            e4.d r0 = new e4.d
            r0.<init>()
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            if (r0 == 0) goto L_0x010d
            goto L_0x018c
        L_0x010d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            p072l2.C1241e.m3516f(r0, r3)     // Catch:{ NumberFormatException -> 0x0123 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0123 }
            r3 = 9
            if (r0 < r3) goto L_0x0123
            goto L_0x0183
        L_0x0123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            e4.c r0 = new e4.c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "putMethod"
            p072l2.C1241e.m3516f(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "getMethod"
            p072l2.C1241e.m3516f(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "removeMethod"
            p072l2.C1241e.m3516f(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "clientProviderClass"
            p072l2.C1241e.m3516f(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "serverProviderClass"
            p072l2.C1241e.m3516f(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r1 = r0
        L_0x0183:
            if (r1 == 0) goto L_0x0187
            goto L_0x0085
        L_0x0187:
            e4.e r0 = new e4.e
            r0.<init>()
        L_0x018c:
            f3345a = r0
            java.lang.Class<w3.b0> r0 = p139w3.C2057b0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f3346b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032e4.C0879e.<clinit>():void");
    }

    /* renamed from: j */
    public static /* synthetic */ void m2603j(C0879e eVar, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        eVar.mo4181i(str, i, (Throwable) null);
    }

    /* renamed from: a */
    public void mo4179a(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public C1018c mo4167b(X509TrustManager x509TrustManager) {
        return new C1016a(mo4171c(x509TrustManager));
    }

    /* renamed from: c */
    public C1020e mo4171c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C1241e.m3516f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C1017b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<C2061c0> list) {
        C1241e.m3517j(list, "protocols");
    }

    /* renamed from: e */
    public void mo4172e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C1241e.m3517j(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo4173g(String str) {
        if (f3346b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo4170h(String str) {
        C1241e.m3517j(str, "hostname");
        return true;
    }

    /* renamed from: i */
    public void mo4181i(String str, int i, Throwable th) {
        C1241e.m3517j(str, "message");
        f3346b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: k */
    public void mo4174k(String str, Object obj) {
        C1241e.m3517j(str, "message");
        if (obj == null) {
            str = C1142f.m3365a(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo4181i(str, 5, (Throwable) obj);
    }

    /* renamed from: l */
    public SSLContext mo4182l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C1241e.m3516f(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: m */
    public SSLSocketFactory mo4183m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = mo4182l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            C1241e.m3516f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: n */
    public X509TrustManager mo4184n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        C1241e.m3515e(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder a = C0001b.m0a("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C1241e.m3516f(arrays, "java.util.Arrays.toString(this)");
        a.append(arrays);
        throw new IllegalStateException(a.toString().toString());
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
