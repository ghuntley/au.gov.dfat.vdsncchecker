package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0176k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C0734d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p024d2.C0796a;
import p030e2.C0868b;
import p030e2.C0869c;
import p036f2.C0892d;
import p036f2.C0909o;
import p058j0.C1061o;
import p058j0.C1070q;
import p066k2.C1196b;
import p072l2.C1247i;
import p072l2.C1261m;
import p083n1.C1455a;
import p084n2.C1456a;
import p089o1.C1500g;
import p089o1.C1503j;

public class FloatingActionButton extends C0909o implements C0796a, C1261m, CoordinatorLayout.C0248b {

    /* renamed from: f */
    public ColorStateList f2807f;

    /* renamed from: g */
    public PorterDuff.Mode f2808g;

    /* renamed from: h */
    public ColorStateList f2809h;

    /* renamed from: i */
    public PorterDuff.Mode f2810i;

    /* renamed from: j */
    public ColorStateList f2811j;

    /* renamed from: k */
    public int f2812k;

    /* renamed from: l */
    public int f2813l;

    /* renamed from: m */
    public int f2814m;

    /* renamed from: n */
    public boolean f2815n;

    /* renamed from: o */
    public C0734d f2816o;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0249c<T> {

        /* renamed from: a */
        public Rect f2817a;

        /* renamed from: b */
        public boolean f2818b;

        public BaseBehavior() {
            this.f2818b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4570h);
            this.f2818b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo1394a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        /* renamed from: c */
        public void mo1396c(CoordinatorLayout.C0252f fVar) {
            if (fVar.f1292h == 0) {
                fVar.f1292h = 80;
            }
        }

        /* renamed from: d */
        public boolean mo1397d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo3693t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0252f ? ((CoordinatorLayout.C0252f) layoutParams).f1285a instanceof BottomSheetBehavior : false) {
                    mo3694u(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: h */
        public boolean mo1401h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> e = coordinatorLayout.mo1342e(floatingActionButton);
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = e.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0252f ? ((CoordinatorLayout.C0252f) layoutParams).f1285a instanceof BottomSheetBehavior : false) && mo3694u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo3693t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1375r(floatingActionButton, i);
            return true;
        }

        /* renamed from: s */
        public final boolean mo3692s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0252f fVar = (CoordinatorLayout.C0252f) floatingActionButton.getLayoutParams();
            if (this.f2818b && fVar.f1290f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: t */
        public final boolean mo3693t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo3692s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f2817a == null) {
                this.f2817a = new Rect();
            }
            Rect rect = this.f2817a;
            C0892d.m2651a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo3644i((C0728a) null, false);
                return true;
            }
            floatingActionButton.mo3649m((C0728a) null, false);
            return true;
        }

        /* renamed from: u */
        public final boolean mo3694u(View view, FloatingActionButton floatingActionButton) {
            if (!mo3692s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0252f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo3644i((C0728a) null, false);
                return true;
            }
            floatingActionButton.mo3649m((C0728a) null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class C0728a {
        /* renamed from: a */
        public void mo3695a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo3696b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C0729b implements C1196b {
        public C0729b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C0730c<T extends FloatingActionButton> implements C0734d.C0739e {

        /* renamed from: a */
        public final C1503j<T> f2820a;

        public C0730c(C1503j<T> jVar) {
            this.f2820a = jVar;
        }

        /* renamed from: a */
        public void mo3697a() {
            this.f2820a.mo5419a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo3698b() {
            this.f2820a.mo5420b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0730c) && ((C0730c) obj).f2820a.equals(this.f2820a);
        }

        public int hashCode() {
            return this.f2820a.hashCode();
        }
    }

    private C0734d getImpl() {
        if (this.f2816o == null) {
            this.f2816o = new C0869c(this, new C0729b());
        }
        return this.f2816o;
    }

    /* renamed from: a */
    public boolean mo3617a() {
        throw null;
    }

    /* renamed from: d */
    public void mo3618d(Animator.AnimatorListener animatorListener) {
        C0734d impl = getImpl();
        if (impl.f2854q == null) {
            impl.f2854q = new ArrayList<>();
        }
        impl.f2854q.add((Object) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo3714i(getDrawableState());
    }

    /* renamed from: e */
    public void mo3620e(Animator.AnimatorListener animatorListener) {
        C0734d impl = getImpl();
        if (impl.f2853p == null) {
            impl.f2853p = new ArrayList<>();
        }
        impl.f2853p.add(animatorListener);
    }

    /* renamed from: f */
    public void mo3621f(C1503j<? extends FloatingActionButton> jVar) {
        C0734d impl = getImpl();
        C0730c cVar = new C0730c((C1503j) null);
        if (impl.f2855r == null) {
            impl.f2855r = new ArrayList<>();
        }
        impl.f2855r.add(cVar);
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo3622g(Rect rect) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public ColorStateList getBackgroundTintList() {
        return this.f2807f;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2808g;
    }

    public CoordinatorLayout.C0249c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo3708c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f2842e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f2843f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f2813l;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C1500g getHideMotionSpec() {
        return getImpl().f2849l;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f2811j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f2811j;
    }

    public C1247i getShapeAppearanceModel() {
        C1247i iVar = getImpl().f2838a;
        Objects.requireNonNull(iVar);
        return iVar;
    }

    public C1500g getShowMotionSpec() {
        return getImpl().f2848k;
    }

    public int getSize() {
        return this.f2812k;
    }

    public int getSizeDimension() {
        return mo3643h(this.f2812k);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f2809h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f2810i;
    }

    public boolean getUseCompatPadding() {
        return this.f2815n;
    }

    /* renamed from: h */
    public final int mo3643h(int i) {
        int i2 = this.f2813l;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? mo3643h(1) : mo3643h(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    /* renamed from: i */
    public void mo3644i(C0728a aVar, boolean z) {
        C0734d impl = getImpl();
        C0731a aVar2 = aVar == null ? null : new C0731a(this, aVar);
        if (!impl.mo3710e()) {
            Animator animator = impl.f2847j;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo3721p()) {
                C1500g gVar = impl.f2849l;
                if (gVar == null) {
                    if (impl.f2846i == null) {
                        impl.f2846i = C1500g.m4195b(impl.f2856s.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f2846i;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet a = impl.mo3706a(gVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C0732b(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2854q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f2856s.mo4231b(z ? 8 : 4, z);
            if (aVar2 != null) {
                aVar2.f2822a.mo3695a(aVar2.f2823b);
            }
        }
    }

    /* renamed from: j */
    public boolean mo3645j() {
        return getImpl().mo3710e();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo3712g();
    }

    /* renamed from: k */
    public boolean mo3647k() {
        return getImpl().mo3711f();
    }

    /* renamed from: l */
    public final void mo3648l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f2809h;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f2810i;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0176k.m497c(colorForState, mode));
        }
    }

    /* renamed from: m */
    public void mo3649m(C0728a aVar, boolean z) {
        C0734d impl = getImpl();
        C0731a aVar2 = aVar == null ? null : new C0731a(this, aVar);
        if (!impl.mo3711f()) {
            Animator animator = impl.f2847j;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo3721p()) {
                if (impl.f2856s.getVisibility() != 0) {
                    impl.f2856s.setAlpha(0.0f);
                    impl.f2856s.setScaleY(0.0f);
                    impl.f2856s.setScaleX(0.0f);
                    impl.mo3718m(0.0f);
                }
                C1500g gVar = impl.f2848k;
                if (gVar == null) {
                    if (impl.f2845h == null) {
                        impl.f2845h = C1500g.m4195b(impl.f2856s.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.f2845h;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet a = impl.mo3706a(gVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C0733c(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2853p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f2856s.mo4231b(0, z);
            impl.f2856s.setAlpha(1.0f);
            impl.f2856s.setScaleY(1.0f);
            impl.f2856s.setScaleX(1.0f);
            impl.mo3718m(1.0f);
            if (aVar2 != null) {
                aVar2.f2822a.mo3696b(aVar2.f2823b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0734d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof C0869c)) {
            ViewTreeObserver viewTreeObserver = impl.f2856s.getViewTreeObserver();
            if (impl.f2860w == null) {
                impl.f2860w = new C0868b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f2860w);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0734d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f2856s.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f2860w;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f2860w = null;
        }
    }

    public void onMeasure(int i, int i2) {
        this.f2814m = (getSizeDimension() + 0) / 2;
        getImpl().mo3724s();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1456a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1456a aVar = (C1456a) parcelable;
        super.onRestoreInstanceState(aVar.f4651e);
        Bundle orDefault = aVar.f4589g.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            mo3622g((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2807f != colorStateList) {
            this.f2807f = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2808g != mode) {
            this.f2808g = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f) {
        C0734d impl = getImpl();
        if (impl.f2841d != f) {
            impl.f2841d = f;
            impl.mo3715j(f, impl.f2842e, impl.f2843f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C0734d impl = getImpl();
        if (impl.f2842e != f) {
            impl.f2842e = f;
            impl.mo3715j(impl.f2841d, f, impl.f2843f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C0734d impl = getImpl();
        if (impl.f2843f != f) {
            impl.f2843f = f;
            impl.mo3715j(impl.f2841d, impl.f2842e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f2813l) {
            this.f2813l = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f2839b) {
            getImpl().f2839b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C1500g gVar) {
        getImpl().f2849l = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C0734d impl = getImpl();
            impl.mo3718m(impl.f2851n);
            if (this.f2809h != null) {
                mo3648l();
            }
        }
    }

    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f2811j != colorStateList) {
            this.f2811j = colorStateList;
            getImpl().mo3719n(this.f2811j);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo3716k();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo3716k();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C0734d impl = getImpl();
        impl.f2840c = z;
        impl.mo3724s();
        throw null;
    }

    public void setShapeAppearanceModel(C1247i iVar) {
        getImpl().f2838a = iVar;
    }

    public void setShowMotionSpec(C1500g gVar) {
        getImpl().f2848k = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setSize(int i) {
        this.f2813l = 0;
        if (i != this.f2812k) {
            this.f2812k = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2809h != colorStateList) {
            this.f2809h = colorStateList;
            mo3648l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f2810i != mode) {
            this.f2810i = mode;
            mo3648l();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo3717l();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo3717l();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo3717l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2815n != z) {
            this.f2815n = z;
            getImpl().mo3713h();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
