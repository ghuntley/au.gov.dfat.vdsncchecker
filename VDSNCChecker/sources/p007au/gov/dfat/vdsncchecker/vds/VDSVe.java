package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import java.util.List;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.vds.VDSVd;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p077m1.C1428c;
import p097p3.C1580b;
import p103q3.C1615c;
import p115s3.C1724c;
import p115s3.C1726e;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVe */
public final class VDSVe {
    public static final C0515b Companion = new C0515b((C0802f) null);
    private final String des;
    private final String dis;
    private final String nam;

    /* renamed from: vd */
    private final List<VDSVd> f2294vd;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVe$a */
    public static final class C0514a implements C1726e<VDSVe> {

        /* renamed from: a */
        public static final C0514a f2295a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2296b;

        static {
            C0514a aVar = new C0514a();
            f2295a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSVe", aVar, 4);
            kVar.mo5995k("des", false);
            kVar.mo5995k("nam", false);
            kVar.mo5995k("dis", false);
            kVar.mo5995k("vd", false);
            f2296b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2296b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            C1742p pVar = C1742p.f5334a;
            return new C1580b[]{pVar, pVar, pVar, new C1724c(VDSVd.C0512a.f2292a)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo2494d(p109r3.C1687c r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "decoder"
                p072l2.C1241e.m3517j(r0, r1)
                q3.c r1 = f2296b
                r3.b r0 = r0.mo5886e(r1)
                boolean r2 = r0.mo5880o()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x0037
                java.lang.String r2 = r0.mo5879k(r1, r5)
                java.lang.String r5 = r0.mo5879k(r1, r6)
                java.lang.String r6 = r0.mo5879k(r1, r7)
                s3.c r7 = new s3.c
                au.gov.dfat.vdsncchecker.vds.VDSVd$a r8 = p007au.gov.dfat.vdsncchecker.vds.VDSVd.C0512a.f2292a
                r7.<init>(r8)
                java.lang.Object r3 = r0.mo5874b(r1, r3, r7, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                r15 = r5
                r16 = r6
                goto L_0x007e
            L_0x0037:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r11 = r6
            L_0x003c:
                if (r11 == 0) goto L_0x0078
                int r12 = r0.mo5885n(r1)
                r13 = -1
                if (r12 == r13) goto L_0x0076
                if (r12 == 0) goto L_0x006f
                if (r12 == r6) goto L_0x0068
                if (r12 == r7) goto L_0x0061
                if (r12 != r3) goto L_0x005b
                s3.c r12 = new s3.c
                au.gov.dfat.vdsncchecker.vds.VDSVd$a r13 = p007au.gov.dfat.vdsncchecker.vds.VDSVd.C0512a.f2292a
                r12.<init>(r13)
                java.lang.Object r10 = r0.mo5874b(r1, r3, r12, r10)
                r2 = r2 | 8
                goto L_0x003c
            L_0x005b:
                p3.c r0 = new p3.c
                r0.<init>(r12)
                throw r0
            L_0x0061:
                java.lang.String r9 = r0.mo5879k(r1, r7)
                r2 = r2 | 4
                goto L_0x003c
            L_0x0068:
                java.lang.String r8 = r0.mo5879k(r1, r6)
                r2 = r2 | 2
                goto L_0x003c
            L_0x006f:
                java.lang.String r4 = r0.mo5879k(r1, r5)
                r2 = r2 | 1
                goto L_0x003c
            L_0x0076:
                r11 = r5
                goto L_0x003c
            L_0x0078:
                r13 = r2
                r14 = r4
                r15 = r8
                r16 = r9
                r3 = r10
            L_0x007e:
                r0.mo5884l(r1)
                au.gov.dfat.vdsncchecker.vds.VDSVe r0 = new au.gov.dfat.vdsncchecker.vds.VDSVe
                r17 = r3
                java.util.List r17 = (java.util.List) r17
                r18 = 0
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.vds.VDSVe.C0514a.mo2494d(r3.c):java.lang.Object");
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSVe$b */
    public static final class C0515b {
        public C0515b(C0802f fVar) {
        }
    }

    public VDSVe(int i, String str, String str2, String str3, List list, C1741o oVar) {
        if (15 == (i & 15)) {
            this.des = str;
            this.nam = str2;
            this.dis = str3;
            this.f2294vd = list;
            return;
        }
        C0514a aVar = C0514a.f2295a;
        C1320u.m3722z(i, 15, C0514a.f2296b);
        throw null;
    }

    public VDSVe(String str, String str2, String str3, List<VDSVd> list) {
        C1241e.m3517j(str, "des");
        C1241e.m3517j(str2, "nam");
        C1241e.m3517j(str3, "dis");
        C1241e.m3517j(list, "vd");
        this.des = str;
        this.nam = str2;
        this.dis = str3;
        this.f2294vd = list;
    }

    public static /* synthetic */ VDSVe copy$default(VDSVe vDSVe, String str, String str2, String str3, List<VDSVd> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vDSVe.des;
        }
        if ((i & 2) != 0) {
            str2 = vDSVe.nam;
        }
        if ((i & 4) != 0) {
            str3 = vDSVe.dis;
        }
        if ((i & 8) != 0) {
            list = vDSVe.f2294vd;
        }
        return vDSVe.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.des;
    }

    public final String component2() {
        return this.nam;
    }

    public final String component3() {
        return this.dis;
    }

    public final List<VDSVd> component4() {
        return this.f2294vd;
    }

    public final VDSVe copy(String str, String str2, String str3, List<VDSVd> list) {
        C1241e.m3517j(str, "des");
        C1241e.m3517j(str2, "nam");
        C1241e.m3517j(str3, "dis");
        C1241e.m3517j(list, "vd");
        return new VDSVe(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSVe)) {
            return false;
        }
        VDSVe vDSVe = (VDSVe) obj;
        return C1241e.m3513b(this.des, vDSVe.des) && C1241e.m3513b(this.nam, vDSVe.nam) && C1241e.m3513b(this.dis, vDSVe.dis) && C1241e.m3513b(this.f2294vd, vDSVe.f2294vd);
    }

    public final String getDes() {
        return this.des;
    }

    public final String getDis() {
        return this.dis;
    }

    public final String getNam() {
        return this.nam;
    }

    public final List<VDSVd> getVd() {
        return this.f2294vd;
    }

    public int hashCode() {
        return this.f2294vd.hashCode() + C1428c.m4090a(this.dis, C1428c.m4090a(this.nam, this.des.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSVe(des=");
        a.append(this.des);
        a.append(", nam=");
        a.append(this.nam);
        a.append(", dis=");
        a.append(this.dis);
        a.append(", vd=");
        a.append(this.f2294vd);
        a.append(')');
        return a.toString();
    }
}
