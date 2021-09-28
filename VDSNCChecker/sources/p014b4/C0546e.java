package p014b4;

import p062j4.C1115i;
import p067k3.C1205h;
import p072l2.C1241e;
import p139w3.C2072g0;
import p144x3.C2129c;

/* renamed from: b4.e */
public final class C0546e {

    /* renamed from: a */
    public static final C1115i f2336a;

    /* renamed from: b */
    public static final C1115i f2337b;

    static {
        C1115i.C1116a aVar = C1115i.f3890i;
        f2336a = aVar.mo4683b("\"\\");
        f2337b = aVar.mo4683b("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m1798a(C2072g0 g0Var) {
        if (C1241e.m3513b(g0Var.f6001e.f5974c, "HEAD")) {
            return false;
        }
        int i = g0Var.f6004h;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && C2129c.m5522j(g0Var) == -1 && !C1205h.m3427K("chunked", C2072g0.m5415a(g0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4785g.mo5493a(r7) == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (r8 == false) goto L_0x020d;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1799b(p139w3.C2091o r28, p139w3.C2106x r29, p139w3.C2103w r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.String r3 = "$this$receiveHeaders"
            p072l2.C1241e.m3517j(r0, r3)
            java.lang.String r3 = "url"
            p072l2.C1241e.m3517j(r1, r3)
            java.lang.String r4 = "headers"
            p072l2.C1241e.m3517j(r2, r4)
            w3.o r5 = p139w3.C2091o.f6092a
            if (r0 != r5) goto L_0x001a
            return
        L_0x001a:
            w3.m r5 = p139w3.C2089m.f6082n
            p072l2.C1241e.m3517j(r1, r3)
            p072l2.C1241e.m3517j(r2, r4)
            java.lang.String r4 = "Set-Cookie"
            java.lang.String r5 = "name"
            p072l2.C1241e.m3517j(r4, r5)
            int r5 = r30.size()
            r6 = 0
            r7 = 0
            r8 = r6
        L_0x0030:
            r9 = 2
            r10 = 1
            if (r8 >= r5) goto L_0x004f
            java.lang.String r11 = r2.mo6612c(r8)
            boolean r10 = p067k3.C1205h.m3427K(r4, r11, r10)
            if (r10 == 0) goto L_0x004c
            if (r7 != 0) goto L_0x0045
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r9)
        L_0x0045:
            java.lang.String r9 = r2.mo6614e(r8)
            r7.add(r9)
        L_0x004c:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x004f:
            if (r7 == 0) goto L_0x005b
            java.util.List r2 = java.util.Collections.unmodifiableList(r7)
            java.lang.String r4 = "Collections.unmodifiableList(result)"
            p072l2.C1241e.m3516f(r2, r4)
            goto L_0x005d
        L_0x005b:
            u2.m r2 = p126u2.C1852m.f5542e
        L_0x005d:
            int r4 = r2.size()
            r5 = 0
            r7 = r6
        L_0x0063:
            if (r6 >= r4) goto L_0x0258
            java.lang.Object r8 = r2.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            p072l2.C1241e.m3517j(r1, r3)
            java.lang.String r9 = "setCookie"
            p072l2.C1241e.m3517j(r8, r9)
            long r10 = java.lang.System.currentTimeMillis()
            p072l2.C1241e.m3517j(r1, r3)
            p072l2.C1241e.m3517j(r8, r9)
            byte[] r9 = p144x3.C2129c.f6169a
            int r9 = r8.length()
            r12 = 59
            int r9 = p144x3.C2129c.m5517e(r8, r12, r7, r9)
            r13 = 61
            int r13 = p144x3.C2129c.m5517e(r8, r13, r7, r9)
            if (r13 != r9) goto L_0x0095
        L_0x0091:
            r30 = r2
            goto L_0x0245
        L_0x0095:
            java.lang.String r15 = p144x3.C2129c.m5535w(r8, r7, r13)
            int r14 = r15.length()
            if (r14 != 0) goto L_0x00a1
            r14 = 1
            goto L_0x00a2
        L_0x00a1:
            r14 = r7
        L_0x00a2:
            if (r14 != 0) goto L_0x0091
            int r7 = p144x3.C2129c.m5524l(r15)
            r14 = -1
            if (r7 == r14) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            int r13 = r13 + 1
            java.lang.String r16 = p144x3.C2129c.m5535w(r8, r13, r9)
            int r7 = p144x3.C2129c.m5524l(r16)
            if (r7 == r14) goto L_0x00bc
        L_0x00b8:
            r30 = r2
            goto L_0x020d
        L_0x00bc:
            int r9 = r9 + 1
            int r7 = r8.length()
            r17 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r26 = r23
            r27 = r24
            r23 = r21
            r24 = r22
            r21 = r19
            r22 = r20
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x00e1:
            if (r9 >= r7) goto L_0x017e
            int r12 = p144x3.C2129c.m5517e(r8, r12, r9, r7)
            r13 = 61
            int r13 = p144x3.C2129c.m5517e(r8, r13, r9, r12)
            java.lang.String r9 = p144x3.C2129c.m5535w(r8, r9, r13)
            if (r13 >= r12) goto L_0x00fa
            int r13 = r13 + 1
            java.lang.String r13 = p144x3.C2129c.m5535w(r8, r13, r12)
            goto L_0x00fc
        L_0x00fa:
            java.lang.String r13 = ""
        L_0x00fc:
            java.lang.String r14 = "expires"
            r30 = r2
            r2 = 1
            boolean r14 = p067k3.C1205h.m3427K(r9, r14, r2)
            if (r14 == 0) goto L_0x0111
            int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x0176 }
            r14 = 0
            long r19 = p139w3.C2089m.m5450b(r13, r14, r9)     // Catch:{ IllegalArgumentException -> 0x0176 }
            goto L_0x011d
        L_0x0111:
            java.lang.String r14 = "max-age"
            boolean r14 = p067k3.C1205h.m3427K(r9, r14, r2)
            if (r14 == 0) goto L_0x0120
            long r17 = p139w3.C2089m.m5451c(r13)     // Catch:{  }
        L_0x011d:
            r23 = r2
            goto L_0x0176
        L_0x0120:
            java.lang.String r14 = "domain"
            boolean r2 = p067k3.C1205h.m3427K(r9, r14, r2)
            if (r2 == 0) goto L_0x0155
            java.lang.String r2 = "."
            r9 = 0
            r14 = 2
            boolean r9 = p067k3.C1205h.m3426J(r13, r2, r9, r14)     // Catch:{ IllegalArgumentException -> 0x0176 }
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0149
            java.lang.String r2 = p067k3.C1209l.m3450e0(r13, r2)     // Catch:{ IllegalArgumentException -> 0x0176 }
            java.lang.String r2 = p073l3.C1320u.m3694A(r2)     // Catch:{ IllegalArgumentException -> 0x0176 }
            if (r2 == 0) goto L_0x0143
            r24 = 0
            r26 = r2
            goto L_0x0176
        L_0x0143:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0176 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0176 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0176 }
        L_0x0149:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0176 }
            java.lang.String r9 = "Failed requirement."
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0176 }
            r2.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0176 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0176 }
        L_0x0155:
            java.lang.String r2 = "path"
            r14 = 1
            boolean r2 = p067k3.C1205h.m3427K(r9, r2, r14)
            if (r2 == 0) goto L_0x0161
            r27 = r13
            goto L_0x0176
        L_0x0161:
            java.lang.String r2 = "secure"
            boolean r2 = p067k3.C1205h.m3427K(r9, r2, r14)
            if (r2 == 0) goto L_0x016c
            r21 = r14
            goto L_0x0176
        L_0x016c:
            java.lang.String r2 = "httponly"
            boolean r2 = p067k3.C1205h.m3427K(r9, r2, r14)
            if (r2 == 0) goto L_0x0176
            r22 = 1
        L_0x0176:
            int r9 = r12 + 1
            r12 = 59
            r2 = r30
            goto L_0x00e1
        L_0x017e:
            r30 = r2
            r7 = -9223372036854775808
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0187
            goto L_0x01b1
        L_0x0187:
            r7 = -1
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x01b7
            r7 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x019c
            r2 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r2
            long r17 = r17 * r7
            goto L_0x01a1
        L_0x019c:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01a1:
            long r7 = r10 + r17
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r9 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r2 < 0) goto L_0x01b4
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r17 = r7
            goto L_0x01b9
        L_0x01b4:
            r17 = r9
            goto L_0x01b9
        L_0x01b7:
            r17 = r19
        L_0x01b9:
            java.lang.String r2 = r1.f6120e
            r7 = r26
            if (r7 != 0) goto L_0x01c1
            r7 = r2
            goto L_0x01f9
        L_0x01c1:
            boolean r8 = p072l2.C1241e.m3513b(r2, r7)
            if (r8 == 0) goto L_0x01c9
            r8 = 1
            goto L_0x01f6
        L_0x01c9:
            r8 = 2
            r9 = 0
            boolean r8 = p067k3.C1205h.m3426J(r2, r7, r9, r8)
            if (r8 == 0) goto L_0x01f5
            int r8 = r2.length()
            int r9 = r7.length()
            int r8 = r8 - r9
            r9 = 1
            int r8 = r8 - r9
            char r8 = r2.charAt(r8)
            r10 = 46
            if (r8 != r10) goto L_0x01f5
            byte[] r8 = p144x3.C2129c.f6169a
            java.lang.String r8 = "$this$canParseAsIpAddress"
            p072l2.C1241e.m3517j(r2, r8)
            k3.c r8 = p144x3.C2129c.f6173e
            boolean r8 = r8.mo4808a(r2)
            if (r8 != 0) goto L_0x01f5
            r8 = r9
            goto L_0x01f6
        L_0x01f5:
            r8 = 0
        L_0x01f6:
            if (r8 != 0) goto L_0x01f9
            goto L_0x020d
        L_0x01f9:
            int r2 = r2.length()
            int r8 = r7.length()
            if (r2 == r8) goto L_0x020f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4786h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4785g
            java.lang.String r2 = r2.mo5493a(r7)
            if (r2 != 0) goto L_0x020f
        L_0x020d:
            r7 = 0
            goto L_0x0245
        L_0x020f:
            java.lang.String r2 = "/"
            r8 = 2
            r9 = 0
            r10 = r27
            if (r10 == 0) goto L_0x0221
            boolean r8 = p067k3.C1205h.m3434R(r10, r2, r9, r8)
            if (r8 != 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            r20 = r10
            goto L_0x0239
        L_0x0221:
            java.lang.String r8 = r29.mo6628b()
            r10 = 47
            r11 = 6
            int r10 = p067k3.C1209l.m3447b0(r8, r10, r9, r9, r11)
            if (r10 == 0) goto L_0x0237
            java.lang.String r2 = r8.substring(r9, r10)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r2, r8)
        L_0x0237:
            r20 = r2
        L_0x0239:
            w3.m r2 = new w3.m
            r25 = 0
            r14 = r2
            r19 = r7
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            r7 = r9
            goto L_0x0246
        L_0x0245:
            r2 = 0
        L_0x0246:
            if (r2 == 0) goto L_0x0252
            if (r5 != 0) goto L_0x024f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x024f:
            r5.add(r2)
        L_0x0252:
            int r6 = r6 + 1
            r2 = r30
            goto L_0x0063
        L_0x0258:
            if (r5 == 0) goto L_0x0264
            java.util.List r2 = java.util.Collections.unmodifiableList(r5)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            p072l2.C1241e.m3516f(r2, r3)
            goto L_0x0266
        L_0x0264:
            u2.m r2 = p126u2.C1852m.f5542e
        L_0x0266:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x026d
            return
        L_0x026d:
            r0.mo6596a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b4.C0546e.m1799b(w3.o, w3.x, w3.w):void");
    }
}
