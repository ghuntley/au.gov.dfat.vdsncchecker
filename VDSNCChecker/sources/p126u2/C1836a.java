package p126u2;

import java.util.Collection;
import java.util.Iterator;
import p019c3.C0636l;
import p025d3.C0801e;
import p025d3.C0806j;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.a */
public abstract class C1836a<E> implements Collection<E>, C0870a {

    /* renamed from: u2.a$a */
    public static final class C1837a extends C0806j implements C0636l<E, CharSequence> {

        /* renamed from: f */
        public final /* synthetic */ C1836a f5530f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1837a(C1836a aVar) {
            super(1);
            this.f5530f = aVar;
        }

        /* renamed from: m */
        public Object mo2828m(Object obj) {
            return obj == this.f5530f ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo6251b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator it = ((C1838b) this).iterator();
        while (it.hasNext()) {
            if (C1241e.m3513b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C1241e.m3517j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return mo6251b() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo6251b();
    }

    public Object[] toArray() {
        return C0801e.m2397a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C1241e.m3517j(tArr, "array");
        return C0801e.m2398b(this, tArr);
    }

    public String toString() {
        return C1850k.m5051M(this, ", ", "[", "]", 0, (CharSequence) null, new C1837a(this), 24);
    }
}
