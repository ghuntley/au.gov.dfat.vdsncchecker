package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0162g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0903k;
import p036f2.C0906n;
import p042g2.C0955a;
import p051i.C1021a;
import p054i2.C1030c;
import p058j0.C1061o;
import p058j0.C1070q;
import p060j2.C1091a;
import p072l2.C1242f;
import p072l2.C1247i;
import p072l2.C1261m;
import p083n1.C1455a;
import p088o0.C1491a;
import p096p2.C1578a;
import p119t1.C1786a;

public class MaterialButton extends C0162g implements Checkable, C1261m {

    /* renamed from: t */
    public static final int[] f2669t = {16842911};

    /* renamed from: u */
    public static final int[] f2670u = {16842912};

    /* renamed from: g */
    public final C1786a f2671g;

    /* renamed from: h */
    public final LinkedHashSet<C0705a> f2672h = new LinkedHashSet<>();

    /* renamed from: i */
    public C0706b f2673i;

    /* renamed from: j */
    public PorterDuff.Mode f2674j;

    /* renamed from: k */
    public ColorStateList f2675k;

    /* renamed from: l */
    public Drawable f2676l;

    /* renamed from: m */
    public int f2677m;

    /* renamed from: n */
    public int f2678n;

    /* renamed from: o */
    public int f2679o;

    /* renamed from: p */
    public int f2680p;

    /* renamed from: q */
    public boolean f2681q;

    /* renamed from: r */
    public boolean f2682r;

    /* renamed from: s */
    public int f2683s;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C0705a {
        /* renamed from: a */
        void mo3297a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C0706b {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C0707c extends C1491a {
        public static final Parcelable.Creator<C0707c> CREATOR = new C0708a();

        /* renamed from: g */
        public boolean f2684g;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        public static class C0708a implements Parcelable.ClassLoaderCreator<C0707c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0707c(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0707c[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0707c(parcel, classLoader);
            }
        }

        public C0707c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C0707c.class.getClassLoader();
            }
            this.f2684g = parcel.readInt() != 1 ? false : true;
        }

        public C0707c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeInt(this.f2684g ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.materialButtonStyle, 2131952276), attributeSet, R.attr.materialButtonStyle);
        boolean z = false;
        this.f2681q = false;
        this.f2682r = false;
        Context context2 = getContext();
        TypedArray d = C0903k.m2662d(context2, attributeSet, C1455a.f4575m, R.attr.materialButtonStyle, 2131952276, new int[0]);
        this.f2680p = d.getDimensionPixelSize(12, 0);
        this.f2674j = C0906n.m2665b(d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f2675k = C1030c.m2956a(getContext(), d, 14);
        this.f2676l = C1030c.m2958c(getContext(), d, 10);
        this.f2683s = d.getInteger(11, 1);
        this.f2677m = d.getDimensionPixelSize(13, 0);
        C1786a aVar = new C1786a(this, C1247i.m3551b(context2, attributeSet, R.attr.materialButtonStyle, 2131952276).mo4991a());
        this.f2671g = aVar;
        aVar.f5422c = d.getDimensionPixelOffset(1, 0);
        aVar.f5423d = d.getDimensionPixelOffset(2, 0);
        aVar.f5424e = d.getDimensionPixelOffset(3, 0);
        aVar.f5425f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize = d.getDimensionPixelSize(8, -1);
            aVar.f5426g = dimensionPixelSize;
            aVar.mo6072e(aVar.f5421b.mo4990e((float) dimensionPixelSize));
            aVar.f5435p = true;
        }
        aVar.f5427h = d.getDimensionPixelSize(20, 0);
        aVar.f5428i = C0906n.m2665b(d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f5429j = C1030c.m2956a(getContext(), d, 6);
        aVar.f5430k = C1030c.m2956a(getContext(), d, 19);
        aVar.f5431l = C1030c.m2956a(getContext(), d, 16);
        aVar.f5436q = d.getBoolean(5, false);
        aVar.f5438s = d.getDimensionPixelSize(9, 0);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            aVar.f5434o = true;
            setSupportBackgroundTintList(aVar.f5429j);
            setSupportBackgroundTintMode(aVar.f5428i);
        } else {
            aVar.mo6074g();
        }
        setPaddingRelative(paddingStart + aVar.f5422c, paddingTop + aVar.f5424e, paddingEnd + aVar.f5423d, paddingBottom + aVar.f5425f);
        d.recycle();
        setCompoundDrawablePadding(this.f2680p);
        mo3242g(this.f2676l != null ? true : z);
    }

    private String getA11yClassName() {
        return (mo3236a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public boolean mo3236a() {
        C1786a aVar = this.f2671g;
        return aVar != null && aVar.f5436q;
    }

    /* renamed from: b */
    public final boolean mo3237b() {
        int i = this.f2683s;
        return i == 3 || i == 4;
    }

    /* renamed from: c */
    public final boolean mo3238c() {
        int i = this.f2683s;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    public final boolean mo3239d() {
        int i = this.f2683s;
        return i == 16 || i == 32;
    }

    /* renamed from: e */
    public final boolean mo3240e() {
        C1786a aVar = this.f2671g;
        return aVar != null && !aVar.f5434o;
    }

    /* renamed from: f */
    public final void mo3241f() {
        if (mo3238c()) {
            setCompoundDrawablesRelative(this.f2676l, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (mo3237b()) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f2676l, (Drawable) null);
        } else if (mo3239d()) {
            setCompoundDrawablesRelative((Drawable) null, this.f2676l, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: g */
    public final void mo3242g(boolean z) {
        Drawable drawable = this.f2676l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2676l = mutate;
            mutate.setTintList(this.f2675k);
            PorterDuff.Mode mode = this.f2674j;
            if (mode != null) {
                this.f2676l.setTintMode(mode);
            }
            int i = this.f2677m;
            if (i == 0) {
                i = this.f2676l.getIntrinsicWidth();
            }
            int i2 = this.f2677m;
            if (i2 == 0) {
                i2 = this.f2676l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2676l;
            int i3 = this.f2678n;
            int i4 = this.f2679o;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            mo3241f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = false;
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((mo3238c() && drawable3 != this.f2676l) || ((mo3237b() && drawable5 != this.f2676l) || (mo3239d() && drawable4 != this.f2676l))) {
            z2 = true;
        }
        if (z2) {
            mo3241f();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo3240e()) {
            return this.f2671g.f5426g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2676l;
    }

    public int getIconGravity() {
        return this.f2683s;
    }

    public int getIconPadding() {
        return this.f2680p;
    }

    public int getIconSize() {
        return this.f2677m;
    }

    public ColorStateList getIconTint() {
        return this.f2675k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2674j;
    }

    public int getInsetBottom() {
        return this.f2671g.f5425f;
    }

    public int getInsetTop() {
        return this.f2671g.f5424e;
    }

    public ColorStateList getRippleColor() {
        if (mo3240e()) {
            return this.f2671g.f5431l;
        }
        return null;
    }

    public C1247i getShapeAppearanceModel() {
        if (mo3240e()) {
            return this.f2671g.f5421b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo3240e()) {
            return this.f2671g.f5430k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo3240e()) {
            return this.f2671g.f5427h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo3240e()) {
            return this.f2671g.f5429j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo3240e()) {
            return this.f2671g.f5428i;
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final void mo3258h(int i, int i2) {
        if (this.f2676l != null && getLayout() != null) {
            if (mo3238c() || mo3237b()) {
                this.f2679o = 0;
                int i3 = this.f2683s;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f2678n = 0;
                } else {
                    int i4 = this.f2677m;
                    if (i4 == 0) {
                        i4 = this.f2676l.getIntrinsicWidth();
                    }
                    int textWidth = i - getTextWidth();
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    int paddingEnd = ((((textWidth - getPaddingEnd()) - i4) - this.f2680p) - getPaddingStart()) / 2;
                    boolean z2 = getLayoutDirection() == 1;
                    if (this.f2683s != 4) {
                        z = false;
                    }
                    if (z2 != z) {
                        paddingEnd = -paddingEnd;
                    }
                    if (this.f2678n != paddingEnd) {
                        this.f2678n = paddingEnd;
                        mo3242g(false);
                        return;
                    }
                    return;
                }
            } else if (mo3239d()) {
                this.f2678n = 0;
                if (this.f2683s == 16) {
                    this.f2679o = 0;
                } else {
                    int i5 = this.f2677m;
                    if (i5 == 0) {
                        i5 = this.f2676l.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f2680p) - getPaddingBottom()) / 2;
                    if (this.f2679o != textHeight) {
                        this.f2679o = textHeight;
                        mo3242g(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            mo3242g(false);
        }
    }

    public boolean isChecked() {
        return this.f2681q;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo3240e()) {
            C0955a.m2721B(this, this.f2671g.mo6069b());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo3236a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f2669t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f2670u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo3236a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0707c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0707c cVar = (C0707c) parcelable;
        super.onRestoreInstanceState(cVar.f4651e);
        setChecked(cVar.f2684g);
    }

    public Parcelable onSaveInstanceState() {
        C0707c cVar = new C0707c(super.onSaveInstanceState());
        cVar.f2684g = this.f2681q;
        return cVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo3258h(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo3258h(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.mo6069b() != null) {
                aVar.mo6069b().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (mo3240e()) {
            if (drawable != getBackground()) {
                C1786a aVar = this.f2671g;
                aVar.f5434o = true;
                aVar.f5420a.setSupportBackgroundTintList(aVar.f5429j);
                aVar.f5420a.setSupportBackgroundTintMode(aVar.f5428i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C1021a.m2945a(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo3240e()) {
            this.f2671g.f5436q = z;
        }
    }

    public void setChecked(boolean z) {
        if (mo3236a() && isEnabled() && this.f2681q != z) {
            this.f2681q = z;
            refreshDrawableState();
            if (!this.f2682r) {
                this.f2682r = true;
                Iterator it = this.f2672h.iterator();
                while (it.hasNext()) {
                    ((C0705a) it.next()).mo3297a(this, this.f2681q);
                }
                this.f2682r = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (!aVar.f5435p || aVar.f5426g != i) {
                aVar.f5426g = i;
                aVar.f5435p = true;
                aVar.mo6072e(aVar.f5421b.mo4990e((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo3240e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo3240e()) {
            C1242f b = this.f2671g.mo6069b();
            C1242f.C1244b bVar = b.f4164e;
            if (bVar.f4201o != f) {
                bVar.f4201o = f;
                b.mo4984w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2676l != drawable) {
            this.f2676l = drawable;
            mo3242g(true);
            mo3258h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f2683s != i) {
            this.f2683s = i;
            mo3258h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2680p != i) {
            this.f2680p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C1021a.m2945a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f2677m != i) {
            this.f2677m = i;
            mo3242g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2675k != colorStateList) {
            this.f2675k = colorStateList;
            mo3242g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2674j != mode) {
            this.f2674j = mode;
            mo3242g(false);
        }
    }

    public void setIconTintResource(int i) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
        setIconTint(context.getColorStateList(i));
    }

    public void setInsetBottom(int i) {
        C1786a aVar = this.f2671g;
        aVar.mo6073f(aVar.f5424e, i);
    }

    public void setInsetTop(int i) {
        C1786a aVar = this.f2671g;
        aVar.mo6073f(i, aVar.f5425f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C0706b bVar) {
        this.f2673i = bVar;
    }

    public void setPressed(boolean z) {
        C0706b bVar = this.f2673i;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.f5431l != colorStateList) {
                aVar.f5431l = colorStateList;
                if (aVar.f5420a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f5420a.getBackground()).setColor(C1091a.m3114a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (mo3240e()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            setRippleColor(context.getColorStateList(i));
        }
    }

    public void setShapeAppearanceModel(C1247i iVar) {
        if (mo3240e()) {
            this.f2671g.mo6072e(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            aVar.f5433n = z;
            aVar.mo6075h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.f5430k != colorStateList) {
                aVar.f5430k = colorStateList;
                aVar.mo6075h();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo3240e()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            setStrokeColor(context.getColorStateList(i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.f5427h != i) {
                aVar.f5427h = i;
                aVar.mo6075h();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo3240e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.f5429j != colorStateList) {
                aVar.f5429j = colorStateList;
                if (aVar.mo6069b() != null) {
                    aVar.mo6069b().setTintList(aVar.f5429j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (mo3240e()) {
            C1786a aVar = this.f2671g;
            if (aVar.f5428i != mode) {
                aVar.f5428i = mode;
                if (aVar.mo6069b() != null && aVar.f5428i != null) {
                    aVar.mo6069b().setTintMode(aVar.f5428i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.f2681q);
    }
}
