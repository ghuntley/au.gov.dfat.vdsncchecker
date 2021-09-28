package p067k3;

import java.util.List;
import p019c3.C0640p;
import p025d3.C0806j;
import p120t2.C1791e;

/* renamed from: k3.j */
public final class C1207j extends C0806j implements C0640p<CharSequence, Integer, C1791e<? extends Integer, ? extends Integer>> {

    /* renamed from: f */
    public final /* synthetic */ List f4112f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4113g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1207j(List list, boolean z) {
        super(2);
        this.f4112f = list;
        this.f4113g = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo2829k(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$receiver"
            p072l2.C1241e.m3517j(r14, r0)
            java.util.List r6 = r13.f4112f
            boolean r7 = r13.f4113g
            r0 = 0
            r8 = 0
            if (r7 != 0) goto L_0x0056
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x0056
            java.lang.String r1 = "$this$single"
            p072l2.C1241e.m3517j(r6, r1)
            p072l2.C1241e.m3517j(r6, r1)
            int r1 = r6.size()
            if (r1 == 0) goto L_0x004e
            if (r1 != r2) goto L_0x0046
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = p067k3.C1209l.m3445Z(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x003b
            goto L_0x00e4
        L_0x003b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            t2.e r15 = new t2.e
            r15.<init>(r14, r1)
            goto L_0x00e5
        L_0x0046:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x004e:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x0056:
            if (r15 >= 0) goto L_0x0059
            r15 = r0
        L_0x0059:
            h3.c r0 = new h3.c
            int r1 = r14.length()
            r0.<init>(r15, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x00a6
            int r9 = r0.f3729f
            int r10 = r0.f3730g
            if (r10 < 0) goto L_0x006f
            if (r15 > r9) goto L_0x00e4
            goto L_0x0071
        L_0x006f:
            if (r15 < r9) goto L_0x00e4
        L_0x0071:
            java.util.Iterator r11 = r6.iterator()
        L_0x0075:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r15
            r5 = r7
            boolean r0 = p067k3.C1205h.m3429M(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0075
            goto L_0x0094
        L_0x0093:
            r12 = r8
        L_0x0094:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00a2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            t2.e r15 = new t2.e
            r15.<init>(r14, r12)
            goto L_0x00e5
        L_0x00a2:
            if (r15 == r9) goto L_0x00e4
            int r15 = r15 + r10
            goto L_0x0071
        L_0x00a6:
            int r9 = r0.f3729f
            int r10 = r0.f3730g
            if (r10 < 0) goto L_0x00af
            if (r15 > r9) goto L_0x00e4
            goto L_0x00b1
        L_0x00af:
            if (r15 < r9) goto L_0x00e4
        L_0x00b1:
            java.util.Iterator r11 = r6.iterator()
        L_0x00b5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = p067k3.C1209l.m3449d0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00b5
            goto L_0x00d2
        L_0x00d1:
            r12 = r8
        L_0x00d2:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00e0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            t2.e r15 = new t2.e
            r15.<init>(r14, r12)
            goto L_0x00e5
        L_0x00e0:
            if (r15 == r9) goto L_0x00e4
            int r15 = r15 + r10
            goto L_0x00b1
        L_0x00e4:
            r15 = r8
        L_0x00e5:
            if (r15 == 0) goto L_0x00fa
            A r14 = r15.f5439e
            B r15 = r15.f5440f
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            t2.e r8 = new t2.e
            r8.<init>(r14, r15)
        L_0x00fa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p067k3.C1207j.mo2829k(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
