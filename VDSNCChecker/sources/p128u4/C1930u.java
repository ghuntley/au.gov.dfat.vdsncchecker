package p128u4;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import p000a.C0001b;
import p016c0.C0559c;
import p062j4.C1112f;
import p063k.C1142f;
import p072l2.C1241e;
import p099q.C1589b;
import p128u4.C1874a;
import p139w3.C2053a0;
import p139w3.C2070f0;
import p139w3.C2103w;

/* renamed from: u4.u */
public abstract class C1930u<T> {

    /* renamed from: u4.u$a */
    public static final class C1931a<T> extends C1930u<T> {

        /* renamed from: a */
        public final Method f5666a;

        /* renamed from: b */
        public final int f5667b;

        /* renamed from: c */
        public final C1896f<T, C2070f0> f5668c;

        public C1931a(Method method, int i, C1896f<T, C2070f0> fVar) {
            this.f5666a = method;
            this.f5667b = i;
            this.f5668c = fVar;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            if (t != null) {
                try {
                    wVar.f5721k = this.f5668c.mo6398a(t);
                } catch (IOException e) {
                    Method method = this.f5666a;
                    int i = this.f5667b;
                    throw C1903g0.m5193m(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw C1903g0.m5192l(this.f5666a, this.f5667b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: u4.u$b */
    public static final class C1932b<T> extends C1930u<T> {

        /* renamed from: a */
        public final String f5669a;

        /* renamed from: b */
        public final C1896f<T, String> f5670b;

        /* renamed from: c */
        public final boolean f5671c;

        public C1932b(String str, C1896f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f5669a = str;
            this.f5670b = fVar;
            this.f5671c = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f5670b.mo6398a(t)) != null) {
                wVar.mo6444a(this.f5669a, a, this.f5671c);
            }
        }
    }

    /* renamed from: u4.u$c */
    public static final class C1933c<T> extends C1930u<Map<String, T>> {

        /* renamed from: a */
        public final Method f5672a;

        /* renamed from: b */
        public final int f5673b;

        /* renamed from: c */
        public final boolean f5674c;

        public C1933c(Method method, int i, C1896f<T, String> fVar, boolean z) {
            this.f5672a = method;
            this.f5673b = i;
            this.f5674c = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wVar.mo6444a(str, obj2, this.f5674c);
                            } else {
                                Method method = this.f5672a;
                                int i = this.f5673b;
                                throw C1903g0.m5192l(method, i, "Field map value '" + value + "' converted to null by " + C1874a.C1878d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C1903g0.m5192l(this.f5672a, this.f5673b, C0559c.m1823a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C1903g0.m5192l(this.f5672a, this.f5673b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1903g0.m5192l(this.f5672a, this.f5673b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: u4.u$d */
    public static final class C1934d<T> extends C1930u<T> {

        /* renamed from: a */
        public final String f5675a;

        /* renamed from: b */
        public final C1896f<T, String> f5676b;

        public C1934d(String str, C1896f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f5675a = str;
            this.f5676b = fVar;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f5676b.mo6398a(t)) != null) {
                wVar.mo6445b(this.f5675a, a);
            }
        }
    }

    /* renamed from: u4.u$e */
    public static final class C1935e<T> extends C1930u<Map<String, T>> {

        /* renamed from: a */
        public final Method f5677a;

        /* renamed from: b */
        public final int f5678b;

        public C1935e(Method method, int i, C1896f<T, String> fVar) {
            this.f5677a = method;
            this.f5678b = i;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wVar.mo6445b(str, value.toString());
                        } else {
                            throw C1903g0.m5192l(this.f5677a, this.f5678b, C0559c.m1823a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C1903g0.m5192l(this.f5677a, this.f5678b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1903g0.m5192l(this.f5677a, this.f5678b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: u4.u$f */
    public static final class C1936f extends C1930u<C2103w> {

        /* renamed from: a */
        public final Method f5679a;

        /* renamed from: b */
        public final int f5680b;

        public C1936f(Method method, int i) {
            this.f5679a = method;
            this.f5680b = i;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            C2103w wVar2 = (C2103w) obj;
            if (wVar2 != null) {
                C2103w.C2104a aVar = wVar.f5716f;
                Objects.requireNonNull(aVar);
                C1241e.m3517j(wVar2, "headers");
                int size = wVar2.size();
                for (int i = 0; i < size; i++) {
                    aVar.mo6621b(wVar2.mo6612c(i), wVar2.mo6614e(i));
                }
                return;
            }
            throw C1903g0.m5192l(this.f5679a, this.f5680b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: u4.u$g */
    public static final class C1937g<T> extends C1930u<T> {

        /* renamed from: a */
        public final Method f5681a;

        /* renamed from: b */
        public final int f5682b;

        /* renamed from: c */
        public final C2103w f5683c;

        /* renamed from: d */
        public final C1896f<T, C2070f0> f5684d;

        public C1937g(Method method, int i, C2103w wVar, C1896f<T, C2070f0> fVar) {
            this.f5681a = method;
            this.f5682b = i;
            this.f5683c = wVar;
            this.f5684d = fVar;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            if (t != null) {
                try {
                    wVar.mo6446c(this.f5683c, this.f5684d.mo6398a(t));
                } catch (IOException e) {
                    Method method = this.f5681a;
                    int i = this.f5682b;
                    throw C1903g0.m5192l(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: u4.u$h */
    public static final class C1938h<T> extends C1930u<Map<String, T>> {

        /* renamed from: a */
        public final Method f5685a;

        /* renamed from: b */
        public final int f5686b;

        /* renamed from: c */
        public final C1896f<T, C2070f0> f5687c;

        /* renamed from: d */
        public final String f5688d;

        public C1938h(Method method, int i, C1896f<T, C2070f0> fVar, String str) {
            this.f5685a = method;
            this.f5686b = i;
            this.f5687c = fVar;
            this.f5688d = str;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wVar.mo6446c(C2103w.f6111f.mo6626c("Content-Disposition", C0559c.m1823a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f5688d), this.f5687c.mo6398a(value));
                        } else {
                            throw C1903g0.m5192l(this.f5685a, this.f5686b, C0559c.m1823a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C1903g0.m5192l(this.f5685a, this.f5686b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1903g0.m5192l(this.f5685a, this.f5686b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: u4.u$i */
    public static final class C1939i<T> extends C1930u<T> {

        /* renamed from: a */
        public final Method f5689a;

        /* renamed from: b */
        public final int f5690b;

        /* renamed from: c */
        public final String f5691c;

        /* renamed from: d */
        public final C1896f<T, String> f5692d;

        /* renamed from: e */
        public final boolean f5693e;

        public C1939i(Method method, int i, String str, C1896f<T, String> fVar, boolean z) {
            this.f5689a = method;
            this.f5690b = i;
            Objects.requireNonNull(str, "name == null");
            this.f5691c = str;
            this.f5692d = fVar;
            this.f5693e = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            String str;
            int i;
            int i2;
            C1949w wVar2 = wVar;
            T t2 = t;
            if (t2 != null) {
                String str2 = this.f5691c;
                String a = this.f5692d.mo6398a(t2);
                boolean z = this.f5693e;
                if (wVar2.f5713c != null) {
                    int length = a.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            str = a;
                            break;
                        }
                        int codePointAt = a.codePointAt(i3);
                        i = 47;
                        i2 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            C1112f fVar = new C1112f();
                            fVar.mo4641d0(a, 0, i3);
                            C1112f fVar2 = null;
                        } else {
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    C1112f fVar3 = new C1112f();
                    fVar3.mo4641d0(a, 0, i3);
                    C1112f fVar22 = null;
                    while (i3 < length) {
                        int codePointAt2 = a.codePointAt(i3);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i2 || (!z && (codePointAt2 == i || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new C1112f();
                                }
                                fVar22.mo4643e0(codePointAt2);
                                while (!fVar22.mo4619I()) {
                                    byte P = fVar22.mo4625P() & 255;
                                    fVar3.mo4633X(37);
                                    char[] cArr = C1949w.f5709l;
                                    fVar3.mo4633X(cArr[(P >> 4) & 15]);
                                    fVar3.mo4633X(cArr[P & 15]);
                                }
                            } else {
                                fVar3.mo4643e0(codePointAt2);
                            }
                        }
                        i3 += Character.charCount(codePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    str = fVar3.mo4620J();
                    String replace = wVar2.f5713c.replace("{" + str2 + "}", str);
                    if (!C1949w.f5710m.matcher(replace).matches()) {
                        wVar2.f5713c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(C1142f.m3365a("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a));
                }
                throw new AssertionError();
            }
            throw C1903g0.m5192l(this.f5689a, this.f5690b, C1589b.m4444a(C0001b.m0a("Path parameter \""), this.f5691c, "\" value must not be null."), new Object[0]);
        }
    }

    /* renamed from: u4.u$j */
    public static final class C1940j<T> extends C1930u<T> {

        /* renamed from: a */
        public final String f5694a;

        /* renamed from: b */
        public final C1896f<T, String> f5695b;

        /* renamed from: c */
        public final boolean f5696c;

        public C1940j(String str, C1896f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f5694a = str;
            this.f5695b = fVar;
            this.f5696c = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f5695b.mo6398a(t)) != null) {
                wVar.mo6447d(this.f5694a, a, this.f5696c);
            }
        }
    }

    /* renamed from: u4.u$k */
    public static final class C1941k<T> extends C1930u<Map<String, T>> {

        /* renamed from: a */
        public final Method f5697a;

        /* renamed from: b */
        public final int f5698b;

        /* renamed from: c */
        public final boolean f5699c;

        public C1941k(Method method, int i, C1896f<T, String> fVar, boolean z) {
            this.f5697a = method;
            this.f5698b = i;
            this.f5699c = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wVar.mo6447d(str, obj2, this.f5699c);
                            } else {
                                Method method = this.f5697a;
                                int i = this.f5698b;
                                throw C1903g0.m5192l(method, i, "Query map value '" + value + "' converted to null by " + C1874a.C1878d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C1903g0.m5192l(this.f5697a, this.f5698b, C0559c.m1823a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C1903g0.m5192l(this.f5697a, this.f5698b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1903g0.m5192l(this.f5697a, this.f5698b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: u4.u$l */
    public static final class C1942l<T> extends C1930u<T> {

        /* renamed from: a */
        public final boolean f5700a;

        public C1942l(C1896f<T, String> fVar, boolean z) {
            this.f5700a = z;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            if (t != null) {
                wVar.mo6447d(t.toString(), (String) null, this.f5700a);
            }
        }
    }

    /* renamed from: u4.u$m */
    public static final class C1943m extends C1930u<C2053a0.C2055b> {

        /* renamed from: a */
        public static final C1943m f5701a = new C1943m();

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            C2053a0.C2055b bVar = (C2053a0.C2055b) obj;
            if (bVar != null) {
                C2053a0.C2054a aVar = wVar.f5719i;
                Objects.requireNonNull(aVar);
                C1241e.m3517j(bVar, "part");
                aVar.f5911c.add(bVar);
            }
        }
    }

    /* renamed from: u4.u$n */
    public static final class C1944n extends C1930u<Object> {

        /* renamed from: a */
        public final Method f5702a;

        /* renamed from: b */
        public final int f5703b;

        public C1944n(Method method, int i) {
            this.f5702a = method;
            this.f5703b = i;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable Object obj) {
            if (obj != null) {
                Objects.requireNonNull(wVar);
                wVar.f5713c = obj.toString();
                return;
            }
            throw C1903g0.m5192l(this.f5702a, this.f5703b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: u4.u$o */
    public static final class C1945o<T> extends C1930u<T> {

        /* renamed from: a */
        public final Class<T> f5704a;

        public C1945o(Class<T> cls) {
            this.f5704a = cls;
        }

        /* renamed from: a */
        public void mo6440a(C1949w wVar, @Nullable T t) {
            wVar.f5715e.mo6548d(this.f5704a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo6440a(C1949w wVar, @Nullable T t);
}
