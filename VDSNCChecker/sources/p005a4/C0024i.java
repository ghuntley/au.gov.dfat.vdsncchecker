package p005a4;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0001b;
import p014b4.C0545d;
import p014b4.C0548g;
import p020c4.C0649b;
import p026d4.C0814b;
import p026d4.C0819e;
import p026d4.C0820f;
import p026d4.C0837m;
import p026d4.C0841o;
import p026d4.C0845p;
import p026d4.C0850t;
import p032e4.C0879e;
import p045h.C0990o;
import p062j4.C1106b;
import p062j4.C1113g;
import p062j4.C1114h;
import p062j4.C1134z;
import p067k3.C1205h;
import p072l2.C1241e;
import p139w3.C2052a;
import p139w3.C2057b0;
import p139w3.C2061c0;
import p139w3.C2063d0;
import p139w3.C2068f;
import p139w3.C2070f0;
import p139w3.C2072g0;
import p139w3.C2083j0;
import p139w3.C2084k;
import p139w3.C2095s;
import p139w3.C2101v;
import p139w3.C2103w;
import p139w3.C2106x;
import p144x3.C2129c;
import p154z3.C2206b;
import p154z3.C2207c;
import p154z3.C2208d;

/* renamed from: a4.i */
public final class C0024i extends C0820f.C0823c implements C2084k {

    /* renamed from: b */
    public Socket f69b;

    /* renamed from: c */
    public Socket f70c;

    /* renamed from: d */
    public C2101v f71d;

    /* renamed from: e */
    public C2061c0 f72e;

    /* renamed from: f */
    public C0820f f73f;

    /* renamed from: g */
    public C1114h f74g;

    /* renamed from: h */
    public C1113g f75h;

    /* renamed from: i */
    public boolean f76i;

    /* renamed from: j */
    public boolean f77j;

    /* renamed from: k */
    public int f78k;

    /* renamed from: l */
    public int f79l;

    /* renamed from: m */
    public int f80m;

    /* renamed from: n */
    public int f81n = 1;

    /* renamed from: o */
    public final List<Reference<C0017e>> f82o = new ArrayList();

    /* renamed from: p */
    public long f83p = Long.MAX_VALUE;

    /* renamed from: q */
    public final C2083j0 f84q;

    public C0024i(C0025j jVar, C2083j0 j0Var) {
        C1241e.m3517j(jVar, "connectionPool");
        C1241e.m3517j(j0Var, "route");
        this.f84q = j0Var;
    }

    /* renamed from: a */
    public synchronized void mo41a(C0820f fVar, C0850t tVar) {
        C1241e.m3517j(fVar, "connection");
        C1241e.m3517j(tVar, "settings");
        this.f81n = (tVar.f3300a & 16) != 0 ? tVar.f3301b[4] : Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void mo42b(C0841o oVar) {
        C1241e.m3517j(oVar, "stream");
        oVar.mo4099c(C0814b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0148 A[EDGE_INSN: B:79:0x0148->B:71:0x0148 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43c(int r17, int r18, int r19, int r20, boolean r21, p139w3.C2068f r22, p139w3.C2095s r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            p072l2.C1241e.m3517j(r8, r0)
            java.lang.String r0 = "eventListener"
            p072l2.C1241e.m3517j(r9, r0)
            w3.c0 r0 = r7.f72e
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0156
            w3.j0 r0 = r7.f84q
            w3.a r0 = r0.f6057a
            java.util.List<w3.l> r0 = r0.f5891c
            a4.b r13 = new a4.b
            r13.<init>(r0)
            w3.j0 r1 = r7.f84q
            w3.a r1 = r1.f6057a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5894f
            if (r2 != 0) goto L_0x006c
            w3.l r1 = p139w3.C2087l.f6069f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            w3.j0 r0 = r7.f84q
            w3.a r0 = r0.f6057a
            w3.x r0 = r0.f5889a
            java.lang.String r0 = r0.f6120e
            e4.e$a r1 = p032e4.C0879e.f3347c
            e4.e r1 = p032e4.C0879e.f3345a
            boolean r1 = r1.mo4170h(r0)
            if (r1 == 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            a4.k r1 = new a4.k
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = p016c0.C0559c.m1823a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005f:
            a4.k r0 = new a4.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.util.List<w3.c0> r0 = r1.f5890b
            w3.c0 r1 = p139w3.C2061c0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0149
        L_0x0076:
            r14 = 0
            r15 = r14
        L_0x0078:
            w3.j0 r0 = r7.f84q     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r0.mo6576a()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x009e
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.mo46f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00dd }
            java.net.Socket r0 = r7.f69b     // Catch:{ IOException -> 0x00dd }
            if (r0 != 0) goto L_0x0094
            goto L_0x00b6
        L_0x0094:
            r1 = r17
            r2 = r18
            goto L_0x00a5
        L_0x0099:
            r1 = r17
            r2 = r18
            goto L_0x00da
        L_0x009e:
            r1 = r17
            r2 = r18
            r7.mo45e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00d9 }
        L_0x00a5:
            r3 = r20
            r7.mo47g(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00d7 }
            w3.j0 r0 = r7.f84q     // Catch:{ IOException -> 0x00d7 }
            java.net.InetSocketAddress r4 = r0.f6059c     // Catch:{ IOException -> 0x00d7 }
            java.net.Proxy r0 = r0.f6058b     // Catch:{ IOException -> 0x00d7 }
            p072l2.C1241e.m3517j(r4, r11)     // Catch:{ IOException -> 0x00d7 }
            p072l2.C1241e.m3517j(r0, r10)     // Catch:{ IOException -> 0x00d7 }
        L_0x00b6:
            w3.j0 r0 = r7.f84q
            boolean r0 = r0.mo6576a()
            if (r0 == 0) goto L_0x00d0
            java.net.Socket r0 = r7.f69b
            if (r0 == 0) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            a4.k r0 = new a4.k
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            long r0 = java.lang.System.nanoTime()
            r7.f83p = r0
            return
        L_0x00d7:
            r0 = move-exception
            goto L_0x00df
        L_0x00d9:
            r0 = move-exception
        L_0x00da:
            r3 = r20
            goto L_0x00df
        L_0x00dd:
            r0 = move-exception
            goto L_0x0099
        L_0x00df:
            java.net.Socket r4 = r7.f70c
            if (r4 == 0) goto L_0x00e6
            p144x3.C2129c.m5516d(r4)
        L_0x00e6:
            java.net.Socket r4 = r7.f69b
            if (r4 == 0) goto L_0x00ed
            p144x3.C2129c.m5516d(r4)
        L_0x00ed:
            r7.f70c = r14
            r7.f69b = r14
            r7.f74g = r14
            r7.f75h = r14
            r7.f71d = r14
            r7.f72e = r14
            r7.f73f = r14
            r7.f81n = r12
            w3.j0 r4 = r7.f84q
            java.net.InetSocketAddress r5 = r4.f6059c
            java.net.Proxy r4 = r4.f6058b
            p072l2.C1241e.m3517j(r5, r11)
            p072l2.C1241e.m3517j(r4, r10)
            if (r15 != 0) goto L_0x0111
            a4.k r15 = new a4.k
            r15.<init>(r0)
            goto L_0x0118
        L_0x0111:
            java.io.IOException r4 = r15.f92f
            p042g2.C0955a.m2727a(r4, r0)
            r15.f91e = r0
        L_0x0118:
            if (r21 == 0) goto L_0x0148
            r13.f12c = r12
            boolean r4 = r13.f11b
            if (r4 != 0) goto L_0x0121
            goto L_0x0143
        L_0x0121:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L_0x0126
            goto L_0x0143
        L_0x0126:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x0138
            java.lang.Throwable r4 = r0.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L_0x0138
            goto L_0x0143
        L_0x0138:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L_0x013d
            goto L_0x0143
        L_0x013d:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0143
            r0 = r12
            goto L_0x0144
        L_0x0143:
            r0 = 0
        L_0x0144:
            if (r0 == 0) goto L_0x0148
            goto L_0x0078
        L_0x0148:
            throw r15
        L_0x0149:
            a4.k r0 = new a4.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0024i.mo43c(int, int, int, int, boolean, w3.f, w3.s):void");
    }

    /* renamed from: d */
    public final void mo44d(C2057b0 b0Var, C2083j0 j0Var, IOException iOException) {
        C1241e.m3517j(b0Var, "client");
        C1241e.m3517j(j0Var, "failedRoute");
        if (j0Var.f6058b.type() != Proxy.Type.DIRECT) {
            C2052a aVar = j0Var.f6057a;
            aVar.f5899k.connectFailed(aVar.f5889a.mo6635h(), j0Var.f6058b.address(), iOException);
        }
        C0990o oVar = b0Var.f5919C;
        synchronized (oVar) {
            ((Set) oVar.f3645b).add(j0Var);
        }
    }

    /* renamed from: e */
    public final void mo45e(int i, int i2, C2068f fVar, C2095s sVar) {
        Socket socket;
        int i3;
        C2083j0 j0Var = this.f84q;
        Proxy proxy = j0Var.f6058b;
        C2052a aVar = j0Var.f6057a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = C0021f.f64a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = aVar.f5893e.createSocket();
            C1241e.m3515e(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f69b = socket;
        InetSocketAddress inetSocketAddress = this.f84q.f6059c;
        Objects.requireNonNull(sVar);
        C1241e.m3517j(fVar, "call");
        C1241e.m3517j(inetSocketAddress, "inetSocketAddress");
        C1241e.m3517j(proxy, "proxy");
        socket.setSoTimeout(i2);
        try {
            C0879e.C0880a aVar2 = C0879e.f3347c;
            C0879e.f3345a.mo4172e(socket, this.f84q.f6059c, i);
            try {
                this.f74g = C1106b.m3134d(C1106b.m3140j(socket));
                this.f75h = C1106b.m3133c(C1106b.m3139i(socket));
            } catch (NullPointerException e) {
                if (C1241e.m3513b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder a = C0001b.m0a("Failed to connect to ");
            a.append(this.f84q.f6059c);
            ConnectException connectException = new ConnectException(a.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void mo46f(int i, int i2, int i3, C2068f fVar, C2095s sVar) {
        C2063d0 d0Var;
        int i4 = i2;
        C2063d0.C2064a aVar = new C2063d0.C2064a();
        aVar.mo6549e(this.f84q.f6057a.f5889a);
        C2057b0 b0Var = null;
        aVar.mo6547c("CONNECT", (C2070f0) null);
        boolean z = true;
        aVar.mo6546b("Host", C2129c.m5532t(this.f84q.f6057a.f5889a, true));
        aVar.mo6546b("Proxy-Connection", "Keep-Alive");
        aVar.mo6546b("User-Agent", "okhttp/4.9.1");
        C2063d0 a = aVar.mo6545a();
        C2072g0.C2073a aVar2 = new C2072g0.C2073a();
        aVar2.mo6562g(a);
        aVar2.mo6561f(C2061c0.HTTP_1_1);
        aVar2.f6016c = 407;
        aVar2.mo6560e("Preemptive Authenticate");
        aVar2.f6020g = C2129c.f6171c;
        aVar2.f6024k = -1;
        aVar2.f6025l = -1;
        C2103w.C2104a aVar3 = aVar2.f6019f;
        Objects.requireNonNull(aVar3);
        C2103w.C2105b bVar = C2103w.f6111f;
        bVar.mo6624a("Proxy-Authenticate");
        bVar.mo6625b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.mo6623d("Proxy-Authenticate");
        aVar3.mo6621b("Proxy-Authenticate", "OkHttp-Preemptive");
        C2072g0 a2 = aVar2.mo6556a();
        C2083j0 j0Var = this.f84q;
        C2063d0 a3 = j0Var.f6057a.f5897i.mo6537a(j0Var, a2);
        if (a3 != null) {
            a = a3;
        }
        C2106x xVar = d0Var.f5973b;
        int i5 = 0;
        while (i5 < 21) {
            mo45e(i, i4, fVar, sVar);
            String str = "CONNECT " + C2129c.m5532t(xVar, z) + " HTTP/1.1";
            while (true) {
                C1114h hVar = this.f74g;
                C1241e.m3515e(hVar);
                C1113g gVar = this.f75h;
                C1241e.m3515e(gVar);
                C0649b bVar2 = new C0649b(b0Var, this, hVar, gVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                hVar.mo2835d().mo4604g((long) i4, timeUnit);
                gVar.mo2836d().mo4604g((long) i3, timeUnit);
                bVar2.mo2833k(d0Var.f5975d, str);
                bVar2.f2505g.flush();
                C2072g0.C2073a e = bVar2.mo2687e(false);
                C1241e.m3515e(e);
                e.mo6562g(d0Var);
                C2072g0 a4 = e.mo6556a();
                long j = C2129c.m5522j(a4);
                if (j != -1) {
                    C1134z j2 = bVar2.mo2832j(j);
                    C2129c.m5530r(j2, Integer.MAX_VALUE, timeUnit);
                    ((C0649b.C0653d) j2).close();
                }
                int i6 = a4.f6004h;
                if (i6 != 200) {
                    if (i6 == 407) {
                        C2083j0 j0Var2 = this.f84q;
                        C2063d0 a5 = j0Var2.f6057a.f5897i.mo6537a(j0Var2, a4);
                        if (a5 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (C1205h.m3427K("close", C2072g0.m5415a(a4, "Connection", (String) null, 2), true)) {
                            d0Var = a5;
                            z = true;
                            break;
                        } else {
                            int i7 = i;
                            C2068f fVar2 = fVar;
                            C2063d0 d0Var2 = a5;
                            b0Var = null;
                            d0Var = d0Var2;
                        }
                    } else {
                        StringBuilder a6 = C0001b.m0a("Unexpected response code for CONNECT: ");
                        a6.append(a4.f6004h);
                        throw new IOException(a6.toString());
                    }
                } else if (!hVar.mo4637b().mo4619I() || !gVar.mo4637b().mo4619I()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    z = true;
                    d0Var = null;
                }
            }
            if (d0Var != null) {
                Socket socket = this.f69b;
                if (socket != null) {
                    C2129c.m5516d(socket);
                }
                b0Var = null;
                this.f69b = null;
                this.f75h = null;
                this.f74g = null;
                C2083j0 j0Var3 = this.f84q;
                InetSocketAddress inetSocketAddress = j0Var3.f6059c;
                Proxy proxy = j0Var3.f6058b;
                C1241e.m3517j(inetSocketAddress, "inetSocketAddress");
                C1241e.m3517j(proxy, "proxy");
                i5++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e1  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47g(p005a4.C0012b r12, int r13, p139w3.C2068f r14, p139w3.C2095s r15) {
        /*
            r11 = this;
            w3.c0 r14 = p139w3.C2061c0.HTTP_2
            w3.c0 r15 = p139w3.C2061c0.H2_PRIOR_KNOWLEDGE
            w3.c0 r0 = p139w3.C2061c0.HTTP_1_1
            w3.j0 r1 = r11.f84q
            w3.a r1 = r1.f6057a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5894f
            if (r2 != 0) goto L_0x0027
            java.util.List<w3.c0> r12 = r1.f5890b
            boolean r12 = r12.contains(r15)
            if (r12 == 0) goto L_0x0020
            java.net.Socket r12 = r11.f69b
            r11.f70c = r12
            r11.f72e = r15
            r11.mo53m(r13)
            return
        L_0x0020:
            java.net.Socket r12 = r11.f69b
            r11.f70c = r12
            r11.f72e = r0
            return
        L_0x0027:
            r3 = 0
            p072l2.C1241e.m3515e(r2)     // Catch:{ all -> 0x01d5 }
            java.net.Socket r4 = r11.f69b     // Catch:{ all -> 0x01d5 }
            w3.x r5 = r1.f5889a     // Catch:{ all -> 0x01d5 }
            java.lang.String r6 = r5.f6120e     // Catch:{ all -> 0x01d5 }
            int r5 = r5.f6121f     // Catch:{ all -> 0x01d5 }
            r7 = 1
            java.net.Socket r2 = r2.createSocket(r4, r6, r5, r7)     // Catch:{ all -> 0x01d5 }
            if (r2 == 0) goto L_0x01cd
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch:{ all -> 0x01d5 }
            w3.l r12 = r12.mo9a(r2)     // Catch:{ all -> 0x01ca }
            boolean r4 = r12.f6071b     // Catch:{ all -> 0x01ca }
            if (r4 == 0) goto L_0x0051
            e4.e$a r4 = p032e4.C0879e.f3347c     // Catch:{ all -> 0x01ca }
            e4.e r4 = p032e4.C0879e.f3345a     // Catch:{ all -> 0x01ca }
            w3.x r5 = r1.f5889a     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = r5.f6120e     // Catch:{ all -> 0x01ca }
            java.util.List<w3.c0> r6 = r1.f5890b     // Catch:{ all -> 0x01ca }
            r4.mo4168d(r2, r5, r6)     // Catch:{ all -> 0x01ca }
        L_0x0051:
            r2.startHandshake()     // Catch:{ all -> 0x01ca }
            javax.net.ssl.SSLSession r4 = r2.getSession()     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = "sslSocketSession"
            p072l2.C1241e.m3516f(r4, r5)     // Catch:{ all -> 0x01ca }
            w3.v r5 = p139w3.C2101v.m5469a(r4)     // Catch:{ all -> 0x01ca }
            javax.net.ssl.HostnameVerifier r6 = r1.f5895g     // Catch:{ all -> 0x01ca }
            p072l2.C1241e.m3515e(r6)     // Catch:{ all -> 0x01ca }
            w3.x r8 = r1.f5889a     // Catch:{ all -> 0x01ca }
            java.lang.String r8 = r8.f6120e     // Catch:{ all -> 0x01ca }
            boolean r4 = r6.verify(r8, r4)     // Catch:{ all -> 0x01ca }
            if (r4 != 0) goto L_0x011b
            java.util.List r12 = r5.mo6607c()     // Catch:{ all -> 0x01ca }
            boolean r13 = r12.isEmpty()     // Catch:{ all -> 0x01ca }
            r13 = r13 ^ r7
            if (r13 == 0) goto L_0x00fb
            r13 = 0
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x00f3
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch:{ all -> 0x01ca }
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01ca }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r14.<init>()     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = "\n              |Hostname "
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            w3.x r15 = r1.f5889a     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = r15.f6120e     // Catch:{ all -> 0x01ca }
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = " not verified:\n              |    certificate: "
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            w3.h$a r15 = p139w3.C2074h.f6028d     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = r15.mo6567a(r12)     // Catch:{ all -> 0x01ca }
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = "\n              |    DN: "
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            java.security.Principal r15 = r12.getSubjectDN()     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "cert.subjectDN"
            p072l2.C1241e.m3516f(r15, r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = r15.getName()     // Catch:{ all -> 0x01ca }
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            java.lang.String r15 = "\n              |    subjectAltNames: "
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            h4.d r15 = p050h4.C1019d.f3739a     // Catch:{ all -> 0x01ca }
            r0 = 7
            java.util.List r0 = r15.mo4457a(r12, r0)     // Catch:{ all -> 0x01ca }
            r1 = 2
            java.util.List r12 = r15.mo4457a(r12, r1)     // Catch:{ all -> 0x01ca }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x01ca }
            int r1 = r0.size()     // Catch:{ all -> 0x01ca }
            int r4 = r12.size()     // Catch:{ all -> 0x01ca }
            int r4 = r4 + r1
            r15.<init>(r4)     // Catch:{ all -> 0x01ca }
            r15.addAll(r0)     // Catch:{ all -> 0x01ca }
            r15.addAll(r12)     // Catch:{ all -> 0x01ca }
            r14.append(r15)     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = "\n              "
            r14.append(r12)     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = p067k3.C1201d.m3424H(r12, r3, r7)     // Catch:{ all -> 0x01ca }
            r13.<init>(r12)     // Catch:{ all -> 0x01ca }
            throw r13     // Catch:{ all -> 0x01ca }
        L_0x00f3:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch:{ all -> 0x01ca }
            java.lang.String r13 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r12.<init>(r13)     // Catch:{ all -> 0x01ca }
            throw r12     // Catch:{ all -> 0x01ca }
        L_0x00fb:
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01ca }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r13.<init>()     // Catch:{ all -> 0x01ca }
            java.lang.String r14 = "Hostname "
            r13.append(r14)     // Catch:{ all -> 0x01ca }
            w3.x r14 = r1.f5889a     // Catch:{ all -> 0x01ca }
            java.lang.String r14 = r14.f6120e     // Catch:{ all -> 0x01ca }
            r13.append(r14)     // Catch:{ all -> 0x01ca }
            java.lang.String r14 = " not verified (no certificates)"
            r13.append(r14)     // Catch:{ all -> 0x01ca }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01ca }
            r12.<init>(r13)     // Catch:{ all -> 0x01ca }
            throw r12     // Catch:{ all -> 0x01ca }
        L_0x011b:
            w3.h r4 = r1.f5896h     // Catch:{ all -> 0x01ca }
            p072l2.C1241e.m3515e(r4)     // Catch:{ all -> 0x01ca }
            w3.v r6 = new w3.v     // Catch:{ all -> 0x01ca }
            w3.k0 r7 = r5.f6107b     // Catch:{ all -> 0x01ca }
            w3.j r8 = r5.f6108c     // Catch:{ all -> 0x01ca }
            java.util.List<java.security.cert.Certificate> r9 = r5.f6109d     // Catch:{ all -> 0x01ca }
            a4.g r10 = new a4.g     // Catch:{ all -> 0x01ca }
            r10.<init>(r4, r5, r1)     // Catch:{ all -> 0x01ca }
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x01ca }
            r11.f71d = r6     // Catch:{ all -> 0x01ca }
            w3.x r1 = r1.f5889a     // Catch:{ all -> 0x01ca }
            java.lang.String r1 = r1.f6120e     // Catch:{ all -> 0x01ca }
            a4.h r5 = new a4.h     // Catch:{ all -> 0x01ca }
            r5.<init>(r11)     // Catch:{ all -> 0x01ca }
            r4.mo6563a(r1, r5)     // Catch:{ all -> 0x01ca }
            boolean r12 = r12.f6071b     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x014a
            e4.e$a r12 = p032e4.C0879e.f3347c     // Catch:{ all -> 0x01ca }
            e4.e r12 = p032e4.C0879e.f3345a     // Catch:{ all -> 0x01ca }
            java.lang.String r3 = r12.mo4169f(r2)     // Catch:{ all -> 0x01ca }
        L_0x014a:
            r11.f70c = r2     // Catch:{ all -> 0x01ca }
            j4.z r12 = p062j4.C1106b.m3140j(r2)     // Catch:{ all -> 0x01ca }
            j4.t r1 = new j4.t     // Catch:{ all -> 0x01ca }
            r1.<init>(r12)     // Catch:{ all -> 0x01ca }
            r11.f74g = r1     // Catch:{ all -> 0x01ca }
            j4.x r12 = p062j4.C1106b.m3139i(r2)     // Catch:{ all -> 0x01ca }
            j4.g r12 = p062j4.C1106b.m3133c(r12)     // Catch:{ all -> 0x01ca }
            r11.f75h = r12     // Catch:{ all -> 0x01ca }
            if (r3 == 0) goto L_0x01b9
            w3.c0 r12 = p139w3.C2061c0.HTTP_1_0     // Catch:{ all -> 0x01ca }
            java.lang.String r1 = "http/1.0"
            boolean r1 = p072l2.C1241e.m3513b(r3, r1)     // Catch:{ all -> 0x01ca }
            if (r1 == 0) goto L_0x016f
            r15 = r12
            goto L_0x01a0
        L_0x016f:
            java.lang.String r12 = "http/1.1"
            boolean r12 = p072l2.C1241e.m3513b(r3, r12)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x0178
            goto L_0x01b9
        L_0x0178:
            java.lang.String r12 = "h2_prior_knowledge"
            boolean r12 = p072l2.C1241e.m3513b(r3, r12)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x0181
            goto L_0x01a0
        L_0x0181:
            java.lang.String r12 = "h2"
            boolean r12 = p072l2.C1241e.m3513b(r3, r12)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x018b
            r15 = r14
            goto L_0x01a0
        L_0x018b:
            w3.c0 r15 = p139w3.C2061c0.SPDY_3     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = "spdy/3.1"
            boolean r12 = p072l2.C1241e.m3513b(r3, r12)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x0196
            goto L_0x01a0
        L_0x0196:
            w3.c0 r15 = p139w3.C2061c0.QUIC     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = "quic"
            boolean r12 = p072l2.C1241e.m3513b(r3, r12)     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x01a2
        L_0x01a0:
            r0 = r15
            goto L_0x01b9
        L_0x01a2:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x01ca }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r13.<init>()     // Catch:{ all -> 0x01ca }
            java.lang.String r14 = "Unexpected protocol: "
            r13.append(r14)     // Catch:{ all -> 0x01ca }
            r13.append(r3)     // Catch:{ all -> 0x01ca }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01ca }
            r12.<init>(r13)     // Catch:{ all -> 0x01ca }
            throw r12     // Catch:{ all -> 0x01ca }
        L_0x01b9:
            r11.f72e = r0     // Catch:{ all -> 0x01ca }
            e4.e$a r12 = p032e4.C0879e.f3347c
            e4.e r12 = p032e4.C0879e.f3345a
            r12.mo4179a(r2)
            w3.c0 r12 = r11.f72e
            if (r12 != r14) goto L_0x01c9
            r11.mo53m(r13)
        L_0x01c9:
            return
        L_0x01ca:
            r12 = move-exception
            r3 = r2
            goto L_0x01d6
        L_0x01cd:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r12.<init>(r13)     // Catch:{ all -> 0x01d5 }
            throw r12     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r12 = move-exception
        L_0x01d6:
            if (r3 == 0) goto L_0x01df
            e4.e$a r13 = p032e4.C0879e.f3347c
            e4.e r13 = p032e4.C0879e.f3345a
            r13.mo4179a(r3)
        L_0x01df:
            if (r3 == 0) goto L_0x01e4
            p144x3.C2129c.m5516d(r3)
        L_0x01e4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0024i.mo47g(a4.b, int, w3.f, w3.s):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        if (r8 == false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[SYNTHETIC, Splitter:B:53:0x00d2] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48h(p139w3.C2052a r7, java.util.List<p139w3.C2083j0> r8) {
        /*
            r6 = this;
            byte[] r0 = p144x3.C2129c.f6169a
            java.util.List<java.lang.ref.Reference<a4.e>> r0 = r6.f82o
            int r0 = r0.size()
            int r1 = r6.f81n
            r2 = 0
            if (r0 >= r1) goto L_0x00f7
            boolean r0 = r6.f76i
            if (r0 == 0) goto L_0x0013
            goto L_0x00f7
        L_0x0013:
            w3.j0 r0 = r6.f84q
            w3.a r0 = r0.f6057a
            boolean r0 = r0.mo6532a(r7)
            if (r0 != 0) goto L_0x001e
            return r2
        L_0x001e:
            w3.x r0 = r7.f5889a
            java.lang.String r0 = r0.f6120e
            w3.j0 r1 = r6.f84q
            w3.a r1 = r1.f6057a
            w3.x r1 = r1.f5889a
            java.lang.String r1 = r1.f6120e
            boolean r0 = p072l2.C1241e.m3513b(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            d4.f r0 = r6.f73f
            if (r0 != 0) goto L_0x0037
            return r2
        L_0x0037:
            if (r8 == 0) goto L_0x00f7
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0040
            goto L_0x0079
        L_0x0040:
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.next()
            w3.j0 r0 = (p139w3.C2083j0) r0
            java.net.Proxy r3 = r0.f6058b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0074
            w3.j0 r3 = r6.f84q
            java.net.Proxy r3 = r3.f6058b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0074
            w3.j0 r3 = r6.f84q
            java.net.InetSocketAddress r3 = r3.f6059c
            java.net.InetSocketAddress r0 = r0.f6059c
            boolean r0 = p072l2.C1241e.m3513b(r3, r0)
            if (r0 == 0) goto L_0x0074
            r0 = r1
            goto L_0x0075
        L_0x0074:
            r0 = r2
        L_0x0075:
            if (r0 == 0) goto L_0x0044
            r8 = r1
            goto L_0x007a
        L_0x0079:
            r8 = r2
        L_0x007a:
            if (r8 != 0) goto L_0x007e
            goto L_0x00f7
        L_0x007e:
            javax.net.ssl.HostnameVerifier r8 = r7.f5895g
            h4.d r0 = p050h4.C1019d.f3739a
            if (r8 == r0) goto L_0x0085
            return r2
        L_0x0085:
            w3.x r8 = r7.f5889a
            byte[] r3 = p144x3.C2129c.f6169a
            w3.j0 r3 = r6.f84q
            w3.a r3 = r3.f6057a
            w3.x r3 = r3.f5889a
            int r4 = r8.f6121f
            int r5 = r3.f6121f
            if (r4 == r5) goto L_0x0096
            goto L_0x00ce
        L_0x0096:
            java.lang.String r4 = r8.f6120e
            java.lang.String r3 = r3.f6120e
            boolean r3 = p072l2.C1241e.m3513b(r4, r3)
            if (r3 == 0) goto L_0x00a1
            goto L_0x00cc
        L_0x00a1:
            boolean r3 = r6.f77j
            if (r3 != 0) goto L_0x00ce
            w3.v r3 = r6.f71d
            if (r3 == 0) goto L_0x00ce
            java.util.List r3 = r3.mo6607c()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x00c9
            java.lang.String r8 = r8.f6120e
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.mo4458b(r8, r3)
            if (r8 == 0) goto L_0x00c9
            r8 = r1
            goto L_0x00ca
        L_0x00c9:
            r8 = r2
        L_0x00ca:
            if (r8 == 0) goto L_0x00ce
        L_0x00cc:
            r8 = r1
            goto L_0x00cf
        L_0x00ce:
            r8 = r2
        L_0x00cf:
            if (r8 != 0) goto L_0x00d2
            return r2
        L_0x00d2:
            w3.h r8 = r7.f5896h     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            p072l2.C1241e.m3515e(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            w3.x r7 = r7.f5889a     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            java.lang.String r7 = r7.f6120e     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            w3.v r0 = r6.f71d     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            p072l2.C1241e.m3515e(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            java.util.List r0 = r0.mo6607c()     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            java.lang.String r3 = "hostname"
            p072l2.C1241e.m3517j(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            java.lang.String r3 = "peerCertificates"
            p072l2.C1241e.m3517j(r0, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            w3.i r3 = new w3.i     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            r3.<init>(r8, r0, r7)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            r8.mo6563a(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00f7 }
            return r1
        L_0x00f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0024i.mo48h(w3.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = p144x3.C2129c.f6169a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f69b
            p072l2.C1241e.m3515e(r2)
            java.net.Socket r3 = r9.f70c
            p072l2.C1241e.m3515e(r3)
            j4.h r4 = r9.f74g
            p072l2.C1241e.m3515e(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x0086
        L_0x002f:
            d4.f r2 = r9.f73f
            r6 = 1
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            boolean r10 = r2.f3178k     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x003b
        L_0x0039:
            monitor-exit(r2)
            goto L_0x004c
        L_0x003b:
            long r3 = r2.f3187t     // Catch:{ all -> 0x004d }
            long r7 = r2.f3186s     // Catch:{ all -> 0x004d }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            long r3 = r2.f3189v     // Catch:{ all -> 0x004d }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
            goto L_0x0039
        L_0x004a:
            monitor-exit(r2)
            r5 = r6
        L_0x004c:
            return r5
        L_0x004d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0050:
            monitor-enter(r9)
            long r7 = r9.f83p     // Catch:{ all -> 0x0083 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            if (r10 == 0) goto L_0x0082
            java.lang.String r10 = "$this$isHealthy"
            p072l2.C1241e.m3517j(r3, r10)
            java.lang.String r10 = "source"
            p072l2.C1241e.m3517j(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x007b }
            boolean r0 = r4.mo4619I()     // Catch:{ all -> 0x007b }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r5 = r0
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
        L_0x0080:
            r5 = r6
        L_0x0081:
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0024i.mo49i(boolean):boolean");
    }

    /* renamed from: j */
    public final boolean mo50j() {
        return this.f73f != null;
    }

    /* renamed from: k */
    public final C0545d mo51k(C2057b0 b0Var, C0548g gVar) {
        Socket socket = this.f70c;
        C1241e.m3515e(socket);
        C1114h hVar = this.f74g;
        C1241e.m3515e(hVar);
        C1113g gVar2 = this.f75h;
        C1241e.m3515e(gVar2);
        C0820f fVar = this.f73f;
        if (fVar != null) {
            return new C0837m(b0Var, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.f2345h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.mo2835d().mo4604g((long) gVar.f2345h, timeUnit);
        gVar2.mo2836d().mo4604g((long) gVar.f2346i, timeUnit);
        return new C0649b(b0Var, this, hVar, gVar2);
    }

    /* renamed from: l */
    public final synchronized void mo52l() {
        this.f76i = true;
    }

    /* renamed from: m */
    public final void mo53m(int i) {
        StringBuilder sb;
        Socket socket = this.f70c;
        C1241e.m3515e(socket);
        C1114h hVar = this.f74g;
        C1241e.m3515e(hVar);
        C1113g gVar = this.f75h;
        C1241e.m3515e(gVar);
        socket.setSoTimeout(0);
        C2208d dVar = C2208d.f6344h;
        C0820f.C0822b bVar = new C0820f.C0822b(true, dVar);
        String str = this.f84q.f6057a.f5889a.f6120e;
        C1241e.m3517j(str, "peerName");
        bVar.f3196a = socket;
        if (bVar.f3203h) {
            sb = new StringBuilder();
            sb.append(C2129c.f6174f);
            sb.append(' ');
        } else {
            sb = C0001b.m0a("MockWebServer ");
        }
        sb.append(str);
        bVar.f3197b = sb.toString();
        bVar.f3198c = hVar;
        bVar.f3199d = gVar;
        bVar.f3200e = this;
        bVar.f3202g = i;
        C0820f fVar = new C0820f(bVar);
        this.f73f = fVar;
        C0820f fVar2 = C0820f.f3165H;
        C0850t tVar = C0820f.f3164G;
        this.f81n = (tVar.f3300a & 16) != 0 ? tVar.f3301b[4] : Integer.MAX_VALUE;
        C0845p pVar = fVar.f3169D;
        synchronized (pVar) {
            if (pVar.f3288g) {
                throw new IOException("closed");
            } else if (pVar.f3291j) {
                Logger logger = C0845p.f3285k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C2129c.m5520h(">> CONNECTION " + C0819e.f3159a.mo4671d(), new Object[0]));
                }
                pVar.f3290i.mo4612B(C0819e.f3159a);
                pVar.f3290i.flush();
            }
        }
        C0845p pVar2 = fVar.f3169D;
        C0850t tVar2 = fVar.f3190w;
        synchronized (pVar2) {
            C1241e.m3517j(tVar2, "settings");
            if (!pVar2.f3288g) {
                pVar2.mo4117g(0, Integer.bitCount(tVar2.f3300a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    if (((1 << i2) & tVar2.f3300a) != 0) {
                        pVar2.f3290i.mo4657s(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                        pVar2.f3290i.mo4664x(tVar2.f3301b[i2]);
                    }
                    i2++;
                }
                pVar2.f3290i.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = fVar.f3190w.mo4129a();
        if (a != 65535) {
            fVar.f3169D.mo4122n(0, (long) (a - 65535));
        }
        C2207c f = dVar.mo6775f();
        String str2 = fVar.f3175h;
        f.mo6767c(new C2206b(fVar.f3170E, str2, true, str2, true), 0);
    }

    public String toString() {
        Object obj;
        StringBuilder a = C0001b.m0a("Connection{");
        a.append(this.f84q.f6057a.f5889a.f6120e);
        a.append(':');
        a.append(this.f84q.f6057a.f5889a.f6121f);
        a.append(',');
        a.append(" proxy=");
        a.append(this.f84q.f6058b);
        a.append(" hostAddress=");
        a.append(this.f84q.f6059c);
        a.append(" cipherSuite=");
        C2101v vVar = this.f71d;
        if (vVar == null || (obj = vVar.f6108c) == null) {
            obj = "none";
        }
        a.append(obj);
        a.append(" protocol=");
        a.append(this.f72e);
        a.append('}');
        return a.toString();
    }
}
