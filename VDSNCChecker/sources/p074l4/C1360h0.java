package p074l4;

import java.io.IOException;
import java.io.InputStream;
import p116s4.C1744a;

/* renamed from: l4.h0 */
public class C1360h0 implements C1387q {

    /* renamed from: e */
    public final /* synthetic */ int f4389e = 1;

    /* renamed from: f */
    public Object f4390f;

    public C1360h0(C1412z zVar) {
        this.f4390f = zVar;
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        switch (this.f4389e) {
            case 0:
                return new C1355g0(C1744a.m4861a(mo5183b()));
            default:
                return new C1338a1(((C1386p1) this.f4390f).mo5214c());
        }
    }

    /* renamed from: b */
    public InputStream mo5183b() {
        switch (this.f4389e) {
            case 0:
                return new C1385p0((C1412z) this.f4390f);
            default:
                return (C1386p1) this.f4390f;
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        switch (this.f4389e) {
            case 0:
                try {
                    return mo5162a();
                } catch (IOException e) {
                    throw new C1390r("IOException converting stream to byte array: " + e.getMessage(), e, 0);
                }
            default:
                try {
                    return mo5162a();
                } catch (IOException e2) {
                    throw new C1390r("IOException converting stream to byte array: " + e2.getMessage(), e2, 0);
                }
        }
    }

    public C1360h0(C1386p1 p1Var) {
        this.f4390f = p1Var;
    }
}
