package p062j4;

import java.security.MessageDigest;
import p072l2.C1241e;
import p126u2.C1845f;

/* renamed from: j4.w */
public final class C1131w extends C1115i {

    /* renamed from: j */
    public final transient byte[][] f3929j;

    /* renamed from: k */
    public final transient int[] f3930k;

    public C1131w(byte[][] bArr, int[] iArr) {
        super(C1115i.f3889h.f3893g);
        this.f3929j = bArr;
        this.f3930k = iArr;
    }

    /* renamed from: a */
    public String mo4667a() {
        return mo4707m().mo4667a();
    }

    /* renamed from: b */
    public C1115i mo4668b(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f3929j.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f3930k;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.f3929j[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C1241e.m3516f(digest, "digest.digest()");
        return new C1115i(digest);
    }

    /* renamed from: c */
    public int mo4669c() {
        return this.f3930k[this.f3929j.length - 1];
    }

    /* renamed from: d */
    public String mo4671d() {
        return mo4707m().mo4671d();
    }

    /* renamed from: e */
    public byte[] mo4672e() {
        return mo4706l();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1115i) {
            C1115i iVar = (C1115i) obj;
            if (iVar.mo4669c() == mo4669c() && mo4675g(0, iVar, 0, mo4669c())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte mo4674f(int i) {
        int i2;
        C1106b.m3136f((long) this.f3930k[this.f3929j.length - 1], (long) i, 1);
        int h = C1106b.m3138h(this, i);
        if (h == 0) {
            i2 = 0;
        } else {
            i2 = this.f3930k[h - 1];
        }
        int[] iArr = this.f3930k;
        byte[][] bArr = this.f3929j;
        return bArr[h][(i - i2) + iArr[bArr.length + h]];
    }

    /* renamed from: g */
    public boolean mo4675g(int i, C1115i iVar, int i2, int i3) {
        int i4;
        C1241e.m3517j(iVar, "other");
        if (i < 0 || i > mo4669c() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int h = C1106b.m3138h(this, i);
        while (i < i5) {
            if (h == 0) {
                i4 = 0;
            } else {
                i4 = this.f3930k[h - 1];
            }
            int[] iArr = this.f3930k;
            int i6 = iArr[this.f3929j.length + h];
            int min = Math.min(i5, (iArr[h] - i4) + i4) - i;
            if (!iVar.mo4676h(i2, this.f3929j[h], (i - i4) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            h++;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo4676h(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C1241e.m3517j(bArr, "other");
        if (i < 0 || i > mo4669c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int h = C1106b.m3138h(this, i);
        while (i < i5) {
            if (h == 0) {
                i4 = 0;
            } else {
                i4 = this.f3930k[h - 1];
            }
            int[] iArr = this.f3930k;
            int i6 = iArr[this.f3929j.length + h];
            int min = Math.min(i5, (iArr[h] - i4) + i4) - i;
            if (!C1106b.m3132b(this.f3929j[h], (i - i4) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            h++;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f3891e;
        if (i != 0) {
            return i;
        }
        int length = this.f3929j.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f3930k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f3929j[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f3891e = i3;
        return i3;
    }

    /* renamed from: i */
    public C1115i mo4678i() {
        return mo4707m().mo4678i();
    }

    /* renamed from: k */
    public void mo4680k(C1112f fVar, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int h = C1106b.m3138h(this, i);
        while (i < i4) {
            if (h == 0) {
                i3 = 0;
            } else {
                i3 = this.f3930k[h - 1];
            }
            int[] iArr = this.f3930k;
            int i5 = iArr[this.f3929j.length + h];
            int min = Math.min(i4, (iArr[h] - i3) + i3) - i;
            int i6 = (i - i3) + i5;
            C1129u uVar = new C1129u(this.f3929j[h], i6, i6 + min, true, false);
            C1129u uVar2 = fVar.f3887e;
            if (uVar2 == null) {
                uVar.f3924g = uVar;
                uVar.f3923f = uVar;
                fVar.f3887e = uVar;
            } else {
                C1129u uVar3 = uVar2.f3924g;
                C1241e.m3515e(uVar3);
                uVar3.mo4702b(uVar);
            }
            i += min;
            h++;
        }
        fVar.f3888f += (long) mo4669c();
    }

    /* renamed from: l */
    public byte[] mo4706l() {
        byte[] bArr = new byte[mo4669c()];
        int length = this.f3929j.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f3930k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C1845f.m5042I(this.f3929j[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: m */
    public final C1115i mo4707m() {
        return new C1115i(mo4706l());
    }

    public String toString() {
        return mo4707m().toString();
    }
}
