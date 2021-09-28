package p038f4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.C1539b;
import org.conscrypt.Conscrypt;
import p032e4.C0879e;
import p038f4.C0928j;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: f4.i */
public final class C0926i implements C0930k {

    /* renamed from: a */
    public static final C0928j.C0929a f3455a = new C0927a();

    /* renamed from: f4.i$a */
    public static final class C0927a implements C0928j.C0929a {
        /* renamed from: a */
        public boolean mo4246a(SSLSocket sSLSocket) {
            C1241e.m3517j(sSLSocket, "sslSocket");
            C1539b.C1540a aVar = C1539b.f4777f;
            return C1539b.f4776e && Conscrypt.isConscrypt(sSLSocket);
        }

        /* renamed from: b */
        public C0930k mo4247b(SSLSocket sSLSocket) {
            C1241e.m3517j(sSLSocket, "sslSocket");
            return new C0926i();
        }
    }

    /* renamed from: a */
    public boolean mo4236a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: b */
    public String mo4237b(SSLSocket sSLSocket) {
        if (mo4236a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo4238c() {
        C1539b.C1540a aVar = C1539b.f4777f;
        return C1539b.f4776e;
    }

    /* renamed from: d */
    public void mo4239d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        if (mo4236a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) C0879e.f3347c.mo4186a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
