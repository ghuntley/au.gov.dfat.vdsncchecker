package p091o3;

import p073l3.C1320u;
import p073l3.C1326x;
import p085n3.C1474o;

/* renamed from: o3.b */
public final class C1523b extends C1524c {

    /* renamed from: k */
    public static final C1523b f4741k;

    /* renamed from: l */
    public static final C1326x f4742l;

    static {
        C1523b bVar = new C1523b();
        f4741k = bVar;
        int i = C1474o.f4619a;
        f4742l = new C1526e(bVar, C1320u.m3720x("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    public C1523b() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
