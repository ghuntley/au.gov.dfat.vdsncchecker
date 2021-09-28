package p155j$.time.format;

import p155j$.time.LocalDate;
import p155j$.time.ZoneId;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2228f;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2301q;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.format.z */
class C2268z implements C2296l {

    /* renamed from: a */
    final /* synthetic */ C2224b f6484a;

    /* renamed from: b */
    final /* synthetic */ C2296l f6485b;

    /* renamed from: c */
    final /* synthetic */ C2228f f6486c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f6487d;

    C2268z(C2224b bVar, C2296l lVar, C2228f fVar, ZoneId zoneId) {
        this.f6484a = bVar;
        this.f6485b = lVar;
        this.f6486c = fVar;
        this.f6487d = zoneId;
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return (this.f6484a == null || !pVar.mo7020c()) ? this.f6485b.mo6790c(pVar) : ((LocalDate) this.f6484a).mo6790c(pVar);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        return yVar == C2302r.f6555a ? this.f6486c : yVar == C2301q.f6554a ? this.f6487d : yVar == C2303s.f6556a ? this.f6485b.mo6793e(yVar) : yVar.mo6895a(this);
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        return (this.f6484a == null || !pVar.mo7020c()) ? this.f6485b.mo6795f(pVar) : ((LocalDate) this.f6484a).mo6795f(pVar);
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return (this.f6484a == null || !pVar.mo7020c()) ? this.f6485b.mo6799i(pVar) : ((LocalDate) this.f6484a).mo6799i(pVar);
    }
}
