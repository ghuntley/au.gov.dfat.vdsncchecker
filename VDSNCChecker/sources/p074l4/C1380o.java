package p074l4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000a.C0001b;
import p016c0.C0559c;
import p045h.C0990o;
import p104q4.C1625a;

/* renamed from: l4.o */
public class C1380o extends C1393s {

    /* renamed from: g */
    public static final ConcurrentMap<C1381a, C1380o> f4415g = new ConcurrentHashMap();

    /* renamed from: e */
    public final String f4416e;

    /* renamed from: f */
    public byte[] f4417f;

    /* renamed from: l4.o$a */
    public static class C1381a {

        /* renamed from: a */
        public final int f4418a;

        /* renamed from: b */
        public final byte[] f4419b;

        public C1381a(byte[] bArr) {
            this.f4418a = C1625a.m4536c(bArr);
            this.f4419b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1381a) {
                return Arrays.equals(this.f4419b, ((C1381a) obj).f4419b);
            }
            return false;
        }

        public int hashCode() {
            return this.f4418a;
        }
    }

    public C1380o(String str) {
        char charAt;
        boolean z = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            z = m3943v(str, 2);
        }
        if (z) {
            this.f4416e = str;
            return;
        }
        throw new IllegalArgumentException(C0559c.m1823a("string ", str, " not an OID"));
    }

    public C1380o(byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f4416e = stringBuffer.toString();
        this.f4417f = C1625a.m4534a(bArr);
    }

    /* renamed from: r */
    public static C1380o m3941r(byte[] bArr) {
        C1380o oVar = (C1380o) ((ConcurrentHashMap) f4415g).get(new C1381a(bArr));
        return oVar == null ? new C1380o(bArr) : oVar;
    }

    /* renamed from: t */
    public static C1380o m3942t(Object obj) {
        if (obj == null || (obj instanceof C1380o)) {
            return (C1380o) obj;
        }
        if (obj instanceof C1348e) {
            C1393s c = ((C1348e) obj).mo5171c();
            if (c instanceof C1380o) {
                return (C1380o) c;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C1380o) C1393s.m3981m((byte[]) obj);
            } catch (IOException e) {
                StringBuilder a = C0001b.m0a("failed to construct object identifier from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C0001b.m0a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L_0x0005;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3943v(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L_0x0005:
            r2 = r1
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L_0x002c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            if (r2 <= r4) goto L_0x0005
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L_0x0005
        L_0x0021:
            return r1
        L_0x0022:
            if (r3 > r5) goto L_0x002b
            r3 = 57
            if (r5 > r3) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002b:
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            if (r2 <= r4) goto L_0x0038
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1380o.m3943v(java.lang.String, int):boolean");
    }

    public int hashCode() {
        return this.f4416e.hashCode();
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (sVar == this) {
            return true;
        }
        if (!(sVar instanceof C1380o)) {
            return false;
        }
        return this.f4416e.equals(((C1380o) sVar).f4416e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 6, mo5202s());
    }

    /* renamed from: k */
    public int mo5155k() {
        int length = mo5202s().length;
        return C1405v1.m4029a(length) + 1 + length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099 A[SYNTHETIC] */
    /* renamed from: q */
    public final void mo5201q(java.io.ByteArrayOutputStream r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = r0.f4416e
            r2 = 46
            r3 = 0
            int r4 = r1.indexOf(r2, r3)
            r5 = -1
            r6 = 1
            if (r4 != r5) goto L_0x0015
            java.lang.String r4 = r1.substring(r3)
            r7 = r5
            goto L_0x001f
        L_0x0015:
            java.lang.String r7 = r1.substring(r3, r4)
            int r4 = r4 + r6
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x001f:
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 * 40
            r8 = 0
            if (r7 != r5) goto L_0x002b
            r9 = r7
            r7 = r8
            goto L_0x003c
        L_0x002b:
            int r9 = r1.indexOf(r2, r7)
            if (r9 != r5) goto L_0x0037
            java.lang.String r7 = r1.substring(r7)
            r9 = r5
            goto L_0x003c
        L_0x0037:
            java.lang.String r7 = r1.substring(r7, r9)
            int r9 = r9 + r6
        L_0x003c:
            int r10 = r7.length()
            r11 = 18
            if (r10 > r11) goto L_0x004e
            long r12 = (long) r4
            long r14 = java.lang.Long.parseLong(r7)
            long r12 = r12 + r14
            r7 = r18
            r4 = r0
            goto L_0x008b
        L_0x004e:
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r7)
            long r12 = (long) r4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r4 = r10.add(r4)
            r7 = r18
            r0.mo5206x(r7, r4)
            r4 = r0
        L_0x0062:
            if (r9 == r5) goto L_0x0066
            r10 = r6
            goto L_0x0067
        L_0x0066:
            r10 = r3
        L_0x0067:
            if (r10 == 0) goto L_0x0099
            if (r9 != r5) goto L_0x006e
            r10 = r9
            r9 = r8
            goto L_0x0080
        L_0x006e:
            int r10 = r1.indexOf(r2, r9)
            if (r10 != r5) goto L_0x007a
            java.lang.String r9 = r1.substring(r9)
            r10 = r5
            goto L_0x0080
        L_0x007a:
            java.lang.String r9 = r1.substring(r9, r10)
            int r10 = r10 + 1
        L_0x0080:
            int r12 = r9.length()
            if (r12 > r11) goto L_0x008f
            long r12 = java.lang.Long.parseLong(r9)
            r9 = r10
        L_0x008b:
            r4.mo5205w(r7, r12)
            goto L_0x0062
        L_0x008f:
            java.math.BigInteger r12 = new java.math.BigInteger
            r12.<init>(r9)
            r4.mo5206x(r7, r12)
            r9 = r10
            goto L_0x0062
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1380o.mo5201q(java.io.ByteArrayOutputStream):void");
    }

    /* renamed from: s */
    public final synchronized byte[] mo5202s() {
        if (this.f4417f == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo5201q(byteArrayOutputStream);
            this.f4417f = byteArrayOutputStream.toByteArray();
        }
        return this.f4417f;
    }

    public String toString() {
        return this.f4416e;
    }

    /* renamed from: u */
    public C1380o mo5204u() {
        C1381a aVar = new C1381a(mo5202s());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f4415g;
        C1380o oVar = (C1380o) concurrentHashMap.get(aVar);
        if (oVar != null) {
            return oVar;
        }
        C1380o oVar2 = (C1380o) concurrentHashMap.putIfAbsent(aVar, this);
        return oVar2 == null ? this : oVar2;
    }

    /* renamed from: w */
    public final void mo5205w(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: x */
    public final void mo5206x(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public C1380o(C1380o oVar, String str) {
        if (m3943v(str, 0)) {
            this.f4416e = oVar.f4416e + "." + str;
            return;
        }
        throw new IllegalArgumentException(C0559c.m1823a("string ", str, " not a valid OID branch"));
    }
}
