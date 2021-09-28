package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p142x1.C2118d;

/* renamed from: com.google.android.material.transformation.c */
public class C0790c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C2118d f3099a;

    public C0790c(FabTransformationBehavior fabTransformationBehavior, C2118d dVar) {
        this.f3099a = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        C2118d.C2123e revealInfo = this.f3099a.getRevealInfo();
        revealInfo.f6154c = Float.MAX_VALUE;
        this.f3099a.setRevealInfo(revealInfo);
    }
}
