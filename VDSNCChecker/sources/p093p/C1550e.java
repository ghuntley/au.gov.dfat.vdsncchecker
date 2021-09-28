package p093p;

/* renamed from: p.e */
public class C1550e<E> implements Cloneable {

    /* renamed from: i */
    public static final Object f4807i = new Object();

    /* renamed from: e */
    public boolean f4808e = false;

    /* renamed from: f */
    public long[] f4809f;

    /* renamed from: g */
    public Object[] f4810g;

    /* renamed from: h */
    public int f4811h;

    public C1550e() {
        int f = C1549d.m4309f(10);
        this.f4809f = new long[f];
        this.f4810g = new Object[f];
    }

    /* renamed from: b */
    public void mo5531b() {
        int i = this.f4811h;
        Object[] objArr = this.f4810g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4811h = 0;
        this.f4808e = false;
    }

    /* renamed from: d */
    public C1550e<E> clone() {
        try {
            C1550e<E> eVar = (C1550e) super.clone();
            eVar.f4809f = (long[]) this.f4809f.clone();
            eVar.f4810g = (Object[]) this.f4810g.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final void mo5534e() {
        int i = this.f4811h;
        long[] jArr = this.f4809f;
        Object[] objArr = this.f4810g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4807i) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4808e = false;
        this.f4811h = i2;
    }

    /* renamed from: f */
    public E mo5535f(long j) {
        return mo5536j(j, (Object) null);
    }

    /* renamed from: j */
    public E mo5536j(long j, E e) {
        int b = C1549d.m4305b(this.f4809f, this.f4811h, j);
        if (b >= 0) {
            E[] eArr = this.f4810g;
            if (eArr[b] != f4807i) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: k */
    public void mo5537k(long j, E e) {
        int b = C1549d.m4305b(this.f4809f, this.f4811h, j);
        if (b >= 0) {
            this.f4810g[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f4811h;
        if (i < i2) {
            Object[] objArr = this.f4810g;
            if (objArr[i] == f4807i) {
                this.f4809f[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f4808e && i2 >= this.f4809f.length) {
            mo5534e();
            i = ~C1549d.m4305b(this.f4809f, this.f4811h, j);
        }
        int i3 = this.f4811h;
        if (i3 >= this.f4809f.length) {
            int f = C1549d.m4309f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f4809f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4810g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4809f = jArr;
            this.f4810g = objArr2;
        }
        int i4 = this.f4811h;
        if (i4 - i != 0) {
            long[] jArr3 = this.f4809f;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f4810g;
            System.arraycopy(objArr4, i, objArr4, i5, this.f4811h - i);
        }
        this.f4809f[i] = j;
        this.f4810g[i] = e;
        this.f4811h++;
    }

    /* renamed from: l */
    public int mo5538l() {
        if (this.f4808e) {
            mo5534e();
        }
        return this.f4811h;
    }

    /* renamed from: m */
    public E mo5539m(int i) {
        if (this.f4808e) {
            mo5534e();
        }
        return this.f4810g[i];
    }

    public String toString() {
        if (mo5538l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4811h * 28);
        sb.append('{');
        for (int i = 0; i < this.f4811h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f4808e) {
                mo5534e();
            }
            sb.append(this.f4809f[i]);
            sb.append('=');
            Object m = mo5539m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
