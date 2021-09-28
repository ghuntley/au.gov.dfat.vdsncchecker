package p062j4;

import java.io.OutputStream;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: j4.r */
public final class C1126r implements C1132x {

    /* renamed from: e */
    public final OutputStream f3910e;

    /* renamed from: f */
    public final C1104a0 f3911f;

    public C1126r(OutputStream outputStream, C1104a0 a0Var) {
        this.f3910e = outputStream;
        this.f3911f = a0Var;
    }

    /* renamed from: O */
    public void mo15O(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "source");
        C1106b.m3136f(fVar.f3888f, 0, j);
        while (j > 0) {
            this.f3911f.mo4603f();
            C1129u uVar = fVar.f3887e;
            C1241e.m3515e(uVar);
            int min = (int) Math.min(j, (long) (uVar.f3920c - uVar.f3919b));
            this.f3910e.write(uVar.f3918a, uVar.f3919b, min);
            int i = uVar.f3919b + min;
            uVar.f3919b = i;
            long j2 = (long) min;
            j -= j2;
            fVar.f3888f -= j2;
            if (i == uVar.f3920c) {
                fVar.f3887e = uVar.mo4701a();
                C1130v.m3300b(uVar);
            }
        }
    }

    public void close() {
        this.f3910e.close();
    }

    /* renamed from: d */
    public C1104a0 mo2836d() {
        return this.f3911f;
    }

    public void flush() {
        this.f3910e.flush();
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("sink(");
        a.append(this.f3910e);
        a.append(')');
        return a.toString();
    }
}
