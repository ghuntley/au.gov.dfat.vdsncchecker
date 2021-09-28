package p139w3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p025d3.C0802f;
import p062j4.C1113g;
import p062j4.C1115i;
import p072l2.C1241e;
import p139w3.C2111z;

/* renamed from: w3.a0 */
public final class C2053a0 extends C2070f0 {

    /* renamed from: e */
    public static final C2111z f5900e = C2111z.C2112a.m5503a("multipart/mixed");

    /* renamed from: f */
    public static final C2111z f5901f = C2111z.C2112a.m5503a("multipart/form-data");

    /* renamed from: g */
    public static final byte[] f5902g = {(byte) 58, (byte) 32};

    /* renamed from: h */
    public static final byte[] f5903h = {(byte) 13, (byte) 10};

    /* renamed from: i */
    public static final byte[] f5904i;

    /* renamed from: a */
    public final C2111z f5905a;

    /* renamed from: b */
    public long f5906b = -1;

    /* renamed from: c */
    public final C1115i f5907c;

    /* renamed from: d */
    public final List<C2055b> f5908d;

    /* renamed from: w3.a0$a */
    public static final class C2054a {

        /* renamed from: a */
        public final C1115i f5909a;

        /* renamed from: b */
        public C2111z f5910b = C2053a0.f5900e;

        /* renamed from: c */
        public final List<C2055b> f5911c = new ArrayList();

        public C2054a() {
            String uuid = UUID.randomUUID().toString();
            C1241e.m3516f(uuid, "UUID.randomUUID().toString()");
            C1241e.m3517j(uuid, "boundary");
            this.f5909a = C1115i.f3890i.mo4683b(uuid);
        }
    }

    /* renamed from: w3.a0$b */
    public static final class C2055b {

        /* renamed from: a */
        public final C2103w f5912a;

        /* renamed from: b */
        public final C2070f0 f5913b;

        public C2055b(C2103w wVar, C2070f0 f0Var, C0802f fVar) {
            this.f5912a = wVar;
            this.f5913b = f0Var;
        }
    }

    static {
        C2111z.C2112a aVar = C2111z.f6136f;
        C2111z.C2112a.m5503a("multipart/alternative");
        C2111z.C2112a.m5503a("multipart/digest");
        C2111z.C2112a.m5503a("multipart/parallel");
        byte b = (byte) 45;
        f5904i = new byte[]{b, b};
    }

    public C2053a0(C1115i iVar, C2111z zVar, List<C2055b> list) {
        C1241e.m3517j(iVar, "boundaryByteString");
        C1241e.m3517j(zVar, "type");
        this.f5907c = iVar;
        this.f5908d = list;
        C2111z.C2112a aVar = C2111z.f6136f;
        this.f5905a = C2111z.C2112a.m5503a(zVar + "; boundary=" + iVar.mo4679j());
    }

    /* renamed from: a */
    public long mo6448a() {
        long j = this.f5906b;
        if (j != -1) {
            return j;
        }
        long d = mo6536d((C1113g) null, true);
        this.f5906b = d;
        return d;
    }

    /* renamed from: b */
    public C2111z mo6449b() {
        return this.f5905a;
    }

    /* renamed from: c */
    public void mo6450c(C1113g gVar) {
        C1241e.m3517j(gVar, "sink");
        mo6536d(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: j4.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: j4.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: j4.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: j4.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: j4.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo6536d(p062j4.C1113g r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            j4.f r13 = new j4.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<w3.a0$b> r1 = r12.f5908d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00aa
            java.util.List<w3.a0$b> r6 = r12.f5908d
            java.lang.Object r6 = r6.get(r5)
            w3.a0$b r6 = (p139w3.C2053a0.C2055b) r6
            w3.w r7 = r6.f5912a
            w3.f0 r6 = r6.f5913b
            p072l2.C1241e.m3515e(r13)
            byte[] r8 = f5904i
            r13.mo4642e(r8)
            j4.i r8 = r12.f5907c
            r13.mo4612B(r8)
            byte[] r8 = f5903h
            r13.mo4642e(r8)
            if (r7 == 0) goto L_0x005b
            int r8 = r7.size()
            r9 = r2
        L_0x003b:
            if (r9 >= r8) goto L_0x005b
            java.lang.String r10 = r7.mo6612c(r9)
            j4.g r10 = r13.mo4617G(r10)
            byte[] r11 = f5902g
            j4.g r10 = r10.mo4642e(r11)
            java.lang.String r11 = r7.mo6614e(r9)
            j4.g r10 = r10.mo4617G(r11)
            byte[] r11 = f5903h
            r10.mo4642e(r11)
            int r9 = r9 + 1
            goto L_0x003b
        L_0x005b:
            w3.z r7 = r6.mo6449b()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            j4.g r8 = r13.mo4617G(r8)
            java.lang.String r7 = r7.f6137a
            j4.g r7 = r8.mo4617G(r7)
            byte[] r8 = f5903h
            r7.mo4642e(r8)
        L_0x0072:
            long r7 = r6.mo6448a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            j4.g r9 = r13.mo4617G(r9)
            j4.g r9 = r9.mo4618H(r7)
            byte[] r10 = f5903h
            r9.mo4642e(r10)
            goto L_0x0097
        L_0x008c:
            if (r14 == 0) goto L_0x0097
            p072l2.C1241e.m3515e(r0)
            long r13 = r0.f3888f
            r0.mo4654q(r13)
            return r9
        L_0x0097:
            byte[] r9 = f5903h
            r13.mo4642e(r9)
            if (r14 == 0) goto L_0x00a0
            long r3 = r3 + r7
            goto L_0x00a3
        L_0x00a0:
            r6.mo6450c(r13)
        L_0x00a3:
            r13.mo4642e(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00aa:
            p072l2.C1241e.m3515e(r13)
            byte[] r1 = f5904i
            r13.mo4642e(r1)
            j4.i r2 = r12.f5907c
            r13.mo4612B(r2)
            r13.mo4642e(r1)
            byte[] r1 = f5903h
            r13.mo4642e(r1)
            if (r14 == 0) goto L_0x00ca
            p072l2.C1241e.m3515e(r0)
            long r13 = r0.f3888f
            long r3 = r3 + r13
            r0.mo4654q(r13)
        L_0x00ca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p139w3.C2053a0.mo6536d(j4.g, boolean):long");
    }
}
