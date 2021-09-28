package p126u2;

import java.util.Map;
import java.util.NoSuchElementException;
import p042g2.C0955a;
import p072l2.C1241e;
import p120t2.C1791e;

/* renamed from: u2.r */
public class C1857r extends C0955a {
    /* renamed from: H */
    public static final <K, V> V m5060H(Map<K, ? extends V> map, K k) {
        C1241e.m3517j(map, "$this$getValue");
        if (map instanceof C1856q) {
            return ((C1856q) map).mo6366a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    /* renamed from: I */
    public static final <K, V, M extends Map<? super K, ? super V>> M m5061I(Iterable<? extends C1791e<? extends K, ? extends V>> iterable, M m) {
        for (C1791e eVar : iterable) {
            m.put(eVar.f5439e, eVar.f5440f);
        }
        return m;
    }
}
