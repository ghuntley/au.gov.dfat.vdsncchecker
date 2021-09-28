package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0273c;
import p034f0.C0885a;

/* renamed from: androidx.fragment.app.f */
public class C0281f implements C0885a.C0886a {

    /* renamed from: a */
    public final /* synthetic */ View f1419a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1420b;

    /* renamed from: c */
    public final /* synthetic */ C0273c.C0275b f1421c;

    public C0281f(C0273c cVar, View view, ViewGroup viewGroup, C0273c.C0275b bVar) {
        this.f1419a = view;
        this.f1420b = viewGroup;
        this.f1421c = bVar;
    }

    /* renamed from: a */
    public void mo1559a() {
        this.f1419a.clearAnimation();
        this.f1420b.endViewTransition(this.f1419a);
        this.f1421c.mo1570a();
    }
}
