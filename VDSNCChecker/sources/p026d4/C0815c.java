package p026d4;

import p062j4.C1115i;
import p072l2.C1241e;

/* renamed from: d4.c */
public final class C0815c {

    /* renamed from: d */
    public static final C1115i f3130d;

    /* renamed from: e */
    public static final C1115i f3131e;

    /* renamed from: f */
    public static final C1115i f3132f;

    /* renamed from: g */
    public static final C1115i f3133g;

    /* renamed from: h */
    public static final C1115i f3134h;

    /* renamed from: i */
    public static final C1115i f3135i;

    /* renamed from: a */
    public final int f3136a;

    /* renamed from: b */
    public final C1115i f3137b;

    /* renamed from: c */
    public final C1115i f3138c;

    static {
        C1115i.C1116a aVar = C1115i.f3890i;
        f3130d = aVar.mo4683b(":");
        f3131e = aVar.mo4683b(":status");
        f3132f = aVar.mo4683b(":method");
        f3133g = aVar.mo4683b(":path");
        f3134h = aVar.mo4683b(":scheme");
        f3135i = aVar.mo4683b(":authority");
    }

    public C0815c(C1115i iVar, C1115i iVar2) {
        C1241e.m3517j(iVar, "name");
        C1241e.m3517j(iVar2, "value");
        this.f3137b = iVar;
        this.f3138c = iVar2;
        this.f3136a = iVar.mo4669c() + 32 + iVar2.mo4669c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0815c(C1115i iVar, String str) {
        this(iVar, C1115i.f3890i.mo4683b(str));
        C1241e.m3517j(iVar, "name");
        C1241e.m3517j(str, "value");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0815c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p072l2.C1241e.m3517j(r2, r0)
            java.lang.String r0 = "value"
            p072l2.C1241e.m3517j(r3, r0)
            j4.i$a r0 = p062j4.C1115i.f3890i
            j4.i r2 = r0.mo4683b(r2)
            j4.i r3 = r0.mo4683b(r3)
            r1.<init>((p062j4.C1115i) r2, (p062j4.C1115i) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0815c.<init>(java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0815c)) {
            return false;
        }
        C0815c cVar = (C0815c) obj;
        return C1241e.m3513b(this.f3137b, cVar.f3137b) && C1241e.m3513b(this.f3138c, cVar.f3138c);
    }

    public int hashCode() {
        C1115i iVar = this.f3137b;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C1115i iVar2 = this.f3138c;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f3137b.mo4679j() + ": " + this.f3138c.mo4679j();
    }
}
