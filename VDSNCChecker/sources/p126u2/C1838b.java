package p126u2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.b */
public abstract class C1838b<E> extends C1836a<E> implements List<E> {

    /* renamed from: u2.b$a */
    public class C1839a implements Iterator<E>, C0870a {

        /* renamed from: e */
        public int f5531e;

        public C1839a() {
        }

        public boolean hasNext() {
            return this.f5531e < C1838b.this.mo6251b();
        }

        public E next() {
            if (hasNext()) {
                C1838b bVar = C1838b.this;
                int i = this.f5531e;
                this.f5531e = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u2.b$b */
    public class C1840b extends C1838b<E>.a implements ListIterator<E> {
        public C1840b(int i) {
            super();
            int b = C1838b.this.mo6251b();
            if (i < 0 || i > b) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + b);
            }
            this.f5531e = i;
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.f5531e > 0;
        }

        public int nextIndex() {
            return this.f5531e;
        }

        public E previous() {
            if (hasPrevious()) {
                C1838b bVar = C1838b.this;
                int i = this.f5531e - 1;
                this.f5531e = i;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f5531e - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u2.b$c */
    public static final class C1841c<E> extends C1838b<E> implements RandomAccess {

        /* renamed from: e */
        public int f5534e;

        /* renamed from: f */
        public final C1838b<E> f5535f;

        /* renamed from: g */
        public final int f5536g;

        public C1841c(C1838b<? extends E> bVar, int i, int i2) {
            this.f5535f = bVar;
            this.f5536g = i;
            int b = bVar.mo6251b();
            if (i < 0 || i2 > b) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + b);
            } else if (i <= i2) {
                this.f5534e = i2 - i;
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: b */
        public int mo6251b() {
            return this.f5534e;
        }

        public E get(int i) {
            int i2 = this.f5534e;
            if (i >= 0 && i < i2) {
                return this.f5535f.get(this.f5536g + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C1241e.m3517j(this, "c");
        C1241e.m3517j(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object b : this) {
                if (!C1241e.m3513b(b, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    public int hashCode() {
        C1241e.m3517j(this, "c");
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C1241e.m3513b(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C1839a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C1241e.m3513b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C1840b(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C1840b(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C1841c(this, i, i2);
    }
}
