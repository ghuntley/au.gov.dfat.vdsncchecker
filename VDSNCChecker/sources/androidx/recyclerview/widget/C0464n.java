package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p034f0.C0887b;

/* renamed from: androidx.recyclerview.widget.n */
public final class C0464n implements Runnable {

    /* renamed from: i */
    public static final ThreadLocal<C0464n> f2181i = new ThreadLocal<>();

    /* renamed from: j */
    public static Comparator<C0467c> f2182j = new C0465a();

    /* renamed from: e */
    public ArrayList<RecyclerView> f2183e = new ArrayList<>();

    /* renamed from: f */
    public long f2184f;

    /* renamed from: g */
    public long f2185g;

    /* renamed from: h */
    public ArrayList<C0467c> f2186h = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.n$a */
    public static class C0465a implements Comparator<C0467c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.n$c r7 = (androidx.recyclerview.widget.C0464n.C0467c) r7
                androidx.recyclerview.widget.n$c r8 = (androidx.recyclerview.widget.C0464n.C0467c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2194d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2194d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f2191a
                boolean r3 = r8.f2191a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f2192b
                int r2 = r7.f2192b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f2193c
                int r8 = r8.f2193c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0464n.C0465a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.n$b */
    public static class C0466b implements RecyclerView.C0400l.C0403c {

        /* renamed from: a */
        public int f2187a;

        /* renamed from: b */
        public int f2188b;

        /* renamed from: c */
        public int[] f2189c;

        /* renamed from: d */
        public int f2190d;

        /* renamed from: a */
        public void mo2409a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2190d * 2;
                int[] iArr = this.f2189c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2189c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f2189c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2189c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f2190d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo2410b(RecyclerView recyclerView, boolean z) {
            this.f2190d = 0;
            int[] iArr = this.f2189c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0400l lVar = recyclerView.f1881p;
            if (recyclerView.f1879o != null && lVar != null && lVar.f1922i) {
                if (z) {
                    if (!recyclerView.f1865h.mo2327g()) {
                        lVar.mo1956j(recyclerView.f1879o.mo2129a(), this);
                    }
                } else if (!recyclerView.mo1994N()) {
                    lVar.mo1954i(this.f2187a, this.f2188b, recyclerView.f1866h0, this);
                }
                int i = this.f2190d;
                if (i > lVar.f1923j) {
                    lVar.f1923j = i;
                    lVar.f1924k = z;
                    recyclerView.f1861f.mo2218l();
                }
            }
        }

        /* renamed from: c */
        public boolean mo2411c(int i) {
            if (this.f2189c != null) {
                int i2 = this.f2190d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2189c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$c */
    public static class C0467c {

        /* renamed from: a */
        public boolean f2191a;

        /* renamed from: b */
        public int f2192b;

        /* renamed from: c */
        public int f2193c;

        /* renamed from: d */
        public RecyclerView f2194d;

        /* renamed from: e */
        public int f2195e;
    }

    /* renamed from: a */
    public void mo2404a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2184f == 0) {
            this.f2184f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0466b bVar = recyclerView.f1864g0;
        bVar.f2187a = i;
        bVar.f2188b = i2;
    }

    /* renamed from: b */
    public void mo2405b(long j) {
        C0467c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0467c cVar2;
        int size = this.f2183e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f2183e.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f1864g0.mo2410b(recyclerView3, false);
                i += recyclerView3.f1864g0.f2190d;
            }
        }
        this.f2186h.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f2183e.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0466b bVar = recyclerView4.f1864g0;
                int abs = Math.abs(bVar.f2188b) + Math.abs(bVar.f2187a);
                for (int i5 = 0; i5 < bVar.f2190d * 2; i5 += 2) {
                    if (i3 >= this.f2186h.size()) {
                        cVar2 = new C0467c();
                        this.f2186h.add(cVar2);
                    } else {
                        cVar2 = this.f2186h.get(i3);
                    }
                    int[] iArr = bVar.f2189c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f2191a = i6 <= abs;
                    cVar2.f2192b = abs;
                    cVar2.f2193c = i6;
                    cVar2.f2194d = recyclerView4;
                    cVar2.f2195e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2186h, f2182j);
        for (int i7 = 0; i7 < this.f2186h.size() && (recyclerView = cVar.f2194d) != null; i7++) {
            RecyclerView.C0422z c = mo2406c(recyclerView, (cVar = this.f2186h.get(i7)).f2195e, cVar.f2191a ? Long.MAX_VALUE : j);
            if (!(c == null || c.f1992b == null || !c.mo2244j() || c.mo2245k() || (recyclerView2 = (RecyclerView) c.f1992b.get()) == null)) {
                if (recyclerView2.f1835D && recyclerView2.f1867i.mo2347h() != 0) {
                    recyclerView2.mo2007a0();
                }
                C0466b bVar2 = recyclerView2.f1864g0;
                bVar2.mo2410b(recyclerView2, true);
                if (bVar2.f2190d != 0) {
                    try {
                        int i8 = C0887b.f3352a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.C0419w wVar = recyclerView2.f1866h0;
                        RecyclerView.C0389d dVar = recyclerView2.f1879o;
                        wVar.f1972d = 1;
                        wVar.f1973e = dVar.mo2129a();
                        wVar.f1975g = false;
                        wVar.f1976h = false;
                        wVar.f1977i = false;
                        for (int i9 = 0; i9 < bVar2.f2190d * 2; i9 += 2) {
                            mo2406c(recyclerView2, bVar2.f2189c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C0887b.f3352a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f2191a = false;
            cVar.f2192b = 0;
            cVar.f2193c = 0;
            cVar.f2194d = null;
            cVar.f2195e = 0;
        }
    }

    /* renamed from: c */
    public final RecyclerView.C0422z mo2406c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f1867i.mo2347h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.C0422z L = RecyclerView.m1204L(recyclerView.f1867i.mo2346g(i2));
            if (L.f1993c == i && !L.mo2245k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0411r rVar = recyclerView.f1861f;
        try {
            recyclerView.mo2000T();
            RecyclerView.C0422z j2 = rVar.mo2216j(i, false, j);
            if (j2 != null) {
                if (!j2.mo2244j() || j2.mo2245k()) {
                    rVar.mo2207a(j2, false);
                } else {
                    rVar.mo2213g(j2.f1991a);
                }
            }
            return j2;
        } finally {
            recyclerView.mo2001U(false);
        }
    }

    public void run() {
        try {
            int i = C0887b.f3352a;
            Trace.beginSection("RV Prefetch");
            if (this.f2183e.isEmpty()) {
                this.f2184f = 0;
                Trace.endSection();
                return;
            }
            int size = this.f2183e.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f2183e.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f2184f = 0;
                Trace.endSection();
                return;
            }
            mo2405b(TimeUnit.MILLISECONDS.toNanos(j) + this.f2185g);
            this.f2184f = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2184f = 0;
            int i3 = C0887b.f3352a;
            Trace.endSection();
            throw th;
        }
    }
}
