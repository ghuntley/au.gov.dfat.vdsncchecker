package p127u3;

import java.util.Objects;

/* renamed from: u3.b */
public final class C1859b {

    /* renamed from: a */
    public static final C1859b f5547a;

    /* renamed from: b */
    public static final char[] f5548b = new char[117];

    /* renamed from: c */
    public static final byte[] f5549c = new byte[126];

    static {
        C1859b bVar = new C1859b();
        f5547a = bVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            bVar.mo6373a(i2, 'u');
            if (i3 > 31) {
                break;
            }
            i2 = i3;
        }
        bVar.mo6373a(8, 'b');
        bVar.mo6373a(9, 't');
        bVar.mo6373a(10, 'n');
        bVar.mo6373a(12, 'f');
        bVar.mo6373a(13, 'r');
        bVar.mo6373a(47, '/');
        bVar.mo6373a(34, '\"');
        bVar.mo6373a(92, '\\');
        Objects.requireNonNull(f5547a);
        while (true) {
            int i4 = i + 1;
            byte[] bArr = f5549c;
            bArr[i] = Byte.MAX_VALUE;
            if (i4 > 32) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            i = i4;
        }
    }

    /* renamed from: a */
    public final void mo6373a(int i, char c) {
        if (c != 'u') {
            f5548b[c] = (char) i;
        }
    }
}
