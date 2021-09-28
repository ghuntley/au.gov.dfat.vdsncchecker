package p074l4;

import androidx.appcompat.widget.C0131a0;
import java.util.Objects;

/* renamed from: l4.i */
public abstract class C1362i extends C1393s {

    /* renamed from: e */
    public C1380o f4392e;

    /* renamed from: f */
    public C1371l f4393f;

    /* renamed from: g */
    public C1393s f4394g;

    /* renamed from: h */
    public int f4395h;

    /* renamed from: i */
    public C1393s f4396i;

    public C1362i(C1351f fVar) {
        int i = 0;
        C1393s q = mo5185q(fVar, 0);
        if (q instanceof C1380o) {
            this.f4392e = (C1380o) q;
            q = mo5185q(fVar, 1);
            i = 1;
        }
        if (q instanceof C1371l) {
            this.f4393f = (C1371l) q;
            i++;
            q = mo5185q(fVar, i);
        }
        if (!(q instanceof C1340b0)) {
            this.f4394g = q;
            i++;
            q = mo5185q(fVar, i);
        }
        if (fVar.f4375b != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (q instanceof C1340b0) {
            C1340b0 b0Var = (C1340b0) q;
            mo5186r(b0Var.f4358e);
            this.f4396i = b0Var.mo5163r();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public int hashCode() {
        C1380o oVar = this.f4392e;
        int hashCode = oVar != null ? oVar.hashCode() : 0;
        C1371l lVar = this.f4393f;
        if (lVar != null) {
            hashCode ^= lVar.hashCode();
        }
        C1393s sVar = this.f4394g;
        if (sVar != null) {
            hashCode ^= sVar.hashCode();
        }
        return hashCode ^ this.f4396i.hashCode();
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        C1393s sVar2;
        C1371l lVar;
        C1380o oVar;
        if (!(sVar instanceof C1362i)) {
            return false;
        }
        if (this == sVar) {
            return true;
        }
        C1362i iVar = (C1362i) sVar;
        C1380o oVar2 = this.f4392e;
        if (oVar2 != null && ((oVar = iVar.f4392e) == null || !oVar.mo5222l(oVar2))) {
            return false;
        }
        C1371l lVar2 = this.f4393f;
        if (lVar2 != null && ((lVar = iVar.f4393f) == null || !lVar.mo5222l(lVar2))) {
            return false;
        }
        C1393s sVar3 = this.f4394g;
        if (sVar3 == null || ((sVar2 = iVar.f4394g) != null && sVar2.mo5222l(sVar3))) {
            return this.f4396i.mo5222l(iVar.f4396i);
        }
        return false;
    }

    /* renamed from: k */
    public int mo5155k() {
        return mo5198g().length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return true;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1394s0(this.f4392e, this.f4393f, this.f4394g, this.f4395h, this.f4396i, 0);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1394s0(this.f4392e, this.f4393f, this.f4394g, this.f4395h, this.f4396i, 1);
    }

    /* renamed from: q */
    public final C1393s mo5185q(C1351f fVar, int i) {
        if (fVar.f4375b > i) {
            return fVar.mo5174c(i).mo5171c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* renamed from: r */
    public final void mo5186r(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C0131a0.m344a("invalid encoding value: ", i));
        }
        this.f4395h = i;
    }

    public C1362i(C1380o oVar, C1371l lVar, C1393s sVar, int i, C1393s sVar2) {
        this.f4392e = oVar;
        this.f4393f = lVar;
        this.f4394g = sVar;
        mo5186r(i);
        Objects.requireNonNull(sVar2);
        this.f4396i = sVar2;
    }
}
