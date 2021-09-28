package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.h */
public class C0452h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0422z f2104a;

    /* renamed from: b */
    public final /* synthetic */ View f2105b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f2106c;

    /* renamed from: d */
    public final /* synthetic */ C0456l f2107d;

    public C0452h(C0456l lVar, RecyclerView.C0422z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2107d = lVar;
        this.f2104a = zVar;
        this.f2105b = view;
        this.f2106c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2105b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f2106c.setListener((Animator.AnimatorListener) null);
        this.f2107d.mo2139c(this.f2104a);
        this.f2107d.f2130o.remove(this.f2104a);
        this.f2107d.mo2389k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2107d);
    }
}
