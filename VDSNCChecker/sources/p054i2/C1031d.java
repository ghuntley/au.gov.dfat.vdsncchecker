package p054i2;

import android.graphics.Typeface;
import p010b0.C0533b;
import p075m.C1417c;

/* renamed from: i2.d */
public class C1031d extends C0533b.C0534a {

    /* renamed from: a */
    public final /* synthetic */ C1417c f3750a;

    /* renamed from: b */
    public final /* synthetic */ C1033f f3751b;

    public C1031d(C1033f fVar, C1417c cVar) {
        this.f3751b = fVar;
        this.f3750a = cVar;
    }

    /* renamed from: d */
    public void mo759d(int i) {
        this.f3751b.f3767m = true;
        this.f3750a.mo3467g(i);
    }

    /* renamed from: e */
    public void mo760e(Typeface typeface) {
        C1033f fVar = this.f3751b;
        fVar.f3768n = Typeface.create(typeface, fVar.f3758d);
        C1033f fVar2 = this.f3751b;
        fVar2.f3767m = true;
        this.f3750a.mo3468h(fVar2.f3768n, false);
    }
}
