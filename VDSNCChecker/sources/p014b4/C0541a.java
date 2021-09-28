package p014b4;

import p072l2.C1241e;
import p139w3.C2091o;
import p139w3.C2109y;

/* renamed from: b4.a */
public final class C0541a implements C2109y {

    /* renamed from: a */
    public final C2091o f2331a;

    public C0541a(C2091o oVar) {
        C1241e.m3517j(oVar, "cookieJar");
        this.f2331a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p139w3.C2072g0 mo8a(p139w3.C2109y.C2110a r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            b4.g r1 = (p014b4.C0548g) r1
            w3.d0 r3 = r1.f2343f
            java.util.Objects.requireNonNull(r3)
            w3.d0$a r2 = new w3.d0$a
            r2.<init>(r3)
            w3.f0 r4 = r3.f5976e
            java.lang.String r5 = "Content-Type"
            r6 = -1
            java.lang.String r8 = "Content-Length"
            if (r4 == 0) goto L_0x0046
            w3.z r9 = r4.mo6449b()
            if (r9 == 0) goto L_0x0025
            java.lang.String r9 = r9.f6137a
            r2.mo6546b(r5, r9)
        L_0x0025:
            long r9 = r4.mo6448a()
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            java.lang.String r11 = "Transfer-Encoding"
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r2.mo6546b(r8, r4)
            w3.w$a r4 = r2.f5980c
            r4.mo6623d(r11)
            goto L_0x0046
        L_0x003c:
            java.lang.String r4 = "chunked"
            r2.mo6546b(r11, r4)
            w3.w$a r4 = r2.f5980c
            r4.mo6623d(r8)
        L_0x0046:
            java.lang.String r4 = "Host"
            java.lang.String r9 = r3.mo6543b(r4)
            r10 = 0
            if (r9 != 0) goto L_0x0058
            w3.x r9 = r3.f5973b
            java.lang.String r9 = p144x3.C2129c.m5532t(r9, r10)
            r2.mo6546b(r4, r9)
        L_0x0058:
            java.lang.String r4 = "Connection"
            java.lang.String r9 = r3.mo6543b(r4)
            if (r9 != 0) goto L_0x0065
            java.lang.String r9 = "Keep-Alive"
            r2.mo6546b(r4, r9)
        L_0x0065:
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r9 = r3.mo6543b(r4)
            java.lang.String r11 = "gzip"
            r12 = 1
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = "Range"
            java.lang.String r9 = r3.mo6543b(r9)
            if (r9 != 0) goto L_0x007d
            r2.mo6546b(r4, r11)
            r4 = r12
            goto L_0x007e
        L_0x007d:
            r4 = r10
        L_0x007e:
            w3.o r9 = r0.f2331a
            w3.x r13 = r3.f5973b
            java.util.List r9 = r9.mo6597b(r13)
            boolean r13 = r9.isEmpty()
            r13 = r13 ^ r12
            r14 = 0
            if (r13 == 0) goto L_0x00d6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.Iterator r9 = r9.iterator()
            r15 = r10
        L_0x0098:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x00c8
            java.lang.Object r16 = r9.next()
            int r17 = r15 + 1
            if (r15 < 0) goto L_0x00c4
            r10 = r16
            w3.m r10 = (p139w3.C2089m) r10
            if (r15 <= 0) goto L_0x00b1
            java.lang.String r15 = "; "
            r13.append(r15)
        L_0x00b1:
            java.lang.String r15 = r10.f6083a
            r13.append(r15)
            r15 = 61
            r13.append(r15)
            java.lang.String r10 = r10.f6084b
            r13.append(r10)
            r15 = r17
            r10 = 0
            goto L_0x0098
        L_0x00c4:
            p042g2.C0955a.m2723D()
            throw r14
        L_0x00c8:
            java.lang.String r9 = r13.toString()
            java.lang.String r10 = "StringBuilder().apply(builderAction).toString()"
            p072l2.C1241e.m3516f(r9, r10)
            java.lang.String r10 = "Cookie"
            r2.mo6546b(r10, r9)
        L_0x00d6:
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = r3.mo6543b(r9)
            if (r10 != 0) goto L_0x00e3
            java.lang.String r10 = "okhttp/4.9.1"
            r2.mo6546b(r9, r10)
        L_0x00e3:
            w3.d0 r2 = r2.mo6545a()
            w3.g0 r1 = r1.mo2692c(r2)
            w3.o r2 = r0.f2331a
            w3.x r9 = r3.f5973b
            w3.w r10 = r1.f6006j
            p014b4.C0546e.m1799b(r2, r9, r10)
            w3.c0 r9 = r1.f6002f
            int r10 = r1.f6004h
            java.lang.String r13 = r1.f6003g
            w3.v r15 = r1.f6005i
            w3.w r2 = r1.f6006j
            w3.w$a r2 = r2.mo6613d()
            w3.i0 r6 = r1.f6007k
            w3.g0 r7 = r1.f6008l
            w3.g0 r12 = r1.f6009m
            w3.g0 r14 = r1.f6010n
            r19 = r14
            r18 = r15
            long r14 = r1.f6011o
            r20 = r14
            long r14 = r1.f6012p
            a4.c r0 = r1.f6013q
            r22 = r2
            java.lang.String r2 = "request"
            p072l2.C1241e.m3517j(r3, r2)
            if (r4 == 0) goto L_0x016d
            java.lang.String r2 = "Content-Encoding"
            r4 = 2
            r23 = r6
            r24 = r7
            r6 = 0
            java.lang.String r7 = p139w3.C2072g0.m5415a(r1, r2, r6, r4)
            r6 = 1
            boolean r7 = p067k3.C1205h.m3427K(r11, r7, r6)
            if (r7 == 0) goto L_0x0172
            boolean r7 = p014b4.C0546e.m1798a(r1)
            if (r7 == 0) goto L_0x0172
            w3.i0 r7 = r1.f6007k
            if (r7 == 0) goto L_0x0172
            j4.m r11 = new j4.m
            j4.h r7 = r7.mo2695g()
            r11.<init>(r7)
            w3.w r7 = r1.f6006j
            w3.w$a r7 = r7.mo6613d()
            r7.mo6623d(r2)
            r7.mo6623d(r8)
            w3.w r2 = r7.mo6622c()
            w3.w$a r2 = r2.mo6613d()
            r7 = 0
            java.lang.String r1 = p139w3.C2072g0.m5415a(r1, r5, r7, r4)
            b4.h r4 = new b4.h
            j4.t r5 = new j4.t
            r5.<init>(r11)
            r7 = -1
            r4.<init>(r1, r7, r5)
            r23 = r4
            goto L_0x0174
        L_0x016d:
            r23 = r6
            r24 = r7
            r6 = 1
        L_0x0172:
            r2 = r22
        L_0x0174:
            if (r10 < 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r6 = 0
        L_0x0178:
            if (r6 == 0) goto L_0x01b2
            if (r9 == 0) goto L_0x01a6
            if (r13 == 0) goto L_0x019a
            w3.w r8 = r2.mo6622c()
            w3.g0 r1 = new w3.g0
            r2 = r1
            r4 = r9
            r5 = r13
            r6 = r10
            r10 = r24
            r7 = r18
            r9 = r23
            r11 = r12
            r12 = r19
            r15 = r14
            r13 = r20
            r17 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            return r1
        L_0x019a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code < 0: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b4.C0541a.mo8a(w3.y$a):w3.g0");
    }
}
