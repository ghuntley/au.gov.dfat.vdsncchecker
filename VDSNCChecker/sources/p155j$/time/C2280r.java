package p155j$.time;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2225c;
import p155j$.time.chrono.C2227e;
import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2301q;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2304t;
import p155j$.time.temporal.C2305u;
import p155j$.time.temporal.C2306v;
import p155j$.time.temporal.C2307w;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;
import p155j$.time.temporal.C2310z;
import p155j$.time.zone.C2311a;
import p155j$.time.zone.C2313c;

/* renamed from: j$.time.r */
public final class C2280r implements C2295k, C2227e, Serializable {

    /* renamed from: a */
    private final LocalDateTime f6515a;

    /* renamed from: b */
    private final ZoneOffset f6516b;

    /* renamed from: c */
    private final ZoneId f6517c;

    private C2280r(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.f6515a = localDateTime;
        this.f6516b = zoneOffset;
        this.f6517c = zoneId;
    }

    /* renamed from: l */
    private static C2280r m5990l(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.mo6834m().mo7063d(C2270h.m5931s(j, (long) i));
        return new C2280r(LocalDateTime.m5706v(j, i, d), d, zoneId);
    }

    /* renamed from: o */
    public static C2280r m5991o(C2270h hVar, ZoneId zoneId) {
        Objects.requireNonNull(hVar, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m5990l(hVar.mo6970o(), hVar.mo6971p(), zoneId);
    }

    /* renamed from: p */
    public static C2280r m5992p(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object obj;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C2280r(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        C2313c m = zoneId.mo6834m();
        List g = m.mo7066g(localDateTime);
        if (g.size() == 1) {
            obj = g.get(0);
        } else {
            if (g.size() == 0) {
                C2311a f = m.mo7065f(localDateTime);
                localDateTime = localDateTime.mo6830z(f.mo7053e().mo6858d());
                zoneOffset = f.mo7056g();
            } else if (zoneOffset == null || !g.contains(zoneOffset)) {
                obj = (ZoneOffset) g.get(0);
                Objects.requireNonNull(obj, "offset");
            }
            return new C2280r(localDateTime, zoneOffset, zoneId);
        }
        zoneOffset = (ZoneOffset) obj;
        return new C2280r(localDateTime, zoneOffset, zoneId);
    }

    /* renamed from: q */
    private C2280r m5993q(LocalDateTime localDateTime) {
        return m5992p(localDateTime, this.f6517c, this.f6516b);
    }

    /* renamed from: r */
    private C2280r m5994r(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f6516b) || !this.f6517c.mo6834m().mo7066g(this.f6515a).contains(zoneOffset)) ? this : new C2280r(this.f6515a, zoneOffset, this.f6517c);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return super.mo6789b(pVar);
        }
        int i = C2279q.f6514a[((C2285a) pVar).ordinal()];
        if (i == 1) {
            throw new C2281A("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        } else if (i != 2) {
            return this.f6515a.mo6789b(pVar);
        } else {
            return this.f6516b.mo6837q();
        }
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return (pVar instanceof C2285a) || (pVar != null && pVar.mo7026j(this));
    }

    /* renamed from: d */
    public C2295k mo6792d(C2297m mVar) {
        return m5992p(LocalDateTime.m5705u((LocalDate) mVar, this.f6515a.mo6814D()), this.f6517c, this.f6516b);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2306v.f6559a) {
            return this.f6515a.mo6812B();
        }
        if (yVar == C2305u.f6558a || yVar == C2301q.f6554a) {
            return this.f6517c;
        }
        if (yVar == C2304t.f6557a) {
            return this.f6516b;
        }
        if (yVar == C2307w.f6560a) {
            return mo7009u();
        }
        if (yVar != C2302r.f6555a) {
            return yVar == C2303s.f6556a ? C2286b.NANOS : yVar.mo6895a(this);
        }
        mo6850a();
        return C2229g.f6372a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280r)) {
            return false;
        }
        C2280r rVar = (C2280r) obj;
        return this.f6515a.equals(rVar.f6515a) && this.f6516b.equals(rVar.f6516b) && this.f6517c.equals(rVar.f6517c);
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        int i = C2279q.f6514a[((C2285a) pVar).ordinal()];
        if (i == 1) {
            return mo6852h();
        }
        if (i != 2) {
            return this.f6515a.mo6795f(pVar);
        }
        return (long) this.f6516b.mo6837q();
    }

    /* renamed from: g */
    public C2295k mo6797g(C2300p pVar, long j) {
        if (!(pVar instanceof C2285a)) {
            return (C2280r) pVar.mo7021d(this, j);
        }
        C2285a aVar = (C2285a) pVar;
        int i = C2279q.f6514a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? m5993q(this.f6515a.mo6797g(pVar, j)) : m5994r(ZoneOffset.m5736t(aVar.mo7038m(j)));
        }
        return m5990l(j, this.f6515a.mo6820n(), this.f6517c);
    }

    public int hashCode() {
        return (this.f6515a.hashCode() ^ this.f6516b.hashCode()) ^ Integer.rotateLeft(this.f6517c.hashCode(), 3);
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return pVar instanceof C2285a ? (pVar == C2285a.INSTANT_SECONDS || pVar == C2285a.OFFSET_SECONDS) ? pVar.mo7025i() : this.f6515a.mo6799i(pVar) : pVar.mo7022e(this);
    }

    /* renamed from: j */
    public C2295k mo6800j(long j, C2310z zVar) {
        if (!(zVar instanceof C2286b)) {
            return (C2280r) zVar.mo7042d(this, j);
        }
        if (zVar.mo7041c()) {
            return m5993q(this.f6515a.mo6800j(j, zVar));
        }
        LocalDateTime w = this.f6515a.mo6800j(j, zVar);
        ZoneOffset zoneOffset = this.f6516b;
        ZoneId zoneId = this.f6517c;
        Objects.requireNonNull(w, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.mo6834m().mo7066g(w).contains(zoneOffset) ? new C2280r(w, zoneOffset, zoneId) : m5990l(w.toEpochSecond(zoneOffset), w.mo6820n(), zoneId);
    }

    /* renamed from: m */
    public ZoneOffset mo7004m() {
        return this.f6516b;
    }

    /* renamed from: n */
    public ZoneId mo7005n() {
        return this.f6517c;
    }

    /* renamed from: s */
    public C2224b mo7006s() {
        return this.f6515a.mo6812B();
    }

    /* renamed from: t */
    public C2225c mo7007t() {
        return this.f6515a;
    }

    public String toString() {
        String str = this.f6515a.toString() + this.f6516b.toString();
        if (this.f6516b == this.f6517c) {
            return str;
        }
        return str + '[' + this.f6517c.toString() + ']';
    }

    /* renamed from: u */
    public C2273k mo7009u() {
        return this.f6515a.mo6814D();
    }
}
