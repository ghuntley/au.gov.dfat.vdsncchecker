package p074l4;

import java.io.InputStream;

/* renamed from: l4.u1 */
public abstract class C1402u1 extends InputStream {

    /* renamed from: e */
    public final InputStream f4450e;

    /* renamed from: f */
    public int f4451f;

    public C1402u1(InputStream inputStream, int i) {
        this.f4450e = inputStream;
        this.f4451f = i;
    }

    /* renamed from: a */
    public void mo5236a(boolean z) {
        InputStream inputStream = this.f4450e;
        if (inputStream instanceof C1392r1) {
            C1392r1 r1Var = (C1392r1) inputStream;
            r1Var.f4437j = z;
            r1Var.mo5219c();
        }
    }
}
