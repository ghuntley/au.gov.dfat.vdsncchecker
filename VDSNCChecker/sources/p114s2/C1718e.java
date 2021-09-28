package p114s2;

import java.lang.reflect.Type;
import p072l2.C1241e;
import p128u4.C1882b;
import p128u4.C1884c;
import p128u4.C1896f;
import p139w3.C2079i0;

/* renamed from: s2.e */
public final class C1718e<S, E> implements C1884c<S, C1882b<C1713d<? extends S, ? extends E>>> {

    /* renamed from: a */
    public final Type f5297a;

    /* renamed from: b */
    public final C1896f<C2079i0, E> f5298b;

    public C1718e(Type type, C1896f<C2079i0, E> fVar) {
        C1241e.m3517j(type, "successType");
        this.f5297a = type;
        this.f5298b = fVar;
    }

    /* renamed from: a */
    public Type mo5963a() {
        return this.f5297a;
    }

    /* renamed from: b */
    public Object mo5964b(C1882b bVar) {
        C1241e.m3517j(bVar, "call");
        return new C1720g(bVar, this.f5298b, this.f5297a);
    }
}
