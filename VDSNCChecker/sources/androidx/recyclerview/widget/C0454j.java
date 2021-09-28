package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.j */
public class C0454j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0456l.C0457a f2114a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2115b;

    /* renamed from: c */
    public final /* synthetic */ View f2116c;

    /* renamed from: d */
    public final /* synthetic */ C0456l f2117d;

    public C0454j(C0456l lVar, C0456l.C0457a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2117d = lVar;
        this.f2114a = aVar;
        this.f2115b = viewPropertyAnimator;
        this.f2116c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2115b.setListener((Animator.AnimatorListener) null);
        this.f2116c.setAlpha(1.0f);
        this.f2116c.setTranslationX(0.0f);
        this.f2116c.setTranslationY(0.0f);
        this.f2117d.mo2139c(this.f2114a.f2134a);
        this.f2117d.f2133r.remove(this.f2114a.f2134a);
        this.f2117d.mo2389k();
    }

    public void onAnimationStart(Animator animator) {
        C0456l lVar = this.f2117d;
        RecyclerView.C0422z zVar = this.f2114a.f2134a;
        Objects.requireNonNull(lVar);
    }
}
