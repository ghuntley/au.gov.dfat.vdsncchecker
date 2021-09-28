package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0131a0;
import androidx.recyclerview.widget.C0464n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p064k0.C1150b;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f1778E = false;

    /* renamed from: F */
    public int f1779F = -1;

    /* renamed from: G */
    public int[] f1780G;

    /* renamed from: H */
    public View[] f1781H;

    /* renamed from: I */
    public final SparseIntArray f1782I = new SparseIntArray();

    /* renamed from: J */
    public final SparseIntArray f1783J = new SparseIntArray();

    /* renamed from: K */
    public C0380c f1784K = new C0378a();

    /* renamed from: L */
    public final Rect f1785L = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0378a extends C0380c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0379b extends RecyclerView.C0405m {

        /* renamed from: e */
        public int f1786e = -1;

        /* renamed from: f */
        public int f1787f = 0;

        public C0379b(int i, int i2) {
            super(i, i2);
        }

        public C0379b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0379b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0379b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0380c {

        /* renamed from: a */
        public final SparseIntArray f1788a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f1789b = new SparseIntArray();

        /* renamed from: a */
        public int mo1923a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        mo1922z1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo1922z1(RecyclerView.C0400l.m1290R(context, attributeSet, i, i2).f1932b);
    }

    /* renamed from: A0 */
    public void mo1885A0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f1780G == null) {
            super.mo1885A0(rect, i, i2);
        }
        int O = mo2168O() + mo2167N();
        int M = mo2166M() + mo2169P();
        if (this.f1794p == 1) {
            i4 = RecyclerView.C0400l.m1292h(i2, rect.height() + M, mo2164K());
            int[] iArr = this.f1780G;
            i3 = RecyclerView.C0400l.m1292h(i, iArr[iArr.length - 1] + O, mo2165L());
        } else {
            i3 = RecyclerView.C0400l.m1292h(i, rect.width() + O, mo2165L());
            int[] iArr2 = this.f1780G;
            i4 = RecyclerView.C0400l.m1292h(i2, iArr2[iArr2.length - 1] + M, mo2164K());
        }
        this.f1915b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: A1 */
    public final void mo1886A1() {
        int i;
        int i2;
        if (this.f1794p == 1) {
            i2 = this.f1927n - mo2168O();
            i = mo2167N();
        } else {
            i2 = this.f1928o - mo2166M();
            i = mo2169P();
        }
        mo1908r1(i2 - i);
    }

    /* renamed from: I0 */
    public boolean mo1887I0() {
        return this.f1804z == null && !this.f1778E;
    }

    /* renamed from: K0 */
    public void mo1888K0(RecyclerView.C0419w wVar, LinearLayoutManager.C0383c cVar, RecyclerView.C0400l.C0403c cVar2) {
        int i = this.f1779F;
        for (int i2 = 0; i2 < this.f1779F && cVar.mo1976b(wVar) && i > 0; i2++) {
            ((C0464n.C0466b) cVar2).mo2409a(cVar.f1817d, Math.max(0, cVar.f1820g));
            Objects.requireNonNull(this.f1784K);
            i--;
            cVar.f1817d += cVar.f1818e;
        }
    }

    /* renamed from: S */
    public int mo1889S(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (this.f1794p == 0) {
            return this.f1779F;
        }
        if (wVar.mo2229b() < 1) {
            return 0;
        }
        return mo1913u1(rVar, wVar, wVar.mo2229b() - 1) + 1;
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
            if (Q >= 0 && Q < i3 && mo1916v1(rVar, wVar, Q) == 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fe, code lost:
        if (r13 == (r2 > r9)) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1891a0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0411r r25, androidx.recyclerview.widget.RecyclerView.C0419w r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo2183r(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r5
            int r6 = r5.f1786e
            int r5 = r5.f1787f
            int r5 = r5 + r6
            android.view.View r7 = super.mo1891a0(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.mo1930O0(r7)
            r8 = 1
            if (r7 != r8) goto L_0x002b
            r7 = r8
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f1799u
            if (r7 == r10) goto L_0x0032
            r7 = r8
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.mo2189x()
            int r7 = r7 - r8
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r22.mo2189x()
            r11 = r7
            r12 = r8
            r7 = 0
        L_0x0045:
            int r13 = r0.f1794p
            if (r13 != r8) goto L_0x0051
            boolean r13 = r22.mo1951e1()
            if (r13 == 0) goto L_0x0051
            r13 = r8
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo1913u1(r1, r2, r7)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0144
            r17 = r11
            int r11 = r0.mo1913u1(r1, r2, r10)
            android.view.View r1 = r0.mo2188w(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0144
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r11 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x007a
            goto L_0x0144
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r14
            r14 = 1
            goto L_0x0132
        L_0x0085:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r11
            int r2 = r11.f1786e
            r18 = r3
            int r3 = r11.f1787f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b0
            if (r7 != 0) goto L_0x00b0
        L_0x00ad:
            r21 = r7
            goto L_0x00ce
        L_0x00b0:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d5
            if (r7 <= r8) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            if (r7 != r8) goto L_0x0102
            if (r2 <= r15) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            if (r13 != r7) goto L_0x0102
        L_0x00ce:
            r19 = r8
            r20 = r14
            r7 = 1
            r14 = 1
            goto L_0x0108
        L_0x00d5:
            if (r4 != 0) goto L_0x0102
            r19 = r8
            androidx.recyclerview.widget.c0 r8 = r0.f1916c
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r8 = r8.mo2363b(r1, r14)
            if (r8 == 0) goto L_0x00ef
            androidx.recyclerview.widget.c0 r8 = r0.f1917d
            boolean r8 = r8.mo2363b(r1, r14)
            if (r8 == 0) goto L_0x00ef
            r8 = 1
            goto L_0x00f0
        L_0x00ef:
            r8 = 0
        L_0x00f0:
            r14 = 1
            r8 = r8 ^ r14
            if (r8 == 0) goto L_0x0107
            if (r7 <= r12) goto L_0x00f7
            goto L_0x0100
        L_0x00f7:
            if (r7 != r12) goto L_0x0107
            if (r2 <= r9) goto L_0x00fd
            r7 = r14
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            if (r13 != r7) goto L_0x0107
        L_0x0100:
            r7 = r14
            goto L_0x0108
        L_0x0102:
            r19 = r8
            r20 = r14
            r14 = 1
        L_0x0107:
            r7 = 0
        L_0x0108:
            if (r7 == 0) goto L_0x0132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0121
            int r4 = r11.f1786e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r8 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0136
        L_0x0121:
            int r7 = r11.f1786e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r9 = r7
            r8 = r19
            r7 = r1
            goto L_0x0136
        L_0x0132:
            r8 = r19
            r7 = r21
        L_0x0136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L_0x005e
        L_0x0144:
            r21 = r7
            if (r4 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r4 = r21
        L_0x014b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1891a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* renamed from: d0 */
    public void mo1892d0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, View view, C1150b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0379b)) {
            mo2177c0(view, bVar);
            return;
        }
        C0379b bVar2 = (C0379b) layoutParams;
        int u1 = mo1913u1(rVar, wVar, bVar2.mo2197a());
        if (this.f1794p == 0) {
            i4 = bVar2.f1786e;
            i3 = bVar2.f1787f;
            i = 1;
            z2 = false;
            z = false;
            i2 = u1;
        } else {
            i3 = 1;
            i2 = bVar2.f1786e;
            i = bVar2.f1787f;
            z2 = false;
            z = false;
            i4 = u1;
        }
        bVar.mo4769j(C1150b.C1153c.m3389a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: e0 */
    public void mo1893e0(RecyclerView recyclerView, int i, int i2) {
        this.f1784K.f1788a.clear();
        this.f1784K.f1789b.clear();
    }

    /* renamed from: f0 */
    public void mo1894f0(RecyclerView recyclerView) {
        this.f1784K.f1788a.clear();
        this.f1784K.f1789b.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0259  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1895f1(androidx.recyclerview.widget.RecyclerView.C0411r r19, androidx.recyclerview.widget.RecyclerView.C0419w r20, androidx.recyclerview.widget.LinearLayoutManager.C0383c r21, androidx.recyclerview.widget.LinearLayoutManager.C0382b r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            androidx.recyclerview.widget.t r3 = r6.f1796r
            int r3 = r3.mo2424j()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = r8
            goto L_0x0019
        L_0x0018:
            r9 = r5
        L_0x0019:
            int r10 = r18.mo2189x()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f1780G
            int r11 = r6.f1779F
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = r5
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r18.mo1886A1()
        L_0x002c:
            int r11 = r2.f1818e
            if (r11 != r8) goto L_0x0032
            r11 = r8
            goto L_0x0033
        L_0x0032:
            r11 = r5
        L_0x0033:
            int r12 = r6.f1779F
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f1817d
            int r12 = r6.mo1916v1(r0, r1, r12)
            int r13 = r2.f1817d
            int r13 = r6.mo1917w1(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = r5
        L_0x0045:
            int r14 = r6.f1779F
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.mo1976b(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f1817d
            int r15 = r6.mo1917w1(r0, r1, r14)
            int r4 = r6.f1779F
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.mo1977c(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f1781H
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f1779F
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f1811b = r8
            return
        L_0x00a2:
            if (r11 == 0) goto L_0x00aa
            r12 = r5
            r15 = r12
            r16 = r8
            r14 = r13
            goto L_0x00b0
        L_0x00aa:
            int r12 = r13 + -1
            r15 = r5
            r14 = -1
            r16 = -1
        L_0x00b0:
            if (r12 == r14) goto L_0x00cf
            android.view.View[] r4 = r6.f1781H
            r4 = r4[r12]
            android.view.ViewGroup$LayoutParams r17 = r4.getLayoutParams()
            r8 = r17
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r8
            int r4 = r6.mo2170Q(r4)
            int r4 = r6.mo1917w1(r0, r1, r4)
            r8.f1787f = r4
            r8.f1786e = r15
            int r15 = r15 + r4
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00b0
        L_0x00cf:
            r0 = 0
            r1 = r5
            r4 = r1
        L_0x00d2:
            if (r1 >= r13) goto L_0x012b
            android.view.View[] r8 = r6.f1781H
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r12 = r2.f1824k
            if (r12 != 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e2
            r6.mo2175b(r8)
            goto L_0x00f2
        L_0x00e2:
            r6.mo2176c(r8, r5, r5)
            goto L_0x00f2
        L_0x00e6:
            if (r11 == 0) goto L_0x00ee
            r12 = -1
            r14 = 1
            r6.mo2176c(r8, r12, r14)
            goto L_0x00f2
        L_0x00ee:
            r14 = 1
            r6.mo2176c(r8, r5, r14)
        L_0x00f2:
            android.graphics.Rect r12 = r6.f1785L
            androidx.recyclerview.widget.RecyclerView r14 = r6.f1915b
            if (r14 != 0) goto L_0x00fc
            r12.set(r5, r5, r5, r5)
            goto L_0x0103
        L_0x00fc:
            android.graphics.Rect r14 = r14.mo1993M(r8)
            r12.set(r14)
        L_0x0103:
            r6.mo1919x1(r8, r3, r5)
            androidx.recyclerview.widget.t r12 = r6.f1796r
            int r12 = r12.mo2417c(r8)
            if (r12 <= r4) goto L_0x010f
            r4 = r12
        L_0x010f:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r12 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r12
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.t r15 = r6.f1796r
            int r8 = r15.mo2418d(r8)
            float r8 = (float) r8
            float r8 = r8 * r14
            int r12 = r12.f1787f
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0128
            r0 = r8
        L_0x0128:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x012b:
            if (r9 == 0) goto L_0x0156
            int r1 = r6.f1779F
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r10)
            r6.mo1908r1(r0)
            r0 = r5
            r4 = r0
        L_0x013e:
            if (r0 >= r13) goto L_0x0156
            android.view.View[] r1 = r6.f1781H
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r6.mo1919x1(r1, r3, r8)
            androidx.recyclerview.widget.t r3 = r6.f1796r
            int r1 = r3.mo2417c(r1)
            if (r1 <= r4) goto L_0x0153
            r4 = r1
        L_0x0153:
            int r0 = r0 + 1
            goto L_0x013e
        L_0x0156:
            r0 = r5
        L_0x0157:
            if (r0 >= r13) goto L_0x01b8
            android.view.View[] r1 = r6.f1781H
            r1 = r1[r0]
            androidx.recyclerview.widget.t r3 = r6.f1796r
            int r3 = r3.mo2417c(r1)
            if (r3 == r4) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r3
            android.graphics.Rect r8 = r3.f1936b
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r3.topMargin
            int r9 = r9 + r10
            int r10 = r3.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r3.leftMargin
            int r10 = r10 + r8
            int r8 = r3.rightMargin
            int r10 = r10 + r8
            int r8 = r3.f1786e
            int r11 = r3.f1787f
            int r8 = r6.mo1911t1(r8, r11)
            int r11 = r6.f1794p
            r12 = 1
            if (r11 != r12) goto L_0x019f
            int r3 = r3.width
            r11 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.C0400l.m1293y(r8, r11, r10, r3, r5)
            int r8 = r4 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01ae
        L_0x019f:
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = r4 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r3 = r3.height
            int r8 = androidx.recyclerview.widget.RecyclerView.C0400l.m1293y(r8, r11, r9, r3, r5)
            r3 = r10
        L_0x01ae:
            r6.mo1920y1(r1, r3, r8, r12)
            goto L_0x01b5
        L_0x01b2:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 1
        L_0x01b5:
            int r0 = r0 + 1
            goto L_0x0157
        L_0x01b8:
            r12 = 1
            r7.f1810a = r4
            int r0 = r6.f1794p
            if (r0 != r12) goto L_0x01d1
            int r0 = r2.f1819f
            r1 = -1
            if (r0 != r1) goto L_0x01c9
            int r0 = r2.f1815b
            int r1 = r0 - r4
            goto L_0x01cd
        L_0x01c9:
            int r1 = r2.f1815b
            int r0 = r4 + r1
        L_0x01cd:
            r2 = r1
            r1 = r5
            r3 = r1
            goto L_0x01e3
        L_0x01d1:
            r1 = -1
            int r0 = r2.f1819f
            if (r0 != r1) goto L_0x01db
            int r0 = r2.f1815b
            int r1 = r0 - r4
            goto L_0x01df
        L_0x01db:
            int r1 = r2.f1815b
            int r0 = r4 + r1
        L_0x01df:
            r3 = r1
            r2 = r5
            r1 = r0
            r0 = r2
        L_0x01e3:
            r8 = r5
        L_0x01e4:
            if (r8 >= r13) goto L_0x026d
            android.view.View[] r4 = r6.f1781H
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C0379b) r10
            int r4 = r6.f1794p
            r5 = 1
            if (r4 != r5) goto L_0x022a
            boolean r1 = r18.mo1951e1()
            if (r1 == 0) goto L_0x0213
            int r1 = r18.mo2167N()
            int[] r3 = r6.f1780G
            int r4 = r6.f1779F
            int r5 = r10.f1786e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.f1796r
            int r3 = r3.mo2418d(r9)
            int r3 = r1 - r3
            goto L_0x023c
        L_0x0213:
            int r1 = r18.mo2167N()
            int[] r3 = r6.f1780G
            int r4 = r10.f1786e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.f1796r
            int r3 = r3.mo2418d(r9)
            int r3 = r3 + r1
            r11 = r0
            r15 = r1
            r14 = r2
            r12 = r3
            goto L_0x0240
        L_0x022a:
            int r0 = r18.mo2169P()
            int[] r2 = r6.f1780G
            int r4 = r10.f1786e
            r2 = r2[r4]
            int r2 = r2 + r0
            androidx.recyclerview.widget.t r0 = r6.f1796r
            int r0 = r0.mo2418d(r9)
            int r0 = r0 + r2
        L_0x023c:
            r11 = r0
            r12 = r1
            r14 = r2
            r15 = r3
        L_0x0240:
            r0 = r18
            r1 = r9
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r11
            r0.mo2172W(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo2199c()
            if (r0 != 0) goto L_0x0259
            boolean r0 = r10.mo2198b()
            if (r0 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r0 = 1
            goto L_0x025c
        L_0x0259:
            r0 = 1
            r7.f1812c = r0
        L_0x025c:
            boolean r1 = r7.f1813d
            boolean r2 = r9.hasFocusable()
            r1 = r1 | r2
            r7.f1813d = r1
            int r8 = r8 + 1
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            goto L_0x01e4
        L_0x026d:
            android.view.View[] r0 = r6.f1781H
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1895f1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: g */
    public boolean mo1896g(RecyclerView.C0405m mVar) {
        return mVar instanceof C0379b;
    }

    /* renamed from: g0 */
    public void mo1897g0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f1784K.f1788a.clear();
        this.f1784K.f1789b.clear();
    }

    /* renamed from: g1 */
    public void mo1898g1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, LinearLayoutManager.C0381a aVar, int i) {
        mo1886A1();
        if (wVar.mo2229b() > 0 && !wVar.f1975g) {
            boolean z = i == 1;
            int v1 = mo1916v1(rVar, wVar, aVar.f1806b);
            if (z) {
                while (v1 > 0) {
                    int i2 = aVar.f1806b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f1806b = i3;
                    v1 = mo1916v1(rVar, wVar, i3);
                }
            } else {
                int b = wVar.mo2229b() - 1;
                int i4 = aVar.f1806b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int v12 = mo1916v1(rVar, wVar, i5);
                    if (v12 <= v1) {
                        break;
                    }
                    i4 = i5;
                    v1 = v12;
                }
                aVar.f1806b = i4;
            }
        }
        mo1909s1();
    }

    /* renamed from: h0 */
    public void mo1899h0(RecyclerView recyclerView, int i, int i2) {
        this.f1784K.f1788a.clear();
        this.f1784K.f1789b.clear();
    }

    /* renamed from: i0 */
    public void mo1900i0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f1784K.f1788a.clear();
        this.f1784K.f1789b.clear();
    }

    /* renamed from: j0 */
    public void mo1901j0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (wVar.f1975g) {
            int x = mo2189x();
            for (int i = 0; i < x; i++) {
                C0379b bVar = (C0379b) mo2188w(i).getLayoutParams();
                int a = bVar.mo2197a();
                this.f1782I.put(a, bVar.f1787f);
                this.f1783J.put(a, bVar.f1786e);
            }
        }
        super.mo1901j0(rVar, wVar);
        this.f1782I.clear();
        this.f1783J.clear();
    }

    /* renamed from: k0 */
    public void mo1902k0(RecyclerView.C0419w wVar) {
        this.f1804z = null;
        this.f1802x = -1;
        this.f1803y = Integer.MIN_VALUE;
        this.f1790A.mo1973d();
        this.f1778E = false;
    }

    /* renamed from: l */
    public int mo1903l(RecyclerView.C0419w wVar) {
        return mo1928M0(wVar);
    }

    /* renamed from: m */
    public int mo1904m(RecyclerView.C0419w wVar) {
        return mo1929N0(wVar);
    }

    /* renamed from: n1 */
    public void mo1905n1(boolean z) {
        if (!z) {
            mo1948d((String) null);
            if (this.f1800v) {
                this.f1800v = false;
                mo2187u0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: o */
    public int mo1906o(RecyclerView.C0419w wVar) {
        return mo1928M0(wVar);
    }

    /* renamed from: p */
    public int mo1907p(RecyclerView.C0419w wVar) {
        return mo1929N0(wVar);
    }

    /* renamed from: r1 */
    public final void mo1908r1(int i) {
        int i2;
        int[] iArr = this.f1780G;
        int i3 = this.f1779F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1780G = iArr;
    }

    /* renamed from: s1 */
    public final void mo1909s1() {
        View[] viewArr = this.f1781H;
        if (viewArr == null || viewArr.length != this.f1779F) {
            this.f1781H = new View[this.f1779F];
        }
    }

    /* renamed from: t */
    public RecyclerView.C0405m mo1910t() {
        return this.f1794p == 0 ? new C0379b(-2, -1) : new C0379b(-1, -2);
    }

    /* renamed from: t1 */
    public int mo1911t1(int i, int i2) {
        if (this.f1794p != 1 || !mo1951e1()) {
            int[] iArr = this.f1780G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1780G;
        int i3 = this.f1779F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: u */
    public RecyclerView.C0405m mo1912u(Context context, AttributeSet attributeSet) {
        return new C0379b(context, attributeSet);
    }

    /* renamed from: u1 */
    public final int mo1913u1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, int i) {
        if (!wVar.f1975g) {
            return this.f1784K.mo1923a(i, this.f1779F);
        }
        int c = rVar.mo2209c(i);
        if (c == -1) {
            return 0;
        }
        return this.f1784K.mo1923a(c, this.f1779F);
    }

    /* renamed from: v */
    public RecyclerView.C0405m mo1914v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0379b((ViewGroup.MarginLayoutParams) layoutParams) : new C0379b(layoutParams);
    }

    /* renamed from: v0 */
    public int mo1915v0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        mo1886A1();
        mo1909s1();
        if (this.f1794p == 1) {
            return 0;
        }
        return mo1961l1(i, rVar, wVar);
    }

    /* renamed from: v1 */
    public final int mo1916v1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, int i) {
        if (!wVar.f1975g) {
            C0380c cVar = this.f1784K;
            int i2 = this.f1779F;
            Objects.requireNonNull(cVar);
            return i % i2;
        }
        int i3 = this.f1783J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = rVar.mo2209c(i);
        if (c == -1) {
            return 0;
        }
        C0380c cVar2 = this.f1784K;
        int i4 = this.f1779F;
        Objects.requireNonNull(cVar2);
        return c % i4;
    }

    /* renamed from: w1 */
    public final int mo1917w1(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, int i) {
        if (wVar.f1975g) {
            int i2 = this.f1782I.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            if (rVar.mo2209c(i) == -1) {
                return 1;
            }
        }
        Objects.requireNonNull(this.f1784K);
        return 1;
    }

    /* renamed from: x0 */
    public int mo1918x0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        mo1886A1();
        mo1909s1();
        if (this.f1794p == 0) {
            return 0;
        }
        return mo1961l1(i, rVar, wVar);
    }

    /* renamed from: x1 */
    public final void mo1919x1(View view, int i, boolean z) {
        int i2;
        int i3;
        C0379b bVar = (C0379b) view.getLayoutParams();
        Rect rect = bVar.f1936b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int t1 = mo1911t1(bVar.f1786e, bVar.f1787f);
        if (this.f1794p == 1) {
            i2 = RecyclerView.C0400l.m1293y(t1, i, i5, bVar.width, false);
            i3 = RecyclerView.C0400l.m1293y(this.f1796r.mo2426l(), this.f1926m, i4, bVar.height, true);
        } else {
            int y = RecyclerView.C0400l.m1293y(t1, i, i4, bVar.height, false);
            int y2 = RecyclerView.C0400l.m1293y(this.f1796r.mo2426l(), this.f1925l, i5, bVar.width, true);
            i3 = y;
            i2 = y2;
        }
        mo1920y1(view, i2, i3, z);
    }

    /* renamed from: y1 */
    public final void mo1920y1(View view, int i, int i2, boolean z) {
        RecyclerView.C0405m mVar = (RecyclerView.C0405m) view.getLayoutParams();
        if (z ? mo2158F0(view, i, i2, mVar) : mo2155D0(view, i, i2, mVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: z */
    public int mo1921z(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (this.f1794p == 1) {
            return this.f1779F;
        }
        if (wVar.mo2229b() < 1) {
            return 0;
        }
        return mo1913u1(rVar, wVar, wVar.mo2229b() - 1) + 1;
    }

    /* renamed from: z1 */
    public void mo1922z1(int i) {
        if (i != this.f1779F) {
            this.f1778E = true;
            if (i >= 1) {
                this.f1779F = i;
                this.f1784K.f1788a.clear();
                mo2187u0();
                return;
            }
            throw new IllegalArgumentException(C0131a0.m344a("Span count should be at least 1. Provided ", i));
        }
    }
}
