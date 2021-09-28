package p127u3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p019c3.C0625a;
import p025d3.C0802f;
import p025d3.C0805i;
import p042g2.C0955a;
import p072l2.C1241e;
import p073l3.C1320u;
import p103q3.C1615c;
import p109r3.C1685b;
import p115s3.C1732j;
import p121t3.C1799a;
import p121t3.C1804e;
import p121t3.C1808i;
import p126u2.C1848i;
import p126u2.C1854o;
import p126u2.C1857r;

/* renamed from: u3.g */
public class C1866g extends C1858a {

    /* renamed from: e */
    public final C1808i f5556e;

    /* renamed from: f */
    public final String f5557f;

    /* renamed from: g */
    public final C1615c f5558g;

    /* renamed from: h */
    public int f5559h;

    /* renamed from: u3.g$a */
    public /* synthetic */ class C1867a extends C0805i implements C0625a<Map<String, ? extends Integer>> {
        public C1867a(C1615c cVar) {
            super(0, cVar, C1864f.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1864f.m5097a((C1615c) this.f3105f);
        }
    }

    public C1866g(C1799a aVar, C1808i iVar, String str, C1615c cVar) {
        super(aVar, iVar, (C0802f) null);
        this.f5556e = iVar;
        this.f5557f = str;
        this.f5558g = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1866g(C1799a aVar, C1808i iVar, String str, C1615c cVar, int i) {
        super(aVar, iVar, (C0802f) null);
        C1241e.m3517j(aVar, "json");
        C1241e.m3517j(iVar, "value");
        this.f5556e = iVar;
        this.f5557f = null;
        this.f5558g = null;
    }

    /* renamed from: C */
    public C1808i mo6368B() {
        return this.f5556e;
    }

    /* renamed from: e */
    public C1685b mo5886e(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        return cVar == this.f5558g ? this : super.mo5886e(cVar);
    }

    /* renamed from: l */
    public void mo5884l(C1615c cVar) {
        Set<String> set;
        C1241e.m3517j(cVar, "descriptor");
        if (!this.f5546d.f5453b) {
            cVar.mo5766i();
            if (!this.f5546d.f5462k) {
                set = C1732j.m4807a(cVar);
            } else {
                Set<String> a = C1732j.m4807a(cVar);
                Map map = (Map) C1320u.m3711o(this.f5545c).mo6374a(cVar, C1864f.f5555a);
                Collection keySet = map == null ? null : map.keySet();
                if (keySet == null) {
                    keySet = C1854o.f5544e;
                }
                C1241e.m3517j(a, "$this$plus");
                Integer valueOf = Integer.valueOf(keySet.size());
                LinkedHashSet linkedHashSet = new LinkedHashSet(C0955a.m2749w(valueOf != null ? a.size() + valueOf.intValue() : a.size() * 2));
                linkedHashSet.addAll(a);
                C1848i.m5047I(linkedHashSet, keySet);
                set = linkedHashSet;
            }
            for (String next : mo6368B().keySet()) {
                if (!set.contains(next) && !C1241e.m3513b(next, this.f5557f)) {
                    String iVar = mo6368B().toString();
                    C1241e.m3517j(next, "key");
                    throw C1320u.m3698b(-1, "Encountered unknown key '" + next + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + C1320u.m3715s(iVar, -1));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (p127u3.C1864f.m5098b(r1, r3, r6) != -3) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0005 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5885n(p103q3.C1615c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "descriptor"
            p072l2.C1241e.m3517j(r8, r0)
        L_0x0005:
            int r0 = r7.f5559h
            int r1 = r8.mo5767j()
            if (r0 >= r1) goto L_0x0077
            int r0 = r7.f5559h
            int r1 = r0 + 1
            r7.f5559h = r1
            java.lang.String r0 = r7.mo6367A(r8, r0)
            t3.i r1 = r7.mo6368B()
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0005
            t3.c r1 = r7.f5546d
            boolean r1 = r1.f5458g
            r2 = 1
            if (r1 == 0) goto L_0x0073
            int r1 = r7.f5559h
            int r1 = r1 - r2
            t3.a r3 = r7.f5545c
            q3.c r1 = r8.mo5764h(r1)
            boolean r4 = r1.mo5762f()
            r5 = 0
            if (r4 != 0) goto L_0x0041
            t3.e r4 = r7.mo6369w(r0)
            boolean r4 = r4 instanceof p121t3.C1807h
            if (r4 == 0) goto L_0x0041
            goto L_0x0070
        L_0x0041:
            q3.e r4 = r1.mo5766i()
            q3.e$b r6 = p103q3.C1618e.C1620b.f4997a
            boolean r4 = p072l2.C1241e.m3513b(r4, r6)
            if (r4 == 0) goto L_0x0071
            t3.e r0 = r7.mo6369w(r0)
            boolean r4 = r0 instanceof p121t3.C1810j
            r6 = 0
            if (r4 == 0) goto L_0x0059
            t3.j r0 = (p121t3.C1810j) r0
            goto L_0x005a
        L_0x0059:
            r0 = r6
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            boolean r4 = r0 instanceof p121t3.C1807h
            if (r4 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.lang.String r6 = r0.mo6116b()
        L_0x0066:
            if (r6 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            int r0 = p127u3.C1864f.m5098b(r1, r3, r6)
            r1 = -3
            if (r0 != r1) goto L_0x0071
        L_0x0070:
            r5 = r2
        L_0x0071:
            if (r5 != 0) goto L_0x0005
        L_0x0073:
            int r8 = r7.f5559h
            int r8 = r8 - r2
            return r8
        L_0x0077:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p127u3.C1866g.mo5885n(q3.c):int");
    }

    /* renamed from: w */
    public C1804e mo6369w(String str) {
        C1241e.m3517j(str, "tag");
        return (C1804e) C1857r.m5060H(mo6368B(), str);
    }

    /* renamed from: y */
    public String mo6371y(C1615c cVar, int i) {
        T t;
        boolean z;
        String a = cVar.mo5757a(i);
        if (!this.f5546d.f5462k || mo6368B().keySet().contains(a)) {
            return a;
        }
        Map map = (Map) C1320u.m3711o(this.f5545c).mo6375b(cVar, C1864f.f5555a, new C1867a(cVar));
        Iterator<T> it = mo6368B().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Integer num = (Integer) map.get((String) t);
            if (num != null && num.intValue() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str = (String) t;
        return str == null ? a : str;
    }
}
