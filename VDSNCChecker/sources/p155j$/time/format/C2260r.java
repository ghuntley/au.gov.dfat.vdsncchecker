package p155j$.time.format;

import p155j$.time.C2220a;
import p155j$.time.LocalDate;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2228f;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.r */
final class C2260r extends C2254l {

    /* renamed from: i */
    static final LocalDate f6460i = LocalDate.m5671v(2000, 1, 1);

    /* renamed from: g */
    private final int f6461g;

    /* renamed from: h */
    private final C2224b f6462h;

    C2260r(C2300p pVar, int i, int i2, int i3, C2224b bVar) {
        this(pVar, i, i2, i3, bVar, 0);
        if (i < 1 || i > 10) {
            throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 10) {
            throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    private C2260r(C2300p pVar, int i, int i2, int i3, C2224b bVar, int i4) {
        super(pVar, i, i2, C2239G.NOT_NEGATIVE, i4);
        this.f6461g = i3;
        this.f6462h = bVar;
    }

    /* synthetic */ C2260r(C2300p pVar, int i, int i2, int i3, C2224b bVar, int i4, C2244c cVar) {
        this(pVar, i, i2, i3, bVar, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo6928b(C2233A a, long j) {
        long j2;
        long abs = Math.abs(j);
        int i = this.f6461g;
        if (this.f6462h != null) {
            C2228f.m5757k(a.mo6865d());
            i = LocalDate.m5669o(this.f6462h).mo6789b(this.f6437a);
        }
        long j3 = (long) i;
        if (j >= j3) {
            long[] jArr = C2254l.f6436f;
            int i2 = this.f6438b;
            if (j < j3 + jArr[i2]) {
                j2 = jArr[i2];
                return abs % j2;
            }
        }
        j2 = C2254l.f6436f[this.f6439c];
        return abs % j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo6929e(C2266x xVar) {
        if (!xVar.mo6956l()) {
            return false;
        }
        return super.mo6929e(xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo6930f(C2266x xVar, long j, int i, int i2) {
        int i3 = this.f6461g;
        if (this.f6462h != null) {
            xVar.mo6952h();
            i3 = LocalDate.m5669o(this.f6462h).mo6789b(this.f6437a);
            xVar.mo6947a(new C2259q(this, xVar, j, i, i2));
        }
        int i4 = i2 - i;
        int i5 = this.f6438b;
        if (i4 == i5 && j >= 0) {
            long j2 = C2254l.f6436f[i5];
            long j3 = (long) i3;
            long j4 = j3 - (j3 % j2);
            j = i3 > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return xVar.mo6959o(this.f6437a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2254l mo6931g() {
        return this.f6441e == -1 ? this : new C2260r(this.f6437a, this.f6438b, this.f6439c, this.f6461g, this.f6462h, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2254l mo6932h(int i) {
        return new C2260r(this.f6437a, this.f6438b, this.f6439c, this.f6461g, this.f6462h, this.f6441e + i);
    }

    public String toString() {
        StringBuilder a = C2220a.m5746a("ReducedValue(");
        a.append(this.f6437a);
        a.append(",");
        a.append(this.f6438b);
        a.append(",");
        a.append(this.f6439c);
        a.append(",");
        Object obj = this.f6462h;
        if (obj == null) {
            obj = Integer.valueOf(this.f6461g);
        }
        a.append(obj);
        a.append(")");
        return a.toString();
    }
}
