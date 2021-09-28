package p062j4;

import java.io.IOException;
import java.io.InputStream;
import p000a.C0001b;
import p059j1.C1087a;
import p072l2.C1241e;

/* renamed from: j4.o */
public final class C1122o implements C1134z {

    /* renamed from: e */
    public final InputStream f3906e;

    /* renamed from: f */
    public final C1104a0 f3907f;

    public C1122o(InputStream inputStream, C1104a0 a0Var) {
        this.f3906e = inputStream;
        this.f3907f = a0Var;
    }

    public void close() {
        this.f3906e.close();
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return this.f3907f;
    }

    /* renamed from: o */
    public long mo21o(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f3907f.mo4603f();
                C1129u S = fVar.mo4628S(1);
                int read = this.f3906e.read(S.f3918a, S.f3920c, (int) Math.min(j, (long) (8192 - S.f3920c)));
                if (read != -1) {
                    S.f3920c += read;
                    long j2 = (long) read;
                    fVar.f3888f += j2;
                    return j2;
                } else if (S.f3919b != S.f3920c) {
                    return -1;
                } else {
                    fVar.f3887e = S.mo4701a();
                    C1130v.m3300b(S);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C1106b.m3137g(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("source(");
        a.append(this.f3906e);
        a.append(')');
        return a.toString();
    }
}
