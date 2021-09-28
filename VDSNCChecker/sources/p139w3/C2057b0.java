package p139w3;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p005a4.C0017e;
import p025d3.C0802f;
import p045h.C0990o;
import p050h4.C1018c;
import p050h4.C1019d;
import p072l2.C1241e;
import p139w3.C2068f;
import p139w3.C2095s;
import p144x3.C2127a;
import p144x3.C2129c;

/* renamed from: w3.b0 */
public class C2057b0 implements Cloneable, C2068f.C2069a {

    /* renamed from: D */
    public static final List<C2061c0> f5914D = C2129c.m5523k(C2061c0.HTTP_2, C2061c0.HTTP_1_1);

    /* renamed from: E */
    public static final List<C2087l> f5915E = C2129c.m5523k(C2087l.f6068e, C2087l.f6069f);

    /* renamed from: F */
    public static final C2059b f5916F = new C2059b((C0802f) null);

    /* renamed from: A */
    public final int f5917A;

    /* renamed from: B */
    public final int f5918B;

    /* renamed from: C */
    public final C0990o f5919C;

    /* renamed from: e */
    public final C2092p f5920e;

    /* renamed from: f */
    public final C0990o f5921f;

    /* renamed from: g */
    public final List<C2109y> f5922g;

    /* renamed from: h */
    public final List<C2109y> f5923h;

    /* renamed from: i */
    public final C2095s.C2097b f5924i;

    /* renamed from: j */
    public final boolean f5925j;

    /* renamed from: k */
    public final C2060c f5926k;

    /* renamed from: l */
    public final boolean f5927l;

    /* renamed from: m */
    public final boolean f5928m;

    /* renamed from: n */
    public final C2091o f5929n;

    /* renamed from: o */
    public final C2094r f5930o;

    /* renamed from: p */
    public final ProxySelector f5931p;

    /* renamed from: q */
    public final C2060c f5932q;

    /* renamed from: r */
    public final SocketFactory f5933r;

    /* renamed from: s */
    public final SSLSocketFactory f5934s;

    /* renamed from: t */
    public final X509TrustManager f5935t;

    /* renamed from: u */
    public final List<C2087l> f5936u;

    /* renamed from: v */
    public final List<C2061c0> f5937v;

    /* renamed from: w */
    public final HostnameVerifier f5938w;

    /* renamed from: x */
    public final C2074h f5939x;

    /* renamed from: y */
    public final C1018c f5940y;

    /* renamed from: z */
    public final int f5941z;

    /* renamed from: w3.b0$a */
    public static final class C2058a {

        /* renamed from: a */
        public C2092p f5942a = new C2092p();

        /* renamed from: b */
        public C0990o f5943b = new C0990o(6);

        /* renamed from: c */
        public final List<C2109y> f5944c = new ArrayList();

        /* renamed from: d */
        public final List<C2109y> f5945d = new ArrayList();

        /* renamed from: e */
        public C2095s.C2097b f5946e;

        /* renamed from: f */
        public boolean f5947f;

        /* renamed from: g */
        public C2060c f5948g;

        /* renamed from: h */
        public boolean f5949h;

        /* renamed from: i */
        public boolean f5950i;

        /* renamed from: j */
        public C2091o f5951j;

        /* renamed from: k */
        public C2094r f5952k;

        /* renamed from: l */
        public C2060c f5953l;

        /* renamed from: m */
        public SocketFactory f5954m;

        /* renamed from: n */
        public List<C2087l> f5955n;

        /* renamed from: o */
        public List<? extends C2061c0> f5956o;

        /* renamed from: p */
        public HostnameVerifier f5957p;

        /* renamed from: q */
        public C2074h f5958q;

        /* renamed from: r */
        public int f5959r;

        /* renamed from: s */
        public int f5960s;

        /* renamed from: t */
        public int f5961t;

        /* renamed from: u */
        public long f5962u;

        public C2058a() {
            C2095s sVar = C2095s.f6098a;
            byte[] bArr = C2129c.f6169a;
            C1241e.m3517j(sVar, "$this$asFactory");
            this.f5946e = new C2127a(sVar);
            this.f5947f = true;
            C2060c cVar = C2060c.f5963a;
            this.f5948g = cVar;
            this.f5949h = true;
            this.f5950i = true;
            this.f5951j = C2091o.f6092a;
            this.f5952k = C2094r.f6097a;
            this.f5953l = cVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C1241e.m3516f(socketFactory, "SocketFactory.getDefault()");
            this.f5954m = socketFactory;
            C2059b bVar = C2057b0.f5916F;
            this.f5955n = C2057b0.f5915E;
            this.f5956o = C2057b0.f5914D;
            this.f5957p = C1019d.f3739a;
            this.f5958q = C2074h.f6027c;
            this.f5959r = 10000;
            this.f5960s = 10000;
            this.f5961t = 10000;
            this.f5962u = 1024;
        }
    }

    /* renamed from: w3.b0$b */
    public static final class C2059b {
        public C2059b(C0802f fVar) {
        }
    }

    public C2057b0() {
        this(new C2058a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2057b0(p139w3.C2057b0.C2058a r6) {
        /*
            r5 = this;
            r5.<init>()
            w3.p r0 = r6.f5942a
            r5.f5920e = r0
            h.o r0 = r6.f5943b
            r5.f5921f = r0
            java.util.List<w3.y> r0 = r6.f5944c
            java.util.List r0 = p144x3.C2129c.m5533u(r0)
            r5.f5922g = r0
            java.util.List<w3.y> r0 = r6.f5945d
            java.util.List r0 = p144x3.C2129c.m5533u(r0)
            r5.f5923h = r0
            w3.s$b r0 = r6.f5946e
            r5.f5924i = r0
            boolean r0 = r6.f5947f
            r5.f5925j = r0
            w3.c r0 = r6.f5948g
            r5.f5926k = r0
            boolean r0 = r6.f5949h
            r5.f5927l = r0
            boolean r0 = r6.f5950i
            r5.f5928m = r0
            w3.o r0 = r6.f5951j
            r5.f5929n = r0
            w3.r r0 = r6.f5952k
            r5.f5930o = r0
            r0 = 0
            java.net.ProxySelector r1 = java.net.ProxySelector.getDefault()
            if (r1 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            g4.a r1 = p044g4.C0957a.f3534a
        L_0x0041:
            r5.f5931p = r1
            w3.c r1 = r6.f5953l
            r5.f5932q = r1
            javax.net.SocketFactory r1 = r6.f5954m
            r5.f5933r = r1
            java.util.List<w3.l> r1 = r6.f5955n
            r5.f5936u = r1
            java.util.List<? extends w3.c0> r2 = r6.f5956o
            r5.f5937v = r2
            javax.net.ssl.HostnameVerifier r2 = r6.f5957p
            r5.f5938w = r2
            r2 = 0
            int r3 = r6.f5959r
            r5.f5941z = r3
            int r3 = r6.f5960s
            r5.f5917A = r3
            int r3 = r6.f5961t
            r5.f5918B = r3
            h.o r3 = new h.o
            r4 = 7
            r3.<init>((int) r4)
            r5.f5919C = r3
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 1
            if (r3 == 0) goto L_0x0078
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0078
            goto L_0x008e
        L_0x0078:
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r1.next()
            w3.l r3 = (p139w3.C2087l) r3
            boolean r3 = r3.f6070a
            if (r3 == 0) goto L_0x007c
            r1 = r2
            goto L_0x008f
        L_0x008e:
            r1 = r4
        L_0x008f:
            if (r1 == 0) goto L_0x009a
            r5.f5934s = r0
            r5.f5940y = r0
            r5.f5935t = r0
            w3.h r6 = p139w3.C2074h.f6027c
            goto L_0x00c0
        L_0x009a:
            e4.e$a r1 = p032e4.C0879e.f3347c
            e4.e r1 = p032e4.C0879e.f3345a
            javax.net.ssl.X509TrustManager r1 = r1.mo4184n()
            r5.f5935t = r1
            e4.e r3 = p032e4.C0879e.f3345a
            p072l2.C1241e.m3515e(r1)
            javax.net.ssl.SSLSocketFactory r3 = r3.mo4183m(r1)
            r5.f5934s = r3
            e4.e r3 = p032e4.C0879e.f3345a
            h4.c r1 = r3.mo4167b(r1)
            r5.f5940y = r1
            w3.h r6 = r6.f5958q
            p072l2.C1241e.m3515e(r1)
            w3.h r6 = r6.mo6564b(r1)
        L_0x00c0:
            r5.f5939x = r6
            java.util.List<w3.y> r6 = r5.f5922g
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r6, r1)
            boolean r6 = r6.contains(r0)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x019a
            java.util.List<w3.y> r6 = r5.f5923h
            java.util.Objects.requireNonNull(r6, r1)
            boolean r6 = r6.contains(r0)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0181
            java.util.List<w3.l> r6 = r5.f5936u
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00e9
            goto L_0x00ff
        L_0x00e9:
            java.util.Iterator r6 = r6.iterator()
        L_0x00ed:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r6.next()
            w3.l r0 = (p139w3.C2087l) r0
            boolean r0 = r0.f6070a
            if (r0 == 0) goto L_0x00ed
            r6 = r2
            goto L_0x0100
        L_0x00ff:
            r6 = r4
        L_0x0100:
            if (r6 == 0) goto L_0x0150
            javax.net.ssl.SSLSocketFactory r6 = r5.f5934s
            if (r6 != 0) goto L_0x0108
            r6 = r4
            goto L_0x0109
        L_0x0108:
            r6 = r2
        L_0x0109:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x0146
            h4.c r6 = r5.f5940y
            if (r6 != 0) goto L_0x0113
            r6 = r4
            goto L_0x0114
        L_0x0113:
            r6 = r2
        L_0x0114:
            if (r6 == 0) goto L_0x013c
            javax.net.ssl.X509TrustManager r6 = r5.f5935t
            if (r6 != 0) goto L_0x011b
            r2 = r4
        L_0x011b:
            if (r2 == 0) goto L_0x0132
            w3.h r6 = r5.f5939x
            w3.h r1 = p139w3.C2074h.f6027c
            boolean r6 = p072l2.C1241e.m3513b(r6, r1)
            if (r6 == 0) goto L_0x0128
            goto L_0x015c
        L_0x0128:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0132:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x013c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0146:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0150:
            javax.net.ssl.SSLSocketFactory r6 = r5.f5934s
            if (r6 == 0) goto L_0x0175
            h4.c r6 = r5.f5940y
            if (r6 == 0) goto L_0x0169
            javax.net.ssl.X509TrustManager r6 = r5.f5935t
            if (r6 == 0) goto L_0x015d
        L_0x015c:
            return
        L_0x015d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0169:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0175:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0181:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = p000a.C0001b.m0a(r6)
            java.util.List<w3.y> r0 = r5.f5923h
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x019a:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = p000a.C0001b.m0a(r6)
            java.util.List<w3.y> r0 = r5.f5922g
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139w3.C2057b0.<init>(w3.b0$a):void");
    }

    /* renamed from: b */
    public C2068f mo6538b(C2063d0 d0Var) {
        return new C0017e(this, d0Var, false);
    }

    public Object clone() {
        return super.clone();
    }
}
