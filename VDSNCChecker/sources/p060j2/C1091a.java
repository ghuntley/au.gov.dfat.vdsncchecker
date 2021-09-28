package p060j2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: j2.a */
public class C1091a {

    /* renamed from: a */
    public static final int[] f3859a = {16842910, 16842919};

    /* renamed from: a */
    public static ColorStateList m3114a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f3859a, 0));
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m3115b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
