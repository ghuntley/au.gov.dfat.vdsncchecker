package p118t0;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t0.m */
public abstract class C1779m {

    /* renamed from: a */
    public final Map<String, Object> f5413a = new HashMap();

    /* renamed from: b */
    public volatile boolean f5414b = false;

    /* renamed from: a */
    public <T> T mo6062a(String str) {
        T t;
        Map<String, Object> map = this.f5413a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f5413a.get(str);
        }
        return t;
    }

    /* renamed from: b */
    public void mo5809b() {
    }

    /* renamed from: c */
    public <T> T mo6063c(String str, T t) {
        T t2;
        synchronized (this.f5413a) {
            t2 = this.f5413a.get(str);
            if (t2 == null) {
                this.f5413a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f5414b && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }
}
