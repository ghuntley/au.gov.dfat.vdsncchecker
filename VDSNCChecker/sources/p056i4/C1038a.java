package p056i4;

import java.util.Set;
import p067k3.C1205h;
import p072l2.C1241e;
import p126u2.C1854o;
import p139w3.C2103w;
import p139w3.C2109y;

/* renamed from: i4.a */
public final class C1038a implements C2109y {

    /* renamed from: a */
    public volatile Set<String> f3769a;

    /* renamed from: b */
    public volatile C1039a f3770b;

    /* renamed from: c */
    public final C1040b f3771c;

    /* renamed from: i4.a$a */
    public enum C1039a {
        NONE,
        HEADERS,
        BODY
    }

    /* renamed from: i4.a$b */
    public interface C1040b {

        /* renamed from: a */
        public static final C1040b f3776a = new C1041b();

        /* renamed from: a */
        void mo4476a(String str);
    }

    public C1038a(C1040b bVar, int i) {
        C1040b bVar2 = (i & 1) != 0 ? C1040b.f3776a : null;
        C1241e.m3518k(bVar2, "logger");
        this.f3771c = bVar2;
        this.f3769a = C1854o.f5544e;
        this.f3770b = C1039a.NONE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p139w3.C2072g0 mo8a(p139w3.C2109y.C2110a r21) {
        /*
            r20 = this;
            r1 = r20
            i4.a$a r0 = r1.f3770b
            r2 = r21
            b4.g r2 = (p014b4.C0548g) r2
            w3.d0 r3 = r2.f2343f
            i4.a$a r4 = p056i4.C1038a.C1039a.NONE
            if (r0 != r4) goto L_0x0013
            w3.g0 r0 = r2.mo2692c(r3)
            return r0
        L_0x0013:
            i4.a$a r4 = p056i4.C1038a.C1039a.BODY
            if (r0 != r4) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            i4.a$a r5 = p056i4.C1038a.C1039a.HEADERS
            if (r0 != r5) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            w3.f0 r5 = r3.f5976e
            w3.k r6 = r2.mo2691a()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = p000a.C0001b.m0a(r7)
            java.lang.String r8 = r3.f5974c
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            w3.x r8 = r3.f5973b
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0058
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = p000a.C0001b.m0a(r9)
            a4.i r6 = (p005a4.C0024i) r6
            w3.c0 r6 = r6.f72e
            p072l2.C1241e.m3515e(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0059
        L_0x0058:
            r6 = r8
        L_0x0059:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r0 != 0) goto L_0x007a
            if (r5 == 0) goto L_0x007a
            java.lang.StringBuilder r6 = p099q.C1599h.m4503a(r6, r9)
            long r10 = r5.mo6448a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x007a:
            i4.a$b r10 = r1.f3771c
            r10.mo4476a(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            if (r0 == 0) goto L_0x018f
            w3.w r11 = r3.f5975d
            if (r5 == 0) goto L_0x00d5
            w3.z r12 = r5.mo6449b()
            if (r12 == 0) goto L_0x00ad
            java.lang.String r13 = "Content-Type"
            java.lang.String r13 = r11.mo6611b(r13)
            if (r13 != 0) goto L_0x00ad
            i4.a$b r13 = r1.f3771c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.mo4476a(r12)
        L_0x00ad:
            long r12 = r5.mo6448a()
            r14 = -1
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00d5
            java.lang.String r12 = "Content-Length"
            java.lang.String r12 = r11.mo6611b(r12)
            if (r12 != 0) goto L_0x00d5
            i4.a$b r12 = r1.f3771c
            java.lang.String r13 = "Content-Length: "
            java.lang.StringBuilder r13 = p000a.C0001b.m0a(r13)
            long r14 = r5.mo6448a()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.mo4476a(r13)
        L_0x00d5:
            int r12 = r11.size()
            r13 = 0
        L_0x00da:
            if (r13 >= r12) goto L_0x00e2
            r1.mo4475c(r11, r13)
            int r13 = r13 + 1
            goto L_0x00da
        L_0x00e2:
            java.lang.String r11 = "--> END "
            if (r4 == 0) goto L_0x017a
            if (r5 != 0) goto L_0x00ea
            goto L_0x017a
        L_0x00ea:
            w3.w r12 = r3.f5975d
            boolean r12 = r1.mo4474b(r12)
            if (r12 == 0) goto L_0x010b
            i4.a$b r5 = r1.f3771c
            java.lang.StringBuilder r11 = p000a.C0001b.m0a(r11)
            java.lang.String r12 = r3.f5974c
            r11.append(r12)
            java.lang.String r12 = " (encoded body omitted)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.mo4476a(r11)
            goto L_0x018f
        L_0x010b:
            j4.f r12 = new j4.f
            r12.<init>()
            r5.mo6450c(r12)
            w3.z r13 = r5.mo6449b()
            if (r13 == 0) goto L_0x0122
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r13 = r13.mo6646a(r14)
            if (r13 == 0) goto L_0x0122
            goto L_0x0127
        L_0x0122:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            p072l2.C1241e.m3514d(r13, r10)
        L_0x0127:
            i4.a$b r14 = r1.f3771c
            r14.mo4476a(r8)
            boolean r14 = p073l3.C1320u.m3714r(r12)
            if (r14 == 0) goto L_0x015c
            i4.a$b r14 = r1.f3771c
            r15 = r6
            r21 = r7
            long r6 = r12.f3888f
            java.lang.String r6 = r12.mo4616F(r6, r13)
            r14.mo4476a(r6)
            i4.a$b r6 = r1.f3771c
            java.lang.StringBuilder r7 = p000a.C0001b.m0a(r11)
            java.lang.String r11 = r3.f5974c
            r7.append(r11)
            r7.append(r9)
            long r11 = r5.mo6448a()
            r7.append(r11)
            r12 = r21
            r7.append(r12)
            r5 = r15
            goto L_0x0187
        L_0x015c:
            r15 = r6
            r12 = r7
            i4.a$b r6 = r1.f3771c
            java.lang.StringBuilder r7 = p000a.C0001b.m0a(r11)
            java.lang.String r11 = r3.f5974c
            r7.append(r11)
            java.lang.String r11 = " (binary "
            r7.append(r11)
            long r13 = r5.mo6448a()
            r7.append(r13)
            r5 = r15
            r7.append(r5)
            goto L_0x0187
        L_0x017a:
            r5 = r6
            r12 = r7
            i4.a$b r6 = r1.f3771c
            java.lang.StringBuilder r7 = p000a.C0001b.m0a(r11)
            java.lang.String r11 = r3.f5974c
            r7.append(r11)
        L_0x0187:
            java.lang.String r7 = r7.toString()
            r6.mo4476a(r7)
            goto L_0x0191
        L_0x018f:
            r5 = r6
            r12 = r7
        L_0x0191:
            long r6 = java.lang.System.nanoTime()
            w3.g0 r2 = r2.mo2692c(r3)     // Catch:{ Exception -> 0x0332 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 - r6
            long r6 = r3.toMillis(r13)
            w3.i0 r3 = r2.f6007k
            if (r3 == 0) goto L_0x032d
            long r13 = r3.mo2693a()
            r15 = -1
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x01c4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            java.lang.String r15 = "-byte"
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            goto L_0x01c6
        L_0x01c4:
            java.lang.String r11 = "unknown-length"
        L_0x01c6:
            i4.a$b r15 = r1.f3771c
            java.lang.String r16 = "<-- "
            r21 = r12
            java.lang.StringBuilder r12 = p000a.C0001b.m0a(r16)
            r16 = r13
            int r13 = r2.f6004h
            r12.append(r13)
            java.lang.String r13 = r2.f6003g
            int r13 = r13.length()
            if (r13 != 0) goto L_0x01e1
            r13 = 1
            goto L_0x01e2
        L_0x01e1:
            r13 = 0
        L_0x01e2:
            if (r13 == 0) goto L_0x01ea
            r13 = 32
            r19 = r5
            r5 = r8
            goto L_0x0205
        L_0x01ea:
            java.lang.String r13 = r2.f6003g
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = 32
            r19 = r5
            java.lang.String r5 = java.lang.String.valueOf(r18)
            r14.append(r5)
            r14.append(r13)
            java.lang.String r5 = r14.toString()
            r13 = r18
        L_0x0205:
            r12.append(r5)
            r12.append(r13)
            w3.d0 r5 = r2.f6001e
            w3.x r5 = r5.f5973b
            r12.append(r5)
            r12.append(r9)
            r12.append(r6)
            java.lang.String r5 = "ms"
            r12.append(r5)
            if (r0 != 0) goto L_0x0228
            java.lang.String r5 = ", "
            java.lang.String r6 = " body"
            java.lang.String r5 = p016c0.C0559c.m1823a(r5, r11, r6)
            goto L_0x0229
        L_0x0228:
            r5 = r8
        L_0x0229:
            r12.append(r5)
            r5 = 41
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r15.mo4476a(r5)
            if (r0 == 0) goto L_0x032c
            w3.w r0 = r2.f6006j
            int r5 = r0.size()
            r6 = 0
        L_0x0241:
            if (r6 >= r5) goto L_0x0249
            r1.mo4475c(r0, r6)
            int r6 = r6 + 1
            goto L_0x0241
        L_0x0249:
            if (r4 == 0) goto L_0x0325
            boolean r4 = p014b4.C0546e.m1798a(r2)
            if (r4 != 0) goto L_0x0253
            goto L_0x0325
        L_0x0253:
            w3.w r4 = r2.f6006j
            boolean r4 = r1.mo4474b(r4)
            if (r4 == 0) goto L_0x0261
            i4.a$b r0 = r1.f3771c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L_0x0329
        L_0x0261:
            j4.h r4 = r3.mo2695g()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo4658t(r5)
            j4.f r4 = r4.mo4637b()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r0 = r0.mo6611b(r5)
            java.lang.String r5 = "gzip"
            r6 = 1
            boolean r0 = p067k3.C1205h.m3427K(r5, r0, r6)
            if (r0 == 0) goto L_0x02a5
            long r5 = r4.f3888f
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            j4.m r5 = new j4.m
            j4.f r4 = r4.clone()
            r5.<init>(r4)
            j4.f r4 = new j4.f     // Catch:{ all -> 0x029c }
            r4.<init>()     // Catch:{ all -> 0x029c }
            r4.mo4632W(r5)     // Catch:{ all -> 0x029c }
            r6 = 0
            p042g2.C0955a.m2730d(r5, r6)
            goto L_0x02a6
        L_0x029c:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x029f }
        L_0x029f:
            r0 = move-exception
            r3 = r0
            p042g2.C0955a.m2730d(r5, r2)
            throw r3
        L_0x02a5:
            r0 = 0
        L_0x02a6:
            w3.z r3 = r3.mo2694c()
            if (r3 == 0) goto L_0x02b5
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r3 = r3.mo6646a(r5)
            if (r3 == 0) goto L_0x02b5
            goto L_0x02ba
        L_0x02b5:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            p072l2.C1241e.m3514d(r3, r10)
        L_0x02ba:
            boolean r5 = p073l3.C1320u.m3714r(r4)
            if (r5 != 0) goto L_0x02df
            i4.a$b r0 = r1.f3771c
            r0.mo4476a(r8)
            i4.a$b r0 = r1.f3771c
            java.lang.String r3 = "<-- END HTTP (binary "
            java.lang.StringBuilder r3 = p000a.C0001b.m0a(r3)
            long r4 = r4.f3888f
            r3.append(r4)
            r4 = r19
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo4476a(r3)
            return r2
        L_0x02df:
            r5 = 0
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02f9
            i4.a$b r5 = r1.f3771c
            r5.mo4476a(r8)
            i4.a$b r5 = r1.f3771c
            j4.f r6 = r4.clone()
            long r7 = r6.f3888f
            java.lang.String r3 = r6.mo4616F(r7, r3)
            r5.mo4476a(r3)
        L_0x02f9:
            java.lang.String r3 = "<-- END HTTP ("
            i4.a$b r5 = r1.f3771c
            java.lang.StringBuilder r3 = p000a.C0001b.m0a(r3)
            if (r0 == 0) goto L_0x0313
            long r6 = r4.f3888f
            r3.append(r6)
            java.lang.String r4 = "-byte, "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r7 = "-gzipped-byte body)"
            goto L_0x031a
        L_0x0313:
            long r6 = r4.f3888f
            r3.append(r6)
            r7 = r21
        L_0x031a:
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r5.mo4476a(r0)
            goto L_0x032c
        L_0x0325:
            i4.a$b r0 = r1.f3771c
            java.lang.String r3 = "<-- END HTTP"
        L_0x0329:
            r0.mo4476a(r3)
        L_0x032c:
            return r2
        L_0x032d:
            p072l2.C1241e.m3523q()
            r0 = 0
            throw r0
        L_0x0332:
            r0 = move-exception
            r2 = r0
            i4.a$b r0 = r1.f3771c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.mo4476a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p056i4.C1038a.mo8a(w3.y$a):w3.g0");
    }

    /* renamed from: b */
    public final boolean mo4474b(C2103w wVar) {
        String b = wVar.mo6611b("Content-Encoding");
        return b != null && !C1205h.m3427K(b, "identity", true) && !C1205h.m3427K(b, "gzip", true);
    }

    /* renamed from: c */
    public final void mo4475c(C2103w wVar, int i) {
        String str;
        int i2 = i * 2;
        if (this.f3769a.contains(wVar.f6112e[i2])) {
            str = "██";
        } else {
            str = wVar.f6112e[i2 + 1];
        }
        C1040b bVar = this.f3771c;
        bVar.mo4476a(wVar.f6112e[i2] + ": " + str);
    }
}
