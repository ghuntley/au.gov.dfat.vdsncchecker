package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p077m1.C1428c;
import p097p3.C1580b;
import p097p3.C1581c;
import p103q3.C1615c;
import p109r3.C1685b;
import p109r3.C1687c;
import p115s3.C1726e;
import p115s3.C1730h;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSHdr */
public final class VDSHdr {
    public static final C0505b Companion = new C0505b((C0802f) null);
    private final String hdrIs;

    /* renamed from: t */
    private final String f2278t;

    /* renamed from: v */
    private final long f2279v;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSHdr$a */
    public static final class C0504a implements C1726e<VDSHdr> {

        /* renamed from: a */
        public static final C0504a f2280a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2281b;

        static {
            C0504a aVar = new C0504a();
            f2280a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSHdr", aVar, 3);
            kVar.mo5995k("v", false);
            kVar.mo5995k("t", false);
            kVar.mo5995k("is", false);
            f2281b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2281b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            C1742p pVar = C1742p.f5334a;
            return new C1580b[]{C1730h.f5308a, pVar, pVar};
        }

        /* renamed from: d */
        public Object mo2494d(C1687c cVar) {
            String str;
            String str2;
            long j;
            int i;
            C1687c cVar2 = cVar;
            C1241e.m3517j(cVar2, "decoder");
            C1615c cVar3 = f2281b;
            long j2 = 0;
            C1685b e = cVar2.mo5886e(cVar3);
            if (e.mo5880o()) {
                j = e.mo5882q(cVar3, 0);
                str2 = e.mo5879k(cVar3, 1);
                str = e.mo5879k(cVar3, 2);
                i = 7;
            } else {
                String str3 = null;
                String str4 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int n = e.mo5885n(cVar3);
                    if (n == -1) {
                        z = false;
                    } else if (n == 0) {
                        j2 = e.mo5882q(cVar3, 0);
                        i2 |= 1;
                    } else if (n == 1) {
                        str3 = e.mo5879k(cVar3, 1);
                        i2 |= 2;
                    } else if (n == 2) {
                        str4 = e.mo5879k(cVar3, 2);
                        i2 |= 4;
                    } else {
                        throw new C1581c(n);
                    }
                }
                j = j2;
                str2 = str3;
                str = str4;
                i = i2;
            }
            e.mo5884l(cVar3);
            return new VDSHdr(i, j, str2, str, (C1741o) null);
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSHdr$b */
    public static final class C0505b {
        public C0505b(C0802f fVar) {
        }
    }

    public VDSHdr(int i, long j, String str, String str2, C1741o oVar) {
        if (7 == (i & 7)) {
            this.f2279v = j;
            this.f2278t = str;
            this.hdrIs = str2;
            return;
        }
        C0504a aVar = C0504a.f2280a;
        C1320u.m3722z(i, 7, C0504a.f2281b);
        throw null;
    }

    public VDSHdr(long j, String str, String str2) {
        C1241e.m3517j(str, "t");
        C1241e.m3517j(str2, "hdrIs");
        this.f2279v = j;
        this.f2278t = str;
        this.hdrIs = str2;
    }

    public static /* synthetic */ VDSHdr copy$default(VDSHdr vDSHdr, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vDSHdr.f2279v;
        }
        if ((i & 2) != 0) {
            str = vDSHdr.f2278t;
        }
        if ((i & 4) != 0) {
            str2 = vDSHdr.hdrIs;
        }
        return vDSHdr.copy(j, str, str2);
    }

    public static /* synthetic */ void getHdrIs$annotations() {
    }

    public final long component1() {
        return this.f2279v;
    }

    public final String component2() {
        return this.f2278t;
    }

    public final String component3() {
        return this.hdrIs;
    }

    public final VDSHdr copy(long j, String str, String str2) {
        C1241e.m3517j(str, "t");
        C1241e.m3517j(str2, "hdrIs");
        return new VDSHdr(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSHdr)) {
            return false;
        }
        VDSHdr vDSHdr = (VDSHdr) obj;
        return this.f2279v == vDSHdr.f2279v && C1241e.m3513b(this.f2278t, vDSHdr.f2278t) && C1241e.m3513b(this.hdrIs, vDSHdr.hdrIs);
    }

    public final String getHdrIs() {
        return this.hdrIs;
    }

    public final String getT() {
        return this.f2278t;
    }

    public final long getV() {
        return this.f2279v;
    }

    public int hashCode() {
        return this.hdrIs.hashCode() + C1428c.m4090a(this.f2278t, Long.hashCode(this.f2279v) * 31, 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSHdr(v=");
        a.append(this.f2279v);
        a.append(", t=");
        a.append(this.f2278t);
        a.append(", hdrIs=");
        a.append(this.hdrIs);
        a.append(')');
        return a.toString();
    }
}
