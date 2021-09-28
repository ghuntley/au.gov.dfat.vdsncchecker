package p030e2;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.google.android.material.floatingactionbutton.C0734d;

/* renamed from: e2.a */
public class C0867a implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f3324a = new FloatEvaluator();

    public C0867a(C0734d dVar) {
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f3324a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
