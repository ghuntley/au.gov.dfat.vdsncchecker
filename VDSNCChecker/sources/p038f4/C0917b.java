package p038f4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p050h4.C1018c;
import p072l2.C1241e;

/* renamed from: f4.b */
public final class C0917b extends C1018c {

    /* renamed from: a */
    public final X509TrustManager f3437a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f3438b;

    public C0917b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3437a = x509TrustManager;
        this.f3438b = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo4240a(List<? extends Certificate> list, String str) {
        C1241e.m3517j(list, "chain");
        C1241e.m3517j(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f3438b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            C1241e.m3516f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0917b) && ((C0917b) obj).f3437a == this.f3437a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f3437a);
    }
}
