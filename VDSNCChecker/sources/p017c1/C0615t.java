package p017c1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: c1.t */
public class C0615t extends C0614s {

    /* renamed from: g */
    public static boolean f2471g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo2815f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2815f(view, i);
        } else if (f2471g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f2471g = false;
            }
        }
    }
}
