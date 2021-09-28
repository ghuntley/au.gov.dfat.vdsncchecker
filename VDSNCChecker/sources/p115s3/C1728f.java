package p115s3;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;
import p025d3.C0802f;
import p067k3.C1204g;
import p072l2.C1241e;
import p103q3.C1615c;
import p103q3.C1618e;
import p103q3.C1621f;
import p126u2.C1852m;

/* renamed from: s3.f */
public abstract class C1728f implements C1615c {

    /* renamed from: a */
    public final C1615c f5305a;

    /* renamed from: b */
    public final int f5306b = 1;

    public C1728f(C1615c cVar, C0802f fVar) {
        this.f5305a = cVar;
    }

    /* renamed from: a */
    public String mo5757a(int i) {
        return String.valueOf(i);
    }

    /* renamed from: b */
    public boolean mo5758b() {
        C1615c.C1616a.m4532a(this);
        return false;
    }

    /* renamed from: c */
    public int mo5759c(String str) {
        Integer I = C1204g.m3425I(str);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException(C1241e.m3522p(str, " is not a valid list index"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1728f)) {
            return false;
        }
        C1728f fVar = (C1728f) obj;
        if (C1241e.m3513b(this.f5305a, fVar.f5305a)) {
            Objects.requireNonNull(fVar);
            if (C1241e.m3513b("kotlin.collections.ArrayList", "kotlin.collections.ArrayList")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5762f() {
        C1615c.C1616a.m4533b(this);
        return false;
    }

    /* renamed from: g */
    public List<Annotation> mo5763g(int i) {
        if (i >= 0) {
            return C1852m.f5542e;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + "kotlin.collections.ArrayList" + " expects only non-negative indices").toString());
    }

    /* renamed from: h */
    public C1615c mo5764h(int i) {
        if (i >= 0) {
            return this.f5305a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + "kotlin.collections.ArrayList" + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f5305a.hashCode() * 31) - 1820483535;
    }

    /* renamed from: i */
    public C1618e mo5766i() {
        return C1621f.C1623b.f4999a;
    }

    /* renamed from: j */
    public int mo5767j() {
        return this.f5306b;
    }

    public String toString() {
        return "kotlin.collections.ArrayList" + '(' + this.f5305a + ')';
    }
}
