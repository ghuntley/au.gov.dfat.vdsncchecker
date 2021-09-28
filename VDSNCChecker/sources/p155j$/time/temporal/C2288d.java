package p155j$.time.temporal;

import java.util.Map;
import p155j$.time.LocalDate;
import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.format.C2238F;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.d */
final class C2288d extends C2292h {
    C2288d(String str, int i) {
        super(str, i, (C2287c) null);
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        long f = mo7023f(kVar);
        mo7025i().mo7011b(j, this);
        C2285a aVar = C2285a.DAY_OF_YEAR;
        return kVar.mo6797g(aVar, (j - f) + kVar.mo6795f(aVar));
    }

    /* renamed from: e */
    public C2282B mo7022e(C2296l lVar) {
        if (mo7026j(lVar)) {
            long f = lVar.mo6795f(C2292h.QUARTER_OF_YEAR);
            if (f != 1) {
                return f == 2 ? C2282B.m6009i(1, 91) : (f == 3 || f == 4) ? C2282B.m6009i(1, 92) : mo7025i();
            }
            return C2229g.f6372a.mo6853e(lVar.mo6795f(C2285a.YEAR)) ? C2282B.m6009i(1, 91) : C2282B.m6009i(1, 90);
        }
        throw new C2281A("Unsupported field: DayOfQuarter");
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        if (mo7026j(lVar)) {
            return (long) (lVar.mo6789b(C2285a.DAY_OF_YEAR) - C2292h.f6545a[((lVar.mo6789b(C2285a.MONTH_OF_YEAR) - 1) / 3) + (C2229g.f6372a.mo6853e(lVar.mo6795f(C2285a.YEAR)) ? 4 : 0)]);
        }
        throw new C2281A("Unsupported field: DayOfQuarter");
    }

    /* renamed from: g */
    public C2296l mo7024g(Map map, C2296l lVar, C2238F f) {
        LocalDate localDate;
        long j;
        C2285a aVar = C2285a.YEAR;
        Long l = (Long) map.get(aVar);
        C2292h hVar = C2292h.QUARTER_OF_YEAR;
        Long l2 = (Long) map.get(hVar);
        if (l == null || l2 == null) {
            return null;
        }
        int m = aVar.mo7038m(l.longValue());
        long longValue = ((Long) map.get(C2292h.DAY_OF_QUARTER)).longValue();
        C2292h.m6084n(lVar);
        if (f == C2238F.LENIENT) {
            localDate = LocalDate.m5671v(m, 1, 1).mo6781A(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1), 3));
            j = Math.subtractExact(longValue, 1);
        } else {
            localDate = LocalDate.m5671v(m, ((hVar.mo7025i().mo7010a(l2.longValue(), hVar) - 1) * 3) + 1, 1);
            if (longValue < 1 || longValue > 90) {
                (f == C2238F.STRICT ? mo7022e(localDate) : mo7025i()).mo7011b(longValue, this);
            }
            j = longValue - 1;
        }
        map.remove(this);
        map.remove(aVar);
        map.remove(hVar);
        return localDate.mo6811z(j);
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return C2282B.m6010j(1, 90, 92);
    }

    /* renamed from: j */
    public boolean mo7026j(C2296l lVar) {
        if (lVar.mo6790c(C2285a.DAY_OF_YEAR) && lVar.mo6790c(C2285a.MONTH_OF_YEAR) && lVar.mo6790c(C2285a.YEAR)) {
            if (((C2223a) C2228f.m5757k(lVar)).equals(C2229g.f6372a)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "DayOfQuarter";
    }
}
