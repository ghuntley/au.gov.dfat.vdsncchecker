package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.WeakHashMap;
import p036f2.C0892d;
import p058j0.C1061o;
import p058j0.C1070q;
import p083n1.C1455a;
import p089o1.C1500g;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0248b {

    /* renamed from: w */
    public static final /* synthetic */ int f2802w = 0;

    /* renamed from: v */
    public boolean f2803v;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0249c<T> {

        /* renamed from: a */
        public Rect f2804a;

        /* renamed from: b */
        public boolean f2805b;

        /* renamed from: c */
        public boolean f2806c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f2805b = false;
            this.f2806c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4569g);
            this.f2805b = obtainStyledAttributes.getBoolean(0, false);
            this.f2806c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1394a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        /* renamed from: c */
        public void mo1396c(CoordinatorLayout.C0252f fVar) {
            if (fVar.f1292h == 0) {
                fVar.f1292h = 80;
            }
        }

        /* renamed from: d */
        public boolean mo1397d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo3607t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0252f ? ((CoordinatorLayout.C0252f) layoutParams).f1285a instanceof BottomSheetBehavior : false) {
                    mo3608u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: h */
        public boolean mo1401h(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> e = coordinatorLayout.mo1342e(extendedFloatingActionButton);
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = e.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0252f ? ((CoordinatorLayout.C0252f) layoutParams).f1285a instanceof BottomSheetBehavior : false) && mo3608u(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo3607t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1375r(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: s */
        public final boolean mo3606s(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0252f fVar = (CoordinatorLayout.C0252f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f2805b || this.f2806c) && fVar.f1290f == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: t */
        public final boolean mo3607t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo3606s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f2804a == null) {
                this.f2804a = new Rect();
            }
            Rect rect = this.f2804a;
            C0892d.m2651a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i = ExtendedFloatingActionButton.f2802w;
                throw null;
            }
            int i2 = ExtendedFloatingActionButton.f2802w;
            throw null;
        }

        /* renamed from: u */
        public final boolean mo3608u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo3606s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0252f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                int i = ExtendedFloatingActionButton.f2802w;
                throw null;
            }
            int i2 = ExtendedFloatingActionButton.f2802w;
            throw null;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C0724a extends Property<View, Float> {
        public C0724a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C0725b extends Property<View, Float> {
        public C0725b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static class C0726c extends Property<View, Float> {
        public C0726c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return Float.valueOf((float) ((View) obj).getPaddingStart());
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.setPaddingRelative(intValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static class C0727d extends Property<View, Float> {
        public C0727d(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return Float.valueOf((float) ((View) obj).getPaddingEnd());
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        Class<Float> cls = Float.class;
        new C0724a(cls, "width");
        new C0725b(cls, "height");
        new C0726c(cls, "paddingStart");
        new C0727d(cls, "paddingEnd");
    }

    public CoordinatorLayout.C0249c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public C1500g getExtendMotionSpec() {
        throw null;
    }

    public C1500g getHideMotionSpec() {
        throw null;
    }

    public C1500g getShowMotionSpec() {
        throw null;
    }

    public C1500g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f2803v = z;
    }

    public void setExtendMotionSpec(C1500g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C1500g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setShowMotionSpec(C1500g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setShrinkMotionSpec(C1500g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1500g.m4195b(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
