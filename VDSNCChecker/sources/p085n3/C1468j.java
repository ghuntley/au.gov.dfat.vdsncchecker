package p085n3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p045h.C0990o;

/* renamed from: n3.j */
public final class C1468j<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4609e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f4610f;

    /* renamed from: g */
    public static final C0990o f4611g = new C0990o("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f4612a;

    /* renamed from: b */
    public final boolean f4613b;

    /* renamed from: c */
    public final int f4614c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f4615d;

    /* renamed from: n3.j$a */
    public static final class C1469a {

        /* renamed from: a */
        public final int f4616a;

        public C1469a(int i) {
            this.f4616a = i;
        }
    }

    static {
        Class<C1468j> cls = C1468j.class;
        f4609e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f4610f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C1468j(int i, boolean z) {
        this.f4612a = i;
        this.f4613b = z;
        int i2 = i - 1;
        this.f4614c = i2;
        this.f4615d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final int mo5337a(E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f4614c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f4613b || this.f4615d.get(i2 & i3) == null) {
                if (f4610f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f4615d.set(i2 & i3, e);
                    C1468j jVar = this;
                    while ((jVar._state & 1152921504606846976L) != 0) {
                        jVar = jVar.mo5341e();
                        Object obj = jVar.f4615d.get(jVar.f4614c & i2);
                        if (!(obj instanceof C1469a) || ((C1469a) obj).f4616a != i2) {
                            jVar = null;
                            continue;
                        } else {
                            jVar.f4615d.set(jVar.f4614c & i2, e);
                            continue;
                        }
                        if (jVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f4612a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo5338b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f4610f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int mo5339c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: d */
    public final boolean mo5340d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p085n3.C1468j<E> mo5341e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f4610f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            n3.j r0 = (p085n3.C1468j) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4609e
            r1 = 0
            n3.j r4 = new n3.j
            int r5 = r10.f4612a
            int r5 = r5 * 2
            boolean r6 = r10.f4613b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f4614c
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f4615d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            n3.j$a r7 = new n3.j$a
            r7.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f4615d
            int r9 = r4.f4614c
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: p085n3.C1468j.mo5341e():n3.j");
    }

    /* renamed from: f */
    public final Object mo5342f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f4611g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f4614c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f4615d.get(i4);
            if (obj == null) {
                if (this.f4613b) {
                    return null;
                }
            } else if (obj instanceof C1469a) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f4610f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f4615d.set(this.f4614c & i, (Object) null);
                    return obj2;
                } else if (this.f4613b) {
                    C1468j jVar = this;
                    while (true) {
                        long j3 = jVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            jVar = jVar.mo5341e();
                        } else {
                            if (f4610f.compareAndSet(jVar, j3, (j3 & -1073741824) | j2)) {
                                jVar.f4615d.set(jVar.f4614c & i5, (Object) null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
