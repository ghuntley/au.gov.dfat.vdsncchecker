package p155j$.time;

import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.e */
public enum C2231e implements C2296l, C2297m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final C2231e[] f6373a = null;

    static {
        f6373a = values();
    }

    /* renamed from: m */
    public static C2231e m5760m(int i) {
        if (i >= 1 && i <= 7) {
            return f6373a[i - 1];
        }
        throw new C2230d("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        return pVar == C2285a.DAY_OF_WEEK ? mo6855l() : super.mo6789b(pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return pVar instanceof C2285a ? pVar == C2285a.DAY_OF_WEEK : pVar != null && pVar.mo7026j(this);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        return yVar == C2303s.f6556a ? C2286b.DAYS : super.mo6793e(yVar);
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        if (pVar == C2285a.DAY_OF_WEEK) {
            return (long) mo6855l();
        }
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return pVar == C2285a.DAY_OF_WEEK ? pVar.mo7025i() : super.mo6799i(pVar);
    }

    /* renamed from: l */
    public int mo6855l() {
        return ordinal() + 1;
    }

    /* renamed from: n */
    public C2231e mo6856n(long j) {
        return f6373a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }
}
