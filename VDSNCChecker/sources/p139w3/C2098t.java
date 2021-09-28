package p139w3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p062j4.C1112f;
import p062j4.C1113g;
import p072l2.C1241e;
import p139w3.C2111z;
import p144x3.C2129c;

/* renamed from: w3.t */
public final class C2098t extends C2070f0 {

    /* renamed from: c */
    public static final C2111z f6099c = C2111z.C2112a.m5503a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List<String> f6100a;

    /* renamed from: b */
    public final List<String> f6101b;

    /* renamed from: w3.t$a */
    public static final class C2099a {

        /* renamed from: a */
        public final List<String> f6102a = new ArrayList();

        /* renamed from: b */
        public final List<String> f6103b = new ArrayList();

        /* renamed from: c */
        public final Charset f6104c = null;
    }

    static {
        C2111z.C2112a aVar = C2111z.f6136f;
    }

    public C2098t(List<String> list, List<String> list2) {
        C1241e.m3517j(list, "encodedNames");
        C1241e.m3517j(list2, "encodedValues");
        this.f6100a = C2129c.m5533u(list);
        this.f6101b = C2129c.m5533u(list2);
    }

    /* renamed from: a */
    public long mo6448a() {
        return mo6605d((C1113g) null, true);
    }

    /* renamed from: b */
    public C2111z mo6449b() {
        return f6099c;
    }

    /* renamed from: c */
    public void mo6450c(C1113g gVar) {
        C1241e.m3517j(gVar, "sink");
        mo6605d(gVar, false);
    }

    /* renamed from: d */
    public final long mo6605d(C1113g gVar, boolean z) {
        C1112f fVar;
        if (z) {
            fVar = new C1112f();
        } else {
            C1241e.m3515e(gVar);
            fVar = gVar.mo4637b();
        }
        int size = this.f6100a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.mo4633X(38);
            }
            fVar.mo4639c0(this.f6100a.get(i));
            fVar.mo4633X(61);
            fVar.mo4639c0(this.f6101b.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = fVar.f3888f;
        fVar.mo4654q(j);
        return j;
    }
}
