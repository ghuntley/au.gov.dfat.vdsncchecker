package p085n3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p072l2.C1241e;

/* renamed from: n3.h */
public class C1465h {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4603e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4604f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4605g;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: n3.h$a */
    public static abstract class C1466a extends C1460c<C1465h> {

        /* renamed from: b */
        public final C1465h f4606b;

        /* renamed from: c */
        public C1465h f4607c;

        public C1466a(C1465h hVar) {
            this.f4606b = hVar;
        }

        /* renamed from: b */
        public void mo5320b(Object obj, Object obj2) {
            C1465h hVar = (C1465h) obj;
            boolean z = obj2 == null;
            C1465h hVar2 = z ? this.f4606b : this.f4607c;
            if (hVar2 != null && C1465h.f4603e.compareAndSet(hVar, this, hVar2) && z) {
                C1465h hVar3 = this.f4606b;
                C1465h hVar4 = this.f4607c;
                C1241e.m3515e(hVar4);
                hVar3.mo5328h(hVar4);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C1465h> cls2 = C1465h.class;
        f4603e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f4604f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f4605g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (f4603e.compareAndSet(r2, r1, ((p085n3.C1472m) r3).f4618a) != false) goto L_0x003f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p085n3.C1465h mo5327g(p085n3.C1471l r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            n3.h r7 = (p085n3.C1465h) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4604f
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.mo5326n()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof p085n3.C1471l
            if (r4 == 0) goto L_0x002c
            n3.l r3 = (p085n3.C1471l) r3
            r3.mo5319a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof p085n3.C1472m
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f4603e
            n3.m r3 = (p085n3.C1472m) r3
            n3.h r3 = r3.f4618a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            n3.h r1 = (p085n3.C1465h) r1
            goto L_0x0007
        L_0x0046:
            r2 = r3
            n3.h r2 = (p085n3.C1465h) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: p085n3.C1465h.mo5327g(n3.l):n3.h");
    }

    /* renamed from: h */
    public final void mo5328h(C1465h hVar) {
        C1465h hVar2;
        do {
            hVar2 = (C1465h) hVar._prev;
            if (mo5329i() != hVar) {
                return;
            }
        } while (!f4604f.compareAndSet(hVar, hVar2, this));
        if (mo5326n()) {
            hVar.mo5327g((C1471l) null);
        }
    }

    /* renamed from: i */
    public final Object mo5329i() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C1471l)) {
                return obj;
            }
            ((C1471l) obj).mo5319a(this);
        }
    }

    /* renamed from: j */
    public final C1465h mo5330j() {
        Object i = mo5329i();
        C1465h hVar = null;
        C1472m mVar = i instanceof C1472m ? (C1472m) i : null;
        if (mVar != null) {
            hVar = mVar.f4618a;
        }
        return hVar == null ? (C1465h) i : hVar;
    }

    /* renamed from: l */
    public final C1465h mo5331l() {
        C1465h g = mo5327g((C1471l) null);
        if (g == null) {
            Object obj = this._prev;
            while (true) {
                g = (C1465h) obj;
                if (!g.mo5326n()) {
                    break;
                }
                obj = g._prev;
            }
        }
        return g;
    }

    /* renamed from: n */
    public boolean mo5326n() {
        return mo5329i() instanceof C1472m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5332o() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.mo5329i()
            boolean r1 = r0 instanceof p085n3.C1472m
            if (r1 == 0) goto L_0x000d
            n3.m r0 = (p085n3.C1472m) r0
            n3.h r0 = r0.f4618a
            goto L_0x0031
        L_0x000d:
            if (r0 != r4) goto L_0x0012
            n3.h r0 = (p085n3.C1465h) r0
            goto L_0x0031
        L_0x0012:
            r1 = r0
            n3.h r1 = (p085n3.C1465h) r1
            java.lang.Object r2 = r1._removedRef
            n3.m r2 = (p085n3.C1472m) r2
            if (r2 != 0) goto L_0x0025
            n3.m r2 = new n3.m
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4605g
            r3.lazySet(r1, r2)
        L_0x0025:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4603e
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r1.mo5327g(r0)
        L_0x0031:
            if (r0 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p085n3.C1465h.mo5332o():boolean");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
