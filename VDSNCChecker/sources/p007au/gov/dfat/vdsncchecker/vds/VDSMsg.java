package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import java.util.List;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.vds.VDSPID;
import p007au.gov.dfat.vdsncchecker.vds.VDSVe;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1580b;
import p103q3.C1615c;
import p115s3.C1724c;
import p115s3.C1726e;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSMsg */
public final class VDSMsg {
    public static final C0507b Companion = new C0507b((C0802f) null);
    private final VDSPID pid;
    private final String uvci;

    /* renamed from: ve */
    private final List<VDSVe> f2282ve;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSMsg$a */
    public static final class C0506a implements C1726e<VDSMsg> {

        /* renamed from: a */
        public static final C0506a f2283a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2284b;

        static {
            C0506a aVar = new C0506a();
            f2283a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSMsg", aVar, 3);
            kVar.mo5995k("uvci", false);
            kVar.mo5995k("pid", false);
            kVar.mo5995k("ve", false);
            f2284b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2284b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            return new C1580b[]{C1742p.f5334a, VDSPID.C0508a.f2288a, new C1724c(VDSVe.C0514a.f2295a)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo2494d(p109r3.C1687c r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                p072l2.C1241e.m3517j(r0, r1)
                q3.c r1 = f2284b
                r3.b r0 = r0.mo5886e(r1)
                boolean r2 = r0.mo5880o()
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r2 == 0) goto L_0x0030
                java.lang.String r2 = r0.mo5879k(r1, r4)
                au.gov.dfat.vdsncchecker.vds.VDSPID$a r4 = p007au.gov.dfat.vdsncchecker.vds.VDSPID.C0508a.f2288a
                java.lang.Object r4 = r0.mo5874b(r1, r5, r4, r3)
                s3.c r5 = new s3.c
                au.gov.dfat.vdsncchecker.vds.VDSVe$a r7 = p007au.gov.dfat.vdsncchecker.vds.VDSVe.C0514a.f2295a
                r5.<init>(r7)
                java.lang.Object r3 = r0.mo5874b(r1, r6, r5, r3)
                r5 = 7
                r12 = r2
                r11 = r5
                goto L_0x006d
            L_0x0030:
                r2 = r3
                r7 = r2
                r8 = r4
                r9 = r5
            L_0x0034:
                if (r9 == 0) goto L_0x0069
                int r10 = r0.mo5885n(r1)
                r11 = -1
                if (r10 == r11) goto L_0x0067
                if (r10 == 0) goto L_0x0060
                if (r10 == r5) goto L_0x0057
                if (r10 != r6) goto L_0x0051
                s3.c r10 = new s3.c
                au.gov.dfat.vdsncchecker.vds.VDSVe$a r11 = p007au.gov.dfat.vdsncchecker.vds.VDSVe.C0514a.f2295a
                r10.<init>(r11)
                java.lang.Object r7 = r0.mo5874b(r1, r6, r10, r7)
                r8 = r8 | 4
                goto L_0x0034
            L_0x0051:
                p3.c r0 = new p3.c
                r0.<init>(r10)
                throw r0
            L_0x0057:
                au.gov.dfat.vdsncchecker.vds.VDSPID$a r10 = p007au.gov.dfat.vdsncchecker.vds.VDSPID.C0508a.f2288a
                java.lang.Object r3 = r0.mo5874b(r1, r5, r10, r3)
                r8 = r8 | 2
                goto L_0x0034
            L_0x0060:
                java.lang.String r2 = r0.mo5879k(r1, r4)
                r8 = r8 | 1
                goto L_0x0034
            L_0x0067:
                r9 = r4
                goto L_0x0034
            L_0x0069:
                r12 = r2
                r4 = r3
                r3 = r7
                r11 = r8
            L_0x006d:
                r0.mo5884l(r1)
                au.gov.dfat.vdsncchecker.vds.VDSMsg r0 = new au.gov.dfat.vdsncchecker.vds.VDSMsg
                r13 = r4
                au.gov.dfat.vdsncchecker.vds.VDSPID r13 = (p007au.gov.dfat.vdsncchecker.vds.VDSPID) r13
                r14 = r3
                java.util.List r14 = (java.util.List) r14
                r15 = 0
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.vds.VDSMsg.C0506a.mo2494d(r3.c):java.lang.Object");
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSMsg$b */
    public static final class C0507b {
        public C0507b(C0802f fVar) {
        }
    }

    public VDSMsg(int i, String str, VDSPID vdspid, List list, C1741o oVar) {
        if (7 == (i & 7)) {
            this.uvci = str;
            this.pid = vdspid;
            this.f2282ve = list;
            return;
        }
        C0506a aVar = C0506a.f2283a;
        C1320u.m3722z(i, 7, C0506a.f2284b);
        throw null;
    }

    public VDSMsg(String str, VDSPID vdspid, List<VDSVe> list) {
        C1241e.m3517j(str, "uvci");
        C1241e.m3517j(vdspid, "pid");
        C1241e.m3517j(list, "ve");
        this.uvci = str;
        this.pid = vdspid;
        this.f2282ve = list;
    }

    public static /* synthetic */ VDSMsg copy$default(VDSMsg vDSMsg, String str, VDSPID vdspid, List<VDSVe> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vDSMsg.uvci;
        }
        if ((i & 2) != 0) {
            vdspid = vDSMsg.pid;
        }
        if ((i & 4) != 0) {
            list = vDSMsg.f2282ve;
        }
        return vDSMsg.copy(str, vdspid, list);
    }

    public final String component1() {
        return this.uvci;
    }

    public final VDSPID component2() {
        return this.pid;
    }

    public final List<VDSVe> component3() {
        return this.f2282ve;
    }

    public final VDSMsg copy(String str, VDSPID vdspid, List<VDSVe> list) {
        C1241e.m3517j(str, "uvci");
        C1241e.m3517j(vdspid, "pid");
        C1241e.m3517j(list, "ve");
        return new VDSMsg(str, vdspid, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSMsg)) {
            return false;
        }
        VDSMsg vDSMsg = (VDSMsg) obj;
        return C1241e.m3513b(this.uvci, vDSMsg.uvci) && C1241e.m3513b(this.pid, vDSMsg.pid) && C1241e.m3513b(this.f2282ve, vDSMsg.f2282ve);
    }

    public final VDSPID getPid() {
        return this.pid;
    }

    public final String getUvci() {
        return this.uvci;
    }

    public final List<VDSVe> getVe() {
        return this.f2282ve;
    }

    public int hashCode() {
        int hashCode = this.pid.hashCode();
        return this.f2282ve.hashCode() + ((hashCode + (this.uvci.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSMsg(uvci=");
        a.append(this.uvci);
        a.append(", pid=");
        a.append(this.pid);
        a.append(", ve=");
        a.append(this.f2282ve);
        a.append(')');
        return a.toString();
    }
}
