package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p128u4.C1896f;
import p139w3.C2079i0;

@IgnoreJRERequirement
/* renamed from: u4.r */
public final class C1926r extends C1896f.C1897a {

    /* renamed from: a */
    public static final C1896f.C1897a f5662a = new C1926r();

    @IgnoreJRERequirement
    /* renamed from: u4.r$a */
    public static final class C1927a<T> implements C1896f<C2079i0, Optional<T>> {

        /* renamed from: a */
        public final C1896f<C2079i0, T> f5663a;

        public C1927a(C1896f<C2079i0, T> fVar) {
            this.f5663a = fVar;
        }

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            return Optional.ofNullable(this.f5663a.mo6398a((C2079i0) obj));
        }
    }

    @Nullable
    /* renamed from: b */
    public C1896f<C2079i0, ?> mo6397b(Type type, Annotation[] annotationArr, C1886c0 c0Var) {
        if (C1903g0.m5186f(type) != Optional.class) {
            return null;
        }
        return new C1927a(c0Var.mo6404c((C1896f.C1897a) null, C1903g0.m5185e(0, (ParameterizedType) type), annotationArr));
    }
}
