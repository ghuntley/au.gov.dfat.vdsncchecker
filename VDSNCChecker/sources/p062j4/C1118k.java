package p062j4;

import p072l2.C1241e;

/* renamed from: j4.k */
public abstract class C1118k implements C1134z {

    /* renamed from: e */
    public final C1134z f3895e;

    public C1118k(C1134z zVar) {
        C1241e.m3517j(zVar, "delegate");
        this.f3895e = zVar;
    }

    public void close() {
        this.f3895e.close();
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return this.f3895e.mo2835d();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f3895e + ')';
    }
}
