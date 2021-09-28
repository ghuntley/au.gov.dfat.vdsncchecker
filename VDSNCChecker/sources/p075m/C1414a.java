package p075m;

/* renamed from: m.a */
public class C1414a extends C1417c {

    /* renamed from: b */
    public static volatile C1414a f4465b;

    /* renamed from: a */
    public C1417c f4466a = new C1415b();

    public C1414a() {
        super(0);
    }

    /* renamed from: k */
    public static C1414a m4062k() {
        if (f4465b != null) {
            return f4465b;
        }
        synchronized (C1414a.class) {
            if (f4465b == null) {
                f4465b = new C1414a();
            }
        }
        return f4465b;
    }

    /* renamed from: f */
    public boolean mo5247f() {
        return this.f4466a.mo5247f();
    }
}
