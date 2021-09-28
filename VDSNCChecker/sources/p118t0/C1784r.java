package p118t0;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t0.r */
public class C1784r {

    /* renamed from: a */
    public final HashMap<String, C1779m> f5419a = new HashMap<>();

    /* renamed from: a */
    public final void mo6067a() {
        for (C1779m next : this.f5419a.values()) {
            next.f5414b = true;
            Map<String, Object> map = next.f5413a;
            if (map != null) {
                synchronized (map) {
                    for (Object next2 : next.f5413a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            next.mo5809b();
        }
        this.f5419a.clear();
    }
}
