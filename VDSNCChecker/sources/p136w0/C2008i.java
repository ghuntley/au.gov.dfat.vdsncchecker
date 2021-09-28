package p136w0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import p063k.C1142f;
import p118t0.C1779m;
import p118t0.C1781o;
import p118t0.C1782p;
import p118t0.C1783q;
import p118t0.C1784r;

/* renamed from: w0.i */
public class C2008i extends C1779m {

    /* renamed from: d */
    public static final C1781o f5834d = new C2009a();

    /* renamed from: c */
    public final HashMap<UUID, C1784r> f5835c = new HashMap<>();

    /* renamed from: w0.i$a */
    public class C2009a implements C1781o {
        /* renamed from: a */
        public <T extends C1779m> T mo4786a(Class<T> cls) {
            return new C2008i();
        }
    }

    /* renamed from: d */
    public static C2008i m5281d(C1784r rVar) {
        C1781o oVar = f5834d;
        Class cls = C2008i.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a = C1142f.m3365a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            C1779m mVar = rVar.f5419a.get(a);
            if (!cls.isInstance(mVar)) {
                mVar = oVar instanceof C1782p ? ((C1782p) oVar).mo6065c(a, cls) : oVar.mo4786a(cls);
                C1779m put = rVar.f5419a.put(a, mVar);
                if (put != null) {
                    put.mo5809b();
                }
            } else if (oVar instanceof C1783q) {
                ((C1783q) oVar).mo6066b(mVar);
            }
            return (C2008i) mVar;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public void mo5809b() {
        for (C1784r a : this.f5835c.values()) {
            a.mo6067a();
        }
        this.f5835c.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f5835c.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
