package p128u4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* renamed from: u4.b0 */
public class C1883b0 implements InvocationHandler {

    /* renamed from: a */
    public final C1946v f5593a = C1946v.f5705c;

    /* renamed from: b */
    public final Object[] f5594b = new Object[0];

    /* renamed from: c */
    public final /* synthetic */ Class f5595c;

    /* renamed from: d */
    public final /* synthetic */ C1886c0 f5596d;

    public C1883b0(C1886c0 c0Var, Class cls) {
        this.f5596d = c0Var;
        this.f5595c = cls;
    }

    @Nullable
    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f5594b;
        }
        return this.f5593a.f5706a && method.isDefault() ? this.f5593a.mo6442b(method, this.f5595c, obj, objArr) : this.f5596d.mo6403b(method).mo6407a(objArr);
    }
}
