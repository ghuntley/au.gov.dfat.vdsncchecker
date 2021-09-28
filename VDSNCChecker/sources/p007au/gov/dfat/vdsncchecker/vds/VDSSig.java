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
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSSig */
public final class VDSSig {
    public static final C0511b Companion = new C0511b((C0802f) null);
    private final String alg;
    private final String cer;
    private final String sigvl;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSSig$a */
    public static final class C0510a implements C1726e<VDSSig> {

        /* renamed from: a */
        public static final C0510a f2290a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2291b;

        static {
            C0510a aVar = new C0510a();
            f2290a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSSig", aVar, 3);
            kVar.mo5995k("alg", false);
            kVar.mo5995k("cer", false);
            kVar.mo5995k("sigvl", false);
            f2291b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2291b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            C1742p pVar = C1742p.f5334a;
            return new C1580b[]{pVar, pVar, pVar};
        }

        /* renamed from: d */
        public Object mo2494d(C1687c cVar) {
            String str;
            String str2;
            String str3;
            int i;
            C1687c cVar2 = cVar;
            C1241e.m3517j(cVar2, "decoder");
            C1615c cVar3 = f2291b;
            C1685b e = cVar2.mo5886e(cVar3);
            if (e.mo5880o()) {
                str3 = e.mo5879k(cVar3, 0);
                str2 = e.mo5879k(cVar3, 1);
                str = e.mo5879k(cVar3, 2);
                i = 7;
            } else {
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int n = e.mo5885n(cVar3);
                    if (n == -1) {
                        z = false;
                    } else if (n == 0) {
                        str4 = e.mo5879k(cVar3, 0);
                        i2 |= 1;
                    } else if (n == 1) {
                        str5 = e.mo5879k(cVar3, 1);
                        i2 |= 2;
                    } else if (n == 2) {
                        str6 = e.mo5879k(cVar3, 2);
                        i2 |= 4;
                    } else {
                        throw new C1581c(n);
                    }
                }
                str3 = str4;
                str2 = str5;
                str = str6;
                i = i2;
            }
            e.mo5884l(cVar3);
            return new VDSSig(i, str3, str2, str, (C1741o) null);
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSSig$b */
    public static final class C0511b {
        public C0511b(C0802f fVar) {
        }
    }

    public VDSSig(int i, String str, String str2, String str3, C1741o oVar) {
        if (7 == (i & 7)) {
            this.alg = str;
            this.cer = str2;
            this.sigvl = str3;
            return;
        }
        C0510a aVar = C0510a.f2290a;
        C1320u.m3722z(i, 7, C0510a.f2291b);
        throw null;
    }

    public VDSSig(String str, String str2, String str3) {
        C1241e.m3517j(str, "alg");
        C1241e.m3517j(str2, "cer");
        C1241e.m3517j(str3, "sigvl");
        this.alg = str;
        this.cer = str2;
        this.sigvl = str3;
    }

    public static /* synthetic */ VDSSig copy$default(VDSSig vDSSig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vDSSig.alg;
        }
        if ((i & 2) != 0) {
            str2 = vDSSig.cer;
        }
        if ((i & 4) != 0) {
            str3 = vDSSig.sigvl;
        }
        return vDSSig.copy(str, str2, str3);
    }

    public final String component1() {
        return this.alg;
    }

    public final String component2() {
        return this.cer;
    }

    public final String component3() {
        return this.sigvl;
    }

    public final VDSSig copy(String str, String str2, String str3) {
        C1241e.m3517j(str, "alg");
        C1241e.m3517j(str2, "cer");
        C1241e.m3517j(str3, "sigvl");
        return new VDSSig(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSSig)) {
            return false;
        }
        VDSSig vDSSig = (VDSSig) obj;
        return C1241e.m3513b(this.alg, vDSSig.alg) && C1241e.m3513b(this.cer, vDSSig.cer) && C1241e.m3513b(this.sigvl, vDSSig.sigvl);
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getCer() {
        return this.cer;
    }

    public final String getSigvl() {
        return this.sigvl;
    }

    public int hashCode() {
        return this.sigvl.hashCode() + C1428c.m4090a(this.cer, this.alg.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSSig(alg=");
        a.append(this.alg);
        a.append(", cer=");
        a.append(this.cer);
        a.append(", sigvl=");
        a.append(this.sigvl);
        a.append(')');
        return a.toString();
    }
}
