package p121t3;

import p000a.C0001b;
import p025d3.C0802f;
import p097p3.C1579a;
import p127u3.C1860c;
import p127u3.C1863e;
import p127u3.C1871k;
import p127u3.C1873m;
import p133v3.C1970c;
import p133v3.C1971d;

/* renamed from: t3.a */
public abstract class C1799a {

    /* renamed from: d */
    public static final C1800a f5447d = new C1800a((C0802f) null);

    /* renamed from: a */
    public final C1802c f5448a;

    /* renamed from: b */
    public final C1970c f5449b;

    /* renamed from: c */
    public final C1860c f5450c = new C1860c();

    /* renamed from: t3.a$a */
    public static final class C1800a extends C1799a {
        public C1800a(C0802f fVar) {
            super(new C1802c(false, false, false, false, false, (String) null, false, false, (String) null, false, false, 2047), C1971d.f5806a, (C0802f) null);
        }
    }

    public C1799a(C1802c cVar, C1970c cVar2, C0802f fVar) {
        this.f5448a = cVar;
        this.f5449b = cVar2;
    }

    /* renamed from: a */
    public final <T> T mo6084a(C1579a<T> aVar, String str) {
        C1863e eVar = new C1863e(str);
        T c = new C1871k(this, C1873m.OBJ, eVar).mo5875c(aVar);
        if (eVar.mo6378c() == 10) {
            return c;
        }
        StringBuilder a = C0001b.m0a("Expected EOF, but had ");
        a.append(eVar.f5551a.charAt(eVar.f5552b - 1));
        a.append(" instead");
        eVar.mo6384i(a.toString(), eVar.f5552b);
        throw null;
    }
}
