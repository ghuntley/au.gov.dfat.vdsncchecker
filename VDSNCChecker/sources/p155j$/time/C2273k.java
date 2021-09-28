package p155j$.time;

import java.io.Serializable;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2301q;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2304t;
import p155j$.time.temporal.C2305u;
import p155j$.time.temporal.C2306v;
import p155j$.time.temporal.C2307w;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.k */
public final class C2273k implements C2295k, C2297m, Comparable, Serializable {

    /* renamed from: e */
    public static final C2273k f6496e;

    /* renamed from: f */
    public static final C2273k f6497f = new C2273k(23, 59, 59, 999999999);

    /* renamed from: g */
    public static final C2273k f6498g;

    /* renamed from: h */
    private static final C2273k[] f6499h = new C2273k[24];

    /* renamed from: a */
    private final byte f6500a;

    /* renamed from: b */
    private final byte f6501b;

    /* renamed from: c */
    private final byte f6502c;

    /* renamed from: d */
    private final int f6503d;

    static {
        int i = 0;
        while (true) {
            C2273k[] kVarArr = f6499h;
            if (i < kVarArr.length) {
                kVarArr[i] = new C2273k(i, 0, 0, 0);
                i++;
            } else {
                f6498g = kVarArr[0];
                C2273k kVar = kVarArr[12];
                f6496e = kVarArr[0];
                return;
            }
        }
    }

    private C2273k(int i, int i2, int i3, int i4) {
        this.f6500a = (byte) i;
        this.f6501b = (byte) i2;
        this.f6502c = (byte) i3;
        this.f6503d = i4;
    }

    /* renamed from: m */
    private static C2273k m5947m(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f6499h[i] : new C2273k(i, i2, i3, i4);
    }

    /* renamed from: n */
    private int m5948n(C2300p pVar) {
        switch (C2272j.f6494a[((C2285a) pVar).ordinal()]) {
            case 1:
                return this.f6503d;
            case 2:
                throw new C2281A("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f6503d / 1000;
            case 4:
                throw new C2281A("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f6503d / 1000000;
            case 6:
                return (int) (mo6988x() / 1000000);
            case 7:
                return this.f6502c;
            case 8:
                return mo6989y();
            case 9:
                return this.f6501b;
            case 10:
                return (this.f6500a * 60) + this.f6501b;
            case 11:
                return this.f6500a % 12;
            case 12:
                int i = this.f6500a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f6500a;
            case 14:
                byte b = this.f6500a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f6500a / 12;
            default:
                throw new C2281A("Unsupported field: " + pVar);
        }
    }

    /* renamed from: q */
    public static C2273k m5949q(int i, int i2) {
        C2285a.HOUR_OF_DAY.mo7039n((long) i);
        if (i2 == 0) {
            return f6499h[i];
        }
        C2285a.MINUTE_OF_HOUR.mo7039n((long) i2);
        return new C2273k(i, i2, 0, 0);
    }

    /* renamed from: r */
    public static C2273k m5950r(int i, int i2, int i3, int i4) {
        C2285a.HOUR_OF_DAY.mo7039n((long) i);
        C2285a.MINUTE_OF_HOUR.mo7039n((long) i2);
        C2285a.SECOND_OF_MINUTE.mo7039n((long) i3);
        C2285a.NANO_OF_SECOND.mo7039n((long) i4);
        return m5947m(i, i2, i3, i4);
    }

    /* renamed from: s */
    public static C2273k m5951s(long j) {
        C2285a.NANO_OF_DAY.mo7039n(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m5947m(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: A */
    public C2273k mo6975A(int i) {
        if (this.f6500a == i) {
            return this;
        }
        C2285a.HOUR_OF_DAY.mo7039n((long) i);
        return m5947m(i, this.f6501b, this.f6502c, this.f6503d);
    }

    /* renamed from: B */
    public C2273k mo6976B(int i) {
        if (this.f6503d == i) {
            return this;
        }
        C2285a.NANO_OF_SECOND.mo7039n((long) i);
        return m5947m(this.f6500a, this.f6501b, this.f6502c, i);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        return pVar instanceof C2285a ? m5948n(pVar) : super.mo6789b(pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return pVar instanceof C2285a ? pVar.mo7027l() : pVar != null && pVar.mo7026j(this);
    }

    /* renamed from: d */
    public C2295k mo6792d(C2297m mVar) {
        boolean z = mVar instanceof C2273k;
        Object obj = mVar;
        if (!z) {
            obj = ((LocalDate) mVar).mo6801l(this);
        }
        return (C2273k) obj;
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2302r.f6555a || yVar == C2301q.f6554a || yVar == C2305u.f6558a || yVar == C2304t.f6557a) {
            return null;
        }
        if (yVar == C2307w.f6560a) {
            return this;
        }
        if (yVar == C2306v.f6559a) {
            return null;
        }
        return yVar == C2303s.f6556a ? C2286b.NANOS : yVar.mo6895a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273k)) {
            return false;
        }
        C2273k kVar = (C2273k) obj;
        return this.f6500a == kVar.f6500a && this.f6501b == kVar.f6501b && this.f6502c == kVar.f6502c && this.f6503d == kVar.f6503d;
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        return pVar instanceof C2285a ? pVar == C2285a.NANO_OF_DAY ? mo6988x() : pVar == C2285a.MICRO_OF_DAY ? mo6988x() / 1000 : (long) m5948n(pVar) : pVar.mo7023f(this);
    }

    public int hashCode() {
        long x = mo6988x();
        return (int) (x ^ (x >>> 32));
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return super.mo6799i(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        r3 = r3 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return mo6983t(r3);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.temporal.C2295k mo6800j(long r3, p155j$.time.temporal.C2310z r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p155j$.time.temporal.C2286b
            if (r0 == 0) goto L_0x0054
            int[] r0 = p155j$.time.C2272j.f6495b
            r1 = r5
            j$.time.temporal.b r1 = (p155j$.time.temporal.C2286b) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x004f;
                case 2: goto L_0x0046;
                case 3: goto L_0x003e;
                case 4: goto L_0x0039;
                case 5: goto L_0x0034;
                case 6: goto L_0x002f;
                case 7: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.A r3 = new j$.time.temporal.A
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unsupported unit: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0029:
            r0 = 2
            long r3 = r3 % r0
            r0 = 12
            long r3 = r3 * r0
        L_0x002f:
            j$.time.k r3 = r2.mo6983t(r3)
            goto L_0x005a
        L_0x0034:
            j$.time.k r3 = r2.mo6985u(r3)
            goto L_0x005a
        L_0x0039:
            j$.time.k r3 = r2.mo6987w(r3)
            goto L_0x005a
        L_0x003e:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x004e
        L_0x0046:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r3 = r3 % r0
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x004e:
            long r3 = r3 * r0
        L_0x004f:
            j$.time.k r3 = r2.mo6986v(r3)
            goto L_0x005a
        L_0x0054:
            j$.time.temporal.k r3 = r5.mo7042d(r2, r3)
            j$.time.k r3 = (p155j$.time.C2273k) r3
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.C2273k.mo6800j(long, j$.time.temporal.z):j$.time.temporal.k");
    }

    /* renamed from: l */
    public int compareTo(C2273k kVar) {
        int compare = Integer.compare(this.f6500a, kVar.f6500a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f6501b, kVar.f6501b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f6502c, kVar.f6502c);
        return compare3 == 0 ? Integer.compare(this.f6503d, kVar.f6503d) : compare3;
    }

    /* renamed from: o */
    public int mo6981o() {
        return this.f6503d;
    }

    /* renamed from: p */
    public int mo6982p() {
        return this.f6502c;
    }

    /* renamed from: t */
    public C2273k mo6983t(long j) {
        return j == 0 ? this : m5947m(((((int) (j % 24)) + this.f6500a) + 24) % 24, this.f6501b, this.f6502c, this.f6503d);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f6500a;
        byte b2 = this.f6501b;
        byte b3 = this.f6502c;
        int i2 = this.f6503d;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public C2273k mo6985u(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f6500a * 60) + this.f6501b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m5947m(i2 / 60, i2 % 60, this.f6502c, this.f6503d);
    }

    /* renamed from: v */
    public C2273k mo6986v(long j) {
        if (j == 0) {
            return this;
        }
        long x = mo6988x();
        long j2 = (((j % 86400000000000L) + x) + 86400000000000L) % 86400000000000L;
        return x == j2 ? this : m5947m((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: w */
    public C2273k mo6987w(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f6501b * 60) + (this.f6500a * 3600) + this.f6502c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m5947m(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f6503d);
    }

    /* renamed from: x */
    public long mo6988x() {
        return (((long) this.f6502c) * 1000000000) + (((long) this.f6501b) * 60000000000L) + (((long) this.f6500a) * 3600000000000L) + ((long) this.f6503d);
    }

    /* renamed from: y */
    public int mo6989y() {
        return (this.f6501b * 60) + (this.f6500a * 3600) + this.f6502c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r7 = r7 - ((long) (r5.f6500a % 12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r7 = r7 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return mo6975A((int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return mo6983t(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return mo6976B(r6);
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.C2273k mo6797g(p155j$.time.temporal.C2300p r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p155j$.time.temporal.C2285a
            if (r0 == 0) goto L_0x00bc
            r0 = r6
            j$.time.temporal.a r0 = (p155j$.time.temporal.C2285a) r0
            r0.mo7039n(r7)
            int[] r1 = p155j$.time.C2272j.f6494a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r3 = 12
            switch(r0) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00a3;
                case 6: goto L_0x009f;
                case 7: goto L_0x0088;
                case 8: goto L_0x007d;
                case 9: goto L_0x0065;
                case 10: goto L_0x0057;
                case 11: goto L_0x004b;
                case 12: goto L_0x0046;
                case 13: goto L_0x003f;
                case 14: goto L_0x0038;
                case 15: goto L_0x0030;
                default: goto L_0x0019;
            }
        L_0x0019:
            j$.time.temporal.A r7 = new j$.time.temporal.A
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported field: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L_0x0030:
            byte r6 = r5.f6500a
            int r6 = r6 / 12
            long r0 = (long) r6
            long r7 = r7 - r0
            long r7 = r7 * r3
            goto L_0x0051
        L_0x0038:
            r3 = 24
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            r7 = r1
        L_0x003f:
            int r6 = (int) r7
            j$.time.k r6 = r5.mo6975A(r6)
            goto L_0x00c2
        L_0x0046:
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            r7 = r1
        L_0x004b:
            byte r6 = r5.f6500a
            int r6 = r6 % 12
            long r0 = (long) r6
            long r7 = r7 - r0
        L_0x0051:
            j$.time.k r6 = r5.mo6983t(r7)
            goto L_0x00c2
        L_0x0057:
            byte r6 = r5.f6500a
            int r6 = r6 * 60
            byte r0 = r5.f6501b
            int r6 = r6 + r0
            long r0 = (long) r6
            long r7 = r7 - r0
            j$.time.k r6 = r5.mo6985u(r7)
            goto L_0x00c2
        L_0x0065:
            int r6 = (int) r7
            byte r7 = r5.f6501b
            if (r7 != r6) goto L_0x006c
        L_0x006a:
            r6 = r5
            goto L_0x00c2
        L_0x006c:
            j$.time.temporal.a r7 = p155j$.time.temporal.C2285a.MINUTE_OF_HOUR
            long r0 = (long) r6
            r7.mo7039n(r0)
            byte r7 = r5.f6500a
            byte r8 = r5.f6502c
            int r0 = r5.f6503d
            j$.time.k r6 = m5947m(r7, r6, r8, r0)
            goto L_0x00c2
        L_0x007d:
            int r6 = r5.mo6989y()
            long r0 = (long) r6
            long r7 = r7 - r0
            j$.time.k r6 = r5.mo6987w(r7)
            goto L_0x00c2
        L_0x0088:
            int r6 = (int) r7
            byte r7 = r5.f6502c
            if (r7 != r6) goto L_0x008e
            goto L_0x006a
        L_0x008e:
            j$.time.temporal.a r7 = p155j$.time.temporal.C2285a.SECOND_OF_MINUTE
            long r0 = (long) r6
            r7.mo7039n(r0)
            byte r7 = r5.f6500a
            byte r8 = r5.f6501b
            int r0 = r5.f6503d
            j$.time.k r6 = m5947m(r7, r8, r6, r0)
            goto L_0x00c2
        L_0x009f:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x00ab
        L_0x00a3:
            int r6 = (int) r7
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r7
            goto L_0x00b7
        L_0x00a9:
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x00ab:
            long r7 = r7 * r0
            goto L_0x00b1
        L_0x00ad:
            int r6 = (int) r7
            int r6 = r6 * 1000
            goto L_0x00b7
        L_0x00b1:
            j$.time.k r6 = m5951s(r7)
            goto L_0x00c2
        L_0x00b6:
            int r6 = (int) r7
        L_0x00b7:
            j$.time.k r6 = r5.mo6976B(r6)
            goto L_0x00c2
        L_0x00bc:
            j$.time.temporal.k r6 = r6.mo7021d(r5, r7)
            j$.time.k r6 = (p155j$.time.C2273k) r6
        L_0x00c2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.C2273k.mo6797g(j$.time.temporal.p, long):j$.time.k");
    }
}
