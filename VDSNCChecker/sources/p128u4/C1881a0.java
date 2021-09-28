package p128u4;

import javax.annotation.Nullable;
import p139w3.C2072g0;
import p139w3.C2079i0;

/* renamed from: u4.a0 */
public final class C1881a0<T> {

    /* renamed from: a */
    public final C2072g0 f5590a;
    @Nullable

    /* renamed from: b */
    public final T f5591b;
    @Nullable

    /* renamed from: c */
    public final C2079i0 f5592c;

    public C1881a0(C2072g0 g0Var, @Nullable T t, @Nullable C2079i0 i0Var) {
        this.f5590a = g0Var;
        this.f5591b = t;
        this.f5592c = i0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p128u4.C1881a0<T> m5141b(@javax.annotation.Nullable T r12) {
        /*
            w3.g0$a r0 = new w3.g0$a
            r0.<init>()
            r1 = 200(0xc8, float:2.8E-43)
            r0.f6016c = r1
            java.lang.String r1 = "OK"
            r0.mo6560e(r1)
            w3.c0 r1 = p139w3.C2061c0.HTTP_1_1
            r0.mo6561f(r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.lang.String r3 = "http://localhost/"
            r4 = 1
            java.lang.String r5 = "ws:"
            boolean r5 = p067k3.C1205h.m3432P(r3, r5, r4)
            if (r5 == 0) goto L_0x0032
            java.lang.String r4 = "http:"
            java.lang.StringBuilder r4 = p000a.C0001b.m0a(r4)
            r5 = 3
            goto L_0x0041
        L_0x0032:
            java.lang.String r5 = "wss:"
            boolean r4 = p067k3.C1205h.m3432P(r3, r5, r4)
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = "https:"
            java.lang.StringBuilder r4 = p000a.C0001b.m0a(r4)
            r5 = 4
        L_0x0041:
            java.lang.String r3 = r3.substring(r5)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            p072l2.C1241e.m3516f(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x0051:
            java.lang.String r4 = "$this$toHttpUrl"
            p072l2.C1241e.m3517j(r3, r4)
            w3.x$a r4 = new w3.x$a
            r4.<init>()
            r5 = 0
            r4.mo6641d(r5, r3)
            w3.x r7 = r4.mo6638a()
            w3.w r9 = new w3.w
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r9.<init>(r2, r5)
            byte[] r2 = p144x3.C2129c.f6169a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0081
            u2.n r1 = p126u2.C1853n.f5543e
            goto L_0x008f
        L_0x0081:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r2 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            p072l2.C1241e.m3516f(r1, r2)
        L_0x008f:
            r11 = r1
            w3.d0 r1 = new w3.d0
            java.lang.String r8 = "GET"
            r10 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.mo6562g(r1)
            w3.g0 r0 = r0.mo6556a()
            u4.a0 r12 = m5142c(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p128u4.C1881a0.m5141b(java.lang.Object):u4.a0");
    }

    /* renamed from: c */
    public static <T> C1881a0<T> m5142c(@Nullable T t, C2072g0 g0Var) {
        if (g0Var.mo6553c()) {
            return new C1881a0<>(g0Var, t, (C2079i0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public boolean mo6399a() {
        return this.f5590a.mo6553c();
    }

    public String toString() {
        return this.f5590a.toString();
    }
}
