package p074l4;

import java.io.IOException;

/* renamed from: l4.e0 */
public class C1349e0 implements C1348e, C1389q1 {

    /* renamed from: e */
    public final /* synthetic */ int f4369e;

    /* renamed from: f */
    public final int f4370f;

    /* renamed from: g */
    public final C1412z f4371g;

    public C1349e0(int i, C1412z zVar, int i2) {
        this.f4369e = i2;
        if (i2 != 1) {
            this.f4370f = i;
            this.f4371g = zVar;
            return;
        }
        this.f4370f = i;
        this.f4371g = zVar;
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        switch (this.f4369e) {
            case 0:
                return new C1346d0(this.f4370f, this.f4371g.mo5245c());
            default:
                return new C1363i0(this.f4370f, this.f4371g.mo5245c());
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        switch (this.f4369e) {
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
