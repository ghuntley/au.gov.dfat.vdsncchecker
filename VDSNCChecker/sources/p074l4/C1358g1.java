package p074l4;

import p045h.C0990o;

/* renamed from: l4.g1 */
public class C1358g1 extends C1340b0 {

    /* renamed from: h */
    public final /* synthetic */ int f4387h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1358g1(boolean z, int i, C1348e eVar, int i2) {
        super(z, i, eVar);
        this.f4387h = i2;
        if (i2 != 1) {
        } else {
            super(z, i, eVar);
        }
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        int i = 128;
        switch (this.f4387h) {
            case 0:
                C1393s o = this.f4360g.mo5171c().mo5159o();
                if (this.f4359f || o.mo5156n()) {
                    i = 160;
                }
                oVar.mo4400n(z, i, this.f4358e);
                if (this.f4359f) {
                    oVar.mo4397k(o.mo5155k());
                }
                o.mo5154j(oVar.mo4388b(), this.f4359f);
                return;
            default:
                C1393s p = this.f4360g.mo5171c().mo5160p();
                if (this.f4359f || p.mo5156n()) {
                    i = 160;
                }
                oVar.mo4400n(z, i, this.f4358e);
                if (this.f4359f) {
                    oVar.mo4397k(p.mo5155k());
                }
                oVar.mo4389c().mo4399m(p, this.f4359f);
                return;
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        switch (this.f4387h) {
            case 0:
                int k = this.f4360g.mo5171c().mo5159o().mo5155k();
                if (this.f4359f) {
                    return C1405v1.m4029a(k) + C1405v1.m4030b(this.f4358e) + k;
                }
                return C1405v1.m4030b(this.f4358e) + (k - 1);
            default:
                int k2 = this.f4360g.mo5171c().mo5160p().mo5155k();
                if (this.f4359f) {
                    return C1405v1.m4029a(k2) + C1405v1.m4030b(this.f4358e) + k2;
                }
                return C1405v1.m4030b(this.f4358e) + (k2 - 1);
        }
    }

    /* renamed from: n */
    public boolean mo5156n() {
        switch (this.f4387h) {
            case 0:
                return this.f4359f || this.f4360g.mo5171c().mo5159o().mo5156n();
            default:
                if (this.f4359f || this.f4360g.mo5171c().mo5160p().mo5156n()) {
                    return true;
                }
                return false;
        }
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        switch (this.f4387h) {
            case 0:
                return this;
            default:
                return super.mo5159o();
        }
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }
}
