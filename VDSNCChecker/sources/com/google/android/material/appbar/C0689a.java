package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.a */
public class C0689a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f2560a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f2561b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2562c;

    public C0689a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f2562c = baseBehavior;
        this.f2560a = coordinatorLayout;
        this.f2561b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2562c.mo5674x(this.f2560a, this.f2561b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
