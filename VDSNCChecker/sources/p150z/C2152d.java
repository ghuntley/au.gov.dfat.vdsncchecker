package p150z;

import java.lang.reflect.Method;

/* renamed from: z.d */
public class C2152d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Object f6214e;

    /* renamed from: f */
    public final /* synthetic */ Object f6215f;

    public C2152d(Object obj, Object obj2) {
        this.f6214e = obj;
        this.f6215f = obj2;
    }

    public void run() {
        try {
            Method method = C2148c.f6200d;
            if (method != null) {
                method.invoke(this.f6214e, new Object[]{this.f6215f, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            C2148c.f6201e.invoke(this.f6214e, new Object[]{this.f6215f, Boolean.FALSE});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
