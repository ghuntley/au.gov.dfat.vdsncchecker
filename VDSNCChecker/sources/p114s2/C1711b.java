package p114s2;

import java.lang.reflect.Type;
import p042g2.C0955a;
import p072l2.C1241e;
import p073l3.C1306o;
import p114s2.C1713d;
import p120t2.C1798k;
import p128u4.C1881a0;
import p128u4.C1882b;
import p128u4.C1887d;
import p128u4.C1896f;
import p139w3.C2072g0;
import p139w3.C2079i0;
import p139w3.C2103w;

/* renamed from: s2.b */
public final class C1711b implements C1887d<Object> {

    /* renamed from: a */
    public final /* synthetic */ C1712c<Object, Object> f5283a;

    /* renamed from: b */
    public final /* synthetic */ C1306o<C1713d<Object, Object>> f5284b;

    public C1711b(C1712c<Object, Object> cVar, C1306o<C1713d<Object, Object>> oVar) {
        this.f5283a = cVar;
        this.f5284b = oVar;
    }

    /* renamed from: a */
    public void mo5961a(C1882b<Object> bVar, Throwable th) {
        C1241e.m3517j(bVar, "call");
        C1241e.m3517j(th, "throwable");
        try {
            this.f5284b.mo5094J(C0955a.m2740n(th, this.f5283a.f5286b));
        } catch (Throwable th2) {
            this.f5284b.mo5093F(th2);
        }
    }

    /* renamed from: b */
    public void mo5962b(C1882b<Object> bVar, C1881a0<Object> a0Var) {
        Object obj;
        C1241e.m3517j(bVar, "call");
        C1241e.m3517j(a0Var, "response");
        C1712c<Object, Object> cVar = this.f5283a;
        Type type = cVar.f5285a;
        C1896f<C2079i0, U> fVar = cVar.f5286b;
        C1241e.m3517j(type, "successBodyType");
        C1241e.m3517j(fVar, "errorConverter");
        T t = a0Var.f5591b;
        C2072g0 g0Var = a0Var.f5590a;
        C2103w wVar = g0Var.f6006j;
        int i = g0Var.f6004h;
        C2079i0 i0Var = a0Var.f5592c;
        U u = null;
        if (a0Var.mo6399a()) {
            obj = t != null ? new C1713d.C1716c(t, wVar, i) : C1241e.m3513b(type, C1798k.class) ? new C1713d.C1716c(C1798k.f5446a, wVar, i) : new C1713d.C1715b(null, i, wVar);
        } else {
            if (i0Var != null) {
                try {
                    u = fVar.mo6398a(i0Var);
                } catch (Exception e) {
                    obj = new C1713d.C1717d(e, Integer.valueOf(i), wVar);
                }
            }
            obj = new C1713d.C1715b(u, i, wVar);
        }
        this.f5284b.mo5094J(obj);
    }
}
