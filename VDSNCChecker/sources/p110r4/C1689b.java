package p110r4;

/* renamed from: r4.b */
public class C1689b {

    /* renamed from: a */
    public static final short[] f5128a = new short[128];

    /* renamed from: b */
    public static final byte[] f5129b;

    static {
        byte[] bArr = new byte[112];
        f5129b = bArr;
        byte[] bArr2 = new byte[128];
        m4679a(bArr2, 0, 15, (byte) 1);
        m4679a(bArr2, 16, 31, (byte) 2);
        m4679a(bArr2, 32, 63, (byte) 3);
        m4679a(bArr2, 64, 65, (byte) 0);
        m4679a(bArr2, 66, 95, (byte) 4);
        m4679a(bArr2, 96, 96, (byte) 5);
        m4679a(bArr2, 97, 108, (byte) 6);
        m4679a(bArr2, 109, 109, (byte) 7);
        m4679a(bArr2, 110, 111, (byte) 6);
        m4679a(bArr2, 112, 112, (byte) 8);
        m4679a(bArr2, 113, 115, (byte) 9);
        m4679a(bArr2, 116, 116, (byte) 10);
        m4679a(bArr2, 117, 127, (byte) 0);
        m4679a(bArr, 0, bArr.length - 1, (byte) -2);
        m4679a(bArr, 8, 11, (byte) -1);
        m4679a(bArr, 24, 27, (byte) 0);
        m4679a(bArr, 40, 43, (byte) 16);
        m4679a(bArr, 58, 59, (byte) 0);
        m4679a(bArr, 72, 73, (byte) 0);
        m4679a(bArr, 89, 91, (byte) 16);
        m4679a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            f5128a[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    /* renamed from: a */
    public static void m4679a(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
