package p074l4;

import java.util.Arrays;
import p000a.C0001b;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;

/* renamed from: l4.x0 */
public class C1409x0 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public final byte[] f4458e;

    public C1409x0(byte[] bArr) {
        this.f4458e = bArr;
    }

    /* renamed from: q */
    public static C1409x0 m4045q(Object obj) {
        if (obj == null || (obj instanceof C1409x0)) {
            return (C1409x0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C1409x0) C1393s.m3981m((byte[]) obj);
            } catch (Exception e) {
                StringBuilder a = C0001b.m0a("encoding error in getInstance: ");
                a.append(e.toString());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C0001b.m0a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: d */
    public String mo5158d() {
        return C1630e.m4537a(this.f4458e);
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4458e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1409x0)) {
            return false;
        }
        return Arrays.equals(this.f4458e, ((C1409x0) sVar).f4458e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 22, this.f4458e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4458e.length) + 1 + this.f4458e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return mo5158d();
    }
}
