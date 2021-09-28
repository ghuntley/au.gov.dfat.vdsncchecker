package p152z1;

import android.view.View;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1043a;
import p064k0.C1150b;

/* renamed from: z1.i */
public class C2177i extends C1043a {

    /* renamed from: d */
    public final /* synthetic */ C2170g f6270d;

    public C2177i(C2170g gVar) {
        this.f6270d = gVar;
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        C2170g gVar;
        int i;
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        if (this.f6270d.f6263j0.getVisibility() == 0) {
            gVar = this.f6270d;
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            gVar = this.f6270d;
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        bVar.mo4770k(gVar.mo1582A(i));
    }
}
