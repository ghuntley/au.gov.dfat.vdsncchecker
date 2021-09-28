package p074l4;

import java.io.IOException;
import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;

/* renamed from: l4.i1 */
public class C1364i1 extends C1393s implements C1337a0 {

    /* renamed from: f */
    public static final char[] f4398f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e */
    public final byte[] f4399e;

    public C1364i1(byte[] bArr) {
        this.f4399e = C1625a.m4534a(bArr);
    }

    /* renamed from: d */
    public String mo5158d() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] g = mo5198g();
            for (int i = 0; i != g.length; i++) {
                char[] cArr = f4398f;
                stringBuffer.append(cArr[(g[i] >>> 4) & 15]);
                stringBuffer.append(cArr[g[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C1390r("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4399e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1364i1)) {
            return false;
        }
        return Arrays.equals(this.f4399e, ((C1364i1) sVar).f4399e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 28, this.f4399e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4399e.length) + 1 + this.f4399e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return mo5158d();
    }
}
