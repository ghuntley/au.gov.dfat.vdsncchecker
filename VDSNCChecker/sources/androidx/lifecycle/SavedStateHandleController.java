package androidx.lifecycle;

import androidx.lifecycle.C0342c;
import androidx.savedstate.C0483a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p002a1.C0007b;
import p118t0.C1773g;
import p118t0.C1778l;
import p118t0.C1779m;
import p118t0.C1784r;
import p118t0.C1785s;

public final class SavedStateHandleController implements C0346d {

    /* renamed from: e */
    public final String f1667e;

    /* renamed from: f */
    public boolean f1668f;

    /* renamed from: g */
    public final C1778l f1669g;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0336a implements C0483a.C0484a {
        /* renamed from: a */
        public void mo1795a(C0007b bVar) {
            if (bVar instanceof C1785s) {
                C1784r j = ((C1785s) bVar).mo116j();
                C0483a e = bVar.mo3e();
                Objects.requireNonNull(j);
                Iterator it = new HashSet(j.f5419a.keySet()).iterator();
                while (it.hasNext()) {
                    HashMap<String, C1779m> hashMap = j.f5419a;
                    C0342c c = bVar.mo113c();
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).mo6062a("androidx.lifecycle.savedstate.vm.tag");
                    if (savedStateHandleController != null && !savedStateHandleController.f1668f) {
                        savedStateHandleController.mo1794h(e, c);
                        SavedStateHandleController.m997i(e, c);
                    }
                }
                if (!new HashSet(j.f5419a.keySet()).isEmpty()) {
                    e.mo2453c(C0336a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: i */
    public static void m997i(final C0483a aVar, final C0342c cVar) {
        C0342c.C0345c cVar2 = ((C0347e) cVar).f1689b;
        if (cVar2 != C0342c.C0345c.INITIALIZED) {
            if (!(cVar2.compareTo(C0342c.C0345c.STARTED) >= 0)) {
                cVar.mo1802a(new C0346d() {
                    /* renamed from: g */
                    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
                        if (bVar == C0342c.C0344b.ON_START) {
                            C0347e eVar = (C0347e) C0342c.this;
                            eVar.mo1806d("removeObserver");
                            eVar.f1688a.mo5284e(this);
                            aVar.mo2453c(C0336a.class);
                        }
                    }
                });
                return;
            }
        }
        aVar.mo2453c(C0336a.class);
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        if (bVar == C0342c.C0344b.ON_DESTROY) {
            this.f1668f = false;
            C0347e eVar = (C0347e) gVar.mo113c();
            eVar.mo1806d("removeObserver");
            eVar.f1688a.mo5284e(this);
        }
    }

    /* renamed from: h */
    public void mo1794h(C0483a aVar, C0342c cVar) {
        if (!this.f1668f) {
            this.f1668f = true;
            cVar.mo1802a(this);
            aVar.mo2452b(this.f1667e, this.f1669g.f5412a);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
