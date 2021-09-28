package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0329z;
import p034f0.C0885a;

/* renamed from: androidx.fragment.app.n */
public class C0295n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1502a;

    /* renamed from: b */
    public final /* synthetic */ View f1503b;

    /* renamed from: c */
    public final /* synthetic */ C0286k f1504c;

    /* renamed from: d */
    public final /* synthetic */ C0329z.C0330a f1505d;

    /* renamed from: e */
    public final /* synthetic */ C0885a f1506e;

    public C0295n(ViewGroup viewGroup, View view, C0286k kVar, C0329z.C0330a aVar, C0885a aVar2) {
        this.f1502a = viewGroup;
        this.f1503b = view;
        this.f1504c = kVar;
        this.f1505d = aVar;
        this.f1506e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1502a.endViewTransition(this.f1503b);
        C0286k kVar = this.f1504c;
        C0286k.C0288b bVar = kVar.f1444M;
        Animator animator2 = bVar == null ? null : bVar.f1480b;
        kVar.mo1619g0((Animator) null);
        if (animator2 != null && this.f1502a.indexOfChild(this.f1503b) < 0) {
            ((C0302r.C0306d) this.f1505d).mo1737a(this.f1504c, this.f1506e);
        }
    }
}
