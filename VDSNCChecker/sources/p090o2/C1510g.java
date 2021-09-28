package p090o2;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.C0762b;

/* renamed from: o2.g */
public class C1510g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0762b f4678a;

    public C1510g(C0762b bVar) {
        this.f4678a = bVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4678a.f4685c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
