package p074l4;

import p045h.C0990o;

/* renamed from: l4.i0 */
public class C1363i0 extends C1396t {

    /* renamed from: h */
    public final /* synthetic */ int f4397h = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1363i0(int r6, p074l4.C1351f r7) {
        /*
            r5 = this;
            r0 = 0
            r5.f4397h = r0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = r0
        L_0x0009:
            int r3 = r7.f4375b
            if (r2 == r3) goto L_0x0037
            l4.e r3 = r7.mo5174c(r2)     // Catch:{ IOException -> 0x001f }
            l4.n r3 = (p074l4.C1377n) r3     // Catch:{ IOException -> 0x001f }
            java.lang.String r4 = "BER"
            byte[] r3 = r3.mo5199h(r4)     // Catch:{ IOException -> 0x001f }
            r1.write(r3)     // Catch:{ IOException -> 0x001f }
            int r2 = r2 + 1
            goto L_0x0009
        L_0x001f:
            r6 = move-exception
            l4.r r7 = new l4.r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "malformed object: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r7.<init>(r1, r6, r0)
            throw r7
        L_0x0037:
            byte[] r7 = r1.toByteArray()
            r0 = 1
            r5.<init>(r0, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1363i0.<init>(int, l4.f):void");
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        int i = 224;
        switch (this.f4397h) {
            case 0:
                if (!this.f4441e) {
                    i = 192;
                }
                oVar.mo4395i(z, i, this.f4442f, this.f4443g);
                return;
            default:
                if (!this.f4441e) {
                    i = 192;
                }
                oVar.mo4393g(z, i, this.f4442f, this.f4443g);
                return;
        }
    }

    public C1363i0(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }
}
