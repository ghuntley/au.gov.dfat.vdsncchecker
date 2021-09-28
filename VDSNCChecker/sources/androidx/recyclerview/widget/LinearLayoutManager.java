package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.C0131a0;
import androidx.recyclerview.widget.C0464n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.C0001b;

public class LinearLayoutManager extends RecyclerView.C0400l implements RecyclerView.C0416v.C0418b {

    /* renamed from: A */
    public final C0381a f1790A = new C0381a();

    /* renamed from: B */
    public final C0382b f1791B = new C0382b();

    /* renamed from: C */
    public int f1792C = 2;

    /* renamed from: D */
    public int[] f1793D = new int[2];

    /* renamed from: p */
    public int f1794p = 1;

    /* renamed from: q */
    public C0383c f1795q;

    /* renamed from: r */
    public C0474t f1796r;

    /* renamed from: s */
    public boolean f1797s;

    /* renamed from: t */
    public boolean f1798t = false;

    /* renamed from: u */
    public boolean f1799u = false;

    /* renamed from: v */
    public boolean f1800v = false;

    /* renamed from: w */
    public boolean f1801w = true;

    /* renamed from: x */
    public int f1802x = -1;

    /* renamed from: y */
    public int f1803y = Integer.MIN_VALUE;

    /* renamed from: z */
    public C0384d f1804z = null;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0381a {

        /* renamed from: a */
        public C0474t f1805a;

        /* renamed from: b */
        public int f1806b;

        /* renamed from: c */
        public int f1807c;

        /* renamed from: d */
        public boolean f1808d;

        /* renamed from: e */
        public boolean f1809e;

        public C0381a() {
            mo1973d();
        }

        /* renamed from: a */
        public void mo1970a() {
            this.f1807c = this.f1808d ? this.f1805a.mo2421g() : this.f1805a.mo2425k();
        }

        /* renamed from: b */
        public void mo1971b(View view, int i) {
            if (this.f1808d) {
                this.f1807c = this.f1805a.mo2430m() + this.f1805a.mo2416b(view);
            } else {
                this.f1807c = this.f1805a.mo2419e(view);
            }
            this.f1806b = i;
        }

        /* renamed from: c */
        public void mo1972c(View view, int i) {
            int i2;
            int m = this.f1805a.mo2430m();
            if (m >= 0) {
                mo1971b(view, i);
                return;
            }
            this.f1806b = i;
            if (this.f1808d) {
                int g = (this.f1805a.mo2421g() - m) - this.f1805a.mo2416b(view);
                this.f1807c = this.f1805a.mo2421g() - g;
                if (g > 0) {
                    int c = this.f1807c - this.f1805a.mo2417c(view);
                    int k = this.f1805a.mo2425k();
                    int min = c - (Math.min(this.f1805a.mo2419e(view) - k, 0) + k);
                    if (min < 0) {
                        i2 = Math.min(g, -min) + this.f1807c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e = this.f1805a.mo2419e(view);
                int k2 = e - this.f1805a.mo2425k();
                this.f1807c = e;
                if (k2 > 0) {
                    int g2 = (this.f1805a.mo2421g() - Math.min(0, (this.f1805a.mo2421g() - m) - this.f1805a.mo2416b(view))) - (this.f1805a.mo2417c(view) + e);
                    if (g2 < 0) {
                        i2 = this.f1807c - Math.min(k2, -g2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1807c = i2;
        }

        /* renamed from: d */
        public void mo1973d() {
            this.f1806b = -1;
            this.f1807c = Integer.MIN_VALUE;
            this.f1808d = false;
            this.f1809e = false;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("AnchorInfo{mPosition=");
            a.append(this.f1806b);
            a.append(", mCoordinate=");
            a.append(this.f1807c);
            a.append(", mLayoutFromEnd=");
            a.append(this.f1808d);
            a.append(", mValid=");
            a.append(this.f1809e);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0382b {

        /* renamed from: a */
        public int f1810a;

        /* renamed from: b */
        public boolean f1811b;

        /* renamed from: c */
        public boolean f1812c;

        /* renamed from: d */
        public boolean f1813d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0383c {

        /* renamed from: a */
        public boolean f1814a = true;

        /* renamed from: b */
        public int f1815b;

        /* renamed from: c */
        public int f1816c;

        /* renamed from: d */
        public int f1817d;

        /* renamed from: e */
        public int f1818e;

        /* renamed from: f */
        public int f1819f;

        /* renamed from: g */
        public int f1820g;

        /* renamed from: h */
        public int f1821h = 0;

        /* renamed from: i */
        public int f1822i = 0;

        /* renamed from: j */
        public int f1823j;

        /* renamed from: k */
        public List<RecyclerView.C0422z> f1824k = null;

        /* renamed from: l */
        public boolean f1825l;

        /* renamed from: a */
        public void mo1975a(View view) {
            int i;
            int a;
            int size = this.f1824k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f1824k.get(i3).f1991a;
                RecyclerView.C0405m mVar = (RecyclerView.C0405m) view3.getLayoutParams();
                if (view3 != view && !mVar.mo2199c() && (a = (mVar.mo2197a() - this.f1817d) * this.f1818e) >= 0 && a < i2) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i2 = a;
                }
            }
            if (view2 == null) {
                i = -1;
            } else {
                i = ((RecyclerView.C0405m) view2.getLayoutParams()).mo2197a();
            }
            this.f1817d = i;
        }

        /* renamed from: b */
        public boolean mo1976b(RecyclerView.C0419w wVar) {
            int i = this.f1817d;
            return i >= 0 && i < wVar.mo2229b();
        }

        /* renamed from: c */
        public View mo1977c(RecyclerView.C0411r rVar) {
            List<RecyclerView.C0422z> list = this.f1824k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f1824k.get(i).f1991a;
                    RecyclerView.C0405m mVar = (RecyclerView.C0405m) view.getLayoutParams();
                    if (!mVar.mo2199c() && this.f1817d == mVar.mo2197a()) {
                        mo1975a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = rVar.mo2216j(this.f1817d, false, Long.MAX_VALUE).f1991a;
            this.f1817d += this.f1818e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0384d implements Parcelable {
        public static final Parcelable.Creator<C0384d> CREATOR = new C0385a();

        /* renamed from: e */
        public int f1826e;

        /* renamed from: f */
        public int f1827f;

        /* renamed from: g */
        public boolean f1828g;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class C0385a implements Parcelable.Creator<C0384d> {
            public Object createFromParcel(Parcel parcel) {
                return new C0384d(parcel);
            }

            public Object[] newArray(int i) {
                return new C0384d[i];
            }
        }

        public C0384d() {
        }

        public C0384d(Parcel parcel) {
            this.f1826e = parcel.readInt();
            this.f1827f = parcel.readInt();
            this.f1828g = parcel.readInt() != 1 ? false : true;
        }

        public C0384d(C0384d dVar) {
            this.f1826e = dVar.f1826e;
            this.f1827f = dVar.f1827f;
            this.f1828g = dVar.f1828g;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: j */
        public boolean mo1979j() {
            return this.f1826e >= 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1826e);
            parcel.writeInt(this.f1827f);
            parcel.writeInt(this.f1828g ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        mo1963m1(i);
        mo1948d((String) null);
        if (z != this.f1798t) {
            this.f1798t = z;
            mo2187u0();
        }
    }

    /* renamed from: E0 */
    public boolean mo1924E0() {
        boolean z;
        if (this.f1926m == 1073741824 || this.f1925l == 1073741824) {
            return false;
        }
        int x = mo2189x();
        int i = 0;
        while (true) {
            if (i >= x) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = mo2188w(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    public void mo1925G0(RecyclerView recyclerView, RecyclerView.C0419w wVar, int i) {
        C0469p pVar = new C0469p(recyclerView.getContext());
        pVar.f1955a = i;
        mo2161H0(pVar);
    }

    /* renamed from: I0 */
    public boolean mo1887I0() {
        return this.f1804z == null && this.f1797s == this.f1800v;
    }

    /* renamed from: J0 */
    public void mo1926J0(RecyclerView.C0419w wVar, int[] iArr) {
        int i;
        int l = wVar.f1969a != -1 ? this.f1796r.mo2426l() : 0;
        if (this.f1795q.f1819f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    /* renamed from: K0 */
    public void mo1888K0(RecyclerView.C0419w wVar, C0383c cVar, RecyclerView.C0400l.C0403c cVar2) {
        int i = cVar.f1817d;
        if (i >= 0 && i < wVar.mo2229b()) {
            ((C0464n.C0466b) cVar2).mo2409a(i, Math.max(0, cVar.f1820g));
        }
    }

    /* renamed from: L0 */
    public final int mo1927L0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        mo1931P0();
        C0474t tVar = this.f1796r;
        View T0 = mo1935T0(!this.f1801w, true);
        return C0481z.m1697a(wVar, tVar, T0, mo1934S0(!this.f1801w, true), this, this.f1801w);
    }

    /* renamed from: M0 */
    public final int mo1928M0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        mo1931P0();
        C0474t tVar = this.f1796r;
        View T0 = mo1935T0(!this.f1801w, true);
        return C0481z.m1698b(wVar, tVar, T0, mo1934S0(!this.f1801w, true), this, this.f1801w, this.f1799u);
    }

    /* renamed from: N0 */
    public final int mo1929N0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        mo1931P0();
        C0474t tVar = this.f1796r;
        View T0 = mo1935T0(!this.f1801w, true);
        return C0481z.m1699c(wVar, tVar, T0, mo1934S0(!this.f1801w, true), this, this.f1801w);
    }

    /* renamed from: O0 */
    public int mo1930O0(int i) {
        if (i == 1) {
            return (this.f1794p != 1 && mo1951e1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f1794p != 1 && mo1951e1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f1794p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f1794p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f1794p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f1794p == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: P0 */
    public void mo1931P0() {
        if (this.f1795q == null) {
            this.f1795q = new C0383c();
        }
    }

    /* renamed from: Q0 */
    public int mo1932Q0(RecyclerView.C0411r rVar, C0383c cVar, RecyclerView.C0419w wVar, boolean z) {
        int i = cVar.f1816c;
        int i2 = cVar.f1820g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f1820g = i2 + i;
            }
            mo1953h1(rVar, cVar);
        }
        int i3 = cVar.f1816c + cVar.f1821h;
        C0382b bVar = this.f1791B;
        while (true) {
            if ((!cVar.f1825l && i3 <= 0) || !cVar.mo1976b(wVar)) {
                break;
            }
            bVar.f1810a = 0;
            bVar.f1811b = false;
            bVar.f1812c = false;
            bVar.f1813d = false;
            mo1895f1(rVar, wVar, cVar, bVar);
            if (!bVar.f1811b) {
                int i4 = cVar.f1815b;
                int i5 = bVar.f1810a;
                cVar.f1815b = (cVar.f1819f * i5) + i4;
                if (!bVar.f1812c || cVar.f1824k != null || !wVar.f1975g) {
                    cVar.f1816c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.f1820g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.f1820g = i7;
                    int i8 = cVar.f1816c;
                    if (i8 < 0) {
                        cVar.f1820g = i7 + i8;
                    }
                    mo1953h1(rVar, cVar);
                }
                if (z && bVar.f1813d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1816c;
    }

    /* renamed from: R0 */
    public final View mo1933R0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return mo1890Z0(rVar, wVar, 0, mo2189x(), wVar.mo2229b());
    }

    /* renamed from: S0 */
    public View mo1934S0(boolean z, boolean z2) {
        int x;
        int i;
        if (this.f1799u) {
            x = 0;
            i = mo2189x();
        } else {
            x = mo2189x() - 1;
            i = -1;
        }
        return mo1941Y0(x, i, z, z2);
    }

    /* renamed from: T0 */
    public View mo1935T0(boolean z, boolean z2) {
        int i;
        int x;
        if (this.f1799u) {
            i = mo2189x() - 1;
            x = -1;
        } else {
            i = 0;
            x = mo2189x();
        }
        return mo1941Y0(i, x, z, z2);
    }

    /* renamed from: U */
    public boolean mo1936U() {
        return true;
    }

    /* renamed from: U0 */
    public int mo1937U0() {
        View Y0 = mo1941Y0(0, mo2189x(), false, true);
        if (Y0 == null) {
            return -1;
        }
        return mo2170Q(Y0);
    }

    /* renamed from: V0 */
    public final View mo1938V0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return mo1890Z0(rVar, wVar, mo2189x() - 1, -1, wVar.mo2229b());
    }

    /* renamed from: W0 */
    public int mo1939W0() {
        View Y0 = mo1941Y0(mo2189x() - 1, -1, false, true);
        if (Y0 == null) {
            return -1;
        }
        return mo2170Q(Y0);
    }

    /* renamed from: X0 */
    public View mo1940X0(int i, int i2) {
        int i3;
        int i4;
        mo1931P0();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo2188w(i);
        }
        if (this.f1796r.mo2419e(mo2188w(i)) < this.f1796r.mo2425k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f1794p == 0 ? this.f1916c : this.f1917d).mo2362a(i, i2, i4, i3);
    }

    /* renamed from: Y0 */
    public View mo1941Y0(int i, int i2, boolean z, boolean z2) {
        mo1931P0();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f1794p == 0 ? this.f1916c : this.f1917d).mo2362a(i, i2, i4, i3);
    }

    /* renamed from: Z */
    public void mo1942Z(RecyclerView recyclerView, RecyclerView.C0411r rVar) {
    }

    /* renamed from: Z0 */
    public View mo1890Z0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, int i, int i2, int i3) {
        mo1931P0();
        int k = this.f1796r.mo2425k();
        int g = this.f1796r.mo2421g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View w = mo2188w(i);
            int Q = mo2170Q(w);
            if (Q >= 0 && Q < i3) {
                if (((RecyclerView.C0405m) w.getLayoutParams()).mo2199c()) {
                    if (view2 == null) {
                        view2 = w;
                    }
                } else if (this.f1796r.mo2419e(w) < g && this.f1796r.mo2416b(w) >= k) {
                    return w;
                } else {
                    if (view == null) {
                        view = w;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public PointF mo1943a(int i) {
        if (mo2189x() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo2170Q(mo2188w(0))) {
            z = true;
        }
        if (z != this.f1799u) {
            i2 = -1;
        }
        return this.f1794p == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a0 */
    public View mo1891a0(View view, int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        int O0;
        View view2;
        mo1959k1();
        if (mo2189x() == 0 || (O0 = mo1930O0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo1931P0();
        mo1965o1(O0, (int) (((float) this.f1796r.mo2426l()) * 0.33333334f), false, wVar);
        C0383c cVar = this.f1795q;
        cVar.f1820g = Integer.MIN_VALUE;
        cVar.f1814a = false;
        mo1932Q0(rVar, cVar, wVar, true);
        if (O0 == -1) {
            if (this.f1799u) {
                view2 = mo1940X0(mo2189x() - 1, -1);
            } else {
                view2 = mo1940X0(0, mo2189x());
            }
        } else if (this.f1799u) {
            view2 = mo1940X0(0, mo2189x());
        } else {
            view2 = mo1940X0(mo2189x() - 1, -1);
        }
        View d1 = O0 == -1 ? mo1949d1() : mo1947c1();
        if (!d1.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return d1;
    }

    /* renamed from: a1 */
    public final int mo1944a1(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, boolean z) {
        int g;
        int g2 = this.f1796r.mo2421g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -mo1961l1(-g2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (g = this.f1796r.mo2421g() - i3) <= 0) {
            return i2;
        }
        this.f1796r.mo2429p(g);
        return g + i2;
    }

    /* renamed from: b0 */
    public void mo1945b0(AccessibilityEvent accessibilityEvent) {
        super.mo1945b0(accessibilityEvent);
        if (mo2189x() > 0) {
            accessibilityEvent.setFromIndex(mo1937U0());
            accessibilityEvent.setToIndex(mo1939W0());
        }
    }

    /* renamed from: b1 */
    public final int mo1946b1(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, boolean z) {
        int k;
        int k2 = i - this.f1796r.mo2425k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -mo1961l1(k2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.f1796r.mo2425k()) <= 0) {
            return i2;
        }
        this.f1796r.mo2429p(-k);
        return i2 - k;
    }

    /* renamed from: c1 */
    public final View mo1947c1() {
        return mo2188w(this.f1799u ? 0 : mo2189x() - 1);
    }

    /* renamed from: d */
    public void mo1948d(String str) {
        RecyclerView recyclerView;
        if (this.f1804z == null && (recyclerView = this.f1915b) != null) {
            recyclerView.mo2057i(str);
        }
    }

    /* renamed from: d1 */
    public final View mo1949d1() {
        return mo2188w(this.f1799u ? mo2189x() - 1 : 0);
    }

    /* renamed from: e */
    public boolean mo1950e() {
        return this.f1794p == 0;
    }

    /* renamed from: e1 */
    public boolean mo1951e1() {
        return mo2163J() == 1;
    }

    /* renamed from: f */
    public boolean mo1952f() {
        return this.f1794p == 1;
    }

    /* renamed from: f1 */
    public void mo1895f1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, C0383c cVar, C0382b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c = cVar.mo1977c(rVar);
        if (c == null) {
            bVar.f1811b = true;
            return;
        }
        RecyclerView.C0405m mVar = (RecyclerView.C0405m) c.getLayoutParams();
        if (cVar.f1824k == null) {
            if (this.f1799u == (cVar.f1819f == -1)) {
                mo2176c(c, -1, false);
            } else {
                mo2176c(c, 0, false);
            }
        } else {
            if (this.f1799u == (cVar.f1819f == -1)) {
                mo2176c(c, -1, true);
            } else {
                mo2176c(c, 0, true);
            }
        }
        RecyclerView.C0405m mVar2 = (RecyclerView.C0405m) c.getLayoutParams();
        Rect M = this.f1915b.mo1993M(c);
        int y = RecyclerView.C0400l.m1293y(this.f1927n, this.f1925l, mo2168O() + mo2167N() + mVar2.leftMargin + mVar2.rightMargin + M.left + M.right + 0, mVar2.width, mo1950e());
        int y2 = RecyclerView.C0400l.m1293y(this.f1928o, this.f1926m, mo2166M() + mo2169P() + mVar2.topMargin + mVar2.bottomMargin + M.top + M.bottom + 0, mVar2.height, mo1952f());
        if (mo2155D0(c, y, y2, mVar2)) {
            c.measure(y, y2);
        }
        bVar.f1810a = this.f1796r.mo2417c(c);
        if (this.f1794p == 1) {
            if (mo1951e1()) {
                i5 = this.f1927n - mo2168O();
                i4 = i5 - this.f1796r.mo2418d(c);
            } else {
                i4 = mo2167N();
                i5 = this.f1796r.mo2418d(c) + i4;
            }
            int i6 = cVar.f1819f;
            int i7 = cVar.f1815b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f1810a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f1810a + i7;
            }
        } else {
            int P = mo2169P();
            int d = this.f1796r.mo2418d(c) + P;
            int i8 = cVar.f1819f;
            int i9 = cVar.f1815b;
            if (i8 == -1) {
                i2 = i9;
                i3 = P;
                i = d;
                i4 = i9 - bVar.f1810a;
            } else {
                i3 = P;
                i2 = bVar.f1810a + i9;
                i = d;
                i4 = i9;
            }
        }
        mo2172W(c, i4, i3, i2, i);
        if (mVar.mo2199c() || mVar.mo2198b()) {
            bVar.f1812c = true;
        }
        bVar.f1813d = c.hasFocusable();
    }

    /* renamed from: g1 */
    public void mo1898g1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, C0381a aVar, int i) {
    }

    /* renamed from: h1 */
    public final void mo1953h1(RecyclerView.C0411r rVar, C0383c cVar) {
        if (cVar.f1814a && !cVar.f1825l) {
            int i = cVar.f1820g;
            int i2 = cVar.f1822i;
            if (cVar.f1819f == -1) {
                int x = mo2189x();
                if (i >= 0) {
                    int f = (this.f1796r.mo2420f() - i) + i2;
                    if (this.f1799u) {
                        for (int i3 = 0; i3 < x; i3++) {
                            View w = mo2188w(i3);
                            if (this.f1796r.mo2419e(w) < f || this.f1796r.mo2428o(w) < f) {
                                mo1955i1(rVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = x - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View w2 = mo2188w(i5);
                        if (this.f1796r.mo2419e(w2) < f || this.f1796r.mo2428o(w2) < f) {
                            mo1955i1(rVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int x2 = mo2189x();
                if (this.f1799u) {
                    int i7 = x2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View w3 = mo2188w(i8);
                        if (this.f1796r.mo2416b(w3) > i6 || this.f1796r.mo2427n(w3) > i6) {
                            mo1955i1(rVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < x2; i9++) {
                    View w4 = mo2188w(i9);
                    if (this.f1796r.mo2416b(w4) > i6 || this.f1796r.mo2427n(w4) > i6) {
                        mo1955i1(rVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void mo1954i(int i, int i2, RecyclerView.C0419w wVar, RecyclerView.C0400l.C0403c cVar) {
        if (this.f1794p != 0) {
            i = i2;
        }
        if (mo2189x() != 0 && i != 0) {
            mo1931P0();
            mo1965o1(i > 0 ? 1 : -1, Math.abs(i), true, wVar);
            mo1888K0(wVar, this.f1795q, cVar);
        }
    }

    /* renamed from: i1 */
    public final void mo1955i1(RecyclerView.C0411r rVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo2184r0(i3, rVar);
                }
                return;
            }
            while (i > i2) {
                mo2184r0(i, rVar);
                i--;
            }
        }
    }

    /* renamed from: j */
    public void mo1956j(int i, RecyclerView.C0400l.C0403c cVar) {
        boolean z;
        int i2;
        C0384d dVar = this.f1804z;
        int i3 = -1;
        if (dVar == null || !dVar.mo1979j()) {
            mo1959k1();
            z = this.f1799u;
            i2 = this.f1802x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0384d dVar2 = this.f1804z;
            z = dVar2.f1828g;
            i2 = dVar2.f1826e;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f1792C && i2 >= 0 && i2 < i; i4++) {
            ((C0464n.C0466b) cVar).mo2409a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1901j0(androidx.recyclerview.widget.RecyclerView.C0411r r17, androidx.recyclerview.widget.RecyclerView.C0419w r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1804z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f1802x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.mo2229b()
            if (r3 != 0) goto L_0x0019
            r16.mo2179o0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1804z
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.mo1979j()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1804z
            int r3 = r3.f1826e
            r0.f1802x = r3
        L_0x0029:
            r16.mo1931P0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r5 = 0
            r3.f1814a = r5
            r16.mo1959k1()
            android.view.View r3 = r16.mo2160H()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f1790A
            boolean r7 = r6.f1809e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.f1802x
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1804z
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0236
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2419e(r3)
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2421g()
            if (r6 >= r7) goto L_0x0068
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2416b(r3)
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2425k()
            if (r6 > r7) goto L_0x0236
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f1790A
            int r7 = r0.mo2170Q(r3)
            r6.mo1972c(r3, r7)
            goto L_0x0236
        L_0x0073:
            r6.mo1973d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            boolean r6 = r0.f1799u
            boolean r7 = r0.f1800v
            r6 = r6 ^ r7
            r3.f1808d = r6
            boolean r6 = r2.f1975g
            if (r6 != 0) goto L_0x0170
            int r6 = r0.f1802x
            if (r6 != r4) goto L_0x0089
            goto L_0x0170
        L_0x0089:
            if (r6 < 0) goto L_0x016c
            int r7 = r18.mo2229b()
            if (r6 < r7) goto L_0x0093
            goto L_0x016c
        L_0x0093:
            int r6 = r0.f1802x
            r3.f1806b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f1804z
            if (r6 == 0) goto L_0x00c1
            boolean r6 = r6.mo1979j()
            if (r6 == 0) goto L_0x00c1
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f1804z
            boolean r6 = r6.f1828g
            r3.f1808d = r6
            if (r6 == 0) goto L_0x00b5
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2421g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1804z
            int r7 = r7.f1827f
            goto L_0x015d
        L_0x00b5:
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2425k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1804z
            int r7 = r7.f1827f
            goto L_0x0167
        L_0x00c1:
            int r6 = r0.f1803y
            if (r6 != r8) goto L_0x014f
            int r6 = r0.f1802x
            android.view.View r6 = r0.mo1968s(r6)
            if (r6 == 0) goto L_0x012d
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2417c(r6)
            androidx.recyclerview.widget.t r10 = r0.f1796r
            int r10 = r10.mo2426l()
            if (r7 <= r10) goto L_0x00dd
            goto L_0x014b
        L_0x00dd:
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2419e(r6)
            androidx.recyclerview.widget.t r10 = r0.f1796r
            int r10 = r10.mo2425k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x00f8
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2425k()
            r3.f1807c = r6
            r3.f1808d = r5
            goto L_0x016a
        L_0x00f8:
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2421g()
            androidx.recyclerview.widget.t r10 = r0.f1796r
            int r10 = r10.mo2416b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0112
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2421g()
            r3.f1807c = r6
            r3.f1808d = r9
            goto L_0x016a
        L_0x0112:
            boolean r7 = r3.f1808d
            if (r7 == 0) goto L_0x0124
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r6 = r7.mo2416b(r6)
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2430m()
            int r7 = r7 + r6
            goto L_0x012a
        L_0x0124:
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2419e(r6)
        L_0x012a:
            r3.f1807c = r7
            goto L_0x016a
        L_0x012d:
            int r6 = r16.mo2189x()
            if (r6 <= 0) goto L_0x014b
            android.view.View r6 = r0.mo2188w(r5)
            int r6 = r0.mo2170Q(r6)
            int r7 = r0.f1802x
            if (r7 >= r6) goto L_0x0141
            r6 = r9
            goto L_0x0142
        L_0x0141:
            r6 = r5
        L_0x0142:
            boolean r7 = r0.f1799u
            if (r6 != r7) goto L_0x0148
            r6 = r9
            goto L_0x0149
        L_0x0148:
            r6 = r5
        L_0x0149:
            r3.f1808d = r6
        L_0x014b:
            r3.mo1970a()
            goto L_0x016a
        L_0x014f:
            boolean r6 = r0.f1799u
            r3.f1808d = r6
            if (r6 == 0) goto L_0x015f
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2421g()
            int r7 = r0.f1803y
        L_0x015d:
            int r6 = r6 - r7
            goto L_0x0168
        L_0x015f:
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2425k()
            int r7 = r0.f1803y
        L_0x0167:
            int r6 = r6 + r7
        L_0x0168:
            r3.f1807c = r6
        L_0x016a:
            r6 = r9
            goto L_0x0171
        L_0x016c:
            r0.f1802x = r4
            r0.f1803y = r8
        L_0x0170:
            r6 = r5
        L_0x0171:
            if (r6 == 0) goto L_0x0175
            goto L_0x0232
        L_0x0175:
            int r6 = r16.mo2189x()
            if (r6 != 0) goto L_0x017d
            goto L_0x021e
        L_0x017d:
            android.view.View r6 = r16.mo2160H()
            if (r6 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.C0405m) r7
            boolean r10 = r7.mo2199c()
            if (r10 != 0) goto L_0x01a1
            int r10 = r7.mo2197a()
            if (r10 < 0) goto L_0x01a1
            int r7 = r7.mo2197a()
            int r10 = r18.mo2229b()
            if (r7 >= r10) goto L_0x01a1
            r7 = r9
            goto L_0x01a2
        L_0x01a1:
            r7 = r5
        L_0x01a2:
            if (r7 == 0) goto L_0x01ad
            int r7 = r0.mo2170Q(r6)
            r3.mo1972c(r6, r7)
            goto L_0x021c
        L_0x01ad:
            boolean r6 = r0.f1797s
            boolean r7 = r0.f1800v
            if (r6 == r7) goto L_0x01b5
            goto L_0x021e
        L_0x01b5:
            boolean r6 = r3.f1808d
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r0.f1799u
            if (r6 == 0) goto L_0x01c2
            android.view.View r6 = r16.mo1933R0(r17, r18)
            goto L_0x01d4
        L_0x01c2:
            android.view.View r6 = r16.mo1938V0(r17, r18)
            goto L_0x01d4
        L_0x01c7:
            boolean r6 = r0.f1799u
            if (r6 == 0) goto L_0x01d0
            android.view.View r6 = r16.mo1938V0(r17, r18)
            goto L_0x01d4
        L_0x01d0:
            android.view.View r6 = r16.mo1933R0(r17, r18)
        L_0x01d4:
            if (r6 == 0) goto L_0x021e
            int r7 = r0.mo2170Q(r6)
            r3.mo1971b(r6, r7)
            boolean r7 = r2.f1975g
            if (r7 != 0) goto L_0x021c
            boolean r7 = r16.mo1887I0()
            if (r7 == 0) goto L_0x021c
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2419e(r6)
            androidx.recyclerview.widget.t r10 = r0.f1796r
            int r10 = r10.mo2421g()
            if (r7 >= r10) goto L_0x0206
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r6 = r7.mo2416b(r6)
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2425k()
            if (r6 >= r7) goto L_0x0204
            goto L_0x0206
        L_0x0204:
            r6 = r5
            goto L_0x0207
        L_0x0206:
            r6 = r9
        L_0x0207:
            if (r6 == 0) goto L_0x021c
            boolean r6 = r3.f1808d
            if (r6 == 0) goto L_0x0214
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2421g()
            goto L_0x021a
        L_0x0214:
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2425k()
        L_0x021a:
            r3.f1807c = r6
        L_0x021c:
            r6 = r9
            goto L_0x021f
        L_0x021e:
            r6 = r5
        L_0x021f:
            if (r6 == 0) goto L_0x0222
            goto L_0x0232
        L_0x0222:
            r3.mo1970a()
            boolean r6 = r0.f1800v
            if (r6 == 0) goto L_0x022f
            int r6 = r18.mo2229b()
            int r6 = r6 + r4
            goto L_0x0230
        L_0x022f:
            r6 = r5
        L_0x0230:
            r3.f1806b = r6
        L_0x0232:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            r3.f1809e = r9
        L_0x0236:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r6 = r3.f1823j
            if (r6 < 0) goto L_0x023e
            r6 = r9
            goto L_0x023f
        L_0x023e:
            r6 = r4
        L_0x023f:
            r3.f1819f = r6
            int[] r3 = r0.f1793D
            r3[r5] = r5
            r3[r9] = r5
            r0.mo1926J0(r2, r3)
            int[] r3 = r0.f1793D
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.t r6 = r0.f1796r
            int r6 = r6.mo2425k()
            int r6 = r6 + r3
            int[] r3 = r0.f1793D
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.t r7 = r0.f1796r
            int r7 = r7.mo2422h()
            int r7 = r7 + r3
            boolean r3 = r2.f1975g
            if (r3 == 0) goto L_0x02a3
            int r3 = r0.f1802x
            if (r3 == r4) goto L_0x02a3
            int r10 = r0.f1803y
            if (r10 == r8) goto L_0x02a3
            android.view.View r3 = r0.mo1968s(r3)
            if (r3 == 0) goto L_0x02a3
            boolean r8 = r0.f1799u
            if (r8 == 0) goto L_0x028e
            androidx.recyclerview.widget.t r8 = r0.f1796r
            int r8 = r8.mo2421g()
            androidx.recyclerview.widget.t r10 = r0.f1796r
            int r3 = r10.mo2416b(r3)
            int r8 = r8 - r3
            int r3 = r0.f1803y
            goto L_0x029d
        L_0x028e:
            androidx.recyclerview.widget.t r8 = r0.f1796r
            int r3 = r8.mo2419e(r3)
            androidx.recyclerview.widget.t r8 = r0.f1796r
            int r8 = r8.mo2425k()
            int r3 = r3 - r8
            int r8 = r0.f1803y
        L_0x029d:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x02a2
            int r6 = r6 + r8
            goto L_0x02a3
        L_0x02a2:
            int r7 = r7 - r8
        L_0x02a3:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            boolean r8 = r3.f1808d
            if (r8 == 0) goto L_0x02ae
            boolean r8 = r0.f1799u
            if (r8 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02ae:
            boolean r8 = r0.f1799u
            if (r8 == 0) goto L_0x02b4
        L_0x02b2:
            r8 = r4
            goto L_0x02b5
        L_0x02b4:
            r8 = r9
        L_0x02b5:
            r0.mo1898g1(r1, r2, r3, r8)
            r16.mo2181q(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            boolean r8 = r16.mo1957j1()
            r3.f1825l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r3.f1822i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            boolean r8 = r3.f1808d
            if (r8 == 0) goto L_0x0319
            int r8 = r3.f1806b
            int r3 = r3.f1807c
            r0.mo1967q1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r3.f1821h = r6
            r0.mo1932Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r6 = r3.f1815b
            int r8 = r3.f1817d
            int r3 = r3.f1816c
            if (r3 <= 0) goto L_0x02eb
            int r7 = r7 + r3
        L_0x02eb:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            int r10 = r3.f1806b
            int r3 = r3.f1807c
            r0.mo1966p1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r3.f1821h = r7
            int r7 = r3.f1817d
            int r10 = r3.f1818e
            int r7 = r7 + r10
            r3.f1817d = r7
            r0.mo1932Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r7 = r3.f1815b
            int r3 = r3.f1816c
            if (r3 <= 0) goto L_0x035f
            r0.mo1967q1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f1795q
            r6.f1821h = r3
            r0.mo1932Q0(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r6 = r3.f1815b
            goto L_0x035f
        L_0x0319:
            int r8 = r3.f1806b
            int r3 = r3.f1807c
            r0.mo1966p1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r3.f1821h = r7
            r0.mo1932Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r7 = r3.f1815b
            int r8 = r3.f1817d
            int r3 = r3.f1816c
            if (r3 <= 0) goto L_0x0332
            int r6 = r6 + r3
        L_0x0332:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f1790A
            int r10 = r3.f1806b
            int r3 = r3.f1807c
            r0.mo1967q1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            r3.f1821h = r6
            int r6 = r3.f1817d
            int r10 = r3.f1818e
            int r6 = r6 + r10
            r3.f1817d = r6
            r0.mo1932Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r6 = r3.f1815b
            int r3 = r3.f1816c
            if (r3 <= 0) goto L_0x035f
            r0.mo1966p1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f1795q
            r7.f1821h = r3
            r0.mo1932Q0(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1795q
            int r7 = r3.f1815b
        L_0x035f:
            int r3 = r16.mo2189x()
            if (r3 <= 0) goto L_0x0383
            boolean r3 = r0.f1799u
            boolean r8 = r0.f1800v
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0377
            int r3 = r0.mo1944a1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo1946b1(r6, r1, r2, r5)
            goto L_0x0381
        L_0x0377:
            int r3 = r0.mo1946b1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.mo1944a1(r7, r1, r2, r5)
        L_0x0381:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x0383:
            boolean r3 = r2.f1979k
            if (r3 == 0) goto L_0x0419
            int r3 = r16.mo2189x()
            if (r3 == 0) goto L_0x0419
            boolean r3 = r2.f1975g
            if (r3 != 0) goto L_0x0419
            boolean r3 = r16.mo1887I0()
            if (r3 != 0) goto L_0x0399
            goto L_0x0419
        L_0x0399:
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f1948d
            int r8 = r3.size()
            android.view.View r10 = r0.mo2188w(r5)
            int r10 = r0.mo2170Q(r10)
            r11 = r5
            r12 = r11
            r13 = r12
        L_0x03aa:
            if (r11 >= r8) goto L_0x03da
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C0422z) r14
            boolean r15 = r14.mo2247m()
            if (r15 == 0) goto L_0x03b9
            goto L_0x03d6
        L_0x03b9:
            int r15 = r14.mo2240f()
            if (r15 >= r10) goto L_0x03c1
            r15 = r9
            goto L_0x03c2
        L_0x03c1:
            r15 = r5
        L_0x03c2:
            boolean r9 = r0.f1799u
            if (r15 == r9) goto L_0x03c8
            r9 = r4
            goto L_0x03c9
        L_0x03c8:
            r9 = 1
        L_0x03c9:
            androidx.recyclerview.widget.t r15 = r0.f1796r
            android.view.View r14 = r14.f1991a
            int r14 = r15.mo2417c(r14)
            if (r9 != r4) goto L_0x03d5
            int r12 = r12 + r14
            goto L_0x03d6
        L_0x03d5:
            int r13 = r13 + r14
        L_0x03d6:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x03aa
        L_0x03da:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1795q
            r4.f1824k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03fa
            android.view.View r4 = r16.mo1949d1()
            int r4 = r0.mo2170Q(r4)
            r0.mo1967q1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1795q
            r4.f1821h = r12
            r4.f1816c = r5
            r4.mo1975a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1795q
            r0.mo1932Q0(r1, r4, r2, r5)
        L_0x03fa:
            if (r13 <= 0) goto L_0x0415
            android.view.View r4 = r16.mo1947c1()
            int r4 = r0.mo2170Q(r4)
            r0.mo1966p1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1795q
            r4.f1821h = r13
            r4.f1816c = r5
            r4.mo1975a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1795q
            r0.mo1932Q0(r1, r4, r2, r5)
        L_0x0415:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f1795q
            r1.f1824k = r3
        L_0x0419:
            boolean r1 = r2.f1975g
            if (r1 != 0) goto L_0x0426
            androidx.recyclerview.widget.t r1 = r0.f1796r
            int r2 = r1.mo2426l()
            r1.f2215b = r2
            goto L_0x042b
        L_0x0426:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f1790A
            r1.mo1973d()
        L_0x042b:
            boolean r1 = r0.f1800v
            r0.f1797s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1901j0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    /* renamed from: j1 */
    public boolean mo1957j1() {
        return this.f1796r.mo2423i() == 0 && this.f1796r.mo2420f() == 0;
    }

    /* renamed from: k */
    public int mo1958k(RecyclerView.C0419w wVar) {
        return mo1927L0(wVar);
    }

    /* renamed from: k0 */
    public void mo1902k0(RecyclerView.C0419w wVar) {
        this.f1804z = null;
        this.f1802x = -1;
        this.f1803y = Integer.MIN_VALUE;
        this.f1790A.mo1973d();
    }

    /* renamed from: k1 */
    public final void mo1959k1() {
        this.f1799u = (this.f1794p == 1 || !mo1951e1()) ? this.f1798t : !this.f1798t;
    }

    /* renamed from: l */
    public int mo1903l(RecyclerView.C0419w wVar) {
        return mo1928M0(wVar);
    }

    /* renamed from: l0 */
    public void mo1960l0(Parcelable parcelable) {
        if (parcelable instanceof C0384d) {
            this.f1804z = (C0384d) parcelable;
            mo2187u0();
        }
    }

    /* renamed from: l1 */
    public int mo1961l1(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (mo2189x() == 0 || i == 0) {
            return 0;
        }
        mo1931P0();
        this.f1795q.f1814a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo1965o1(i2, abs, true, wVar);
        C0383c cVar = this.f1795q;
        int Q0 = mo1932Q0(rVar, cVar, wVar, false) + cVar.f1820g;
        if (Q0 < 0) {
            return 0;
        }
        if (abs > Q0) {
            i = i2 * Q0;
        }
        this.f1796r.mo2429p(-i);
        this.f1795q.f1823j = i;
        return i;
    }

    /* renamed from: m */
    public int mo1904m(RecyclerView.C0419w wVar) {
        return mo1929N0(wVar);
    }

    /* renamed from: m0 */
    public Parcelable mo1962m0() {
        C0384d dVar = this.f1804z;
        if (dVar != null) {
            return new C0384d(dVar);
        }
        C0384d dVar2 = new C0384d();
        if (mo2189x() > 0) {
            mo1931P0();
            boolean z = this.f1797s ^ this.f1799u;
            dVar2.f1828g = z;
            if (z) {
                View c1 = mo1947c1();
                dVar2.f1827f = this.f1796r.mo2421g() - this.f1796r.mo2416b(c1);
                dVar2.f1826e = mo2170Q(c1);
            } else {
                View d1 = mo1949d1();
                dVar2.f1826e = mo2170Q(d1);
                dVar2.f1827f = this.f1796r.mo2419e(d1) - this.f1796r.mo2425k();
            }
        } else {
            dVar2.f1826e = -1;
        }
        return dVar2;
    }

    /* renamed from: m1 */
    public void mo1963m1(int i) {
        if (i == 0 || i == 1) {
            mo1948d((String) null);
            if (i != this.f1794p || this.f1796r == null) {
                C0474t a = C0474t.m1652a(this, i);
                this.f1796r = a;
                this.f1790A.f1805a = a;
                this.f1794p = i;
                mo2187u0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0131a0.m344a("invalid orientation:", i));
    }

    /* renamed from: n */
    public int mo1964n(RecyclerView.C0419w wVar) {
        return mo1927L0(wVar);
    }

    /* renamed from: n1 */
    public void mo1905n1(boolean z) {
        mo1948d((String) null);
        if (this.f1800v != z) {
            this.f1800v = z;
            mo2187u0();
        }
    }

    /* renamed from: o */
    public int mo1906o(RecyclerView.C0419w wVar) {
        return mo1928M0(wVar);
    }

    /* renamed from: o1 */
    public final void mo1965o1(int i, int i2, boolean z, RecyclerView.C0419w wVar) {
        int i3;
        this.f1795q.f1825l = mo1957j1();
        this.f1795q.f1819f = i;
        int[] iArr = this.f1793D;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo1926J0(wVar, iArr);
        int max = Math.max(0, this.f1793D[0]);
        int max2 = Math.max(0, this.f1793D[1]);
        if (i == 1) {
            z2 = true;
        }
        C0383c cVar = this.f1795q;
        int i5 = z2 ? max2 : max;
        cVar.f1821h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f1822i = max;
        if (z2) {
            cVar.f1821h = this.f1796r.mo2422h() + i5;
            View c1 = mo1947c1();
            C0383c cVar2 = this.f1795q;
            if (this.f1799u) {
                i4 = -1;
            }
            cVar2.f1818e = i4;
            int Q = mo2170Q(c1);
            C0383c cVar3 = this.f1795q;
            cVar2.f1817d = Q + cVar3.f1818e;
            cVar3.f1815b = this.f1796r.mo2416b(c1);
            i3 = this.f1796r.mo2416b(c1) - this.f1796r.mo2421g();
        } else {
            View d1 = mo1949d1();
            C0383c cVar4 = this.f1795q;
            cVar4.f1821h = this.f1796r.mo2425k() + cVar4.f1821h;
            C0383c cVar5 = this.f1795q;
            if (!this.f1799u) {
                i4 = -1;
            }
            cVar5.f1818e = i4;
            int Q2 = mo2170Q(d1);
            C0383c cVar6 = this.f1795q;
            cVar5.f1817d = Q2 + cVar6.f1818e;
            cVar6.f1815b = this.f1796r.mo2419e(d1);
            i3 = (-this.f1796r.mo2419e(d1)) + this.f1796r.mo2425k();
        }
        C0383c cVar7 = this.f1795q;
        cVar7.f1816c = i2;
        if (z) {
            cVar7.f1816c = i2 - i3;
        }
        cVar7.f1820g = i3;
    }

    /* renamed from: p */
    public int mo1907p(RecyclerView.C0419w wVar) {
        return mo1929N0(wVar);
    }

    /* renamed from: p1 */
    public final void mo1966p1(int i, int i2) {
        this.f1795q.f1816c = this.f1796r.mo2421g() - i2;
        C0383c cVar = this.f1795q;
        cVar.f1818e = this.f1799u ? -1 : 1;
        cVar.f1817d = i;
        cVar.f1819f = 1;
        cVar.f1815b = i2;
        cVar.f1820g = Integer.MIN_VALUE;
    }

    /* renamed from: q1 */
    public final void mo1967q1(int i, int i2) {
        this.f1795q.f1816c = i2 - this.f1796r.mo2425k();
        C0383c cVar = this.f1795q;
        cVar.f1817d = i;
        cVar.f1818e = this.f1799u ? 1 : -1;
        cVar.f1819f = -1;
        cVar.f1815b = i2;
        cVar.f1820g = Integer.MIN_VALUE;
    }

    /* renamed from: s */
    public View mo1968s(int i) {
        int x = mo2189x();
        if (x == 0) {
            return null;
        }
        int Q = i - mo2170Q(mo2188w(0));
        if (Q >= 0 && Q < x) {
            View w = mo2188w(Q);
            if (mo2170Q(w) == i) {
                return w;
            }
        }
        return super.mo1968s(i);
    }

    /* renamed from: t */
    public RecyclerView.C0405m mo1910t() {
        return new RecyclerView.C0405m(-2, -2);
    }

    /* renamed from: v0 */
    public int mo1915v0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (this.f1794p == 1) {
            return 0;
        }
        return mo1961l1(i, rVar, wVar);
    }

    /* renamed from: w0 */
    public void mo1969w0(int i) {
        this.f1802x = i;
        this.f1803y = Integer.MIN_VALUE;
        C0384d dVar = this.f1804z;
        if (dVar != null) {
            dVar.f1826e = -1;
        }
        mo2187u0();
    }

    /* renamed from: x0 */
    public int mo1918x0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (this.f1794p == 0) {
            return 0;
        }
        return mo1961l1(i, rVar, wVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0400l.C0404d R = RecyclerView.C0400l.m1290R(context, attributeSet, i, i2);
        mo1963m1(R.f1931a);
        boolean z = R.f1933c;
        mo1948d((String) null);
        if (z != this.f1798t) {
            this.f1798t = z;
            mo2187u0();
        }
        mo1905n1(R.f1934d);
    }
}
