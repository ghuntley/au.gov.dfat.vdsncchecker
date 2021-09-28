package p073l3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p085n3.C1473n;

/* renamed from: l3.d0 */
public final class C1272d0<T> extends C1473n<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4278g = AtomicIntegerFieldUpdater.newUpdater(C1272d0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5010V(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4278g
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            r0 = 0
            w2.d r1 = p042g2.C0955a.m2743q(r0)
            java.lang.Object r5 = p073l3.C1320u.m3716t(r5, r0)
            p085n3.C1462e.m4130a(r1, r5, (p019c3.C0636l<? super java.lang.Throwable, p120t2.C1798k>) null)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1272d0.mo5010V(java.lang.Object):void");
    }

    /* renamed from: f */
    public void mo5031f(Object obj) {
        mo5010V(obj);
    }
}
