package p155j$.time.temporal;

import p155j$.time.C2232f;

/* renamed from: j$.time.temporal.i */
enum C2293i implements C2310z {
    WEEK_BASED_YEARS("WeekBasedYears", C2232f.m5770f(31556952)),
    QUARTER_YEARS("QuarterYears", C2232f.m5770f(7889238));
    

    /* renamed from: a */
    private final String f6548a;

    private C2293i(String str, C2232f fVar) {
        this.f6548a = str;
    }

    /* renamed from: c */
    public boolean mo7041c() {
        return true;
    }

    /* renamed from: d */
    public C2295k mo7042d(C2295k kVar, long j) {
        int i = C2287c.f6544a[ordinal()];
        if (i == 1) {
            C2300p pVar = C2294j.f6551c;
            return kVar.mo6797g(pVar, Math.addExact((long) kVar.mo6789b(pVar), j));
        } else if (i == 2) {
            return kVar.mo6800j(j / 256, C2286b.YEARS).mo6800j((j % 256) * 3, C2286b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public String toString() {
        return this.f6548a;
    }
}
