package p017c1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c1.s */
public class C0614s extends C0613r {

    /* renamed from: f */
    public static boolean f2470f = true;

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo2814d(View view, int i, int i2, int i3, int i4) {
        if (f2470f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2470f = false;
            }
        }
    }
}
