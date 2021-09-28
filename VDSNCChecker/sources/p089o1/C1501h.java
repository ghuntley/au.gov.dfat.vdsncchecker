package p089o1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: o1.h */
public class C1501h {

    /* renamed from: a */
    public long f4666a = 0;

    /* renamed from: b */
    public long f4667b = 300;

    /* renamed from: c */
    public TimeInterpolator f4668c = null;

    /* renamed from: d */
    public int f4669d = 0;

    /* renamed from: e */
    public int f4670e = 1;

    public C1501h(long j, long j2) {
        this.f4666a = j;
        this.f4667b = j2;
    }

    public C1501h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4666a = j;
        this.f4667b = j2;
        this.f4668c = timeInterpolator;
    }

    /* renamed from: a */
    public void mo5414a(Animator animator) {
        animator.setStartDelay(this.f4666a);
        animator.setDuration(this.f4667b);
        animator.setInterpolator(mo5415b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4669d);
            valueAnimator.setRepeatMode(this.f4670e);
        }
    }

    /* renamed from: b */
    public TimeInterpolator mo5415b() {
        TimeInterpolator timeInterpolator = this.f4668c;
        return timeInterpolator != null ? timeInterpolator : C1494a.f4653b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1501h)) {
            return false;
        }
        C1501h hVar = (C1501h) obj;
        if (this.f4666a == hVar.f4666a && this.f4667b == hVar.f4667b && this.f4669d == hVar.f4669d && this.f4670e == hVar.f4670e) {
            return mo5415b().getClass().equals(hVar.mo5415b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4666a;
        long j2 = this.f4667b;
        return ((((mo5415b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f4669d) * 31) + this.f4670e;
    }

    public String toString() {
        return 10 + C1501h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4666a + " duration: " + this.f4667b + " interpolator: " + mo5415b().getClass() + " repeatCount: " + this.f4669d + " repeatMode: " + this.f4670e + "}\n";
    }
}
