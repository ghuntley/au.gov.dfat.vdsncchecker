package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0933a;
import p051i.C1021a;

/* renamed from: androidx.appcompat.widget.p */
public class C0195p extends MultiAutoCompleteTextView {

    /* renamed from: g */
    public static final int[] f901g = {16843126};

    /* renamed from: e */
    public final C0157f f902e;

    /* renamed from: f */
    public final C0134b0 f903f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0195p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0136b1 q = C0136b1.m361q(getContext(), attributeSet, f901g, R.attr.autoCompleteTextViewStyle, 0);
        if (q.mo775o(0)) {
            setDropDownBackgroundDrawable(q.mo767g(0));
        }
        q.f692b.recycle();
        C0157f fVar = new C0157f(this);
        this.f902e = fVar;
        fVar.mo886d(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0134b0 b0Var = new C0134b0(this);
        this.f903f = b0Var;
        b0Var.mo750e(attributeSet, R.attr.autoCompleteTextViewStyle);
        b0Var.mo748b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f902e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f903f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f902e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f902e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0933a.m2712f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f902e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f902e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1021a.m2945a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f902e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f902e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0134b0 b0Var = this.f903f;
        if (b0Var != null) {
            b0Var.mo751f(context, i);
        }
    }
}
