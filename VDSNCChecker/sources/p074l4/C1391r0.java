package p074l4;

import java.io.OutputStream;
import p045h.C0990o;

/* renamed from: l4.r0 */
public class C1391r0 extends C1339b {
    public C1391r0(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        int i;
        byte[] bArr = this.f4356e;
        int length = bArr.length;
        if (!(length == 0 || (i = this.f4357f) == 0)) {
            int i2 = length - 1;
            if (bArr[i2] != ((byte) (bArr[i2] & (255 << i)))) {
                byte b = (byte) (bArr[i2] & (255 << i));
                byte b2 = (byte) i;
                if (z) {
                    ((OutputStream) oVar.f3645b).write(3);
                }
                oVar.mo4397k(i2 + 2);
                ((OutputStream) oVar.f3645b).write(b2);
                ((OutputStream) oVar.f3645b).write(bArr, 0, i2);
                ((OutputStream) oVar.f3645b).write(b);
                return;
            }
        }
        oVar.mo4392f(z, 3, (byte) this.f4357f, bArr);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4356e.length + 1) + 1 + this.f4356e.length + 1;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return this;
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }
}
