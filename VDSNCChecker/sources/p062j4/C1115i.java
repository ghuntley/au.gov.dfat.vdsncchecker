package p062j4;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import p025d3.C0802f;
import p063k.C1142f;
import p067k3.C1197a;
import p068k4.C1212b;
import p072l2.C1241e;
import p126u2.C1845f;

/* renamed from: j4.i */
public class C1115i implements Serializable, Comparable<C1115i> {

    /* renamed from: h */
    public static final C1115i f3889h = new C1115i(new byte[0]);

    /* renamed from: i */
    public static final C1116a f3890i = new C1116a((C0802f) null);

    /* renamed from: e */
    public transient int f3891e;

    /* renamed from: f */
    public transient String f3892f;

    /* renamed from: g */
    public final byte[] f3893g;

    /* renamed from: j4.i$a */
    public static final class C1116a {
        public C1116a(C0802f fVar) {
        }

        /* renamed from: c */
        public static C1115i m3240c(C1116a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            C1106b.m3136f((long) bArr.length, (long) i, (long) i2);
            return new C1115i(C1845f.m5045L(bArr, i, i2 + i));
        }

        /* renamed from: a */
        public final C1115i mo4682a(String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (C1212b.m3458a(str.charAt(i2 + 1)) + (C1212b.m3458a(str.charAt(i2)) << 4));
                }
                return new C1115i(bArr);
            }
            throw new IllegalArgumentException(C1142f.m3365a("Unexpected hex string: ", str).toString());
        }

        /* renamed from: b */
        public final C1115i mo4683b(String str) {
            byte[] bytes = str.getBytes(C1197a.f4098a);
            C1241e.m3516f(bytes, "(this as java.lang.String).getBytes(charset)");
            C1115i iVar = new C1115i(bytes);
            iVar.f3892f = str;
            return iVar;
        }
    }

    public C1115i(byte[] bArr) {
        C1241e.m3517j(bArr, "data");
        this.f3893g = bArr;
    }

    /* renamed from: a */
    public String mo4667a() {
        byte[] bArr = this.f3893g;
        byte[] bArr2 = C1103a.f3871a;
        byte[] bArr3 = C1103a.f3871a;
        C1241e.m3517j(bArr, "$this$encodeBase64");
        C1241e.m3517j(bArr3, "map");
        byte[] bArr4 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr4[i2] = bArr3[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr4[i6] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr4[i8] = bArr3[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr4[i2] = bArr3[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr4[i9] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i10] = b5;
            bArr4[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr4[i2] = bArr3[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr4[i12] = bArr3[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr4[i13] = bArr3[(b7 & 15) << 2];
            bArr4[i13 + 1] = (byte) 61;
        }
        C1241e.m3517j(bArr4, "$this$toUtf8String");
        return new String(bArr4, C1197a.f4098a);
    }

    /* renamed from: b */
    public C1115i mo4668b(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f3893g);
        C1241e.m3516f(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C1115i(digest);
    }

    /* renamed from: c */
    public int mo4669c() {
        return this.f3893g.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            j4.i r9 = (p062j4.C1115i) r9
            java.lang.String r0 = "other"
            p072l2.C1241e.m3517j(r9, r0)
            int r0 = r8.mo4669c()
            int r1 = r9.mo4669c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.mo4674f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.mo4674f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1115i.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public String mo4671d() {
        byte[] bArr = this.f3893g;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C1212b.f4116a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public byte[] mo4672e() {
        return this.f3893g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1115i) {
            C1115i iVar = (C1115i) obj;
            int c = iVar.mo4669c();
            byte[] bArr = this.f3893g;
            if (c == bArr.length && iVar.mo4676h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte mo4674f(int i) {
        return this.f3893g[i];
    }

    /* renamed from: g */
    public boolean mo4675g(int i, C1115i iVar, int i2, int i3) {
        return iVar.mo4676h(i2, this.f3893g, i, i3);
    }

    /* renamed from: h */
    public boolean mo4676h(int i, byte[] bArr, int i2, int i3) {
        C1241e.m3517j(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f3893g;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C1106b.m3132b(bArr2, i, bArr, i2, i3);
        }
    }

    public int hashCode() {
        int i = this.f3891e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f3893g);
        this.f3891e = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public C1115i mo4678i() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f3893g;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C1241e.m3516f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C1115i(copyOf);
            }
        }
    }

    /* renamed from: j */
    public String mo4679j() {
        String str = this.f3892f;
        if (str != null) {
            return str;
        }
        byte[] e = mo4672e();
        C1241e.m3517j(e, "$this$toUtf8String");
        String str2 = new String(e, C1197a.f4098a);
        this.f3892f = str2;
        return str2;
    }

    /* renamed from: k */
    public void mo4680k(C1112f fVar, int i, int i2) {
        fVar.mo4631V(this.f3893g, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0121, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x015f, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0172, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0183, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0192, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a8, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01b0, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01b7, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01ec, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01ef, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e4, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f7, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0106, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0118, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f3893g
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02b0
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x01f0
            byte r7 = r1[r3]
            r8 = 13
            r9 = 10
            r10 = 31
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x007f
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x01f0
        L_0x0031:
            if (r7 == r9) goto L_0x0043
            if (r7 == r8) goto L_0x0043
            if (r7 < 0) goto L_0x0039
            if (r10 >= r7) goto L_0x003e
        L_0x0039:
            if (r11 <= r7) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r12 < r7) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x01ef
        L_0x0043:
            if (r7 != r13) goto L_0x0047
            goto L_0x01ef
        L_0x0047:
            if (r7 >= r15) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x004f:
            r4 = r16
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r7 = r3 + 1
            byte r3 = r1[r3]
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0061
            goto L_0x01f0
        L_0x0061:
            if (r3 == r9) goto L_0x0073
            if (r3 == r8) goto L_0x0073
            if (r3 < 0) goto L_0x0069
            if (r10 >= r3) goto L_0x006e
        L_0x0069:
            if (r11 <= r3) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            if (r12 < r3) goto L_0x0070
        L_0x006e:
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != 0) goto L_0x01ef
        L_0x0073:
            if (r3 != r13) goto L_0x0077
            goto L_0x01ef
        L_0x0077:
            if (r3 >= r15) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 2
        L_0x007c:
            int r5 = r5 + r3
            r3 = r7
            goto L_0x004f
        L_0x007f:
            int r13 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r13 != r15) goto L_0x00d6
            int r7 = r3 + 1
            if (r2 > r7) goto L_0x008e
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x008e:
            byte r13 = r1[r3]
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0098
            r15 = 1
            goto L_0x0099
        L_0x0098:
            r15 = 0
        L_0x0099:
            if (r15 != 0) goto L_0x009f
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x009f:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r13 = r13 << 6
            r7 = r7 ^ r13
            if (r7 >= r14) goto L_0x00aa
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x00aa:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00b0
            goto L_0x01f0
        L_0x00b0:
            if (r7 == r9) goto L_0x00c2
            if (r7 == r8) goto L_0x00c2
            if (r7 < 0) goto L_0x00b8
            if (r10 >= r7) goto L_0x00bd
        L_0x00b8:
            if (r11 <= r7) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            if (r12 < r7) goto L_0x00bf
        L_0x00bd:
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r4 != 0) goto L_0x01ef
        L_0x00c2:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00c9
            goto L_0x01ef
        L_0x00c9:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00cf
            r14 = 1
            goto L_0x00d0
        L_0x00cf:
            r14 = 2
        L_0x00d0:
            int r5 = r5 + r14
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00d6:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r15) goto L_0x0157
            int r7 = r3 + 2
            if (r2 > r7) goto L_0x00e8
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x00e8:
            byte r10 = r1[r3]
            int r13 = r3 + 1
            byte r13 = r1[r13]
            r15 = r13 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x00f4
            r15 = 1
            goto L_0x00f5
        L_0x00f4:
            r15 = 0
        L_0x00f5:
            if (r15 != 0) goto L_0x00fb
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x00fb:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0103
            r14 = 1
            goto L_0x0104
        L_0x0103:
            r14 = 0
        L_0x0104:
            if (r14 != 0) goto L_0x010a
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x010a:
            r14 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x011c
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x011c:
            if (r11 <= r7) goto L_0x011f
            goto L_0x0125
        L_0x011f:
            if (r12 < r7) goto L_0x0125
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x0125:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x012b
            goto L_0x01f0
        L_0x012b:
            if (r7 == r9) goto L_0x0143
            if (r7 == r8) goto L_0x0143
            if (r7 < 0) goto L_0x0135
            r4 = 31
            if (r4 >= r7) goto L_0x013e
        L_0x0135:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x0140
        L_0x013e:
            r4 = 1
            goto L_0x0141
        L_0x0140:
            r4 = 0
        L_0x0141:
            if (r4 != 0) goto L_0x01ef
        L_0x0143:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x014a
            goto L_0x01ef
        L_0x014a:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x0150
            r14 = 1
            goto L_0x0151
        L_0x0150:
            r14 = 2
        L_0x0151:
            int r5 = r5 + r14
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x0157:
            int r7 = r7 >> 3
            if (r7 != r15) goto L_0x01ec
            int r7 = r3 + 3
            if (r2 > r7) goto L_0x0163
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x0163:
            byte r8 = r1[r3]
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r13 = r10 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto L_0x016f
            r13 = 1
            goto L_0x0170
        L_0x016f:
            r13 = 0
        L_0x0170:
            if (r13 != 0) goto L_0x0176
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x0176:
            int r13 = r3 + 2
            byte r13 = r1[r13]
            r15 = r13 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0180
            r15 = 1
            goto L_0x0181
        L_0x0180:
            r15 = 0
        L_0x0181:
            if (r15 != 0) goto L_0x0187
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x0187:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x018f
            r14 = 1
            goto L_0x0190
        L_0x018f:
            r14 = 0
        L_0x0190:
            if (r14 != 0) goto L_0x0196
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x0196:
            r14 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r14
            int r13 = r13 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r8 = r8 << 18
            r7 = r7 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r8) goto L_0x01ab
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x01ab:
            if (r11 <= r7) goto L_0x01ae
            goto L_0x01b3
        L_0x01ae:
            if (r12 < r7) goto L_0x01b3
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x01b3:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x01ba
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x01ba:
            int r8 = r4 + 1
            if (r4 != r6) goto L_0x01bf
            goto L_0x01f0
        L_0x01bf:
            if (r7 == r9) goto L_0x01d9
            r4 = 13
            if (r7 == r4) goto L_0x01d9
            if (r7 < 0) goto L_0x01cb
            r4 = 31
            if (r4 >= r7) goto L_0x01d4
        L_0x01cb:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x01d0
            goto L_0x01d6
        L_0x01d0:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x01d6
        L_0x01d4:
            r4 = 1
            goto L_0x01d7
        L_0x01d6:
            r4 = 0
        L_0x01d7:
            if (r4 != 0) goto L_0x01ef
        L_0x01d9:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x01df
            goto L_0x01ef
        L_0x01df:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x01e5
            r14 = 1
            goto L_0x01e6
        L_0x01e5:
            r14 = 2
        L_0x01e6:
            int r5 = r5 + r14
            int r3 = r3 + 4
            r4 = r8
            goto L_0x0014
        L_0x01ec:
            if (r4 != r6) goto L_0x01ef
            goto L_0x01f0
        L_0x01ef:
            r5 = -1
        L_0x01f0:
            java.lang.String r1 = "…]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r5 != r4) goto L_0x025c
            byte[] r4 = r0.f3893g
            int r4 = r4.length
            if (r4 > r6) goto L_0x020d
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            java.lang.String r3 = r17.mo4671d()
            r1.append(r3)
            goto L_0x02a9
        L_0x020d:
            java.lang.StringBuilder r2 = p000a.C0001b.m0a(r3)
            byte[] r3 = r0.f3893g
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.f3893g
            int r4 = r3.length
            if (r6 > r4) goto L_0x0223
            r4 = 1
            goto L_0x0224
        L_0x0223:
            r4 = 0
        L_0x0224:
            if (r4 == 0) goto L_0x023d
            int r4 = r3.length
            if (r6 != r4) goto L_0x022b
            r4 = r0
            goto L_0x0235
        L_0x022b:
            j4.i r4 = new j4.i
            r5 = 0
            byte[] r3 = p126u2.C1845f.m5045L(r3, r5, r6)
            r4.<init>(r3)
        L_0x0235:
            java.lang.String r3 = r4.mo4671d()
            r2.append(r3)
            goto L_0x029b
        L_0x023d:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            byte[] r2 = r0.f3893g
            int r2 = r2.length
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x025c:
            java.lang.String r4 = r17.mo4679j()
            r6 = 0
            java.lang.String r7 = r4.substring(r6, r5)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            r10 = 4
            java.lang.String r7 = p067k3.C1205h.m3430N(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = p067k3.C1205h.m3430N(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r6 = p067k3.C1205h.m3430N(r7, r8, r9, r6, r10)
            int r4 = r4.length()
            if (r5 >= r4) goto L_0x02a3
            java.lang.StringBuilder r2 = p000a.C0001b.m0a(r3)
            byte[] r3 = r0.f3893g
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
        L_0x029b:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02b0
        L_0x02a3:
            java.lang.String r1 = "[text="
            java.lang.StringBuilder r1 = p099q.C1599h.m4503a(r1, r6)
        L_0x02a9:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1115i.toString():java.lang.String");
    }
}
