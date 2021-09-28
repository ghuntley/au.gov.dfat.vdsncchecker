package p155j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.f */
public final class C2232f implements Comparable, Serializable {

    /* renamed from: c */
    public static final C2232f f6375c = new C2232f(0, 0);

    /* renamed from: a */
    private final long f6376a;

    /* renamed from: b */
    private final int f6377b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private C2232f(long j, int i) {
        this.f6376a = j;
        this.f6377b = i;
    }

    /* renamed from: c */
    private static C2232f m5768c(long j, int i) {
        return (((long) i) | j) == 0 ? f6375c : new C2232f(j, i);
    }

    /* renamed from: e */
    public static C2232f m5769e(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m5768c(j2, i);
    }

    /* renamed from: f */
    public static C2232f m5770f(long j) {
        return m5768c(j, 0);
    }

    /* renamed from: g */
    public static C2232f m5771g(long j, long j2) {
        return m5768c(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    public int compareTo(Object obj) {
        C2232f fVar = (C2232f) obj;
        int compare = Long.compare(this.f6376a, fVar.f6376a);
        return compare != 0 ? compare : this.f6377b - fVar.f6377b;
    }

    /* renamed from: d */
    public long mo6858d() {
        return this.f6376a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2232f)) {
            return false;
        }
        C2232f fVar = (C2232f) obj;
        return this.f6376a == fVar.f6376a && this.f6377b == fVar.f6377b;
    }

    public int hashCode() {
        long j = this.f6376a;
        return (this.f6377b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        if (this == f6375c) {
            return "PT0S";
        }
        long j = this.f6376a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f6377b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.f6377b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.f6377b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) this.f6377b));
            } else {
                sb.append(((long) this.f6377b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
