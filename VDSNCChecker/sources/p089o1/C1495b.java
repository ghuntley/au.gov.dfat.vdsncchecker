package p089o1;

import android.animation.TypeEvaluator;
import p117t.C1751e;

/* renamed from: o1.b */
public class C1495b implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C1495b f4657a = new C1495b();

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float a = C1751e.m4875a(((float) ((intValue2 >> 24) & 255)) / 255.0f, f2, f, f2);
        float a2 = C1751e.m4875a(pow4, pow, f, pow);
        float a3 = C1751e.m4875a((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f, pow2);
        float a4 = C1751e.m4875a((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow((double) a2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) a4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a * 255.0f) << 24) | (Math.round(((float) Math.pow((double) a3, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
