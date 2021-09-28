package p074l4;

import java.io.IOException;

/* renamed from: l4.m0 */
public class C1375m0 implements C1410y {

    /* renamed from: e */
    public final /* synthetic */ int f4410e;

    /* renamed from: f */
    public C1412z f4411f;

    public C1375m0(C1412z zVar, int i) {
        this.f4410e = i;
        if (i != 1) {
            this.f4411f = zVar;
        } else {
            this.f4411f = zVar;
        }
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        switch (this.f4410e) {
            case 0:
                return new C1372l0(this.f4411f.mo5245c());
            default:
                return new C1383o1(this.f4411f.mo5245c());
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        switch (this.f4410e) {
            case 0:
                try {
                    return mo5162a();
                } catch (IOException e) {
                    throw new C1390r(e.getMessage(), e, 0);
                }
            default:
                try {
                    return mo5162a();
                } catch (IOException e2) {
                    throw new C1390r(e2.getMessage(), e2, 0);
                }
        }
    }
}
