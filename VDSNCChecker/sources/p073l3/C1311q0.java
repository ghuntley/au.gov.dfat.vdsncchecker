package p073l3;

import p000a.C0001b;
import p019c3.C0636l;
import p120t2.C1798k;

/* renamed from: l3.q0 */
public final class C1311q0 extends C1271d {

    /* renamed from: e */
    public final C0636l<Throwable, C1798k> f4320e;

    public C1311q0(C0636l<? super Throwable, C1798k> lVar) {
        this.f4320e = lVar;
    }

    /* renamed from: a */
    public void mo5030a(Throwable th) {
        this.f4320e.mo2828m(th);
    }

    /* renamed from: m */
    public Object mo2828m(Object obj) {
        this.f4320e.mo2828m((Throwable) obj);
        return C1798k.f5446a;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("InvokeOnCancel[");
        a.append(C1320u.m3709m(this.f4320e));
        a.append('@');
        a.append(C1320u.m3710n(this));
        a.append(']');
        return a.toString();
    }
}
