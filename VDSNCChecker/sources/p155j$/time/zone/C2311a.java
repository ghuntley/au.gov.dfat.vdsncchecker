package p155j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p155j$.time.C2220a;
import p155j$.time.C2232f;
import p155j$.time.C2270h;
import p155j$.time.LocalDateTime;
import p155j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
public final class C2311a implements Comparable, Serializable {

    /* renamed from: a */
    private final LocalDateTime f6562a;

    /* renamed from: b */
    private final ZoneOffset f6563b;

    /* renamed from: c */
    private final ZoneOffset f6564c;

    C2311a(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f6562a = LocalDateTime.m5706v(j, 0, zoneOffset);
        this.f6563b = zoneOffset;
        this.f6564c = zoneOffset2;
    }

    C2311a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f6562a = localDateTime;
        this.f6563b = zoneOffset;
        this.f6564c = zoneOffset2;
    }

    /* renamed from: c */
    public LocalDateTime mo7050c() {
        return this.f6562a.mo6830z((long) (this.f6564c.mo6837q() - this.f6563b.mo6837q()));
    }

    public int compareTo(Object obj) {
        return mo7055f().mo6969l(((C2311a) obj).mo7055f());
    }

    /* renamed from: d */
    public LocalDateTime mo7052d() {
        return this.f6562a;
    }

    /* renamed from: e */
    public C2232f mo7053e() {
        return C2232f.m5770f((long) (this.f6564c.mo6837q() - this.f6563b.mo6837q()));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2311a)) {
            return false;
        }
        C2311a aVar = (C2311a) obj;
        return this.f6562a.equals(aVar.f6562a) && this.f6563b.equals(aVar.f6563b) && this.f6564c.equals(aVar.f6564c);
    }

    /* renamed from: f */
    public C2270h mo7055f() {
        LocalDateTime localDateTime = this.f6562a;
        return C2270h.m5931s(localDateTime.toEpochSecond(this.f6563b), (long) localDateTime.mo6814D().mo6981o());
    }

    /* renamed from: g */
    public ZoneOffset mo7056g() {
        return this.f6564c;
    }

    /* renamed from: h */
    public long mo7057h() {
        return this.f6562a.toEpochSecond(this.f6563b);
    }

    public int hashCode() {
        return (this.f6562a.hashCode() ^ this.f6563b.hashCode()) ^ Integer.rotateLeft(this.f6564c.hashCode(), 16);
    }

    /* renamed from: i */
    public ZoneOffset mo7059i() {
        return this.f6563b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List mo7060j() {
        if (mo7061l()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{this.f6563b, this.f6564c});
    }

    /* renamed from: l */
    public boolean mo7061l() {
        return this.f6564c.mo6837q() > this.f6563b.mo6837q();
    }

    public String toString() {
        StringBuilder a = C2220a.m5746a("Transition[");
        a.append(mo7061l() ? "Gap" : "Overlap");
        a.append(" at ");
        a.append(this.f6562a);
        a.append(this.f6563b);
        a.append(" to ");
        a.append(this.f6564c);
        a.append(']');
        return a.toString();
    }
}
