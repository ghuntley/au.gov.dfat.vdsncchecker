package p155j$.time.format;

import p155j$.time.LocalDateTime;
import p155j$.time.ZoneOffset;
import p155j$.time.format.C2248g;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2296l;

/* renamed from: j$.time.format.j */
final class C2252j implements C2250h {
    C2252j(int i) {
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = i;
        C2248g gVar = new C2248g();
        gVar.mo6900a(DateTimeFormatter.f6387h);
        gVar.mo6903e('T');
        C2285a aVar = C2285a.HOUR_OF_DAY;
        gVar.mo6912o(aVar, 2);
        gVar.mo6903e(':');
        C2285a aVar2 = C2285a.MINUTE_OF_HOUR;
        gVar.mo6912o(aVar2, 2);
        gVar.mo6903e(':');
        C2285a aVar3 = C2285a.SECOND_OF_MINUTE;
        gVar.mo6912o(aVar3, 2);
        C2285a aVar4 = C2285a.NANO_OF_SECOND;
        int i5 = 0;
        gVar.mo6901b(aVar4, 0, 9, true);
        gVar.mo6903e('Z');
        C2248g.C2249a h = gVar.mo6920w().mo6889h(false);
        C2266x d = xVar.mo6949d();
        int c = h.mo6897c(d, charSequence, i4);
        if (c < 0) {
            return c;
        }
        long longValue = d.mo6954j(C2285a.YEAR).longValue();
        int intValue = d.mo6954j(C2285a.MONTH_OF_YEAR).intValue();
        int intValue2 = d.mo6954j(C2285a.DAY_OF_MONTH).intValue();
        int intValue3 = d.mo6954j(aVar).intValue();
        int intValue4 = d.mo6954j(aVar2).intValue();
        Long j = d.mo6954j(aVar3);
        Long j2 = d.mo6954j(aVar4);
        int intValue5 = j != null ? j.intValue() : 0;
        int intValue6 = j2 != null ? j2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i3 = 0;
            i2 = intValue5;
            i5 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.mo6960p();
            i3 = intValue3;
            i2 = 59;
        } else {
            i3 = intValue3;
            i2 = intValue5;
        }
        try {
            C2266x xVar2 = xVar;
            int i6 = i;
            return xVar2.mo6959o(aVar4, (long) intValue6, i6, xVar2.mo6959o(C2285a.INSTANT_SECONDS, Math.multiplyExact(longValue / 10000, 315569520000L) + LocalDateTime.m5704t(((int) longValue) % 10000, intValue, intValue2, i3, intValue4, i2, 0).mo6828x((long) i5).toEpochSecond(ZoneOffset.UTC), i6, c));
        } catch (RuntimeException unused) {
            return ~i4;
        }
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e = a.mo6866e(C2285a.INSTANT_SECONDS);
        C2296l d = a.mo6865d();
        C2285a aVar = C2285a.NANO_OF_SECOND;
        Long valueOf = d.mo6790c(aVar) ? Long.valueOf(a.mo6865d().mo6795f(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int m = aVar.mo7038m(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long floorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime v = LocalDateTime.m5706v(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb2.append('+');
                sb2.append(floorDiv);
            }
            sb2.append(v);
            if (v.mo6821o() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime v2 = LocalDateTime.m5706v(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(v2);
            if (v2.mo6821o() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (v2.mo6822p() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (m > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (m <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = m / i2;
                sb2.append((char) (i3 + 48));
                m -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public String toString() {
        return "Instant()";
    }
}
