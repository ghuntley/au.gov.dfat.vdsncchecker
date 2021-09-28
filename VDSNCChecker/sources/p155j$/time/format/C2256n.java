package p155j$.time.format;

import p155j$.time.C2220a;
import p155j$.time.C2230d;

/* renamed from: j$.time.format.n */
final class C2256n implements C2250h {

    /* renamed from: a */
    private final C2250h f6447a;

    /* renamed from: b */
    private final int f6448b;

    /* renamed from: c */
    private final char f6449c;

    C2256n(C2250h hVar, int i, char c) {
        this.f6447a = hVar;
        this.f6448b = i;
        this.f6449c = c;
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        boolean l = xVar.mo6956l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        } else if (i == charSequence.length()) {
            return ~i;
        } else {
            int i2 = this.f6448b + i;
            if (i2 > charSequence.length()) {
                if (l) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2 && xVar.mo6948b(charSequence.charAt(i3), this.f6449c)) {
                i3++;
            }
            int c = this.f6447a.mo6897c(xVar, charSequence.subSequence(0, i2), i3);
            return (c == i2 || !l) ? c : ~(i + i3);
        }
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        int length = sb.length();
        if (!this.f6447a.mo6898d(a, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        if (length2 <= this.f6448b) {
            for (int i = 0; i < this.f6448b - length2; i++) {
                sb.insert(length, this.f6449c);
            }
            return true;
        }
        throw new C2230d("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f6448b);
    }

    public String toString() {
        String str;
        StringBuilder a = C2220a.m5746a("Pad(");
        a.append(this.f6447a);
        a.append(",");
        a.append(this.f6448b);
        if (this.f6449c == ' ') {
            str = ")";
        } else {
            StringBuilder a2 = C2220a.m5746a(",'");
            a2.append(this.f6449c);
            a2.append("')");
            str = a2.toString();
        }
        a.append(str);
        return a.toString();
    }
}
