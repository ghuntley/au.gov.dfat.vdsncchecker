package p074l4;

import java.io.IOException;
import java.util.Objects;
import p000a.C0001b;
import p104q4.C1625a;

/* renamed from: l4.b */
public abstract class C1339b extends C1393s implements C1337a0 {

    /* renamed from: g */
    public static final char[] f4355g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e */
    public final byte[] f4356e;

    /* renamed from: f */
    public final int f4357f;

    public C1339b(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f4356e = C1625a.m4534a(bArr);
            this.f4357f = i;
        }
    }

    /* renamed from: d */
    public String mo5158d() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] g = mo5198g();
            for (int i = 0; i != g.length; i++) {
                char[] cArr = f4355g;
                stringBuffer.append(cArr[(g[i] >>> 4) & 15]);
                stringBuffer.append(cArr[g[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder a = C0001b.m0a("Internal error encoding BitString: ");
            a.append(e.getMessage());
            throw new C1390r(a.toString(), e, 0);
        }
    }

    public int hashCode() {
        byte[] bArr = this.f4356e;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = (byte) (bArr[length] & (255 << this.f4357f));
        int i = 0;
        if (bArr != null) {
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[0 + length];
            }
            i = i2;
        }
        return ((i * 257) ^ b) ^ this.f4357f;
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1339b)) {
            return false;
        }
        C1339b bVar = (C1339b) sVar;
        if (this.f4357f != bVar.f4357f) {
            return false;
        }
        byte[] bArr = this.f4356e;
        byte[] bArr2 = bVar.f4356e;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b = bArr[i];
        int i3 = this.f4357f;
        return ((byte) (b & (255 << i3))) == ((byte) (bArr2[i] & (255 << i3)));
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1391r0(this.f4356e, this.f4357f);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1373l1(this.f4356e, this.f4357f);
    }

    public String toString() {
        return mo5158d();
    }
}
