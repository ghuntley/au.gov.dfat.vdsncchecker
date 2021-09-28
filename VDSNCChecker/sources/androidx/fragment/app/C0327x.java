package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import p093p.C1545a;
import p106r0.C1665s;

/* renamed from: androidx.fragment.app.x */
public class C0327x implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C0286k f1617e;

    /* renamed from: f */
    public final /* synthetic */ C0286k f1618f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1619g;

    /* renamed from: h */
    public final /* synthetic */ C1545a f1620h;

    /* renamed from: i */
    public final /* synthetic */ View f1621i;

    /* renamed from: j */
    public final /* synthetic */ C1665s f1622j;

    /* renamed from: k */
    public final /* synthetic */ Rect f1623k;

    public C0327x(C0286k kVar, C0286k kVar2, boolean z, C1545a aVar, View view, C1665s sVar, Rect rect) {
        this.f1617e = kVar;
        this.f1618f = kVar2;
        this.f1619g = z;
        this.f1620h = aVar;
        this.f1621i = view;
        this.f1622j = sVar;
        this.f1623k = rect;
    }

    public void run() {
        C0329z.m960c(this.f1617e, this.f1618f, this.f1619g, this.f1620h, false);
        View view = this.f1621i;
        if (view != null) {
            this.f1622j.mo5854j(view, this.f1623k);
        }
    }
}
