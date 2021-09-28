package p073l3;

/* renamed from: l3.i1 */
public final class C1288i1 {

    /* renamed from: a */
    public static final C1288i1 f4293a = null;

    /* renamed from: b */
    public static final ThreadLocal<C1287i0> f4294b = new ThreadLocal<>();

    /* renamed from: a */
    public static final C1287i0 m3643a() {
        ThreadLocal<C1287i0> threadLocal = f4294b;
        C1287i0 i0Var = threadLocal.get();
        if (i0Var != null) {
            return i0Var;
        }
        C1268c cVar = new C1268c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
