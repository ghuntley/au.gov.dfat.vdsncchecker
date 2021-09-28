package p037f3;

import java.util.Random;
import p072l2.C1241e;

/* renamed from: f3.b */
public final class C0911b extends C0910a {

    /* renamed from: g */
    public final C0912a f3434g = new C0912a();

    /* renamed from: f3.b$a */
    public static final class C0912a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    /* renamed from: b */
    public Random mo4234b() {
        Object obj = this.f3434g.get();
        C1241e.m3516f(obj, "implStorage.get()");
        return (Random) obj;
    }
}
