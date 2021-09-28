package p017c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p093p.C1545a;

/* renamed from: c1.h */
public class C0597h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1545a f2441a;

    /* renamed from: b */
    public final /* synthetic */ C0592g f2442b;

    public C0597h(C0592g gVar, C1545a aVar) {
        this.f2442b = gVar;
        this.f2441a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2441a.remove(animator);
        this.f2442b.f2428q.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f2442b.f2428q.add(animator);
    }
}
