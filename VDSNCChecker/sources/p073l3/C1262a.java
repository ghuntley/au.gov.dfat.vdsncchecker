package p073l3;

import p019c3.C0636l;
import p072l2.C1241e;
import p073l3.C1317t0;
import p120t2.C1798k;
import p138w2.C2043d;
import p138w2.C2046f;

/* renamed from: l3.a */
public abstract class C1262a<T> extends C1330y0 implements C1317t0, C2043d<T> {

    /* renamed from: f */
    public final C2046f f4272f;

    public C1262a(C2046f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo5123G((C1317t0) fVar.get(C1317t0.C1319b.f4329e));
        }
        this.f4272f = fVar.plus(this);
    }

    /* renamed from: E */
    public final void mo5007E(Throwable th) {
        C1320u.m3712p(this.f4272f, th);
    }

    /* renamed from: L */
    public String mo5008L() {
        boolean z = C1322v.f4331a;
        return super.mo5008L();
    }

    /* renamed from: O */
    public final void mo5009O(Object obj) {
        if (obj instanceof C1312r) {
            C1312r rVar = (C1312r) obj;
            Throwable th = rVar.f4322a;
            rVar.mo5100a();
        }
    }

    /* renamed from: V */
    public void mo5010V(Object obj) {
        mo5031f(obj);
    }

    /* renamed from: a */
    public boolean mo5011a() {
        return super.mo5011a();
    }

    /* renamed from: d */
    public final C2046f mo5012d() {
        return this.f4272f;
    }

    /* renamed from: j */
    public final void mo5013j(Object obj) {
        Object T;
        Throwable th = null;
        Object C = C1320u.m3696C(obj, (C0636l<? super Throwable, C1798k>) null);
        do {
            T = mo5132T(mo5122C(), C);
            if (T == C1335z0.f4345a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + C;
                C1312r rVar = C instanceof C1312r ? (C1312r) C : null;
                if (rVar != null) {
                    th = rVar.f4322a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T == C1335z0.f4347c);
        if (T != C1335z0.f4346b) {
            mo5010V(T);
        }
    }

    /* renamed from: p */
    public String mo5014p() {
        return C1241e.m3522p(getClass().getSimpleName(), " was cancelled");
    }

    /* renamed from: v */
    public C2046f mo5015v() {
        return this.f4272f;
    }
}
