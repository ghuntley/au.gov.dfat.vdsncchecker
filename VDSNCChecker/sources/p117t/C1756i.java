package p117t;

import p111s.C1695e;
import p111s.C1696f;
import p117t.C1746b;

/* renamed from: t.i */
public class C1756i {

    /* renamed from: a */
    public static C1746b.C1747a f5383a = new C1746b.C1747a();

    /* renamed from: b */
    public static int f5384b;

    /* renamed from: c */
    public static int f5385c;

    /* renamed from: a */
    public static boolean m4887a(C1695e eVar) {
        int m = eVar.mo5930m();
        int q = eVar.mo5934q();
        C1695e eVar2 = eVar.f5192U;
        C1696f fVar = eVar2 != null ? (C1696f) eVar2 : null;
        if (fVar != null) {
            fVar.mo5930m();
        }
        if (fVar != null) {
            fVar.mo5934q();
        }
        boolean z = m == 1 || eVar.mo5889A() || m == 2 || (m == 3 && eVar.f5230q == 0 && eVar.f5195X == 0.0f && eVar.mo5938u(0)) || (m == 3 && eVar.f5230q == 1 && eVar.mo5939v(0, eVar.mo5935r()));
        boolean z2 = q == 1 || eVar.mo5890B() || q == 2 || (q == 3 && eVar.f5231r == 0 && eVar.f5195X == 0.0f && eVar.mo5938u(1)) || (m == 3 && eVar.f5231r == 1 && eVar.mo5939v(1, eVar.mo5929l()));
        if (eVar.f5195X <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r15 = r13.f5182K.f5159f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r4 = r4.f5159f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4888b(int r17, p111s.C1695e r18, p117t.C1746b.C1748b r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f5220l
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            int r3 = f5384b
            r4 = 1
            int r3 = r3 + r4
            f5384b = r3
            boolean r3 = r0 instanceof p111s.C1696f
            r5 = 0
            if (r3 != 0) goto L_0x002a
            boolean r3 = r18.mo5943z()
            if (r3 == 0) goto L_0x002a
            boolean r3 = m4887a(r18)
            if (r3 == 0) goto L_0x002a
            t.b$a r3 = new t.b$a
            r3.<init>()
            p111s.C1696f.m4738Z(r0, r1, r3, r5)
        L_0x002a:
            s.d$a r3 = p111s.C1693d.C1694a.LEFT
            s.d r3 = r0.mo5926i(r3)
            s.d$a r6 = p111s.C1693d.C1694a.RIGHT
            s.d r6 = r0.mo5926i(r6)
            int r7 = r3.mo5898c()
            int r8 = r6.mo5898c()
            java.util.HashSet<s.d> r9 = r3.f5154a
            r10 = 8
            r11 = 0
            r12 = 3
            if (r9 == 0) goto L_0x011d
            boolean r3 = r3.f5156c
            if (r3 == 0) goto L_0x011d
            java.util.Iterator r3 = r9.iterator()
        L_0x004e:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x011d
            java.lang.Object r9 = r3.next()
            s.d r9 = (p111s.C1693d) r9
            s.e r13 = r9.f5157d
            int r14 = r17 + 1
            boolean r15 = m4887a(r13)
            boolean r16 = r13.mo5943z()
            if (r16 == 0) goto L_0x0072
            if (r15 == 0) goto L_0x0072
            t.b$a r4 = new t.b$a
            r4.<init>()
            p111s.C1696f.m4738Z(r13, r1, r4, r5)
        L_0x0072:
            int r4 = r13.mo5930m()
            if (r4 != r12) goto L_0x00ca
            if (r15 == 0) goto L_0x007b
            goto L_0x00ca
        L_0x007b:
            int r4 = r13.mo5930m()
            if (r4 != r12) goto L_0x0119
            int r4 = r13.f5234u
            if (r4 < 0) goto L_0x0119
            int r4 = r13.f5233t
            if (r4 < 0) goto L_0x0119
            int r4 = r13.f5213h0
            if (r4 == r10) goto L_0x0097
            int r4 = r13.f5230q
            if (r4 != 0) goto L_0x0119
            float r4 = r13.f5195X
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0119
        L_0x0097:
            boolean r4 = r13.mo5941x()
            if (r4 != 0) goto L_0x0119
            boolean r4 = r13.f5177F
            if (r4 != 0) goto L_0x0119
            s.d r4 = r13.f5180I
            if (r9 != r4) goto L_0x00af
            s.d r15 = r13.f5182K
            s.d r15 = r15.f5159f
            if (r15 == 0) goto L_0x00af
            boolean r15 = r15.f5156c
            if (r15 != 0) goto L_0x00bb
        L_0x00af:
            s.d r15 = r13.f5182K
            if (r9 != r15) goto L_0x00bd
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x00bd
            boolean r4 = r4.f5156c
            if (r4 == 0) goto L_0x00bd
        L_0x00bb:
            r4 = 1
            goto L_0x00be
        L_0x00bd:
            r4 = r5
        L_0x00be:
            if (r4 == 0) goto L_0x0119
            boolean r4 = r13.mo5941x()
            if (r4 != 0) goto L_0x0119
            m4890d(r14, r0, r1, r13, r2)
            goto L_0x0119
        L_0x00ca:
            boolean r4 = r13.mo5943z()
            if (r4 == 0) goto L_0x00d3
            r4 = 1
            goto L_0x004e
        L_0x00d3:
            s.d r4 = r13.f5180I
            if (r9 != r4) goto L_0x00eb
            s.d r15 = r13.f5182K
            s.d r15 = r15.f5159f
            if (r15 != 0) goto L_0x00eb
            int r4 = r4.mo5899d()
            int r4 = r4 + r7
            int r9 = r13.mo5935r()
            int r9 = r9 + r4
            r13.mo5911G(r4, r9)
            goto L_0x0102
        L_0x00eb:
            s.d r15 = r13.f5182K
            if (r9 != r15) goto L_0x0106
            s.d r11 = r4.f5159f
            if (r11 != 0) goto L_0x0106
            int r4 = r15.mo5899d()
            int r4 = r7 - r4
            int r9 = r13.mo5935r()
            int r9 = r4 - r9
            r13.mo5911G(r9, r4)
        L_0x0102:
            m4888b(r14, r13, r1, r2)
            goto L_0x0119
        L_0x0106:
            if (r9 != r4) goto L_0x0119
            s.d r4 = r15.f5159f
            if (r4 == 0) goto L_0x0119
            boolean r4 = r4.f5156c
            if (r4 == 0) goto L_0x0119
            boolean r4 = r13.mo5941x()
            if (r4 != 0) goto L_0x0119
            m4889c(r14, r1, r13, r2)
        L_0x0119:
            r4 = 1
            r11 = 0
            goto L_0x004e
        L_0x011d:
            boolean r3 = r0 instanceof p111s.C1697g
            if (r3 == 0) goto L_0x0122
            return
        L_0x0122:
            java.util.HashSet<s.d> r3 = r6.f5154a
            if (r3 == 0) goto L_0x01fb
            boolean r4 = r6.f5156c
            if (r4 == 0) goto L_0x01fb
            java.util.Iterator r3 = r3.iterator()
        L_0x012e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01fb
            java.lang.Object r4 = r3.next()
            s.d r4 = (p111s.C1693d) r4
            s.e r6 = r4.f5157d
            r7 = 1
            int r9 = r17 + 1
            boolean r7 = m4887a(r6)
            boolean r11 = r6.mo5943z()
            if (r11 == 0) goto L_0x0153
            if (r7 == 0) goto L_0x0153
            t.b$a r11 = new t.b$a
            r11.<init>()
            p111s.C1696f.m4738Z(r6, r1, r11, r5)
        L_0x0153:
            s.d r11 = r6.f5180I
            if (r4 != r11) goto L_0x0161
            s.d r13 = r6.f5182K
            s.d r13 = r13.f5159f
            if (r13 == 0) goto L_0x0161
            boolean r13 = r13.f5156c
            if (r13 != 0) goto L_0x016d
        L_0x0161:
            s.d r13 = r6.f5182K
            if (r4 != r13) goto L_0x016f
            s.d r11 = r11.f5159f
            if (r11 == 0) goto L_0x016f
            boolean r11 = r11.f5156c
            if (r11 == 0) goto L_0x016f
        L_0x016d:
            r11 = 1
            goto L_0x0170
        L_0x016f:
            r11 = r5
        L_0x0170:
            int r13 = r6.mo5930m()
            if (r13 != r12) goto L_0x01b1
            if (r7 == 0) goto L_0x0179
            goto L_0x01b1
        L_0x0179:
            int r4 = r6.mo5930m()
            if (r4 != r12) goto L_0x01ae
            int r4 = r6.f5234u
            if (r4 < 0) goto L_0x01ae
            int r4 = r6.f5233t
            if (r4 < 0) goto L_0x01ae
            int r4 = r6.f5213h0
            if (r4 == r10) goto L_0x0197
            int r4 = r6.f5230q
            if (r4 != 0) goto L_0x01ae
            float r4 = r6.f5195X
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x012e
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            boolean r4 = r6.mo5941x()
            if (r4 != 0) goto L_0x012e
            boolean r4 = r6.f5177F
            if (r4 != 0) goto L_0x012e
            if (r11 == 0) goto L_0x012e
            boolean r4 = r6.mo5941x()
            if (r4 != 0) goto L_0x012e
            m4890d(r9, r0, r1, r6, r2)
            goto L_0x012e
        L_0x01ae:
            r7 = 0
            goto L_0x012e
        L_0x01b1:
            r7 = 0
            boolean r13 = r6.mo5943z()
            if (r13 == 0) goto L_0x01ba
            goto L_0x012e
        L_0x01ba:
            s.d r13 = r6.f5180I
            if (r4 != r13) goto L_0x01d2
            s.d r14 = r6.f5182K
            s.d r14 = r14.f5159f
            if (r14 != 0) goto L_0x01d2
            int r4 = r13.mo5899d()
            int r4 = r4 + r8
            int r11 = r6.mo5935r()
            int r11 = r11 + r4
            r6.mo5911G(r4, r11)
            goto L_0x01e9
        L_0x01d2:
            s.d r14 = r6.f5182K
            if (r4 != r14) goto L_0x01ee
            s.d r4 = r13.f5159f
            if (r4 != 0) goto L_0x01ee
            int r4 = r14.mo5899d()
            int r4 = r8 - r4
            int r11 = r6.mo5935r()
            int r11 = r4 - r11
            r6.mo5911G(r11, r4)
        L_0x01e9:
            m4888b(r9, r6, r1, r2)
            goto L_0x012e
        L_0x01ee:
            if (r11 == 0) goto L_0x012e
            boolean r4 = r6.mo5941x()
            if (r4 != 0) goto L_0x012e
            m4889c(r9, r1, r6, r2)
            goto L_0x012e
        L_0x01fb:
            r1 = 1
            r0.f5220l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1756i.m4888b(int, s.e, t.b$b, boolean):void");
    }

    /* renamed from: c */
    public static void m4889c(int i, C1746b.C1748b bVar, C1695e eVar, boolean z) {
        float f = eVar.f5207e0;
        int c = eVar.f5180I.f5159f.mo5898c();
        int c2 = eVar.f5182K.f5159f.mo5898c();
        int d = eVar.f5180I.mo5899d() + c;
        int d2 = c2 - eVar.f5182K.mo5899d();
        if (c == c2) {
            f = 0.5f;
        } else {
            c = d;
            c2 = d2;
        }
        int r = eVar.mo5935r();
        int i2 = (c2 - c) - r;
        if (c > c2) {
            i2 = (c - c2) - r;
        }
        int i3 = ((int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2))) + c;
        int i4 = i3 + r;
        if (c > c2) {
            i4 = i3 - r;
        }
        eVar.mo5911G(i3, i4);
        m4888b(i + 1, eVar, bVar, z);
    }

    /* renamed from: d */
    public static void m4890d(int i, C1695e eVar, C1746b.C1748b bVar, C1695e eVar2, boolean z) {
        float f = eVar2.f5207e0;
        int d = eVar2.f5180I.mo5899d() + eVar2.f5180I.f5159f.mo5898c();
        int c = eVar2.f5182K.f5159f.mo5898c() - eVar2.f5182K.mo5899d();
        if (c >= d) {
            int r = eVar2.mo5935r();
            if (eVar2.f5213h0 != 8) {
                int i2 = eVar2.f5230q;
                if (i2 == 2) {
                    if (!(eVar instanceof C1696f)) {
                        eVar = eVar.f5192U;
                    }
                    r = (int) (eVar2.f5207e0 * 0.5f * ((float) eVar.mo5935r()));
                } else if (i2 == 0) {
                    r = c - d;
                }
                r = Math.max(eVar2.f5233t, r);
                int i3 = eVar2.f5234u;
                if (i3 > 0) {
                    r = Math.min(i3, r);
                }
            }
            int i4 = d + ((int) ((f * ((float) ((c - d) - r))) + 0.5f));
            eVar2.mo5911G(i4, r + i4);
            m4888b(i + 1, eVar2, bVar, z);
        }
    }

    /* renamed from: e */
    public static void m4891e(int i, C1746b.C1748b bVar, C1695e eVar) {
        float f = eVar.f5209f0;
        int c = eVar.f5181J.f5159f.mo5898c();
        int c2 = eVar.f5183L.f5159f.mo5898c();
        int d = eVar.f5181J.mo5899d() + c;
        int d2 = c2 - eVar.f5183L.mo5899d();
        if (c == c2) {
            f = 0.5f;
        } else {
            c = d;
            c2 = d2;
        }
        int l = eVar.mo5929l();
        int i2 = (c2 - c) - l;
        if (c > c2) {
            i2 = (c - c2) - l;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = c + i3;
        int i5 = i4 + l;
        if (c > c2) {
            i4 = c - i3;
            i5 = i4 - l;
        }
        eVar.mo5912H(i4, i5);
        m4893g(i + 1, eVar, bVar);
    }

    /* renamed from: f */
    public static void m4892f(int i, C1695e eVar, C1746b.C1748b bVar, C1695e eVar2) {
        float f = eVar2.f5209f0;
        int d = eVar2.f5181J.mo5899d() + eVar2.f5181J.f5159f.mo5898c();
        int c = eVar2.f5183L.f5159f.mo5898c() - eVar2.f5183L.mo5899d();
        if (c >= d) {
            int l = eVar2.mo5929l();
            if (eVar2.f5213h0 != 8) {
                int i2 = eVar2.f5231r;
                if (i2 == 2) {
                    if (!(eVar instanceof C1696f)) {
                        eVar = eVar.f5192U;
                    }
                    l = (int) (f * 0.5f * ((float) eVar.mo5929l()));
                } else if (i2 == 0) {
                    l = c - d;
                }
                l = Math.max(eVar2.f5236w, l);
                int i3 = eVar2.f5237x;
                if (i3 > 0) {
                    l = Math.min(i3, l);
                }
            }
            int i4 = d + ((int) ((f * ((float) ((c - d) - l))) + 0.5f));
            eVar2.mo5912H(i4, l + i4);
            m4893g(i + 1, eVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r15 = r12.f5183L.f5159f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        r8 = r14.f5159f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4893g(int r16, p111s.C1695e r17, p117t.C1746b.C1748b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f5222m
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = f5385c
            r3 = 1
            int r2 = r2 + r3
            f5385c = r2
            boolean r2 = r0 instanceof p111s.C1696f
            r4 = 0
            if (r2 != 0) goto L_0x0028
            boolean r2 = r17.mo5943z()
            if (r2 == 0) goto L_0x0028
            boolean r2 = m4887a(r17)
            if (r2 == 0) goto L_0x0028
            t.b$a r2 = new t.b$a
            r2.<init>()
            p111s.C1696f.m4738Z(r0, r1, r2, r4)
        L_0x0028:
            s.d$a r2 = p111s.C1693d.C1694a.TOP
            s.d r2 = r0.mo5926i(r2)
            s.d$a r5 = p111s.C1693d.C1694a.BOTTOM
            s.d r5 = r0.mo5926i(r5)
            int r6 = r2.mo5898c()
            int r7 = r5.mo5898c()
            java.util.HashSet<s.d> r8 = r2.f5154a
            r9 = 0
            r10 = 8
            r11 = 3
            if (r8 == 0) goto L_0x0113
            boolean r2 = r2.f5156c
            if (r2 == 0) goto L_0x0113
            java.util.Iterator r2 = r8.iterator()
        L_0x004c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r2.next()
            s.d r8 = (p111s.C1693d) r8
            s.e r12 = r8.f5157d
            int r13 = r16 + 1
            boolean r14 = m4887a(r12)
            boolean r15 = r12.mo5943z()
            if (r15 == 0) goto L_0x0070
            if (r14 == 0) goto L_0x0070
            t.b$a r15 = new t.b$a
            r15.<init>()
            p111s.C1696f.m4738Z(r12, r1, r15, r4)
        L_0x0070:
            int r15 = r12.mo5934q()
            if (r15 != r11) goto L_0x00c8
            if (r14 == 0) goto L_0x0079
            goto L_0x00c8
        L_0x0079:
            int r14 = r12.mo5934q()
            if (r14 != r11) goto L_0x0110
            int r14 = r12.f5237x
            if (r14 < 0) goto L_0x0110
            int r14 = r12.f5236w
            if (r14 < 0) goto L_0x0110
            int r14 = r12.f5213h0
            if (r14 == r10) goto L_0x0095
            int r14 = r12.f5231r
            if (r14 != 0) goto L_0x0110
            float r14 = r12.f5195X
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0110
        L_0x0095:
            boolean r14 = r12.mo5942y()
            if (r14 != 0) goto L_0x0110
            boolean r14 = r12.f5177F
            if (r14 != 0) goto L_0x0110
            s.d r14 = r12.f5181J
            if (r8 != r14) goto L_0x00ad
            s.d r15 = r12.f5183L
            s.d r15 = r15.f5159f
            if (r15 == 0) goto L_0x00ad
            boolean r15 = r15.f5156c
            if (r15 != 0) goto L_0x00b9
        L_0x00ad:
            s.d r15 = r12.f5183L
            if (r8 != r15) goto L_0x00bb
            s.d r8 = r14.f5159f
            if (r8 == 0) goto L_0x00bb
            boolean r8 = r8.f5156c
            if (r8 == 0) goto L_0x00bb
        L_0x00b9:
            r8 = r3
            goto L_0x00bc
        L_0x00bb:
            r8 = r4
        L_0x00bc:
            if (r8 == 0) goto L_0x0110
            boolean r8 = r12.mo5942y()
            if (r8 != 0) goto L_0x0110
            m4892f(r13, r0, r1, r12)
            goto L_0x0110
        L_0x00c8:
            boolean r14 = r12.mo5943z()
            if (r14 == 0) goto L_0x00d0
            goto L_0x004c
        L_0x00d0:
            s.d r14 = r12.f5181J
            if (r8 != r14) goto L_0x00e8
            s.d r15 = r12.f5183L
            s.d r15 = r15.f5159f
            if (r15 != 0) goto L_0x00e8
            int r8 = r14.mo5899d()
            int r8 = r8 + r6
            int r14 = r12.mo5929l()
            int r14 = r14 + r8
            r12.mo5912H(r8, r14)
            goto L_0x00ff
        L_0x00e8:
            s.d r15 = r12.f5183L
            if (r8 != r15) goto L_0x0103
            s.d r3 = r15.f5159f
            if (r3 != 0) goto L_0x0103
            int r3 = r15.mo5899d()
            int r3 = r6 - r3
            int r8 = r12.mo5929l()
            int r8 = r3 - r8
            r12.mo5912H(r8, r3)
        L_0x00ff:
            m4893g(r13, r12, r1)
            goto L_0x0110
        L_0x0103:
            if (r8 != r14) goto L_0x0110
            s.d r3 = r15.f5159f
            if (r3 == 0) goto L_0x0110
            boolean r3 = r3.f5156c
            if (r3 == 0) goto L_0x0110
            m4891e(r13, r1, r12)
        L_0x0110:
            r3 = 1
            goto L_0x004c
        L_0x0113:
            boolean r2 = r0 instanceof p111s.C1697g
            if (r2 == 0) goto L_0x0118
            return
        L_0x0118:
            java.util.HashSet<s.d> r2 = r5.f5154a
            if (r2 == 0) goto L_0x01e9
            boolean r3 = r5.f5156c
            if (r3 == 0) goto L_0x01e9
            java.util.Iterator r2 = r2.iterator()
        L_0x0124:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01e9
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r5 = r3.f5157d
            int r6 = r16 + 1
            boolean r8 = m4887a(r5)
            boolean r12 = r5.mo5943z()
            if (r12 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            t.b$a r12 = new t.b$a
            r12.<init>()
            p111s.C1696f.m4738Z(r5, r1, r12, r4)
        L_0x0148:
            s.d r12 = r5.f5181J
            if (r3 != r12) goto L_0x0156
            s.d r13 = r5.f5183L
            s.d r13 = r13.f5159f
            if (r13 == 0) goto L_0x0156
            boolean r13 = r13.f5156c
            if (r13 != 0) goto L_0x0162
        L_0x0156:
            s.d r13 = r5.f5183L
            if (r3 != r13) goto L_0x0164
            s.d r12 = r12.f5159f
            if (r12 == 0) goto L_0x0164
            boolean r12 = r12.f5156c
            if (r12 == 0) goto L_0x0164
        L_0x0162:
            r12 = 1
            goto L_0x0165
        L_0x0164:
            r12 = r4
        L_0x0165:
            int r13 = r5.mo5934q()
            if (r13 != r11) goto L_0x01a0
            if (r8 == 0) goto L_0x016e
            goto L_0x01a0
        L_0x016e:
            int r3 = r5.mo5934q()
            if (r3 != r11) goto L_0x0124
            int r3 = r5.f5237x
            if (r3 < 0) goto L_0x0124
            int r3 = r5.f5236w
            if (r3 < 0) goto L_0x0124
            int r3 = r5.f5213h0
            if (r3 == r10) goto L_0x018a
            int r3 = r5.f5231r
            if (r3 != 0) goto L_0x0124
            float r3 = r5.f5195X
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0124
        L_0x018a:
            boolean r3 = r5.mo5942y()
            if (r3 != 0) goto L_0x0124
            boolean r3 = r5.f5177F
            if (r3 != 0) goto L_0x0124
            if (r12 == 0) goto L_0x0124
            boolean r3 = r5.mo5942y()
            if (r3 != 0) goto L_0x0124
            m4892f(r6, r0, r1, r5)
            goto L_0x0124
        L_0x01a0:
            boolean r8 = r5.mo5943z()
            if (r8 == 0) goto L_0x01a8
            goto L_0x0124
        L_0x01a8:
            s.d r8 = r5.f5181J
            if (r3 != r8) goto L_0x01c0
            s.d r13 = r5.f5183L
            s.d r13 = r13.f5159f
            if (r13 != 0) goto L_0x01c0
            int r3 = r8.mo5899d()
            int r3 = r3 + r7
            int r8 = r5.mo5929l()
            int r8 = r8 + r3
            r5.mo5912H(r3, r8)
            goto L_0x01d7
        L_0x01c0:
            s.d r13 = r5.f5183L
            if (r3 != r13) goto L_0x01dc
            s.d r3 = r8.f5159f
            if (r3 != 0) goto L_0x01dc
            int r3 = r13.mo5899d()
            int r3 = r7 - r3
            int r8 = r5.mo5929l()
            int r8 = r3 - r8
            r5.mo5912H(r8, r3)
        L_0x01d7:
            m4893g(r6, r5, r1)
            goto L_0x0124
        L_0x01dc:
            if (r12 == 0) goto L_0x0124
            boolean r3 = r5.mo5942y()
            if (r3 != 0) goto L_0x0124
            m4891e(r6, r1, r5)
            goto L_0x0124
        L_0x01e9:
            s.d$a r2 = p111s.C1693d.C1694a.BASELINE
            s.d r2 = r0.mo5926i(r2)
            java.util.HashSet<s.d> r3 = r2.f5154a
            if (r3 == 0) goto L_0x0264
            boolean r3 = r2.f5156c
            if (r3 == 0) goto L_0x0264
            int r3 = r2.mo5898c()
            java.util.HashSet<s.d> r2 = r2.f5154a
            java.util.Iterator r2 = r2.iterator()
        L_0x0201:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0264
            java.lang.Object r5 = r2.next()
            s.d r5 = (p111s.C1693d) r5
            s.e r6 = r5.f5157d
            r7 = 1
            int r8 = r16 + 1
            boolean r7 = m4887a(r6)
            boolean r9 = r6.mo5943z()
            if (r9 == 0) goto L_0x0226
            if (r7 == 0) goto L_0x0226
            t.b$a r9 = new t.b$a
            r9.<init>()
            p111s.C1696f.m4738Z(r6, r1, r9, r4)
        L_0x0226:
            int r9 = r6.mo5934q()
            if (r9 != r11) goto L_0x022e
            if (r7 == 0) goto L_0x0201
        L_0x022e:
            boolean r7 = r6.mo5943z()
            if (r7 == 0) goto L_0x0235
            goto L_0x0201
        L_0x0235:
            s.d r7 = r6.f5184M
            if (r5 != r7) goto L_0x0201
            int r5 = r5.mo5899d()
            int r5 = r5 + r3
            boolean r7 = r6.f5175D
            if (r7 != 0) goto L_0x0244
            r5 = 1
            goto L_0x0260
        L_0x0244:
            int r7 = r6.f5201b0
            int r7 = r5 - r7
            int r9 = r6.f5194W
            int r9 = r9 + r7
            r6.f5199a0 = r7
            s.d r10 = r6.f5181J
            r10.mo5905j(r7)
            s.d r7 = r6.f5183L
            r7.mo5905j(r9)
            s.d r7 = r6.f5184M
            r7.f5155b = r5
            r5 = 1
            r7.f5156c = r5
            r6.f5218k = r5
        L_0x0260:
            m4893g(r8, r6, r1)
            goto L_0x0201
        L_0x0264:
            r5 = 1
            r0.f5222m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1756i.m4893g(int, s.e, t.b$b):void");
    }
}
