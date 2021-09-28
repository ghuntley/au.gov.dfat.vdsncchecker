package p036f2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0184m0;
import p083n1.C1455a;

/* renamed from: f2.f */
public class C0894f extends C0184m0 {

    /* renamed from: t */
    public Drawable f3405t;

    /* renamed from: u */
    public final Rect f3406u;

    /* renamed from: v */
    public final Rect f3407v;

    /* renamed from: w */
    public int f3408w;

    /* renamed from: x */
    public boolean f3409x;

    /* renamed from: y */
    public boolean f3410y;

    public C0894f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0894f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3406u = new Rect();
        this.f3407v = new Rect();
        this.f3408w = 119;
        this.f3409x = true;
        this.f3410y = false;
        int[] iArr = C1455a.f4572j;
        C0903k.m2659a(context, attributeSet, i, 0);
        C0903k.m2660b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f3408w = obtainStyledAttributes.getInt(1, this.f3408w);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3409x = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3405t;
        if (drawable != null) {
            if (this.f3410y) {
                this.f3410y = false;
                Rect rect = this.f3406u;
                Rect rect2 = this.f3407v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3409x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3408w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3405t;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3405t;
        if (drawable != null && drawable.isStateful()) {
            this.f3405t.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f3405t;
    }

    public int getForegroundGravity() {
        return this.f3408w;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3405t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3410y = z | this.f3410y;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3410y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3405t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f3405t);
            }
            this.f3405t = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3408w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f3408w != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3408w = i;
            if (i == 119 && this.f3405t != null) {
                this.f3405t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3405t;
    }
}
