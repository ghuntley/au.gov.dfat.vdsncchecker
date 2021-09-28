package p091o3;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p073l3.C1266b0;
import p073l3.C1305n0;
import p138w2.C2046f;

/* renamed from: o3.e */
public final class C1526e extends C1305n0 implements C1531j, Executor {

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4748k = AtomicIntegerFieldUpdater.newUpdater(C1526e.class, "inFlightTasks");

    /* renamed from: f */
    public final C1524c f4749f;

    /* renamed from: g */
    public final int f4750g;

    /* renamed from: h */
    public final String f4751h;

    /* renamed from: i */
    public final int f4752i;
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: j */
    public final ConcurrentLinkedQueue<Runnable> f4753j = new ConcurrentLinkedQueue<>();

    public C1526e(C1524c cVar, int i, String str, int i2) {
        this.f4749f = cVar;
        this.f4750g = i;
        this.f4751h = str;
        this.f4752i = i2;
    }

    /* renamed from: Q */
    public void mo5477Q() {
        Runnable poll = this.f4753j.poll();
        if (poll != null) {
            C1524c cVar = this.f4749f;
            Objects.requireNonNull(cVar);
            try {
                cVar.f4747j.mo5457h(poll, this, true);
            } catch (RejectedExecutionException unused) {
                C1266b0.f4274k.mo5068b0(cVar.f4747j.mo5453c(poll, this));
            }
        } else {
            f4748k.decrementAndGet(this);
            Runnable poll2 = this.f4753j.poll();
            if (poll2 != null) {
                mo5478T(poll2, true);
            }
        }
    }

    /* renamed from: R */
    public void mo5067R(C2046f fVar, Runnable runnable) {
        mo5478T(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v6 java.lang.Runnable) binds: [B:0:0x0000, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5478T(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4748k
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f4750g
            if (r1 > r2) goto L_0x0021
            o3.c r0 = r3.f4749f
            java.util.Objects.requireNonNull(r0)
            o3.a r1 = r0.f4747j     // Catch:{ RejectedExecutionException -> 0x0015 }
            r1.mo5457h(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            l3.b0 r5 = p073l3.C1266b0.f4274k
            o3.a r0 = r0.f4747j
            o3.i r4 = r0.mo5453c(r4, r3)
            r5.mo5068b0(r4)
        L_0x0020:
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f4753j
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f4750g
            if (r4 < r0) goto L_0x002f
            return
        L_0x002f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f4753j
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p091o3.C1526e.mo5478T(java.lang.Runnable, boolean):void");
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        mo5478T(runnable, false);
    }

    public String toString() {
        String str = this.f4751h;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f4749f + ']';
    }

    /* renamed from: v */
    public int mo5481v() {
        return this.f4752i;
    }
}
