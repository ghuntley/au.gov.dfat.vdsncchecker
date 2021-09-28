package p038f4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: f4.j */
public final class C0928j implements C0930k {

    /* renamed from: a */
    public C0930k f3456a;

    /* renamed from: b */
    public final C0929a f3457b;

    /* renamed from: f4.j$a */
    public interface C0929a {
        /* renamed from: a */
        boolean mo4246a(SSLSocket sSLSocket);

        /* renamed from: b */
        C0930k mo4247b(SSLSocket sSLSocket);
    }

    public C0928j(C0929a aVar) {
        C1241e.m3517j(aVar, "socketAdapterFactory");
        this.f3457b = aVar;
    }

    /* renamed from: a */
    public boolean mo4236a(SSLSocket sSLSocket) {
        return this.f3457b.mo4246a(sSLSocket);
    }

    /* renamed from: b */
    public String mo4237b(SSLSocket sSLSocket) {
        C0930k e = mo4248e(sSLSocket);
        if (e != null) {
            return e.mo4237b(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo4238c() {
        return true;
    }

    /* renamed from: d */
    public void mo4239d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        C0930k e = mo4248e(sSLSocket);
        if (e != null) {
            e.mo4239d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized C0930k mo4248e(SSLSocket sSLSocket) {
        if (this.f3456a == null && this.f3457b.mo4246a(sSLSocket)) {
            this.f3456a = this.f3457b.mo4247b(sSLSocket);
        }
        return this.f3456a;
    }
}
