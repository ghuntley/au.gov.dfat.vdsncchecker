package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.widget.i1 */
public class C0170i1 {

    /* renamed from: a */
    public static Method f801a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f801a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f801a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m489a(View view) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return view.getLayoutDirection() == 1;
    }
}
