package p017c1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: c1.r */
public class C0613r extends C0612q {

    /* renamed from: d */
    public static boolean f2468d = true;

    /* renamed from: e */
    public static boolean f2469e = true;

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo2812g(View view, Matrix matrix) {
        if (f2468d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2468d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo2813h(View view, Matrix matrix) {
        if (f2469e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2469e = false;
            }
        }
    }
}
