package p073l3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p067k3.C1204g;
import p072l2.C1241e;

/* renamed from: l3.n */
public final class C1304n extends C1305n0 {

    /* renamed from: f */
    public static final C1304n f4312f = new C1304n();

    /* renamed from: g */
    public static final int f4313g;
    private static volatile Executor pool;

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer I = C1204g.m3425I(str);
            if (I == null || I.intValue() < 1) {
                throw new IllegalStateException(C1241e.m3522p("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = I.intValue();
        }
        f4313g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        p073l3.C1266b0.f4274k.mo5068b0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5067R(p138w2.C2046f r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            java.util.concurrent.Executor r1 = pool     // Catch:{ RejectedExecutionException -> 0x0018 }
            if (r1 != 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            java.util.concurrent.Executor r1 = pool     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x000f
            java.util.concurrent.ExecutorService r1 = r0.mo5090U()     // Catch:{ all -> 0x0011 }
            pool = r1     // Catch:{ all -> 0x0011 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            throw r1     // Catch:{ RejectedExecutionException -> 0x0018 }
        L_0x0014:
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            l3.b0 r1 = p073l3.C1266b0.f4274k
            r1.mo5068b0(r2)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1304n.mo5067R(w2.f, java.lang.Runnable):void");
    }

    /* renamed from: T */
    public final ExecutorService mo5089T() {
        return Executors.newFixedThreadPool(mo5091V(), new C1300m(new AtomicInteger()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d A[RETURN] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ExecutorService mo5090U() {
        /*
            r7 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r7.mo5089T()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = r7.mo5089T()
            return r0
        L_0x001b:
            int r2 = f4313g
            r3 = 1
            r4 = 0
            if (r2 >= 0) goto L_0x006e
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.invoke(r0, r5)     // Catch:{ all -> 0x0036 }
            boolean r5 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x0036
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r2 = r0
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            goto L_0x006e
        L_0x003a:
            l3.n r5 = f4312f
            java.util.Objects.requireNonNull(r5)
            l3.l r5 = p073l3.C1297l.f4305e
            r2.submit(r5)
            java.lang.String r5 = "getPoolSize"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r5.invoke(r2, r6)     // Catch:{ all -> 0x0059 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0059
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r5 = r0
        L_0x005a:
            if (r5 != 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r5 = r5.intValue()
            if (r5 < r3) goto L_0x0065
            r5 = r3
            goto L_0x0066
        L_0x0065:
            r5 = r4
        L_0x0066:
            if (r5 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = r0
        L_0x006a:
            if (r2 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            return r2
        L_0x006e:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0091 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0091 }
            r2[r4] = r5     // Catch:{ all -> 0x0091 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch:{ all -> 0x0091 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0091 }
            l3.n r3 = f4312f     // Catch:{ all -> 0x0091 }
            int r3 = r3.mo5091V()     // Catch:{ all -> 0x0091 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0091 }
            r2[r4] = r3     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0091 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0091
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0091 }
            r0 = r1
        L_0x0091:
            if (r0 != 0) goto L_0x0097
            java.util.concurrent.ExecutorService r0 = r7.mo5089T()
        L_0x0097:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1304n.mo5090U():java.util.concurrent.ExecutorService");
    }

    /* renamed from: V */
    public final int mo5091V() {
        Integer valueOf = Integer.valueOf(f4313g);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors < 1) {
            return 1;
        }
        return availableProcessors;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }
}
