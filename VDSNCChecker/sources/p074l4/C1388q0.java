package p074l4;

import java.io.OutputStream;
import java.util.Arrays;
import p045h.C0990o;

/* renamed from: l4.q0 */
public class C1388q0 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public final char[] f4431e;

    public C1388q0(char[] cArr) {
        this.f4431e = cArr;
    }

    /* renamed from: d */
    public String mo5158d() {
        return new String(this.f4431e);
    }

    public int hashCode() {
        char[] cArr = this.f4431e;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1388q0)) {
            return false;
        }
        return Arrays.equals(this.f4431e, ((C1388q0) sVar).f4431e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        int length = this.f4431e.length;
        if (z) {
            oVar.mo4390d(30);
        }
        oVar.mo4397k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.f4431e;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            ((OutputStream) oVar.f3645b).write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.f4431e[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> 8);
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            ((OutputStream) oVar.f3645b).write(bArr, 0, i3);
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        return (this.f4431e.length * 2) + C1405v1.m4029a(this.f4431e.length * 2) + 1;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return mo5158d();
    }
}
