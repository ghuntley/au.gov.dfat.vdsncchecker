package p074l4;

import java.util.Enumeration;
import java.util.Objects;
import p000a.C0001b;
import p045h.C0990o;

/* renamed from: l4.n0 */
public class C1378n0 extends C1340b0 {
    public C1378n0(boolean z, int i, C1348e eVar) {
        super(z, i, eVar);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        Enumeration enumeration;
        oVar.mo4400n(z, 160, this.f4358e);
        oVar.mo4390d(128);
        if (!this.f4359f) {
            C1348e eVar = this.f4360g;
            if (eVar instanceof C1384p) {
                enumeration = eVar instanceof C1355g0 ? ((C1355g0) eVar).mo5177t() : new C1355g0(((C1384p) eVar).f4424e).mo5177t();
            } else if (eVar instanceof C1399u) {
                enumeration = ((C1399u) eVar).mo5230t();
            } else if (eVar instanceof C1408x) {
                C1408x xVar = (C1408x) eVar;
                Objects.requireNonNull(xVar);
                enumeration = new C1406w(xVar);
            } else {
                StringBuilder a = C0001b.m0a("not implemented: ");
                a.append(this.f4360g.getClass().getName());
                throw new C1359h(a.toString());
            }
            oVar.mo4391e(enumeration);
        } else {
            oVar.mo4399m(this.f4360g.mo5171c(), true);
        }
        oVar.mo4390d(0);
        oVar.mo4390d(0);
    }

    /* renamed from: k */
    public int mo5155k() {
        int k = this.f4360g.mo5171c().mo5155k();
        if (this.f4359f) {
            return C1405v1.m4029a(k) + C1405v1.m4030b(this.f4358e) + k;
        }
        return C1405v1.m4030b(this.f4358e) + (k - 1);
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return this.f4359f || this.f4360g.mo5171c().mo5156n();
    }
}
