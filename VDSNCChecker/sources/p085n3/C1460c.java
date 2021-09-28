package p085n3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n3.c */
public abstract class C1460c<T> extends C1471l {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4594a = AtomicReferenceFieldUpdater.newUpdater(C1460c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C1459b.f4593a;

    /* renamed from: a */
    public final Object mo5319a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C1459b.f4593a;
        if (obj2 == obj3) {
            obj2 = mo5151c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!f4594a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        mo5320b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo5320b(T t, Object obj);

    /* renamed from: c */
    public abstract Object mo5151c(T t);
}
