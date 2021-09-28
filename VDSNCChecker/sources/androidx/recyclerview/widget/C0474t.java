package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
public abstract class C0474t {

    /* renamed from: a */
    public final RecyclerView.C0400l f2214a;

    /* renamed from: b */
    public int f2215b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f2216c = new Rect();

    public C0474t(RecyclerView.C0400l lVar, C0472r rVar) {
        this.f2214a = lVar;
    }

    /* renamed from: a */
    public static C0474t m1652a(RecyclerView.C0400l lVar, int i) {
        if (i == 0) {
            return new C0472r(lVar);
        }
        if (i == 1) {
            return new C0473s(lVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo2416b(View view);

    /* renamed from: c */
    public abstract int mo2417c(View view);

    /* renamed from: d */
    public abstract int mo2418d(View view);

    /* renamed from: e */
    public abstract int mo2419e(View view);

    /* renamed from: f */
    public abstract int mo2420f();

    /* renamed from: g */
    public abstract int mo2421g();

    /* renamed from: h */
    public abstract int mo2422h();

    /* renamed from: i */
    public abstract int mo2423i();

    /* renamed from: j */
    public abstract int mo2424j();

    /* renamed from: k */
    public abstract int mo2425k();

    /* renamed from: l */
    public abstract int mo2426l();

    /* renamed from: m */
    public int mo2430m() {
        if (Integer.MIN_VALUE == this.f2215b) {
            return 0;
        }
        return mo2426l() - this.f2215b;
    }

    /* renamed from: n */
    public abstract int mo2427n(View view);

    /* renamed from: o */
    public abstract int mo2428o(View view);

    /* renamed from: p */
    public abstract void mo2429p(int i);
}
