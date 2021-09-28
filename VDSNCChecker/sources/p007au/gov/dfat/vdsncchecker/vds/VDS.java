package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.vds.VDSData;
import p007au.gov.dfat.vdsncchecker.vds.VDSSig;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1580b;
import p103q3.C1615c;
import p115s3.C1726e;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDS */
public final class VDS {
    public static final C0501b Companion = new C0501b((C0802f) null);
    private final VDSData data;
    private String originalJson;
    private final VDSSig sig;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDS$a */
    public static final class C0500a implements C1726e<VDS> {

        /* renamed from: a */
        public static final C0500a f2274a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2275b;

        static {
            C0500a aVar = new C0500a();
            f2274a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDS", aVar, 3);
            kVar.mo5995k("data", false);
            kVar.mo5995k("sig", false);
            kVar.mo5995k("originalJson", true);
            f2275b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2275b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            return new C1580b[]{VDSData.C0502a.f2276a, VDSSig.C0510a.f2290a, C1742p.f5334a};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo2494d(p109r3.C1687c r12) {
            /*
                r11 = this;
                java.lang.String r0 = "decoder"
                p072l2.C1241e.m3517j(r12, r0)
                q3.c r0 = f2275b
                r3.b r12 = r12.mo5886e(r0)
                boolean r1 = r12.mo5880o()
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L_0x0028
                au.gov.dfat.vdsncchecker.vds.VDSData$a r1 = p007au.gov.dfat.vdsncchecker.vds.VDSData.C0502a.f2276a
                java.lang.Object r1 = r12.mo5874b(r0, r3, r1, r2)
                au.gov.dfat.vdsncchecker.vds.VDSSig$a r3 = p007au.gov.dfat.vdsncchecker.vds.VDSSig.C0510a.f2290a
                java.lang.Object r2 = r12.mo5874b(r0, r4, r3, r2)
                java.lang.String r3 = r12.mo5879k(r0, r5)
                r4 = 7
                r7 = r3
                goto L_0x005f
            L_0x0028:
                r1 = r2
                r6 = r1
                r7 = r3
                r8 = r4
            L_0x002c:
                if (r8 == 0) goto L_0x005c
                int r9 = r12.mo5885n(r0)
                r10 = -1
                if (r9 == r10) goto L_0x005a
                if (r9 == 0) goto L_0x0051
                if (r9 == r4) goto L_0x0048
                if (r9 != r5) goto L_0x0042
                java.lang.String r2 = r12.mo5879k(r0, r5)
                r7 = r7 | 4
                goto L_0x002c
            L_0x0042:
                p3.c r12 = new p3.c
                r12.<init>(r9)
                throw r12
            L_0x0048:
                au.gov.dfat.vdsncchecker.vds.VDSSig$a r9 = p007au.gov.dfat.vdsncchecker.vds.VDSSig.C0510a.f2290a
                java.lang.Object r6 = r12.mo5874b(r0, r4, r9, r6)
                r7 = r7 | 2
                goto L_0x002c
            L_0x0051:
                au.gov.dfat.vdsncchecker.vds.VDSData$a r9 = p007au.gov.dfat.vdsncchecker.vds.VDSData.C0502a.f2276a
                java.lang.Object r1 = r12.mo5874b(r0, r3, r9, r1)
                r7 = r7 | 1
                goto L_0x002c
            L_0x005a:
                r8 = r3
                goto L_0x002c
            L_0x005c:
                r4 = r7
                r7 = r2
                r2 = r6
            L_0x005f:
                r12.mo5884l(r0)
                au.gov.dfat.vdsncchecker.vds.VDS r12 = new au.gov.dfat.vdsncchecker.vds.VDS
                r5 = r1
                au.gov.dfat.vdsncchecker.vds.VDSData r5 = (p007au.gov.dfat.vdsncchecker.vds.VDSData) r5
                r6 = r2
                au.gov.dfat.vdsncchecker.vds.VDSSig r6 = (p007au.gov.dfat.vdsncchecker.vds.VDSSig) r6
                r8 = 0
                r3 = r12
                r3.<init>((int) r4, (p007au.gov.dfat.vdsncchecker.vds.VDSData) r5, (p007au.gov.dfat.vdsncchecker.vds.VDSSig) r6, (java.lang.String) r7, (p115s3.C1741o) r8)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.vds.VDS.C0500a.mo2494d(r3.c):java.lang.Object");
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDS$b */
    public static final class C0501b {
        public C0501b(C0802f fVar) {
        }
    }

    public VDS(int i, VDSData vDSData, VDSSig vDSSig, String str, C1741o oVar) {
        if (3 == (i & 3)) {
            this.data = vDSData;
            this.sig = vDSSig;
            if ((i & 4) == 0) {
                this.originalJson = "";
            } else {
                this.originalJson = str;
            }
        } else {
            C0500a aVar = C0500a.f2274a;
            C1320u.m3722z(i, 3, C0500a.f2275b);
            throw null;
        }
    }

    public VDS(VDSData vDSData, VDSSig vDSSig, String str) {
        C1241e.m3517j(vDSData, "data");
        C1241e.m3517j(vDSSig, "sig");
        C1241e.m3517j(str, "originalJson");
        this.data = vDSData;
        this.sig = vDSSig;
        this.originalJson = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VDS(VDSData vDSData, VDSSig vDSSig, String str, int i, C0802f fVar) {
        this(vDSData, vDSSig, (i & 4) != 0 ? "" : str);
    }

    public static /* synthetic */ VDS copy$default(VDS vds, VDSData vDSData, VDSSig vDSSig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            vDSData = vds.data;
        }
        if ((i & 2) != 0) {
            vDSSig = vds.sig;
        }
        if ((i & 4) != 0) {
            str = vds.originalJson;
        }
        return vds.copy(vDSData, vDSSig, str);
    }

    public final VDSData component1() {
        return this.data;
    }

    public final VDSSig component2() {
        return this.sig;
    }

    public final String component3() {
        return this.originalJson;
    }

    public final VDS copy(VDSData vDSData, VDSSig vDSSig, String str) {
        C1241e.m3517j(vDSData, "data");
        C1241e.m3517j(vDSSig, "sig");
        C1241e.m3517j(str, "originalJson");
        return new VDS(vDSData, vDSSig, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDS)) {
            return false;
        }
        VDS vds = (VDS) obj;
        return C1241e.m3513b(this.data, vds.data) && C1241e.m3513b(this.sig, vds.sig) && C1241e.m3513b(this.originalJson, vds.originalJson);
    }

    public final VDSData getData() {
        return this.data;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final VDSSig getSig() {
        return this.sig;
    }

    public int hashCode() {
        int hashCode = this.sig.hashCode();
        return this.originalJson.hashCode() + ((hashCode + (this.data.hashCode() * 31)) * 31);
    }

    public final void setOriginalJson(String str) {
        C1241e.m3517j(str, "<set-?>");
        this.originalJson = str;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDS(data=");
        a.append(this.data);
        a.append(", sig=");
        a.append(this.sig);
        a.append(", originalJson=");
        a.append(this.originalJson);
        a.append(')');
        return a.toString();
    }
}
