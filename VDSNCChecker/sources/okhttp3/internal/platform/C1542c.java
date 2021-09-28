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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p000a.C0001b;
import p025d3.C0802f;
import p032e4.C0879e;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2061c0;

/* renamed from: okhttp3.internal.platform.c */
public final class C1542c extends C0879e {

    /* renamed from: e */
    public static final boolean f4780e;

    /* renamed from: f */
    public static final C1543a f4781f;

    /* renamed from: d */
    public final Provider f4782d = new OpenJSSE();

    /* renamed from: okhttp3.internal.platform.c$a */
    public static final class C1543a {
        public C1543a(C0802f fVar) {
        }
    }

    static {
        C1543a aVar = new C1543a((C0802f) null);
        f4781f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f4780e = z;
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<C2061c0> list) {
        C1241e.m3517j(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
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
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        C1241e.m3517j(list, "protocols");
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null) {
            return null;
        }
        if (applicationProtocol.hashCode() == 0 && applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: l */
    public SSLContext mo4182l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f4782d);
        C1241e.m3516f(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: n */
    public X509TrustManager mo4184n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f4782d);
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
