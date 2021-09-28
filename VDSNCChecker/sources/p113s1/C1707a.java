package p113s1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p072l2.C1242f;

/* renamed from: s1.a */
public class C1707a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f5276a;

    public C1707a(BottomSheetBehavior bottomSheetBehavior) {
        this.f5276a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1242f fVar = this.f5276a.f2636i;
        if (fVar != null) {
            fVar.mo4977q(floatValue);
        }
    }
}
