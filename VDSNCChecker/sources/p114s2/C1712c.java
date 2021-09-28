package p114s2;

import java.lang.reflect.Type;
import p072l2.C1241e;
import p073l3.C1269c0;
import p073l3.C1308p;
import p073l3.C1317t0;
import p128u4.C1882b;
import p128u4.C1884c;
import p128u4.C1896f;
import p139w3.C2079i0;

/* renamed from: s2.c */
public final class C1712c<T, U> implements C1884c<T, C1269c0<? extends C1713d<? extends T, ? extends U>>> {

    /* renamed from: a */
    public final Type f5285a;

    /* renamed from: b */
    public final C1896f<C2079i0, U> f5286b;

    public C1712c(Type type, C1896f<C2079i0, U> fVar) {
        C1241e.m3517j(type, "successBodyType");
        this.f5285a = type;
        this.f5286b = fVar;
    }

    /* renamed from: a */
    public Type mo5963a() {
        return this.f5285a;
    }

    /* renamed from: b */
    public Object mo5964b(C1882b bVar) {
        C1241e.m3517j(bVar, "call");
        C1308p pVar = new C1308p((C1317t0) null);
        pVar.mo5109u(false, true, new C1710a(pVar, bVar));
        bVar.mo5983i(new C1711b(this, pVar));
        return pVar;
    }
}
