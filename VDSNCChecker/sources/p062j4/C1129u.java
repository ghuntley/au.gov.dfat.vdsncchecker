package p062j4;

import p072l2.C1241e;
import p126u2.C1845f;

/* renamed from: j4.u */
public final class C1129u {

    /* renamed from: a */
    public final byte[] f3918a;

    /* renamed from: b */
    public int f3919b;

    /* renamed from: c */
    public int f3920c;

    /* renamed from: d */
    public boolean f3921d;

    /* renamed from: e */
    public boolean f3922e;

    /* renamed from: f */
    public C1129u f3923f;

    /* renamed from: g */
    public C1129u f3924g;

    public C1129u() {
        this.f3918a = new byte[8192];
        this.f3922e = true;
        this.f3921d = false;
    }

    public C1129u(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C1241e.m3517j(bArr, "data");
        this.f3918a = bArr;
        this.f3919b = i;
        this.f3920c = i2;
        this.f3921d = z;
        this.f3922e = z2;
    }

    /* renamed from: a */
    public final C1129u mo4701a() {
        C1129u uVar = this.f3923f;
        if (uVar == this) {
            uVar = null;
        }
        C1129u uVar2 = this.f3924g;
        C1241e.m3515e(uVar2);
        uVar2.f3923f = this.f3923f;
        C1129u uVar3 = this.f3923f;
        C1241e.m3515e(uVar3);
        uVar3.f3924g = this.f3924g;
        this.f3923f = null;
        this.f3924g = null;
        return uVar;
    }

    /* renamed from: b */
    public final C1129u mo4702b(C1129u uVar) {
        uVar.f3924g = this;
        uVar.f3923f = this.f3923f;
        C1129u uVar2 = this.f3923f;
        C1241e.m3515e(uVar2);
        uVar2.f3924g = uVar;
        this.f3923f = uVar;
        return uVar;
    }

    /* renamed from: c */
    public final C1129u mo4703c() {
        this.f3921d = true;
        return new C1129u(this.f3918a, this.f3919b, this.f3920c, true, false);
    }

    /* renamed from: d */
    public final void mo4704d(C1129u uVar, int i) {
        if (uVar.f3922e) {
            int i2 = uVar.f3920c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!uVar.f3921d) {
                    int i4 = uVar.f3919b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = uVar.f3918a;
                        C1845f.m5043J(bArr, bArr, 0, i4, i2, 2);
                        uVar.f3920c -= uVar.f3919b;
                        uVar.f3919b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f3918a;
            byte[] bArr3 = uVar.f3918a;
            int i5 = uVar.f3920c;
            int i6 = this.f3919b;
            C1845f.m5042I(bArr2, bArr3, i5, i6, i6 + i);
            uVar.f3920c += i;
            this.f3919b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
