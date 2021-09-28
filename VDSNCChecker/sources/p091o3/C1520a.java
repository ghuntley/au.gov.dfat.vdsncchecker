package p091o3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import p037f3.C0913c;
import p045h.C0990o;
import p072l2.C1241e;
import p073l3.C1320u;
import p130v0.C1964a;

/* renamed from: o3.a */
public final class C1520a implements Executor, Closeable {

    /* renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f4716l = AtomicLongFieldUpdater.newUpdater(C1520a.class, "parkedWorkersStack");

    /* renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater f4717m = AtomicLongFieldUpdater.newUpdater(C1520a.class, "controlState");

    /* renamed from: n */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4718n = AtomicIntegerFieldUpdater.newUpdater(C1520a.class, "_isTerminated");

    /* renamed from: o */
    public static final C0990o f4719o = new C0990o("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: e */
    public final int f4720e;

    /* renamed from: f */
    public final int f4721f;

    /* renamed from: g */
    public final long f4722g;

    /* renamed from: h */
    public final String f4723h;

    /* renamed from: i */
    public final C1525d f4724i;

    /* renamed from: j */
    public final C1525d f4725j;

    /* renamed from: k */
    public final AtomicReferenceArray<C1521a> f4726k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: o3.a$a */
    public final class C1521a extends Thread {

        /* renamed from: l */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f4727l = AtomicIntegerFieldUpdater.newUpdater(C1521a.class, "workerCtl");

        /* renamed from: e */
        public final C1534m f4728e = new C1534m();

        /* renamed from: f */
        public C1522b f4729f = C1522b.DORMANT;

        /* renamed from: g */
        public long f4730g;

        /* renamed from: h */
        public long f4731h;

        /* renamed from: i */
        public int f4732i;
        private volatile int indexInArray;

        /* renamed from: j */
        public boolean f4733j;
        private volatile Object nextParkedWorker = C1520a.f4719o;
        public volatile /* synthetic */ int workerCtl = 0;

        public C1521a(int i) {
            C1520a.this = C1520a.this;
            setDaemon(true);
            C0913c.C0914a aVar = C0913c.f3436f;
            this.f4732i = C0913c.f3435e.mo4233a();
            mo5471f(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p091o3.C1530i mo5466a(boolean r11) {
            /*
                r10 = this;
                o3.a$b r0 = p091o3.C1520a.C1522b.CPU_ACQUIRED
                o3.a$b r1 = r10.f4729f
                r2 = 0
                r3 = 1
                if (r1 != r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                o3.a r1 = p091o3.C1520a.this
            L_0x000b:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r4 = (int) r4
                if (r4 != 0) goto L_0x001b
                r1 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p091o3.C1520a.f4717m
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L_0x000b
                r1 = r3
            L_0x002c:
                if (r1 == 0) goto L_0x0032
                r10.f4729f = r0
            L_0x0030:
                r0 = r3
                goto L_0x0033
            L_0x0032:
                r0 = r2
            L_0x0033:
                if (r0 == 0) goto L_0x0069
                if (r11 == 0) goto L_0x005e
                o3.a r11 = p091o3.C1520a.this
                int r11 = r11.f4720e
                int r11 = r11 * 2
                int r11 = r10.mo5469d(r11)
                if (r11 != 0) goto L_0x0044
                goto L_0x0045
            L_0x0044:
                r3 = r2
            L_0x0045:
                if (r3 == 0) goto L_0x004d
                o3.i r11 = r10.mo5470e()
                if (r11 != 0) goto L_0x0068
            L_0x004d:
                o3.m r11 = r10.f4728e
                o3.i r11 = r11.mo5488e()
                if (r11 != 0) goto L_0x0068
                if (r3 != 0) goto L_0x0064
                o3.i r11 = r10.mo5470e()
                if (r11 != 0) goto L_0x0068
                goto L_0x0064
            L_0x005e:
                o3.i r11 = r10.mo5470e()
                if (r11 != 0) goto L_0x0068
            L_0x0064:
                o3.i r11 = r10.mo5474i(r2)
            L_0x0068:
                return r11
            L_0x0069:
                if (r11 == 0) goto L_0x0073
                o3.m r11 = r10.f4728e
                o3.i r11 = r11.mo5488e()
                if (r11 != 0) goto L_0x007d
            L_0x0073:
                o3.a r11 = p091o3.C1520a.this
                o3.d r11 = r11.f4725j
                java.lang.Object r11 = r11.mo5336d()
                o3.i r11 = (p091o3.C1530i) r11
            L_0x007d:
                if (r11 != 0) goto L_0x0083
                o3.i r11 = r10.mo5474i(r3)
            L_0x0083:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p091o3.C1520a.C1521a.mo5466a(boolean):o3.i");
        }

        /* renamed from: b */
        public final int mo5467b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final Object mo5468c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int mo5469d(int i) {
            int i2 = this.f4732i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f4732i = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: e */
        public final C1530i mo5470e() {
            C1525d dVar;
            if (mo5469d(2) == 0) {
                C1530i iVar = (C1530i) C1520a.this.f4724i.mo5336d();
                if (iVar != null) {
                    return iVar;
                }
                dVar = C1520a.this.f4725j;
            } else {
                C1530i iVar2 = (C1530i) C1520a.this.f4725j.mo5336d();
                if (iVar2 != null) {
                    return iVar2;
                }
                dVar = C1520a.this.f4724i;
            }
            return (C1530i) dVar.mo5336d();
        }

        /* renamed from: f */
        public final void mo5471f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1520a.this.f4723h);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void mo5472g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean mo5473h(C1522b bVar) {
            C1522b bVar2 = this.f4729f;
            boolean z = bVar2 == C1522b.CPU_ACQUIRED;
            if (z) {
                C1520a.f4717m.addAndGet(C1520a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f4729f = bVar;
            }
            return z;
        }

        /* renamed from: i */
        public final C1530i mo5474i(boolean z) {
            long j;
            int i = (int) (C1520a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d = mo5469d(i);
            C1520a aVar = C1520a.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                d++;
                if (d > i) {
                    d = 1;
                }
                C1521a aVar2 = aVar.f4726k.get(d);
                if (!(aVar2 == null || aVar2 == this)) {
                    C1534m mVar = this.f4728e;
                    C1534m mVar2 = aVar2.f4728e;
                    if (z) {
                        j = mVar.mo5490g(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        C1530i f = mVar2.mo5489f();
                        if (f != null) {
                            mVar.mo5484a(f, false);
                            j = -1;
                        } else {
                            j = mVar.mo5491h(mVar2, false);
                        }
                    }
                    if (j == -1) {
                        return this.f4728e.mo5488e();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f4731h = j2;
            return null;
        }

        public void run() {
            C1522b bVar = C1522b.PARKING;
            C1522b bVar2 = C1522b.TERMINATED;
            loop0:
            while (true) {
                boolean z = false;
                while (!C1520a.this.mo5458i() && this.f4729f != bVar2) {
                    C1530i a = mo5466a(this.f4733j);
                    if (a == null) {
                        this.f4733j = false;
                        if (this.f4731h == 0) {
                            if (this.nextParkedWorker != C1520a.f4719o) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != C1520a.f4719o) || this.workerCtl != -1 || C1520a.this.mo5458i() || this.f4729f == bVar2) {
                                        break;
                                    }
                                    mo5473h(bVar);
                                    Thread.interrupted();
                                    if (this.f4730g == 0) {
                                        this.f4730g = System.nanoTime() + C1520a.this.f4722g;
                                    }
                                    LockSupport.parkNanos(C1520a.this.f4722g);
                                    if (System.nanoTime() - this.f4730g >= 0) {
                                        this.f4730g = 0;
                                        C1520a aVar = C1520a.this;
                                        synchronized (aVar.f4726k) {
                                            if (!aVar.mo5458i()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f4720e) {
                                                    if (f4727l.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        mo5471f(0);
                                                        aVar.mo5461n(this, i, 0);
                                                        int andDecrement = (int) (C1520a.f4717m.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i) {
                                                            C1521a aVar2 = aVar.f4726k.get(andDecrement);
                                                            C1241e.m3515e(aVar2);
                                                            aVar.f4726k.set(i, aVar2);
                                                            aVar2.mo5471f(i);
                                                            aVar.mo5461n(aVar2, andDecrement, i);
                                                        }
                                                        aVar.f4726k.set(andDecrement, (Object) null);
                                                        this.f4729f = bVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C1520a.this.mo5460l(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            mo5473h(bVar);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4731h);
                            this.f4731h = 0;
                        }
                    } else {
                        this.f4731h = 0;
                        C1522b bVar3 = C1522b.BLOCKING;
                        int v = a.f4757f.mo5481v();
                        this.f4730g = 0;
                        if (this.f4729f == bVar) {
                            this.f4729f = bVar3;
                        }
                        if (v != 0 && mo5473h(bVar3)) {
                            C1520a.this.mo5464v();
                        }
                        C1520a.this.mo5463u(a);
                        if (v != 0) {
                            C1520a.f4717m.addAndGet(C1520a.this, -2097152);
                            if (this.f4729f != bVar2) {
                                this.f4729f = C1522b.DORMANT;
                            }
                        }
                    }
                }
            }
            mo5473h(bVar2);
        }
    }

    /* renamed from: o3.a$b */
    public enum C1522b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C1520a(int i, int i2, long j, String str) {
        this.f4720e = i;
        this.f4721f = i2;
        this.f4722g = j;
        this.f4723h = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.f4724i = new C1525d();
                        this.f4725j = new C1525d();
                        this.parkedWorkersStack = 0;
                        this.f4726k = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(C1964a.m5271a("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(C1964a.m5271a("Core pool size ", i, " should be at least 1").toString());
    }

    /* renamed from: A */
    public final boolean mo5451A() {
        while (true) {
            long j = this.parkedWorkersStack;
            C1521a aVar = this.f4726k.get((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                int k = mo5459k(aVar);
                if (k < 0) {
                    continue;
                } else {
                    if (f4716l.compareAndSet(this, j, ((long) k) | j2)) {
                        aVar.mo5472g(f4719o);
                    } else {
                        continue;
                    }
                }
            }
            if (aVar == null) {
                return false;
            }
            if (C1521a.f4727l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5452a() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<o3.a$a> r0 = r10.f4726k
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x000a
            r1 = -1
        L_0x0008:
            monitor-exit(r0)
            return r1
        L_0x000a:
            long r1 = r10.controlState     // Catch:{ all -> 0x0077 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0077 }
            int r1 = r5 - r1
            r2 = 0
            if (r1 >= 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            int r6 = r10.f4720e     // Catch:{ all -> 0x0077 }
            if (r1 < r6) goto L_0x0028
            monitor-exit(r0)
            return r2
        L_0x0028:
            int r6 = r10.f4721f     // Catch:{ all -> 0x0077 }
            if (r5 < r6) goto L_0x002e
            monitor-exit(r0)
            return r2
        L_0x002e:
            long r5 = r10.controlState     // Catch:{ all -> 0x0077 }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceArray<o3.a$a> r7 = r10.f4726k     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0077 }
            if (r7 != 0) goto L_0x0040
            r7 = r6
            goto L_0x0041
        L_0x0040:
            r7 = r2
        L_0x0041:
            if (r7 == 0) goto L_0x006b
            o3.a$a r7 = new o3.a$a     // Catch:{ all -> 0x0077 }
            r7.<init>(r5)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceArray<o3.a$a> r8 = r10.f4726k     // Catch:{ all -> 0x0077 }
            r8.set(r5, r7)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f4717m     // Catch:{ all -> 0x0077 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0077 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0077 }
            if (r5 != r3) goto L_0x0058
            r2 = r6
        L_0x0058:
            if (r2 == 0) goto L_0x005f
            r7.start()     // Catch:{ all -> 0x0077 }
            int r1 = r1 + r6
            goto L_0x0008
        L_0x005f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p091o3.C1520a.mo5452a():int");
    }

    /* renamed from: c */
    public final C1530i mo5453c(Runnable runnable, C1531j jVar) {
        Objects.requireNonNull((C1527f) C1533l.f4763e);
        long nanoTime = System.nanoTime();
        if (!(runnable instanceof C1530i)) {
            return new C1532k(runnable, nanoTime, jVar);
        }
        C1530i iVar = (C1530i) runnable;
        iVar.f4756e = nanoTime;
        iVar.f4757f = jVar;
        return iVar;
    }

    public void close() {
        int i;
        boolean z;
        if (f4718n.compareAndSet(this, 0, 1)) {
            C1521a g = mo5456g();
            synchronized (this.f4726k) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C1521a aVar = this.f4726k.get(i2);
                    C1241e.m3515e(aVar);
                    if (aVar != g) {
                        while (aVar.isAlive()) {
                            LockSupport.unpark(aVar);
                            aVar.join(10000);
                        }
                        C1534m mVar = aVar.f4728e;
                        C1525d dVar = this.f4725j;
                        Objects.requireNonNull(mVar);
                        C1530i iVar = (C1530i) C1534m.f4764b.getAndSet(mVar, (Object) null);
                        if (iVar != null) {
                            dVar.mo5333a(iVar);
                        }
                        do {
                            C1530i f = mVar.mo5489f();
                            if (f == null) {
                                z = false;
                                continue;
                            } else {
                                dVar.mo5333a(f);
                                z = true;
                                continue;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f4725j.mo5334b();
            this.f4724i.mo5334b();
            while (true) {
                C1530i a = g == null ? null : g.mo5466a(true);
                if (a == null) {
                    a = (C1530i) this.f4724i.mo5336d();
                }
                if (a == null && (a = (C1530i) this.f4725j.mo5336d()) == null) {
                    break;
                }
                mo5463u(a);
            }
            if (g != null) {
                g.mo5473h(C1522b.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public void execute(Runnable runnable) {
        mo5457h(runnable, C1528g.f4755e, false);
    }

    /* renamed from: g */
    public final C1521a mo5456g() {
        Thread currentThread = Thread.currentThread();
        C1521a aVar = currentThread instanceof C1521a ? (C1521a) currentThread : null;
        if (aVar != null && C1241e.m3513b(C1520a.this, this)) {
            return aVar;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo5457h(Runnable runnable, C1531j jVar, boolean z) {
        C1530i iVar;
        C1530i c = mo5453c(runnable, jVar);
        C1521a g = mo5456g();
        boolean z2 = true;
        if (g == null || g.f4729f == C1522b.TERMINATED || (c.f4757f.mo5481v() == 0 && g.f4729f == C1522b.BLOCKING)) {
            iVar = c;
        } else {
            g.f4733j = true;
            iVar = g.f4728e.mo5484a(c, z);
        }
        if (iVar != null) {
            if (!(iVar.f4757f.mo5481v() == 1 ? this.f4725j : this.f4724i).mo5333a(iVar)) {
                throw new RejectedExecutionException(C1241e.m3522p(this.f4723h, " was terminated"));
            }
        }
        if (!z || g == null) {
            z2 = false;
        }
        if (c.f4757f.mo5481v() != 0) {
            long addAndGet = f4717m.addAndGet(this, 2097152);
            if (!z2 && !mo5451A() && !mo5465z(addAndGet)) {
                mo5451A();
            }
        } else if (!z2) {
            mo5464v();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: i */
    public final boolean mo5458i() {
        return this._isTerminated;
    }

    /* renamed from: k */
    public final int mo5459k(C1521a aVar) {
        int b;
        do {
            Object c = aVar.mo5468c();
            if (c == f4719o) {
                return -1;
            }
            if (c == null) {
                return 0;
            }
            aVar = (C1521a) c;
            b = aVar.mo5467b();
        } while (b == 0);
        return b;
    }

    /* renamed from: l */
    public final boolean mo5460l(C1521a aVar) {
        long j;
        int b;
        if (aVar.mo5468c() != f4719o) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            b = aVar.mo5467b();
            aVar.mo5472g(this.f4726k.get((int) (2097151 & j)));
        } while (!f4716l.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) b)));
        return true;
    }

    /* renamed from: n */
    public final void mo5461n(C1521a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? mo5459k(aVar) : i2;
            }
            if (i3 >= 0) {
                if (f4716l.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        int length = this.f4726k.length();
        int i5 = 0;
        if (1 < length) {
            i3 = 0;
            int i6 = 0;
            i2 = 0;
            i = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                C1521a aVar = this.f4726k.get(i7);
                if (aVar != null) {
                    int d = aVar.f4728e.mo5487d();
                    int ordinal = aVar.f4729f.ordinal();
                    if (ordinal == 0) {
                        i6++;
                        sb = new StringBuilder();
                        sb.append(d);
                        c = 'c';
                    } else if (ordinal == 1) {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(d);
                        c = 'b';
                    } else if (ordinal == 2) {
                        i5++;
                    } else if (ordinal == 3) {
                        i2++;
                        if (d > 0) {
                            sb = new StringBuilder();
                            sb.append(d);
                            c = 'd';
                        }
                    } else if (ordinal == 4) {
                        i++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i4 = i5;
            i5 = i6;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j = this.controlState;
        return this.f4723h + '@' + C1320u.m3710n(this) + "[Pool Size {core = " + this.f4720e + ", max = " + this.f4721f + "}, Worker States {CPU = " + i5 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4724i.mo5335c() + ", global blocking queue size = " + this.f4725j.mo5335c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f4720e - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void mo5463u(C1530i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: v */
    public final void mo5464v() {
        if (!mo5451A() && !mo5465z(this.controlState)) {
            mo5451A();
        }
    }

    /* renamed from: z */
    public final boolean mo5465z(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f4720e) {
            int a = mo5452a();
            if (a == 1 && this.f4720e > 1) {
                mo5452a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }
}
