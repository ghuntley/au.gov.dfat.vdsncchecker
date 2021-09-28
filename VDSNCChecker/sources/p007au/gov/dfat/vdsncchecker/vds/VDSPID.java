package p007au.gov.dfat.vdsncchecker.vds;

import androidx.annotation.Keep;
import kotlinx.serialization.KSerializer;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p073l3.C1320u;
import p077m1.C1428c;
import p097p3.C1580b;
import p103q3.C1615c;
import p115s3.C1726e;
import p115s3.C1731i;
import p115s3.C1733k;
import p115s3.C1738l;
import p115s3.C1741o;
import p115s3.C1742p;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VDSPID */
public final class VDSPID {
    public static final C0509b Companion = new C0509b((C0802f) null);

    /* renamed from: ai */
    private final String f2285ai;
    private final String dob;

    /* renamed from: i */
    private final String f2286i;

    /* renamed from: n */
    private final String f2287n;
    private final String sex;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSPID$a */
    public static final class C0508a implements C1726e<VDSPID> {

        /* renamed from: a */
        public static final C0508a f2288a;

        /* renamed from: b */
        public static final /* synthetic */ C1615c f2289b;

        static {
            C0508a aVar = new C0508a();
            f2288a = aVar;
            C1733k kVar = new C1733k("au.gov.dfat.vdsncchecker.vds.VDSPID", aVar, 5);
            kVar.mo5995k("dob", true);
            kVar.mo5995k("n", false);
            kVar.mo5995k("sex", true);
            kVar.mo5995k("i", true);
            kVar.mo5995k("ai", true);
            f2289b = kVar;
        }

        /* renamed from: a */
        public C1615c mo2491a() {
            return f2289b;
        }

        /* renamed from: b */
        public KSerializer<?>[] mo2492b() {
            C1726e.C1727a.m4791a(this);
            return C1738l.f5328a;
        }

        /* renamed from: c */
        public KSerializer<?>[] mo2493c() {
            C1742p pVar = C1742p.f5334a;
            return new C1580b[]{new C1731i(pVar), pVar, new C1731i(pVar), new C1731i(pVar), new C1731i(pVar)};
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
                q3.c r1 = f2289b
                r3.b r0 = r0.mo5886e(r1)
                boolean r2 = r0.mo5880o()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 4
                if (r2 == 0) goto L_0x0035
                s3.p r2 = p115s3.C1742p.f5334a
                java.lang.Object r4 = r0.mo5877f(r1, r4, r2, r5)
                java.lang.String r6 = r0.mo5879k(r1, r6)
                java.lang.Object r7 = r0.mo5877f(r1, r7, r2, r5)
                java.lang.Object r3 = r0.mo5877f(r1, r3, r2, r5)
                java.lang.Object r2 = r0.mo5877f(r1, r8, r2, r5)
                r5 = 31
                r8 = r6
                r6 = r5
                goto L_0x0088
            L_0x0035:
                r2 = r5
                r9 = r2
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r6
                r5 = r4
            L_0x003c:
                if (r13 == 0) goto L_0x0082
                int r14 = r0.mo5885n(r1)
                r15 = -1
                if (r14 == r15) goto L_0x0080
                if (r14 == 0) goto L_0x0077
                if (r14 == r6) goto L_0x0070
                if (r14 == r7) goto L_0x0067
                if (r14 == r3) goto L_0x005e
                if (r14 != r8) goto L_0x0058
                s3.p r14 = p115s3.C1742p.f5334a
                java.lang.Object r11 = r0.mo5877f(r1, r8, r14, r11)
                r5 = r5 | 16
                goto L_0x003c
            L_0x0058:
                p3.c r0 = new p3.c
                r0.<init>(r14)
                throw r0
            L_0x005e:
                s3.p r14 = p115s3.C1742p.f5334a
                java.lang.Object r10 = r0.mo5877f(r1, r3, r14, r10)
                r5 = r5 | 8
                goto L_0x003c
            L_0x0067:
                s3.p r14 = p115s3.C1742p.f5334a
                java.lang.Object r12 = r0.mo5877f(r1, r7, r14, r12)
                r5 = r5 | 4
                goto L_0x003c
            L_0x0070:
                java.lang.String r9 = r0.mo5879k(r1, r6)
                r5 = r5 | 2
                goto L_0x003c
            L_0x0077:
                s3.p r14 = p115s3.C1742p.f5334a
                java.lang.Object r2 = r0.mo5877f(r1, r4, r14, r2)
                r5 = r5 | 1
                goto L_0x003c
            L_0x0080:
                r13 = r4
                goto L_0x003c
            L_0x0082:
                r4 = r2
                r6 = r5
                r8 = r9
                r3 = r10
                r2 = r11
                r7 = r12
            L_0x0088:
                r0.mo5884l(r1)
                au.gov.dfat.vdsncchecker.vds.VDSPID r0 = new au.gov.dfat.vdsncchecker.vds.VDSPID
                r1 = r4
                java.lang.String r1 = (java.lang.String) r1
                r9 = r7
                java.lang.String r9 = (java.lang.String) r9
                r10 = r3
                java.lang.String r10 = (java.lang.String) r10
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                r12 = 0
                r5 = r0
                r7 = r1
                r5.<init>((int) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (p115s3.C1741o) r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.vds.VDSPID.C0508a.mo2494d(r3.c):java.lang.Object");
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VDSPID$b */
    public static final class C0509b {
        public C0509b(C0802f fVar) {
        }
    }

    public VDSPID(int i, String str, String str2, String str3, String str4, String str5, C1741o oVar) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.dob = null;
            } else {
                this.dob = str;
            }
            this.f2287n = str2;
            if ((i & 4) == 0) {
                this.sex = null;
            } else {
                this.sex = str3;
            }
            if ((i & 8) == 0) {
                this.f2286i = null;
            } else {
                this.f2286i = str4;
            }
            if ((i & 16) == 0) {
                this.f2285ai = null;
            } else {
                this.f2285ai = str5;
            }
        } else {
            C0508a aVar = C0508a.f2288a;
            C1320u.m3722z(i, 2, C0508a.f2289b);
            throw null;
        }
    }

    public VDSPID(String str, String str2, String str3, String str4, String str5) {
        C1241e.m3517j(str2, "n");
        this.dob = str;
        this.f2287n = str2;
        this.sex = str3;
        this.f2286i = str4;
        this.f2285ai = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VDSPID(String str, String str2, String str3, String str4, String str5, int i, C0802f fVar) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ VDSPID copy$default(VDSPID vdspid, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vdspid.dob;
        }
        if ((i & 2) != 0) {
            str2 = vdspid.f2287n;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = vdspid.sex;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = vdspid.f2286i;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = vdspid.f2285ai;
        }
        return vdspid.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.dob;
    }

    public final String component2() {
        return this.f2287n;
    }

    public final String component3() {
        return this.sex;
    }

    public final String component4() {
        return this.f2286i;
    }

    public final String component5() {
        return this.f2285ai;
    }

    public final VDSPID copy(String str, String str2, String str3, String str4, String str5) {
        C1241e.m3517j(str2, "n");
        return new VDSPID(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VDSPID)) {
            return false;
        }
        VDSPID vdspid = (VDSPID) obj;
        return C1241e.m3513b(this.dob, vdspid.dob) && C1241e.m3513b(this.f2287n, vdspid.f2287n) && C1241e.m3513b(this.sex, vdspid.sex) && C1241e.m3513b(this.f2286i, vdspid.f2286i) && C1241e.m3513b(this.f2285ai, vdspid.f2285ai);
    }

    public final String getAi() {
        return this.f2285ai;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getI() {
        return this.f2286i;
    }

    public final String getN() {
        return this.f2287n;
    }

    public final String getSex() {
        return this.sex;
    }

    public int hashCode() {
        String str = this.dob;
        int i = 0;
        int a = C1428c.m4090a(this.f2287n, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.sex;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2286i;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2285ai;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VDSPID(dob=");
        a.append(this.dob);
        a.append(", n=");
        a.append(this.f2287n);
        a.append(", sex=");
        a.append(this.sex);
        a.append(", i=");
        a.append(this.f2286i);
        a.append(", ai=");
        a.append(this.f2285ai);
        a.append(')');
        return a.toString();
    }
}
