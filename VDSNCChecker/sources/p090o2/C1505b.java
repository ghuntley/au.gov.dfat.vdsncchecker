package p090o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.C0755a;

/* renamed from: o2.b */
public class C1505b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0755a f4672a;

    public C1505b(C0755a aVar) {
        this.f4672a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4672a.f4683a.setEndIconVisible(false);
    }
}
