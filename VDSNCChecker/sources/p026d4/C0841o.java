package p026d4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import p059j1.C1087a;
import p062j4.C1104a0;
import p062j4.C1107c;
import p062j4.C1112f;
import p062j4.C1132x;
import p062j4.C1134z;
import p072l2.C1241e;
import p099q.C1589b;
import p139w3.C2103w;
import p144x3.C2129c;
import p154z3.C2207c;

/* renamed from: d4.o */
public final class C0841o {

    /* renamed from: a */
    public long f3260a;

    /* renamed from: b */
    public long f3261b;

    /* renamed from: c */
    public long f3262c;

    /* renamed from: d */
    public long f3263d;

    /* renamed from: e */
    public final ArrayDeque<C2103w> f3264e;

    /* renamed from: f */
    public boolean f3265f;

    /* renamed from: g */
    public final C0843b f3266g;

    /* renamed from: h */
    public final C0842a f3267h;

    /* renamed from: i */
    public final C0844c f3268i = new C0844c();

    /* renamed from: j */
    public final C0844c f3269j = new C0844c();

    /* renamed from: k */
    public C0814b f3270k;

    /* renamed from: l */
    public IOException f3271l;

    /* renamed from: m */
    public final int f3272m;

    /* renamed from: n */
    public final C0820f f3273n;

    /* renamed from: d4.o$a */
    public final class C0842a implements C1132x {

        /* renamed from: e */
        public final C1112f f3274e = new C1112f();

        /* renamed from: f */
        public boolean f3275f;

        /* renamed from: g */
        public boolean f3276g;

        public C0842a(boolean z) {
            this.f3276g = z;
        }

        /* renamed from: O */
        public void mo15O(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "source");
            byte[] bArr = C2129c.f6169a;
            this.f3274e.mo15O(fVar, j);
            while (this.f3274e.f3888f >= 16384) {
                mo4109a(false);
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r12.f3277h.f3269j.mo4112l();
            r12.f3277h.mo4098b();
            r1 = r12.f3277h;
            r10 = java.lang.Math.min(r1.f3263d - r1.f3262c, r12.f3274e.f3888f);
            r1 = r12.f3277h;
            r1.f3262c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r13 == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            if (r10 != r12.f3274e.f3888f) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            if (r1.mo4102f() != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            r8 = r13;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4109a(boolean r13) {
            /*
                r12 = this;
                d4.o r0 = p026d4.C0841o.this
                monitor-enter(r0)
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                d4.o$c r1 = r1.f3269j     // Catch:{ all -> 0x008b }
                r1.mo4605h()     // Catch:{ all -> 0x008b }
            L_0x000a:
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x0082 }
                long r2 = r1.f3262c     // Catch:{ all -> 0x0082 }
                long r4 = r1.f3263d     // Catch:{ all -> 0x0082 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0028
                boolean r2 = r12.f3276g     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                boolean r2 = r12.f3275f     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                d4.b r1 = r1.mo4102f()     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0028
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x0082 }
                r1.mo4108l()     // Catch:{ all -> 0x0082 }
                goto L_0x000a
            L_0x0028:
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                d4.o$c r1 = r1.f3269j     // Catch:{ all -> 0x008b }
                r1.mo4112l()     // Catch:{ all -> 0x008b }
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                r1.mo4098b()     // Catch:{ all -> 0x008b }
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.f3263d     // Catch:{ all -> 0x008b }
                long r4 = r1.f3262c     // Catch:{ all -> 0x008b }
                long r2 = r2 - r4
                j4.f r1 = r12.f3274e     // Catch:{ all -> 0x008b }
                long r4 = r1.f3888f     // Catch:{ all -> 0x008b }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x008b }
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.f3262c     // Catch:{ all -> 0x008b }
                long r2 = r2 + r10
                r1.f3262c = r2     // Catch:{ all -> 0x008b }
                if (r13 == 0) goto L_0x005c
                j4.f r13 = r12.f3274e     // Catch:{ all -> 0x008b }
                long r2 = r13.f3888f     // Catch:{ all -> 0x008b }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x005c
                d4.b r13 = r1.mo4102f()     // Catch:{ all -> 0x008b }
                if (r13 != 0) goto L_0x005c
                r13 = 1
                goto L_0x005d
            L_0x005c:
                r13 = 0
            L_0x005d:
                r8 = r13
                monitor-exit(r0)
                d4.o r13 = p026d4.C0841o.this
                d4.o$c r13 = r13.f3269j
                r13.mo4605h()
                d4.o r13 = p026d4.C0841o.this     // Catch:{ all -> 0x0079 }
                d4.f r6 = r13.f3273n     // Catch:{ all -> 0x0079 }
                int r7 = r13.f3272m     // Catch:{ all -> 0x0079 }
                j4.f r9 = r12.f3274e     // Catch:{ all -> 0x0079 }
                r6.mo4078l(r7, r8, r9, r10)     // Catch:{ all -> 0x0079 }
                d4.o r13 = p026d4.C0841o.this
                d4.o$c r13 = r13.f3269j
                r13.mo4112l()
                return
            L_0x0079:
                r13 = move-exception
                d4.o r0 = p026d4.C0841o.this
                d4.o$c r0 = r0.f3269j
                r0.mo4112l()
                throw r13
            L_0x0082:
                r13 = move-exception
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x008b }
                d4.o$c r1 = r1.f3269j     // Catch:{ all -> 0x008b }
                r1.mo4112l()     // Catch:{ all -> 0x008b }
                throw r13     // Catch:{ all -> 0x008b }
            L_0x008b:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p026d4.C0841o.C0842a.mo4109a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            r0 = r14.f3277h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            if (r0.f3267h.f3276g != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r14.f3274e.f3888f <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            if (r14.f3274e.f3888f <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
            mo4109a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            r0.f3273n.mo4078l(r0.f3272m, true, (p062j4.C1112f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = r14.f3277h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r14.f3275f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r14.f3277h.f3273n.f3169D.flush();
            r14.f3277h.mo4097a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r14 = this;
                d4.o r0 = p026d4.C0841o.this
                byte[] r1 = p144x3.C2129c.f6169a
                monitor-enter(r0)
                boolean r1 = r14.f3275f     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                d4.o r1 = p026d4.C0841o.this     // Catch:{ all -> 0x005f }
                d4.b r1 = r1.mo4102f()     // Catch:{ all -> 0x005f }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                d4.o r0 = p026d4.C0841o.this
                d4.o$a r4 = r0.f3267h
                boolean r4 = r4.f3276g
                if (r4 != 0) goto L_0x0047
                j4.f r4 = r14.f3274e
                long r4 = r4.f3888f
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                j4.f r0 = r14.f3274e
                long r0 = r0.f3888f
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.mo4109a(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                d4.f r8 = r0.f3273n
                int r9 = r0.f3272m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.mo4078l(r9, r10, r11, r12)
            L_0x0047:
                d4.o r0 = p026d4.C0841o.this
                monitor-enter(r0)
                r14.f3275f = r3     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                d4.o r0 = p026d4.C0841o.this
                d4.f r0 = r0.f3273n
                d4.p r0 = r0.f3169D
                r0.flush()
                d4.o r0 = p026d4.C0841o.this
                r0.mo4097a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p026d4.C0841o.C0842a.close():void");
        }

        /* renamed from: d */
        public C1104a0 mo2836d() {
            return C0841o.this.f3269j;
        }

        public void flush() {
            C0841o oVar = C0841o.this;
            byte[] bArr = C2129c.f6169a;
            synchronized (oVar) {
                C0841o.this.mo4098b();
            }
            while (this.f3274e.f3888f > 0) {
                mo4109a(false);
                C0841o.this.f3273n.f3169D.flush();
            }
        }
    }

    /* renamed from: d4.o$b */
    public final class C0843b implements C1134z {

        /* renamed from: e */
        public final C1112f f3278e = new C1112f();

        /* renamed from: f */
        public final C1112f f3279f = new C1112f();

        /* renamed from: g */
        public boolean f3280g;

        /* renamed from: h */
        public final long f3281h;

        /* renamed from: i */
        public boolean f3282i;

        public C0843b(long j, boolean z) {
            this.f3281h = j;
            this.f3282i = z;
        }

        /* renamed from: a */
        public final void mo4110a(long j) {
            C0841o oVar = C0841o.this;
            byte[] bArr = C2129c.f6169a;
            oVar.f3273n.mo4077k(j);
        }

        public void close() {
            long j;
            synchronized (C0841o.this) {
                this.f3280g = true;
                C1112f fVar = this.f3279f;
                j = fVar.f3888f;
                fVar.mo4654q(j);
                C0841o oVar = C0841o.this;
                if (oVar != null) {
                    oVar.notifyAll();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                mo4110a(j);
            }
            C0841o.this.mo4097a();
        }

        /* renamed from: d */
        public C1104a0 mo2835d() {
            return C0841o.this.f3268i;
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            long j2;
            boolean z;
            long j3;
            C1112f fVar2 = fVar;
            long j4 = j;
            C1241e.m3517j(fVar2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    Throwable th = null;
                    synchronized (C0841o.this) {
                        C0841o.this.f3268i.mo4605h();
                        try {
                            if (C0841o.this.mo4102f() != null) {
                                th = C0841o.this.f3271l;
                                if (th == null) {
                                    C0814b f = C0841o.this.mo4102f();
                                    C1241e.m3515e(f);
                                    th = new C0851u(f);
                                }
                            }
                            if (!this.f3280g) {
                                C1112f fVar3 = this.f3279f;
                                long j6 = fVar3.f3888f;
                                if (j6 > j5) {
                                    j3 = fVar3.mo21o(fVar2, Math.min(j4, j6));
                                    C0841o oVar = C0841o.this;
                                    long j7 = oVar.f3260a + j3;
                                    oVar.f3260a = j7;
                                    long j8 = j7 - oVar.f3261b;
                                    if (th == null && j8 >= ((long) (oVar.f3273n.f3190w.mo4129a() / 2))) {
                                        C0841o oVar2 = C0841o.this;
                                        oVar2.f3273n.mo4081v(oVar2.f3272m, j8);
                                        C0841o oVar3 = C0841o.this;
                                        oVar3.f3261b = oVar3.f3260a;
                                    }
                                } else if (this.f3282i || th != null) {
                                    j3 = -1;
                                } else {
                                    C0841o.this.mo4108l();
                                    z = true;
                                    j2 = -1;
                                }
                                long j9 = j3;
                                z = false;
                                j2 = j9;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C0841o.this.f3268i.mo4112l();
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j2 != -1) {
                        mo4110a(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j4).toString());
            }
        }
    }

    /* renamed from: d4.o$c */
    public final class C0844c extends C1107c {
        public C0844c() {
        }

        /* renamed from: j */
        public IOException mo4111j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: k */
        public void mo39k() {
            C0841o.this.mo4101e(C0814b.CANCEL);
            C0820f fVar = C0841o.this.f3273n;
            synchronized (fVar) {
                long j = fVar.f3187t;
                long j2 = fVar.f3186s;
                if (j >= j2) {
                    fVar.f3186s = j2 + 1;
                    fVar.f3189v = System.nanoTime() + ((long) 1000000000);
                    C2207c cVar = fVar.f3180m;
                    String a = C1589b.m4444a(new StringBuilder(), fVar.f3175h, " ping");
                    cVar.mo6767c(new C0836l(a, true, a, true, fVar), 0);
                }
            }
        }

        /* renamed from: l */
        public final void mo4112l() {
            if (mo4606i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public C0841o(int i, C0820f fVar, boolean z, boolean z2, C2103w wVar) {
        C1241e.m3517j(fVar, "connection");
        this.f3272m = i;
        this.f3273n = fVar;
        this.f3263d = (long) fVar.f3191x.mo4129a();
        ArrayDeque<C2103w> arrayDeque = new ArrayDeque<>();
        this.f3264e = arrayDeque;
        this.f3266g = new C0843b((long) fVar.f3190w.mo4129a(), z2);
        this.f3267h = new C0842a(z);
        if (wVar != null) {
            if (!mo4104h()) {
                arrayDeque.add(wVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo4104h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: a */
    public final void mo4097a() {
        boolean z;
        boolean i;
        byte[] bArr = C2129c.f6169a;
        synchronized (this) {
            C0843b bVar = this.f3266g;
            if (!bVar.f3282i && bVar.f3280g) {
                C0842a aVar = this.f3267h;
                if (aVar.f3276g || aVar.f3275f) {
                    z = true;
                    i = mo4105i();
                }
            }
            z = false;
            i = mo4105i();
        }
        if (z) {
            mo4099c(C0814b.CANCEL, (IOException) null);
        } else if (!i) {
            this.f3273n.mo4075h(this.f3272m);
        }
    }

    /* renamed from: b */
    public final void mo4098b() {
        C0842a aVar = this.f3267h;
        if (aVar.f3275f) {
            throw new IOException("stream closed");
        } else if (aVar.f3276g) {
            throw new IOException("stream finished");
        } else if (this.f3270k != null) {
            Throwable th = this.f3271l;
            if (th == null) {
                C0814b bVar = this.f3270k;
                C1241e.m3515e(bVar);
                th = new C0851u(bVar);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo4099c(C0814b bVar, IOException iOException) {
        if (mo4100d(bVar, iOException)) {
            C0820f fVar = this.f3273n;
            int i = this.f3272m;
            Objects.requireNonNull(fVar);
            fVar.f3169D.mo4121l(i, bVar);
        }
    }

    /* renamed from: d */
    public final boolean mo4100d(C0814b bVar, IOException iOException) {
        byte[] bArr = C2129c.f6169a;
        synchronized (this) {
            if (this.f3270k != null) {
                return false;
            }
            if (this.f3266g.f3282i && this.f3267h.f3276g) {
                return false;
            }
            this.f3270k = bVar;
            this.f3271l = iOException;
            notifyAll();
            this.f3273n.mo4075h(this.f3272m);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo4101e(C0814b bVar) {
        if (mo4100d(bVar, (IOException) null)) {
            this.f3273n.mo4080u(this.f3272m, bVar);
        }
    }

    /* renamed from: f */
    public final synchronized C0814b mo4102f() {
        return this.f3270k;
    }

    /* renamed from: g */
    public final C1132x mo4103g() {
        synchronized (this) {
            if (!(this.f3265f || mo4104h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f3267h;
    }

    /* renamed from: h */
    public final boolean mo4104h() {
        return this.f3273n.f3172e == ((this.f3272m & 1) == 1);
    }

    /* renamed from: i */
    public final synchronized boolean mo4105i() {
        if (this.f3270k != null) {
            return false;
        }
        C0843b bVar = this.f3266g;
        if (bVar.f3282i || bVar.f3280g) {
            C0842a aVar = this.f3267h;
            if ((aVar.f3276g || aVar.f3275f) && this.f3265f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4106j(p139w3.C2103w r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p072l2.C1241e.m3517j(r3, r0)
            byte[] r0 = p144x3.C2129c.f6169a
            monitor-enter(r2)
            boolean r0 = r2.f3265f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            d4.o$b r3 = r2.f3266g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f3265f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<w3.w> r0 = r2.f3264e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            d4.o$b r3 = r2.f3266g     // Catch:{ all -> 0x0035 }
            r3.f3282i = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.mo4105i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            d4.f r3 = r2.f3273n
            int r4 = r2.f3272m
            r3.mo4075h(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0841o.mo4106j(w3.w, boolean):void");
    }

    /* renamed from: k */
    public final synchronized void mo4107k(C0814b bVar) {
        if (this.f3270k == null) {
            this.f3270k = bVar;
            notifyAll();
        }
    }

    /* renamed from: l */
    public final void mo4108l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
