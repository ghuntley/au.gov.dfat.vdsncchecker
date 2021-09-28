package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f3078b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C0784a extends AnimatorListenerAdapter {
        public C0784a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f3078b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: t */
    public boolean mo4011t(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f3078b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet u = mo4013u(view, view2, z, z3);
        this.f3078b = u;
        u.addListener(new C0784a());
        this.f3078b.start();
        if (!z2) {
            this.f3078b.end();
        }
        return true;
    }

    /* renamed from: u */
    public abstract AnimatorSet mo4013u(View view, View view2, boolean z, boolean z2);
}
