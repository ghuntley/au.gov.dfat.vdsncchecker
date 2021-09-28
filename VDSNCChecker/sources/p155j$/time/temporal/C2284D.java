package p155j$.time.temporal;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p155j$.time.C2220a;
import p155j$.time.C2231e;

/* renamed from: j$.time.temporal.D */
public final class C2284D implements Serializable {

    /* renamed from: g */
    private static final ConcurrentMap f6531g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final C2310z f6532h = C2294j.f6552d;

    /* renamed from: a */
    private final C2231e f6533a;

    /* renamed from: b */
    private final int f6534b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient C2300p f6535c = C2283C.m6025o(this);

    /* renamed from: d */
    private final transient C2300p f6536d = C2283C.m6028r(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient C2300p f6537e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient C2300p f6538f;

    static {
        new C2284D(C2231e.MONDAY, 4);
        m6045g(C2231e.SUNDAY, 1);
    }

    private C2284D(C2231e eVar, int i) {
        C2283C.m6030t(this);
        this.f6537e = C2283C.m6029s(this);
        this.f6538f = C2283C.m6027q(this);
        Objects.requireNonNull(eVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f6533a = eVar;
        this.f6534b = i;
    }

    /* renamed from: g */
    public static C2284D m6045g(C2231e eVar, int i) {
        String str = eVar.toString() + i;
        ConcurrentMap concurrentMap = f6531g;
        C2284D d = (C2284D) concurrentMap.get(str);
        if (d != null) {
            return d;
        }
        concurrentMap.putIfAbsent(str, new C2284D(eVar, i));
        return (C2284D) concurrentMap.get(str);
    }

    /* renamed from: d */
    public C2300p mo7029d() {
        return this.f6535c;
    }

    /* renamed from: e */
    public C2231e mo7030e() {
        return this.f6533a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2284D) {
            return hashCode() == obj.hashCode();
        }
        return false;
    }

    /* renamed from: f */
    public int mo7032f() {
        return this.f6534b;
    }

    /* renamed from: h */
    public C2300p mo7033h() {
        return this.f6538f;
    }

    public int hashCode() {
        return (this.f6533a.ordinal() * 7) + this.f6534b;
    }

    /* renamed from: i */
    public C2300p mo7035i() {
        return this.f6536d;
    }

    /* renamed from: j */
    public C2300p mo7036j() {
        return this.f6537e;
    }

    public String toString() {
        StringBuilder a = C2220a.m5746a("WeekFields[");
        a.append(this.f6533a);
        a.append(',');
        a.append(this.f6534b);
        a.append(']');
        return a.toString();
    }
}
