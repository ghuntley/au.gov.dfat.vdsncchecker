package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p007au.gov.dfat.vdsncchecker.R;
import p016c0.C0559c;
import p058j0.C1061o;
import p058j0.C1076u;
import p063k.C1142f;
import p100q0.C1602a;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: e */
    public ArrayList<View> f1351e;

    /* renamed from: f */
    public ArrayList<View> f1352f;

    /* renamed from: g */
    public View.OnApplyWindowInsetsListener f1353g;

    /* renamed from: h */
    public boolean f1354h = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1602a.f4981b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    /* renamed from: a */
    public final void mo1514a(View view) {
        ArrayList<View> arrayList = this.f1352f;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1351e == null) {
                this.f1351e = new ArrayList<>();
            }
            this.f1351e.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C0286k ? (C0286k) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C0286k ? (C0286k) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1076u i = C1076u.m3059i(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1353g;
        C1076u h = onApplyWindowInsetsListener != null ? C1076u.m3058h(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C1061o.m3029j(this, i);
        if (!h.mo4561f()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C1061o.m3022c(getChildAt(i2), h);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f1354h && this.f1351e != null) {
            for (int i = 0; i < this.f1351e.size(); i++) {
                super.drawChild(canvas, this.f1351e.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f1354h || (arrayList = this.f1351e) == null || arrayList.size() <= 0 || !this.f1351e.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1352f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1351e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1354h = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            mo1514a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            mo1514a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        mo1514a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        mo1514a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        mo1514a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo1514a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo1514a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1354h = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1353g = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1352f == null) {
                this.f1352f = new ArrayList<>();
            }
            this.f1352f.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, C0302r rVar) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1602a.f4981b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C0286k H = rVar.mo1681H(id);
        if (classAttribute != null && H == null) {
            if (id <= 0) {
                throw new IllegalStateException(C0559c.m1823a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? C1142f.m3365a(" with tag ", string) : ""));
            }
            C0286k a = rVar.mo1684K().mo1659a(context.getClassLoader(), classAttribute);
            a.mo1595N(context, attributeSet, (Bundle) null);
            C0262a aVar = new C0262a(rVar);
            aVar.f1602p = true;
            a.f1440I = this;
            aVar.mo1537f(getId(), a, string, 1);
            if (!aVar.f1593g) {
                aVar.f1594h = false;
                aVar.f1355q.mo1677D(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) rVar.f1532c.mo5825f()).iterator();
        while (it.hasNext()) {
            C0321t tVar = (C0321t) it.next();
            C0286k kVar = tVar.f1583c;
            if (kVar.f1432A == getId() && (view = kVar.f1441J) != null && view.getParent() == null) {
                kVar.f1440I = this;
                tVar.mo1754b();
            }
        }
    }
}
