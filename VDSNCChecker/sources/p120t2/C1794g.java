package p120t2;

import java.io.Serializable;
import p019c3.C0625a;
import p072l2.C1241e;

/* renamed from: t2.g */
public final class C1794g<T> implements C1790d<T>, Serializable {

    /* renamed from: e */
    public C0625a<? extends T> f5442e;

    /* renamed from: f */
    public volatile Object f5443f = C1796i.f5445a;

    /* renamed from: g */
    public final Object f5444g = this;

    public C1794g(C0625a aVar, Object obj, int i) {
        this.f5442e = aVar;
    }

    public T getValue() {
        T t;
        T t2 = this.f5443f;
        T t3 = C1796i.f5445a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f5444g) {
            t = this.f5443f;
            if (t == t3) {
                C0625a aVar = this.f5442e;
                C1241e.m3515e(aVar);
                t = aVar.mo40b();
                this.f5443f = t;
                this.f5442e = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f5443f != C1796i.f5445a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
