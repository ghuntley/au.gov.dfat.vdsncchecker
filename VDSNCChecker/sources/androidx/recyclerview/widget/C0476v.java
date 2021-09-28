package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
public class C0476v extends C0437b0 {

    /* renamed from: c */
    public C0474t f2218c;

    /* renamed from: d */
    public C0474t f2219d;

    /* renamed from: a */
    public int[] mo2338a(RecyclerView.C0400l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.mo1950e()) {
            iArr[0] = mo2431c(view, mo2433e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.mo1952f()) {
            iArr[1] = mo2431c(view, mo2434f(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public final int mo2431c(View view, C0474t tVar) {
        return ((tVar.mo2417c(view) / 2) + tVar.mo2419e(view)) - ((tVar.mo2426l() / 2) + tVar.mo2425k());
    }

    /* renamed from: d */
    public final View mo2432d(RecyclerView.C0400l lVar, C0474t tVar) {
        int x = lVar.mo2189x();
        View view = null;
        if (x == 0) {
            return null;
        }
        int l = (tVar.mo2426l() / 2) + tVar.mo2425k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < x; i2++) {
            View w = lVar.mo2188w(i2);
            int abs = Math.abs(((tVar.mo2417c(w) / 2) + tVar.mo2419e(w)) - l);
            if (abs < i) {
                view = w;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: e */
    public final C0474t mo2433e(RecyclerView.C0400l lVar) {
        C0474t tVar = this.f2219d;
        if (tVar == null || tVar.f2214a != lVar) {
            this.f2219d = new C0472r(lVar);
        }
        return this.f2219d;
    }

    /* renamed from: f */
    public final C0474t mo2434f(RecyclerView.C0400l lVar) {
        C0474t tVar = this.f2218c;
        if (tVar == null || tVar.f2214a != lVar) {
            this.f2218c = new C0473s(lVar);
        }
        return this.f2218c;
    }
}
