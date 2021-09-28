package p120t2;

import java.io.Serializable;
import p072l2.C1241e;

/* renamed from: t2.e */
public final class C1791e<A, B> implements Serializable {

    /* renamed from: e */
    public final A f5439e;

    /* renamed from: f */
    public final B f5440f;

    public C1791e(A a, B b) {
        this.f5439e = a;
        this.f5440f = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1791e)) {
            return false;
        }
        C1791e eVar = (C1791e) obj;
        return C1241e.m3513b(this.f5439e, eVar.f5439e) && C1241e.m3513b(this.f5440f, eVar.f5440f);
    }

    public int hashCode() {
        A a = this.f5439e;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f5440f;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f5439e + ", " + this.f5440f + ')';
    }
}
