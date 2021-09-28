package p030e2;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C0734d;

/* renamed from: e2.b */
public class C0868b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e */
    public final /* synthetic */ C0734d f3325e;

    public C0868b(C0734d dVar) {
        this.f3325e = dVar;
    }

    public boolean onPreDraw() {
        C0734d dVar = this.f3325e;
        float rotation = dVar.f2856s.getRotation();
        if (dVar.f2850m == rotation) {
            return true;
        }
        dVar.f2850m = rotation;
        dVar.mo3723r();
        return true;
    }
}
