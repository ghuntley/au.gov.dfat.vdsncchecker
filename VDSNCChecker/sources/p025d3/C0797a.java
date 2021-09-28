package p025d3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p031e3.C0870a;

/* renamed from: d3.a */
public final class C0797a<T> implements Iterator<T>, C0870a {

    /* renamed from: e */
    public int f3102e;

    /* renamed from: f */
    public final T[] f3103f;

    public C0797a(T[] tArr) {
        this.f3103f = tArr;
    }

    public boolean hasNext() {
        return this.f3102e < this.f3103f.length;
    }

    public T next() {
        try {
            T[] tArr = this.f3103f;
            int i = this.f3102e;
            this.f3102e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f3102e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
