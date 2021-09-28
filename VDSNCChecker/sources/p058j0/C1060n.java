package p058j0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: j0.n */
public final class C1060n implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e */
    public final View f3805e;

    /* renamed from: f */
    public ViewTreeObserver f3806f;

    /* renamed from: g */
    public final Runnable f3807g;

    public C1060n(View view, Runnable runnable) {
        this.f3805e = view;
        this.f3806f = view.getViewTreeObserver();
        this.f3807g = runnable;
    }

    /* renamed from: a */
    public static C1060n m3018a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        C1060n nVar = new C1060n(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(nVar);
        view.addOnAttachStateChangeListener(nVar);
        return nVar;
    }

    /* renamed from: b */
    public void mo4537b() {
        (this.f3806f.isAlive() ? this.f3806f : this.f3805e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3805e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo4537b();
        this.f3807g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3806f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo4537b();
    }
}
