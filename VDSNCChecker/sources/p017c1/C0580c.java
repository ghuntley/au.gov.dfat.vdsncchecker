package p017c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: c1.c */
public class C0580c extends C0619x {

    /* renamed from: c1.c$a */
    public class C0581a extends C0599j {

        /* renamed from: a */
        public final /* synthetic */ View f2399a;

        public C0581a(C0580c cVar, View view) {
            this.f2399a = view;
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            View view = this.f2399a;
            C0617v vVar = C0609p.f2465a;
            vVar.mo2811e(view, 1.0f);
            vVar.mo2808a(this.f2399a);
            gVar.mo2762A(this);
        }
    }

    /* renamed from: c1.c$b */
    public static class C0582b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f2400a;

        /* renamed from: b */
        public boolean f2401b = false;

        public C0582b(View view) {
            this.f2400a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0609p.f2465a.mo2811e(this.f2400a, 1.0f);
            if (this.f2401b) {
                this.f2400a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f2400a;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (view.hasOverlappingRendering() && this.f2400a.getLayerType() == 0) {
                this.f2401b = true;
                this.f2400a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0580c(int i) {
        if ((i & -4) == 0) {
            this.f2479B = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: O */
    public Animator mo2740O(ViewGroup viewGroup, View view, C0607n nVar, C0607n nVar2) {
        C0609p.f2465a.mo2810c(view);
        Float f = (Float) nVar.f2461a.get("android:fade:transitionAlpha");
        return mo2741P(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    /* renamed from: P */
    public final Animator mo2741P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0609p.f2465a.mo2811e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0609p.f2466b, new float[]{f2});
        ofFloat.addListener(new C0582b(view));
        mo2774b(new C0581a(this, view));
        return ofFloat;
    }

    /* renamed from: l */
    public void mo2721l(C0607n nVar) {
        mo2816M(nVar);
        nVar.f2461a.put("android:fade:transitionAlpha", Float.valueOf(C0609p.m1979a(nVar.f2462b)));
    }
}
