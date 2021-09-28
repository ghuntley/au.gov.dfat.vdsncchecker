package p090o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.C0762b;

/* renamed from: o2.j */
public class C1513j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0762b f4682a;

    public C1513j(C0762b bVar) {
        this.f4682a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        C0762b bVar = this.f4682a;
        bVar.f4685c.setChecked(bVar.f3008j);
        this.f4682a.f3014p.start();
    }
}
