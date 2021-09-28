package p128u4;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: u4.k */
public final class C1913k {

    /* renamed from: a */
    public final Method f5635a;

    /* renamed from: b */
    public final List<?> f5636b;

    public C1913k(Method method, List<?> list) {
        this.f5635a = method;
        this.f5636b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f5635a.getDeclaringClass().getName(), this.f5635a.getName(), this.f5636b});
    }
}
