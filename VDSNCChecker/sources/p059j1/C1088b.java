package p059j1;

import p025d3.C0802f;
import p035f1.C0888a;
import p138w2.C2043d;
import p148y2.C2135c;
import p148y2.C2137e;

/* renamed from: j1.b */
public final class C1088b {

    /* renamed from: b */
    public static final C1089a f3853b = new C1089a((C0802f) null);

    /* renamed from: c */
    public static volatile C1088b f3854c;

    /* renamed from: a */
    public final C0888a f3855a;

    /* renamed from: j1.b$a */
    public static final class C1089a {
        public C1089a(C0802f fVar) {
        }
    }

    @C2137e(mo6675c = "au.gov.dfat.vdsncchecker.data.IcaoRepository", mo6676f = "IcaoRepository.kt", mo6677l = {11}, mo6678m = "getCrl")
    /* renamed from: j1.b$b */
    public static final class C1090b extends C2135c {

        /* renamed from: h */
        public /* synthetic */ Object f3856h;

        /* renamed from: i */
        public final /* synthetic */ C1088b f3857i;

        /* renamed from: j */
        public int f3858j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1090b(C1088b bVar, C2043d<? super C1090b> dVar) {
            super(dVar);
            this.f3857i = bVar;
        }

        /* renamed from: g */
        public final Object mo4587g(Object obj) {
            this.f3856h = obj;
            this.f3858j |= Integer.MIN_VALUE;
            return this.f3857i.mo4586a(this);
        }
    }

    public C1088b(C0888a aVar) {
        this.f3855a = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        p042g2.C0955a.m2730d(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4586a(p138w2.C2043d<? super byte[]> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p059j1.C1088b.C1090b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            j1.b$b r0 = (p059j1.C1088b.C1090b) r0
            int r1 = r0.f3858j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3858j = r1
            goto L_0x0018
        L_0x0013:
            j1.b$b r0 = new j1.b$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f3856h
            x2.a r1 = p143x2.C2124a.COROUTINE_SUSPENDED
            int r2 = r0.f3858j
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p042g2.C0955a.m2724E(r7)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            p042g2.C0955a.m2724E(r7)
            f1.a r7 = r6.f3855a
            r0.f3858j = r3
            java.lang.Object r7 = r7.mo4192a(r0)
            if (r7 != r1) goto L_0x003d
            return r1
        L_0x003d:
            s2.d r7 = (p114s2.C1713d) r7
            boolean r0 = r7 instanceof p114s2.C1713d.C1716c
            r1 = 0
            if (r0 == 0) goto L_0x00a8
            s2.d$c r7 = (p114s2.C1713d.C1716c) r7
            T r7 = r7.f5291a
            w3.i0 r7 = (p139w3.C2079i0) r7
            long r2 = r7.mo2693a()
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x009c
            j4.h r7 = r7.mo2695g()
            byte[] r0 = r7.mo4614D()     // Catch:{ all -> 0x0095 }
            p042g2.C0955a.m2730d(r7, r1)
            int r7 = r0.length
            r4 = -1
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0092
            long r4 = (long) r7
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x006e
            goto L_0x0092
        L_0x006e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Content-Length ("
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ") and stream length ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") disagree"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x0092:
            r1 = r0
            goto L_0x0107
        L_0x0095:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            p042g2.C0955a.m2730d(r7, r0)
            throw r1
        L_0x009c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = p059j1.C1087a.m3111a(r0, r2)
            r7.<init>(r0)
            throw r7
        L_0x00a8:
            boolean r0 = r7 instanceof p114s2.C1713d.C1715b
            r2 = 0
            if (r0 == 0) goto L_0x00c9
            java.lang.Object[] r0 = new java.lang.Object[r3]
            s2.d$b r7 = (p114s2.C1713d.C1715b) r7
            U r7 = r7.f5288a
            r0[r2] = r7
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L_0x00ba
            goto L_0x00f1
        L_0x00ba:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r0
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String r0 = "Server error encountered: %1$s"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            goto L_0x0102
        L_0x00c9:
            boolean r0 = r7 instanceof p114s2.C1713d.C1714a
            if (r0 == 0) goto L_0x00e9
            java.lang.Object[] r0 = new java.lang.Object[r3]
            s2.d$a r7 = (p114s2.C1713d.C1714a) r7
            java.io.IOException r7 = r7.f5287a
            r0[r2] = r7
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L_0x00da
            goto L_0x00f1
        L_0x00da:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r0
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String r0 = "Network error encountered."
            java.lang.String r7 = java.lang.String.format(r0, r7)
            goto L_0x0102
        L_0x00e9:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r7
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L_0x00f4
        L_0x00f1:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x0107
        L_0x00f4:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r0
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String r0 = "Unexpected error encountered: : %1$s"
            java.lang.String r7 = java.lang.String.format(r0, r7)
        L_0x0102:
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            p072l2.C1241e.m3516f(r7, r0)
        L_0x0107:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p059j1.C1088b.mo4586a(w2.d):java.lang.Object");
    }
}
