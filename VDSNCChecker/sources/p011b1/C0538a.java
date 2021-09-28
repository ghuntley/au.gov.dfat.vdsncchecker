package p011b1;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b1.a */
public final class C0538a {

    /* renamed from: a */
    public static long f2329a;

    /* renamed from: b */
    public static Method f2330b;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m1785a() {
        try {
            if (f2330b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2330b == null) {
                f2329a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f2330b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f2330b.invoke((Object) null, new Object[]{Long.valueOf(f2329a)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
