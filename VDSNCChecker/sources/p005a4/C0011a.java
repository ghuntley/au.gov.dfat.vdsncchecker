package p005a4;

import java.io.IOException;
import java.util.Objects;
import p014b4.C0548g;
import p072l2.C1241e;
import p139w3.C2057b0;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2109y;

/* renamed from: a4.a */
public final class C0011a implements C2109y {

    /* renamed from: a */
    public static final C0011a f9a = new C0011a();

    /* renamed from: a */
    public C2072g0 mo8a(C2109y.C2110a aVar) {
        C0548g gVar = (C0548g) aVar;
        C0017e eVar = gVar.f2339b;
        Objects.requireNonNull(eVar);
        synchronized (eVar) {
            if (!eVar.f52p) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.f51o)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.f50n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C0016d dVar = eVar.f46j;
        C1241e.m3515e(dVar);
        C2057b0 b0Var = eVar.f56t;
        C1241e.m3517j(b0Var, "client");
        try {
            C0013c cVar = new C0013c(eVar, eVar.f42f, dVar, dVar.mo22a(gVar.f2344g, gVar.f2345h, gVar.f2346i, 0, b0Var.f5925j, !C1241e.m3513b(gVar.f2343f.f5974c, "GET")).mo51k(b0Var, gVar));
            eVar.f49m = cVar;
            eVar.f54r = cVar;
            synchronized (eVar) {
                eVar.f50n = true;
                eVar.f51o = true;
            }
            if (!eVar.f53q) {
                return C0548g.m1801b(gVar, 0, cVar, (C2063d0) null, 0, 0, 0, 61).mo2692c(gVar.f2343f);
            }
            throw new IOException("Canceled");
        } catch (C0027k e) {
            dVar.mo24c(e.f91e);
            throw e;
        } catch (IOException e2) {
            dVar.mo24c(e2);
            throw new C0027k(e2);
        }
    }
}
