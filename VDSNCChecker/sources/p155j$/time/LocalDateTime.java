package p155j$.time;

import java.io.Serializable;
import java.util.Objects;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2225c;
import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2297m;
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

/* renamed from: j$.time.LocalDateTime */
public final class LocalDateTime implements C2295k, C2297m, C2225c, Serializable {

    /* renamed from: a */
    private final LocalDate f6363a;

    /* renamed from: b */
    private final C2273k f6364b;

    /* renamed from: j$.time.LocalDateTime$a */
    static /* synthetic */ class C2219a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6365a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                j$.time.temporal.b[] r0 = p155j$.time.temporal.C2286b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6365a = r0
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x001d }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x0033 }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x003e }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x0049 }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f6365a     // Catch:{ NoSuchFieldError -> 0x0054 }
                j$.time.temporal.b r1 = p155j$.time.temporal.C2286b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p155j$.time.LocalDateTime.C2219a.<clinit>():void");
        }
    }

    static {
        m5705u(LocalDate.f6356d, C2273k.f6496e);
        m5705u(LocalDate.f6357e, C2273k.f6497f);
    }

    private LocalDateTime(LocalDate localDate, C2273k kVar) {
        this.f6363a = localDate;
        this.f6364b = kVar;
    }

    /* renamed from: A */
    private LocalDateTime m5700A(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        C2273k s;
        LocalDate localDate2 = localDate;
        if ((j | j2 | j3 | j4) == 0) {
            s = this.f6364b;
        } else {
            long j5 = j / 24;
            long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long j7 = (long) i;
            long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long x = this.f6364b.mo6988x();
            long j9 = (j8 * j7) + x;
            long floorDiv = Math.floorDiv(j9, 86400000000000L) + (j6 * j7);
            long floorMod = Math.floorMod(j9, 86400000000000L);
            s = floorMod == x ? this.f6364b : C2273k.m5951s(floorMod);
            localDate2 = localDate2.mo6811z(floorDiv);
        }
        return m5701E(localDate2, s);
    }

    /* renamed from: E */
    private LocalDateTime m5701E(LocalDate localDate, C2273k kVar) {
        return (this.f6363a == localDate && this.f6364b == kVar) ? this : new LocalDateTime(localDate, kVar);
    }

    /* renamed from: m */
    private int m5702m(LocalDateTime localDateTime) {
        int n = this.f6363a.mo6803n(localDateTime.f6363a);
        return n == 0 ? this.f6364b.compareTo(localDateTime.f6364b) : n;
    }

    public static LocalDateTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        C2221b bVar = new C2221b(zoneId);
        C2270h q = C2270h.m5929q(System.currentTimeMillis());
        return m5706v(q.mo6970o(), q.mo6971p(), bVar.mo6839c().mo6834m().mo7063d(q));
    }

    /* renamed from: s */
    public static LocalDateTime m5703s(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.m5671v(i, i2, i3), C2273k.m5949q(i4, i5));
    }

    /* renamed from: t */
    public static LocalDateTime m5704t(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.m5671v(i, i2, i3), C2273k.m5950r(i4, i5, i6, i7));
    }

    /* renamed from: u */
    public static LocalDateTime m5705u(LocalDate localDate, C2273k kVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(localDate, kVar);
    }

    /* renamed from: v */
    public static LocalDateTime m5706v(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = (long) i;
        C2285a.NANO_OF_SECOND.mo7039n(j2);
        long q = j + ((long) zoneOffset.mo6837q());
        return new LocalDateTime(LocalDate.m5672w(Math.floorDiv(q, 86400)), C2273k.m5951s((((long) ((int) Math.floorMod(q, 86400))) * 1000000000) + j2));
    }

    /* renamed from: B */
    public LocalDate mo6812B() {
        return this.f6363a;
    }

    /* renamed from: C */
    public C2224b mo6813C() {
        return this.f6363a;
    }

    /* renamed from: D */
    public C2273k mo6814D() {
        return this.f6364b;
    }

    /* renamed from: F */
    public LocalDateTime mo6797g(C2300p pVar, long j) {
        return pVar instanceof C2285a ? ((C2285a) pVar).mo7027l() ? m5701E(this.f6363a, this.f6364b.mo6797g(pVar, j)) : m5701E(this.f6363a.mo6797g(pVar, j), this.f6364b) : (LocalDateTime) pVar.mo7021d(this, j);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        return pVar instanceof C2285a ? ((C2285a) pVar).mo7027l() ? this.f6364b.mo6789b(pVar) : this.f6363a.mo6789b(pVar) : super.mo6789b(pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return pVar != null && pVar.mo7026j(this);
        }
        C2285a aVar = (C2285a) pVar;
        return aVar.mo7020c() || aVar.mo7027l();
    }

    /* renamed from: d */
    public C2295k mo6792d(C2297m mVar) {
        return m5701E((LocalDate) mVar, this.f6364b);
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2306v.f6559a) {
            return this.f6363a;
        }
        if (yVar == C2301q.f6554a || yVar == C2305u.f6558a || yVar == C2304t.f6557a) {
            return null;
        }
        if (yVar == C2307w.f6560a) {
            return mo6814D();
        }
        if (yVar != C2302r.f6555a) {
            return yVar == C2303s.f6556a ? C2286b.NANOS : yVar.mo6895a(this);
        }
        mo6849a();
        return C2229g.f6372a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f6363a.equals(localDateTime.f6363a) && this.f6364b.equals(localDateTime.f6364b);
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        return pVar instanceof C2285a ? ((C2285a) pVar).mo7027l() ? this.f6364b.mo6795f(pVar) : this.f6363a.mo6795f(pVar) : pVar.mo7023f(this);
    }

    public int hashCode() {
        return this.f6363a.hashCode() ^ this.f6364b.hashCode();
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return pVar instanceof C2285a ? ((C2285a) pVar).mo7027l() ? this.f6364b.mo6799i(pVar) : this.f6363a.mo6799i(pVar) : pVar.mo7022e(this);
    }

    /* renamed from: l */
    public int compareTo(C2225c cVar) {
        if (cVar instanceof LocalDateTime) {
            return m5702m((LocalDateTime) cVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int m = ((LocalDate) mo6813C()).compareTo(localDateTime.mo6813C());
        if (m != 0) {
            return m;
        }
        int l = mo6814D().compareTo(localDateTime.mo6814D());
        if (l != 0) {
            return l;
        }
        mo6849a();
        C2229g gVar = C2229g.f6372a;
        localDateTime.mo6849a();
        return 0;
    }

    /* renamed from: n */
    public int mo6820n() {
        return this.f6364b.mo6981o();
    }

    /* renamed from: o */
    public int mo6821o() {
        return this.f6364b.mo6982p();
    }

    /* renamed from: p */
    public int mo6822p() {
        return this.f6363a.mo6806s();
    }

    /* renamed from: q */
    public boolean mo6823q(C2225c cVar) {
        if (cVar instanceof LocalDateTime) {
            return m5702m((LocalDateTime) cVar) > 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int i = (((LocalDate) mo6813C()).mo6784E() > ((LocalDate) localDateTime.mo6813C()).mo6784E() ? 1 : (((LocalDate) mo6813C()).mo6784E() == ((LocalDate) localDateTime.mo6813C()).mo6784E() ? 0 : -1));
        return i > 0 || (i == 0 && mo6814D().mo6988x() > localDateTime.mo6814D().mo6988x());
    }

    /* renamed from: r */
    public boolean mo6824r(C2225c cVar) {
        if (cVar instanceof LocalDateTime) {
            return m5702m((LocalDateTime) cVar) < 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int i = (((LocalDate) mo6813C()).mo6784E() > ((LocalDate) localDateTime.mo6813C()).mo6784E() ? 1 : (((LocalDate) mo6813C()).mo6784E() == ((LocalDate) localDateTime.mo6813C()).mo6784E() ? 0 : -1));
        return i < 0 || (i == 0 && mo6814D().mo6988x() < localDateTime.mo6814D().mo6988x());
    }

    public long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((((LocalDate) mo6813C()).mo6784E() * 86400) + ((long) mo6814D().mo6989y())) - ((long) zoneOffset.mo6837q());
    }

    public String toString() {
        return this.f6363a.toString() + 'T' + this.f6364b.toString();
    }

    /* renamed from: w */
    public LocalDateTime mo6800j(long j, C2310z zVar) {
        long j2 = j;
        C2310z zVar2 = zVar;
        if (!(zVar2 instanceof C2286b)) {
            return (LocalDateTime) zVar2.mo7042d(this, j2);
        }
        switch (C2219a.f6365a[((C2286b) zVar2).ordinal()]) {
            case 1:
                return mo6829y(j);
            case 2:
                return mo6828x(j2 / 86400000000L).mo6829y((j2 % 86400000000L) * 1000);
            case 3:
                return mo6828x(j2 / 86400000).mo6829y((j2 % 86400000) * 1000000);
            case 4:
                return mo6830z(j);
            case 5:
                return m5700A(this.f6363a, 0, j, 0, 0, 1);
            case 6:
                return m5700A(this.f6363a, j, 0, 0, 0, 1);
            case 7:
                LocalDateTime x = mo6828x(j2 / 256);
                return x.m5700A(x.f6363a, (j2 % 256) * 12, 0, 0, 0, 1);
            default:
                return m5701E(this.f6363a.mo6800j(j2, zVar2), this.f6364b);
        }
    }

    /* renamed from: x */
    public LocalDateTime mo6828x(long j) {
        return m5701E(this.f6363a.mo6811z(j), this.f6364b);
    }

    /* renamed from: y */
    public LocalDateTime mo6829y(long j) {
        return m5700A(this.f6363a, 0, 0, 0, j, 1);
    }

    /* renamed from: z */
    public LocalDateTime mo6830z(long j) {
        return m5700A(this.f6363a, 0, 0, j, 0, 1);
    }
}
