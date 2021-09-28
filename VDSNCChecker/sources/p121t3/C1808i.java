package p121t3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p019c3.C0636l;
import p025d3.C0802f;
import p025d3.C0806j;
import p031e3.C0870a;
import p072l2.C1241e;
import p126u2.C1850k;
import p127u3.C1872l;

/* renamed from: t3.i */
public final class C1808i extends C1804e implements Map<String, C1804e>, C0870a {

    /* renamed from: e */
    public final Map<String, C1804e> f5466e;

    /* renamed from: t3.i$a */
    public static final class C1809a extends C0806j implements C0636l<Map.Entry<? extends String, ? extends C1804e>, CharSequence> {

        /* renamed from: f */
        public static final C1809a f5467f = new C1809a();

        public C1809a() {
            super(1);
        }

        /* renamed from: m */
        public Object mo2828m(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C1241e.m3517j(entry, "$dstr$k$v");
            StringBuilder sb = new StringBuilder();
            C1872l.m5131a(sb, (String) entry.getKey());
            sb.append(':');
            sb.append((C1804e) entry.getValue());
            String sb2 = sb.toString();
            C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    public C1808i(Map<String, ? extends C1804e> map) {
        super((C0802f) null);
        this.f5466e = map;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object compute(Object obj, BiFunction biFunction) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfAbsent(Object obj, Function function) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        C1241e.m3517j(str, "key");
        return this.f5466e.containsKey(str);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C1804e)) {
            return false;
        }
        C1804e eVar = (C1804e) obj;
        C1241e.m3517j(eVar, "value");
        return this.f5466e.containsValue(eVar);
    }

    public final Set<Map.Entry<String, C1804e>> entrySet() {
        return this.f5466e.entrySet();
    }

    public boolean equals(Object obj) {
        return C1241e.m3513b(this.f5466e, obj);
    }

    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C1241e.m3517j(str, "key");
        return this.f5466e.get(str);
    }

    public int hashCode() {
        return this.f5466e.hashCode();
    }

    public boolean isEmpty() {
        return this.f5466e.isEmpty();
    }

    public final Set<String> keySet() {
        return this.f5466e.keySet();
    }

    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        String str = (String) obj;
        C1804e eVar = (C1804e) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C1804e eVar = (C1804e) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends C1804e> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        String str = (String) obj;
        C1804e eVar = (C1804e) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object replace(Object obj, Object obj2) {
        String str = (String) obj;
        C1804e eVar = (C1804e) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super C1804e, ? extends C1804e> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f5466e.size();
    }

    public String toString() {
        return C1850k.m5051M(this.f5466e.entrySet(), ",", "{", "}", 0, (CharSequence) null, C1809a.f5467f, 24);
    }

    public final Collection<C1804e> values() {
        return this.f5466e.values();
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        C1804e eVar = (C1804e) obj2;
        C1804e eVar2 = (C1804e) obj3;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
