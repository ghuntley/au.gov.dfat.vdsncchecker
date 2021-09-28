package p040g0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: g0.n */
public class C0950n implements ThreadFactory {

    /* renamed from: a */
    public String f3520a;

    /* renamed from: b */
    public int f3521b;

    /* renamed from: g0.n$a */
    public static class C0951a extends Thread {

        /* renamed from: e */
        public final int f3522e;

        public C0951a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f3522e = i;
        }

        public void run() {
            Process.setThreadPriority(this.f3522e);
            super.run();
        }
    }

    public C0950n(String str, int i) {
        this.f3520a = str;
        this.f3521b = i;
    }

    public Thread newThread(Runnable runnable) {
        return new C0951a(runnable, this.f3520a, this.f3521b);
    }
}
