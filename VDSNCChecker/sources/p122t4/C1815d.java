package p122t4;

import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.math.BigInteger;

/* renamed from: t4.d */
public class C1815d {

    /* renamed from: a */
    public static final double[] f5479a = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};

    /* renamed from: b */
    public static final double[] f5480b = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};

    /* renamed from: c */
    public static final int[] f5481c = {0, 0, 3, 2, 2};

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03fa, code lost:
        if (r12 != r14) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04d2, code lost:
        if (r14 != 0) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0596, code lost:
        if (r6 != false) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x062f, code lost:
        if (m4995e(r42) != false) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x068d, code lost:
        if (m4995e(r42) != false) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0691, code lost:
        r0.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06c9, code lost:
        if (m4995e(r42) != false) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06cb, code lost:
        r7 = r7 + 1;
        r0.append('1');
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0719 A[LOOP:11: B:426:0x0719->B:427:0x0722, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0761  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:494:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4991a(java.lang.StringBuilder r42, int r43, int r44, double r45) {
        /*
            r0 = r42
            r1 = r44
            r2 = r45
            r4 = 1
            boolean[] r5 = new boolean[r4]
            r6 = 2
            r7 = 0
            r8 = r43
            if (r8 != r6) goto L_0x0022
            r9 = 4921056587992461136(0x444b1ae4d6e2ef50, double:1.0E21)
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0021
            r9 = -4302315448862314672(0xc44b1ae4d6e2ef50, double:-1.0E21)
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0022
        L_0x0021:
            r8 = r7
        L_0x0022:
            int[] r9 = f5481c
            r9 = r9[r8]
            if (r8 < r6) goto L_0x002a
            r6 = r4
            goto L_0x002b
        L_0x002a:
            r6 = r7
        L_0x002b:
            int[] r10 = new int[r4]
            int[] r11 = new int[r4]
            int r12 = m4999i(r45)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r13
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == 0) goto L_0x0047
            r5[r7] = r4
            int r4 = m4999i(r45)
            r4 = r4 & r13
            double r12 = m4996f(r2, r4)
            goto L_0x004a
        L_0x0047:
            r5[r7] = r7
            r12 = r2
        L_0x004a:
            int r4 = m4999i(r12)
            r14 = 2146435072(0x7ff00000, float:NaN)
            r4 = r4 & r14
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 48
            if (r4 != r14) goto L_0x0075
            int r4 = m5000j(r12)
            if (r4 != 0) goto L_0x0068
            int r4 = m4999i(r12)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "Infinity"
            goto L_0x006a
        L_0x0068:
            java.lang.String r4 = "NaN"
        L_0x006a:
            r0.append(r4)
            r4 = 9999(0x270f, float:1.4012E-41)
            r21 = r5
            r19 = r8
            goto L_0x05ac
        L_0x0075:
            r17 = 0
            int r4 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x0088
            r4 = 0
            r0.setLength(r4)
            r0.append(r7)
            r21 = r5
            r19 = r8
            goto L_0x05ab
        L_0x0088:
            long r2 = java.lang.Double.doubleToLongBits(r12)
            r4 = 32
            r14 = r8
            long r7 = r2 >>> r4
            int r7 = (int) r7
            int r2 = (int) r2
            r3 = r7 & r15
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r8
            int r7 = r7 >>> 20
            if (r7 == 0) goto L_0x00a0
            r8 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r8
        L_0x00a0:
            if (r2 == 0) goto L_0x00c8
            r8 = 8
            byte[] r8 = new byte[r8]
            int r16 = m4993c(r2)
            int r2 = r2 >>> r16
            if (r16 == 0) goto L_0x00bb
            int r19 = 32 - r16
            int r19 = r3 << r19
            r2 = r2 | r19
            r4 = 4
            m4998h(r8, r4, r2)
            int r3 = r3 >> r16
            goto L_0x00bf
        L_0x00bb:
            r4 = 4
            m4998h(r8, r4, r2)
        L_0x00bf:
            r2 = 0
            m4998h(r8, r2, r3)
            if (r3 == 0) goto L_0x00d6
            r20 = 2
            goto L_0x00d8
        L_0x00c8:
            r4 = 4
            r2 = 0
            byte[] r8 = new byte[r4]
            int r4 = m4993c(r3)
            int r3 = r3 >>> r4
            m4998h(r8, r2, r3)
            int r16 = r4 + 32
        L_0x00d6:
            r20 = 1
        L_0x00d8:
            r4 = r16
            if (r7 == 0) goto L_0x00eb
            r3 = -1023(0xfffffffffffffc01, float:NaN)
            r15 = -52
            int r3 = androidx.appcompat.widget.C0147d.m397a(r7, r3, r15, r4)
            r10[r2] = r3
            int r3 = 53 - r4
            r11[r2] = r3
            goto L_0x00fe
        L_0x00eb:
            int r7 = r7 + -1023
            int r7 = r7 + -52
            int r7 = r7 + 1
            int r7 = r7 + r4
            r10[r2] = r7
            int r20 = r20 * 32
            int r3 = m4992b(r3)
            int r20 = r20 - r3
            r11[r2] = r20
        L_0x00fe:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r8)
            int r3 = m4999i(r12)
            int r3 = r3 >>> 20
            r3 = r3 & 2047(0x7ff, float:2.868E-42)
            if (r3 == 0) goto L_0x0122
            int r4 = m4999i(r12)
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            r7 = 1072693248(0x3ff00000, float:1.875)
            r4 = r4 | r7
            double r7 = m4996f(r12, r4)
            int r3 = r3 + -1023
            r4 = 0
            r19 = r14
            goto L_0x015b
        L_0x0122:
            r3 = 0
            r4 = r11[r3]
            r3 = r10[r3]
            int r4 = r4 + r3
            int r4 = r4 + 1074
            r3 = 32
            if (r4 <= r3) goto L_0x0142
            int r3 = m4999i(r12)
            long r7 = (long) r3
            int r3 = 64 - r4
            long r7 = r7 << r3
            int r3 = m5000j(r12)
            int r15 = r4 + -32
            int r3 = r3 >>> r15
            r19 = r14
            long r14 = (long) r3
            long r7 = r7 | r14
            goto L_0x014c
        L_0x0142:
            r19 = r14
            int r3 = m5000j(r12)
            long r7 = (long) r3
            int r3 = 32 - r4
            long r7 = r7 << r3
        L_0x014c:
            double r7 = (double) r7
            int r3 = m4999i(r7)
            r14 = 32505856(0x1f00000, float:8.8162076E-38)
            int r3 = r3 - r14
            double r7 = m4996f(r7, r3)
            int r3 = r4 + -1075
            r4 = 1
        L_0x015b:
            r14 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r7 = r7 - r14
            r14 = 4598887322496222049(0x3fd287a7636f4361, double:0.289529654602168)
            double r7 = r7 * r14
            r14 = 4595512376519870643(0x3fc68a288b60c8b3, double:0.1760912590558)
            double r7 = r7 + r14
            double r14 = (double) r3
            r20 = 4599094494223104507(0x3fd34413509f79fb, double:0.301029995663981)
            double r14 = r14 * r20
            double r14 = r14 + r7
            int r7 = (int) r14
            int r8 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r20 = r4
            if (r8 >= 0) goto L_0x0183
            r8 = r5
            double r4 = (double) r7
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0184
            int r7 = r7 + -1
            goto L_0x0184
        L_0x0183:
            r8 = r5
        L_0x0184:
            if (r7 < 0) goto L_0x0196
            r4 = 22
            if (r7 > r4) goto L_0x0196
            double[] r4 = f5479a
            r14 = r4[r7]
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0194
            int r7 = r7 + -1
        L_0x0194:
            r4 = 0
            goto L_0x0197
        L_0x0196:
            r4 = 1
        L_0x0197:
            r5 = 0
            r5 = r11[r5]
            int r5 = r5 - r3
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x01a1
            r3 = 0
            goto L_0x01a3
        L_0x01a1:
            int r3 = -r5
            r5 = 0
        L_0x01a3:
            if (r7 < 0) goto L_0x01a9
            int r5 = r5 + r7
            r14 = 0
            r15 = r7
            goto L_0x01ac
        L_0x01a9:
            int r3 = r3 - r7
            int r14 = -r7
            r15 = 0
        L_0x01ac:
            r21 = r8
            if (r9 < 0) goto L_0x01b4
            r8 = 9
            if (r9 <= r8) goto L_0x01b5
        L_0x01b4:
            r9 = 0
        L_0x01b5:
            r8 = 5
            if (r9 <= r8) goto L_0x01bc
            int r9 = r9 + -4
            r8 = 0
            goto L_0x01bd
        L_0x01bc:
            r8 = 1
        L_0x01bd:
            r22 = r2
            if (r9 == 0) goto L_0x01f5
            r2 = 1
            if (r9 == r2) goto L_0x01f5
            r2 = 2
            if (r9 == r2) goto L_0x01e8
            r2 = 3
            if (r9 == r2) goto L_0x01da
            r2 = 4
            if (r9 == r2) goto L_0x01d8
            r2 = 5
            if (r9 == r2) goto L_0x01d6
            r2 = 1
            r23 = 0
            r24 = 0
            goto L_0x01e1
        L_0x01d6:
            r2 = 1
            goto L_0x01db
        L_0x01d8:
            r2 = 1
            goto L_0x01e9
        L_0x01da:
            r2 = 0
        L_0x01db:
            int r23 = r1 + r7
            int r23 = r23 + 1
            int r24 = r23 + -1
        L_0x01e1:
            r41 = r23
            r23 = r1
            r1 = r41
            goto L_0x0200
        L_0x01e8:
            r2 = 0
        L_0x01e9:
            if (r1 > 0) goto L_0x01ee
            r23 = 1
            goto L_0x01f0
        L_0x01ee:
            r23 = r1
        L_0x01f0:
            r1 = r23
            r24 = r1
            goto L_0x0200
        L_0x01f5:
            r2 = 1
            r23 = -1
            r24 = -1
            r25 = 0
            r1 = r23
            r23 = r25
        L_0x0200:
            r25 = 48
            r27 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r1 < 0) goto L_0x03c0
            r43 = r5
            r5 = 14
            if (r1 > r5) goto L_0x03b9
            if (r8 == 0) goto L_0x03b9
            if (r7 <= 0) goto L_0x0243
            double[] r5 = f5479a
            r8 = r7 & 15
            r29 = r5[r8]
            int r5 = r7 >> 4
            r8 = r5 & 16
            if (r8 == 0) goto L_0x0228
            r5 = r5 & 15
            double[] r8 = f5480b
            r31 = 4
            r31 = r8[r31]
            double r31 = r12 / r31
            r8 = 3
            goto L_0x022b
        L_0x0228:
            r8 = 2
            r31 = r12
        L_0x022b:
            r33 = 0
        L_0x022d:
            if (r5 == 0) goto L_0x0240
            r34 = r5 & 1
            if (r34 == 0) goto L_0x023b
            int r8 = r8 + 1
            double[] r34 = f5480b
            r35 = r34[r33]
            double r29 = r29 * r35
        L_0x023b:
            int r5 = r5 >> 1
            int r33 = r33 + 1
            goto L_0x022d
        L_0x0240:
            double r31 = r31 / r29
            goto L_0x026c
        L_0x0243:
            int r5 = -r7
            if (r5 == 0) goto L_0x0269
            double[] r8 = f5479a
            r29 = r5 & 15
            r29 = r8[r29]
            double r29 = r29 * r12
            int r5 = r5 >> 4
            r8 = 2
            r31 = 0
        L_0x0253:
            if (r5 == 0) goto L_0x0266
            r32 = r5 & 1
            if (r32 == 0) goto L_0x0261
            int r8 = r8 + 1
            double[] r32 = f5480b
            r33 = r32[r31]
            double r29 = r29 * r33
        L_0x0261:
            int r5 = r5 >> 1
            int r31 = r31 + 1
            goto L_0x0253
        L_0x0266:
            r31 = r29
            goto L_0x026c
        L_0x0269:
            r8 = 2
            r31 = r12
        L_0x026c:
            if (r4 == 0) goto L_0x028a
            r29 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r31 > r29 ? 1 : (r31 == r29 ? 0 : -1))
            if (r5 >= 0) goto L_0x028a
            if (r1 <= 0) goto L_0x028a
            if (r24 > 0) goto L_0x0281
            r5 = 1
            r29 = r1
            r30 = r5
            r5 = r7
            r33 = r5
            goto L_0x0297
        L_0x0281:
            int r5 = r7 + -1
            double r31 = r31 * r27
            int r8 = r8 + 1
            r29 = r24
            goto L_0x028d
        L_0x028a:
            r29 = r1
            r5 = r7
        L_0x028d:
            r30 = 0
            r33 = r7
            r41 = r29
            r29 = r1
            r1 = r41
        L_0x0297:
            double r7 = (double) r8
            double r7 = r7 * r31
            r34 = 4619567317775286272(0x401c000000000000, double:7.0)
            double r7 = r7 + r34
            int r34 = m4999i(r7)
            r35 = 54525952(0x3400000, float:5.642373E-37)
            r36 = r12
            int r12 = r34 - r35
            double r7 = m4996f(r7, r12)
            if (r1 != 0) goto L_0x02ca
            r12 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r31 = r31 - r12
            int r12 = (r31 > r7 ? 1 : (r31 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x02c0
            r1 = 49
            r0.append(r1)
            r1 = 1
            int r5 = r5 + r1
            int r5 = r5 + r1
            goto L_0x06d5
        L_0x02c0:
            double r12 = -r7
            int r12 = (r31 > r12 ? 1 : (r31 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x02c8
        L_0x02c5:
            r1 = 0
            goto L_0x05a3
        L_0x02c8:
            r30 = 1
        L_0x02ca:
            if (r30 != 0) goto L_0x03a3
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r2 == 0) goto L_0x0337
            double[] r30 = f5479a
            int r34 = r1 + -1
            r34 = r30[r34]
            double r12 = r12 / r34
            double r12 = r12 - r7
            r7 = 0
            r35 = r3
            r34 = r4
            r38 = r14
            r39 = r15
            r3 = r31
        L_0x02e4:
            long r14 = (long) r3
            r40 = r9
            double r8 = (double) r14
            double r3 = r3 - r8
            long r14 = r14 + r25
            int r8 = (int) r14
            char r8 = (char) r8
            r0.append(r8)
            int r8 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x02f6
            r1 = 1
            goto L_0x0324
        L_0x02f6:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 - r3
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0327
        L_0x02fd:
            int r1 = r42.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            int r3 = r42.length()
            int r3 = r3 - r2
            r0.setLength(r3)
            r3 = 57
            if (r1 == r3) goto L_0x0314
            goto L_0x031e
        L_0x0314:
            int r1 = r42.length()
            if (r1 != 0) goto L_0x02fd
            int r5 = r5 + 1
            r1 = 48
        L_0x031e:
            int r1 = r1 + r2
            char r1 = (char) r1
            r0.append(r1)
            r1 = r2
        L_0x0324:
            int r5 = r5 + r1
            goto L_0x06d5
        L_0x0327:
            int r7 = r7 + 1
            if (r7 < r1) goto L_0x0330
            r31 = r3
            r4 = r10
            goto L_0x039a
        L_0x0330:
            double r12 = r12 * r27
            double r3 = r3 * r27
            r9 = r40
            goto L_0x02e4
        L_0x0337:
            r35 = r3
            r34 = r4
            r40 = r9
            r38 = r14
            r39 = r15
            double[] r3 = f5479a
            int r4 = r1 + -1
            r12 = r3[r4]
            double r7 = r7 * r12
            r3 = 1
            r12 = r31
        L_0x034b:
            long r14 = (long) r12
            r4 = r10
            double r9 = (double) r14
            double r12 = r12 - r9
            long r14 = r14 + r25
            int r9 = (int) r14
            char r9 = (char) r9
            r0.append(r9)
            if (r3 != r1) goto L_0x039d
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 + r7
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0389
        L_0x035f:
            int r1 = r42.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            int r3 = r42.length()
            int r3 = r3 - r2
            r0.setLength(r3)
            r3 = 57
            if (r1 == r3) goto L_0x0376
            goto L_0x0380
        L_0x0376:
            int r1 = r42.length()
            if (r1 != 0) goto L_0x035f
            int r5 = r5 + 1
            r1 = 48
        L_0x0380:
            int r1 = r1 + r2
            char r1 = (char) r1
            r0.append(r1)
            int r5 = r5 + r2
            r1 = r2
            goto L_0x06d5
        L_0x0389:
            r3 = 1
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 - r7
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0398
            m4997g(r42)
            int r5 = r5 + r3
            r1 = r3
            goto L_0x06d5
        L_0x0398:
            r31 = r12
        L_0x039a:
            r30 = 1
            goto L_0x03ae
        L_0x039d:
            int r3 = r3 + 1
            double r12 = r12 * r27
            r10 = r4
            goto L_0x034b
        L_0x03a3:
            r35 = r3
            r34 = r4
            r40 = r9
            r4 = r10
            r38 = r14
            r39 = r15
        L_0x03ae:
            r3 = 0
            if (r30 == 0) goto L_0x03b5
            r0.setLength(r3)
            goto L_0x03d5
        L_0x03b5:
            r7 = r5
            r12 = r31
            goto L_0x03db
        L_0x03b9:
            r29 = r1
            r35 = r3
            r34 = r4
            goto L_0x03c8
        L_0x03c0:
            r29 = r1
            r35 = r3
            r34 = r4
            r43 = r5
        L_0x03c8:
            r33 = r7
            r40 = r9
            r4 = r10
            r36 = r12
            r38 = r14
            r39 = r15
            r1 = 0
            r3 = r1
        L_0x03d5:
            r1 = r29
            r7 = r33
            r12 = r36
        L_0x03db:
            r3 = r4[r3]
            r8 = 1
            if (r3 < 0) goto L_0x0456
            r3 = 14
            if (r7 > r3) goto L_0x0456
            double[] r2 = f5479a
            r14 = r2[r7]
            if (r23 >= 0) goto L_0x03fe
            if (r1 > 0) goto L_0x03fe
            if (r1 < 0) goto L_0x02c5
            r1 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r14 = r14 * r1
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 < 0) goto L_0x02c5
            if (r6 != 0) goto L_0x059a
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x059a
            goto L_0x02c5
        L_0x03fe:
            r2 = 1
        L_0x03ff:
            double r3 = r12 / r14
            long r3 = (long) r3
            double r10 = (double) r3
            double r10 = r10 * r14
            double r12 = r12 - r10
            long r10 = r3 + r25
            int r5 = (int) r10
            char r5 = (char) r5
            r0.append(r5)
            if (r2 != r1) goto L_0x0447
            double r12 = r12 + r12
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x041f
            if (r1 != 0) goto L_0x0610
            long r1 = r3 & r8
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x041f
            if (r6 == 0) goto L_0x0610
        L_0x041f:
            int r1 = r42.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            int r3 = r42.length()
            int r3 = r3 - r2
            r0.setLength(r3)
            r3 = 57
            if (r1 == r3) goto L_0x0436
            goto L_0x0440
        L_0x0436:
            int r1 = r42.length()
            if (r1 != 0) goto L_0x041f
            int r7 = r7 + 1
            r1 = 48
        L_0x0440:
            int r1 = r1 + r2
            char r1 = (char) r1
            r0.append(r1)
            r1 = r2
            goto L_0x044f
        L_0x0447:
            r3 = 1
            double r12 = r12 * r27
            int r4 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x0453
            r1 = r3
        L_0x044f:
            int r5 = r7 + 1
            goto L_0x06d5
        L_0x0453:
            int r2 = r2 + 1
            goto L_0x03ff
        L_0x0456:
            r3 = 0
            if (r2 == 0) goto L_0x04a1
            r3 = 2
            r5 = r40
            if (r5 >= r3) goto L_0x0471
            r3 = 0
            if (r20 == 0) goto L_0x0466
            r3 = r4[r3]
            int r3 = r3 + 1075
            goto L_0x046a
        L_0x0466:
            r3 = r11[r3]
            int r3 = 54 - r3
        L_0x046a:
            r4 = r35
            r14 = r38
            r15 = r39
            goto L_0x048f
        L_0x0471:
            int r3 = r1 + -1
            r14 = r38
            if (r14 < r3) goto L_0x047c
            int r3 = r14 - r3
            r15 = r39
            goto L_0x0481
        L_0x047c:
            int r3 = r3 - r14
            int r15 = r39 + r3
            int r14 = r14 + r3
            r3 = 0
        L_0x0481:
            if (r1 >= 0) goto L_0x048a
            int r4 = r35 - r1
            r10 = 0
            r38 = r3
            r3 = r10
            goto L_0x048f
        L_0x048a:
            r38 = r3
            r4 = r35
            r3 = r1
        L_0x048f:
            int r10 = r35 + r3
            int r3 = r43 + r3
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r8)
            r35 = r10
            r10 = r38
            r41 = r4
            r4 = r3
            r3 = r41
            goto L_0x04ad
        L_0x04a1:
            r14 = r38
            r5 = r40
            r4 = r43
            r11 = r3
            r10 = r14
            r3 = r35
            r15 = r39
        L_0x04ad:
            if (r3 <= 0) goto L_0x04be
            if (r4 <= 0) goto L_0x04be
            if (r3 >= r4) goto L_0x04b6
            r17 = r3
            goto L_0x04b8
        L_0x04b6:
            r17 = r4
        L_0x04b8:
            int r35 = r35 - r17
            int r3 = r3 - r17
            int r4 = r4 - r17
        L_0x04be:
            if (r14 <= 0) goto L_0x04dc
            if (r2 == 0) goto L_0x04d5
            if (r10 <= 0) goto L_0x04cf
            java.math.BigInteger r11 = m4994d(r11, r10)
            r8 = r22
            java.math.BigInteger r8 = r11.multiply(r8)
            goto L_0x04d1
        L_0x04cf:
            r8 = r22
        L_0x04d1:
            int r14 = r14 - r10
            if (r14 == 0) goto L_0x04de
            goto L_0x04d7
        L_0x04d5:
            r8 = r22
        L_0x04d7:
            java.math.BigInteger r8 = m4994d(r8, r14)
            goto L_0x04de
        L_0x04dc:
            r8 = r22
        L_0x04de:
            r9 = 1
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            if (r15 <= 0) goto L_0x04ea
            java.math.BigInteger r9 = m4994d(r9, r15)
        L_0x04ea:
            r10 = 2
            if (r5 >= r10) goto L_0x050c
            int r10 = m5000j(r12)
            if (r10 != 0) goto L_0x050c
            int r10 = m4999i(r12)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x050c
            int r10 = m4999i(r12)
            r14 = 2145386496(0x7fe00000, float:NaN)
            r10 = r10 & r14
            if (r10 == 0) goto L_0x050c
            int r35 = r35 + 1
            int r4 = r4 + 1
            r10 = 1
            goto L_0x050d
        L_0x050c:
            r10 = 0
        L_0x050d:
            byte[] r14 = r9.toByteArray()
            r17 = 0
            r18 = 0
            r43 = r1
            r22 = r12
            r1 = r17
        L_0x051b:
            r12 = 4
            if (r1 >= r12) goto L_0x052d
            int r12 = r18 << 8
            int r13 = r14.length
            if (r1 >= r13) goto L_0x0528
            byte r13 = r14[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r12 = r12 | r13
        L_0x0528:
            r18 = r12
            int r1 = r1 + 1
            goto L_0x051b
        L_0x052d:
            if (r15 == 0) goto L_0x0536
            int r1 = m4992b(r18)
            int r1 = 32 - r1
            goto L_0x0537
        L_0x0536:
            r1 = 1
        L_0x0537:
            int r1 = r1 + r4
            r1 = r1 & 31
            if (r1 == 0) goto L_0x053e
            int r1 = 32 - r1
        L_0x053e:
            r12 = 4
            if (r1 <= r12) goto L_0x0544
            int r1 = r1 + -4
            goto L_0x0548
        L_0x0544:
            if (r1 >= r12) goto L_0x054c
            int r1 = r1 + 28
        L_0x0548:
            int r35 = r35 + r1
            int r3 = r3 + r1
            int r4 = r4 + r1
        L_0x054c:
            r1 = r35
            if (r1 <= 0) goto L_0x0554
            java.math.BigInteger r8 = r8.shiftLeft(r1)
        L_0x0554:
            if (r4 <= 0) goto L_0x055a
            java.math.BigInteger r9 = r9.shiftLeft(r4)
        L_0x055a:
            r12 = 10
            if (r34 == 0) goto L_0x057b
            int r1 = r8.compareTo(r9)
            if (r1 >= 0) goto L_0x057b
            int r7 = r7 + -1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r8 = r8.multiply(r1)
            if (r2 == 0) goto L_0x0578
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r11 = r11.multiply(r1)
        L_0x0578:
            r1 = r24
            goto L_0x057d
        L_0x057b:
            r1 = r43
        L_0x057d:
            if (r1 > 0) goto L_0x05b0
            r4 = 2
            if (r5 <= r4) goto L_0x05b0
            if (r1 < 0) goto L_0x02c5
            r1 = 5
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r9.multiply(r1)
            int r1 = r8.compareTo(r1)
            if (r1 < 0) goto L_0x02c5
            if (r1 != 0) goto L_0x059a
            if (r6 != 0) goto L_0x059a
            goto L_0x02c5
        L_0x059a:
            r1 = 49
            r0.append(r1)
            r1 = 1
            int r7 = r7 + r1
            goto L_0x044f
        L_0x05a3:
            r0.setLength(r1)
            r1 = 48
            r0.append(r1)
        L_0x05ab:
            r4 = 1
        L_0x05ac:
            r1 = 1
            r5 = r4
            goto L_0x06d5
        L_0x05b0:
            if (r2 == 0) goto L_0x0695
            if (r3 <= 0) goto L_0x05b8
            java.math.BigInteger r11 = r11.shiftLeft(r3)
        L_0x05b8:
            r2 = 1
            if (r10 == 0) goto L_0x05c0
            java.math.BigInteger r3 = r11.shiftLeft(r2)
            goto L_0x05c1
        L_0x05c0:
            r3 = r11
        L_0x05c1:
            r4 = r3
            r3 = r2
        L_0x05c3:
            java.math.BigInteger[] r8 = r8.divideAndRemainder(r9)
            r2 = r8[r2]
            r10 = 0
            r8 = r8[r10]
            int r8 = r8.intValue()
            int r8 = r8 + 48
            char r8 = (char) r8
            int r10 = r2.compareTo(r11)
            java.math.BigInteger r14 = r9.subtract(r4)
            int r15 = r14.signum()
            if (r15 > 0) goto L_0x05e3
            r14 = 1
            goto L_0x05e7
        L_0x05e3:
            int r14 = r2.compareTo(r14)
        L_0x05e7:
            if (r14 != 0) goto L_0x0613
            if (r5 != 0) goto L_0x0613
            int r15 = m5000j(r22)
            r15 = r15 & 1
            if (r15 != 0) goto L_0x0613
            r1 = 57
            if (r8 != r1) goto L_0x0608
            r0.append(r1)
            boolean r1 = m4995e(r42)
            if (r1 == 0) goto L_0x0610
            int r7 = r7 + 1
            r1 = 49
            r0.append(r1)
            goto L_0x0610
        L_0x0608:
            if (r10 <= 0) goto L_0x060d
            int r8 = r8 + 1
            char r8 = (char) r8
        L_0x060d:
            r0.append(r8)
        L_0x0610:
            r1 = 1
            goto L_0x044f
        L_0x0613:
            if (r10 < 0) goto L_0x066a
            if (r10 != 0) goto L_0x0622
            if (r5 != 0) goto L_0x0622
            int r10 = m5000j(r22)
            r10 = r10 & 1
            if (r10 != 0) goto L_0x0622
            goto L_0x066a
        L_0x0622:
            if (r14 <= 0) goto L_0x063b
            r1 = 57
            if (r8 != r1) goto L_0x0633
            r0.append(r1)
            boolean r1 = m4995e(r42)
            if (r1 == 0) goto L_0x06d2
            goto L_0x06cb
        L_0x0633:
            r1 = 1
            int r8 = r8 + r1
            char r2 = (char) r8
            r0.append(r2)
            goto L_0x044f
        L_0x063b:
            r0.append(r8)
            if (r3 != r1) goto L_0x0643
            r1 = 1
            goto L_0x06ae
        L_0x0643:
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r8 = r2.multiply(r8)
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r12)
            if (r11 != r4) goto L_0x0658
            java.math.BigInteger r2 = r4.multiply(r2)
            r4 = r2
            r11 = r4
            goto L_0x0665
        L_0x0658:
            java.math.BigInteger r2 = r11.multiply(r2)
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r4 = r4.multiply(r10)
            r11 = r2
        L_0x0665:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x05c3
        L_0x066a:
            if (r14 <= 0) goto L_0x0691
            r1 = 1
            java.math.BigInteger r2 = r2.shiftLeft(r1)
            int r2 = r2.compareTo(r9)
            if (r2 > 0) goto L_0x067f
            if (r2 != 0) goto L_0x0691
            r2 = r8 & 1
            if (r2 == r1) goto L_0x067f
            if (r6 == 0) goto L_0x0691
        L_0x067f:
            int r1 = r8 + 1
            char r1 = (char) r1
            r2 = 57
            if (r8 != r2) goto L_0x0690
            r0.append(r2)
            boolean r1 = m4995e(r42)
            if (r1 == 0) goto L_0x06d2
            goto L_0x06cb
        L_0x0690:
            r8 = r1
        L_0x0691:
            r0.append(r8)
            goto L_0x06d2
        L_0x0695:
            r2 = 1
        L_0x0696:
            java.math.BigInteger[] r3 = r8.divideAndRemainder(r9)
            r4 = 1
            r5 = r3[r4]
            r8 = 0
            r3 = r3[r8]
            int r3 = r3.intValue()
            int r3 = r3 + 48
            char r8 = (char) r3
            r0.append(r8)
            if (r2 < r1) goto L_0x078f
            r1 = r4
            r2 = r5
        L_0x06ae:
            java.math.BigInteger r2 = r2.shiftLeft(r1)
            int r2 = r2.compareTo(r9)
            if (r2 > 0) goto L_0x06c5
            if (r2 != 0) goto L_0x06c1
            r2 = r8 & 1
            if (r2 == r1) goto L_0x06c5
            if (r6 == 0) goto L_0x06c1
            goto L_0x06c5
        L_0x06c1:
            m4997g(r42)
            goto L_0x06d2
        L_0x06c5:
            boolean r1 = m4995e(r42)
            if (r1 == 0) goto L_0x06d2
        L_0x06cb:
            int r7 = r7 + 1
            r1 = 49
            r0.append(r1)
        L_0x06d2:
            r1 = 1
            int r7 = r7 + r1
            r5 = r7
        L_0x06d5:
            int r2 = r42.length()
            r3 = 9999(0x270f, float:1.4012E-41)
            if (r5 == r3) goto L_0x075c
            r3 = -5
            if (r19 == 0) goto L_0x0706
            r8 = r19
            if (r8 == r1) goto L_0x0703
            r1 = 2
            if (r8 == r1) goto L_0x06fc
            r1 = 3
            if (r8 == r1) goto L_0x06f8
            r1 = 4
            if (r8 == r1) goto L_0x06ef
            r1 = 0
            goto L_0x0711
        L_0x06ef:
            if (r5 < r3) goto L_0x06f8
            r3 = r44
            if (r5 <= r3) goto L_0x06f6
            goto L_0x06fa
        L_0x06f6:
            r1 = r3
            goto L_0x070e
        L_0x06f8:
            r3 = r44
        L_0x06fa:
            r1 = r3
            goto L_0x0704
        L_0x06fc:
            r3 = r44
            if (r3 < 0) goto L_0x070d
            int r1 = r5 + r3
            goto L_0x070e
        L_0x0703:
            r1 = 0
        L_0x0704:
            r3 = 1
            goto L_0x0717
        L_0x0706:
            if (r5 < r3) goto L_0x0710
            r1 = 21
            if (r5 <= r1) goto L_0x070d
            goto L_0x0710
        L_0x070d:
            r1 = r5
        L_0x070e:
            r3 = 0
            goto L_0x0717
        L_0x0710:
            r1 = 1
        L_0x0711:
            r3 = 0
            r41 = r3
            r3 = r1
            r1 = r41
        L_0x0717:
            if (r2 >= r1) goto L_0x0725
        L_0x0719:
            r2 = 48
            r0.append(r2)
            int r2 = r42.length()
            if (r2 != r1) goto L_0x0719
            r2 = r1
        L_0x0725:
            r1 = 46
            if (r3 == 0) goto L_0x0740
            r3 = 1
            if (r2 == r3) goto L_0x072f
            r0.insert(r3, r1)
        L_0x072f:
            r1 = 101(0x65, float:1.42E-43)
            r0.append(r1)
            int r5 = r5 - r3
            if (r5 < 0) goto L_0x073c
            r1 = 43
            r0.append(r1)
        L_0x073c:
            r0.append(r5)
            goto L_0x075c
        L_0x0740:
            if (r5 == r2) goto L_0x075c
            if (r5 <= 0) goto L_0x0748
            r0.insert(r5, r1)
            goto L_0x075c
        L_0x0748:
            r2 = 0
            r3 = 1
        L_0x074a:
            int r4 = 1 - r5
            if (r2 >= r4) goto L_0x0757
            r4 = 48
            r6 = 0
            r0.insert(r6, r4)
            int r2 = r2 + 1
            goto L_0x074a
        L_0x0757:
            r2 = 0
            r0.insert(r3, r1)
            goto L_0x075d
        L_0x075c:
            r2 = 0
        L_0x075d:
            boolean r1 = r21[r2]
            if (r1 == 0) goto L_0x078e
            int r1 = m4999i(r45)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x076f
            int r1 = m5000j(r45)
            if (r1 == 0) goto L_0x078e
        L_0x076f:
            int r1 = m4999i(r45)
            r2 = 2146435072(0x7ff00000, float:NaN)
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0788
            int r1 = m5000j(r45)
            if (r1 != 0) goto L_0x078e
            int r1 = m4999i(r45)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 != 0) goto L_0x078e
        L_0x0788:
            r1 = 45
            r2 = 0
            r0.insert(r2, r1)
        L_0x078e:
            return
        L_0x078f:
            r3 = r44
            r8 = r19
            r4 = 1048575(0xfffff, float:1.469367E-39)
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r5 = r5.multiply(r10)
            int r2 = r2 + 1
            r8 = r5
            goto L_0x0696
        */
        throw new UnsupportedOperationException("Method not decompiled: p122t4.C1815d.m4991a(java.lang.StringBuilder, int, int, double):void");
    }

    /* renamed from: b */
    public static int m4992b(int i) {
        int i2;
        if ((-65536 & i) == 0) {
            i <<= 16;
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((-16777216 & i) == 0) {
            i2 += 8;
            i <<= 8;
        }
        if ((-268435456 & i) == 0) {
            i2 += 4;
            i <<= 4;
        }
        if ((-1073741824 & i) == 0) {
            i2 += 2;
            i <<= 2;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            i2++;
            if ((i & EnumBarcodeFormat.BF_MICRO_QR) == 0) {
                return 32;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m4993c(int i) {
        int i2 = 0;
        if ((i & 7) == 0) {
            if ((65535 & i) == 0) {
                i >>>= 16;
                i2 = 16;
            }
            if ((i & 255) == 0) {
                i2 += 8;
                i >>>= 8;
            }
            if ((i & 15) == 0) {
                i2 += 4;
                i >>>= 4;
            }
            if ((i & 3) == 0) {
                i2 += 2;
                i >>>= 2;
            }
            if ((i & 1) == 0) {
                i2++;
                if (((i >>> 1) & 1) == 0) {
                    return 32;
                }
            }
            return i2;
        } else if ((i & 1) != 0) {
            return 0;
        } else {
            return (i & 2) != 0 ? 1 : 2;
        }
    }

    /* renamed from: d */
    public static BigInteger m4994d(BigInteger bigInteger, int i) {
        return bigInteger.multiply(BigInteger.valueOf(5).pow(i));
    }

    /* renamed from: e */
    public static boolean m4995e(StringBuilder sb) {
        int length = sb.length();
        while (length != 0) {
            length--;
            char charAt = sb.charAt(length);
            if (charAt != '9') {
                sb.setCharAt(length, (char) (charAt + 1));
                sb.setLength(length + 1);
                return false;
            }
        }
        sb.setLength(0);
        return true;
    }

    /* renamed from: f */
    public static double m4996f(double d, int i) {
        return Double.longBitsToDouble((Double.doubleToLongBits(d) & 4294967295L) | (((long) i) << 32));
    }

    /* renamed from: g */
    public static void m4997g(StringBuilder sb) {
        int i;
        int length = sb.length();
        while (true) {
            i = length - 1;
            if (length <= 0 || sb.charAt(i) != '0') {
                sb.setLength(i + 1);
            } else {
                length = i;
            }
        }
        sb.setLength(i + 1);
    }

    /* renamed from: h */
    public static void m4998h(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: i */
    public static int m4999i(double d) {
        return (int) (Double.doubleToLongBits(d) >> 32);
    }

    /* renamed from: j */
    public static int m5000j(double d) {
        return (int) Double.doubleToLongBits(d);
    }
}
