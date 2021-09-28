package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: androidx.appcompat.widget.t */
public class C0207t extends RatingBar {

    /* renamed from: e */
    public final C0200r f926e;

    public C0207t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0216w0.m569a(this, getContext());
        C0200r rVar = new C0200r(this);
        this.f926e = rVar;
        rVar.mo1107a(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f926e.f912b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
