package p074l4;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: l4.r1 */
public class C1392r1 extends C1402u1 {

    /* renamed from: g */
    public int f4434g;

    /* renamed from: h */
    public int f4435h;

    /* renamed from: i */
    public boolean f4436i = false;

    /* renamed from: j */
    public boolean f4437j = true;

    public C1392r1(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f4434g = inputStream.read();
        int read = inputStream.read();
        this.f4435h = read;
        if (read >= 0) {
            mo5219c();
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final boolean mo5219c() {
        if (!this.f4436i && this.f4437j && this.f4434g == 0 && this.f4435h == 0) {
            this.f4436i = true;
            mo5236a(true);
        }
        return this.f4436i;
    }

    public int read() {
        if (mo5219c()) {
            return -1;
        }
        int read = this.f4450e.read();
        if (read >= 0) {
            int i = this.f4434g;
            this.f4434g = this.f4435h;
            this.f4435h = read;
            return i;
        }
        throw new EOFException();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f4437j || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f4436i) {
            return -1;
        }
        int read = this.f4450e.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f4434g;
            bArr[i + 1] = (byte) this.f4435h;
            this.f4434g = this.f4450e.read();
            int read2 = this.f4450e.read();
            this.f4435h = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
