package p062j4;

import java.util.zip.Inflater;

/* renamed from: j4.n */
public final class C1121n implements C1134z {

    /* renamed from: e */
    public int f3902e;

    /* renamed from: f */
    public boolean f3903f;

    /* renamed from: g */
    public final C1114h f3904g;

    /* renamed from: h */
    public final Inflater f3905h;

    public C1121n(C1114h hVar, Inflater inflater) {
        this.f3904g = hVar;
        this.f3905h = inflater;
    }

    public void close() {
        if (!this.f3903f) {
            this.f3905h.end();
            this.f3903f = true;
            this.f3904g.close();
        }
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return this.f3904g.mo2835d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo21o(p062j4.C1112f r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            p072l2.C1241e.m3517j(r10, r0)
        L_0x0005:
            p072l2.C1241e.m3517j(r10, r0)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L_0x0011
            r5 = r4
            goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            if (r5 == 0) goto L_0x00d3
            boolean r5 = r9.f3903f
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c7
            if (r3 != 0) goto L_0x001d
            goto L_0x0094
        L_0x001d:
            j4.u r3 = r10.mo4628S(r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r3.f3920c     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch:{ DataFormatException -> 0x00c0 }
            long r4 = java.lang.Math.min(r11, r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = (int) r4     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r5 = r9.f3905h     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r5 = r5.needsInput()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 != 0) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            j4.h r5 = r9.f3904g     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r5 = r5.mo4619I()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 == 0) goto L_0x003d
            goto L_0x0056
        L_0x003d:
            j4.h r5 = r9.f3904g     // Catch:{ DataFormatException -> 0x00c0 }
            j4.f r5 = r5.mo4637b()     // Catch:{ DataFormatException -> 0x00c0 }
            j4.u r5 = r5.f3887e     // Catch:{ DataFormatException -> 0x00c0 }
            p072l2.C1241e.m3515e(r5)     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r5.f3920c     // Catch:{ DataFormatException -> 0x00c0 }
            int r7 = r5.f3919b     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6 - r7
            r9.f3902e = r6     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r8 = r9.f3905h     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r5 = r5.f3918a     // Catch:{ DataFormatException -> 0x00c0 }
            r8.setInput(r5, r7, r6)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0056:
            java.util.zip.Inflater r5 = r9.f3905h     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r6 = r3.f3918a     // Catch:{ DataFormatException -> 0x00c0 }
            int r7 = r3.f3920c     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r5.inflate(r6, r7, r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r9.f3902e     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 != 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            java.util.zip.Inflater r6 = r9.f3905h     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6.getRemaining()     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 - r6
            int r6 = r9.f3902e     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6 - r5
            r9.f3902e = r6     // Catch:{ DataFormatException -> 0x00c0 }
            j4.h r6 = r9.f3904g     // Catch:{ DataFormatException -> 0x00c0 }
            long r7 = (long) r5     // Catch:{ DataFormatException -> 0x00c0 }
            r6.mo4654q(r7)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0077:
            if (r4 <= 0) goto L_0x0085
            int r5 = r3.f3920c     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 + r4
            r3.f3920c = r5     // Catch:{ DataFormatException -> 0x00c0 }
            long r5 = r10.f3888f     // Catch:{ DataFormatException -> 0x00c0 }
            long r3 = (long) r4     // Catch:{ DataFormatException -> 0x00c0 }
            long r5 = r5 + r3
            r10.f3888f = r5     // Catch:{ DataFormatException -> 0x00c0 }
            goto L_0x0095
        L_0x0085:
            int r4 = r3.f3919b     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r3.f3920c     // Catch:{ DataFormatException -> 0x00c0 }
            if (r4 != r5) goto L_0x0094
            j4.u r4 = r3.mo4701a()     // Catch:{ DataFormatException -> 0x00c0 }
            r10.f3887e = r4     // Catch:{ DataFormatException -> 0x00c0 }
            p062j4.C1130v.m3300b(r3)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0094:
            r3 = r1
        L_0x0095:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x009a
            return r3
        L_0x009a:
            java.util.zip.Inflater r1 = r9.f3905h
            boolean r1 = r1.finished()
            if (r1 != 0) goto L_0x00bd
            java.util.zip.Inflater r1 = r9.f3905h
            boolean r1 = r1.needsDictionary()
            if (r1 == 0) goto L_0x00ab
            goto L_0x00bd
        L_0x00ab:
            j4.h r1 = r9.f3904g
            boolean r1 = r1.mo4619I()
            if (r1 != 0) goto L_0x00b5
            goto L_0x0005
        L_0x00b5:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x00bd:
            r10 = -1
            return r10
        L_0x00c0:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x00c7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00d3:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = p059j1.C1087a.m3111a(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1121n.mo21o(j4.f, long):long");
    }
}
