package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;

/* renamed from: l4.c0 */
public class C1343c0 extends C1393s {

    /* renamed from: e */
    public byte[] f4365e;

    public C1343c0(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f4365e = bArr;
            if (!mo5167q(0) || !mo5167q(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4365e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1343c0)) {
            return false;
        }
        return Arrays.equals(this.f4365e, ((C1343c0) sVar).f4365e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 23, this.f4365e);
    }

    /* renamed from: k */
    public int mo5155k() {
        int length = this.f4365e.length;
        return C1405v1.m4029a(length) + 1 + length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    /* renamed from: q */
    public final boolean mo5167q(int i) {
        byte[] bArr = this.f4365e;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    public String toString() {
        return C1630e.m4537a(this.f4365e);
    }
}
