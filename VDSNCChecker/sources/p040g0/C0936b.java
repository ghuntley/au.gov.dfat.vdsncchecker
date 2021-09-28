package p040g0;

import p010b0.C0533b;
import p016c0.C0560d;

/* renamed from: g0.b */
public class C0936b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C0949m f3487e;

    /* renamed from: f */
    public final /* synthetic */ int f3488f;

    public C0936b(C0937c cVar, C0949m mVar, int i) {
        this.f3487e = mVar;
        this.f3488f = i;
    }

    public void run() {
        C0949m mVar = this.f3487e;
        int i = this.f3488f;
        C0533b.C0534a aVar = ((C0560d.C0561a) mVar).f2365a;
        if (aVar != null) {
            aVar.mo759d(i);
        }
    }
}
