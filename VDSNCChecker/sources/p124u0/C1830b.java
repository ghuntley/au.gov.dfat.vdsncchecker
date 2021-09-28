package p124u0;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p039g.C0933a;
import p063k.C1142f;
import p093p.C1559i;
import p118t0.C1773g;
import p118t0.C1776j;
import p118t0.C1777k;
import p118t0.C1779m;
import p118t0.C1781o;
import p118t0.C1782p;
import p118t0.C1783q;
import p118t0.C1784r;

/* renamed from: u0.b */
public class C1830b extends C1829a {

    /* renamed from: a */
    public final C1773g f5524a;

    /* renamed from: b */
    public final C1832b f5525b;

    /* renamed from: u0.b$a */
    public static class C1831a<D> extends C1776j<D> {
        /* renamed from: e */
        public void mo1781e() {
            throw null;
        }

        /* renamed from: f */
        public void mo1782f() {
            throw null;
        }

        /* renamed from: g */
        public void mo1783g(C1777k<? super D> kVar) {
            super.mo1783g(kVar);
        }

        /* renamed from: h */
        public void mo6061h(D d) {
            super.mo6061h(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C0933a.m2707a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: u0.b$b */
    public static class C1832b extends C1779m {

        /* renamed from: d */
        public static final C1781o f5526d = new C1833a();

        /* renamed from: c */
        public C1559i<C1831a> f5527c = new C1559i<>();

        /* renamed from: u0.b$b$a */
        public static class C1833a implements C1781o {
            /* renamed from: a */
            public <T extends C1779m> T mo4786a(Class<T> cls) {
                return new C1832b();
            }
        }

        /* renamed from: b */
        public void mo5809b() {
            if (this.f5527c.mo5635m() <= 0) {
                C1559i<C1831a> iVar = this.f5527c;
                int i = iVar.f4845h;
                Object[] objArr = iVar.f4844g;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                iVar.f4845h = 0;
                iVar.f4842e = false;
                return;
            }
            Objects.requireNonNull(this.f5527c.mo5636n(0));
            throw null;
        }
    }

    public C1830b(C1773g gVar, C1784r rVar) {
        this.f5524a = gVar;
        C1781o oVar = C1832b.f5526d;
        Class cls = C1832b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a = C1142f.m3365a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            C1779m mVar = rVar.f5419a.get(a);
            if (!cls.isInstance(mVar)) {
                mVar = oVar instanceof C1782p ? ((C1782p) oVar).mo6065c(a, cls) : ((C1832b.C1833a) oVar).mo4786a(cls);
                C1779m put = rVar.f5419a.put(a, mVar);
                if (put != null) {
                    put.mo5809b();
                }
            } else if (oVar instanceof C1783q) {
                ((C1783q) oVar).mo6066b(mVar);
            }
            this.f5525b = (C1832b) mVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    /* renamed from: a */
    public void mo6206a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1832b bVar = this.f5525b;
        if (bVar.f5527c.mo5635m() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f5527c.mo5635m() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f5527c.mo5633k(0));
                printWriter.print(": ");
                printWriter.println(bVar.f5527c.mo5636n(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0933a.m2707a(this.f5524a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
