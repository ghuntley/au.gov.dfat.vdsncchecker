package p111s;

/* renamed from: s.b */
public class C1691b {
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d1, code lost:
        if (r3 == r6) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e7, code lost:
        if (r3 == r6) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01eb, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02be, code lost:
        if (r4[r16].f5159f.f5157d == r6) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0137, code lost:
        if (r5[r2].f5159f.f5157d == r6) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0706  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x070f  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0726  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4686a(p111s.C1696f r34, p099q.C1593e r35, java.util.ArrayList<p111s.C1695e> r36, int r37) {
        /*
            r0 = r34
            r10 = r35
            r11 = r36
            r12 = 2
            if (r37 != 0) goto L_0x0012
            int r1 = r0.f5260z0
            s.c[] r2 = r0.f5242C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.f5240A0
            s.c[] r2 = r0.f5241B0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0759
            r1 = r15[r9]
            boolean r2 = r1.f5153t
            r17 = 0
            r3 = 3
            r8 = 8
            r5 = 1
            if (r2 != 0) goto L_0x018d
            int r2 = r1.f5148o
            int r2 = r2 * r12
            s.e r6 = r1.f5134a
            r7 = r6
            r18 = 0
        L_0x0031:
            if (r18 != 0) goto L_0x0149
            int r13 = r1.f5142i
            int r13 = r13 + r5
            r1.f5142i = r13
            s.e[] r13 = r6.f5225n0
            int r4 = r1.f5148o
            r13[r4] = r17
            s.e[] r13 = r6.f5223m0
            r13[r4] = r17
            int r13 = r6.f5213h0
            if (r13 == r8) goto L_0x0115
            int r13 = r1.f5145l
            int r13 = r13 + r5
            r1.f5145l = r13
            int r4 = r6.mo5928k(r4)
            if (r4 == r3) goto L_0x0067
            int r4 = r1.f5146m
            int r13 = r1.f5148o
            if (r13 != 0) goto L_0x005c
            int r13 = r6.mo5935r()
            goto L_0x0064
        L_0x005c:
            if (r13 != r5) goto L_0x0063
            int r13 = r6.mo5929l()
            goto L_0x0064
        L_0x0063:
            r13 = 0
        L_0x0064:
            int r4 = r4 + r13
            r1.f5146m = r4
        L_0x0067:
            int r4 = r1.f5146m
            s.d[] r13 = r6.f5188Q
            r13 = r13[r2]
            int r13 = r13.mo5899d()
            int r13 = r13 + r4
            r1.f5146m = r13
            s.d[] r4 = r6.f5188Q
            int r20 = r2 + 1
            r4 = r4[r20]
            int r4 = r4.mo5899d()
            int r4 = r4 + r13
            r1.f5146m = r4
            int r4 = r1.f5147n
            s.d[] r13 = r6.f5188Q
            r13 = r13[r2]
            int r13 = r13.mo5899d()
            int r13 = r13 + r4
            r1.f5147n = r13
            s.d[] r4 = r6.f5188Q
            r4 = r4[r20]
            int r4 = r4.mo5899d()
            int r4 = r4 + r13
            r1.f5147n = r4
            s.e r4 = r1.f5135b
            if (r4 != 0) goto L_0x009f
            r1.f5135b = r6
        L_0x009f:
            r1.f5137d = r6
            int[] r4 = r6.f5191T
            int r13 = r1.f5148o
            r8 = r4[r13]
            if (r8 != r3) goto L_0x0115
            int[] r8 = r6.f5232s
            r21 = r8[r13]
            if (r21 == 0) goto L_0x00b7
            r5 = r8[r13]
            if (r5 == r3) goto L_0x00b7
            r5 = r8[r13]
            if (r5 != r12) goto L_0x0115
        L_0x00b7:
            int r5 = r1.f5143j
            r21 = 1
            int r5 = r5 + 1
            r1.f5143j = r5
            float[] r5 = r6.f5221l0
            r22 = r5[r13]
            r19 = 0
            int r23 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r23 <= 0) goto L_0x00d0
            float r12 = r1.f5144k
            r5 = r5[r13]
            float r12 = r12 + r5
            r1.f5144k = r12
        L_0x00d0:
            int r5 = r6.f5213h0
            r12 = 8
            if (r5 == r12) goto L_0x00e4
            r4 = r4[r13]
            if (r4 != r3) goto L_0x00e4
            r4 = r8[r13]
            if (r4 == 0) goto L_0x00e2
            r4 = r8[r13]
            if (r4 != r3) goto L_0x00e4
        L_0x00e2:
            r4 = 1
            goto L_0x00e5
        L_0x00e4:
            r4 = 0
        L_0x00e5:
            if (r4 == 0) goto L_0x0103
            r4 = 0
            int r5 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f0
            r4 = 1
            r1.f5150q = r4
            goto L_0x00f3
        L_0x00f0:
            r4 = 1
            r1.f5151r = r4
        L_0x00f3:
            java.util.ArrayList<s.e> r4 = r1.f5141h
            if (r4 != 0) goto L_0x00fe
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f5141h = r4
        L_0x00fe:
            java.util.ArrayList<s.e> r4 = r1.f5141h
            r4.add(r6)
        L_0x0103:
            s.e r4 = r1.f5139f
            if (r4 != 0) goto L_0x0109
            r1.f5139f = r6
        L_0x0109:
            s.e r4 = r1.f5140g
            if (r4 == 0) goto L_0x0113
            s.e[] r4 = r4.f5223m0
            int r5 = r1.f5148o
            r4[r5] = r6
        L_0x0113:
            r1.f5140g = r6
        L_0x0115:
            if (r7 == r6) goto L_0x011d
            s.e[] r4 = r7.f5225n0
            int r5 = r1.f5148o
            r4[r5] = r6
        L_0x011d:
            s.d[] r4 = r6.f5188Q
            int r5 = r2 + 1
            r4 = r4[r5]
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x0139
            s.e r4 = r4.f5157d
            s.d[] r5 = r4.f5188Q
            r7 = r5[r2]
            s.d r7 = r7.f5159f
            if (r7 == 0) goto L_0x0139
            r5 = r5[r2]
            s.d r5 = r5.f5159f
            s.e r5 = r5.f5157d
            if (r5 == r6) goto L_0x013b
        L_0x0139:
            r4 = r17
        L_0x013b:
            if (r4 == 0) goto L_0x013e
            goto L_0x0141
        L_0x013e:
            r4 = r6
            r18 = 1
        L_0x0141:
            r7 = r6
            r5 = 1
            r8 = 8
            r12 = 2
            r6 = r4
            goto L_0x0031
        L_0x0149:
            s.e r4 = r1.f5135b
            if (r4 == 0) goto L_0x015a
            int r5 = r1.f5146m
            s.d[] r4 = r4.f5188Q
            r4 = r4[r2]
            int r4 = r4.mo5899d()
            int r5 = r5 - r4
            r1.f5146m = r5
        L_0x015a:
            s.e r4 = r1.f5137d
            if (r4 == 0) goto L_0x016d
            int r5 = r1.f5146m
            s.d[] r4 = r4.f5188Q
            int r2 = r2 + 1
            r2 = r4[r2]
            int r2 = r2.mo5899d()
            int r5 = r5 - r2
            r1.f5146m = r5
        L_0x016d:
            r1.f5136c = r6
            int r2 = r1.f5148o
            if (r2 != 0) goto L_0x017a
            boolean r2 = r1.f5149p
            if (r2 == 0) goto L_0x017a
            r1.f5138e = r6
            goto L_0x017e
        L_0x017a:
            s.e r2 = r1.f5134a
            r1.f5138e = r2
        L_0x017e:
            boolean r2 = r1.f5151r
            if (r2 == 0) goto L_0x0188
            boolean r2 = r1.f5150q
            if (r2 == 0) goto L_0x0188
            r2 = 1
            goto L_0x0189
        L_0x0188:
            r2 = 0
        L_0x0189:
            r1.f5152s = r2
            r2 = 1
            goto L_0x018e
        L_0x018d:
            r2 = r5
        L_0x018e:
            r1.f5153t = r2
            if (r11 == 0) goto L_0x01a4
            s.e r2 = r1.f5134a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x019b
            goto L_0x01a4
        L_0x019b:
            r18 = r9
            r27 = r14
            r29 = r15
            r14 = r10
            goto L_0x074b
        L_0x01a4:
            s.e r12 = r1.f5134a
            s.e r13 = r1.f5136c
            s.e r8 = r1.f5135b
            s.e r7 = r1.f5137d
            s.e r2 = r1.f5138e
            float r4 = r1.f5144k
            int[] r5 = r0.f5191T
            r5 = r5[r37]
            r6 = 2
            if (r5 != r6) goto L_0x01b9
            r5 = 1
            goto L_0x01ba
        L_0x01b9:
            r5 = 0
        L_0x01ba:
            if (r37 != 0) goto L_0x01d4
            int r3 = r2.f5217j0
            r6 = 1
            if (r3 != 0) goto L_0x01c4
            r21 = 1
            goto L_0x01c6
        L_0x01c4:
            r21 = 0
        L_0x01c6:
            if (r3 != r6) goto L_0x01cc
            r22 = r6
            r6 = 2
            goto L_0x01cf
        L_0x01cc:
            r6 = 2
            r22 = 0
        L_0x01cf:
            r23 = r21
            if (r3 != r6) goto L_0x01eb
            goto L_0x01e9
        L_0x01d4:
            int r3 = r2.f5219k0
            r6 = 1
            if (r3 != 0) goto L_0x01dc
            r23 = 1
            goto L_0x01de
        L_0x01dc:
            r23 = 0
        L_0x01de:
            if (r3 != r6) goto L_0x01e4
            r6 = 2
            r22 = 1
            goto L_0x01e7
        L_0x01e4:
            r6 = 2
            r22 = 0
        L_0x01e7:
            if (r3 != r6) goto L_0x01eb
        L_0x01e9:
            r3 = 1
            goto L_0x01ec
        L_0x01eb:
            r3 = 0
        L_0x01ec:
            r25 = r4
            r6 = r12
            r24 = 0
        L_0x01f1:
            if (r24 != 0) goto L_0x02d4
            s.d[] r4 = r6.f5188Q
            r4 = r4[r16]
            if (r3 == 0) goto L_0x01fc
            r26 = 1
            goto L_0x01fe
        L_0x01fc:
            r26 = 4
        L_0x01fe:
            int r27 = r4.mo5899d()
            r28 = r9
            int[] r9 = r6.f5191T
            r9 = r9[r37]
            r11 = 3
            if (r9 != r11) goto L_0x0213
            int[] r9 = r6.f5232s
            r9 = r9[r37]
            if (r9 != 0) goto L_0x0213
            r9 = 1
            goto L_0x0214
        L_0x0213:
            r9 = 0
        L_0x0214:
            s.d r11 = r4.f5159f
            if (r11 == 0) goto L_0x0220
            if (r6 == r12) goto L_0x0220
            int r11 = r11.mo5899d()
            int r27 = r11 + r27
        L_0x0220:
            r11 = r27
            if (r3 == 0) goto L_0x022d
            if (r6 == r12) goto L_0x022d
            if (r6 == r8) goto L_0x022d
            r27 = r14
            r26 = 8
            goto L_0x022f
        L_0x022d:
            r27 = r14
        L_0x022f:
            s.d r14 = r4.f5159f
            if (r14 == 0) goto L_0x026d
            if (r6 != r8) goto L_0x0242
            r29 = r15
            q.j r15 = r4.f5162i
            q.j r14 = r14.f5162i
            r30 = r2
            r2 = 6
            r10.mo5721f(r15, r14, r11, r2)
            goto L_0x024f
        L_0x0242:
            r30 = r2
            r29 = r15
            q.j r2 = r4.f5162i
            q.j r14 = r14.f5162i
            r15 = 8
            r10.mo5721f(r2, r14, r11, r15)
        L_0x024f:
            if (r9 == 0) goto L_0x0255
            if (r3 != 0) goto L_0x0255
            r26 = 5
        L_0x0255:
            if (r6 != r8) goto L_0x0261
            if (r3 == 0) goto L_0x0261
            boolean[] r2 = r6.f5190S
            boolean r2 = r2[r37]
            if (r2 == 0) goto L_0x0261
            r2 = 5
            goto L_0x0263
        L_0x0261:
            r2 = r26
        L_0x0263:
            q.j r9 = r4.f5162i
            s.d r4 = r4.f5159f
            q.j r4 = r4.f5162i
            r10.mo5719d(r9, r4, r11, r2)
            goto L_0x0271
        L_0x026d:
            r30 = r2
            r29 = r15
        L_0x0271:
            if (r5 == 0) goto L_0x02a4
            int r2 = r6.f5213h0
            r4 = 8
            if (r2 == r4) goto L_0x0292
            int[] r2 = r6.f5191T
            r2 = r2[r37]
            r4 = 3
            if (r2 != r4) goto L_0x0292
            s.d[] r2 = r6.f5188Q
            int r4 = r16 + 1
            r4 = r2[r4]
            q.j r4 = r4.f5162i
            r2 = r2[r16]
            q.j r2 = r2.f5162i
            r9 = 5
            r11 = 0
            r10.mo5721f(r4, r2, r11, r9)
            goto L_0x0293
        L_0x0292:
            r11 = 0
        L_0x0293:
            s.d[] r2 = r6.f5188Q
            r2 = r2[r16]
            q.j r2 = r2.f5162i
            s.d[] r4 = r0.f5188Q
            r4 = r4[r16]
            q.j r4 = r4.f5162i
            r9 = 8
            r10.mo5721f(r2, r4, r11, r9)
        L_0x02a4:
            s.d[] r2 = r6.f5188Q
            int r4 = r16 + 1
            r2 = r2[r4]
            s.d r2 = r2.f5159f
            if (r2 == 0) goto L_0x02c0
            s.e r2 = r2.f5157d
            s.d[] r4 = r2.f5188Q
            r9 = r4[r16]
            s.d r9 = r9.f5159f
            if (r9 == 0) goto L_0x02c0
            r4 = r4[r16]
            s.d r4 = r4.f5159f
            s.e r4 = r4.f5157d
            if (r4 == r6) goto L_0x02c2
        L_0x02c0:
            r2 = r17
        L_0x02c2:
            if (r2 == 0) goto L_0x02c6
            r6 = r2
            goto L_0x02c8
        L_0x02c6:
            r24 = 1
        L_0x02c8:
            r11 = r36
            r14 = r27
            r9 = r28
            r15 = r29
            r2 = r30
            goto L_0x01f1
        L_0x02d4:
            r30 = r2
            r28 = r9
            r27 = r14
            r29 = r15
            if (r7 == 0) goto L_0x0340
            s.d[] r2 = r13.f5188Q
            int r4 = r16 + 1
            r2 = r2[r4]
            s.d r2 = r2.f5159f
            if (r2 == 0) goto L_0x0340
            s.d[] r2 = r7.f5188Q
            r2 = r2[r4]
            int[] r6 = r7.f5191T
            r6 = r6[r37]
            r9 = 3
            if (r6 != r9) goto L_0x02fb
            int[] r6 = r7.f5232s
            r6 = r6[r37]
            if (r6 != 0) goto L_0x02fb
            r6 = 1
            goto L_0x02fc
        L_0x02fb:
            r6 = 0
        L_0x02fc:
            if (r6 == 0) goto L_0x0314
            if (r3 != 0) goto L_0x0314
            s.d r6 = r2.f5159f
            s.e r9 = r6.f5157d
            if (r9 != r0) goto L_0x0314
            q.j r9 = r2.f5162i
            q.j r6 = r6.f5162i
            int r11 = r2.mo5899d()
            int r11 = -r11
            r14 = 5
            r10.mo5719d(r9, r6, r11, r14)
            goto L_0x032b
        L_0x0314:
            r14 = 5
            if (r3 == 0) goto L_0x032b
            s.d r6 = r2.f5159f
            s.e r9 = r6.f5157d
            if (r9 != r0) goto L_0x032b
            q.j r9 = r2.f5162i
            q.j r6 = r6.f5162i
            int r11 = r2.mo5899d()
            int r11 = -r11
            r15 = 4
            r10.mo5719d(r9, r6, r11, r15)
            goto L_0x032c
        L_0x032b:
            r15 = 4
        L_0x032c:
            q.j r6 = r2.f5162i
            s.d[] r9 = r13.f5188Q
            r4 = r9[r4]
            s.d r4 = r4.f5159f
            q.j r4 = r4.f5162i
            int r2 = r2.mo5899d()
            int r2 = -r2
            r9 = 6
            r10.mo5722g(r6, r4, r2, r9)
            goto L_0x0342
        L_0x0340:
            r14 = 5
            r15 = 4
        L_0x0342:
            if (r5 == 0) goto L_0x035d
            s.d[] r2 = r0.f5188Q
            int r4 = r16 + 1
            r2 = r2[r4]
            q.j r2 = r2.f5162i
            s.d[] r5 = r13.f5188Q
            r6 = r5[r4]
            q.j r6 = r6.f5162i
            r4 = r5[r4]
            int r4 = r4.mo5899d()
            r5 = 8
            r10.mo5721f(r2, r6, r4, r5)
        L_0x035d:
            java.util.ArrayList<s.e> r2 = r1.f5141h
            if (r2 == 0) goto L_0x047f
            int r4 = r2.size()
            r5 = 1
            if (r4 <= r5) goto L_0x047f
            boolean r6 = r1.f5150q
            if (r6 == 0) goto L_0x0374
            boolean r6 = r1.f5152s
            if (r6 != 0) goto L_0x0374
            int r6 = r1.f5143j
            float r6 = (float) r6
            goto L_0x0376
        L_0x0374:
            r6 = r25
        L_0x0376:
            r5 = r17
            r9 = 0
            r11 = 0
        L_0x037a:
            if (r11 >= r4) goto L_0x047f
            java.lang.Object r18 = r2.get(r11)
            r14 = r18
            s.e r14 = (p111s.C1695e) r14
            float[] r15 = r14.f5221l0
            r15 = r15[r37]
            r18 = 0
            int r24 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r24 >= 0) goto L_0x03a6
            boolean r15 = r1.f5152s
            if (r15 == 0) goto L_0x03a4
            s.d[] r0 = r14.f5188Q
            int r14 = r16 + 1
            r14 = r0[r14]
            q.j r14 = r14.f5162i
            r0 = r0[r16]
            q.j r0 = r0.f5162i
            r18 = r4
            r15 = r14
            r4 = 0
            r14 = 4
            goto L_0x03be
        L_0x03a4:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x03a6:
            r18 = 0
            int r24 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x03cb
            s.d[] r0 = r14.f5188Q
            int r14 = r16 + 1
            r14 = r0[r14]
            q.j r14 = r14.f5162i
            r0 = r0[r16]
            q.j r0 = r0.f5162i
            r18 = r4
            r15 = r14
            r4 = 0
            r14 = 8
        L_0x03be:
            r10.mo5719d(r15, r0, r4, r14)
            r32 = r1
            r31 = r2
            r24 = r6
            r19 = 0
            goto L_0x046f
        L_0x03cb:
            r18 = r4
            r4 = 0
            if (r5 == 0) goto L_0x0462
            s.d[] r5 = r5.f5188Q
            r4 = r5[r16]
            q.j r4 = r4.f5162i
            int r25 = r16 + 1
            r5 = r5[r25]
            q.j r5 = r5.f5162i
            s.d[] r0 = r14.f5188Q
            r31 = r2
            r2 = r0[r16]
            q.j r2 = r2.f5162i
            r0 = r0[r25]
            q.j r0 = r0.f5162i
            r25 = r14
            q.c r14 = r35.mo5728m()
            r32 = r1
            r1 = 0
            r14.f4932b = r1
            int r19 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r19 == 0) goto L_0x0443
            int r19 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r19 != 0) goto L_0x03fe
            goto L_0x0443
        L_0x03fe:
            r19 = 0
            int r33 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r33 != 0) goto L_0x0411
            q.c$a r0 = r14.f4934d
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo5693i(r4, r2)
            q.c$a r0 = r14.f4934d
            r0.mo5693i(r5, r1)
            goto L_0x0421
        L_0x0411:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r24 != 0) goto L_0x0424
            q.c$a r4 = r14.f4934d
            r4.mo5693i(r2, r1)
            q.c$a r1 = r14.f4934d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo5693i(r0, r2)
        L_0x0421:
            r24 = r6
            goto L_0x045e
        L_0x0424:
            float r9 = r9 / r6
            float r24 = r15 / r6
            float r9 = r9 / r24
            r24 = r6
            q.c$a r6 = r14.f4934d
            r6.mo5693i(r4, r1)
            q.c$a r1 = r14.f4934d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo5693i(r5, r6)
            q.c$a r1 = r14.f4934d
            r1.mo5693i(r0, r9)
            q.c$a r0 = r14.f4934d
            float r1 = -r9
            r0.mo5693i(r2, r1)
            goto L_0x045e
        L_0x0443:
            r24 = r6
            r19 = 0
            r6 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            q.c$a r9 = r14.f4934d
            r9.mo5693i(r4, r1)
            q.c$a r4 = r14.f4934d
            r4.mo5693i(r5, r6)
            q.c$a r4 = r14.f4934d
            r4.mo5693i(r0, r1)
            q.c$a r0 = r14.f4934d
            r0.mo5693i(r2, r6)
        L_0x045e:
            r10.mo5718c(r14)
            goto L_0x046c
        L_0x0462:
            r32 = r1
            r31 = r2
            r24 = r6
            r25 = r14
            r19 = 0
        L_0x046c:
            r9 = r15
            r5 = r25
        L_0x046f:
            int r11 = r11 + 1
            r4 = r18
            r6 = r24
            r2 = r31
            r1 = r32
            r14 = 5
            r15 = 4
            r0 = r34
            goto L_0x037a
        L_0x047f:
            r32 = r1
            if (r8 == 0) goto L_0x04e5
            if (r8 == r7) goto L_0x0487
            if (r3 == 0) goto L_0x04e5
        L_0x0487:
            s.d[] r0 = r12.f5188Q
            r0 = r0[r16]
            s.d[] r1 = r13.f5188Q
            int r2 = r16 + 1
            r1 = r1[r2]
            s.d r0 = r0.f5159f
            if (r0 == 0) goto L_0x0499
            q.j r0 = r0.f5162i
            r3 = r0
            goto L_0x049b
        L_0x0499:
            r3 = r17
        L_0x049b:
            s.d r0 = r1.f5159f
            if (r0 == 0) goto L_0x04a3
            q.j r0 = r0.f5162i
            r6 = r0
            goto L_0x04a5
        L_0x04a3:
            r6 = r17
        L_0x04a5:
            s.d[] r0 = r8.f5188Q
            r0 = r0[r16]
            if (r7 == 0) goto L_0x04af
            s.d[] r1 = r7.f5188Q
            r1 = r1[r2]
        L_0x04af:
            if (r3 == 0) goto L_0x04db
            if (r6 == 0) goto L_0x04db
            r2 = r30
            if (r37 != 0) goto L_0x04ba
            float r2 = r2.f5207e0
            goto L_0x04bc
        L_0x04ba:
            float r2 = r2.f5209f0
        L_0x04bc:
            r5 = r2
            int r4 = r0.mo5899d()
            int r9 = r1.mo5899d()
            q.j r2 = r0.f5162i
            q.j r0 = r1.f5162i
            r11 = 7
            r1 = r35
            r14 = 0
            r15 = 2
            r12 = r7
            r7 = r0
            r0 = r8
            r8 = r9
            r18 = r28
            r9 = r11
            r1.mo5717b(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = r12
            goto L_0x05d2
        L_0x04db:
            r12 = r7
            r0 = r8
            r18 = r28
            r14 = 0
            r15 = 2
            r14 = r10
            r11 = r12
            goto L_0x06eb
        L_0x04e5:
            r11 = r7
            r0 = r8
            r18 = r28
            r14 = 0
            r15 = 2
            if (r23 == 0) goto L_0x05d6
            if (r0 == 0) goto L_0x05d6
            r1 = r32
            int r2 = r1.f5143j
            if (r2 <= 0) goto L_0x04fc
            int r1 = r1.f5142i
            if (r1 != r2) goto L_0x04fc
            r21 = 1
            goto L_0x04fe
        L_0x04fc:
            r21 = r14
        L_0x04fe:
            r8 = r0
            r9 = r8
        L_0x0500:
            if (r9 == 0) goto L_0x05d2
            s.e[] r1 = r9.f5225n0
            r1 = r1[r37]
            r7 = r1
        L_0x0507:
            if (r7 == 0) goto L_0x0514
            int r1 = r7.f5213h0
            r6 = 8
            if (r1 != r6) goto L_0x0516
            s.e[] r1 = r7.f5225n0
            r7 = r1[r37]
            goto L_0x0507
        L_0x0514:
            r6 = 8
        L_0x0516:
            if (r7 != 0) goto L_0x0520
            if (r9 != r11) goto L_0x051b
            goto L_0x0520
        L_0x051b:
            r14 = r7
            r15 = r8
            r10 = r9
            goto L_0x05c2
        L_0x0520:
            s.d[] r1 = r9.f5188Q
            r1 = r1[r16]
            q.j r2 = r1.f5162i
            s.d r3 = r1.f5159f
            if (r3 == 0) goto L_0x052d
            q.j r3 = r3.f5162i
            goto L_0x052f
        L_0x052d:
            r3 = r17
        L_0x052f:
            if (r8 == r9) goto L_0x0538
            s.d[] r3 = r8.f5188Q
            int r4 = r16 + 1
            r3 = r3[r4]
            goto L_0x0546
        L_0x0538:
            if (r9 != r0) goto L_0x054b
            s.d[] r3 = r12.f5188Q
            r4 = r3[r16]
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x0549
            r3 = r3[r16]
            s.d r3 = r3.f5159f
        L_0x0546:
            q.j r3 = r3.f5162i
            goto L_0x054b
        L_0x0549:
            r3 = r17
        L_0x054b:
            int r1 = r1.mo5899d()
            s.d[] r4 = r9.f5188Q
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.mo5899d()
            if (r7 == 0) goto L_0x0560
            s.d[] r6 = r7.f5188Q
            r6 = r6[r16]
            goto L_0x0568
        L_0x0560:
            s.d[] r6 = r13.f5188Q
            r6 = r6[r5]
            s.d r6 = r6.f5159f
            if (r6 == 0) goto L_0x056b
        L_0x0568:
            q.j r14 = r6.f5162i
            goto L_0x056d
        L_0x056b:
            r14 = r17
        L_0x056d:
            s.d[] r15 = r9.f5188Q
            r15 = r15[r5]
            q.j r15 = r15.f5162i
            if (r6 == 0) goto L_0x057a
            int r6 = r6.mo5899d()
            int r4 = r4 + r6
        L_0x057a:
            s.d[] r6 = r8.f5188Q
            r6 = r6[r5]
            int r6 = r6.mo5899d()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x051b
            if (r3 == 0) goto L_0x051b
            if (r14 == 0) goto L_0x051b
            if (r15 == 0) goto L_0x051b
            if (r9 != r0) goto L_0x0596
            s.d[] r1 = r0.f5188Q
            r1 = r1[r16]
            int r1 = r1.mo5899d()
            r6 = r1
        L_0x0596:
            if (r9 != r11) goto L_0x05a3
            s.d[] r1 = r11.f5188Q
            r1 = r1[r5]
            int r1 = r1.mo5899d()
            r19 = r1
            goto L_0x05a5
        L_0x05a3:
            r19 = r4
        L_0x05a5:
            if (r21 == 0) goto L_0x05aa
            r24 = 8
            goto L_0x05ac
        L_0x05aa:
            r24 = 5
        L_0x05ac:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r35
            r10 = 5
            r4 = r6
            r20 = 8
            r6 = r14
            r14 = r7
            r7 = r15
            r15 = r8
            r10 = r20
            r8 = r19
            r10 = r9
            r9 = r24
            r1.mo5717b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x05c2:
            int r1 = r10.f5213h0
            r2 = 8
            if (r1 == r2) goto L_0x05ca
            r8 = r10
            goto L_0x05cb
        L_0x05ca:
            r8 = r15
        L_0x05cb:
            r10 = r35
            r9 = r14
            r14 = 0
            r15 = 2
            goto L_0x0500
        L_0x05d2:
            r14 = r35
            goto L_0x06eb
        L_0x05d6:
            r1 = r32
            if (r22 == 0) goto L_0x05d2
            if (r0 == 0) goto L_0x05d2
            int r2 = r1.f5143j
            if (r2 <= 0) goto L_0x05e7
            int r1 = r1.f5142i
            if (r1 != r2) goto L_0x05e7
            r21 = 1
            goto L_0x05e9
        L_0x05e7:
            r21 = 0
        L_0x05e9:
            r10 = r0
            r14 = r10
        L_0x05eb:
            if (r10 == 0) goto L_0x0687
            s.e[] r1 = r10.f5225n0
            r1 = r1[r37]
        L_0x05f1:
            if (r1 == 0) goto L_0x05fe
            int r2 = r1.f5213h0
            r3 = 8
            if (r2 != r3) goto L_0x05fe
            s.e[] r1 = r1.f5225n0
            r1 = r1[r37]
            goto L_0x05f1
        L_0x05fe:
            if (r10 == r0) goto L_0x067a
            if (r10 == r11) goto L_0x067a
            if (r1 == 0) goto L_0x067a
            if (r1 != r11) goto L_0x0609
            r15 = r17
            goto L_0x060a
        L_0x0609:
            r15 = r1
        L_0x060a:
            s.d[] r1 = r10.f5188Q
            r1 = r1[r16]
            q.j r2 = r1.f5162i
            s.d[] r3 = r14.f5188Q
            int r4 = r16 + 1
            r3 = r3[r4]
            q.j r3 = r3.f5162i
            int r1 = r1.mo5899d()
            s.d[] r5 = r10.f5188Q
            r5 = r5[r4]
            int r5 = r5.mo5899d()
            if (r15 == 0) goto L_0x0634
            s.d[] r6 = r15.f5188Q
            r6 = r6[r16]
            q.j r7 = r6.f5162i
            s.d r8 = r6.f5159f
            if (r8 == 0) goto L_0x0631
            goto L_0x0643
        L_0x0631:
            r8 = r17
            goto L_0x0645
        L_0x0634:
            s.d[] r6 = r11.f5188Q
            r6 = r6[r16]
            if (r6 == 0) goto L_0x063d
            q.j r7 = r6.f5162i
            goto L_0x063f
        L_0x063d:
            r7 = r17
        L_0x063f:
            s.d[] r8 = r10.f5188Q
            r8 = r8[r4]
        L_0x0643:
            q.j r8 = r8.f5162i
        L_0x0645:
            if (r6 == 0) goto L_0x064e
            int r6 = r6.mo5899d()
            int r6 = r6 + r5
            r9 = r6
            goto L_0x064f
        L_0x064e:
            r9 = r5
        L_0x064f:
            s.d[] r5 = r14.f5188Q
            r4 = r5[r4]
            int r4 = r4.mo5899d()
            int r4 = r4 + r1
            if (r21 == 0) goto L_0x065d
            r19 = 8
            goto L_0x065f
        L_0x065d:
            r19 = 4
        L_0x065f:
            if (r2 == 0) goto L_0x0676
            if (r3 == 0) goto L_0x0676
            if (r7 == 0) goto L_0x0676
            if (r8 == 0) goto L_0x0676
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r35
            r24 = 4
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r19
            r1.mo5717b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0678
        L_0x0676:
            r24 = 4
        L_0x0678:
            r8 = r15
            goto L_0x067d
        L_0x067a:
            r24 = 4
            r8 = r1
        L_0x067d:
            int r1 = r10.f5213h0
            r2 = 8
            if (r1 == r2) goto L_0x0684
            r14 = r10
        L_0x0684:
            r10 = r8
            goto L_0x05eb
        L_0x0687:
            s.d[] r1 = r0.f5188Q
            r1 = r1[r16]
            s.d[] r2 = r12.f5188Q
            r2 = r2[r16]
            s.d r2 = r2.f5159f
            s.d[] r3 = r11.f5188Q
            int r4 = r16 + 1
            r10 = r3[r4]
            s.d[] r3 = r13.f5188Q
            r3 = r3[r4]
            s.d r12 = r3.f5159f
            if (r2 == 0) goto L_0x06d8
            if (r0 == r11) goto L_0x06b0
            q.j r3 = r1.f5162i
            q.j r2 = r2.f5162i
            int r1 = r1.mo5899d()
            r14 = r35
            r15 = 5
            r14.mo5719d(r3, r2, r1, r15)
            goto L_0x06db
        L_0x06b0:
            r14 = r35
            r15 = 5
            if (r12 == 0) goto L_0x06db
            q.j r3 = r1.f5162i
            q.j r4 = r2.f5162i
            int r5 = r1.mo5899d()
            r6 = 1056964608(0x3f000000, float:0.5)
            q.j r7 = r10.f5162i
            q.j r8 = r12.f5162i
            int r9 = r10.mo5899d()
            r19 = 5
            r1 = r35
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r19
            r1.mo5717b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06db
        L_0x06d8:
            r14 = r35
            r15 = 5
        L_0x06db:
            if (r12 == 0) goto L_0x06eb
            if (r0 == r11) goto L_0x06eb
            q.j r1 = r10.f5162i
            q.j r2 = r12.f5162i
            int r3 = r10.mo5899d()
            int r3 = -r3
            r14.mo5719d(r1, r2, r3, r15)
        L_0x06eb:
            if (r23 != 0) goto L_0x06ef
            if (r22 == 0) goto L_0x074b
        L_0x06ef:
            if (r0 == 0) goto L_0x074b
            if (r0 == r11) goto L_0x074b
            s.d[] r1 = r0.f5188Q
            r2 = r1[r16]
            if (r11 != 0) goto L_0x06fb
            r8 = r0
            goto L_0x06fc
        L_0x06fb:
            r8 = r11
        L_0x06fc:
            s.d[] r3 = r8.f5188Q
            int r4 = r16 + 1
            r3 = r3[r4]
            s.d r5 = r2.f5159f
            if (r5 == 0) goto L_0x0709
            q.j r5 = r5.f5162i
            goto L_0x070b
        L_0x0709:
            r5 = r17
        L_0x070b:
            s.d r6 = r3.f5159f
            if (r6 == 0) goto L_0x0712
            q.j r6 = r6.f5162i
            goto L_0x0714
        L_0x0712:
            r6 = r17
        L_0x0714:
            if (r13 == r8) goto L_0x0724
            s.d[] r6 = r13.f5188Q
            r6 = r6[r4]
            s.d r6 = r6.f5159f
            if (r6 == 0) goto L_0x0722
            q.j r6 = r6.f5162i
            r17 = r6
        L_0x0722:
            r6 = r17
        L_0x0724:
            if (r0 != r8) goto L_0x072a
            r2 = r1[r16]
            r3 = r1[r4]
        L_0x072a:
            if (r5 == 0) goto L_0x074b
            if (r6 == 0) goto L_0x074b
            r0 = 1056964608(0x3f000000, float:0.5)
            int r7 = r2.mo5899d()
            s.d[] r1 = r8.f5188Q
            r1 = r1[r4]
            int r8 = r1.mo5899d()
            q.j r2 = r2.f5162i
            q.j r9 = r3.f5162i
            r10 = 5
            r1 = r35
            r3 = r5
            r4 = r7
            r5 = r0
            r7 = r9
            r9 = r10
            r1.mo5717b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x074b:
            int r9 = r18 + 1
            r0 = r34
            r11 = r36
            r10 = r14
            r14 = r27
            r15 = r29
            r12 = 2
            goto L_0x001b
        L_0x0759:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p111s.C1691b.m4686a(s.f, q.e, java.util.ArrayList, int):void");
    }
}
