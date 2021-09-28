package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p064k0.C1158d;

/* renamed from: com.google.android.material.appbar.b */
public class C0690b implements C1158d {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f2563a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f2564b;

    /* renamed from: c */
    public final /* synthetic */ View f2565c;

    /* renamed from: d */
    public final /* synthetic */ int f2566d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2567e;

    public C0690b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f2567e = baseBehavior;
        this.f2563a = coordinatorLayout;
        this.f2564b = appBarLayout;
        this.f2565c = view;
        this.f2566d = i;
    }

    /* renamed from: a */
    public boolean mo3169a(View view, C1158d.C1159a aVar) {
        this.f2567e.mo3151C(this.f2563a, this.f2564b, this.f2565c, this.f2566d, new int[]{0, 0});
        return true;
    }
}
