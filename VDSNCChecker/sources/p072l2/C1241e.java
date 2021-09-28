package p072l2;

import java.util.Arrays;
import p016c0.C0559c;
import p063k.C1142f;
import p120t2.C1789c;
import p120t2.C1797j;

/* renamed from: l2.e */
public class C1241e {
    public C1241e(int i) {
    }

    /* renamed from: b */
    public static boolean m3513b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m3514d(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(C1142f.m3365a(str, " must not be null"));
            m3521o(illegalStateException, C1241e.class.getName());
            throw illegalStateException;
        }
    }

    /* renamed from: e */
    public static void m3515e(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            m3521o(nullPointerException, C1241e.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m3516f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(C1142f.m3365a(str, " must not be null"));
            m3521o(nullPointerException, C1241e.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: j */
    public static void m3517j(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(m3520m(str));
            m3521o(nullPointerException, C1241e.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: k */
    public static void m3518k(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m3520m(str));
            m3521o(illegalArgumentException, C1241e.class.getName());
            throw illegalArgumentException;
        }
    }

    /* renamed from: l */
    public static int m3519l(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: m */
    public static String m3520m(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: o */
    public static <T extends Throwable> T m3521o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: p */
    public static String m3522p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m3523q() {
        C1789c cVar = new C1789c();
        m3521o(cVar, C1241e.class.getName());
        throw cVar;
    }

    /* renamed from: r */
    public static void m3524r(String str) {
        C1797j jVar = new C1797j(C0559c.m1823a("lateinit property ", str, " has not been initialized"));
        m3521o(jVar, C1241e.class.getName());
        throw jVar;
    }

    /* renamed from: n */
    public void mo4955n(float f, float f2, float f3, C1254l lVar) {
        lVar.mo5003d(f, 0.0f);
    }
}
