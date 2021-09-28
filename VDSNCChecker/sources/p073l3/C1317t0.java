package p073l3;

import java.util.concurrent.CancellationException;
import p019c3.C0636l;
import p120t2.C1798k;
import p138w2.C2046f;

/* renamed from: l3.t0 */
public interface C1317t0 extends C2046f.C2047a {

    /* renamed from: b */
    public static final /* synthetic */ int f4328b = 0;

    /* renamed from: l3.t0$a */
    public static final class C1318a {
        /* renamed from: a */
        public static /* synthetic */ C1281g0 m3693a(C1317t0 t0Var, boolean z, boolean z2, C0636l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return t0Var.mo5109u(z, z2, lVar);
        }
    }

    /* renamed from: l3.t0$b */
    public static final class C1319b implements C2046f.C2049b<C1317t0> {

        /* renamed from: e */
        public static final /* synthetic */ C1319b f4329e = new C1319b();
    }

    /* renamed from: a */
    boolean mo5011a();

    /* renamed from: c */
    C1286i mo5105c(C1294k kVar);

    boolean isCancelled();

    /* renamed from: k */
    CancellationException mo5107k();

    /* renamed from: n */
    boolean mo5108n();

    /* renamed from: u */
    C1281g0 mo5109u(boolean z, boolean z2, C0636l<? super Throwable, C1798k> lVar);

    /* renamed from: z */
    void mo5110z(CancellationException cancellationException);
}
