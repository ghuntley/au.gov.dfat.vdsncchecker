package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import p045h.C0995s;

/* renamed from: j0.q */
public final class C1070q {

    /* renamed from: a */
    public WeakReference<View> f3821a;

    /* renamed from: j0.q$a */
    public class C1071a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1073r f3822a;

        /* renamed from: b */
        public final /* synthetic */ View f3823b;

        public C1071a(C1070q qVar, C1073r rVar, View view) {
            this.f3822a = rVar;
            this.f3823b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3822a.mo741c(this.f3823b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3822a.mo739a(this.f3823b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3822a.mo740b(this.f3823b);
        }
    }

    /* renamed from: j0.q$b */
    public class C1072b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C1075t f3824a;

        public C1072b(C1070q qVar, C1075t tVar, View view) {
            this.f3824a = tVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C0995s.this.f3669d.getParent()).invalidate();
        }
    }

    public C1070q(View view) {
        this.f3821a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C1070q mo4545a(float f) {
        View view = (View) this.f3821a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo4546b() {
        View view = (View) this.f3821a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public C1070q mo4547c(long j) {
        View view = (View) this.f3821a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: d */
    public C1070q mo4548d(C1073r rVar) {
        View view = (View) this.f3821a.get();
        if (view != null) {
            mo4549e(view, rVar);
        }
        return this;
    }

    /* renamed from: e */
    public final void mo4549e(View view, C1073r rVar) {
        if (rVar != null) {
            view.animate().setListener(new C1071a(this, rVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: f */
    public C1070q mo4550f(C1075t tVar) {
        View view = (View) this.f3821a.get();
        if (view != null) {
            C1072b bVar = null;
            if (tVar != null) {
                bVar = new C1072b(this, tVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: g */
    public C1070q mo4551g(float f) {
        View view = (View) this.f3821a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
