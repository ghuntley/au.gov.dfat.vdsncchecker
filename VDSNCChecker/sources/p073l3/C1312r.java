package p073l3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: l3.r */
public class C1312r {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4321b = AtomicIntegerFieldUpdater.newUpdater(C1312r.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f4322a;

    public C1312r(Throwable th, boolean z) {
        this.f4322a = th;
        this._handled = z ? 1 : 0;
    }

    public C1312r(Throwable th, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.f4322a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo5100a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f4322a + ']';
    }
}
