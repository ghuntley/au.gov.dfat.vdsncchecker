package p017c1;

import android.view.View;
import android.view.ViewGroup;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: c1.w */
public class C0618w extends C0599j {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2474a;

    /* renamed from: b */
    public final /* synthetic */ View f2475b;

    /* renamed from: c */
    public final /* synthetic */ View f2476c;

    /* renamed from: d */
    public final /* synthetic */ C0619x f2477d;

    public C0618w(C0619x xVar, ViewGroup viewGroup, View view, View view2) {
        this.f2477d = xVar;
        this.f2474a = viewGroup;
        this.f2475b = view;
        this.f2476c = view2;
    }

    /* renamed from: b */
    public void mo2736b(C0592g gVar) {
        if (this.f2475b.getParent() == null) {
            this.f2474a.getOverlay().add(this.f2475b);
        } else {
            this.f2477d.cancel();
        }
    }

    /* renamed from: c */
    public void mo2737c(C0592g gVar) {
        this.f2474a.getOverlay().remove(this.f2475b);
    }

    /* renamed from: e */
    public void mo2739e(C0592g gVar) {
        this.f2476c.setTag(R.id.save_overlay_view, (Object) null);
        this.f2474a.getOverlay().remove(this.f2475b);
        gVar.mo2762A(this);
    }
}
