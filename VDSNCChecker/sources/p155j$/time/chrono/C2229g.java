package p155j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.g */
public final class C2229g extends C2223a implements Serializable {

    /* renamed from: a */
    public static final C2229g f6372a = new C2229g();

    private C2229g() {
    }

    /* renamed from: e */
    public boolean mo6853e(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r2 > 0) goto L_0x00a9;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.chrono.C2224b mo6854f(java.util.Map r16, p155j$.time.format.C2238F r17) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            r1 = r17
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.EPOCH_DAY
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x001d
            java.lang.Object r0 = r0.remove(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.LocalDate r0 = p155j$.time.LocalDate.m5672w(r0)
            goto L_0x04b6
        L_0x001d:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.PROLEPTIC_MONTH
            java.lang.Object r3 = r0.remove(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = 1
            if (r3 == 0) goto L_0x0051
            j$.time.format.F r6 = p155j$.time.format.C2238F.LENIENT
            if (r1 == r6) goto L_0x0034
            long r6 = r3.longValue()
            r2.mo7039n(r6)
        L_0x0034:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.MONTH_OF_YEAR
            long r6 = r3.longValue()
            r9 = 12
            long r6 = java.lang.Math.floorMod(r6, r9)
            long r6 = r6 + r4
            r15.mo6843c(r0, r2, r6)
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.YEAR
            long r6 = r3.longValue()
            long r6 = java.lang.Math.floorDiv(r6, r9)
            r15.mo6843c(r0, r2, r6)
        L_0x0051:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.YEAR_OF_ERA
            java.lang.Object r3 = r0.remove(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            r6 = 0
            if (r3 == 0) goto L_0x00e9
            j$.time.format.F r9 = p155j$.time.format.C2238F.LENIENT
            if (r1 == r9) goto L_0x0068
            long r9 = r3.longValue()
            r2.mo7039n(r9)
        L_0x0068:
            j$.time.temporal.a r9 = p155j$.time.temporal.C2285a.ERA
            java.lang.Object r9 = r0.remove(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L_0x00ad
            j$.time.temporal.a r9 = p155j$.time.temporal.C2285a.YEAR
            java.lang.Object r10 = r0.get(r9)
            java.lang.Long r10 = (java.lang.Long) r10
            j$.time.format.F r11 = p155j$.time.format.C2238F.STRICT
            if (r1 != r11) goto L_0x0091
            if (r10 == 0) goto L_0x008d
            long r10 = r10.longValue()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            long r10 = r3.longValue()
            if (r2 <= 0) goto L_0x00a0
            goto L_0x00a9
        L_0x008d:
            r0.put(r2, r3)
            goto L_0x00fe
        L_0x0091:
            if (r10 == 0) goto L_0x00a5
            long r10 = r10.longValue()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            long r10 = r3.longValue()
        L_0x00a0:
            long r10 = java.lang.Math.subtractExact(r4, r10)
            goto L_0x00a9
        L_0x00a5:
            long r10 = r3.longValue()
        L_0x00a9:
            r15.mo6843c(r0, r9, r10)
            goto L_0x00fe
        L_0x00ad:
            long r10 = r9.longValue()
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.YEAR
            long r9 = r3.longValue()
            goto L_0x00ce
        L_0x00bc:
            long r10 = r9.longValue()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00d2
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.YEAR
            long r9 = r3.longValue()
            long r9 = java.lang.Math.subtractExact(r4, r9)
        L_0x00ce:
            r15.mo6843c(r0, r2, r9)
            goto L_0x00fe
        L_0x00d2:
            j$.time.d r0 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid value for era: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.ERA
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r0.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            r2.mo7039n(r9)
        L_0x00fe:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.YEAR
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x04b5
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.MONTH_OF_YEAR
            boolean r9 = r0.containsKey(r3)
            r10 = 1
            if (r9 == 0) goto L_0x032f
            j$.time.temporal.a r9 = p155j$.time.temporal.C2285a.DAY_OF_MONTH
            boolean r11 = r0.containsKey(r9)
            if (r11 == 0) goto L_0x01b3
            java.lang.Object r11 = r0.remove(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r2 = r2.mo7038m(r11)
            j$.time.format.F r11 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r11) goto L_0x0153
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r6 = java.lang.Math.subtractExact(r6, r4)
            java.lang.Object r0 = r0.remove(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = java.lang.Math.subtractExact(r0, r4)
            j$.time.LocalDate r2 = p155j$.time.LocalDate.m5671v(r2, r10, r10)
            j$.time.LocalDate r2 = r2.mo6781A(r6)
            j$.time.LocalDate r0 = r2.mo6811z(r0)
            goto L_0x04b6
        L_0x0153:
            java.lang.Object r4 = r0.remove(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r3 = r3.mo7038m(r4)
            java.lang.Object r0 = r0.remove(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            int r0 = r9.mo7038m(r4)
            j$.time.format.F r4 = p155j$.time.format.C2238F.SMART
            if (r1 != r4) goto L_0x01ad
            r1 = 4
            if (r3 == r1) goto L_0x01a7
            r1 = 6
            if (r3 == r1) goto L_0x01a7
            r1 = 9
            if (r3 == r1) goto L_0x01a7
            r1 = 11
            if (r3 != r1) goto L_0x0182
            goto L_0x01a7
        L_0x0182:
            r1 = 2
            if (r3 != r1) goto L_0x01ad
            j$.time.m r1 = p155j$.time.C2275m.FEBRUARY
            long r4 = (long) r2
            int r9 = p155j$.time.C2277o.f6511a
            r11 = 3
            long r11 = r11 & r4
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x01a1
            r11 = 100
            long r11 = r4 % r11
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x01a2
            r11 = 400(0x190, double:1.976E-321)
            long r4 = r4 % r11
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r10 = 0
        L_0x01a2:
            int r1 = r1.mo6993n(r10)
            goto L_0x01a9
        L_0x01a7:
            r1 = 30
        L_0x01a9:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x01ad:
            j$.time.LocalDate r0 = p155j$.time.LocalDate.m5671v(r2, r3, r0)
            goto L_0x04b6
        L_0x01b3:
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_MONTH
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x032f
            j$.time.temporal.a r7 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_MONTH
            boolean r9 = r0.containsKey(r7)
            java.lang.String r11 = "Strict mode rejected resolved date as it is in a different month"
            if (r9 == 0) goto L_0x0275
            j$.time.temporal.B r9 = r2.mo7025i()
            java.lang.Object r12 = r0.remove(r2)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            int r2 = r9.mo7010a(r12, r2)
            j$.time.format.F r9 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r9) goto L_0x021d
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            long r11 = java.lang.Math.subtractExact(r11, r4)
            java.lang.Object r1 = r0.remove(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            long r13 = java.lang.Math.subtractExact(r13, r4)
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = java.lang.Math.subtractExact(r0, r4)
            j$.time.LocalDate r2 = p155j$.time.LocalDate.m5671v(r2, r10, r10)
            j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.MONTHS
            j$.time.LocalDate r2 = r2.mo6800j(r11, r3)
            j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.WEEKS
            j$.time.LocalDate r2 = r2.mo6800j(r13, r3)
            j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r0 = r2.mo6800j(r0, r3)
            goto L_0x04b6
        L_0x021d:
            j$.time.temporal.B r4 = r3.mo7025i()
            java.lang.Object r5 = r0.remove(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r12 = r5.longValue()
            int r4 = r4.mo7010a(r12, r3)
            j$.time.temporal.B r5 = r6.mo7025i()
            java.lang.Object r9 = r0.remove(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r5 = r5.mo7010a(r12, r6)
            j$.time.temporal.B r6 = r7.mo7025i()
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            int r0 = r6.mo7010a(r12, r7)
            j$.time.LocalDate r2 = p155j$.time.LocalDate.m5671v(r2, r4, r10)
            int r5 = r5 - r10
            int r5 = r5 * 7
            int r0 = r0 - r10
            int r0 = r0 + r5
            long r5 = (long) r0
            j$.time.temporal.b r0 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r0 = r2.mo6800j(r5, r0)
            j$.time.format.F r2 = p155j$.time.format.C2238F.STRICT
            if (r1 != r2) goto L_0x04b6
            int r1 = r0.mo6789b(r3)
            if (r1 != r4) goto L_0x026f
            goto L_0x04b6
        L_0x026f:
            j$.time.d r0 = new j$.time.d
            r0.<init>(r11)
            throw r0
        L_0x0275:
            j$.time.temporal.a r7 = p155j$.time.temporal.C2285a.DAY_OF_WEEK
            boolean r9 = r0.containsKey(r7)
            if (r9 == 0) goto L_0x032f
            j$.time.temporal.B r9 = r2.mo7025i()
            java.lang.Object r12 = r0.remove(r2)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            int r2 = r9.mo7010a(r12, r2)
            j$.time.format.F r9 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r9) goto L_0x02ca
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            long r11 = java.lang.Math.subtractExact(r11, r4)
            java.lang.Object r1 = r0.remove(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            long r13 = java.lang.Math.subtractExact(r13, r4)
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r6 = java.lang.Math.subtractExact(r0, r4)
            j$.time.LocalDate r1 = p155j$.time.LocalDate.m5671v(r2, r10, r10)
            r0 = r15
            r2 = r11
            r4 = r13
            j$.time.chrono.b r0 = r0.mo6845d(r1, r2, r4, r6)
            goto L_0x04b6
        L_0x02ca:
            j$.time.temporal.B r4 = r3.mo7025i()
            java.lang.Object r5 = r0.remove(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r12 = r5.longValue()
            int r4 = r4.mo7010a(r12, r3)
            j$.time.temporal.B r5 = r6.mo7025i()
            java.lang.Object r9 = r0.remove(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r5 = r5.mo7010a(r12, r6)
            j$.time.temporal.B r6 = r7.mo7025i()
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            int r0 = r6.mo7010a(r12, r7)
            j$.time.LocalDate r2 = p155j$.time.LocalDate.m5671v(r2, r4, r10)
            int r5 = r5 - r10
            int r5 = r5 * 7
            long r5 = (long) r5
            j$.time.temporal.b r7 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r2 = r2.mo6800j(r5, r7)
            j$.time.e r0 = p155j$.time.C2231e.m5760m(r0)
            j$.time.temporal.m r0 = p155j$.time.temporal.C2299o.m6105a(r0)
            j$.time.chrono.b r0 = r2.mo6786G(r0)
            j$.time.format.F r2 = p155j$.time.format.C2238F.STRICT
            if (r1 != r2) goto L_0x04b6
            r1 = r0
            j$.time.LocalDate r1 = (p155j$.time.LocalDate) r1
            int r1 = r1.mo6789b(r3)
            if (r1 != r4) goto L_0x0329
            goto L_0x04b6
        L_0x0329:
            j$.time.d r0 = new j$.time.d
            r0.<init>(r11)
            throw r0
        L_0x032f:
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.DAY_OF_YEAR
            boolean r6 = r0.containsKey(r3)
            if (r6 == 0) goto L_0x037f
            j$.time.temporal.B r6 = r2.mo7025i()
            java.lang.Object r7 = r0.remove(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            int r2 = r6.mo7010a(r11, r2)
            j$.time.format.F r6 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r6) goto L_0x0367
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = java.lang.Math.subtractExact(r0, r4)
            j$.time.LocalDate r2 = p155j$.time.LocalDate.m5673x(r2, r10)
            j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r0 = r2.mo6800j(r0, r3)
            goto L_0x04b6
        L_0x0367:
            j$.time.temporal.B r1 = r3.mo7025i()
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            int r0 = r1.mo7010a(r4, r3)
            j$.time.LocalDate r0 = p155j$.time.LocalDate.m5673x(r2, r0)
            goto L_0x04b6
        L_0x037f:
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_YEAR
            boolean r6 = r0.containsKey(r3)
            if (r6 == 0) goto L_0x04b5
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_YEAR
            boolean r7 = r0.containsKey(r6)
            java.lang.String r9 = "Strict mode rejected resolved date as it is in a different year"
            if (r7 == 0) goto L_0x041b
            j$.time.temporal.B r7 = r2.mo7025i()
            java.lang.Object r11 = r0.remove(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r7 = r7.mo7010a(r11, r2)
            j$.time.format.F r11 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r11) goto L_0x03d5
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.subtractExact(r1, r4)
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            long r3 = java.lang.Math.subtractExact(r11, r4)
            j$.time.LocalDate r0 = p155j$.time.LocalDate.m5673x(r7, r10)
            j$.time.temporal.b r5 = p155j$.time.temporal.C2286b.WEEKS
            j$.time.LocalDate r0 = r0.mo6800j(r1, r5)
            j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r0 = r0.mo6800j(r3, r1)
            goto L_0x04b6
        L_0x03d5:
            j$.time.temporal.B r4 = r3.mo7025i()
            java.lang.Object r5 = r0.remove(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            int r3 = r4.mo7010a(r11, r3)
            j$.time.temporal.B r4 = r6.mo7025i()
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            int r0 = r4.mo7010a(r11, r6)
            j$.time.LocalDate r4 = p155j$.time.LocalDate.m5673x(r7, r10)
            int r3 = r3 - r10
            int r3 = r3 * 7
            int r0 = r0 - r10
            int r0 = r0 + r3
            long r5 = (long) r0
            j$.time.temporal.b r0 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r0 = r4.mo6800j(r5, r0)
            j$.time.format.F r3 = p155j$.time.format.C2238F.STRICT
            if (r1 != r3) goto L_0x04b6
            int r1 = r0.mo6789b(r2)
            if (r1 != r7) goto L_0x0415
            goto L_0x04b6
        L_0x0415:
            j$.time.d r0 = new j$.time.d
            r0.<init>(r9)
            throw r0
        L_0x041b:
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.DAY_OF_WEEK
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x04b5
            j$.time.temporal.B r7 = r2.mo7025i()
            java.lang.Object r11 = r0.remove(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r7 = r7.mo7010a(r11, r2)
            j$.time.format.F r11 = p155j$.time.format.C2238F.LENIENT
            if (r1 != r11) goto L_0x0463
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r11 = java.lang.Math.subtractExact(r1, r4)
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r13 = java.lang.Math.subtractExact(r0, r4)
            j$.time.LocalDate r1 = p155j$.time.LocalDate.m5673x(r7, r10)
            r2 = 0
            r0 = r15
            r4 = r11
            r6 = r13
            j$.time.chrono.b r0 = r0.mo6845d(r1, r2, r4, r6)
            goto L_0x04b6
        L_0x0463:
            j$.time.temporal.B r4 = r3.mo7025i()
            java.lang.Object r5 = r0.remove(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            int r3 = r4.mo7010a(r11, r3)
            j$.time.temporal.B r4 = r6.mo7025i()
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            int r0 = r4.mo7010a(r11, r6)
            j$.time.LocalDate r4 = p155j$.time.LocalDate.m5673x(r7, r10)
            int r3 = r3 - r10
            int r3 = r3 * 7
            long r5 = (long) r3
            j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r3 = r4.mo6800j(r5, r3)
            j$.time.e r0 = p155j$.time.C2231e.m5760m(r0)
            j$.time.temporal.m r0 = p155j$.time.temporal.C2299o.m6105a(r0)
            j$.time.chrono.b r0 = r3.mo6786G(r0)
            j$.time.format.F r3 = p155j$.time.format.C2238F.STRICT
            if (r1 != r3) goto L_0x04b6
            r1 = r0
            j$.time.LocalDate r1 = (p155j$.time.LocalDate) r1
            int r1 = r1.mo6789b(r2)
            if (r1 != r7) goto L_0x04af
            goto L_0x04b6
        L_0x04af:
            j$.time.d r0 = new j$.time.d
            r0.<init>(r9)
            throw r0
        L_0x04b5:
            r0 = 0
        L_0x04b6:
            j$.time.LocalDate r0 = (p155j$.time.LocalDate) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.chrono.C2229g.mo6854f(java.util.Map, j$.time.format.F):j$.time.chrono.b");
    }
}
