package p062j4;

import java.nio.ByteBuffer;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: j4.s */
public final class C1127s implements C1113g {

    /* renamed from: e */
    public final C1112f f3912e = new C1112f();

    /* renamed from: f */
    public boolean f3913f;

    /* renamed from: g */
    public final C1132x f3914g;

    public C1127s(C1132x xVar) {
        this.f3914g = xVar;
    }

    /* renamed from: B */
    public C1113g mo4612B(C1115i iVar) {
        C1241e.m3517j(iVar, "byteString");
        if (!this.f3913f) {
            this.f3912e.mo4629T(iVar);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: G */
    public C1113g mo4617G(String str) {
        C1241e.m3517j(str, "string");
        if (!this.f3913f) {
            this.f3912e.mo4639c0(str);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: H */
    public C1113g mo4618H(long j) {
        if (!this.f3913f) {
            this.f3912e.mo4618H(j);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: L */
    public C1113g mo4622L(int i) {
        if (!this.f3913f) {
            this.f3912e.mo4633X(i);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: O */
    public void mo15O(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "source");
        if (!this.f3913f) {
            this.f3912e.mo15O(fVar, j);
            mo4692a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C1113g mo4692a() {
        if (!this.f3913f) {
            long l = this.f3912e.mo4650l();
            if (l > 0) {
                this.f3914g.mo15O(this.f3912e, l);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public C1112f mo4637b() {
        return this.f3912e;
    }

    public void close() {
        if (!this.f3913f) {
            Throwable th = null;
            try {
                C1112f fVar = this.f3912e;
                long j = fVar.f3888f;
                if (j > 0) {
                    this.f3914g.mo15O(fVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3914g.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f3913f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public C1104a0 mo2836d() {
        return this.f3914g.mo2836d();
    }

    /* renamed from: e */
    public C1113g mo4642e(byte[] bArr) {
        C1241e.m3517j(bArr, "source");
        if (!this.f3913f) {
            this.f3912e.mo4630U(bArr);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: f */
    public C1113g mo4645f(byte[] bArr, int i, int i2) {
        C1241e.m3517j(bArr, "source");
        if (!this.f3913f) {
            this.f3912e.mo4631V(bArr, i, i2);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f3913f) {
            C1112f fVar = this.f3912e;
            long j = fVar.f3888f;
            if (j > 0) {
                this.f3914g.mo15O(fVar, j);
            }
            this.f3914g.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f3913f;
    }

    /* renamed from: j */
    public C1113g mo4648j(long j) {
        if (!this.f3913f) {
            this.f3912e.mo4648j(j);
            return mo4692a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: s */
    public C1113g mo4657s(int i) {
        if (!this.f3913f) {
            this.f3912e.mo4638b0(i);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("buffer(");
        a.append(this.f3914g);
        a.append(')');
        return a.toString();
    }

    public int write(ByteBuffer byteBuffer) {
        C1241e.m3517j(byteBuffer, "source");
        if (!this.f3913f) {
            int write = this.f3912e.write(byteBuffer);
            mo4692a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: x */
    public C1113g mo4664x(int i) {
        if (!this.f3913f) {
            this.f3912e.mo4636a0(i);
            mo4692a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
