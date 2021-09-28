package p026d4;

import p072l2.C1241e;

/* renamed from: d4.t */
public final class C0850t {

    /* renamed from: a */
    public int f3300a;

    /* renamed from: b */
    public final int[] f3301b = new int[10];

    /* renamed from: a */
    public final int mo4129a() {
        if ((this.f3300a & 128) != 0) {
            return this.f3301b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void mo4130b(C0850t tVar) {
        C1241e.m3517j(tVar, "other");
        for (int i = 0; i < 10; i++) {
            boolean z = true;
            if (((1 << i) & tVar.f3300a) == 0) {
                z = false;
            }
            if (z) {
                mo4131c(i, tVar.f3301b[i]);
            }
        }
    }

    /* renamed from: c */
    public final C0850t mo4131c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f3301b;
            if (i < iArr.length) {
                this.f3300a = (1 << i) | this.f3300a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
