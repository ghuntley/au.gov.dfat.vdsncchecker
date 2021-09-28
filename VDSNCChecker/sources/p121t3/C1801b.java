package p121t3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p019c3.C0636l;
import p025d3.C0801e;
import p025d3.C0802f;
import p031e3.C0870a;
import p072l2.C1241e;
import p126u2.C1850k;

/* renamed from: t3.b */
public final class C1801b extends C1804e implements List<C1804e>, C0870a {

    /* renamed from: e */
    public final List<C1804e> f5451e;

    public C1801b(List<? extends C1804e> list) {
        super((C0802f) null);
        this.f5451e = list;
    }

    public void add(int i, Object obj) {
        C1804e eVar = (C1804e) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C1804e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C1804e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C1804e)) {
            return false;
        }
        C1804e eVar = (C1804e) obj;
        C1241e.m3517j(eVar, "element");
        return this.f5451e.contains(eVar);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C1241e.m3517j(collection, "elements");
        return this.f5451e.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return C1241e.m3513b(this.f5451e, obj);
    }

    public Object get(int i) {
        return this.f5451e.get(i);
    }

    public int hashCode() {
        return this.f5451e.hashCode();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof C1804e)) {
            return -1;
        }
        C1804e eVar = (C1804e) obj;
        C1241e.m3517j(eVar, "element");
        return this.f5451e.indexOf(eVar);
    }

    public boolean isEmpty() {
        return this.f5451e.isEmpty();
    }

    public Iterator<C1804e> iterator() {
        return this.f5451e.iterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C1804e)) {
            return -1;
        }
        C1804e eVar = (C1804e) obj;
        C1241e.m3517j(eVar, "element");
        return this.f5451e.lastIndexOf(eVar);
    }

    public ListIterator<C1804e> listIterator() {
        return this.f5451e.listIterator();
    }

    public ListIterator<C1804e> listIterator(int i) {
        return this.f5451e.listIterator(i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C1804e> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        C1804e eVar = (C1804e) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f5451e.size();
    }

    public void sort(Comparator<? super C1804e> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C1804e> subList(int i, int i2) {
        return this.f5451e.subList(i, i2);
    }

    public Object[] toArray() {
        return C0801e.m2397a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C1241e.m3517j(tArr, "array");
        return C0801e.m2398b(this, tArr);
    }

    public String toString() {
        return C1850k.m5051M(this.f5451e, ",", "[", "]", 0, (CharSequence) null, (C0636l) null, 56);
    }

    public boolean add(Object obj) {
        C1804e eVar = (C1804e) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
