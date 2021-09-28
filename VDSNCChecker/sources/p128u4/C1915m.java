package p128u4;

import java.lang.reflect.Method;
import java.util.Objects;
import p042g2.C0955a;
import p072l2.C1241e;
import p073l3.C1274e;
import p120t2.C1789c;
import p139w3.C2063d0;

/* renamed from: u4.m */
public final class C1915m implements C1887d<Object> {

    /* renamed from: a */
    public final /* synthetic */ C1274e f5638a;

    public C1915m(C1274e eVar) {
        this.f5638a = eVar;
    }

    /* renamed from: a */
    public void mo5961a(C1882b<Object> bVar, Throwable th) {
        C1241e.m3518k(bVar, "call");
        C1241e.m3518k(th, "t");
        this.f5638a.mo5013j(C0955a.m2736j(th));
    }

    /* renamed from: b */
    public void mo5962b(C1882b<Object> bVar, C1881a0<Object> a0Var) {
        T t;
        C1274e eVar;
        C1241e.m3518k(bVar, "call");
        C1241e.m3518k(a0Var, "response");
        if (a0Var.mo6399a()) {
            t = a0Var.f5591b;
            if (t == null) {
                C2063d0 a = bVar.mo5978a();
                Class<C1913k> cls = C1913k.class;
                Objects.requireNonNull(a);
                C1241e.m3517j(cls, "type");
                C1913k cast = cls.cast(a.f5977f.get(cls));
                if (cast != null) {
                    C1241e.m3514d(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = cast.f5635a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    C1241e.m3514d(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    C1241e.m3514d(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    C1789c cVar = new C1789c(sb.toString());
                    eVar = this.f5638a;
                    t = C0955a.m2736j(cVar);
                } else {
                    C1241e.m3523q();
                    throw null;
                }
            } else {
                eVar = this.f5638a;
            }
        } else {
            eVar = this.f5638a;
            t = C0955a.m2736j(new C1908i(a0Var));
        }
        eVar.mo5013j(t);
    }
}
