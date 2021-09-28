package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.k */
public class C0455k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0456l.C0457a f2118a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2119b;

    /* renamed from: c */
    public final /* synthetic */ View f2120c;

    /* renamed from: d */
    public final /* synthetic */ C0456l f2121d;

    public C0455k(C0456l lVar, C0456l.C0457a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2121d = lVar;
        this.f2118a = aVar;
        this.f2119b = viewPropertyAnimator;
        this.f2120c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2119b.setListener((Animator.AnimatorListener) null);
        this.f2120c.setAlpha(1.0f);
        this.f2120c.setTranslationX(0.0f);
        this.f2120c.setTranslationY(0.0f);
        this.f2121d.mo2139c(this.f2118a.f2135b);
        this.f2121d.f2133r.remove(this.f2118a.f2135b);
        this.f2121d.mo2389k();
    }

    public void onAnimationStart(Animator animator) {
        C0456l lVar = this.f2121d;
        RecyclerView.C0422z zVar = this.f2118a.f2135b;
        Objects.requireNonNull(lVar);
    }
}
