package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0893e;
import p036f2.C0903k;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p083n1.C1455a;
import p096p2.C1578a;

public class ChipGroup extends C0893e {

    /* renamed from: i */
    public int f2726i;

    /* renamed from: j */
    public int f2727j;

    /* renamed from: k */
    public boolean f2728k;

    /* renamed from: l */
    public boolean f2729l;

    /* renamed from: m */
    public C0720d f2730m;

    /* renamed from: n */
    public final C0718b f2731n = new C0718b((C0717a) null);

    /* renamed from: o */
    public C0721e f2732o = new C0721e((C0717a) null);

    /* renamed from: p */
    public int f2733p = -1;

    /* renamed from: q */
    public boolean f2734q = false;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C0718b implements CompoundButton.OnCheckedChangeListener {
        public C0718b(C0717a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.f2734q) {
                if (chipGroup.getCheckedChipIds().isEmpty()) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.f2729l) {
                        chipGroup2.mo3479d(compoundButton.getId(), true);
                        ChipGroup.this.f2733p = compoundButton.getId();
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup3 = ChipGroup.this;
                    int i = chipGroup3.f2733p;
                    if (!(i == -1 || i == id || !chipGroup3.f2728k)) {
                        chipGroup3.mo3479d(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.f2733p == id) {
                    chipGroup4.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C0719c extends ViewGroup.MarginLayoutParams {
        public C0719c(int i, int i2) {
            super(i, i2);
        }

        public C0719c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0719c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C0720d {
        /* renamed from: a */
        void mo3508a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C0721e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f2736a;

        public C0721e(C0717a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    view2.setId(View.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo3477c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f2731n);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2736a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2736a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.chipGroupStyle, 2131952294), attributeSet, R.attr.chipGroupStyle);
        TypedArray d = C0903k.m2662d(getContext(), attributeSet, C1455a.f4566d, R.attr.chipGroupStyle, 2131952294, new int[0]);
        int dimensionPixelOffset = d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d.getBoolean(5, false));
        setSingleSelection(d.getBoolean(6, false));
        setSelectionRequired(d.getBoolean(4, false));
        int resourceId = d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f2733p = resourceId;
        }
        d.recycle();
        super.setOnHierarchyChangeListener(this.f2732o);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f2733p = i;
        C0720d dVar = this.f2730m;
        if (dVar != null && this.f2728k) {
            dVar.mo3508a(this, i);
        }
    }

    /* renamed from: a */
    public boolean mo3475a() {
        return this.f3403g;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f2733p;
                if (i2 != -1 && this.f2728k) {
                    mo3479d(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public void mo3477c(int i) {
        int i2 = this.f2733p;
        if (i != i2) {
            if (i2 != -1 && this.f2728k) {
                mo3479d(i2, false);
            }
            if (i != -1) {
                mo3479d(i, true);
            }
            setCheckedId(i);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0719c);
    }

    /* renamed from: d */
    public final void mo3479d(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f2734q = true;
            ((Chip) findViewById).setChecked(z);
            this.f2734q = false;
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0719c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0719c(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0719c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f2728k) {
            return this.f2733p;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f2728k) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f2726i;
    }

    public int getChipSpacingVertical() {
        return this.f2727j;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2733p;
        if (i != -1) {
            mo3479d(i, true);
            setCheckedId(this.f2733p);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1150b.C1152b.m3388a(getRowCount(), this.f3403g ? getChipCount() : -1, false, this.f2728k ? 1 : 2).f4020a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f2726i != i) {
            this.f2726i = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f2727j != i) {
            this.f2727j = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C0720d dVar) {
        this.f2730m = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2732o.f2736a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f2729l = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f2728k != z) {
            this.f2728k = z;
            this.f2734q = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f2734q = false;
            setCheckedId(-1);
        }
    }
}
