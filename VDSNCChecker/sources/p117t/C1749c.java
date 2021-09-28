package p117t;

import java.util.ArrayList;
import java.util.Iterator;
import p111s.C1695e;

/* renamed from: t.c */
public class C1749c extends C1765q {

    /* renamed from: k */
    public ArrayList<C1765q> f5351k = new ArrayList<>();

    /* renamed from: l */
    public int f5352l;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1749c(p111s.C1695e r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f5351k = r4
            r3.f5403f = r5
            s.e r4 = r3.f5399b
        L_0x000e:
            int r5 = r3.f5403f
            s.e r5 = r4.mo5932o(r5)
            if (r5 == 0) goto L_0x0018
            r4 = r5
            goto L_0x000e
        L_0x0018:
            r3.f5399b = r4
            java.util.ArrayList<t.q> r5 = r3.f5351k
            int r0 = r3.f5403f
            r1 = 1
            if (r0 != 0) goto L_0x0023
            r0 = r3
            goto L_0x003a
        L_0x0023:
            if (r0 != r1) goto L_0x0027
            r0 = r3
            goto L_0x003f
        L_0x0027:
            r0 = r3
        L_0x0028:
            r2 = 0
        L_0x0029:
            r5.add(r2)
            int r5 = r0.f5403f
            s.e r4 = r4.mo5931n(r5)
            if (r4 == 0) goto L_0x0042
            java.util.ArrayList<t.q> r5 = r0.f5351k
            int r2 = r0.f5403f
            if (r2 != 0) goto L_0x003d
        L_0x003a:
            t.m r2 = r4.f5204d
            goto L_0x0029
        L_0x003d:
            if (r2 != r1) goto L_0x0028
        L_0x003f:
            t.o r2 = r4.f5206e
            goto L_0x0029
        L_0x0042:
            java.util.ArrayList<t.q> r4 = r0.f5351k
            java.util.Iterator r4 = r4.iterator()
        L_0x0048:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r4.next()
            t.q r5 = (p117t.C1765q) r5
            int r2 = r0.f5403f
            if (r2 != 0) goto L_0x005d
            s.e r5 = r5.f5399b
            r5.f5200b = r0
            goto L_0x0048
        L_0x005d:
            if (r2 != r1) goto L_0x0048
            s.e r5 = r5.f5399b
            r5.f5202c = r0
            goto L_0x0048
        L_0x0064:
            int r4 = r0.f5403f
            if (r4 != 0) goto L_0x0074
            s.e r4 = r0.f5399b
            s.e r4 = r4.f5192U
            s.f r4 = (p111s.C1696f) r4
            boolean r4 = r4.f5256v0
            if (r4 == 0) goto L_0x0074
            r4 = r1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0090
            java.util.ArrayList<t.q> r4 = r0.f5351k
            int r4 = r4.size()
            if (r4 <= r1) goto L_0x0090
            java.util.ArrayList<t.q> r4 = r0.f5351k
            int r5 = r4.size()
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)
            t.q r4 = (p117t.C1765q) r4
            s.e r4 = r4.f5399b
            r0.f5399b = r4
        L_0x0090:
            int r4 = r0.f5403f
            if (r4 != 0) goto L_0x0099
            s.e r4 = r0.f5399b
            int r4 = r4.f5217j0
            goto L_0x009d
        L_0x0099:
            s.e r4 = r0.f5399b
            int r4 = r4.f5219k0
        L_0x009d:
            r0.f5352l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1749c.<init>(s.e, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6011a(p117t.C1750d r26) {
        /*
            r25 = this;
            r0 = r25
            t.g r1 = r0.f5405h
            boolean r2 = r1.f5370j
            if (r2 == 0) goto L_0x03bb
            t.g r2 = r0.f5406i
            boolean r3 = r2.f5370j
            if (r3 != 0) goto L_0x0010
            goto L_0x03bb
        L_0x0010:
            s.e r3 = r0.f5399b
            s.e r3 = r3.f5192U
            boolean r4 = r3 instanceof p111s.C1696f
            if (r4 == 0) goto L_0x001d
            s.f r3 = (p111s.C1696f) r3
            boolean r3 = r3.f5256v0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f5367g
            int r1 = r1.f5367g
            int r2 = r2 - r1
            java.util.ArrayList<t.q> r1 = r0.f5351k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<t.q> r8 = r0.f5351k
            java.lang.Object r8 = r8.get(r4)
            t.q r8 = (p117t.C1765q) r8
            s.e r8 = r8.f5399b
            int r8 = r8.f5213h0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = r6
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<t.q> r10 = r0.f5351k
            java.lang.Object r10 = r10.get(r9)
            t.q r10 = (p117t.C1765q) r10
            s.e r10 = r10.f5399b
            int r10 = r10.f5213h0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            r13 = 3
            if (r9 >= r11) goto L_0x00f8
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0065:
            if (r14 >= r1) goto L_0x00e8
            java.util.ArrayList<t.q> r5 = r0.f5351k
            java.lang.Object r5 = r5.get(r14)
            t.q r5 = (p117t.C1765q) r5
            s.e r11 = r5.f5399b
            int r10 = r11.f5213h0
            if (r10 != r7) goto L_0x0077
            goto L_0x00e0
        L_0x0077:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0082
            if (r14 < r4) goto L_0x0082
            t.g r10 = r5.f5405h
            int r10 = r10.f5366f
            int r15 = r15 + r10
        L_0x0082:
            t.h r10 = r5.f5402e
            int r7 = r10.f5367g
            int r12 = r5.f5401d
            if (r12 == r13) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            if (r12 == 0) goto L_0x00ab
            int r10 = r0.f5403f
            if (r10 != 0) goto L_0x009c
            t.m r13 = r11.f5204d
            t.h r13 = r13.f5402e
            boolean r13 = r13.f5370j
            if (r13 != 0) goto L_0x009c
            return
        L_0x009c:
            r13 = 1
            if (r10 != r13) goto L_0x00a8
            t.o r10 = r11.f5206e
            t.h r10 = r10.f5402e
            boolean r10 = r10.f5370j
            if (r10 != 0) goto L_0x00a8
            return
        L_0x00a8:
            r20 = r7
            goto L_0x00c1
        L_0x00ab:
            r20 = r7
            r13 = 1
            int r7 = r5.f5398a
            if (r7 != r13) goto L_0x00b9
            if (r9 != 0) goto L_0x00b9
            int r7 = r10.f5382m
            int r16 = r16 + 1
            goto L_0x00bf
        L_0x00b9:
            boolean r7 = r10.f5370j
            if (r7 == 0) goto L_0x00c1
            r7 = r20
        L_0x00bf:
            r12 = 1
            goto L_0x00c3
        L_0x00c1:
            r7 = r20
        L_0x00c3:
            if (r12 != 0) goto L_0x00d5
            int r16 = r16 + 1
            float[] r7 = r11.f5221l0
            int r10 = r0.f5403f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d6
            float r18 = r18 + r7
            goto L_0x00d6
        L_0x00d5:
            int r15 = r15 + r7
        L_0x00d6:
            if (r14 >= r8) goto L_0x00e0
            if (r14 >= r6) goto L_0x00e0
            t.g r5 = r5.f5406i
            int r5 = r5.f5366f
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e0:
            int r14 = r14 + 1
            r7 = 8
            r11 = 2
            r13 = 3
            goto L_0x0065
        L_0x00e8:
            if (r15 < r2) goto L_0x00f3
            if (r16 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f3:
            r5 = r16
            r7 = r17
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r7 = 0
            r15 = 0
            r18 = 0
        L_0x00fd:
            t.g r9 = r0.f5405h
            int r9 = r9.f5367g
            if (r3 == 0) goto L_0x0107
            t.g r9 = r0.f5406i
            int r9 = r9.f5367g
        L_0x0107:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x0118
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = r15 - r2
            float r12 = (float) r12
            float r12 = r12 / r11
            float r12 = r12 + r10
            int r11 = (int) r12
            if (r3 == 0) goto L_0x0117
            int r9 = r9 + r11
            goto L_0x0118
        L_0x0117:
            int r9 = r9 - r11
        L_0x0118:
            if (r5 <= 0) goto L_0x01f8
            int r11 = r2 - r15
            float r11 = (float) r11
            float r12 = (float) r5
            float r12 = r11 / r12
            float r12 = r12 + r10
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L_0x0124:
            if (r13 >= r1) goto L_0x01ac
            java.util.ArrayList<t.q> r10 = r0.f5351k
            java.lang.Object r10 = r10.get(r13)
            t.q r10 = (p117t.C1765q) r10
            r17 = r12
            s.e r12 = r10.f5399b
            r20 = r15
            int r15 = r12.f5213h0
            r21 = r9
            r9 = 8
            if (r15 != r9) goto L_0x013d
            goto L_0x0194
        L_0x013d:
            int r9 = r10.f5401d
            r15 = 3
            if (r9 != r15) goto L_0x0194
            t.h r9 = r10.f5402e
            boolean r15 = r9.f5370j
            if (r15 != 0) goto L_0x0194
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x015d
            float[] r15 = r12.f5221l0
            r22 = r3
            int r3 = r0.f5403f
            r3 = r15[r3]
            float r3 = r3 * r11
            float r3 = r3 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r15
            int r3 = (int) r3
            goto L_0x0161
        L_0x015d:
            r22 = r3
            r3 = r17
        L_0x0161:
            int r15 = r0.f5403f
            if (r15 != 0) goto L_0x016a
            int r15 = r12.f5234u
            int r12 = r12.f5233t
            goto L_0x016e
        L_0x016a:
            int r15 = r12.f5237x
            int r12 = r12.f5236w
        L_0x016e:
            r23 = r11
            int r11 = r10.f5398a
            r24 = r7
            r7 = 1
            if (r11 != r7) goto L_0x017e
            int r7 = r9.f5382m
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x017f
        L_0x017e:
            r7 = r3
        L_0x017f:
            int r7 = java.lang.Math.max(r12, r7)
            if (r15 <= 0) goto L_0x0189
            int r7 = java.lang.Math.min(r15, r7)
        L_0x0189:
            if (r7 == r3) goto L_0x018e
            int r14 = r14 + 1
            r3 = r7
        L_0x018e:
            t.h r7 = r10.f5402e
            r7.mo6028c(r3)
            goto L_0x019a
        L_0x0194:
            r22 = r3
            r24 = r7
            r23 = r11
        L_0x019a:
            int r13 = r13 + 1
            r12 = r17
            r15 = r20
            r9 = r21
            r3 = r22
            r11 = r23
            r7 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0124
        L_0x01ac:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            if (r14 <= 0) goto L_0x01e9
            int r5 = r5 - r14
            r3 = 0
            r7 = 0
        L_0x01b9:
            if (r3 >= r1) goto L_0x01e7
            java.util.ArrayList<t.q> r9 = r0.f5351k
            java.lang.Object r9 = r9.get(r3)
            t.q r9 = (p117t.C1765q) r9
            s.e r10 = r9.f5399b
            int r10 = r10.f5213h0
            r11 = 8
            if (r10 != r11) goto L_0x01cc
            goto L_0x01e4
        L_0x01cc:
            if (r3 <= 0) goto L_0x01d5
            if (r3 < r4) goto L_0x01d5
            t.g r10 = r9.f5405h
            int r10 = r10.f5366f
            int r7 = r7 + r10
        L_0x01d5:
            t.h r10 = r9.f5402e
            int r10 = r10.f5367g
            int r7 = r7 + r10
            if (r3 >= r8) goto L_0x01e4
            if (r3 >= r6) goto L_0x01e4
            t.g r9 = r9.f5406i
            int r9 = r9.f5366f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x01e4:
            int r3 = r3 + 1
            goto L_0x01b9
        L_0x01e7:
            r15 = r7
            goto L_0x01eb
        L_0x01e9:
            r15 = r20
        L_0x01eb:
            int r3 = r0.f5352l
            r7 = 2
            if (r3 != r7) goto L_0x01f6
            if (r14 != 0) goto L_0x01f6
            r3 = 0
            r0.f5352l = r3
            goto L_0x0202
        L_0x01f6:
            r3 = 0
            goto L_0x0202
        L_0x01f8:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            r3 = 0
            r7 = 2
        L_0x0202:
            if (r15 <= r2) goto L_0x0206
            r0.f5352l = r7
        L_0x0206:
            if (r24 <= 0) goto L_0x020e
            if (r5 != 0) goto L_0x020e
            if (r4 != r6) goto L_0x020e
            r0.f5352l = r7
        L_0x020e:
            int r7 = r0.f5352l
            r9 = 1
            r10 = r24
            if (r7 != r9) goto L_0x029f
            if (r10 <= r9) goto L_0x021c
            int r2 = r2 - r15
            int r7 = r10 + -1
            int r2 = r2 / r7
            goto L_0x0223
        L_0x021c:
            if (r10 != r9) goto L_0x0222
            int r2 = r2 - r15
            r7 = 2
            int r2 = r2 / r7
            goto L_0x0223
        L_0x0222:
            r2 = r3
        L_0x0223:
            if (r5 <= 0) goto L_0x0226
            r2 = r3
        L_0x0226:
            r5 = r3
            r9 = r21
        L_0x0229:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x0232
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0233
        L_0x0232:
            r3 = r5
        L_0x0233:
            java.util.ArrayList<t.q> r7 = r0.f5351k
            java.lang.Object r3 = r7.get(r3)
            t.q r3 = (p117t.C1765q) r3
            s.e r7 = r3.f5399b
            int r7 = r7.f5213h0
            r10 = 8
            if (r7 != r10) goto L_0x024e
            t.g r7 = r3.f5405h
            r7.mo6028c(r9)
            t.g r3 = r3.f5406i
            r3.mo6028c(r9)
            goto L_0x029c
        L_0x024e:
            if (r5 <= 0) goto L_0x0255
            if (r22 == 0) goto L_0x0254
            int r9 = r9 - r2
            goto L_0x0255
        L_0x0254:
            int r9 = r9 + r2
        L_0x0255:
            if (r5 <= 0) goto L_0x0262
            if (r5 < r4) goto L_0x0262
            t.g r7 = r3.f5405h
            int r7 = r7.f5366f
            if (r22 == 0) goto L_0x0261
            int r9 = r9 - r7
            goto L_0x0262
        L_0x0261:
            int r9 = r9 + r7
        L_0x0262:
            if (r22 == 0) goto L_0x0267
            t.g r7 = r3.f5406i
            goto L_0x0269
        L_0x0267:
            t.g r7 = r3.f5405h
        L_0x0269:
            r7.mo6028c(r9)
            t.h r7 = r3.f5402e
            int r10 = r7.f5367g
            int r11 = r3.f5401d
            r12 = 3
            if (r11 != r12) goto L_0x027c
            int r11 = r3.f5398a
            r12 = 1
            if (r11 != r12) goto L_0x027c
            int r10 = r7.f5382m
        L_0x027c:
            if (r22 == 0) goto L_0x0280
            int r9 = r9 - r10
            goto L_0x0281
        L_0x0280:
            int r9 = r9 + r10
        L_0x0281:
            if (r22 == 0) goto L_0x0286
            t.g r7 = r3.f5405h
            goto L_0x0288
        L_0x0286:
            t.g r7 = r3.f5406i
        L_0x0288:
            r7.mo6028c(r9)
            r7 = 1
            r3.f5404g = r7
            if (r5 >= r8) goto L_0x029c
            if (r5 >= r6) goto L_0x029c
            t.g r3 = r3.f5406i
            int r3 = r3.f5366f
            int r3 = -r3
            if (r22 == 0) goto L_0x029b
            int r9 = r9 - r3
            goto L_0x029c
        L_0x029b:
            int r9 = r9 + r3
        L_0x029c:
            int r5 = r5 + 1
            goto L_0x0229
        L_0x029f:
            if (r7 != 0) goto L_0x0321
            int r2 = r2 - r15
            r7 = 1
            int r9 = r10 + 1
            int r2 = r2 / r9
            if (r5 <= 0) goto L_0x02a9
            r2 = r3
        L_0x02a9:
            r5 = r3
            r9 = r21
        L_0x02ac:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x02b5
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02b6
        L_0x02b5:
            r3 = r5
        L_0x02b6:
            java.util.ArrayList<t.q> r7 = r0.f5351k
            java.lang.Object r3 = r7.get(r3)
            t.q r3 = (p117t.C1765q) r3
            s.e r7 = r3.f5399b
            int r7 = r7.f5213h0
            r10 = 8
            if (r7 != r10) goto L_0x02d1
            t.g r7 = r3.f5405h
            r7.mo6028c(r9)
            t.g r3 = r3.f5406i
            r3.mo6028c(r9)
            goto L_0x031e
        L_0x02d1:
            if (r22 == 0) goto L_0x02d5
            int r9 = r9 - r2
            goto L_0x02d6
        L_0x02d5:
            int r9 = r9 + r2
        L_0x02d6:
            if (r5 <= 0) goto L_0x02e3
            if (r5 < r4) goto L_0x02e3
            t.g r7 = r3.f5405h
            int r7 = r7.f5366f
            if (r22 == 0) goto L_0x02e2
            int r9 = r9 - r7
            goto L_0x02e3
        L_0x02e2:
            int r9 = r9 + r7
        L_0x02e3:
            if (r22 == 0) goto L_0x02e8
            t.g r7 = r3.f5406i
            goto L_0x02ea
        L_0x02e8:
            t.g r7 = r3.f5405h
        L_0x02ea:
            r7.mo6028c(r9)
            t.h r7 = r3.f5402e
            int r10 = r7.f5367g
            int r11 = r3.f5401d
            r12 = 3
            if (r11 != r12) goto L_0x0301
            int r11 = r3.f5398a
            r12 = 1
            if (r11 != r12) goto L_0x0301
            int r7 = r7.f5382m
            int r10 = java.lang.Math.min(r10, r7)
        L_0x0301:
            if (r22 == 0) goto L_0x0305
            int r9 = r9 - r10
            goto L_0x0306
        L_0x0305:
            int r9 = r9 + r10
        L_0x0306:
            if (r22 == 0) goto L_0x030b
            t.g r7 = r3.f5405h
            goto L_0x030d
        L_0x030b:
            t.g r7 = r3.f5406i
        L_0x030d:
            r7.mo6028c(r9)
            if (r5 >= r8) goto L_0x031e
            if (r5 >= r6) goto L_0x031e
            t.g r3 = r3.f5406i
            int r3 = r3.f5366f
            int r3 = -r3
            if (r22 == 0) goto L_0x031d
            int r9 = r9 - r3
            goto L_0x031e
        L_0x031d:
            int r9 = r9 + r3
        L_0x031e:
            int r5 = r5 + 1
            goto L_0x02ac
        L_0x0321:
            r9 = 2
            if (r7 != r9) goto L_0x03bb
            int r7 = r0.f5403f
            if (r7 != 0) goto L_0x032d
            s.e r7 = r0.f5399b
            float r7 = r7.f5207e0
            goto L_0x0331
        L_0x032d:
            s.e r7 = r0.f5399b
            float r7 = r7.f5209f0
        L_0x0331:
            if (r22 == 0) goto L_0x0337
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9 - r7
        L_0x0337:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r7
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0342
            if (r5 <= 0) goto L_0x0343
        L_0x0342:
            r2 = r3
        L_0x0343:
            if (r22 == 0) goto L_0x0348
            int r9 = r21 - r2
            goto L_0x034a
        L_0x0348:
            int r9 = r21 + r2
        L_0x034a:
            r5 = r3
        L_0x034b:
            if (r5 >= r1) goto L_0x03bb
            if (r22 == 0) goto L_0x0354
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0355
        L_0x0354:
            r2 = r5
        L_0x0355:
            java.util.ArrayList<t.q> r3 = r0.f5351k
            java.lang.Object r2 = r3.get(r2)
            t.q r2 = (p117t.C1765q) r2
            s.e r3 = r2.f5399b
            int r3 = r3.f5213h0
            r7 = 8
            if (r3 != r7) goto L_0x0372
            t.g r3 = r2.f5405h
            r3.mo6028c(r9)
            t.g r2 = r2.f5406i
            r2.mo6028c(r9)
            r12 = 3
            r13 = 1
            goto L_0x03b8
        L_0x0372:
            if (r5 <= 0) goto L_0x037f
            if (r5 < r4) goto L_0x037f
            t.g r3 = r2.f5405h
            int r3 = r3.f5366f
            if (r22 == 0) goto L_0x037e
            int r9 = r9 - r3
            goto L_0x037f
        L_0x037e:
            int r9 = r9 + r3
        L_0x037f:
            if (r22 == 0) goto L_0x0384
            t.g r3 = r2.f5406i
            goto L_0x0386
        L_0x0384:
            t.g r3 = r2.f5405h
        L_0x0386:
            r3.mo6028c(r9)
            t.h r3 = r2.f5402e
            int r10 = r3.f5367g
            int r11 = r2.f5401d
            r12 = 3
            if (r11 != r12) goto L_0x039a
            int r11 = r2.f5398a
            r13 = 1
            if (r11 != r13) goto L_0x039b
            int r10 = r3.f5382m
            goto L_0x039b
        L_0x039a:
            r13 = 1
        L_0x039b:
            if (r22 == 0) goto L_0x039f
            int r9 = r9 - r10
            goto L_0x03a0
        L_0x039f:
            int r9 = r9 + r10
        L_0x03a0:
            if (r22 == 0) goto L_0x03a5
            t.g r3 = r2.f5405h
            goto L_0x03a7
        L_0x03a5:
            t.g r3 = r2.f5406i
        L_0x03a7:
            r3.mo6028c(r9)
            if (r5 >= r8) goto L_0x03b8
            if (r5 >= r6) goto L_0x03b8
            t.g r2 = r2.f5406i
            int r2 = r2.f5366f
            int r2 = -r2
            if (r22 == 0) goto L_0x03b7
            int r9 = r9 - r2
            goto L_0x03b8
        L_0x03b7:
            int r9 = r9 + r2
        L_0x03b8:
            int r5 = r5 + 1
            goto L_0x034b
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1749c.mo6011a(t.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6012d() {
        /*
            r6 = this;
            java.util.ArrayList<t.q> r0 = r6.f5351k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            t.q r1 = (p117t.C1765q) r1
            r1.mo6012d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<t.q> r0 = r6.f5351k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<t.q> r2 = r6.f5351k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            t.q r2 = (p117t.C1765q) r2
            s.e r2 = r2.f5399b
            java.util.ArrayList<t.q> r4 = r6.f5351k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            t.q r0 = (p117t.C1765q) r0
            s.e r0 = r0.f5399b
            int r4 = r6.f5403f
            if (r4 != 0) goto L_0x0088
            s.d r1 = r2.f5180I
            s.d r0 = r0.f5182K
            t.g r2 = r6.mo6048i(r1, r3)
            int r1 = r1.mo5899d()
            s.e r4 = r6.mo6017m()
            if (r4 == 0) goto L_0x0052
            s.d r1 = r4.f5180I
            int r1 = r1.mo5899d()
        L_0x0052:
            if (r2 == 0) goto L_0x0062
            t.g r4 = r6.f5405h
            java.util.List<t.g> r5 = r4.f5372l
            r5.add(r2)
            r4.f5366f = r1
            java.util.List<t.d> r1 = r2.f5371k
            r1.add(r4)
        L_0x0062:
            t.g r1 = r6.mo6048i(r0, r3)
            int r0 = r0.mo5899d()
            s.e r2 = r6.mo6018n()
            if (r2 == 0) goto L_0x0076
            s.d r0 = r2.f5182K
            int r0 = r0.mo5899d()
        L_0x0076:
            if (r1 == 0) goto L_0x00c7
        L_0x0078:
            t.g r2 = r6.f5406i
            int r0 = -r0
            java.util.List<t.g> r3 = r2.f5372l
            r3.add(r1)
            r2.f5366f = r0
            java.util.List<t.d> r0 = r1.f5371k
            r0.add(r2)
            goto L_0x00c7
        L_0x0088:
            s.d r2 = r2.f5181J
            s.d r0 = r0.f5183L
            t.g r3 = r6.mo6048i(r2, r1)
            int r2 = r2.mo5899d()
            s.e r4 = r6.mo6017m()
            if (r4 == 0) goto L_0x00a0
            s.d r2 = r4.f5181J
            int r2 = r2.mo5899d()
        L_0x00a0:
            if (r3 == 0) goto L_0x00b0
            t.g r4 = r6.f5405h
            java.util.List<t.g> r5 = r4.f5372l
            r5.add(r3)
            r4.f5366f = r2
            java.util.List<t.d> r2 = r3.f5371k
            r2.add(r4)
        L_0x00b0:
            t.g r1 = r6.mo6048i(r0, r1)
            int r0 = r0.mo5899d()
            s.e r2 = r6.mo6018n()
            if (r2 == 0) goto L_0x00c4
            s.d r0 = r2.f5183L
            int r0 = r0.mo5899d()
        L_0x00c4:
            if (r1 == 0) goto L_0x00c7
            goto L_0x0078
        L_0x00c7:
            t.g r0 = r6.f5405h
            r0.f5361a = r6
            t.g r0 = r6.f5406i
            r0.f5361a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1749c.mo6012d():void");
    }

    /* renamed from: e */
    public void mo6013e() {
        for (int i = 0; i < this.f5351k.size(); i++) {
            this.f5351k.get(i).mo6013e();
        }
    }

    /* renamed from: f */
    public void mo6014f() {
        this.f5400c = null;
        Iterator<C1765q> it = this.f5351k.iterator();
        while (it.hasNext()) {
            it.next().mo6014f();
        }
    }

    /* renamed from: j */
    public long mo6015j() {
        int size = this.f5351k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1765q qVar = this.f5351k.get(i);
            j = ((long) qVar.f5406i.f5366f) + qVar.mo6015j() + j + ((long) qVar.f5405h.f5366f);
        }
        return j;
    }

    /* renamed from: k */
    public boolean mo6016k() {
        int size = this.f5351k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f5351k.get(i).mo6016k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C1695e mo6017m() {
        for (int i = 0; i < this.f5351k.size(); i++) {
            C1695e eVar = this.f5351k.get(i).f5399b;
            if (eVar.f5213h0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C1695e mo6018n() {
        for (int size = this.f5351k.size() - 1; size >= 0; size--) {
            C1695e eVar = this.f5351k.get(size).f5399b;
            if (eVar.f5213h0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5403f == 0 ? "horizontal : " : "vertical : ");
        Iterator<C1765q> it = this.f5351k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
