package p062j4;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p059j1.C1087a;
import p072l2.C1241e;

/* renamed from: j4.m */
public final class C1120m implements C1134z {

    /* renamed from: e */
    public byte f3897e;

    /* renamed from: f */
    public final C1128t f3898f;

    /* renamed from: g */
    public final Inflater f3899g;

    /* renamed from: h */
    public final C1121n f3900h;

    /* renamed from: i */
    public final CRC32 f3901i = new CRC32();

    public C1120m(C1134z zVar) {
        C1241e.m3517j(zVar, "source");
        C1128t tVar = new C1128t(zVar);
        this.f3898f = tVar;
        Inflater inflater = new Inflater(true);
        this.f3899g = inflater;
        this.f3900h = new C1121n(tVar, inflater);
    }

    /* renamed from: a */
    public final void mo4686a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C1241e.m3516f(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: c */
    public final void mo4687c(C1112f fVar, long j, long j2) {
        C1129u uVar = fVar.f3887e;
        while (true) {
            C1241e.m3515e(uVar);
            int i = uVar.f3920c;
            int i2 = uVar.f3919b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            uVar = uVar.f3923f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) uVar.f3919b) + j);
            int min = (int) Math.min((long) (uVar.f3920c - i3), j2);
            this.f3901i.update(uVar.f3918a, i3, min);
            j2 -= (long) min;
            uVar = uVar.f3923f;
            C1241e.m3515e(uVar);
            j = 0;
        }
    }

    public void close() {
        this.f3900h.close();
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return this.f3898f.mo2835d();
    }

    /* renamed from: o */
    public long mo21o(C1112f fVar, long j) {
        long j2;
        C1112f fVar2 = fVar;
        long j3 = j;
        C1241e.m3517j(fVar2, "sink");
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f3897e == 0) {
                this.f3898f.mo4615E(10);
                byte u = this.f3898f.f3915e.mo4660u(3);
                boolean z2 = ((u >> 1) & 1) == 1;
                if (z2) {
                    mo4687c(this.f3898f.f3915e, 0, 10);
                }
                C1128t tVar = this.f3898f;
                tVar.mo4615E(2);
                mo4686a("ID1ID2", 8075, tVar.f3915e.mo4655r());
                this.f3898f.mo4654q(8);
                if (((u >> 2) & 1) == 1) {
                    this.f3898f.mo4615E(2);
                    if (z2) {
                        mo4687c(this.f3898f.f3915e, 0, 2);
                    }
                    long A = (long) this.f3898f.f3915e.mo4611A();
                    this.f3898f.mo4615E(A);
                    if (z2) {
                        j2 = A;
                        mo4687c(this.f3898f.f3915e, 0, A);
                    } else {
                        j2 = A;
                    }
                    this.f3898f.mo4654q(j2);
                }
                if (((u >> 3) & 1) == 1) {
                    long a = this.f3898f.mo4696a((byte) 0, 0, Long.MAX_VALUE);
                    if (a != -1) {
                        if (z2) {
                            mo4687c(this.f3898f.f3915e, 0, a + 1);
                        }
                        this.f3898f.mo4654q(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((u >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long a2 = this.f3898f.mo4696a((byte) 0, 0, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z2) {
                            mo4687c(this.f3898f.f3915e, 0, a2 + 1);
                        }
                        this.f3898f.mo4654q(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    C1128t tVar2 = this.f3898f;
                    tVar2.mo4615E(2);
                    mo4686a("FHCRC", tVar2.f3915e.mo4611A(), (short) ((int) this.f3901i.getValue()));
                    this.f3901i.reset();
                }
                this.f3897e = 1;
            }
            if (this.f3897e == 1) {
                long j4 = fVar2.f3888f;
                long o = this.f3900h.mo21o(fVar2, j3);
                if (o != -1) {
                    mo4687c(fVar, j4, o);
                    return o;
                }
                this.f3897e = 2;
            }
            if (this.f3897e == 2) {
                mo4686a("CRC", this.f3898f.mo4697c(), (int) this.f3901i.getValue());
                mo4686a("ISIZE", this.f3898f.mo4697c(), (int) this.f3899g.getBytesWritten());
                this.f3897e = 3;
                if (!this.f3898f.mo4619I()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
