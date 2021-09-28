package p062j4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p025d3.C0802f;
import p072l2.C1241e;

/* renamed from: j4.c */
public class C1107c extends C1104a0 {

    /* renamed from: h */
    public static final long f3876h;

    /* renamed from: i */
    public static final long f3877i;

    /* renamed from: j */
    public static C1107c f3878j;

    /* renamed from: k */
    public static final C1108a f3879k = new C1108a((C0802f) null);

    /* renamed from: e */
    public boolean f3880e;

    /* renamed from: f */
    public C1107c f3881f;

    /* renamed from: g */
    public long f3882g;

    /* renamed from: j4.c$a */
    public static final class C1108a {
        public C1108a(C0802f fVar) {
        }

        /* renamed from: a */
        public final C1107c mo4607a() {
            Class<C1107c> cls = C1107c.class;
            C1107c cVar = C1107c.f3878j;
            C1241e.m3515e(cVar);
            C1107c cVar2 = cVar.f3881f;
            long nanoTime = System.nanoTime();
            if (cVar2 == null) {
                cls.wait(C1107c.f3876h);
                C1107c cVar3 = C1107c.f3878j;
                C1241e.m3515e(cVar3);
                if (cVar3.f3881f != null || System.nanoTime() - nanoTime < C1107c.f3877i) {
                    return null;
                }
                return C1107c.f3878j;
            }
            long j = cVar2.f3882g - nanoTime;
            if (j > 0) {
                long j2 = j / 1000000;
                cls.wait(j2, (int) (j - (1000000 * j2)));
                return null;
            }
            C1107c cVar4 = C1107c.f3878j;
            C1241e.m3515e(cVar4);
            cVar4.f3881f = cVar2.f3881f;
            cVar2.f3881f = null;
            return cVar2;
        }
    }

    /* renamed from: j4.c$b */
    public static final class C1109b extends Thread {
        public C1109b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.mo39k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<j4.c> r0 = p062j4.C1107c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                j4.c$a r1 = p062j4.C1107c.f3879k     // Catch:{ all -> 0x0019 }
                j4.c r1 = r1.mo4607a()     // Catch:{ all -> 0x0019 }
                j4.c r2 = p062j4.C1107c.f3878j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                p062j4.C1107c.f3878j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo39k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p062j4.C1107c.C1109b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f3876h = millis;
        f3877i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[EDGE_INSN: B:40:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4605h() {
        /*
            r9 = this;
            boolean r0 = r9.f3880e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0079
            long r2 = r9.f3875c
            boolean r0 = r9.f3873a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            r9.f3880e = r1
            java.lang.Class<j4.c> r1 = p062j4.C1107c.class
            monitor-enter(r1)
            j4.c r5 = f3878j     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x002b
            j4.c r5 = new j4.c     // Catch:{ all -> 0x0076 }
            r5.<init>()     // Catch:{ all -> 0x0076 }
            f3878j = r5     // Catch:{ all -> 0x0076 }
            j4.c$b r5 = new j4.c$b     // Catch:{ all -> 0x0076 }
            r5.<init>()     // Catch:{ all -> 0x0076 }
            r5.start()     // Catch:{ all -> 0x0076 }
        L_0x002b:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003d
            long r7 = r9.mo4600c()     // Catch:{ all -> 0x0076 }
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0076 }
            goto L_0x003f
        L_0x003d:
            if (r4 == 0) goto L_0x0041
        L_0x003f:
            long r2 = r2 + r5
            goto L_0x0047
        L_0x0041:
            if (r0 == 0) goto L_0x0070
            long r2 = r9.mo4600c()     // Catch:{ all -> 0x0076 }
        L_0x0047:
            r9.f3882g = r2     // Catch:{ all -> 0x0076 }
            long r2 = r2 - r5
            j4.c r0 = f3878j     // Catch:{ all -> 0x0076 }
        L_0x004c:
            p072l2.C1241e.m3515e(r0)     // Catch:{ all -> 0x0076 }
            j4.c r4 = r0.f3881f     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x0061
            p072l2.C1241e.m3515e(r4)     // Catch:{ all -> 0x0076 }
            long r7 = r4.f3882g     // Catch:{ all -> 0x0076 }
            long r7 = r7 - r5
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            j4.c r0 = r0.f3881f     // Catch:{ all -> 0x0076 }
            goto L_0x004c
        L_0x0061:
            j4.c r2 = r0.f3881f     // Catch:{ all -> 0x0076 }
            r9.f3881f = r2     // Catch:{ all -> 0x0076 }
            r0.f3881f = r9     // Catch:{ all -> 0x0076 }
            j4.c r2 = f3878j     // Catch:{ all -> 0x0076 }
            if (r0 != r2) goto L_0x006e
            r1.notify()     // Catch:{ all -> 0x0076 }
        L_0x006e:
            monitor-exit(r1)
            return
        L_0x0070:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0076 }
            r0.<init>()     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0079:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1107c.mo4605h():void");
    }

    /* renamed from: i */
    public final boolean mo4606i() {
        boolean z = false;
        if (!this.f3880e) {
            return false;
        }
        this.f3880e = false;
        synchronized (C1107c.class) {
            C1107c cVar = f3878j;
            while (true) {
                if (cVar == null) {
                    z = true;
                    break;
                }
                C1107c cVar2 = cVar.f3881f;
                if (cVar2 == this) {
                    cVar.f3881f = this.f3881f;
                    this.f3881f = null;
                    break;
                }
                cVar = cVar2;
            }
        }
        return z;
    }

    /* renamed from: j */
    public IOException mo4111j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: k */
    public void mo39k() {
    }
}
