package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p000a.C0001b;
import p025d3.C0802f;
import p032e4.C0879e;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2061c0;

/* renamed from: okhttp3.internal.platform.a */
public final class C1537a extends C0879e {

    /* renamed from: e */
    public static final boolean f4773e;

    /* renamed from: f */
    public static final C1538a f4774f;

    /* renamed from: d */
    public final Provider f4775d = new BouncyCastleJsseProvider();

    /* renamed from: okhttp3.internal.platform.a$a */
    public static final class C1538a {
        public C1538a(C0802f fVar) {
        }
    }

    static {
        C1538a aVar = new C1538a((C0802f) null);
        f4774f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f4773e = z;
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<C2061c0> list) {
        C1241e.m3517j(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C2061c0) next) != C2061c0.HTTP_1_0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C1846g.m5046H(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C2061c0) it2.next()).f5971e);
            }
            C1241e.m3516f(parameters, "sslParameters");
            Object[] array = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        C1241e.m3517j(list, "protocols");
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null) {
            return null;
        }
        if (applicationProtocol.hashCode() == 0 && applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: l */
    public SSLContext mo4182l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f4775d);
        C1241e.m3516f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: n */
    public X509TrustManager mo4184n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
