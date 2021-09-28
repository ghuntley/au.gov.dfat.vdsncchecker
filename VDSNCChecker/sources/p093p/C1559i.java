package p093p;

/* renamed from: p.i */
public class C1559i<E> implements Cloneable {

    /* renamed from: i */
    public static final Object f4841i = new Object();

    /* renamed from: e */
    public boolean f4842e = false;

    /* renamed from: f */
    public int[] f4843f;

    /* renamed from: g */
    public Object[] f4844g;

    /* renamed from: h */
    public int f4845h;

    public C1559i() {
        int e = C1549d.m4308e(10);
        this.f4843f = new int[e];
        this.f4844g = new Object[e];
    }

    /* renamed from: b */
    public void mo5627b(int i, E e) {
        int i2 = this.f4845h;
        if (i2 == 0 || i > this.f4843f[i2 - 1]) {
            if (this.f4842e && i2 >= this.f4843f.length) {
                mo5630e();
            }
            int i3 = this.f4845h;
            if (i3 >= this.f4843f.length) {
                int e2 = C1549d.m4308e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f4843f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f4844g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4843f = iArr;
                this.f4844g = objArr;
            }
            this.f4843f[i3] = i;
            this.f4844g[i3] = e;
            this.f4845h = i3 + 1;
            return;
        }
        mo5634l(i, e);
    }

    /* renamed from: d */
    public C1559i<E> clone() {
        try {
            C1559i<E> iVar = (C1559i) super.clone();
            iVar.f4843f = (int[]) this.f4843f.clone();
            iVar.f4844g = (Object[]) this.f4844g.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final void mo5630e() {
        int i = this.f4845h;
        int[] iArr = this.f4843f;
        Object[] objArr = this.f4844g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4841i) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4842e = false;
        this.f4845h = i2;
    }

    /* renamed from: f */
    public E mo5631f(int i) {
        return mo5632j(i, (Object) null);
    }

    /* renamed from: j */
    public E mo5632j(int i, E e) {
        int a = C1549d.m4304a(this.f4843f, this.f4845h, i);
        if (a >= 0) {
            E[] eArr = this.f4844g;
            if (eArr[a] != f4841i) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: k */
    public int mo5633k(int i) {
        if (this.f4842e) {
            mo5630e();
        }
        return this.f4843f[i];
    }

    /* renamed from: l */
    public void mo5634l(int i, E e) {
        int a = C1549d.m4304a(this.f4843f, this.f4845h, i);
        if (a >= 0) {
            this.f4844g[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f4845h;
        if (i2 < i3) {
            Object[] objArr = this.f4844g;
            if (objArr[i2] == f4841i) {
                this.f4843f[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f4842e && i3 >= this.f4843f.length) {
            mo5630e();
            i2 = ~C1549d.m4304a(this.f4843f, this.f4845h, i);
        }
        int i4 = this.f4845h;
        if (i4 >= this.f4843f.length) {
            int e2 = C1549d.m4308e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f4843f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f4844g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4843f = iArr;
            this.f4844g = objArr2;
        }
        int i5 = this.f4845h;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f4843f;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f4844g;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f4845h - i2);
        }
        this.f4843f[i2] = i;
        this.f4844g[i2] = e;
        this.f4845h++;
    }

    /* renamed from: m */
    public int mo5635m() {
        if (this.f4842e) {
            mo5630e();
        }
        return this.f4845h;
    }

    /* renamed from: n */
    public E mo5636n(int i) {
        if (this.f4842e) {
            mo5630e();
        }
        return this.f4844g[i];
    }

    public String toString() {
        if (mo5635m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4845h * 28);
        sb.append('{');
        for (int i = 0; i < this.f4845h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo5633k(i));
            sb.append('=');
            Object n = mo5636n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
