package p152z1;

import android.view.View;

/* renamed from: z1.b0 */
public class C2162b0 implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f6237e;

    /* renamed from: f */
    public final /* synthetic */ C2164c0 f6238f;

    public C2162b0(C2164c0 c0Var, int i) {
        this.f6238f = c0Var;
        this.f6237e = i;
    }

    public void onClick(View view) {
        C2191s k = C2191s.m5624k(this.f6237e, this.f6238f.f6246c.f6257d0.f6306f);
        C2156a aVar = this.f6238f.f6246c.f6256c0;
        if (k.compareTo(aVar.f6218e) < 0) {
            k = aVar.f6218e;
        } else if (k.compareTo(aVar.f6219f) > 0) {
            k = aVar.f6219f;
        }
        this.f6238f.f6246c.mo6724p0(k);
        this.f6238f.f6246c.mo6725q0(1);
    }
}
