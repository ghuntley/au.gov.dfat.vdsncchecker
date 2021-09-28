package p090o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.C0755a;

/* renamed from: o2.a */
public class C1504a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0755a f4671a;

    public C1504a(C0755a aVar) {
        this.f4671a = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f4671a.f4683a.setEndIconVisible(true);
    }
}
