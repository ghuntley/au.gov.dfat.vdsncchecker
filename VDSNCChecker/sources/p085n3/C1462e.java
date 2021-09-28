package p085n3;

import p045h.C0990o;

/* renamed from: n3.e */
public final class C1462e {

    /* renamed from: a */
    public static final C0990o f4600a = new C0990o("UNDEFINED");

    /* renamed from: b */
    public static final C0990o f4601b = new C0990o("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r8.mo5081W() != false) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m4130a(p138w2.C2043d<? super T> r6, java.lang.Object r7, p019c3.C0636l<? super java.lang.Throwable, p120t2.C1798k> r8) {
        /*
            boolean r0 = r6 instanceof p085n3.C1461d
            if (r0 == 0) goto L_0x00b6
            n3.d r6 = (p085n3.C1461d) r6
            java.lang.Object r8 = p073l3.C1320u.m3696C(r7, r8)
            l3.x r0 = r6.f4596h
            w2.f r1 = r6.mo5012d()
            boolean r0 = r0.mo5118S(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f4598j = r8
            r6.f4279g = r1
            l3.x r7 = r6.f4596h
            w2.f r8 = r6.mo5012d()
            r7.mo5067R(r8, r6)
            goto L_0x00b9
        L_0x0026:
            l3.i1 r0 = p073l3.C1288i1.f4293a
            l3.i0 r0 = p073l3.C1288i1.m3643a()
            boolean r2 = r0.mo5064X()
            if (r2 == 0) goto L_0x003b
            r6.f4598j = r8
            r6.f4279g = r1
            r0.mo5062V(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo5063W(r1)
            r2 = 0
            w2.f r3 = r6.mo5012d()     // Catch:{ all -> 0x00a9 }
            l3.t0$b r4 = p073l3.C1317t0.C1319b.f4329e     // Catch:{ all -> 0x00a9 }
            w2.f$a r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            l3.t0 r3 = (p073l3.C1317t0) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.mo5011a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x006b
            java.util.concurrent.CancellationException r3 = r3.mo5107k()     // Catch:{ all -> 0x00a9 }
            boolean r4 = r8 instanceof p073l3.C1314s     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x0062
            l3.s r8 = (p073l3.C1314s) r8     // Catch:{ all -> 0x00a9 }
            c3.l<java.lang.Throwable, t2.k> r8 = r8.f4326b     // Catch:{ all -> 0x00a9 }
            r8.mo2828m(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0062:
            java.lang.Object r8 = p042g2.C0955a.m2736j(r3)     // Catch:{ all -> 0x00a9 }
            r6.mo5013j(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            if (r8 != 0) goto L_0x00a2
            w2.d<T> r8 = r6.f4597i     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f4599k     // Catch:{ all -> 0x00a9 }
            w2.f r4 = r8.mo5012d()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = p085n3.C1475p.m4157b(r4, r3)     // Catch:{ all -> 0x00a9 }
            h.o r5 = p085n3.C1475p.f4620a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0083
            l3.k1 r8 = p073l3.C1322v.m3723a(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0084
        L_0x0083:
            r8 = r2
        L_0x0084:
            w2.d<T> r5 = r6.f4597i     // Catch:{ all -> 0x0095 }
            r5.mo5013j(r7)     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo5081W()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            p085n3.C1475p.m4156a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo5081W()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            p085n3.C1475p.m4156a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo5065Y()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo5036g(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo5060T(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo5060T(r1)
            throw r6
        L_0x00b6:
            r6.mo5013j(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p085n3.C1462e.m4130a(w2.d, java.lang.Object, c3.l):void");
    }
}
