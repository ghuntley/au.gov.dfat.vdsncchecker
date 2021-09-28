package p115s3;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import p072l2.C1241e;
import p103q3.C1615c;
import p103q3.C1618e;

/* renamed from: s3.n */
public final class C1740n implements C1615c, C1725d {

    /* renamed from: a */
    public final C1615c f5331a;

    /* renamed from: b */
    public final String f5332b;

    /* renamed from: c */
    public final Set<String> f5333c;

    public C1740n(C1615c cVar) {
        C1241e.m3517j(cVar, "original");
        this.f5331a = cVar;
        this.f5332b = C1241e.m3522p(cVar.mo5760d(), "?");
        this.f5333c = C1732j.m4807a(cVar);
    }

    /* renamed from: a */
    public String mo5757a(int i) {
        return this.f5331a.mo5757a(i);
    }

    /* renamed from: b */
    public boolean mo5758b() {
        return this.f5331a.mo5758b();
    }

    /* renamed from: c */
    public int mo5759c(String str) {
        return this.f5331a.mo5759c(str);
    }

    /* renamed from: d */
    public String mo5760d() {
        return this.f5332b;
    }

    /* renamed from: e */
    public Set<String> mo5985e() {
        return this.f5333c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1740n) && C1241e.m3513b(this.f5331a, ((C1740n) obj).f5331a);
    }

    /* renamed from: f */
    public boolean mo5762f() {
        return true;
    }

    /* renamed from: g */
    public List<Annotation> mo5763g(int i) {
        return this.f5331a.mo5763g(i);
    }

    /* renamed from: h */
    public C1615c mo5764h(int i) {
        return this.f5331a.mo5764h(i);
    }

    public int hashCode() {
        return this.f5331a.hashCode() * 31;
    }

    /* renamed from: i */
    public C1618e mo5766i() {
        return this.f5331a.mo5766i();
    }

    /* renamed from: j */
    public int mo5767j() {
        return this.f5331a.mo5767j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5331a);
        sb.append('?');
        return sb.toString();
    }
}
