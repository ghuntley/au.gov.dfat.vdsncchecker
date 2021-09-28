package p126u2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p025d3.C0801e;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.o */
public final class C1854o implements Set, Serializable, C0870a {

    /* renamed from: e */
    public static final C1854o f5544e = new C1854o();

    public /* synthetic */ boolean add(Object obj) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C1851l.f5541e;
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

    public final /* bridge */ int size() {
        return 0;
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
