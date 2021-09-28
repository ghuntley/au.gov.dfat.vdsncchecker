package p155j$.time.temporal;

/* renamed from: j$.time.temporal.a */
public enum C2285a implements C2300p {
    NANO_OF_SECOND("NanoOfSecond", r4, r17, C2282B.m6009i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r27, C2282B.m6009i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r17, C2282B.m6009i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r27, C2282B.m6009i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r17, C2282B.m6009i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r27, C2282B.m6009i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r17, r32, C2282B.m6009i(0, 59), "second"),
    SECOND_OF_DAY("SecondOfDay", r17, r5, C2282B.m6009i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r32, r13, C2282B.m6009i(0, 59), "minute"),
    MINUTE_OF_DAY("MinuteOfDay", r32, r5, C2282B.m6009i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r13, r16, C2282B.m6009i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r16, C2282B.m6009i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r13, r24, C2282B.m6009i(0, 23), "hour"),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r27, C2282B.m6009i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r16, r24, C2282B.m6009i(0, 1), "dayperiod"),
    DAY_OF_WEEK("DayOfWeek", r23, r38, C2282B.m6009i(1, 7), "weekday"),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r5, C2282B.m6009i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r5, C2282B.m6009i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r23, r15, C2282B.m6010j(1, 28, 31), "day"),
    DAY_OF_YEAR("DayOfYear", r4, r42, C2282B.m6010j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r4, r44, C2282B.m6009i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r15, C2282B.m6010j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r42, C2282B.m6009i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r15, r42, C2282B.m6009i(1, 12), "month"),
    PROLEPTIC_MONTH("ProlepticMonth", r15, r44, C2282B.m6009i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r42, r5, C2282B.m6010j(1, 999999999, 1000000000)),
    YEAR("Year", r42, r24, C2282B.m6009i(-999999999, 999999999), "year"),
    ERA("Era", C2286b.ERAS, r24, C2282B.m6009i(0, 1), "era"),
    INSTANT_SECONDS("InstantSeconds", r4, r5, C2282B.m6009i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, C2282B.m6009i(-64800, 64800));
    

    /* renamed from: a */
    private final String f6540a;

    /* renamed from: b */
    private final C2282B f6541b;

    private C2285a(String str, C2310z zVar, C2310z zVar2, C2282B b) {
        this.f6540a = str;
        this.f6541b = b;
    }

    private C2285a(String str, C2310z zVar, C2310z zVar2, C2282B b, String str2) {
        this.f6540a = str;
        this.f6541b = b;
    }

    /* renamed from: c */
    public boolean mo7020c() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        return kVar.mo6797g(this, j);
    }

    /* renamed from: e */
    public C2282B mo7022e(C2296l lVar) {
        return lVar.mo6799i(this);
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        return lVar.mo6795f(this);
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return this.f6541b;
    }

    /* renamed from: j */
    public boolean mo7026j(C2296l lVar) {
        return lVar.mo6790c(this);
    }

    /* renamed from: l */
    public boolean mo7027l() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: m */
    public int mo7038m(long j) {
        return this.f6541b.mo7010a(j, this);
    }

    /* renamed from: n */
    public long mo7039n(long j) {
        this.f6541b.mo7011b(j, this);
        return j;
    }

    public String toString() {
        return this.f6540a;
    }
}
