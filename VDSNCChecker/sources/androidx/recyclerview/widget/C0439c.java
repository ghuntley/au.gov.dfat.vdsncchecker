package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.recyclerview.widget.c */
public class C0439c {

    /* renamed from: a */
    public final C0441b f2076a;

    /* renamed from: b */
    public final C0440a f2077b = new C0440a();

    /* renamed from: c */
    public final List<View> f2078c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static class C0440a {

        /* renamed from: a */
        public long f2079a = 0;

        /* renamed from: b */
        public C0440a f2080b;

        /* renamed from: a */
        public void mo2353a(int i) {
            if (i >= 64) {
                C0440a aVar = this.f2080b;
                if (aVar != null) {
                    aVar.mo2353a(i - 64);
                    return;
                }
                return;
            }
            this.f2079a &= ~(1 << i);
        }

        /* renamed from: b */
        public int mo2354b(int i) {
            long j;
            C0440a aVar = this.f2080b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f2079a;
                }
                j = this.f2079a & ((1 << i) - 1);
            } else {
                if (i >= 64) {
                    return Long.bitCount(this.f2079a) + aVar.mo2354b(i - 64);
                }
                j = this.f2079a & ((1 << i) - 1);
            }
            return Long.bitCount(j);
        }

        /* renamed from: c */
        public final void mo2355c() {
            if (this.f2080b == null) {
                this.f2080b = new C0440a();
            }
        }

        /* renamed from: d */
        public boolean mo2356d(int i) {
            if (i < 64) {
                return (this.f2079a & (1 << i)) != 0;
            }
            mo2355c();
            return this.f2080b.mo2356d(i - 64);
        }

        /* renamed from: e */
        public void mo2357e(int i, boolean z) {
            if (i >= 64) {
                mo2355c();
                this.f2080b.mo2357e(i - 64, z);
                return;
            }
            long j = this.f2079a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2079a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo2360h(i);
            } else {
                mo2353a(i);
            }
            if (z2 || this.f2080b != null) {
                mo2355c();
                this.f2080b.mo2357e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo2358f(int i) {
            if (i >= 64) {
                mo2355c();
                return this.f2080b.mo2358f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2079a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f2079a = j3;
            long j4 = j - 1;
            this.f2079a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C0440a aVar = this.f2080b;
            if (aVar != null) {
                if (aVar.mo2356d(0)) {
                    mo2360h(63);
                }
                this.f2080b.mo2358f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo2359g() {
            this.f2079a = 0;
            C0440a aVar = this.f2080b;
            if (aVar != null) {
                aVar.mo2359g();
            }
        }

        /* renamed from: h */
        public void mo2360h(int i) {
            if (i >= 64) {
                mo2355c();
                this.f2080b.mo2360h(i - 64);
                return;
            }
            this.f2079a |= 1 << i;
        }

        public String toString() {
            if (this.f2080b == null) {
                return Long.toBinaryString(this.f2079a);
            }
            return this.f2080b.toString() + "xx" + Long.toBinaryString(this.f2079a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    public interface C0441b {
    }

    public C0439c(C0441b bVar) {
        this.f2076a = bVar;
    }

    /* renamed from: a */
    public void mo2340a(View view, int i, boolean z) {
        int b = i < 0 ? ((C0477w) this.f2076a).mo2436b() : mo2345f(i);
        this.f2077b.mo2357e(b, z);
        if (z) {
            mo2348i(view);
        }
        C0477w wVar = (C0477w) this.f2076a;
        wVar.f2220a.addView(view, b);
        Objects.requireNonNull(wVar.f2220a);
        RecyclerView.m1204L(view);
    }

    /* renamed from: b */
    public void mo2341b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b = i < 0 ? ((C0477w) this.f2076a).mo2436b() : mo2345f(i);
        this.f2077b.mo2357e(b, z);
        if (z) {
            mo2348i(view);
        }
        C0477w wVar = (C0477w) this.f2076a;
        Objects.requireNonNull(wVar);
        RecyclerView.C0422z L = RecyclerView.m1204L(view);
        if (L != null) {
            if (L.mo2249o() || L.mo2256u()) {
                L.f2000j &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(L);
                throw new IllegalArgumentException(C0436b.m1551a(wVar.f2220a, sb));
            }
        }
        wVar.f2220a.attachViewToParent(view, b, layoutParams);
    }

    /* renamed from: c */
    public void mo2342c(int i) {
        RecyclerView.C0422z L;
        int f = mo2345f(i);
        this.f2077b.mo2358f(f);
        C0477w wVar = (C0477w) this.f2076a;
        View childAt = wVar.f2220a.getChildAt(f);
        if (!(childAt == null || (L = RecyclerView.m1204L(childAt)) == null)) {
            if (!L.mo2249o() || L.mo2256u()) {
                L.mo2236b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(L);
                throw new IllegalArgumentException(C0436b.m1551a(wVar.f2220a, sb));
            }
        }
        wVar.f2220a.detachViewFromParent(f);
    }

    /* renamed from: d */
    public View mo2343d(int i) {
        return ((C0477w) this.f2076a).mo2435a(mo2345f(i));
    }

    /* renamed from: e */
    public int mo2344e() {
        return ((C0477w) this.f2076a).mo2436b() - this.f2078c.size();
    }

    /* renamed from: f */
    public final int mo2345f(int i) {
        if (i < 0) {
            return -1;
        }
        int b = ((C0477w) this.f2076a).mo2436b();
        int i2 = i;
        while (i2 < b) {
            int b2 = i - (i2 - this.f2077b.mo2354b(i2));
            if (b2 == 0) {
                while (this.f2077b.mo2356d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* renamed from: g */
    public View mo2346g(int i) {
        return ((C0477w) this.f2076a).f2220a.getChildAt(i);
    }

    /* renamed from: h */
    public int mo2347h() {
        return ((C0477w) this.f2076a).mo2436b();
    }

    /* renamed from: i */
    public final void mo2348i(View view) {
        this.f2078c.add(view);
        C0477w wVar = (C0477w) this.f2076a;
        Objects.requireNonNull(wVar);
        RecyclerView.C0422z L = RecyclerView.m1204L(view);
        if (L != null) {
            RecyclerView recyclerView = wVar.f2220a;
            int i = L.f2007q;
            if (i == -1) {
                View view2 = L.f1991a;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                i = view2.getImportantForAccessibility();
            }
            L.f2006p = i;
            recyclerView.mo2033g0(L, 4);
        }
    }

    /* renamed from: j */
    public int mo2349j(View view) {
        int indexOfChild = ((C0477w) this.f2076a).f2220a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f2077b.mo2356d(indexOfChild)) {
            return indexOfChild - this.f2077b.mo2354b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: k */
    public boolean mo2350k(View view) {
        return this.f2078c.contains(view);
    }

    /* renamed from: l */
    public final boolean mo2351l(View view) {
        if (!this.f2078c.remove(view)) {
            return false;
        }
        C0477w wVar = (C0477w) this.f2076a;
        Objects.requireNonNull(wVar);
        RecyclerView.C0422z L = RecyclerView.m1204L(view);
        if (L == null) {
            return true;
        }
        wVar.f2220a.mo2033g0(L, L.f2006p);
        L.f2006p = 0;
        return true;
    }

    public String toString() {
        return this.f2077b.toString() + ", hidden list:" + this.f2078c.size();
    }
}
