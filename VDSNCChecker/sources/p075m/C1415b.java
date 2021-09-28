package p075m;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
public class C1415b extends C1417c {

    /* renamed from: a */
    public final Object f4467a = new Object();

    /* renamed from: b */
    public final ExecutorService f4468b = Executors.newFixedThreadPool(4, new C1416a(this));

    /* renamed from: m.b$a */
    public class C1416a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f4469a = new AtomicInteger(0);

        public C1416a(C1415b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f4469a.getAndIncrement())}));
            return thread;
        }
    }

    public C1415b() {
        super(0);
    }

    /* renamed from: f */
    public boolean mo5247f() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
