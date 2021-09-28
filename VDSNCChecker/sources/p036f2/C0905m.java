package p036f2;

import android.view.View;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: f2.m */
public final class C0905m implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
