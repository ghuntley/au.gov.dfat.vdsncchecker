package p045h;

import android.view.View;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1073r;
import p058j0.C1074s;

/* renamed from: h.k */
public class C0983k implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C0968h f3629e;

    /* renamed from: h.k$a */
    public class C0984a extends C1074s {
        public C0984a() {
        }

        /* renamed from: a */
        public void mo739a(View view) {
            C0983k.this.f3629e.f3588s.setAlpha(1.0f);
            C0983k.this.f3629e.f3591v.mo4548d((C1073r) null);
            C0983k.this.f3629e.f3591v = null;
        }

        /* renamed from: b */
        public void mo740b(View view) {
            C0983k.this.f3629e.f3588s.setVisibility(0);
        }
    }

    public C0983k(C0968h hVar) {
        this.f3629e = hVar;
    }

    public void run() {
        C0968h hVar = this.f3629e;
        hVar.f3589t.showAtLocation(hVar.f3588s, 55, 0, 0);
        this.f3629e.mo4326I();
        if (this.f3629e.mo4339V()) {
            this.f3629e.f3588s.setAlpha(0.0f);
            C0968h hVar2 = this.f3629e;
            C1070q b = C1061o.m3021b(hVar2.f3588s);
            b.mo4545a(1.0f);
            hVar2.f3591v = b;
            C1070q qVar = this.f3629e.f3591v;
            C0984a aVar = new C0984a();
            View view = (View) qVar.f3821a.get();
            if (view != null) {
                qVar.mo4549e(view, aVar);
                return;
            }
            return;
        }
        this.f3629e.f3588s.setAlpha(1.0f);
        this.f3629e.f3588s.setVisibility(0);
    }
}
