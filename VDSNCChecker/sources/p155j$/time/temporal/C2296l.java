package p155j$.time.temporal;

import java.util.Objects;
import p155j$.time.C2230d;

/* renamed from: j$.time.temporal.l */
public interface C2296l {
    /* renamed from: b */
    int mo6789b(C2300p pVar) {
        C2282B i = mo6799i(pVar);
        if (i.mo7016g()) {
            long f = mo6795f(pVar);
            if (i.mo7017h(f)) {
                return (int) f;
            }
            throw new C2230d("Invalid value for " + pVar + " (valid values " + i + "): " + f);
        }
        throw new C2281A("Invalid field " + pVar + " for get() method, use getLong() instead");
    }

    /* renamed from: c */
    boolean mo6790c(C2300p pVar);

    /* renamed from: e */
    Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2301q.f6554a || yVar == C2302r.f6555a || yVar == C2303s.f6556a) {
            return null;
        }
        return yVar.mo6895a(this);
    }

    /* renamed from: f */
    long mo6795f(C2300p pVar);

    /* renamed from: i */
    C2282B mo6799i(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.mo7022e(this);
        } else if (mo6790c(pVar)) {
            return pVar.mo7025i();
        } else {
            throw new C2281A("Unsupported field: " + pVar);
        }
    }
}
