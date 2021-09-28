package p128u4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: u4.v */
public class C1946v {

    /* renamed from: c */
    public static final C1946v f5705c = ("Dalvik".equals(System.getProperty("java.vm.name")) ? new C1947a() : new C1946v(true));

    /* renamed from: a */
    public final boolean f5706a;
    @Nullable

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f5707b;

    /* renamed from: u4.v$a */
    public static final class C1947a extends C1946v {

        /* renamed from: u4.v$a$a */
        public static final class C1948a implements Executor {

            /* renamed from: e */
            public final Handler f5708e = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f5708e.post(runnable);
            }
        }

        public C1947a() {
            super(true);
        }

        /* renamed from: a */
        public Executor mo6441a() {
            return new C1948a();
        }

        @Nullable
        /* renamed from: b */
        public Object mo6442b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return C1946v.super.mo6442b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C1946v(boolean z) {
        this.f5706a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f5707b = constructor;
    }

    @Nullable
    /* renamed from: a */
    public Executor mo6441a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: b */
    public Object mo6442b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f5707b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
