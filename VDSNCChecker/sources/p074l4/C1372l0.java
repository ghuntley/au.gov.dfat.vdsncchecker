package p074l4;

import p045h.C0990o;

/* renamed from: l4.l0 */
public class C1372l0 extends C1408x {
    public C1372l0(C1351f fVar) {
        super(fVar, false);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4396j(z, 49, this.f4456e);
    }

    /* renamed from: k */
    public int mo5155k() {
        int i = 0;
        for (C1348e c : this.f4456e) {
            i += c.mo5171c().mo5155k();
        }
        return i + 2 + 2;
    }
}
