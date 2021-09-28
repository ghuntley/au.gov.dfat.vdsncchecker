package p038f4;

import javax.net.ssl.SSLSocket;
import p038f4.C0921f;
import p038f4.C0928j;
import p067k3.C1205h;
import p072l2.C1241e;

/* renamed from: f4.e */
public final class C0920e implements C0928j.C0929a {

    /* renamed from: a */
    public final /* synthetic */ String f3443a;

    public C0920e(String str) {
        this.f3443a = str;
    }

    /* renamed from: a */
    public boolean mo4246a(SSLSocket sSLSocket) {
        C1241e.m3517j(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        return C1205h.m3434R(name, this.f3443a + '.', false, 2);
    }

    /* renamed from: b */
    public C0930k mo4247b(SSLSocket sSLSocket) {
        C1241e.m3517j(sSLSocket, "sslSocket");
        C0921f.C0922a aVar = C0921f.f3445g;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!C1241e.m3513b(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        C1241e.m3515e(cls2);
        return new C0921f(cls2);
    }
}
