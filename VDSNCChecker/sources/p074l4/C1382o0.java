package p074l4;

import java.io.IOException;

/* renamed from: l4.o0 */
public class C1382o0 implements C1348e, C1389q1 {

    /* renamed from: e */
    public boolean f4420e;

    /* renamed from: f */
    public int f4421f;

    /* renamed from: g */
    public C1412z f4422g;

    public C1382o0(boolean z, int i, C1412z zVar) {
        this.f4420e = z;
        this.f4421f = i;
        this.f4422g = zVar;
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        return this.f4422g.mo5244b(this.f4420e, this.f4421f);
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        try {
            return mo5162a();
        } catch (IOException e) {
            throw new C1390r(e.getMessage());
        }
    }
}
