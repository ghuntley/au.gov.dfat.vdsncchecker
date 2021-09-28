package p074l4;

import p045h.C0990o;
import p104q4.C1630e;

/* renamed from: l4.v0 */
public class C1404v0 extends C1365j {
    public C1404v0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 24, mo5237r());
    }

    /* renamed from: k */
    public int mo5155k() {
        int length = mo5237r().length;
        return C1405v1.m4029a(length) + 1 + length;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return this;
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }

    /* renamed from: r */
    public final byte[] mo5237r() {
        byte[] bArr;
        boolean z;
        byte[] bArr2 = this.f4400e;
        if (bArr2[bArr2.length - 1] != 90) {
            return bArr2;
        }
        if (!(mo5188q(10) && mo5188q(11))) {
            byte[] bArr3 = this.f4400e;
            byte[] bArr4 = new byte[(bArr3.length + 4)];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length - 1);
            System.arraycopy(C1630e.m4538b("0000Z"), 0, bArr4, this.f4400e.length - 1, 5);
            return bArr4;
        }
        if (!(mo5188q(12) && mo5188q(13))) {
            byte[] bArr5 = this.f4400e;
            byte[] bArr6 = new byte[(bArr5.length + 2)];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 1);
            System.arraycopy(C1630e.m4538b("00Z"), 0, bArr6, this.f4400e.length - 1, 3);
            return bArr6;
        }
        int i = 0;
        while (true) {
            bArr = this.f4400e;
            if (i != bArr.length) {
                if (bArr[i] == 46 && i == 14) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return bArr;
        }
        int length = bArr.length - 2;
        while (length > 0 && this.f4400e[length] == 48) {
            length--;
        }
        byte[] bArr7 = this.f4400e;
        if (bArr7[length] == 46) {
            byte[] bArr8 = new byte[(length + 1)];
            System.arraycopy(bArr7, 0, bArr8, 0, length);
            bArr8[length] = 90;
            return bArr8;
        }
        byte[] bArr9 = new byte[(length + 2)];
        int i2 = length + 1;
        System.arraycopy(bArr7, 0, bArr9, 0, i2);
        bArr9[i2] = 90;
        return bArr9;
    }
}
