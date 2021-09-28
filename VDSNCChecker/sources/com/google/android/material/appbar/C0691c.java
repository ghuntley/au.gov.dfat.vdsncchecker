package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p064k0.C1158d;

/* renamed from: com.google.android.material.appbar.c */
public class C0691c implements C1158d {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f2568a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2569b;

    public C0691c(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f2568a = appBarLayout;
        this.f2569b = z;
    }

    /* renamed from: a */
    public boolean mo3169a(View view, C1158d.C1159a aVar) {
        this.f2568a.setExpanded(this.f2569b);
        return true;
    }
}
