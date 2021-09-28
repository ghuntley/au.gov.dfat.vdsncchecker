package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import androidx.lifecycle.C0347e;
import java.util.ArrayDeque;
import java.util.Iterator;
import p015c.C0552a;
import p015c.C0555d;
import p118t0.C1773g;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f166a;

    /* renamed from: b */
    public final ArrayDeque<C0555d> f167b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C0346d, C0552a {

        /* renamed from: e */
        public final C0342c f168e;

        /* renamed from: f */
        public final C0555d f169f;

        /* renamed from: g */
        public C0552a f170g;

        public LifecycleOnBackPressedCancellable(C0342c cVar, C0555d dVar) {
            this.f168e = cVar;
            this.f169f = dVar;
            cVar.mo1802a(this);
        }

        public void cancel() {
            C0347e eVar = (C0347e) this.f168e;
            eVar.mo1806d("removeObserver");
            eVar.f1688a.mo5284e(this);
            this.f169f.f2357b.remove(this);
            C0552a aVar = this.f170g;
            if (aVar != null) {
                aVar.cancel();
                this.f170g = null;
            }
        }

        /* renamed from: g */
        public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
            if (bVar == C0342c.C0344b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C0555d dVar = this.f169f;
                onBackPressedDispatcher.f167b.add(dVar);
                C0050a aVar = new C0050a(dVar);
                dVar.f2357b.add(aVar);
                this.f170g = aVar;
            } else if (bVar == C0342c.C0344b.ON_STOP) {
                C0552a aVar2 = this.f170g;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == C0342c.C0344b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0050a implements C0552a {

        /* renamed from: e */
        public final C0555d f172e;

        public C0050a(C0555d dVar) {
            this.f172e = dVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f167b.remove(this.f172e);
            this.f172e.f2357b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f166a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo139a(C1773g gVar, C0555d dVar) {
        C0342c c = gVar.mo113c();
        if (((C0347e) c).f1689b != C0342c.C0345c.DESTROYED) {
            dVar.f2357b.add(new LifecycleOnBackPressedCancellable(c, dVar));
        }
    }

    /* renamed from: b */
    public void mo140b() {
        Iterator<C0555d> descendingIterator = this.f167b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0555d next = descendingIterator.next();
            if (next.f2356a) {
                next.mo1736a();
                return;
            }
        }
        Runnable runnable = this.f166a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
