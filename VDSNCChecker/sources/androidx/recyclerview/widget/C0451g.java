package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.g */
public class C0451g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0422z f2100a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2101b;

    /* renamed from: c */
    public final /* synthetic */ View f2102c;

    /* renamed from: d */
    public final /* synthetic */ C0456l f2103d;

    public C0451g(C0456l lVar, RecyclerView.C0422z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2103d = lVar;
        this.f2100a = zVar;
        this.f2101b = viewPropertyAnimator;
        this.f2102c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2101b.setListener((Animator.AnimatorListener) null);
        this.f2102c.setAlpha(1.0f);
        this.f2103d.mo2139c(this.f2100a);
        this.f2103d.f2132q.remove(this.f2100a);
        this.f2103d.mo2389k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2103d);
    }
}
