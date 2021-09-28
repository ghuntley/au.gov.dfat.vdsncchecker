package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p089o1.C1494a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0249c<V> {

    /* renamed from: a */
    public int f2570a = 0;

    /* renamed from: b */
    public int f2571b = 2;

    /* renamed from: c */
    public int f2572c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f2573d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C0692a extends AnimatorListenerAdapter {
        public C0692a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2573d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: h */
    public boolean mo1401h(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f2570a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    /* renamed from: l */
    public void mo1405l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f2571b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2573d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f2571b = 1;
                mo3170s(v, this.f2570a + this.f2572c, 175, C1494a.f4654c);
            }
        } else if (i2 < 0 && this.f2571b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f2573d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f2571b = 2;
            mo3170s(v, 0, 225, C1494a.f4655d);
        }
    }

    /* renamed from: p */
    public boolean mo1409p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: s */
    public final void mo3170s(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f2573d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0692a());
    }
}
