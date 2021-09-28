package p090o2;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.C0755a;

/* renamed from: o2.d */
public class C1507d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0755a f4674a;

    public C1507d(C0755a aVar) {
        this.f4674a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4674a.f4685c.setScaleX(floatValue);
        this.f4674a.f4685c.setScaleY(floatValue);
    }
}
