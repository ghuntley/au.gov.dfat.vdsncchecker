package p115s3;

import p055i3.C1035b;
import p097p3.C1580b;

/* renamed from: s3.a */
public abstract class C1722a<T> implements C1580b<T> {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r1 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        r10.mo5884l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        throw new java.lang.IllegalArgumentException(p072l2.C1241e.m3522p("Polymorphic value has not been read for class ", r8).toString());
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo2494d(p109r3.C1687c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "decoder"
            p072l2.C1241e.m3517j(r10, r0)
            q3.c r0 = r9.mo2491a()
            r3.b r10 = r10.mo5886e(r0)
            boolean r1 = r10.mo5880o()     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0032
            q3.c r1 = r9.mo2491a()     // Catch:{ all -> 0x00ab }
            r2 = 0
            java.lang.String r1 = r10.mo5879k(r1, r2)     // Catch:{ all -> 0x00ab }
            p3.a r4 = p073l3.C1320u.m3706j(r9, r10, r1)     // Catch:{ all -> 0x00ab }
            q3.c r2 = r9.mo2491a()     // Catch:{ all -> 0x00ab }
            r3 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            java.lang.Object r1 = r1.mo5874b(r2, r3, r4, null)     // Catch:{ all -> 0x00ab }
            r10.mo5884l(r0)
            return r1
        L_0x0032:
            r1 = 0
            r8 = r1
        L_0x0034:
            q3.c r2 = r9.mo2491a()     // Catch:{ all -> 0x00ab }
            int r3 = r10.mo5885n(r2)     // Catch:{ all -> 0x00ab }
            r2 = -1
            if (r3 == r2) goto L_0x0095
            if (r3 == 0) goto L_0x008c
            r1 = 1
            if (r3 == r1) goto L_0x0069
            p3.d r10 = new p3.d     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "Invalid index in polymorphic deserialization of "
            r0.append(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00ab }
            if (r8 != 0) goto L_0x0056
            java.lang.String r8 = "unknown class"
        L_0x0056:
            r0.append(r8)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "\n Expected 0, 1 or DECODE_DONE(-1), but found "
            r0.append(r1)     // Catch:{ all -> 0x00ab }
            r0.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ab }
            r10.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r10     // Catch:{ all -> 0x00ab }
        L_0x0069:
            if (r8 == 0) goto L_0x0080
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ab }
            p3.a r4 = p073l3.C1320u.m3706j(r9, r10, r1)     // Catch:{ all -> 0x00ab }
            q3.c r2 = r9.mo2491a()     // Catch:{ all -> 0x00ab }
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            java.lang.Object r1 = r1.mo5874b(r2, r3, r4, null)     // Catch:{ all -> 0x00ab }
            goto L_0x0034
        L_0x0080:
            java.lang.String r10 = "Cannot read polymorphic value before its type token"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ab }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ab }
            r0.<init>(r10)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x008c:
            q3.c r2 = r9.mo2491a()     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = r10.mo5879k(r2, r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0034
        L_0x0095:
            if (r1 == 0) goto L_0x009b
            r10.mo5884l(r0)
            return r1
        L_0x009b:
            java.lang.String r10 = "Polymorphic value has not been read for class "
            java.lang.String r10 = p072l2.C1241e.m3522p(r10, r8)     // Catch:{ all -> 0x00ab }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ab }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ab }
            r0.<init>(r10)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p115s3.C1722a.mo2494d(r3.c):java.lang.Object");
    }

    /* renamed from: e */
    public abstract C1035b<T> mo5984e();
}
