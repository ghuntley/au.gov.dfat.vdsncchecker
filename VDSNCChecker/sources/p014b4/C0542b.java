package p014b4;

import p139w3.C2109y;

/* renamed from: b4.b */
public final class C0542b implements C2109y {

    /* renamed from: a */
    public final boolean f2332a;

    public C0542b(boolean z) {
        this.f2332a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0215, code lost:
        if (p067k3.C1205h.m3427K("close", p139w3.C2072g0.m5415a(r0, "Connection", (java.lang.String) null, 2), true) != false) goto L_0x0219;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p139w3.C2072g0 mo8a(p139w3.C2109y.C2110a r28) {
        /*
            r27 = this;
            java.lang.String r1 = "call"
            r0 = r28
            b4.g r0 = (p014b4.C0548g) r0
            a4.c r2 = r0.f2342e
            p072l2.C1241e.m3515e(r2)
            w3.d0 r0 = r0.f2343f
            w3.f0 r3 = r0.f5976e
            long r4 = java.lang.System.currentTimeMillis()
            w3.s r6 = r2.f17d     // Catch:{ IOException -> 0x02b7 }
            a4.e r7 = r2.f16c     // Catch:{ IOException -> 0x02b7 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ IOException -> 0x02b7 }
            p072l2.C1241e.m3517j(r7, r1)     // Catch:{ IOException -> 0x02b7 }
            b4.d r6 = r2.f19f     // Catch:{ IOException -> 0x02b7 }
            r6.mo2690h(r0)     // Catch:{ IOException -> 0x02b7 }
            w3.s r6 = r2.f17d     // Catch:{ IOException -> 0x02b7 }
            a4.e r7 = r2.f16c     // Catch:{ IOException -> 0x02b7 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ IOException -> 0x02b7 }
            p072l2.C1241e.m3517j(r7, r1)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r6 = r0.f5974c
            boolean r6 = p014b4.C0547f.m1800a(r6)
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x0092
            java.lang.String r6 = "Expect"
            java.lang.String r6 = r0.mo6543b(r6)
            java.lang.String r10 = "100-continue"
            boolean r6 = p067k3.C1205h.m3427K(r10, r6, r8)
            if (r6 == 0) goto L_0x0064
            b4.d r6 = r2.f19f     // Catch:{ IOException -> 0x0055 }
            r6.mo2686d()     // Catch:{ IOException -> 0x0055 }
            w3.g0$a r6 = r2.mo12c(r8)
            r2.mo13d()
            r10 = r7
            goto L_0x0066
        L_0x0055:
            r0 = move-exception
            w3.s r3 = r2.f17d
            a4.e r4 = r2.f16c
            java.util.Objects.requireNonNull(r3)
            p072l2.C1241e.m3517j(r4, r1)
            r2.mo14e(r0)
            throw r0
        L_0x0064:
            r10 = r8
            r6 = r9
        L_0x0066:
            if (r6 != 0) goto L_0x0079
            j4.x r8 = r2.mo11b(r0, r7)
            j4.g r8 = p062j4.C1106b.m3133c(r8)
            r3.mo6450c(r8)
            j4.s r8 = (p062j4.C1127s) r8
            r8.close()
            goto L_0x008f
        L_0x0079:
            a4.e r3 = r2.f16c
            r3.mo34k(r2, r8, r7, r9)
            a4.i r3 = r2.f15b
            boolean r3 = r3.mo50j()
            if (r3 != 0) goto L_0x008f
            b4.d r3 = r2.f19f
            a4.i r3 = r3.mo2689g()
            r3.mo52l()
        L_0x008f:
            r9 = r6
            r8 = r10
            goto L_0x0097
        L_0x0092:
            a4.e r3 = r2.f16c
            r3.mo34k(r2, r8, r7, r9)
        L_0x0097:
            b4.d r3 = r2.f19f     // Catch:{ IOException -> 0x02a8 }
            r3.mo2684c()     // Catch:{ IOException -> 0x02a8 }
            if (r9 != 0) goto L_0x00ab
            w3.g0$a r9 = r2.mo12c(r7)
            p072l2.C1241e.m3515e(r9)
            if (r8 == 0) goto L_0x00ab
            r2.mo13d()
            r8 = r7
        L_0x00ab:
            r9.mo6562g(r0)
            a4.i r3 = r2.f15b
            w3.v r3 = r3.f71d
            r9.f6018e = r3
            r9.f6024k = r4
            long r10 = java.lang.System.currentTimeMillis()
            r9.f6025l = r10
            w3.g0 r3 = r9.mo6556a()
            int r6 = r3.f6004h
            r9 = 100
            if (r6 != r9) goto L_0x00e9
            w3.g0$a r3 = r2.mo12c(r7)
            p072l2.C1241e.m3515e(r3)
            if (r8 == 0) goto L_0x00d2
            r2.mo13d()
        L_0x00d2:
            r3.mo6562g(r0)
            a4.i r0 = r2.f15b
            w3.v r0 = r0.f71d
            r3.f6018e = r0
            r3.f6024k = r4
            long r4 = java.lang.System.currentTimeMillis()
            r3.f6025l = r4
            w3.g0 r3 = r3.mo6556a()
            int r6 = r3.f6004h
        L_0x00e9:
            w3.s r0 = r2.f17d
            a4.e r4 = r2.f16c
            java.util.Objects.requireNonNull(r0)
            p072l2.C1241e.m3517j(r4, r1)
            r4 = r27
            boolean r0 = r4.f2332a
            java.lang.String r5 = "message == null"
            java.lang.String r7 = "protocol == null"
            java.lang.String r8 = "request == null"
            java.lang.String r9 = "code < 0: "
            if (r0 == 0) goto L_0x0183
            r0 = 101(0x65, float:1.42E-43)
            if (r6 != r0) goto L_0x0183
            w3.d0 r11 = r3.f6001e
            w3.c0 r12 = r3.f6002f
            int r14 = r3.f6004h
            java.lang.String r13 = r3.f6003g
            w3.v r15 = r3.f6005i
            w3.w r0 = r3.f6006j
            w3.w$a r0 = r0.mo6613d()
            w3.g0 r1 = r3.f6008l
            w3.g0 r10 = r3.f6009m
            w3.g0 r4 = r3.f6010n
            r28 = r8
            r16 = r9
            long r8 = r3.f6011o
            r26 = r6
            r17 = r7
            long r6 = r3.f6012p
            a4.c r3 = r3.f6013q
            w3.i0 r18 = p144x3.C2129c.f6171c
            if (r14 < 0) goto L_0x0130
            r19 = 1
            goto L_0x0132
        L_0x0130:
            r19 = 0
        L_0x0132:
            if (r19 == 0) goto L_0x0173
            if (r11 == 0) goto L_0x0169
            if (r12 == 0) goto L_0x015f
            if (r13 == 0) goto L_0x0155
            w3.w r16 = r0.mo6622c()
            w3.g0 r0 = new w3.g0
            r5 = r10
            r10 = r0
            r17 = r18
            r18 = r1
            r19 = r5
            r20 = r4
            r21 = r8
            r23 = r6
            r25 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25)
            goto L_0x01fa
        L_0x0155:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            r0 = r16
            java.lang.String r0 = androidx.appcompat.widget.C0131a0.m344a(r0, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0183:
            r26 = r6
            r17 = r7
            r28 = r8
            r0 = r9
            w3.d0 r4 = r3.f6001e
            w3.c0 r6 = r3.f6002f
            int r7 = r3.f6004h
            java.lang.String r8 = r3.f6003g
            w3.v r9 = r3.f6005i
            w3.w r10 = r3.f6006j
            w3.w$a r10 = r10.mo6613d()
            w3.g0 r11 = r3.f6008l
            w3.g0 r12 = r3.f6009m
            w3.g0 r13 = r3.f6010n
            long r14 = r3.f6011o
            r18 = r0
            r16 = r1
            long r0 = r3.f6012p
            r19 = r0
            a4.c r0 = r3.f6013q
            java.lang.String r1 = "Content-Type"
            r21 = r5
            r5 = 0
            r22 = r0
            r0 = 2
            java.lang.String r0 = p139w3.C2072g0.m5415a(r3, r1, r5, r0)     // Catch:{ IOException -> 0x0297 }
            b4.d r1 = r2.f19f     // Catch:{ IOException -> 0x0297 }
            r23 = r14
            long r14 = r1.mo2688f(r3)     // Catch:{ IOException -> 0x0297 }
            b4.d r1 = r2.f19f     // Catch:{ IOException -> 0x0297 }
            j4.z r1 = r1.mo2682a(r3)     // Catch:{ IOException -> 0x0297 }
            a4.c$b r3 = new a4.c$b     // Catch:{ IOException -> 0x0297 }
            r3.<init>(r2, r1, r14)     // Catch:{ IOException -> 0x0297 }
            b4.h r1 = new b4.h     // Catch:{ IOException -> 0x0297 }
            j4.t r5 = new j4.t     // Catch:{ IOException -> 0x0297 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0297 }
            r1.<init>(r0, r14, r5)     // Catch:{ IOException -> 0x0297 }
            if (r7 < 0) goto L_0x01d9
            r0 = 1
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            if (r0 == 0) goto L_0x0287
            if (r4 == 0) goto L_0x027d
            if (r6 == 0) goto L_0x0273
            if (r8 == 0) goto L_0x0269
            w3.w r0 = r10.mo6622c()
            w3.g0 r21 = new w3.g0
            r3 = r21
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r0
            r10 = r1
            r14 = r23
            r16 = r19
            r18 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r0 = r21
        L_0x01fa:
            w3.d0 r1 = r0.f6001e
            java.lang.String r3 = "Connection"
            java.lang.String r1 = r1.mo6543b(r3)
            java.lang.String r4 = "close"
            r5 = 1
            boolean r1 = p067k3.C1205h.m3427K(r4, r1, r5)
            if (r1 != 0) goto L_0x0218
            r1 = 2
            r6 = 0
            java.lang.String r1 = p139w3.C2072g0.m5415a(r0, r3, r6, r1)
            boolean r1 = p067k3.C1205h.m3427K(r4, r1, r5)
            if (r1 == 0) goto L_0x0222
            goto L_0x0219
        L_0x0218:
            r6 = 0
        L_0x0219:
            b4.d r1 = r2.f19f
            a4.i r1 = r1.mo2689g()
            r1.mo52l()
        L_0x0222:
            r1 = 204(0xcc, float:2.86E-43)
            r2 = r26
            if (r2 == r1) goto L_0x022c
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L_0x0268
        L_0x022c:
            w3.i0 r1 = r0.f6007k
            if (r1 == 0) goto L_0x0235
            long r3 = r1.mo2693a()
            goto L_0x0237
        L_0x0235:
            r3 = -1
        L_0x0237:
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0268
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "HTTP "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " had non-zero Content-Length: "
            r3.append(r2)
            w3.i0 r0 = r0.f6007k
            if (r0 == 0) goto L_0x025d
            long r4 = r0.mo2693a()
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
        L_0x025d:
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0268:
            return r0
        L_0x0269:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r21.toString()
            r0.<init>(r1)
            throw r0
        L_0x0273:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0287:
            r0 = r18
            java.lang.String r0 = androidx.appcompat.widget.C0131a0.m344a(r0, r7)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0297:
            r0 = move-exception
            w3.s r1 = r2.f17d
            a4.e r3 = r2.f16c
            java.util.Objects.requireNonNull(r1)
            r1 = r16
            p072l2.C1241e.m3517j(r3, r1)
            r2.mo14e(r0)
            throw r0
        L_0x02a8:
            r0 = move-exception
            w3.s r3 = r2.f17d
            a4.e r4 = r2.f16c
            java.util.Objects.requireNonNull(r3)
            p072l2.C1241e.m3517j(r4, r1)
            r2.mo14e(r0)
            throw r0
        L_0x02b7:
            r0 = move-exception
            w3.s r3 = r2.f17d
            a4.e r4 = r2.f16c
            java.util.Objects.requireNonNull(r3)
            p072l2.C1241e.m3517j(r4, r1)
            r2.mo14e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b4.C0542b.mo8a(w3.y$a):w3.g0");
    }
}
