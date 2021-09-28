package p078m2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* renamed from: m2.e */
public class C1434e {

    /* renamed from: c */
    public static C1434e f4519c;

    /* renamed from: a */
    public final Object f4520a = new Object();

    /* renamed from: b */
    public final Handler f4521b = new Handler(Looper.getMainLooper(), new C1435a());

    /* renamed from: m2.e$a */
    public class C1435a implements Handler.Callback {
        public C1435a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C1434e eVar = C1434e.this;
            C1436b bVar = (C1436b) message.obj;
            synchronized (eVar.f4520a) {
                if (bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: m2.e$b */
    public static class C1436b {
    }
}
