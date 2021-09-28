package p090o2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0151e;
import androidx.appcompat.widget.C0189o0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0903k;
import p083n1.C1455a;
import p096p2.C1578a;

/* renamed from: o2.n */
public class C1518n extends C0151e {

    /* renamed from: h */
    public final C0189o0 f4713h;

    /* renamed from: i */
    public final AccessibilityManager f4714i;

    /* renamed from: j */
    public final Rect f4715j = new Rect();

    public C1518n(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d = C0903k.m2662d(context2, attributeSet, C1455a.f4574l, R.attr.autoCompleteTextViewStyle, 2131952180, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f4714i = (AccessibilityManager) context2.getSystemService("accessibility");
        C0189o0 o0Var = new C0189o0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f4713h = o0Var;
        o0Var.mo1084s(true);
        o0Var.f888s = this;
        o0Var.f873C.setInputMethodMode(2);
        o0Var.mo1081o(getAdapter());
        o0Var.f889t = new C1517m(this);
        d.recycle();
    }

    /* renamed from: a */
    public static void m4219a(C1518n nVar, Object obj) {
        nVar.setText(nVar.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout mo5445b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = mo5445b();
        return (b == null || !b.f2904G) ? super.getHint() : b.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = mo5445b();
        if (b != null && b.f2904G && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = mo5445b();
            int i3 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0189o0 o0Var = this.f4713h;
                int min = Math.min(adapter.getCount(), Math.max(0, !o0Var.mo202b() ? -1 : o0Var.f876g.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable i5 = this.f4713h.mo1078i();
                if (i5 != null) {
                    i5.getPadding(this.f4715j);
                    Rect rect = this.f4715j;
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4713h.mo1081o(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f4714i;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f4713h.mo205f();
        }
    }
}
