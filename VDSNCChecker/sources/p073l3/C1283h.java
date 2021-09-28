package p073l3;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import p085n3.C1461d;
import p120t2.C1798k;

/* renamed from: l3.h */
public final class C1283h extends C1323v0 {

    /* renamed from: i */
    public final C1277f<?> f4288i;

    public C1283h(C1277f<?> fVar) {
        this.f4288i = fVar;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Object mo2828m(Object obj) {
        mo5056p((Throwable) obj);
        return C1798k.f5446a;
    }

    /* renamed from: p */
    public void mo5056p(Throwable th) {
        C1277f<?> fVar = this.f4288i;
        C1330y0 q = mo5120q();
        Objects.requireNonNull(fVar);
        CancellationException k = q.mo5107k();
        boolean z = false;
        if ((fVar.f4279g == 2) && fVar.mo5050s()) {
            z = ((C1461d) fVar.f4282h).mo5322k(k);
        }
        if (!z) {
            fVar.mo5044m(k);
            fVar.mo5046o();
        }
    }
}
