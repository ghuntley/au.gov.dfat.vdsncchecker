package p155j$.time.temporal;

import p155j$.time.C2230d;
import p155j$.time.C2231e;
import p155j$.time.LocalDate;
import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;

/* renamed from: j$.time.temporal.h */
enum C2292h implements C2300p {
    WEEK_OF_WEEK_BASED_YEAR,
    WEEK_BASED_YEAR;
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f6545a = null;

    static {
        f6545a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    C2292h(C2287c cVar) {
    }

    /* renamed from: n */
    static void m6084n(C2296l lVar) {
        if (!((C2223a) C2228f.m5757k(lVar)).equals(C2229g.f6372a)) {
            throw new C2230d("Resolve requires IsoChronology");
        }
    }

    /* renamed from: o */
    static C2282B m6085o(LocalDate localDate) {
        return C2282B.m6009i(1, (long) m6090t(m6089s(localDate)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.mo6807t())) == false) goto L_0x005a;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m6086p(p155j$.time.LocalDate r5) {
        /*
            j$.time.e r0 = r5.mo6804q()
            int r0 = r0.ordinal()
            int r1 = r5.mo6805r()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x003f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.LocalDate r5 = r5.mo6787H(r0)
            r0 = -1
            j$.time.LocalDate r5 = r5.mo6783C(r0)
            int r5 = m6089s(r5)
            int r5 = m6090t(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.B r5 = p155j$.time.temporal.C2282B.m6009i(r2, r0)
            long r0 = r5.mo7012d()
            int r5 = (int) r0
            goto L_0x005b
        L_0x003f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0059
            if (r0 == r3) goto L_0x0055
            r3 = -2
            if (r0 != r3) goto L_0x0053
            boolean r5 = r5.mo6807t()
            if (r5 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.temporal.C2292h.m6086p(j$.time.LocalDate):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static int m6089s(LocalDate localDate) {
        int s = localDate.mo6806s();
        int r = localDate.mo6805r();
        if (r <= 3) {
            return r - localDate.mo6804q().ordinal() < -2 ? s - 1 : s;
        }
        if (r < 363) {
            return s;
        }
        return ((r - 363) - (localDate.mo6807t() ? 1 : 0)) - localDate.mo6804q().ordinal() >= 0 ? s + 1 : s;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static int m6090t(int i) {
        LocalDate v = LocalDate.m5671v(i, 1, 1);
        if (v.mo6804q() != C2231e.THURSDAY) {
            return (v.mo6804q() != C2231e.WEDNESDAY || !v.mo6807t()) ? 52 : 53;
        }
        return 53;
    }

    /* renamed from: c */
    public boolean mo7020c() {
        return true;
    }

    /* renamed from: e */
    public C2282B mo7022e(C2296l lVar) {
        return mo7025i();
    }

    /* renamed from: l */
    public boolean mo7027l() {
        return false;
    }
}
