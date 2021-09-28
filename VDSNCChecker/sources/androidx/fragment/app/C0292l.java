package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import p034f0.C0885a;

/* renamed from: androidx.fragment.app.l */
public class C0292l implements C0885a.C0886a {

    /* renamed from: a */
    public final /* synthetic */ C0286k f1496a;

    public C0292l(C0286k kVar) {
        this.f1496a = kVar;
    }

    /* renamed from: a */
    public void mo1559a() {
        if (this.f1496a.mo1618g() != null) {
            View g = this.f1496a.mo1618g();
            this.f1496a.mo1614e0((View) null);
            g.clearAnimation();
        }
        this.f1496a.mo1619g0((Animator) null);
    }
}
