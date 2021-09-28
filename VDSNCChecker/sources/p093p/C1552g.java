package p093p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: p.g */
public abstract class C1552g<K, V> {

    /* renamed from: a */
    public C1552g<K, V>.b f4819a;

    /* renamed from: b */
    public C1552g<K, V>.c f4820b;

    /* renamed from: c */
    public C1552g<K, V>.e f4821c;

    /* renamed from: p.g$a */
    public final class C1553a<T> implements Iterator<T> {

        /* renamed from: e */
        public final int f4822e;

        /* renamed from: f */
        public int f4823f;

        /* renamed from: g */
        public int f4824g;

        /* renamed from: h */
        public boolean f4825h = false;

        public C1553a(int i) {
            this.f4822e = i;
            this.f4823f = C1552g.this.mo5504d();
        }

        public boolean hasNext() {
            return this.f4824g < this.f4823f;
        }

        public T next() {
            if (hasNext()) {
                T b = C1552g.this.mo5502b(this.f4824g, this.f4822e);
                this.f4824g++;
                this.f4825h = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f4825h) {
                int i = this.f4824g - 1;
                this.f4824g = i;
                this.f4823f--;
                this.f4825h = false;
                C1552g.this.mo5508h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: p.g$b */
    public final class C1554b implements Set<Map.Entry<K, V>> {
        public C1554b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C1552g.this.mo5504d();
            for (Map.Entry entry : collection) {
                C1552g.this.mo5507g(entry.getKey(), entry.getValue());
            }
            return d != C1552g.this.mo5504d();
        }

        public void clear() {
            C1552g.this.mo5501a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C1552g.this.mo5505e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C1549d.m4306c(C1552g.this.mo5502b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1552g.m4321j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C1552g.this.mo5504d() - 1; d >= 0; d--) {
                Object b = C1552g.this.mo5502b(d, 0);
                Object b2 = C1552g.this.mo5502b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C1552g.this.mo5504d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1556d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C1552g.this.mo5504d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p.g$c */
    public final class C1555c implements Set<K> {
        public C1555c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1552g.this.mo5501a();
        }

        public boolean contains(Object obj) {
            return C1552g.this.mo5505e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c = C1552g.this.mo5503c();
            for (Object containsKey : collection) {
                if (!c.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1552g.m4321j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C1552g.this.mo5504d() - 1; d >= 0; d--) {
                Object b = C1552g.this.mo5502b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C1552g.this.mo5504d() == 0;
        }

        public Iterator<K> iterator() {
            return new C1553a(0);
        }

        public boolean remove(Object obj) {
            int e = C1552g.this.mo5505e(obj);
            if (e < 0) {
                return false;
            }
            C1552g.this.mo5508h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c = C1552g.this.mo5503c();
            int size = c.size();
            for (Object remove : collection) {
                c.remove(remove);
            }
            return size != c.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return C1552g.m4322k(C1552g.this.mo5503c(), collection);
        }

        public int size() {
            return C1552g.this.mo5504d();
        }

        public Object[] toArray() {
            return C1552g.this.mo5545l(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1552g.this.mo5546m(tArr, 0);
        }
    }

    /* renamed from: p.g$d */
    public final class C1556d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: e */
        public int f4829e;

        /* renamed from: f */
        public int f4830f;

        /* renamed from: g */
        public boolean f4831g = false;

        public C1556d() {
            this.f4829e = C1552g.this.mo5504d() - 1;
            this.f4830f = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f4831g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C1549d.m4306c(entry.getKey(), C1552g.this.mo5502b(this.f4830f, 0)) && C1549d.m4306c(entry.getValue(), C1552g.this.mo5502b(this.f4830f, 1));
            }
        }

        public K getKey() {
            if (this.f4831g) {
                return C1552g.this.mo5502b(this.f4830f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f4831g) {
                return C1552g.this.mo5502b(this.f4830f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f4830f < this.f4829e;
        }

        public int hashCode() {
            if (this.f4831g) {
                int i = 0;
                Object b = C1552g.this.mo5502b(this.f4830f, 0);
                Object b2 = C1552g.this.mo5502b(this.f4830f, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f4830f++;
                this.f4831g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f4831g) {
                C1552g.this.mo5508h(this.f4830f);
                this.f4830f--;
                this.f4829e--;
                this.f4831g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f4831g) {
                return C1552g.this.mo5509i(this.f4830f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: p.g$e */
    public final class C1557e implements Collection<V> {
        public C1557e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1552g.this.mo5501a();
        }

        public boolean contains(Object obj) {
            return C1552g.this.mo5506f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1552g.this.mo5504d() == 0;
        }

        public Iterator<V> iterator() {
            return new C1553a(1);
        }

        public boolean remove(Object obj) {
            int f = C1552g.this.mo5506f(obj);
            if (f < 0) {
                return false;
            }
            C1552g.this.mo5508h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C1552g.this.mo5504d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C1552g.this.mo5502b(i, 1))) {
                    C1552g.this.mo5508h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C1552g.this.mo5504d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C1552g.this.mo5502b(i, 1))) {
                    C1552g.this.mo5508h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C1552g.this.mo5504d();
        }

        public Object[] toArray() {
            return C1552g.this.mo5545l(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1552g.this.mo5546m(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <T> boolean m4321j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m4322k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo5501a();

    /* renamed from: b */
    public abstract Object mo5502b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo5503c();

    /* renamed from: d */
    public abstract int mo5504d();

    /* renamed from: e */
    public abstract int mo5505e(Object obj);

    /* renamed from: f */
    public abstract int mo5506f(Object obj);

    /* renamed from: g */
    public abstract void mo5507g(K k, V v);

    /* renamed from: h */
    public abstract void mo5508h(int i);

    /* renamed from: i */
    public abstract V mo5509i(int i, V v);

    /* renamed from: l */
    public Object[] mo5545l(int i) {
        int d = mo5504d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo5502b(i2, i);
        }
        return objArr;
    }

    /* renamed from: m */
    public <T> T[] mo5546m(T[] tArr, int i) {
        int d = mo5504d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo5502b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
