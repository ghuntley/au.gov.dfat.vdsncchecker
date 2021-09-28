package p155j$.time.temporal;

import java.util.Map;
import p155j$.time.LocalDate;
import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.format.C2238F;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.f */
final class C2290f extends C2292h {
    C2290f(String str, int i) {
        super(str, i, (C2287c) null);
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        mo7025i().mo7011b(j, this);
        return kVar.mo6800j(Math.subtractExact(j, mo7023f(kVar)), C2286b.WEEKS);
    }

    /* renamed from: e */
    public C2282B mo7022e(C2296l lVar) {
        if (mo7026j(lVar)) {
            return C2292h.m6085o(LocalDate.m5669o(lVar));
        }
        throw new C2281A("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        if (mo7026j(lVar)) {
            return (long) C2292h.m6086p(LocalDate.m5669o(lVar));
        }
        throw new C2281A("Unsupported field: WeekOfWeekBasedYear");
    }

    /* renamed from: g */
    public C2296l mo7024g(Map map, C2296l lVar, C2238F f) {
        LocalDate localDate;
        long j;
        LocalDate B;
        long j2;
        Map map2 = map;
        C2238F f2 = f;
        C2292h hVar = C2292h.WEEK_BASED_YEAR;
        Long l = (Long) map2.get(hVar);
        C2285a aVar = C2285a.DAY_OF_WEEK;
        Long l2 = (Long) map2.get(aVar);
        if (l == null || l2 == null) {
            return null;
        }
        int a = hVar.mo7025i().mo7010a(l.longValue(), hVar);
        long longValue = ((Long) map2.get(C2292h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        C2292h.m6084n(lVar);
        LocalDate v = LocalDate.m5671v(a, 1, 4);
        if (f2 == C2238F.LENIENT) {
            long longValue2 = l2.longValue();
            if (longValue2 > 7) {
                j2 = longValue2 - 1;
                B = v.mo6782B(j2 / 7);
            } else {
                j = 1;
                if (longValue2 < 1) {
                    B = v.mo6782B(Math.subtractExact(longValue2, 7) / 7);
                    j2 = longValue2 + 6;
                }
                localDate = v.mo6782B(Math.subtractExact(longValue, j)).mo6797g(aVar, longValue2);
            }
            v = B;
            j = 1;
            longValue2 = (j2 % 7) + 1;
            localDate = v.mo6782B(Math.subtractExact(longValue, j)).mo6797g(aVar, longValue2);
        } else {
            int m = aVar.mo7038m(l2.longValue());
            if (longValue < 1 || longValue > 52) {
                (f2 == C2238F.STRICT ? C2292h.m6085o(v) : mo7025i()).mo7011b(longValue, this);
            }
            localDate = v.mo6782B(longValue - 1).mo6797g(aVar, (long) m);
        }
        map2.remove(this);
        map2.remove(hVar);
        map2.remove(aVar);
        return localDate;
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return C2282B.m6010j(1, 52, 53);
    }

    /* renamed from: j */
    public boolean mo7026j(C2296l lVar) {
        if (lVar.mo6790c(C2285a.EPOCH_DAY)) {
            if (((C2223a) C2228f.m5757k(lVar)).equals(C2229g.f6372a)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "WeekOfWeekBasedYear";
    }
}
