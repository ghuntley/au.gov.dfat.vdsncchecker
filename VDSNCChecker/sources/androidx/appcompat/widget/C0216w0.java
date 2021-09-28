package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p016c0.C0557a;
import p039g.C0934b;
import p051i.C1021a;

/* renamed from: androidx.appcompat.widget.w0 */
public class C0216w0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f966a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f967b = {-16842910};

    /* renamed from: c */
    public static final int[] f968c = {16842908};

    /* renamed from: d */
    public static final int[] f969d = {16842919};

    /* renamed from: e */
    public static final int[] f970e = {16842912};

    /* renamed from: f */
    public static final int[] f971f = new int[0];

    /* renamed from: g */
    public static final int[] f972g = new int[1];

    /* renamed from: a */
    public static void m569a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0934b.f3468j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m570b(Context context, int i) {
        ColorStateList d = m572d(context, i);
        if (d != null && d.isStateful()) {
            return d.getColorForState(f967b, d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f966a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int c = m571c(context, i);
        return C0557a.m1819c(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: c */
    public static int m571c(Context context, int i) {
        int[] iArr = f972g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m572d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f972g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
