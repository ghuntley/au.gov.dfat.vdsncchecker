package p155j$.time.format;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import p155j$.time.C2231e;
import p155j$.time.temporal.C2284D;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2310z;

/* renamed from: j$.time.format.u */
final class C2263u implements C2250h {

    /* renamed from: a */
    private char f6468a;

    /* renamed from: b */
    private int f6469b;

    C2263u(char c, int i) {
        this.f6468a = c;
        this.f6469b = i;
    }

    /* renamed from: a */
    private C2250h m5894a(Locale locale) {
        C2300p pVar;
        C2310z zVar = C2284D.f6532h;
        Objects.requireNonNull(locale, "locale");
        Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        C2284D g = C2284D.m6045g(C2231e.SUNDAY.mo6856n((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
        char c = this.f6468a;
        if (c == 'W') {
            pVar = g.mo7035i();
        } else if (c == 'Y') {
            C2300p h = g.mo7033h();
            int i = this.f6469b;
            if (i == 2) {
                return new C2260r(h, 2, 2, 0, C2260r.f6460i, 0, (C2244c) null);
            }
            return new C2254l(h, i, 19, i < 4 ? C2239G.NORMAL : C2239G.EXCEEDS_PAD, -1);
        } else if (c == 'c' || c == 'e') {
            pVar = g.mo7029d();
        } else if (c == 'w') {
            pVar = g.mo7036j();
        } else {
            throw new IllegalStateException("unreachable");
        }
        return new C2254l(pVar, this.f6469b == 2 ? 2 : 1, 2, C2239G.NOT_NEGATIVE);
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        return ((C2254l) m5894a(xVar.mo6953i())).mo6897c(xVar, charSequence, i);
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        return ((C2254l) m5894a(a.mo6864c())).mo6898d(a, sb);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f6468a;
        if (c == 'Y') {
            int i = this.f6469b;
            if (i == 1) {
                str2 = "WeekBasedYear";
            } else if (i == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f6469b);
                sb.append(",");
                sb.append(19);
                sb.append(",");
                sb.append(this.f6469b < 4 ? C2239G.NORMAL : C2239G.EXCEEDS_PAD);
            }
            sb.append(str2);
        } else {
            if (c == 'W') {
                str = "WeekOfMonth";
            } else if (c == 'c' || c == 'e') {
                str = "DayOfWeek";
            } else {
                if (c == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb.append(",");
                sb.append(this.f6469b);
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.f6469b);
        }
        sb.append(")");
        return sb.toString();
    }
}
