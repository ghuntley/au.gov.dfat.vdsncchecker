package p090o2;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.C0755a;

/* renamed from: o2.c */
public class C1506c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0755a f4673a;

    public C1506c(C0755a aVar) {
        this.f4673a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4673a.f4685c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
