package p026d4;

import java.util.List;
import p154z3.C2205a;

/* renamed from: d4.j */
public final class C0834j extends C2205a {

    /* renamed from: e */
    public final /* synthetic */ C0820f f3233e;

    /* renamed from: f */
    public final /* synthetic */ int f3234f;

    /* renamed from: g */
    public final /* synthetic */ List f3235g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0834j(String str, boolean z, String str2, boolean z2, C0820f fVar, int i, List list) {
        super(str2, z2);
        this.f3233e = fVar;
        this.f3234f = i;
        this.f3235g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo57a() {
        /*
            r3 = this;
            d4.f r0 = r3.f3233e
            d4.s r0 = r0.f3183p
            int r1 = r3.f3234f
            java.util.List r2 = r3.f3235g
            boolean r0 = r0.mo4126b(r1, r2)
            if (r0 == 0) goto L_0x002e
            d4.f r0 = r3.f3233e     // Catch:{ IOException -> 0x002e }
            d4.p r0 = r0.f3169D     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f3234f     // Catch:{ IOException -> 0x002e }
            d4.b r2 = p026d4.C0814b.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.mo4121l(r1, r2)     // Catch:{ IOException -> 0x002e }
            d4.f r0 = r3.f3233e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            d4.f r1 = r3.f3233e     // Catch:{ all -> 0x002b }
            java.util.Set<java.lang.Integer> r1 = r1.f3171F     // Catch:{ all -> 0x002b }
            int r2 = r3.f3234f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0834j.mo57a():long");
    }
}
