package p017c1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: c1.u */
public class C0616u extends C0615t {
    /* renamed from: b */
    public float mo2809b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: d */
    public void mo2814d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: e */
    public void mo2811e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: f */
    public void mo2815f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: g */
    public void mo2812g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: h */
    public void mo2813h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
