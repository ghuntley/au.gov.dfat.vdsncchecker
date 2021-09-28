package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;

/* renamed from: l4.j */
public class C1365j extends C1393s {

    /* renamed from: e */
    public byte[] f4400e;

    public C1365j(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f4400e = bArr;
            if (!mo5188q(0) || !mo5188q(1) || !mo5188q(2) || !mo5188q(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4400e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1365j)) {
            return false;
        }
        return Arrays.equals(this.f4400e, ((C1365j) sVar).f4400e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 24, this.f4400e);
    }

    /* renamed from: k */
    public int mo5155k() {
        int length = this.f4400e.length;
        return C1405v1.m4029a(length) + 1 + length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1404v0(this.f4400e);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1404v0(this.f4400e);
    }

    /* renamed from: q */
    public final boolean mo5188q(int i) {
        byte[] bArr = this.f4400e;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }
}
