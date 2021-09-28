package p089o1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p093p.C1558h;

/* renamed from: o1.g */
public class C1500g {

    /* renamed from: a */
    public final C1558h<String, C1501h> f4664a = new C1558h<>();

    /* renamed from: b */
    public final C1558h<String, PropertyValuesHolder[]> f4665b = new C1558h<>();

    /* renamed from: a */
    public static C1500g m4194a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m4195b(context, resourceId);
    }

    /* renamed from: b */
    public static C1500g m4195b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m4196c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m4196c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: c */
    public static C1500g m4196c(List<Animator> list) {
        C1500g gVar = new C1500g();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4665b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C1494a.f4653b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C1494a.f4654c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C1494a.f4655d;
                }
                C1501h hVar = new C1501h(startDelay, duration, interpolator);
                hVar.f4669d = objectAnimator.getRepeatCount();
                hVar.f4670e = objectAnimator.getRepeatMode();
                gVar.f4664a.put(propertyName, hVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public C1501h mo5410d(String str) {
        if (this.f4664a.getOrDefault(str, null) != null) {
            return this.f4664a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1500g)) {
            return false;
        }
        return this.f4664a.equals(((C1500g) obj).f4664a);
    }

    public int hashCode() {
        return this.f4664a.hashCode();
    }

    public String toString() {
        return 10 + C1500g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4664a + "}\n";
    }
}
