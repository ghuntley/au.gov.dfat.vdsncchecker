package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p000a.C0001b;
import p025d3.C0802f;
import p032e4.C0879e;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2061c0;

/* renamed from: okhttp3.internal.platform.b */
public final class C1539b extends C0879e {

    /* renamed from: e */
    public static final boolean f4776e;

    /* renamed from: f */
    public static final C1540a f4777f;

    /* renamed from: d */
    public final Provider f4778d;

    /* renamed from: okhttp3.internal.platform.b$a */
    public static final class C1540a {
        public C1540a(C0802f fVar) {
        }

        /* renamed from: a */
        public final boolean mo5492a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }
    }

    /* renamed from: okhttp3.internal.platform.b$b */
    public static final class C1541b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C1541b f4779a = new C1541b();
    }

    static {
        C1540a aVar = new C1540a((C0802f) null);
        f4777f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.mo5492a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f4776e = z;
    }

    public C1539b() {
        Provider newProvider = Conscrypt.newProvider();
        C1241e.m3516f(newProvider, "Conscrypt.newProvider()");
        this.f4778d = newProvider;
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<C2061c0> list) {
        C1241e.m3517j(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
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
            Object[] array = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        C1241e.m3517j(list, "protocols");
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: l */
    public SSLContext mo4182l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f4778d);
        C1241e.m3516f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: m */
    public SSLSocketFactory mo4183m(X509TrustManager x509TrustManager) {
        SSLContext instance = SSLContext.getInstance("TLS", this.f4778d);
        C1241e.m3516f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        C1241e.m3516f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
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
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, C1541b.f4779a);
            return x509TrustManager;
        }
        StringBuilder a = C0001b.m0a("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C1241e.m3516f(arrays, "java.util.Arrays.toString(this)");
        a.append(arrays);
        throw new IllegalStateException(a.toString().toString());
    }
}
