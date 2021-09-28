package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import p000a.C0001b;
import p016c0.C0559c;
import p128u4.C1874a;
import p128u4.C1896f;
import p128u4.C1903g0;
import p128u4.C1909j;
import p128u4.C1930u;
import p128u4.C1953z;
import p134v4.C1972a;
import p134v4.C1973b;
import p134v4.C1974c;
import p134v4.C1975d;
import p134v4.C1976e;
import p134v4.C1977f;
import p134v4.C1978g;
import p134v4.C1979h;
import p134v4.C1980i;
import p134v4.C1981j;
import p134v4.C1982k;
import p134v4.C1983l;
import p134v4.C1984m;
import p134v4.C1985n;
import p134v4.C1986o;
import p134v4.C1987p;
import p134v4.C1988q;
import p134v4.C1989r;
import p134v4.C1990s;
import p134v4.C1991t;
import p134v4.C1992u;
import p134v4.C1993v;
import p134v4.C1995x;
import p134v4.C1996y;
import p138w2.C2043d;
import p139w3.C2053a0;
import p139w3.C2068f;
import p139w3.C2072g0;
import p139w3.C2103w;
import p139w3.C2106x;
import p139w3.C2111z;
import retrofit2.ParameterHandler;

/* renamed from: u4.d0 */
public abstract class C1888d0<T> {
    /* renamed from: b */
    public static <T> C1888d0<T> m5158b(C1886c0 c0Var, Method method) {
        Type type;
        boolean z;
        String str;
        int i;
        int i2;
        ParameterHandler<?> parameterHandler;
        Type type2;
        String str2;
        int i3;
        Type type3;
        ParameterHandler<?> parameterHandler2;
        ParameterHandler<?> parameterHandler3;
        ParameterHandler<?> parameterHandler4;
        ParameterHandler<?> parameterHandler5;
        ParameterHandler<?> parameterHandler6;
        ParameterHandler<?> parameterHandler7;
        String str3;
        String str4;
        String str5;
        String str6;
        String value;
        String str7;
        C1953z.C1954a aVar = new C1953z.C1954a(c0Var, method);
        Annotation[] annotationArr = aVar.f5739c;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        loop0:
        while (true) {
            String str8 = "HEAD";
            int i6 = 1;
            if (i5 < length) {
                Annotation annotation = annotationArr[i5];
                if (annotation instanceof C1973b) {
                    value = ((C1973b) annotation).value();
                    str7 = "DELETE";
                } else if (annotation instanceof C1977f) {
                    value = ((C1977f) annotation).value();
                    str7 = "GET";
                } else if (annotation instanceof C1978g) {
                    str3 = ((C1978g) annotation).value();
                    aVar.mo6451b(str8, str3, false);
                    i5++;
                } else {
                    if (annotation instanceof C1985n) {
                        str5 = ((C1985n) annotation).value();
                        str4 = "PATCH";
                    } else if (annotation instanceof C1986o) {
                        str5 = ((C1986o) annotation).value();
                        str4 = "POST";
                    } else if (annotation instanceof C1987p) {
                        str5 = ((C1987p) annotation).value();
                        str4 = "PUT";
                    } else if (annotation instanceof C1984m) {
                        value = ((C1984m) annotation).value();
                        str7 = "OPTIONS";
                    } else {
                        if (annotation instanceof C1979h) {
                            C1979h hVar = (C1979h) annotation;
                            aVar.mo6451b(hVar.method(), hVar.path(), hVar.hasBody());
                        } else if (annotation instanceof C1982k) {
                            String[] value2 = ((C1982k) annotation).value();
                            if (value2.length != 0) {
                                C2103w.C2104a aVar2 = new C2103w.C2104a();
                                int length2 = value2.length;
                                int i7 = 0;
                                while (i7 < length2) {
                                    str6 = value2[i7];
                                    int indexOf = str6.indexOf(58);
                                    if (indexOf != -1 && indexOf != 0 && indexOf != str6.length() - 1) {
                                        String substring = str6.substring(0, indexOf);
                                        String trim = str6.substring(indexOf + 1).trim();
                                        if ("Content-Type".equalsIgnoreCase(substring)) {
                                            try {
                                                C2111z.C2112a aVar3 = C2111z.f6136f;
                                                aVar.f5756t = C2111z.C2112a.m5503a(trim);
                                            } catch (IllegalArgumentException e) {
                                                throw C1903g0.m5191k(aVar.f5738b, e, "Malformed content type: %s", trim);
                                            }
                                        } else {
                                            aVar2.mo6620a(substring, trim);
                                        }
                                        i7++;
                                    }
                                }
                                aVar.f5755s = aVar2.mo6622c();
                            } else {
                                throw C1903g0.m5190j(aVar.f5738b, "@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof C1983l) {
                            if (!aVar.f5752p) {
                                aVar.f5753q = true;
                            } else {
                                throw C1903g0.m5190j(aVar.f5738b, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (!(annotation instanceof C1976e)) {
                            continue;
                        } else if (!aVar.f5753q) {
                            aVar.f5752p = true;
                        } else {
                            throw C1903g0.m5190j(aVar.f5738b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        i5++;
                    }
                    aVar.mo6451b(str4, str5, true);
                    i5++;
                }
                String str9 = str7;
                str3 = value;
                str8 = str9;
                aVar.mo6451b(str8, str3, false);
                i5++;
            } else if (aVar.f5750n != null) {
                if (!aVar.f5751o) {
                    if (aVar.f5753q) {
                        throw C1903g0.m5190j(aVar.f5738b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (aVar.f5752p) {
                        throw C1903g0.m5190j(aVar.f5738b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length3 = aVar.f5740d.length;
                aVar.f5758v = new C1930u[length3];
                int i8 = length3 - 1;
                int i9 = 0;
                while (i4 < length3) {
                    ParameterHandler<?>[] parameterHandlerArr = aVar.f5758v;
                    Type type4 = aVar.f5741e[i4];
                    Annotation[] annotationArr2 = aVar.f5740d[i4];
                    if (i4 != i8) {
                        i6 = i9;
                    }
                    if (annotationArr2 != null) {
                        int length4 = annotationArr2.length;
                        parameterHandler = null;
                        while (i9 < length4) {
                            Annotation annotation2 = annotationArr2[i9];
                            Class<String> cls = String.class;
                            Class<C2053a0.C2055b> cls2 = C2053a0.C2055b.class;
                            int i10 = length3;
                            int i11 = i8;
                            if (annotation2 instanceof C1996y) {
                                aVar.mo6452c(i4, type4);
                                if (aVar.f5749m) {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "Multiple @Url method annotations found.", new Object[0]);
                                } else if (aVar.f5745i) {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                } else if (aVar.f5746j) {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                                } else if (aVar.f5747k) {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                } else if (aVar.f5748l) {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                } else if (aVar.f5754r == null) {
                                    aVar.f5749m = true;
                                    if (type4 == C2106x.class || type4 == cls || type4 == URI.class || ((type4 instanceof Class) && "android.net.Uri".equals(((Class) type4).getName()))) {
                                        parameterHandler2 = new C1930u.C1944n(aVar.f5738b, i4);
                                        str2 = str8;
                                        i3 = length4;
                                        type3 = type4;
                                    } else {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                    }
                                } else {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@Url cannot be used with @%s URL", aVar.f5750n);
                                }
                            } else {
                                i3 = length4;
                                if (annotation2 instanceof C1990s) {
                                    aVar.mo6452c(i4, type4);
                                    if (aVar.f5746j) {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    } else if (aVar.f5747k) {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    } else if (aVar.f5748l) {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    } else if (aVar.f5749m) {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                    } else if (aVar.f5754r != null) {
                                        aVar.f5745i = true;
                                        C1990s sVar = (C1990s) annotation2;
                                        String value3 = sVar.value();
                                        if (!C1953z.C1954a.f5736y.matcher(value3).matches()) {
                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@Path parameter name must match %s. Found: %s", C1953z.C1954a.f5735x.pattern(), value3);
                                        } else if (aVar.f5757u.contains(value3)) {
                                            aVar.f5737a.mo6406e(type4, annotationArr2);
                                            String str10 = value3;
                                            type3 = type4;
                                            parameterHandler3 = new C1930u.C1939i<>(aVar.f5738b, i4, str10, C1874a.C1878d.f5587a, sVar.encoded());
                                            annotationArr2 = annotationArr2;
                                            parameterHandler2 = parameterHandler3;
                                        } else {
                                            throw C1903g0.m5192l(aVar.f5738b, i4, "URL \"%s\" does not contain \"{%s}\".", aVar.f5754r, value3);
                                        }
                                    } else {
                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@Path can only be used with relative url on @%s", aVar.f5750n);
                                    }
                                } else {
                                    type3 = type4;
                                    if (annotation2 instanceof C1991t) {
                                        aVar.mo6452c(i4, type3);
                                        C1991t tVar = (C1991t) annotation2;
                                        String value4 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        Class<?> f = C1903g0.m5186f(type3);
                                        aVar.f5746j = true;
                                        if (Iterable.class.isAssignableFrom(f)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.f5737a.mo6406e(C1903g0.m5185e(0, (ParameterizedType) type3), annotationArr2);
                                                parameterHandler2 = new C1928s(new C1930u.C1940j(value4, C1874a.C1878d.f5587a, encoded));
                                            } else {
                                                throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f.isArray()) {
                                            aVar.f5737a.mo6406e(C1953z.C1954a.m5259a(f.getComponentType()), annotationArr2);
                                            parameterHandler2 = new C1929t(new C1930u.C1940j(value4, C1874a.C1878d.f5587a, encoded));
                                        } else {
                                            aVar.f5737a.mo6406e(type3, annotationArr2);
                                            parameterHandler2 = new C1930u.C1940j<>(value4, C1874a.C1878d.f5587a, encoded);
                                        }
                                    } else if (annotation2 instanceof C1993v) {
                                        aVar.mo6452c(i4, type3);
                                        boolean encoded2 = ((C1993v) annotation2).encoded();
                                        Class<?> f2 = C1903g0.m5186f(type3);
                                        aVar.f5747k = true;
                                        if (Iterable.class.isAssignableFrom(f2)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.f5737a.mo6406e(C1903g0.m5185e(0, (ParameterizedType) type3), annotationArr2);
                                                parameterHandler7 = new C1928s(new C1930u.C1942l(C1874a.C1878d.f5587a, encoded2));
                                            } else {
                                                throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f2.isArray()) {
                                            aVar.f5737a.mo6406e(C1953z.C1954a.m5259a(f2.getComponentType()), annotationArr2);
                                            parameterHandler7 = new C1929t(new C1930u.C1942l(C1874a.C1878d.f5587a, encoded2));
                                        } else {
                                            aVar.f5737a.mo6406e(type3, annotationArr2);
                                            str2 = str8;
                                            parameterHandler2 = new C1930u.C1942l<>(C1874a.C1878d.f5587a, encoded2);
                                        }
                                        parameterHandler3 = parameterHandler7;
                                        parameterHandler2 = parameterHandler3;
                                    } else if (annotation2 instanceof C1992u) {
                                        aVar.mo6452c(i4, type3);
                                        Class<?> f3 = C1903g0.m5186f(type3);
                                        aVar.f5748l = true;
                                        if (Map.class.isAssignableFrom(f3)) {
                                            Type g = C1903g0.m5187g(type3, f3, Map.class);
                                            if (g instanceof ParameterizedType) {
                                                ParameterizedType parameterizedType = (ParameterizedType) g;
                                                Type e2 = C1903g0.m5185e(0, parameterizedType);
                                                if (cls == e2) {
                                                    aVar.f5737a.mo6406e(C1903g0.m5185e(1, parameterizedType), annotationArr2);
                                                    parameterHandler2 = new C1930u.C1941k<>(aVar.f5738b, i4, C1874a.C1878d.f5587a, ((C1992u) annotation2).encoded());
                                                } else {
                                                    throw C1903g0.m5192l(aVar.f5738b, i4, C1952y.m5258a("@QueryMap keys must be of type String: ", e2), new Object[0]);
                                                }
                                            } else {
                                                throw C1903g0.m5192l(aVar.f5738b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                        } else {
                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else {
                                        if (annotation2 instanceof C1980i) {
                                            aVar.mo6452c(i4, type3);
                                            String value5 = ((C1980i) annotation2).value();
                                            Class<?> f4 = C1903g0.m5186f(type3);
                                            if (Iterable.class.isAssignableFrom(f4)) {
                                                if (type3 instanceof ParameterizedType) {
                                                    aVar.f5737a.mo6406e(C1903g0.m5185e(0, (ParameterizedType) type3), annotationArr2);
                                                    parameterHandler6 = new C1928s(new C1930u.C1934d(value5, C1874a.C1878d.f5587a));
                                                } else {
                                                    throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f4, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                            } else if (f4.isArray()) {
                                                aVar.f5737a.mo6406e(C1953z.C1954a.m5259a(f4.getComponentType()), annotationArr2);
                                                parameterHandler6 = new C1929t(new C1930u.C1934d(value5, C1874a.C1878d.f5587a));
                                            } else {
                                                aVar.f5737a.mo6406e(type3, annotationArr2);
                                                str2 = str8;
                                                parameterHandler2 = new C1930u.C1934d<>(value5, C1874a.C1878d.f5587a);
                                            }
                                        } else {
                                            if (annotation2 instanceof C1981j) {
                                                if (type3 == C2103w.class) {
                                                    parameterHandler4 = new C1930u.C1936f(aVar.f5738b, i4);
                                                } else {
                                                    aVar.mo6452c(i4, type3);
                                                    Class<?> f5 = C1903g0.m5186f(type3);
                                                    if (Map.class.isAssignableFrom(f5)) {
                                                        Type g2 = C1903g0.m5187g(type3, f5, Map.class);
                                                        if (g2 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) g2;
                                                            Type e3 = C1903g0.m5185e(0, parameterizedType2);
                                                            if (cls == e3) {
                                                                aVar.f5737a.mo6406e(C1903g0.m5185e(1, parameterizedType2), annotationArr2);
                                                                parameterHandler2 = new C1930u.C1935e<>(aVar.f5738b, i4, C1874a.C1878d.f5587a);
                                                            } else {
                                                                throw C1903g0.m5192l(aVar.f5738b, i4, C1952y.m5258a("@HeaderMap keys must be of type String: ", e3), new Object[0]);
                                                            }
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                }
                                            } else if (annotation2 instanceof C1974c) {
                                                aVar.mo6452c(i4, type3);
                                                if (aVar.f5752p) {
                                                    C1974c cVar = (C1974c) annotation2;
                                                    String value6 = cVar.value();
                                                    boolean encoded3 = cVar.encoded();
                                                    aVar.f5742f = true;
                                                    Class<?> f6 = C1903g0.m5186f(type3);
                                                    if (Iterable.class.isAssignableFrom(f6)) {
                                                        if (type3 instanceof ParameterizedType) {
                                                            aVar.f5737a.mo6406e(C1903g0.m5185e(0, (ParameterizedType) type3), annotationArr2);
                                                            parameterHandler4 = new C1928s(new C1930u.C1932b(value6, C1874a.C1878d.f5587a, encoded3));
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f6, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                        }
                                                    } else if (f6.isArray()) {
                                                        aVar.f5737a.mo6406e(C1953z.C1954a.m5259a(f6.getComponentType()), annotationArr2);
                                                        parameterHandler4 = new C1929t(new C1930u.C1932b(value6, C1874a.C1878d.f5587a, encoded3));
                                                    } else {
                                                        aVar.f5737a.mo6406e(type3, annotationArr2);
                                                        parameterHandler2 = new C1930u.C1932b<>(value6, C1874a.C1878d.f5587a, encoded3);
                                                    }
                                                } else {
                                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof C1975d) {
                                                aVar.mo6452c(i4, type3);
                                                if (aVar.f5752p) {
                                                    Class<?> f7 = C1903g0.m5186f(type3);
                                                    if (Map.class.isAssignableFrom(f7)) {
                                                        Type g3 = C1903g0.m5187g(type3, f7, Map.class);
                                                        if (g3 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType3 = (ParameterizedType) g3;
                                                            Type e4 = C1903g0.m5185e(0, parameterizedType3);
                                                            if (cls == e4) {
                                                                aVar.f5737a.mo6406e(C1903g0.m5185e(1, parameterizedType3), annotationArr2);
                                                                C1874a.C1878d dVar = C1874a.C1878d.f5587a;
                                                                aVar.f5742f = true;
                                                                parameterHandler4 = new C1930u.C1933c<>(aVar.f5738b, i4, dVar, ((C1975d) annotation2).encoded());
                                                            } else {
                                                                throw C1903g0.m5192l(aVar.f5738b, i4, C1952y.m5258a("@FieldMap keys must be of type String: ", e4), new Object[0]);
                                                            }
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof C1988q) {
                                                aVar.mo6452c(i4, type3);
                                                if (aVar.f5753q) {
                                                    C1988q qVar = (C1988q) annotation2;
                                                    aVar.f5743g = true;
                                                    String value7 = qVar.value();
                                                    Class<?> f8 = C1903g0.m5186f(type3);
                                                    if (!value7.isEmpty()) {
                                                        str2 = str8;
                                                        C2103w c = C2103w.f6111f.mo6626c("Content-Disposition", C0559c.m1823a("form-data; name=\"", value7, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                        if (Iterable.class.isAssignableFrom(f8)) {
                                                            if (type3 instanceof ParameterizedType) {
                                                                Type e5 = C1903g0.m5185e(0, (ParameterizedType) type3);
                                                                if (!cls2.isAssignableFrom(C1903g0.m5186f(e5))) {
                                                                    parameterHandler5 = new C1928s(new C1930u.C1937g(aVar.f5738b, i4, c, aVar.f5737a.mo6405d(e5, annotationArr2, aVar.f5739c)));
                                                                } else {
                                                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                            }
                                                        } else if (f8.isArray()) {
                                                            Class<?> a = C1953z.C1954a.m5259a(f8.getComponentType());
                                                            if (!cls2.isAssignableFrom(a)) {
                                                                parameterHandler5 = new C1929t(new C1930u.C1937g(aVar.f5738b, i4, c, aVar.f5737a.mo6405d(a, annotationArr2, aVar.f5739c)));
                                                            } else {
                                                                throw C1903g0.m5192l(aVar.f5738b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else if (!cls2.isAssignableFrom(f8)) {
                                                            parameterHandler2 = new C1930u.C1937g<>(aVar.f5738b, i4, c, aVar.f5737a.mo6405d(type3, annotationArr2, aVar.f5739c));
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        parameterHandler2 = parameterHandler5;
                                                    } else if (Iterable.class.isAssignableFrom(f8)) {
                                                        if (!(type3 instanceof ParameterizedType)) {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, C1951x.m5257a(f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                        } else if (cls2.isAssignableFrom(C1903g0.m5186f(C1903g0.m5185e(0, (ParameterizedType) type3)))) {
                                                            parameterHandler2 = new C1928s(C1930u.C1943m.f5701a);
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                    } else if (f8.isArray()) {
                                                        if (cls2.isAssignableFrom(f8.getComponentType())) {
                                                            parameterHandler2 = new C1929t(C1930u.C1943m.f5701a);
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                    } else if (cls2.isAssignableFrom(f8)) {
                                                        parameterHandler6 = C1930u.C1943m.f5701a;
                                                    } else {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else {
                                                    throw C1903g0.m5192l(aVar.f5738b, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else {
                                                str2 = str8;
                                                if (annotation2 instanceof C1989r) {
                                                    aVar.mo6452c(i4, type3);
                                                    if (aVar.f5753q) {
                                                        aVar.f5743g = true;
                                                        Class<?> f9 = C1903g0.m5186f(type3);
                                                        if (Map.class.isAssignableFrom(f9)) {
                                                            Type g4 = C1903g0.m5187g(type3, f9, Map.class);
                                                            if (g4 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType4 = (ParameterizedType) g4;
                                                                Type e6 = C1903g0.m5185e(0, parameterizedType4);
                                                                if (cls == e6) {
                                                                    Type e7 = C1903g0.m5185e(1, parameterizedType4);
                                                                    if (!cls2.isAssignableFrom(C1903g0.m5186f(e7))) {
                                                                        parameterHandler2 = new C1930u.C1938h<>(aVar.f5738b, i4, aVar.f5737a.mo6405d(e7, annotationArr2, aVar.f5739c), ((C1989r) annotation2).encoding());
                                                                    } else {
                                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw C1903g0.m5192l(aVar.f5738b, i4, C1952y.m5258a("@PartMap keys must be of type String: ", e6), new Object[0]);
                                                                }
                                                            } else {
                                                                throw C1903g0.m5192l(aVar.f5738b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw C1903g0.m5192l(aVar.f5738b, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                    } else {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof C1972a) {
                                                    aVar.mo6452c(i4, type3);
                                                    if (aVar.f5752p || aVar.f5753q) {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                    } else if (!aVar.f5744h) {
                                                        try {
                                                            C1896f d = aVar.f5737a.mo6405d(type3, annotationArr2, aVar.f5739c);
                                                            aVar.f5744h = true;
                                                            parameterHandler2 = new C1930u.C1931a<>(aVar.f5738b, i4, d);
                                                        } catch (RuntimeException e8) {
                                                            throw C1903g0.m5193m(aVar.f5738b, e8, i4, "Unable to create @Body converter for %s", type3);
                                                        }
                                                    } else {
                                                        throw C1903g0.m5192l(aVar.f5738b, i4, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof C1995x) {
                                                    aVar.mo6452c(i4, type3);
                                                    Class<?> f10 = C1903g0.m5186f(type3);
                                                    int i12 = i4 - 1;
                                                    while (i12 >= 0) {
                                                        C1930u.C1945o oVar = aVar.f5758v[i12];
                                                        if (!(oVar instanceof C1930u.C1945o) || !oVar.f5704a.equals(f10)) {
                                                            i12--;
                                                        } else {
                                                            Method method2 = aVar.f5738b;
                                                            StringBuilder a2 = C0001b.m0a("@Tag type ");
                                                            a2.append(f10.getName());
                                                            a2.append(" is duplicate of parameter #");
                                                            a2.append(i12 + 1);
                                                            a2.append(" and would always overwrite its value.");
                                                            throw C1903g0.m5192l(method2, i4, a2.toString(), new Object[0]);
                                                        }
                                                    }
                                                    parameterHandler2 = new C1930u.C1945o<>(f10);
                                                } else {
                                                    parameterHandler2 = null;
                                                }
                                            }
                                            parameterHandler2 = parameterHandler4;
                                        }
                                        parameterHandler3 = parameterHandler6;
                                        parameterHandler2 = parameterHandler3;
                                    }
                                }
                                str2 = str8;
                            }
                            if (parameterHandler2 != null) {
                                if (parameterHandler == null) {
                                    parameterHandler = parameterHandler2;
                                } else {
                                    throw C1903g0.m5192l(aVar.f5738b, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                            }
                            i9++;
                            C1886c0 c0Var2 = c0Var;
                            Method method3 = method;
                            type4 = type3;
                            length3 = i10;
                            i8 = i11;
                            length4 = i3;
                            str8 = str2;
                        }
                        i2 = length3;
                        i = i8;
                        str = str8;
                        type2 = type4;
                    } else {
                        i2 = length3;
                        i = i8;
                        str = str8;
                        type2 = type4;
                        parameterHandler = null;
                    }
                    if (parameterHandler == null) {
                        if (i6 != 0) {
                            try {
                                if (C1903g0.m5186f(type2) == C2043d.class) {
                                    aVar.f5759w = true;
                                    parameterHandler = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw C1903g0.m5192l(aVar.f5738b, i4, "No Retrofit annotation found.", new Object[0]);
                    }
                    parameterHandlerArr[i4] = parameterHandler;
                    i4++;
                    i9 = 0;
                    i6 = 1;
                    C1886c0 c0Var3 = c0Var;
                    Method method4 = method;
                    length3 = i2;
                    i8 = i;
                    str8 = str;
                }
                String str11 = str8;
                if (aVar.f5754r != null || aVar.f5749m) {
                    boolean z2 = aVar.f5752p;
                    if (!z2 && !aVar.f5753q && !aVar.f5751o && aVar.f5744h) {
                        throw C1903g0.m5190j(aVar.f5738b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !aVar.f5742f) {
                        throw C1903g0.m5190j(aVar.f5738b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!aVar.f5753q || aVar.f5743g) {
                        C1953z zVar = new C1953z(aVar);
                        Type genericReturnType = method.getGenericReturnType();
                        if (C1903g0.m5188h(genericReturnType)) {
                            throw C1903g0.m5190j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                        } else if (genericReturnType != Void.TYPE) {
                            Class<C1881a0> cls3 = C1881a0.class;
                            boolean z3 = zVar.f5734k;
                            Annotation[] annotations = method.getAnnotations();
                            if (z3) {
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                Type type5 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                if (type5 instanceof WildcardType) {
                                    type5 = ((WildcardType) type5).getLowerBounds()[0];
                                }
                                if (C1903g0.m5186f(type5) != cls3 || !(type5 instanceof ParameterizedType)) {
                                    z = false;
                                } else {
                                    type5 = C1903g0.m5185e(0, (ParameterizedType) type5);
                                    z = true;
                                }
                                type = new C1903g0.C1905b((Type) null, C1882b.class, type5);
                                if (!C1903g0.m5189i(annotations, C1895e0.class)) {
                                    Annotation[] annotationArr3 = new Annotation[(annotations.length + 1)];
                                    annotationArr3[0] = C1898f0.f5609a;
                                    System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                    annotations = annotationArr3;
                                }
                            } else {
                                type = method.getGenericReturnType();
                                z = false;
                            }
                            C1886c0 c0Var4 = c0Var;
                            try {
                                C1884c<?, ?> a3 = c0Var4.mo6402a(type, annotations);
                                Type a4 = a3.mo5963a();
                                if (a4 == C2072g0.class) {
                                    StringBuilder a5 = C0001b.m0a("'");
                                    a5.append(C1903g0.m5186f(a4).getName());
                                    a5.append("' is not a valid response body type. Did you mean ResponseBody?");
                                    throw C1903g0.m5190j(method, a5.toString(), new Object[0]);
                                } else if (a4 == cls3) {
                                    throw C1903g0.m5190j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                } else if (!zVar.f5726c.equals(str11) || Void.class.equals(a4)) {
                                    Method method5 = method;
                                    try {
                                        C1896f c2 = c0Var4.mo6404c((C1896f.C1897a) null, a4, method.getAnnotations());
                                        C2068f.C2069a aVar4 = c0Var4.f5598b;
                                        if (!z3) {
                                            return new C1909j.C1910a(zVar, aVar4, c2, a3);
                                        }
                                        return z ? new C1909j.C1912c(zVar, aVar4, c2, a3) : new C1909j.C1911b(zVar, aVar4, c2, a3, false);
                                    } catch (RuntimeException e9) {
                                        throw C1903g0.m5191k(method5, e9, "Unable to create converter for %s", a4);
                                    }
                                } else {
                                    throw C1903g0.m5190j(method, "HEAD method must use Void as response type.", new Object[0]);
                                }
                            } catch (RuntimeException e10) {
                                throw C1903g0.m5191k(method, e10, "Unable to create call adapter for %s", type);
                            }
                        } else {
                            throw C1903g0.m5190j(method, "Service methods cannot return void.", new Object[0]);
                        }
                    } else {
                        throw C1903g0.m5190j(aVar.f5738b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C1903g0.m5190j(aVar.f5738b, "Missing either @%s URL or @Url parameter.", aVar.f5750n);
                }
            } else {
                throw C1903g0.m5190j(aVar.f5738b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw C1903g0.m5190j(aVar.f5738b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str6);
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo6407a(Object[] objArr);
}
