package p038f4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.C1537a;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p032e4.C0879e;
import p038f4.C0928j;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: f4.g */
public final class C0923g implements C0930k {

    /* renamed from: a */
    public static final C0928j.C0929a f3451a = new C0924a();

    /* renamed from: f4.g$a */
    public static final class C0924a implements C0928j.C0929a {
        /* renamed from: a */
        public boolean mo4246a(SSLSocket sSLSocket) {
            C1241e.m3517j(sSLSocket, "sslSocket");
            C1537a.C1538a aVar = C1537a.f4774f;
            return C1537a.f4773e && (sSLSocket instanceof BCSSLSocket);
        }

        /* renamed from: b */
        public C0930k mo4247b(SSLSocket sSLSocket) {
            C1241e.m3517j(sSLSocket, "sslSocket");
            return new C0923g();
        }
    }

    /* renamed from: a */
    public boolean mo4236a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: b */
    public String mo4237b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo4238c() {
        C1537a.C1538a aVar = C1537a.f4774f;
        return C1537a.f4773e;
    }

    /* renamed from: d */
    public void mo4239d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        if (mo4236a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C1241e.m3516f(parameters, "sslParameters");
            Object[] array = ((ArrayList) C0879e.f3347c.mo4186a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
