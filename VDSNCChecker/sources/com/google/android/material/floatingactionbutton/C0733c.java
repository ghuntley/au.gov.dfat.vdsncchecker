package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C0734d;

/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C0733c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f2828a;

    /* renamed from: b */
    public final /* synthetic */ C0734d.C0740f f2829b;

    /* renamed from: c */
    public final /* synthetic */ C0734d f2830c;

    public C0733c(C0734d dVar, boolean z, C0734d.C0740f fVar) {
        this.f2830c = dVar;
        this.f2828a = z;
        this.f2829b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        C0734d dVar = this.f2830c;
        dVar.f2852o = 0;
        dVar.f2847j = null;
        C0734d.C0740f fVar = this.f2829b;
        if (fVar != null) {
            C0731a aVar = (C0731a) fVar;
            aVar.f2822a.mo3696b(aVar.f2823b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2830c.f2856s.mo4231b(0, this.f2828a);
        C0734d dVar = this.f2830c;
        dVar.f2852o = 2;
        dVar.f2847j = animator;
    }
}
