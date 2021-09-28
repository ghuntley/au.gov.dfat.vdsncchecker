package p073l3;

import p138w2.C2043d;
import p138w2.C2046f;
import p148y2.C2136d;

/* renamed from: l3.v */
public final class C1322v {

    /* renamed from: a */
    public static final boolean f4331a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals("") != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = p073l3.C1320u.m3719w(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            f4331a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1322v.<clinit>():void");
    }

    /* renamed from: a */
    public static final C1296k1<?> m3723a(C2043d<?> dVar, C2046f fVar, Object obj) {
        C1296k1<?> k1Var = null;
        if (!(dVar instanceof C2136d)) {
            return null;
        }
        if (!(fVar.get(C1299l1.f4308e) != null)) {
            return null;
        }
        C2136d dVar2 = (C2136d) dVar;
        while (true) {
            if (!(dVar2 instanceof C1272d0) && (dVar2 = dVar2.mo5040e()) != null) {
                if (dVar2 instanceof C1296k1) {
                    k1Var = (C1296k1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (k1Var != null) {
            k1Var.f4303g = fVar;
            k1Var.f4304h = obj;
        }
        return k1Var;
    }
}
