package p154z3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p144x3.C2128b;
import p144x3.C2129c;

/* renamed from: z3.d */
public final class C2208d {

    /* renamed from: h */
    public static final C2208d f6344h;

    /* renamed from: i */
    public static final Logger f6345i;

    /* renamed from: j */
    public static final C2210b f6346j = new C2210b((C0802f) null);

    /* renamed from: a */
    public int f6347a = 10000;

    /* renamed from: b */
    public boolean f6348b;

    /* renamed from: c */
    public long f6349c;

    /* renamed from: d */
    public final List<C2207c> f6350d = new ArrayList();

    /* renamed from: e */
    public final List<C2207c> f6351e = new ArrayList();

    /* renamed from: f */
    public final Runnable f6352f = new C2212d(this);

    /* renamed from: g */
    public final C2209a f6353g;

    /* renamed from: z3.d$a */
    public interface C2209a {
        /* renamed from: a */
        void mo6776a(C2208d dVar);

        /* renamed from: b */
        long mo6777b();

        /* renamed from: c */
        void mo6778c(C2208d dVar, long j);

        void execute(Runnable runnable);
    }

    /* renamed from: z3.d$b */
    public static final class C2210b {
        public C2210b(C0802f fVar) {
        }
    }

    /* renamed from: z3.d$c */
    public static final class C2211c implements C2209a {

        /* renamed from: a */
        public final ThreadPoolExecutor f6354a;

        public C2211c(ThreadFactory threadFactory) {
            this.f6354a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public void mo6776a(C2208d dVar) {
            dVar.notify();
        }

        /* renamed from: b */
        public long mo6777b() {
            return System.nanoTime();
        }

        /* renamed from: c */
        public void mo6778c(C2208d dVar, long j) {
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            C1241e.m3517j(runnable, "runnable");
            this.f6354a.execute(runnable);
        }
    }

    /* renamed from: z3.d$d */
    public static final class C2212d implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2208d f6355e;

        public C2212d(C2208d dVar) {
            this.f6355e = dVar;
        }

        public void run() {
            C2205a c;
            while (true) {
                synchronized (this.f6355e) {
                    c = this.f6355e.mo6772c();
                }
                if (c != null) {
                    C2207c cVar = c.f6333a;
                    C1241e.m3515e(cVar);
                    long j = -1;
                    C2210b bVar = C2208d.f6346j;
                    boolean isLoggable = C2208d.f6345i.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = cVar.f6342e.f6353g.mo6777b();
                        C1320u.m3700d(c, cVar, "starting");
                    }
                    try {
                        C2208d.m5656a(this.f6355e, c);
                        if (isLoggable) {
                            long b = cVar.f6342e.f6353g.mo6777b() - j;
                            StringBuilder a = C0001b.m0a("finished run in ");
                            a.append(C1320u.m3707k(b));
                            C1320u.m3700d(c, cVar, a.toString());
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long b2 = cVar.f6342e.f6353g.mo6777b() - j;
                            StringBuilder a2 = C0001b.m0a("failed a run in ");
                            a2.append(C1320u.m3707k(b2));
                            C1320u.m3700d(c, cVar, a2.toString());
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = C2129c.f6174f + " TaskRunner";
        C1241e.m3517j(str, "name");
        f6344h = new C2208d(new C2211c(new C2128b(str, true)));
        Logger logger = Logger.getLogger(C2208d.class.getName());
        C1241e.m3516f(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f6345i = logger;
    }

    public C2208d(C2209a aVar) {
        this.f6353g = aVar;
    }

    /* renamed from: a */
    public static final void m5656a(C2208d dVar, C2205a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = C2129c.f6169a;
        Thread currentThread = Thread.currentThread();
        C1241e.m3516f(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f6335c);
        try {
            long a = aVar.mo57a();
            synchronized (dVar) {
                dVar.mo6771b(aVar, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.mo6771b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo6771b(C2205a aVar, long j) {
        byte[] bArr = C2129c.f6169a;
        C2207c cVar = aVar.f6333a;
        C1241e.m3515e(cVar);
        if (cVar.f6339b == aVar) {
            boolean z = cVar.f6341d;
            cVar.f6341d = false;
            cVar.f6339b = null;
            this.f6350d.remove(cVar);
            if (j != -1 && !z && !cVar.f6338a) {
                cVar.mo6768d(aVar, j, true);
            }
            if (!cVar.f6340c.isEmpty()) {
                this.f6351e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|30|31|34|35|42|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r14.f6348b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p154z3.C2205a mo6772c() {
        /*
            r14 = this;
            byte[] r0 = p144x3.C2129c.f6169a
        L_0x0002:
            java.util.List<z3.c> r0 = r14.f6351e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            z3.d$a r0 = r14.f6353g
            long r2 = r0.mo6777b()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<z3.c> r0 = r14.f6351e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            z3.c r7 = (p154z3.C2207c) r7
            java.util.List<z3.a> r7 = r7.f6340c
            java.lang.Object r7 = r7.get(r9)
            z3.a r7 = (p154z3.C2205a) r7
            long r10 = r7.f6334b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = p144x3.C2129c.f6169a
            r1 = -1
            r6.f6334b = r1
            z3.c r1 = r6.f6333a
            p072l2.C1241e.m3515e(r1)
            java.util.List<z3.a> r2 = r1.f6340c
            r2.remove(r6)
            java.util.List<z3.c> r2 = r14.f6351e
            r2.remove(r1)
            r1.f6339b = r6
            java.util.List<z3.c> r2 = r14.f6350d
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f6348b
            if (r0 != 0) goto L_0x0081
            java.util.List<z3.c> r0 = r14.f6351e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            z3.d$a r0 = r14.f6353g
            java.lang.Runnable r1 = r14.f6352f
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f6348b
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f6349c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            z3.d$a r0 = r14.f6353g
            r0.mo6776a(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f6348b = r8
            long r2 = r2 + r4
            r14.f6349c = r2
            z3.d$a r0 = r14.f6353g     // Catch:{ InterruptedException -> 0x00a3 }
            r0.mo6778c(r14, r4)     // Catch:{ InterruptedException -> 0x00a3 }
        L_0x009d:
            r14.f6348b = r9
            goto L_0x0002
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r14.mo6773d()     // Catch:{ all -> 0x00a1 }
            goto L_0x009d
        L_0x00a7:
            r14.f6348b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p154z3.C2208d.mo6772c():z3.a");
    }

    /* renamed from: d */
    public final void mo6773d() {
        for (int size = this.f6350d.size() - 1; size >= 0; size--) {
            this.f6350d.get(size).mo6766b();
        }
        for (int size2 = this.f6351e.size() - 1; size2 >= 0; size2--) {
            C2207c cVar = this.f6351e.get(size2);
            cVar.mo6766b();
            if (cVar.f6340c.isEmpty()) {
                this.f6351e.remove(size2);
            }
        }
    }

    /* renamed from: e */
    public final void mo6774e(C2207c cVar) {
        byte[] bArr = C2129c.f6169a;
        if (cVar.f6339b == null) {
            if (!cVar.f6340c.isEmpty()) {
                List<C2207c> list = this.f6351e;
                C1241e.m3517j(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.f6351e.remove(cVar);
            }
        }
        if (this.f6348b) {
            this.f6353g.mo6776a(this);
        } else {
            this.f6353g.execute(this.f6352f);
        }
    }

    /* renamed from: f */
    public final C2207c mo6775f() {
        int i;
        synchronized (this) {
            i = this.f6347a;
            this.f6347a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C2207c(this, sb.toString());
    }
}
