package p091o3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p073l3.C1266b0;
import p073l3.C1305n0;
import p138w2.C2046f;

/* renamed from: o3.c */
public class C1524c extends C1305n0 {

    /* renamed from: f */
    public final int f4743f;

    /* renamed from: g */
    public final int f4744g;

    /* renamed from: h */
    public final long f4745h;

    /* renamed from: i */
    public final String f4746i;

    /* renamed from: j */
    public C1520a f4747j;

    public C1524c(int i, int i2, String str, int i3) {
        int i4 = (i3 & 1) != 0 ? C1533l.f4760b : i;
        int i5 = (i3 & 2) != 0 ? C1533l.f4761c : i2;
        String str2 = (i3 & 4) != 0 ? "DefaultDispatcher" : null;
        long j = C1533l.f4762d;
        this.f4743f = i4;
        this.f4744g = i5;
        this.f4745h = j;
        this.f4746i = str2;
        this.f4747j = new C1520a(i4, i5, j, str2);
    }

    /* renamed from: R */
    public void mo5067R(C2046f fVar, Runnable runnable) {
        try {
            C1520a aVar = this.f4747j;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C1520a.f4716l;
            aVar.mo5457h(runnable, C1528g.f4755e, false);
        } catch (RejectedExecutionException unused) {
            C1266b0.f4274k.mo5068b0(runnable);
        }
    }
}
