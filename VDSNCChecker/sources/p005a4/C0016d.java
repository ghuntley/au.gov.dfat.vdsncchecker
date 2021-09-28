package p005a4;

import java.io.IOException;
import p005a4.C0028l;
import p026d4.C0813a;
import p026d4.C0814b;
import p026d4.C0851u;
import p072l2.C1241e;
import p139w3.C2052a;
import p139w3.C2083j0;
import p139w3.C2095s;
import p139w3.C2106x;

/* renamed from: a4.d */
public final class C0016d {

    /* renamed from: a */
    public C0028l.C0029a f31a;

    /* renamed from: b */
    public C0028l f32b;

    /* renamed from: c */
    public int f33c;

    /* renamed from: d */
    public int f34d;

    /* renamed from: e */
    public int f35e;

    /* renamed from: f */
    public C2083j0 f36f;

    /* renamed from: g */
    public final C0025j f37g;

    /* renamed from: h */
    public final C2052a f38h;

    /* renamed from: i */
    public final C0017e f39i;

    /* renamed from: j */
    public final C2095s f40j;

    public C0016d(C0025j jVar, C2052a aVar, C0017e eVar, C2095s sVar) {
        C1241e.m3517j(jVar, "connectionPool");
        C1241e.m3517j(sVar, "eventListener");
        this.f37g = jVar;
        this.f38h = aVar;
        this.f39i = eVar;
        this.f40j = sVar;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0301 A[SYNTHETIC] */
    /* renamed from: a */
    public final p005a4.C0024i mo22a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            a4.e r0 = r1.f39i
            boolean r0 = r0.f53q
            if (r0 != 0) goto L_0x0347
            a4.e r0 = r1.f39i
            a4.i r2 = r0.f47k
            r0 = 0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x005e
            monitor-enter(r2)
            boolean r5 = r2.f76i     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0024
            w3.j0 r5 = r2.f84q     // Catch:{ all -> 0x005b }
            w3.a r5 = r5.f6057a     // Catch:{ all -> 0x005b }
            w3.x r5 = r5.f5889a     // Catch:{ all -> 0x005b }
            boolean r5 = r15.mo23b(r5)     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            a4.e r5 = r1.f39i     // Catch:{ all -> 0x005b }
            java.net.Socket r5 = r5.mo36m()     // Catch:{ all -> 0x005b }
        L_0x002a:
            monitor-exit(r2)
            a4.e r6 = r1.f39i
            a4.i r6 = r6.f47k
            if (r6 == 0) goto L_0x0044
            if (r5 != 0) goto L_0x0034
            r0 = r4
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            goto L_0x02cd
        L_0x0038:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            p144x3.C2129c.m5516d(r5)
        L_0x0049:
            w3.s r5 = r1.f40j
            a4.e r6 = r1.f39i
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "call"
            p072l2.C1241e.m3517j(r6, r5)
            java.lang.String r5 = "connection"
            p072l2.C1241e.m3517j(r2, r5)
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005e:
            r1.f33c = r0
            r1.f34d = r0
            r1.f35e = r0
            a4.j r2 = r1.f37g
            w3.a r5 = r1.f38h
            a4.e r6 = r1.f39i
            boolean r2 = r2.mo55a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0072
            goto L_0x0264
        L_0x0072:
            w3.j0 r2 = r1.f36f
            if (r2 == 0) goto L_0x007c
            p072l2.C1241e.m3515e(r2)
            r1.f36f = r3
            goto L_0x0092
        L_0x007c:
            a4.l$a r2 = r1.f31a
            if (r2 == 0) goto L_0x0095
            p072l2.C1241e.m3515e(r2)
            boolean r2 = r2.mo60a()
            if (r2 == 0) goto L_0x0095
            a4.l$a r0 = r1.f31a
            p072l2.C1241e.m3515e(r0)
            w3.j0 r2 = r0.mo61b()
        L_0x0092:
            r5 = r3
            goto L_0x0271
        L_0x0095:
            a4.l r2 = r1.f32b
            if (r2 != 0) goto L_0x00aa
            a4.l r2 = new a4.l
            w3.a r5 = r1.f38h
            a4.e r6 = r1.f39i
            w3.b0 r7 = r6.f56t
            h.o r7 = r7.f5919C
            w3.s r8 = r1.f40j
            r2.<init>(r5, r7, r6, r8)
            r1.f32b = r2
        L_0x00aa:
            boolean r5 = r2.mo58a()
            if (r5 == 0) goto L_0x0341
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00b5:
            boolean r6 = r2.mo59b()
            if (r6 == 0) goto L_0x0239
            boolean r6 = r2.mo59b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0218
            java.util.List<? extends java.net.Proxy> r6 = r2.f93a
            int r8 = r2.f94b
            int r9 = r8 + 1
            r2.f94b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f95c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x012e
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x00e9
            goto L_0x012e
        L_0x00e9:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0113
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            p072l2.C1241e.m3517j(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x0105
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            goto L_0x010b
        L_0x0105:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
        L_0x010b:
            p072l2.C1241e.m3516f(r10, r11)
            int r9 = r9.getPort()
            goto L_0x0136
        L_0x0113:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x012e:
            w3.a r9 = r2.f97e
            w3.x r9 = r9.f5889a
            java.lang.String r10 = r9.f6120e
            int r9 = r9.f6121f
        L_0x0136:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x01f6
            if (r11 < r9) goto L_0x01f6
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x014d
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x0197
        L_0x014d:
            w3.s r7 = r2.f100h
            w3.f r11 = r2.f99g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            p072l2.C1241e.m3517j(r11, r7)
            java.lang.String r11 = "domainName"
            p072l2.C1241e.m3517j(r10, r11)
            w3.a r12 = r2.f97e
            w3.r r12 = r12.f5892d
            java.util.List r12 = r12.mo6600a(r10)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x01d8
            w3.s r13 = r2.f100h
            w3.f r14 = r2.f99g
            java.util.Objects.requireNonNull(r13)
            p072l2.C1241e.m3517j(r14, r7)
            p072l2.C1241e.m3517j(r10, r11)
            java.lang.String r7 = "inetAddressList"
            p072l2.C1241e.m3517j(r12, r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x0182:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0197
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x0182
        L_0x0197:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f95c
            java.util.Iterator r7 = r7.iterator()
        L_0x019d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01d0
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            w3.j0 r9 = new w3.j0
            w3.a r10 = r2.f97e
            r9.<init>(r10, r6, r8)
            h.o r8 = r2.f98f
            monitor-enter(r8)
            java.lang.String r10 = "route"
            p072l2.C1241e.m3517j(r9, r10)     // Catch:{ all -> 0x01cd }
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r10 = r8.f3645b     // Catch:{ all -> 0x01cd }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x01cd }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01cd }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01c9
            java.util.List<w3.j0> r8 = r2.f96d
            r8.add(r9)
            goto L_0x019d
        L_0x01c9:
            r5.add(r9)
            goto L_0x019d
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01d0:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00b5
            goto L_0x0239
        L_0x01d8:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            w3.a r2 = r2.f97e
            w3.r r2 = r2.f5892d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01f6:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0218:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = p000a.C0001b.m0a(r7)
            w3.a r4 = r2.f97e
            w3.x r4 = r4.f5889a
            java.lang.String r4 = r4.f6120e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f93a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0239:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0249
            java.util.List<w3.j0> r6 = r2.f96d
            p126u2.C1848i.m5047I(r5, r6)
            java.util.List<w3.j0> r2 = r2.f96d
            r2.clear()
        L_0x0249:
            a4.l$a r2 = new a4.l$a
            r2.<init>(r5)
            r1.f31a = r2
            java.util.List<w3.j0> r5 = r2.f102b
            a4.e r6 = r1.f39i
            boolean r6 = r6.f53q
            if (r6 != 0) goto L_0x0339
            a4.j r6 = r1.f37g
            w3.a r7 = r1.f38h
            a4.e r8 = r1.f39i
            boolean r0 = r6.mo55a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x026d
        L_0x0264:
            a4.e r0 = r1.f39i
            a4.i r0 = r0.f47k
            p072l2.C1241e.m3515e(r0)
        L_0x026b:
            r2 = r0
            goto L_0x02c6
        L_0x026d:
            w3.j0 r2 = r2.mo61b()
        L_0x0271:
            a4.i r14 = new a4.i
            a4.j r0 = r1.f37g
            r14.<init>(r0, r2)
            a4.e r0 = r1.f39i
            r0.f55s = r14
            a4.e r12 = r1.f39i     // Catch:{ all -> 0x0333 }
            w3.s r13 = r1.f40j     // Catch:{ all -> 0x0333 }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.mo43c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0333 }
            a4.e r0 = r1.f39i
            r0.f55s = r3
            a4.e r0 = r1.f39i
            w3.b0 r0 = r0.f56t
            h.o r3 = r0.f5919C
            w3.j0 r0 = r14.f84q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            p072l2.C1241e.m3517j(r0, r6)     // Catch:{ all -> 0x0330 }
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r6 = r3.f3645b     // Catch:{ all -> 0x0330 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0330 }
            r6.remove(r0)     // Catch:{ all -> 0x0330 }
            monitor-exit(r3)
            a4.j r0 = r1.f37g
            w3.a r3 = r1.f38h
            a4.e r6 = r1.f39i
            boolean r0 = r0.mo55a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x02d0
            a4.e r0 = r1.f39i
            a4.i r0 = r0.f47k
            p072l2.C1241e.m3515e(r0)
            r1.f36f = r2
            java.net.Socket r2 = r14.f70c
            p072l2.C1241e.m3515e(r2)
            p144x3.C2129c.m5516d(r2)
            goto L_0x026b
        L_0x02c6:
            w3.s r0 = r1.f40j
            a4.e r3 = r1.f39i
            r0.mo6601a(r3, r2)
        L_0x02cd:
            r0 = r21
            goto L_0x02fb
        L_0x02d0:
            monitor-enter(r14)
            a4.j r0 = r1.f37g     // Catch:{ all -> 0x032d }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "connection"
            p072l2.C1241e.m3517j(r14, r2)     // Catch:{ all -> 0x032d }
            byte[] r2 = p144x3.C2129c.f6169a     // Catch:{ all -> 0x032d }
            java.util.concurrent.ConcurrentLinkedQueue<a4.i> r2 = r0.f88d     // Catch:{ all -> 0x032d }
            r2.add(r14)     // Catch:{ all -> 0x032d }
            z3.c r2 = r0.f86b     // Catch:{ all -> 0x032d }
            a4.j$a r0 = r0.f87c     // Catch:{ all -> 0x032d }
            r5 = 0
            r2.mo6767c(r0, r5)     // Catch:{ all -> 0x032d }
            a4.e r0 = r1.f39i     // Catch:{ all -> 0x032d }
            r0.mo29d(r14)     // Catch:{ all -> 0x032d }
            monitor-exit(r14)
            w3.s r0 = r1.f40j
            a4.e r2 = r1.f39i
            r0.mo6601a(r2, r14)
            r0 = r21
            r2 = r14
        L_0x02fb:
            boolean r3 = r2.mo49i(r0)
            if (r3 == 0) goto L_0x0302
            return r2
        L_0x0302:
            r2.mo52l()
            w3.j0 r2 = r1.f36f
            if (r2 == 0) goto L_0x030b
            goto L_0x0001
        L_0x030b:
            a4.l$a r2 = r1.f31a
            if (r2 == 0) goto L_0x0314
            boolean r2 = r2.mo60a()
            goto L_0x0315
        L_0x0314:
            r2 = r4
        L_0x0315:
            if (r2 == 0) goto L_0x0319
            goto L_0x0001
        L_0x0319:
            a4.l r2 = r1.f32b
            if (r2 == 0) goto L_0x0321
            boolean r4 = r2.mo58a()
        L_0x0321:
            if (r4 == 0) goto L_0x0325
            goto L_0x0001
        L_0x0325:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x032d:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0330:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0333:
            r0 = move-exception
            a4.e r2 = r1.f39i
            r2.f55s = r3
            throw r0
        L_0x0339:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0341:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0347:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0016d.mo22a(int, int, int, int, boolean, boolean):a4.i");
    }

    /* renamed from: b */
    public final boolean mo23b(C2106x xVar) {
        C1241e.m3517j(xVar, "url");
        C2106x xVar2 = this.f38h.f5889a;
        return xVar.f6121f == xVar2.f6121f && C1241e.m3513b(xVar.f6120e, xVar2.f6120e);
    }

    /* renamed from: c */
    public final void mo24c(IOException iOException) {
        C1241e.m3517j(iOException, "e");
        this.f36f = null;
        if ((iOException instanceof C0851u) && ((C0851u) iOException).f3302e == C0814b.REFUSED_STREAM) {
            this.f33c++;
        } else if (iOException instanceof C0813a) {
            this.f34d++;
        } else {
            this.f35e++;
        }
    }
}
