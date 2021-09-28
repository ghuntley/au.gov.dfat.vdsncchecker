package p127u3;

import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1579a;
import p103q3.C1612b;
import p103q3.C1615c;
import p103q3.C1618e;
import p103q3.C1621f;
import p109r3.C1684a;
import p109r3.C1685b;
import p121t3.C1799a;
import p121t3.C1802c;
import p121t3.C1803d;
import p121t3.C1804e;
import p133v3.C1970c;

/* renamed from: u3.k */
public class C1871k extends C1684a implements C1803d {

    /* renamed from: a */
    public final C1799a f5569a;

    /* renamed from: b */
    public final C1873m f5570b;

    /* renamed from: c */
    public final C1863e f5571c;

    /* renamed from: d */
    public final C1970c f5572d;

    /* renamed from: e */
    public int f5573e = -1;

    /* renamed from: f */
    public final C1802c f5574f;

    public C1871k(C1799a aVar, C1873m mVar, C1863e eVar) {
        C1241e.m3517j(aVar, "json");
        C1241e.m3517j(eVar, "lexer");
        this.f5569a = aVar;
        this.f5570b = mVar;
        this.f5571c = eVar;
        this.f5572d = aVar.f5449b;
        this.f5574f = aVar.f5448a;
    }

    /* renamed from: a */
    public final C1799a mo6114a() {
        return this.f5569a;
    }

    /* renamed from: c */
    public <T> T mo5875c(C1579a<T> aVar) {
        C1241e.m3517j(aVar, "deserializer");
        return C1320u.m3705i(this, aVar);
    }

    /* renamed from: d */
    public long mo5876d() {
        boolean z;
        C1863e eVar = this.f5571c;
        int n = eVar.mo6388n();
        Throwable th = null;
        if (n != eVar.f5551a.length()) {
            if (eVar.f5551a.charAt(n) == '\"') {
                n++;
                if (n != eVar.f5551a.length()) {
                    z = true;
                } else {
                    eVar.mo6384i("EOF", eVar.f5552b);
                    throw null;
                }
            } else {
                z = false;
            }
            int i = n;
            boolean z2 = true;
            boolean z3 = false;
            long j = 0;
            while (z2) {
                char charAt = eVar.f5551a.charAt(i);
                if (charAt == '-') {
                    if (i == n) {
                        i++;
                        z3 = true;
                    } else {
                        eVar.mo6384i("Unexpected symbol '-' in numeric literal", eVar.f5552b);
                        throw th;
                    }
                } else if (C1320u.m3703g(charAt) != 0) {
                    break;
                } else {
                    i++;
                    z2 = i != eVar.f5551a.length();
                    int i2 = charAt - '0';
                    if (i2 >= 0 && i2 <= 9) {
                        j = (j * ((long) 10)) - ((long) i2);
                        if (j <= 0) {
                            th = null;
                        } else {
                            eVar.mo6384i("Numeric value overflow", eVar.f5552b);
                            throw null;
                        }
                    } else {
                        eVar.mo6384i("Unexpected symbol '" + charAt + "' in numeric literal", eVar.f5552b);
                        throw null;
                    }
                }
            }
            if (n == i || (z3 && n == i - 1)) {
                eVar.mo6384i("Expected numeric literal", eVar.f5552b);
                throw null;
            }
            if (z) {
                if (!z2) {
                    eVar.mo6384i("EOF", eVar.f5552b);
                    throw null;
                } else if (eVar.f5551a.charAt(i) == '\"') {
                    i++;
                } else {
                    eVar.mo6384i("Expected closing quotation mark", eVar.f5552b);
                    throw null;
                }
            }
            eVar.f5552b = i;
            if (z3) {
                return j;
            }
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            eVar.mo6384i("Numeric value overflow", i);
            throw null;
        }
        eVar.mo6384i("EOF", eVar.f5552b);
        throw null;
    }

    /* renamed from: e */
    public C1685b mo5886e(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        C1799a aVar = this.f5569a;
        C1873m mVar = C1873m.LIST;
        C1241e.m3517j(aVar, "<this>");
        C1241e.m3517j(cVar, "desc");
        C1618e i = cVar.mo5766i();
        if (!C1241e.m3513b(i, C1621f.C1623b.f4999a)) {
            if (C1241e.m3513b(i, C1621f.C1624c.f5000a)) {
                C1615c f = C1320u.m3702f(cVar.mo5764h(0), aVar.f5449b);
                C1618e i2 = f.mo5766i();
                if ((i2 instanceof C1612b) || C1241e.m3513b(i2, C1618e.C1620b.f4997a)) {
                    mVar = C1873m.MAP;
                } else if (!aVar.f5448a.f5455d) {
                    throw C1320u.m3697a(f);
                }
            } else {
                mVar = C1873m.OBJ;
            }
        }
        this.f5571c.mo6380e(mVar.f5581e);
        if (this.f5571c.mo6387m() != 4) {
            int ordinal = mVar.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return new C1871k(this.f5569a, mVar, this.f5571c);
            }
            return this.f5570b == mVar ? this : new C1871k(this.f5569a, mVar, this.f5571c);
        }
        C1863e.m5080k(this.f5571c, "Unexpected leading comma", 0, 2);
        throw null;
    }

    /* renamed from: h */
    public C1804e mo6115h() {
        return new C1870j(this.f5569a.f5448a, this.f5571c).mo6394a();
    }

    /* renamed from: i */
    public boolean mo5887i() {
        return this.f5571c.mo6390p();
    }

    /* renamed from: j */
    public C1970c mo5883j() {
        return this.f5572d;
    }

    /* renamed from: l */
    public void mo5884l(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        this.f5571c.mo6380e(this.f5570b.f5582f);
    }

    /* renamed from: m */
    public Void mo5888m() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0130 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0128  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5885n(p103q3.C1615c r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "descriptor"
            p072l2.C1241e.m3517j(r1, r2)
            u3.m r2 = r0.f5570b
            int r2 = r2.ordinal()
            r3 = 58
            java.lang.String r4 = "Unexpected trailing comma"
            r5 = -1
            r6 = 0
            r7 = 1
            r8 = 2
            r9 = 0
            if (r2 == 0) goto L_0x009e
            if (r2 == r8) goto L_0x0049
            u3.e r1 = r0.f5571c
            boolean r1 = r1.mo6389o()
            u3.e r2 = r0.f5571c
            boolean r2 = r2.mo6376a()
            if (r2 == 0) goto L_0x003f
            int r2 = r0.f5573e
            if (r2 == r5) goto L_0x0039
            if (r1 == 0) goto L_0x0031
            goto L_0x0039
        L_0x0031:
            u3.e r1 = r0.f5571c
            java.lang.String r2 = "Expected end of the array or comma"
            p127u3.C1863e.m5080k(r1, r2, r6, r8)
            throw r9
        L_0x0039:
            int r5 = r2 + 1
            r0.f5573e = r5
            goto L_0x0212
        L_0x003f:
            if (r1 != 0) goto L_0x0043
            goto L_0x0212
        L_0x0043:
            u3.e r1 = r0.f5571c
            p127u3.C1863e.m5080k(r1, r4, r6, r8)
            throw r9
        L_0x0049:
            int r1 = r0.f5573e
            int r2 = r1 % 2
            if (r2 == 0) goto L_0x0051
            r2 = r7
            goto L_0x0052
        L_0x0051:
            r2 = r6
        L_0x0052:
            if (r2 == 0) goto L_0x005d
            if (r1 == r5) goto L_0x0062
            u3.e r1 = r0.f5571c
            boolean r1 = r1.mo6389o()
            goto L_0x0063
        L_0x005d:
            u3.e r1 = r0.f5571c
            r1.mo6380e(r3)
        L_0x0062:
            r1 = r6
        L_0x0063:
            u3.e r3 = r0.f5571c
            boolean r3 = r3.mo6376a()
            if (r3 == 0) goto L_0x0092
            if (r2 == 0) goto L_0x008a
            int r2 = r0.f5573e
            if (r2 != r5) goto L_0x007d
            u3.e r2 = r0.f5571c
            r1 = r1 ^ r7
            int r3 = r2.f5552b
            if (r1 == 0) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            r2.mo6384i(r4, r3)
            throw r9
        L_0x007d:
            u3.e r2 = r0.f5571c
            int r3 = r2.f5552b
            if (r1 == 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            java.lang.String r1 = "Expected comma after the key-value pair"
            r2.mo6384i(r1, r3)
            throw r9
        L_0x008a:
            int r1 = r0.f5573e
            int r5 = r1 + 1
            r0.f5573e = r5
            goto L_0x0212
        L_0x0092:
            if (r1 != 0) goto L_0x0096
            goto L_0x0212
        L_0x0096:
            u3.e r1 = r0.f5571c
            java.lang.String r2 = "Expected '}', but had ',' instead"
            p127u3.C1863e.m5080k(r1, r2, r6, r8)
            throw r9
        L_0x009e:
            u3.e r2 = r0.f5571c
            boolean r2 = r2.mo6389o()
        L_0x00a4:
            u3.e r10 = r0.f5571c
            boolean r10 = r10.mo6376a()
            if (r10 == 0) goto L_0x0210
            t3.c r2 = r0.f5574f
            boolean r2 = r2.f5454c
            if (r2 == 0) goto L_0x00b9
            u3.e r2 = r0.f5571c
            java.lang.String r2 = r2.mo6383h()
            goto L_0x00bf
        L_0x00b9:
            u3.e r2 = r0.f5571c
            java.lang.String r2 = r2.mo6377b()
        L_0x00bf:
            u3.e r10 = r0.f5571c
            r10.mo6380e(r3)
            t3.a r10 = r0.f5569a
            int r10 = p127u3.C1864f.m5098b(r1, r10, r2)
            r11 = -3
            if (r10 == r11) goto L_0x0133
            t3.c r12 = r0.f5574f
            boolean r12 = r12.f5458g
            if (r12 == 0) goto L_0x0130
            t3.a r12 = r0.f5569a
            q3.c r13 = r1.mo5764h(r10)
            boolean r14 = r13.mo5762f()
            if (r14 != 0) goto L_0x00e9
            u3.e r14 = r0.f5571c
            boolean r14 = r14.mo6390p()
            r14 = r14 ^ r7
            if (r14 == 0) goto L_0x00e9
            goto L_0x0123
        L_0x00e9:
            q3.e r14 = r13.mo5766i()
            q3.e$b r15 = p103q3.C1618e.C1620b.f4997a
            boolean r14 = p072l2.C1241e.m3513b(r14, r15)
            if (r14 == 0) goto L_0x0125
            u3.e r14 = r0.f5571c
            t3.c r15 = r0.f5574f
            boolean r15 = r15.f5454c
            byte r3 = r14.mo6387m()
            if (r15 == 0) goto L_0x010b
            if (r3 == r7) goto L_0x0106
            if (r3 == 0) goto L_0x0106
            goto L_0x010d
        L_0x0106:
            java.lang.String r3 = r14.mo6382g()
            goto L_0x0113
        L_0x010b:
            if (r3 == r7) goto L_0x010f
        L_0x010d:
            r3 = r9
            goto L_0x0115
        L_0x010f:
            java.lang.String r3 = r14.mo6381f()
        L_0x0113:
            r14.f5553c = r3
        L_0x0115:
            if (r3 != 0) goto L_0x0118
            goto L_0x0125
        L_0x0118:
            int r3 = p127u3.C1864f.m5098b(r13, r12, r3)
            if (r3 != r11) goto L_0x0125
            u3.e r3 = r0.f5571c
            r3.mo6381f()
        L_0x0123:
            r3 = r7
            goto L_0x0126
        L_0x0125:
            r3 = r6
        L_0x0126:
            if (r3 == 0) goto L_0x0130
            u3.e r3 = r0.f5571c
            boolean r3 = r3.mo6389o()
            r10 = r6
            goto L_0x0135
        L_0x0130:
            r5 = r10
            goto L_0x0212
        L_0x0133:
            r3 = r6
            r10 = r7
        L_0x0135:
            if (r10 == 0) goto L_0x020b
            t3.c r3 = r0.f5574f
            boolean r10 = r3.f5453b
            r11 = 6
            if (r10 == 0) goto L_0x01d1
            u3.e r2 = r0.f5571c
            boolean r3 = r3.f5454c
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            byte r12 = r2.mo6387m()
            r13 = 8
            if (r12 == r13) goto L_0x0159
            if (r12 == r11) goto L_0x0159
            r2.mo6382g()
            goto L_0x01c2
        L_0x0159:
            byte r12 = r2.mo6387m()
            if (r12 != r7) goto L_0x0169
            if (r3 == 0) goto L_0x0165
            r2.mo6382g()
            goto L_0x0159
        L_0x0165:
            r2.mo6377b()
            goto L_0x0159
        L_0x0169:
            if (r12 != r13) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            if (r12 != r11) goto L_0x0170
        L_0x016e:
            r14 = r7
            goto L_0x0171
        L_0x0170:
            r14 = r6
        L_0x0171:
            if (r14 == 0) goto L_0x017b
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r10.add(r12)
            goto L_0x01b9
        L_0x017b:
            r14 = 9
            if (r12 != r14) goto L_0x0197
            java.lang.Object r12 = p126u2.C1850k.m5052N(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            byte r12 = r12.byteValue()
            if (r12 != r13) goto L_0x018c
            goto L_0x01a6
        L_0x018c:
            int r1 = r2.f5552b
            java.lang.String r2 = r2.f5551a
            java.lang.String r3 = "found ] instead of }"
            u3.d r1 = p073l3.C1320u.m3699c(r1, r3, r2)
            throw r1
        L_0x0197:
            r14 = 7
            if (r12 != r14) goto L_0x01b5
            java.lang.Object r12 = p126u2.C1850k.m5052N(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            byte r12 = r12.byteValue()
            if (r12 != r11) goto L_0x01aa
        L_0x01a6:
            p126u2.C1848i.m5048J(r10)
            goto L_0x01b9
        L_0x01aa:
            int r1 = r2.f5552b
            java.lang.String r2 = r2.f5551a
            java.lang.String r3 = "found } instead of ]"
            u3.d r1 = p073l3.C1320u.m3699c(r1, r3, r2)
            throw r1
        L_0x01b5:
            r14 = 10
            if (r12 == r14) goto L_0x01c9
        L_0x01b9:
            r2.mo6378c()
            int r12 = r10.size()
            if (r12 != 0) goto L_0x0159
        L_0x01c2:
            u3.e r2 = r0.f5571c
            boolean r2 = r2.mo6389o()
            goto L_0x020c
        L_0x01c9:
            int r1 = r2.f5552b
            java.lang.String r3 = "Unexpected end of input due to malformed JSON during ignoring unknown keys"
            r2.mo6384i(r3, r1)
            throw r9
        L_0x01d1:
            u3.e r1 = r0.f5571c
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "key"
            p072l2.C1241e.m3517j(r2, r3)
            java.lang.String r3 = r1.f5551a
            int r4 = r1.f5552b
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r3, r5)
            java.lang.String r3 = r3.substring(r6, r4)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r3, r4)
            int r3 = p067k3.C1209l.m3448c0(r3, r2, r6, r6, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Encountered an unknown key '"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.mo6384i(r2, r3)
            throw r9
        L_0x020b:
            r2 = r3
        L_0x020c:
            r3 = 58
            goto L_0x00a4
        L_0x0210:
            if (r2 != 0) goto L_0x0213
        L_0x0212:
            return r5
        L_0x0213:
            u3.e r1 = r0.f5571c
            p127u3.C1863e.m5080k(r1, r4, r6, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p127u3.C1871k.mo5885n(q3.c):int");
    }

    /* renamed from: p */
    public String mo5881p() {
        return this.f5574f.f5454c ? this.f5571c.mo6383h() : this.f5571c.mo6381f();
    }
}
