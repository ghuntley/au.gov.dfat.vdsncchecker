package p073l3;

import p072l2.C1241e;

/* renamed from: l3.x0 */
public abstract class C1328x0 extends C1316t implements C1281g0, C1309p0 {

    /* renamed from: h */
    public C1330y0 f4335h;

    /* renamed from: a */
    public boolean mo5024a() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5027c() {
        /*
            r4 = this;
            l3.y0 r0 = r4.mo5120q()
        L_0x0004:
            java.lang.Object r1 = r0.mo5122C()
            boolean r2 = r1 instanceof p073l3.C1328x0
            if (r2 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p073l3.C1330y0.f4337e
            l3.h0 r3 = p073l3.C1335z0.f4351g
            boolean r1 = r2.compareAndSet(r0, r1, r3)
            if (r1 == 0) goto L_0x0004
            goto L_0x0029
        L_0x001a:
            boolean r0 = r1 instanceof p073l3.C1309p0
            if (r0 == 0) goto L_0x0029
            l3.p0 r1 = (p073l3.C1309p0) r1
            l3.b1 r0 = r1.mo5025e()
            if (r0 == 0) goto L_0x0029
            r4.mo5332o()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1328x0.mo5027c():void");
    }

    /* renamed from: e */
    public C1267b1 mo5025e() {
        return null;
    }

    /* renamed from: q */
    public final C1330y0 mo5120q() {
        C1330y0 y0Var = this.f4335h;
        if (y0Var != null) {
            return y0Var;
        }
        C1241e.m3524r("job");
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C1320u.m3710n(this) + "[job@" + C1320u.m3710n(mo5120q()) + ']';
    }
}
