package p014b4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p005a4.C0016d;
import p005a4.C0017e;
import p005a4.C0024i;
import p005a4.C0028l;
import p072l2.C1241e;
import p139w3.C2057b0;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2083j0;
import p139w3.C2109y;
import p144x3.C2129c;

/* renamed from: b4.i */
public final class C0550i implements C2109y {

    /* renamed from: a */
    public final C2057b0 f2350a;

    public C0550i(C2057b0 b0Var) {
        C1241e.m3517j(b0Var, "client");
        this.f2350a = b0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: b4.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: u2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: b4.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: a4.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: w3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p139w3.C2072g0 mo8a(p139w3.C2109y.C2110a r49) {
        /*
            r48 = this;
            r1 = r48
            r2 = r49
            b4.g r2 = (p014b4.C0548g) r2
            w3.d0 r0 = r2.f2343f
            a4.e r3 = r2.f2339b
            u2.m r4 = p126u2.C1852m.f5542e
            r7 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r7
        L_0x0012:
            java.util.Objects.requireNonNull(r3)
            java.lang.String r11 = "request"
            p072l2.C1241e.m3517j(r4, r11)
            a4.c r11 = r3.f49m
            if (r11 != 0) goto L_0x0020
            r11 = r7
            goto L_0x0021
        L_0x0020:
            r11 = 0
        L_0x0021:
            if (r11 == 0) goto L_0x0313
            monitor-enter(r3)
            boolean r11 = r3.f51o     // Catch:{ all -> 0x030e }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02fe
            boolean r11 = r3.f50n     // Catch:{ all -> 0x030e }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02f0
            monitor-exit(r3)
            if (r0 == 0) goto L_0x008c
            a4.d r0 = new a4.d
            a4.j r11 = r3.f41e
            w3.x r12 = r4.f5973b
            boolean r13 = r12.f6116a
            if (r13 == 0) goto L_0x0054
            w3.b0 r13 = r3.f56t
            javax.net.ssl.SSLSocketFactory r14 = r13.f5934s
            if (r14 == 0) goto L_0x004c
            javax.net.ssl.HostnameVerifier r15 = r13.f5938w
            w3.h r13 = r13.f5939x
            r19 = r13
            r17 = r14
            r18 = r15
            goto L_0x005a
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x005a:
            w3.a r15 = new w3.a
            java.lang.String r13 = r12.f6120e
            int r14 = r12.f6121f
            w3.b0 r12 = r3.f56t
            w3.r r5 = r12.f5930o
            javax.net.SocketFactory r6 = r12.f5933r
            w3.c r7 = r12.f5932q
            r21 = 0
            r25 = r8
            java.util.List<w3.c0> r8 = r12.f5937v
            r26 = r9
            java.util.List<w3.l> r9 = r12.f5936u
            java.net.ProxySelector r12 = r12.f5931p
            r24 = r12
            r12 = r15
            r1 = r15
            r15 = r5
            r16 = r6
            r20 = r7
            r22 = r8
            r23 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            w3.s r5 = r3.f42f
            r0.<init>(r11, r1, r3, r5)
            r3.f46j = r0
            goto L_0x0090
        L_0x008c:
            r25 = r8
            r26 = r9
        L_0x0090:
            boolean r0 = r3.f53q     // Catch:{ all -> 0x02e7 }
            if (r0 != 0) goto L_0x02da
            w3.g0 r0 = r2.mo2692c(r4)     // Catch:{ k -> 0x029c, IOException -> 0x025c }
            if (r10 == 0) goto L_0x01ef
            w3.d0 r1 = r0.f6001e     // Catch:{ all -> 0x01e6 }
            w3.c0 r4 = r0.f6002f     // Catch:{ all -> 0x01e6 }
            int r5 = r0.f6004h     // Catch:{ all -> 0x01e6 }
            java.lang.String r6 = r0.f6003g     // Catch:{ all -> 0x01e6 }
            w3.v r7 = r0.f6005i     // Catch:{ all -> 0x01e6 }
            w3.w r8 = r0.f6006j     // Catch:{ all -> 0x01e6 }
            w3.w$a r8 = r8.mo6613d()     // Catch:{ all -> 0x01e6 }
            w3.i0 r9 = r0.f6007k     // Catch:{ all -> 0x01e6 }
            w3.g0 r11 = r0.f6008l     // Catch:{ all -> 0x01e6 }
            w3.g0 r12 = r0.f6009m     // Catch:{ all -> 0x01e6 }
            long r13 = r0.f6011o     // Catch:{ all -> 0x01e6 }
            r15 = r2
            r16 = r3
            long r2 = r0.f6012p     // Catch:{ all -> 0x01e4 }
            a4.c r0 = r0.f6013q     // Catch:{ all -> 0x01e4 }
            r17 = r15
            w3.d0 r15 = r10.f6001e     // Catch:{ all -> 0x01e4 }
            r18 = r0
            w3.c0 r0 = r10.f6002f     // Catch:{ all -> 0x01e4 }
            r19 = r2
            int r2 = r10.f6004h     // Catch:{ all -> 0x01e4 }
            java.lang.String r3 = r10.f6003g     // Catch:{ all -> 0x01e4 }
            r21 = r13
            w3.v r13 = r10.f6005i     // Catch:{ all -> 0x01e4 }
            w3.w r14 = r10.f6006j     // Catch:{ all -> 0x01e4 }
            w3.w$a r14 = r14.mo6613d()     // Catch:{ all -> 0x01e4 }
            r23 = r12
            w3.g0 r12 = r10.f6008l     // Catch:{ all -> 0x01e4 }
            r24 = r11
            w3.g0 r11 = r10.f6009m     // Catch:{ all -> 0x01e4 }
            r43 = r9
            w3.g0 r9 = r10.f6010n     // Catch:{ all -> 0x01e4 }
            r44 = r7
            r45 = r8
            long r7 = r10.f6011o     // Catch:{ all -> 0x01e4 }
            r46 = r4
            r47 = r5
            long r4 = r10.f6012p     // Catch:{ all -> 0x01e4 }
            a4.c r10 = r10.f6013q     // Catch:{ all -> 0x01e4 }
            r34 = 0
            if (r2 < 0) goto L_0x00f2
            r27 = 1
            goto L_0x00f4
        L_0x00f2:
            r27 = 0
        L_0x00f4:
            if (r27 == 0) goto L_0x01c9
            if (r15 == 0) goto L_0x01bd
            if (r0 == 0) goto L_0x01b1
            if (r3 == 0) goto L_0x01a5
            w3.w r33 = r14.mo6622c()     // Catch:{ all -> 0x01e4 }
            w3.g0 r14 = new w3.g0     // Catch:{ all -> 0x01e4 }
            r27 = r14
            r28 = r15
            r29 = r0
            r30 = r3
            r31 = r2
            r32 = r13
            r35 = r12
            r36 = r11
            r37 = r9
            r38 = r7
            r40 = r4
            r42 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01e4 }
            w3.i0 r0 = r14.f6007k     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x0123
            r0 = 1
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 == 0) goto L_0x0199
            if (r47 < 0) goto L_0x012a
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x017c
            if (r1 == 0) goto L_0x0170
            if (r46 == 0) goto L_0x0164
            if (r6 == 0) goto L_0x0158
            w3.w r33 = r45.mo6622c()     // Catch:{ all -> 0x01e4 }
            w3.g0 r0 = new w3.g0     // Catch:{ all -> 0x01e4 }
            r27 = r0
            r28 = r1
            r29 = r46
            r30 = r6
            r31 = r47
            r32 = r44
            r34 = r43
            r35 = r24
            r36 = r23
            r37 = r14
            r38 = r21
            r40 = r19
            r42 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01e4 }
            goto L_0x01f3
        L_0x0158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x0164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x0170:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x017c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e4 }
            r0.<init>()     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01e4 }
            r1 = r47
            r0.append(r1)     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e4 }
            throw r1     // Catch:{ all -> 0x01e4 }
        L_0x0199:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e4 }
            r0.<init>()     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01e4 }
            r0.append(r2)     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e4 }
            throw r1     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            goto L_0x01e9
        L_0x01e6:
            r0 = move-exception
            r16 = r3
        L_0x01e9:
            r2 = r48
            r1 = r16
            goto L_0x02eb
        L_0x01ef:
            r17 = r2
            r16 = r3
        L_0x01f3:
            r10 = r0
            r1 = r16
            a4.c r0 = r1.f49m     // Catch:{ all -> 0x0257 }
            r2 = r48
            w3.d0 r4 = r2.mo2696b(r10, r0)     // Catch:{ all -> 0x02e5 }
            if (r4 != 0) goto L_0x0225
            if (r0 == 0) goto L_0x0220
            boolean r0 = r0.f14a     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x0220
            boolean r0 = r1.f48l     // Catch:{ all -> 0x02e5 }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0214
            r1.f48l = r3     // Catch:{ all -> 0x02e5 }
            a4.e$c r0 = r1.f43g     // Catch:{ all -> 0x02e5 }
            r0.mo4606i()     // Catch:{ all -> 0x02e5 }
            goto L_0x0220
        L_0x0214:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02e5 }
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02e5 }
            r0.<init>(r3)     // Catch:{ all -> 0x02e5 }
            throw r0     // Catch:{ all -> 0x02e5 }
        L_0x0220:
            r3 = 0
            r1.mo31f(r3)
            return r10
        L_0x0225:
            w3.i0 r0 = r10.f6007k     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x022c
            p144x3.C2129c.m5515c(r0)     // Catch:{ all -> 0x02e5 }
        L_0x022c:
            int r9 = r26 + 1
            r0 = 20
            if (r9 > r0) goto L_0x0240
            r3 = 1
            r1.mo31f(r3)
            r3 = r1
            r1 = r2
            r2 = r17
            r8 = r25
            r0 = 1
            r7 = 1
            goto L_0x0012
        L_0x0240:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x02e5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e5 }
            r3.<init>()     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = "Too many follow-up requests: "
            r3.append(r4)     // Catch:{ all -> 0x02e5 }
            r3.append(r9)     // Catch:{ all -> 0x02e5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02e5 }
            r0.<init>(r3)     // Catch:{ all -> 0x02e5 }
            throw r0     // Catch:{ all -> 0x02e5 }
        L_0x0257:
            r0 = move-exception
            r2 = r48
            goto L_0x02eb
        L_0x025c:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r2 = r48
            r3 = r0
            boolean r0 = r3 instanceof p026d4.C0813a     // Catch:{ all -> 0x02e5 }
            if (r0 != 0) goto L_0x026a
            r0 = 1
            goto L_0x026b
        L_0x026a:
            r0 = 0
        L_0x026b:
            boolean r0 = r2.mo2697c(r3, r1, r4, r0)     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = "$this$plus"
            r5 = r25
            p072l2.C1241e.m3517j(r5, r0)     // Catch:{ all -> 0x02e5 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02e5 }
            int r6 = r5.size()     // Catch:{ all -> 0x02e5 }
            r7 = 1
            int r6 = r6 + r7
            r0.<init>(r6)     // Catch:{ all -> 0x02e5 }
            r0.addAll(r5)     // Catch:{ all -> 0x02e5 }
            r0.add(r3)     // Catch:{ all -> 0x02e5 }
            r1.mo31f(r7)
            r8 = r0
            r3 = r1
            r1 = r2
            r2 = r17
            r9 = r26
            r0 = 0
            goto L_0x0012
        L_0x0296:
            r5 = r25
            p144x3.C2129c.m5536x(r3, r5)     // Catch:{ all -> 0x02e5 }
            throw r3     // Catch:{ all -> 0x02e5 }
        L_0x029c:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r5 = r25
            r2 = r48
            r3 = r0
            java.io.IOException r0 = r3.f91e     // Catch:{ all -> 0x02e5 }
            r6 = 0
            boolean r0 = r2.mo2697c(r0, r1, r4, r6)     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x02d4
            java.io.IOException r0 = r3.f92f     // Catch:{ all -> 0x02e5 }
            java.lang.String r3 = "$this$plus"
            p072l2.C1241e.m3517j(r5, r3)     // Catch:{ all -> 0x02e5 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02e5 }
            int r7 = r5.size()     // Catch:{ all -> 0x02e5 }
            r8 = 1
            int r7 = r7 + r8
            r3.<init>(r7)     // Catch:{ all -> 0x02e5 }
            r3.addAll(r5)     // Catch:{ all -> 0x02e5 }
            r3.add(r0)     // Catch:{ all -> 0x02e5 }
            r1.mo31f(r8)
            r0 = r6
            r7 = r8
            r9 = r26
            r8 = r3
            r3 = r1
            r1 = r2
            r2 = r17
            goto L_0x0012
        L_0x02d4:
            java.io.IOException r0 = r3.f92f     // Catch:{ all -> 0x02e5 }
            p144x3.C2129c.m5536x(r0, r5)     // Catch:{ all -> 0x02e5 }
            throw r0     // Catch:{ all -> 0x02e5 }
        L_0x02da:
            r2 = r48
            r1 = r3
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02e5 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x02e5 }
            throw r0     // Catch:{ all -> 0x02e5 }
        L_0x02e5:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e7:
            r0 = move-exception
            r2 = r48
            r1 = r3
        L_0x02eb:
            r3 = 1
            r1.mo31f(r3)
            throw r0
        L_0x02f0:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x030c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x030c }
            r3.<init>(r0)     // Catch:{ all -> 0x030c }
            throw r3     // Catch:{ all -> 0x030c }
        L_0x02fe:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x030c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x030c }
            r3.<init>(r0)     // Catch:{ all -> 0x030c }
            throw r3     // Catch:{ all -> 0x030c }
        L_0x030c:
            r0 = move-exception
            goto L_0x0311
        L_0x030e:
            r0 = move-exception
            r2 = r1
            r1 = r3
        L_0x0311:
            monitor-exit(r1)
            throw r0
        L_0x0313:
            r2 = r1
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b4.C0550i.mo8a(w3.y$a):w3.g0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r12.f15b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p139w3.C2063d0 mo2696b(p139w3.C2072g0 r11, p005a4.C0013c r12) {
        /*
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L_0x000a
            a4.i r1 = r12.f15b
            if (r1 == 0) goto L_0x000a
            w3.j0 r1 = r1.f84q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r11.f6004h
            w3.d0 r3 = r11.f6001e
            java.lang.String r3 = r3.f5974c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b3
            if (r2 == r5) goto L_0x00b3
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L_0x006b
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L_0x004d
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b3;
                case 301: goto L_0x00b3;
                case 302: goto L_0x00b3;
                case 303: goto L_0x00b3;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            w3.b0 r1 = r10.f2350a
            boolean r1 = r1.f5925j
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            w3.g0 r1 = r11.f6010n
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f6004h
            if (r1 != r12) goto L_0x0043
            return r0
        L_0x0043:
            int r12 = r10.mo2698d(r11, r4)
            if (r12 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            w3.d0 r11 = r11.f6001e
            return r11
        L_0x004d:
            p072l2.C1241e.m3515e(r1)
            java.net.Proxy r12 = r1.f6058b
            java.net.Proxy$Type r12 = r12.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r12 != r0) goto L_0x0063
            w3.b0 r12 = r10.f2350a
            w3.c r12 = r12.f5932q
            w3.d0 r11 = r12.mo6537a(r1, r11)
            return r11
        L_0x0063:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L_0x006b:
            w3.g0 r1 = r11.f6010n
            if (r1 == 0) goto L_0x0074
            int r1 = r1.f6004h
            if (r1 != r12) goto L_0x0074
            return r0
        L_0x0074:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r10.mo2698d(r11, r12)
            if (r12 != 0) goto L_0x0080
            w3.d0 r11 = r11.f6001e
            return r11
        L_0x0080:
            return r0
        L_0x0081:
            if (r12 == 0) goto L_0x00a9
            a4.d r1 = r12.f18e
            w3.a r1 = r1.f38h
            w3.x r1 = r1.f5889a
            java.lang.String r1 = r1.f6120e
            a4.i r2 = r12.f15b
            w3.j0 r2 = r2.f84q
            w3.a r2 = r2.f6057a
            w3.x r2 = r2.f5889a
            java.lang.String r2 = r2.f6120e
            boolean r1 = p072l2.C1241e.m3513b(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            a4.i r12 = r12.f15b
            monitor-enter(r12)
            r12.f77j = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            w3.d0 r11 = r11.f6001e
            return r11
        L_0x00a6:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00a9:
            return r0
        L_0x00aa:
            w3.b0 r12 = r10.f2350a
            w3.c r12 = r12.f5926k
            w3.d0 r11 = r12.mo6537a(r1, r11)
            return r11
        L_0x00b3:
            w3.b0 r12 = r10.f2350a
            boolean r12 = r12.f5927l
            if (r12 != 0) goto L_0x00bb
            goto L_0x0153
        L_0x00bb:
            r12 = 2
            java.lang.String r1 = "Location"
            java.lang.String r12 = p139w3.C2072g0.m5415a(r11, r1, r0, r12)
            if (r12 == 0) goto L_0x0153
            w3.d0 r1 = r11.f6001e
            w3.x r1 = r1.f5973b
            java.util.Objects.requireNonNull(r1)
            w3.x$a r12 = r1.mo6633f(r12)
            if (r12 == 0) goto L_0x00d6
            w3.x r12 = r12.mo6638a()
            goto L_0x00d7
        L_0x00d6:
            r12 = r0
        L_0x00d7:
            if (r12 == 0) goto L_0x0153
            java.lang.String r1 = r12.f6117b
            w3.d0 r2 = r11.f6001e
            w3.x r2 = r2.f5973b
            java.lang.String r2 = r2.f6117b
            boolean r1 = p072l2.C1241e.m3513b(r1, r2)
            if (r1 != 0) goto L_0x00ee
            w3.b0 r1 = r10.f2350a
            boolean r1 = r1.f5928m
            if (r1 != 0) goto L_0x00ee
            goto L_0x0153
        L_0x00ee:
            w3.d0 r1 = r11.f6001e
            java.util.Objects.requireNonNull(r1)
            w3.d0$a r2 = new w3.d0$a
            r2.<init>(r1)
            boolean r1 = p014b4.C0547f.m1800a(r3)
            if (r1 == 0) goto L_0x013b
            int r1 = r11.f6004h
            java.lang.String r8 = "PROPFIND"
            boolean r9 = p072l2.C1241e.m3513b(r3, r8)
            if (r9 != 0) goto L_0x010c
            if (r1 == r5) goto L_0x010c
            if (r1 != r6) goto L_0x010d
        L_0x010c:
            r4 = r7
        L_0x010d:
            boolean r8 = p072l2.C1241e.m3513b(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x011b
            if (r1 == r5) goto L_0x011b
            if (r1 == r6) goto L_0x011b
            java.lang.String r3 = "GET"
            goto L_0x0121
        L_0x011b:
            if (r4 == 0) goto L_0x0121
            w3.d0 r0 = r11.f6001e
            w3.f0 r0 = r0.f5976e
        L_0x0121:
            r2.mo6547c(r3, r0)
            if (r4 != 0) goto L_0x013b
            java.lang.String r0 = "Transfer-Encoding"
            w3.w$a r1 = r2.f5980c
            r1.mo6623d(r0)
            java.lang.String r0 = "Content-Length"
            w3.w$a r1 = r2.f5980c
            r1.mo6623d(r0)
            java.lang.String r0 = "Content-Type"
            w3.w$a r1 = r2.f5980c
            r1.mo6623d(r0)
        L_0x013b:
            w3.d0 r11 = r11.f6001e
            w3.x r11 = r11.f5973b
            boolean r11 = p144x3.C2129c.m5513a(r11, r12)
            if (r11 != 0) goto L_0x014c
            java.lang.String r11 = "Authorization"
            w3.w$a r0 = r2.f5980c
            r0.mo6623d(r11)
        L_0x014c:
            r2.mo6549e(r12)
            w3.d0 r0 = r2.mo6545a()
        L_0x0153:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b4.C0550i.mo2696b(w3.g0, a4.c):w3.d0");
    }

    /* renamed from: c */
    public final boolean mo2697c(IOException iOException, C0017e eVar, C2063d0 d0Var, boolean z) {
        boolean z2;
        C0028l lVar;
        C0024i iVar;
        if (!this.f2350a.f5925j) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        C0016d dVar = eVar.f46j;
        C1241e.m3515e(dVar);
        int i = dVar.f33c;
        if (i == 0 && dVar.f34d == 0 && dVar.f35e == 0) {
            z2 = false;
        } else {
            if (dVar.f36f == null) {
                C2083j0 j0Var = null;
                if (i <= 1 && dVar.f34d <= 1 && dVar.f35e <= 0 && (iVar = dVar.f39i.f47k) != null) {
                    synchronized (iVar) {
                        if (iVar.f78k == 0) {
                            if (C2129c.m5513a(iVar.f84q.f6057a.f5889a, dVar.f38h.f5889a)) {
                                j0Var = iVar.f84q;
                            }
                        }
                    }
                }
                if (j0Var != null) {
                    dVar.f36f = j0Var;
                } else {
                    C0028l.C0029a aVar = dVar.f31a;
                    if ((aVar == null || !aVar.mo60a()) && (lVar = dVar.f32b) != null) {
                        z2 = lVar.mo58a();
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo2698d(C2072g0 g0Var, int i) {
        String a = C2072g0.m5415a(g0Var, "Retry-After", (String) null, 2);
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        C1241e.m3516f(compile, "Pattern.compile(pattern)");
        if (!compile.matcher(a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        C1241e.m3516f(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
