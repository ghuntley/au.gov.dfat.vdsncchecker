package p101q1;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1158d;

/* renamed from: q1.a */
public class C1603a implements C1158d {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f4982a;

    public C1603a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4982a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public boolean mo3169a(View view, C1158d.C1159a aVar) {
        boolean z = false;
        if (!this.f4982a.mo3172s(view)) {
            return false;
        }
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = this.f4982a.f2577c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f4982a);
        return true;
    }
}
