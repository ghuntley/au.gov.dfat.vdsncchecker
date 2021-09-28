package p073l3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000a.C0001b;
import p019c3.C0640p;
import p042g2.C0955a;
import p045h.C0990o;
import p072l2.C1241e;
import p073l3.C1317t0;
import p085n3.C1464g;
import p085n3.C1465h;
import p085n3.C1471l;
import p120t2.C1788b;
import p120t2.C1798k;
import p138w2.C2046f;

/* renamed from: l3.y0 */
public class C1330y0 implements C1317t0, C1294k, C1276e1 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4337e = AtomicReferenceFieldUpdater.newUpdater(C1330y0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: l3.y0$a */
    public static final class C1331a extends C1328x0 {

        /* renamed from: i */
        public final C1330y0 f4338i;

        /* renamed from: j */
        public final C1332b f4339j;

        /* renamed from: k */
        public final C1289j f4340k;

        /* renamed from: l */
        public final Object f4341l;

        public C1331a(C1330y0 y0Var, C1332b bVar, C1289j jVar, Object obj) {
            this.f4338i = y0Var;
            this.f4339j = bVar;
            this.f4340k = jVar;
            this.f4341l = obj;
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ Object mo2828m(Object obj) {
            mo5056p((Throwable) obj);
            return C1798k.f5446a;
        }

        /* renamed from: p */
        public void mo5056p(Throwable th) {
            C1330y0 y0Var = this.f4338i;
            C1332b bVar = this.f4339j;
            C1289j jVar = this.f4340k;
            Object obj = this.f4341l;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1330y0.f4337e;
            C1289j M = y0Var.mo5126M(jVar);
            if (M == null || !y0Var.mo5133U(bVar, M, obj)) {
                y0Var.mo5031f(y0Var.mo5139t(bVar, obj));
            }
        }
    }

    /* renamed from: l3.y0$b */
    public static final class C1332b implements C1309p0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: e */
        public final C1267b1 f4342e;

        public C1332b(C1267b1 b1Var, boolean z, Throwable th) {
            this.f4342e = b1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public boolean mo5024a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* renamed from: b */
        public final void mo5142b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> c = mo5143c();
                        c.add(obj);
                        c.add(th);
                        this._exceptionsHolder = c;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(C1241e.m3522p("State is ", obj).toString());
                }
            }
        }

        /* renamed from: c */
        public final ArrayList<Throwable> mo5143c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Throwable mo5144d() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: e */
        public C1267b1 mo5025e() {
            return this.f4342e;
        }

        /* renamed from: f */
        public final boolean mo5145f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: g */
        public final boolean mo5146g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean mo5147h() {
            return this._exceptionsHolder == C1335z0.f4349e;
        }

        /* renamed from: i */
        public final List<Throwable> mo5148i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = mo5143c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c = mo5143c();
                c.add(obj);
                arrayList = c;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(C1241e.m3522p("State is ", obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !C1241e.m3513b(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C1335z0.f4349e;
            return arrayList;
        }

        /* renamed from: j */
        public final void mo5149j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public String toString() {
            StringBuilder a = C0001b.m0a("Finishing[cancelling=");
            a.append(mo5145f());
            a.append(", completing=");
            a.append(this._isCompleting);
            a.append(", rootCause=");
            a.append((Throwable) this._rootCause);
            a.append(", exceptions=");
            a.append(this._exceptionsHolder);
            a.append(", list=");
            a.append(this.f4342e);
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: l3.y0$c */
    public static final class C1333c extends C1465h.C1466a {

        /* renamed from: d */
        public final /* synthetic */ C1330y0 f4343d;

        /* renamed from: e */
        public final /* synthetic */ Object f4344e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1333c(C1465h hVar, C1330y0 y0Var, Object obj) {
            super(hVar);
            this.f4343d = y0Var;
            this.f4344e = obj;
        }

        /* renamed from: c */
        public Object mo5151c(Object obj) {
            C1465h hVar = (C1465h) obj;
            if (this.f4343d.mo5122C() == this.f4344e) {
                return null;
            }
            return C1464g.f4602a;
        }
    }

    public C1330y0(boolean z) {
        this._state = z ? C1335z0.f4351g : C1335z0.f4350f;
        this._parentHandle = null;
    }

    /* renamed from: B */
    public final C1286i mo5121B() {
        return (C1286i) this._parentHandle;
    }

    /* renamed from: C */
    public final Object mo5122C() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C1471l)) {
                return obj;
            }
            ((C1471l) obj).mo5319a(this);
        }
    }

    /* renamed from: D */
    public boolean mo5054D(Throwable th) {
        return false;
    }

    /* renamed from: E */
    public void mo5007E(Throwable th) {
        throw th;
    }

    /* renamed from: G */
    public final void mo5123G(C1317t0 t0Var) {
        if (t0Var == null) {
            this._parentHandle = C1270c1.f4277e;
            return;
        }
        t0Var.mo5108n();
        C1286i c = t0Var.mo5105c(this);
        this._parentHandle = c;
        if (!(mo5122C() instanceof C1309p0)) {
            c.mo5027c();
            this._parentHandle = C1270c1.f4277e;
        }
    }

    /* renamed from: H */
    public boolean mo5124H() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5125I(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo5122C()
            java.lang.Object r0 = r3.mo5132T(r0, r4)
            h.o r1 = p073l3.C1335z0.f4345a
            if (r0 != r1) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            h.o r1 = p073l3.C1335z0.f4346b
            r2 = 1
            if (r0 != r1) goto L_0x0014
            return r2
        L_0x0014:
            h.o r1 = p073l3.C1335z0.f4347c
            if (r0 != r1) goto L_0x0019
            goto L_0x0000
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1330y0.mo5125I(java.lang.Object):boolean");
    }

    /* renamed from: L */
    public String mo5008L() {
        return getClass().getSimpleName();
    }

    /* renamed from: M */
    public final C1289j mo5126M(C1465h hVar) {
        while (hVar.mo5326n()) {
            hVar = hVar.mo5331l();
        }
        while (true) {
            hVar = hVar.mo5330j();
            if (!hVar.mo5326n()) {
                if (hVar instanceof C1289j) {
                    return (C1289j) hVar;
                }
                if (hVar instanceof C1267b1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: N */
    public final void mo5127N(C1267b1 b1Var, Throwable th) {
        C1788b bVar;
        C1788b bVar2 = null;
        for (C1465h hVar = (C1465h) b1Var.mo5329i(); !C1241e.m3513b(hVar, b1Var); hVar = hVar.mo5330j()) {
            if (hVar instanceof C1323v0) {
                C1328x0 x0Var = (C1328x0) hVar;
                try {
                    x0Var.mo5056p(th);
                } catch (Throwable th2) {
                    if (bVar2 == null) {
                        bVar = null;
                    } else {
                        C0955a.m2727a(bVar2, th2);
                        bVar = bVar2;
                    }
                    if (bVar == null) {
                        bVar2 = new C1788b("Exception in completion handler " + x0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar2 != null) {
            mo5007E(bVar2);
        }
        mo5136o(th);
    }

    /* renamed from: O */
    public void mo5009O(Object obj) {
    }

    /* renamed from: P */
    public void mo5128P() {
    }

    /* renamed from: Q */
    public final void mo5129Q(C1328x0 x0Var) {
        C1267b1 b1Var = new C1267b1();
        C1465h.f4604f.lazySet(b1Var, x0Var);
        C1465h.f4603e.lazySet(b1Var, x0Var);
        while (true) {
            if (x0Var.mo5329i() == x0Var) {
                if (C1465h.f4603e.compareAndSet(x0Var, x0Var, b1Var)) {
                    b1Var.mo5328h(x0Var);
                    break;
                }
            } else {
                break;
            }
        }
        f4337e.compareAndSet(this, x0Var, x0Var.mo5330j());
    }

    /* renamed from: R */
    public final String mo5130R(Object obj) {
        if (!(obj instanceof C1332b)) {
            return obj instanceof C1309p0 ? ((C1309p0) obj).mo5024a() ? "Active" : "New" : obj instanceof C1312r ? "Cancelled" : "Completed";
        }
        C1332b bVar = (C1332b) obj;
        return bVar.mo5145f() ? "Cancelling" : bVar.mo5146g() ? "Completing" : "Active";
    }

    /* renamed from: S */
    public final CancellationException mo5131S(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo5014p();
            }
            cancellationException = new C1321u0(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0097, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009a, code lost:
        mo5127N(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if ((r7 instanceof p073l3.C1289j) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        r0 = (p073l3.C1289j) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a6, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a8, code lost:
        r7 = r7.mo5025e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ac, code lost:
        if (r7 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00af, code lost:
        r4 = mo5126M(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b4, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b5, code lost:
        if (r4 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bb, code lost:
        if (mo5133U(r3, r4, r8) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return mo5139t(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return p073l3.C1335z0.f4346b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return r7;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5132T(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p073l3.C1309p0
            if (r0 != 0) goto L_0x0007
            h.o r7 = p073l3.C1335z0.f4345a
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof p073l3.C1284h0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7 instanceof p073l3.C1328x0
            if (r0 == 0) goto L_0x003f
        L_0x0011:
            boolean r0 = r7 instanceof p073l3.C1289j
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof p073l3.C1312r
            if (r0 != 0) goto L_0x003f
            l3.p0 r7 = (p073l3.C1309p0) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4337e
            boolean r3 = r8 instanceof p073l3.C1309p0
            if (r3 == 0) goto L_0x002a
            h.o r3 = new h.o
            r4 = r8
            l3.p0 r4 = (p073l3.C1309p0) r4
            r3.<init>((p073l3.C1309p0) r4)
            goto L_0x002b
        L_0x002a:
            r3 = r8
        L_0x002b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L_0x0033
            r1 = r2
            goto L_0x0039
        L_0x0033:
            r6.mo5009O(r8)
            r6.mo5137r(r7, r8)
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            return r8
        L_0x003c:
            h.o r7 = p073l3.C1335z0.f4347c
            return r7
        L_0x003f:
            l3.p0 r7 = (p073l3.C1309p0) r7
            l3.b1 r0 = r6.mo5141y(r7)
            if (r0 != 0) goto L_0x004b
            h.o r7 = p073l3.C1335z0.f4347c
            goto L_0x00c4
        L_0x004b:
            boolean r3 = r7 instanceof p073l3.C1330y0.C1332b
            r4 = 0
            if (r3 == 0) goto L_0x0054
            r3 = r7
            l3.y0$b r3 = (p073l3.C1330y0.C1332b) r3
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            if (r3 != 0) goto L_0x005c
            l3.y0$b r3 = new l3.y0$b
            r3.<init>(r0, r2, r4)
        L_0x005c:
            monitor-enter(r3)
            boolean r2 = r3.mo5146g()     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0068
            h.o r7 = p073l3.C1335z0.f4345a     // Catch:{ all -> 0x00c5 }
        L_0x0065:
            monitor-exit(r3)
            goto L_0x00c4
        L_0x0068:
            r3.mo5149j(r1)     // Catch:{ all -> 0x00c5 }
            if (r3 == r7) goto L_0x0078
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f4337e     // Catch:{ all -> 0x00c5 }
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch:{ all -> 0x00c5 }
            if (r2 != 0) goto L_0x0078
            h.o r7 = p073l3.C1335z0.f4347c     // Catch:{ all -> 0x00c5 }
            goto L_0x0065
        L_0x0078:
            boolean r2 = r3.mo5145f()     // Catch:{ all -> 0x00c5 }
            boolean r5 = r8 instanceof p073l3.C1312r     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0084
            r5 = r8
            l3.r r5 = (p073l3.C1312r) r5     // Catch:{ all -> 0x00c5 }
            goto L_0x0085
        L_0x0084:
            r5 = r4
        L_0x0085:
            if (r5 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            java.lang.Throwable r5 = r5.f4322a     // Catch:{ all -> 0x00c5 }
            r3.mo5142b(r5)     // Catch:{ all -> 0x00c5 }
        L_0x008d:
            java.lang.Throwable r5 = r3.mo5144d()     // Catch:{ all -> 0x00c5 }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r5 = r4
        L_0x0096:
            monitor-exit(r3)
            if (r5 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r6.mo5127N(r0, r5)
        L_0x009d:
            boolean r0 = r7 instanceof p073l3.C1289j
            if (r0 == 0) goto L_0x00a5
            r0 = r7
            l3.j r0 = (p073l3.C1289j) r0
            goto L_0x00a6
        L_0x00a5:
            r0 = r4
        L_0x00a6:
            if (r0 != 0) goto L_0x00b4
            l3.b1 r7 = r7.mo5025e()
            if (r7 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            l3.j r4 = r6.mo5126M(r7)
            goto L_0x00b5
        L_0x00b4:
            r4 = r0
        L_0x00b5:
            if (r4 == 0) goto L_0x00c0
            boolean r7 = r6.mo5133U(r3, r4, r8)
            if (r7 == 0) goto L_0x00c0
            h.o r7 = p073l3.C1335z0.f4346b
            goto L_0x00c4
        L_0x00c0:
            java.lang.Object r7 = r6.mo5139t(r3, r8)
        L_0x00c4:
            return r7
        L_0x00c5:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1330y0.mo5132T(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: U */
    public final boolean mo5133U(C1332b bVar, C1289j jVar, Object obj) {
        while (C1317t0.C1318a.m3693a(jVar.f4295i, false, false, new C1331a(this, bVar, jVar, obj), 1, (Object) null) == C1270c1.f4277e) {
            jVar = mo5126M(jVar);
            if (jVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo5011a() {
        Object C = mo5122C();
        return (C instanceof C1309p0) && ((C1309p0) C).mo5024a();
    }

    /* renamed from: b */
    public final boolean mo5134b(Object obj, C1267b1 b1Var, C1328x0 x0Var) {
        boolean z;
        C1333c cVar = new C1333c(x0Var, this, obj);
        do {
            C1465h l = b1Var.mo5331l();
            C1465h.f4604f.lazySet(x0Var, l);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1465h.f4603e;
            atomicReferenceFieldUpdater.lazySet(x0Var, b1Var);
            cVar.f4607c = b1Var;
            z = !atomicReferenceFieldUpdater.compareAndSet(l, b1Var, cVar) ? false : cVar.mo5319a(l) == null ? true : true;
            if (z) {
                return true;
            }
        } while (!z);
        return false;
    }

    /* renamed from: c */
    public final C1286i mo5105c(C1294k kVar) {
        return (C1286i) C1317t0.C1318a.m3693a(this, true, false, new C1289j(kVar), 2, (Object) null);
    }

    /* renamed from: f */
    public void mo5031f(Object obj) {
    }

    public <R> R fold(R r, C0640p<? super R, ? super C2046f.C2047a, ? extends R> pVar) {
        return C2046f.C2047a.C2048a.m5382a(this, r, pVar);
    }

    /* renamed from: g */
    public CancellationException mo5039g() {
        Throwable th;
        Object C = mo5122C();
        CancellationException cancellationException = null;
        if (C instanceof C1332b) {
            th = ((C1332b) C).mo5144d();
        } else if (C instanceof C1312r) {
            th = ((C1312r) C).f4322a;
        } else if (!(C instanceof C1309p0)) {
            th = null;
        } else {
            throw new IllegalStateException(C1241e.m3522p("Cannot be cancelling child in this state: ", C).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C1321u0(C1241e.m3522p("Parent job is ", mo5130R(C)), th, this) : cancellationException;
    }

    public <E extends C2046f.C2047a> E get(C2046f.C2049b<E> bVar) {
        return C2046f.C2047a.C2048a.m5383b(this, bVar);
    }

    public final C2046f.C2049b<?> getKey() {
        return C1317t0.C1319b.f4329e;
    }

    public final boolean isCancelled() {
        Object C = mo5122C();
        return (C instanceof C1312r) || ((C instanceof C1332b) && ((C1332b) C).mo5145f());
    }

    /* renamed from: k */
    public final CancellationException mo5107k() {
        Object C = mo5122C();
        if (C instanceof C1332b) {
            Throwable d = ((C1332b) C).mo5144d();
            if (d != null) {
                return mo5131S(d, C1241e.m3522p(getClass().getSimpleName(), " is cancelling"));
            }
            throw new IllegalStateException(C1241e.m3522p("Job is still new or active: ", this).toString());
        } else if (C instanceof C1309p0) {
            throw new IllegalStateException(C1241e.m3522p("Job is still new or active: ", this).toString());
        } else if (C instanceof C1312r) {
            return mo5131S(((C1312r) C).f4322a, (String) null);
        } else {
            return new C1321u0(C1241e.m3522p(getClass().getSimpleName(), " has completed normally"), (Throwable) null, this);
        }
    }

    /* renamed from: l */
    public final void mo5080l(C1276e1 e1Var) {
        mo5135m(e1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x00b8 A[EDGE_INSN: B:83:0x00b8->B:57:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0040 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5135m(java.lang.Object r10) {
        /*
            r9 = this;
            h.o r0 = p073l3.C1335z0.f4345a
            boolean r1 = r9.mo5116x()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
        L_0x000b:
            java.lang.Object r0 = r9.mo5122C()
            boolean r1 = r0 instanceof p073l3.C1309p0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof p073l3.C1330y0.C1332b
            if (r1 == 0) goto L_0x0021
            r1 = r0
            l3.y0$b r1 = (p073l3.C1330y0.C1332b) r1
            boolean r1 = r1.mo5146g()
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            l3.r r1 = new l3.r
            java.lang.Throwable r5 = r9.mo5138s(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.mo5132T(r0, r1)
            h.o r1 = p073l3.C1335z0.f4347c
            if (r0 == r1) goto L_0x000b
            goto L_0x0035
        L_0x0033:
            h.o r0 = p073l3.C1335z0.f4345a
        L_0x0035:
            h.o r1 = p073l3.C1335z0.f4346b
            if (r0 != r1) goto L_0x003a
            return r4
        L_0x003a:
            h.o r1 = p073l3.C1335z0.f4345a
            if (r0 != r1) goto L_0x00e3
            r0 = 0
            r1 = r0
        L_0x0040:
            java.lang.Object r5 = r9.mo5122C()
            boolean r6 = r5 instanceof p073l3.C1330y0.C1332b
            if (r6 == 0) goto L_0x0089
            monitor-enter(r5)
            r2 = r5
            l3.y0$b r2 = (p073l3.C1330y0.C1332b) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.mo5147h()     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0057
            h.o r10 = p073l3.C1335z0.f4348d     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            goto L_0x00e2
        L_0x0057:
            r2 = r5
            l3.y0$b r2 = (p073l3.C1330y0.C1332b) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.mo5145f()     // Catch:{ all -> 0x0086 }
            if (r10 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x006e
        L_0x0062:
            if (r1 != 0) goto L_0x0068
            java.lang.Throwable r1 = r9.mo5138s(r10)     // Catch:{ all -> 0x0086 }
        L_0x0068:
            r10 = r5
            l3.y0$b r10 = (p073l3.C1330y0.C1332b) r10     // Catch:{ all -> 0x0086 }
            r10.mo5142b(r1)     // Catch:{ all -> 0x0086 }
        L_0x006e:
            r10 = r5
            l3.y0$b r10 = (p073l3.C1330y0.C1332b) r10     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r10 = r10.mo5144d()     // Catch:{ all -> 0x0086 }
            r1 = r2 ^ 1
            if (r1 == 0) goto L_0x007a
            r0 = r10
        L_0x007a:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x007e
            goto L_0x00b8
        L_0x007e:
            l3.y0$b r5 = (p073l3.C1330y0.C1332b) r5
            l3.b1 r10 = r5.f4342e
            r9.mo5127N(r10, r0)
            goto L_0x00b8
        L_0x0086:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L_0x0089:
            boolean r6 = r5 instanceof p073l3.C1309p0
            if (r6 == 0) goto L_0x00e0
            if (r1 != 0) goto L_0x0093
            java.lang.Throwable r1 = r9.mo5138s(r10)
        L_0x0093:
            r6 = r5
            l3.p0 r6 = (p073l3.C1309p0) r6
            boolean r7 = r6.mo5024a()
            if (r7 == 0) goto L_0x00bb
            l3.b1 r5 = r9.mo5141y(r6)
            if (r5 != 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            l3.y0$b r7 = new l3.y0$b
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f4337e
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto L_0x00b2
        L_0x00b0:
            r5 = r3
            goto L_0x00b6
        L_0x00b2:
            r9.mo5127N(r5, r1)
            r5 = r4
        L_0x00b6:
            if (r5 == 0) goto L_0x0040
        L_0x00b8:
            h.o r10 = p073l3.C1335z0.f4345a
            goto L_0x00e2
        L_0x00bb:
            l3.r r6 = new l3.r
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.mo5132T(r5, r6)
            h.o r7 = p073l3.C1335z0.f4345a
            if (r6 == r7) goto L_0x00d0
            h.o r5 = p073l3.C1335z0.f4347c
            if (r6 != r5) goto L_0x00ce
            goto L_0x0040
        L_0x00ce:
            r0 = r6
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r10 = "Cannot happen in "
            java.lang.String r10 = p072l2.C1241e.m3522p(r10, r5)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x00e0:
            h.o r10 = p073l3.C1335z0.f4348d
        L_0x00e2:
            r0 = r10
        L_0x00e3:
            h.o r10 = p073l3.C1335z0.f4345a
            if (r0 != r10) goto L_0x00e9
        L_0x00e7:
            r3 = r4
            goto L_0x00f7
        L_0x00e9:
            h.o r10 = p073l3.C1335z0.f4346b
            if (r0 != r10) goto L_0x00ee
            goto L_0x00e7
        L_0x00ee:
            h.o r10 = p073l3.C1335z0.f4348d
            if (r0 != r10) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            r9.mo5031f(r0)
            goto L_0x00e7
        L_0x00f7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1330y0.mo5135m(java.lang.Object):boolean");
    }

    public C2046f minusKey(C2046f.C2049b<?> bVar) {
        return C2046f.C2047a.C2048a.m5384c(this, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (f4337e.compareAndSet(r6, r0, p073l3.C1335z0.f4351g) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (f4337e.compareAndSet(r6, r0, ((p073l3.C1307o0) r0).f4314e) == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:13:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5108n() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.mo5122C()
            boolean r1 = r0 instanceof p073l3.C1284h0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            r1 = r0
            l3.h0 r1 = (p073l3.C1284h0) r1
            boolean r1 = r1.f4289e
            if (r1 == 0) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4337e
            l3.h0 r5 = p073l3.C1335z0.f4351g
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x001e:
            boolean r1 = r0 instanceof p073l3.C1307o0
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4337e
            r5 = r0
            l3.o0 r5 = (p073l3.C1307o0) r5
            l3.b1 r5 = r5.f4314e
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            r6.mo5128P()
            r2 = r4
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x003b
            goto L_0x0000
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1330y0.mo5108n():boolean");
    }

    /* renamed from: o */
    public final boolean mo5136o(Throwable th) {
        if (mo5124H()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C1286i iVar = (C1286i) this._parentHandle;
        if (iVar == null || iVar == C1270c1.f4277e) {
            return z;
        }
        if (iVar.mo5028d(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public String mo5014p() {
        return "Job was cancelled";
    }

    public C2046f plus(C2046f fVar) {
        return C2046f.C2047a.C2048a.m5385d(this, fVar);
    }

    /* renamed from: q */
    public boolean mo5055q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo5135m(th) && mo5115w();
    }

    /* renamed from: r */
    public final void mo5137r(C1309p0 p0Var, Object obj) {
        C1788b bVar;
        C1286i iVar = (C1286i) this._parentHandle;
        if (iVar != null) {
            iVar.mo5027c();
            this._parentHandle = C1270c1.f4277e;
        }
        C1312r rVar = obj instanceof C1312r ? (C1312r) obj : null;
        Throwable th = rVar == null ? null : rVar.f4322a;
        if (p0Var instanceof C1328x0) {
            try {
                ((C1328x0) p0Var).mo5056p(th);
            } catch (Throwable th2) {
                mo5007E(new C1788b("Exception in completion handler " + p0Var + " for " + this, th2));
            }
        } else {
            C1267b1 e = p0Var.mo5025e();
            if (e != null) {
                C1788b bVar2 = null;
                for (C1465h hVar = (C1465h) e.mo5329i(); !C1241e.m3513b(hVar, e); hVar = hVar.mo5330j()) {
                    if (hVar instanceof C1328x0) {
                        C1328x0 x0Var = (C1328x0) hVar;
                        try {
                            x0Var.mo5056p(th);
                        } catch (Throwable th3) {
                            if (bVar2 == null) {
                                bVar = null;
                            } else {
                                C0955a.m2727a(bVar2, th3);
                                bVar = bVar2;
                            }
                            if (bVar == null) {
                                bVar2 = new C1788b("Exception in completion handler " + x0Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (bVar2 != null) {
                    mo5007E(bVar2);
                }
            }
        }
    }

    /* renamed from: s */
    public final Throwable mo5138s(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1321u0(mo5014p(), (Throwable) null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C1276e1) obj).mo5039g();
    }

    /* renamed from: t */
    public final Object mo5139t(C1332b bVar, Object obj) {
        T t = null;
        C1312r rVar = obj instanceof C1312r ? (C1312r) obj : null;
        T t2 = rVar == null ? null : rVar.f4322a;
        synchronized (bVar) {
            bVar.mo5145f();
            List<Throwable> i = bVar.mo5148i(t2);
            if (!i.isEmpty()) {
                Iterator<T> it = i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        t = next;
                        break;
                    }
                }
                t = (Throwable) t;
                if (t == null) {
                    t = (Throwable) i.get(0);
                }
            } else if (bVar.mo5145f()) {
                t = new C1321u0(mo5014p(), (Throwable) null, this);
            }
            if (t != null) {
                if (i.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i.size()));
                    for (T next2 : i) {
                        if (next2 != t && next2 != t && !(next2 instanceof CancellationException) && newSetFromMap.add(next2)) {
                            C0955a.m2727a(t, next2);
                        }
                    }
                }
            }
        }
        if (!(t == null || t == t2)) {
            obj = new C1312r(t, false, 2);
        }
        if (t != null) {
            if (mo5136o(t) || mo5054D(t)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                C1312r.f4321b.compareAndSet((C1312r) obj, 0, 1);
            }
        }
        mo5009O(obj);
        f4337e.compareAndSet(this, bVar, obj instanceof C1309p0 ? new C0990o((C1309p0) obj) : obj);
        mo5137r(bVar, obj);
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5008L() + '{' + mo5130R(mo5122C()) + '}');
        sb.append('@');
        sb.append(C1320u.m3710n(this));
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [l3.o0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073l3.C1281g0 mo5109u(boolean r8, boolean r9, p019c3.C0636l<? super java.lang.Throwable, p120t2.C1798k> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof p073l3.C1323v0
            if (r1 == 0) goto L_0x000b
            r1 = r10
            l3.v0 r1 = (p073l3.C1323v0) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0027
            l3.r0 r1 = new l3.r0
            r1.<init>(r10)
            goto L_0x0027
        L_0x0014:
            boolean r1 = r10 instanceof p073l3.C1328x0
            if (r1 == 0) goto L_0x001c
            r1 = r10
            l3.x0 r1 = (p073l3.C1328x0) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 != 0) goto L_0x0020
            r1 = r0
        L_0x0020:
            if (r1 != 0) goto L_0x0027
            l3.s0 r1 = new l3.s0
            r1.<init>(r10)
        L_0x0027:
            r1.f4335h = r7
        L_0x0029:
            java.lang.Object r2 = r7.mo5122C()
            boolean r3 = r2 instanceof p073l3.C1284h0
            if (r3 == 0) goto L_0x0057
            r3 = r2
            l3.h0 r3 = (p073l3.C1284h0) r3
            boolean r4 = r3.f4289e
            if (r4 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4337e
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x0041:
            l3.b1 r2 = new l3.b1
            r2.<init>()
            boolean r4 = r3.f4289e
            if (r4 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            l3.o0 r4 = new l3.o0
            r4.<init>(r2)
            r2 = r4
        L_0x0051:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f4337e
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0029
        L_0x0057:
            boolean r3 = r2 instanceof p073l3.C1309p0
            if (r3 == 0) goto L_0x00b0
            r3 = r2
            l3.p0 r3 = (p073l3.C1309p0) r3
            l3.b1 r3 = r3.mo5025e()
            if (r3 != 0) goto L_0x006f
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r2, r3)
            l3.x0 r2 = (p073l3.C1328x0) r2
            r7.mo5129Q(r2)
            goto L_0x0029
        L_0x006f:
            l3.c1 r4 = p073l3.C1270c1.f4277e
            if (r8 == 0) goto L_0x00a0
            boolean r5 = r2 instanceof p073l3.C1330y0.C1332b
            if (r5 == 0) goto L_0x00a0
            monitor-enter(r2)
            r5 = r2
            l3.y0$b r5 = (p073l3.C1330y0.C1332b) r5     // Catch:{ all -> 0x009d }
            java.lang.Throwable r5 = r5.mo5144d()     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x008e
            boolean r6 = r10 instanceof p073l3.C1289j     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x009b
            r6 = r2
            l3.y0$b r6 = (p073l3.C1330y0.C1332b) r6     // Catch:{ all -> 0x009d }
            boolean r6 = r6.mo5146g()     // Catch:{ all -> 0x009d }
            if (r6 != 0) goto L_0x009b
        L_0x008e:
            boolean r4 = r7.mo5134b(r2, r3, r1)     // Catch:{ all -> 0x009d }
            if (r4 != 0) goto L_0x0096
            monitor-exit(r2)
            goto L_0x0029
        L_0x0096:
            if (r5 != 0) goto L_0x009a
            monitor-exit(r2)
            return r1
        L_0x009a:
            r4 = r1
        L_0x009b:
            monitor-exit(r2)
            goto L_0x00a1
        L_0x009d:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00a0:
            r5 = r0
        L_0x00a1:
            if (r5 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x00a8
            r10.mo2828m(r5)
        L_0x00a8:
            return r4
        L_0x00a9:
            boolean r2 = r7.mo5134b(r2, r3, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x00b0:
            if (r9 == 0) goto L_0x00c2
            boolean r8 = r2 instanceof p073l3.C1312r
            if (r8 == 0) goto L_0x00b9
            l3.r r2 = (p073l3.C1312r) r2
            goto L_0x00ba
        L_0x00b9:
            r2 = r0
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            java.lang.Throwable r0 = r2.f4322a
        L_0x00bf:
            r10.mo2828m(r0)
        L_0x00c2:
            l3.c1 r8 = p073l3.C1270c1.f4277e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1330y0.mo5109u(boolean, boolean, c3.l):l3.g0");
    }

    /* renamed from: w */
    public boolean mo5115w() {
        return true;
    }

    /* renamed from: x */
    public boolean mo5116x() {
        return this instanceof C1308p;
    }

    /* renamed from: y */
    public final C1267b1 mo5141y(C1309p0 p0Var) {
        C1267b1 e = p0Var.mo5025e();
        if (e != null) {
            return e;
        }
        if (p0Var instanceof C1284h0) {
            return new C1267b1();
        }
        if (p0Var instanceof C1328x0) {
            mo5129Q((C1328x0) p0Var);
            return null;
        }
        throw new IllegalStateException(C1241e.m3522p("State should have list: ", p0Var).toString());
    }

    /* renamed from: z */
    public void mo5110z(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1321u0(mo5014p(), (Throwable) null, this);
        }
        mo5135m(cancellationException);
    }
}
