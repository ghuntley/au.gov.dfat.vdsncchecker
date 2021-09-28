package p095p1;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import p072l2.C1242f;

/* renamed from: p1.a */
public class C1572a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1242f f4887a;

    public C1572a(AppBarLayout appBarLayout, C1242f fVar) {
        this.f4887a = fVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4887a.mo4974o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
