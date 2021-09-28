package p062j4;

import java.util.concurrent.atomic.AtomicReference;
import okio.Segment;
import p072l2.C1241e;

/* renamed from: j4.v */
public final class C1130v {

    /* renamed from: a */
    public static final C1129u f3925a = new C1129u(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f3926b;

    /* renamed from: c */
    public static final AtomicReference<Segment>[] f3927c;

    /* renamed from: d */
    public static final C1130v f3928d = new C1130v();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3926b = highestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f3927c = atomicReferenceArr;
    }

    /* renamed from: b */
    public static final void m3300b(C1129u uVar) {
        AtomicReference<C1129u> a;
        C1129u uVar2;
        if (!(uVar.f3923f == null && uVar.f3924g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.f3921d && (uVar2 = a.get()) != f3925a) {
            int i = uVar2 != null ? uVar2.f3920c : 0;
            if (i < 65536) {
                uVar.f3923f = uVar2;
                uVar.f3919b = 0;
                uVar.f3920c = i + 8192;
                if (!(a = f3928d.mo4705a()).compareAndSet(uVar2, uVar)) {
                    uVar.f3923f = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final C1129u m3301c() {
        AtomicReference<C1129u> a = f3928d.mo4705a();
        C1129u uVar = f3925a;
        C1129u andSet = a.getAndSet(uVar);
        if (andSet == uVar) {
            return new C1129u();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C1129u();
        }
        a.set(andSet.f3923f);
        andSet.f3923f = null;
        andSet.f3920c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<C1129u> mo4705a() {
        Thread currentThread = Thread.currentThread();
        C1241e.m3516f(currentThread, "Thread.currentThread()");
        return f3927c[(int) (currentThread.getId() & (((long) f3926b) - 1))];
    }
}
