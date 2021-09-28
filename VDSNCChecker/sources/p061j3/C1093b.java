package p061j3;

import java.util.Iterator;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: j3.b */
public final class C1093b<T> implements C1096d<T>, C1095c<T> {

    /* renamed from: a */
    public final C1096d<T> f3861a;

    /* renamed from: b */
    public final int f3862b;

    /* renamed from: j3.b$a */
    public static final class C1094a implements Iterator<T>, C0870a {

        /* renamed from: e */
        public final Iterator<T> f3863e;

        /* renamed from: f */
        public int f3864f;

        public C1094a(C1093b bVar) {
            this.f3863e = bVar.f3861a.iterator();
            this.f3864f = bVar.f3862b;
        }

        /* renamed from: b */
        public final void mo4590b() {
            while (this.f3864f > 0 && this.f3863e.hasNext()) {
                this.f3863e.next();
                this.f3864f--;
            }
        }

        public boolean hasNext() {
            mo4590b();
            return this.f3863e.hasNext();
        }

        public T next() {
            mo4590b();
            return this.f3863e.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1093b(C1096d<? extends T> dVar, int i) {
        C1241e.m3517j(dVar, "sequence");
        this.f3861a = dVar;
        this.f3862b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C1096d<T> mo4589a(int i) {
        int i2 = this.f3862b + i;
        return i2 < 0 ? new C1093b(this, i) : new C1093b(this.f3861a, i2);
    }

    public Iterator<T> iterator() {
        return new C1094a(this);
    }
}
