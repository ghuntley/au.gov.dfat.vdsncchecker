package p005a4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p032e4.C0879e;
import p062j4.C1107c;
import p072l2.C1241e;
import p139w3.C2057b0;
import p139w3.C2063d0;
import p139w3.C2068f;
import p139w3.C2071g;
import p139w3.C2092p;
import p139w3.C2095s;
import p144x3.C2129c;

/* renamed from: a4.e */
public final class C0017e implements C2068f {

    /* renamed from: e */
    public final C0025j f41e;

    /* renamed from: f */
    public final C2095s f42f;

    /* renamed from: g */
    public final C0020c f43g;

    /* renamed from: h */
    public final AtomicBoolean f44h = new AtomicBoolean();

    /* renamed from: i */
    public Object f45i;

    /* renamed from: j */
    public C0016d f46j;

    /* renamed from: k */
    public C0024i f47k;

    /* renamed from: l */
    public boolean f48l;

    /* renamed from: m */
    public C0013c f49m;

    /* renamed from: n */
    public boolean f50n;

    /* renamed from: o */
    public boolean f51o;

    /* renamed from: p */
    public boolean f52p = true;

    /* renamed from: q */
    public volatile boolean f53q;

    /* renamed from: r */
    public volatile C0013c f54r;

    /* renamed from: s */
    public volatile C0024i f55s;

    /* renamed from: t */
    public final C2057b0 f56t;

    /* renamed from: u */
    public final C2063d0 f57u;

    /* renamed from: v */
    public final boolean f58v;

    /* renamed from: a4.e$a */
    public final class C0018a implements Runnable {

        /* renamed from: e */
        public volatile AtomicInteger f59e = new AtomicInteger(0);

        /* renamed from: f */
        public final C2071g f60f;

        public C0018a(C2071g gVar) {
            this.f60f = gVar;
        }

        /* renamed from: a */
        public final String mo37a() {
            return C0017e.this.f57u.f5973b.f6120e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[Catch:{ all -> 0x007a, all -> 0x00be }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
                a4.e r1 = p005a4.C0017e.this
                w3.d0 r1 = r1.f57u
                w3.x r1 = r1.f5973b
                java.lang.String r1 = r1.mo6634g()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p072l2.C1241e.m3516f(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                a4.e r0 = p005a4.C0017e.this     // Catch:{ all -> 0x00be }
                a4.e$c r0 = r0.f43g     // Catch:{ all -> 0x00be }
                r0.mo4605h()     // Catch:{ all -> 0x00be }
                r0 = 0
                a4.e r3 = p005a4.C0017e.this     // Catch:{ IOException -> 0x007c, all -> 0x004f }
                w3.g0 r0 = r3.mo33j()     // Catch:{ IOException -> 0x007c, all -> 0x004f }
                r3 = 1
                w3.g r4 = r7.f60f     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                a4.e r5 = p005a4.C0017e.this     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                u4.q$a r4 = (p128u4.C1921q.C1922a) r4     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                r4.mo6438b(r5, r0)     // Catch:{ IOException -> 0x004a, all -> 0x0045 }
                a4.e r0 = p005a4.C0017e.this     // Catch:{ all -> 0x00be }
            L_0x0041:
                w3.b0 r0 = r0.f56t     // Catch:{ all -> 0x00be }
                goto L_0x00ab
            L_0x0045:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x0050
            L_0x004a:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x007d
            L_0x004f:
                r3 = move-exception
            L_0x0050:
                a4.e r4 = p005a4.C0017e.this     // Catch:{ all -> 0x007a }
                r4.cancel()     // Catch:{ all -> 0x007a }
                if (r0 != 0) goto L_0x0079
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x007a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
                r4.<init>()     // Catch:{ all -> 0x007a }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007a }
                r4.append(r3)     // Catch:{ all -> 0x007a }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007a }
                r0.<init>(r4)     // Catch:{ all -> 0x007a }
                p042g2.C0955a.m2727a(r0, r3)     // Catch:{ all -> 0x007a }
                w3.g r4 = r7.f60f     // Catch:{ all -> 0x007a }
                a4.e r5 = p005a4.C0017e.this     // Catch:{ all -> 0x007a }
                u4.q$a r4 = (p128u4.C1921q.C1922a) r4     // Catch:{ all -> 0x007a }
                r4.mo6437a(r5, r0)     // Catch:{ all -> 0x007a }
            L_0x0079:
                throw r3     // Catch:{ all -> 0x007a }
            L_0x007a:
                r0 = move-exception
                goto L_0x00b4
            L_0x007c:
                r3 = move-exception
            L_0x007d:
                if (r0 == 0) goto L_0x009f
                e4.e$a r0 = p032e4.C0879e.f3347c     // Catch:{ all -> 0x007a }
                e4.e r0 = p032e4.C0879e.f3345a     // Catch:{ all -> 0x007a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
                r4.<init>()     // Catch:{ all -> 0x007a }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007a }
                a4.e r5 = p005a4.C0017e.this     // Catch:{ all -> 0x007a }
                java.lang.String r5 = p005a4.C0017e.m31b(r5)     // Catch:{ all -> 0x007a }
                r4.append(r5)     // Catch:{ all -> 0x007a }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007a }
                r5 = 4
                r0.mo4181i(r4, r5, r3)     // Catch:{ all -> 0x007a }
                goto L_0x00a8
            L_0x009f:
                w3.g r0 = r7.f60f     // Catch:{ all -> 0x007a }
                a4.e r4 = p005a4.C0017e.this     // Catch:{ all -> 0x007a }
                u4.q$a r0 = (p128u4.C1921q.C1922a) r0     // Catch:{ all -> 0x007a }
                r0.mo6437a(r4, r3)     // Catch:{ all -> 0x007a }
            L_0x00a8:
                a4.e r0 = p005a4.C0017e.this     // Catch:{ all -> 0x00be }
                goto L_0x0041
            L_0x00ab:
                w3.p r0 = r0.f5920e     // Catch:{ all -> 0x00be }
                r0.mo6598a(r7)     // Catch:{ all -> 0x00be }
                r1.setName(r2)
                return
            L_0x00b4:
                a4.e r3 = p005a4.C0017e.this     // Catch:{ all -> 0x00be }
                w3.b0 r3 = r3.f56t     // Catch:{ all -> 0x00be }
                w3.p r3 = r3.f5920e     // Catch:{ all -> 0x00be }
                r3.mo6598a(r7)     // Catch:{ all -> 0x00be }
                throw r0     // Catch:{ all -> 0x00be }
            L_0x00be:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005a4.C0017e.C0018a.run():void");
        }
    }

    /* renamed from: a4.e$b */
    public static final class C0019b extends WeakReference<C0017e> {

        /* renamed from: a */
        public final Object f62a;

        public C0019b(C0017e eVar, Object obj) {
            super(eVar);
            this.f62a = obj;
        }
    }

    /* renamed from: a4.e$c */
    public static final class C0020c extends C1107c {

        /* renamed from: l */
        public final /* synthetic */ C0017e f63l;

        public C0020c(C0017e eVar) {
            this.f63l = eVar;
        }

        /* renamed from: k */
        public void mo39k() {
            this.f63l.cancel();
        }
    }

    public C0017e(C2057b0 b0Var, C2063d0 d0Var, boolean z) {
        C1241e.m3517j(b0Var, "client");
        C1241e.m3517j(d0Var, "originalRequest");
        this.f56t = b0Var;
        this.f57u = d0Var;
        this.f58v = z;
        this.f41e = (C0025j) b0Var.f5921f.f3645b;
        this.f42f = b0Var.f5924i.mo6604a(this);
        C0020c cVar = new C0020c(this);
        cVar.mo4604g((long) 0, TimeUnit.MILLISECONDS);
        this.f43g = cVar;
    }

    /* renamed from: b */
    public static final String m31b(C0017e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f53q ? "canceled " : "");
        sb.append(eVar.f58v ? "web socket" : "call");
        sb.append(" to ");
        sb.append(eVar.f57u.f5973b.mo6634g());
        return sb.toString();
    }

    /* renamed from: a */
    public C2063d0 mo25a() {
        return this.f57u;
    }

    /* renamed from: c */
    public boolean mo26c() {
        return this.f53q;
    }

    public void cancel() {
        Socket socket;
        if (!this.f53q) {
            this.f53q = true;
            C0013c cVar = this.f54r;
            if (cVar != null) {
                cVar.f19f.cancel();
            }
            C0024i iVar = this.f55s;
            if (!(iVar == null || (socket = iVar.f69b) == null)) {
                C2129c.m5516d(socket);
            }
            Objects.requireNonNull(this.f42f);
        }
    }

    public Object clone() {
        return new C0017e(this.f56t, this.f57u, this.f58v);
    }

    /* renamed from: d */
    public final void mo29d(C0024i iVar) {
        byte[] bArr = C2129c.f6169a;
        if (this.f47k == null) {
            this.f47k = iVar;
            iVar.f82o.add(new C0019b(this, this.f45i));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    public final <E extends IOException> E mo30e(E e) {
        E e2;
        C2095s sVar;
        Socket m;
        byte[] bArr = C2129c.f6169a;
        C0024i iVar = this.f47k;
        if (iVar != null) {
            synchronized (iVar) {
                m = mo36m();
            }
            if (this.f47k == null) {
                if (m != null) {
                    C2129c.m5516d(m);
                }
                Objects.requireNonNull(this.f42f);
            } else {
                if (!(m == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f48l && this.f43g.mo4606i()) {
            e2 = new InterruptedIOException("timeout");
            if (e != null) {
                e2.initCause(e);
            }
        } else {
            e2 = e;
        }
        if (e != null) {
            sVar = this.f42f;
            C1241e.m3515e(e2);
        } else {
            sVar = this.f42f;
        }
        Objects.requireNonNull(sVar);
        return e2;
    }

    /* renamed from: f */
    public final void mo31f(boolean z) {
        C0013c cVar;
        synchronized (this) {
            if (!this.f52p) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f54r) != null) {
            cVar.f19f.cancel();
            cVar.f16c.mo34k(cVar, true, true, (IOException) null);
        }
        this.f49m = null;
    }

    /* renamed from: g */
    public void mo32g(C2071g gVar) {
        C0018a aVar;
        if (this.f44h.compareAndSet(false, true)) {
            C0879e.C0880a aVar2 = C0879e.f3347c;
            this.f45i = C0879e.f3345a.mo4173g("response.body().close()");
            Objects.requireNonNull(this.f42f);
            C2092p pVar = this.f56t.f5920e;
            C0018a aVar3 = new C0018a(gVar);
            Objects.requireNonNull(pVar);
            synchronized (pVar) {
                pVar.f6094b.add(aVar3);
                if (!C0017e.this.f58v) {
                    String a = aVar3.mo37a();
                    Iterator<C0018a> it = pVar.f6095c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<C0018a> it2 = pVar.f6094b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (C1241e.m3513b(aVar.mo37a(), a)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (C1241e.m3513b(aVar.mo37a(), a)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar3.f59e = aVar.f59e;
                    }
                }
            }
            pVar.mo6599b();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p139w3.C2072g0 mo33j() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            w3.b0 r0 = r11.f56t
            java.util.List<w3.y> r0 = r0.f5922g
            p126u2.C1848i.m5047I(r2, r0)
            b4.i r0 = new b4.i
            w3.b0 r1 = r11.f56t
            r0.<init>(r1)
            r2.add(r0)
            b4.a r0 = new b4.a
            w3.b0 r1 = r11.f56t
            w3.o r1 = r1.f5929n
            r0.<init>(r1)
            r2.add(r0)
            y3.a r0 = new y3.a
            w3.b0 r1 = r11.f56t
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            a4.a r0 = p005a4.C0011a.f9a
            r2.add(r0)
            boolean r0 = r11.f58v
            if (r0 != 0) goto L_0x003f
            w3.b0 r0 = r11.f56t
            java.util.List<w3.y> r0 = r0.f5923h
            p126u2.C1848i.m5047I(r2, r0)
        L_0x003f:
            b4.b r0 = new b4.b
            boolean r1 = r11.f58v
            r0.<init>(r1)
            r2.add(r0)
            b4.g r9 = new b4.g
            r3 = 0
            r4 = 0
            w3.d0 r5 = r11.f57u
            w3.b0 r0 = r11.f56t
            int r6 = r0.f5941z
            int r7 = r0.f5917A
            int r8 = r0.f5918B
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            w3.d0 r2 = r11.f57u     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            w3.g0 r2 = r9.mo2692c(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            boolean r3 = r11.f53q     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if (r3 != 0) goto L_0x006c
            r11.mo35l(r1)
            return r2
        L_0x006c:
            p144x3.C2129c.m5515c(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.mo35l(r0)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0089
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008e:
            if (r0 != 0) goto L_0x0093
            r11.mo35l(r1)
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0017e.mo33j():w3.g0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0022 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[Catch:{ all -> 0x0014 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo34k(p005a4.C0013c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            a4.c r0 = r2.f54r
            boolean r3 = p072l2.C1241e.m3513b(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x000b
            return r6
        L_0x000b:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            boolean r1 = r2.f50n     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0016
        L_0x0014:
            r3 = move-exception
            goto L_0x003d
        L_0x0016:
            if (r5 == 0) goto L_0x003f
            boolean r1 = r2.f51o     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x003f
        L_0x001c:
            if (r4 == 0) goto L_0x0020
            r2.f50n = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            if (r5 == 0) goto L_0x0024
            r2.f51o = r3     // Catch:{ all -> 0x0014 }
        L_0x0024:
            boolean r4 = r2.f50n     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x002e
            boolean r5 = r2.f51o     // Catch:{ all -> 0x0014 }
            if (r5 != 0) goto L_0x002e
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.f51o     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.f52p     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            r3 = r0
        L_0x003a:
            r4 = r3
            r3 = r5
            goto L_0x0040
        L_0x003d:
            monitor-exit(r2)
            throw r3
        L_0x003f:
            r4 = r3
        L_0x0040:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            r2.f54r = r3
            a4.i r3 = r2.f47k
            if (r3 == 0) goto L_0x0055
            monitor-enter(r3)
            int r5 = r3.f79l     // Catch:{ all -> 0x0052 }
            int r5 = r5 + r0
            r3.f79l = r5     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            goto L_0x0055
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            java.io.IOException r3 = r2.mo30e(r6)
            return r3
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0017e.mo34k(a4.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: l */
    public final IOException mo35l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f52p) {
                this.f52p = false;
                if (!this.f50n && !this.f51o) {
                    z = true;
                }
            }
        }
        return z ? mo30e(iOException) : iOException;
    }

    /* renamed from: m */
    public final Socket mo36m() {
        C0024i iVar = this.f47k;
        C1241e.m3515e(iVar);
        byte[] bArr = C2129c.f6169a;
        List<Reference<C0017e>> list = iVar.f82o;
        Iterator<Reference<C0017e>> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C1241e.m3513b((C0017e) it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            list.remove(i);
            this.f47k = null;
            if (list.isEmpty()) {
                iVar.f83p = System.nanoTime();
                C0025j jVar = this.f41e;
                Objects.requireNonNull(jVar);
                byte[] bArr2 = C2129c.f6169a;
                if (iVar.f76i || jVar.f89e == 0) {
                    iVar.f76i = true;
                    jVar.f88d.remove(iVar);
                    if (jVar.f88d.isEmpty()) {
                        jVar.f86b.mo6765a();
                    }
                    z = true;
                } else {
                    jVar.f86b.mo6767c(jVar.f87c, 0);
                }
                if (z) {
                    Socket socket = iVar.f70c;
                    C1241e.m3515e(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
