package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p039g.C0933a;
import p051i.C1021a;
import p076m0.C1423d;

/* renamed from: androidx.appcompat.widget.i */
public class C0168i extends CheckedTextView {

    /* renamed from: f */
    public static final int[] f797f = {16843016};

    /* renamed from: e */
    public final C0134b0 f798e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0168i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0134b0 b0Var = new C0134b0(this);
        this.f798e = b0Var;
        b0Var.mo750e(attributeSet, 16843720);
        b0Var.mo748b();
        C0136b1 q = C0136b1.m361q(getContext(), attributeSet, f797f, 16843720, 0);
        setCheckMarkDrawable(q.mo767g(0));
        q.f692b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0134b0 b0Var = this.f798e;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0933a.m2712f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1021a.m2945a(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1423d.m4086f(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0134b0 b0Var = this.f798e;
        if (b0Var != null) {
            b0Var.mo751f(context, i);
        }
    }
}
