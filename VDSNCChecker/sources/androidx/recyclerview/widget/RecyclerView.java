package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0432a;
import androidx.recyclerview.widget.C0439c;
import androidx.recyclerview.widget.C0442c0;
import androidx.recyclerview.widget.C0446d0;
import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.C0464n;
import androidx.recyclerview.widget.C0479y;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import com.dynamsoft.dbr.EnumBarcodeFormat_2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p034f0.C0887b;
import p058j0.C1052f;
import p058j0.C1053g;
import p058j0.C1061o;
import p058j0.C1069p;
import p058j0.C1070q;
import p064k0.C1150b;
import p088o0.C1491a;
import p099q.C1599h;
import p151z0.C2155a;

public class RecyclerView extends ViewGroup implements C1052f {

    /* renamed from: A0 */
    public static final Interpolator f1829A0 = new C0387b();

    /* renamed from: y0 */
    public static final int[] f1830y0 = {16843830};

    /* renamed from: z0 */
    public static final Class<?>[] f1831z0;

    /* renamed from: A */
    public boolean f1832A;

    /* renamed from: B */
    public int f1833B;

    /* renamed from: C */
    public final AccessibilityManager f1834C;

    /* renamed from: D */
    public boolean f1835D;

    /* renamed from: E */
    public boolean f1836E;

    /* renamed from: F */
    public int f1837F;

    /* renamed from: G */
    public int f1838G;

    /* renamed from: H */
    public C0393h f1839H;

    /* renamed from: I */
    public EdgeEffect f1840I;

    /* renamed from: J */
    public EdgeEffect f1841J;

    /* renamed from: K */
    public EdgeEffect f1842K;

    /* renamed from: L */
    public EdgeEffect f1843L;

    /* renamed from: M */
    public C0394i f1844M;

    /* renamed from: N */
    public int f1845N;

    /* renamed from: O */
    public int f1846O;

    /* renamed from: P */
    public VelocityTracker f1847P;

    /* renamed from: Q */
    public int f1848Q;

    /* renamed from: R */
    public int f1849R;

    /* renamed from: S */
    public int f1850S;

    /* renamed from: T */
    public int f1851T;

    /* renamed from: U */
    public int f1852U;

    /* renamed from: V */
    public C0406n f1853V;

    /* renamed from: W */
    public final int f1854W;

    /* renamed from: a0 */
    public final int f1855a0;

    /* renamed from: b0 */
    public float f1856b0;

    /* renamed from: c0 */
    public float f1857c0;

    /* renamed from: d0 */
    public boolean f1858d0;

    /* renamed from: e */
    public final C0413t f1859e;

    /* renamed from: e0 */
    public final C0421y f1860e0;

    /* renamed from: f */
    public final C0411r f1861f;

    /* renamed from: f0 */
    public C0464n f1862f0;

    /* renamed from: g */
    public C0414u f1863g;

    /* renamed from: g0 */
    public C0464n.C0466b f1864g0;

    /* renamed from: h */
    public C0432a f1865h;

    /* renamed from: h0 */
    public final C0419w f1866h0;

    /* renamed from: i */
    public C0439c f1867i;

    /* renamed from: i0 */
    public C0408p f1868i0;

    /* renamed from: j */
    public final C0446d0 f1869j;

    /* renamed from: j0 */
    public List<C0408p> f1870j0;

    /* renamed from: k */
    public boolean f1871k;

    /* renamed from: k0 */
    public boolean f1872k0;

    /* renamed from: l */
    public final Rect f1873l;

    /* renamed from: l0 */
    public boolean f1874l0;

    /* renamed from: m */
    public final Rect f1875m;

    /* renamed from: m0 */
    public C0394i.C0396b f1876m0;

    /* renamed from: n */
    public final RectF f1877n;

    /* renamed from: n0 */
    public boolean f1878n0;

    /* renamed from: o */
    public C0389d f1879o;

    /* renamed from: o0 */
    public C0479y f1880o0;

    /* renamed from: p */
    public C0400l f1881p;

    /* renamed from: p0 */
    public C0392g f1882p0;

    /* renamed from: q */
    public C0412s f1883q;

    /* renamed from: q0 */
    public final int[] f1884q0;

    /* renamed from: r */
    public final ArrayList<C0399k> f1885r;

    /* renamed from: r0 */
    public C1053g f1886r0;

    /* renamed from: s */
    public final ArrayList<C0407o> f1887s;

    /* renamed from: s0 */
    public final int[] f1888s0;

    /* renamed from: t */
    public C0407o f1889t;

    /* renamed from: t0 */
    public final int[] f1890t0;

    /* renamed from: u */
    public boolean f1891u;

    /* renamed from: u0 */
    public final int[] f1892u0;

    /* renamed from: v */
    public boolean f1893v;

    /* renamed from: v0 */
    public final List<C0422z> f1894v0;

    /* renamed from: w */
    public boolean f1895w;

    /* renamed from: w0 */
    public Runnable f1896w0;

    /* renamed from: x */
    public int f1897x;

    /* renamed from: x0 */
    public final C0446d0.C0448b f1898x0;

    /* renamed from: y */
    public boolean f1899y;

    /* renamed from: z */
    public boolean f1900z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0386a implements Runnable {
        public C0386a() {
        }

        public void run() {
            C0394i iVar = RecyclerView.this.f1844M;
            if (iVar != null) {
                C0456l lVar = (C0456l) iVar;
                boolean z = !lVar.f2123h.isEmpty();
                boolean z2 = !lVar.f2125j.isEmpty();
                boolean z3 = !lVar.f2126k.isEmpty();
                boolean z4 = !lVar.f2124i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<C0422z> it = lVar.f2123h.iterator();
                    while (it.hasNext()) {
                        C0422z next = it.next();
                        View view = next.f1991a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar.f2132q.add(next);
                        animate.setDuration(lVar.f1908d).alpha(0.0f).setListener(new C0451g(lVar, next, animate, view)).start();
                    }
                    lVar.f2123h.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(lVar.f2125j);
                        lVar.f2128m.add(arrayList);
                        lVar.f2125j.clear();
                        C0445d dVar = new C0445d(lVar, arrayList);
                        if (z) {
                            View view2 = ((C0456l.C0458b) arrayList.get(0)).f2140a.f1991a;
                            long j = lVar.f1908d;
                            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                            view2.postOnAnimationDelayed(dVar, j);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(lVar.f2126k);
                        lVar.f2129n.add(arrayList2);
                        lVar.f2126k.clear();
                        C0449e eVar = new C0449e(lVar, arrayList2);
                        if (z) {
                            View view3 = ((C0456l.C0457a) arrayList2.get(0)).f2134a.f1991a;
                            long j2 = lVar.f1908d;
                            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                            view3.postOnAnimationDelayed(eVar, j2);
                        } else {
                            eVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(lVar.f2124i);
                        lVar.f2127l.add(arrayList3);
                        lVar.f2124i.clear();
                        C0450f fVar = new C0450f(lVar, arrayList3);
                        if (z || z2 || z3) {
                            long j3 = 0;
                            long j4 = z ? lVar.f1908d : 0;
                            long j5 = z2 ? lVar.f1909e : 0;
                            if (z3) {
                                j3 = lVar.f1910f;
                            }
                            View view4 = ((C0422z) arrayList3.get(0)).f1991a;
                            WeakHashMap<View, C1070q> weakHashMap3 = C1061o.f3808a;
                            view4.postOnAnimationDelayed(fVar, Math.max(j5, j3) + j4);
                        } else {
                            fVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.f1878n0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public static class C0387b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C0388c implements C0446d0.C0448b {
        public C0388c() {
        }

        /* renamed from: a */
        public void mo2127a(C0422z zVar, C0394i.C0397c cVar, C0394i.C0397c cVar2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            zVar.mo2254t(false);
            C0435a0 a0Var = (C0435a0) recyclerView.f1844M;
            Objects.requireNonNull(a0Var);
            if (cVar == null || ((i = cVar.f1911a) == (i2 = cVar2.f1911a) && cVar.f1912b == cVar2.f1912b)) {
                C0456l lVar = (C0456l) a0Var;
                lVar.mo2392n(zVar);
                zVar.f1991a.setAlpha(0.0f);
                lVar.f2124i.add(zVar);
                z = true;
            } else {
                z = a0Var.mo2337i(zVar, i, cVar.f1912b, i2, cVar2.f1912b);
            }
            if (z) {
                recyclerView.mo2003W();
            }
        }

        /* renamed from: b */
        public void mo2128b(C0422z zVar, C0394i.C0397c cVar, C0394i.C0397c cVar2) {
            boolean z;
            RecyclerView.this.f1861f.mo2217k(zVar);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mo2029f(zVar);
            zVar.mo2254t(false);
            C0435a0 a0Var = (C0435a0) recyclerView.f1844M;
            Objects.requireNonNull(a0Var);
            int i = cVar.f1911a;
            int i2 = cVar.f1912b;
            View view = zVar.f1991a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f1911a;
            int top = cVar2 == null ? view.getTop() : cVar2.f1912b;
            if (zVar.mo2247m() || (i == left && i2 == top)) {
                C0456l lVar = (C0456l) a0Var;
                lVar.mo2392n(zVar);
                lVar.f2123h.add(zVar);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = a0Var.mo2337i(zVar, i, i2, left, top);
            }
            if (z) {
                recyclerView.mo2003W();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public static abstract class C0389d<VH extends C0422z> {

        /* renamed from: a */
        public final C0390e f1903a = new C0390e();

        /* renamed from: b */
        public boolean f1904b = false;

        /* renamed from: a */
        public abstract int mo2129a();

        /* renamed from: b */
        public long mo2130b(int i) {
            return -1;
        }

        /* renamed from: c */
        public abstract void mo2131c(VH vh, int i);

        /* renamed from: d */
        public abstract VH mo2132d(ViewGroup viewGroup, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static class C0390e extends Observable<C0391f> {
        /* renamed from: a */
        public boolean mo2133a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo2134b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0391f) this.mObservers.get(size)).mo2135a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static abstract class C0391f {
        /* renamed from: a */
        public void mo2135a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public interface C0392g {
        /* renamed from: a */
        int mo2136a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0393h {
        /* renamed from: a */
        public EdgeEffect mo2137a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0394i {

        /* renamed from: a */
        public C0396b f1905a = null;

        /* renamed from: b */
        public ArrayList<C0395a> f1906b = new ArrayList<>();

        /* renamed from: c */
        public long f1907c = 120;

        /* renamed from: d */
        public long f1908d = 120;

        /* renamed from: e */
        public long f1909e = 250;

        /* renamed from: f */
        public long f1910f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$a */
        public interface C0395a {
            /* renamed from: a */
            void mo2145a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$b */
        public interface C0396b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$c */
        public static class C0397c {

            /* renamed from: a */
            public int f1911a;

            /* renamed from: b */
            public int f1912b;
        }

        /* renamed from: b */
        public static int m1278b(C0422z zVar) {
            int i = zVar.f2000j & 14;
            if (zVar.mo2245k()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = zVar.f1994d;
            int e = zVar.mo2239e();
            return (i2 == -1 || e == -1 || i2 == e) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo2138a(C0422z zVar, C0422z zVar2, C0397c cVar, C0397c cVar2);

        /* renamed from: c */
        public final void mo2139c(C0422z zVar) {
            C0396b bVar = this.f1905a;
            if (bVar != null) {
                C0398j jVar = (C0398j) bVar;
                Objects.requireNonNull(jVar);
                boolean z = true;
                zVar.mo2254t(true);
                if (zVar.f1998h != null && zVar.f1999i == null) {
                    zVar.f1998h = null;
                }
                zVar.f1999i = null;
                if (!((zVar.f2000j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.f1991a;
                    recyclerView.mo2058i0();
                    C0439c cVar = recyclerView.f1867i;
                    int indexOfChild = ((C0477w) cVar.f2076a).f2220a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        cVar.mo2351l(view);
                    } else if (cVar.f2077b.mo2356d(indexOfChild)) {
                        cVar.f2077b.mo2358f(indexOfChild);
                        cVar.mo2351l(view);
                        ((C0477w) cVar.f2076a).mo2437c(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C0422z L = RecyclerView.m1204L(view);
                        recyclerView.f1861f.mo2217k(L);
                        recyclerView.f1861f.mo2214h(L);
                    }
                    recyclerView.mo2064k0(!z);
                    if (!z && zVar.mo2249o()) {
                        RecyclerView.this.removeDetachedView(zVar.f1991a, false);
                    }
                }
            }
        }

        /* renamed from: d */
        public final void mo2140d() {
            int size = this.f1906b.size();
            for (int i = 0; i < size; i++) {
                this.f1906b.get(i).mo2145a();
            }
            this.f1906b.clear();
        }

        /* renamed from: e */
        public abstract void mo2141e(C0422z zVar);

        /* renamed from: f */
        public abstract void mo2142f();

        /* renamed from: g */
        public abstract boolean mo2143g();

        /* renamed from: h */
        public C0397c mo2144h(C0422z zVar) {
            C0397c cVar = new C0397c();
            View view = zVar.f1991a;
            cVar.f1911a = view.getLeft();
            cVar.f1912b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public class C0398j implements C0394i.C0396b {
        public C0398j() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static abstract class C0399k {
        /* renamed from: d */
        public void mo2146d(Rect rect, View view, RecyclerView recyclerView, C0419w wVar) {
            ((C0405m) view.getLayoutParams()).mo2197a();
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo2147e(Canvas canvas, RecyclerView recyclerView, C0419w wVar) {
        }

        /* renamed from: f */
        public void mo2148f(Canvas canvas, RecyclerView recyclerView, C0419w wVar) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0400l {

        /* renamed from: a */
        public C0439c f1914a;

        /* renamed from: b */
        public RecyclerView f1915b;

        /* renamed from: c */
        public C0442c0 f1916c;

        /* renamed from: d */
        public C0442c0 f1917d;

        /* renamed from: e */
        public C0416v f1918e;

        /* renamed from: f */
        public boolean f1919f = false;

        /* renamed from: g */
        public boolean f1920g = false;

        /* renamed from: h */
        public boolean f1921h = true;

        /* renamed from: i */
        public boolean f1922i = true;

        /* renamed from: j */
        public int f1923j;

        /* renamed from: k */
        public boolean f1924k;

        /* renamed from: l */
        public int f1925l;

        /* renamed from: m */
        public int f1926m;

        /* renamed from: n */
        public int f1927n;

        /* renamed from: o */
        public int f1928o;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public class C0401a implements C0442c0.C0444b {
            public C0401a() {
            }

            /* renamed from: a */
            public View mo2192a(int i) {
                return C0400l.this.mo2188w(i);
            }

            /* renamed from: b */
            public int mo2193b() {
                C0400l lVar = C0400l.this;
                return lVar.f1927n - lVar.mo2168O();
            }

            /* renamed from: c */
            public int mo2194c() {
                return C0400l.this.mo2167N();
            }

            /* renamed from: d */
            public int mo2195d(View view) {
                return C0400l.this.mo2157F(view) + ((C0405m) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: e */
            public int mo2196e(View view) {
                return C0400l.this.mo2152C(view) - ((C0405m) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public class C0402b implements C0442c0.C0444b {
            public C0402b() {
            }

            /* renamed from: a */
            public View mo2192a(int i) {
                return C0400l.this.mo2188w(i);
            }

            /* renamed from: b */
            public int mo2193b() {
                C0400l lVar = C0400l.this;
                return lVar.f1928o - lVar.mo2166M();
            }

            /* renamed from: c */
            public int mo2194c() {
                return C0400l.this.mo2169P();
            }

            /* renamed from: d */
            public int mo2195d(View view) {
                return C0400l.this.mo2149A(view) + ((C0405m) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: e */
            public int mo2196e(View view) {
                return C0400l.this.mo2159G(view) - ((C0405m) view.getLayoutParams()).topMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public interface C0403c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$d */
        public static class C0404d {

            /* renamed from: a */
            public int f1931a;

            /* renamed from: b */
            public int f1932b;

            /* renamed from: c */
            public boolean f1933c;

            /* renamed from: d */
            public boolean f1934d;
        }

        public C0400l() {
            C0401a aVar = new C0401a();
            C0402b bVar = new C0402b();
            this.f1916c = new C0442c0(aVar);
            this.f1917d = new C0442c0(bVar);
        }

        /* renamed from: R */
        public static C0404d m1290R(Context context, AttributeSet attributeSet, int i, int i2) {
            C0404d dVar = new C0404d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2155a.f6217a, i, i2);
            dVar.f1931a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1932b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1933c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1934d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: V */
        public static boolean m1291V(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: h */
        public static int m1292h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m1293y(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0400l.m1293y(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public int mo2149A(View view) {
            return view.getBottom() + ((C0405m) view.getLayoutParams()).f1936b.bottom;
        }

        /* renamed from: A0 */
        public void mo1885A0(Rect rect, int i, int i2) {
            int O = mo2168O() + mo2167N() + rect.width();
            int M = mo2166M() + mo2169P() + rect.height();
            this.f1915b.setMeasuredDimension(m1292h(i, O, mo2165L()), m1292h(i2, M, mo2164K()));
        }

        /* renamed from: B */
        public void mo2150B(View view, Rect rect) {
            int[] iArr = RecyclerView.f1830y0;
            C0405m mVar = (C0405m) view.getLayoutParams();
            Rect rect2 = mVar.f1936b;
            rect.set((view.getLeft() - rect2.left) - mVar.leftMargin, (view.getTop() - rect2.top) - mVar.topMargin, view.getRight() + rect2.right + mVar.rightMargin, view.getBottom() + rect2.bottom + mVar.bottomMargin);
        }

        /* renamed from: B0 */
        public void mo2151B0(int i, int i2) {
            int x = mo2189x();
            if (x == 0) {
                this.f1915b.mo2070o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < x; i7++) {
                View w = mo2188w(i7);
                Rect rect = this.f1915b.f1873l;
                mo2150B(w, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f1915b.f1873l.set(i4, i5, i3, i6);
            mo1885A0(this.f1915b.f1873l, i, i2);
        }

        /* renamed from: C */
        public int mo2152C(View view) {
            return view.getLeft() - ((C0405m) view.getLayoutParams()).f1936b.left;
        }

        /* renamed from: C0 */
        public void mo2153C0(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f1915b = null;
                this.f1914a = null;
                i = 0;
                this.f1927n = 0;
            } else {
                this.f1915b = recyclerView;
                this.f1914a = recyclerView.f1867i;
                this.f1927n = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f1928o = i;
            this.f1925l = EnumBarcodeFormat.BF_MICRO_QR;
            this.f1926m = EnumBarcodeFormat.BF_MICRO_QR;
        }

        /* renamed from: D */
        public int mo2154D(View view) {
            Rect rect = ((C0405m) view.getLayoutParams()).f1936b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: D0 */
        public boolean mo2155D0(View view, int i, int i2, C0405m mVar) {
            return view.isLayoutRequested() || !this.f1921h || !m1291V(view.getWidth(), i, mVar.width) || !m1291V(view.getHeight(), i2, mVar.height);
        }

        /* renamed from: E */
        public int mo2156E(View view) {
            Rect rect = ((C0405m) view.getLayoutParams()).f1936b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: E0 */
        public boolean mo1924E0() {
            return false;
        }

        /* renamed from: F */
        public int mo2157F(View view) {
            return view.getRight() + ((C0405m) view.getLayoutParams()).f1936b.right;
        }

        /* renamed from: F0 */
        public boolean mo2158F0(View view, int i, int i2, C0405m mVar) {
            return !this.f1921h || !m1291V(view.getMeasuredWidth(), i, mVar.width) || !m1291V(view.getMeasuredHeight(), i2, mVar.height);
        }

        /* renamed from: G */
        public int mo2159G(View view) {
            return view.getTop() - ((C0405m) view.getLayoutParams()).f1936b.top;
        }

        /* renamed from: G0 */
        public void mo1925G0(RecyclerView recyclerView, C0419w wVar, int i) {
        }

        /* renamed from: H */
        public View mo2160H() {
            View focusedChild;
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1914a.f2078c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: H0 */
        public void mo2161H0(C0416v vVar) {
            C0416v vVar2 = this.f1918e;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.f1959e)) {
                vVar2.mo2225c();
            }
            this.f1918e = vVar;
            RecyclerView recyclerView = this.f1915b;
            recyclerView.f1860e0.mo2233c();
            vVar.f1956b = recyclerView;
            vVar.f1957c = this;
            int i = vVar.f1955a;
            if (i != -1) {
                recyclerView.f1866h0.f1969a = i;
                vVar.f1959e = true;
                vVar.f1958d = true;
                vVar.f1960f = recyclerView.f1881p.mo1968s(i);
                vVar.f1956b.f1860e0.mo2231a();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: I */
        public int mo2162I() {
            RecyclerView recyclerView = this.f1915b;
            C0389d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo2129a();
            }
            return 0;
        }

        /* renamed from: I0 */
        public boolean mo1887I0() {
            return false;
        }

        /* renamed from: J */
        public int mo2163J() {
            RecyclerView recyclerView = this.f1915b;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return recyclerView.getLayoutDirection();
        }

        /* renamed from: K */
        public int mo2164K() {
            RecyclerView recyclerView = this.f1915b;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return recyclerView.getMinimumHeight();
        }

        /* renamed from: L */
        public int mo2165L() {
            RecyclerView recyclerView = this.f1915b;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return recyclerView.getMinimumWidth();
        }

        /* renamed from: M */
        public int mo2166M() {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: N */
        public int mo2167N() {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: O */
        public int mo2168O() {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: P */
        public int mo2169P() {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: Q */
        public int mo2170Q(View view) {
            return ((C0405m) view.getLayoutParams()).mo2197a();
        }

        /* renamed from: S */
        public int mo1889S(C0411r rVar, C0419w wVar) {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView == null || recyclerView.f1879o == null || !mo1952f()) {
                return 1;
            }
            return this.f1915b.f1879o.mo2129a();
        }

        /* renamed from: T */
        public void mo2171T(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0405m) view.getLayoutParams()).f1936b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1915b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1915b.f1877n;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: U */
        public boolean mo1936U() {
            return false;
        }

        /* renamed from: W */
        public void mo2172W(View view, int i, int i2, int i3, int i4) {
            C0405m mVar = (C0405m) view.getLayoutParams();
            Rect rect = mVar.f1936b;
            view.layout(i + rect.left + mVar.leftMargin, i2 + rect.top + mVar.topMargin, (i3 - rect.right) - mVar.rightMargin, (i4 - rect.bottom) - mVar.bottomMargin);
        }

        /* renamed from: X */
        public void mo2173X(int i) {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                int e = recyclerView.f1867i.mo2344e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f1867i.mo2343d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: Y */
        public void mo2174Y(int i) {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                int e = recyclerView.f1867i.mo2344e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f1867i.mo2343d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: Z */
        public void mo1942Z(RecyclerView recyclerView, C0411r rVar) {
        }

        /* renamed from: a0 */
        public View mo1891a0(View view, int i, C0411r rVar, C0419w wVar) {
            return null;
        }

        /* renamed from: b */
        public void mo2175b(View view) {
            mo2176c(view, -1, false);
        }

        /* renamed from: b0 */
        public void mo1945b0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1915b;
            C0411r rVar = recyclerView.f1861f;
            C0419w wVar = recyclerView.f1866h0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1915b.canScrollVertically(-1) && !this.f1915b.canScrollHorizontally(-1) && !this.f1915b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0389d dVar = this.f1915b.f1879o;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.mo2129a());
                }
            }
        }

        /* renamed from: c */
        public final void mo2176c(View view, int i, boolean z) {
            C0422z L = RecyclerView.m1204L(view);
            if (z || L.mo2247m()) {
                this.f1915b.f1869j.mo2367a(L);
            } else {
                this.f1915b.f1869j.mo2372f(L);
            }
            C0405m mVar = (C0405m) view.getLayoutParams();
            if (L.mo2257v() || L.mo2248n()) {
                if (L.mo2248n()) {
                    L.f2004n.mo2217k(L);
                } else {
                    L.mo2238d();
                }
                this.f1914a.mo2341b(view, i, view.getLayoutParams(), false);
            } else {
                int i2 = -1;
                if (view.getParent() == this.f1915b) {
                    int j = this.f1914a.mo2349j(view);
                    if (i == -1) {
                        i = this.f1914a.mo2344e();
                    }
                    if (j == -1) {
                        StringBuilder a = C0001b.m0a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        a.append(this.f1915b.indexOfChild(view));
                        throw new IllegalStateException(C0436b.m1551a(this.f1915b, a));
                    } else if (j != i) {
                        C0400l lVar = this.f1915b.f1881p;
                        View w = lVar.mo2188w(j);
                        if (w != null) {
                            lVar.mo2188w(j);
                            lVar.f1914a.mo2342c(j);
                            C0405m mVar2 = (C0405m) w.getLayoutParams();
                            C0422z L2 = RecyclerView.m1204L(w);
                            if (L2.mo2247m()) {
                                lVar.f1915b.f1869j.mo2367a(L2);
                            } else {
                                lVar.f1915b.f1869j.mo2372f(L2);
                            }
                            lVar.f1914a.mo2341b(w, i, mVar2, L2.mo2247m());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + lVar.f1915b.toString());
                        }
                    }
                } else {
                    this.f1914a.mo2340a(view, i, false);
                    mVar.f1937c = true;
                    C0416v vVar = this.f1918e;
                    if (vVar != null && vVar.f1959e) {
                        Objects.requireNonNull(vVar.f1956b);
                        C0422z L3 = RecyclerView.m1204L(view);
                        if (L3 != null) {
                            i2 = L3.mo2240f();
                        }
                        if (i2 == vVar.f1955a) {
                            vVar.f1960f = view;
                        }
                    }
                }
            }
            if (mVar.f1938d) {
                L.f1991a.invalidate();
                mVar.f1938d = false;
            }
        }

        /* renamed from: c0 */
        public void mo2177c0(View view, C1150b bVar) {
            C0422z L = RecyclerView.m1204L(view);
            if (L != null && !L.mo2247m() && !this.f1914a.mo2350k(L.f1991a)) {
                RecyclerView recyclerView = this.f1915b;
                mo1892d0(recyclerView.f1861f, recyclerView.f1866h0, view, bVar);
            }
        }

        /* renamed from: d */
        public void mo1948d(String str) {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                recyclerView.mo2057i(str);
            }
        }

        /* renamed from: d0 */
        public void mo1892d0(C0411r rVar, C0419w wVar, View view, C1150b bVar) {
            int i = 0;
            int Q = mo1952f() ? mo2170Q(view) : 0;
            if (mo1950e()) {
                i = mo2170Q(view);
            }
            bVar.mo4769j(C1150b.C1153c.m3389a(Q, 1, i, 1, false, false));
        }

        /* renamed from: e */
        public boolean mo1950e() {
            return false;
        }

        /* renamed from: e0 */
        public void mo1893e0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: f */
        public boolean mo1952f() {
            return false;
        }

        /* renamed from: f0 */
        public void mo1894f0(RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public boolean mo1896g(C0405m mVar) {
            return mVar != null;
        }

        /* renamed from: g0 */
        public void mo1897g0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: h0 */
        public void mo1899h0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: i */
        public void mo1954i(int i, int i2, C0419w wVar, C0403c cVar) {
        }

        /* renamed from: i0 */
        public void mo1900i0(RecyclerView recyclerView, int i, int i2, Object obj) {
        }

        /* renamed from: j */
        public void mo1956j(int i, C0403c cVar) {
        }

        /* renamed from: j0 */
        public void mo1901j0(C0411r rVar, C0419w wVar) {
        }

        /* renamed from: k */
        public int mo1958k(C0419w wVar) {
            return 0;
        }

        /* renamed from: k0 */
        public void mo1902k0(C0419w wVar) {
        }

        /* renamed from: l */
        public int mo1903l(C0419w wVar) {
            return 0;
        }

        /* renamed from: l0 */
        public void mo1960l0(Parcelable parcelable) {
        }

        /* renamed from: m */
        public int mo1904m(C0419w wVar) {
            return 0;
        }

        /* renamed from: m0 */
        public Parcelable mo1962m0() {
            return null;
        }

        /* renamed from: n */
        public int mo1964n(C0419w wVar) {
            return 0;
        }

        /* renamed from: n0 */
        public void mo2178n0(int i) {
        }

        /* renamed from: o */
        public int mo1906o(C0419w wVar) {
            return 0;
        }

        /* renamed from: o0 */
        public void mo2179o0(C0411r rVar) {
            for (int x = mo2189x() - 1; x >= 0; x--) {
                if (!RecyclerView.m1204L(mo2188w(x)).mo2256u()) {
                    mo2184r0(x, rVar);
                }
            }
        }

        /* renamed from: p */
        public int mo1907p(C0419w wVar) {
            return 0;
        }

        /* renamed from: p0 */
        public void mo2180p0(C0411r rVar) {
            int size = rVar.f1945a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = rVar.f1945a.get(i).f1991a;
                C0422z L = RecyclerView.m1204L(view);
                if (!L.mo2256u()) {
                    L.mo2254t(false);
                    if (L.mo2249o()) {
                        this.f1915b.removeDetachedView(view, false);
                    }
                    C0394i iVar = this.f1915b.f1844M;
                    if (iVar != null) {
                        iVar.mo2141e(L);
                    }
                    L.mo2254t(true);
                    C0422z L2 = RecyclerView.m1204L(view);
                    L2.f2004n = null;
                    L2.f2005o = false;
                    L2.mo2238d();
                    rVar.mo2214h(L2);
                }
            }
            rVar.f1945a.clear();
            ArrayList<C0422z> arrayList = rVar.f1946b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1915b.invalidate();
            }
        }

        /* renamed from: q */
        public void mo2181q(C0411r rVar) {
            int x = mo2189x();
            while (true) {
                x--;
                if (x >= 0) {
                    View w = mo2188w(x);
                    C0422z L = RecyclerView.m1204L(w);
                    if (!L.mo2256u()) {
                        if (!L.mo2245k() || L.mo2247m() || this.f1915b.f1879o.f1904b) {
                            mo2188w(x);
                            this.f1914a.mo2342c(x);
                            rVar.mo2215i(w);
                            this.f1915b.f1869j.mo2372f(L);
                        } else {
                            mo2185s0(x);
                            rVar.mo2214h(L);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: q0 */
        public void mo2182q0(View view, C0411r rVar) {
            C0439c cVar = this.f1914a;
            int indexOfChild = ((C0477w) cVar.f2076a).f2220a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (cVar.f2077b.mo2358f(indexOfChild)) {
                    cVar.mo2351l(view);
                }
                ((C0477w) cVar.f2076a).mo2437c(indexOfChild);
            }
            rVar.mo2213g(view);
        }

        /* renamed from: r */
        public View mo2183r(View view) {
            View C;
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView == null || (C = recyclerView.mo1985C(view)) == null || this.f1914a.f2078c.contains(C)) {
                return null;
            }
            return C;
        }

        /* renamed from: r0 */
        public void mo2184r0(int i, C0411r rVar) {
            View w = mo2188w(i);
            mo2185s0(i);
            rVar.mo2213g(w);
        }

        /* renamed from: s */
        public View mo1968s(int i) {
            int x = mo2189x();
            for (int i2 = 0; i2 < x; i2++) {
                View w = mo2188w(i2);
                C0422z L = RecyclerView.m1204L(w);
                if (L != null && L.mo2240f() == i && !L.mo2256u() && (this.f1915b.f1866h0.f1975g || !L.mo2247m())) {
                    return w;
                }
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f1914a;
            r4 = r0.mo2345f(r4);
         */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2185s0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.mo2188w(r4)
                if (r0 == 0) goto L_0x0029
                androidx.recyclerview.widget.c r0 = r3.f1914a
                int r4 = r0.mo2345f(r4)
                androidx.recyclerview.widget.c$b r1 = r0.f2076a
                androidx.recyclerview.widget.w r1 = (androidx.recyclerview.widget.C0477w) r1
                android.view.View r1 = r1.mo2435a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                androidx.recyclerview.widget.c$a r2 = r0.f2077b
                boolean r2 = r2.mo2358f(r4)
                if (r2 == 0) goto L_0x0022
                r0.mo2351l(r1)
            L_0x0022:
                androidx.recyclerview.widget.c$b r0 = r0.f2076a
                androidx.recyclerview.widget.w r0 = (androidx.recyclerview.widget.C0477w) r0
                r0.mo2437c(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0400l.mo2185s0(int):void");
        }

        /* renamed from: t */
        public abstract C0405m mo1910t();

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* renamed from: t0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2186t0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.mo2167N()
                int r4 = r18.mo2169P()
                int r5 = r0.f1927n
                int r6 = r18.mo2168O()
                int r5 = r5 - r6
                int r6 = r0.f1928o
                int r7 = r18.mo2166M()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.mo2163J()
                r11 = 1
                if (r6 != r11) goto L_0x0063
                if (r5 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L_0x006b
            L_0x0063:
                if (r10 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r10 = java.lang.Math.min(r7, r5)
            L_0x006a:
                r5 = r10
            L_0x006b:
                if (r4 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r4 = java.lang.Math.min(r8, r1)
            L_0x0072:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto L_0x00ba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L_0x0083
                goto L_0x00b7
            L_0x0083:
                int r2 = r18.mo2167N()
                int r4 = r18.mo2169P()
                int r5 = r0.f1927n
                int r6 = r18.mo2168O()
                int r5 = r5 - r6
                int r6 = r0.f1928o
                int r7 = r18.mo2166M()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f1915b
                android.graphics.Rect r7 = r7.f1873l
                r0.mo2150B(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto L_0x00b7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto L_0x00b7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto L_0x00b7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r1 = r11
                goto L_0x00b8
            L_0x00b7:
                r1 = r3
            L_0x00b8:
                if (r1 == 0) goto L_0x00bf
            L_0x00ba:
                if (r13 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                return r3
            L_0x00c0:
                if (r22 == 0) goto L_0x00c8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto L_0x00d4
            L_0x00c8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.mo2055h0(r13, r14, r15, r16, r17)
            L_0x00d4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0400l.mo2186t0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: u */
        public C0405m mo1912u(Context context, AttributeSet attributeSet) {
            return new C0405m(context, attributeSet);
        }

        /* renamed from: u0 */
        public void mo2187u0() {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: v */
        public C0405m mo1914v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0405m ? new C0405m((C0405m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0405m((ViewGroup.MarginLayoutParams) layoutParams) : new C0405m(layoutParams);
        }

        /* renamed from: v0 */
        public int mo1915v0(int i, C0411r rVar, C0419w wVar) {
            return 0;
        }

        /* renamed from: w */
        public View mo2188w(int i) {
            C0439c cVar = this.f1914a;
            if (cVar == null) {
                return null;
            }
            return ((C0477w) cVar.f2076a).mo2435a(cVar.mo2345f(i));
        }

        /* renamed from: w0 */
        public void mo1969w0(int i) {
        }

        /* renamed from: x */
        public int mo2189x() {
            C0439c cVar = this.f1914a;
            if (cVar != null) {
                return cVar.mo2344e();
            }
            return 0;
        }

        /* renamed from: x0 */
        public int mo1918x0(int i, C0411r rVar, C0419w wVar) {
            return 0;
        }

        /* renamed from: y0 */
        public void mo2190y0(RecyclerView recyclerView) {
            mo2191z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), EnumBarcodeFormat.BF_MICRO_QR), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), EnumBarcodeFormat.BF_MICRO_QR));
        }

        /* renamed from: z */
        public int mo1921z(C0411r rVar, C0419w wVar) {
            RecyclerView recyclerView = this.f1915b;
            if (recyclerView == null || recyclerView.f1879o == null || !mo1950e()) {
                return 1;
            }
            return this.f1915b.f1879o.mo2129a();
        }

        /* renamed from: z0 */
        public void mo2191z0(int i, int i2) {
            this.f1927n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f1925l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f1830y0;
            }
            this.f1928o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1926m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f1830y0;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static class C0405m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0422z f1935a;

        /* renamed from: b */
        public final Rect f1936b = new Rect();

        /* renamed from: c */
        public boolean f1937c = true;

        /* renamed from: d */
        public boolean f1938d = false;

        public C0405m(int i, int i2) {
            super(i, i2);
        }

        public C0405m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0405m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0405m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0405m(C0405m mVar) {
            super(mVar);
        }

        /* renamed from: a */
        public int mo2197a() {
            return this.f1935a.mo2240f();
        }

        /* renamed from: b */
        public boolean mo2198b() {
            return this.f1935a.mo2250p();
        }

        /* renamed from: c */
        public boolean mo2199c() {
            return this.f1935a.mo2247m();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0406n {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface C0407o {
        /* renamed from: a */
        boolean mo2200a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo2201b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo2202c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C0408p {
        /* renamed from: a */
        public void mo2203a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo2204b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C0409q {

        /* renamed from: a */
        public SparseArray<C0410a> f1939a = new SparseArray<>();

        /* renamed from: b */
        public int f1940b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public static class C0410a {

            /* renamed from: a */
            public final ArrayList<C0422z> f1941a = new ArrayList<>();

            /* renamed from: b */
            public int f1942b = 5;

            /* renamed from: c */
            public long f1943c = 0;

            /* renamed from: d */
            public long f1944d = 0;
        }

        /* renamed from: a */
        public final C0410a mo2205a(int i) {
            C0410a aVar = this.f1939a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0410a aVar2 = new C0410a();
            this.f1939a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public long mo2206b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public final class C0411r {

        /* renamed from: a */
        public final ArrayList<C0422z> f1945a;

        /* renamed from: b */
        public ArrayList<C0422z> f1946b = null;

        /* renamed from: c */
        public final ArrayList<C0422z> f1947c = new ArrayList<>();

        /* renamed from: d */
        public final List<C0422z> f1948d;

        /* renamed from: e */
        public int f1949e;

        /* renamed from: f */
        public int f1950f;

        /* renamed from: g */
        public C0409q f1951g;

        public C0411r() {
            ArrayList<C0422z> arrayList = new ArrayList<>();
            this.f1945a = arrayList;
            this.f1948d = Collections.unmodifiableList(arrayList);
            this.f1949e = 2;
            this.f1950f = 2;
        }

        /* renamed from: a */
        public void mo2207a(C0422z zVar, boolean z) {
            RecyclerView.m1209k(zVar);
            View view = zVar.f1991a;
            C0479y yVar = RecyclerView.this.f1880o0;
            if (yVar != null) {
                C0479y.C0480a aVar = yVar.f2223e;
                C1061o.m3034o(view, aVar instanceof C0479y.C0480a ? aVar.f2225e.remove(view) : null);
            }
            if (z) {
                C0412s sVar = RecyclerView.this.f1883q;
                if (sVar != null) {
                    sVar.mo2219a(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                C0389d dVar = recyclerView.f1879o;
                if (recyclerView.f1866h0 != null) {
                    recyclerView.f1869j.mo2373g(zVar);
                }
            }
            zVar.f2008r = null;
            C0409q d = mo2210d();
            Objects.requireNonNull(d);
            int i = zVar.f1996f;
            ArrayList<C0422z> arrayList = d.mo2205a(i).f1941a;
            if (d.f1939a.get(i).f1942b > arrayList.size()) {
                zVar.mo2252r();
                arrayList.add(zVar);
            }
        }

        /* renamed from: b */
        public void mo2208b() {
            this.f1945a.clear();
            mo2211e();
        }

        /* renamed from: c */
        public int mo2209c(int i) {
            if (i < 0 || i >= RecyclerView.this.f1866h0.mo2229b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f1866h0.mo2229b());
                throw new IndexOutOfBoundsException(C0436b.m1551a(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f1866h0.f1975g) {
                return i;
            }
            return recyclerView.f1865h.mo2326f(i, 0);
        }

        /* renamed from: d */
        public C0409q mo2210d() {
            if (this.f1951g == null) {
                this.f1951g = new C0409q();
            }
            return this.f1951g;
        }

        /* renamed from: e */
        public void mo2211e() {
            for (int size = this.f1947c.size() - 1; size >= 0; size--) {
                mo2212f(size);
            }
            this.f1947c.clear();
            int[] iArr = RecyclerView.f1830y0;
            C0464n.C0466b bVar = RecyclerView.this.f1864g0;
            int[] iArr2 = bVar.f2189c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2190d = 0;
        }

        /* renamed from: f */
        public void mo2212f(int i) {
            mo2207a(this.f1947c.get(i), true);
            this.f1947c.remove(i);
        }

        /* renamed from: g */
        public void mo2213g(View view) {
            C0422z L = RecyclerView.m1204L(view);
            if (L.mo2249o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (L.mo2248n()) {
                L.f2004n.mo2217k(L);
            } else if (L.mo2257v()) {
                L.mo2238d();
            }
            mo2214h(L);
            if (RecyclerView.this.f1844M != null && !L.mo2246l()) {
                RecyclerView.this.f1844M.mo2141e(L);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2214h(androidx.recyclerview.widget.RecyclerView.C0422z r7) {
            /*
                r6 = this;
                boolean r0 = r7.mo2248n()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00cf
                android.view.View r0 = r7.f1991a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00cf
            L_0x0012:
                boolean r0 = r7.mo2249o()
                if (r0 != 0) goto L_0x00b6
                boolean r0 = r7.mo2256u()
                if (r0 != 0) goto L_0x00a4
                int r0 = r7.f2000j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r7.f1991a
                java.util.WeakHashMap<android.view.View, j0.q> r3 = p058j0.C1061o.f3808a
                boolean r0 = r0.hasTransientState()
                if (r0 == 0) goto L_0x0030
                r0 = r2
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r3 = r3.f1879o
                boolean r3 = r7.mo2246l()
                if (r3 == 0) goto L_0x0092
                int r3 = r6.f1950f
                if (r3 <= 0) goto L_0x0088
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.mo2242h(r3)
                if (r3 != 0) goto L_0x0088
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r6.f1947c
                int r3 = r3.size()
                int r4 = r6.f1950f
                if (r3 < r4) goto L_0x0058
                if (r3 <= 0) goto L_0x0058
                r6.mo2212f(r1)
                int r3 = r3 + -1
            L_0x0058:
                int[] r4 = androidx.recyclerview.widget.RecyclerView.f1830y0
                if (r3 <= 0) goto L_0x0081
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.n$b r4 = r4.f1864g0
                int r5 = r7.f1993c
                boolean r4 = r4.mo2411c(r5)
                if (r4 != 0) goto L_0x0081
            L_0x0068:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0080
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r6.f1947c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r4 = (androidx.recyclerview.widget.RecyclerView.C0422z) r4
                int r4 = r4.f1993c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.n$b r5 = r5.f1864g0
                boolean r4 = r5.mo2411c(r4)
                if (r4 != 0) goto L_0x0068
            L_0x0080:
                int r3 = r3 + r2
            L_0x0081:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r6.f1947c
                r4.add(r3, r7)
                r3 = r2
                goto L_0x0089
            L_0x0088:
                r3 = r1
            L_0x0089:
                if (r3 != 0) goto L_0x008f
                r6.mo2207a(r7, r2)
                r1 = r2
            L_0x008f:
                r2 = r1
                r1 = r3
                goto L_0x0093
            L_0x0092:
                r2 = r1
            L_0x0093:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.d0 r3 = r3.f1869j
                r3.mo2373g(r7)
                if (r1 != 0) goto L_0x00a3
                if (r2 != 0) goto L_0x00a3
                if (r0 == 0) goto L_0x00a3
                r0 = 0
                r7.f2008r = r0
            L_0x00a3:
                return
            L_0x00a4:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.C0436b.m1551a(r1, r0)
                r7.<init>(r0)
                throw r7
            L_0x00b6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = androidx.recyclerview.widget.C0436b.m1551a(r7, r1)
                r0.<init>(r7)
                throw r0
            L_0x00cf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = p000a.C0001b.m0a(r3)
                boolean r4 = r7.mo2248n()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.f1991a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L_0x00ec
                r1 = r2
            L_0x00ec:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r7 = androidx.recyclerview.widget.C0436b.m1551a(r7, r3)
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0411r.mo2214h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2215i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.m1204L(r5)
                r0 = 12
                boolean r0 = r5.mo2242h(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0055
                boolean r0 = r5.mo2250p()
                if (r0 == 0) goto L_0x0055
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.f1844M
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.util.List r3 = r5.mo2241g()
                androidx.recyclerview.widget.l r0 = (androidx.recyclerview.widget.C0456l) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0039
                boolean r0 = r0.f2071g
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5.mo2245k()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = r1
                goto L_0x0034
            L_0x0033:
                r0 = r2
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r1
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r1
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0055
            L_0x0043:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1946b
                if (r0 != 0) goto L_0x004e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1946b = r0
            L_0x004e:
                r5.f2004n = r4
                r5.f2005o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1946b
                goto L_0x0082
            L_0x0055:
                boolean r0 = r5.mo2245k()
                if (r0 == 0) goto L_0x007c
                boolean r0 = r5.mo2247m()
                if (r0 != 0) goto L_0x007c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.f1879o
                boolean r0 = r0.f1904b
                if (r0 == 0) goto L_0x006a
                goto L_0x007c
            L_0x006a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.C0436b.m1551a(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007c:
                r5.f2004n = r4
                r5.f2005o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1945a
            L_0x0082:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0411r.mo2215i(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e5, code lost:
            if (r7.f1996f != 0) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0447, code lost:
            if (r7.mo2245k() == false) goto L_0x047d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x047b, code lost:
            if ((r10 == 0 || r10 + r8 < r18) == false) goto L_0x047d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x040f  */
        /* JADX WARNING: Removed duplicated region for block: B:218:0x0430  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x0433  */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x0532  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x0539  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0422z mo2216j(int r16, boolean r17, long r18) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                if (r0 < 0) goto L_0x055b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1866h0
                int r2 = r2.mo2229b()
                if (r0 >= r2) goto L_0x055b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1866h0
                boolean r2 = r2.f1975g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r1.f1946b
                if (r2 == 0) goto L_0x0085
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0026
                goto L_0x0085
            L_0x0026:
                r6 = r5
            L_0x0027:
                if (r6 >= r2) goto L_0x0044
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1946b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0422z) r7
                boolean r8 = r7.mo2257v()
                if (r8 != 0) goto L_0x0041
                int r8 = r7.mo2240f()
                if (r8 != r0) goto L_0x0041
                r7.mo2236b(r3)
                goto L_0x0086
            L_0x0041:
                int r6 = r6 + 1
                goto L_0x0027
            L_0x0044:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r6.f1879o
                boolean r7 = r7.f1904b
                if (r7 == 0) goto L_0x0085
                androidx.recyclerview.widget.a r6 = r6.f1865h
                int r6 = r6.mo2326f(r0, r5)
                if (r6 <= 0) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f1879o
                int r7 = r7.mo2129a()
                if (r6 >= r7) goto L_0x0085
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f1879o
                long r6 = r7.mo2130b(r6)
                r8 = r5
            L_0x0067:
                if (r8 >= r2) goto L_0x0085
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1946b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0422z) r9
                boolean r10 = r9.mo2257v()
                if (r10 != 0) goto L_0x0082
                long r10 = r9.f1995e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0082
                r9.mo2236b(r3)
                r7 = r9
                goto L_0x0086
            L_0x0082:
                int r8 = r8 + 1
                goto L_0x0067
            L_0x0085:
                r7 = r4
            L_0x0086:
                if (r7 == 0) goto L_0x008b
                r2 = 1
                goto L_0x008c
            L_0x008a:
                r7 = r4
            L_0x008b:
                r2 = r5
            L_0x008c:
                r6 = -1
                if (r7 != 0) goto L_0x0244
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1945a
                int r7 = r7.size()
                r8 = r5
            L_0x0096:
                if (r8 >= r7) goto L_0x00c8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1945a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0422z) r9
                boolean r10 = r9.mo2257v()
                if (r10 != 0) goto L_0x00c5
                int r10 = r9.mo2240f()
                if (r10 != r0) goto L_0x00c5
                boolean r10 = r9.mo2245k()
                if (r10 != 0) goto L_0x00c5
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r10.f1866h0
                boolean r10 = r10.f1975g
                if (r10 != 0) goto L_0x00c0
                boolean r10 = r9.mo2247m()
                if (r10 != 0) goto L_0x00c5
            L_0x00c0:
                r9.mo2236b(r3)
                goto L_0x01b3
            L_0x00c5:
                int r8 = r8 + 1
                goto L_0x0096
            L_0x00c8:
                if (r17 != 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r7 = r7.f1867i
                java.util.List<android.view.View> r8 = r7.f2078c
                int r8 = r8.size()
                r9 = r5
            L_0x00d5:
                if (r9 >= r8) goto L_0x0100
                java.util.List<android.view.View> r10 = r7.f2078c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.c$b r11 = r7.f2076a
                androidx.recyclerview.widget.w r11 = (androidx.recyclerview.widget.C0477w) r11
                java.util.Objects.requireNonNull(r11)
                androidx.recyclerview.widget.RecyclerView$z r11 = androidx.recyclerview.widget.RecyclerView.m1204L(r10)
                int r12 = r11.mo2240f()
                if (r12 != r0) goto L_0x00fd
                boolean r12 = r11.mo2245k()
                if (r12 != 0) goto L_0x00fd
                boolean r11 = r11.mo2247m()
                if (r11 != 0) goto L_0x00fd
                goto L_0x0101
            L_0x00fd:
                int r9 = r9 + 1
                goto L_0x00d5
            L_0x0100:
                r10 = r4
            L_0x0101:
                if (r10 == 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView$z r7 = androidx.recyclerview.widget.RecyclerView.m1204L(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f1867i
                androidx.recyclerview.widget.c$b r9 = r8.f2076a
                androidx.recyclerview.widget.w r9 = (androidx.recyclerview.widget.C0477w) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f2220a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0172
                androidx.recyclerview.widget.c$a r11 = r8.f2077b
                boolean r11 = r11.mo2356d(r9)
                if (r11 == 0) goto L_0x015b
                androidx.recyclerview.widget.c$a r11 = r8.f2077b
                r11.mo2353a(r9)
                r8.mo2351l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f1867i
                int r8 = r8.mo2349j(r10)
                if (r8 == r6) goto L_0x0142
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r9 = r9.f1867i
                r9.mo2342c(r8)
                r15.mo2215i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.mo2236b(r8)
                goto L_0x01b9
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.C0436b.m1551a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0172:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0189:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1947c
                int r7 = r7.size()
                r8 = r5
            L_0x0190:
                if (r8 >= r7) goto L_0x01b8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1947c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0422z) r9
                boolean r10 = r9.mo2245k()
                if (r10 != 0) goto L_0x01b5
                int r10 = r9.mo2240f()
                if (r10 != r0) goto L_0x01b5
                boolean r10 = r9.mo2243i()
                if (r10 != 0) goto L_0x01b5
                if (r17 != 0) goto L_0x01b3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1947c
                r7.remove(r8)
            L_0x01b3:
                r7 = r9
                goto L_0x01b9
            L_0x01b5:
                int r8 = r8 + 1
                goto L_0x0190
            L_0x01b8:
                r7 = r4
            L_0x01b9:
                if (r7 == 0) goto L_0x0244
                boolean r8 = r7.mo2247m()
                if (r8 == 0) goto L_0x01c8
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f1866h0
                boolean r8 = r8.f1975g
                goto L_0x0200
            L_0x01c8:
                int r8 = r7.f1993c
                if (r8 < 0) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r9 = r9.f1879o
                int r9 = r9.mo2129a()
                if (r8 >= r9) goto L_0x022b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r8.f1866h0
                boolean r9 = r9.f1975g
                if (r9 != 0) goto L_0x01e8
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f1879o
                java.util.Objects.requireNonNull(r8)
                int r8 = r7.f1996f
                if (r8 == 0) goto L_0x01e8
                goto L_0x01fd
            L_0x01e8:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f1879o
                boolean r9 = r8.f1904b
                if (r9 == 0) goto L_0x01ff
                long r9 = r7.f1995e
                int r11 = r7.f1993c
                long r11 = r8.mo2130b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fd
                goto L_0x01ff
            L_0x01fd:
                r8 = r5
                goto L_0x0200
            L_0x01ff:
                r8 = 1
            L_0x0200:
                if (r8 != 0) goto L_0x0229
                if (r17 != 0) goto L_0x0227
                r8 = 4
                r7.mo2236b(r8)
                boolean r8 = r7.mo2248n()
                if (r8 == 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f1991a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$r r8 = r7.f2004n
                r8.mo2217k(r7)
                goto L_0x0224
            L_0x021b:
                boolean r8 = r7.mo2257v()
                if (r8 == 0) goto L_0x0224
                r7.mo2238d()
            L_0x0224:
                r15.mo2214h(r7)
            L_0x0227:
                r7 = r4
                goto L_0x0244
            L_0x0229:
                r2 = 1
                goto L_0x0244
            L_0x022b:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.C0436b.m1551a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0244:
                r8 = 2
                if (r7 != 0) goto L_0x03f2
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r11 = r11.f1865h
                int r11 = r11.mo2326f(r0, r5)
                if (r11 < 0) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1879o
                int r12 = r12.mo2129a()
                if (r11 >= r12) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1879o
                java.util.Objects.requireNonNull(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1879o
                boolean r13 = r12.f1904b
                if (r13 == 0) goto L_0x0300
                long r12 = r12.mo2130b(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1945a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0275:
                if (r7 < 0) goto L_0x02c8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r14 = r1.f1945a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C0422z) r14
                long r9 = r14.f1995e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02c5
                boolean r9 = r14.mo2257v()
                if (r9 != 0) goto L_0x02c5
                int r9 = r14.f1996f
                if (r9 != 0) goto L_0x02a7
                r14.mo2236b(r3)
                boolean r3 = r14.mo2247m()
                if (r3 == 0) goto L_0x02a5
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1866h0
                boolean r3 = r3.f1975g
                if (r3 != 0) goto L_0x02a5
                r3 = 14
                r14.mo2253s(r8, r3)
            L_0x02a5:
                r7 = r14
                goto L_0x02fb
            L_0x02a7:
                if (r17 != 0) goto L_0x02c5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1945a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r14.f1991a
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r14.f1991a
                androidx.recyclerview.widget.RecyclerView$z r9 = androidx.recyclerview.widget.RecyclerView.m1204L(r9)
                r9.f2004n = r4
                r9.f2005o = r5
                r9.mo2238d()
                r15.mo2214h(r9)
            L_0x02c5:
                int r7 = r7 + -1
                goto L_0x0275
            L_0x02c8:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f1947c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02cf:
                if (r3 < 0) goto L_0x02fa
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1947c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0422z) r7
                long r9 = r7.f1995e
                int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r9 != 0) goto L_0x02f7
                boolean r9 = r7.mo2243i()
                if (r9 != 0) goto L_0x02f7
                int r9 = r7.f1996f
                if (r9 != 0) goto L_0x02f1
                if (r17 != 0) goto L_0x02fb
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1947c
                r9.remove(r3)
                goto L_0x02fb
            L_0x02f1:
                if (r17 != 0) goto L_0x02f7
                r15.mo2212f(r3)
                goto L_0x02fa
            L_0x02f7:
                int r3 = r3 + -1
                goto L_0x02cf
            L_0x02fa:
                r7 = r4
            L_0x02fb:
                if (r7 == 0) goto L_0x0300
                r7.f1993c = r11
                r2 = 1
            L_0x0300:
                if (r7 != 0) goto L_0x0340
                androidx.recyclerview.widget.RecyclerView$q r3 = r15.mo2210d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r3 = r3.f1939a
                java.lang.Object r3 = r3.get(r5)
                androidx.recyclerview.widget.RecyclerView$q$a r3 = (androidx.recyclerview.widget.RecyclerView.C0409q.C0410a) r3
                if (r3 == 0) goto L_0x0337
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r3.f1941a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0337
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r3.f1941a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x031f:
                if (r7 < 0) goto L_0x0337
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.C0422z) r6
                boolean r6 = r6.mo2243i()
                if (r6 != 0) goto L_0x0334
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.C0422z) r3
                goto L_0x0338
            L_0x0334:
                int r7 = r7 + -1
                goto L_0x031f
            L_0x0337:
                r3 = r4
            L_0x0338:
                if (r3 == 0) goto L_0x033f
                r3.mo2252r()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.f1830y0
            L_0x033f:
                r7 = r3
            L_0x0340:
                if (r7 != 0) goto L_0x03f2
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x036b
                androidx.recyclerview.widget.RecyclerView$q r3 = r1.f1951g
                androidx.recyclerview.widget.RecyclerView$q$a r3 = r3.mo2205a(r5)
                long r9 = r3.f1943c
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x0367
                long r9 = r9 + r6
                int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                if (r3 >= 0) goto L_0x0365
                goto L_0x0367
            L_0x0365:
                r3 = r5
                goto L_0x0368
            L_0x0367:
                r3 = 1
            L_0x0368:
                if (r3 != 0) goto L_0x036b
                return r4
            L_0x036b:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r3.f1879o
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "RV CreateView"
                int r10 = p034f0.C0887b.f3352a     // Catch:{ all -> 0x03ba }
                android.os.Trace.beginSection(r9)     // Catch:{ all -> 0x03ba }
                androidx.recyclerview.widget.RecyclerView$z r3 = r4.mo2132d(r3, r5)     // Catch:{ all -> 0x03ba }
                android.view.View r4 = r3.f1991a     // Catch:{ all -> 0x03ba }
                android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x03ba }
                if (r4 != 0) goto L_0x03b2
                r3.f1996f = r5     // Catch:{ all -> 0x03ba }
                android.os.Trace.endSection()
                int[] r4 = androidx.recyclerview.widget.RecyclerView.f1830y0
                android.view.View r4 = r3.f1991a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.m1203F(r4)
                if (r4 == 0) goto L_0x039b
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r4)
                r3.f1992b = r9
            L_0x039b:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f1951g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$q$a r6 = r4.mo2205a(r5)
                long r11 = r6.f1943c
                long r9 = r4.mo2206b(r11, r9)
                r6.f1943c = r9
                r7 = r3
                goto L_0x03f2
            L_0x03b2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03ba }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03ba }
                throw r0     // Catch:{ all -> 0x03ba }
            L_0x03ba:
                r0 = move-exception
                int r2 = p034f0.C0887b.f3352a
                android.os.Trace.endSection()
                throw r0
            L_0x03c1:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1866h0
                int r0 = r0.mo2229b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.C0436b.m1551a(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03f2:
                if (r2 == 0) goto L_0x0422
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1866h0
                boolean r3 = r3.f1975g
                if (r3 != 0) goto L_0x0422
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r4 = r7.mo2242h(r3)
                if (r4 == 0) goto L_0x0422
                r7.mo2253s(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1866h0
                boolean r3 = r3.f1978j
                if (r3 == 0) goto L_0x0422
                androidx.recyclerview.widget.RecyclerView.C0394i.m1278b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r3 = r3.f1844M
                r7.mo2241g()
                androidx.recyclerview.widget.RecyclerView$i$c r3 = r3.mo2144h(r7)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.mo2006Z(r7, r3)
            L_0x0422:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1866h0
                boolean r3 = r3.f1975g
                if (r3 == 0) goto L_0x0433
                boolean r3 = r7.mo2244j()
                if (r3 == 0) goto L_0x0433
                r7.f1997g = r0
                goto L_0x047d
            L_0x0433:
                boolean r3 = r7.mo2244j()
                if (r3 == 0) goto L_0x0449
                int r3 = r7.f2000j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0440
                r3 = 1
                goto L_0x0441
            L_0x0440:
                r3 = r5
            L_0x0441:
                if (r3 != 0) goto L_0x0449
                boolean r3 = r7.mo2245k()
                if (r3 == 0) goto L_0x047d
            L_0x0449:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f1865h
                int r3 = r3.mo2326f(r0, r5)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f2008r = r4
                int r6 = r7.f1996f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x0481
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f1951g
                androidx.recyclerview.widget.RecyclerView$q$a r4 = r4.mo2205a(r6)
                long r10 = r4.f1944d
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x047a
                long r10 = r10 + r8
                int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                if (r4 >= 0) goto L_0x0478
                goto L_0x047a
            L_0x0478:
                r4 = r5
                goto L_0x047b
            L_0x047a:
                r4 = 1
            L_0x047b:
                if (r4 != 0) goto L_0x0481
            L_0x047d:
                r0 = 1
                r3 = r5
                goto L_0x052a
            L_0x0481:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r4.f1879o
                java.util.Objects.requireNonNull(r4)
                r7.f1993c = r3
                boolean r6 = r4.f1904b
                if (r6 == 0) goto L_0x0494
                long r10 = r4.mo2130b(r3)
                r7.f1995e = r10
            L_0x0494:
                r6 = 519(0x207, float:7.27E-43)
                r10 = 1
                r7.mo2253s(r10, r6)
                int r6 = p034f0.C0887b.f3352a
                java.lang.String r6 = "RV OnBindView"
                android.os.Trace.beginSection(r6)
                r7.mo2241g()
                r4.mo2131c(r7, r3)
                java.util.List<java.lang.Object> r3 = r7.f2001k
                if (r3 == 0) goto L_0x04ae
                r3.clear()
            L_0x04ae:
                int r3 = r7.f2000j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f2000j = r3
                android.view.View r3 = r7.f1991a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.C0405m
                if (r4 == 0) goto L_0x04c3
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.C0405m) r3
                r4 = 1
                r3.f1937c = r4
            L_0x04c3:
                android.os.Trace.endSection()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r6 = r1.f1951g
                int r10 = r7.f1996f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$q$a r8 = r6.mo2205a(r10)
                long r9 = r8.f1944d
                long r3 = r6.mo2206b(r9, r3)
                r8.f1944d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f1834C
                if (r3 == 0) goto L_0x04eb
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x04eb
                r3 = 1
                goto L_0x04ec
            L_0x04eb:
                r3 = r5
            L_0x04ec:
                if (r3 == 0) goto L_0x051e
                android.view.View r3 = r7.f1991a
                java.util.WeakHashMap<android.view.View, j0.q> r4 = p058j0.C1061o.f3808a
                int r4 = r3.getImportantForAccessibility()
                r6 = 1
                if (r4 != 0) goto L_0x04fc
                r3.setImportantForAccessibility(r6)
            L_0x04fc:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.y r4 = r4.f1880o0
                if (r4 != 0) goto L_0x0503
                goto L_0x051c
            L_0x0503:
                androidx.recyclerview.widget.y$a r4 = r4.f2223e
                boolean r8 = r4 instanceof androidx.recyclerview.widget.C0479y.C0480a
                if (r8 == 0) goto L_0x0519
                java.util.Objects.requireNonNull(r4)
                j0.a r8 = p058j0.C1061o.m3024e(r3)
                if (r8 == 0) goto L_0x0519
                if (r8 == r4) goto L_0x0519
                java.util.Map<android.view.View, j0.a> r9 = r4.f2225e
                r9.put(r3, r8)
            L_0x0519:
                p058j0.C1061o.m3034o(r3, r4)
            L_0x051c:
                r3 = r6
                goto L_0x051f
            L_0x051e:
                r3 = 1
            L_0x051f:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r4 = r4.f1866h0
                boolean r4 = r4.f1975g
                if (r4 == 0) goto L_0x0529
                r7.f1997g = r0
            L_0x0529:
                r0 = r3
            L_0x052a:
                android.view.View r4 = r7.f1991a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x0539
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                goto L_0x0547
            L_0x0539:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x054f
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
            L_0x0547:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.C0405m) r4
                android.view.View r6 = r7.f1991a
                r6.setLayoutParams(r4)
                goto L_0x0551
            L_0x054f:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.C0405m) r4
            L_0x0551:
                r4.f1935a = r7
                if (r2 == 0) goto L_0x0558
                if (r3 == 0) goto L_0x0558
                r5 = r0
            L_0x0558:
                r4.f1938d = r5
                return r7
            L_0x055b:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1866h0
                int r0 = r0.mo2229b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.C0436b.m1551a(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0411r.mo2216j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        /* renamed from: k */
        public void mo2217k(C0422z zVar) {
            (zVar.f2005o ? this.f1946b : this.f1945a).remove(zVar);
            zVar.f2004n = null;
            zVar.f2005o = false;
            zVar.mo2238d();
        }

        /* renamed from: l */
        public void mo2218l() {
            C0400l lVar = RecyclerView.this.f1881p;
            this.f1950f = this.f1949e + (lVar != null ? lVar.f1923j : 0);
            for (int size = this.f1947c.size() - 1; size >= 0 && this.f1947c.size() > this.f1950f; size--) {
                mo2212f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0412s {
        /* renamed from: a */
        void mo2219a(C0422z zVar);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public class C0413t extends C0391f {
        public C0413t() {
        }

        /* renamed from: a */
        public void mo2135a() {
            RecyclerView.this.mo2057i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1866h0.f1974f = true;
            recyclerView.mo2005Y(true);
            if (!RecyclerView.this.f1865h.mo2327g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0414u extends C1491a {
        public static final Parcelable.Creator<C0414u> CREATOR = new C0415a();

        /* renamed from: g */
        public Parcelable f1954g;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class C0415a implements Parcelable.ClassLoaderCreator<C0414u> {
            public Object createFromParcel(Parcel parcel) {
                return new C0414u(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0414u[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0414u(parcel, classLoader);
            }
        }

        public C0414u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1954g = parcel.readParcelable(classLoader == null ? C0400l.class.getClassLoader() : classLoader);
        }

        public C0414u(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeParcelable(this.f1954g, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class C0416v {

        /* renamed from: a */
        public int f1955a = -1;

        /* renamed from: b */
        public RecyclerView f1956b;

        /* renamed from: c */
        public C0400l f1957c;

        /* renamed from: d */
        public boolean f1958d;

        /* renamed from: e */
        public boolean f1959e;

        /* renamed from: f */
        public View f1960f;

        /* renamed from: g */
        public final C0417a f1961g = new C0417a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C0417a {

            /* renamed from: a */
            public int f1962a;

            /* renamed from: b */
            public int f1963b;

            /* renamed from: c */
            public int f1964c;

            /* renamed from: d */
            public int f1965d = -1;

            /* renamed from: e */
            public Interpolator f1966e;

            /* renamed from: f */
            public boolean f1967f = false;

            /* renamed from: g */
            public int f1968g = 0;

            public C0417a(int i, int i2) {
                this.f1962a = i;
                this.f1963b = i2;
                this.f1964c = Integer.MIN_VALUE;
                this.f1966e = null;
            }

            /* renamed from: a */
            public void mo2226a(RecyclerView recyclerView) {
                int i = this.f1965d;
                if (i >= 0) {
                    this.f1965d = -1;
                    recyclerView.mo1997Q(i);
                    this.f1967f = false;
                } else if (this.f1967f) {
                    Interpolator interpolator = this.f1966e;
                    if (interpolator == null || this.f1964c >= 1) {
                        int i2 = this.f1964c;
                        if (i2 >= 1) {
                            recyclerView.f1860e0.mo2232b(this.f1962a, this.f1963b, i2, interpolator);
                            this.f1968g++;
                            this.f1967f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1968g = 0;
                }
            }

            /* renamed from: b */
            public void mo2227b(int i, int i2, int i3, Interpolator interpolator) {
                this.f1962a = i;
                this.f1963b = i2;
                this.f1964c = i3;
                this.f1966e = interpolator;
                this.f1967f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$b */
        public interface C0418b {
            /* renamed from: a */
            PointF mo1943a(int i);
        }

        /* renamed from: a */
        public void mo2223a(int i, int i2) {
            C0400l lVar;
            RecyclerView recyclerView = this.f1956b;
            int i3 = -1;
            if (this.f1955a == -1 || recyclerView == null) {
                mo2225c();
            }
            PointF pointF = null;
            if (this.f1958d && this.f1960f == null && (lVar = this.f1957c) != null) {
                PointF a = lVar instanceof C0418b ? ((C0418b) lVar).mo1943a(this.f1955a) : null;
                if (a != null) {
                    float f = a.x;
                    if (!(f == 0.0f && a.y == 0.0f)) {
                        recyclerView.mo2028e0((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                    }
                }
            }
            boolean z = false;
            this.f1958d = false;
            View view = this.f1960f;
            if (view != null) {
                Objects.requireNonNull(this.f1956b);
                C0422z L = RecyclerView.m1204L(view);
                if (L != null) {
                    i3 = L.mo2240f();
                }
                if (i3 == this.f1955a) {
                    mo2224b(this.f1960f, recyclerView.f1866h0, this.f1961g);
                    this.f1961g.mo2226a(recyclerView);
                    mo2225c();
                } else {
                    this.f1960f = null;
                }
            }
            if (this.f1959e) {
                C0419w wVar = recyclerView.f1866h0;
                C0417a aVar = this.f1961g;
                C0469p pVar = (C0469p) this;
                if (pVar.f1956b.f1881p.mo2189x() == 0) {
                    pVar.mo2225c();
                } else {
                    int i4 = pVar.f2211n;
                    int i5 = i4 - i;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    pVar.f2211n = i5;
                    int i6 = pVar.f2212o;
                    int i7 = i6 - i2;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    pVar.f2212o = i7;
                    if (i5 == 0 && i7 == 0) {
                        int i8 = pVar.f1955a;
                        C0400l lVar2 = pVar.f1957c;
                        if (lVar2 instanceof C0418b) {
                            pointF = ((C0418b) lVar2).mo1943a(i8);
                        }
                        if (pointF != null) {
                            float f2 = pointF.x;
                            if (!(f2 == 0.0f && pointF.y == 0.0f)) {
                                float f3 = pointF.y;
                                float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                                float f4 = pointF.x / sqrt;
                                pointF.x = f4;
                                float f5 = pointF.y / sqrt;
                                pointF.y = f5;
                                pVar.f2207j = pointF;
                                pVar.f2211n = (int) (f4 * 10000.0f);
                                pVar.f2212o = (int) (f5 * 10000.0f);
                                aVar.mo2227b((int) (((float) pVar.f2211n) * 1.2f), (int) (((float) pVar.f2212o) * 1.2f), (int) (((float) pVar.mo2415f(10000)) * 1.2f), pVar.f2205h);
                            }
                        }
                        aVar.f1965d = pVar.f1955a;
                        pVar.mo2225c();
                    }
                }
                C0417a aVar2 = this.f1961g;
                if (aVar2.f1965d >= 0) {
                    z = true;
                }
                aVar2.mo2226a(recyclerView);
                if (z && this.f1959e) {
                    this.f1958d = true;
                    recyclerView.f1860e0.mo2231a();
                }
            }
        }

        /* renamed from: b */
        public abstract void mo2224b(View view, C0419w wVar, C0417a aVar);

        /* renamed from: c */
        public final void mo2225c() {
            if (this.f1959e) {
                this.f1959e = false;
                C0469p pVar = (C0469p) this;
                pVar.f2212o = 0;
                pVar.f2211n = 0;
                pVar.f2207j = null;
                this.f1956b.f1866h0.f1969a = -1;
                this.f1960f = null;
                this.f1955a = -1;
                this.f1958d = false;
                C0400l lVar = this.f1957c;
                if (lVar.f1918e == this) {
                    lVar.f1918e = null;
                }
                this.f1957c = null;
                this.f1956b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C0419w {

        /* renamed from: a */
        public int f1969a = -1;

        /* renamed from: b */
        public int f1970b = 0;

        /* renamed from: c */
        public int f1971c = 0;

        /* renamed from: d */
        public int f1972d = 1;

        /* renamed from: e */
        public int f1973e = 0;

        /* renamed from: f */
        public boolean f1974f = false;

        /* renamed from: g */
        public boolean f1975g = false;

        /* renamed from: h */
        public boolean f1976h = false;

        /* renamed from: i */
        public boolean f1977i = false;

        /* renamed from: j */
        public boolean f1978j = false;

        /* renamed from: k */
        public boolean f1979k = false;

        /* renamed from: l */
        public int f1980l;

        /* renamed from: m */
        public long f1981m;

        /* renamed from: n */
        public int f1982n;

        /* renamed from: a */
        public void mo2228a(int i) {
            if ((this.f1972d & i) == 0) {
                StringBuilder a = C0001b.m0a("Layout state should be one of ");
                a.append(Integer.toBinaryString(i));
                a.append(" but it is ");
                a.append(Integer.toBinaryString(this.f1972d));
                throw new IllegalStateException(a.toString());
            }
        }

        /* renamed from: b */
        public int mo2229b() {
            return this.f1975g ? this.f1970b - this.f1971c : this.f1973e;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("State{mTargetPosition=");
            a.append(this.f1969a);
            a.append(", mData=");
            a.append((Object) null);
            a.append(", mItemCount=");
            a.append(this.f1973e);
            a.append(", mIsMeasuring=");
            a.append(this.f1977i);
            a.append(", mPreviousLayoutItemCount=");
            a.append(this.f1970b);
            a.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a.append(this.f1971c);
            a.append(", mStructureChanged=");
            a.append(this.f1974f);
            a.append(", mInPreLayout=");
            a.append(this.f1975g);
            a.append(", mRunSimpleAnimations=");
            a.append(this.f1978j);
            a.append(", mRunPredictiveAnimations=");
            a.append(this.f1979k);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class C0420x {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class C0421y implements Runnable {

        /* renamed from: e */
        public int f1983e;

        /* renamed from: f */
        public int f1984f;

        /* renamed from: g */
        public OverScroller f1985g;

        /* renamed from: h */
        public Interpolator f1986h;

        /* renamed from: i */
        public boolean f1987i = false;

        /* renamed from: j */
        public boolean f1988j = false;

        public C0421y() {
            Interpolator interpolator = RecyclerView.f1829A0;
            this.f1986h = interpolator;
            this.f1985g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public void mo2231a() {
            if (this.f1987i) {
                this.f1988j = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            recyclerView.postOnAnimation(this);
        }

        /* renamed from: b */
        public void mo2232b(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f = (float) width;
                float f2 = (float) i5;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, 2000);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f1829A0;
            }
            if (this.f1986h != interpolator) {
                this.f1986h = interpolator;
                this.f1985g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1984f = 0;
            this.f1983e = 0;
            RecyclerView.this.setScrollState(2);
            this.f1985g.startScroll(0, 0, i, i2, i6);
            mo2231a();
        }

        /* renamed from: c */
        public void mo2233c() {
            RecyclerView.this.removeCallbacks(this);
            this.f1985g.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1881p == null) {
                mo2233c();
                return;
            }
            this.f1988j = false;
            this.f1987i = true;
            recyclerView.mo2069n();
            OverScroller overScroller = this.f1985g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1983e;
                int i4 = currY - this.f1984f;
                this.f1983e = currX;
                this.f1984f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f1892u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo2118t(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f1892u0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo2067m(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1879o != null) {
                    int[] iArr3 = recyclerView3.f1892u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo2028e0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f1892u0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0416v vVar = recyclerView4.f1881p.f1918e;
                    if (vVar != null && !vVar.f1958d && vVar.f1959e) {
                        int b = recyclerView4.f1866h0.mo2229b();
                        if (b == 0) {
                            vVar.mo2225c();
                        } else {
                            if (vVar.f1955a >= b) {
                                vVar.f1955a = b - 1;
                            }
                            vVar.mo2223a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f1885r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f1892u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo2119u(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f1892u0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo2120v(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                C0416v vVar2 = recyclerView7.f1881p.f1918e;
                if ((vVar2 != null && vVar2.f1958d) || !z) {
                    mo2231a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    C0464n nVar = recyclerView8.f1862f0;
                    if (nVar != null) {
                        nVar.mo2404a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i7 < 0) {
                            recyclerView9.mo2122x();
                            if (recyclerView9.f1840I.isFinished()) {
                                recyclerView9.f1840I.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.mo2123y();
                            if (recyclerView9.f1842K.isFinished()) {
                                recyclerView9.f1842K.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.mo2124z();
                            if (recyclerView9.f1841J.isFinished()) {
                                recyclerView9.f1841J.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.mo2121w();
                            if (recyclerView9.f1843L.isFinished()) {
                                recyclerView9.f1843L.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i7 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    int[] iArr7 = RecyclerView.f1830y0;
                    C0464n.C0466b bVar = RecyclerView.this.f1864g0;
                    int[] iArr8 = bVar.f2189c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f2190d = 0;
                }
            }
            C0416v vVar3 = RecyclerView.this.f1881p.f1918e;
            if (vVar3 != null && vVar3.f1958d) {
                vVar3.mo2223a(0, 0);
            }
            this.f1987i = false;
            if (this.f1988j) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                recyclerView10.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo2066l0(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0422z {

        /* renamed from: s */
        public static final List<Object> f1990s = Collections.emptyList();

        /* renamed from: a */
        public final View f1991a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f1992b;

        /* renamed from: c */
        public int f1993c = -1;

        /* renamed from: d */
        public int f1994d = -1;

        /* renamed from: e */
        public long f1995e = -1;

        /* renamed from: f */
        public int f1996f = -1;

        /* renamed from: g */
        public int f1997g = -1;

        /* renamed from: h */
        public C0422z f1998h = null;

        /* renamed from: i */
        public C0422z f1999i = null;

        /* renamed from: j */
        public int f2000j;

        /* renamed from: k */
        public List<Object> f2001k = null;

        /* renamed from: l */
        public List<Object> f2002l = null;

        /* renamed from: m */
        public int f2003m = 0;

        /* renamed from: n */
        public C0411r f2004n = null;

        /* renamed from: o */
        public boolean f2005o = false;

        /* renamed from: p */
        public int f2006p = 0;

        /* renamed from: q */
        public int f2007q = -1;

        /* renamed from: r */
        public RecyclerView f2008r;

        public C0422z(View view) {
            if (view != null) {
                this.f1991a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public void mo2235a(Object obj) {
            if (obj == null) {
                mo2236b(1024);
            } else if ((1024 & this.f2000j) == 0) {
                if (this.f2001k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2001k = arrayList;
                    this.f2002l = Collections.unmodifiableList(arrayList);
                }
                this.f2001k.add(obj);
            }
        }

        /* renamed from: b */
        public void mo2236b(int i) {
            this.f2000j = i | this.f2000j;
        }

        /* renamed from: c */
        public void mo2237c() {
            this.f1994d = -1;
            this.f1997g = -1;
        }

        /* renamed from: d */
        public void mo2238d() {
            this.f2000j &= -33;
        }

        /* renamed from: e */
        public final int mo2239e() {
            RecyclerView recyclerView = this.f2008r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo1989H(this);
        }

        /* renamed from: f */
        public final int mo2240f() {
            int i = this.f1997g;
            return i == -1 ? this.f1993c : i;
        }

        /* renamed from: g */
        public List<Object> mo2241g() {
            if ((this.f2000j & 1024) != 0) {
                return f1990s;
            }
            List<Object> list = this.f2001k;
            return (list == null || list.size() == 0) ? f1990s : this.f2002l;
        }

        /* renamed from: h */
        public boolean mo2242h(int i) {
            return (i & this.f2000j) != 0;
        }

        /* renamed from: i */
        public boolean mo2243i() {
            return (this.f1991a.getParent() == null || this.f1991a.getParent() == this.f2008r) ? false : true;
        }

        /* renamed from: j */
        public boolean mo2244j() {
            return (this.f2000j & 1) != 0;
        }

        /* renamed from: k */
        public boolean mo2245k() {
            return (this.f2000j & 4) != 0;
        }

        /* renamed from: l */
        public final boolean mo2246l() {
            if ((this.f2000j & 16) == 0) {
                View view = this.f1991a;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: m */
        public boolean mo2247m() {
            return (this.f2000j & 8) != 0;
        }

        /* renamed from: n */
        public boolean mo2248n() {
            return this.f2004n != null;
        }

        /* renamed from: o */
        public boolean mo2249o() {
            return (this.f2000j & 256) != 0;
        }

        /* renamed from: p */
        public boolean mo2250p() {
            return (this.f2000j & 2) != 0;
        }

        /* renamed from: q */
        public void mo2251q(int i, boolean z) {
            if (this.f1994d == -1) {
                this.f1994d = this.f1993c;
            }
            if (this.f1997g == -1) {
                this.f1997g = this.f1993c;
            }
            if (z) {
                this.f1997g += i;
            }
            this.f1993c += i;
            if (this.f1991a.getLayoutParams() != null) {
                ((C0405m) this.f1991a.getLayoutParams()).f1937c = true;
            }
        }

        /* renamed from: r */
        public void mo2252r() {
            this.f2000j = 0;
            this.f1993c = -1;
            this.f1994d = -1;
            this.f1995e = -1;
            this.f1997g = -1;
            this.f2003m = 0;
            this.f1998h = null;
            this.f1999i = null;
            List<Object> list = this.f2001k;
            if (list != null) {
                list.clear();
            }
            this.f2000j &= -1025;
            this.f2006p = 0;
            this.f2007q = -1;
            RecyclerView.m1209k(this);
        }

        /* renamed from: s */
        public void mo2253s(int i, int i2) {
            this.f2000j = (i & i2) | (this.f2000j & (~i2));
        }

        /* renamed from: t */
        public final void mo2254t(boolean z) {
            int i;
            int i2 = this.f2003m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f2003m = i3;
            if (i3 < 0) {
                this.f2003m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f2000j | 16;
            } else if (z && i3 == 0) {
                i = this.f2000j & -17;
            } else {
                return;
            }
            this.f2000j = i;
        }

        public String toString() {
            StringBuilder a = C1599h.m4503a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            a.append(Integer.toHexString(hashCode()));
            a.append(" position=");
            a.append(this.f1993c);
            a.append(" id=");
            a.append(this.f1995e);
            a.append(", oldPos=");
            a.append(this.f1994d);
            a.append(", pLpos:");
            a.append(this.f1997g);
            StringBuilder sb = new StringBuilder(a.toString());
            if (mo2248n()) {
                sb.append(" scrap ");
                sb.append(this.f2005o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo2245k()) {
                sb.append(" invalid");
            }
            if (!mo2244j()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.f2000j & 2) != 0) {
                sb.append(" update");
            }
            if (mo2247m()) {
                sb.append(" removed");
            }
            if (mo2256u()) {
                sb.append(" ignored");
            }
            if (mo2249o()) {
                sb.append(" tmpDetached");
            }
            if (!mo2246l()) {
                StringBuilder a2 = C0001b.m0a(" not recyclable(");
                a2.append(this.f2003m);
                a2.append(")");
                sb.append(a2.toString());
            }
            if ((this.f2000j & 512) == 0 && !mo2245k()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f1991a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo2256u() {
            return (this.f2000j & 128) != 0;
        }

        /* renamed from: v */
        public boolean mo2257v() {
            return (this.f2000j & 32) != 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f1830y0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            f1831z0 = r1
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            f1829A0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        StringBuilder sb;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f1859e = new C0413t();
        this.f1861f = new C0411r();
        this.f1869j = new C0446d0();
        this.f1873l = new Rect();
        this.f1875m = new Rect();
        this.f1877n = new RectF();
        this.f1885r = new ArrayList<>();
        this.f1887s = new ArrayList<>();
        this.f1897x = 0;
        this.f1835D = false;
        this.f1836E = false;
        this.f1837F = 0;
        this.f1838G = 0;
        this.f1839H = new C0393h();
        this.f1844M = new C0456l();
        this.f1845N = 0;
        this.f1846O = -1;
        this.f1856b0 = Float.MIN_VALUE;
        this.f1857c0 = Float.MIN_VALUE;
        this.f1858d0 = true;
        this.f1860e0 = new C0421y();
        this.f1864g0 = new C0464n.C0466b();
        this.f1866h0 = new C0419w();
        this.f1872k0 = false;
        this.f1874l0 = false;
        this.f1876m0 = new C0398j();
        this.f1878n0 = false;
        char c = 2;
        this.f1884q0 = new int[2];
        this.f1888s0 = new int[2];
        this.f1890t0 = new int[2];
        this.f1892u0 = new int[2];
        this.f1894v0 = new ArrayList();
        this.f1896w0 = new C0386a();
        this.f1898x0 = new C0388c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1852U = viewConfiguration.getScaledTouchSlop();
        Method method = C1069p.f3820a;
        int i3 = Build.VERSION.SDK_INT;
        this.f1856b0 = i3 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : C1069p.m3044a(viewConfiguration, context2);
        this.f1857c0 = i3 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C1069p.m3044a(viewConfiguration, context2);
        this.f1854W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1855a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1844M.f1905a = this.f1876m0;
        this.f1865h = new C0432a(new C0478x(this));
        this.f1867i = new C0439c(new C0477w(this));
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if ((i3 >= 26 ? getImportantForAutofill() : 0) == 0 && i3 >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1834C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0479y(this));
        int[] iArr = C2155a.f6217a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(EnumBarcodeFormat.BF_PATCHCODE);
        }
        this.f1871k = obtainStyledAttributes.getBoolean(1, true);
        int i4 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C0436b.m1551a(this, C0001b.m0a("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new C0459m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i4 = 4;
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0400l.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f1831z0);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        noSuchMethodException = e;
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0400l) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        int[] iArr2 = f1830y0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        }
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    /* renamed from: F */
    public static RecyclerView m1203F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView F = m1203F(viewGroup.getChildAt(i));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    /* renamed from: L */
    public static C0422z m1204L(View view) {
        if (view == null) {
            return null;
        }
        return ((C0405m) view.getLayoutParams()).f1935a;
    }

    private C1053g getScrollingChildHelper() {
        if (this.f1886r0 == null) {
            this.f1886r0 = new C1053g(this);
        }
        return this.f1886r0;
    }

    /* renamed from: k */
    public static void m1209k(C0422z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f1992b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        zVar.f1992b = null;
                        return;
                    } else if (view != zVar.f1991a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public String mo1983A() {
        StringBuilder a = C0001b.m0a(" ");
        a.append(super.toString());
        a.append(", adapter:");
        a.append(this.f1879o);
        a.append(", layout:");
        a.append(this.f1881p);
        a.append(", context:");
        a.append(getContext());
        return a.toString();
    }

    /* renamed from: B */
    public final void mo1984B(C0419w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1860e0.f1985g;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(wVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1985C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo1985C(android.view.View):android.view.View");
    }

    /* renamed from: D */
    public final boolean mo1986D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1887s.size();
        int i = 0;
        while (i < size) {
            C0407o oVar = this.f1887s.get(i);
            if (!oVar.mo2200a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f1889t = oVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo1987E(int[] iArr) {
        int e = this.f1867i.mo2344e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C0422z L = m1204L(this.f1867i.mo2343d(i3));
            if (!L.mo2256u()) {
                int f = L.mo2240f();
                if (f < i) {
                    i = f;
                }
                if (f > i2) {
                    i2 = f;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: G */
    public C0422z mo1988G(int i) {
        C0422z zVar = null;
        if (this.f1835D) {
            return null;
        }
        int h = this.f1867i.mo2347h();
        for (int i2 = 0; i2 < h; i2++) {
            C0422z L = m1204L(this.f1867i.mo2346g(i2));
            if (L != null && !L.mo2247m() && mo1989H(L) == i) {
                if (!this.f1867i.mo2350k(L.f1991a)) {
                    return L;
                }
                zVar = L;
            }
        }
        return zVar;
    }

    /* renamed from: H */
    public int mo1989H(C0422z zVar) {
        if (!zVar.mo2242h(524) && zVar.mo2244j()) {
            C0432a aVar = this.f1865h;
            int i = zVar.f1993c;
            int size = aVar.f2063b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0432a.C0434b bVar = aVar.f2063b.get(i2);
                int i3 = bVar.f2067a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = bVar.f2068b;
                        if (i4 <= i) {
                            int i5 = bVar.f2070d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = bVar.f2068b;
                        if (i6 == i) {
                            i = bVar.f2070d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (bVar.f2070d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.f2068b <= i) {
                    i += bVar.f2070d;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: I */
    public long mo1990I(C0422z zVar) {
        if (this.f1879o.f1904b) {
            return zVar.f1995e;
        }
        return (long) zVar.f1993c;
    }

    /* renamed from: J */
    public int mo1991J(View view) {
        C0422z L = m1204L(view);
        if (L != null) {
            return L.mo2239e();
        }
        return -1;
    }

    /* renamed from: K */
    public C0422z mo1992K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1204L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: M */
    public Rect mo1993M(View view) {
        C0405m mVar = (C0405m) view.getLayoutParams();
        if (!mVar.f1937c) {
            return mVar.f1936b;
        }
        if (this.f1866h0.f1975g && (mVar.mo2198b() || mVar.f1935a.mo2245k())) {
            return mVar.f1936b;
        }
        Rect rect = mVar.f1936b;
        rect.set(0, 0, 0, 0);
        int size = this.f1885r.size();
        for (int i = 0; i < size; i++) {
            this.f1873l.set(0, 0, 0, 0);
            this.f1885r.get(i).mo2146d(this.f1873l, view, this, this.f1866h0);
            int i2 = rect.left;
            Rect rect2 = this.f1873l;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f1937c = false;
        return rect;
    }

    /* renamed from: N */
    public boolean mo1994N() {
        return !this.f1895w || this.f1835D || this.f1865h.mo2327g();
    }

    /* renamed from: O */
    public void mo1995O() {
        this.f1843L = null;
        this.f1841J = null;
        this.f1842K = null;
        this.f1840I = null;
    }

    /* renamed from: P */
    public boolean mo1996P() {
        return this.f1837F > 0;
    }

    /* renamed from: Q */
    public void mo1997Q(int i) {
        if (this.f1881p != null) {
            setScrollState(2);
            this.f1881p.mo1969w0(i);
            awakenScrollBars();
        }
    }

    /* renamed from: R */
    public void mo1998R() {
        int h = this.f1867i.mo2347h();
        for (int i = 0; i < h; i++) {
            ((C0405m) this.f1867i.mo2346g(i).getLayoutParams()).f1937c = true;
        }
        C0411r rVar = this.f1861f;
        int size = rVar.f1947c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0405m mVar = (C0405m) rVar.f1947c.get(i2).f1991a.getLayoutParams();
            if (mVar != null) {
                mVar.f1937c = true;
            }
        }
    }

    /* renamed from: S */
    public void mo1999S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f1867i.mo2347h();
        for (int i4 = 0; i4 < h; i4++) {
            C0422z L = m1204L(this.f1867i.mo2346g(i4));
            if (L != null && !L.mo2256u()) {
                int i5 = L.f1993c;
                if (i5 >= i3) {
                    L.mo2251q(-i2, z);
                } else if (i5 >= i) {
                    L.mo2236b(8);
                    L.mo2251q(-i2, z);
                    L.f1993c = i - 1;
                }
                this.f1866h0.f1974f = true;
            }
        }
        C0411r rVar = this.f1861f;
        int size = rVar.f1947c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0422z zVar = rVar.f1947c.get(size);
                if (zVar != null) {
                    int i6 = zVar.f1993c;
                    if (i6 >= i3) {
                        zVar.mo2251q(-i2, z);
                    } else if (i6 >= i) {
                        zVar.mo2236b(8);
                        rVar.mo2212f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: T */
    public void mo2000T() {
        this.f1837F++;
    }

    /* renamed from: U */
    public void mo2001U(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f1837F - 1;
        this.f1837F = i2;
        if (i2 < 1) {
            this.f1837F = 0;
            if (z) {
                int i3 = this.f1833B;
                this.f1833B = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f1834C;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f1894v0.size() - 1; size >= 0; size--) {
                    C0422z zVar = this.f1894v0.get(size);
                    if (zVar.f1991a.getParent() == this && !zVar.mo2256u() && (i = zVar.f2007q) != -1) {
                        View view = zVar.f1991a;
                        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                        view.setImportantForAccessibility(i);
                        zVar.f2007q = -1;
                    }
                }
                this.f1894v0.clear();
            }
        }
    }

    /* renamed from: V */
    public final void mo2002V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1846O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1846O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1850S = x;
            this.f1848Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1851T = y;
            this.f1849R = y;
        }
    }

    /* renamed from: W */
    public void mo2003W() {
        if (!this.f1878n0 && this.f1891u) {
            Runnable runnable = this.f1896w0;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            postOnAnimation(runnable);
            this.f1878n0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r6.f1844M != null && r6.f1881p.mo1887I0()) != false) goto L_0x0081;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2004X() {
        /*
            r6 = this;
            boolean r0 = r6.f1835D
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.a r0 = r6.f1865h
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2063b
            r0.mo2332l(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2064c
            r0.mo2332l(r1)
            boolean r0 = r6.f1836E
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1881p
            r0.mo1894f0(r6)
        L_0x0019:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f1844M
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1881p
            boolean r0 = r0.mo1887I0()
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            androidx.recyclerview.widget.a r0 = r6.f1865h
            r0.mo2330j()
            goto L_0x0037
        L_0x0032:
            androidx.recyclerview.widget.a r0 = r6.f1865h
            r0.mo2323c()
        L_0x0037:
            boolean r0 = r6.f1872k0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r6.f1874l0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView$w r3 = r6.f1866h0
            boolean r4 = r6.f1895w
            if (r4 == 0) goto L_0x0063
            androidx.recyclerview.widget.RecyclerView$i r4 = r6.f1844M
            if (r4 == 0) goto L_0x0063
            boolean r4 = r6.f1835D
            if (r4 != 0) goto L_0x0059
            if (r0 != 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f1881p
            boolean r5 = r5.f1919f
            if (r5 == 0) goto L_0x0063
        L_0x0059:
            if (r4 == 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView$d r4 = r6.f1879o
            boolean r4 = r4.f1904b
            if (r4 == 0) goto L_0x0063
        L_0x0061:
            r4 = r1
            goto L_0x0064
        L_0x0063:
            r4 = r2
        L_0x0064:
            r3.f1978j = r4
            if (r4 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6.f1835D
            if (r0 != 0) goto L_0x0080
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f1844M
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1881p
            boolean r0 = r0.mo1887I0()
            if (r0 == 0) goto L_0x007c
            r0 = r1
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r3.f1979k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo2004X():void");
    }

    /* renamed from: Y */
    public void mo2005Y(boolean z) {
        this.f1836E = z | this.f1836E;
        this.f1835D = true;
        int h = this.f1867i.mo2347h();
        for (int i = 0; i < h; i++) {
            C0422z L = m1204L(this.f1867i.mo2346g(i));
            if (L != null && !L.mo2256u()) {
                L.mo2236b(6);
            }
        }
        mo1998R();
        C0411r rVar = this.f1861f;
        int size = rVar.f1947c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0422z zVar = rVar.f1947c.get(i2);
            if (zVar != null) {
                zVar.mo2236b(6);
                zVar.mo2235a((Object) null);
            }
        }
        C0389d dVar = RecyclerView.this.f1879o;
        if (dVar == null || !dVar.f1904b) {
            rVar.mo2211e();
        }
    }

    /* renamed from: Z */
    public void mo2006Z(C0422z zVar, C0394i.C0397c cVar) {
        zVar.mo2253s(0, 8192);
        if (this.f1866h0.f1976h && zVar.mo2250p() && !zVar.mo2247m() && !zVar.mo2256u()) {
            this.f1869j.f2091b.mo5537k(mo1990I(zVar), zVar);
        }
        this.f1869j.mo2369c(zVar, cVar);
    }

    /* renamed from: a0 */
    public void mo2007a0() {
        C0394i iVar = this.f1844M;
        if (iVar != null) {
            iVar.mo2142f();
        }
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            lVar.mo2179o0(this.f1861f);
            this.f1881p.mo2180p0(this.f1861f);
        }
        this.f1861f.mo2208b();
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            Objects.requireNonNull(lVar);
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b0 */
    public final void mo2009b0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1873l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0405m) {
            C0405m mVar = (C0405m) layoutParams;
            if (!mVar.f1937c) {
                Rect rect = mVar.f1936b;
                Rect rect2 = this.f1873l;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1873l);
            offsetRectIntoDescendantCoords(view, this.f1873l);
        }
        this.f1881p.mo2186t0(this, view, this.f1873l, !this.f1895w, view2 == null);
    }

    /* renamed from: c0 */
    public final void mo2010c0() {
        VelocityTracker velocityTracker = this.f1847P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo2066l0(0);
        EdgeEffect edgeEffect = this.f1840I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f1840I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1841J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f1841J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1842K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f1842K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1843L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f1843L.isFinished();
        }
        if (z) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            postInvalidateOnAnimation();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0405m) && this.f1881p.mo1896g((C0405m) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1950e()) {
            return this.f1881p.mo1958k(this.f1866h0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1950e()) {
            return this.f1881p.mo1903l(this.f1866h0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1950e()) {
            return this.f1881p.mo1904m(this.f1866h0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1952f()) {
            return this.f1881p.mo1964n(this.f1866h0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1952f()) {
            return this.f1881p.mo1906o(this.f1866h0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0400l lVar = this.f1881p;
        if (lVar != null && lVar.mo1952f()) {
            return this.f1881p.mo1907p(this.f1866h0);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2018d0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.mo2069n()
            androidx.recyclerview.widget.RecyclerView$d r0 = r8.f1879o
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.f1892u0
            r0[r12] = r12
            r0[r11] = r12
            r8.mo2028e0(r9, r10, r0)
            int[] r0 = r8.f1892u0
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r8.f1885r
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.f1892u0
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r8.f1888s0
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r0.mo2119u(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f1892u0
            r1 = r0[r12]
            int r15 = r15 - r1
            r1 = r0[r11]
            int r1 = r16 - r1
            r2 = r0[r12]
            if (r2 != 0) goto L_0x005f
            r0 = r0[r11]
            if (r0 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r0 = r12
            goto L_0x0060
        L_0x005f:
            r0 = r11
        L_0x0060:
            int r2 = r8.f1850S
            int[] r3 = r8.f1888s0
            r4 = r3[r12]
            int r2 = r2 - r4
            r8.f1850S = r2
            int r2 = r8.f1851T
            r4 = r3[r11]
            int r2 = r2 - r4
            r8.f1851T = r2
            int[] r2 = r8.f1890t0
            r4 = r2[r12]
            r5 = r3[r12]
            int r4 = r4 + r5
            r2[r12] = r4
            r4 = r2[r11]
            r3 = r3[r11]
            int r4 = r4 + r3
            r2[r11] = r4
            int r2 = r17.getOverScrollMode()
            r3 = 2
            if (r2 == r3) goto L_0x0120
            if (r20 == 0) goto L_0x011d
            r2 = 8194(0x2002, float:1.1482E-41)
            int r3 = r20.getSource()
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0094
            r2 = r11
            goto L_0x0095
        L_0x0094:
            r2 = r12
        L_0x0095:
            if (r2 != 0) goto L_0x011d
            float r2 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r1 = (float) r1
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00bd
            r17.mo2122x()
            android.widget.EdgeEffect r6 = r8.f1840I
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r7 - r4
            goto L_0x00d3
        L_0x00bd:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d8
            r17.mo2123y()
            android.widget.EdgeEffect r6 = r8.f1842K
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r3 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
        L_0x00d3:
            r6.onPull(r15, r4)
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = r12
        L_0x00d9:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f3
            r17.mo2124z()
            android.widget.EdgeEffect r4 = r8.f1841J
            float r6 = -r1
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            r4.onPull(r6, r2)
            goto L_0x010d
        L_0x00f3:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x010e
            r17.mo2121w()
            android.widget.EdgeEffect r4 = r8.f1843L
            int r6 = r17.getHeight()
            float r6 = (float) r6
            float r6 = r1 / r6
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            r4.onPull(r6, r7)
        L_0x010d:
            r4 = 1
        L_0x010e:
            if (r4 != 0) goto L_0x0118
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0118
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x011d
        L_0x0118:
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            r17.postInvalidateOnAnimation()
        L_0x011d:
            r17.mo2067m(r18, r19)
        L_0x0120:
            if (r14 != 0) goto L_0x0124
            if (r13 == 0) goto L_0x0127
        L_0x0124:
            r8.mo2120v(r14, r13)
        L_0x0127:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x0130
            r17.invalidate()
        L_0x0130:
            if (r0 != 0) goto L_0x0139
            if (r14 != 0) goto L_0x0139
            if (r13 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r11 = r12
            goto L_0x013a
        L_0x0139:
            r11 = 1
        L_0x013a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo2018d0(int, int, android.view.MotionEvent):boolean");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo4525a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo4526b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo4527c(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo4529e(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.f1885r.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f1885r.get(i).mo2148f(canvas, this, this.f1866h0);
        }
        EdgeEffect edgeEffect = this.f1840I;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1871k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f1840I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1841J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1871k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1841J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1842K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1871k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f1842K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1843L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1871k) {
                f2 = (float) (getPaddingRight() + (-getWidth()));
                f = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f2 = (float) (-getWidth());
                f = (float) (-getHeight());
            }
            canvas.translate(f2, f);
            EdgeEffect edgeEffect8 = this.f1843L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f1844M == null || this.f1885r.size() <= 0 || !this.f1844M.mo2143g()) {
            z3 = z;
        }
        if (z3) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public void mo2028e0(int i, int i2, int[] iArr) {
        C0422z zVar;
        mo2058i0();
        mo2000T();
        int i3 = C0887b.f3352a;
        Trace.beginSection("RV Scroll");
        mo1984B(this.f1866h0);
        int v0 = i != 0 ? this.f1881p.mo1915v0(i, this.f1861f, this.f1866h0) : 0;
        int x0 = i2 != 0 ? this.f1881p.mo1918x0(i2, this.f1861f, this.f1866h0) : 0;
        Trace.endSection();
        int e = this.f1867i.mo2344e();
        for (int i4 = 0; i4 < e; i4++) {
            View d = this.f1867i.mo2343d(i4);
            C0422z K = mo1992K(d);
            if (!(K == null || (zVar = K.f1999i) == null)) {
                View view = zVar.f1991a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo2001U(true);
        mo2064k0(false);
        if (iArr != null) {
            iArr[0] = v0;
            iArr[1] = x0;
        }
    }

    /* renamed from: f */
    public final void mo2029f(C0422z zVar) {
        View view = zVar.f1991a;
        boolean z = view.getParent() == this;
        this.f1861f.mo2217k(mo1992K(view));
        if (zVar.mo2249o()) {
            this.f1867i.mo2341b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0439c cVar = this.f1867i;
        if (!z) {
            cVar.mo2340a(view, -1, true);
            return;
        }
        int indexOfChild = ((C0477w) cVar.f2076a).f2220a.indexOfChild(view);
        if (indexOfChild >= 0) {
            cVar.f2077b.mo2360h(indexOfChild);
            cVar.mo2348i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: f0 */
    public void mo2030f0(int i) {
        if (!this.f1900z) {
            mo2068m0();
            C0400l lVar = this.f1881p;
            if (lVar != null) {
                lVar.mo1969w0(i);
                awakenScrollBars();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0164, code lost:
        if (r3 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x017e, code lost:
        if (r6 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0181, code lost:
        if (r3 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0184, code lost:
        if (r6 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018c, code lost:
        if ((r6 * r2) < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0194, code lost:
        if ((r6 * r2) > 0) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$d r0 = r13.f1879o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.mo1996P()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.f1900z
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r7) goto L_0x002c
            if (r15 != r1) goto L_0x008d
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            boolean r0 = r0.mo1952f()
            if (r0 == 0) goto L_0x0042
            if (r15 != r7) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0039:
            r0 = r4
        L_0x003a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0042
            r0 = r1
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r0 != 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$l r8 = r13.f1881p
            boolean r8 = r8.mo1950e()
            if (r8 == 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            int r0 = r0.mo2163J()
            if (r0 != r1) goto L_0x0057
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r15 != r7) goto L_0x005c
            r8 = r1
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0063
            r0 = 66
            goto L_0x0064
        L_0x0063:
            r0 = r5
        L_0x0064:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x006c
            r0 = r1
            goto L_0x006d
        L_0x006c:
            r0 = r2
        L_0x006d:
            if (r0 == 0) goto L_0x0088
            r13.mo2069n()
            android.view.View r0 = r13.mo1985C(r14)
            if (r0 != 0) goto L_0x0079
            return r6
        L_0x0079:
            r13.mo2058i0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            androidx.recyclerview.widget.RecyclerView$r r8 = r13.f1861f
            androidx.recyclerview.widget.RecyclerView$w r9 = r13.f1866h0
            r0.mo1891a0(r14, r15, r8, r9)
            r13.mo2064k0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b1
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            r13.mo2069n()
            android.view.View r0 = r13.mo1985C(r14)
            if (r0 != 0) goto L_0x009f
            return r6
        L_0x009f:
            r13.mo2058i0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1881p
            androidx.recyclerview.widget.RecyclerView$r r3 = r13.f1861f
            androidx.recyclerview.widget.RecyclerView$w r8 = r13.f1866h0
            android.view.View r0 = r0.mo1891a0(r14, r15, r3, r8)
            r13.mo2064k0(r2)
            goto L_0x00b1
        L_0x00b0:
            r0 = r3
        L_0x00b1:
            if (r0 == 0) goto L_0x00c8
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c8
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c4
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c4:
            r13.mo2009b0(r0, r6)
            return r14
        L_0x00c8:
            if (r0 == 0) goto L_0x0197
            if (r0 != r13) goto L_0x00ce
            goto L_0x0197
        L_0x00ce:
            android.view.View r3 = r13.mo1985C(r0)
            if (r3 != 0) goto L_0x00d7
            r1 = r2
            goto L_0x0198
        L_0x00d7:
            if (r14 != 0) goto L_0x00db
            goto L_0x0198
        L_0x00db:
            android.view.View r3 = r13.mo1985C(r14)
            if (r3 != 0) goto L_0x00e3
            goto L_0x0198
        L_0x00e3:
            android.graphics.Rect r3 = r13.f1873l
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r3 = r13.f1875m
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r2 = r13.f1873l
            r13.offsetDescendantRectToMyCoords(r14, r2)
            android.graphics.Rect r2 = r13.f1875m
            r13.offsetDescendantRectToMyCoords(r0, r2)
            androidx.recyclerview.widget.RecyclerView$l r2 = r13.f1881p
            int r2 = r2.mo2163J()
            if (r2 != r1) goto L_0x0111
            r2 = -1
            goto L_0x0112
        L_0x0111:
            r2 = r1
        L_0x0112:
            android.graphics.Rect r3 = r13.f1873l
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f1875m
            int r9 = r8.left
            if (r6 < r9) goto L_0x0120
            int r10 = r3.right
            if (r10 > r9) goto L_0x0128
        L_0x0120:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x0128
            r6 = r1
            goto L_0x0135
        L_0x0128:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0130
            if (r6 < r11) goto L_0x0134
        L_0x0130:
            if (r6 <= r9) goto L_0x0134
            r6 = -1
            goto L_0x0135
        L_0x0134:
            r6 = 0
        L_0x0135:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x013f
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0147
        L_0x013f:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0147
            r3 = r1
            goto L_0x0154
        L_0x0147:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x014f
            if (r9 < r8) goto L_0x0153
        L_0x014f:
            if (r9 <= r10) goto L_0x0153
            r3 = -1
            goto L_0x0154
        L_0x0153:
            r3 = 0
        L_0x0154:
            if (r15 == r1) goto L_0x018f
            if (r15 == r7) goto L_0x0187
            if (r15 == r5) goto L_0x0184
            if (r15 == r4) goto L_0x0181
            r2 = 66
            if (r15 == r2) goto L_0x017e
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x0167
            if (r3 <= 0) goto L_0x0197
            goto L_0x0198
        L_0x0167:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = androidx.recyclerview.widget.C0436b.m1551a(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x017e:
            if (r6 <= 0) goto L_0x0197
            goto L_0x0198
        L_0x0181:
            if (r3 >= 0) goto L_0x0197
            goto L_0x0198
        L_0x0184:
            if (r6 >= 0) goto L_0x0197
            goto L_0x0198
        L_0x0187:
            if (r3 > 0) goto L_0x0198
            if (r3 != 0) goto L_0x0197
            int r6 = r6 * r2
            if (r6 < 0) goto L_0x0197
            goto L_0x0198
        L_0x018f:
            if (r3 < 0) goto L_0x0198
            if (r3 != 0) goto L_0x0197
            int r6 = r6 * r2
            if (r6 > 0) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r1 = 0
        L_0x0198:
            if (r1 == 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x019f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public void mo2032g(C0399k kVar) {
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            lVar.mo1948d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1885r.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1885r.add(kVar);
        mo1998R();
        requestLayout();
    }

    /* renamed from: g0 */
    public boolean mo2033g0(C0422z zVar, int i) {
        if (mo1996P()) {
            zVar.f2007q = i;
            this.f1894v0.add(zVar);
            return false;
        }
        View view = zVar.f1991a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.setImportantForAccessibility(i);
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            return lVar.mo1910t();
        }
        throw new IllegalStateException(C0436b.m1551a(this, C0001b.m0a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            return lVar.mo1912u(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0436b.m1551a(this, C0001b.m0a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            return lVar.mo1914v(layoutParams);
        }
        throw new IllegalStateException(C0436b.m1551a(this, C0001b.m0a("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0389d getAdapter() {
        return this.f1879o;
    }

    public int getBaseline() {
        C0400l lVar = this.f1881p;
        if (lVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lVar);
        return -1;
    }

    public int getChildDrawingOrder(int i, int i2) {
        C0392g gVar = this.f1882p0;
        return gVar == null ? super.getChildDrawingOrder(i, i2) : gVar.mo2136a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f1871k;
    }

    public C0479y getCompatAccessibilityDelegate() {
        return this.f1880o0;
    }

    public C0393h getEdgeEffectFactory() {
        return this.f1839H;
    }

    public C0394i getItemAnimator() {
        return this.f1844M;
    }

    public int getItemDecorationCount() {
        return this.f1885r.size();
    }

    public C0400l getLayoutManager() {
        return this.f1881p;
    }

    public int getMaxFlingVelocity() {
        return this.f1855a0;
    }

    public int getMinFlingVelocity() {
        return this.f1854W;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public C0406n getOnFlingListener() {
        return this.f1853V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1858d0;
    }

    public C0409q getRecycledViewPool() {
        return this.f1861f.mo2210d();
    }

    public int getScrollState() {
        return this.f1845N;
    }

    /* renamed from: h */
    public void mo2054h(C0408p pVar) {
        if (this.f1870j0 == null) {
            this.f1870j0 = new ArrayList();
        }
        this.f1870j0.add(pVar);
    }

    /* renamed from: h0 */
    public void mo2055h0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0400l lVar = this.f1881p;
        if (lVar != null && !this.f1900z) {
            int i4 = 0;
            if (!lVar.mo1950e()) {
                i = 0;
            }
            if (!this.f1881p.mo1952f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo2063j0(i4, 1);
                    }
                    this.f1860e0.mo2232b(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo4532h(0);
    }

    /* renamed from: i */
    public void mo2057i(String str) {
        if (mo1996P()) {
            if (str == null) {
                throw new IllegalStateException(C0436b.m1551a(this, C0001b.m0a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f1838G > 0) {
            new IllegalStateException(C0436b.m1551a(this, C0001b.m0a("")));
        }
    }

    /* renamed from: i0 */
    public void mo2058i0() {
        int i = this.f1897x + 1;
        this.f1897x = i;
        if (i == 1 && !this.f1900z) {
            this.f1899y = false;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f1891u;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1900z;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3801d;
    }

    /* renamed from: j */
    public final void mo2062j() {
        mo2010c0();
        setScrollState(0);
    }

    /* renamed from: j0 */
    public boolean mo2063j0(int i, int i2) {
        return getScrollingChildHelper().mo4533i(i, i2);
    }

    /* renamed from: k0 */
    public void mo2064k0(boolean z) {
        if (this.f1897x < 1) {
            this.f1897x = 1;
        }
        if (!z && !this.f1900z) {
            this.f1899y = false;
        }
        if (this.f1897x == 1) {
            if (z && this.f1899y && !this.f1900z && this.f1881p != null && this.f1879o != null) {
                mo2084q();
            }
            if (!this.f1900z) {
                this.f1899y = false;
            }
        }
        this.f1897x--;
    }

    /* renamed from: l */
    public void mo2065l() {
        int h = this.f1867i.mo2347h();
        for (int i = 0; i < h; i++) {
            C0422z L = m1204L(this.f1867i.mo2346g(i));
            if (!L.mo2256u()) {
                L.mo2237c();
            }
        }
        C0411r rVar = this.f1861f;
        int size = rVar.f1947c.size();
        for (int i2 = 0; i2 < size; i2++) {
            rVar.f1947c.get(i2).mo2237c();
        }
        int size2 = rVar.f1945a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            rVar.f1945a.get(i3).mo2237c();
        }
        ArrayList<C0422z> arrayList = rVar.f1946b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                rVar.f1946b.get(i4).mo2237c();
            }
        }
    }

    /* renamed from: l0 */
    public void mo2066l0(int i) {
        getScrollingChildHelper().mo4534j(i);
    }

    /* renamed from: m */
    public void mo2067m(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f1840I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f1840I.onRelease();
            z = this.f1840I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1842K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1842K.onRelease();
            z |= this.f1842K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1841J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1841J.onRelease();
            z |= this.f1841J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1843L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1843L.onRelease();
            z |= this.f1843L.isFinished();
        }
        if (z) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m0 */
    public void mo2068m0() {
        C0416v vVar;
        setScrollState(0);
        this.f1860e0.mo2233c();
        C0400l lVar = this.f1881p;
        if (lVar != null && (vVar = lVar.f1918e) != null) {
            vVar.mo2225c();
        }
    }

    /* renamed from: n */
    public void mo2069n() {
        if (!this.f1895w || this.f1835D) {
            int i = C0887b.f3352a;
            Trace.beginSection("RV FullInvalidate");
            mo2084q();
            Trace.endSection();
        } else if (this.f1865h.mo2327g()) {
            Objects.requireNonNull(this.f1865h);
            if (this.f1865h.mo2327g()) {
                int i2 = C0887b.f3352a;
                Trace.beginSection("RV FullInvalidate");
                mo2084q();
                Trace.endSection();
            }
        }
    }

    /* renamed from: o */
    public void mo2070o(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setMeasuredDimension(C0400l.m1292h(i, paddingRight, getMinimumWidth()), C0400l.m1292h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1837F = 0;
        this.f1891u = true;
        this.f1895w = this.f1895w && !isLayoutRequested();
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            lVar.f1920g = true;
        }
        this.f1878n0 = false;
        ThreadLocal<C0464n> threadLocal = C0464n.f2181i;
        C0464n nVar = threadLocal.get();
        this.f1862f0 = nVar;
        if (nVar == null) {
            this.f1862f0 = new C0464n();
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            C0464n nVar2 = this.f1862f0;
            nVar2.f2185g = (long) (1.0E9f / f);
            threadLocal.set(nVar2);
        }
        this.f1862f0.f2183e.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0394i iVar = this.f1844M;
        if (iVar != null) {
            iVar.mo2142f();
        }
        mo2068m0();
        this.f1891u = false;
        C0400l lVar = this.f1881p;
        if (lVar != null) {
            C0411r rVar = this.f1861f;
            lVar.f1920g = false;
            lVar.mo1942Z(this, rVar);
        }
        this.f1894v0.clear();
        removeCallbacks(this.f1896w0);
        Objects.requireNonNull(this.f1869j);
        do {
        } while (C0446d0.C0447a.f2092d.mo4463a() != null);
        C0464n nVar = this.f1862f0;
        if (nVar != null) {
            nVar.f2183e.remove(this);
            this.f1862f0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1885r.size();
        for (int i = 0; i < size; i++) {
            this.f1885r.get(i).mo2147e(canvas, this, this.f1866h0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f1881p != null && !this.f1900z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1881p.mo1952f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1881p.mo1950e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo2018d0((int) (f * this.f1856b0), (int) (f2 * this.f1857c0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & EnumBarcodeFormat_2.BF2_PLANET) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1881p.mo1952f()) {
                        f2 = -axisValue;
                    } else if (this.f1881p.mo1950e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo2018d0((int) (f * this.f1856b0), (int) (f2 * this.f1857c0), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                mo2018d0((int) (f * this.f1856b0), (int) (f2 * this.f1857c0), motionEvent);
            }
            f = 0.0f;
            mo2018d0((int) (f * this.f1856b0), (int) (f2 * this.f1857c0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f1900z) {
            return false;
        }
        this.f1889t = null;
        if (mo1986D(motionEvent)) {
            mo2062j();
            return true;
        }
        C0400l lVar = this.f1881p;
        if (lVar == null) {
            return false;
        }
        boolean e = lVar.mo1950e();
        boolean f = this.f1881p.mo1952f();
        if (this.f1847P == null) {
            this.f1847P = VelocityTracker.obtain();
        }
        this.f1847P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1832A) {
                this.f1832A = false;
            }
            this.f1846O = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1850S = x;
            this.f1848Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1851T = y;
            this.f1849R = y;
            if (this.f1845N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo2066l0(1);
            }
            int[] iArr = this.f1890t0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            mo2063j0(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f1847P.clear();
            mo2066l0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1846O);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1845N != 1) {
                int i = x2 - this.f1848Q;
                int i2 = y2 - this.f1849R;
                if (!e || Math.abs(i) <= this.f1852U) {
                    z = false;
                } else {
                    this.f1850S = x2;
                    z = true;
                }
                if (f && Math.abs(i2) > this.f1852U) {
                    this.f1851T = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo2062j();
        } else if (actionMasked == 5) {
            this.f1846O = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1850S = x3;
            this.f1848Q = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1851T = y3;
            this.f1849R = y3;
        } else if (actionMasked == 6) {
            mo2002V(motionEvent);
        }
        return this.f1845N == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C0887b.f3352a;
        Trace.beginSection("RV OnLayout");
        mo2084q();
        Trace.endSection();
        this.f1895w = true;
    }

    public void onMeasure(int i, int i2) {
        C0400l lVar = this.f1881p;
        if (lVar == null) {
            mo2070o(i, i2);
            return;
        }
        boolean z = false;
        if (lVar.mo1936U()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1881p.f1915b.mo2070o(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f1879o != null) {
                if (this.f1866h0.f1972d == 1) {
                    mo2085r();
                }
                this.f1881p.mo2191z0(i, i2);
                this.f1866h0.f1977i = true;
                mo2091s();
                this.f1881p.mo2151B0(i, i2);
                if (this.f1881p.mo1924E0()) {
                    this.f1881p.mo2191z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), EnumBarcodeFormat.BF_MICRO_QR), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), EnumBarcodeFormat.BF_MICRO_QR));
                    this.f1866h0.f1977i = true;
                    mo2091s();
                    this.f1881p.mo2151B0(i, i2);
                }
            }
        } else if (this.f1893v) {
            this.f1881p.f1915b.mo2070o(i, i2);
        } else {
            C0419w wVar = this.f1866h0;
            if (wVar.f1979k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0389d dVar = this.f1879o;
            if (dVar != null) {
                wVar.f1973e = dVar.mo2129a();
            } else {
                wVar.f1973e = 0;
            }
            mo2058i0();
            this.f1881p.f1915b.mo2070o(i, i2);
            mo2064k0(false);
            this.f1866h0.f1975g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo1996P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0414u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0414u uVar = (C0414u) parcelable;
        this.f1863g = uVar;
        super.onRestoreInstanceState(uVar.f4651e);
        C0400l lVar = this.f1881p;
        if (lVar != null && (parcelable2 = this.f1863g.f1954g) != null) {
            lVar.mo1960l0(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        C0414u uVar = new C0414u(super.onSaveInstanceState());
        C0414u uVar2 = this.f1863g;
        if (uVar2 != null) {
            uVar.f1954g = uVar2.f1954g;
        } else {
            C0400l lVar = this.f1881p;
            uVar.f1954g = lVar != null ? lVar.mo1962m0() : null;
        }
        return uVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo1995O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02fd, code lost:
        if (r0 < r5) goto L_0x0300;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r0.f1900z
            r3 = 0
            if (r2 != 0) goto L_0x03c2
            boolean r2 = r0.f1832A
            if (r2 == 0) goto L_0x000f
            goto L_0x03c2
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$o r2 = r0.f1889t
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0023
            int r2 = r25.getAction()
            if (r2 != 0) goto L_0x001e
            r2 = r3
            goto L_0x0031
        L_0x001e:
            boolean r2 = r24.mo1986D(r25)
            goto L_0x0031
        L_0x0023:
            r2.mo2201b(r0, r1)
            int r2 = r25.getAction()
            if (r2 == r4) goto L_0x002e
            if (r2 != r6) goto L_0x0030
        L_0x002e:
            r0.f1889t = r5
        L_0x0030:
            r2 = r6
        L_0x0031:
            if (r2 == 0) goto L_0x0037
            r24.mo2062j()
            return r6
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.f1881p
            if (r2 != 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r2 = r2.mo1950e()
            androidx.recyclerview.widget.RecyclerView$l r7 = r0.f1881p
            boolean r7 = r7.mo1952f()
            android.view.VelocityTracker r8 = r0.f1847P
            if (r8 != 0) goto L_0x0050
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r0.f1847P = r8
        L_0x0050:
            int r8 = r25.getActionMasked()
            int r9 = r25.getActionIndex()
            if (r8 != 0) goto L_0x0060
            int[] r10 = r0.f1890t0
            r10[r6] = r3
            r10[r3] = r3
        L_0x0060:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r25)
            int[] r11 = r0.f1890t0
            r12 = r11[r3]
            float r12 = (float) r12
            r11 = r11[r6]
            float r11 = (float) r11
            r10.offsetLocation(r12, r11)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x038c
            r12 = 2
            if (r8 == r6) goto L_0x016b
            if (r8 == r12) goto L_0x00a8
            if (r8 == r4) goto L_0x00a4
            r2 = 5
            if (r8 == r2) goto L_0x0089
            r2 = 6
            if (r8 == r2) goto L_0x0085
        L_0x0080:
            r1 = r3
            r19 = r10
            goto L_0x03b0
        L_0x0085:
            r24.mo2002V(r25)
            goto L_0x0080
        L_0x0089:
            int r2 = r1.getPointerId(r9)
            r0.f1846O = r2
            float r2 = r1.getX(r9)
            float r2 = r2 + r11
            int r2 = (int) r2
            r0.f1850S = r2
            r0.f1848Q = r2
            float r1 = r1.getY(r9)
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.f1851T = r1
            r0.f1849R = r1
            goto L_0x0080
        L_0x00a4:
            r24.mo2062j()
            goto L_0x0080
        L_0x00a8:
            int r4 = r0.f1846O
            int r4 = r1.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x00b1
            return r3
        L_0x00b1:
            float r5 = r1.getX(r4)
            float r5 = r5 + r11
            int r5 = (int) r5
            float r4 = r1.getY(r4)
            float r4 = r4 + r11
            int r4 = (int) r4
            int r8 = r0.f1850S
            int r8 = r8 - r5
            int r9 = r0.f1851T
            int r9 = r9 - r4
            int r11 = r0.f1845N
            if (r11 == r6) goto L_0x00f6
            if (r2 == 0) goto L_0x00dc
            int r11 = r0.f1852U
            if (r8 <= 0) goto L_0x00d3
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r3, r8)
            goto L_0x00d8
        L_0x00d3:
            int r8 = r8 + r11
            int r8 = java.lang.Math.min(r3, r8)
        L_0x00d8:
            if (r8 == 0) goto L_0x00dc
            r11 = r6
            goto L_0x00dd
        L_0x00dc:
            r11 = r3
        L_0x00dd:
            if (r7 == 0) goto L_0x00f1
            int r12 = r0.f1852U
            if (r9 <= 0) goto L_0x00e9
            int r9 = r9 - r12
            int r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ee
        L_0x00e9:
            int r9 = r9 + r12
            int r9 = java.lang.Math.min(r3, r9)
        L_0x00ee:
            if (r9 == 0) goto L_0x00f1
            r11 = r6
        L_0x00f1:
            if (r11 == 0) goto L_0x00f6
            r0.setScrollState(r6)
        L_0x00f6:
            int r11 = r0.f1845N
            if (r11 != r6) goto L_0x0080
            int[] r15 = r0.f1892u0
            r15[r3] = r3
            r15[r6] = r3
            if (r2 == 0) goto L_0x0104
            r13 = r8
            goto L_0x0105
        L_0x0104:
            r13 = r3
        L_0x0105:
            if (r7 == 0) goto L_0x0109
            r14 = r9
            goto L_0x010a
        L_0x0109:
            r14 = r3
        L_0x010a:
            int[] r11 = r0.f1888s0
            r17 = 0
            j0.g r12 = r24.getScrollingChildHelper()
            r16 = r11
            boolean r11 = r12.mo4527c(r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x013b
            int[] r11 = r0.f1892u0
            r12 = r11[r3]
            int r8 = r8 - r12
            r11 = r11[r6]
            int r9 = r9 - r11
            int[] r11 = r0.f1890t0
            r12 = r11[r3]
            int[] r13 = r0.f1888s0
            r14 = r13[r3]
            int r12 = r12 + r14
            r11[r3] = r12
            r12 = r11[r6]
            r13 = r13[r6]
            int r12 = r12 + r13
            r11[r6] = r12
            android.view.ViewParent r11 = r24.getParent()
            r11.requestDisallowInterceptTouchEvent(r6)
        L_0x013b:
            int[] r11 = r0.f1888s0
            r12 = r11[r3]
            int r5 = r5 - r12
            r0.f1850S = r5
            r5 = r11[r6]
            int r4 = r4 - r5
            r0.f1851T = r4
            if (r2 == 0) goto L_0x014b
            r2 = r8
            goto L_0x014c
        L_0x014b:
            r2 = r3
        L_0x014c:
            if (r7 == 0) goto L_0x0150
            r4 = r9
            goto L_0x0151
        L_0x0150:
            r4 = r3
        L_0x0151:
            boolean r1 = r0.mo2018d0(r2, r4, r1)
            if (r1 == 0) goto L_0x015e
            android.view.ViewParent r1 = r24.getParent()
            r1.requestDisallowInterceptTouchEvent(r6)
        L_0x015e:
            androidx.recyclerview.widget.n r1 = r0.f1862f0
            if (r1 == 0) goto L_0x0080
            if (r8 != 0) goto L_0x0166
            if (r9 == 0) goto L_0x0080
        L_0x0166:
            r1.mo2404a(r0, r8, r9)
            goto L_0x0080
        L_0x016b:
            android.view.VelocityTracker r1 = r0.f1847P
            r1.addMovement(r10)
            android.view.VelocityTracker r1 = r0.f1847P
            r4 = 1000(0x3e8, float:1.401E-42)
            int r8 = r0.f1855a0
            float r8 = (float) r8
            r1.computeCurrentVelocity(r4, r8)
            r1 = 0
            if (r2 == 0) goto L_0x0187
            android.view.VelocityTracker r2 = r0.f1847P
            int r4 = r0.f1846O
            float r2 = r2.getXVelocity(r4)
            float r2 = -r2
            goto L_0x0188
        L_0x0187:
            r2 = r1
        L_0x0188:
            if (r7 == 0) goto L_0x0194
            android.view.VelocityTracker r4 = r0.f1847P
            int r7 = r0.f1846O
            float r4 = r4.getYVelocity(r7)
            float r4 = -r4
            goto L_0x0195
        L_0x0194:
            r4 = r1
        L_0x0195:
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x01a2
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x019e
            goto L_0x01a2
        L_0x019e:
            r19 = r10
            goto L_0x0384
        L_0x01a2:
            int r2 = (int) r2
            int r4 = (int) r4
            androidx.recyclerview.widget.RecyclerView$l r7 = r0.f1881p
            if (r7 != 0) goto L_0x01ac
        L_0x01a8:
            r19 = r10
            goto L_0x0381
        L_0x01ac:
            boolean r8 = r0.f1900z
            if (r8 == 0) goto L_0x01b1
            goto L_0x01a8
        L_0x01b1:
            boolean r7 = r7.mo1950e()
            androidx.recyclerview.widget.RecyclerView$l r8 = r0.f1881p
            boolean r8 = r8.mo1952f()
            if (r7 == 0) goto L_0x01c5
            int r9 = java.lang.Math.abs(r2)
            int r11 = r0.f1854W
            if (r9 >= r11) goto L_0x01c6
        L_0x01c5:
            r2 = r3
        L_0x01c6:
            if (r8 == 0) goto L_0x01d0
            int r9 = java.lang.Math.abs(r4)
            int r11 = r0.f1854W
            if (r9 >= r11) goto L_0x01d1
        L_0x01d0:
            r4 = r3
        L_0x01d1:
            if (r2 != 0) goto L_0x01d6
            if (r4 != 0) goto L_0x01d6
            goto L_0x01a8
        L_0x01d6:
            float r9 = (float) r2
            float r11 = (float) r4
            boolean r13 = r0.dispatchNestedPreFling(r9, r11)
            if (r13 != 0) goto L_0x037e
            if (r7 != 0) goto L_0x01e5
            if (r8 == 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r13 = r3
            goto L_0x01e6
        L_0x01e5:
            r13 = r6
        L_0x01e6:
            r0.dispatchNestedFling(r9, r11, r13)
            androidx.recyclerview.widget.RecyclerView$n r9 = r0.f1853V
            if (r9 == 0) goto L_0x0316
            androidx.recyclerview.widget.b0 r9 = (androidx.recyclerview.widget.C0437b0) r9
            androidx.recyclerview.widget.RecyclerView r11 = r9.f2072a
            androidx.recyclerview.widget.RecyclerView$l r11 = r11.getLayoutManager()
            if (r11 != 0) goto L_0x01f8
            goto L_0x0200
        L_0x01f8:
            androidx.recyclerview.widget.RecyclerView r14 = r9.f2072a
            androidx.recyclerview.widget.RecyclerView$d r14 = r14.getAdapter()
            if (r14 != 0) goto L_0x0209
        L_0x0200:
            r0 = r3
            r20 = r7
            r22 = r8
            r19 = r10
            goto L_0x0310
        L_0x0209:
            androidx.recyclerview.widget.RecyclerView r14 = r9.f2072a
            int r14 = r14.getMinFlingVelocity()
            int r15 = java.lang.Math.abs(r4)
            if (r15 > r14) goto L_0x0224
            int r15 = java.lang.Math.abs(r2)
            if (r15 <= r14) goto L_0x021c
            goto L_0x0224
        L_0x021c:
            r20 = r7
            r22 = r8
            r19 = r10
            goto L_0x030f
        L_0x0224:
            boolean r14 = r11 instanceof androidx.recyclerview.widget.RecyclerView.C0416v.C0418b
            if (r14 != 0) goto L_0x0229
            goto L_0x023c
        L_0x0229:
            androidx.recyclerview.widget.v r9 = (androidx.recyclerview.widget.C0476v) r9
            if (r14 != 0) goto L_0x022f
            r15 = r5
            goto L_0x023a
        L_0x022f:
            androidx.recyclerview.widget.u r15 = new androidx.recyclerview.widget.u
            androidx.recyclerview.widget.RecyclerView r5 = r9.f2072a
            android.content.Context r5 = r5.getContext()
            r15.<init>(r9, r5)
        L_0x023a:
            if (r15 != 0) goto L_0x0244
        L_0x023c:
            r20 = r7
            r22 = r8
            r19 = r10
            goto L_0x030b
        L_0x0244:
            int r5 = r11.mo2162I()
            if (r5 != 0) goto L_0x024b
            goto L_0x0266
        L_0x024b:
            boolean r18 = r11.mo1952f()
            if (r18 == 0) goto L_0x0258
            androidx.recyclerview.widget.t r18 = r9.mo2434f(r11)
        L_0x0255:
            r12 = r18
            goto L_0x0264
        L_0x0258:
            boolean r18 = r11.mo1950e()
            if (r18 == 0) goto L_0x0263
            androidx.recyclerview.widget.t r18 = r9.mo2433e(r11)
            goto L_0x0255
        L_0x0263:
            r12 = 0
        L_0x0264:
            if (r12 != 0) goto L_0x026e
        L_0x0266:
            r20 = r7
            r22 = r8
            r19 = r10
            goto L_0x02ff
        L_0x026e:
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r11.mo2189x()
            r0 = r19
            r1 = 0
            r6 = 0
            r19 = r10
            r10 = 0
            r23 = r20
            r20 = r7
            r7 = r23
        L_0x0284:
            if (r10 >= r3) goto L_0x02a8
            r21 = r3
            android.view.View r3 = r11.mo2188w(r10)
            r22 = r8
            if (r3 != 0) goto L_0x0291
            goto L_0x02a1
        L_0x0291:
            int r8 = r9.mo2431c(r3, r12)
            if (r8 > 0) goto L_0x029b
            if (r8 <= r0) goto L_0x029b
            r6 = r3
            r0 = r8
        L_0x029b:
            if (r8 < 0) goto L_0x02a1
            if (r8 >= r7) goto L_0x02a1
            r1 = r3
            r7 = r8
        L_0x02a1:
            int r10 = r10 + 1
            r3 = r21
            r8 = r22
            goto L_0x0284
        L_0x02a8:
            r22 = r8
            boolean r0 = r11.mo1950e()
            if (r0 == 0) goto L_0x02b3
            if (r2 <= 0) goto L_0x02b7
            goto L_0x02b5
        L_0x02b3:
            if (r4 <= 0) goto L_0x02b7
        L_0x02b5:
            r0 = 1
            goto L_0x02b8
        L_0x02b7:
            r0 = 0
        L_0x02b8:
            if (r0 == 0) goto L_0x02c1
            if (r1 == 0) goto L_0x02c1
            int r0 = r11.mo2170Q(r1)
            goto L_0x0300
        L_0x02c1:
            if (r0 != 0) goto L_0x02ca
            if (r6 == 0) goto L_0x02ca
            int r0 = r11.mo2170Q(r6)
            goto L_0x0300
        L_0x02ca:
            if (r0 == 0) goto L_0x02cd
            r1 = r6
        L_0x02cd:
            if (r1 != 0) goto L_0x02d0
            goto L_0x02ff
        L_0x02d0:
            int r1 = r11.mo2170Q(r1)
            int r3 = r11.mo2162I()
            if (r14 == 0) goto L_0x02f4
            r6 = r11
            androidx.recyclerview.widget.RecyclerView$v$b r6 = (androidx.recyclerview.widget.RecyclerView.C0416v.C0418b) r6
            r7 = 1
            int r3 = r3 - r7
            android.graphics.PointF r3 = r6.mo1943a(r3)
            if (r3 == 0) goto L_0x02f4
            float r6 = r3.x
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x02f2
            float r3 = r3.y
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x02f4
        L_0x02f2:
            r3 = 1
            goto L_0x02f5
        L_0x02f4:
            r3 = 0
        L_0x02f5:
            if (r3 != r0) goto L_0x02f9
            r0 = -1
            goto L_0x02fa
        L_0x02f9:
            r0 = 1
        L_0x02fa:
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02ff
            if (r0 < r5) goto L_0x0300
        L_0x02ff:
            r0 = -1
        L_0x0300:
            r1 = -1
            if (r0 != r1) goto L_0x0305
            r3 = 0
            goto L_0x030b
        L_0x0305:
            r15.f1955a = r0
            r11.mo2161H0(r15)
            r3 = 1
        L_0x030b:
            if (r3 == 0) goto L_0x030f
            r0 = 1
            goto L_0x0310
        L_0x030f:
            r0 = 0
        L_0x0310:
            if (r0 == 0) goto L_0x031c
            r3 = 1
            r0 = r24
            goto L_0x0381
        L_0x0316:
            r20 = r7
            r22 = r8
            r19 = r10
        L_0x031c:
            if (r13 == 0) goto L_0x037b
            if (r22 == 0) goto L_0x0325
            r7 = r20 | 2
            r0 = r24
            goto L_0x0329
        L_0x0325:
            r0 = r24
            r7 = r20
        L_0x0329:
            r1 = 1
            r0.mo2063j0(r7, r1)
            int r1 = r0.f1855a0
            int r3 = -r1
            int r1 = java.lang.Math.min(r2, r1)
            int r8 = java.lang.Math.max(r3, r1)
            int r1 = r0.f1855a0
            int r2 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r9 = java.lang.Math.max(r2, r1)
            androidx.recyclerview.widget.RecyclerView$y r1 = r0.f1860e0
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            r3 = 2
            r2.setScrollState(r3)
            r2 = 0
            r1.f1984f = r2
            r1.f1983e = r2
            android.view.animation.Interpolator r2 = r1.f1986h
            android.view.animation.Interpolator r3 = f1829A0
            if (r2 == r3) goto L_0x0365
            r1.f1986h = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r3)
            r1.f1985g = r2
        L_0x0365:
            android.widget.OverScroller r5 = r1.f1985g
            r6 = 0
            r7 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.mo2231a()
            r3 = 1
            goto L_0x0381
        L_0x037b:
            r0 = r24
            goto L_0x0380
        L_0x037e:
            r19 = r10
        L_0x0380:
            r3 = 0
        L_0x0381:
            if (r3 != 0) goto L_0x0387
            r3 = 0
        L_0x0384:
            r0.setScrollState(r3)
        L_0x0387:
            r24.mo2010c0()
            r3 = 1
            goto L_0x03b1
        L_0x038c:
            r19 = r10
            int r4 = r1.getPointerId(r3)
            r0.f1846O = r4
            float r3 = r25.getX()
            float r3 = r3 + r11
            int r3 = (int) r3
            r0.f1850S = r3
            r0.f1848Q = r3
            float r1 = r25.getY()
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.f1851T = r1
            r0.f1849R = r1
            if (r7 == 0) goto L_0x03ac
            r2 = r2 | 2
        L_0x03ac:
            r1 = 0
            r0.mo2063j0(r2, r1)
        L_0x03b0:
            r3 = r1
        L_0x03b1:
            if (r3 != 0) goto L_0x03bb
            android.view.VelocityTracker r1 = r0.f1847P
            r2 = r19
            r1.addMovement(r2)
            goto L_0x03bd
        L_0x03bb:
            r2 = r19
        L_0x03bd:
            r2.recycle()
            r1 = 1
            return r1
        L_0x03c2:
            r1 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo2083p(View view) {
        C0422z L = m1204L(view);
        C0389d dVar = this.f1879o;
        if (dVar != null && L != null) {
            Objects.requireNonNull(dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d2, code lost:
        if (r15.f1867i.mo2350k(getFocusedChild()) == false) goto L_0x0396;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2084q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1879o
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            r1 = 0
            r0.f1977i = r1
            int r0 = r0.f1972d
            r2 = 1
            if (r0 != r2) goto L_0x0018
            r15.mo2085r()
            goto L_0x004a
        L_0x0018:
            androidx.recyclerview.widget.a r0 = r15.f1865h
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2064c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002c
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r0.f2063b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002c
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 != 0) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            int r0 = r0.f1927n
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            int r0 = r0.f1928o
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            r0.mo2190y0(r15)
            goto L_0x0052
        L_0x004a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            r0.mo2190y0(r15)
            r15.mo2091s()
        L_0x0052:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            r3 = 4
            r0.mo2228a(r3)
            r15.mo2058i0()
            r15.mo2000T()
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            r0.f1972d = r2
            boolean r0 = r0.f1978j
            r4 = 0
            if (r0 == 0) goto L_0x0236
            androidx.recyclerview.widget.c r0 = r15.f1867i
            int r0 = r0.mo2344e()
            int r0 = r0 - r2
        L_0x006e:
            if (r0 < 0) goto L_0x017f
            androidx.recyclerview.widget.c r5 = r15.f1867i
            android.view.View r5 = r5.mo2343d(r0)
            androidx.recyclerview.widget.RecyclerView$z r5 = m1204L(r5)
            boolean r6 = r5.mo2256u()
            if (r6 == 0) goto L_0x0082
            goto L_0x017b
        L_0x0082:
            long r6 = r15.mo1990I(r5)
            androidx.recyclerview.widget.RecyclerView$i r8 = r15.f1844M
            java.util.Objects.requireNonNull(r8)
            androidx.recyclerview.widget.RecyclerView$i$c r8 = new androidx.recyclerview.widget.RecyclerView$i$c
            r8.<init>()
            android.view.View r9 = r5.f1991a
            int r10 = r9.getLeft()
            r8.f1911a = r10
            int r10 = r9.getTop()
            r8.f1912b = r10
            r9.getRight()
            r9.getBottom()
            androidx.recyclerview.widget.d0 r9 = r15.f1869j
            p.e<androidx.recyclerview.widget.RecyclerView$z> r9 = r9.f2091b
            java.lang.Object r9 = r9.mo5536j(r6, r4)
            androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C0422z) r9
            if (r9 == 0) goto L_0x0176
            boolean r10 = r9.mo2256u()
            if (r10 != 0) goto L_0x0176
            androidx.recyclerview.widget.d0 r10 = r15.f1869j
            boolean r10 = r10.mo2370d(r9)
            androidx.recyclerview.widget.d0 r11 = r15.f1869j
            boolean r11 = r11.mo2370d(r5)
            if (r10 == 0) goto L_0x00c8
            if (r9 != r5) goto L_0x00c8
            goto L_0x0176
        L_0x00c8:
            androidx.recyclerview.widget.d0 r12 = r15.f1869j
            androidx.recyclerview.widget.RecyclerView$i$c r12 = r12.mo2371e(r9, r3)
            androidx.recyclerview.widget.d0 r13 = r15.f1869j
            r13.mo2368b(r5, r8)
            androidx.recyclerview.widget.d0 r8 = r15.f1869j
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r8.mo2371e(r5, r13)
            if (r12 != 0) goto L_0x014c
            androidx.recyclerview.widget.c r8 = r15.f1867i
            int r8 = r8.mo2344e()
            r10 = r1
        L_0x00e4:
            if (r10 >= r8) goto L_0x0142
            androidx.recyclerview.widget.c r11 = r15.f1867i
            android.view.View r11 = r11.mo2343d(r10)
            androidx.recyclerview.widget.RecyclerView$z r11 = m1204L(r11)
            if (r11 != r5) goto L_0x00f3
            goto L_0x013f
        L_0x00f3:
            long r12 = r15.mo1990I(r11)
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1879o
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.f1904b
            if (r0 == 0) goto L_0x0122
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = androidx.recyclerview.widget.C0436b.m1551a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = androidx.recyclerview.widget.C0436b.m1551a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x013f:
            int r10 = r10 + 1
            goto L_0x00e4
        L_0x0142:
            r9.toString()
            r5.toString()
            r15.mo1983A()
            goto L_0x017b
        L_0x014c:
            r9.mo2254t(r1)
            if (r10 == 0) goto L_0x0154
            r15.mo2029f(r9)
        L_0x0154:
            if (r9 == r5) goto L_0x016a
            if (r11 == 0) goto L_0x015b
            r15.mo2029f(r5)
        L_0x015b:
            r9.f1998h = r5
            r15.mo2029f(r9)
            androidx.recyclerview.widget.RecyclerView$r r6 = r15.f1861f
            r6.mo2217k(r9)
            r5.mo2254t(r1)
            r5.f1999i = r9
        L_0x016a:
            androidx.recyclerview.widget.RecyclerView$i r6 = r15.f1844M
            boolean r5 = r6.mo2138a(r9, r5, r12, r8)
            if (r5 == 0) goto L_0x017b
            r15.mo2003W()
            goto L_0x017b
        L_0x0176:
            androidx.recyclerview.widget.d0 r6 = r15.f1869j
            r6.mo2368b(r5, r8)
        L_0x017b:
            int r0 = r0 + -1
            goto L_0x006e
        L_0x017f:
            androidx.recyclerview.widget.d0 r0 = r15.f1869j
            androidx.recyclerview.widget.d0$b r3 = r15.f1898x0
            p.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r4 = r0.f2090a
            int r4 = r4.f4840g
        L_0x0187:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0236
            p.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r5 = r0.f2090a
            java.lang.Object r5 = r5.mo5614i(r4)
            r7 = r5
            androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C0422z) r7
            p.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r5 = r0.f2090a
            java.lang.Object r5 = r5.mo5616j(r4)
            androidx.recyclerview.widget.d0$a r5 = (androidx.recyclerview.widget.C0446d0.C0447a) r5
            int r6 = r5.f2093a
            r8 = r6 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01a4
            goto L_0x01ac
        L_0x01a4:
            r8 = r6 & 1
            if (r8 == 0) goto L_0x01bf
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2094b
            if (r6 != 0) goto L_0x01bc
        L_0x01ac:
            r6 = r3
            androidx.recyclerview.widget.RecyclerView$c r6 = (androidx.recyclerview.widget.RecyclerView.C0388c) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$l r8 = r6.f1881p
            android.view.View r7 = r7.f1991a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.f1861f
            r8.mo2182q0(r7, r6)
            goto L_0x0231
        L_0x01bc:
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f2095c
            goto L_0x021c
        L_0x01bf:
            r8 = r6 & 14
            r9 = 14
            if (r8 != r9) goto L_0x01c7
            goto L_0x0227
        L_0x01c7:
            r8 = r6 & 12
            r9 = 12
            if (r8 != r9) goto L_0x0215
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2094b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f2095c
            r12 = r3
            androidx.recyclerview.widget.RecyclerView$c r12 = (androidx.recyclerview.widget.RecyclerView.C0388c) r12
            java.util.Objects.requireNonNull(r12)
            r7.mo2254t(r1)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.f1835D
            androidx.recyclerview.widget.RecyclerView$i r9 = r9.f1844M
            if (r10 == 0) goto L_0x01e9
            boolean r6 = r9.mo2138a(r7, r7, r6, r8)
            if (r6 == 0) goto L_0x0231
            goto L_0x020f
        L_0x01e9:
            androidx.recyclerview.widget.a0 r9 = (androidx.recyclerview.widget.C0435a0) r9
            java.util.Objects.requireNonNull(r9)
            int r10 = r6.f1911a
            int r11 = r8.f1911a
            if (r10 != r11) goto L_0x0200
            int r13 = r6.f1912b
            int r14 = r8.f1912b
            if (r13 == r14) goto L_0x01fb
            goto L_0x0200
        L_0x01fb:
            r9.mo2139c(r7)
            r6 = r1
            goto L_0x020d
        L_0x0200:
            int r13 = r6.f1912b
            int r14 = r8.f1912b
            r6 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r14
            boolean r6 = r6.mo2337i(r7, r8, r9, r10, r11)
        L_0x020d:
            if (r6 == 0) goto L_0x0231
        L_0x020f:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.mo2003W()
            goto L_0x0231
        L_0x0215:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x0223
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2094b
            r8 = 0
        L_0x021c:
            r9 = r3
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.C0388c) r9
            r9.mo2128b(r7, r6, r8)
            goto L_0x0231
        L_0x0223:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0231
        L_0x0227:
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2094b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f2095c
            r9 = r3
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.C0388c) r9
            r9.mo2127a(r7, r6, r8)
        L_0x0231:
            androidx.recyclerview.widget.C0446d0.C0447a.m1593b(r5)
            goto L_0x0187
        L_0x0236:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            androidx.recyclerview.widget.RecyclerView$r r3 = r15.f1861f
            r0.mo2180p0(r3)
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            int r3 = r0.f1973e
            r0.f1970b = r3
            r15.f1835D = r1
            r15.f1836E = r1
            r0.f1978j = r1
            r0.f1979k = r1
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            r0.f1919f = r1
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f1861f
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f1946b
            if (r0 == 0) goto L_0x0258
            r0.clear()
        L_0x0258:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            boolean r3 = r0.f1924k
            if (r3 == 0) goto L_0x0267
            r0.f1923j = r1
            r0.f1924k = r1
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f1861f
            r0.mo2218l()
        L_0x0267:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1881p
            androidx.recyclerview.widget.RecyclerView$w r3 = r15.f1866h0
            r0.mo1902k0(r3)
            r15.mo2001U(r2)
            r15.mo2064k0(r1)
            androidx.recyclerview.widget.d0 r0 = r15.f1869j
            p.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r3 = r0.f2090a
            r3.clear()
            p.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f2091b
            r0.mo5531b()
            int[] r0 = r15.f1884q0
            r3 = r0[r1]
            r4 = r0[r2]
            r15.mo1987E(r0)
            int[] r0 = r15.f1884q0
            r5 = r0[r1]
            if (r5 != r3) goto L_0x0295
            r0 = r0[r2]
            if (r0 == r4) goto L_0x0294
            goto L_0x0295
        L_0x0294:
            r2 = r1
        L_0x0295:
            if (r2 == 0) goto L_0x029a
            r15.mo2120v(r1, r1)
        L_0x029a:
            boolean r0 = r15.f1858d0
            r2 = -1
            if (r0 == 0) goto L_0x0396
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1879o
            if (r0 == 0) goto L_0x0396
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x0396
            int r0 = r15.getDescendantFocusability()
            r4 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r4) goto L_0x0396
            int r0 = r15.getDescendantFocusability()
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r4) goto L_0x02c2
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x02c2
            goto L_0x0396
        L_0x02c2:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x02d6
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.c r4 = r15.f1867i
            boolean r0 = r4.mo2350k(r0)
            if (r0 != 0) goto L_0x02d6
            goto L_0x0396
        L_0x02d6:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            long r4 = r0.f1981m
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x031b
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1879o
            boolean r0 = r0.f1904b
            if (r0 == 0) goto L_0x031b
            if (r0 != 0) goto L_0x02e8
            r0 = 0
            goto L_0x0319
        L_0x02e8:
            androidx.recyclerview.widget.c r0 = r15.f1867i
            int r0 = r0.mo2347h()
            r6 = 0
            r7 = r1
        L_0x02f0:
            if (r7 >= r0) goto L_0x0318
            androidx.recyclerview.widget.c r8 = r15.f1867i
            android.view.View r8 = r8.mo2346g(r7)
            androidx.recyclerview.widget.RecyclerView$z r8 = m1204L(r8)
            if (r8 == 0) goto L_0x0315
            boolean r9 = r8.mo2247m()
            if (r9 != 0) goto L_0x0315
            long r9 = r8.f1995e
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0315
            androidx.recyclerview.widget.c r6 = r15.f1867i
            android.view.View r9 = r8.f1991a
            boolean r6 = r6.mo2350k(r9)
            if (r6 == 0) goto L_0x031c
            r6 = r8
        L_0x0315:
            int r7 = r7 + 1
            goto L_0x02f0
        L_0x0318:
            r0 = r6
        L_0x0319:
            r8 = r0
            goto L_0x031c
        L_0x031b:
            r8 = 0
        L_0x031c:
            if (r8 == 0) goto L_0x0334
            androidx.recyclerview.widget.c r0 = r15.f1867i
            android.view.View r4 = r8.f1991a
            boolean r0 = r0.mo2350k(r4)
            if (r0 != 0) goto L_0x0334
            android.view.View r0 = r8.f1991a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0331
            goto L_0x0334
        L_0x0331:
            android.view.View r0 = r8.f1991a
            goto L_0x037b
        L_0x0334:
            androidx.recyclerview.widget.c r0 = r15.f1867i
            int r0 = r0.mo2344e()
            if (r0 <= 0) goto L_0x037a
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            int r4 = r0.f1980l
            r5 = -1
            if (r4 == r5) goto L_0x0344
            r1 = r4
        L_0x0344:
            int r0 = r0.mo2229b()
            r4 = r1
        L_0x0349:
            if (r4 >= r0) goto L_0x0360
            androidx.recyclerview.widget.RecyclerView$z r5 = r15.mo1988G(r4)
            if (r5 != 0) goto L_0x0352
            goto L_0x0360
        L_0x0352:
            android.view.View r6 = r5.f1991a
            boolean r6 = r6.hasFocusable()
            if (r6 == 0) goto L_0x035d
            android.view.View r0 = r5.f1991a
            goto L_0x037b
        L_0x035d:
            int r4 = r4 + 1
            goto L_0x0349
        L_0x0360:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x0364:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x037a
            androidx.recyclerview.widget.RecyclerView$z r1 = r15.mo1988G(r0)
            if (r1 != 0) goto L_0x036f
            goto L_0x037a
        L_0x036f:
            android.view.View r4 = r1.f1991a
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L_0x0364
            android.view.View r0 = r1.f1991a
            goto L_0x037b
        L_0x037a:
            r0 = 0
        L_0x037b:
            if (r0 == 0) goto L_0x0396
            androidx.recyclerview.widget.RecyclerView$w r1 = r15.f1866h0
            int r1 = r1.f1982n
            long r4 = (long) r1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0393
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x0393
            boolean r4 = r1.isFocusable()
            if (r4 == 0) goto L_0x0393
            r0 = r1
        L_0x0393:
            r0.requestFocus()
        L_0x0396:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1866h0
            r0.f1981m = r2
            r1 = -1
            r0.f1980l = r1
            r0.f1982n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo2084q():void");
    }

    /* renamed from: r */
    public final void mo2085r() {
        int id;
        View C;
        this.f1866h0.mo2228a(1);
        mo1984B(this.f1866h0);
        this.f1866h0.f1977i = false;
        mo2058i0();
        C0446d0 d0Var = this.f1869j;
        d0Var.f2090a.clear();
        d0Var.f2091b.mo5531b();
        mo2000T();
        mo2004X();
        View focusedChild = (!this.f1858d0 || !hasFocus() || this.f1879o == null) ? null : getFocusedChild();
        C0422z K = (focusedChild == null || (C = mo1985C(focusedChild)) == null) ? null : mo1992K(C);
        long j = -1;
        if (K == null) {
            C0419w wVar = this.f1866h0;
            wVar.f1981m = -1;
            wVar.f1980l = -1;
            wVar.f1982n = -1;
        } else {
            C0419w wVar2 = this.f1866h0;
            if (this.f1879o.f1904b) {
                j = K.f1995e;
            }
            wVar2.f1981m = j;
            wVar2.f1980l = this.f1835D ? -1 : K.mo2247m() ? K.f1994d : K.mo2239e();
            C0419w wVar3 = this.f1866h0;
            View view = K.f1991a;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        wVar3.f1982n = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            wVar3.f1982n = id;
        }
        C0419w wVar4 = this.f1866h0;
        wVar4.f1976h = wVar4.f1978j && this.f1874l0;
        this.f1874l0 = false;
        this.f1872k0 = false;
        wVar4.f1975g = wVar4.f1979k;
        wVar4.f1973e = this.f1879o.mo2129a();
        mo1987E(this.f1884q0);
        if (this.f1866h0.f1978j) {
            int e = this.f1867i.mo2344e();
            for (int i = 0; i < e; i++) {
                C0422z L = m1204L(this.f1867i.mo2343d(i));
                if (!L.mo2256u() && (!L.mo2245k() || this.f1879o.f1904b)) {
                    C0394i iVar = this.f1844M;
                    C0394i.m1278b(L);
                    L.mo2241g();
                    this.f1869j.mo2369c(L, iVar.mo2144h(L));
                    if (this.f1866h0.f1976h && L.mo2250p() && !L.mo2247m() && !L.mo2256u() && !L.mo2245k()) {
                        this.f1869j.f2091b.mo5537k(mo1990I(L), L);
                    }
                }
            }
        }
        if (this.f1866h0.f1979k) {
            int h = this.f1867i.mo2347h();
            for (int i2 = 0; i2 < h; i2++) {
                C0422z L2 = m1204L(this.f1867i.mo2346g(i2));
                if (!L2.mo2256u() && L2.f1994d == -1) {
                    L2.f1994d = L2.f1993c;
                }
            }
            C0419w wVar5 = this.f1866h0;
            boolean z = wVar5.f1974f;
            wVar5.f1974f = false;
            this.f1881p.mo1901j0(this.f1861f, wVar5);
            this.f1866h0.f1974f = z;
            for (int i3 = 0; i3 < this.f1867i.mo2344e(); i3++) {
                C0422z L3 = m1204L(this.f1867i.mo2343d(i3));
                if (!L3.mo2256u()) {
                    C0446d0.C0447a orDefault = this.f1869j.f2090a.getOrDefault(L3, null);
                    if (!((orDefault == null || (orDefault.f2093a & 4) == 0) ? false : true)) {
                        C0394i.m1278b(L3);
                        boolean h2 = L3.mo2242h(8192);
                        C0394i iVar2 = this.f1844M;
                        L3.mo2241g();
                        C0394i.C0397c h3 = iVar2.mo2144h(L3);
                        if (h2) {
                            mo2006Z(L3, h3);
                        } else {
                            C0446d0 d0Var2 = this.f1869j;
                            C0446d0.C0447a orDefault2 = d0Var2.f2090a.getOrDefault(L3, null);
                            if (orDefault2 == null) {
                                orDefault2 = C0446d0.C0447a.m1592a();
                                d0Var2.f2090a.put(L3, orDefault2);
                            }
                            orDefault2.f2093a |= 2;
                            orDefault2.f2094b = h3;
                        }
                    }
                }
            }
        }
        mo2065l();
        mo2001U(true);
        mo2064k0(false);
        this.f1866h0.f1972d = 2;
    }

    public void removeDetachedView(View view, boolean z) {
        C0422z L = m1204L(view);
        if (L != null) {
            if (L.mo2249o()) {
                L.f2000j &= -257;
            } else if (!L.mo2256u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L);
                throw new IllegalArgumentException(C0436b.m1551a(this, sb));
            }
        }
        view.clearAnimation();
        mo2083p(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        C0416v vVar = this.f1881p.f1918e;
        boolean z = true;
        if (!(vVar != null && vVar.f1959e) && !mo1996P()) {
            z = false;
        }
        if (!z && view2 != null) {
            mo2009b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1881p.mo2186t0(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1887s.size();
        for (int i = 0; i < size; i++) {
            this.f1887s.get(i).mo2202c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f1897x != 0 || this.f1900z) {
            this.f1899y = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void mo2091s() {
        mo2058i0();
        mo2000T();
        this.f1866h0.mo2228a(6);
        this.f1865h.mo2323c();
        this.f1866h0.f1973e = this.f1879o.mo2129a();
        C0419w wVar = this.f1866h0;
        wVar.f1971c = 0;
        wVar.f1975g = false;
        this.f1881p.mo1901j0(this.f1861f, wVar);
        C0419w wVar2 = this.f1866h0;
        wVar2.f1974f = false;
        this.f1863g = null;
        wVar2.f1978j = wVar2.f1978j && this.f1844M != null;
        wVar2.f1972d = 4;
        mo2001U(true);
        mo2064k0(false);
    }

    public void scrollBy(int i, int i2) {
        C0400l lVar = this.f1881p;
        if (lVar != null && !this.f1900z) {
            boolean e = lVar.mo1950e();
            boolean f = this.f1881p.mo1952f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                mo2018d0(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo1996P()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.f1833B |= i;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0479y yVar) {
        this.f1880o0 = yVar;
        C1061o.m3034o(this, yVar);
    }

    public void setAdapter(C0389d dVar) {
        setLayoutFrozen(false);
        C0389d dVar2 = this.f1879o;
        if (dVar2 != null) {
            dVar2.f1903a.unregisterObserver(this.f1859e);
            Objects.requireNonNull(this.f1879o);
        }
        mo2007a0();
        C0432a aVar = this.f1865h;
        aVar.mo2332l(aVar.f2063b);
        aVar.mo2332l(aVar.f2064c);
        C0389d dVar3 = this.f1879o;
        this.f1879o = dVar;
        if (dVar != null) {
            dVar.f1903a.registerObserver(this.f1859e);
        }
        C0411r rVar = this.f1861f;
        C0389d dVar4 = this.f1879o;
        rVar.mo2208b();
        C0409q d = rVar.mo2210d();
        Objects.requireNonNull(d);
        if (dVar3 != null) {
            d.f1940b--;
        }
        if (d.f1940b == 0) {
            for (int i = 0; i < d.f1939a.size(); i++) {
                d.f1939a.valueAt(i).f1941a.clear();
            }
        }
        if (dVar4 != null) {
            d.f1940b++;
        }
        this.f1866h0.f1974f = true;
        mo2005Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0392g gVar) {
        if (gVar != this.f1882p0) {
            this.f1882p0 = gVar;
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f1871k) {
            mo1995O();
        }
        this.f1871k = z;
        super.setClipToPadding(z);
        if (this.f1895w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0393h hVar) {
        Objects.requireNonNull(hVar);
        this.f1839H = hVar;
        mo1995O();
    }

    public void setHasFixedSize(boolean z) {
        this.f1893v = z;
    }

    public void setItemAnimator(C0394i iVar) {
        C0394i iVar2 = this.f1844M;
        if (iVar2 != null) {
            iVar2.mo2142f();
            this.f1844M.f1905a = null;
        }
        this.f1844M = iVar;
        if (iVar != null) {
            iVar.f1905a = this.f1876m0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0411r rVar = this.f1861f;
        rVar.f1949e = i;
        rVar.mo2218l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0400l lVar) {
        if (lVar != this.f1881p) {
            mo2068m0();
            if (this.f1881p != null) {
                C0394i iVar = this.f1844M;
                if (iVar != null) {
                    iVar.mo2142f();
                }
                this.f1881p.mo2179o0(this.f1861f);
                this.f1881p.mo2180p0(this.f1861f);
                this.f1861f.mo2208b();
                if (this.f1891u) {
                    C0400l lVar2 = this.f1881p;
                    C0411r rVar = this.f1861f;
                    lVar2.f1920g = false;
                    lVar2.mo1942Z(this, rVar);
                }
                this.f1881p.mo2153C0((RecyclerView) null);
                this.f1881p = null;
            } else {
                this.f1861f.mo2208b();
            }
            C0439c cVar = this.f1867i;
            C0439c.C0440a aVar = cVar.f2077b;
            aVar.f2079a = 0;
            C0439c.C0440a aVar2 = aVar.f2080b;
            if (aVar2 != null) {
                aVar2.mo2359g();
            }
            int size = cVar.f2078c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0477w wVar = (C0477w) cVar.f2076a;
                Objects.requireNonNull(wVar);
                C0422z L = m1204L(cVar.f2078c.get(size));
                if (L != null) {
                    wVar.f2220a.mo2033g0(L, L.f2006p);
                    L.f2006p = 0;
                }
                cVar.f2078c.remove(size);
            }
            C0477w wVar2 = (C0477w) cVar.f2076a;
            int b = wVar2.mo2436b();
            for (int i = 0; i < b; i++) {
                View a = wVar2.mo2435a(i);
                wVar2.f2220a.mo2083p(a);
                a.clearAnimation();
            }
            wVar2.f2220a.removeAllViews();
            this.f1881p = lVar;
            if (lVar != null) {
                if (lVar.f1915b == null) {
                    lVar.mo2153C0(this);
                    if (this.f1891u) {
                        this.f1881p.f1920g = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(C0436b.m1551a(lVar.f1915b, sb));
                }
            }
            this.f1861f.mo2218l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1053g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3801d) {
            View view = scrollingChildHelper.f3800c;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f3801d = z;
    }

    public void setOnFlingListener(C0406n nVar) {
        this.f1853V = nVar;
    }

    @Deprecated
    public void setOnScrollListener(C0408p pVar) {
        this.f1868i0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1858d0 = z;
    }

    public void setRecycledViewPool(C0409q qVar) {
        C0411r rVar = this.f1861f;
        C0409q qVar2 = rVar.f1951g;
        if (qVar2 != null) {
            qVar2.f1940b--;
        }
        rVar.f1951g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f1951g.f1940b++;
        }
    }

    public void setRecyclerListener(C0412s sVar) {
        this.f1883q = sVar;
    }

    public void setScrollState(int i) {
        C0416v vVar;
        if (i != this.f1845N) {
            this.f1845N = i;
            if (i != 2) {
                this.f1860e0.mo2233c();
                C0400l lVar = this.f1881p;
                if (!(lVar == null || (vVar = lVar.f1918e) == null)) {
                    vVar.mo2225c();
                }
            }
            C0400l lVar2 = this.f1881p;
            if (lVar2 != null) {
                lVar2.mo2178n0(i);
            }
            C0408p pVar = this.f1868i0;
            if (pVar != null) {
                pVar.mo2203a(this, i);
            }
            List<C0408p> list = this.f1870j0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.f1870j0.get(size).mo2203a(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1852U = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(C0420x xVar) {
        Objects.requireNonNull(this.f1861f);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo4533i(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo4534j(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f1900z) {
            mo2057i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f1900z = false;
                if (!(!this.f1899y || this.f1881p == null || this.f1879o == null)) {
                    requestLayout();
                }
                this.f1899y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1900z = true;
            this.f1832A = true;
            mo2068m0();
        }
    }

    /* renamed from: t */
    public boolean mo2118t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo4527c(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: u */
    public final void mo2119u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo4530f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: v */
    public void mo2120v(int i, int i2) {
        this.f1838G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        C0408p pVar = this.f1868i0;
        if (pVar != null) {
            pVar.mo2204b(this, i, i2);
        }
        List<C0408p> list = this.f1870j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1870j0.get(size).mo2204b(this, i, i2);
            }
        }
        this.f1838G--;
    }

    /* renamed from: w */
    public void mo2121w() {
        int i;
        int i2;
        if (this.f1843L == null) {
            EdgeEffect a = this.f1839H.mo2137a(this);
            this.f1843L = a;
            if (this.f1871k) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: x */
    public void mo2122x() {
        int i;
        int i2;
        if (this.f1840I == null) {
            EdgeEffect a = this.f1839H.mo2137a(this);
            this.f1840I = a;
            if (this.f1871k) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: y */
    public void mo2123y() {
        int i;
        int i2;
        if (this.f1842K == null) {
            EdgeEffect a = this.f1839H.mo2137a(this);
            this.f1842K = a;
            if (this.f1871k) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: z */
    public void mo2124z() {
        int i;
        int i2;
        if (this.f1841J == null) {
            EdgeEffect a = this.f1839H.mo2137a(this);
            this.f1841J = a;
            if (this.f1871k) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }
}
