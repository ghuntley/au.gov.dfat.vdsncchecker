package p074l4;

import java.util.Objects;

/* renamed from: l4.f */
public class C1351f {

    /* renamed from: d */
    public static final C1348e[] f4373d = new C1348e[0];

    /* renamed from: a */
    public C1348e[] f4374a;

    /* renamed from: b */
    public int f4375b;

    /* renamed from: c */
    public boolean f4376c;

    public C1351f(int i) {
        if (i >= 0) {
            this.f4374a = i == 0 ? f4373d : new C1348e[i];
            this.f4375b = 0;
            this.f4376c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    /* renamed from: b */
    public static C1348e[] m3840b(C1348e[] eVarArr) {
        return eVarArr.length < 1 ? f4373d : (C1348e[]) eVarArr.clone();
    }

    /* renamed from: a */
    public void mo5173a(C1348e eVar) {
        Objects.requireNonNull(eVar, "'element' cannot be null");
        C1348e[] eVarArr = this.f4374a;
        int length = eVarArr.length;
        boolean z = true;
        int i = this.f4375b + 1;
        if (i <= length) {
            z = false;
        }
        if (this.f4376c || z) {
            C1348e[] eVarArr2 = new C1348e[Math.max(eVarArr.length, (i >> 1) + i)];
            System.arraycopy(this.f4374a, 0, eVarArr2, 0, this.f4375b);
            this.f4374a = eVarArr2;
            this.f4376c = false;
        }
        this.f4374a[this.f4375b] = eVar;
        this.f4375b = i;
    }

    /* renamed from: c */
    public C1348e mo5174c(int i) {
        if (i < this.f4375b) {
            return this.f4374a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f4375b);
    }

    /* renamed from: d */
    public C1348e[] mo5175d() {
        int i = this.f4375b;
        if (i == 0) {
            return f4373d;
        }
        C1348e[] eVarArr = this.f4374a;
        if (eVarArr.length == i) {
            this.f4376c = true;
            return eVarArr;
        }
        C1348e[] eVarArr2 = new C1348e[i];
        System.arraycopy(eVarArr, 0, eVarArr2, 0, i);
        return eVarArr2;
    }
}
