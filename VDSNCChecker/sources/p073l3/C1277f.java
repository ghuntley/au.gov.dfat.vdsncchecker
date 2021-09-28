package p073l3;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p019c3.C0636l;
import p072l2.C1241e;
import p073l3.C1317t0;
import p085n3.C1461d;
import p120t2.C1788b;
import p120t2.C1798k;
import p138w2.C2043d;
import p138w2.C2046f;
import p143x2.C2124a;
import p148y2.C2136d;

/* renamed from: l3.f */
public class C1277f<T> extends C1275e0<T> implements C1274e<T>, C2136d {

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4280k = AtomicIntegerFieldUpdater.newUpdater(C1277f.class, "_decision");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4281l = AtomicReferenceFieldUpdater.newUpdater(C1277f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C1265b.f4273e;

    /* renamed from: h */
    public final C2043d<T> f4282h;

    /* renamed from: i */
    public final C2046f f4283i;

    /* renamed from: j */
    public C1281g0 f4284j;

    public C1277f(C2043d<? super T> dVar, int i) {
        super(i);
        this.f4282h = dVar;
        this.f4283i = dVar.mo5012d();
    }

    /* renamed from: a */
    public void mo5032a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C1273d1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C1312r)) {
                if (obj2 instanceof C1310q) {
                    C1310q qVar = (C1310q) obj2;
                    if (!(qVar.f4319e != null)) {
                        if (f4281l.compareAndSet(this, obj2, C1310q.m3678a(qVar, (Object) null, (C1271d) null, (C0636l) null, (Object) null, th, 15))) {
                            C1271d dVar = qVar.f4316b;
                            if (dVar != null) {
                                mo5042k(dVar, th);
                            }
                            C0636l<Throwable, C1798k> lVar = qVar.f4317c;
                            if (lVar != null) {
                                mo5043l(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f4281l.compareAndSet(this, obj2, new C1310q(obj2, (C1271d) null, (C0636l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final C2043d<T> mo5033b() {
        return this.f4282h;
    }

    /* renamed from: c */
    public Throwable mo5034c(Object obj) {
        Throwable c = super.mo5034c(obj);
        if (c == null) {
            return null;
        }
        return c;
    }

    /* renamed from: d */
    public C2046f mo5012d() {
        return this.f4283i;
    }

    /* renamed from: e */
    public C2136d mo5040e() {
        C2043d<T> dVar = this.f4282h;
        if (dVar instanceof C2136d) {
            return (C2136d) dVar;
        }
        return null;
    }

    /* renamed from: f */
    public <T> T mo5035f(Object obj) {
        return obj instanceof C1310q ? ((C1310q) obj).f4315a : obj;
    }

    /* renamed from: h */
    public Object mo5037h() {
        return this._state;
    }

    /* renamed from: i */
    public final void mo5041i(C0636l<? super Throwable, C1798k> lVar, Throwable th) {
        try {
            lVar.mo2828m(th);
        } catch (Throwable th2) {
            C1320u.m3712p(this.f4283i, new C1788b(C1241e.m3522p("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: l3.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: l3.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5013j(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Throwable r0 = p120t2.C1792f.m4971a(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            l3.r r13 = new l3.r
            r2 = 2
            r13.<init>(r0, r1, r2)
        L_0x000e:
            int r0 = r12.f4279g
            r2 = 0
        L_0x0011:
            r6 = 0
            java.lang.Object r10 = r12._state
            boolean r3 = r10 instanceof p073l3.C1273d1
            if (r3 == 0) goto L_0x0051
            r3 = r10
            l3.d1 r3 = (p073l3.C1273d1) r3
            boolean r4 = r13 instanceof p073l3.C1312r
            if (r4 == 0) goto L_0x0020
            goto L_0x0040
        L_0x0020:
            boolean r4 = p073l3.C1320u.m3713q(r0)
            if (r4 != 0) goto L_0x0027
            goto L_0x0040
        L_0x0027:
            boolean r4 = r3 instanceof p073l3.C1271d
            if (r4 == 0) goto L_0x0040
            l3.q r11 = new l3.q
            boolean r4 = r3 instanceof p073l3.C1271d
            if (r4 == 0) goto L_0x0035
            l3.d r3 = (p073l3.C1271d) r3
            r5 = r3
            goto L_0x0036
        L_0x0035:
            r5 = r2
        L_0x0036:
            r8 = 0
            r9 = 16
            r7 = 0
            r3 = r11
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x0040:
            r11 = r13
        L_0x0041:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4281l
            boolean r3 = r3.compareAndSet(r12, r10, r11)
            if (r3 != 0) goto L_0x004a
            goto L_0x0011
        L_0x004a:
            r12.mo5046o()
            r12.mo5047p(r0)
            goto L_0x0063
        L_0x0051:
            boolean r0 = r10 instanceof p073l3.C1280g
            if (r0 == 0) goto L_0x0064
            l3.g r10 = (p073l3.C1280g) r10
            java.util.Objects.requireNonNull(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p073l3.C1280g.f4287c
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 == 0) goto L_0x0064
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r0 = "Already resumed, but proposed with update "
            java.lang.String r13 = p072l2.C1241e.m3522p(r0, r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1277f.mo5013j(java.lang.Object):void");
    }

    /* renamed from: k */
    public final void mo5042k(C1271d dVar, Throwable th) {
        try {
            dVar.mo5030a(th);
        } catch (Throwable th2) {
            C1320u.m3712p(this.f4283i, new C1788b(C1241e.m3522p("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: l */
    public final void mo5043l(C0636l<? super Throwable, C1798k> lVar, Throwable th) {
        try {
            lVar.mo2828m(th);
        } catch (Throwable th2) {
            C1320u.m3712p(this.f4283i, new C1788b(C1241e.m3522p("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: m */
    public boolean mo5044m(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C1273d1)) {
                return false;
            }
            z = obj instanceof C1271d;
        } while (!f4281l.compareAndSet(this, obj, new C1280g(this, th, z)));
        C1271d dVar = z ? (C1271d) obj : null;
        if (dVar != null) {
            mo5042k(dVar, th);
        }
        mo5046o();
        mo5047p(this.f4279g);
        return true;
    }

    /* renamed from: n */
    public final void mo5045n() {
        C1281g0 g0Var = this.f4284j;
        if (g0Var != null) {
            g0Var.mo5027c();
            this.f4284j = C1270c1.f4277e;
        }
    }

    /* renamed from: o */
    public final void mo5046o() {
        if (!mo5050s()) {
            mo5045n();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5047p(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x000a
            r0 = r2
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4280k
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            w2.d r0 = r4.mo5033b()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r2 = r1
        L_0x002b:
            if (r2 != 0) goto L_0x007f
            boolean r3 = r0 instanceof p085n3.C1461d
            if (r3 == 0) goto L_0x007f
            boolean r5 = p073l3.C1320u.m3713q(r5)
            int r3 = r4.f4279g
            boolean r3 = p073l3.C1320u.m3713q(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            n3.d r5 = (p085n3.C1461d) r5
            l3.x r5 = r5.f4596h
            w2.f r0 = r0.mo5012d()
            boolean r2 = r5.mo5118S(r0)
            if (r2 == 0) goto L_0x0050
            r5.mo5067R(r0, r4)
            goto L_0x0082
        L_0x0050:
            l3.i1 r5 = p073l3.C1288i1.f4293a
            l3.i0 r5 = p073l3.C1288i1.m3643a()
            boolean r0 = r5.mo5064X()
            if (r0 == 0) goto L_0x0060
            r5.mo5062V(r4)
            goto L_0x0082
        L_0x0060:
            r5.mo5063W(r1)
            w2.d r0 = r4.mo5033b()     // Catch:{ all -> 0x0071 }
            p073l3.C1320u.m3717u(r4, r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.mo5065Y()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r2 = 0
            r4.mo5036g(r0, r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.mo5060T(r1)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.mo5060T(r1)
            throw r0
        L_0x007f:
            p073l3.C1320u.m3717u(r4, r0, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1277f.mo5047p(int):void");
    }

    /* renamed from: q */
    public final Object mo5048q() {
        boolean z;
        boolean s = mo5050s();
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (f4280k.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            if (this.f4284j == null) {
                C2046f fVar = this.f4283i;
                int i2 = C1317t0.f4328b;
                C1317t0 t0Var = (C1317t0) fVar.get(C1317t0.C1319b.f4329e);
                if (t0Var != null) {
                    this.f4284j = C1317t0.C1318a.m3693a(t0Var, true, false, new C1283h(this), 2, (Object) null);
                }
            }
            if (s) {
                mo5053u();
            }
            return C2124a.COROUTINE_SUSPENDED;
        }
        if (s) {
            mo5053u();
        }
        Object obj = this._state;
        if (!(obj instanceof C1312r)) {
            if (C1320u.m3713q(this.f4279g)) {
                C2046f fVar2 = this.f4283i;
                int i3 = C1317t0.f4328b;
                C1317t0 t0Var2 = (C1317t0) fVar2.get(C1317t0.C1319b.f4329e);
                if (t0Var2 != null && !t0Var2.mo5011a()) {
                    CancellationException k = t0Var2.mo5107k();
                    mo5032a(obj, k);
                    throw k;
                }
            }
            return mo5035f(obj);
        }
        throw ((C1312r) obj).f4322a;
    }

    /* renamed from: r */
    public void mo5049r(C0636l<? super Throwable, C1798k> lVar) {
        C1271d q0Var = lVar instanceof C1271d ? (C1271d) lVar : new C1311q0(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C1265b)) {
                Throwable th = null;
                if (!(obj instanceof C1271d)) {
                    boolean z = obj instanceof C1312r;
                    boolean z2 = true;
                    if (z) {
                        C1312r rVar = (C1312r) obj;
                        Objects.requireNonNull(rVar);
                        if (!C1312r.f4321b.compareAndSet(rVar, 0, 1)) {
                            mo5051t(lVar, obj);
                            throw null;
                        } else if (obj instanceof C1280g) {
                            if (!z) {
                                rVar = null;
                            }
                            if (rVar != null) {
                                th = rVar.f4322a;
                            }
                            mo5041i(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof C1310q) {
                        C1310q qVar = (C1310q) obj;
                        if (qVar.f4316b == null) {
                            Throwable th2 = qVar.f4319e;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                mo5041i(lVar, th2);
                                return;
                            } else {
                                if (f4281l.compareAndSet(this, obj, C1310q.m3678a(qVar, (Object) null, q0Var, (C0636l) null, (Object) null, (Throwable) null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            mo5051t(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f4281l.compareAndSet(this, obj, new C1310q(obj, q0Var, (C0636l) null, (Object) null, (Throwable) null, 28))) {
                            return;
                        }
                    }
                } else {
                    mo5051t(lVar, obj);
                    throw null;
                }
            } else if (f4281l.compareAndSet(this, obj, q0Var)) {
                return;
            }
        }
    }

    /* renamed from: s */
    public final boolean mo5050s() {
        C2043d<T> dVar = this.f4282h;
        return (dVar instanceof C1461d) && ((C1461d) dVar).mo5321i(this);
    }

    /* renamed from: t */
    public final void mo5051t(C0636l<? super Throwable, C1798k> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(C1320u.m3695B(this.f4282h));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof C1273d1 ? "Active" : obj instanceof C1280g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(C1320u.m3710n(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo5053u() {
        C2043d<T> dVar = this.f4282h;
        Throwable th = null;
        C1461d dVar2 = dVar instanceof C1461d ? (C1461d) dVar : null;
        if (dVar2 != null) {
            th = dVar2.mo5324m(this);
        }
        if (th != null) {
            mo5045n();
            mo5044m(th);
        }
    }
}
