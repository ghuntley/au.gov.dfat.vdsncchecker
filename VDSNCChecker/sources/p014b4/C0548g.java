package p014b4;

import java.util.List;
import p000a.C0001b;
import p005a4.C0013c;
import p005a4.C0017e;
import p072l2.C1241e;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2084k;
import p139w3.C2109y;

/* renamed from: b4.g */
public final class C0548g implements C2109y.C2110a {

    /* renamed from: a */
    public int f2338a;

    /* renamed from: b */
    public final C0017e f2339b;

    /* renamed from: c */
    public final List<C2109y> f2340c;

    /* renamed from: d */
    public final int f2341d;

    /* renamed from: e */
    public final C0013c f2342e;

    /* renamed from: f */
    public final C2063d0 f2343f;

    /* renamed from: g */
    public final int f2344g;

    /* renamed from: h */
    public final int f2345h;

    /* renamed from: i */
    public final int f2346i;

    public C0548g(C0017e eVar, List<? extends C2109y> list, int i, C0013c cVar, C2063d0 d0Var, int i2, int i3, int i4) {
        C1241e.m3517j(eVar, "call");
        C1241e.m3517j(list, "interceptors");
        C1241e.m3517j(d0Var, "request");
        this.f2339b = eVar;
        this.f2340c = list;
        this.f2341d = i;
        this.f2342e = cVar;
        this.f2343f = d0Var;
        this.f2344g = i2;
        this.f2345h = i3;
        this.f2346i = i4;
    }

    /* renamed from: b */
    public static C0548g m1801b(C0548g gVar, int i, C0013c cVar, C2063d0 d0Var, int i2, int i3, int i4, int i5) {
        C0548g gVar2 = gVar;
        int i6 = (i5 & 1) != 0 ? gVar2.f2341d : i;
        C0013c cVar2 = (i5 & 2) != 0 ? gVar2.f2342e : cVar;
        C2063d0 d0Var2 = (i5 & 4) != 0 ? gVar2.f2343f : d0Var;
        int i7 = (i5 & 8) != 0 ? gVar2.f2344g : i2;
        int i8 = (i5 & 16) != 0 ? gVar2.f2345h : i3;
        int i9 = (i5 & 32) != 0 ? gVar2.f2346i : i4;
        C1241e.m3517j(d0Var2, "request");
        return new C0548g(gVar2.f2339b, gVar2.f2340c, i6, cVar2, d0Var2, i7, i8, i9);
    }

    /* renamed from: a */
    public C2084k mo2691a() {
        C0013c cVar = this.f2342e;
        if (cVar != null) {
            return cVar.f15b;
        }
        return null;
    }

    /* renamed from: c */
    public C2072g0 mo2692c(C2063d0 d0Var) {
        C1241e.m3517j(d0Var, "request");
        boolean z = true;
        if (this.f2341d < this.f2340c.size()) {
            this.f2338a++;
            C0013c cVar = this.f2342e;
            if (cVar != null) {
                if (cVar.f18e.mo23b(d0Var.f5973b)) {
                    if (!(this.f2338a == 1)) {
                        StringBuilder a = C0001b.m0a("network interceptor ");
                        a.append(this.f2340c.get(this.f2341d - 1));
                        a.append(" must call proceed() exactly once");
                        throw new IllegalStateException(a.toString().toString());
                    }
                } else {
                    StringBuilder a2 = C0001b.m0a("network interceptor ");
                    a2.append(this.f2340c.get(this.f2341d - 1));
                    a2.append(" must retain the same host and port");
                    throw new IllegalStateException(a2.toString().toString());
                }
            }
            C0548g b = m1801b(this, this.f2341d + 1, (C0013c) null, d0Var, 0, 0, 0, 58);
            C2109y yVar = this.f2340c.get(this.f2341d);
            C2072g0 a3 = yVar.mo8a(b);
            if (a3 != null) {
                if (this.f2342e != null) {
                    if (!(this.f2341d + 1 >= this.f2340c.size() || b.f2338a == 1)) {
                        throw new IllegalStateException(("network interceptor " + yVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a3.f6007k == null) {
                    z = false;
                }
                if (z) {
                    return a3;
                }
                throw new IllegalStateException(("interceptor " + yVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + yVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
