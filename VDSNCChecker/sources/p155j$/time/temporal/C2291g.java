package p155j$.time.temporal;

import p155j$.time.LocalDate;
import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.g */
final class C2291g extends C2292h {
    C2291g(String str, int i) {
        super(str, i, (C2287c) null);
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        if (mo7026j(kVar)) {
            int a = mo7025i().mo7010a(j, C2292h.WEEK_BASED_YEAR);
            LocalDate o = LocalDate.m5669o(kVar);
            C2285a aVar = C2285a.DAY_OF_WEEK;
            int b = o.mo6789b(aVar);
            int p = C2292h.m6086p(o);
            if (p == 53 && C2292h.m6090t(a) == 52) {
                p = 52;
            }
            LocalDate v = LocalDate.m5671v(a, 1, 4);
            return kVar.mo6792d(v.mo6811z((long) (((p - 1) * 7) + (b - v.mo6789b(aVar)))));
        }
        throw new C2281A("Unsupported field: WeekBasedYear");
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        if (mo7026j(lVar)) {
            return (long) C2292h.m6089s(LocalDate.m5669o(lVar));
        }
        throw new C2281A("Unsupported field: WeekBasedYear");
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return C2285a.YEAR.mo7025i();
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
        return "WeekBasedYear";
    }
}
