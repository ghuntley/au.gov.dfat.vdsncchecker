package p025d3;

import java.util.Objects;
import p055i3.C1035b;

/* renamed from: d3.n */
public class C0810n {

    /* renamed from: a */
    public static final C0811o f3120a;

    /* renamed from: b */
    public static final C1035b[] f3121b = new C1035b[0];

    static {
        C0811o oVar = null;
        try {
            oVar = (C0811o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oVar == null) {
            oVar = new C0811o();
        }
        f3120a = oVar;
    }

    /* renamed from: a */
    public static C1035b m2403a(Class cls) {
        Objects.requireNonNull(f3120a);
        return new C0800d(cls);
    }
}
