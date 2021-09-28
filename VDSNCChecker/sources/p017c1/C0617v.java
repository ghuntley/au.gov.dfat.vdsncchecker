package p017c1;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: c1.v */
public class C0617v {

    /* renamed from: a */
    public static Field f2472a;

    /* renamed from: b */
    public static boolean f2473b;

    /* renamed from: a */
    public void mo2808a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo2809b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo2810c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo2814d(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: e */
    public void mo2811e(View view, float f) {
        throw null;
    }

    /* renamed from: f */
    public void mo2815f(View view, int i) {
        if (!f2473b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2472a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2473b = true;
        }
        Field field = f2472a;
        if (field != null) {
            try {
                f2472a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo2812g(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: h */
    public void mo2813h(View view, Matrix matrix) {
        throw null;
    }
}
