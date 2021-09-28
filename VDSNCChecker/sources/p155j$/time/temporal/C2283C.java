package p155j$.time.temporal;

import java.util.Map;
import java.util.Objects;
import p155j$.time.C2220a;
import p155j$.time.C2230d;
import p155j$.time.LocalDate;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.format.C2238F;

/* renamed from: j$.time.temporal.C */
class C2283C implements C2300p {

    /* renamed from: f */
    private static final C2282B f6522f = C2282B.m6009i(1, 7);

    /* renamed from: g */
    private static final C2282B f6523g = C2282B.m6011k(0, 1, 4, 6);

    /* renamed from: h */
    private static final C2282B f6524h = C2282B.m6011k(0, 1, 52, 54);

    /* renamed from: i */
    private static final C2282B f6525i = C2282B.m6010j(1, 52, 53);

    /* renamed from: a */
    private final String f6526a;

    /* renamed from: b */
    private final C2284D f6527b;

    /* renamed from: c */
    private final C2310z f6528c;

    /* renamed from: d */
    private final C2310z f6529d;

    /* renamed from: e */
    private final C2282B f6530e;

    private C2283C(String str, C2284D d, C2310z zVar, C2310z zVar2, C2282B b) {
        this.f6526a = str;
        this.f6527b = d;
        this.f6528c = zVar;
        this.f6529d = zVar2;
        this.f6530e = b;
    }

    /* renamed from: a */
    private int m6019a(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* renamed from: b */
    private int m6020b(C2296l lVar) {
        return Math.floorMod(lVar.mo6789b(C2285a.DAY_OF_WEEK) - this.f6527b.mo7030e().mo6855l(), 7) + 1;
    }

    /* renamed from: h */
    private int m6021h(C2296l lVar) {
        int b = m6020b(lVar);
        int b2 = lVar.mo6789b(C2285a.YEAR);
        C2285a aVar = C2285a.DAY_OF_YEAR;
        int b3 = lVar.mo6789b(aVar);
        int w = m6033w(b3, b);
        int a = m6019a(w, b3);
        if (a == 0) {
            return b2 - 1;
        }
        return a >= m6019a(w, this.f6527b.mo7032f() + ((int) lVar.mo6799i(aVar).mo7012d())) ? b2 + 1 : b2;
    }

    /* renamed from: k */
    private long m6022k(C2296l lVar) {
        int b = m6020b(lVar);
        int b2 = lVar.mo6789b(C2285a.DAY_OF_MONTH);
        return (long) m6019a(m6033w(b2, b), b2);
    }

    /* renamed from: m */
    private int m6023m(C2296l lVar) {
        int b = m6020b(lVar);
        C2285a aVar = C2285a.DAY_OF_YEAR;
        int b2 = lVar.mo6789b(aVar);
        int w = m6033w(b2, b);
        int a = m6019a(w, b2);
        if (a == 0) {
            Objects.requireNonNull((C2229g) C2228f.m5757k(lVar));
            return m6023m(LocalDate.m5669o(lVar).mo6809u((long) b2, C2286b.DAYS));
        } else if (a <= 50) {
            return a;
        } else {
            int a2 = m6019a(w, this.f6527b.mo7032f() + ((int) lVar.mo6799i(aVar).mo7012d()));
            return a >= a2 ? (a - a2) + 1 : a;
        }
    }

    /* renamed from: n */
    private long m6024n(C2296l lVar) {
        int b = m6020b(lVar);
        int b2 = lVar.mo6789b(C2285a.DAY_OF_YEAR);
        return (long) m6019a(m6033w(b2, b), b2);
    }

    /* renamed from: o */
    static C2283C m6025o(C2284D d) {
        return new C2283C("DayOfWeek", d, C2286b.DAYS, C2286b.WEEKS, f6522f);
    }

    /* renamed from: p */
    private C2224b m6026p(C2228f fVar, int i, int i2, int i3) {
        Objects.requireNonNull((C2229g) fVar);
        LocalDate v = LocalDate.m5671v(i, 1, 1);
        int w = m6033w(1, m6020b(v));
        return v.mo6800j((long) (((Math.min(i2, m6019a(w, this.f6527b.mo7032f() + (v.mo6807t() ? 366 : 365)) - 1) - 1) * 7) + (i3 - 1) + (-w)), C2286b.DAYS);
    }

    /* renamed from: q */
    static C2283C m6027q(C2284D d) {
        return new C2283C("WeekBasedYear", d, C2294j.f6552d, C2286b.FOREVER, C2285a.YEAR.mo7025i());
    }

    /* renamed from: r */
    static C2283C m6028r(C2284D d) {
        return new C2283C("WeekOfMonth", d, C2286b.WEEKS, C2286b.MONTHS, f6523g);
    }

    /* renamed from: s */
    static C2283C m6029s(C2284D d) {
        return new C2283C("WeekOfWeekBasedYear", d, C2286b.WEEKS, C2294j.f6552d, f6525i);
    }

    /* renamed from: t */
    static C2283C m6030t(C2284D d) {
        return new C2283C("WeekOfYear", d, C2286b.WEEKS, C2286b.YEARS, f6524h);
    }

    /* renamed from: u */
    private C2282B m6031u(C2296l lVar, C2300p pVar) {
        int w = m6033w(lVar.mo6789b(pVar), m6020b(lVar));
        C2282B i = lVar.mo6799i(pVar);
        return C2282B.m6009i((long) m6019a(w, (int) i.mo7013e()), (long) m6019a(w, (int) i.mo7012d()));
    }

    /* renamed from: v */
    private C2282B m6032v(C2296l lVar) {
        C2285a aVar = C2285a.DAY_OF_YEAR;
        if (!lVar.mo6790c(aVar)) {
            return f6524h;
        }
        int b = m6020b(lVar);
        int b2 = lVar.mo6789b(aVar);
        int w = m6033w(b2, b);
        int a = m6019a(w, b2);
        if (a == 0) {
            Objects.requireNonNull((C2229g) C2228f.m5757k(lVar));
            return m6032v(LocalDate.m5669o(lVar).mo6809u((long) (b2 + 7), C2286b.DAYS));
        }
        int d = (int) lVar.mo6799i(aVar).mo7012d();
        int a2 = m6019a(w, this.f6527b.mo7032f() + d);
        if (a < a2) {
            return C2282B.m6009i(1, (long) (a2 - 1));
        }
        Objects.requireNonNull((C2229g) C2228f.m5757k(lVar));
        return m6032v(LocalDate.m5669o(lVar).mo6800j((long) ((d - b2) + 1 + 7), C2286b.DAYS));
    }

    /* renamed from: w */
    private int m6033w(int i, int i2) {
        int floorMod = Math.floorMod(i - i2, 7);
        return floorMod + 1 > this.f6527b.mo7032f() ? 7 - floorMod : -floorMod;
    }

    /* renamed from: c */
    public boolean mo7020c() {
        return true;
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        int a = this.f6530e.mo7010a(j, this);
        int b = kVar.mo6789b(this);
        if (a == b) {
            return kVar;
        }
        if (this.f6529d != C2286b.FOREVER) {
            return kVar.mo6800j((long) (a - b), this.f6528c);
        }
        int b2 = kVar.mo6789b(this.f6527b.f6535c);
        return m6026p(C2228f.m5757k(kVar), (int) j, kVar.mo6789b(this.f6527b.f6537e), b2);
    }

    /* renamed from: e */
    public C2282B mo7022e(C2296l lVar) {
        C2310z zVar = this.f6529d;
        if (zVar == C2286b.WEEKS) {
            return this.f6530e;
        }
        if (zVar == C2286b.MONTHS) {
            return m6031u(lVar, C2285a.DAY_OF_MONTH);
        }
        if (zVar == C2286b.YEARS) {
            return m6031u(lVar, C2285a.DAY_OF_YEAR);
        }
        if (zVar == C2284D.f6532h) {
            return m6032v(lVar);
        }
        if (zVar == C2286b.FOREVER) {
            return C2285a.YEAR.mo7025i();
        }
        StringBuilder a = C2220a.m5746a("unreachable, rangeUnit: ");
        a.append(this.f6529d);
        a.append(", this: ");
        a.append(this);
        throw new IllegalStateException(a.toString());
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        int i;
        C2310z zVar = this.f6529d;
        if (zVar == C2286b.WEEKS) {
            i = m6020b(lVar);
        } else if (zVar == C2286b.MONTHS) {
            return m6022k(lVar);
        } else {
            if (zVar == C2286b.YEARS) {
                return m6024n(lVar);
            }
            if (zVar == C2284D.f6532h) {
                i = m6023m(lVar);
            } else if (zVar == C2286b.FOREVER) {
                i = m6021h(lVar);
            } else {
                StringBuilder a = C2220a.m5746a("unreachable, rangeUnit: ");
                a.append(this.f6529d);
                a.append(", this: ");
                a.append(this);
                throw new IllegalStateException(a.toString());
            }
        }
        return (long) i;
    }

    /* renamed from: g */
    public C2296l mo7024g(Map map, C2296l lVar, C2238F f) {
        C2224b bVar;
        LocalDate localDate;
        LocalDate localDate2;
        Map map2 = map;
        C2238F f2 = f;
        long longValue = ((Long) map2.get(this)).longValue();
        int intExact = Math.toIntExact(longValue);
        C2310z zVar = this.f6529d;
        C2286b bVar2 = C2286b.WEEKS;
        if (zVar == bVar2) {
            map2.remove(this);
            map2.put(C2285a.DAY_OF_WEEK, Long.valueOf((long) (Math.floorMod((this.f6530e.mo7010a(longValue, this) - 1) + (this.f6527b.mo7030e().mo6855l() - 1), 7) + 1)));
        } else {
            C2285a aVar = C2285a.DAY_OF_WEEK;
            if (map2.containsKey(aVar)) {
                int floorMod = Math.floorMod(aVar.mo7038m(((Long) map2.get(aVar)).longValue()) - this.f6527b.mo7030e().mo6855l(), 7) + 1;
                C2228f k = C2228f.m5757k(lVar);
                C2285a aVar2 = C2285a.YEAR;
                if (map2.containsKey(aVar2)) {
                    int m = aVar2.mo7038m(((Long) map2.get(aVar2)).longValue());
                    C2310z zVar2 = this.f6529d;
                    C2286b bVar3 = C2286b.MONTHS;
                    if (zVar2 == bVar3) {
                        C2285a aVar3 = C2285a.MONTH_OF_YEAR;
                        if (map2.containsKey(aVar3)) {
                            long longValue2 = ((Long) map2.get(aVar3)).longValue();
                            long j = (long) intExact;
                            if (f2 == C2238F.LENIENT) {
                                C2229g gVar = (C2229g) k;
                                LocalDate y = LocalDate.m5671v(m, 1, 1).mo6800j(Math.subtractExact(longValue2, 1), bVar3);
                                localDate2 = y.mo6800j(Math.addExact(Math.multiplyExact(Math.subtractExact(j, m6022k(y)), 7), (long) (floorMod - m6020b(y))), C2286b.DAYS);
                            } else {
                                C2229g gVar2 = (C2229g) k;
                                LocalDate v = LocalDate.m5671v(m, aVar3.mo7038m(longValue2), 1);
                                LocalDate y2 = v.mo6800j((long) ((((int) (((long) this.f6530e.mo7010a(j, this)) - m6022k(v))) * 7) + (floorMod - m6020b(v))), C2286b.DAYS);
                                if (f2 != C2238F.STRICT || y2.mo6795f(aVar3) == longValue2) {
                                    localDate2 = y2;
                                } else {
                                    throw new C2230d("Strict mode rejected resolved date as it is in a different month");
                                }
                            }
                            map2.remove(this);
                            map2.remove(aVar2);
                            map2.remove(aVar3);
                            map2.remove(aVar);
                            return localDate2;
                        }
                    }
                    if (this.f6529d == C2286b.YEARS) {
                        long j2 = (long) intExact;
                        C2229g gVar3 = (C2229g) k;
                        LocalDate v2 = LocalDate.m5671v(m, 1, 1);
                        if (f2 == C2238F.LENIENT) {
                            localDate = v2.mo6800j(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, m6024n(v2)), 7), (long) (floorMod - m6020b(v2))), C2286b.DAYS);
                        } else {
                            LocalDate y3 = v2.mo6800j((long) ((((int) (((long) this.f6530e.mo7010a(j2, this)) - m6024n(v2))) * 7) + (floorMod - m6020b(v2))), C2286b.DAYS);
                            if (f2 != C2238F.STRICT || y3.mo6795f(aVar2) == ((long) m)) {
                                localDate = y3;
                            } else {
                                throw new C2230d("Strict mode rejected resolved date as it is in a different year");
                            }
                        }
                        map2.remove(this);
                        map2.remove(aVar2);
                        map2.remove(aVar);
                        return localDate;
                    }
                } else {
                    C2310z zVar3 = this.f6529d;
                    if ((zVar3 == C2284D.f6532h || zVar3 == C2286b.FOREVER) && map2.containsKey(this.f6527b.f6538f) && map2.containsKey(this.f6527b.f6537e)) {
                        int a = this.f6527b.f6538f.mo7025i().mo7010a(((Long) map2.get(this.f6527b.f6538f)).longValue(), this.f6527b.f6538f);
                        if (f2 == C2238F.LENIENT) {
                            bVar = ((LocalDate) m6026p(k, a, 1, floorMod)).mo6800j(Math.subtractExact(((Long) map2.get(this.f6527b.f6537e)).longValue(), 1), bVar2);
                        } else {
                            C2224b p = m6026p(k, a, this.f6527b.f6537e.mo7025i().mo7010a(((Long) map2.get(this.f6527b.f6537e)).longValue(), this.f6527b.f6537e), floorMod);
                            if (f2 != C2238F.STRICT || m6021h(p) == a) {
                                bVar = p;
                            } else {
                                throw new C2230d("Strict mode rejected resolved date as it is in a different week-based-year");
                            }
                        }
                        map2.remove(this);
                        map2.remove(this.f6527b.f6538f);
                        map2.remove(this.f6527b.f6537e);
                        map2.remove(aVar);
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return this.f6530e;
    }

    /* renamed from: j */
    public boolean mo7026j(C2296l lVar) {
        C2285a aVar;
        if (!lVar.mo6790c(C2285a.DAY_OF_WEEK)) {
            return false;
        }
        C2310z zVar = this.f6529d;
        if (zVar == C2286b.WEEKS) {
            return true;
        }
        if (zVar == C2286b.MONTHS) {
            aVar = C2285a.DAY_OF_MONTH;
        } else if (zVar == C2286b.YEARS || zVar == C2284D.f6532h) {
            aVar = C2285a.DAY_OF_YEAR;
        } else if (zVar != C2286b.FOREVER) {
            return false;
        } else {
            aVar = C2285a.YEAR;
        }
        return lVar.mo6790c(aVar);
    }

    /* renamed from: l */
    public boolean mo7027l() {
        return false;
    }

    public String toString() {
        return this.f6526a + "[" + this.f6527b.toString() + "]";
    }
}
