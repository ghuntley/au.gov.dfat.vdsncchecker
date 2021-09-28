package p114s2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p072l2.C1241e;
import p073l3.C1269c0;
import p128u4.C1882b;
import p128u4.C1884c;
import p128u4.C1886c0;
import p128u4.C1896f;
import p128u4.C1903g0;

/* renamed from: s2.f */
public final class C1719f extends C1884c.C1885a {
    /* renamed from: a */
    public C1884c<?, ?> mo5977a(Type type, Annotation[] annotationArr, C1886c0 c0Var) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        Type e = C1903g0.m5185e(0, (ParameterizedType) type);
        if (!C1241e.m3513b(C1903g0.m5186f(e), C1713d.class) || !(e instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) e;
        Type e2 = C1903g0.m5185e(0, parameterizedType);
        C1896f c = c0Var.mo6404c((C1896f.C1897a) null, C1903g0.m5185e(1, parameterizedType), annotationArr);
        Class<?> f = C1903g0.m5186f(type);
        if (C1241e.m3513b(f, C1269c0.class)) {
            return new C1712c(e2, c);
        }
        if (C1241e.m3513b(f, C1882b.class)) {
            return new C1718e(e2, c);
        }
        return null;
    }
}
