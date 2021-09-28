package p045h;

import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: h.p */
public class C0991p {

    /* renamed from: a */
    public static Field f3646a;

    /* renamed from: b */
    public static boolean f3647b;

    /* renamed from: c */
    public static Class<?> f3648c;

    /* renamed from: d */
    public static boolean f3649d;

    /* renamed from: e */
    public static Field f3650e;

    /* renamed from: f */
    public static boolean f3651f;

    /* renamed from: g */
    public static Field f3652g;

    /* renamed from: h */
    public static boolean f3653h;

    /* renamed from: a */
    public static void m2898a(Object obj) {
        if (!f3649d) {
            try {
                f3648c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f3649d = true;
        }
        Class<?> cls = f3648c;
        if (cls != null) {
            if (!f3651f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f3650e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f3651f = true;
            }
            Field field = f3650e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
