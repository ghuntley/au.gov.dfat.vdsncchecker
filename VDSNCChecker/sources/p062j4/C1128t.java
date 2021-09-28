package p062j4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p000a.C0001b;
import p059j1.C1087a;
import p068k4.C1211a;
import p072l2.C1241e;

/* renamed from: j4.t */
public final class C1128t implements C1114h {

    /* renamed from: e */
    public final C1112f f3915e = new C1112f();

    /* renamed from: f */
    public boolean f3916f;

    /* renamed from: g */
    public final C1134z f3917g;

    public C1128t(C1134z zVar) {
        this.f3917g = zVar;
    }

    /* renamed from: C */
    public String mo4613C() {
        return mo4653p(Long.MAX_VALUE);
    }

    /* renamed from: D */
    public byte[] mo4614D() {
        this.f3915e.mo4632W(this.f3917g);
        return this.f3915e.mo4614D();
    }

    /* renamed from: E */
    public void mo4615E(long j) {
        if (!mo4658t(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: I */
    public boolean mo4619I() {
        if (!this.f3916f) {
            return this.f3915e.mo4619I() && this.f3917g.mo21o(this.f3915e, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: M */
    public byte[] mo4623M(long j) {
        if (mo4658t(j)) {
            return this.f3915e.mo4623M(j);
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo4624N() {
        /*
            r5 = this;
            r0 = 1
            r5.mo4615E(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo4658t(r2)
            if (r2 == 0) goto L_0x0062
            j4.f r2 = r5.f3915e
            long r3 = (long) r0
            byte r2 = r2.mo4660u(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            p042g2.C0955a.m2729c(r3)
            p042g2.C0955a.m2729c(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p072l2.C1241e.m3516f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            j4.f r0 = r5.f3915e
            long r0 = r0.mo4624N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1128t.mo4624N():long");
    }

    /* renamed from: P */
    public byte mo4625P() {
        mo4615E(1);
        return this.f3915e.mo4625P();
    }

    /* renamed from: a */
    public long mo4696a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f3916f) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long v = this.f3915e.mo4661v(b, j, j2);
                    if (v != -1) {
                        return v;
                    }
                    C1112f fVar = this.f3915e;
                    long j3 = fVar.f3888f;
                    if (j3 >= j2 || this.f3917g.mo21o(fVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, j3);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public C1112f mo4637b() {
        return this.f3915e;
    }

    /* renamed from: c */
    public int mo4697c() {
        mo4615E(4);
        int w = this.f3915e.mo4662w();
        return ((w & 255) << 24) | ((-16777216 & w) >>> 24) | ((16711680 & w) >>> 8) | ((65280 & w) << 8);
    }

    public void close() {
        if (!this.f3916f) {
            this.f3916f = true;
            this.f3917g.close();
            C1112f fVar = this.f3915e;
            fVar.mo4654q(fVar.f3888f);
        }
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return this.f3917g.mo2835d();
    }

    public boolean isOpen() {
        return !this.f3916f;
    }

    /* renamed from: m */
    public C1115i mo4651m(long j) {
        if (mo4658t(j)) {
            return this.f3915e.mo4651m(j);
        }
        throw new EOFException();
    }

    /* renamed from: o */
    public long mo21o(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
        } else if (!this.f3916f) {
            C1112f fVar2 = this.f3915e;
            if (fVar2.f3888f == 0 && this.f3917g.mo21o(fVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f3915e.mo21o(fVar, Math.min(j, this.f3915e.f3888f));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: p */
    public String mo4653p(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo4696a(b, 0, j2);
            if (a != -1) {
                return C1211a.m3457a(this.f3915e, a);
            }
            if (j2 < Long.MAX_VALUE && mo4658t(j2) && this.f3915e.mo4660u(j2 - 1) == ((byte) 13) && mo4658t(1 + j2) && this.f3915e.mo4660u(j2) == b) {
                return C1211a.m3457a(this.f3915e, j2);
            }
            C1112f fVar = new C1112f();
            C1112f fVar2 = this.f3915e;
            fVar2.mo4652n(fVar, 0, Math.min((long) 32, fVar2.f3888f));
            StringBuilder a2 = C0001b.m0a("\\n not found: limit=");
            a2.append(Math.min(this.f3915e.f3888f, j));
            a2.append(" content=");
            a2.append(fVar.mo4666z().mo4671d());
            a2.append("…");
            throw new EOFException(a2.toString());
        }
        throw new IllegalArgumentException(C1087a.m3111a("limit < 0: ", j).toString());
    }

    /* renamed from: q */
    public void mo4654q(long j) {
        if (!this.f3916f) {
            while (j > 0) {
                C1112f fVar = this.f3915e;
                if (fVar.f3888f == 0 && this.f3917g.mo21o(fVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f3915e.f3888f);
                this.f3915e.mo4654q(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: r */
    public short mo4655r() {
        mo4615E(2);
        return this.f3915e.mo4655r();
    }

    public int read(ByteBuffer byteBuffer) {
        C1241e.m3517j(byteBuffer, "sink");
        C1112f fVar = this.f3915e;
        if (fVar.f3888f == 0 && this.f3917g.mo21o(fVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f3915e.read(byteBuffer);
    }

    /* renamed from: t */
    public boolean mo4658t(long j) {
        C1112f fVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
        } else if (!this.f3916f) {
            do {
                fVar = this.f3915e;
                if (fVar.f3888f >= j) {
                    return true;
                }
            } while (this.f3917g.mo21o(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("buffer(");
        a.append(this.f3917g);
        a.append(')');
        return a.toString();
    }

    /* renamed from: w */
    public int mo4662w() {
        mo4615E(4);
        return this.f3915e.mo4662w();
    }

    /* renamed from: y */
    public long mo4665y(C1132x xVar) {
        long j = 0;
        while (this.f3917g.mo21o(this.f3915e, (long) 8192) != -1) {
            long l = this.f3915e.mo4650l();
            if (l > 0) {
                j += l;
                ((C1112f) xVar).mo15O(this.f3915e, l);
            }
        }
        C1112f fVar = this.f3915e;
        long j2 = fVar.f3888f;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        ((C1112f) xVar).mo15O(fVar, j2);
        return j3;
    }
}
