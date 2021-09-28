package p155j$.time.temporal;

import java.io.Serializable;
import p155j$.time.C2230d;

/* renamed from: j$.time.temporal.B */
public final class C2282B implements Serializable {

    /* renamed from: a */
    private final long f6518a;

    /* renamed from: b */
    private final long f6519b;

    /* renamed from: c */
    private final long f6520c;

    /* renamed from: d */
    private final long f6521d;

    private C2282B(long j, long j2, long j3, long j4) {
        this.f6518a = j;
        this.f6519b = j2;
        this.f6520c = j3;
        this.f6521d = j4;
    }

    /* renamed from: c */
    private String m6008c(C2300p pVar, long j) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C2282B m6009i(long j, long j2) {
        if (j <= j2) {
            return new C2282B(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C2282B m6010j(long j, long j2, long j3) {
        return m6011k(j, j, j2, j3);
    }

    /* renamed from: k */
    public static C2282B m6011k(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            return new C2282B(j, j2, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: a */
    public int mo7010a(long j, C2300p pVar) {
        if (mo7016g() && mo7017h(j)) {
            return (int) j;
        }
        throw new C2230d(m6008c(pVar, j));
    }

    /* renamed from: b */
    public long mo7011b(long j, C2300p pVar) {
        if (mo7017h(j)) {
            return j;
        }
        throw new C2230d(m6008c(pVar, j));
    }

    /* renamed from: d */
    public long mo7012d() {
        return this.f6521d;
    }

    /* renamed from: e */
    public long mo7013e() {
        return this.f6518a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2282B)) {
            return false;
        }
        C2282B b = (C2282B) obj;
        return this.f6518a == b.f6518a && this.f6519b == b.f6519b && this.f6520c == b.f6520c && this.f6521d == b.f6521d;
    }

    /* renamed from: f */
    public boolean mo7015f() {
        return this.f6518a == this.f6519b && this.f6520c == this.f6521d;
    }

    /* renamed from: g */
    public boolean mo7016g() {
        return this.f6518a >= -2147483648L && this.f6521d <= 2147483647L;
    }

    /* renamed from: h */
    public boolean mo7017h(long j) {
        return j >= this.f6518a && j <= this.f6521d;
    }

    public int hashCode() {
        long j = this.f6518a;
        long j2 = this.f6519b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f6520c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f6521d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6518a);
        if (this.f6518a != this.f6519b) {
            sb.append('/');
            sb.append(this.f6519b);
        }
        sb.append(" - ");
        sb.append(this.f6520c);
        if (this.f6520c != this.f6521d) {
            sb.append('/');
            sb.append(this.f6521d);
        }
        return sb.toString();
    }
}
