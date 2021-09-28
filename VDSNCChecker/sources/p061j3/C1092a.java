package p061j3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j3.a */
public final class C1092a<T> implements C1096d<T> {

    /* renamed from: a */
    public final AtomicReference<C1096d<T>> f3860a;

    public C1092a(C1096d<? extends T> dVar) {
        this.f3860a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        C1096d andSet = this.f3860a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
