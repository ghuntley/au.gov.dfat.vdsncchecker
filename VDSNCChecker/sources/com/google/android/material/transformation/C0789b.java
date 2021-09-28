package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import p142x1.C2118d;

/* renamed from: com.google.android.material.transformation.b */
public class C0789b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C2118d f3097a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f3098b;

    public C0789b(FabTransformationBehavior fabTransformationBehavior, C2118d dVar, Drawable drawable) {
        this.f3097a = dVar;
        this.f3098b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3097a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f3097a.setCircularRevealOverlayDrawable(this.f3098b);
    }
}
