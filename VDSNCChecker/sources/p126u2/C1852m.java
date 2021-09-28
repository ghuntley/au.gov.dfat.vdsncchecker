package p126u2;

import androidx.appcompat.widget.C0131a0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p025d3.C0801e;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.m */
public final class C1852m implements List, Serializable, RandomAccess, C0870a {

    /* renamed from: e */
    public static final C1852m f5542e = new C1852m();

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            C1241e.m3517j((Void) obj, "element");
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C1241e.m3517j(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            C1241e.m3517j((Void) obj, "element");
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C1851l.f5541e;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            C1241e.m3517j((Void) obj, "element");
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C1851l.f5541e;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C1851l.f5541e;
        }
        throw new IndexOutOfBoundsException(C0131a0.m344a("Index: ", i));
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return C0801e.m2397a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C0801e.m2398b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
