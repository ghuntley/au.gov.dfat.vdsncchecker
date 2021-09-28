package p015c;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c.d */
public abstract class C0555d {

    /* renamed from: a */
    public boolean f2356a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C0552a> f2357b = new CopyOnWriteArrayList<>();

    public C0555d(boolean z) {
        this.f2356a = z;
    }

    /* renamed from: a */
    public abstract void mo1736a();

    /* renamed from: b */
    public final void mo2701b() {
        Iterator<C0552a> it = this.f2357b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
