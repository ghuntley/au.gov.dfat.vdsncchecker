package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.a */
public class C0788a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f3096a;

    public C0788a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f3096a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3096a.invalidate();
    }
}
