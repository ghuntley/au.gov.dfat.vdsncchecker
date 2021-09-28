package p117t;

import java.util.List;
import p000a.C0001b;
import p111s.C1693d;
import p111s.C1695e;
import p111s.C1698h;
import p117t.C1753g;

/* renamed from: t.m */
public class C1760m extends C1765q {

    /* renamed from: k */
    public static int[] f5386k = new int[2];

    public C1760m(C1695e eVar) {
        super(eVar);
        this.f5405h.f5365e = C1753g.C1754a.LEFT;
        this.f5406i.f5365e = C1753g.C1754a.RIGHT;
        this.f5403f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        if (r15 != 1) goto L_0x029e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6011a(p117t.C1750d r19) {
        /*
            r18 = this;
            r8 = r18
            int r0 = r8.f5407j
            int r0 = p099q.C1600i.m4504a(r0)
            r9 = 3
            r10 = 0
            if (r0 == r9) goto L_0x03b6
            t.h r0 = r8.f5402e
            boolean r1 = r0.f5370j
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            if (r1 != 0) goto L_0x029e
            int r1 = r8.f5401d
            if (r1 != r9) goto L_0x029e
            s.e r1 = r8.f5399b
            int r2 = r1.f5230q
            r3 = 2
            if (r2 == r3) goto L_0x0287
            if (r2 == r9) goto L_0x0024
            goto L_0x029e
        L_0x0024:
            int r2 = r1.f5231r
            r3 = -1
            if (r2 == 0) goto L_0x004f
            if (r2 != r9) goto L_0x002c
            goto L_0x004f
        L_0x002c:
            int r2 = r1.f5196Y
            if (r2 == r3) goto L_0x0043
            if (r2 == 0) goto L_0x0037
            if (r2 == r12) goto L_0x0043
            r1 = r10
            goto L_0x029b
        L_0x0037:
            t.o r2 = r1.f5206e
            t.h r2 = r2.f5402e
            int r2 = r2.f5367g
            float r2 = (float) r2
            float r1 = r1.f5195X
            float r2 = r2 / r1
            goto L_0x0299
        L_0x0043:
            t.o r2 = r1.f5206e
            t.h r2 = r2.f5402e
            int r2 = r2.f5367g
            float r2 = (float) r2
            float r1 = r1.f5195X
            float r2 = r2 * r1
            goto L_0x0299
        L_0x004f:
            t.o r0 = r1.f5206e
            t.g r13 = r0.f5405h
            t.g r14 = r0.f5406i
            s.d r0 = r1.f5180I
            s.d r0 = r0.f5159f
            if (r0 == 0) goto L_0x005d
            r0 = r12
            goto L_0x005e
        L_0x005d:
            r0 = r10
        L_0x005e:
            s.d r2 = r1.f5181J
            s.d r2 = r2.f5159f
            if (r2 == 0) goto L_0x0066
            r2 = r12
            goto L_0x0067
        L_0x0066:
            r2 = r10
        L_0x0067:
            s.d r4 = r1.f5182K
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x006f
            r4 = r12
            goto L_0x0070
        L_0x006f:
            r4 = r10
        L_0x0070:
            s.d r5 = r1.f5183L
            s.d r5 = r5.f5159f
            if (r5 == 0) goto L_0x0078
            r5 = r12
            goto L_0x0079
        L_0x0078:
            r5 = r10
        L_0x0079:
            int r15 = r1.f5196Y
            if (r0 == 0) goto L_0x01b4
            if (r2 == 0) goto L_0x01b4
            if (r4 == 0) goto L_0x01b4
            if (r5 == 0) goto L_0x01b4
            float r7 = r1.f5195X
            boolean r0 = r13.f5370j
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r14.f5370j
            if (r0 == 0) goto L_0x00e5
            t.g r0 = r8.f5405h
            boolean r1 = r0.f5363c
            if (r1 == 0) goto L_0x00e4
            t.g r1 = r8.f5406i
            boolean r1 = r1.f5363c
            if (r1 != 0) goto L_0x009a
            goto L_0x00e4
        L_0x009a:
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            t.g r1 = r8.f5405h
            int r1 = r1.f5366f
            int r2 = r0 + r1
            t.g r0 = r8.f5406i
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            t.g r1 = r8.f5406i
            int r1 = r1.f5366f
            int r3 = r0 - r1
            int r0 = r13.f5367g
            int r1 = r13.f5366f
            int r4 = r0 + r1
            int r0 = r14.f5367g
            int r1 = r14.f5366f
            int r5 = r0 - r1
            int[] r9 = f5386k
            r0 = r18
            r1 = r9
            r6 = r7
            r7 = r15
            r0.mo6032m(r1, r2, r3, r4, r5, r6, r7)
            t.h r0 = r8.f5402e
            r1 = r9[r10]
            r0.mo6028c(r1)
            s.e r0 = r8.f5399b
            t.o r0 = r0.f5206e
            t.h r0 = r0.f5402e
            r1 = r9[r12]
            r0.mo6028c(r1)
        L_0x00e4:
            return
        L_0x00e5:
            t.g r0 = r8.f5405h
            boolean r1 = r0.f5370j
            if (r1 == 0) goto L_0x0142
            t.g r1 = r8.f5406i
            boolean r2 = r1.f5370j
            if (r2 == 0) goto L_0x0142
            boolean r2 = r13.f5363c
            if (r2 == 0) goto L_0x0141
            boolean r2 = r14.f5363c
            if (r2 != 0) goto L_0x00fa
            goto L_0x0141
        L_0x00fa:
            int r2 = r0.f5367g
            int r0 = r0.f5366f
            int r2 = r2 + r0
            int r0 = r1.f5367g
            int r1 = r1.f5366f
            int r3 = r0 - r1
            java.util.List<t.g> r0 = r13.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            int r1 = r13.f5366f
            int r4 = r0 + r1
            java.util.List<t.g> r0 = r14.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            int r1 = r14.f5366f
            int r5 = r0 - r1
            int[] r16 = f5386k
            r0 = r18
            r1 = r16
            r6 = r7
            r17 = r7
            r7 = r15
            r0.mo6032m(r1, r2, r3, r4, r5, r6, r7)
            t.h r0 = r8.f5402e
            r1 = r16[r10]
            r0.mo6028c(r1)
            s.e r0 = r8.f5399b
            t.o r0 = r0.f5206e
            t.h r0 = r0.f5402e
            r1 = r16[r12]
            r0.mo6028c(r1)
            goto L_0x0144
        L_0x0141:
            return
        L_0x0142:
            r17 = r7
        L_0x0144:
            t.g r0 = r8.f5405h
            boolean r1 = r0.f5363c
            if (r1 == 0) goto L_0x01b3
            t.g r1 = r8.f5406i
            boolean r1 = r1.f5363c
            if (r1 == 0) goto L_0x01b3
            boolean r1 = r13.f5363c
            if (r1 == 0) goto L_0x01b3
            boolean r1 = r14.f5363c
            if (r1 != 0) goto L_0x0159
            goto L_0x01b3
        L_0x0159:
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            t.g r1 = r8.f5405h
            int r1 = r1.f5366f
            int r2 = r0 + r1
            t.g r0 = r8.f5406i
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            t.g r1 = r8.f5406i
            int r1 = r1.f5366f
            int r3 = r0 - r1
            java.util.List<t.g> r0 = r13.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            int r1 = r13.f5366f
            int r4 = r0 + r1
            java.util.List<t.g> r0 = r14.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            int r1 = r14.f5366f
            int r5 = r0 - r1
            int[] r13 = f5386k
            r0 = r18
            r1 = r13
            r6 = r17
            r7 = r15
            r0.mo6032m(r1, r2, r3, r4, r5, r6, r7)
            t.h r0 = r8.f5402e
            r1 = r13[r10]
            r0.mo6028c(r1)
            s.e r0 = r8.f5399b
            t.o r0 = r0.f5206e
            t.h r0 = r0.f5402e
            r1 = r13[r12]
            goto L_0x029b
        L_0x01b3:
            return
        L_0x01b4:
            if (r0 == 0) goto L_0x0225
            if (r4 == 0) goto L_0x0225
            t.g r0 = r8.f5405h
            boolean r2 = r0.f5363c
            if (r2 == 0) goto L_0x0224
            t.g r2 = r8.f5406i
            boolean r2 = r2.f5363c
            if (r2 != 0) goto L_0x01c5
            goto L_0x0224
        L_0x01c5:
            float r1 = r1.f5195X
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            int r0 = r0.f5367g
            t.g r2 = r8.f5405h
            int r2 = r2.f5366f
            int r0 = r0 + r2
            t.g r2 = r8.f5406i
            java.util.List<t.g> r2 = r2.f5372l
            java.lang.Object r2 = r2.get(r10)
            t.g r2 = (p117t.C1753g) r2
            int r2 = r2.f5367g
            t.g r4 = r8.f5406i
            int r4 = r4.f5366f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x0201
            if (r15 == 0) goto L_0x0201
            if (r15 == r12) goto L_0x01ef
            goto L_0x029e
        L_0x01ef:
            int r2 = r2 - r0
            int r0 = r8.mo6046g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo6046g(r2, r12)
            if (r2 == r3) goto L_0x0214
            float r0 = (float) r3
            float r0 = r0 * r1
            goto L_0x0212
        L_0x0201:
            int r2 = r2 - r0
            int r0 = r8.mo6046g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo6046g(r2, r12)
            if (r2 == r3) goto L_0x0214
            float r0 = (float) r3
            float r0 = r0 / r1
        L_0x0212:
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0214:
            t.h r1 = r8.f5402e
            r1.mo6028c(r0)
            s.e r0 = r8.f5399b
            t.o r0 = r0.f5206e
            t.h r0 = r0.f5402e
            r0.mo6028c(r3)
            goto L_0x029e
        L_0x0224:
            return
        L_0x0225:
            if (r2 == 0) goto L_0x029e
            if (r5 == 0) goto L_0x029e
            boolean r0 = r13.f5363c
            if (r0 == 0) goto L_0x0286
            boolean r0 = r14.f5363c
            if (r0 != 0) goto L_0x0232
            goto L_0x0286
        L_0x0232:
            float r0 = r1.f5195X
            java.util.List<t.g> r1 = r13.f5372l
            java.lang.Object r1 = r1.get(r10)
            t.g r1 = (p117t.C1753g) r1
            int r1 = r1.f5367g
            int r2 = r13.f5366f
            int r1 = r1 + r2
            java.util.List<t.g> r2 = r14.f5372l
            java.lang.Object r2 = r2.get(r10)
            t.g r2 = (p117t.C1753g) r2
            int r2 = r2.f5367g
            int r4 = r14.f5366f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x0267
            if (r15 == 0) goto L_0x0255
            if (r15 == r12) goto L_0x0267
            goto L_0x029e
        L_0x0255:
            int r2 = r2 - r1
            int r1 = r8.mo6046g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo6046g(r2, r10)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x0278
        L_0x0267:
            int r2 = r2 - r1
            int r1 = r8.mo6046g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo6046g(r2, r10)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x0278:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            t.h r0 = r8.f5402e
            r0.mo6028c(r3)
            s.e r0 = r8.f5399b
            t.o r0 = r0.f5206e
            t.h r0 = r0.f5402e
            goto L_0x029b
        L_0x0286:
            return
        L_0x0287:
            s.e r2 = r1.f5192U
            if (r2 == 0) goto L_0x029e
            t.m r2 = r2.f5204d
            t.h r2 = r2.f5402e
            boolean r3 = r2.f5370j
            if (r3 == 0) goto L_0x029e
            float r1 = r1.f5235v
            int r2 = r2.f5367g
            float r2 = (float) r2
            float r2 = r2 * r1
        L_0x0299:
            float r2 = r2 + r11
            int r1 = (int) r2
        L_0x029b:
            r0.mo6028c(r1)
        L_0x029e:
            t.g r0 = r8.f5405h
            boolean r1 = r0.f5363c
            if (r1 == 0) goto L_0x03b5
            t.g r1 = r8.f5406i
            boolean r2 = r1.f5363c
            if (r2 != 0) goto L_0x02ac
            goto L_0x03b5
        L_0x02ac:
            boolean r0 = r0.f5370j
            if (r0 == 0) goto L_0x02bb
            boolean r0 = r1.f5370j
            if (r0 == 0) goto L_0x02bb
            t.h r0 = r8.f5402e
            boolean r0 = r0.f5370j
            if (r0 == 0) goto L_0x02bb
            return
        L_0x02bb:
            t.h r0 = r8.f5402e
            boolean r0 = r0.f5370j
            if (r0 != 0) goto L_0x0303
            int r0 = r8.f5401d
            if (r0 != r9) goto L_0x0303
            s.e r0 = r8.f5399b
            int r1 = r0.f5230q
            if (r1 != 0) goto L_0x0303
            boolean r0 = r0.mo5941x()
            if (r0 != 0) goto L_0x0303
            t.g r0 = r8.f5405h
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            t.g r1 = r8.f5406i
            java.util.List<t.g> r1 = r1.f5372l
            java.lang.Object r1 = r1.get(r10)
            t.g r1 = (p117t.C1753g) r1
            int r0 = r0.f5367g
            t.g r2 = r8.f5405h
            int r3 = r2.f5366f
            int r0 = r0 + r3
            int r1 = r1.f5367g
            t.g r3 = r8.f5406i
            int r3 = r3.f5366f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo6028c(r0)
            t.g r0 = r8.f5406i
            r0.mo6028c(r1)
            t.h r0 = r8.f5402e
            r0.mo6028c(r3)
            return
        L_0x0303:
            t.h r0 = r8.f5402e
            boolean r0 = r0.f5370j
            if (r0 != 0) goto L_0x0365
            int r0 = r8.f5401d
            if (r0 != r9) goto L_0x0365
            int r0 = r8.f5398a
            if (r0 != r12) goto L_0x0365
            t.g r0 = r8.f5405h
            java.util.List<t.g> r0 = r0.f5372l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0365
            t.g r0 = r8.f5406i
            java.util.List<t.g> r0 = r0.f5372l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0365
            t.g r0 = r8.f5405h
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            t.g r1 = r8.f5406i
            java.util.List<t.g> r1 = r1.f5372l
            java.lang.Object r1 = r1.get(r10)
            t.g r1 = (p117t.C1753g) r1
            int r0 = r0.f5367g
            t.g r2 = r8.f5405h
            int r2 = r2.f5366f
            int r0 = r0 + r2
            int r1 = r1.f5367g
            t.g r2 = r8.f5406i
            int r2 = r2.f5366f
            int r1 = r1 + r2
            int r1 = r1 - r0
            t.h r0 = r8.f5402e
            int r0 = r0.f5382m
            int r0 = java.lang.Math.min(r1, r0)
            s.e r1 = r8.f5399b
            int r2 = r1.f5234u
            int r1 = r1.f5233t
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x0360
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0360:
            t.h r1 = r8.f5402e
            r1.mo6028c(r0)
        L_0x0365:
            t.h r0 = r8.f5402e
            boolean r0 = r0.f5370j
            if (r0 != 0) goto L_0x036c
            return
        L_0x036c:
            t.g r0 = r8.f5405h
            java.util.List<t.g> r0 = r0.f5372l
            java.lang.Object r0 = r0.get(r10)
            t.g r0 = (p117t.C1753g) r0
            t.g r1 = r8.f5406i
            java.util.List<t.g> r1 = r1.f5372l
            java.lang.Object r1 = r1.get(r10)
            t.g r1 = (p117t.C1753g) r1
            int r2 = r0.f5367g
            t.g r3 = r8.f5405h
            int r4 = r3.f5366f
            int r4 = r4 + r2
            int r5 = r1.f5367g
            t.g r6 = r8.f5406i
            int r6 = r6.f5366f
            int r6 = r6 + r5
            s.e r7 = r8.f5399b
            float r7 = r7.f5207e0
            if (r0 != r1) goto L_0x0396
            r7 = r11
            goto L_0x0398
        L_0x0396:
            r2 = r4
            r5 = r6
        L_0x0398:
            int r5 = r5 - r2
            t.h r0 = r8.f5402e
            int r0 = r0.f5367g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r11
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.mo6028c(r0)
            t.g r0 = r8.f5406i
            t.g r1 = r8.f5405h
            int r1 = r1.f5367g
            t.h r2 = r8.f5402e
            int r2 = r2.f5367g
            int r1 = r1 + r2
            r0.mo6028c(r1)
        L_0x03b5:
            return
        L_0x03b6:
            s.e r0 = r8.f5399b
            s.d r1 = r0.f5180I
            s.d r0 = r0.f5182K
            r8.mo6049l(r1, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1760m.mo6011a(t.d):void");
    }

    /* renamed from: d */
    public void mo6012d() {
        C1693d dVar;
        C1753g gVar;
        C1695e eVar;
        Object obj;
        List list;
        C1753g gVar2;
        int i;
        C1753g gVar3;
        C1753g gVar4;
        C1695e eVar2;
        C1695e eVar3;
        C1695e eVar4 = this.f5399b;
        if (eVar4.f5198a) {
            this.f5402e.mo6028c(eVar4.mo5935r());
        }
        if (!this.f5402e.f5370j) {
            int m = this.f5399b.mo5930m();
            this.f5401d = m;
            if (m != 3) {
                if (m == 4 && (eVar3 = this.f5399b.f5192U) != null && (eVar3.mo5930m() == 1 || eVar3.mo5930m() == 4)) {
                    int r = (eVar3.mo5935r() - this.f5399b.f5180I.mo5899d()) - this.f5399b.f5182K.mo5899d();
                    mo6044b(this.f5405h, eVar3.f5204d.f5405h, this.f5399b.f5180I.mo5899d());
                    mo6044b(this.f5406i, eVar3.f5204d.f5406i, -this.f5399b.f5182K.mo5899d());
                    this.f5402e.mo6028c(r);
                    return;
                } else if (this.f5401d == 1) {
                    this.f5402e.mo6028c(this.f5399b.mo5935r());
                }
            }
        } else if (this.f5401d == 4 && (eVar2 = this.f5399b.f5192U) != null && (eVar2.mo5930m() == 1 || eVar2.mo5930m() == 4)) {
            mo6044b(this.f5405h, eVar2.f5204d.f5405h, this.f5399b.f5180I.mo5899d());
            mo6044b(this.f5406i, eVar2.f5204d.f5406i, -this.f5399b.f5182K.mo5899d());
            return;
        }
        C1755h hVar = this.f5402e;
        if (hVar.f5370j) {
            C1695e eVar5 = this.f5399b;
            if (eVar5.f5198a) {
                C1693d[] dVarArr = eVar5.f5188Q;
                if (dVarArr[0].f5159f == null || dVarArr[1].f5159f == null) {
                    if (dVarArr[0].f5159f != null) {
                        C1753g h = mo6047h(dVarArr[0]);
                        if (h != null) {
                            C1753g gVar5 = this.f5405h;
                            int d = this.f5399b.f5188Q[0].mo5899d();
                            gVar5.f5372l.add(h);
                            gVar5.f5366f = d;
                            h.f5371k.add(gVar5);
                        } else {
                            return;
                        }
                    } else if (dVarArr[1].f5159f != null) {
                        C1753g h2 = mo6047h(dVarArr[1]);
                        if (h2 != null) {
                            C1753g gVar6 = this.f5406i;
                            gVar6.f5372l.add(h2);
                            gVar6.f5366f = -this.f5399b.f5188Q[1].mo5899d();
                            h2.f5371k.add(gVar6);
                            gVar4 = this.f5405h;
                            gVar3 = this.f5406i;
                            i = -this.f5402e.f5367g;
                            mo6044b(gVar4, gVar3, i);
                            return;
                        }
                        return;
                    } else if (!(eVar5 instanceof C1698h) && eVar5.f5192U != null && eVar5.mo5926i(C1693d.C1694a.CENTER).f5159f == null) {
                        C1695e eVar6 = this.f5399b;
                        mo6044b(this.f5405h, eVar6.f5192U.f5204d.f5405h, eVar6.mo5936s());
                    } else {
                        return;
                    }
                    gVar4 = this.f5406i;
                    gVar3 = this.f5405h;
                    i = this.f5402e.f5367g;
                    mo6044b(gVar4, gVar3, i);
                    return;
                } else if (eVar5.mo5941x()) {
                    this.f5405h.f5366f = this.f5399b.f5188Q[0].mo5899d();
                    gVar = this.f5406i;
                    dVar = this.f5399b.f5188Q[1];
                    gVar.f5366f = -dVar.mo5899d();
                } else {
                    C1753g h3 = mo6047h(this.f5399b.f5188Q[0]);
                    if (h3 != null) {
                        C1753g gVar7 = this.f5405h;
                        int d2 = this.f5399b.f5188Q[0].mo5899d();
                        gVar7.f5372l.add(h3);
                        gVar7.f5366f = d2;
                        h3.f5371k.add(gVar7);
                    }
                    C1753g h4 = mo6047h(this.f5399b.f5188Q[1]);
                    if (h4 != null) {
                        C1753g gVar8 = this.f5406i;
                        gVar8.f5372l.add(h4);
                        gVar8.f5366f = -this.f5399b.f5188Q[1].mo5899d();
                        h4.f5371k.add(gVar8);
                    }
                    this.f5405h.f5362b = true;
                    this.f5406i.f5362b = true;
                    return;
                }
            }
        }
        if (this.f5401d == 3) {
            C1695e eVar7 = this.f5399b;
            int i2 = eVar7.f5230q;
            if (i2 == 2) {
                C1695e eVar8 = eVar7.f5192U;
                if (eVar8 != null) {
                    C1755h hVar2 = eVar8.f5206e.f5402e;
                    hVar.f5372l.add(hVar2);
                    hVar2.f5371k.add(this.f5402e);
                    C1755h hVar3 = this.f5402e;
                    hVar3.f5362b = true;
                    hVar3.f5371k.add(this.f5405h);
                    list = this.f5402e.f5371k;
                    obj = this.f5406i;
                }
            } else if (i2 == 3) {
                if (eVar7.f5231r == 3) {
                    this.f5405h.f5361a = this;
                    this.f5406i.f5361a = this;
                    C1762o oVar = eVar7.f5206e;
                    oVar.f5405h.f5361a = this;
                    oVar.f5406i.f5361a = this;
                    hVar.f5361a = this;
                    if (eVar7.mo5942y()) {
                        this.f5402e.f5372l.add(this.f5399b.f5206e.f5402e);
                        this.f5399b.f5206e.f5402e.f5371k.add(this.f5402e);
                        C1762o oVar2 = this.f5399b.f5206e;
                        oVar2.f5402e.f5361a = this;
                        this.f5402e.f5372l.add(oVar2.f5405h);
                        this.f5402e.f5372l.add(this.f5399b.f5206e.f5406i);
                        this.f5399b.f5206e.f5405h.f5371k.add(this.f5402e);
                        list = this.f5399b.f5206e.f5406i.f5371k;
                        obj = this.f5402e;
                    } else if (this.f5399b.mo5941x()) {
                        this.f5399b.f5206e.f5402e.f5372l.add(this.f5402e);
                        list = this.f5402e.f5371k;
                        obj = this.f5399b.f5206e.f5402e;
                    } else {
                        gVar2 = this.f5399b.f5206e.f5402e;
                    }
                } else {
                    C1755h hVar4 = eVar7.f5206e.f5402e;
                    hVar.f5372l.add(hVar4);
                    hVar4.f5371k.add(this.f5402e);
                    this.f5399b.f5206e.f5405h.f5371k.add(this.f5402e);
                    this.f5399b.f5206e.f5406i.f5371k.add(this.f5402e);
                    C1755h hVar5 = this.f5402e;
                    hVar5.f5362b = true;
                    hVar5.f5371k.add(this.f5405h);
                    this.f5402e.f5371k.add(this.f5406i);
                    this.f5405h.f5372l.add(this.f5402e);
                    gVar2 = this.f5406i;
                }
                list = gVar2.f5372l;
                obj = this.f5402e;
            }
            list.add(obj);
        }
        C1695e eVar9 = this.f5399b;
        C1693d[] dVarArr2 = eVar9.f5188Q;
        if (dVarArr2[0].f5159f == null || dVarArr2[1].f5159f == null) {
            if (dVarArr2[0].f5159f != null) {
                C1753g h5 = mo6047h(dVarArr2[0]);
                if (h5 != null) {
                    C1753g gVar9 = this.f5405h;
                    int d3 = this.f5399b.f5188Q[0].mo5899d();
                    gVar9.f5372l.add(h5);
                    gVar9.f5366f = d3;
                    h5.f5371k.add(gVar9);
                } else {
                    return;
                }
            } else if (dVarArr2[1].f5159f != null) {
                C1753g h6 = mo6047h(dVarArr2[1]);
                if (h6 != null) {
                    C1753g gVar10 = this.f5406i;
                    gVar10.f5372l.add(h6);
                    gVar10.f5366f = -this.f5399b.f5188Q[1].mo5899d();
                    h6.f5371k.add(gVar10);
                    mo6045c(this.f5405h, this.f5406i, -1, this.f5402e);
                    return;
                }
                return;
            } else if (!(eVar9 instanceof C1698h) && (eVar = eVar9.f5192U) != null) {
                mo6044b(this.f5405h, eVar.f5204d.f5405h, eVar9.mo5936s());
            } else {
                return;
            }
            mo6045c(this.f5406i, this.f5405h, 1, this.f5402e);
        } else if (eVar9.mo5941x()) {
            this.f5405h.f5366f = this.f5399b.f5188Q[0].mo5899d();
            gVar = this.f5406i;
            dVar = this.f5399b.f5188Q[1];
            gVar.f5366f = -dVar.mo5899d();
        } else {
            C1753g h7 = mo6047h(this.f5399b.f5188Q[0]);
            C1753g h8 = mo6047h(this.f5399b.f5188Q[1]);
            if (h7 != null) {
                h7.f5371k.add(this);
                if (h7.f5370j) {
                    mo6011a(this);
                }
            }
            if (h8 != null) {
                h8.f5371k.add(this);
                if (h8.f5370j) {
                    mo6011a(this);
                }
            }
            this.f5407j = 4;
        }
    }

    /* renamed from: e */
    public void mo6013e() {
        C1753g gVar = this.f5405h;
        if (gVar.f5370j) {
            this.f5399b.f5197Z = gVar.f5367g;
        }
    }

    /* renamed from: f */
    public void mo6014f() {
        this.f5400c = null;
        this.f5405h.mo6027b();
        this.f5406i.mo6027b();
        this.f5402e.mo6027b();
        this.f5404g = false;
    }

    /* renamed from: k */
    public boolean mo6016k() {
        return this.f5401d != 3 || this.f5399b.f5230q == 0;
    }

    /* renamed from: m */
    public final void mo6032m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* renamed from: n */
    public void mo6033n() {
        this.f5404g = false;
        this.f5405h.mo6027b();
        this.f5405h.f5370j = false;
        this.f5406i.mo6027b();
        this.f5406i.f5370j = false;
        this.f5402e.f5370j = false;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("HorizontalRun ");
        a.append(this.f5399b.f5215i0);
        return a.toString();
    }
}
