package p062j4;

import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.io.IOException;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: j4.d */
public final class C1110d implements C1132x {

    /* renamed from: e */
    public final /* synthetic */ C1107c f3883e;

    /* renamed from: f */
    public final /* synthetic */ C1132x f3884f;

    public C1110d(C1107c cVar, C1132x xVar) {
        this.f3883e = cVar;
        this.f3884f = xVar;
    }

    /* renamed from: O */
    public void mo15O(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "source");
        C1106b.m3136f(fVar.f3888f, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C1129u uVar = fVar.f3887e;
                while (true) {
                    C1241e.m3515e(uVar);
                    if (j2 >= ((long) EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED)) {
                        break;
                    }
                    j2 += (long) (uVar.f3920c - uVar.f3919b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    uVar = uVar.f3923f;
                }
                C1107c cVar = this.f3883e;
                cVar.mo4605h();
                try {
                    this.f3884f.mo15O(fVar, j2);
                    if (!cVar.mo4606i()) {
                        j -= j2;
                    } else {
                        throw cVar.mo4111j((IOException) null);
                    }
                } catch (IOException e) {
                    e = e;
                    if (cVar.mo4606i()) {
                        e = cVar.mo4111j(e);
                    }
                    throw e;
                } finally {
                    boolean i = cVar.mo4606i();
                }
            } else {
                return;
            }
        }
    }

    public void close() {
        C1107c cVar = this.f3883e;
        cVar.mo4605h();
        try {
            this.f3884f.close();
            if (cVar.mo4606i()) {
                throw cVar.mo4111j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (cVar.mo4606i()) {
                e = cVar.mo4111j(e);
            }
            throw e;
        } finally {
            boolean i = cVar.mo4606i();
        }
    }

    /* renamed from: d */
    public C1104a0 mo2836d() {
        return this.f3883e;
    }

    public void flush() {
        C1107c cVar = this.f3883e;
        cVar.mo4605h();
        try {
            this.f3884f.flush();
            if (cVar.mo4606i()) {
                throw cVar.mo4111j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (cVar.mo4606i()) {
                e = cVar.mo4111j(e);
            }
            throw e;
        } finally {
            boolean i = cVar.mo4606i();
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("AsyncTimeout.sink(");
        a.append(this.f3884f);
        a.append(')');
        return a.toString();
    }
}
