package p155j$.time;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2282B;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2297m;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2304t;
import p155j$.time.temporal.C2305u;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;
import p155j$.time.zone.C2313c;

/* renamed from: j$.time.ZoneOffset */
public final class ZoneOffset extends ZoneId implements C2296l, C2297m, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = m5736t(0);

    /* renamed from: c */
    private static final ConcurrentMap f6366c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d */
    private static final ConcurrentMap f6367d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: a */
    private final int f6368a;

    /* renamed from: b */
    private final transient String f6369b;

    static {
        m5736t(-64800);
        m5736t(64800);
    }

    private ZoneOffset(int i) {
        String str;
        this.f6368a = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : ":");
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.f6369b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p155j$.time.ZoneOffset m5734r(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = f6367d
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (p155j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x0012
            return r0
        L_0x0012:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0070
            r1 = 3
            if (r0 == r1) goto L_0x008c
            r4 = 5
            if (r0 == r4) goto L_0x0066
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005d
            r5 = 7
            if (r0 == r5) goto L_0x0050
            r1 = 9
            if (r0 != r1) goto L_0x0039
            int r0 = m5737u(r7, r2, r3)
            int r1 = m5737u(r7, r6, r2)
            int r2 = m5737u(r7, r5, r2)
            goto L_0x0092
        L_0x0039:
            j$.time.d r0 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x0050:
            int r0 = m5737u(r7, r2, r3)
            int r1 = m5737u(r7, r1, r3)
            int r2 = m5737u(r7, r4, r3)
            goto L_0x0092
        L_0x005d:
            int r0 = m5737u(r7, r2, r3)
            int r1 = m5737u(r7, r6, r2)
            goto L_0x006e
        L_0x0066:
            int r0 = m5737u(r7, r2, r3)
            int r1 = m5737u(r7, r1, r3)
        L_0x006e:
            r2 = r3
            goto L_0x0092
        L_0x0070:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x008c:
            int r0 = m5737u(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0092:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b6
            if (r3 != r5) goto L_0x009f
            goto L_0x00b6
        L_0x009f:
            j$.time.d r0 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b6:
            if (r3 != r5) goto L_0x00c0
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = m5735s(r7, r0, r1)
            return r7
        L_0x00c0:
            j$.time.ZoneOffset r7 = m5735s(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.ZoneOffset.m5734r(java.lang.String):j$.time.ZoneOffset");
    }

    /* renamed from: s */
    public static ZoneOffset m5735s(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C2230d("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C2230d("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C2230d("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C2230d("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C2230d("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 < -59 || i3 > 59) {
            throw new C2230d("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        } else if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m5736t((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new C2230d("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    /* renamed from: t */
    public static ZoneOffset m5736t(int i) {
        if (i < -64800 || i > 64800) {
            throw new C2230d("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = f6366c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
            f6367d.putIfAbsent(zoneOffset2.f6369b, zoneOffset2);
            return zoneOffset2;
        }
    }

    /* renamed from: u */
    private static int m5737u(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new C2230d("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C2230d("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    /* renamed from: b */
    public int mo6789b(C2300p pVar) {
        if (pVar == C2285a.OFFSET_SECONDS) {
            return this.f6368a;
        }
        if (!(pVar instanceof C2285a)) {
            return super.mo6799i(pVar).mo7010a(mo6795f(pVar), pVar);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        return pVar instanceof C2285a ? pVar == C2285a.OFFSET_SECONDS : pVar != null && pVar.mo7026j(this);
    }

    public int compareTo(Object obj) {
        return ((ZoneOffset) obj).f6368a - this.f6368a;
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        return (yVar == C2304t.f6557a || yVar == C2305u.f6558a) ? this : super.mo6793e(yVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f6368a == ((ZoneOffset) obj).f6368a;
        }
        return false;
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        if (pVar == C2285a.OFFSET_SECONDS) {
            return (long) this.f6368a;
        }
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    public int hashCode() {
        return this.f6368a;
    }

    /* renamed from: i */
    public C2282B mo6799i(C2300p pVar) {
        return super.mo6799i(pVar);
    }

    /* renamed from: l */
    public String mo6833l() {
        return this.f6369b;
    }

    /* renamed from: m */
    public C2313c mo6834m() {
        return C2313c.m6137j(this);
    }

    /* renamed from: q */
    public int mo6837q() {
        return this.f6368a;
    }

    public String toString() {
        return this.f6369b;
    }
}
