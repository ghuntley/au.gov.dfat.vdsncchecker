package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p018c2.C0624a;
import p036f2.C0903k;
import p042g2.C0955a;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;
import p083n1.C1455a;
import p096p2.C1578a;
import p136w0.C2036r;

public class MaterialToolbar extends Toolbar {

    /* renamed from: R */
    public Integer f2557R;

    /* renamed from: S */
    public boolean f2558S;

    /* renamed from: T */
    public boolean f2559T;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.toolbarStyle, 2131952370), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i = 0;
        TypedArray d = C0903k.m2662d(context2, attributeSet, C1455a.f4584v, R.attr.toolbarStyle, 2131952370, new int[0]);
        if (d.hasValue(0)) {
            setNavigationIconTint(d.getColor(0, -1));
        }
        this.f2558S = d.getBoolean(2, false);
        this.f2559T = d.getBoolean(1, false);
        d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1242f fVar = new C1242f();
            fVar.mo4976p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i));
            fVar.f4164e.f4188b = new C0624a(context2);
            fVar.mo4984w();
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            fVar.mo4974o(getElevation());
            setBackground(fVar);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1242f) {
            C0955a.m2721B(this, (C1242f) background);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2558S || this.f2559T) {
            TextView f = C2036r.m5368f(this, getTitle());
            TextView f2 = C2036r.m5368f(this, getSubtitle());
            if (f != null || f2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (!(childAt.getVisibility() == 8 || childAt == f || childAt == f2)) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2558S && f != null) {
                    mo3167w(f, pair);
                }
                if (this.f2559T && f2 != null) {
                    mo3167w(f2, pair);
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C0955a.m2720A(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.f2557R) == null)) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f2557R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f2559T != z) {
            this.f2559T = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f2558S != z) {
            this.f2558S = z;
            requestLayout();
        }
    }

    /* renamed from: w */
    public final void mo3167w(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, EnumBarcodeFormat.BF_MICRO_QR), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }
}
