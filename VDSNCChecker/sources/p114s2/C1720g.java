package p114s2;

import java.lang.reflect.Type;
import p042g2.C0955a;
import p072l2.C1241e;
import p114s2.C1713d;
import p120t2.C1798k;
import p128u4.C1881a0;
import p128u4.C1882b;
import p128u4.C1887d;
import p128u4.C1896f;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2079i0;
import p139w3.C2103w;

/* renamed from: s2.g */
public final class C1720g<S, E> implements C1882b<C1713d<? extends S, ? extends E>> {

    /* renamed from: e */
    public final C1882b<S> f5299e;

    /* renamed from: f */
    public final C1896f<C2079i0, E> f5300f;

    /* renamed from: g */
    public final Type f5301g;

    /* renamed from: s2.g$a */
    public static final class C1721a implements C1887d<S> {

        /* renamed from: a */
        public final /* synthetic */ C1720g<S, E> f5302a;

        /* renamed from: b */
        public final /* synthetic */ C1887d<C1713d<S, E>> f5303b;

        public C1721a(C1720g<S, E> gVar, C1887d<C1713d<S, E>> dVar) {
            this.f5302a = gVar;
            this.f5303b = dVar;
        }

        /* renamed from: a */
        public void mo5961a(C1882b<S> bVar, Throwable th) {
            C1241e.m3517j(bVar, "call");
            C1241e.m3517j(th, "throwable");
            this.f5303b.mo5962b(this.f5302a, C1881a0.m5141b(C0955a.m2740n(th, this.f5302a.f5300f)));
        }

        /* renamed from: b */
        public void mo5962b(C1882b<S> bVar, C1881a0<S> a0Var) {
            Object obj;
            C1241e.m3517j(bVar, "call");
            C1241e.m3517j(a0Var, "response");
            C1720g<S, E> gVar = this.f5302a;
            Type type = gVar.f5301g;
            C1896f<C2079i0, E> fVar = gVar.f5300f;
            C1241e.m3517j(type, "successBodyType");
            C1241e.m3517j(fVar, "errorConverter");
            T t = a0Var.f5591b;
            C2072g0 g0Var = a0Var.f5590a;
            C2103w wVar = g0Var.f6006j;
            int i = g0Var.f6004h;
            C2079i0 i0Var = a0Var.f5592c;
            E e = null;
            if (a0Var.mo6399a()) {
                obj = t != null ? new C1713d.C1716c(t, wVar, i) : C1241e.m3513b(type, C1798k.class) ? new C1713d.C1716c(C1798k.f5446a, wVar, i) : new C1713d.C1715b(null, i, wVar);
            } else {
                if (i0Var != null) {
                    try {
                        e = fVar.mo6398a(i0Var);
                    } catch (Exception e2) {
                        obj = new C1713d.C1717d(e2, Integer.valueOf(i), wVar);
                    }
                }
                obj = new C1713d.C1715b(e, i, wVar);
            }
            this.f5303b.mo5962b(this.f5302a, C1881a0.m5141b(obj));
        }
    }

    public C1720g(C1882b<S> bVar, C1896f<C2079i0, E> fVar, Type type) {
        C1241e.m3517j(fVar, "errorConverter");
        C1241e.m3517j(type, "successBodyType");
        this.f5299e = bVar;
        this.f5300f = fVar;
        this.f5301g = type;
    }

    /* renamed from: a */
    public C2063d0 mo5978a() {
        C2063d0 a = this.f5299e.mo5978a();
        C1241e.m3516f(a, "backingCall.request()");
        return a;
    }

    /* renamed from: c */
    public boolean mo5979c() {
        boolean c;
        synchronized (this) {
            c = this.f5299e.mo5979c();
        }
        return c;
    }

    public void cancel() {
        synchronized (this) {
            this.f5299e.cancel();
        }
    }

    /* renamed from: h */
    public C1882b<C1713d<S, E>> clone() {
        C1882b<S> h = this.f5299e.mo5982h();
        C1241e.m3516f(h, "backingCall.clone()");
        return new C1720g(h, this.f5300f, this.f5301g);
    }

    /* renamed from: i */
    public void mo5983i(C1887d<C1713d<S, E>> dVar) {
        synchronized (this) {
            this.f5299e.mo5983i(new C1721a(this, dVar));
        }
    }
}
