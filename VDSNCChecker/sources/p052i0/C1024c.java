package p052i0;

import p099q.C1595f;

/* renamed from: i0.c */
public class C1024c<T> extends C1595f {

    /* renamed from: d */
    public final Object f3743d = new Object();

    public C1024c(int i) {
        super(i, 1);
    }

    /* renamed from: a */
    public T mo4463a() {
        T a;
        synchronized (this.f3743d) {
            a = super.mo4463a();
        }
        return a;
    }

    /* renamed from: c */
    public boolean mo4464c(T t) {
        boolean c;
        synchronized (this.f3743d) {
            c = super.mo4464c(t);
        }
        return c;
    }
}
