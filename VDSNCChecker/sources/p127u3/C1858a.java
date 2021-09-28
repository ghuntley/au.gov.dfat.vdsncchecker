package p127u3;

import p000a.C0001b;
import p016c0.C0559c;
import p025d3.C0802f;
import p025d3.C0810n;
import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1579a;
import p103q3.C1612b;
import p103q3.C1615c;
import p103q3.C1618e;
import p103q3.C1621f;
import p109r3.C1685b;
import p115s3.C1743q;
import p121t3.C1799a;
import p121t3.C1801b;
import p121t3.C1802c;
import p121t3.C1803d;
import p121t3.C1804e;
import p121t3.C1805f;
import p121t3.C1807h;
import p121t3.C1808i;
import p121t3.C1810j;
import p133v3.C1970c;

/* renamed from: u3.a */
public abstract class C1858a extends C1743q implements C1803d {

    /* renamed from: c */
    public final C1799a f5545c;

    /* renamed from: d */
    public final C1802c f5546d;

    public C1858a(C1799a aVar, C1804e eVar, C0802f fVar) {
        this.f5545c = aVar;
        this.f5546d = aVar.f5448a;
    }

    /* renamed from: A */
    public final String mo6367A(C1615c cVar, int i) {
        C1241e.m3517j(cVar, "<this>");
        String y = mo6371y(cVar, i);
        C1241e.m3517j(y, "nestedName");
        String str = (String) mo6006u();
        if (str == null) {
            str = "";
        }
        C1241e.m3517j(str, "parentName");
        C1241e.m3517j(y, "childName");
        return y;
    }

    /* renamed from: B */
    public abstract C1804e mo6368B();

    /* renamed from: a */
    public C1799a mo6114a() {
        return this.f5545c;
    }

    /* renamed from: c */
    public <T> T mo5875c(C1579a<T> aVar) {
        C1241e.m3517j(aVar, "deserializer");
        return C1320u.m3705i(this, aVar);
    }

    /* renamed from: e */
    public C1685b mo5886e(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        C1804e x = mo6370x();
        C1618e i = cVar.mo5766i();
        if (C1241e.m3513b(i, C1621f.C1623b.f4999a)) {
            C1799a aVar = this.f5545c;
            if (x instanceof C1801b) {
                return new C1868h(aVar, (C1801b) x);
            }
            StringBuilder a = C0001b.m0a("Expected ");
            a.append(C0810n.m2403a(C1801b.class));
            a.append(" as the serialized body of ");
            a.append(cVar.mo5760d());
            a.append(", but had ");
            a.append(C0810n.m2403a(x.getClass()));
            throw C1320u.m3698b(-1, a.toString());
        } else if (C1241e.m3513b(i, C1621f.C1624c.f5000a)) {
            C1799a aVar2 = this.f5545c;
            C1615c f = C1320u.m3702f(cVar.mo5764h(0), aVar2.f5449b);
            C1618e i2 = f.mo5766i();
            if ((i2 instanceof C1612b) || C1241e.m3513b(i2, C1618e.C1620b.f4997a)) {
                C1799a aVar3 = this.f5545c;
                if (x instanceof C1808i) {
                    return new C1869i(aVar3, (C1808i) x);
                }
                StringBuilder a2 = C0001b.m0a("Expected ");
                a2.append(C0810n.m2403a(C1808i.class));
                a2.append(" as the serialized body of ");
                a2.append(cVar.mo5760d());
                a2.append(", but had ");
                a2.append(C0810n.m2403a(x.getClass()));
                throw C1320u.m3698b(-1, a2.toString());
            } else if (aVar2.f5448a.f5455d) {
                C1799a aVar4 = this.f5545c;
                if (x instanceof C1801b) {
                    return new C1868h(aVar4, (C1801b) x);
                }
                StringBuilder a3 = C0001b.m0a("Expected ");
                a3.append(C0810n.m2403a(C1801b.class));
                a3.append(" as the serialized body of ");
                a3.append(cVar.mo5760d());
                a3.append(", but had ");
                a3.append(C0810n.m2403a(x.getClass()));
                throw C1320u.m3698b(-1, a3.toString());
            } else {
                throw C1320u.m3697a(f);
            }
        } else {
            C1799a aVar5 = this.f5545c;
            if (x instanceof C1808i) {
                return new C1866g(aVar5, (C1808i) x, (String) null, (C1615c) null, 12);
            }
            StringBuilder a4 = C0001b.m0a("Expected ");
            a4.append(C0810n.m2403a(C1808i.class));
            a4.append(" as the serialized body of ");
            a4.append(cVar.mo5760d());
            a4.append(", but had ");
            a4.append(C0810n.m2403a(x.getClass()));
            throw C1320u.m3698b(-1, a4.toString());
        }
    }

    /* renamed from: h */
    public C1804e mo6115h() {
        return mo6370x();
    }

    /* renamed from: i */
    public boolean mo5887i() {
        return !(mo6370x() instanceof C1807h);
    }

    /* renamed from: j */
    public C1970c mo5883j() {
        return this.f5545c.f5449b;
    }

    /* renamed from: l */
    public void mo5884l(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
    }

    /* renamed from: s */
    public long mo6004s(Object obj) {
        String str = (String) obj;
        C1241e.m3517j(str, "tag");
        C1810j z = mo6372z(str);
        try {
            C1241e.m3517j(z, "<this>");
            return Long.parseLong(z.mo6116b());
        } catch (IllegalArgumentException unused) {
            throw C1320u.m3699c(-1, "Failed to parse 'long'", mo6370x().toString());
        }
    }

    /* renamed from: t */
    public String mo6005t(Object obj) {
        String str = (String) obj;
        C1241e.m3517j(str, "tag");
        C1810j z = mo6372z(str);
        if (!this.f5545c.f5448a.f5454c) {
            C1805f fVar = z instanceof C1805f ? (C1805f) z : null;
            if (fVar == null) {
                throw C1320u.m3698b(-1, "Unexpected 'null' when string was expected");
            } else if (!fVar.f5463a) {
                throw C1320u.m3699c(-1, C0559c.m1823a("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), mo6370x().toString());
            }
        }
        if (!(z instanceof C1807h)) {
            return z.mo6116b();
        }
        throw C1320u.m3699c(-1, "Unexpected 'null' value instead of string literal", mo6370x().toString());
    }

    /* renamed from: w */
    public abstract C1804e mo6369w(String str);

    /* renamed from: x */
    public final C1804e mo6370x() {
        String str = (String) mo6006u();
        C1804e w = str == null ? null : mo6369w(str);
        return w == null ? mo6368B() : w;
    }

    /* renamed from: y */
    public abstract String mo6371y(C1615c cVar, int i);

    /* renamed from: z */
    public final C1810j mo6372z(String str) {
        C1804e w = mo6369w(str);
        C1810j jVar = w instanceof C1810j ? (C1810j) w : null;
        if (jVar != null) {
            return jVar;
        }
        throw C1320u.m3699c(-1, "Expected JsonPrimitive at " + str + ", found " + w, mo6370x().toString());
    }
}
