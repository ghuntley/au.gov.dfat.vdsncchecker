package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.C0329z;
import java.util.ArrayList;
import p093p.C1545a;
import p106r0.C1665s;

/* renamed from: androidx.fragment.app.y */
public class C0328y implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1665s f1624e;

    /* renamed from: f */
    public final /* synthetic */ C1545a f1625f;

    /* renamed from: g */
    public final /* synthetic */ Object f1626g;

    /* renamed from: h */
    public final /* synthetic */ C0329z.C0331b f1627h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f1628i;

    /* renamed from: j */
    public final /* synthetic */ View f1629j;

    /* renamed from: k */
    public final /* synthetic */ C0286k f1630k;

    /* renamed from: l */
    public final /* synthetic */ C0286k f1631l;

    /* renamed from: m */
    public final /* synthetic */ boolean f1632m;

    /* renamed from: n */
    public final /* synthetic */ ArrayList f1633n;

    /* renamed from: o */
    public final /* synthetic */ Object f1634o;

    /* renamed from: p */
    public final /* synthetic */ Rect f1635p;

    public C0328y(C1665s sVar, C1545a aVar, Object obj, C0329z.C0331b bVar, ArrayList arrayList, View view, C0286k kVar, C0286k kVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1624e = sVar;
        this.f1625f = aVar;
        this.f1626g = obj;
        this.f1627h = bVar;
        this.f1628i = arrayList;
        this.f1629j = view;
        this.f1630k = kVar;
        this.f1631l = kVar2;
        this.f1632m = z;
        this.f1633n = arrayList2;
        this.f1634o = obj2;
        this.f1635p = rect;
    }

    public void run() {
        C1545a<String, View> e = C0329z.m962e(this.f1624e, this.f1625f, this.f1626g, this.f1627h);
        if (e != null) {
            this.f1628i.addAll(e.values());
            this.f1628i.add(this.f1629j);
        }
        C0329z.m960c(this.f1630k, this.f1631l, this.f1632m, e, false);
        Object obj = this.f1626g;
        if (obj != null) {
            this.f1624e.mo2759x(obj, this.f1633n, this.f1628i);
            View k = C0329z.m968k(e, this.f1627h, this.f1634o, this.f1632m);
            if (k != null) {
                this.f1624e.mo5854j(k, this.f1635p);
            }
        }
    }
}
