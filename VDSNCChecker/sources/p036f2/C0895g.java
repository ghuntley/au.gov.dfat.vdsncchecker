package p036f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: f2.g */
public final class C0895g {

    /* renamed from: a */
    public final ArrayList<C0897b> f3411a = new ArrayList<>();

    /* renamed from: b */
    public C0897b f3412b = null;

    /* renamed from: c */
    public ValueAnimator f3413c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f3414d = new C0896a();

    /* renamed from: f2.g$a */
    public class C0896a extends AnimatorListenerAdapter {
        public C0896a() {
        }

        public void onAnimationEnd(Animator animator) {
            C0895g gVar = C0895g.this;
            if (gVar.f3413c == animator) {
                gVar.f3413c = null;
            }
        }
    }

    /* renamed from: f2.g$b */
    public static class C0897b {

        /* renamed from: a */
        public final int[] f3416a;

        /* renamed from: b */
        public final ValueAnimator f3417b;

        public C0897b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3416a = iArr;
            this.f3417b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo4224a(int[] iArr, ValueAnimator valueAnimator) {
        C0897b bVar = new C0897b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3414d);
        this.f3411a.add(bVar);
    }
}
