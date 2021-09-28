package p142x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: x1.a */
public final class C2115a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C2118d f6147a;

    public C2115a(C2118d dVar) {
        this.f6147a = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f6147a.mo6653b();
    }

    public void onAnimationStart(Animator animator) {
        this.f6147a.mo6652a();
    }
}
