package p155j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p155j$.time.C2220a;
import p155j$.time.C2230d;
import p155j$.time.C2270h;
import p155j$.time.C2273k;
import p155j$.time.C2276n;
import p155j$.time.C2280r;
import p155j$.time.LocalDate;
import p155j$.time.ZoneId;
import p155j$.time.ZoneOffset;
import p155j$.time.chrono.C2223a;
import p155j$.time.chrono.C2224b;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2296l;
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

/* renamed from: j$.time.format.E */
final class C2237E implements C2296l {

    /* renamed from: a */
    final Map f6396a = new HashMap();

    /* renamed from: b */
    ZoneId f6397b;

    /* renamed from: c */
    C2228f f6398c;

    /* renamed from: d */
    boolean f6399d;

    /* renamed from: e */
    private C2238F f6400e;

    /* renamed from: f */
    private C2224b f6401f;

    /* renamed from: g */
    private C2273k f6402g;

    /* renamed from: h */
    C2276n f6403h = C2276n.f6507d;

    C2237E() {
    }

    /* renamed from: k */
    private void m5801k(C2296l lVar) {
        Iterator it = this.f6396a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C2300p pVar = (C2300p) entry.getKey();
            if (lVar.mo6790c(pVar)) {
                try {
                    long f = lVar.mo6795f(pVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (f == longValue) {
                        it.remove();
                    } else {
                        throw new C2230d("Conflict found: Field " + pVar + " " + f + " differs from " + pVar + " " + longValue + " derived from " + lVar);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* renamed from: m */
    private void m5802m() {
        if (this.f6396a.containsKey(C2285a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f6397b;
            if (zoneId == null) {
                Long l = (Long) this.f6396a.get(C2285a.OFFSET_SECONDS);
                if (l != null) {
                    zoneId = ZoneOffset.m5736t(l.intValue());
                } else {
                    return;
                }
            }
            m5803n(zoneId);
        }
    }

    /* renamed from: n */
    private void m5803n(ZoneId zoneId) {
        Map map = this.f6396a;
        C2285a aVar = C2285a.INSTANT_SECONDS;
        C2270h r = C2270h.m5930r(((Long) map.remove(aVar)).longValue());
        Objects.requireNonNull((C2229g) this.f6398c);
        C2280r o = C2280r.m5991o(r, zoneId);
        m5807r(o.mo7006s());
        m5808s(aVar, C2285a.SECOND_OF_DAY, Long.valueOf((long) o.mo7009u().mo6989y()));
    }

    /* renamed from: o */
    private void m5804o(long j, long j2, long j3, long j4) {
        C2273k r;
        C2276n nVar;
        if (this.f6400e == C2238F.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000)), j4);
            r = C2273k.m5951s(Math.floorMod(addExact, 86400000000000L));
            nVar = C2276n.m5982d((int) Math.floorDiv(addExact, 86400000000000L));
        } else {
            int m = C2285a.MINUTE_OF_HOUR.mo7038m(j2);
            int m2 = C2285a.NANO_OF_SECOND.mo7038m(j4);
            if (this.f6400e == C2238F.SMART && j == 24 && m == 0 && j3 == 0 && m2 == 0) {
                r = C2273k.f6498g;
                nVar = C2276n.m5982d(1);
            } else {
                r = C2273k.m5950r(C2285a.HOUR_OF_DAY.mo7038m(j), m, C2285a.SECOND_OF_MINUTE.mo7038m(j3), m2);
                nVar = C2276n.f6507d;
            }
        }
        m5806q(r, nVar);
    }

    /* renamed from: p */
    private void m5805p() {
        Long l;
        C2285a aVar;
        Map map = this.f6396a;
        C2285a aVar2 = C2285a.CLOCK_HOUR_OF_DAY;
        long j = 0;
        if (map.containsKey(aVar2)) {
            long longValue = ((Long) this.f6396a.remove(aVar2)).longValue();
            C2238F f = this.f6400e;
            if (f == C2238F.STRICT || (f == C2238F.SMART && longValue != 0)) {
                aVar2.mo7039n(longValue);
            }
            C2285a aVar3 = C2285a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            m5808s(aVar2, aVar3, Long.valueOf(longValue));
        }
        Map map2 = this.f6396a;
        C2285a aVar4 = C2285a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar4)) {
            long longValue2 = ((Long) this.f6396a.remove(aVar4)).longValue();
            C2238F f2 = this.f6400e;
            if (f2 == C2238F.STRICT || (f2 == C2238F.SMART && longValue2 != 0)) {
                aVar4.mo7039n(longValue2);
            }
            C2285a aVar5 = C2285a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            m5808s(aVar4, aVar5, Long.valueOf(j));
        }
        Map map3 = this.f6396a;
        C2285a aVar6 = C2285a.AMPM_OF_DAY;
        if (map3.containsKey(aVar6)) {
            Map map4 = this.f6396a;
            C2285a aVar7 = C2285a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar7)) {
                long longValue3 = ((Long) this.f6396a.remove(aVar6)).longValue();
                long longValue4 = ((Long) this.f6396a.remove(aVar7)).longValue();
                if (this.f6400e == C2238F.LENIENT) {
                    aVar = C2285a.HOUR_OF_DAY;
                    l = Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, 12), longValue4));
                } else {
                    aVar6.mo7039n(longValue3);
                    aVar7.mo7039n(longValue3);
                    aVar = C2285a.HOUR_OF_DAY;
                    l = Long.valueOf((longValue3 * 12) + longValue4);
                }
                m5808s(aVar6, aVar, l);
            }
        }
        Map map5 = this.f6396a;
        C2285a aVar8 = C2285a.NANO_OF_DAY;
        if (map5.containsKey(aVar8)) {
            long longValue5 = ((Long) this.f6396a.remove(aVar8)).longValue();
            if (this.f6400e != C2238F.LENIENT) {
                aVar8.mo7039n(longValue5);
            }
            m5808s(aVar8, C2285a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            m5808s(aVar8, C2285a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            m5808s(aVar8, C2285a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            m5808s(aVar8, C2285a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.f6396a;
        C2285a aVar9 = C2285a.MICRO_OF_DAY;
        if (map6.containsKey(aVar9)) {
            long longValue6 = ((Long) this.f6396a.remove(aVar9)).longValue();
            if (this.f6400e != C2238F.LENIENT) {
                aVar9.mo7039n(longValue6);
            }
            m5808s(aVar9, C2285a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            m5808s(aVar9, C2285a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.f6396a;
        C2285a aVar10 = C2285a.MILLI_OF_DAY;
        if (map7.containsKey(aVar10)) {
            long longValue7 = ((Long) this.f6396a.remove(aVar10)).longValue();
            if (this.f6400e != C2238F.LENIENT) {
                aVar10.mo7039n(longValue7);
            }
            m5808s(aVar10, C2285a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            m5808s(aVar10, C2285a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.f6396a;
        C2285a aVar11 = C2285a.SECOND_OF_DAY;
        if (map8.containsKey(aVar11)) {
            long longValue8 = ((Long) this.f6396a.remove(aVar11)).longValue();
            if (this.f6400e != C2238F.LENIENT) {
                aVar11.mo7039n(longValue8);
            }
            m5808s(aVar11, C2285a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            m5808s(aVar11, C2285a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            m5808s(aVar11, C2285a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.f6396a;
        C2285a aVar12 = C2285a.MINUTE_OF_DAY;
        if (map9.containsKey(aVar12)) {
            long longValue9 = ((Long) this.f6396a.remove(aVar12)).longValue();
            if (this.f6400e != C2238F.LENIENT) {
                aVar12.mo7039n(longValue9);
            }
            m5808s(aVar12, C2285a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            m5808s(aVar12, C2285a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.f6396a;
        C2285a aVar13 = C2285a.NANO_OF_SECOND;
        if (map10.containsKey(aVar13)) {
            long longValue10 = ((Long) this.f6396a.get(aVar13)).longValue();
            C2238F f3 = this.f6400e;
            C2238F f4 = C2238F.LENIENT;
            if (f3 != f4) {
                aVar13.mo7039n(longValue10);
            }
            Map map11 = this.f6396a;
            C2285a aVar14 = C2285a.MICRO_OF_SECOND;
            if (map11.containsKey(aVar14)) {
                long longValue11 = ((Long) this.f6396a.remove(aVar14)).longValue();
                if (this.f6400e != f4) {
                    aVar14.mo7039n(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                m5808s(aVar14, aVar13, Long.valueOf(longValue10));
            }
            Map map12 = this.f6396a;
            C2285a aVar15 = C2285a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar15)) {
                long longValue12 = ((Long) this.f6396a.remove(aVar15)).longValue();
                if (this.f6400e != f4) {
                    aVar15.mo7039n(longValue12);
                }
                m5808s(aVar15, aVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.f6396a;
        C2285a aVar16 = C2285a.HOUR_OF_DAY;
        if (map13.containsKey(aVar16)) {
            Map map14 = this.f6396a;
            C2285a aVar17 = C2285a.MINUTE_OF_HOUR;
            if (map14.containsKey(aVar17)) {
                Map map15 = this.f6396a;
                C2285a aVar18 = C2285a.SECOND_OF_MINUTE;
                if (map15.containsKey(aVar18) && this.f6396a.containsKey(aVar13)) {
                    m5804o(((Long) this.f6396a.remove(aVar16)).longValue(), ((Long) this.f6396a.remove(aVar17)).longValue(), ((Long) this.f6396a.remove(aVar18)).longValue(), ((Long) this.f6396a.remove(aVar13)).longValue());
                }
            }
        }
    }

    /* renamed from: q */
    private void m5806q(C2273k kVar, C2276n nVar) {
        C2273k kVar2 = this.f6402g;
        if (kVar2 == null) {
            this.f6402g = kVar;
        } else if (!kVar2.equals(kVar)) {
            StringBuilder a = C2220a.m5746a("Conflict found: Fields resolved to different times: ");
            a.append(this.f6402g);
            a.append(" ");
            a.append(kVar);
            throw new C2230d(a.toString());
        } else if (!this.f6403h.mo6997c() && !nVar.mo6997c() && !this.f6403h.equals(nVar)) {
            StringBuilder a2 = C2220a.m5746a("Conflict found: Fields resolved to different excess periods: ");
            a2.append(this.f6403h);
            a2.append(" ");
            a2.append(nVar);
            throw new C2230d(a2.toString());
        }
        this.f6403h = nVar;
    }

    /* renamed from: r */
    private void m5807r(C2224b bVar) {
        C2224b bVar2 = this.f6401f;
        if (bVar2 != null) {
            if (bVar != null && !bVar2.equals(bVar)) {
                StringBuilder a = C2220a.m5746a("Conflict found: Fields resolved to two different dates: ");
                a.append(this.f6401f);
                a.append(" ");
                a.append(bVar);
                throw new C2230d(a.toString());
            }
        } else if (bVar != null) {
            if (((C2223a) this.f6398c).equals(C2229g.f6372a)) {
                this.f6401f = bVar;
                return;
            }
            StringBuilder a2 = C2220a.m5746a("ChronoLocalDate must use the effective parsed chronology: ");
            a2.append(this.f6398c);
            throw new C2230d(a2.toString());
        }
    }

    /* renamed from: s */
    private void m5808s(C2300p pVar, C2300p pVar2, Long l) {
        Long l2 = (Long) this.f6396a.put(pVar2, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            throw new C2230d("Conflict found: " + pVar2 + " " + l2 + " differs from " + pVar2 + " " + l + " while resolving  " + pVar);
        }
    }

    /* renamed from: c */
    public boolean mo6790c(C2300p pVar) {
        if (this.f6396a.containsKey(pVar)) {
            return true;
        }
        C2224b bVar = this.f6401f;
        if (bVar != null && ((LocalDate) bVar).mo6790c(pVar)) {
            return true;
        }
        C2273k kVar = this.f6402g;
        if (kVar == null || !kVar.mo6790c(pVar)) {
            return pVar != null && !(pVar instanceof C2285a) && pVar.mo7026j(this);
        }
        return true;
    }

    /* renamed from: e */
    public Object mo6793e(C2309y yVar) {
        int i = C2308x.f6561a;
        if (yVar == C2301q.f6554a) {
            return this.f6397b;
        }
        if (yVar == C2302r.f6555a) {
            return this.f6398c;
        }
        if (yVar == C2306v.f6559a) {
            C2224b bVar = this.f6401f;
            if (bVar != null) {
                return LocalDate.m5669o(bVar);
            }
            return null;
        } else if (yVar == C2307w.f6560a) {
            return this.f6402g;
        } else {
            if (yVar == C2305u.f6558a || yVar == C2304t.f6557a) {
                return yVar.mo6895a(this);
            }
            if (yVar == C2303s.f6556a) {
                return null;
            }
            return yVar.mo6895a(this);
        }
    }

    /* renamed from: f */
    public long mo6795f(C2300p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) this.f6396a.get(pVar);
        if (l != null) {
            return l.longValue();
        }
        C2224b bVar = this.f6401f;
        if (bVar != null && ((LocalDate) bVar).mo6790c(pVar)) {
            return ((LocalDate) this.f6401f).mo6795f(pVar);
        }
        C2273k kVar = this.f6402g;
        if (kVar != null && kVar.mo6790c(pVar)) {
            return this.f6402g.mo6795f(pVar);
        }
        if (!(pVar instanceof C2285a)) {
            return pVar.mo7023f(this);
        }
        throw new C2281A("Unsupported field: " + pVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0236  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155j$.time.temporal.C2296l mo6891l(p155j$.time.format.C2238F r19, java.util.Set r20) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            if (r0 == 0) goto L_0x000f
            java.util.Map r1 = r9.f6396a
            java.util.Set r1 = r1.keySet()
            r1.retainAll(r0)
        L_0x000f:
            r0 = r19
            r9.f6400e = r0
            r18.m5802m()
            j$.time.chrono.f r0 = r9.f6398c
            java.util.Map r1 = r9.f6396a
            j$.time.format.F r2 = r9.f6400e
            j$.time.chrono.g r0 = (p155j$.time.chrono.C2229g) r0
            j$.time.chrono.b r0 = r0.mo6854f(r1, r2)
            r9.m5807r(r0)
            r18.m5805p()
            java.util.Map r0 = r9.f6396a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00fd
            r0 = 0
        L_0x0031:
            r1 = 50
            if (r0 >= r1) goto L_0x00db
            java.util.Map r2 = r9.f6396a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            j$.time.temporal.p r3 = (p155j$.time.temporal.C2300p) r3
            java.util.Map r4 = r9.f6396a
            j$.time.format.F r5 = r9.f6400e
            j$.time.temporal.l r4 = r3.mo7024g(r4, r9, r5)
            if (r4 == 0) goto L_0x00cf
            boolean r1 = r4 instanceof p155j$.time.chrono.C2227e
            if (r1 == 0) goto L_0x0098
            j$.time.chrono.e r4 = (p155j$.time.chrono.C2227e) r4
            j$.time.ZoneId r1 = r9.f6397b
            if (r1 != 0) goto L_0x006f
            r1 = r4
            j$.time.r r1 = (p155j$.time.C2280r) r1
            j$.time.ZoneId r1 = r1.mo7005n()
            r9.f6397b = r1
            goto L_0x007c
        L_0x006f:
            r2 = r4
            j$.time.r r2 = (p155j$.time.C2280r) r2
            j$.time.ZoneId r2 = r2.mo7005n()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0083
        L_0x007c:
            j$.time.r r4 = (p155j$.time.C2280r) r4
            j$.time.chrono.c r4 = r4.mo7007t()
            goto L_0x0098
        L_0x0083:
            j$.time.d r0 = new j$.time.d
            java.lang.String r1 = "ChronoZonedDateTime must use the effective parsed zone: "
            java.lang.StringBuilder r1 = p155j$.time.C2220a.m5746a(r1)
            j$.time.ZoneId r2 = r9.f6397b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            boolean r1 = r4 instanceof p155j$.time.chrono.C2225c
            if (r1 == 0) goto L_0x00b1
            j$.time.chrono.c r4 = (p155j$.time.chrono.C2225c) r4
            j$.time.LocalDateTime r4 = (p155j$.time.LocalDateTime) r4
            j$.time.k r1 = r4.mo6814D()
            j$.time.n r2 = p155j$.time.C2276n.f6507d
            r9.m5806q(r1, r2)
            j$.time.chrono.b r1 = r4.mo6813C()
            r9.m5807r(r1)
            goto L_0x00d7
        L_0x00b1:
            boolean r1 = r4 instanceof p155j$.time.chrono.C2224b
            if (r1 == 0) goto L_0x00bb
            j$.time.chrono.b r4 = (p155j$.time.chrono.C2224b) r4
            r9.m5807r(r4)
            goto L_0x00d7
        L_0x00bb:
            boolean r1 = r4 instanceof p155j$.time.C2273k
            if (r1 == 0) goto L_0x00c7
            j$.time.k r4 = (p155j$.time.C2273k) r4
            j$.time.n r1 = p155j$.time.C2276n.f6507d
            r9.m5806q(r4, r1)
            goto L_0x00d7
        L_0x00c7:
            j$.time.d r0 = new j$.time.d
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            java.util.Map r4 = r9.f6396a
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x003f
        L_0x00d7:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x00db:
            if (r0 == r1) goto L_0x00f5
            if (r0 <= 0) goto L_0x00fd
            r18.m5802m()
            j$.time.chrono.f r0 = r9.f6398c
            java.util.Map r1 = r9.f6396a
            j$.time.format.F r2 = r9.f6400e
            j$.time.chrono.g r0 = (p155j$.time.chrono.C2229g) r0
            j$.time.chrono.b r0 = r0.mo6854f(r1, r2)
            r9.m5807r(r0)
            r18.m5805p()
            goto L_0x00fd
        L_0x00f5:
            j$.time.d r0 = new j$.time.d
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            j$.time.k r0 = r9.f6402g
            r1 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x01e7
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.MILLI_OF_SECOND
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x014e
            java.util.Map r0 = r9.f6396a
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0142
            long r4 = r4 * r10
            java.util.Map r0 = r9.f6396a
            java.lang.Object r0 = r0.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = r0 % r10
            long r0 = r0 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r9.m5808s(r3, r6, r2)
            java.util.Map r2 = r9.f6396a
            r2.remove(r6)
            goto L_0x0164
        L_0x0142:
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.NANO_OF_SECOND
            long r4 = r4 * r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2 = r0
            r0 = r1
            goto L_0x016d
        L_0x014e:
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0170
            java.util.Map r0 = r9.f6396a
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x0164:
            java.util.Map r2 = r9.f6396a
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.NANO_OF_SECOND
            long r0 = r0 * r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x016d:
            r2.put(r3, r0)
        L_0x0170:
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r12 = p155j$.time.temporal.C2285a.HOUR_OF_DAY
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01e7
            java.util.Map r1 = r9.f6396a
            j$.time.temporal.a r13 = p155j$.time.temporal.C2285a.MINUTE_OF_HOUR
            java.lang.Object r1 = r1.get(r13)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.Map r2 = r9.f6396a
            j$.time.temporal.a r14 = p155j$.time.temporal.C2285a.SECOND_OF_MINUTE
            java.lang.Object r2 = r2.get(r14)
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Map r3 = r9.f6396a
            j$.time.temporal.a r15 = p155j$.time.temporal.C2285a.NANO_OF_SECOND
            java.lang.Object r3 = r3.get(r15)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x01a0
            if (r2 != 0) goto L_0x022b
            if (r3 != 0) goto L_0x022b
        L_0x01a0:
            if (r1 == 0) goto L_0x01a8
            if (r2 != 0) goto L_0x01a8
            if (r3 == 0) goto L_0x01a8
            goto L_0x022b
        L_0x01a8:
            if (r1 == 0) goto L_0x01af
            long r4 = r1.longValue()
            goto L_0x01b1
        L_0x01af:
            r4 = 0
        L_0x01b1:
            if (r2 == 0) goto L_0x01b8
            long r1 = r2.longValue()
            goto L_0x01ba
        L_0x01b8:
            r1 = 0
        L_0x01ba:
            r6 = r1
            if (r3 == 0) goto L_0x01c2
            long r1 = r3.longValue()
            goto L_0x01c4
        L_0x01c2:
            r1 = 0
        L_0x01c4:
            r16 = r1
            long r1 = r0.longValue()
            r0 = r18
            r3 = r4
            r5 = r6
            r7 = r16
            r0.m5804o(r1, r3, r5, r7)
            java.util.Map r0 = r9.f6396a
            r0.remove(r12)
            java.util.Map r0 = r9.f6396a
            r0.remove(r13)
            java.util.Map r0 = r9.f6396a
            r0.remove(r14)
            java.util.Map r0 = r9.f6396a
            r0.remove(r15)
        L_0x01e7:
            j$.time.format.F r0 = r9.f6400e
            j$.time.format.F r1 = p155j$.time.format.C2238F.LENIENT
            if (r0 == r1) goto L_0x022b
            java.util.Map r0 = r9.f6396a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022b
            java.util.Map r0 = r9.f6396a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01ff:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x022b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.p r2 = (p155j$.time.temporal.C2300p) r2
            boolean r3 = r2 instanceof p155j$.time.temporal.C2285a
            if (r3 == 0) goto L_0x01ff
            boolean r3 = r2.mo7027l()
            if (r3 == 0) goto L_0x01ff
            j$.time.temporal.a r2 = (p155j$.time.temporal.C2285a) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.mo7039n(r3)
            goto L_0x01ff
        L_0x022b:
            j$.time.chrono.b r0 = r9.f6401f
            if (r0 == 0) goto L_0x0232
            r9.m5801k(r0)
        L_0x0232:
            j$.time.k r0 = r9.f6402g
            if (r0 == 0) goto L_0x0252
            r9.m5801k(r0)
            j$.time.chrono.b r0 = r9.f6401f
            if (r0 == 0) goto L_0x0252
            java.util.Map r0 = r9.f6396a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0252
            j$.time.chrono.b r0 = r9.f6401f
            j$.time.k r1 = r9.f6402g
            j$.time.LocalDate r0 = (p155j$.time.LocalDate) r0
            j$.time.LocalDateTime r0 = p155j$.time.LocalDateTime.m5705u(r0, r1)
            r9.m5801k(r0)
        L_0x0252:
            j$.time.chrono.b r0 = r9.f6401f
            if (r0 == 0) goto L_0x0292
            j$.time.k r0 = r9.f6402g
            if (r0 == 0) goto L_0x0292
            j$.time.n r0 = r9.f6403h
            boolean r0 = r0.mo6997c()
            if (r0 != 0) goto L_0x0292
            j$.time.chrono.b r0 = r9.f6401f
            j$.time.n r1 = r9.f6403h
            j$.time.LocalDate r0 = (p155j$.time.LocalDate) r0
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r1 instanceof p155j$.time.C2276n
            if (r2 == 0) goto L_0x0281
            long r2 = r1.mo6998e()
            j$.time.LocalDate r0 = r0.mo6781A(r2)
            int r1 = r1.mo6996b()
            long r1 = (long) r1
            j$.time.LocalDate r0 = r0.mo6811z(r1)
            goto L_0x028c
        L_0x0281:
            java.lang.String r2 = "amountToAdd"
            java.util.Objects.requireNonNull(r1, r2)
            j$.time.temporal.k r0 = r1.mo6995a(r0)
            j$.time.LocalDate r0 = (p155j$.time.LocalDate) r0
        L_0x028c:
            r9.f6401f = r0
            j$.time.n r0 = p155j$.time.C2276n.f6507d
            r9.f6403h = r0
        L_0x0292:
            j$.time.k r0 = r9.f6402g
            if (r0 != 0) goto L_0x0308
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.INSTANT_SECONDS
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x02b4
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.SECOND_OF_DAY
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x02b4
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.SECOND_OF_MINUTE
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0308
        L_0x02b4:
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.NANO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02e7
            java.util.Map r0 = r9.f6396a
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.util.Map r2 = r9.f6396a
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.MICRO_OF_SECOND
            long r4 = r0 / r10
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            java.util.Map r2 = r9.f6396a
            j$.time.temporal.a r3 = p155j$.time.temporal.C2285a.MILLI_OF_SECOND
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            goto L_0x0308
        L_0x02e7:
            java.util.Map r0 = r9.f6396a
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.MICRO_OF_SECOND
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.MILLI_OF_SECOND
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x0308:
            j$.time.chrono.b r0 = r9.f6401f
            if (r0 == 0) goto L_0x0353
            j$.time.k r1 = r9.f6402g
            if (r1 == 0) goto L_0x0353
            j$.time.ZoneId r2 = r9.f6397b
            r3 = 0
            if (r2 == 0) goto L_0x0322
            j$.time.LocalDate r0 = (p155j$.time.LocalDate) r0
            j$.time.LocalDateTime r0 = p155j$.time.LocalDateTime.m5705u(r0, r1)
            j$.time.ZoneId r1 = r9.f6397b
            j$.time.r r0 = p155j$.time.C2280r.m5992p(r0, r1, r3)
            goto L_0x0344
        L_0x0322:
            java.util.Map r0 = r9.f6396a
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.OFFSET_SECONDS
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0353
            int r0 = r0.intValue()
            j$.time.ZoneOffset r0 = p155j$.time.ZoneOffset.m5736t(r0)
            j$.time.chrono.b r1 = r9.f6401f
            j$.time.k r2 = r9.f6402g
            j$.time.LocalDate r1 = (p155j$.time.LocalDate) r1
            j$.time.LocalDateTime r1 = p155j$.time.LocalDateTime.m5705u(r1, r2)
            j$.time.r r0 = p155j$.time.C2280r.m5992p(r1, r0, r3)
        L_0x0344:
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.INSTANT_SECONDS
            long r2 = r0.mo6795f(r1)
            java.util.Map r0 = r9.f6396a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x0353:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2237E.mo6891l(j$.time.format.F, java.util.Set):j$.time.temporal.l");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f6396a);
        sb.append(',');
        sb.append(this.f6398c);
        if (this.f6397b != null) {
            sb.append(',');
            sb.append(this.f6397b);
        }
        if (!(this.f6401f == null && this.f6402g == null)) {
            sb.append(" resolved to ");
            C2224b bVar = this.f6401f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.f6402g != null) {
                    sb.append('T');
                }
            }
            sb.append(this.f6402g);
        }
        return sb.toString();
    }
}
