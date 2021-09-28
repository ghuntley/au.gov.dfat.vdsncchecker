package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import p118t0.C1773g;

public class Fragment$5 implements C0346d {

    /* renamed from: e */
    public final /* synthetic */ C0286k f1350e;

    public Fragment$5(C0286k kVar) {
        this.f1350e = kVar;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        View view;
        if (bVar == C0342c.C0344b.ON_STOP && (view = this.f1350e.f1441J) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
