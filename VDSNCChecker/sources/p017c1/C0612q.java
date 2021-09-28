package p017c1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c1.q */
public class C0612q extends C0617v {

    /* renamed from: c */
    public static boolean f2467c = true;

    /* renamed from: a */
    public void mo2808a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo2809b(View view) {
        if (f2467c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2467c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo2810c(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo2811e(View view, float f) {
        if (f2467c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f2467c = false;
            }
        }
        view.setAlpha(f);
    }
}
