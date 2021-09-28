package p127u3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p019c3.C0625a;
import p072l2.C1241e;
import p103q3.C1615c;

/* renamed from: u3.c */
public final class C1860c {

    /* renamed from: a */
    public final Map<C1615c, Map<C1861a<Object>, Object>> f5550a = new ConcurrentHashMap(1);

    /* renamed from: u3.c$a */
    public static final class C1861a<T> {
    }

    /* renamed from: a */
    public final <T> T mo6374a(C1615c cVar, C1861a<T> aVar) {
        Map map = this.f5550a.get(cVar);
        T t = map == null ? null : map.get(aVar);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: b */
    public final <T> T mo6375b(C1615c cVar, C1861a<T> aVar, C0625a<? extends T> aVar2) {
        T a = mo6374a(cVar, aVar);
        if (a != null) {
            return a;
        }
        T b = aVar2.mo40b();
        C1241e.m3517j(b, "value");
        Map<C1615c, Map<C1861a<Object>, Object>> map = this.f5550a;
        Map<C1861a<Object>, Object> map2 = map.get(cVar);
        if (map2 == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1);
            map.put(cVar, concurrentHashMap);
            map2 = concurrentHashMap;
        }
        map2.put(aVar, b);
        return b;
    }
}
