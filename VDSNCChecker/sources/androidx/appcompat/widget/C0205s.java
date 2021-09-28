package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p051i.C1021a;

/* renamed from: androidx.appcompat.widget.s */
public class C0205s extends RadioButton {

    /* renamed from: e */
    public final C0171j f923e;

    /* renamed from: f */
    public final C0157f f924f;

    /* renamed from: g */
    public final C0134b0 f925g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0205s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0171j jVar = new C0171j(this);
        this.f923e = jVar;
        jVar.mo956b(attributeSet, i);
        C0157f fVar = new C0157f(this);
        this.f924f = fVar;
        fVar.mo886d(attributeSet, i);
        C0134b0 b0Var = new C0134b0(this);
        this.f925g = b0Var;
        b0Var.mo750e(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f924f;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f925g;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f924f;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f924f;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0171j jVar = this.f923e;
        if (jVar != null) {
            return jVar.f803b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0171j jVar = this.f923e;
        if (jVar != null) {
            return jVar.f804c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f924f;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f924f;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1021a.m2945a(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0171j jVar = this.f923e;
        if (jVar == null) {
            return;
        }
        if (jVar.f807f) {
            jVar.f807f = false;
            return;
        }
        jVar.f807f = true;
        jVar.mo955a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f924f;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f924f;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0171j jVar = this.f923e;
        if (jVar != null) {
            jVar.f803b = colorStateList;
            jVar.f805d = true;
            jVar.mo955a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0171j jVar = this.f923e;
        if (jVar != null) {
            jVar.f804c = mode;
            jVar.f806e = true;
            jVar.mo955a();
        }
    }
}
