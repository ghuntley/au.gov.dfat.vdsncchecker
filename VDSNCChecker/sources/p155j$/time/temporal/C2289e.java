package p155j$.time.temporal;

import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;

/* 'enum' modifier removed */
/* renamed from: j$.time.temporal.e */
final class C2289e extends C2292h {
    C2289e(String str, int i) {
        super(str, i, (C2287c) null);
    }

    /* renamed from: d */
    public C2295k mo7021d(C2295k kVar, long j) {
        long f = mo7023f(kVar);
        mo7025i().mo7011b(j, this);
        C2285a aVar = C2285a.MONTH_OF_YEAR;
        return kVar.mo6797g(aVar, ((j - f) * 3) + kVar.mo6795f(aVar));
    }

    /* renamed from: f */
    public long mo7023f(C2296l lVar) {
        if (mo7026j(lVar)) {
            return (lVar.mo6795f(C2285a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new C2281A("Unsupported field: QuarterOfYear");
    }

    /* renamed from: i */
    public C2282B mo7025i() {
        return C2282B.m6009i(1, 4);
    }

    /* renamed from: j */
    public boolean mo7026j(C2296l lVar) {
        if (lVar.mo6790c(C2285a.MONTH_OF_YEAR)) {
            if (((C2223a) C2228f.m5757k(lVar)).equals(C2229g.f6372a)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "QuarterOfYear";
    }
}
