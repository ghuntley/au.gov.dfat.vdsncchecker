package p155j$.time;

import java.io.Serializable;
import p155j$.time.format.DateTimeFormatter;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2296l;
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
import p155j$.time.temporal.C2310z;

/* renamed from: j$.time.h */
public final class C2270h implements C2295k, C2297m, Comparable, Serializable {

    /* renamed from: c */
    public static final C2270h f6490c = new C2270h(0, 0);

    /* renamed from: a */
    private final long f6491a;

    /* renamed from: b */
    private final int f6492b;

    static {
        m5931s(-31557014167219200L, 0);
        m5931s(31556889864403199L, 999999999);
    }

    private C2270h(long j, int i) {
        this.f6491a = j;
        this.f6492b = i;
    }

    /* renamed from: m */
    private static C2270h m5927m(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f6490c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new C2270h(j, i);
        }
        throw new C2230d("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: n */
    public static C2270h m5928n(C2296l lVar) {
        if (lVar instanceof C2270h) {
            return (C2270h) lVar;
        }
        try {
            return m5931s(lVar.mo6795f(C2285a.INSTANT_SECONDS), (long) lVar.mo6789b(C2285a.NANO_OF_SECOND));
        } catch (C2230d e) {
            throw new C2230d("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    /* renamed from: q */
    public static C2270h m5929q(long j) {
        return m5927m(Math.floorDiv(j, 1000), ((int) Math.floorMod(j, 1000)) * 1000000);
    }

    /* renamed from: r */
    public static C2270h m5930r(long j) {
        return m5927m(j, 0);
    }

    /* renamed from: s */
    public static C2270h m5931s(long j, long j2) {
        return m5927m(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    /* renamed from: t */
    private C2270h m5932t(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m5931s(Math.addExact(Math.addExact(this.f6491a, j), j2 / 1000000000), ((long) this.f6492b) + (j2 % 1000000000));
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return super.mo6799i(pVar).mo7010a(pVar.mo7023f(this), pVar);
        }
        int i = C2269g.f6488a[((C2285a) pVar).ordinal()];
        if (i == 1) {
            return this.f6492b;
        }
        if (i == 2) {
            return this.f6492b / 1000;
        }
        if (i == 3) {
            return this.f6492b / 1000000;
        }
        if (i == 4) {
            C2285a.INSTANT_SECONDS.mo7038m(this.f6491a);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return pVar instanceof C2285a ? pVar == C2285a.INSTANT_SECONDS || pVar == C2285a.NANO_OF_SECOND || pVar == C2285a.MICRO_OF_SECOND || pVar == C2285a.MILLI_OF_SECOND : pVar != null && pVar.mo7026j(this);
    }

    public int compareTo(Object obj) {
        C2270h hVar = (C2270h) obj;
        int compare = Long.compare(this.f6491a, hVar.f6491a);
        return compare != 0 ? compare : this.f6492b - hVar.f6492b;
    }

    /* renamed from: d */
    public C2295k mo6792d(C2297m mVar) {
        return (C2270h) ((LocalDate) mVar).mo6801l(this);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2303s.f6556a) {
            return C2286b.NANOS;
        }
        if (yVar == C2302r.f6555a || yVar == C2301q.f6554a || yVar == C2305u.f6558a || yVar == C2304t.f6557a || yVar == C2306v.f6559a || yVar == C2307w.f6560a) {
            return null;
        }
        return yVar.mo6895a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2270h)) {
            return false;
        }
        C2270h hVar = (C2270h) obj;
        return this.f6491a == hVar.f6491a && this.f6492b == hVar.f6492b;
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        int i;
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        int i2 = C2269g.f6488a[((C2285a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.f6492b;
        } else if (i2 == 2) {
            i = this.f6492b / 1000;
        } else if (i2 == 3) {
            i = this.f6492b / 1000000;
        } else if (i2 == 4) {
            return this.f6491a;
        } else {
            throw new C2281A("Unsupported field: " + pVar);
        }
        return (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r3 != r2.f6492b) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r3 != r2.f6492b) goto L_0x004f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.temporal.C2295k mo6797g(p155j$.time.temporal.C2300p r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p155j$.time.temporal.C2285a
            if (r0 == 0) goto L_0x0067
            r0 = r3
            j$.time.temporal.a r0 = (p155j$.time.temporal.C2285a) r0
            r0.mo7039n(r4)
            int[] r1 = p155j$.time.C2269g.f6488a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 2
            if (r0 == r1) goto L_0x0048
            r1 = 3
            if (r0 == r1) goto L_0x003e
            r1 = 4
            if (r0 != r1) goto L_0x0027
            long r0 = r2.f6491a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            int r3 = r2.f6492b
            goto L_0x0051
        L_0x0027:
            j$.time.temporal.A r4 = new j$.time.temporal.A
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported field: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x003e:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f6492b
            if (r3 == r4) goto L_0x0065
            goto L_0x004f
        L_0x0048:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.f6492b
            if (r3 == r4) goto L_0x0065
        L_0x004f:
            long r4 = r2.f6491a
        L_0x0051:
            j$.time.h r3 = m5927m(r4, r3)
            goto L_0x006d
        L_0x0056:
            int r3 = r2.f6492b
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            long r0 = r2.f6491a
            int r3 = (int) r4
            j$.time.h r3 = m5927m(r0, r3)
            goto L_0x006d
        L_0x0065:
            r3 = r2
            goto L_0x006d
        L_0x0067:
            j$.time.temporal.k r3 = r3.mo7021d(r2, r4)
            j$.time.h r3 = (p155j$.time.C2270h) r3
        L_0x006d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.C2270h.mo6797g(j$.time.temporal.p, long):j$.time.temporal.k");
    }

    public int hashCode() {
        long j = this.f6491a;
        return (this.f6492b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return super.mo6799i(pVar);
    }

    /* renamed from: j */
    public C2295k mo6800j(long j, C2310z zVar) {
        long j2;
        if (!(zVar instanceof C2286b)) {
            return (C2270h) zVar.mo7042d(this, j);
        }
        switch (C2269g.f6489b[((C2286b) zVar).ordinal()]) {
            case 1:
                return m5932t(0, j);
            case 2:
                return m5932t(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m5932t(j / 1000, (j % 1000) * 1000000);
            case 4:
                return m5932t(j, 0);
            case 5:
                j2 = 60;
                break;
            case 6:
                j2 = 3600;
                break;
            case 7:
                j2 = 43200;
                break;
            case 8:
                j2 = 86400;
                break;
            default:
                throw new C2281A("Unsupported unit: " + zVar);
        }
        return mo6973u(Math.multiplyExact(j, j2));
    }

    /* renamed from: l */
    public int mo6969l(C2270h hVar) {
        int compare = Long.compare(this.f6491a, hVar.f6491a);
        return compare != 0 ? compare : this.f6492b - hVar.f6492b;
    }

    /* renamed from: o */
    public long mo6970o() {
        return this.f6491a;
    }

    /* renamed from: p */
    public int mo6971p() {
        return this.f6492b;
    }

    public String toString() {
        return DateTimeFormatter.f6388i.mo6883a(this);
    }

    /* renamed from: u */
    public C2270h mo6973u(long j) {
        return m5932t(j, 0);
    }

    /* renamed from: v */
    public long mo6974v() {
        long multiplyExact;
        int i;
        long j = this.f6491a;
        if (j >= 0 || this.f6492b <= 0) {
            multiplyExact = Math.multiplyExact(j, 1000);
            i = this.f6492b / 1000000;
        } else {
            multiplyExact = Math.multiplyExact(j + 1, 1000);
            i = (this.f6492b / 1000000) - 1000;
        }
        return Math.addExact(multiplyExact, (long) i);
    }
}
