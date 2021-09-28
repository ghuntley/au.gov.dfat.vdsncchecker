package p155j$.time;

import com.dynamsoft.dbr.EnumErrorCode;
import java.io.Serializable;
import java.util.Objects;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2229g;
import p155j$.time.format.DateTimeFormatter;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2298n;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2301q;
import p155j$.time.temporal.C2302r;
import p155j$.time.temporal.C2303s;
import p155j$.time.temporal.C2304t;
import p155j$.time.temporal.C2305u;
import p155j$.time.temporal.C2306v;
import p155j$.time.temporal.C2307w;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;
import p155j$.time.temporal.C2310z;

/* renamed from: j$.time.LocalDate */
public final class LocalDate implements C2295k, C2297m, C2224b, Serializable {

    /* renamed from: d */
    public static final LocalDate f6356d = m5671v(-999999999, 1, 1);

    /* renamed from: e */
    public static final LocalDate f6357e = m5671v(999999999, 12, 31);

    /* renamed from: a */
    private final int f6358a;

    /* renamed from: b */
    private final short f6359b;

    /* renamed from: c */
    private final short f6360c;

    /* renamed from: j$.time.LocalDate$a */
    static /* synthetic */ class C2218a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6361a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6362b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                j$.time.temporal.b[] r0 = p155j$.time.temporal.C2286b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6362b = r0
                r1 = 1
                j$.time.temporal.b r2 = p155j$.time.temporal.C2286b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6362b     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.temporal.b r3 = p155j$.time.temporal.C2286b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6362b     // Catch:{ NoSuchFieldError -> 0x0028 }
                j$.time.temporal.b r4 = p155j$.time.temporal.C2286b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6362b     // Catch:{ NoSuchFieldError -> 0x0033 }
                j$.time.temporal.b r5 = p155j$.time.temporal.C2286b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f6362b     // Catch:{ NoSuchFieldError -> 0x003e }
                j$.time.temporal.b r6 = p155j$.time.temporal.C2286b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f6362b     // Catch:{ NoSuchFieldError -> 0x0049 }
                j$.time.temporal.b r7 = p155j$.time.temporal.C2286b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f6362b     // Catch:{ NoSuchFieldError -> 0x0054 }
                j$.time.temporal.b r8 = p155j$.time.temporal.C2286b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f6362b     // Catch:{ NoSuchFieldError -> 0x0060 }
                j$.time.temporal.b r9 = p155j$.time.temporal.C2286b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                j$.time.temporal.a[] r8 = p155j$.time.temporal.C2285a.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f6361a = r8
                j$.time.temporal.a r9 = p155j$.time.temporal.C2285a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = f6361a     // Catch:{ NoSuchFieldError -> 0x007b }
                j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x0085 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x008f }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x0099 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00ad }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00cf }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00db }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = f6361a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p155j$.time.LocalDate.C2218a.<clinit>():void");
        }
    }

    private LocalDate(int i, int i2, int i3) {
        this.f6358a = i;
        this.f6359b = (short) i2;
        this.f6360c = (short) i3;
    }

    /* renamed from: D */
    private static LocalDate m5668D(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        i4 = C2229g.f6372a.mo6853e((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: o */
    public static LocalDate m5669o(C2296l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        int i = C2308x.f6561a;
        LocalDate localDate = (LocalDate) lVar.mo6793e(C2306v.f6559a);
        if (localDate != null) {
            return localDate;
        }
        throw new C2230d("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    /* renamed from: p */
    private int m5670p(C2300p pVar) {
        switch (C2218a.f6361a[((C2285a) pVar).ordinal()]) {
            case 1:
                return this.f6360c;
            case 2:
                return mo6805r();
            case 3:
                return ((this.f6360c - 1) / 7) + 1;
            case 4:
                int i = this.f6358a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return mo6804q().mo6855l();
            case 6:
                return ((this.f6360c - 1) % 7) + 1;
            case 7:
                return ((mo6805r() - 1) % 7) + 1;
            case 8:
                throw new C2281A("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((mo6805r() - 1) / 7) + 1;
            case 10:
                return this.f6359b;
            case 11:
                throw new C2281A("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f6358a;
            case 13:
                return this.f6358a >= 1 ? 1 : 0;
            default:
                throw new C2281A("Unsupported field: " + pVar);
        }
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f6387h;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.mo6888f(charSequence, C2271i.f6493a);
    }

    /* renamed from: v */
    public static LocalDate m5671v(int i, int i2, int i3) {
        long j = (long) i;
        C2285a.YEAR.mo7039n(j);
        C2285a.MONTH_OF_YEAR.mo7039n((long) i2);
        C2285a.DAY_OF_MONTH.mo7039n((long) i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C2229g.f6372a.mo6853e(j)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C2230d("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                StringBuilder a = C2220a.m5746a("Invalid date '");
                a.append(C2275m.m5972o(i2).name());
                a.append(" ");
                a.append(i3);
                a.append("'");
                throw new C2230d(a.toString());
            }
        }
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: w */
    public static LocalDate m5672w(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(C2285a.YEAR.mo7038m(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: x */
    public static LocalDate m5673x(int i, int i2) {
        long j = (long) i;
        C2285a.YEAR.mo7039n(j);
        C2285a.DAY_OF_YEAR.mo7039n((long) i2);
        boolean e = C2229g.f6372a.mo6853e(j);
        if (i2 != 366 || e) {
            C2275m o = C2275m.m5972o(((i2 - 1) / 31) + 1);
            if (i2 > (o.mo6993n(e) + o.mo6991l(e)) - 1) {
                o = o.mo6994p(1);
            }
            return new LocalDate(i, o.mo6992m(), (i2 - o.mo6991l(e)) + 1);
        }
        throw new C2230d("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    /* renamed from: A */
    public LocalDate mo6781A(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f6358a) * 12) + ((long) (this.f6359b - 1)) + j;
        return m5668D(C2285a.YEAR.mo7038m(Math.floorDiv(j2, 12)), ((int) Math.floorMod(j2, 12)) + 1, this.f6360c);
    }

    /* renamed from: B */
    public LocalDate mo6782B(long j) {
        return mo6811z(Math.multiplyExact(j, 7));
    }

    /* renamed from: C */
    public LocalDate mo6783C(long j) {
        return j == 0 ? this : m5668D(C2285a.YEAR.mo7038m(((long) this.f6358a) + j), this.f6359b, this.f6360c);
    }

    /* renamed from: E */
    public long mo6784E() {
        long j;
        long j2 = (long) this.f6358a;
        long j3 = (long) this.f6359b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f6360c - 1));
        if (j3 > 2) {
            j5--;
            if (!mo6807t()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r0 = mo6795f(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return mo6811z(r9 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return mo6788I((int) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return mo6782B(r9 - mo6795f(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return r7;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.LocalDate mo6797g(p155j$.time.temporal.C2300p r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p155j$.time.temporal.C2285a
            if (r0 == 0) goto L_0x00c3
            r0 = r8
            j$.time.temporal.a r0 = (p155j$.time.temporal.C2285a) r0
            r0.mo7039n(r9)
            int[] r1 = p155j$.time.LocalDate.C2218a.f6361a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r3 = 1
            switch(r0) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0098;
                case 4: goto L_0x008b;
                case 5: goto L_0x007c;
                case 6: goto L_0x0075;
                case 7: goto L_0x0072;
                case 8: goto L_0x006d;
                case 9: goto L_0x006a;
                case 10: goto L_0x0055;
                case 11: goto L_0x0043;
                case 12: goto L_0x0092;
                case 13: goto L_0x002f;
                default: goto L_0x0018;
            }
        L_0x0018:
            j$.time.temporal.A r9 = new j$.time.temporal.A
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unsupported field: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x002f:
            j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.ERA
            long r0 = r7.mo6795f(r8)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x003b
            r8 = r7
            goto L_0x0042
        L_0x003b:
            int r8 = r7.f6358a
            int r3 = r3 - r8
            j$.time.LocalDate r8 = r7.mo6788I(r3)
        L_0x0042:
            return r8
        L_0x0043:
            int r8 = r7.f6358a
            long r3 = (long) r8
            r5 = 12
            long r3 = r3 * r5
            short r8 = r7.f6359b
            long r5 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r1
            long r9 = r9 - r3
            j$.time.LocalDate r8 = r7.mo6781A(r9)
            goto L_0x00c9
        L_0x0055:
            int r8 = (int) r9
            short r9 = r7.f6359b
            if (r9 != r8) goto L_0x005b
            goto L_0x00b8
        L_0x005b:
            j$.time.temporal.a r9 = p155j$.time.temporal.C2285a.MONTH_OF_YEAR
            long r0 = (long) r8
            r9.mo7039n(r0)
            int r9 = r7.f6358a
            short r10 = r7.f6360c
            j$.time.LocalDate r8 = m5668D(r9, r8, r10)
            goto L_0x00c9
        L_0x006a:
            j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_YEAR
            goto L_0x009a
        L_0x006d:
            j$.time.LocalDate r8 = m5672w(r9)
            goto L_0x00c9
        L_0x0072:
            j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_YEAR
            goto L_0x0077
        L_0x0075:
            j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.ALIGNED_DAY_OF_WEEK_IN_MONTH
        L_0x0077:
            long r0 = r7.mo6795f(r8)
            goto L_0x0085
        L_0x007c:
            j$.time.e r8 = r7.mo6804q()
            int r8 = r8.mo6855l()
            long r0 = (long) r8
        L_0x0085:
            long r9 = r9 - r0
            j$.time.LocalDate r8 = r7.mo6811z(r9)
            goto L_0x00c9
        L_0x008b:
            int r8 = r7.f6358a
            if (r8 < r3) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            long r9 = r1 - r9
        L_0x0092:
            int r8 = (int) r9
            j$.time.LocalDate r8 = r7.mo6788I(r8)
            goto L_0x00c9
        L_0x0098:
            j$.time.temporal.a r8 = p155j$.time.temporal.C2285a.ALIGNED_WEEK_OF_MONTH
        L_0x009a:
            long r0 = r7.mo6795f(r8)
            long r9 = r9 - r0
            j$.time.LocalDate r8 = r7.mo6782B(r9)
            goto L_0x00c9
        L_0x00a4:
            int r8 = (int) r9
            int r9 = r7.mo6805r()
            if (r9 != r8) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            int r9 = r7.f6358a
            j$.time.LocalDate r8 = m5673x(r9, r8)
            goto L_0x00c9
        L_0x00b3:
            int r8 = (int) r9
            short r9 = r7.f6360c
            if (r9 != r8) goto L_0x00ba
        L_0x00b8:
            r8 = r7
            goto L_0x00c9
        L_0x00ba:
            int r9 = r7.f6358a
            short r10 = r7.f6359b
            j$.time.LocalDate r8 = m5671v(r9, r10, r8)
            goto L_0x00c9
        L_0x00c3:
            j$.time.temporal.k r8 = r8.mo7021d(r7, r9)
            j$.time.LocalDate r8 = (p155j$.time.LocalDate) r8
        L_0x00c9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.LocalDate.mo6797g(j$.time.temporal.p, long):j$.time.LocalDate");
    }

    /* renamed from: G */
    public C2224b mo6786G(C2297m mVar) {
        boolean z = mVar instanceof LocalDate;
        Object obj = mVar;
        if (!z) {
            obj = ((C2298n) mVar).mo7049b(this);
        }
        return (LocalDate) obj;
    }

    /* renamed from: H */
    public LocalDate mo6787H(int i) {
        return mo6805r() == i ? this : m5673x(this.f6358a, i);
    }

    /* renamed from: I */
    public LocalDate mo6788I(int i) {
        if (this.f6358a == i) {
            return this;
        }
        C2285a.YEAR.mo7039n((long) i);
        return m5668D(i, this.f6359b, this.f6360c);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        return pVar instanceof C2285a ? m5670p(pVar) : super.mo6789b(pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        if (pVar instanceof C2285a) {
            return pVar.mo7020c();
        }
        return pVar != null && pVar.mo7026j(this);
    }

    /* renamed from: d */
    public C2295k mo6792d(C2297m mVar) {
        return (LocalDate) mVar;
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2306v.f6559a) {
            return this;
        }
        if (yVar == C2301q.f6554a || yVar == C2305u.f6558a || yVar == C2304t.f6557a || yVar == C2307w.f6560a) {
            return null;
        }
        if (yVar == C2302r.f6555a) {
            return C2229g.f6372a;
        }
        return yVar == C2303s.f6556a ? C2286b.DAYS : yVar.mo6895a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            return mo6803n((LocalDate) obj) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        if (pVar == C2285a.EPOCH_DAY) {
            return mo6784E();
        }
        if (pVar == C2285a.PROLEPTIC_MONTH) {
            return ((((long) this.f6358a) * 12) + ((long) this.f6359b)) - 1;
        }
        return (long) m5670p(pVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.mo6883a(this);
    }

    public int hashCode() {
        int i = this.f6358a;
        return (((i << 11) + (this.f6359b << 6)) + this.f6360c) ^ (i & -2048);
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        int i;
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7022e(this);
        }
        C2285a aVar = (C2285a) pVar;
        if (aVar.mo7020c()) {
            int i2 = C2218a.f6361a[aVar.ordinal()];
            if (i2 == 1) {
                short s = this.f6359b;
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo6807t() ? 29 : 28;
            } else if (i2 == 2) {
                i = mo6807t() ? 366 : 365;
            } else if (i2 == 3) {
                return C2282B.m6009i(1, (C2275m.m5972o(this.f6359b) != C2275m.FEBRUARY || mo6807t()) ? 5 : 4);
            } else if (i2 != 4) {
                return pVar.mo7025i();
            } else {
                return C2282B.m6009i(1, this.f6358a <= 0 ? 1000000000 : 999999999);
            }
            return C2282B.m6009i(1, (long) i);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* renamed from: l */
    public C2295k mo6801l(C2295k kVar) {
        return kVar.mo6797g(C2285a.EPOCH_DAY, mo6784E());
    }

    /* renamed from: m */
    public int compareTo(C2224b bVar) {
        if (bVar instanceof LocalDate) {
            return mo6803n((LocalDate) bVar);
        }
        int compare = Long.compare(mo6784E(), ((LocalDate) bVar).mo6784E());
        if (compare != 0) {
            return compare;
        }
        C2229g gVar = C2229g.f6372a;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo6803n(LocalDate localDate) {
        int i = this.f6358a - localDate.f6358a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f6359b - localDate.f6359b;
        return i2 == 0 ? this.f6360c - localDate.f6360c : i2;
    }

    /* renamed from: q */
    public C2231e mo6804q() {
        return C2231e.m5760m(((int) Math.floorMod(mo6784E() + 3, 7)) + 1);
    }

    /* renamed from: r */
    public int mo6805r() {
        return (C2275m.m5972o(this.f6359b).mo6991l(mo6807t()) + this.f6360c) - 1;
    }

    /* renamed from: s */
    public int mo6806s() {
        return this.f6358a;
    }

    /* renamed from: t */
    public boolean mo6807t() {
        return C2229g.f6372a.mo6853e((long) this.f6358a);
    }

    public String toString() {
        int i;
        int i2 = this.f6358a;
        short s = this.f6359b;
        short s2 = this.f6360c;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 + EnumErrorCode.DBR_UNKNOWN);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: u */
    public C2224b mo6809u(long j, C2310z zVar) {
        return j == Long.MIN_VALUE ? mo6800j(Long.MAX_VALUE, zVar).mo6800j(1, zVar) : mo6800j(-j, zVar);
    }

    /* renamed from: y */
    public LocalDate mo6800j(long j, C2310z zVar) {
        if (!(zVar instanceof C2286b)) {
            return (LocalDate) zVar.mo7042d(this, j);
        }
        switch (C2218a.f6362b[((C2286b) zVar).ordinal()]) {
            case 1:
                return mo6811z(j);
            case 2:
                return mo6782B(j);
            case 3:
                return mo6781A(j);
            case 4:
                return mo6783C(j);
            case 5:
                return mo6783C(Math.multiplyExact(j, 10));
            case 6:
                return mo6783C(Math.multiplyExact(j, 100));
            case 7:
                return mo6783C(Math.multiplyExact(j, 1000));
            case 8:
                C2285a aVar = C2285a.ERA;
                return mo6797g(aVar, Math.addExact(mo6795f(aVar), j));
            default:
                throw new C2281A("Unsupported unit: " + zVar);
        }
    }

    /* renamed from: z */
    public LocalDate mo6811z(long j) {
        return j == 0 ? this : m5672w(Math.addExact(mo6784E(), j));
    }
}
