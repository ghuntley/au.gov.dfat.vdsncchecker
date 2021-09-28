package p118t0;

import java.util.Objects;
import p019c3.C0625a;
import p025d3.C0799c;
import p055i3.C1035b;
import p063k.C1142f;
import p072l2.C1241e;
import p118t0.C1779m;
import p120t2.C1790d;

/* renamed from: t0.n */
public final class C1780n<VM extends C1779m> implements C1790d<VM> {

    /* renamed from: e */
    public VM f5415e;

    /* renamed from: f */
    public final C1035b<VM> f5416f;

    /* renamed from: g */
    public final C0625a<C1784r> f5417g;

    /* renamed from: h */
    public final C0625a<C1781o> f5418h;

    public C1780n(C1035b<VM> bVar, C0625a<? extends C1784r> aVar, C0625a<? extends C1781o> aVar2) {
        this.f5416f = bVar;
        this.f5417g = aVar;
        this.f5418h = aVar2;
    }

    public Object getValue() {
        VM vm = this.f5415e;
        if (vm == null) {
            C1781o b = this.f5418h.mo40b();
            C1784r b2 = this.f5417g.mo40b();
            C1035b<VM> bVar = this.f5416f;
            C1241e.m3517j(bVar, "$this$java");
            Class b3 = ((C0799c) bVar).mo4036b();
            Objects.requireNonNull(b3, "null cannot be cast to non-null type java.lang.Class<T>");
            String canonicalName = b3.getCanonicalName();
            if (canonicalName != null) {
                String a = C1142f.m3365a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                VM vm2 = (C1779m) b2.f5419a.get(a);
                if (b3.isInstance(vm2)) {
                    if (b instanceof C1783q) {
                        ((C1783q) b).mo6066b(vm2);
                    }
                    vm = vm2;
                } else {
                    vm = b instanceof C1782p ? ((C1782p) b).mo6065c(a, b3) : b.mo4786a(b3);
                    C1779m put = b2.f5419a.put(a, vm);
                    if (put != null) {
                        put.mo5809b();
                    }
                }
                this.f5415e = vm;
                C1241e.m3516f(vm, "ViewModelProvider(store,…ed = it\n                }");
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        return vm;
    }
}
