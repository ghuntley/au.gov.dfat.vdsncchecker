package p073l3;

import java.lang.Thread;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p042g2.C0955a;
import p061j3.C1097e;
import p061j3.C1099g;
import p138w2.C2046f;

/* renamed from: l3.y */
public final class C1329y {

    /* renamed from: a */
    public static final List<CoroutineExceptionHandler> f4336a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        f4336a = C1097e.m3119I(C1099g.m3120H(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m3735a(C2046f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : f4336a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C0955a.m2727a(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
