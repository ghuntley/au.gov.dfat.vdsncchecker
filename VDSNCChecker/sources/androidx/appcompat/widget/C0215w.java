package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.widget.w */
public class C0215w extends C0200r {

    /* renamed from: d */
    public final SeekBar f960d;

    /* renamed from: e */
    public Drawable f961e;

    /* renamed from: f */
    public ColorStateList f962f = null;

    /* renamed from: g */
    public PorterDuff.Mode f963g = null;

    /* renamed from: h */
    public boolean f964h = false;

    /* renamed from: i */
    public boolean f965i = false;

    public C0215w(SeekBar seekBar) {
        super(seekBar);
        this.f960d = seekBar;
    }

    /* renamed from: a */
    public void mo1107a(AttributeSet attributeSet, int i) {
        super.mo1107a(attributeSet, i);
        Context context = this.f960d.getContext();
        int[] iArr = C0934b.f3465g;
        C0136b1 q = C0136b1.m361q(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f960d;
        C1061o.m3033n(seekBar, seekBar.getContext(), iArr, attributeSet, q.f692b, i, 0);
        Drawable h = q.mo768h(0);
        if (h != null) {
            this.f960d.setThumb(h);
        }
        Drawable g = q.mo767g(1);
        Drawable drawable = this.f961e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f961e = g;
        if (g != null) {
            g.setCallback(this.f960d);
            SeekBar seekBar2 = this.f960d;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            g.setLayoutDirection(seekBar2.getLayoutDirection());
            if (g.isStateful()) {
                g.setState(this.f960d.getDrawableState());
            }
            mo1165c();
        }
        this.f960d.invalidate();
        if (q.mo775o(3)) {
            this.f963g = C0169i0.m488b(q.mo770j(3, -1), this.f963g);
            this.f965i = true;
        }
        if (q.mo775o(2)) {
            this.f962f = q.mo763c(2);
            this.f964h = true;
        }
        q.f692b.recycle();
        mo1165c();
    }

    /* renamed from: c */
    public final void mo1165c() {
        Drawable drawable = this.f961e;
        if (drawable == null) {
            return;
        }
        if (this.f964h || this.f965i) {
            Drawable mutate = drawable.mutate();
            this.f961e = mutate;
            if (this.f964h) {
                mutate.setTintList(this.f962f);
            }
            if (this.f965i) {
                this.f961e.setTintMode(this.f963g);
            }
            if (this.f961e.isStateful()) {
                this.f961e.setState(this.f960d.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public void mo1166d(Canvas canvas) {
        if (this.f961e != null) {
            int max = this.f960d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f961e.getIntrinsicWidth();
                int intrinsicHeight = this.f961e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f961e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f960d.getWidth() - this.f960d.getPaddingLeft()) - this.f960d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f960d.getPaddingLeft(), (float) (this.f960d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f961e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
