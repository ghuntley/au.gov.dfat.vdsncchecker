package p139w3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p000a.C0001b;
import p014b4.C0547f;
import p016c0.C0559c;
import p042g2.C0955a;
import p072l2.C1241e;
import p120t2.C1791e;
import p126u2.C1853n;
import p139w3.C2103w;
import p144x3.C2129c;

/* renamed from: w3.d0 */
public final class C2063d0 {

    /* renamed from: a */
    public C2065e f5972a;

    /* renamed from: b */
    public final C2106x f5973b;

    /* renamed from: c */
    public final String f5974c;

    /* renamed from: d */
    public final C2103w f5975d;

    /* renamed from: e */
    public final C2070f0 f5976e;

    /* renamed from: f */
    public final Map<Class<?>, Object> f5977f;

    /* renamed from: w3.d0$a */
    public static class C2064a {

        /* renamed from: a */
        public C2106x f5978a;

        /* renamed from: b */
        public String f5979b;

        /* renamed from: c */
        public C2103w.C2104a f5980c;

        /* renamed from: d */
        public C2070f0 f5981d;

        /* renamed from: e */
        public Map<Class<?>, Object> f5982e;

        public C2064a() {
            this.f5982e = new LinkedHashMap();
            this.f5979b = "GET";
            this.f5980c = new C2103w.C2104a();
        }

        public C2064a(C2063d0 d0Var) {
            LinkedHashMap linkedHashMap;
            this.f5982e = new LinkedHashMap();
            this.f5978a = d0Var.f5973b;
            this.f5979b = d0Var.f5974c;
            this.f5981d = d0Var.f5976e;
            if (d0Var.f5977f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = d0Var.f5977f;
                C1241e.m3517j(map, "$this$toMutableMap");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.f5982e = linkedHashMap;
            this.f5980c = d0Var.f5975d.mo6613d();
        }

        /* renamed from: a */
        public C2063d0 mo6545a() {
            Map map;
            C2106x xVar = this.f5978a;
            if (xVar != null) {
                String str = this.f5979b;
                C2103w c = this.f5980c.mo6622c();
                C2070f0 f0Var = this.f5981d;
                Map<Class<?>, Object> map2 = this.f5982e;
                byte[] bArr = C2129c.f6169a;
                C1241e.m3517j(map2, "$this$toImmutableMap");
                if (map2.isEmpty()) {
                    map = C1853n.f5543e;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    C1241e.m3516f(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new C2063d0(xVar, str, c, f0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: b */
        public C2064a mo6546b(String str, String str2) {
            C1241e.m3517j(str2, "value");
            C2103w.C2104a aVar = this.f5980c;
            Objects.requireNonNull(aVar);
            C2103w.C2105b bVar = C2103w.f6111f;
            bVar.mo6624a(str);
            bVar.mo6625b(str2, str);
            aVar.mo6623d(str);
            aVar.mo6621b(str, str2);
            return this;
        }

        /* renamed from: c */
        public C2064a mo6547c(String str, C2070f0 f0Var) {
            C1241e.m3517j(str, "method");
            boolean z = false;
            if (str.length() > 0) {
                if (f0Var == null) {
                    C1241e.m3517j(str, "method");
                    if (C1241e.m3513b(str, "POST") || C1241e.m3513b(str, "PUT") || C1241e.m3513b(str, "PATCH") || C1241e.m3513b(str, "PROPPATCH") || C1241e.m3513b(str, "REPORT")) {
                        z = true;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(C0559c.m1823a("method ", str, " must have a request body.").toString());
                    }
                } else if (!C0547f.m1800a(str)) {
                    throw new IllegalArgumentException(C0559c.m1823a("method ", str, " must not have a request body.").toString());
                }
                this.f5979b = str;
                this.f5981d = f0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: d */
        public <T> C2064a mo6548d(Class<? super T> cls, T t) {
            C1241e.m3517j(cls, "type");
            if (t == null) {
                this.f5982e.remove(cls);
            } else {
                if (this.f5982e.isEmpty()) {
                    this.f5982e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f5982e;
                Object cast = cls.cast(t);
                C1241e.m3515e(cast);
                map.put(cls, cast);
            }
            return this;
        }

        /* renamed from: e */
        public C2064a mo6549e(C2106x xVar) {
            C1241e.m3517j(xVar, "url");
            this.f5978a = xVar;
            return this;
        }
    }

    public C2063d0(C2106x xVar, String str, C2103w wVar, C2070f0 f0Var, Map<Class<?>, ? extends Object> map) {
        C1241e.m3517j(str, "method");
        this.f5973b = xVar;
        this.f5974c = str;
        this.f5975d = wVar;
        this.f5976e = f0Var;
        this.f5977f = map;
    }

    /* renamed from: a */
    public final C2065e mo6542a() {
        C2065e eVar = this.f5972a;
        if (eVar != null) {
            return eVar;
        }
        C2065e b = C2065e.f5983n.mo6552b(this.f5975d);
        this.f5972a = b;
        return b;
    }

    /* renamed from: b */
    public final String mo6543b(String str) {
        return this.f5975d.mo6611b(str);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Request{method=");
        a.append(this.f5974c);
        a.append(", url=");
        a.append(this.f5973b);
        if (this.f5975d.size() != 0) {
            a.append(", headers=[");
            int i = 0;
            for (Object next : this.f5975d) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1791e eVar = (C1791e) next;
                    String str = (String) eVar.f5439e;
                    String str2 = (String) eVar.f5440f;
                    if (i > 0) {
                        a.append(", ");
                    }
                    a.append(str);
                    a.append(':');
                    a.append(str2);
                    i = i2;
                } else {
                    C0955a.m2723D();
                    throw null;
                }
            }
            a.append(']');
        }
        if (!this.f5977f.isEmpty()) {
            a.append(", tags=");
            a.append(this.f5977f);
        }
        a.append('}');
        String sb = a.toString();
        C1241e.m3516f(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
