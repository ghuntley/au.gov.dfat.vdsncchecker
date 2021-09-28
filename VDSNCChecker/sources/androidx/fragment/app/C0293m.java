package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0329z;
import p034f0.C0885a;

/* renamed from: androidx.fragment.app.m */
public class C0293m implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1497a;

    /* renamed from: b */
    public final /* synthetic */ C0286k f1498b;

    /* renamed from: c */
    public final /* synthetic */ C0329z.C0330a f1499c;

    /* renamed from: d */
    public final /* synthetic */ C0885a f1500d;

    /* renamed from: androidx.fragment.app.m$a */
    public class C0294a implements Runnable {
        public C0294a() {
        }

        public void run() {
            if (C0293m.this.f1498b.mo1618g() != null) {
                C0293m.this.f1498b.mo1614e0((View) null);
                C0293m mVar = C0293m.this;
                ((C0302r.C0306d) mVar.f1499c).mo1737a(mVar.f1498b, mVar.f1500d);
            }
        }
    }

    public C0293m(ViewGroup viewGroup, C0286k kVar, C0329z.C0330a aVar, C0885a aVar2) {
        this.f1497a = viewGroup;
        this.f1498b = kVar;
        this.f1499c = aVar;
        this.f1500d = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1497a.post(new C0294a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
