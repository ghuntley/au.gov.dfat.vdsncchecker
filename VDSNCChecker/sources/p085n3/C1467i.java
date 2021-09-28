package p085n3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n3.i */
public class C1467i<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4608a = AtomicReferenceFieldUpdater.newUpdater(C1467i.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C1467i(boolean z) {
        this._cur = new C1468j(8, z);
    }

    /* renamed from: a */
    public final boolean mo5333a(E e) {
        while (true) {
            C1468j jVar = (C1468j) this._cur;
            int a = jVar.mo5337a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f4608a.compareAndSet(this, jVar, jVar.mo5341e());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo5334b() {
        while (true) {
            C1468j jVar = (C1468j) this._cur;
            if (!jVar.mo5338b()) {
                f4608a.compareAndSet(this, jVar, jVar.mo5341e());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo5335c() {
        return ((C1468j) this._cur).mo5339c();
    }

    /* renamed from: d */
    public final E mo5336d() {
        while (true) {
            C1468j jVar = (C1468j) this._cur;
            E f = jVar.mo5342f();
            if (f != C1468j.f4611g) {
                return f;
            }
            f4608a.compareAndSet(this, jVar, jVar.mo5341e());
        }
    }
}
