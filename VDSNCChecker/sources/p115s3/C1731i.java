package p115s3;

import p025d3.C0810n;
import p072l2.C1241e;
import p097p3.C1580b;
import p103q3.C1615c;
import p109r3.C1687c;

/* renamed from: s3.i */
public final class C1731i<T> implements C1580b<T> {

    /* renamed from: a */
    public final C1580b<T> f5310a;

    /* renamed from: b */
    public final C1615c f5311b = new C1740n(C1742p.f5335b);

    public C1731i(C1580b<T> bVar) {
        this.f5310a = bVar;
    }

    /* renamed from: a */
    public C1615c mo2491a() {
        return this.f5311b;
    }

    /* renamed from: d */
    public T mo2494d(C1687c cVar) {
        C1241e.m3517j(cVar, "decoder");
        return cVar.mo5887i() ? cVar.mo5875c(this.f5310a) : cVar.mo5888m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1241e.m3513b(C0810n.m2403a(C1731i.class), C0810n.m2403a(obj.getClass())) && C1241e.m3513b(this.f5310a, ((C1731i) obj).f5310a);
    }

    public int hashCode() {
        return this.f5310a.hashCode();
    }
}
