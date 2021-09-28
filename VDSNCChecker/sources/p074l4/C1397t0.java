package p074l4;

import java.io.IOException;

/* renamed from: l4.t0 */
public class C1397t0 implements C1348e, C1389q1 {

    /* renamed from: e */
    public C1412z f4444e;

    public C1397t0(C1412z zVar) {
        this.f4444e = zVar;
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        try {
            return new C1394s0(this.f4444e.mo5245c());
        } catch (IllegalArgumentException e) {
            throw new C1359h(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        try {
            return mo5162a();
        } catch (IOException e) {
            throw new C1390r("unable to get DER object", e, 0);
        } catch (IllegalArgumentException e2) {
            throw new C1390r("unable to get DER object", e2, 0);
        }
    }
}
