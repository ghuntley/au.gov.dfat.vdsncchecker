package p074l4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p000a.C0001b;
import p116s4.C1744a;

/* renamed from: l4.p1 */
public class C1386p1 extends C1402u1 {

    /* renamed from: i */
    public static final byte[] f4428i = new byte[0];

    /* renamed from: g */
    public final int f4429g;

    /* renamed from: h */
    public int f4430h;

    public C1386p1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i >= 0) {
            this.f4429g = i;
            this.f4430h = i;
            if (i == 0) {
                mo5236a(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* renamed from: c */
    public byte[] mo5214c() {
        int i = this.f4430h;
        if (i == 0) {
            return f4428i;
        }
        int i2 = this.f4451f;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int b = i - C1744a.m4862b(this.f4450e, bArr, 0, i);
            this.f4430h = b;
            if (b == 0) {
                mo5236a(true);
                return bArr;
            }
            StringBuilder a = C0001b.m0a("DEF length ");
            a.append(this.f4429g);
            a.append(" object truncated by ");
            a.append(this.f4430h);
            throw new EOFException(a.toString());
        }
        StringBuilder a2 = C0001b.m0a("corrupted stream - out of bounds length found: ");
        a2.append(this.f4430h);
        a2.append(" >= ");
        a2.append(i2);
        throw new IOException(a2.toString());
    }

    public int read() {
        if (this.f4430h == 0) {
            return -1;
        }
        int read = this.f4450e.read();
        if (read >= 0) {
            int i = this.f4430h - 1;
            this.f4430h = i;
            if (i == 0) {
                mo5236a(true);
            }
            return read;
        }
        StringBuilder a = C0001b.m0a("DEF length ");
        a.append(this.f4429g);
        a.append(" object truncated by ");
        a.append(this.f4430h);
        throw new EOFException(a.toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f4430h;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f4450e.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f4430h - read;
            this.f4430h = i4;
            if (i4 == 0) {
                mo5236a(true);
            }
            return read;
        }
        StringBuilder a = C0001b.m0a("DEF length ");
        a.append(this.f4429g);
        a.append(" object truncated by ");
        a.append(this.f4430h);
        throw new EOFException(a.toString());
    }
}
