package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C0734d;

/* renamed from: com.google.android.material.floatingactionbutton.b */
public class C0732b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f2824a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2825b;

    /* renamed from: c */
    public final /* synthetic */ C0734d.C0740f f2826c;

    /* renamed from: d */
    public final /* synthetic */ C0734d f2827d;

    public C0732b(C0734d dVar, boolean z, C0734d.C0740f fVar) {
        this.f2827d = dVar;
        this.f2825b = z;
        this.f2826c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2824a = true;
    }

    public void onAnimationEnd(Animator animator) {
        C0734d dVar = this.f2827d;
        dVar.f2852o = 0;
        dVar.f2847j = null;
        if (!this.f2824a) {
            FloatingActionButton floatingActionButton = dVar.f2856s;
            boolean z = this.f2825b;
            floatingActionButton.mo4231b(z ? 8 : 4, z);
            C0734d.C0740f fVar = this.f2826c;
            if (fVar != null) {
                C0731a aVar = (C0731a) fVar;
                aVar.f2822a.mo3695a(aVar.f2823b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2827d.f2856s.mo4231b(0, this.f2825b);
        C0734d dVar = this.f2827d;
        dVar.f2852o = 1;
        dVar.f2847j = animator;
        this.f2824a = false;
    }
}
