package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p036f2.C0906n;
import p042g2.C0955a;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;
import p088o0.C1491a;
import p089o1.C1503j;
import p107r1.C1674a;
import p107r1.C1675b;
import p107r1.C1677c;
import p107r1.C1678d;
import p107r1.C1680f;
import p107r1.C1681g;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0248b {

    /* renamed from: d0 */
    public static final /* synthetic */ int f2588d0 = 0;

    /* renamed from: R */
    public Animator f2589R;

    /* renamed from: S */
    public Animator f2590S;

    /* renamed from: T */
    public int f2591T;

    /* renamed from: U */
    public int f2592U;

    /* renamed from: V */
    public boolean f2593V;

    /* renamed from: W */
    public int f2594W;

    /* renamed from: a0 */
    public int f2595a0;

    /* renamed from: b0 */
    public boolean f2596b0;

    /* renamed from: c0 */
    public Behavior f2597c0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f2598e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f2599f;

        /* renamed from: g */
        public int f2600g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f2601h = new C0695a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C0695a implements View.OnLayoutChangeListener {
            public C0695a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (((BottomAppBar) Behavior.this.f2599f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f2598e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: h */
        public boolean mo1401h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f2599f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f2588d0;
            View y = bottomAppBar.mo3203y();
            if (y != null) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (!y.isLaidOut()) {
                    CoordinatorLayout.C0252f fVar = (CoordinatorLayout.C0252f) y.getLayoutParams();
                    fVar.f1288d = 49;
                    this.f2600g = fVar.bottomMargin;
                    if (y instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) y;
                        floatingActionButton.addOnLayoutChangeListener(this.f2601h);
                        floatingActionButton.mo3618d((Animator.AnimatorListener) null);
                        floatingActionButton.mo3620e(new C1680f(bottomAppBar));
                        floatingActionButton.mo3621f((C1503j<? extends FloatingActionButton>) null);
                    }
                    bottomAppBar.mo3184C();
                    throw null;
                }
            }
            coordinatorLayout.mo1375r(bottomAppBar, i);
            this.f2570a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        /* renamed from: p */
        public boolean mo1409p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C0696a extends C1491a {
        public static final Parcelable.Creator<C0696a> CREATOR = new C0697a();

        /* renamed from: g */
        public int f2603g;

        /* renamed from: h */
        public boolean f2604h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class C0697a implements Parcelable.ClassLoaderCreator<C0696a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0696a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0696a[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0696a(parcel, classLoader);
            }
        }

        public C0696a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2603g = parcel.readInt();
            this.f2604h = parcel.readInt() != 0;
        }

        public C0696a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeInt(this.f2603g);
            parcel.writeInt(this.f2604h ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return mo3182A(this.f2591T);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f5124g;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private C1681g getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: w */
    public static void m2093w(BottomAppBar bottomAppBar) {
        bottomAppBar.f2594W--;
    }

    /* renamed from: A */
    public final float mo3182A(int i) {
        boolean a = C0906n.m2664a(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (a) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: B */
    public final boolean mo3183B() {
        FloatingActionButton x = mo3202x();
        return x != null && x.mo3647k();
    }

    /* renamed from: C */
    public final void mo3184C() {
        getTopEdgeTreatment().f5125h = getFabTranslationX();
        mo3203y();
        if (this.f2596b0) {
            boolean B = mo3183B();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f2597c0 == null) {
            this.f2597c0 = new Behavior();
        }
        return this.f2597c0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f5124g;
    }

    public int getFabAlignmentMode() {
        return this.f2591T;
    }

    public int getFabAnimationMode() {
        return this.f2592U;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f5123f;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f5122e;
    }

    public boolean getHideOnScroll() {
        return this.f2593V;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0955a.m2721B(this, (C1242f) null);
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f2590S;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f2589R;
            if (animator2 != null) {
                animator2.cancel();
            }
            mo3184C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f2590S == null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo3183B()) {
                i5 = mo3204z(actionMenuView, 0, false);
            } else {
                i5 = mo3204z(actionMenuView, this.f2591T, this.f2596b0);
            }
            actionMenuView.setTranslationX((float) i5);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0696a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0696a aVar = (C0696a) parcelable;
        super.onRestoreInstanceState(aVar.f4651e);
        this.f2591T = aVar.f2603g;
        this.f2596b0 = aVar.f2604h;
    }

    public Parcelable onSaveInstanceState() {
        C0696a aVar = new C0696a(super.onSaveInstanceState());
        aVar.f2603g = this.f2591T;
        aVar.f2604h = this.f2596b0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C1681g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f >= 0.0f) {
                topEdgeTreatment.f5124g = f;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        this.f2595a0 = 0;
        boolean z = this.f2596b0;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (!isLaidOut()) {
            int i3 = this.f2595a0;
            if (i3 != 0) {
                this.f2595a0 = 0;
                getMenu().clear();
                mo666n(i3);
            }
        } else {
            Animator animator = this.f2590S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!mo3183B()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) mo3204z(actionMenuView, i2, z))) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat2.addListener(new C1678d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f2590S = animatorSet2;
            animatorSet2.addListener(new C1677c(this));
            this.f2590S.start();
        }
        if (this.f2591T != i && isLaidOut()) {
            Animator animator2 = this.f2589R;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f2592U == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mo3202x(), "translationX", new float[]{mo3182A(i)});
                ofFloat3.setDuration(300);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton x = mo3202x();
                if (x != null && !x.mo3645j()) {
                    this.f2594W++;
                    x.mo3644i(new C1675b(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f2589R = animatorSet3;
            animatorSet3.addListener(new C1674a(this));
            this.f2589R.start();
        }
        this.f2591T = i;
    }

    public void setFabAnimationMode(int i) {
        this.f2592U = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().f5126i) {
            getTopEdgeTreatment().f5126i = f;
            throw null;
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f5123f = f;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f5122e = f;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f2593V = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: x */
    public final FloatingActionButton mo3202x() {
        View y = mo3203y();
        if (y instanceof FloatingActionButton) {
            return (FloatingActionButton) y;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo3203y() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo1343f(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo3203y():android.view.View");
    }

    /* renamed from: z */
    public int mo3204z(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean a = C0906n.m2664a(this);
        int measuredWidth = a ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0124e) && (((Toolbar.C0124e) childAt.getLayoutParams()).f3535a & 8388615) == 8388611) {
                measuredWidth = a ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((a ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }
}
