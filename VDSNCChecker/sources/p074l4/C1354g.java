package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;

/* renamed from: l4.g */
public class C1354g extends C1393s {

    /* renamed from: f */
    public static C1354g[] f4379f = new C1354g[12];

    /* renamed from: e */
    public final byte[] f4380e;

    public C1354g(byte[] bArr) {
        if (C1371l.m3914s(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f4380e = C1625a.m4534a(bArr);
            C1371l.m3915t(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4380e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1354g)) {
            return false;
        }
        return Arrays.equals(this.f4380e, ((C1354g) sVar).f4380e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 10, this.f4380e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4380e.length) + 1 + this.f4380e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }
}
