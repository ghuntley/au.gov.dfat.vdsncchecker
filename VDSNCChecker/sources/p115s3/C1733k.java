package p115s3;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p019c3.C0625a;
import p019c3.C0636l;
import p025d3.C0806j;
import p042g2.C0955a;
import p072l2.C1241e;
import p097p3.C1580b;
import p103q3.C1615c;
import p103q3.C1617d;
import p103q3.C1618e;
import p103q3.C1621f;
import p120t2.C1790d;
import p126u2.C1850k;
import p126u2.C1852m;
import p126u2.C1853n;

/* renamed from: s3.k */
public class C1733k implements C1615c, C1725d {

    /* renamed from: a */
    public final String f5313a;

    /* renamed from: b */
    public final C1726e<?> f5314b;

    /* renamed from: c */
    public final int f5315c;

    /* renamed from: d */
    public int f5316d = -1;

    /* renamed from: e */
    public final String[] f5317e;

    /* renamed from: f */
    public final List<Annotation>[] f5318f;

    /* renamed from: g */
    public final boolean[] f5319g;

    /* renamed from: h */
    public Map<String, Integer> f5320h;

    /* renamed from: i */
    public final C1790d f5321i;

    /* renamed from: j */
    public final C1790d f5322j;

    /* renamed from: k */
    public final C1790d f5323k;

    /* renamed from: s3.k$a */
    public static final class C1734a extends C0806j implements C0625a<Integer> {

        /* renamed from: f */
        public final /* synthetic */ C1733k f5324f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1734a(C1733k kVar) {
            super(0);
            this.f5324f = kVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1733k kVar = this.f5324f;
            C1615c[] l = kVar.mo5996l();
            C1241e.m3517j(kVar, "<this>");
            C1241e.m3517j(l, "typeParams");
            int hashCode = (kVar.mo5760d().hashCode() * 31) + Arrays.hashCode(l);
            C1241e.m3517j(kVar, "<this>");
            C1617d dVar = new C1617d(kVar);
            int i = 1;
            int i2 = 1;
            while (true) {
                int i3 = 0;
                if (!dVar.hasNext()) {
                    break;
                }
                int i4 = i2 * 31;
                String d = ((C1615c) dVar.next()).mo5760d();
                if (d != null) {
                    i3 = d.hashCode();
                }
                i2 = i4 + i3;
            }
            C1617d dVar2 = new C1617d(kVar);
            while (dVar2.hasNext()) {
                int i5 = i * 31;
                C1618e i6 = ((C1615c) dVar2.next()).mo5766i();
                i = i5 + (i6 != null ? i6.hashCode() : 0);
            }
            return Integer.valueOf((((hashCode * 31) + i2) * 31) + i);
        }
    }

    /* renamed from: s3.k$b */
    public static final class C1735b extends C0806j implements C0625a<KSerializer<?>[]> {

        /* renamed from: f */
        public final /* synthetic */ C1733k f5325f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1735b(C1733k kVar) {
            super(0);
            this.f5325f = kVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1580b[] bVarArr;
            C1726e<?> eVar = this.f5325f.f5314b;
            if (eVar == null) {
                bVarArr = null;
            } else {
                bVarArr = eVar.mo2493c();
            }
            return bVarArr == null ? new C1580b[0] : bVarArr;
        }
    }

    /* renamed from: s3.k$c */
    public static final class C1736c extends C0806j implements C0636l<Integer, CharSequence> {

        /* renamed from: f */
        public final /* synthetic */ C1733k f5326f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1736c(C1733k kVar) {
            super(1);
            this.f5326f = kVar;
        }

        /* renamed from: m */
        public Object mo2828m(Object obj) {
            int intValue = ((Number) obj).intValue();
            return this.f5326f.f5317e[intValue] + ": " + this.f5326f.mo5764h(intValue).mo5760d();
        }
    }

    /* renamed from: s3.k$d */
    public static final class C1737d extends C0806j implements C0625a<SerialDescriptor[]> {

        /* renamed from: f */
        public final /* synthetic */ C1733k f5327f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1737d(C1733k kVar) {
            super(0);
            this.f5327f = kVar;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo40b() {
            /*
                r7 = this;
                s3.k r0 = r7.f5327f
                s3.e<?> r0 = r0.f5314b
                r1 = 0
                r2 = 0
                if (r0 != 0) goto L_0x0009
                goto L_0x000f
            L_0x0009:
                p3.b[] r0 = r0.mo2492b()
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                r3 = r2
                goto L_0x0027
            L_0x0011:
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = r0.length
                r3.<init>(r4)
                int r4 = r0.length
                r5 = r1
            L_0x0019:
                if (r5 >= r4) goto L_0x0027
                r6 = r0[r5]
                q3.c r6 = r6.mo2491a()
                r3.add(r6)
                int r5 = r5 + 1
                goto L_0x0019
            L_0x0027:
                if (r3 == 0) goto L_0x0032
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r0 = r1
                goto L_0x0033
            L_0x0032:
                r0 = 1
            L_0x0033:
                if (r0 != 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r3 = r2
            L_0x0037:
                if (r3 != 0) goto L_0x003a
                goto L_0x0048
            L_0x003a:
                q3.c[] r0 = new p103q3.C1615c[r1]
                java.lang.Object[] r0 = r3.toArray(r0)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r0, r1)
                r2 = r0
                q3.c[] r2 = (p103q3.C1615c[]) r2
            L_0x0048:
                if (r2 != 0) goto L_0x004c
                q3.c[] r2 = p115s3.C1732j.f5312a
            L_0x004c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p115s3.C1733k.C1737d.mo40b():java.lang.Object");
        }
    }

    public C1733k(String str, C1726e<?> eVar, int i) {
        this.f5313a = str;
        this.f5314b = eVar;
        this.f5315c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f5317e = strArr;
        int i3 = this.f5315c;
        this.f5318f = new List[i3];
        this.f5319g = new boolean[i3];
        this.f5320h = C1853n.f5543e;
        this.f5321i = C0955a.m2745s(new C1735b(this));
        this.f5322j = C0955a.m2745s(new C1737d(this));
        this.f5323k = C0955a.m2745s(new C1734a(this));
    }

    /* renamed from: a */
    public String mo5757a(int i) {
        return this.f5317e[i];
    }

    /* renamed from: b */
    public boolean mo5758b() {
        C1615c.C1616a.m4532a(this);
        return false;
    }

    /* renamed from: c */
    public int mo5759c(String str) {
        Integer num = this.f5320h.get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public String mo5760d() {
        return this.f5313a;
    }

    /* renamed from: e */
    public Set<String> mo5985e() {
        return this.f5320h.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1733k) {
            C1615c cVar = (C1615c) obj;
            if (C1241e.m3513b(mo5760d(), cVar.mo5760d()) && Arrays.equals(mo5996l(), ((C1733k) obj).mo5996l()) && mo5767j() == cVar.mo5767j()) {
                int j = mo5767j();
                if (j > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!C1241e.m3513b(mo5764h(i).mo5760d(), cVar.mo5764h(i).mo5760d()) || !C1241e.m3513b(mo5764h(i).mo5766i(), cVar.mo5764h(i).mo5766i())) {
                            break;
                        } else if (i2 >= j) {
                            return true;
                        } else {
                            i = i2;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5762f() {
        C1615c.C1616a.m4533b(this);
        return false;
    }

    /* renamed from: g */
    public List<Annotation> mo5763g(int i) {
        List<Annotation> list = this.f5318f[i];
        return list == null ? C1852m.f5542e : list;
    }

    /* renamed from: h */
    public C1615c mo5764h(int i) {
        return ((C1580b[]) this.f5321i.getValue())[i].mo2491a();
    }

    public int hashCode() {
        return ((Number) this.f5323k.getValue()).intValue();
    }

    /* renamed from: i */
    public C1618e mo5766i() {
        return C1621f.C1622a.f4998a;
    }

    /* renamed from: j */
    public final int mo5767j() {
        return this.f5315c;
    }

    /* renamed from: k */
    public final void mo5995k(String str, boolean z) {
        String[] strArr = this.f5317e;
        int i = this.f5316d + 1;
        this.f5316d = i;
        strArr[i] = str;
        this.f5319g[i] = z;
        this.f5318f[i] = null;
        if (i == this.f5315c - 1) {
            HashMap hashMap = new HashMap();
            int length = this.f5317e.length - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    hashMap.put(this.f5317e[i2], Integer.valueOf(i2));
                    if (i3 > length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f5320h = hashMap;
        }
    }

    /* renamed from: l */
    public final C1615c[] mo5996l() {
        return (C1615c[]) this.f5322j.getValue();
    }

    public String toString() {
        return C1850k.m5051M(C0955a.m2726G(0, this.f5315c), ", ", C1241e.m3522p(this.f5313a, "("), ")", 0, (CharSequence) null, new C1736c(this), 24);
    }
}
