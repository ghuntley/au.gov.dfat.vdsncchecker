package p061j3;

import java.util.Iterator;
import p019c3.C0636l;
import p031e3.C0870a;

/* renamed from: j3.i */
public final class C1101i<T, R> implements C1096d<R> {

    /* renamed from: a */
    public final C1096d<T> f3867a;

    /* renamed from: b */
    public final C0636l<T, R> f3868b;

    /* renamed from: j3.i$a */
    public static final class C1102a implements Iterator<R>, C0870a {

        /* renamed from: e */
        public final Iterator<T> f3869e;

        /* renamed from: f */
        public final /* synthetic */ C1101i f3870f;

        public C1102a(C1101i iVar) {
            this.f3870f = iVar;
            this.f3869e = iVar.f3867a.iterator();
        }

        public boolean hasNext() {
            return this.f3869e.hasNext();
        }

        public R next() {
            return this.f3870f.f3868b.mo2828m(this.f3869e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1101i(C1096d<? extends T> dVar, C0636l<? super T, ? extends R> lVar) {
        this.f3867a = dVar;
        this.f3868b = lVar;
    }

    public Iterator<R> iterator() {
        return new C1102a(this);
    }
}
