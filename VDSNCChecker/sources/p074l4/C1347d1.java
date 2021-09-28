package p074l4;

import p045h.C0990o;

/* renamed from: l4.d1 */
public class C1347d1 extends C1399u {

    /* renamed from: f */
    public int f4368f = -1;

    public C1347d1() {
    }

    public C1347d1(C1351f fVar) {
        super(fVar);
    }

    public C1347d1(C1348e[] eVarArr) {
        super(eVarArr);
    }

    public C1347d1(C1348e[] eVarArr, boolean z) {
        super(eVarArr, z);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        if (z) {
            oVar.mo4390d(48);
        }
        C1341b1 b = oVar.mo4388b();
        int length = this.f4446e.length;
        int i = 0;
        if (this.f4368f >= 0 || length > 16) {
            oVar.mo4397k(mo5170u());
            while (i < length) {
                this.f4446e[i].mo5171c().mo5159o().mo5154j(b, true);
                i++;
            }
            return;
        }
        C1393s[] sVarArr = new C1393s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C1393s o = this.f4446e[i3].mo5171c().mo5159o();
            sVarArr[i3] = o;
            i2 += o.mo5155k();
        }
        this.f4368f = i2;
        oVar.mo4397k(i2);
        while (i < length) {
            sVarArr[i].mo5154j(b, true);
            i++;
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        int u = mo5170u();
        return C1405v1.m4029a(u) + 1 + u;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return this;
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }

    /* renamed from: u */
    public final int mo5170u() {
        if (this.f4368f < 0) {
            int i = 0;
            for (C1348e c : this.f4446e) {
                i += c.mo5171c().mo5159o().mo5155k();
            }
            this.f4368f = i;
        }
        return this.f4368f;
    }
}
