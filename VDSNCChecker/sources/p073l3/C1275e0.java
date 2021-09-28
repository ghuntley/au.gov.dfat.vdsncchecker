package p073l3;

import p042g2.C0955a;
import p072l2.C1241e;
import p091o3.C1530i;
import p138w2.C2043d;

/* renamed from: l3.e0 */
public abstract class C1275e0<T> extends C1530i {

    /* renamed from: g */
    public int f4279g;

    public C1275e0(int i) {
        this.f4279g = i;
    }

    /* renamed from: a */
    public void mo5032a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract C2043d<T> mo5033b();

    /* renamed from: c */
    public Throwable mo5034c(Object obj) {
        C1312r rVar = obj instanceof C1312r ? (C1312r) obj : null;
        if (rVar == null) {
            return null;
        }
        return rVar.f4322a;
    }

    /* renamed from: f */
    public <T> T mo5035f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void mo5036g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C0955a.m2727a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C1241e.m3515e(th);
            C1320u.m3712p(mo5033b().mo5012d(), new C1263a0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: h */
    public abstract Object mo5037h();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r4.mo5081W() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r4.mo5081W() != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            o3.j r0 = r10.f4757f
            w2.d r1 = r10.mo5033b()     // Catch:{ all -> 0x0090 }
            n3.d r1 = (p085n3.C1461d) r1     // Catch:{ all -> 0x0090 }
            w2.d<T> r2 = r1.f4597i     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.f4599k     // Catch:{ all -> 0x0090 }
            w2.f r3 = r2.mo5012d()     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = p085n3.C1475p.m4157b(r3, r1)     // Catch:{ all -> 0x0090 }
            h.o r4 = p085n3.C1475p.f4620a     // Catch:{ all -> 0x0090 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            l3.k1 r4 = p073l3.C1322v.m3723a(r2, r3, r1)     // Catch:{ all -> 0x0090 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            w2.f r6 = r2.mo5012d()     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r10.mo5037h()     // Catch:{ all -> 0x0040 }
            java.lang.Throwable r8 = r10.mo5034c(r7)     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x0042
            int r9 = r10.f4279g     // Catch:{ all -> 0x0040 }
            boolean r9 = p073l3.C1320u.m3713q(r9)     // Catch:{ all -> 0x0040 }
            if (r9 == 0) goto L_0x0042
            int r9 = p073l3.C1317t0.f4328b     // Catch:{ all -> 0x0040 }
            l3.t0$b r9 = p073l3.C1317t0.C1319b.f4329e     // Catch:{ all -> 0x0040 }
            w2.f$a r6 = r6.get(r9)     // Catch:{ all -> 0x0040 }
            l3.t0 r6 = (p073l3.C1317t0) r6     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r2 = move-exception
            goto L_0x0084
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005a
            boolean r9 = r6.mo5011a()     // Catch:{ all -> 0x0040 }
            if (r9 != 0) goto L_0x005a
            java.util.concurrent.CancellationException r6 = r6.mo5107k()     // Catch:{ all -> 0x0040 }
            r10.mo5032a(r7, r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = p042g2.C0955a.m2736j(r6)     // Catch:{ all -> 0x0040 }
        L_0x0056:
            r2.mo5013j(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x0066
        L_0x005a:
            if (r8 == 0) goto L_0x0061
            java.lang.Object r6 = p042g2.C0955a.m2736j(r8)     // Catch:{ all -> 0x0040 }
            goto L_0x0056
        L_0x0061:
            java.lang.Object r6 = r10.mo5035f(r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0056
        L_0x0066:
            t2.k r2 = p120t2.C1798k.f5446a     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0070
            boolean r4 = r4.mo5081W()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0073
        L_0x0070:
            p085n3.C1475p.m4156a(r3, r1)     // Catch:{ all -> 0x0090 }
        L_0x0073:
            r0.mo5477Q()     // Catch:{ all -> 0x0077 }
            goto L_0x007c
        L_0x0077:
            r0 = move-exception
            java.lang.Object r2 = p042g2.C0955a.m2736j(r0)
        L_0x007c:
            java.lang.Throwable r0 = p120t2.C1792f.m4971a(r2)
            r10.mo5036g(r5, r0)
            goto L_0x00a3
        L_0x0084:
            if (r4 == 0) goto L_0x008c
            boolean r4 = r4.mo5081W()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x008f
        L_0x008c:
            p085n3.C1475p.m4156a(r3, r1)     // Catch:{ all -> 0x0090 }
        L_0x008f:
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            r0.mo5477Q()     // Catch:{ all -> 0x0097 }
            t2.k r0 = p120t2.C1798k.f5446a     // Catch:{ all -> 0x0097 }
            goto L_0x009c
        L_0x0097:
            r0 = move-exception
            java.lang.Object r0 = p042g2.C0955a.m2736j(r0)
        L_0x009c:
            java.lang.Throwable r0 = p120t2.C1792f.m4971a(r0)
            r10.mo5036g(r1, r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1275e0.run():void");
    }
}
