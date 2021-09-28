package p112s0;

import android.view.animation.Interpolator;
import p117t.C1751e;

/* renamed from: s0.d */
public abstract class C1706d implements Interpolator {

    /* renamed from: a */
    public final float[] f5274a;

    /* renamed from: b */
    public final float f5275b;

    public C1706d(float[] fArr) {
        this.f5274a = fArr;
        this.f5275b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f5274a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f5275b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f5274a;
        return C1751e.m4875a(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}
