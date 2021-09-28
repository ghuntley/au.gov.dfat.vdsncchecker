package p073l3;

/* renamed from: l3.w0 */
public class C1325w0 extends C1330y0 {

    /* renamed from: f */
    public final boolean f4333f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1325w0(C1317t0 t0Var) {
        super(true);
        C1289j jVar;
        boolean z = true;
        mo5123G(t0Var);
        C1286i B = mo5121B();
        C1289j jVar2 = B instanceof C1289j ? (C1289j) B : null;
        if (jVar2 == null) {
            z = false;
        } else {
            while (true) {
                C1330y0 q = jVar2.mo5120q();
                if (!q.mo5115w()) {
                    C1286i B2 = q.mo5121B();
                    if (B2 instanceof C1289j) {
                        jVar = (C1289j) B2;
                        continue;
                    } else {
                        jVar = null;
                        continue;
                    }
                    if (jVar2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
        }
        this.f4333f = z;
    }

    /* renamed from: w */
    public boolean mo5115w() {
        return this.f4333f;
    }

    /* renamed from: x */
    public boolean mo5116x() {
        return true;
    }
}
