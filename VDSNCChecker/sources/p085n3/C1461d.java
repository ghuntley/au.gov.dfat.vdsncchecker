package p085n3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000a.C0001b;
import p019c3.C0636l;
import p045h.C0990o;
import p072l2.C1241e;
import p073l3.C1274e;
import p073l3.C1275e0;
import p073l3.C1277f;
import p073l3.C1287i0;
import p073l3.C1288i1;
import p073l3.C1314s;
import p073l3.C1320u;
import p073l3.C1326x;
import p085n3.C1475p;
import p120t2.C1798k;
import p138w2.C2043d;
import p138w2.C2046f;
import p148y2.C2136d;

/* renamed from: n3.d */
public final class C1461d<T> extends C1275e0<T> implements C2136d, C2043d<T> {

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4595l = AtomicReferenceFieldUpdater.newUpdater(C1461d.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: h */
    public final C1326x f4596h;

    /* renamed from: i */
    public final C2043d<T> f4597i;

    /* renamed from: j */
    public Object f4598j = C1462e.f4600a;

    /* renamed from: k */
    public final Object f4599k;

    public C1461d(C1326x xVar, C2043d<? super T> dVar) {
        super(-1);
        this.f4596h = xVar;
        this.f4597i = dVar;
        C2046f d = mo5012d();
        C0990o oVar = C1475p.f4620a;
        Object fold = d.fold(0, C1475p.C1476a.f4621f);
        C1241e.m3515e(fold);
        this.f4599k = fold;
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: a */
    public void mo5032a(Object obj, Throwable th) {
        if (obj instanceof C1314s) {
            ((C1314s) obj).f4326b.mo2828m(th);
        }
    }

    /* renamed from: b */
    public C2043d<T> mo5033b() {
        return this;
    }

    /* renamed from: d */
    public C2046f mo5012d() {
        return this.f4597i.mo5012d();
    }

    /* renamed from: e */
    public C2136d mo5040e() {
        C2043d<T> dVar = this.f4597i;
        if (dVar instanceof C2136d) {
            return (C2136d) dVar;
        }
        return null;
    }

    /* renamed from: h */
    public Object mo5037h() {
        Object obj = this.f4598j;
        this.f4598j = C1462e.f4600a;
        return obj;
    }

    /* renamed from: i */
    public final boolean mo5321i(C1277f<?> fVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (obj instanceof C1277f) {
            return obj == fVar;
        }
        return true;
    }

    /* renamed from: j */
    public void mo5013j(Object obj) {
        C2046f d;
        Object b;
        C2046f d2 = this.f4597i.mo5012d();
        Object C = C1320u.m3696C(obj, (C0636l<? super Throwable, C1798k>) null);
        if (this.f4596h.mo5118S(d2)) {
            this.f4598j = C;
            this.f4279g = 0;
            this.f4596h.mo5067R(d2, this);
            return;
        }
        C1288i1 i1Var = C1288i1.f4293a;
        C1287i0 a = C1288i1.m3643a();
        if (a.mo5064X()) {
            this.f4598j = C;
            this.f4279g = 0;
            a.mo5062V(this);
            return;
        }
        a.mo5063W(true);
        try {
            d = mo5012d();
            b = C1475p.m4157b(d, this.f4599k);
            this.f4597i.mo5013j(obj);
            C1475p.m4156a(d, b);
            do {
            } while (a.mo5065Y());
        } catch (Throwable th) {
            try {
                mo5036g(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo5060T(true);
                throw th2;
            }
        }
        a.mo5060T(true);
    }

    /* renamed from: k */
    public final boolean mo5322k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C0990o oVar = C1462e.f4601b;
            if (C1241e.m3513b(obj, oVar)) {
                if (f4595l.compareAndSet(this, oVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f4595l.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo5323l() {
        do {
        } while (this._reusableCancellableContinuation == C1462e.f4601b);
        Object obj = this._reusableCancellableContinuation;
        C1277f fVar = obj instanceof C1277f ? (C1277f) obj : null;
        if (fVar != null) {
            fVar.mo5045n();
        }
    }

    /* renamed from: m */
    public final Throwable mo5324m(C1274e<?> eVar) {
        C0990o oVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            oVar = C1462e.f4601b;
            if (obj != oVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C1241e.m3522p("Inconsistent state ", obj).toString());
                } else if (f4595l.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f4595l.compareAndSet(this, oVar, eVar));
        return null;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("DispatchedContinuation[");
        a.append(this.f4596h);
        a.append(", ");
        a.append(C1320u.m3695B(this.f4597i));
        a.append(']');
        return a.toString();
    }
}
