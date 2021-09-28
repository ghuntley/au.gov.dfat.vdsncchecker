package p122t4;

/* renamed from: t4.a */
public class C1811a {

    /* renamed from: a */
    public StringBuilder f5468a = new StringBuilder();

    public C1811a(String str) {
        mo6146b(new C1812b(str).f5474d);
    }

    /* renamed from: a */
    public final void mo6145a(char c) {
        StringBuilder sb = this.f5468a;
        sb.append('\\');
        sb.append(c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026c, code lost:
        if (r13 >= r5) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026e, code lost:
        r1.f5485c = (r1.f5484b - r4) + r7;
        r3 = ((long) r9) << r3;
        r11 = r5;
        r16 = r13;
        r9 = r22 - r32;
        r13 = '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0281, code lost:
        r9 = r9 / 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0284, code lost:
        r10 = 1;
        r8 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0288, code lost:
        r16 = r16 * 5;
        r10 = r10 * 5;
        r5 = r5 * 5;
        r8 = r8 >>> 1;
        r12 = r12 + 1;
        r13 = '0';
        r1.mo6157a((char) (((int) ((r16 >>> (-r12)) & 4294967295L)) + 48));
        r16 = r16 & (r8 - 1);
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a6, code lost:
        if (r16 >= r5) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a8, code lost:
        r1.f5485c = (r1.f5484b - r4) + r7;
        r3 = r8;
        r20 = r10;
        r9 = (r22 - r32) * r10;
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b8, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c7, code lost:
        if (p122t4.C1817f.m5003a(r1, r9, r11, r16, r3, r20) == false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02cb, code lost:
        if (r1.f5486d != false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02cd, code lost:
        r3 = r1.f5483a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d2, code lost:
        if (r3[0] != '-') goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02d4, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d6, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d7, code lost:
        r8 = r1.f5485c;
        r9 = r8 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02de, code lost:
        if (r9 < -5) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e2, code lost:
        if (r9 <= 21) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02e5, code lost:
        r5 = r1.f5484b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e7, code lost:
        if (r8 >= r5) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e9, code lost:
        if (r9 <= 0) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02eb, code lost:
        java.lang.System.arraycopy(r3, r8, r3, r8 + 1, r5 - r8);
        r1.f5483a[r1.f5485c] = '.';
        r3 = r1.f5484b + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fc, code lost:
        r8 = r4 + 2;
        r10 = r8 - r9;
        java.lang.System.arraycopy(r3, r4, r3, r10, r5 - r4);
        r3 = r1.f5483a;
        r3[r4] = r6;
        r3[r4 + 1] = '.';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030c, code lost:
        if (r9 >= 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030e, code lost:
        java.util.Arrays.fill(r3, r8, r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0311, code lost:
        r3 = r1.f5484b;
        r19 = 2 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0316, code lost:
        if (r8 <= r5) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0318, code lost:
        java.util.Arrays.fill(r3, r5, r8, r6);
        r3 = r1.f5484b;
        r19 = r1.f5485c - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0321, code lost:
        r3 = r19 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0323, code lost:
        r1.f5484b = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0327, code lost:
        r6 = r1.f5484b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x032c, code lost:
        if ((r6 - r4) <= 1) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032e, code lost:
        r4 = r4 + 1;
        java.lang.System.arraycopy(r3, r4, r3, r4 + 1, r6 - r4);
        r1.f5483a[r4] = '.';
        r1.f5484b++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033e, code lost:
        r3 = r1.f5483a;
        r4 = r1.f5484b;
        r6 = r4 + 1;
        r1.f5484b = r6;
        r3[r4] = 'e';
        r15 = '+';
        r9 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034e, code lost:
        if (r9 >= 0) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0350, code lost:
        r9 = -r9;
        r15 = '-';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0352, code lost:
        r4 = r6 + 1;
        r1.f5484b = r4;
        r3[r6] = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x035a, code lost:
        if (r9 <= 99) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035c, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035f, code lost:
        if (r9 <= 9) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0361, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0363, code lost:
        r1.f5484b = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0367, code lost:
        r6 = r4 - 1;
        r1.f5483a[r4] = p122t4.C1818g.f5482e[r9 % 10];
        r9 = r9 / 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0376, code lost:
        if (r9 != 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0379, code lost:
        r1.f5486d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037c, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x037e, code lost:
        r15 = 0;
        r1 = new java.lang.String(r1.f5483a, 0, r1.f5484b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038a, code lost:
        r15 = 0;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038c, code lost:
        if (r1 == null) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x038f, code lost:
        r1 = new java.lang.StringBuilder();
        p122t4.C1815d.m4991a(r1, r15, r15, r26);
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03a1, code lost:
        r24 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fc, code lost:
        if (100000000 > r10) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fe, code lost:
        r34 = r8;
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0203, code lost:
        r7 = 10000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0206, code lost:
        if (10000000 > r10) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0208, code lost:
        r11 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022a, code lost:
        r15 = r7;
        r34 = r8;
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0231, code lost:
        if (10 > r10) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0233, code lost:
        r34 = r8;
        r7 = 1;
        r15 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0242, code lost:
        r34 = r8;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0245, code lost:
        r7 = (((long) r7) & 4294967295L) | (((long) r15) << 32);
        r9 = (int) ((r7 >>> 32) & 4294967295L);
        r7 = ((int) (r7 & 4294967295L)) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
        if (r7 <= 0) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025c, code lost:
        r1.mo6157a((char) ((r10 / r9) + 48));
        r10 = r10 % r9;
        r7 = r7 - 1;
        r13 = (((long) r10) << r3) + r16;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6146b(java.lang.Object r41) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            boolean r2 = r1 instanceof java.util.TreeMap
            r3 = 44
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r2 = r0.f5468a
            r6 = 123(0x7b, float:1.72E-43)
            r2.append(r6)
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r4 == 0) goto L_0x0030
            java.lang.StringBuilder r4 = r0.f5468a
            r4.append(r3)
        L_0x0030:
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.mo6147c(r4)
            java.lang.StringBuilder r4 = r0.f5468a
            r6 = 58
            r4.append(r6)
            java.lang.Object r2 = r2.getValue()
            r0.mo6146b(r2)
            r4 = r5
            goto L_0x001d
        L_0x0049:
            java.lang.StringBuilder r1 = r0.f5468a
            r2 = 125(0x7d, float:1.75E-43)
        L_0x004d:
            r1.append(r2)
            goto L_0x03a0
        L_0x0052:
            boolean r2 = r1 instanceof java.util.Vector
            if (r2 == 0) goto L_0x007c
            java.lang.StringBuilder r2 = r0.f5468a
            r6 = 91
            r2.append(r6)
            java.util.Vector r1 = (java.util.Vector) r1
            java.lang.Object[] r1 = r1.toArray()
            int r2 = r1.length
            r6 = r4
        L_0x0065:
            if (r4 >= r2) goto L_0x0077
            r7 = r1[r4]
            if (r6 == 0) goto L_0x0070
            java.lang.StringBuilder r6 = r0.f5468a
            r6.append(r3)
        L_0x0070:
            r0.mo6146b(r7)
            int r4 = r4 + 1
            r6 = r5
            goto L_0x0065
        L_0x0077:
            java.lang.StringBuilder r1 = r0.f5468a
            r2 = 93
            goto L_0x004d
        L_0x007c:
            if (r1 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = r0.f5468a
            java.lang.String r2 = "null"
            r1.append(r2)
            goto L_0x03a0
        L_0x0087:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0092
            java.lang.String r1 = (java.lang.String) r1
            r0.mo6147c(r1)
            goto L_0x03a0
        L_0x0092:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x009f
            java.lang.StringBuilder r2 = r0.f5468a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2.append(r1)
            goto L_0x03a0
        L_0x009f:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L_0x03b1
            java.lang.StringBuilder r2 = r0.f5468a
            java.lang.Double r1 = (java.lang.Double) r1
            double r6 = r1.doubleValue()
            boolean r1 = java.lang.Double.isNaN(r6)
            if (r1 != 0) goto L_0x03a9
            boolean r1 = java.lang.Double.isInfinite(r6)
            if (r1 != 0) goto L_0x03a9
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00c1
            java.lang.String r1 = "0"
            goto L_0x039d
        L_0x00c1:
            t4.g r1 = new t4.g
            r1.<init>()
            r1.f5484b = r4
            r1.f5486d = r4
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r15 = 45
            if (r3 >= 0) goto L_0x00d5
            r1.mo6157a(r15)
            double r8 = -r6
            goto L_0x00d6
        L_0x00d5:
            r8 = r6
        L_0x00d6:
            long r8 = java.lang.Double.doubleToLongBits(r8)
            long r10 = p122t4.C1816e.m5002b(r8)
            int r3 = p122t4.C1816e.m5001a(r8)
        L_0x00e2:
            r12 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r16 = r10 & r12
            r18 = 0
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x00f0
            long r10 = r10 << r5
            int r3 = r3 + -1
            goto L_0x00e2
        L_0x00f0:
            r14 = 11
            long r10 = r10 << r14
            int r3 = r3 + -11
            long r16 = p122t4.C1816e.m5002b(r8)
            int r8 = p122t4.C1816e.m5001a(r8)
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0103
            r9 = r5
            goto L_0x0104
        L_0x0103:
            r9 = r4
        L_0x0104:
            long r12 = r16 << r5
            r20 = 1
            long r22 = r12 + r20
            int r14 = r8 + -1
        L_0x010c:
            r24 = -18014398509481984(0xffc0000000000000, double:-2.247116418577895E307)
            long r24 = r22 & r24
            int r24 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            r4 = 10
            if (r24 != 0) goto L_0x011c
            long r22 = r22 << r4
            int r14 = r14 + -10
            r4 = 0
            goto L_0x010c
        L_0x011c:
            r26 = -9223372036854775808
            long r26 = r22 & r26
            int r24 = (r26 > r18 ? 1 : (r26 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x0129
            long r22 = r22 << r5
            int r14 = r14 + -1
            goto L_0x011c
        L_0x0129:
            r19 = 2
            if (r9 == 0) goto L_0x0138
            r9 = -1074(0xfffffffffffffbce, float:NaN)
            if (r8 == r9) goto L_0x0138
            long r12 = r16 << r19
            long r12 = r12 - r20
            int r8 = r8 + -2
            goto L_0x013b
        L_0x0138:
            long r12 = r12 - r20
            int r8 = r8 - r5
        L_0x013b:
            int r8 = r8 - r14
            long r8 = r12 << r8
            int r12 = r3 + 64
            int r12 = -60 - r12
            int r12 = r12 + 64
            r13 = -1
            int r12 = r12 + r13
            double r4 = (double) r12
            r16 = 4599094494223104510(0x3fd34413509f79fe, double:0.30102999566398114)
            double r4 = r4 * r16
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r4 = r4 + 308
            int r4 = r4 + r13
            r5 = 8
            int r4 = r4 / r5
            r12 = 1
            int r4 = r4 + r12
            t4.c$a[] r12 = p122t4.C1813c.f5475a
            r4 = r12[r4]
            r26 = r6
            long r5 = r4.f5476a
            short r12 = r4.f5477b
            short r4 = r4.f5478c
            r14 = 32
            long r16 = r10 >>> r14
            r28 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r28
            long r30 = r5 >>> r14
            long r5 = r5 & r28
            long r32 = r16 * r30
            long r34 = r30 * r10
            long r16 = r16 * r5
            long r10 = r10 * r5
            long r10 = r10 >>> r14
            long r36 = r16 & r28
            long r10 = r10 + r36
            long r36 = r34 & r28
            long r10 = r10 + r36
            r36 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r10 = r10 + r36
            long r16 = r16 >>> r14
            long r32 = r32 + r16
            long r16 = r34 >>> r14
            long r32 = r32 + r16
            long r10 = r10 >>> r14
            long r32 = r32 + r10
            int r12 = r12 + 64
            int r12 = r12 + r3
            long r10 = r8 >>> r14
            long r8 = r8 & r28
            long r16 = r10 * r30
            long r34 = r30 * r8
            long r10 = r10 * r5
            long r8 = r8 * r5
            long r8 = r8 >>> r14
            long r38 = r10 & r28
            long r8 = r8 + r38
            long r38 = r34 & r28
            long r8 = r8 + r38
            long r8 = r8 + r36
            long r10 = r10 >>> r14
            long r16 = r16 + r10
            long r10 = r34 >>> r14
            long r16 = r16 + r10
            long r8 = r8 >>> r14
            long r16 = r16 + r8
            long r8 = r22 >>> r14
            long r10 = r22 & r28
            long r22 = r8 * r30
            long r30 = r30 * r10
            long r8 = r8 * r5
            long r10 = r10 * r5
            long r5 = r10 >>> r14
            long r10 = r8 & r28
            long r5 = r5 + r10
            long r10 = r30 & r28
            long r5 = r5 + r10
            long r5 = r5 + r36
            long r8 = r8 >>> r14
            long r22 = r22 + r8
            long r8 = r30 >>> r14
            long r22 = r22 + r8
            long r5 = r5 >>> r14
            long r22 = r22 + r5
            long r16 = r16 - r20
            long r22 = r22 + r20
            long r5 = r22 - r16
            int r3 = -r12
            long r8 = r20 << r3
            long r10 = r22 >>> r3
            long r10 = r10 & r28
            int r10 = (int) r10
            long r16 = r8 - r20
            long r16 = r16 & r22
            int r11 = 64 - r3
            r7 = 1000000000(0x3b9aca00, float:0.0047237873)
            r15 = 100000000(0x5f5e100, float:2.3122341E-35)
            switch(r11) {
                case 0: goto L_0x0241;
                case 1: goto L_0x0239;
                case 2: goto L_0x0239;
                case 3: goto L_0x0239;
                case 4: goto L_0x022f;
                case 5: goto L_0x022f;
                case 6: goto L_0x022f;
                case 7: goto L_0x0224;
                case 8: goto L_0x0224;
                case 9: goto L_0x0224;
                case 10: goto L_0x021e;
                case 11: goto L_0x021e;
                case 12: goto L_0x021e;
                case 13: goto L_0x021e;
                case 14: goto L_0x0218;
                case 15: goto L_0x0218;
                case 16: goto L_0x0218;
                case 17: goto L_0x0211;
                case 18: goto L_0x0211;
                case 19: goto L_0x0211;
                case 20: goto L_0x020a;
                case 21: goto L_0x020a;
                case 22: goto L_0x020a;
                case 23: goto L_0x020a;
                case 24: goto L_0x0203;
                case 25: goto L_0x0203;
                case 26: goto L_0x0203;
                case 27: goto L_0x01fc;
                case 28: goto L_0x01fc;
                case 29: goto L_0x01fc;
                case 30: goto L_0x01f7;
                case 31: goto L_0x01f7;
                case 32: goto L_0x01f7;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            r7 = 0
            goto L_0x0242
        L_0x01f7:
            if (r7 > r10) goto L_0x01fc
            r11 = 9
            goto L_0x022a
        L_0x01fc:
            if (r15 > r10) goto L_0x0203
            r34 = r8
            r7 = 8
            goto L_0x0245
        L_0x0203:
            r7 = 10000000(0x989680, float:1.4012985E-38)
            if (r7 > r10) goto L_0x020a
            r11 = 7
            goto L_0x022a
        L_0x020a:
            r7 = 1000000(0xf4240, float:1.401298E-39)
            if (r7 > r10) goto L_0x0211
            r11 = 6
            goto L_0x022a
        L_0x0211:
            r7 = 100000(0x186a0, float:1.4013E-40)
            if (r7 > r10) goto L_0x0218
            r11 = 5
            goto L_0x022a
        L_0x0218:
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r7 > r10) goto L_0x021e
            r11 = 4
            goto L_0x022a
        L_0x021e:
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r7 > r10) goto L_0x0224
            r11 = 3
            goto L_0x022a
        L_0x0224:
            r7 = 100
            if (r7 > r10) goto L_0x022f
            r11 = r19
        L_0x022a:
            r15 = r7
            r34 = r8
            r7 = r11
            goto L_0x0245
        L_0x022f:
            r7 = 10
            if (r7 > r10) goto L_0x0239
            r34 = r8
            r7 = 1
            r15 = 10
            goto L_0x0245
        L_0x0239:
            r7 = 1
            if (r7 > r10) goto L_0x0241
            r34 = r8
            r7 = 0
            r15 = 1
            goto L_0x0245
        L_0x0241:
            r7 = -1
        L_0x0242:
            r34 = r8
            r15 = 0
        L_0x0245:
            long r8 = (long) r15
            long r8 = r8 << r14
            long r13 = (long) r7
            long r13 = r13 & r28
            long r7 = r13 | r8
            r9 = 32
            long r13 = r7 >>> r9
            long r13 = r13 & r28
            int r9 = (int) r13
            long r7 = r7 & r28
            int r7 = (int) r7
            r8 = 1
            int r7 = r7 + r8
        L_0x0258:
            r13 = 48
            if (r7 <= 0) goto L_0x0284
            int r8 = r10 / r9
            int r8 = r8 + r13
            char r8 = (char) r8
            r1.mo6157a(r8)
            int r10 = r10 % r9
            int r7 = r7 + -1
            long r13 = (long) r10
            long r13 = r13 << r3
            long r13 = r13 + r16
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0281
            int r8 = r1.f5484b
            int r8 = r8 - r4
            int r8 = r8 + r7
            r1.f5485c = r8
            long r22 = r22 - r32
            long r7 = (long) r9
            long r3 = r7 << r3
            r11 = r5
            r16 = r13
            r9 = r22
            r13 = 48
            goto L_0x02b8
        L_0x0281:
            int r9 = r9 / 10
            goto L_0x0258
        L_0x0284:
            r10 = r20
            r8 = r34
        L_0x0288:
            r13 = 5
            long r16 = r16 * r13
            long r10 = r10 * r13
            long r5 = r5 * r13
            r3 = 1
            long r8 = r8 >>> r3
            int r12 = r12 + r3
            int r3 = -r12
            long r13 = r16 >>> r3
            long r13 = r13 & r28
            int r3 = (int) r13
            r13 = 48
            int r3 = r3 + r13
            char r3 = (char) r3
            r1.mo6157a(r3)
            long r34 = r8 - r20
            long r16 = r16 & r34
            r3 = -1
            int r7 = r7 + r3
            int r14 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x03a1
            int r3 = r1.f5484b
            int r3 = r3 - r4
            int r3 = r3 + r7
            r1.f5485c = r3
            long r22 = r22 - r32
            long r22 = r22 * r10
            r3 = r8
            r20 = r10
            r9 = r22
            r11 = r5
        L_0x02b8:
            r8 = r1
            r6 = r13
            r5 = 9
            r13 = r16
            r7 = 45
            r15 = r3
            r17 = r20
            boolean r3 = p122t4.C1817f.m5003a(r8, r9, r11, r13, r15, r17)
            if (r3 == 0) goto L_0x038a
            boolean r3 = r1.f5486d
            if (r3 != 0) goto L_0x037e
            char[] r3 = r1.f5483a
            r4 = 0
            char r8 = r3[r4]
            if (r8 != r7) goto L_0x02d6
            r4 = 1
            goto L_0x02d7
        L_0x02d6:
            r4 = 0
        L_0x02d7:
            int r8 = r1.f5485c
            int r9 = r8 - r4
            r10 = -5
            r11 = 46
            if (r9 < r10) goto L_0x0327
            r10 = 21
            if (r9 <= r10) goto L_0x02e5
            goto L_0x0327
        L_0x02e5:
            int r5 = r1.f5484b
            if (r8 >= r5) goto L_0x0316
            if (r9 <= 0) goto L_0x02fc
            int r4 = r8 + 1
            int r5 = r5 - r8
            java.lang.System.arraycopy(r3, r8, r3, r4, r5)
            char[] r3 = r1.f5483a
            int r4 = r1.f5485c
            r3[r4] = r11
            int r3 = r1.f5484b
            r7 = 1
            int r3 = r3 + r7
            goto L_0x0323
        L_0x02fc:
            r7 = 1
            int r8 = r4 + 2
            int r10 = r8 - r9
            int r5 = r5 - r4
            java.lang.System.arraycopy(r3, r4, r3, r10, r5)
            char[] r3 = r1.f5483a
            r3[r4] = r6
            int r4 = r4 + r7
            r3[r4] = r11
            if (r9 >= 0) goto L_0x0311
            java.util.Arrays.fill(r3, r8, r10, r6)
        L_0x0311:
            int r3 = r1.f5484b
            int r19 = 2 - r9
            goto L_0x0321
        L_0x0316:
            if (r8 <= r5) goto L_0x0325
            java.util.Arrays.fill(r3, r5, r8, r6)
            int r3 = r1.f5484b
            int r4 = r1.f5485c
            int r19 = r4 - r3
        L_0x0321:
            int r3 = r19 + r3
        L_0x0323:
            r1.f5484b = r3
        L_0x0325:
            r14 = 1
            goto L_0x0379
        L_0x0327:
            int r6 = r1.f5484b
            int r8 = r6 - r4
            r10 = 1
            if (r8 <= r10) goto L_0x033e
            int r4 = r4 + r10
            int r8 = r4 + 1
            int r6 = r6 - r4
            java.lang.System.arraycopy(r3, r4, r3, r8, r6)
            char[] r3 = r1.f5483a
            r3[r4] = r11
            int r3 = r1.f5484b
            int r3 = r3 + r10
            r1.f5484b = r3
        L_0x033e:
            char[] r3 = r1.f5483a
            int r4 = r1.f5484b
            int r6 = r4 + 1
            r1.f5484b = r6
            r8 = 101(0x65, float:1.42E-43)
            r3[r4] = r8
            r15 = 43
            r4 = 1
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0352
            int r9 = -r9
            r15 = r7
        L_0x0352:
            int r4 = r6 + 1
            r1.f5484b = r4
            r3[r6] = r15
            r3 = 99
            if (r9 <= r3) goto L_0x035f
            int r4 = r4 + 2
            goto L_0x0363
        L_0x035f:
            if (r9 <= r5) goto L_0x0363
            int r4 = r4 + 1
        L_0x0363:
            int r3 = r4 + 1
            r1.f5484b = r3
        L_0x0367:
            int r3 = r9 % 10
            char[] r5 = r1.f5483a
            int r6 = r4 + -1
            char[] r7 = p122t4.C1818g.f5482e
            char r3 = r7[r3]
            r5[r4] = r3
            r13 = 10
            int r9 = r9 / r13
            if (r9 != 0) goto L_0x037c
            goto L_0x0325
        L_0x0379:
            r1.f5486d = r14
            goto L_0x037e
        L_0x037c:
            r4 = r6
            goto L_0x0367
        L_0x037e:
            java.lang.String r3 = new java.lang.String
            char[] r4 = r1.f5483a
            int r1 = r1.f5484b
            r15 = 0
            r3.<init>(r4, r15, r1)
            r1 = r3
            goto L_0x038c
        L_0x038a:
            r15 = 0
            r1 = 0
        L_0x038c:
            if (r1 == 0) goto L_0x038f
            goto L_0x039d
        L_0x038f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r26
            p122t4.C1815d.m4991a(r1, r15, r15, r3)
            java.lang.String r1 = r1.toString()
        L_0x039d:
            r2.append(r1)
        L_0x03a0:
            return
        L_0x03a1:
            r24 = r26
            r14 = 1
            r15 = 0
            r18 = 9
            goto L_0x0288
        L_0x03a9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "NaN/Infinity are not permitted in JSON"
            r1.<init>(r2)
            throw r1
        L_0x03b1:
            java.lang.InternalError r2 = new java.lang.InternalError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown object: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p122t4.C1811a.mo6146b(java.lang.Object):void");
    }

    /* renamed from: c */
    public final void mo6147c(String str) {
        this.f5468a.append('\"');
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c == 12) {
                c = 'f';
            } else if (c != 13) {
                if (!(c == '\"' || c == '\\')) {
                    switch (c) {
                        case 8:
                            c = 'b';
                            break;
                        case 9:
                            c = 't';
                            break;
                        case 10:
                            c = 'n';
                            break;
                        default:
                            if (c >= ' ') {
                                this.f5468a.append(c);
                                break;
                            } else {
                                mo6145a('u');
                                for (int i2 = 0; i2 < 4; i2++) {
                                    int i3 = c >>> 12;
                                    this.f5468a.append((char) (i3 > 9 ? (i3 + 97) - 10 : i3 + 48));
                                    c = (char) (c << 4);
                                }
                                continue;
                            }
                    }
                }
            } else {
                c = 'r';
            }
            mo6145a(c);
        }
        this.f5468a.append('\"');
    }
}
