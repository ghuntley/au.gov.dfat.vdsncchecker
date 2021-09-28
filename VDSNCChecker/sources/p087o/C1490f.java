package p087o;

import android.graphics.drawable.Drawable;

/* renamed from: o.f */
public class C1490f extends Drawable {

    /* renamed from: a */
    public static final double f4649a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m4191a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f4649a) * ((double) f2)) + ((double) f));
    }

    /* renamed from: b */
    public static float m4192b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        return (float) (((1.0d - f4649a) * ((double) f2)) + ((double) f3));
    }
}
