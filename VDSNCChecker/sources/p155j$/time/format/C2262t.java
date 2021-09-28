package p155j$.time.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p155j$.time.C2220a;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2308x;

/* renamed from: j$.time.format.t */
final class C2262t implements C2250h {

    /* renamed from: a */
    private final C2300p f6464a;

    /* renamed from: b */
    private final C2240H f6465b;

    /* renamed from: c */
    private final C2235C f6466c;

    /* renamed from: d */
    private volatile C2254l f6467d;

    C2262t(C2300p pVar, C2240H h, C2235C c) {
        this.f6464a = pVar;
        this.f6465b = h;
        this.f6466c = c;
    }

    /* renamed from: a */
    private C2254l m5891a() {
        if (this.f6467d == null) {
            this.f6467d = new C2254l(this.f6464a, 1, 19, C2239G.NORMAL);
        }
        return this.f6467d;
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        Iterator it;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it2 = null;
        C2240H h = xVar.mo6956l() ? this.f6465b : null;
        C2228f h2 = xVar.mo6952h();
        C2229g gVar = C2229g.f6372a;
        if (h2 == gVar) {
            it = this.f6466c.mo6873e(this.f6464a, h, xVar.mo6953i());
        } else {
            C2235C c = this.f6466c;
            C2300p pVar = this.f6464a;
            Locale i2 = xVar.mo6953i();
            Objects.requireNonNull(c);
            if (h2 == gVar || !(pVar instanceof C2285a)) {
                it2 = c.mo6873e(pVar, h, i2);
            }
            it = it2;
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (xVar.mo6963s(str, 0, charSequence, i, str.length())) {
                    return xVar.mo6959o(this.f6464a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (xVar.mo6956l()) {
                return ~i;
            }
        }
        return m5891a().mo6897c(xVar, charSequence, i);
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        String str;
        C2229g gVar;
        Long e = a.mo6866e(this.f6464a);
        if (e == null) {
            return false;
        }
        C2296l d = a.mo6865d();
        int i = C2308x.f6561a;
        C2228f fVar = (C2228f) d.mo6793e(C2302r.f6555a);
        if (fVar == null || fVar == (gVar = C2229g.f6372a)) {
            str = this.f6466c.mo6872d(this.f6464a, e.longValue(), this.f6465b, a.mo6864c());
        } else {
            C2235C c = this.f6466c;
            C2300p pVar = this.f6464a;
            long longValue = e.longValue();
            C2240H h = this.f6465b;
            Locale c2 = a.mo6864c();
            Objects.requireNonNull(c);
            str = (fVar == gVar || !(pVar instanceof C2285a)) ? c.mo6872d(pVar, longValue, h, c2) : null;
        }
        if (str == null) {
            return m5891a().mo6898d(a, sb);
        }
        sb.append(str);
        return true;
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        if (this.f6465b == C2240H.FULL) {
            sb = C2220a.m5746a("Text(");
            obj = this.f6464a;
        } else {
            sb = C2220a.m5746a("Text(");
            sb.append(this.f6464a);
            sb.append(",");
            obj = this.f6465b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
