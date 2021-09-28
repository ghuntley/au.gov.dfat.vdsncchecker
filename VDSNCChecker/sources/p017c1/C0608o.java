package p017c1;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: c1.o */
public class C0608o {

    /* renamed from: a */
    public static boolean f2464a = true;

    /* renamed from: a */
    public static void m1978a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2464a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2464a = false;
            }
        }
    }
}
