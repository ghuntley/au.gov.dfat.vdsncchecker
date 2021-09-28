package p155j$.time;

import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.m */
public enum C2275m implements C2296l, C2297m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final C2275m[] f6505a = null;

    static {
        f6505a = values();
    }

    /* renamed from: o */
    public static C2275m m5972o(int i) {
        if (i >= 1 && i <= 12) {
            return f6505a[i - 1];
        }
        throw new C2230d("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        return pVar == C2285a.MONTH_OF_YEAR ? mo6992m() : super.mo6789b(pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return pVar instanceof C2285a ? pVar == C2285a.MONTH_OF_YEAR : pVar != null && pVar.mo7026j(this);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        return yVar == C2302r.f6555a ? C2229g.f6372a : yVar == C2303s.f6556a ? C2286b.MONTHS : super.mo6793e(yVar);
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        if (pVar == C2285a.MONTH_OF_YEAR) {
            return (long) mo6992m();
        }
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return pVar == C2285a.MONTH_OF_YEAR ? pVar.mo7025i() : super.mo6799i(pVar);
    }

    /* renamed from: l */
    public int mo6991l(boolean z) {
        int i;
        switch (C2274l.f6504a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                i = 91;
                break;
            case 3:
                i = 152;
                break;
            case 4:
                i = 244;
                break;
            case 5:
                i = 305;
                break;
            case 6:
                return 1;
            case 7:
                i = 60;
                break;
            case 8:
                i = 121;
                break;
            case 9:
                i = 182;
                break;
            case 10:
                i = 213;
                break;
            case 11:
                i = 274;
                break;
            default:
                i = 335;
                break;
        }
        return (z ? 1 : 0) + i;
    }

    /* renamed from: m */
    public int mo6992m() {
        return ordinal() + 1;
    }

    /* renamed from: n */
    public int mo6993n(boolean z) {
        int i = C2274l.f6504a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    /* renamed from: p */
    public C2275m mo6994p(long j) {
        return f6505a[((((int) (j % 12)) + 12) + ordinal()) % 12];
    }
}
