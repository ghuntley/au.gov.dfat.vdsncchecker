package p054i2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0136b1;
import p051i.C1021a;

/* renamed from: i2.c */
public class C1030c {
    /* renamed from: a */
    public static ColorStateList m2956a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static ColorStateList m2957b(Context context, C0136b1 b1Var, int i) {
        int resourceId;
        if (b1Var.f692b.hasValue(i) && (resourceId = b1Var.f692b.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return b1Var.mo763c(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = p051i.C1021a.m2945a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m2958c(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = p051i.C1021a.m2945a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054i2.C1030c.m2958c(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: d */
    public static boolean m2959d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: e */
    public static boolean m2960e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
