package p089o1;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p112s0.C1703a;
import p112s0.C1704b;
import p112s0.C1705c;
import p117t.C1751e;

/* renamed from: o1.a */
public class C1494a {

    /* renamed from: a */
    public static final TimeInterpolator f4652a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f4653b = new C1704b();

    /* renamed from: c */
    public static final TimeInterpolator f4654c = new C1703a();

    /* renamed from: d */
    public static final TimeInterpolator f4655d = new C1705c();

    /* renamed from: e */
    public static final TimeInterpolator f4656e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m4193a(float f, float f2, float f3) {
        return C1751e.m4875a(f2, f, f3, f);
    }
}
