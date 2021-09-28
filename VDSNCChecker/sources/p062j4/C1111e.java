package p062j4;

import java.io.IOException;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: j4.e */
public final class C1111e implements C1134z {

    /* renamed from: e */
    public final /* synthetic */ C1107c f3885e;

    /* renamed from: f */
    public final /* synthetic */ C1134z f3886f;

    public C1111e(C1107c cVar, C1134z zVar) {
        this.f3885e = cVar;
        this.f3886f = zVar;
    }

    public void close() {
        C1107c cVar = this.f3885e;
        cVar.mo4605h();
        try {
            this.f3886f.close();
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
    public C1104a0 mo2835d() {
        return this.f3885e;
    }

    /* renamed from: o */
    public long mo21o(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "sink");
        C1107c cVar = this.f3885e;
        cVar.mo4605h();
        try {
            long o = this.f3886f.mo21o(fVar, j);
            if (!cVar.mo4606i()) {
                return o;
            }
            throw cVar.mo4111j((IOException) null);
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
        StringBuilder a = C0001b.m0a("AsyncTimeout.source(");
        a.append(this.f3886f);
        a.append(')');
        return a.toString();
    }
}
