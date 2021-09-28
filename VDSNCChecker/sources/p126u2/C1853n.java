package p126u2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.n */
public final class C1853n implements Map, Serializable, C0870a {

    /* renamed from: e */
    public static final C1853n f5543e = new C1853n();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            C1241e.m3517j((Void) obj, "value");
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C1854o.f5544e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C1854o.f5544e;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C1852m.f5542e;
    }
}
