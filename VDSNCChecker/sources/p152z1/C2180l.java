package p152z1;

import android.view.View;

/* renamed from: z1.l */
public class C2180l implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C2195v f6275e;

    /* renamed from: f */
    public final /* synthetic */ C2170g f6276f;

    public C2180l(C2170g gVar, C2195v vVar) {
        this.f6276f = gVar;
        this.f6275e = vVar;
    }

    public void onClick(View view) {
        int U0 = this.f6276f.mo6722n0().mo1937U0() + 1;
        if (U0 < this.f6276f.f6261h0.getAdapter().mo2129a()) {
            this.f6276f.mo6724p0(this.f6275e.mo6762e(U0));
        }
    }
}
