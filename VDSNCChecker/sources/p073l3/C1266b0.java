package p073l3;

import java.util.concurrent.TimeUnit;

/* renamed from: l3.b0 */
public final class C1266b0 extends C1290j0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    public static final C1266b0 f4274k;

    /* renamed from: l */
    public static final long f4275l;

    static {
        Long l;
        C1266b0 b0Var = new C1266b0();
        f4274k = b0Var;
        b0Var.mo5063W(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f4275l = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: a0 */
    public Thread mo5020a0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* renamed from: h0 */
    public final synchronized void mo5021h0() {
        if (mo5022i0()) {
            debugStatus = 3;
            mo5072f0();
            notifyAll();
        }
    }

    /* renamed from: i0 */
    public final boolean mo5022i0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        _thread = null;
        mo5021h0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (mo5070d0() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        mo5020a0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            l3.i1 r0 = p073l3.C1288i1.f4293a
            java.lang.ThreadLocal<l3.i0> r0 = p073l3.C1288i1.f4294b
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0083 }
            boolean r1 = r12.mo5022i0()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0011
            r1 = 0
            goto L_0x0017
        L_0x0011:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0080 }
            r12.notifyAll()     // Catch:{ all -> 0x0080 }
        L_0x0017:
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0029
            _thread = r0
            r12.mo5021h0()
            boolean r0 = r12.mo5070d0()
            if (r0 != 0) goto L_0x0028
            r12.mo5020a0()
        L_0x0028:
            return
        L_0x0029:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x002f:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            long r5 = r12.mo5071e0()     // Catch:{ all -> 0x0083 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0062
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0083 }
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0047
            long r3 = f4275l     // Catch:{ all -> 0x0083 }
            long r3 = r3 + r10
        L_0x0047:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005c
            _thread = r0
            r12.mo5021h0()
            boolean r0 = r12.mo5070d0()
            if (r0 != 0) goto L_0x005b
            r12.mo5020a0()
        L_0x005b:
            return
        L_0x005c:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0063
            r5 = r10
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x002f
            boolean r7 = r12.mo5022i0()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x007c
            _thread = r0
            r12.mo5021h0()
            boolean r0 = r12.mo5070d0()
            if (r0 != 0) goto L_0x007b
            r12.mo5020a0()
        L_0x007b:
            return
        L_0x007c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x002f
        L_0x0080:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            _thread = r0
            r12.mo5021h0()
            boolean r0 = r12.mo5070d0()
            if (r0 != 0) goto L_0x0092
            r12.mo5020a0()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1266b0.run():void");
    }
}
