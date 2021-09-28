package p144x3;

import java.util.concurrent.ThreadFactory;

/* renamed from: x3.b */
public final class C2128b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f6167a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6168b;

    public C2128b(String str, boolean z) {
        this.f6167a = str;
        this.f6168b = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6167a);
        thread.setDaemon(this.f6168b);
        return thread;
    }
}
