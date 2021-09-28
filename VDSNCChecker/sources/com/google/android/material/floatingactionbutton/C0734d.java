package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p030e2.C0867a;
import p036f2.C0895g;
import p039g.C0933a;
import p058j0.C1061o;
import p058j0.C1070q;
import p066k2.C1196b;
import p072l2.C1247i;
import p089o1.C1494a;
import p089o1.C1498e;
import p089o1.C1499f;
import p089o1.C1500g;
import p136w0.C2036r;

/* renamed from: com.google.android.material.floatingactionbutton.d */
public class C0734d {

    /* renamed from: A */
    public static final int[] f2831A = {16842908, 16842910};

    /* renamed from: B */
    public static final int[] f2832B = {16843623, 16842910};

    /* renamed from: C */
    public static final int[] f2833C = {16842910};

    /* renamed from: D */
    public static final int[] f2834D = new int[0];

    /* renamed from: x */
    public static final TimeInterpolator f2835x = C1494a.f4654c;

    /* renamed from: y */
    public static final int[] f2836y = {16842919, 16842910};

    /* renamed from: z */
    public static final int[] f2837z = {16843623, 16842908, 16842910};

    /* renamed from: a */
    public C1247i f2838a;

    /* renamed from: b */
    public boolean f2839b;

    /* renamed from: c */
    public boolean f2840c = true;

    /* renamed from: d */
    public float f2841d;

    /* renamed from: e */
    public float f2842e;

    /* renamed from: f */
    public float f2843f;

    /* renamed from: g */
    public final C0895g f2844g;

    /* renamed from: h */
    public C1500g f2845h;

    /* renamed from: i */
    public C1500g f2846i;

    /* renamed from: j */
    public Animator f2847j;

    /* renamed from: k */
    public C1500g f2848k;

    /* renamed from: l */
    public C1500g f2849l;

    /* renamed from: m */
    public float f2850m;

    /* renamed from: n */
    public float f2851n = 1.0f;

    /* renamed from: o */
    public int f2852o = 0;

    /* renamed from: p */
    public ArrayList<Animator.AnimatorListener> f2853p;

    /* renamed from: q */
    public ArrayList<Animator.AnimatorListener> f2854q;

    /* renamed from: r */
    public ArrayList<C0739e> f2855r;

    /* renamed from: s */
    public final FloatingActionButton f2856s;

    /* renamed from: t */
    public final C1196b f2857t;

    /* renamed from: u */
    public final Rect f2858u = new Rect();

    /* renamed from: v */
    public final Matrix f2859v;

    /* renamed from: w */
    public ViewTreeObserver.OnPreDrawListener f2860w;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class C0735a extends C1499f {
        public C0735a() {
        }

        public Object evaluate(float f, Object obj, Object obj2) {
            C0734d.this.f2851n = f;
            ((Matrix) obj).getValues(this.f4661a);
            ((Matrix) obj2).getValues(this.f4662b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f4662b;
                float f2 = fArr[i];
                float[] fArr2 = this.f4661a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f4663c.setValues(this.f4662b);
            return this.f4663c;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class C0736b extends C0742h {
        public C0736b(C0734d dVar) {
            super((C0732b) null);
        }

        /* renamed from: a */
        public float mo3726a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class C0737c extends C0742h {
        public C0737c() {
            super((C0732b) null);
        }

        /* renamed from: a */
        public float mo3726a() {
            C0734d dVar = C0734d.this;
            return dVar.f2841d + dVar.f2842e;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class C0738d extends C0742h {
        public C0738d() {
            super((C0732b) null);
        }

        /* renamed from: a */
        public float mo3726a() {
            C0734d dVar = C0734d.this;
            return dVar.f2841d + dVar.f2843f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public interface C0739e {
        /* renamed from: a */
        void mo3697a();

        /* renamed from: b */
        void mo3698b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    public interface C0740f {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    public class C0741g extends C0742h {
        public C0741g() {
            super((C0732b) null);
        }

        /* renamed from: a */
        public float mo3726a() {
            return C0734d.this.f2841d;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    public abstract class C0742h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f2865a;

        public C0742h(C0732b bVar) {
        }

        /* renamed from: a */
        public abstract float mo3726a();

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(C0734d.this);
            this.f2865a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f2865a) {
                Objects.requireNonNull(C0734d.this);
                mo3726a();
                this.f2865a = true;
            }
            C0734d dVar = C0734d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public C0734d(FloatingActionButton floatingActionButton, C1196b bVar) {
        new RectF();
        new RectF();
        this.f2859v = new Matrix();
        this.f2856s = floatingActionButton;
        this.f2857t = bVar;
        C0895g gVar = new C0895g();
        this.f2844g = gVar;
        gVar.mo4224a(f2836y, mo3707b(new C0738d()));
        gVar.mo4224a(f2837z, mo3707b(new C0737c()));
        gVar.mo4224a(f2831A, mo3707b(new C0737c()));
        gVar.mo4224a(f2832B, mo3707b(new C0737c()));
        gVar.mo4224a(f2833C, mo3707b(new C0741g()));
        gVar.mo4224a(f2834D, mo3707b(new C0736b(this)));
        this.f2850m = floatingActionButton.getRotation();
    }

    /* renamed from: a */
    public final AnimatorSet mo3706a(C1500g gVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f2856s, View.ALPHA, new float[]{f});
        gVar.mo5410d("opacity").mo5414a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f2856s, View.SCALE_X, new float[]{f2});
        gVar.mo5410d("scale").mo5414a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C0867a(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f2856s, View.SCALE_Y, new float[]{f2});
        gVar.mo5410d("scale").mo5414a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C0867a(this));
        }
        arrayList.add(ofFloat3);
        this.f2859v.reset();
        this.f2856s.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f2856s, new C1498e(), new C0735a(), new Matrix[]{new Matrix(this.f2859v)});
        gVar.mo5410d("iconScale").mo5414a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2036r.m5372j(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: b */
    public final ValueAnimator mo3707b(C0742h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f2835x);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: c */
    public float mo3708c() {
        throw null;
    }

    /* renamed from: d */
    public void mo3709d(Rect rect) {
        int i = 0;
        if (this.f2839b) {
            i = (0 - this.f2856s.getSizeDimension()) / 2;
        }
        float c = this.f2840c ? mo3708c() + this.f2843f : 0.0f;
        int max = Math.max(i, (int) Math.ceil((double) c));
        int max2 = Math.max(i, (int) Math.ceil((double) (c * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: e */
    public boolean mo3710e() {
        return this.f2856s.getVisibility() == 0 ? this.f2852o == 1 : this.f2852o != 2;
    }

    /* renamed from: f */
    public boolean mo3711f() {
        return this.f2856s.getVisibility() != 0 ? this.f2852o == 2 : this.f2852o != 1;
    }

    /* renamed from: g */
    public void mo3712g() {
        throw null;
    }

    /* renamed from: h */
    public void mo3713h() {
        throw null;
    }

    /* renamed from: i */
    public void mo3714i(int[] iArr) {
        throw null;
    }

    /* renamed from: j */
    public void mo3715j(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: k */
    public void mo3716k() {
        ArrayList<C0739e> arrayList = this.f2855r;
        if (arrayList != null) {
            Iterator<C0739e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3697a();
            }
        }
    }

    /* renamed from: l */
    public void mo3717l() {
        ArrayList<C0739e> arrayList = this.f2855r;
        if (arrayList != null) {
            Iterator<C0739e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3698b();
            }
        }
    }

    /* renamed from: m */
    public final void mo3718m(float f) {
        this.f2851n = f;
        Matrix matrix = this.f2859v;
        matrix.reset();
        this.f2856s.getDrawable();
        this.f2856s.setImageMatrix(matrix);
    }

    /* renamed from: n */
    public void mo3719n(ColorStateList colorStateList) {
        throw null;
    }

    /* renamed from: o */
    public boolean mo3720o() {
        throw null;
    }

    /* renamed from: p */
    public final boolean mo3721p() {
        FloatingActionButton floatingActionButton = this.f2856s;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return floatingActionButton.isLaidOut() && !this.f2856s.isInEditMode();
    }

    /* renamed from: q */
    public final boolean mo3722q() {
        return !this.f2839b || this.f2856s.getSizeDimension() >= 0;
    }

    /* renamed from: r */
    public void mo3723r() {
        throw null;
    }

    /* renamed from: s */
    public final void mo3724s() {
        Rect rect = this.f2858u;
        mo3709d(rect);
        C0933a.m2709c(null, "Didn't initialize content background");
        if (mo3720o()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.C0729b bVar = (FloatingActionButton.C0729b) this.f2857t;
            Objects.requireNonNull(bVar);
            C0734d.super.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.C0729b) this.f2857t);
        }
        C1196b bVar2 = this.f2857t;
        int i = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
