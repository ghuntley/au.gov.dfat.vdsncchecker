package androidx.savedstate;

import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import p118t0.C1773g;

public class SavedStateRegistry$1 implements C0346d {

    /* renamed from: e */
    public final /* synthetic */ C0483a f2228e;

    public SavedStateRegistry$1(C0483a aVar) {
        this.f2228e = aVar;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        C0483a aVar;
        boolean z;
        if (bVar == C0342c.C0344b.ON_START) {
            aVar = this.f2228e;
            z = true;
        } else if (bVar == C0342c.C0344b.ON_STOP) {
            aVar = this.f2228e;
            z = false;
        } else {
            return;
        }
        aVar.f2233e = z;
    }
}
