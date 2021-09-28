package p091o3;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o3.m */
public final class C1534m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4764b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4765c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4766d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4767e;

    /* renamed from: a */
    public final AtomicReferenceArray<C1530i> f4768a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C1534m> cls = C1534m.class;
        f4764b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f4765c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f4766d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f4767e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final C1530i mo5484a(C1530i iVar, boolean z) {
        if (z) {
            return mo5485b(iVar);
        }
        C1530i iVar2 = (C1530i) f4764b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return mo5485b(iVar2);
    }

    /* renamed from: b */
    public final C1530i mo5485b(C1530i iVar) {
        boolean z = true;
        if (iVar.f4757f.mo5481v() != 1) {
            z = false;
        }
        if (z) {
            f4767e.incrementAndGet(this);
        }
        if (mo5486c() == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.f4768a.get(i) != null) {
            Thread.yield();
        }
        this.f4768a.lazySet(i, iVar);
        f4765c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int mo5486c() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final int mo5487d() {
        return this.lastScheduledTask != null ? mo5486c() + 1 : mo5486c();
    }

    /* renamed from: e */
    public final C1530i mo5488e() {
        C1530i iVar = (C1530i) f4764b.getAndSet(this, (Object) null);
        return iVar == null ? mo5489f() : iVar;
    }

    /* renamed from: f */
    public final C1530i mo5489f() {
        C1530i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f4766d.compareAndSet(this, i, i + 1) && (andSet = this.f4768a.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f4757f.mo5481v() != 1) {
                    z = false;
                }
                if (z) {
                    f4767e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: g */
    public final long mo5490g(C1534m mVar) {
        int i = mVar.consumerIndex;
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<C1530i> atomicReferenceArray = mVar.f4768a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            C1530i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if (iVar.f4757f.mo5481v() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, iVar, (Object) null)) {
                    f4767e.decrementAndGet(mVar);
                    mo5484a(iVar, false);
                    return -1;
                }
            }
            i++;
        }
        return mo5491h(mVar, true);
    }

    /* renamed from: h */
    public final long mo5491h(C1534m mVar, boolean z) {
        C1530i iVar;
        do {
            iVar = (C1530i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f4757f.mo5481v() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            Objects.requireNonNull((C1527f) C1533l.f4763e);
            long nanoTime = System.nanoTime() - iVar.f4756e;
            long j = C1533l.f4759a;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!f4764b.compareAndSet(mVar, iVar, (Object) null));
        mo5484a(iVar, false);
        return -1;
    }
}
