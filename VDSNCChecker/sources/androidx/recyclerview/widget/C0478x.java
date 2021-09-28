package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C0432a;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
public class C0478x implements C0432a.C0433a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2221a;

    public C0478x(RecyclerView recyclerView) {
        this.f2221a = recyclerView;
    }

    /* renamed from: a */
    public void mo2438a(C0432a.C0434b bVar) {
        int i = bVar.f2067a;
        if (i == 1) {
            RecyclerView recyclerView = this.f2221a;
            recyclerView.f1881p.mo1893e0(recyclerView, bVar.f2068b, bVar.f2070d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f2221a;
            recyclerView2.f1881p.mo1899h0(recyclerView2, bVar.f2068b, bVar.f2070d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f2221a;
            recyclerView3.f1881p.mo1900i0(recyclerView3, bVar.f2068b, bVar.f2070d, bVar.f2069c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f2221a;
            recyclerView4.f1881p.mo1897g0(recyclerView4, bVar.f2068b, bVar.f2070d, 1);
        }
    }

    /* renamed from: b */
    public RecyclerView.C0422z mo2439b(int i) {
        RecyclerView recyclerView = this.f2221a;
        int h = recyclerView.f1867i.mo2347h();
        int i2 = 0;
        RecyclerView.C0422z zVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.C0422z L = RecyclerView.m1204L(recyclerView.f1867i.mo2346g(i2));
            if (L != null && !L.mo2247m() && L.f1993c == i) {
                if (!recyclerView.f1867i.mo2350k(L.f1991a)) {
                    zVar = L;
                    break;
                }
                zVar = L;
            }
            i2++;
        }
        if (zVar != null && !this.f2221a.f1867i.mo2350k(zVar.f1991a)) {
            return zVar;
        }
        return null;
    }

    /* renamed from: c */
    public void mo2440c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2221a;
        int h = recyclerView.f1867i.mo2347h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f1867i.mo2346g(i6);
            RecyclerView.C0422z L = RecyclerView.m1204L(g);
            if (L != null && !L.mo2256u() && (i4 = L.f1993c) >= i && i4 < i5) {
                L.mo2236b(2);
                L.mo2235a(obj);
                ((RecyclerView.C0405m) g.getLayoutParams()).f1937c = true;
            }
        }
        RecyclerView.C0411r rVar = recyclerView.f1861f;
        int size = rVar.f1947c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.C0422z zVar = rVar.f1947c.get(size);
                if (zVar != null && (i3 = zVar.f1993c) >= i && i3 < i5) {
                    zVar.mo2236b(2);
                    rVar.mo2212f(size);
                }
            } else {
                this.f2221a.f1874l0 = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo2441d(int i, int i2) {
        RecyclerView recyclerView = this.f2221a;
        int h = recyclerView.f1867i.mo2347h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.C0422z L = RecyclerView.m1204L(recyclerView.f1867i.mo2346g(i3));
            if (L != null && !L.mo2256u() && L.f1993c >= i) {
                L.mo2251q(i2, false);
                recyclerView.f1866h0.f1974f = true;
            }
        }
        RecyclerView.C0411r rVar = recyclerView.f1861f;
        int size = rVar.f1947c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.C0422z zVar = rVar.f1947c.get(i4);
            if (zVar != null && zVar.f1993c >= i) {
                zVar.mo2251q(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f2221a.f1872k0 = true;
    }

    /* renamed from: e */
    public void mo2442e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2221a;
        int h = recyclerView.f1867i.mo2347h();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.C0422z L = RecyclerView.m1204L(recyclerView.f1867i.mo2346g(i11));
            if (L != null && (i9 = L.f1993c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    L.mo2251q(i2 - i, false);
                } else {
                    L.mo2251q(i3, false);
                }
                recyclerView.f1866h0.f1974f = true;
            }
        }
        RecyclerView.C0411r rVar = recyclerView.f1861f;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = rVar.f1947c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C0422z zVar = rVar.f1947c.get(i12);
            if (zVar != null && (i8 = zVar.f1993c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    zVar.mo2251q(i2 - i, false);
                } else {
                    zVar.mo2251q(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2221a.f1872k0 = true;
    }
}
