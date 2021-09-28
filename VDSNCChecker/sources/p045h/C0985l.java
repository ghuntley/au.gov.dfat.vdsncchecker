package p045h;

import android.view.View;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1073r;
import p058j0.C1074s;

/* renamed from: h.l */
public class C0985l extends C1074s {

    /* renamed from: a */
    public final /* synthetic */ C0968h f3631a;

    public C0985l(C0968h hVar) {
        this.f3631a = hVar;
    }

    /* renamed from: a */
    public void mo739a(View view) {
        this.f3631a.f3588s.setAlpha(1.0f);
        this.f3631a.f3591v.mo4548d((C1073r) null);
        this.f3631a.f3591v = null;
    }

    /* renamed from: b */
    public void mo740b(View view) {
        this.f3631a.f3588s.setVisibility(0);
        this.f3631a.f3588s.sendAccessibilityEvent(32);
        if (this.f3631a.f3588s.getParent() instanceof View) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            ((View) this.f3631a.f3588s.getParent()).requestApplyInsets();
        }
    }
}
