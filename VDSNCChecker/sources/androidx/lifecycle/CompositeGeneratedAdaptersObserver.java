package androidx.lifecycle;

import androidx.lifecycle.C0342c;
import p045h.C0990o;
import p118t0.C1773g;

public class CompositeGeneratedAdaptersObserver implements C0346d {

    /* renamed from: e */
    public final C0341b[] f1645e;

    public CompositeGeneratedAdaptersObserver(C0341b[] bVarArr) {
        this.f1645e = bVarArr;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        C0990o oVar = new C0990o(1);
        for (C0341b a : this.f1645e) {
            a.mo1801a(gVar, bVar, false, oVar);
        }
        for (C0341b a2 : this.f1645e) {
            a2.mo1801a(gVar, bVar, true, oVar);
        }
    }
}
