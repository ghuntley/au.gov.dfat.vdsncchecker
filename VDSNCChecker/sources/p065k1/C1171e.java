package p065k1;

import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import p007au.gov.dfat.vdsncchecker.p008ui.VdsActivity;
import p072l2.C1241e;
import p118t0.C1773g;

/* renamed from: k1.e */
public final /* synthetic */ class C1171e implements C0346d {

    /* renamed from: e */
    public final /* synthetic */ int f4034e = 1;

    /* renamed from: f */
    public final /* synthetic */ Object f4035f;

    public /* synthetic */ C1171e(VdsActivity vdsActivity) {
        this.f4035f = vdsActivity;
    }

    public /* synthetic */ C1171e(C1172f fVar) {
        this.f4035f = fVar;
    }

    /* renamed from: g */
    public final void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        switch (this.f4034e) {
            case 0:
                C1172f fVar = (C1172f) this.f4035f;
                C1241e.m3517j(fVar, "this$0");
                C1241e.m3517j(gVar, "$noName_0");
                C1241e.m3517j(bVar, "event");
                if (bVar == C0342c.C0344b.ON_STOP && !fVar.f4038u) {
                    fVar.finish();
                    return;
                }
                return;
            default:
                VdsActivity vdsActivity = (VdsActivity) this.f4035f;
                int i = VdsActivity.f2269t;
                C1241e.m3517j(vdsActivity, "this$0");
                C1241e.m3517j(gVar, "$noName_0");
                C1241e.m3517j(bVar, "event");
                if (bVar == C0342c.C0344b.ON_STOP) {
                    vdsActivity.finish();
                    return;
                }
                return;
        }
    }
}
