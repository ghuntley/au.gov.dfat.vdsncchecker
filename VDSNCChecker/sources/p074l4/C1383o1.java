package p074l4;

import p045h.C0990o;

/* renamed from: l4.o1 */
public class C1383o1 extends C1408x {

    /* renamed from: g */
    public int f4423g = -1;

    public C1383o1() {
    }

    public C1383o1(C1351f fVar) {
        super(fVar, false);
    }

    public C1383o1(boolean z, C1348e[] eVarArr) {
        super(z, eVarArr);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        if (z) {
            oVar.mo4390d(49);
        }
        C0990o c = oVar.mo4389c();
        int length = this.f4456e.length;
        int i = 0;
        if (this.f4423g >= 0 || length > 16) {
            oVar.mo4397k(mo5209u());
            while (i < length) {
                c.mo4399m(this.f4456e[i].mo5171c(), true);
                i++;
            }
            return;
        }
        C1393s[] sVarArr = new C1393s[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            C1393s p = this.f4456e[i3].mo5171c().mo5160p();
            sVarArr[i3] = p;
            i2 += p.mo5155k();
        }
        this.f4423g = i2;
        oVar.mo4397k(i2);
        while (i < length) {
            c.mo4399m(sVarArr[i], true);
            i++;
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        int u = mo5209u();
        return C1405v1.m4029a(u) + 1 + u;
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }

    /* renamed from: u */
    public final int mo5209u() {
        if (this.f4423g < 0) {
            int i = 0;
            for (C1348e c : this.f4456e) {
                i += c.mo5171c().mo5160p().mo5155k();
            }
            this.f4423g = i;
        }
        return this.f4423g;
    }
}
