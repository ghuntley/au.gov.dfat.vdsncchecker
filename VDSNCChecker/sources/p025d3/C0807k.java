package p025d3;

import p072l2.C1241e;

/* renamed from: d3.k */
public final class C0807k implements C0799c {

    /* renamed from: a */
    public final Class<?> f3117a;

    public C0807k(Class<?> cls, String str) {
        C1241e.m3517j(cls, "jClass");
        C1241e.m3517j(str, "moduleName");
        this.f3117a = cls;
    }

    /* renamed from: b */
    public Class<?> mo4036b() {
        return this.f3117a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0807k) && C1241e.m3513b(this.f3117a, ((C0807k) obj).f3117a);
    }

    public int hashCode() {
        return this.f3117a.hashCode();
    }

    public String toString() {
        return this.f3117a.toString() + " (Kotlin reflection is not available)";
    }
}
