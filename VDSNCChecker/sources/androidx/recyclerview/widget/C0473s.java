package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
public final class C0473s extends C0474t {
    public C0473s(RecyclerView.C0400l lVar) {
        super(lVar, (C0472r) null);
    }

    /* renamed from: b */
    public int mo2416b(View view) {
        return this.f2214a.mo2149A(view) + ((RecyclerView.C0405m) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: c */
    public int mo2417c(View view) {
        RecyclerView.C0405m mVar = (RecyclerView.C0405m) view.getLayoutParams();
        return this.f2214a.mo2154D(view) + mVar.topMargin + mVar.bottomMargin;
    }

    /* renamed from: d */
    public int mo2418d(View view) {
        RecyclerView.C0405m mVar = (RecyclerView.C0405m) view.getLayoutParams();
        return this.f2214a.mo2156E(view) + mVar.leftMargin + mVar.rightMargin;
    }

    /* renamed from: e */
    public int mo2419e(View view) {
        return this.f2214a.mo2159G(view) - ((RecyclerView.C0405m) view.getLayoutParams()).topMargin;
    }

    /* renamed from: f */
    public int mo2420f() {
        return this.f2214a.f1928o;
    }

    /* renamed from: g */
    public int mo2421g() {
        RecyclerView.C0400l lVar = this.f2214a;
        return lVar.f1928o - lVar.mo2166M();
    }

    /* renamed from: h */
    public int mo2422h() {
        return this.f2214a.mo2166M();
    }

    /* renamed from: i */
    public int mo2423i() {
        return this.f2214a.f1926m;
    }

    /* renamed from: j */
    public int mo2424j() {
        return this.f2214a.f1925l;
    }

    /* renamed from: k */
    public int mo2425k() {
        return this.f2214a.mo2169P();
    }

    /* renamed from: l */
    public int mo2426l() {
        RecyclerView.C0400l lVar = this.f2214a;
        return (lVar.f1928o - lVar.mo2169P()) - this.f2214a.mo2166M();
    }

    /* renamed from: n */
    public int mo2427n(View view) {
        this.f2214a.mo2171T(view, true, this.f2216c);
        return this.f2216c.bottom;
    }

    /* renamed from: o */
    public int mo2428o(View view) {
        this.f2214a.mo2171T(view, true, this.f2216c);
        return this.f2216c.top;
    }

    /* renamed from: p */
    public void mo2429p(int i) {
        this.f2214a.mo2174Y(i);
    }
}
