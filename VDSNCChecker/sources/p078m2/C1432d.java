package p078m2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0906n;
import p054i2.C1030c;
import p058j0.C1061o;
import p058j0.C1070q;
import p083n1.C1455a;
import p096p2.C1578a;
import p136w0.C2036r;

/* renamed from: m2.d */
public class C1432d extends FrameLayout {

    /* renamed from: l */
    public static final View.OnTouchListener f4511l = new C1433a();

    /* renamed from: e */
    public C1431c f4512e;

    /* renamed from: f */
    public C1430b f4513f;

    /* renamed from: g */
    public int f4514g;

    /* renamed from: h */
    public final float f4515h;

    /* renamed from: i */
    public final float f4516i;

    /* renamed from: j */
    public ColorStateList f4517j;

    /* renamed from: k */
    public PorterDuff.Mode f4518k;

    /* renamed from: m2.d$a */
    public static class C1433a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C1432d(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1455a.f4588z);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            setElevation((float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f4514g = obtainStyledAttributes.getInt(2, 0);
        this.f4515h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(C1030c.m2956a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(C0906n.m2665b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4516i = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f4511l);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C2036r.m5371i(C2036r.m5365c(this, R.attr.colorSurface), C2036r.m5365c(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f4517j;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f4516i;
    }

    public int getAnimationMode() {
        return this.f4514g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4515h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1430b bVar = this.f4513f;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1430b bVar = this.f4513f;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1431c cVar = this.f4512e;
        if (cVar != null) {
            cVar.mo5267a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f4514g = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f4517j == null)) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f4517j);
            drawable.setTintMode(this.f4518k);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4517j = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f4518k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4518k = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(C1430b bVar) {
        this.f4513f = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4511l);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(C1431c cVar) {
        this.f4512e = cVar;
    }
}
