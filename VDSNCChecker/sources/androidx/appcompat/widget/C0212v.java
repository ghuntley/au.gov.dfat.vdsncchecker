package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: androidx.appcompat.widget.v */
public class C0212v extends SeekBar {

    /* renamed from: e */
    public final C0215w f940e;

    public C0212v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C0216w0.m569a(this, getContext());
        C0215w wVar = new C0215w(this);
        this.f940e = wVar;
        wVar.mo1107a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0215w wVar = this.f940e;
        Drawable drawable = wVar.f961e;
        if (drawable != null && drawable.isStateful() && drawable.setState(wVar.f960d.getDrawableState())) {
            wVar.f960d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f940e.f961e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f940e.mo1166d(canvas);
    }
}
