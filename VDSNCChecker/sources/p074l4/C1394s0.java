package p074l4;

import java.io.ByteArrayOutputStream;
import p045h.C0990o;

/* renamed from: l4.s0 */
public class C1394s0 extends C1362i {

    /* renamed from: j */
    public final /* synthetic */ int f4438j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1394s0(C1351f fVar) {
        super(fVar);
        this.f4438j = 1;
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        switch (this.f4438j) {
            case 0:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C1380o oVar2 = this.f4392e;
                if (oVar2 != null) {
                    byteArrayOutputStream.write(oVar2.mo5199h("DER"));
                }
                C1371l lVar = this.f4393f;
                if (lVar != null) {
                    byteArrayOutputStream.write(lVar.mo5199h("DER"));
                }
                C1393s sVar = this.f4394g;
                if (sVar != null) {
                    byteArrayOutputStream.write(sVar.mo5199h("DER"));
                }
                byteArrayOutputStream.write(new C1358g1(true, this.f4395h, this.f4396i, 0).mo5199h("DER"));
                oVar.mo4393g(z, 32, 8, byteArrayOutputStream.toByteArray());
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                C1380o oVar3 = this.f4392e;
                if (oVar3 != null) {
                    byteArrayOutputStream2.write(oVar3.mo5199h("DL"));
                }
                C1371l lVar2 = this.f4393f;
                if (lVar2 != null) {
                    byteArrayOutputStream2.write(lVar2.mo5199h("DL"));
                }
                C1393s sVar2 = this.f4394g;
                if (sVar2 != null) {
                    byteArrayOutputStream2.write(sVar2.mo5199h("DL"));
                }
                byteArrayOutputStream2.write(new C1358g1(true, this.f4395h, this.f4396i, 1).mo5199h("DL"));
                oVar.mo4393g(z, 32, 8, byteArrayOutputStream2.toByteArray());
                return;
        }
    }

    /* renamed from: k */
    public int mo5155k() {
        switch (this.f4438j) {
            case 0:
                return mo5198g().length;
            default:
                return mo5198g().length;
        }
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        switch (this.f4438j) {
            case 0:
                return this;
            default:
                return super.mo5159o();
        }
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1394s0(C1380o oVar, C1371l lVar, C1393s sVar, int i, C1393s sVar2, int i2) {
        super(oVar, lVar, sVar, i, sVar2);
        this.f4438j = i2;
        if (i2 != 1) {
        } else {
            super(oVar, lVar, sVar, i, sVar2);
        }
    }
}
