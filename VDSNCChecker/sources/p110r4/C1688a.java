package p110r4;

import androidx.appcompat.widget.C0231z;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import p000a.C0001b;
import p074l4.C1390r;
import p104q4.C1630e;

/* renamed from: r4.a */
public class C1688a {

    /* renamed from: a */
    public static final C0231z f5127a = new C0231z();

    /* renamed from: a */
    public static byte[] m4677a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0231z zVar = f5127a;
            Objects.requireNonNull(zVar);
            byte[] bArr2 = new byte[72];
            while (i2 > 0) {
                int min = Math.min(36, i2);
                int i3 = min + i;
                int i4 = 0;
                while (i < i3) {
                    int i5 = i + 1;
                    byte b = bArr[i] & 255;
                    int i6 = i4 + 1;
                    byte[] bArr3 = (byte[]) zVar.f1002a;
                    bArr2[i4] = bArr3[b >>> 4];
                    i4 = i6 + 1;
                    bArr2[i6] = bArr3[b & 15];
                    i = i5;
                }
                byteArrayOutputStream.write(bArr2, 0, i4 + 0);
                i2 -= min;
                i = i3;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder a = C0001b.m0a("exception encoding Hex string: ");
            a.append(e.getMessage());
            throw new C1390r(a.toString(), e, 2);
        }
    }

    /* renamed from: b */
    public static String m4678b(byte[] bArr) {
        return C1630e.m4537a(m4677a(bArr, 0, bArr.length));
    }
}
