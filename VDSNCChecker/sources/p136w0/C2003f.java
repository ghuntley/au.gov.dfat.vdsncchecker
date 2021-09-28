package p136w0;

import p000a.C0001b;

/* renamed from: w0.f */
public final class C2003f {

    /* renamed from: a */
    public final C2016n f5817a;

    /* renamed from: b */
    public final boolean f5818b;

    /* renamed from: c */
    public final boolean f5819c;

    /* renamed from: d */
    public final Object f5820d;

    public C2003f(C2016n<?> nVar, boolean z, Object obj, boolean z2) {
        if (!nVar.f5870a && z) {
            throw new IllegalArgumentException(nVar.mo6510b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.f5817a = nVar;
            this.f5818b = z;
            this.f5820d = obj;
            this.f5819c = z2;
        } else {
            StringBuilder a = C0001b.m0a("Argument with type ");
            a.append(nVar.mo6510b());
            a.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(a.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2003f.class != obj.getClass()) {
            return false;
        }
        C2003f fVar = (C2003f) obj;
        if (this.f5818b != fVar.f5818b || this.f5819c != fVar.f5819c || !this.f5817a.equals(fVar.f5817a)) {
            return false;
        }
        Object obj2 = this.f5820d;
        Object obj3 = fVar.f5820d;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public int hashCode() {
        int hashCode = ((((this.f5817a.hashCode() * 31) + (this.f5818b ? 1 : 0)) * 31) + (this.f5819c ? 1 : 0)) * 31;
        Object obj = this.f5820d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
