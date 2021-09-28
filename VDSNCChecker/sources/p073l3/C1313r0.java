package p073l3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p019c3.C0636l;
import p120t2.C1798k;

/* renamed from: l3.r0 */
public final class C1313r0 extends C1323v0 {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4323j = AtomicIntegerFieldUpdater.newUpdater(C1313r0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: i */
    public final C0636l<Throwable, C1798k> f4324i;

    public C1313r0(C0636l<? super Throwable, C1798k> lVar) {
        this.f4324i = lVar;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Object mo2828m(Object obj) {
        mo5056p((Throwable) obj);
        return C1798k.f5446a;
    }

    /* renamed from: p */
    public void mo5056p(Throwable th) {
        if (f4323j.compareAndSet(this, 0, 1)) {
            this.f4324i.mo2828m(th);
        }
    }
}
