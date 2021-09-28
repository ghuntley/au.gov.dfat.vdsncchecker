package p106r0;

import androidx.fragment.app.C0286k;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import androidx.savedstate.C0483a;
import p002a1.C0006a;
import p002a1.C0007b;
import p118t0.C1784r;
import p118t0.C1785s;

/* renamed from: r0.v */
public class C1669v implements C0007b, C1785s {

    /* renamed from: e */
    public final C1784r f5103e;

    /* renamed from: f */
    public C0347e f5104f = null;

    /* renamed from: g */
    public C0006a f5105g = null;

    public C1669v(C0286k kVar, C1784r rVar) {
        this.f5103e = rVar;
    }

    /* renamed from: a */
    public void mo5860a(C0342c.C0344b bVar) {
        C0347e eVar = this.f5104f;
        eVar.mo1806d("handleLifecycleEvent");
        eVar.mo1808g(bVar.mo1804a());
    }

    /* renamed from: b */
    public void mo5861b() {
        if (this.f5104f == null) {
            this.f5104f = new C0347e(this);
            this.f5105g = new C0006a(this);
        }
    }

    /* renamed from: c */
    public C0342c mo113c() {
        mo5861b();
        return this.f5104f;
    }

    /* renamed from: e */
    public C0483a mo3e() {
        mo5861b();
        return this.f5105g.f2b;
    }

    /* renamed from: j */
    public C1784r mo116j() {
        mo5861b();
        return this.f5103e;
    }
}
