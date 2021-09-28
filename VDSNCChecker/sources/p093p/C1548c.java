package p093p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p093p.C1552g;

/* renamed from: p.c */
public final class C1548c<E> implements Collection<E>, Set<E> {

    /* renamed from: i */
    public static final int[] f4794i = new int[0];

    /* renamed from: j */
    public static final Object[] f4795j = new Object[0];

    /* renamed from: k */
    public static Object[] f4796k;

    /* renamed from: l */
    public static int f4797l;

    /* renamed from: m */
    public static Object[] f4798m;

    /* renamed from: n */
    public static int f4799n;

    /* renamed from: e */
    public int[] f4800e = f4794i;

    /* renamed from: f */
    public Object[] f4801f = f4795j;

    /* renamed from: g */
    public int f4802g = 0;

    /* renamed from: h */
    public C1552g<E, E> f4803h;

    /* renamed from: b */
    public static void m4299b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1548c.class) {
                if (f4799n < 10) {
                    objArr[0] = f4798m;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4798m = objArr;
                    f4799n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1548c.class) {
                if (f4797l < 10) {
                    objArr[0] = f4796k;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4796k = objArr;
                    f4797l++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5510a(int i) {
        if (i == 8) {
            synchronized (C1548c.class) {
                Object[] objArr = f4798m;
                if (objArr != null) {
                    this.f4801f = objArr;
                    f4798m = (Object[]) objArr[0];
                    this.f4800e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4799n--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1548c.class) {
                Object[] objArr2 = f4796k;
                if (objArr2 != null) {
                    this.f4801f = objArr2;
                    f4796k = (Object[]) objArr2[0];
                    this.f4800e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4797l--;
                    return;
                }
            }
        }
        this.f4800e = new int[i];
        this.f4801f = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo5517d();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo5513c(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f4802g;
        int[] iArr = this.f4800e;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f4801f;
            mo5510a(i5);
            int[] iArr2 = this.f4800e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4801f, 0, objArr.length);
            }
            m4299b(iArr, objArr, this.f4802g);
        }
        int i6 = this.f4802g;
        if (i3 < i6) {
            int[] iArr3 = this.f4800e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f4801f;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f4802g - i3);
        }
        this.f4800e[i3] = i;
        this.f4801f[i3] = e;
        this.f4802g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f4802g;
        int[] iArr = this.f4800e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4801f;
            mo5510a(size);
            int i = this.f4802g;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4800e, 0, i);
                System.arraycopy(objArr, 0, this.f4801f, 0, this.f4802g);
            }
            m4299b(iArr, objArr, this.f4802g);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public final int mo5513c(Object obj, int i) {
        int i2 = this.f4802g;
        if (i2 == 0) {
            return -1;
        }
        int a = C1549d.m4304a(this.f4800e, i2, i);
        if (a < 0 || obj.equals(this.f4801f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f4800e[i3] == i) {
            if (obj.equals(this.f4801f[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f4800e[i4] == i) {
            if (obj.equals(this.f4801f[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public void clear() {
        int i = this.f4802g;
        if (i != 0) {
            m4299b(this.f4800e, this.f4801f, i);
            this.f4800e = f4794i;
            this.f4801f = f4795j;
            this.f4802g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int mo5517d() {
        int i = this.f4802g;
        if (i == 0) {
            return -1;
        }
        int a = C1549d.m4304a(this.f4800e, i, 0);
        if (a < 0 || this.f4801f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f4800e[i2] == 0) {
            if (this.f4801f[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f4800e[i3] == 0) {
            if (this.f4801f[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: e */
    public E mo5518e(int i) {
        E[] eArr = this.f4801f;
        E e = eArr[i];
        int i2 = this.f4802g;
        if (i2 <= 1) {
            m4299b(this.f4800e, eArr, i2);
            this.f4800e = f4794i;
            this.f4801f = f4795j;
            this.f4802g = 0;
        } else {
            int[] iArr = this.f4800e;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f4802g = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f4801f;
                    System.arraycopy(objArr, i5, objArr, i, this.f4802g - i);
                }
                this.f4801f[this.f4802g] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo5510a(i3);
                this.f4802g--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f4800e, 0, i);
                    System.arraycopy(eArr, 0, this.f4801f, 0, i);
                }
                int i6 = this.f4802g;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f4800e, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f4801f, i, this.f4802g - i);
                }
            }
        }
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4802g != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f4802g) {
                try {
                    if (!set.contains(this.f4801f[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f4800e;
        int i = this.f4802g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? mo5517d() : mo5513c(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f4802g <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f4803h == null) {
            this.f4803h = new C1547b(this);
        }
        C1552g<E, E> gVar = this.f4803h;
        if (gVar.f4820b == null) {
            gVar.f4820b = new C1552g.C1555c();
        }
        return gVar.f4820b.iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo5518e(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f4802g - 1; i >= 0; i--) {
            if (!collection.contains(this.f4801f[i])) {
                mo5518e(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f4802g;
    }

    public Object[] toArray() {
        int i = this.f4802g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4801f, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f4802g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f4802g);
        }
        System.arraycopy(this.f4801f, 0, tArr, 0, this.f4802g);
        int length = tArr.length;
        int i = this.f4802g;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4802g * 14);
        sb.append('{');
        for (int i = 0; i < this.f4802g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f4801f[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
