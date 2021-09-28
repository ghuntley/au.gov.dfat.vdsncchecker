package p107r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* renamed from: r1.c */
public class C1677c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f5111a;

    public C1677c(BottomAppBar bottomAppBar) {
        this.f5111a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m2093w(this.f5111a);
        Objects.requireNonNull(this.f5111a);
        this.f5111a.f2590S = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f5111a.f2594W++;
    }
}
