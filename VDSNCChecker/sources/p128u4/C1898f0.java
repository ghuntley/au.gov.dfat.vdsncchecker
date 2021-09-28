package p128u4;

import java.lang.annotation.Annotation;
import p000a.C0001b;

/* renamed from: u4.f0 */
public final class C1898f0 implements C1895e0 {

    /* renamed from: a */
    public static final C1895e0 f5609a = new C1898f0();

    public Class<? extends Annotation> annotationType() {
        return C1895e0.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C1895e0;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("@");
        a.append(C1895e0.class.getName());
        a.append("()");
        return a.toString();
    }
}
