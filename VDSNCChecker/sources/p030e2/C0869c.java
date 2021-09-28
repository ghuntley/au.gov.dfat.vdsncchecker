package p030e2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.C0734d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p066k2.C1196b;

/* renamed from: e2.c */
public class C0869c extends C0734d {
    public C0869c(FloatingActionButton floatingActionButton, C1196b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: c */
    public float mo3708c() {
        return this.f2856s.getElevation();
    }

    /* renamed from: d */
    public void mo3709d(Rect rect) {
        if (FloatingActionButton.this.f2815n) {
            super.mo3709d(rect);
            return;
        }
        int i = 0;
        if (!mo3722q()) {
            i = (0 - this.f2856s.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    /* renamed from: g */
    public void mo3712g() {
    }

    /* renamed from: h */
    public void mo3713h() {
        mo3724s();
        throw null;
    }

    /* renamed from: i */
    public void mo3714i(int[] iArr) {
    }

    /* renamed from: j */
    public void mo3715j(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C0734d.f2836y, mo4166t(f, f3));
        stateListAnimator.addState(C0734d.f2837z, mo4166t(f, f2));
        stateListAnimator.addState(C0734d.f2831A, mo4166t(f, f2));
        stateListAnimator.addState(C0734d.f2832B, mo4166t(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f2856s, "elevation", new float[]{f}).setDuration(0));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f2856s;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f2856s, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C0734d.f2835x);
        stateListAnimator.addState(C0734d.f2833C, animatorSet);
        stateListAnimator.addState(C0734d.f2834D, mo4166t(0.0f, 0.0f));
        this.f2856s.setStateListAnimator(stateListAnimator);
        if (mo3720o()) {
            mo3724s();
            throw null;
        }
    }

    /* renamed from: n */
    public void mo3719n(ColorStateList colorStateList) {
    }

    /* renamed from: o */
    public boolean mo3720o() {
        return FloatingActionButton.this.f2815n || !mo3722q();
    }

    /* renamed from: r */
    public void mo3723r() {
    }

    /* renamed from: t */
    public final Animator mo4166t(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f2856s, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f2856s, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C0734d.f2835x);
        return animatorSet;
    }
}
