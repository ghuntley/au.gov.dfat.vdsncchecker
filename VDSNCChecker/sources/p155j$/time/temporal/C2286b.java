package p155j$.time.temporal;

import p155j$.time.C2232f;

/* renamed from: j$.time.temporal.b */
public enum C2286b implements C2310z {
    NANOS("Nanos", C2232f.m5769e(1)),
    MICROS("Micros", C2232f.m5769e(1000)),
    MILLIS("Millis", C2232f.m5769e(1000000)),
    SECONDS("Seconds", C2232f.m5770f(1)),
    MINUTES("Minutes", C2232f.m5770f(60)),
    HOURS("Hours", C2232f.m5770f(3600)),
    HALF_DAYS("HalfDays", C2232f.m5770f(43200)),
    DAYS("Days", C2232f.m5770f(86400)),
    WEEKS("Weeks", C2232f.m5770f(604800)),
    MONTHS("Months", C2232f.m5770f(2629746)),
    YEARS("Years", C2232f.m5770f(31556952)),
    DECADES("Decades", C2232f.m5770f(315569520)),
    CENTURIES("Centuries", C2232f.m5770f(3155695200L)),
    MILLENNIA("Millennia", C2232f.m5770f(31556952000L)),
    ERAS("Eras", C2232f.m5770f(31556952000000000L)),
    FOREVER("Forever", C2232f.m5771g(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a */
    private final String f6543a;

    private C2286b(String str, C2232f fVar) {
        this.f6543a = str;
    }

    /* renamed from: c */
    public boolean mo7041c() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    /* renamed from: d */
    public C2295k mo7042d(C2295k kVar, long j) {
        return kVar.mo6800j(j, this);
    }

    public String toString() {
        return this.f6543a;
    }
}
