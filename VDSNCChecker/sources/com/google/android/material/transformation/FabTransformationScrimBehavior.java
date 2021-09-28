package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p089o1.C1501h;
import p136w0.C2036r;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C1501h f3091c = new C1501h(75, 150);

    /* renamed from: d */
    public final C1501h f3092d = new C1501h(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0787a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f3093a;

        /* renamed from: b */
        public final /* synthetic */ View f3094b;

        public C0787a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f3093a = z;
            this.f3094b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f3093a) {
                this.f3094b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f3093a) {
                this.f3094b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo1395b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: r */
    public boolean mo1411r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: u */
    public AnimatorSet mo4013u(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C1501h hVar = z ? this.f3091c : this.f3092d;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.mo5414a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        C2036r.m5372j(animatorSet, arrayList);
        animatorSet.addListener(new C0787a(this, z, view2));
        return animatorSet;
    }
}
