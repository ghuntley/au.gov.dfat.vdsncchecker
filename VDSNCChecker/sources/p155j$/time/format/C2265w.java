package p155j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p155j$.time.zone.C2317g;

/* renamed from: j$.time.format.w */
final class C2265w extends C2264v {

    /* renamed from: i */
    private static final Map f6474i = new ConcurrentHashMap();

    /* renamed from: e */
    private final C2240H f6475e;

    /* renamed from: f */
    private Set f6476f;

    /* renamed from: g */
    private final Map f6477g = new HashMap();

    /* renamed from: h */
    private final Map f6478h = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2265w(p155j$.time.format.C2240H r3, java.util.Set r4) {
        /*
            r2 = this;
            int r4 = p155j$.time.temporal.C2308x.f6561a
            j$.time.temporal.u r4 = p155j$.time.temporal.C2305u.f6558a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ZoneText("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r4, r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.f6477g = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.f6478h = r4
            java.lang.String r4 = "textStyle"
            java.util.Objects.requireNonNull(r3, r4)
            r2.f6475e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2265w.<init>(j$.time.format.H, java.util.Set):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2258p mo6945a(C2266x xVar) {
        C2258p pVar;
        if (this.f6475e == C2240H.NARROW) {
            return super.mo6945a(xVar);
        }
        Locale i = xVar.mo6953i();
        boolean k = xVar.mo6955k();
        HashSet hashSet = (HashSet) C2317g.m6146a();
        int size = hashSet.size();
        Map map = k ? this.f6477g : this.f6478h;
        Map.Entry entry = (Map.Entry) map.get(i);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (pVar = (C2258p) ((SoftReference) entry.getValue()).get()) == null) {
            pVar = C2258p.m5877f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i).getZoneStrings();
            int length = zoneStrings.length;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (hashSet.contains(str)) {
                    pVar.mo6939a(str, str);
                    String a = C2241I.m5815a(str, i);
                    if (this.f6475e != C2240H.FULL) {
                        i3 = 2;
                    }
                    while (i3 < strArr.length) {
                        pVar.mo6939a(strArr[i3], a);
                        i3 += 2;
                    }
                }
                i2++;
            }
            if (this.f6476f != null) {
                for (String[] strArr2 : zoneStrings) {
                    String str2 = strArr2[0];
                    if (this.f6476f.contains(str2) && hashSet.contains(str2)) {
                        for (int i4 = this.f6475e == C2240H.FULL ? 1 : 2; i4 < strArr2.length; i4 += 2) {
                            pVar.mo6939a(strArr2[i4], str2);
                        }
                    }
                }
            }
            map.put(i, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(pVar)));
        }
        return pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r5 == null) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6898d(p155j$.time.format.C2233A r13, java.lang.StringBuilder r14) {
        /*
            r12 = this;
            int r0 = p155j$.time.temporal.C2308x.f6561a
            j$.time.temporal.q r0 = p155j$.time.temporal.C2301q.f6554a
            java.lang.Object r0 = r13.mo6867f(r0)
            j$.time.ZoneId r0 = (p155j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r2 = r0.mo6833l()
            boolean r3 = r0 instanceof p155j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto L_0x00b4
            j$.time.temporal.l r3 = r13.mo6865d()
            j$.time.temporal.a r5 = p155j$.time.temporal.C2285a.INSTANT_SECONDS
            boolean r5 = r3.mo6790c(r5)
            r6 = 2
            if (r5 == 0) goto L_0x0036
            j$.time.zone.c r0 = r0.mo6834m()
            j$.time.h r3 = p155j$.time.C2270h.m5928n(r3)
            boolean r0 = r0.mo7067h(r3)
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0037
        L_0x0034:
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            java.util.Locale r13 = r13.mo6864c()
            j$.time.format.H r3 = r12.f6475e
            j$.time.format.H r5 = p155j$.time.format.C2240H.NARROW
            r7 = 0
            if (r3 != r5) goto L_0x0043
            goto L_0x00b1
        L_0x0043:
            java.util.Map r3 = f6474i
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r5 = r3.get(r2)
            java.lang.ref.SoftReference r5 = (java.lang.ref.SoftReference) r5
            r8 = 5
            r9 = 3
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r5.get()
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L_0x0062
            java.lang.Object r5 = r7.get(r13)
            java.lang.String[] r5 = (java.lang.String[]) r5
            if (r5 != 0) goto L_0x009c
        L_0x0062:
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r2)
            r10 = 7
            java.lang.String[] r10 = new java.lang.String[r10]
            r10[r1] = r2
            java.lang.String r11 = r5.getDisplayName(r1, r4, r13)
            r10[r4] = r11
            java.lang.String r11 = r5.getDisplayName(r1, r1, r13)
            r10[r6] = r11
            java.lang.String r6 = r5.getDisplayName(r4, r4, r13)
            r10[r9] = r6
            java.lang.String r1 = r5.getDisplayName(r4, r1, r13)
            r5 = 4
            r10[r5] = r1
            r10[r8] = r2
            r1 = 6
            r10[r1] = r2
            if (r7 != 0) goto L_0x0090
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
        L_0x0090:
            r7.put(r13, r10)
            java.lang.ref.SoftReference r13 = new java.lang.ref.SoftReference
            r13.<init>(r7)
            r3.put(r2, r13)
            r5 = r10
        L_0x009c:
            j$.time.format.H r13 = r12.f6475e
            int r13 = r13.mo6894c()
            if (r0 == 0) goto L_0x00ae
            if (r0 == r4) goto L_0x00aa
            int r13 = r13 + r8
            r7 = r5[r13]
            goto L_0x00b1
        L_0x00aa:
            int r13 = r13 + r9
            r7 = r5[r13]
            goto L_0x00b1
        L_0x00ae:
            int r13 = r13 + r4
            r7 = r5[r13]
        L_0x00b1:
            if (r7 == 0) goto L_0x00b4
            r2 = r7
        L_0x00b4:
            r14.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2265w.mo6898d(j$.time.format.A, java.lang.StringBuilder):boolean");
    }
}
