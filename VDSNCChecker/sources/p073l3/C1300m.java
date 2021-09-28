package p073l3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p072l2.C1241e;

/* renamed from: l3.m */
public final /* synthetic */ class C1300m implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f4309a;

    public /* synthetic */ C1300m(AtomicInteger atomicInteger) {
        this.f4309a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, C1241e.m3522p("CommonPool-worker-", Integer.valueOf(this.f4309a.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }
}
