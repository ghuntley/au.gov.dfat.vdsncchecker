package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;

/* renamed from: l4.f1 */
public class C1353f1 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public byte[] f4378e;

    public C1353f1(byte[] bArr) {
        this.f4378e = C1625a.m4534a(bArr);
    }

    /* renamed from: d */
    public String mo5158d() {
        return C1630e.m4537a(this.f4378e);
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4378e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1353f1)) {
            return false;
        }
        return Arrays.equals(this.f4378e, ((C1353f1) sVar).f4378e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 20, this.f4378e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4378e.length) + 1 + this.f4378e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return mo5158d();
    }
}
