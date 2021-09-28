package p155j$.time.format;

import p155j$.time.C2220a;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.l */
class C2254l implements C2250h {

    /* renamed from: f */
    static final long[] f6436f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final C2300p f6437a;

    /* renamed from: b */
    final int f6438b;

    /* renamed from: c */
    final int f6439c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2239G f6440d;

    /* renamed from: e */
    final int f6441e;

    C2254l(C2300p pVar, int i, int i2, C2239G g) {
        this.f6437a = pVar;
        this.f6438b = i;
        this.f6439c = i2;
        this.f6440d = g;
        this.f6441e = 0;
    }

    protected C2254l(C2300p pVar, int i, int i2, C2239G g, int i3) {
        this.f6437a = pVar;
        this.f6438b = i;
        this.f6439c = i2;
        this.f6440d = g;
        this.f6441e = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo6928b(C2233A a, long j) {
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r10 = r6.f6441e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        if (r10 <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r4 != 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013e, code lost:
        if (r0 <= r1) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0144, code lost:
        if (r0 > r1) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6897c(p155j$.time.format.C2266x r18, java.lang.CharSequence r19, int r20) {
        /*
            r17 = this;
            r6 = r17
            r0 = r20
            int r1 = r19.length()
            if (r0 != r1) goto L_0x000c
            goto L_0x0147
        L_0x000c:
            char r2 = r19.charAt(r20)
            j$.time.format.D r3 = r18.mo6951g()
            char r3 = r3.mo6878e()
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0039
            j$.time.format.G r2 = r6.f6440d
            boolean r3 = r18.mo6956l()
            int r7 = r6.f6438b
            int r8 = r6.f6439c
            if (r7 != r8) goto L_0x002a
            r7 = r5
            goto L_0x002b
        L_0x002a:
            r7 = r4
        L_0x002b:
            boolean r2 = r2.mo6893c(r5, r3, r7)
            if (r2 != 0) goto L_0x0033
            goto L_0x0147
        L_0x0033:
            int r0 = r0 + 1
            r7 = r0
            r0 = r4
            r2 = r5
            goto L_0x0071
        L_0x0039:
            j$.time.format.D r3 = r18.mo6951g()
            char r3 = r3.mo6877d()
            if (r2 != r3) goto L_0x0060
            j$.time.format.G r2 = r6.f6440d
            boolean r3 = r18.mo6956l()
            int r7 = r6.f6438b
            int r8 = r6.f6439c
            if (r7 != r8) goto L_0x0051
            r7 = r5
            goto L_0x0052
        L_0x0051:
            r7 = r4
        L_0x0052:
            boolean r2 = r2.mo6893c(r4, r3, r7)
            if (r2 != 0) goto L_0x005a
            goto L_0x0147
        L_0x005a:
            int r0 = r0 + 1
            r7 = r0
            r2 = r4
            r0 = r5
            goto L_0x0071
        L_0x0060:
            j$.time.format.G r2 = r6.f6440d
            j$.time.format.G r3 = p155j$.time.format.C2239G.ALWAYS
            if (r2 != r3) goto L_0x006e
            boolean r2 = r18.mo6956l()
            if (r2 == 0) goto L_0x006e
            goto L_0x0147
        L_0x006e:
            r7 = r0
            r0 = r4
            r2 = r0
        L_0x0071:
            boolean r3 = r18.mo6956l()
            if (r3 != 0) goto L_0x0080
            boolean r3 = r17.mo6929e(r18)
            if (r3 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r3 = r5
            goto L_0x0082
        L_0x0080:
            int r3 = r6.f6438b
        L_0x0082:
            int r8 = r7 + r3
            if (r8 <= r1) goto L_0x0088
            goto L_0x0146
        L_0x0088:
            boolean r9 = r18.mo6956l()
            if (r9 != 0) goto L_0x0098
            boolean r9 = r17.mo6929e(r18)
            if (r9 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            r9 = 9
            goto L_0x009a
        L_0x0098:
            int r9 = r6.f6439c
        L_0x009a:
            int r10 = r6.f6441e
            int r10 = java.lang.Math.max(r10, r4)
            int r10 = r10 + r9
        L_0x00a1:
            r9 = 0
            r11 = 2
            if (r4 >= r11) goto L_0x0100
            int r10 = r10 + r7
            int r10 = java.lang.Math.min(r10, r1)
            r11 = r7
            r14 = 0
        L_0x00ad:
            if (r11 >= r10) goto L_0x00ec
            int r16 = r11 + 1
            r5 = r19
            char r11 = r5.charAt(r11)
            j$.time.format.D r12 = r18.mo6951g()
            int r11 = r12.mo6875b(r11)
            if (r11 >= 0) goto L_0x00c7
            int r11 = r16 + -1
            if (r11 >= r8) goto L_0x00ee
            goto L_0x0146
        L_0x00c7:
            int r12 = r16 - r7
            r13 = 18
            if (r12 <= r13) goto L_0x00e3
            if (r9 != 0) goto L_0x00d3
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r14)
        L_0x00d3:
            java.math.BigInteger r12 = java.math.BigInteger.TEN
            java.math.BigInteger r9 = r9.multiply(r12)
            long r11 = (long) r11
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r11)
            java.math.BigInteger r9 = r9.add(r11)
            goto L_0x00e8
        L_0x00e3:
            r12 = 10
            long r14 = r14 * r12
            long r11 = (long) r11
            long r14 = r14 + r11
        L_0x00e8:
            r11 = r16
            r5 = 1
            goto L_0x00ad
        L_0x00ec:
            r5 = r19
        L_0x00ee:
            int r10 = r6.f6441e
            if (r10 <= 0) goto L_0x00fe
            if (r4 != 0) goto L_0x00fe
            int r11 = r11 - r7
            int r11 = r11 - r10
            int r10 = java.lang.Math.max(r3, r11)
            int r4 = r4 + 1
            r5 = 1
            goto L_0x00a1
        L_0x00fe:
            r5 = r11
            goto L_0x0103
        L_0x0100:
            r5 = r7
            r14 = 0
        L_0x0103:
            if (r0 == 0) goto L_0x012c
            if (r9 == 0) goto L_0x011c
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0117
            boolean r0 = r18.mo6956l()
            if (r0 == 0) goto L_0x0117
        L_0x0115:
            r0 = 1
            goto L_0x0141
        L_0x0117:
            java.math.BigInteger r9 = r9.negate()
            goto L_0x0149
        L_0x011c:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0129
            boolean r0 = r18.mo6956l()
            if (r0 == 0) goto L_0x0129
            goto L_0x0140
        L_0x0129:
            long r0 = -r14
            r2 = r0
            goto L_0x014a
        L_0x012c:
            j$.time.format.G r0 = r6.f6440d
            j$.time.format.G r1 = p155j$.time.format.C2239G.EXCEEDS_PAD
            if (r0 != r1) goto L_0x0149
            boolean r0 = r18.mo6956l()
            if (r0 == 0) goto L_0x0149
            int r0 = r5 - r7
            int r1 = r6.f6438b
            if (r2 == 0) goto L_0x0144
            if (r0 > r1) goto L_0x0149
        L_0x0140:
            goto L_0x0115
        L_0x0141:
            int r7 = r7 - r0
            int r0 = ~r7
            goto L_0x0169
        L_0x0144:
            if (r0 <= r1) goto L_0x0149
        L_0x0146:
            r0 = r7
        L_0x0147:
            int r0 = ~r0
            goto L_0x0169
        L_0x0149:
            r2 = r14
        L_0x014a:
            if (r9 == 0) goto L_0x0160
            int r0 = r9.bitLength()
            r1 = 63
            if (r0 <= r1) goto L_0x015c
            java.math.BigInteger r0 = java.math.BigInteger.TEN
            java.math.BigInteger r9 = r9.divide(r0)
            int r5 = r5 + -1
        L_0x015c:
            long r2 = r9.longValue()
        L_0x0160:
            r0 = r17
            r1 = r18
            r4 = r7
            int r0 = r0.mo6930f(r1, r2, r4, r5)
        L_0x0169:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2254l.mo6897c(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[LOOP:0: B:30:0x009a->B:32:0x00a3, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6898d(p155j$.time.format.C2233A r11, java.lang.StringBuilder r12) {
        /*
            r10 = this;
            j$.time.temporal.p r0 = r10.f6437a
            java.lang.Long r0 = r11.mo6866e(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            long r2 = r0.longValue()
            long r2 = r10.mo6928b(r11, r2)
            j$.time.format.D r11 = r11.mo6863b()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "9223372036854775808"
            goto L_0x0027
        L_0x001f:
            long r4 = java.lang.Math.abs(r2)
            java.lang.String r0 = java.lang.Long.toString(r4)
        L_0x0027:
            int r4 = r0.length()
            int r5 = r10.f6439c
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            if (r4 > r5) goto L_0x00b1
            r11.mo6874a(r0)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 2
            r8 = 1
            if (r4 < 0) goto L_0x0060
            int[] r4 = p155j$.time.format.C2246e.f6417a
            j$.time.format.G r6 = r10.f6440d
            int r6 = r6.ordinal()
            r4 = r4[r6]
            if (r4 == r8) goto L_0x004d
            if (r4 == r5) goto L_0x005b
            goto L_0x009a
        L_0x004d:
            int r4 = r10.f6438b
            r5 = 19
            if (r4 >= r5) goto L_0x009a
            long[] r5 = f6436f
            r4 = r5[r4]
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x009a
        L_0x005b:
            char r2 = r11.mo6878e()
            goto L_0x0097
        L_0x0060:
            int[] r4 = p155j$.time.format.C2246e.f6417a
            j$.time.format.G r9 = r10.f6440d
            int r9 = r9.ordinal()
            r4 = r4[r9]
            if (r4 == r8) goto L_0x0093
            if (r4 == r5) goto L_0x0093
            r5 = 3
            if (r4 == r5) goto L_0x0093
            r5 = 4
            if (r4 == r5) goto L_0x0075
            goto L_0x009a
        L_0x0075:
            j$.time.d r11 = new j$.time.d
            java.lang.StringBuilder r12 = p155j$.time.C2220a.m5746a(r7)
            j$.time.temporal.p r0 = r10.f6437a
            r12.append(r0)
            r12.append(r6)
            r12.append(r2)
            java.lang.String r0 = " cannot be negative according to the SignStyle"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0093:
            char r2 = r11.mo6877d()
        L_0x0097:
            r12.append(r2)
        L_0x009a:
            int r2 = r10.f6438b
            int r3 = r0.length()
            int r2 = r2 - r3
            if (r1 >= r2) goto L_0x00ad
            char r2 = r11.mo6880f()
            r12.append(r2)
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00ad:
            r12.append(r0)
            return r8
        L_0x00b1:
            j$.time.d r11 = new j$.time.d
            java.lang.StringBuilder r12 = p155j$.time.C2220a.m5746a(r7)
            j$.time.temporal.p r0 = r10.f6437a
            r12.append(r0)
            r12.append(r6)
            r12.append(r2)
            java.lang.String r0 = " exceeds the maximum print width of "
            r12.append(r0)
            int r0 = r10.f6439c
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2254l.mo6898d(j$.time.format.A, java.lang.StringBuilder):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo6929e(C2266x xVar) {
        int i = this.f6441e;
        return i == -1 || (i > 0 && this.f6438b == this.f6439c && this.f6440d == C2239G.NOT_NEGATIVE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo6930f(C2266x xVar, long j, int i, int i2) {
        return xVar.mo6959o(this.f6437a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2254l mo6931g() {
        return this.f6441e == -1 ? this : new C2254l(this.f6437a, this.f6438b, this.f6439c, this.f6440d, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2254l mo6932h(int i) {
        return new C2254l(this.f6437a, this.f6438b, this.f6439c, this.f6440d, this.f6441e + i);
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        int i = this.f6438b;
        if (i == 1 && this.f6439c == 19 && this.f6440d == C2239G.NORMAL) {
            sb = C2220a.m5746a("Value(");
            obj = this.f6437a;
        } else if (i == this.f6439c && this.f6440d == C2239G.NOT_NEGATIVE) {
            sb = C2220a.m5746a("Value(");
            sb.append(this.f6437a);
            sb.append(",");
            sb.append(this.f6438b);
            sb.append(")");
            return sb.toString();
        } else {
            sb = C2220a.m5746a("Value(");
            sb.append(this.f6437a);
            sb.append(",");
            sb.append(this.f6438b);
            sb.append(",");
            sb.append(this.f6439c);
            sb.append(",");
            obj = this.f6440d;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
