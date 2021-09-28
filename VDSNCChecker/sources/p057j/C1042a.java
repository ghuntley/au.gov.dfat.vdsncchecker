package p057j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: j.a */
public class C1042a extends Drawable implements Drawable.Callback {

    /* renamed from: e */
    public Drawable f3777e;

    public C1042a(Drawable drawable) {
        Drawable drawable2 = this.f3777e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3777e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f3777e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f3777e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3777e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3777e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3777e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3777e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3777e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3777e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3777e.getPadding(rect);
    }

    public int[] getState() {
        return this.f3777e.getState();
    }

    public Region getTransparentRegion() {
        return this.f3777e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f3777e.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f3777e.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3777e.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f3777e.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f3777e.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3777e.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f3777e.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f3777e.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3777e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3777e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3777e.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f3777e.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3777e.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f3777e.setState(iArr);
    }

    public void setTint(int i) {
        this.f3777e.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3777e.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3777e.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3777e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
