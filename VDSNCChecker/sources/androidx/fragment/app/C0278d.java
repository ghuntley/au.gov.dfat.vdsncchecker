package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0263a0;
import androidx.fragment.app.C0273c;

/* renamed from: androidx.fragment.app.d */
public class C0278d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1410a;

    /* renamed from: b */
    public final /* synthetic */ View f1411b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1412c;

    /* renamed from: d */
    public final /* synthetic */ C0263a0.C0267d f1413d;

    /* renamed from: e */
    public final /* synthetic */ C0273c.C0275b f1414e;

    public C0278d(C0273c cVar, ViewGroup viewGroup, View view, boolean z, C0263a0.C0267d dVar, C0273c.C0275b bVar) {
        this.f1410a = viewGroup;
        this.f1411b = view;
        this.f1412c = z;
        this.f1413d = dVar;
        this.f1414e = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1410a.endViewTransition(this.f1411b);
        if (this.f1412c) {
            this.f1413d.f1368a.mo1560a(this.f1411b);
        }
        this.f1414e.mo1570a();
    }
}
