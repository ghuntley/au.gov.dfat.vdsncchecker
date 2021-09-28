package p017c1;

import android.os.Build;

/* renamed from: c1.m */
public class C0606m {

    /* renamed from: a */
    public static final boolean f2458a = true;

    /* renamed from: b */
    public static final boolean f2459b = true;

    /* renamed from: c */
    public static final boolean f2460c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f2460c = z;
    }
}
