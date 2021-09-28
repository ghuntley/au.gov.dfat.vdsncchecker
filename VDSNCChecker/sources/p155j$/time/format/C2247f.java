package p155j$.time.format;

import p155j$.time.C2220a;

/* renamed from: j$.time.format.f */
final class C2247f implements C2250h {

    /* renamed from: a */
    private final char f6418a;

    C2247f(char c) {
        this.f6418a = c;
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        return (charAt == this.f6418a || (!xVar.mo6955k() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.f6418a) || Character.toLowerCase(charAt) == Character.toLowerCase(this.f6418a)))) ? i + 1 : ~i;
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        sb.append(this.f6418a);
        return true;
    }

    public String toString() {
        if (this.f6418a == '\'') {
            return "''";
        }
        StringBuilder a = C2220a.m5746a("'");
        a.append(this.f6418a);
        a.append("'");
        return a.toString();
    }
}
