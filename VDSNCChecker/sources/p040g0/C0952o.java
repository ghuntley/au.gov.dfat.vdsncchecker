package p040g0;

import android.os.Handler;
import java.util.concurrent.Callable;
import p052i0.C1022a;

/* renamed from: g0.o */
public class C0952o<T> implements Runnable {

    /* renamed from: e */
    public Callable<T> f3523e;

    /* renamed from: f */
    public C1022a<T> f3524f;

    /* renamed from: g */
    public Handler f3525g;

    /* renamed from: g0.o$a */
    public class C0953a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C1022a f3526e;

        /* renamed from: f */
        public final /* synthetic */ Object f3527f;

        public C0953a(C0952o oVar, C1022a aVar, Object obj) {
            this.f3526e = aVar;
            this.f3527f = obj;
        }

        public void run() {
            this.f3526e.mo4255a(this.f3527f);
        }
    }

    public C0952o(Handler handler, Callable<T> callable, C1022a<T> aVar) {
        this.f3523e = callable;
        this.f3524f = aVar;
        this.f3525g = handler;
    }

    public void run() {
        T t;
        try {
            t = this.f3523e.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f3525g.post(new C0953a(this, this.f3524f, t));
    }
}
