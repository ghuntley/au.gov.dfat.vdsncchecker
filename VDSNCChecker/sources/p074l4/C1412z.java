package p074l4;

import java.io.IOException;
import java.io.InputStream;
import p000a.C0001b;
import p130v0.C1964a;

/* renamed from: l4.z */
public class C1412z {

    /* renamed from: a */
    public final InputStream f4461a;

    /* renamed from: b */
    public final int f4462b;

    /* renamed from: c */
    public final byte[][] f4463c = new byte[11][];

    public C1412z(InputStream inputStream) {
        int c = C1405v1.m4031c(inputStream);
        this.f4461a = inputStream;
        this.f4462b = c;
    }

    public C1412z(InputStream inputStream, int i) {
        this.f4461a = inputStream;
        this.f4462b = i;
    }

    /* renamed from: a */
    public C1348e mo5243a() {
        int read = this.f4461a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.f4461a;
        if (inputStream instanceof C1392r1) {
            C1392r1 r1Var = (C1392r1) inputStream;
            r1Var.f4437j = false;
            r1Var.mo5219c();
        }
        int k = C1368k.m3901k(this.f4461a, read);
        boolean z = (read & 32) != 0;
        int h = C1368k.m3900h(this.f4461a, this.f4462b, k == 4 || k == 16 || k == 17 || k == 8);
        if (h >= 0) {
            C1386p1 p1Var = new C1386p1(this.f4461a, h, this.f4462b);
            if ((read & 192) == 192) {
                return new C1363i0(z, k, p1Var.mo5214c());
            }
            if ((read & 64) != 0) {
                return new C1346d0(z, k, p1Var.mo5214c());
            }
            if ((read & 128) != 0) {
                return new C1382o0(z, k, new C1412z(p1Var));
            }
            if (z) {
                if (k == 4) {
                    return new C1360h0(new C1412z(p1Var));
                }
                if (k == 8) {
                    return new C1397t0(new C1412z(p1Var));
                }
                if (k == 16) {
                    return new C1369k0(new C1412z(p1Var), 1);
                }
                if (k == 17) {
                    return new C1375m0(new C1412z(p1Var), 1);
                }
                throw new IOException(C1964a.m5271a("unknown tag ", k, " encountered"));
            } else if (k == 4) {
                return new C1360h0(p1Var);
            } else {
                try {
                    return C1368k.m3898c(k, p1Var, this.f4463c);
                } catch (IllegalArgumentException e) {
                    throw new C1359h("corrupted stream detected", e);
                }
            }
        } else if (z) {
            C1412z zVar = new C1412z(new C1392r1(this.f4461a, this.f4462b), this.f4462b);
            if ((read & 192) == 192) {
                return new C1349e0(k, zVar, 1);
            }
            if ((read & 64) != 0) {
                return new C1349e0(k, zVar, 0);
            }
            if ((read & 128) != 0) {
                return new C1382o0(true, k, zVar);
            }
            if (k == 4) {
                return new C1360h0(zVar);
            }
            if (k == 8) {
                return new C1397t0(zVar);
            }
            if (k == 16) {
                return new C1369k0(zVar, 0);
            }
            if (k == 17) {
                return new C1375m0(zVar, 0);
            }
            StringBuilder a = C0001b.m0a("unknown BER object encountered: 0x");
            a.append(Integer.toHexString(k));
            throw new C1359h(a.toString());
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: b */
    public C1393s mo5244b(boolean z, int i) {
        if (!z) {
            return new C1358g1(false, i, new C1338a1(((C1386p1) this.f4461a).mo5214c()), 1);
        }
        C1351f c = mo5245c();
        if (this.f4461a instanceof C1392r1) {
            int i2 = c.f4375b;
            if (i2 == 1) {
                return new C1378n0(true, i, c.mo5174c(0));
            }
            C1366j0 j0Var = C1352f0.f4377a;
            return new C1378n0(false, i, i2 < 1 ? C1352f0.f4377a : new C1366j0(c));
        }
        int i3 = c.f4375b;
        if (i3 == 1) {
            return new C1358g1(true, i, c.mo5174c(0), 1);
        }
        C1399u uVar = C1376m1.f4412a;
        return new C1358g1(false, i, i3 < 1 ? C1376m1.f4412a : new C1379n1(c), 1);
    }

    /* renamed from: c */
    public C1351f mo5245c() {
        C1348e a = mo5243a();
        if (a == null) {
            return new C1351f(0);
        }
        C1351f fVar = new C1351f(10);
        do {
            fVar.mo5173a(a instanceof C1389q1 ? ((C1389q1) a).mo5162a() : a.mo5171c());
            a = mo5243a();
        } while (a != null);
        return fVar;
    }
}
