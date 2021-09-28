package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p007au.gov.dfat.vdsncchecker.R;
import p076m0.C1421b;
import p076m0.C1423d;

/* renamed from: androidx.appcompat.widget.g */
public class C0162g extends Button implements C1421b {

    /* renamed from: e */
    public final C0157f f784e;

    /* renamed from: f */
    public final C0134b0 f785f;

    public C0162g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0162g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0157f fVar = new C0157f(this);
        this.f784e = fVar;
        fVar.mo886d(attributeSet, i);
        C0134b0 b0Var = new C0134b0(this);
        this.f785f = b0Var;
        b0Var.mo750e(attributeSet, i);
        b0Var.mo748b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f784e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1421b.f4499c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f756e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1421b.f4499c) {
            return super.getAutoSizeMinTextSize();
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f755d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1421b.f4499c) {
            return super.getAutoSizeStepGranularity();
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f754c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1421b.f4499c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0134b0 b0Var = this.f785f;
        return b0Var != null ? b0Var.f682i.f757f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C1421b.f4499c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            return b0Var.f682i.f752a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f784e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f784e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0232z0 z0Var = this.f785f.f681h;
        if (z0Var != null) {
            return z0Var.f1004a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0232z0 z0Var = this.f785f.f681h;
        if (z0Var != null) {
            return z0Var.f1005b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0134b0 b0Var = this.f785f;
        if (b0Var != null && !C1421b.f4499c) {
            b0Var.f682i.mo873a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0134b0 b0Var = this.f785f;
        if (b0Var != null && !C1421b.f4499c && b0Var.mo749d()) {
            this.f785f.f682i.mo873a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.mo753h(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.mo754i(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.mo755j(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f784e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f784e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1423d.m4086f(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.f674a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f784e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f784e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f785f.mo756k(colorStateList);
        this.f785f.mo748b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f785f.mo757l(mode);
        this.f785f.mo748b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0134b0 b0Var = this.f785f;
        if (b0Var != null) {
            b0Var.mo751f(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = C1421b.f4499c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0134b0 b0Var = this.f785f;
        if (b0Var != null && !z && !b0Var.mo749d()) {
            b0Var.f682i.mo876f(i, f);
        }
    }
}
