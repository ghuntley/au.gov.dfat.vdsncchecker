package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;

/* renamed from: l4.j1 */
public class C1367j1 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public final byte[] f4401e;

    public C1367j1(byte[] bArr) {
        this.f4401e = C1625a.m4534a(bArr);
    }

    /* renamed from: d */
    public String mo5158d() {
        return C1630e.m4537a(this.f4401e);
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4401e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1367j1)) {
            return false;
        }
        return Arrays.equals(this.f4401e, ((C1367j1) sVar).f4401e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 21, this.f4401e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4401e.length) + 1 + this.f4401e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }
}
