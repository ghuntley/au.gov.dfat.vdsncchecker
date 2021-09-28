package p139w3;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import p005a4.C0017e;

/* renamed from: w3.p */
public final class C2092p {

    /* renamed from: a */
    public ExecutorService f6093a;

    /* renamed from: b */
    public final ArrayDeque<C0017e.C0018a> f6094b = new ArrayDeque<>();

    /* renamed from: c */
    public final ArrayDeque<C0017e.C0018a> f6095c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<C0017e> f6096d = new ArrayDeque<>();

    /* renamed from: a */
    public final void mo6598a(C0017e.C0018a aVar) {
        aVar.f59e.decrementAndGet();
        ArrayDeque<C0017e.C0018a> arrayDeque = this.f6095c;
        synchronized (this) {
            if (!arrayDeque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        mo6599b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final boolean mo6599b() {
        /*
            r15 = this;
            byte[] r0 = p144x3.C2129c.f6169a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.ArrayDeque<a4.e$a> r1 = r15.f6094b     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            p072l2.C1241e.m3516f(r1, r2)     // Catch:{ all -> 0x00f1 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00f1 }
            a4.e$a r2 = (p005a4.C0017e.C0018a) r2     // Catch:{ all -> 0x00f1 }
            java.util.ArrayDeque<a4.e$a> r3 = r15.f6095c     // Catch:{ all -> 0x00f1 }
            int r3 = r3.size()     // Catch:{ all -> 0x00f1 }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f59e     // Catch:{ all -> 0x00f1 }
            int r3 = r3.get()     // Catch:{ all -> 0x00f1 }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f59e     // Catch:{ all -> 0x00f1 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00f1 }
            r0.add(r2)     // Catch:{ all -> 0x00f1 }
            java.util.ArrayDeque<a4.e$a> r3 = r15.f6095c     // Catch:{ all -> 0x00f1 }
            r3.add(r2)     // Catch:{ all -> 0x00f1 }
            goto L_0x0013
        L_0x0045:
            monitor-enter(r15)     // Catch:{ all -> 0x00f1 }
            java.util.ArrayDeque<a4.e$a> r1 = r15.f6095c     // Catch:{ all -> 0x00ee }
            int r1 = r1.size()     // Catch:{ all -> 0x00ee }
            java.util.ArrayDeque<a4.e> r2 = r15.f6096d     // Catch:{ all -> 0x00ee }
            int r2 = r2.size()     // Catch:{ all -> 0x00ee }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            r2 = 0
            if (r1 <= 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            monitor-exit(r15)
            int r3 = r0.size()
            r4 = r2
        L_0x0060:
            if (r4 >= r3) goto L_0x00ed
            java.lang.Object r5 = r0.get(r4)
            a4.e$a r5 = (p005a4.C0017e.C0018a) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.f6093a     // Catch:{ all -> 0x00ea }
            if (r6 != 0) goto L_0x009f
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00ea }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ea }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00ea }
            r13.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r7.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r14 = p144x3.C2129c.f6174f     // Catch:{ all -> 0x00ea }
            r7.append(r14)     // Catch:{ all -> 0x00ea }
            java.lang.String r14 = " Dispatcher"
            r7.append(r14)     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ea }
            java.lang.String r14 = "name"
            p072l2.C1241e.m3517j(r7, r14)     // Catch:{ all -> 0x00ea }
            x3.b r14 = new x3.b     // Catch:{ all -> 0x00ea }
            r14.<init>(r7, r2)     // Catch:{ all -> 0x00ea }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00ea }
            r15.f6093a = r6     // Catch:{ all -> 0x00ea }
        L_0x009f:
            java.util.concurrent.ExecutorService r6 = r15.f6093a     // Catch:{ all -> 0x00ea }
            p072l2.C1241e.m3515e(r6)     // Catch:{ all -> 0x00ea }
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r7 = "executorService"
            p072l2.C1241e.m3517j(r6, r7)
            a4.e r7 = p005a4.C0017e.this
            w3.b0 r7 = r7.f56t
            w3.p r7 = r7.f5920e
            byte[] r7 = p144x3.C2129c.f6169a
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00bb }
            goto L_0x00dd
        L_0x00b9:
            r0 = move-exception
            goto L_0x00e0
        L_0x00bb:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00b9 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00b9 }
            r7.initCause(r6)     // Catch:{ all -> 0x00b9 }
            a4.e r6 = p005a4.C0017e.this     // Catch:{ all -> 0x00b9 }
            r6.mo35l(r7)     // Catch:{ all -> 0x00b9 }
            w3.g r6 = r5.f60f     // Catch:{ all -> 0x00b9 }
            a4.e r8 = p005a4.C0017e.this     // Catch:{ all -> 0x00b9 }
            u4.q$a r6 = (p128u4.C1921q.C1922a) r6     // Catch:{ all -> 0x00b9 }
            r6.mo6437a(r8, r7)     // Catch:{ all -> 0x00b9 }
            a4.e r6 = p005a4.C0017e.this
            w3.b0 r6 = r6.f56t
            w3.p r6 = r6.f5920e
            r6.mo6598a(r5)
        L_0x00dd:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x00e0:
            a4.e r1 = p005a4.C0017e.this
            w3.b0 r1 = r1.f56t
            w3.p r1 = r1.f5920e
            r1.mo6598a(r5)
            throw r0
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00ed:
            return r1
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139w3.C2092p.mo6599b():boolean");
    }
}
