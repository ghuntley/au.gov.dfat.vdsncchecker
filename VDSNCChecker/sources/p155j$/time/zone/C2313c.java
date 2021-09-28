package p155j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p155j$.time.C2220a;
import p155j$.time.C2222c;
import p155j$.time.C2270h;
import p155j$.time.LocalDate;
import p155j$.time.LocalDateTime;
import p155j$.time.ZoneOffset;

/* renamed from: j$.time.zone.c */
public final class C2313c implements Serializable {

    /* renamed from: i */
    private static final long[] f6565i = new long[0];

    /* renamed from: j */
    private static final C2312b[] f6566j = new C2312b[0];

    /* renamed from: k */
    private static final LocalDateTime[] f6567k = new LocalDateTime[0];

    /* renamed from: l */
    private static final C2311a[] f6568l = new C2311a[0];

    /* renamed from: a */
    private final long[] f6569a;

    /* renamed from: b */
    private final ZoneOffset[] f6570b;

    /* renamed from: c */
    private final long[] f6571c;

    /* renamed from: d */
    private final LocalDateTime[] f6572d;

    /* renamed from: e */
    private final ZoneOffset[] f6573e;

    /* renamed from: f */
    private final C2312b[] f6574f;

    /* renamed from: g */
    private final TimeZone f6575g;

    /* renamed from: h */
    private final transient ConcurrentMap f6576h = new ConcurrentHashMap();

    private C2313c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f6570b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f6565i;
        this.f6569a = jArr;
        this.f6571c = jArr;
        this.f6572d = f6567k;
        this.f6573e = zoneOffsetArr;
        this.f6574f = f6566j;
        this.f6575g = null;
    }

    C2313c(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f6570b = zoneOffsetArr;
        zoneOffsetArr[0] = m6138k(timeZone.getRawOffset());
        long[] jArr = f6565i;
        this.f6569a = jArr;
        this.f6571c = jArr;
        this.f6572d = f6567k;
        this.f6573e = zoneOffsetArr;
        this.f6574f = f6566j;
        this.f6575g = timeZone;
    }

    /* renamed from: a */
    private Object m6133a(LocalDateTime localDateTime, C2311a aVar) {
        LocalDateTime d = aVar.mo7052d();
        boolean l = aVar.mo7061l();
        boolean r = localDateTime.mo6824r(d);
        return l ? r ? aVar.mo7059i() : localDateTime.mo6824r(aVar.mo7050c()) ? aVar : aVar.mo7056g() : !r ? aVar.mo7056g() : localDateTime.mo6824r(aVar.mo7050c()) ? aVar.mo7059i() : aVar;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p155j$.time.zone.C2311a[] m6134b(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            java.util.concurrent.ConcurrentMap r3 = r0.f6576h
            java.lang.Object r3 = r3.get(r2)
            j$.time.zone.a[] r3 = (p155j$.time.zone.C2311a[]) r3
            if (r3 == 0) goto L_0x0013
            return r3
        L_0x0013:
            java.util.TimeZone r3 = r0.f6575g
            r5 = 0
            if (r3 == 0) goto L_0x00cc
            r3 = 1800(0x708, float:2.522E-42)
            if (r1 >= r3) goto L_0x001f
            j$.time.zone.a[] r1 = f6568l
            return r1
        L_0x001f:
            int r3 = r1 + -1
            r6 = 12
            r7 = 31
            j$.time.LocalDateTime r3 = p155j$.time.LocalDateTime.m5703s(r3, r6, r7, r5, r5)
            j$.time.ZoneOffset[] r6 = r0.f6570b
            r5 = r6[r5]
            long r5 = r3.toEpochSecond(r5)
            java.util.TimeZone r3 = r0.f6575g
            r7 = 1000(0x3e8, double:4.94E-321)
            long r9 = r5 * r7
            int r3 = r3.getOffset(r9)
            r9 = 31968000(0x1e7cb00, double:1.57942906E-316)
            long r9 = r9 + r5
            j$.time.zone.a[] r11 = f6568l
        L_0x0041:
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x00be
            r12 = 7776000(0x76a700, double:3.8418545E-317)
            long r12 = r12 + r5
            java.util.TimeZone r14 = r0.f6575g
            r15 = r5
            long r4 = r12 * r7
            int r4 = r14.getOffset(r4)
            if (r3 == r4) goto L_0x00bc
            r5 = r15
        L_0x0055:
            long r15 = r12 - r5
            r17 = 1
            int r4 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x007d
            long r7 = r12 + r5
            r17 = r9
            r9 = 2
            long r7 = java.lang.Math.floorDiv(r7, r9)
            java.util.TimeZone r4 = r0.f6575g
            r15 = r12
            r9 = 1000(0x3e8, double:4.94E-321)
            long r12 = r7 * r9
            int r4 = r4.getOffset(r12)
            if (r4 != r3) goto L_0x0078
            r5 = r7
            r7 = r9
            r12 = r15
            goto L_0x007a
        L_0x0078:
            r12 = r7
            r7 = r9
        L_0x007a:
            r9 = r17
            goto L_0x0055
        L_0x007d:
            r17 = r9
            r15 = r12
            r9 = r7
            java.util.TimeZone r4 = r0.f6575g
            long r7 = r5 * r9
            int r4 = r4.getOffset(r7)
            if (r4 == r3) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r5 = r15
        L_0x008d:
            j$.time.ZoneOffset r3 = m6138k(r3)
            java.util.TimeZone r4 = r0.f6575g
            long r7 = r5 * r9
            int r4 = r4.getOffset(r7)
            j$.time.ZoneOffset r7 = m6138k(r4)
            int r8 = r0.m6135c(r5, r7)
            if (r8 != r1) goto L_0x00b7
            int r8 = r11.length
            int r8 = r8 + 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r11, r8)
            r11 = r8
            j$.time.zone.a[] r11 = (p155j$.time.zone.C2311a[]) r11
            int r8 = r11.length
            int r8 = r8 + -1
            j$.time.zone.a r12 = new j$.time.zone.a
            r12.<init>((long) r5, (p155j$.time.ZoneOffset) r3, (p155j$.time.ZoneOffset) r7)
            r11[r8] = r12
        L_0x00b7:
            r3 = r4
            r7 = r9
            r9 = r17
            goto L_0x0041
        L_0x00bc:
            r5 = r12
            goto L_0x0041
        L_0x00be:
            r3 = 1916(0x77c, float:2.685E-42)
            if (r3 > r1) goto L_0x00cb
            r3 = 2100(0x834, float:2.943E-42)
            if (r1 >= r3) goto L_0x00cb
            java.util.concurrent.ConcurrentMap r1 = r0.f6576h
            r1.putIfAbsent(r2, r11)
        L_0x00cb:
            return r11
        L_0x00cc:
            j$.time.zone.b[] r3 = r0.f6574f
            int r4 = r3.length
            j$.time.zone.a[] r4 = new p155j$.time.zone.C2311a[r4]
            int r6 = r3.length
            if (r6 > 0) goto L_0x00de
            r6 = 2100(0x834, float:2.943E-42)
            if (r1 >= r6) goto L_0x00dd
            java.util.concurrent.ConcurrentMap r1 = r0.f6576h
            r1.putIfAbsent(r2, r4)
        L_0x00dd:
            return r4
        L_0x00de:
            r1 = r3[r5]
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.zone.C2313c.m6134b(int):j$.time.zone.a[]");
    }

    /* renamed from: c */
    private int m6135c(long j, ZoneOffset zoneOffset) {
        return LocalDate.m5672w(Math.floorDiv(j + ((long) zoneOffset.mo6837q()), 86400)).mo6806s();
    }

    /* renamed from: e */
    private Object m6136e(LocalDateTime localDateTime) {
        Object obj = null;
        int i = 0;
        if (this.f6575g != null) {
            C2311a[] b = m6134b(localDateTime.mo6822p());
            if (b.length == 0) {
                return m6138k(this.f6575g.getOffset(localDateTime.toEpochSecond(this.f6570b[0]) * 1000));
            }
            int length = b.length;
            while (i < length) {
                C2311a aVar = b[i];
                Object a = m6133a(localDateTime, aVar);
                if ((a instanceof C2311a) || a.equals(aVar.mo7059i())) {
                    return a;
                }
                i++;
                obj = a;
            }
            return obj;
        } else if (this.f6571c.length == 0) {
            return this.f6570b[0];
        } else {
            if (this.f6574f.length > 0) {
                LocalDateTime[] localDateTimeArr = this.f6572d;
                if (localDateTime.mo6823q(localDateTimeArr[localDateTimeArr.length - 1])) {
                    C2311a[] b2 = m6134b(localDateTime.mo6822p());
                    int length2 = b2.length;
                    while (i < length2) {
                        C2311a aVar2 = b2[i];
                        Object a2 = m6133a(localDateTime, aVar2);
                        if ((a2 instanceof C2311a) || a2.equals(aVar2.mo7059i())) {
                            return a2;
                        }
                        i++;
                        obj = a2;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f6572d, localDateTime);
            if (binarySearch == -1) {
                return this.f6573e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f6572d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i2])) {
                        binarySearch = i2;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.f6573e[(binarySearch / 2) + 1];
            }
            LocalDateTime[] localDateTimeArr3 = this.f6572d;
            LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f6573e;
            int i3 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i3];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
            return zoneOffset2.mo6837q() > zoneOffset.mo6837q() ? new C2311a(localDateTime2, zoneOffset, zoneOffset2) : new C2311a(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    /* renamed from: j */
    public static C2313c m6137j(ZoneOffset zoneOffset) {
        return new C2313c(zoneOffset);
    }

    /* renamed from: k */
    private static ZoneOffset m6138k(int i) {
        return ZoneOffset.m5736t(i / 1000);
    }

    /* renamed from: d */
    public ZoneOffset mo7063d(C2270h hVar) {
        TimeZone timeZone = this.f6575g;
        if (timeZone != null) {
            return m6138k(timeZone.getOffset(hVar.mo6974v()));
        }
        if (this.f6571c.length == 0) {
            return this.f6570b[0];
        }
        long o = hVar.mo6970o();
        if (this.f6574f.length > 0) {
            long[] jArr = this.f6571c;
            if (o > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f6573e;
                C2311a[] b = m6134b(m6135c(o, zoneOffsetArr[zoneOffsetArr.length - 1]));
                C2311a aVar = null;
                for (int i = 0; i < b.length; i++) {
                    aVar = b[i];
                    if (o < aVar.mo7057h()) {
                        return aVar.mo7059i();
                    }
                }
                return aVar.mo7056g();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f6571c, o);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f6573e[binarySearch + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2313c)) {
            return false;
        }
        C2313c cVar = (C2313c) obj;
        return Objects.equals(this.f6575g, cVar.f6575g) && Arrays.equals(this.f6569a, cVar.f6569a) && Arrays.equals(this.f6570b, cVar.f6570b) && Arrays.equals(this.f6571c, cVar.f6571c) && Arrays.equals(this.f6573e, cVar.f6573e) && Arrays.equals(this.f6574f, cVar.f6574f);
    }

    /* renamed from: f */
    public C2311a mo7065f(LocalDateTime localDateTime) {
        Object e = m6136e(localDateTime);
        if (e instanceof C2311a) {
            return (C2311a) e;
        }
        return null;
    }

    /* renamed from: g */
    public List mo7066g(LocalDateTime localDateTime) {
        Object e = m6136e(localDateTime);
        return e instanceof C2311a ? ((C2311a) e).mo7060j() : Collections.singletonList((ZoneOffset) e);
    }

    /* renamed from: h */
    public boolean mo7067h(C2270h hVar) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f6575g;
        if (timeZone != null) {
            zoneOffset = m6138k(timeZone.getRawOffset());
        } else if (this.f6571c.length == 0) {
            zoneOffset = this.f6570b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f6569a, hVar.mo6970o());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f6570b[binarySearch + 1];
        }
        return !zoneOffset.equals(mo7063d(hVar));
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.f6575g) ^ Arrays.hashCode(this.f6569a)) ^ Arrays.hashCode(this.f6570b)) ^ Arrays.hashCode(this.f6571c)) ^ Arrays.hashCode(this.f6573e)) ^ Arrays.hashCode(this.f6574f);
    }

    /* renamed from: i */
    public boolean mo7069i() {
        TimeZone timeZone = this.f6575g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.f6575g.getDSTSavings() != 0) {
                return false;
            }
            C2270h hVar = C2270h.f6490c;
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            C2270h q = C2270h.m5929q(System.currentTimeMillis());
            C2311a aVar = null;
            if (this.f6575g != null) {
                long o = q.mo6970o();
                if (q.mo6971p() > 0 && o < Long.MAX_VALUE) {
                    o++;
                }
                int c = m6135c(o, mo7063d(q));
                C2311a[] b = m6134b(c);
                int length = b.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (o > b[length].mo7057h()) {
                            aVar = b[length];
                            break;
                        }
                        length--;
                    } else if (c > 1800) {
                        C2311a[] b2 = m6134b(c - 1);
                        int length2 = b2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(o - 31104000, (C2222c.m5749b().mo6838a() / 1000) + 31968000);
                                int offset = this.f6575g.getOffset((o - 1) * 1000);
                                long E = LocalDate.m5671v(1800, 1, 1).mo6784E() * 86400;
                                while (true) {
                                    if (E > min) {
                                        break;
                                    }
                                    int offset2 = this.f6575g.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c2 = m6135c(min, m6138k(offset2));
                                        C2311a[] b3 = m6134b(c2 + 1);
                                        int length3 = b3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                C2311a[] b4 = m6134b(c2);
                                                aVar = b4[b4.length - 1];
                                                break;
                                            } else if (o > b3[length3].mo7057h()) {
                                                aVar = b3[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (o > b2[length2].mo7057h()) {
                                aVar = b2[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.f6571c.length != 0) {
                long o2 = q.mo6970o();
                if (q.mo6971p() > 0 && o2 < Long.MAX_VALUE) {
                    o2++;
                }
                long[] jArr = this.f6571c;
                long j = jArr[jArr.length - 1];
                if (this.f6574f.length > 0 && o2 > j) {
                    ZoneOffset[] zoneOffsetArr = this.f6573e;
                    ZoneOffset zoneOffset2 = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int c3 = m6135c(o2, zoneOffset2);
                    C2311a[] b5 = m6134b(c3);
                    int length4 = b5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i = c3 - 1;
                            if (i > m6135c(j, zoneOffset2)) {
                                C2311a[] b6 = m6134b(i);
                                aVar = b6[b6.length - 1];
                            }
                        } else if (o2 > b5[length4].mo7057h()) {
                            aVar = b5[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.f6571c, o2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i2 = binarySearch - 1;
                    long j2 = this.f6571c[i2];
                    ZoneOffset[] zoneOffsetArr2 = this.f6573e;
                    aVar = new C2311a(j2, zoneOffsetArr2[i2], zoneOffsetArr2[binarySearch]);
                }
            }
            if (aVar == null) {
                return true;
            }
            return false;
        } else if (this.f6571c.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.f6575g != null) {
            sb = C2220a.m5746a("ZoneRules[timeZone=");
            sb.append(this.f6575g.getID());
        } else {
            sb = C2220a.m5746a("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f6570b;
            sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
