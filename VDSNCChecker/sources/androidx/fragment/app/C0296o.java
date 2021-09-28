package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0286k;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1060n;

/* renamed from: androidx.fragment.app.o */
public class C0296o {

    /* renamed from: androidx.fragment.app.o$a */
    public static class C0297a {

        /* renamed from: a */
        public final Animation f1507a;

        /* renamed from: b */
        public final Animator f1508b;

        public C0297a(Animator animator) {
            this.f1507a = null;
            this.f1508b = animator;
        }

        public C0297a(Animation animation) {
            this.f1507a = animation;
            this.f1508b = null;
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    public static class C0298b extends AnimationSet implements Runnable {

        /* renamed from: e */
        public final ViewGroup f1509e;

        /* renamed from: f */
        public final View f1510f;

        /* renamed from: g */
        public boolean f1511g;

        /* renamed from: h */
        public boolean f1512h;

        /* renamed from: i */
        public boolean f1513i = true;

        public C0298b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1509e = viewGroup;
            this.f1510f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1513i = true;
            if (this.f1511g) {
                return !this.f1512h;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1511g = true;
                C1060n.m3018a(this.f1509e, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1513i = true;
            if (this.f1511g) {
                return !this.f1512h;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1511g = true;
                C1060n.m3018a(this.f1509e, this);
            }
            return true;
        }

        public void run() {
            if (this.f1511g || !this.f1513i) {
                this.f1509e.endViewTransition(this.f1510f);
                this.f1512h = true;
                return;
            }
            this.f1513i = false;
            this.f1509e.post(this);
        }
    }

    /* renamed from: a */
    public static C0297a m846a(Context context, C0286k kVar, boolean z, boolean z2) {
        C0286k.C0288b bVar = kVar.f1444M;
        boolean z3 = false;
        int i = bVar == null ? 0 : bVar.f1486h;
        int t = z2 ? z ? kVar.mo1640t() : kVar.mo1642u() : z ? kVar.mo1626k() : kVar.mo1631n();
        kVar.mo1617f0(0, 0, 0, 0);
        ViewGroup viewGroup = kVar.f1440I;
        if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            kVar.f1440I.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup2 = kVar.f1440I;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (t == 0 && i != 0) {
            t = i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (t != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(t));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, t);
                    if (loadAnimation != null) {
                        return new C0297a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, t);
                    if (loadAnimator != null) {
                        return new C0297a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, t);
                        if (loadAnimation2 != null) {
                            return new C0297a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }
}
