package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.i */
public class C0453i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C0422z f2108a;

    /* renamed from: b */
    public final /* synthetic */ int f2109b;

    /* renamed from: c */
    public final /* synthetic */ View f2110c;

    /* renamed from: d */
    public final /* synthetic */ int f2111d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f2112e;

    /* renamed from: f */
    public final /* synthetic */ C0456l f2113f;

    public C0453i(C0456l lVar, RecyclerView.C0422z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2113f = lVar;
        this.f2108a = zVar;
        this.f2109b = i;
        this.f2110c = view;
        this.f2111d = i2;
        this.f2112e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f2109b != 0) {
            this.f2110c.setTranslationX(0.0f);
        }
        if (this.f2111d != 0) {
            this.f2110c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f2112e.setListener((Animator.AnimatorListener) null);
        this.f2113f.mo2139c(this.f2108a);
        this.f2113f.f2131p.remove(this.f2108a);
        this.f2113f.mo2389k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2113f);
    }
}
