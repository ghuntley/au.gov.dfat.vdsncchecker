package p049h3;

import java.util.Iterator;
import p031e3.C0870a;
import p042g2.C0955a;

/* renamed from: h3.a */
public class C1013a implements Iterable<Integer>, C0870a {

    /* renamed from: e */
    public final int f3728e;

    /* renamed from: f */
    public final int f3729f;

    /* renamed from: g */
    public final int f3730g;

    public C1013a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f3728e = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= C0955a.m2750x(C0955a.m2750x(i2, i3) - C0955a.m2750x(i, i3), i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i4 = -i3;
                i2 += C0955a.m2750x(C0955a.m2750x(i, i4) - C0955a.m2750x(i2, i4), i4);
            }
            this.f3729f = i2;
            this.f3730g = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1013a) {
            if (!isEmpty() || !((C1013a) obj).isEmpty()) {
                C1013a aVar = (C1013a) obj;
                if (!(this.f3728e == aVar.f3728e && this.f3729f == aVar.f3729f && this.f3730g == aVar.f3730g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3728e * 31) + this.f3729f) * 31) + this.f3730g;
    }

    public boolean isEmpty() {
        if (this.f3730g > 0) {
            if (this.f3728e > this.f3729f) {
                return true;
            }
        } else if (this.f3728e < this.f3729f) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new C1014b(this.f3728e, this.f3729f, this.f3730g);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f3730g > 0) {
            sb = new StringBuilder();
            sb.append(this.f3728e);
            sb.append("..");
            sb.append(this.f3729f);
            sb.append(" step ");
            i = this.f3730g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f3728e);
            sb.append(" downTo ");
            sb.append(this.f3729f);
            sb.append(" step ");
            i = -this.f3730g;
        }
        sb.append(i);
        return sb.toString();
    }
}
