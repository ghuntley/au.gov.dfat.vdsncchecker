package p106r0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import p039g.C0933a;

/* renamed from: r0.i */
public abstract class C1647i<E> extends C1645g {

    /* renamed from: e */
    public final Activity f5042e;

    /* renamed from: f */
    public final Context f5043f;

    /* renamed from: g */
    public final Handler f5044g;

    /* renamed from: h */
    public final C0302r f5045h = new C1650k();

    public C1647i(C1643f fVar) {
        Handler handler = new Handler();
        this.f5042e = fVar;
        C0933a.m2709c(fVar, "context == null");
        this.f5043f = fVar;
        this.f5044g = handler;
    }

    /* renamed from: h */
    public abstract E mo5800h();

    /* renamed from: i */
    public abstract LayoutInflater mo5801i();

    /* renamed from: k */
    public abstract boolean mo5802k(C0286k kVar);

    /* renamed from: l */
    public abstract void mo5803l();
}
