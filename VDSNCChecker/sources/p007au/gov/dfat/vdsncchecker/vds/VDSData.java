package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.vds.VDSHdr;
import p007au.gov.dfat.vdsncchecker.vds.VDSMsg;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1580b;
import p097p3.C1581c;
import p103q3.C1615c;
import p109r3.C1685b;
import p109r3.C1687c;
import p115s3.C1726e;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSData */
public final class VDSData {
    public static final C0503b Companion = new C0503b((C0802f) null);
    private final VDSHdr hdr;
    private final VDSMsg msg;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSData$a */
    public static final class C0502a implements C1726e<VDSData> {

        /* renamed from: a */
        public static final C0502a f2276a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2277b;

        static {
            C0502a aVar = new C0502a();
            f2276a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSData", aVar, 2);
            kVar.mo5995k("hdr", false);
            kVar.mo5995k("msg", false);
            f2277b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2277b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            return new C1580b[]{VDSHdr.C0504a.f2280a, VDSMsg.C0506a.f2283a};
        }

        /* renamed from: d */
        public Object mo2494d(C1687c cVar) {
            int i;
            Object obj;
            Object obj2;
            C1241e.m3517j(cVar, "decoder");
            C1615c cVar2 = f2277b;
            C1685b e = cVar.mo5886e(cVar2);
            if (e.mo5880o()) {
                obj2 = e.mo5874b(cVar2, 0, VDSHdr.C0504a.f2280a, null);
                obj = e.mo5874b(cVar2, 1, VDSMsg.C0506a.f2283a, null);
                i = 3;
            } else {
                obj2 = null;
                Object obj3 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int n = e.mo5885n(cVar2);
                    if (n == -1) {
                        z = false;
                    } else if (n == 0) {
                        obj2 = e.mo5874b(cVar2, 0, VDSHdr.C0504a.f2280a, obj2);
                        i2 |= 1;
                    } else if (n == 1) {
                        obj3 = e.mo5874b(cVar2, 1, VDSMsg.C0506a.f2283a, obj3);
                        i2 |= 2;
                    } else {
                        throw new C1581c(n);
                    }
                }
                obj = obj3;
                i = i2;
            }
            e.mo5884l(cVar2);
            return new VDSData(i, (VDSHdr) obj2, (VDSMsg) obj, (C1741o) null);
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSData$b */
    public static final class C0503b {
        public C0503b(C0802f fVar) {
        }
    }

    public VDSData(int i, VDSHdr vDSHdr, VDSMsg vDSMsg, C1741o oVar) {
        if (3 == (i & 3)) {
            this.hdr = vDSHdr;
            this.msg = vDSMsg;
            return;
        }
        C0502a aVar = C0502a.f2276a;
        C1320u.m3722z(i, 3, C0502a.f2277b);
        throw null;
    }

    public VDSData(VDSHdr vDSHdr, VDSMsg vDSMsg) {
        C1241e.m3517j(vDSHdr, "hdr");
        C1241e.m3517j(vDSMsg, "msg");
        this.hdr = vDSHdr;
        this.msg = vDSMsg;
    }

    public static /* synthetic */ VDSData copy$default(VDSData vDSData, VDSHdr vDSHdr, VDSMsg vDSMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            vDSHdr = vDSData.hdr;
        }
        if ((i & 2) != 0) {
            vDSMsg = vDSData.msg;
        }
        return vDSData.copy(vDSHdr, vDSMsg);
    }

    public final VDSHdr component1() {
        return this.hdr;
    }

    public final VDSMsg component2() {
        return this.msg;
    }

    public final VDSData copy(VDSHdr vDSHdr, VDSMsg vDSMsg) {
        C1241e.m3517j(vDSHdr, "hdr");
        C1241e.m3517j(vDSMsg, "msg");
        return new VDSData(vDSHdr, vDSMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSData)) {
            return false;
        }
        VDSData vDSData = (VDSData) obj;
        return C1241e.m3513b(this.hdr, vDSData.hdr) && C1241e.m3513b(this.msg, vDSData.msg);
    }

    public final VDSHdr getHdr() {
        return this.hdr;
    }

    public final VDSMsg getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return this.msg.hashCode() + (this.hdr.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSData(hdr=");
        a.append(this.hdr);
        a.append(", msg=");
        a.append(this.msg);
        a.append(')');
        return a.toString();
    }
}
