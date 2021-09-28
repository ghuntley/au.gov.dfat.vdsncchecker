package p155j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import p155j$.time.C2220a;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.i */
final class C2251i implements C2250h {

    /* renamed from: a */
    private final C2300p f6430a;

    /* renamed from: b */
    private final int f6431b;

    /* renamed from: c */
    private final int f6432c;

    /* renamed from: d */
    private final boolean f6433d;

    C2251i(C2300p pVar, int i, int i2, boolean z) {
        Objects.requireNonNull(pVar, "field");
        if (!pVar.mo7025i().mo7015f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + pVar);
        } else if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        } else if (i2 >= i) {
            this.f6430a = pVar;
            this.f6431b = i;
            this.f6432c = i2;
            this.f6433d = z;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = xVar.mo6956l() ? this.f6431b : 0;
        int i4 = xVar.mo6956l() ? this.f6432c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i3 > 0 ? ~i : i;
        }
        if (this.f6433d) {
            if (charSequence.charAt(i) != xVar.mo6951g().mo6876c()) {
                return i3 > 0 ? ~i : i;
            }
            i++;
        }
        int i5 = i;
        int i6 = i3 + i5;
        if (i6 > length) {
            return ~i5;
        }
        int min = Math.min(i4 + i5, length);
        int i7 = 0;
        int i8 = i5;
        while (true) {
            if (i8 >= min) {
                i2 = i8;
                break;
            }
            int i9 = i8 + 1;
            int b = xVar.mo6951g().mo6875b(charSequence.charAt(i8));
            if (b >= 0) {
                i7 = (i7 * 10) + b;
                i8 = i9;
            } else if (i9 < i6) {
                return ~i5;
            } else {
                i2 = i9 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i2 - i5);
        C2282B i10 = this.f6430a.mo7025i();
        BigDecimal valueOf = BigDecimal.valueOf(i10.mo7013e());
        return xVar.mo6959o(this.f6430a, movePointLeft.multiply(BigDecimal.valueOf(i10.mo7012d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i5, i2);
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        Long e = a.mo6866e(this.f6430a);
        if (e == null) {
            return false;
        }
        C2236D b = a.mo6863b();
        long longValue = e.longValue();
        C2282B i = this.f6430a.mo7025i();
        i.mo7011b(longValue, this.f6430a);
        BigDecimal valueOf = BigDecimal.valueOf(i.mo7013e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(i.mo7012d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String a2 = b.mo6874a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f6431b), this.f6432c), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.f6433d) {
                sb.append(b.mo6876c());
            }
            sb.append(a2);
            return true;
        } else if (this.f6431b <= 0) {
            return true;
        } else {
            if (this.f6433d) {
                sb.append(b.mo6876c());
            }
            for (int i2 = 0; i2 < this.f6431b; i2++) {
                sb.append(b.mo6880f());
            }
            return true;
        }
    }

    public String toString() {
        String str = this.f6433d ? ",DecimalPoint" : "";
        StringBuilder a = C2220a.m5746a("Fraction(");
        a.append(this.f6430a);
        a.append(",");
        a.append(this.f6431b);
        a.append(",");
        a.append(this.f6432c);
        a.append(str);
        a.append(")");
        return a.toString();
    }
}
