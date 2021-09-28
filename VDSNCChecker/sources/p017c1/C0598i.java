package p017c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c1.i */
public class C0598i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0592g f2443a;

    public C0598i(C0592g gVar) {
        this.f2443a = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2443a.mo2784r();
        animator.removeListener(this);
    }
}
