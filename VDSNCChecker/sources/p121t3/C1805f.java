package p121t3;

import p025d3.C0802f;
import p025d3.C0810n;
import p072l2.C1241e;
import p127u3.C1872l;

/* renamed from: t3.f */
public final class C1805f extends C1810j {

    /* renamed from: a */
    public final boolean f5463a;

    /* renamed from: b */
    public final String f5464b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1805f(Object obj, boolean z) {
        super((C0802f) null);
        C1241e.m3517j(obj, "body");
        this.f5463a = z;
        this.f5464b = obj.toString();
    }

    /* renamed from: b */
    public String mo6116b() {
        return this.f5464b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1241e.m3513b(C0810n.m2403a(C1805f.class), C0810n.m2403a(obj.getClass()))) {
            return false;
        }
        C1805f fVar = (C1805f) obj;
        return this.f5463a == fVar.f5463a && C1241e.m3513b(this.f5464b, fVar.f5464b);
    }

    public int hashCode() {
        return this.f5464b.hashCode() + (Boolean.valueOf(this.f5463a).hashCode() * 31);
    }

    public String toString() {
        if (!this.f5463a) {
            return this.f5464b;
        }
        StringBuilder sb = new StringBuilder();
        C1872l.m5131a(sb, this.f5464b);
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
