package p079m3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import p042g2.C0955a;
import p120t2.C1792f;

/* renamed from: m3.c */
public final class C1439c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new C1437a(m4095a(Looper.getMainLooper(), true), (String) null, false);
        } catch (Throwable th) {
            obj = C0955a.m2736j(th);
        }
        if (!(obj instanceof C1792f.C1793a)) {
            obj2 = obj;
        }
        C1438b bVar = (C1438b) obj2;
    }

    /* renamed from: a */
    public static final Handler m4095a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
