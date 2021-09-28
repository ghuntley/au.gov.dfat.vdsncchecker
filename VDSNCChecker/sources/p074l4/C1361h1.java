package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p104q4.C1630e;
import p110r4.C1689b;

/* renamed from: l4.h1 */
public class C1361h1 extends C1393s implements C1337a0 {

    /* renamed from: e */
    public final byte[] f4391e;

    public C1361h1(byte[] bArr) {
        this.f4391e = bArr;
    }

    /* renamed from: d */
    public String mo5158d() {
        byte[] bArr = this.f4391e;
        String str = C1630e.f5006a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = C1689b.f5128a;
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = C1689b.f5128a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 < 0) {
                        if (b2 == -2) {
                            break;
                        }
                        if (i4 <= 65535) {
                            if (i2 >= length) {
                                break;
                            }
                            cArr[i2] = (char) i4;
                            i2++;
                        } else if (i2 >= length - 1) {
                            break;
                        } else {
                            int i5 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 = i5 + 1;
                            cArr[i5] = (char) ((i4 & 1023) | 56320);
                        }
                        i = i3;
                    } else if (i3 >= bArr.length) {
                        break loop0;
                    } else {
                        int i6 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = C1689b.f5129b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i6;
                    }
                }
            } else if (i2 >= length) {
                break;
            } else {
                cArr[i2] = (char) b;
                i = i3;
                i2++;
            }
        }
        i2 = -1;
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4391e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1361h1)) {
            return false;
        }
        return Arrays.equals(this.f4391e, ((C1361h1) sVar).f4391e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 12, this.f4391e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4391e.length) + 1 + this.f4391e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return mo5158d();
    }
}
