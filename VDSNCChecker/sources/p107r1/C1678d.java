package p107r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* renamed from: r1.d */
public class C1678d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f5112a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f5113b;

    /* renamed from: c */
    public final /* synthetic */ int f5114c;

    /* renamed from: d */
    public final /* synthetic */ boolean f5115d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f5116e;

    public C1678d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f5116e = bottomAppBar;
        this.f5113b = actionMenuView;
        this.f5114c = i;
        this.f5115d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f5112a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f5112a) {
            BottomAppBar bottomAppBar = this.f5116e;
            int i = bottomAppBar.f2595a0;
            boolean z = i != 0;
            if (i != 0) {
                bottomAppBar.f2595a0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.mo666n(i);
            }
            BottomAppBar bottomAppBar2 = this.f5116e;
            ActionMenuView actionMenuView = this.f5113b;
            int i2 = this.f5114c;
            boolean z2 = this.f5115d;
            Objects.requireNonNull(bottomAppBar2);
            C1679e eVar = new C1679e(bottomAppBar2, actionMenuView, i2, z2);
            if (z) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
