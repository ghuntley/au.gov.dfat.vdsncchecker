package p091o3;

import java.util.concurrent.TimeUnit;
import p042g2.C0955a;
import p073l3.C1320u;
import p085n3.C1474o;

/* renamed from: o3.l */
public final class C1533l {

    /* renamed from: a */
    public static final long f4759a = C1320u.m3721y("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f4760b;

    /* renamed from: c */
    public static final int f4761c;

    /* renamed from: d */
    public static final long f4762d = TimeUnit.SECONDS.toNanos(C1320u.m3721y("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C1529h f4763e = C1527f.f4754a;

    static {
        C1320u.m3720x("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i = C1474o.f4619a;
        int x = C1320u.m3720x("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, (Object) null);
        f4760b = x;
        f4761c = C1320u.m3720x("kotlinx.coroutines.scheduler.max.pool.size", C0955a.m2731e(i * 128, x, 2097150), 0, 2097150, 4, (Object) null);
    }
}
