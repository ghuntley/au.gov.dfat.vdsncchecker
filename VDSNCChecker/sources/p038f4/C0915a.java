package p038f4;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p032e4.C0879e;
import p072l2.C1241e;
import p139w3.C2061c0;

@SuppressLint({"NewApi"})
/* renamed from: f4.a */
public final class C0915a implements C0930k {

    /* renamed from: f4.a$a */
    public static final class C0916a {
        /* renamed from: a */
        public static final boolean m2676a() {
            return C0879e.f3347c.mo4188c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: a */
    public boolean mo4236a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public String mo4237b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo4238c() {
        return C0916a.m2676a();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo4239d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C1241e.m3516f(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) C0879e.f3347c.mo4186a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
