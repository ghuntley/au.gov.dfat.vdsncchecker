package p073l3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p000a.C0001b;
import p045h.C0990o;
import p085n3.C1458a;
import p085n3.C1468j;
import p085n3.C1479q;
import p085n3.C1480r;
import p138w2.C2046f;

/* renamed from: l3.j0 */
public abstract class C1290j0 extends C1295k0 {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4296i;

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4297j;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: l3.j0$a */
    public static abstract class C1291a implements Runnable, Comparable<C1291a>, C1281g0, C1480r {

        /* renamed from: e */
        public long f4298e;

        /* renamed from: f */
        public Object f4299f;

        /* renamed from: g */
        public int f4300g;

        /* renamed from: a */
        public void mo5074a(int i) {
            this.f4300g = i;
        }

        /* renamed from: b */
        public void mo5075b(C1479q<?> qVar) {
            if (this.f4299f != C1298l0.f4306a) {
                this.f4299f = qVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public final synchronized void mo5027c() {
            Object obj = this.f4299f;
            C0990o oVar = C1298l0.f4306a;
            if (obj != oVar) {
                C1292b bVar = obj instanceof C1292b ? (C1292b) obj : null;
                if (bVar != null) {
                    synchronized (bVar) {
                        if (mo5077e() != null) {
                            bVar.mo5348d(mo5078f());
                        }
                    }
                }
                this.f4299f = oVar;
            }
        }

        public int compareTo(Object obj) {
            int i = ((this.f4298e - ((C1291a) obj).f4298e) > 0 ? 1 : ((this.f4298e - ((C1291a) obj).f4298e) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: e */
        public C1479q<?> mo5077e() {
            Object obj = this.f4299f;
            if (obj instanceof C1479q) {
                return (C1479q) obj;
            }
            return null;
        }

        /* renamed from: f */
        public int mo5078f() {
            return this.f4300g;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("Delayed[nanos=");
            a.append(this.f4298e);
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: l3.j0$b */
    public static final class C1292b extends C1479q<C1291a> {

        /* renamed from: b */
        public long f4301b;

        public C1292b(long j) {
            this.f4301b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C1290j0> cls2 = C1290j0.class;
        f4296i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f4297j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: R */
    public final void mo5067R(C2046f fVar, Runnable runnable) {
        mo5068b0(runnable);
    }

    /* renamed from: Z */
    public void mo5066Z() {
        C1288i1 i1Var = C1288i1.f4293a;
        C1288i1.f4294b.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f4296i.compareAndSet(this, (Object) null, C1298l0.f4307b)) {
                    break;
                }
            } else if (obj instanceof C1468j) {
                ((C1468j) obj).mo5338b();
                break;
            } else if (obj == C1298l0.f4307b) {
                break;
            } else {
                C1468j jVar = new C1468j(8, true);
                jVar.mo5337a((Runnable) obj);
                if (f4296i.compareAndSet(this, obj, jVar)) {
                    break;
                }
            }
        }
        do {
        } while (mo5071e0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C1292b bVar = (C1292b) this._delayed;
            C1291a aVar = bVar == null ? null : (C1291a) bVar.mo5349e();
            if (aVar != null) {
                C1266b0.f4274k.mo5073g0(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b0 */
    public final void mo5068b0(Runnable runnable) {
        if (mo5069c0(runnable)) {
            Thread a0 = mo5020a0();
            if (Thread.currentThread() != a0) {
                LockSupport.unpark(a0);
                return;
            }
            return;
        }
        C1266b0.f4274k.mo5068b0(runnable);
    }

    /* renamed from: c0 */
    public final boolean mo5069c0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f4296i.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C1468j) {
                C1468j jVar = (C1468j) obj;
                int a = jVar.mo5337a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    f4296i.compareAndSet(this, obj, jVar.mo5341e());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C1298l0.f4307b) {
                return false;
            } else {
                C1468j jVar2 = new C1468j(8, true);
                jVar2.mo5337a((Runnable) obj);
                jVar2.mo5337a(runnable);
                if (f4296i.compareAndSet(this, obj, jVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: d0 */
    public boolean mo5070d0() {
        C1458a<C1275e0<?>> aVar = this.f4292h;
        if (!(aVar == null || aVar.f4591b == aVar.f4592c)) {
            return false;
        }
        C1292b bVar = (C1292b) this._delayed;
        if (bVar != null && !bVar.mo5347c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C1468j) {
            return ((C1468j) obj).mo5340d();
        }
        if (obj == C1298l0.f4307b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [n3.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0050 A[EDGE_INSN: B:85:0x0050->B:33:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo5071e0() {
        /*
            r11 = this;
            boolean r0 = r11.mo5065Y()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            l3.j0$b r0 = (p073l3.C1290j0.C1292b) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004c
            boolean r6 = r0.mo5347c()
            if (r6 != 0) goto L_0x004c
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            n3.r r8 = r0.mo5346b()     // Catch:{ all -> 0x0049 }
            if (r8 != 0) goto L_0x0026
            monitor-exit(r0)
            r8 = r5
            goto L_0x0044
        L_0x0026:
            l3.j0$a r8 = (p073l3.C1290j0.C1291a) r8     // Catch:{ all -> 0x0049 }
            long r9 = r8.f4298e     // Catch:{ all -> 0x0049 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0032
            r9 = r3
            goto L_0x0033
        L_0x0032:
            r9 = r4
        L_0x0033:
            if (r9 == 0) goto L_0x003a
            boolean r8 = r11.mo5069c0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x003b
        L_0x003a:
            r8 = r4
        L_0x003b:
            if (r8 == 0) goto L_0x0042
            n3.r r8 = r0.mo5348d(r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0043
        L_0x0042:
            r8 = r5
        L_0x0043:
            monitor-exit(r0)
        L_0x0044:
            l3.j0$a r8 = (p073l3.C1290j0.C1291a) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0052
        L_0x0050:
            r7 = r5
            goto L_0x007e
        L_0x0052:
            boolean r6 = r0 instanceof p085n3.C1468j
            if (r6 == 0) goto L_0x006e
            r6 = r0
            n3.j r6 = (p085n3.C1468j) r6
            java.lang.Object r7 = r6.mo5342f()
            h.o r8 = p085n3.C1468j.f4611g
            if (r7 == r8) goto L_0x0064
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x007e
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f4296i
            n3.j r6 = r6.mo5341e()
            r7.compareAndSet(r11, r0, r6)
            goto L_0x004c
        L_0x006e:
            h.o r6 = p073l3.C1298l0.f4307b
            if (r0 != r6) goto L_0x0073
            goto L_0x0050
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f4296i
            boolean r6 = r6.compareAndSet(r11, r0, r5)
            if (r6 == 0) goto L_0x004c
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r7.run()
            return r1
        L_0x0084:
            n3.a<l3.e0<?>> r0 = r11.f4292h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            int r8 = r0.f4591b
            int r0 = r0.f4592c
            if (r8 != r0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r3 = r4
        L_0x0096:
            if (r3 == 0) goto L_0x009a
        L_0x0098:
            r3 = r6
            goto L_0x009b
        L_0x009a:
            r3 = r1
        L_0x009b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            goto L_0x00db
        L_0x00a0:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r3 = r0 instanceof p085n3.C1468j
            if (r3 == 0) goto L_0x00d6
            n3.j r0 = (p085n3.C1468j) r0
            boolean r0 = r0.mo5340d()
            if (r0 != 0) goto L_0x00b2
            goto L_0x00db
        L_0x00b2:
            java.lang.Object r0 = r11._delayed
            l3.j0$b r0 = (p073l3.C1290j0.C1292b) r0
            if (r0 != 0) goto L_0x00b9
            goto L_0x00c2
        L_0x00b9:
            monitor-enter(r0)
            n3.r r3 = r0.mo5346b()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            r5 = r3
            l3.j0$a r5 = (p073l3.C1290j0.C1291a) r5
        L_0x00c2:
            if (r5 != 0) goto L_0x00c5
            goto L_0x00da
        L_0x00c5:
            long r3 = r5.f4298e
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            r1 = r3
            goto L_0x00db
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            h.o r3 = p073l3.C1298l0.f4307b
            if (r0 != r3) goto L_0x00db
        L_0x00da:
            r1 = r6
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1290j0.mo5071e0():long");
    }

    /* renamed from: f0 */
    public final void mo5072f0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [n3.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if ((r8 - r0.f4301b) > 0) goto L_0x004f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5073g0(long r13, p073l3.C1290j0.C1291a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000a
            r0 = r4
            goto L_0x0062
        L_0x000a:
            java.lang.Object r0 = r12._delayed
            l3.j0$b r0 = (p073l3.C1290j0.C1292b) r0
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4297j
            l3.j0$b r5 = new l3.j0$b
            r5.<init>(r13)
            r0.compareAndSet(r12, r3, r5)
            java.lang.Object r0 = r12._delayed
            l3.j0$b r0 = (p073l3.C1290j0.C1292b) r0
            p072l2.C1241e.m3515e(r0)
        L_0x0021:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f4299f     // Catch:{ all -> 0x00a4 }
            h.o r6 = p073l3.C1298l0.f4306a     // Catch:{ all -> 0x00a4 }
            if (r5 != r6) goto L_0x002a
            r0 = r2
            goto L_0x0061
        L_0x002a:
            monitor-enter(r0)     // Catch:{ all -> 0x00a4 }
            n3.r r5 = r0.mo5346b()     // Catch:{ all -> 0x00a1 }
            l3.j0$a r5 = (p073l3.C1290j0.C1291a) r5     // Catch:{ all -> 0x00a1 }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x0038
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            r0 = r4
            goto L_0x0061
        L_0x0038:
            r6 = 0
            if (r5 != 0) goto L_0x003e
            r8 = r13
            goto L_0x004f
        L_0x003e:
            long r8 = r5.f4298e     // Catch:{ all -> 0x00a1 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0047
            r8 = r13
        L_0x0047:
            long r10 = r0.f4301b     // Catch:{ all -> 0x00a1 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0051
        L_0x004f:
            r0.f4301b = r8     // Catch:{ all -> 0x00a1 }
        L_0x0051:
            long r8 = r15.f4298e     // Catch:{ all -> 0x00a1 }
            long r10 = r0.f4301b     // Catch:{ all -> 0x00a1 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005c
            r15.f4298e = r10     // Catch:{ all -> 0x00a1 }
        L_0x005c:
            r0.mo5345a(r15)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            r0 = r1
        L_0x0061:
            monitor-exit(r15)
        L_0x0062:
            if (r0 == 0) goto L_0x007b
            if (r0 == r4) goto L_0x0075
            if (r0 != r2) goto L_0x0069
            goto L_0x009d
        L_0x0069:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0075:
            l3.b0 r0 = p073l3.C1266b0.f4274k
            r0.mo5073g0(r13, r15)
            goto L_0x009d
        L_0x007b:
            java.lang.Object r13 = r12._delayed
            l3.j0$b r13 = (p073l3.C1290j0.C1292b) r13
            if (r13 != 0) goto L_0x0082
            goto L_0x008b
        L_0x0082:
            monitor-enter(r13)
            n3.r r14 = r13.mo5346b()     // Catch:{ all -> 0x009e }
            monitor-exit(r13)
            r3 = r14
            l3.j0$a r3 = (p073l3.C1290j0.C1291a) r3
        L_0x008b:
            if (r3 != r15) goto L_0x008e
            r1 = r4
        L_0x008e:
            if (r1 == 0) goto L_0x009d
            java.lang.Thread r13 = r12.mo5020a0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x009d
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x009d:
            return
        L_0x009e:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00a1:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            throw r13     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1290j0.mo5073g0(long, l3.j0$a):void");
    }
}
