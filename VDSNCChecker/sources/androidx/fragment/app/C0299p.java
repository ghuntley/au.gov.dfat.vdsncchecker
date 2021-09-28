package androidx.fragment.app;

import androidx.fragment.app.C0286k;
import p016c0.C0559c;
import p093p.C1558h;

/* renamed from: androidx.fragment.app.p */
public class C0299p {

    /* renamed from: a */
    public static final C1558h<ClassLoader, C1558h<String, Class<?>>> f1514a = new C1558h<>();

    /* renamed from: b */
    public static Class<?> m847b(ClassLoader classLoader, String str) {
        C1558h<ClassLoader, C1558h<String, Class<?>>> hVar = f1514a;
        C1558h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C1558h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class<? extends C0286k> m848c(ClassLoader classLoader, String str) {
        try {
            return m847b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    /* renamed from: a */
    public C0286k mo1659a(ClassLoader classLoader, String str) {
        throw null;
    }
}
