package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p016c0.C0560d;
import p016c0.C0567j;
import p039g.C0933a;
import p046h0.C1002b;
import p051i.C1021a;
import p076m0.C1421b;
import p076m0.C1423d;

/* renamed from: androidx.appcompat.widget.d0 */
public class C0148d0 extends TextView implements C1421b {

    /* renamed from: e */
    public final C0157f f722e;

    /* renamed from: f */
    public final C0134b0 f723f;

    /* renamed from: g */
    public final C0231z f724g;

    /* renamed from: h */
    public boolean f725h;

    /* renamed from: i */
    public Future<C1002b> f726i;

    public C0148d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0148d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0230y0.m607a(context);
        this.f725h = false;
        C0216w0.m569a(this, getContext());
        C0157f fVar = new C0157f(this);
        this.f722e = fVar;
        fVar.mo886d(attributeSet, i);
        C0134b0 b0Var = new C0134b0(this);
        this.f723f = b0Var;
        b0Var.mo750e(attributeSet, i);
        b0Var.mo748b();
        this.f724g = new C0231z(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f722e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1421b.f4499c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f756e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1421b.f4499c) {
            return super.getAutoSizeMinTextSize();
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f755d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1421b.f4499c) {
            return super.getAutoSizeStepGranularity();
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            return Math.round(b0Var.f682i.f754c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1421b.f4499c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0134b0 b0Var = this.f723f;
        return b0Var != null ? b0Var.f682i.f757f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C1421b.f4499c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            return b0Var.f682i.f752a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f722e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f722e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0232z0 z0Var = this.f723f.f681h;
        if (z0Var != null) {
            return z0Var.f1004a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0232z0 z0Var = this.f723f.f681h;
        if (z0Var != null) {
            return z0Var.f1005b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<C1002b> future = this.f726i;
        if (future != null) {
            try {
                this.f726i = null;
                C1423d.m4085e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f724g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.z r0 = r2.f724g
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1235b()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0148d0.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C1002b.C1003a getTextMetricsParamsCompat() {
        return C1423d.m4081a(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f723f.mo752g(this, onCreateInputConnection, editorInfo);
        C0933a.m2712f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null && !C1421b.f4499c) {
            b0Var.f682i.mo873a();
        }
    }

    public void onMeasure(int i, int i2) {
        Future<C1002b> future = this.f726i;
        if (future != null) {
            try {
                this.f726i = null;
                C1423d.m4085e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null && !C1421b.f4499c && b0Var.mo749d()) {
            this.f723f.f682i.mo873a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo753h(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo754i(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1421b.f4499c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo755j(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f722e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f722e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C1021a.m2945a(context, i) : null;
        Drawable a2 = i2 != 0 ? C1021a.m2945a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C1021a.m2945a(context, i3) : null;
        if (i4 != 0) {
            drawable = C1021a.m2945a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C1021a.m2945a(context, i) : null;
        Drawable a2 = i2 != 0 ? C1021a.m2945a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C1021a.m2945a(context, i3) : null;
        if (i4 != 0) {
            drawable = C1021a.m2945a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1423d.m4086f(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1423d.m4082b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1423d.m4083c(this, i);
        }
    }

    public void setLineHeight(int i) {
        C1423d.m4084d(this, i);
    }

    public void setPrecomputedText(C1002b bVar) {
        C1423d.m4085e(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f722e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f722e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f723f.mo756k(colorStateList);
        this.f723f.mo748b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f723f.mo757l(mode);
        this.f723f.mo748b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo751f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0231z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f724g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f1003b = textClassifier;
        }
    }

    public void setTextFuture(Future<C1002b> future) {
        this.f726i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1002b.C1003a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f3713b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f3712a);
        setBreakStrategy(aVar.f3714c);
        setHyphenationFrequency(aVar.f3715d);
    }

    public void setTextSize(int i, float f) {
        boolean z = C1421b.f4499c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0134b0 b0Var = this.f723f;
        if (b0Var != null && !z && !b0Var.mo749d()) {
            b0Var.f682i.mo876f(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f725h) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                C0567j jVar = C0560d.f2363a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f725h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f725h = false;
            }
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0134b0 b0Var = this.f723f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }
}
