package p065k1;

import p059j1.C1088b;
import p072l2.C1241e;
import p118t0.C1779m;
import p118t0.C1781o;

/* renamed from: k1.d */
public final class C1170d implements C1781o {

    /* renamed from: a */
    public final C1088b f4033a;

    public C1170d(C1088b bVar) {
        this.f4033a = bVar;
    }

    /* renamed from: a */
    public <T extends C1779m> T mo4786a(Class<T> cls) {
        C1241e.m3517j(cls, "modelClass");
        if (cls.isAssignableFrom(C1169c.class)) {
            return new C1169c(this.f4033a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
