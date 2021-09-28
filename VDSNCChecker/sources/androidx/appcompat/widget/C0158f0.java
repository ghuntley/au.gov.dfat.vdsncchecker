package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: androidx.appcompat.widget.f0 */
public class C0158f0 extends ToggleButton {

    /* renamed from: e */
    public final C0157f f769e;

    /* renamed from: f */
    public final C0134b0 f770f;

    public C0158f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        C0216w0.m569a(this, getContext());
        C0157f fVar = new C0157f(this);
        this.f769e = fVar;
        fVar.mo886d(attributeSet, 16842827);
        C0134b0 b0Var = new C0134b0(this);
        this.f770f = b0Var;
        b0Var.mo750e(attributeSet, 16842827);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f769e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f770f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f769e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f769e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f769e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f769e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f769e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f769e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }
}
