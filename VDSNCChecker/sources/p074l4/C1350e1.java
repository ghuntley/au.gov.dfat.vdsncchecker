package p074l4;

import p045h.C0990o;

/* renamed from: l4.e1 */
public class C1350e1 extends C1408x {

    /* renamed from: g */
    public int f4372g;

    public C1350e1() {
        this.f4372g = -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1350e1(boolean z, C1348e[] eVarArr) {
        super(z, eVarArr);
        if (z) {
            this.f4372g = -1;
            return;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        if (z) {
            oVar.mo4390d(49);
        }
        C1341b1 b = oVar.mo4388b();
        int length = this.f4456e.length;
        int i = 0;
        if (this.f4372g >= 0 || length > 16) {
            oVar.mo4397k(mo5172u());
            while (i < length) {
                this.f4456e[i].mo5171c().mo5159o().mo5154j(b, true);
                i++;
            }
            return;
        }
        C1393s[] sVarArr = new C1393s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C1393s o = this.f4456e[i3].mo5171c().mo5159o();
            sVarArr[i3] = o;
            i2 += o.mo5155k();
        }
        this.f4372g = i2;
        oVar.mo4397k(i2);
        while (i < length) {
            sVarArr[i].mo5154j(b, true);
            i++;
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        int u = mo5172u();
        return C1405v1.m4029a(u) + 1 + u;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return this.f4457f ? this : super.mo5159o();
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }

    /* renamed from: u */
    public final int mo5172u() {
        if (this.f4372g < 0) {
            int i = 0;
            for (C1348e c : this.f4456e) {
                i += c.mo5171c().mo5159o().mo5155k();
            }
            this.f4372g = i;
        }
        return this.f4372g;
    }
}
