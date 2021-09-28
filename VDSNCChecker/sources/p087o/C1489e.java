package p087o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: o.e */
public class C1489e extends Drawable {

    /* renamed from: a */
    public float f4641a;

    /* renamed from: b */
    public float f4642b;

    /* renamed from: c */
    public boolean f4643c;

    /* renamed from: d */
    public boolean f4644d;

    /* renamed from: e */
    public ColorStateList f4645e;

    /* renamed from: f */
    public PorterDuffColorFilter f4646f;

    /* renamed from: g */
    public ColorStateList f4647g;

    /* renamed from: h */
    public PorterDuff.Mode f4648h;

    /* renamed from: a */
    public final PorterDuffColorFilter mo5387a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void mo5388b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i = rect.left;
        throw null;
    }

    public void draw(Canvas canvas) {
        if (this.f4646f == null) {
            float f = this.f4641a;
            canvas.drawRoundRect((RectF) null, f, f, (Paint) null);
            return;
        }
        throw null;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect((Rect) null, this.f4641a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f4645e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f4647g
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f4645e
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C1489e.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo5388b(rect);
        throw null;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f4645e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4647g = colorStateList;
        this.f4646f = mo5387a(colorStateList, this.f4648h);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f4648h = mode;
        this.f4646f = mo5387a(this.f4647g, mode);
        invalidateSelf();
    }
}
