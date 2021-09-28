package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0084j;
import androidx.appcompat.widget.C0156e1;
import androidx.appcompat.widget.C0184m0;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p010b0.C0533b;
import p036f2.C0894f;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;

public class NavigationMenuItemView extends C0894f implements C0084j.C0085a {

    /* renamed from: J */
    public static final int[] f2873J = {16842912};

    /* renamed from: A */
    public boolean f2874A;

    /* renamed from: B */
    public boolean f2875B;

    /* renamed from: C */
    public final CheckedTextView f2876C;

    /* renamed from: D */
    public FrameLayout f2877D;

    /* renamed from: E */
    public C0078g f2878E;

    /* renamed from: F */
    public ColorStateList f2879F;

    /* renamed from: G */
    public boolean f2880G;

    /* renamed from: H */
    public Drawable f2881H;

    /* renamed from: I */
    public final C1043a f2882I;

    /* renamed from: z */
    public int f2883z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C0745a extends C1043a {
        public C0745a() {
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
            bVar.f4005a.setCheckable(NavigationMenuItemView.this.f2875B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0745a aVar = new C0745a();
        this.f2882I = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f2876C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1061o.m3034o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2877D == null) {
                this.f2877D = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f2877D.removeAllViews();
            this.f2877D.addView(view);
        }
    }

    /* renamed from: d */
    public void mo163d(C0078g gVar, int i) {
        int i2;
        C0184m0.C0185a aVar;
        StateListDrawable stateListDrawable;
        this.f2878E = gVar;
        int i3 = gVar.f387a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2873J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            setBackground(stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f391e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f403q);
        C0156e1.m441a(this, gVar.f404r);
        C0078g gVar2 = this.f2878E;
        if (!(gVar2.f391e == null && gVar2.getIcon() == null && this.f2878E.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f2876C.setVisibility(8);
            FrameLayout frameLayout = this.f2877D;
            if (frameLayout != null) {
                aVar = (C0184m0.C0185a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.f2876C.setVisibility(0);
            FrameLayout frameLayout2 = this.f2877D;
            if (frameLayout2 != null) {
                aVar = (C0184m0.C0185a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        aVar.width = i2;
        this.f2877D.setLayoutParams(aVar);
    }

    public C0078g getItemData() {
        return this.f2878E;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0078g gVar = this.f2878E;
        if (gVar != null && gVar.isCheckable() && this.f2878E.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f2873J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f2875B != z) {
            this.f2875B = z;
            this.f2882I.mo2448h(this.f2876C, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f2876C.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2880G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f2879F);
            }
            int i = this.f2883z;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2874A) {
            if (this.f2881H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C0533b.f2319a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.f2881H = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f2883z;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2881H;
        }
        this.f2876C.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f2876C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2883z = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2879F = colorStateList;
        this.f2880G = colorStateList != null;
        C0078g gVar = this.f2878E;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2876C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f2874A = z;
    }

    public void setTextAppearance(int i) {
        this.f2876C.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2876C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2876C.setText(charSequence);
    }
}
