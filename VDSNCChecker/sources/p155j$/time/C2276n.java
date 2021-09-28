package p155j$.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2310z;

/* renamed from: j$.time.n */
public final class C2276n implements Serializable {

    /* renamed from: d */
    public static final C2276n f6507d = new C2276n(0, 0, 0);

    /* renamed from: a */
    private final int f6508a;

    /* renamed from: b */
    private final int f6509b;

    /* renamed from: c */
    private final int f6510c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(new C2310z[]{C2286b.YEARS, C2286b.MONTHS, C2286b.DAYS}));
    }

    private C2276n(int i, int i2, int i3) {
        this.f6508a = i;
        this.f6509b = i2;
        this.f6510c = i3;
    }

    /* renamed from: d */
    public static C2276n m5982d(int i) {
        return (0 | i) == 0 ? f6507d : new C2276n(0, 0, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.temporal.C2295k mo6995a(p155j$.time.temporal.C2295k r7) {
        /*
            r6 = this;
            int r0 = p155j$.time.temporal.C2308x.f6561a
            j$.time.temporal.r r0 = p155j$.time.temporal.C2302r.f6555a
            r1 = r7
            j$.time.LocalDate r1 = (p155j$.time.LocalDate) r1
            java.lang.Object r0 = r1.mo6793e(r0)
            j$.time.chrono.f r0 = (p155j$.time.chrono.C2228f) r0
            if (r0 == 0) goto L_0x0020
            j$.time.chrono.g r2 = p155j$.time.chrono.C2229g.f6372a
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            j$.time.d r7 = new j$.time.d
            java.lang.String r0 = "Chronology mismatch, expected: ISO, actual: ISO"
            r7.<init>(r0)
            throw r7
        L_0x0020:
            int r0 = r6.f6509b
            if (r0 != 0) goto L_0x0030
            int r0 = r6.f6508a
            if (r0 == 0) goto L_0x0041
            long r2 = (long) r0
            j$.time.temporal.b r7 = p155j$.time.temporal.C2286b.YEARS
        L_0x002b:
            j$.time.LocalDate r7 = r1.mo6800j(r2, r7)
            goto L_0x0041
        L_0x0030:
            int r2 = r6.f6508a
            long r2 = (long) r2
            r4 = 12
            long r2 = r2 * r4
            long r4 = (long) r0
            long r2 = r2 + r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            j$.time.temporal.b r7 = p155j$.time.temporal.C2286b.MONTHS
            goto L_0x002b
        L_0x0041:
            int r0 = r6.f6510c
            if (r0 == 0) goto L_0x004e
            long r0 = (long) r0
            j$.time.temporal.b r2 = p155j$.time.temporal.C2286b.DAYS
            j$.time.LocalDate r7 = (p155j$.time.LocalDate) r7
            j$.time.LocalDate r7 = r7.mo6800j(r0, r2)
        L_0x004e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.C2276n.mo6995a(j$.time.temporal.k):j$.time.temporal.k");
    }

    /* renamed from: b */
    public int mo6996b() {
        return this.f6510c;
    }

    /* renamed from: c */
    public boolean mo6997c() {
        return this == f6507d;
    }

    /* renamed from: e */
    public long mo6998e() {
        return (((long) this.f6508a) * 12) + ((long) this.f6509b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2276n)) {
            return false;
        }
        C2276n nVar = (C2276n) obj;
        return this.f6508a == nVar.f6508a && this.f6509b == nVar.f6509b && this.f6510c == nVar.f6510c;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f6510c, 16) + Integer.rotateLeft(this.f6509b, 8) + this.f6508a;
    }

    public String toString() {
        if (this == f6507d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.f6508a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f6509b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f6510c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
