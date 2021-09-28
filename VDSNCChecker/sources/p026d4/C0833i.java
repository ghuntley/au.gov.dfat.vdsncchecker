package p026d4;

import java.util.List;
import p154z3.C2205a;

/* renamed from: d4.i */
public final class C0833i extends C2205a {

    /* renamed from: e */
    public final /* synthetic */ C0820f f3229e;

    /* renamed from: f */
    public final /* synthetic */ int f3230f;

    /* renamed from: g */
    public final /* synthetic */ List f3231g;

    /* renamed from: h */
    public final /* synthetic */ boolean f3232h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0833i(String str, boolean z, String str2, boolean z2, C0820f fVar, int i, List list, boolean z3) {
        super(str2, z2);
        this.f3229e = fVar;
        this.f3230f = i;
        this.f3231g = list;
        this.f3232h = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo57a() {
        /*
            r4 = this;
            d4.f r0 = r4.f3229e
            d4.s r0 = r0.f3183p
            int r1 = r4.f3230f
            java.util.List r2 = r4.f3231g
            boolean r3 = r4.f3232h
            boolean r0 = r0.mo4127c(r1, r2, r3)
            if (r0 == 0) goto L_0x001b
            d4.f r1 = r4.f3229e     // Catch:{ IOException -> 0x0036 }
            d4.p r1 = r1.f3169D     // Catch:{ IOException -> 0x0036 }
            int r2 = r4.f3230f     // Catch:{ IOException -> 0x0036 }
            d4.b r3 = p026d4.C0814b.CANCEL     // Catch:{ IOException -> 0x0036 }
            r1.mo4121l(r2, r3)     // Catch:{ IOException -> 0x0036 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            boolean r0 = r4.f3232h     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0036
        L_0x0021:
            d4.f r0 = r4.f3229e     // Catch:{ IOException -> 0x0036 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0036 }
            d4.f r1 = r4.f3229e     // Catch:{ all -> 0x0033 }
            java.util.Set<java.lang.Integer> r1 = r1.f3171F     // Catch:{ all -> 0x0033 }
            int r2 = r4.f3230f     // Catch:{ all -> 0x0033 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0033 }
            r1.remove(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0036
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            throw r1     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0833i.mo57a():long");
    }
}
