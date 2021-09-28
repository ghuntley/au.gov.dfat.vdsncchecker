package p128u4;

import p042g2.C0955a;
import p138w2.C2043d;
import p148y2.C2135c;
import p148y2.C2137e;

/* renamed from: u4.p */
public final class C1918p {

    /* renamed from: u4.p$a */
    public static final class C1919a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2043d f5641e;

        /* renamed from: f */
        public final /* synthetic */ Exception f5642f;

        public C1919a(C2043d dVar, Exception exc) {
            this.f5641e = dVar;
            this.f5642f = exc;
        }

        public final void run() {
            C0955a.m2743q(this.f5641e).mo5013j(C0955a.m2736j(this.f5642f));
        }
    }

    @C2137e(mo6675c = "retrofit2.KotlinExtensions", mo6676f = "KotlinExtensions.kt", mo6677l = {113}, mo6678m = "suspendAndThrow")
    /* renamed from: u4.p$b */
    public static final class C1920b extends C2135c {

        /* renamed from: h */
        public /* synthetic */ Object f5643h;

        /* renamed from: i */
        public int f5644i;

        /* renamed from: j */
        public Object f5645j;

        public C1920b(C2043d dVar) {
            super(dVar);
        }

        /* renamed from: g */
        public final Object mo4587g(Object obj) {
            this.f5643h = obj;
            this.f5644i |= Integer.MIN_VALUE;
            return C1918p.m5208a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m5208a(java.lang.Exception r4, p138w2.C2043d<?> r5) {
        /*
            boolean r0 = r5 instanceof p128u4.C1918p.C1920b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            u4.p$b r0 = (p128u4.C1918p.C1920b) r0
            int r1 = r0.f5644i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5644i = r1
            goto L_0x0018
        L_0x0013:
            u4.p$b r0 = new u4.p$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f5643h
            x2.a r1 = p143x2.C2124a.COROUTINE_SUSPENDED
            int r2 = r0.f5644i
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f5645j
            java.lang.Exception r4 = (java.lang.Exception) r4
            p042g2.C0955a.m2724E(r5)
            t2.k r4 = p120t2.C1798k.f5446a
            return r4
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p042g2.C0955a.m2724E(r5)
            r0.f5645j = r4
            r0.f5644i = r3
            l3.x r5 = p073l3.C1278f0.f4286b
            w2.f r2 = r0.mo5012d()
            u4.p$a r3 = new u4.p$a
            r3.<init>(r0, r4)
            r5.mo5067R(r2, r3)
            java.lang.String r4 = "frame"
            p072l2.C1241e.m3517j(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p128u4.C1918p.m5208a(java.lang.Exception, w2.d):java.lang.Object");
    }
}
