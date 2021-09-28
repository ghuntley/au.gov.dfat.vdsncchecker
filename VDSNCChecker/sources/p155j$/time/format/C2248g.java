package p155j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p155j$.time.ZoneId;
import p155j$.time.chrono.C2228f;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2294j;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.g */
public final class C2248g {

    /* renamed from: h */
    private static final Map f6419h;

    /* renamed from: i */
    public static final /* synthetic */ int f6420i = 0;

    /* renamed from: a */
    private C2248g f6421a;

    /* renamed from: b */
    private final C2248g f6422b;

    /* renamed from: c */
    private final List f6423c;

    /* renamed from: d */
    private final boolean f6424d;

    /* renamed from: e */
    private int f6425e;

    /* renamed from: f */
    private char f6426f;

    /* renamed from: g */
    private int f6427g;

    /* renamed from: j$.time.format.g$a */
    static final class C2249a implements C2250h {

        /* renamed from: a */
        private final C2250h[] f6428a;

        /* renamed from: b */
        private final boolean f6429b;

        C2249a(List list, boolean z) {
            this.f6428a = (C2250h[]) list.toArray(new C2250h[list.size()]);
            this.f6429b = z;
        }

        C2249a(C2250h[] hVarArr, boolean z) {
            this.f6428a = hVarArr;
            this.f6429b = z;
        }

        /* renamed from: a */
        public C2249a mo6922a(boolean z) {
            return z == this.f6429b ? this : new C2249a(this.f6428a, z);
        }

        /* renamed from: c */
        public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
            if (this.f6429b) {
                xVar.mo6962r();
                int i2 = i;
                for (C2250h c : this.f6428a) {
                    i2 = c.mo6897c(xVar, charSequence, i2);
                    if (i2 < 0) {
                        xVar.mo6950f(false);
                        return i;
                    }
                }
                xVar.mo6950f(true);
                return i2;
            }
            for (C2250h c2 : this.f6428a) {
                i = c2.mo6897c(xVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo6898d(C2233A a, StringBuilder sb) {
            int length = sb.length();
            if (this.f6429b) {
                a.mo6868g();
            }
            try {
                for (C2250h d : this.f6428a) {
                    if (!d.mo6898d(a, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f6429b) {
                    a.mo6862a();
                }
                return true;
            } finally {
                if (this.f6429b) {
                    a.mo6862a();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f6428a != null) {
                sb.append(this.f6429b ? "[" : "(");
                for (C2250h append : this.f6428a) {
                    sb.append(append);
                }
                sb.append(this.f6429b ? "]" : ")");
            }
            return sb.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f6419h = hashMap;
        hashMap.put('G', C2285a.ERA);
        hashMap.put('y', C2285a.YEAR_OF_ERA);
        hashMap.put('u', C2285a.YEAR);
        C2300p pVar = C2294j.f6549a;
        hashMap.put('Q', pVar);
        hashMap.put('q', pVar);
        C2285a aVar = C2285a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', C2285a.DAY_OF_YEAR);
        hashMap.put('d', C2285a.DAY_OF_MONTH);
        hashMap.put('F', C2285a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C2285a aVar2 = C2285a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', C2285a.AMPM_OF_DAY);
        hashMap.put('H', C2285a.HOUR_OF_DAY);
        hashMap.put('k', C2285a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C2285a.HOUR_OF_AMPM);
        hashMap.put('h', C2285a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', C2285a.MINUTE_OF_HOUR);
        hashMap.put('s', C2285a.SECOND_OF_MINUTE);
        C2285a aVar3 = C2285a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', C2285a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C2285a.NANO_OF_DAY);
    }

    public C2248g() {
        this.f6421a = this;
        this.f6423c = new ArrayList();
        this.f6427g = -1;
        this.f6422b = null;
        this.f6424d = false;
    }

    private C2248g(C2248g gVar, boolean z) {
        this.f6421a = this;
        this.f6423c = new ArrayList();
        this.f6427g = -1;
        this.f6422b = gVar;
        this.f6424d = z;
    }

    /* renamed from: d */
    private int m5822d(C2250h hVar) {
        Objects.requireNonNull(hVar, "pp");
        C2248g gVar = this.f6421a;
        int i = gVar.f6425e;
        if (i > 0) {
            C2256n nVar = new C2256n(hVar, i, gVar.f6426f);
            gVar.f6425e = 0;
            gVar.f6426f = 0;
            hVar = nVar;
        }
        gVar.f6423c.add(hVar);
        C2248g gVar2 = this.f6421a;
        gVar2.f6427g = -1;
        return gVar2.f6423c.size() - 1;
    }

    /* renamed from: m */
    private C2248g m5823m(C2254l lVar) {
        C2254l lVar2;
        C2248g gVar = this.f6421a;
        int i = gVar.f6427g;
        if (i >= 0) {
            C2254l lVar3 = (C2254l) gVar.f6423c.get(i);
            if (lVar.f6438b == lVar.f6439c && lVar.f6440d == C2239G.NOT_NEGATIVE) {
                lVar2 = lVar3.mo6932h(lVar.f6439c);
                m5822d(lVar.mo6931g());
                this.f6421a.f6427g = i;
            } else {
                lVar2 = lVar3.mo6931g();
                this.f6421a.f6427g = m5822d(lVar);
            }
            this.f6421a.f6423c.set(i, lVar2);
        } else {
            gVar.f6427g = m5822d(lVar);
        }
        return this;
    }

    /* renamed from: y */
    private DateTimeFormatter m5824y(Locale locale, C2238F f, C2228f fVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f6421a.f6422b != null) {
            mo6915r();
        }
        return new DateTimeFormatter(new C2249a(this.f6423c, false), locale, C2236D.f6386a, f, (Set) null, fVar, (ZoneId) null);
    }

    /* renamed from: a */
    public C2248g mo6900a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m5822d(dateTimeFormatter.mo6889h(false));
        return this;
    }

    /* renamed from: b */
    public C2248g mo6901b(C2300p pVar, int i, int i2, boolean z) {
        m5822d(new C2251i(pVar, i, i2, z));
        return this;
    }

    /* renamed from: c */
    public C2248g mo6902c() {
        m5822d(new C2252j(-2));
        return this;
    }

    /* renamed from: e */
    public C2248g mo6903e(char c) {
        m5822d(new C2247f(c));
        return this;
    }

    /* renamed from: f */
    public C2248g mo6904f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.length() > 0) {
            m5822d(str.length() == 1 ? new C2247f(str.charAt(0)) : new C2253k(str));
        }
        return this;
    }

    /* renamed from: g */
    public C2248g mo6905g(C2240H h) {
        Objects.requireNonNull(h, "style");
        if (h == C2240H.FULL || h == C2240H.SHORT) {
            m5822d(new C2253k(h));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    /* renamed from: h */
    public C2248g mo6906h(String str, String str2) {
        m5822d(new C2255m(str, str2));
        return this;
    }

    /* renamed from: i */
    public C2248g mo6907i() {
        m5822d(C2255m.f6443d);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        if (r3 == 1) goto L_0x01c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0332 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.format.C2248g mo6908j(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "pattern"
            java.util.Objects.requireNonNull(r1, r2)
            r2 = 0
            r3 = r2
        L_0x000b:
            int r4 = r18.length()
            if (r3 >= r4) goto L_0x0393
            char r4 = r1.charAt(r3)
            r5 = 65
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 90
            r8 = 97
            r9 = 1
            if (r4 < r5) goto L_0x0022
            if (r4 <= r7) goto L_0x0026
        L_0x0022:
            if (r4 < r8) goto L_0x02ed
            if (r4 > r6) goto L_0x02ed
        L_0x0026:
            int r10 = r3 + 1
        L_0x0028:
            int r11 = r18.length()
            if (r10 >= r11) goto L_0x0037
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0037
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0037:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x00a6
            int r11 = r18.length()
            if (r10 >= r11) goto L_0x0064
            char r4 = r1.charAt(r10)
            if (r4 < r5) goto L_0x004c
            if (r4 <= r7) goto L_0x0050
        L_0x004c:
            if (r4 < r8) goto L_0x0064
            if (r4 > r6) goto L_0x0064
        L_0x0050:
            int r5 = r10 + 1
        L_0x0052:
            int r11 = r18.length()
            if (r5 >= r11) goto L_0x0061
            char r11 = r1.charAt(r5)
            if (r11 != r4) goto L_0x0061
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0061:
            int r10 = r5 - r10
            goto L_0x0067
        L_0x0064:
            r5 = r10
            r10 = r3
            r3 = r2
        L_0x0067:
            if (r3 == 0) goto L_0x008f
            if (r3 < r9) goto L_0x0078
            j$.time.format.g r11 = r0.f6421a
            r11.f6425e = r3
            r3 = 32
            r11.f6426f = r3
            r11.f6427g = r12
            r3 = r10
            r10 = r5
            goto L_0x00a6
        L_0x0078:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pad letter 'p' must be followed by valid pad pattern: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00a6:
            java.util.Map r5 = f6419h
            java.lang.Character r11 = java.lang.Character.valueOf(r4)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r11)
            r12 = r5
            j$.time.temporal.p r12 = (p155j$.time.temporal.C2300p) r12
            r5 = 5
            r11 = 4
            java.lang.String r13 = "Too many pattern letters: "
            r14 = 2
            if (r12 == 0) goto L_0x01db
            r6 = 81
            r7 = 3
            if (r4 == r6) goto L_0x0187
            r6 = 83
            if (r4 == r6) goto L_0x017b
            if (r4 == r8) goto L_0x016e
            r6 = 104(0x68, float:1.46E-43)
            if (r4 == r6) goto L_0x0159
            r6 = 107(0x6b, float:1.5E-43)
            if (r4 == r6) goto L_0x0159
            r6 = 109(0x6d, float:1.53E-43)
            if (r4 == r6) goto L_0x0159
            r6 = 113(0x71, float:1.58E-43)
            if (r4 == r6) goto L_0x0157
            r6 = 115(0x73, float:1.61E-43)
            if (r4 == r6) goto L_0x0159
            r6 = 117(0x75, float:1.64E-43)
            if (r4 == r6) goto L_0x0130
            r6 = 121(0x79, float:1.7E-43)
            if (r4 == r6) goto L_0x0130
            switch(r4) {
                case 68: goto L_0x0114;
                case 69: goto L_0x0187;
                case 70: goto L_0x0106;
                case 71: goto L_0x00f0;
                case 72: goto L_0x0159;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            switch(r4) {
                case 75: goto L_0x0159;
                case 76: goto L_0x0157;
                case 77: goto L_0x0187;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            switch(r4) {
                case 99: goto L_0x0125;
                case 100: goto L_0x0159;
                case 101: goto L_0x0187;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            if (r3 != r9) goto L_0x015f
            goto L_0x01c7
        L_0x00f0:
            if (r3 == r9) goto L_0x01be
            if (r3 == r14) goto L_0x01be
            if (r3 == r7) goto L_0x01be
            if (r3 == r11) goto L_0x01a9
            if (r3 != r5) goto L_0x00fc
            goto L_0x0197
        L_0x00fc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0106:
            if (r3 != r9) goto L_0x010a
            goto L_0x01c7
        L_0x010a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0114:
            if (r3 != r9) goto L_0x0118
            goto L_0x01c7
        L_0x0118:
            if (r3 > r7) goto L_0x011b
            goto L_0x015f
        L_0x011b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0125:
            if (r3 == r14) goto L_0x0128
            goto L_0x0157
        L_0x0128:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x0130:
            if (r3 != r14) goto L_0x0149
            j$.time.LocalDate r3 = p155j$.time.format.C2260r.f6460i
            r13 = 2
            r14 = 2
            java.lang.String r4 = "baseDate"
            java.util.Objects.requireNonNull(r3, r4)
            j$.time.format.r r4 = new j$.time.format.r
            r15 = 0
            r11 = r4
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r0.m5823m(r4)
            goto L_0x02dd
        L_0x0149:
            r4 = 19
            if (r3 >= r11) goto L_0x0150
            j$.time.format.G r5 = p155j$.time.format.C2239G.NORMAL
            goto L_0x0152
        L_0x0150:
            j$.time.format.G r5 = p155j$.time.format.C2239G.EXCEEDS_PAD
        L_0x0152:
            r0.mo6913p(r12, r3, r4, r5)
            goto L_0x02dd
        L_0x0157:
            r6 = r9
            goto L_0x0188
        L_0x0159:
            if (r3 != r9) goto L_0x015d
            goto L_0x01c7
        L_0x015d:
            if (r3 != r14) goto L_0x0164
        L_0x015f:
            r0.mo6912o(r12, r3)
            goto L_0x02dd
        L_0x0164:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x016e:
            if (r3 != r9) goto L_0x0171
            goto L_0x01be
        L_0x0171:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x017b:
            j$.time.temporal.a r4 = p155j$.time.temporal.C2285a.NANO_OF_SECOND
            j$.time.format.i r5 = new j$.time.format.i
            r5.<init>(r4, r3, r3, r2)
            r0.m5822d(r5)
            goto L_0x02dd
        L_0x0187:
            r6 = r2
        L_0x0188:
            if (r3 == r9) goto L_0x01b1
            if (r3 == r14) goto L_0x01b1
            if (r3 == r7) goto L_0x01ac
            if (r3 == r11) goto L_0x01a4
            if (r3 != r5) goto L_0x019a
            if (r6 == 0) goto L_0x0197
            j$.time.format.H r3 = p155j$.time.format.C2240H.NARROW_STANDALONE
            goto L_0x01c0
        L_0x0197:
            j$.time.format.H r3 = p155j$.time.format.C2240H.NARROW
            goto L_0x01c0
        L_0x019a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x01a4:
            if (r6 == 0) goto L_0x01a9
            j$.time.format.H r3 = p155j$.time.format.C2240H.FULL_STANDALONE
            goto L_0x01c0
        L_0x01a9:
            j$.time.format.H r3 = p155j$.time.format.C2240H.FULL
            goto L_0x01c0
        L_0x01ac:
            if (r6 == 0) goto L_0x01be
            j$.time.format.H r3 = p155j$.time.format.C2240H.SHORT_STANDALONE
            goto L_0x01c0
        L_0x01b1:
            r5 = 99
            if (r4 == r5) goto L_0x01d1
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x01ba
            goto L_0x01d1
        L_0x01ba:
            r5 = 69
            if (r4 != r5) goto L_0x01c5
        L_0x01be:
            j$.time.format.H r3 = p155j$.time.format.C2240H.SHORT
        L_0x01c0:
            r0.mo6909k(r12, r3)
            goto L_0x02dd
        L_0x01c5:
            if (r3 != r9) goto L_0x01cc
        L_0x01c7:
            r0.mo6911n(r12)
            goto L_0x02dd
        L_0x01cc:
            r0.mo6912o(r12, r14)
            goto L_0x02dd
        L_0x01d1:
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3)
            r0.m5822d(r5)
            goto L_0x02dd
        L_0x01db:
            if (r4 != r6) goto L_0x0200
            if (r3 > r11) goto L_0x01f6
            r4 = 0
            if (r3 != r11) goto L_0x01ea
            j$.time.format.H r3 = p155j$.time.format.C2240H.FULL
            j$.time.format.w r5 = new j$.time.format.w
            r5.<init>(r3, r4)
            goto L_0x01f1
        L_0x01ea:
            j$.time.format.H r3 = p155j$.time.format.C2240H.SHORT
            j$.time.format.w r5 = new j$.time.format.w
            r5.<init>(r3, r4)
        L_0x01f1:
            r0.m5822d(r5)
            goto L_0x02dd
        L_0x01f6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0200:
            r6 = 86
            if (r4 != r6) goto L_0x0220
            if (r3 != r14) goto L_0x0214
            j$.time.format.v r3 = new j$.time.format.v
            j$.time.temporal.q r4 = p155j$.time.temporal.C2301q.f6554a
            java.lang.String r5 = "ZoneId()"
            r3.<init>(r4, r5)
            r0.m5822d(r3)
            goto L_0x02dd
        L_0x0214:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern letter count must be 2: "
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x0220:
            java.lang.String r6 = "+0000"
            if (r4 != r7) goto L_0x023c
            if (r3 >= r11) goto L_0x022a
            java.lang.String r3 = "+HHMM"
            goto L_0x0297
        L_0x022a:
            if (r3 != r11) goto L_0x022d
            goto L_0x0247
        L_0x022d:
            if (r3 != r5) goto L_0x0232
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x026a
        L_0x0232:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x023c:
            r7 = 79
            if (r4 != r7) goto L_0x025a
            if (r3 != r9) goto L_0x0245
            j$.time.format.H r3 = p155j$.time.format.C2240H.SHORT
            goto L_0x0249
        L_0x0245:
            if (r3 != r11) goto L_0x024e
        L_0x0247:
            j$.time.format.H r3 = p155j$.time.format.C2240H.FULL
        L_0x0249:
            r0.mo6905g(r3)
            goto L_0x02dd
        L_0x024e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern letter count must be 1 or 4: "
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x025a:
            r7 = 88
            if (r4 != r7) goto L_0x027b
            if (r3 > r5) goto L_0x0271
            java.lang.String[] r4 = p155j$.time.format.C2255m.f6442c
            if (r3 != r9) goto L_0x0266
            r5 = r2
            goto L_0x0267
        L_0x0266:
            r5 = r9
        L_0x0267:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x026a:
            java.lang.String r4 = "Z"
            r0.mo6906h(r3, r4)
            goto L_0x02dd
        L_0x0271:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x027b:
            r7 = 120(0x78, float:1.68E-43)
            if (r4 != r7) goto L_0x02a5
            if (r3 > r5) goto L_0x029b
            if (r3 != r9) goto L_0x0286
            java.lang.String r6 = "+00"
            goto L_0x028d
        L_0x0286:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x028b
            goto L_0x028d
        L_0x028b:
            java.lang.String r6 = "+00:00"
        L_0x028d:
            java.lang.String[] r4 = p155j$.time.format.C2255m.f6442c
            if (r3 != r9) goto L_0x0293
            r5 = r2
            goto L_0x0294
        L_0x0293:
            r5 = r9
        L_0x0294:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x0297:
            r0.mo6906h(r3, r6)
            goto L_0x02dd
        L_0x029b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02a5:
            r5 = 87
            if (r4 != r5) goto L_0x02bb
            if (r3 > r9) goto L_0x02b1
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3)
            goto L_0x02da
        L_0x02b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02bb:
            r5 = 119(0x77, float:1.67E-43)
            if (r4 != r5) goto L_0x02d1
            if (r3 > r14) goto L_0x02c7
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3)
            goto L_0x02da
        L_0x02c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02d1:
            r5 = 89
            if (r4 != r5) goto L_0x02e1
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3)
        L_0x02da:
            r0.m5822d(r5)
        L_0x02dd:
            int r3 = r10 + -1
            goto L_0x0376
        L_0x02e1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unknown pattern letter: "
            java.lang.String r2 = p155j$.time.format.C2243b.m5817a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x02ed:
            java.lang.String r5 = "'"
            r6 = 39
            if (r4 != r6) goto L_0x0349
            int r3 = r3 + 1
            r4 = r3
        L_0x02f6:
            int r7 = r18.length()
            if (r4 >= r7) goto L_0x0313
            char r7 = r1.charAt(r4)
            if (r7 != r6) goto L_0x0311
            int r7 = r4 + 1
            int r8 = r18.length()
            if (r7 >= r8) goto L_0x0313
            char r8 = r1.charAt(r7)
            if (r8 != r6) goto L_0x0313
            r4 = r7
        L_0x0311:
            int r4 = r4 + r9
            goto L_0x02f6
        L_0x0313:
            int r7 = r18.length()
            if (r4 >= r7) goto L_0x0332
            java.lang.String r3 = r1.substring(r3, r4)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x0327
            r0.mo6903e(r6)
            goto L_0x0330
        L_0x0327:
            java.lang.String r6 = "''"
            java.lang.String r3 = r3.replace(r6, r5)
            r0.mo6904f(r3)
        L_0x0330:
            r3 = r4
            goto L_0x0376
        L_0x0332:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pattern ends with an incomplete string literal: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0349:
            r6 = 91
            if (r4 != r6) goto L_0x0351
            r17.mo6916s()
            goto L_0x0376
        L_0x0351:
            r6 = 93
            if (r4 != r6) goto L_0x0367
            j$.time.format.g r4 = r0.f6421a
            j$.time.format.g r4 = r4.f6422b
            if (r4 == 0) goto L_0x035f
            r17.mo6915r()
            goto L_0x0376
        L_0x035f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x0367:
            r6 = 123(0x7b, float:1.72E-43)
            if (r4 == r6) goto L_0x0379
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 == r6) goto L_0x0379
            r6 = 35
            if (r4 == r6) goto L_0x0379
            r0.mo6903e(r4)
        L_0x0376:
            int r3 = r3 + r9
            goto L_0x000b
        L_0x0379:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.append(r3)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0393:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2248g.mo6908j(java.lang.String):j$.time.format.g");
    }

    /* renamed from: k */
    public C2248g mo6909k(C2300p pVar, C2240H h) {
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(h, "textStyle");
        m5822d(new C2262t(pVar, h, new C2235C()));
        return this;
    }

    /* renamed from: l */
    public C2248g mo6910l(C2300p pVar, Map map) {
        Objects.requireNonNull(pVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C2240H h = C2240H.FULL;
        m5822d(new C2262t(pVar, h, new C2244c(this, new C2234B(Collections.singletonMap(h, linkedHashMap)))));
        return this;
    }

    /* renamed from: n */
    public C2248g mo6911n(C2300p pVar) {
        Objects.requireNonNull(pVar, "field");
        m5823m(new C2254l(pVar, 1, 19, C2239G.NORMAL));
        return this;
    }

    /* renamed from: o */
    public C2248g mo6912o(C2300p pVar, int i) {
        Objects.requireNonNull(pVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m5823m(new C2254l(pVar, i, i, C2239G.NOT_NEGATIVE));
        return this;
    }

    /* renamed from: p */
    public C2248g mo6913p(C2300p pVar, int i, int i2, C2239G g) {
        if (i == i2 && g == C2239G.NOT_NEGATIVE) {
            mo6912o(pVar, i2);
            return this;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(g, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m5823m(new C2254l(pVar, i, i2, g));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: q */
    public C2248g mo6914q() {
        m5822d(new C2264v(C2242a.f6415a, "ZoneRegionId()"));
        return this;
    }

    /* renamed from: r */
    public C2248g mo6915r() {
        C2248g gVar = this.f6421a;
        if (gVar.f6422b != null) {
            if (gVar.f6423c.size() > 0) {
                C2248g gVar2 = this.f6421a;
                C2249a aVar = new C2249a(gVar2.f6423c, gVar2.f6424d);
                this.f6421a = this.f6421a.f6422b;
                m5822d(aVar);
            } else {
                this.f6421a = this.f6421a.f6422b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    /* renamed from: s */
    public C2248g mo6916s() {
        C2248g gVar = this.f6421a;
        gVar.f6427g = -1;
        this.f6421a = new C2248g(gVar, true);
        return this;
    }

    /* renamed from: t */
    public C2248g mo6917t() {
        m5822d(C2261s.INSENSITIVE);
        return this;
    }

    /* renamed from: u */
    public C2248g mo6918u() {
        m5822d(C2261s.SENSITIVE);
        return this;
    }

    /* renamed from: v */
    public C2248g mo6919v() {
        m5822d(C2261s.LENIENT);
        return this;
    }

    /* renamed from: w */
    public DateTimeFormatter mo6920w() {
        return m5824y(Locale.getDefault(), C2238F.SMART, (C2228f) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public DateTimeFormatter mo6921x(C2238F f, C2228f fVar) {
        return m5824y(Locale.getDefault(), f, fVar);
    }
}
