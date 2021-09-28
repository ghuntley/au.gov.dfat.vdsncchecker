package p107r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: r1.a */
public class C1674a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f5107a;

    public C1674a(BottomAppBar bottomAppBar) {
        this.f5107a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m2093w(this.f5107a);
        this.f5107a.f2589R = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f5107a.f2594W++;
    }
}
