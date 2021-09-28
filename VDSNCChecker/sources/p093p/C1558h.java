package p093p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: p.h */
public class C1558h<K, V> {

    /* renamed from: h */
    public static Object[] f4834h;

    /* renamed from: i */
    public static int f4835i;

    /* renamed from: j */
    public static Object[] f4836j;

    /* renamed from: k */
    public static int f4837k;

    /* renamed from: e */
    public int[] f4838e;

    /* renamed from: f */
    public Object[] f4839f;

    /* renamed from: g */
    public int f4840g;

    public C1558h() {
        this.f4838e = C1549d.f4804a;
        this.f4839f = C1549d.f4806c;
        this.f4840g = 0;
    }

    public C1558h(int i) {
        if (i == 0) {
            this.f4838e = C1549d.f4804a;
            this.f4839f = C1549d.f4806c;
        } else {
            m4334b(i);
        }
        this.f4840g = 0;
    }

    /* renamed from: b */
    private void m4334b(int i) {
        Class<C1558h> cls = C1558h.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f4836j;
                if (objArr != null) {
                    this.f4839f = objArr;
                    f4836j = (Object[]) objArr[0];
                    this.f4838e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4837k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f4834h;
                if (objArr2 != null) {
                    this.f4839f = objArr2;
                    f4834h = (Object[]) objArr2[0];
                    this.f4838e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4835i--;
                    return;
                }
            }
        }
        this.f4838e = new int[i];
        this.f4839f = new Object[(i << 1)];
    }

    /* renamed from: d */
    public static void m4335d(int[] iArr, Object[] objArr, int i) {
        Class<C1558h> cls = C1558h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f4837k < 10) {
                    objArr[0] = f4836j;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4836j = objArr;
                    f4837k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f4835i < 10) {
                    objArr[0] = f4834h;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4834h = objArr;
                    f4835i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo5602c(int i) {
        int i2 = this.f4840g;
        int[] iArr = this.f4838e;
        if (iArr.length < i) {
            Object[] objArr = this.f4839f;
            m4334b(i);
            if (this.f4840g > 0) {
                System.arraycopy(iArr, 0, this.f4838e, 0, i2);
                System.arraycopy(objArr, 0, this.f4839f, 0, i2 << 1);
            }
            m4335d(iArr, objArr, i2);
        }
        if (this.f4840g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f4840g;
        if (i > 0) {
            int[] iArr = this.f4838e;
            Object[] objArr = this.f4839f;
            this.f4838e = C1549d.f4804a;
            this.f4839f = C1549d.f4806c;
            this.f4840g = 0;
            m4335d(iArr, objArr, i);
        }
        if (this.f4840g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo5608f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo5612h(obj) >= 0;
    }

    /* renamed from: e */
    public int mo5606e(Object obj, int i) {
        int i2 = this.f4840g;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = C1549d.m4304a(this.f4838e, i2, i);
            if (a < 0 || obj.equals(this.f4839f[a << 1])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.f4838e[i3] == i) {
                if (obj.equals(this.f4839f[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.f4838e[i4] == i) {
                if (obj.equals(this.f4839f[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1558h) {
            C1558h hVar = (C1558h) obj;
            if (this.f4840g != hVar.f4840g) {
                return false;
            }
            int i = 0;
            while (i < this.f4840g) {
                try {
                    Object i2 = mo5614i(i);
                    Object l = mo5618l(i);
                    Object obj2 = hVar.get(i2);
                    if (l == null) {
                        if (obj2 != null || !hVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f4840g != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f4840g) {
                try {
                    Object i4 = mo5614i(i3);
                    Object l2 = mo5618l(i3);
                    Object obj3 = map.get(i4);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo5608f(Object obj) {
        return obj == null ? mo5609g() : mo5606e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int mo5609g() {
        int i = this.f4840g;
        if (i == 0) {
            return -1;
        }
        try {
            int a = C1549d.m4304a(this.f4838e, i, 0);
            if (a < 0 || this.f4839f[a << 1] == null) {
                return a;
            }
            int i2 = a + 1;
            while (i2 < i && this.f4838e[i2] == 0) {
                if (this.f4839f[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a - 1;
            while (i3 >= 0 && this.f4838e[i3] == 0) {
                if (this.f4839f[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo5608f(obj);
        return f >= 0 ? this.f4839f[(f << 1) + 1] : v;
    }

    /* renamed from: h */
    public int mo5612h(Object obj) {
        int i = this.f4840g * 2;
        Object[] objArr = this.f4839f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f4838e;
        Object[] objArr = this.f4839f;
        int i = this.f4840g;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo5614i(int i) {
        return this.f4839f[i << 1];
    }

    public boolean isEmpty() {
        return this.f4840g <= 0;
    }

    /* renamed from: j */
    public V mo5616j(int i) {
        V[] vArr = this.f4839f;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f4840g;
        int i4 = 0;
        if (i3 <= 1) {
            m4335d(this.f4838e, vArr, i3);
            this.f4838e = C1549d.f4804a;
            this.f4839f = C1549d.f4806c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f4838e;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f4839f;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f4839f;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m4334b(i6);
                if (i3 == this.f4840g) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f4838e, 0, i);
                        System.arraycopy(vArr, 0, this.f4839f, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f4838e, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f4839f, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f4840g) {
            this.f4840g = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: k */
    public V mo5617k(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f4839f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: l */
    public V mo5618l(int i) {
        return this.f4839f[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f4840g;
        if (k == null) {
            i2 = mo5609g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo5606e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f4839f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f4838e;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f4839f;
            m4334b(i6);
            if (i3 == this.f4840g) {
                int[] iArr2 = this.f4838e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f4839f, 0, objArr.length);
                }
                m4335d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f4838e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f4839f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f4840g - i5) << 1);
        }
        int i8 = this.f4840g;
        if (i3 == i8) {
            int[] iArr4 = this.f4838e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f4839f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f4840g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int f = mo5608f(obj);
        if (f >= 0) {
            return mo5616j(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo5608f(obj);
        if (f < 0) {
            return false;
        }
        Object l = mo5618l(f);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        mo5616j(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo5608f(k);
        if (f >= 0) {
            return mo5617k(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo5608f(k);
        if (f < 0) {
            return false;
        }
        V l = mo5618l(f);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        mo5617k(f, v2);
        return true;
    }

    public int size() {
        return this.f4840g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4840g * 28);
        sb.append('{');
        for (int i = 0; i < this.f4840g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo5614i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l = mo5618l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
