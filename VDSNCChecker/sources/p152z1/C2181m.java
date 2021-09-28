package p152z1;

import android.view.View;

/* renamed from: z1.m */
public class C2181m implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C2195v f6277e;

    /* renamed from: f */
    public final /* synthetic */ C2170g f6278f;

    public C2181m(C2170g gVar, C2195v vVar) {
        this.f6278f = gVar;
        this.f6277e = vVar;
    }

    public void onClick(View view) {
        int W0 = this.f6278f.mo6722n0().mo1939W0() - 1;
        if (W0 >= 0) {
            this.f6278f.mo6724p0(this.f6277e.mo6762e(W0));
        }
    }
}
