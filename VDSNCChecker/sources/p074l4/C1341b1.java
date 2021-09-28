package p074l4;

import java.io.OutputStream;
import p045h.C0990o;

/* renamed from: l4.b1 */
public class C1341b1 extends C0990o {

    /* renamed from: c */
    public final /* synthetic */ int f4361c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1341b1(OutputStream outputStream, int i) {
        super(outputStream);
        this.f4361c = i;
        if (i != 1) {
        } else {
            super(outputStream);
        }
    }

    /* renamed from: b */
    public C1341b1 mo4388b() {
        switch (this.f4361c) {
            case 0:
                return this;
            default:
                return super.mo4388b();
        }
    }

    /* renamed from: c */
    public C0990o mo4389c() {
        return this;
    }

    /* renamed from: m */
    public void mo4399m(C1393s sVar, boolean z) {
        switch (this.f4361c) {
            case 0:
                sVar.mo5159o().mo5154j(this, z);
                return;
            default:
                sVar.mo5160p().mo5154j(this, z);
                return;
        }
    }
}
