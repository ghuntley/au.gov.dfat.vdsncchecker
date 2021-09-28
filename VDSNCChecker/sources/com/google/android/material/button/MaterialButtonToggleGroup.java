package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0903k;
import p036f2.C0906n;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p072l2.C1237a;
import p072l2.C1239c;
import p072l2.C1247i;
import p083n1.C1455a;
import p096p2.C1578a;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f2685o = 0;

    /* renamed from: e */
    public final List<C0712d> f2686e = new ArrayList();

    /* renamed from: f */
    public final C0711c f2687f = new C0711c((C0709a) null);

    /* renamed from: g */
    public final C0714f f2688g = new C0714f((C0709a) null);

    /* renamed from: h */
    public final LinkedHashSet<C0713e> f2689h = new LinkedHashSet<>();

    /* renamed from: i */
    public final Comparator<MaterialButton> f2690i = new C0709a();

    /* renamed from: j */
    public Integer[] f2691j;

    /* renamed from: k */
    public boolean f2692k = false;

    /* renamed from: l */
    public boolean f2693l;

    /* renamed from: m */
    public boolean f2694m;

    /* renamed from: n */
    public int f2695n;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C0709a implements Comparator<MaterialButton> {
        public C0709a() {
        }

        public int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C0710b extends C1043a {
        public C0710b() {
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i = MaterialButtonToggleGroup.f2685o;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.mo3305d(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                }
            }
            bVar.mo4769j(C1150b.C1153c.m3389a(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public class C0711c implements MaterialButton.C0705a {
        public C0711c(C0709a aVar) {
        }

        /* renamed from: a */
        public void mo3297a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (!materialButtonToggleGroup.f2692k) {
                if (materialButtonToggleGroup.f2693l) {
                    materialButtonToggleGroup.f2695n = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.mo3308f(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.mo3303b(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public static class C0712d {

        /* renamed from: e */
        public static final C1239c f2699e = new C1237a(0.0f);

        /* renamed from: a */
        public C1239c f2700a;

        /* renamed from: b */
        public C1239c f2701b;

        /* renamed from: c */
        public C1239c f2702c;

        /* renamed from: d */
        public C1239c f2703d;

        public C0712d(C1239c cVar, C1239c cVar2, C1239c cVar3, C1239c cVar4) {
            this.f2700a = cVar;
            this.f2701b = cVar3;
            this.f2702c = cVar4;
            this.f2703d = cVar2;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C0713e {
        /* renamed from: a */
        void mo3322a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    public class C0714f implements MaterialButton.C0706b {
        public C0714f(C0709a aVar) {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952308), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d = C0903k.m2662d(getContext(), attributeSet, C1455a.f4576n, R.attr.materialButtonToggleGroupStyle, 2131952308, new int[0]);
        setSingleSelection(d.getBoolean(2, false));
        this.f2695n = d.getResourceId(0, -1);
        this.f2694m = d.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d.recycle();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo3305d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (mo3305d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo3305d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f2695n = i;
        mo3303b(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f2672h.add(this.f2687f);
        materialButton.setOnPressedChangeListenerInternal(this.f2688g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void mo3301a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton c = mo3304c(i);
                int min = Math.min(c.getStrokeWidth(), mo3304c(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                c.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                mo3308f(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            C1247i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f2686e.add(new C0712d(shapeAppearanceModel.f4214e, shapeAppearanceModel.f4217h, shapeAppearanceModel.f4215f, shapeAppearanceModel.f4216g));
            C1061o.m3034o(materialButton, new C0710b());
        }
    }

    /* renamed from: b */
    public final void mo3303b(int i, boolean z) {
        Iterator it = this.f2689h.iterator();
        while (it.hasNext()) {
            ((C0713e) it.next()).mo3322a(this, i, z);
        }
    }

    /* renamed from: c */
    public final MaterialButton mo3304c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: d */
    public final boolean mo3305d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2690i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(mo3304c(i), Integer.valueOf(i));
        }
        this.f2691j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void mo3307e(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f2692k = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f2692k = false;
        }
    }

    /* renamed from: f */
    public final boolean mo3308f(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f2694m || !checkedButtonIds.isEmpty()) {
            if (z && this.f2693l) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    mo3307e(intValue2, false);
                    mo3303b(intValue2, false);
                }
            }
            return true;
        }
        mo3307e(i, true);
        this.f2695n = i;
        return false;
    }

    /* renamed from: g */
    public void mo3309g() {
        C0712d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c = mo3304c(i);
            if (c.getVisibility() != 8) {
                C1247i shapeAppearanceModel = c.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                C1247i.C1249b bVar = new C1247i.C1249b(shapeAppearanceModel);
                C0712d dVar2 = this.f2686e.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            C1239c cVar = dVar2.f2700a;
                            C1239c cVar2 = C0712d.f2699e;
                            dVar = new C0712d(cVar, cVar2, dVar2.f2701b, cVar2);
                        } else if (C0906n.m2664a(this)) {
                            C1239c cVar3 = C0712d.f2699e;
                            dVar = new C0712d(cVar3, cVar3, dVar2.f2701b, dVar2.f2702c);
                        } else {
                            C1239c cVar4 = dVar2.f2700a;
                            C1239c cVar5 = dVar2.f2703d;
                            C1239c cVar6 = C0712d.f2699e;
                            dVar = new C0712d(cVar4, cVar5, cVar6, cVar6);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        C1239c cVar7 = C0712d.f2699e;
                        dVar = new C0712d(cVar7, dVar2.f2703d, cVar7, dVar2.f2702c);
                    } else if (C0906n.m2664a(this)) {
                        C1239c cVar8 = dVar2.f2700a;
                        C1239c cVar9 = dVar2.f2703d;
                        C1239c cVar10 = C0712d.f2699e;
                        dVar = new C0712d(cVar8, cVar9, cVar10, cVar10);
                    } else {
                        C1239c cVar11 = C0712d.f2699e;
                        dVar = new C0712d(cVar11, cVar11, dVar2.f2701b, dVar2.f2702c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    bVar.mo4992c(0.0f);
                } else {
                    bVar.f4226e = dVar2.f2700a;
                    bVar.f4229h = dVar2.f2703d;
                    bVar.f4227f = dVar2.f2701b;
                    bVar.f4228g = dVar2.f2702c;
                }
                c.setShapeAppearanceModel(bVar.mo4991a());
            }
        }
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f2693l) {
            return this.f2695n;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton c = mo3304c(i);
            if (c.isChecked()) {
                arrayList.add(Integer.valueOf(c.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f2691j;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.f2695n;
        if (i != -1 && (materialButton = (MaterialButton) findViewById(i)) != null) {
            materialButton.setChecked(true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1150b.C1152b.m3388a(1, getVisibleButtonCount(), false, this.f2693l ? 1 : 2).f4020a);
    }

    public void onMeasure(int i, int i2) {
        mo3309g();
        mo3301a();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f2672h.remove(this.f2687f);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.C0706b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2686e.remove(indexOfChild);
        }
        mo3309g();
        mo3301a();
    }

    public void setSelectionRequired(boolean z) {
        this.f2694m = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f2693l != z) {
            this.f2693l = z;
            this.f2692k = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton c = mo3304c(i);
                c.setChecked(false);
                mo3303b(c.getId(), false);
            }
            this.f2692k = false;
            setCheckedId(-1);
        }
    }
}
