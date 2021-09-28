package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p120t2.C1798k;
import p128u4.C1896f;
import p134v4.C1994w;
import p139w3.C2070f0;
import p139w3.C2079i0;

/* renamed from: u4.a */
public final class C1874a extends C1896f.C1897a {

    /* renamed from: a */
    public boolean f5583a = true;

    /* renamed from: u4.a$a */
    public static final class C1875a implements C1896f<C2079i0, C2079i0> {

        /* renamed from: a */
        public static final C1875a f5584a = new C1875a();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            C2079i0 i0Var = (C2079i0) obj;
            try {
                return C1903g0.m5181a(i0Var);
            } finally {
                i0Var.close();
            }
        }
    }

    /* renamed from: u4.a$b */
    public static final class C1876b implements C1896f<C2070f0, C2070f0> {

        /* renamed from: a */
        public static final C1876b f5585a = new C1876b();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            return (C2070f0) obj;
        }
    }

    /* renamed from: u4.a$c */
    public static final class C1877c implements C1896f<C2079i0, C2079i0> {

        /* renamed from: a */
        public static final C1877c f5586a = new C1877c();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            return (C2079i0) obj;
        }
    }

    /* renamed from: u4.a$d */
    public static final class C1878d implements C1896f<Object, String> {

        /* renamed from: a */
        public static final C1878d f5587a = new C1878d();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: u4.a$e */
    public static final class C1879e implements C1896f<C2079i0, C1798k> {

        /* renamed from: a */
        public static final C1879e f5588a = new C1879e();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            ((C2079i0) obj).close();
            return C1798k.f5446a;
        }
    }

    /* renamed from: u4.a$f */
    public static final class C1880f implements C1896f<C2079i0, Void> {

        /* renamed from: a */
        public static final C1880f f5589a = new C1880f();

        /* renamed from: a */
        public Object mo6398a(Object obj) {
            ((C2079i0) obj).close();
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public C1896f<?, C2070f0> mo6396a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1886c0 c0Var) {
        if (C2070f0.class.isAssignableFrom(C1903g0.m5186f(type))) {
            return C1876b.f5585a;
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public C1896f<C2079i0, ?> mo6397b(Type type, Annotation[] annotationArr, C1886c0 c0Var) {
        if (type == C2079i0.class) {
            return C1903g0.m5189i(annotationArr, C1994w.class) ? C1877c.f5586a : C1875a.f5584a;
        }
        if (type == Void.class) {
            return C1880f.f5589a;
        }
        if (!this.f5583a || type != C1798k.class) {
            return null;
        }
        try {
            return C1879e.f5588a;
        } catch (NoClassDefFoundError unused) {
            this.f5583a = false;
            return null;
        }
    }
}
