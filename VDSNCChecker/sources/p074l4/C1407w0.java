package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;

/* renamed from: l4.w0 */
public class C1407w0 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public final byte[] f4455e;

    public C1407w0(byte[] bArr) {
        this.f4455e = C1625a.m4534a(bArr);
    }

    /* renamed from: d */
    public String mo5158d() {
        return C1630e.m4537a(this.f4455e);
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4455e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1407w0)) {
            return false;
        }
        return Arrays.equals(this.f4455e, ((C1407w0) sVar).f4455e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 25, this.f4455e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4455e.length) + 1 + this.f4455e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }
}
