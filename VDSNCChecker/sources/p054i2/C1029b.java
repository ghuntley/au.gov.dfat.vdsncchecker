package p054i2;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: i2.b */
public class C1029b {
    /* renamed from: a */
    public static TypedValue m2953a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m2954b(Context context, int i, boolean z) {
        TypedValue a = m2953a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    /* renamed from: c */
    public static int m2955c(Context context, int i, String str) {
        TypedValue a = m2953a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
