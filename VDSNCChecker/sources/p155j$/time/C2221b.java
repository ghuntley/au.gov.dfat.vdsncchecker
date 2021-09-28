package p155j$.time;

import java.io.Serializable;

/* renamed from: j$.time.b */
final class C2221b extends C2222c implements Serializable {

    /* renamed from: a */
    private final ZoneId f6370a;

    C2221b(ZoneId zoneId) {
        this.f6370a = zoneId;
    }

    /* renamed from: a */
    public long mo6838a() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public ZoneId mo6839c() {
        return this.f6370a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2221b) {
            return this.f6370a.equals(((C2221b) obj).f6370a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6370a.hashCode() + 1;
    }

    public String toString() {
        StringBuilder a = C2220a.m5746a("SystemClock[");
        a.append(this.f6370a);
        a.append("]");
        return a.toString();
    }
}
