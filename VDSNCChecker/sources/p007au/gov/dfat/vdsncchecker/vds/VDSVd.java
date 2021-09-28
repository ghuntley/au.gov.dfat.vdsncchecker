package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import com.dynamsoft.dce.HardwareUtil;
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
import p115s3.C1731i;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVd */
public final class VDSVd {
    public static final C0513b Companion = new C0513b((C0802f) null);
    private final String adm;
    private final String ctr;
    private final String dvc;
    private final String dvn;
    private final String lot;
    private final long seq;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVd$a */
    public static final class C0512a implements C1726e<VDSVd> {

        /* renamed from: a */
        public static final C0512a f2292a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2293b;

        static {
            C0512a aVar = new C0512a();
            f2292a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSVd", aVar, 6);
            kVar.mo5995k("dvc", false);
            kVar.mo5995k("seq", false);
            kVar.mo5995k("ctr", false);
            kVar.mo5995k("adm", false);
            kVar.mo5995k("lot", false);
            kVar.mo5995k("dvn", true);
            f2293b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2293b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            C1742p pVar = C1742p.f5334a;
            return new C1580b[]{pVar, C1730h.f5308a, pVar, pVar, pVar, new C1731i(pVar)};
        }

        /* renamed from: d */
        public Object mo2494d(C1687c cVar) {
            Object obj;
            String str;
            String str2;
            long j;
            String str3;
            int i;
            int i2;
            C1687c cVar2 = cVar;
            C1241e.m3517j(cVar2, "decoder");
            C1615c cVar3 = f2293b;
            long j2 = 0;
            C1685b e = cVar2.mo5886e(cVar3);
            String str4 = null;
            if (e.mo5880o()) {
                String k = e.mo5879k(cVar3, 0);
                long q = e.mo5882q(cVar3, 1);
                String k2 = e.mo5879k(cVar3, 2);
                String k3 = e.mo5879k(cVar3, 3);
                String k4 = e.mo5879k(cVar3, 4);
                obj = e.mo5877f(cVar3, 5, C1742p.f5334a, null);
                j = q;
                str3 = k;
                i = 63;
                str4 = k3;
                str2 = k2;
                str = k4;
            } else {
                String str5 = null;
                obj = null;
                String str6 = null;
                String str7 = null;
                boolean z = true;
                int i3 = 0;
                while (z) {
                    int n = e.mo5885n(cVar3);
                    switch (n) {
                        case HardwareUtil.DEVICEINFO_UNKNOWN /*-1*/:
                            z = false;
                            continue;
                        case 0:
                            str7 = e.mo5879k(cVar3, 0);
                            i3 |= 1;
                            continue;
                        case 1:
                            j2 = e.mo5882q(cVar3, 1);
                            i2 = i3 | 2;
                            break;
                        case 2:
                            i3 |= 4;
                            str6 = e.mo5879k(cVar3, 2);
                            break;
                        case 3:
                            str4 = e.mo5879k(cVar3, 3);
                            i2 = i3 | 8;
                            break;
                        case 4:
                            str5 = e.mo5879k(cVar3, 4);
                            i2 = i3 | 16;
                            break;
                        case 5:
                            i3 |= 32;
                            obj = e.mo5877f(cVar3, 5, C1742p.f5334a, obj);
                            break;
                        default:
                            throw new C1581c(n);
                    }
                    i3 = i2;
                }
                str = str5;
                str2 = str6;
                j = j2;
                str3 = str7;
                i = i3;
            }
            e.mo5884l(cVar3);
            return new VDSVd(i, str3, j, str2, str4, str, (String) obj, (C1741o) null);
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVd$b */
    public static final class C0513b {
        public C0513b(C0802f fVar) {
        }
    }

    public VDSVd(int i, String str, long j, String str2, String str3, String str4, String str5, C1741o oVar) {
        if (31 == (i & 31)) {
            this.dvc = str;
            this.seq = j;
            this.ctr = str2;
            this.adm = str3;
            this.lot = str4;
            if ((i & 32) == 0) {
                this.dvn = null;
            } else {
                this.dvn = str5;
            }
        } else {
            C0512a aVar = C0512a.f2292a;
            C1320u.m3722z(i, 31, C0512a.f2293b);
            throw null;
        }
    }

    public VDSVd(String str, long j, String str2, String str3, String str4, String str5) {
        C1241e.m3517j(str, "dvc");
        C1241e.m3517j(str2, "ctr");
        C1241e.m3517j(str3, "adm");
        C1241e.m3517j(str4, "lot");
        this.dvc = str;
        this.seq = j;
        this.ctr = str2;
        this.adm = str3;
        this.lot = str4;
        this.dvn = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VDSVd(String str, long j, String str2, String str3, String str4, String str5, int i, C0802f fVar) {
        this(str, j, str2, str3, str4, (i & 32) != 0 ? null : str5);
    }

    public static /* synthetic */ VDSVd copy$default(VDSVd vDSVd, String str, long j, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vDSVd.dvc;
        }
        if ((i & 2) != 0) {
            j = vDSVd.seq;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = vDSVd.ctr;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = vDSVd.adm;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = vDSVd.lot;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = vDSVd.dvn;
        }
        return vDSVd.copy(str, j2, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.dvc;
    }

    public final long component2() {
        return this.seq;
    }

    public final String component3() {
        return this.ctr;
    }

    public final String component4() {
        return this.adm;
    }

    public final String component5() {
        return this.lot;
    }

    public final String component6() {
        return this.dvn;
    }

    public final VDSVd copy(String str, long j, String str2, String str3, String str4, String str5) {
        C1241e.m3517j(str, "dvc");
        C1241e.m3517j(str2, "ctr");
        C1241e.m3517j(str3, "adm");
        C1241e.m3517j(str4, "lot");
        return new VDSVd(str, j, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSVd)) {
            return false;
        }
        VDSVd vDSVd = (VDSVd) obj;
        return C1241e.m3513b(this.dvc, vDSVd.dvc) && this.seq == vDSVd.seq && C1241e.m3513b(this.ctr, vDSVd.ctr) && C1241e.m3513b(this.adm, vDSVd.adm) && C1241e.m3513b(this.lot, vDSVd.lot) && C1241e.m3513b(this.dvn, vDSVd.dvn);
    }

    public final String getAdm() {
        return this.adm;
    }

    public final String getCtr() {
        return this.ctr;
    }

    public final String getDvc() {
        return this.dvc;
    }

    public final String getDvn() {
        return this.dvn;
    }

    public final String getLot() {
        return this.lot;
    }

    public final long getSeq() {
        return this.seq;
    }

    public int hashCode() {
        int a = C1428c.m4090a(this.lot, C1428c.m4090a(this.adm, C1428c.m4090a(this.ctr, (Long.hashCode(this.seq) + (this.dvc.hashCode() * 31)) * 31, 31), 31), 31);
        String str = this.dvn;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSVd(dvc=");
        a.append(this.dvc);
        a.append(", seq=");
        a.append(this.seq);
        a.append(", ctr=");
        a.append(this.ctr);
        a.append(", adm=");
        a.append(this.adm);
        a.append(", lot=");
        a.append(this.lot);
        a.append(", dvn=");
        a.append(this.dvn);
        a.append(')');
        return a.toString();
    }
}
