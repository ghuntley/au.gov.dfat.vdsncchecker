package p155j$.time.chrono;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p155j$.time.C2230d;
import p155j$.time.C2231e;
import p155j$.time.LocalDate;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2286b;
import p155j$.time.temporal.C2299o;

/* renamed from: j$.time.chrono.a */
public abstract class C2223a implements C2228f {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected C2223a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6843c(Map map, C2285a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new C2230d("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    public int compareTo(Object obj) {
        Objects.requireNonNull((C2228f) obj);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2224b mo6845d(C2224b bVar, long j, long j2, long j3) {
        long j4;
        LocalDate y = ((LocalDate) bVar).mo6800j(j, C2286b.MONTHS);
        C2286b bVar2 = C2286b.WEEKS;
        LocalDate y2 = y.mo6800j(j2, bVar2);
        if (j3 > 7) {
            j4 = j3 - 1;
            y2 = y2.mo6800j(j4 / 7, bVar2);
        } else {
            if (j3 < 1) {
                y2 = y2.mo6800j(Math.subtractExact(j3, 7) / 7, bVar2);
                j4 = j3 + 6;
            }
            return y2.mo6786G(C2299o.m6105a(C2231e.m5760m((int) j3)));
        }
        j3 = (j4 % 7) + 1;
        return y2.mo6786G(C2299o.m6105a(C2231e.m5760m((int) j3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2223a)) {
            return false;
        }
        Objects.requireNonNull((C2223a) obj);
        return true;
    }

    public int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public String toString() {
        return "ISO";
    }
}
