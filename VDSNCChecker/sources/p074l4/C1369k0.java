package p074l4;

import java.io.IOException;

/* renamed from: l4.k0 */
public class C1369k0 implements C1403v {

    /* renamed from: e */
    public final /* synthetic */ int f4405e;

    /* renamed from: f */
    public C1412z f4406f;

    public C1369k0(C1412z zVar, int i) {
        this.f4405e = i;
        if (i != 1) {
            this.f4406f = zVar;
        } else {
            this.f4406f = zVar;
        }
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        switch (this.f4405e) {
            case 0:
                return new C1366j0(this.f4406f.mo5245c());
            default:
                return new C1379n1(this.f4406f.mo5245c());
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        switch (this.f4405e) {
            case 0:
                try {
                    return mo5162a();
                } catch (IOException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            default:
                try {
                    return mo5162a();
                } catch (IOException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
        }
    }
}
