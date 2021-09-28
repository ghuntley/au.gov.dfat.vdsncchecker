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
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0464n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p000a.C0001b;
import p064k0.C1150b;

public class StaggeredGridLayoutManager extends RecyclerView.C0400l implements RecyclerView.C0416v.C0418b {

    /* renamed from: A */
    public int f2009A;

    /* renamed from: B */
    public C0426d f2010B;

    /* renamed from: C */
    public int f2011C;

    /* renamed from: D */
    public boolean f2012D;

    /* renamed from: E */
    public boolean f2013E;

    /* renamed from: F */
    public C0429e f2014F;

    /* renamed from: G */
    public final Rect f2015G;

    /* renamed from: H */
    public final C0424b f2016H;

    /* renamed from: I */
    public boolean f2017I;

    /* renamed from: J */
    public int[] f2018J;

    /* renamed from: K */
    public final Runnable f2019K;

    /* renamed from: p */
    public int f2020p = -1;

    /* renamed from: q */
    public C0431f[] f2021q;

    /* renamed from: r */
    public C0474t f2022r;

    /* renamed from: s */
    public C0474t f2023s;

    /* renamed from: t */
    public int f2024t;

    /* renamed from: u */
    public int f2025u;

    /* renamed from: v */
    public final C0468o f2026v;

    /* renamed from: w */
    public boolean f2027w;

    /* renamed from: x */
    public boolean f2028x;

    /* renamed from: y */
    public BitSet f2029y;

    /* renamed from: z */
    public int f2030z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0423a implements Runnable {
        public C0423a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo2259K0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0424b {

        /* renamed from: a */
        public int f2032a;

        /* renamed from: b */
        public int f2033b;

        /* renamed from: c */
        public boolean f2034c;

        /* renamed from: d */
        public boolean f2035d;

        /* renamed from: e */
        public boolean f2036e;

        /* renamed from: f */
        public int[] f2037f;

        public C0424b() {
            mo2291b();
        }

        /* renamed from: a */
        public void mo2290a() {
            this.f2033b = this.f2034c ? StaggeredGridLayoutManager.this.f2022r.mo2421g() : StaggeredGridLayoutManager.this.f2022r.mo2425k();
        }

        /* renamed from: b */
        public void mo2291b() {
            this.f2032a = -1;
            this.f2033b = Integer.MIN_VALUE;
            this.f2034c = false;
            this.f2035d = false;
            this.f2036e = false;
            int[] iArr = this.f2037f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0425c extends RecyclerView.C0405m {

        /* renamed from: e */
        public C0431f f2039e;

        public C0425c(int i, int i2) {
            super(i, i2);
        }

        public C0425c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0425c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0425c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0426d {

        /* renamed from: a */
        public int[] f2040a;

        /* renamed from: b */
        public List<C0427a> f2041b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0427a implements Parcelable {
            public static final Parcelable.Creator<C0427a> CREATOR = new C0428a();

            /* renamed from: e */
            public int f2042e;

            /* renamed from: f */
            public int f2043f;

            /* renamed from: g */
            public int[] f2044g;

            /* renamed from: h */
            public boolean f2045h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            public static class C0428a implements Parcelable.Creator<C0427a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0427a(parcel);
                }

                public Object[] newArray(int i) {
                    return new C0427a[i];
                }
            }

            public C0427a() {
            }

            public C0427a(Parcel parcel) {
                this.f2042e = parcel.readInt();
                this.f2043f = parcel.readInt();
                this.f2045h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2044g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a = C0001b.m0a("FullSpanItem{mPosition=");
                a.append(this.f2042e);
                a.append(", mGapDir=");
                a.append(this.f2043f);
                a.append(", mHasUnwantedGapAfter=");
                a.append(this.f2045h);
                a.append(", mGapPerSpan=");
                a.append(Arrays.toString(this.f2044g));
                a.append('}');
                return a.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2042e);
                parcel.writeInt(this.f2043f);
                parcel.writeInt(this.f2045h ? 1 : 0);
                int[] iArr = this.f2044g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2044g);
            }
        }

        /* renamed from: a */
        public void mo2292a() {
            int[] iArr = this.f2040a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2041b = null;
        }

        /* renamed from: b */
        public void mo2293b(int i) {
            int[] iArr = this.f2040a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2040a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2040a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2040a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public C0427a mo2294c(int i) {
            List<C0427a> list = this.f2041b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0427a aVar = this.f2041b.get(size);
                if (aVar.f2042e == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo2295d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f2040a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2041b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.mo2294c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2041b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2041b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2041b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0426d.C0427a) r3
                int r3 = r3.f2042e
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2041b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0426d.C0427a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2041b
                r3.remove(r2)
                int r0 = r0.f2042e
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f2040a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f2040a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f2040a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0426d.mo2295d(int):int");
        }

        /* renamed from: e */
        public void mo2296e(int i, int i2) {
            int[] iArr = this.f2040a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo2293b(i3);
                int[] iArr2 = this.f2040a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2040a, i, i3, -1);
                List<C0427a> list = this.f2041b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0427a aVar = this.f2041b.get(size);
                        int i4 = aVar.f2042e;
                        if (i4 >= i) {
                            aVar.f2042e = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo2297f(int i, int i2) {
            int[] iArr = this.f2040a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo2293b(i3);
                int[] iArr2 = this.f2040a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2040a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<C0427a> list = this.f2041b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0427a aVar = this.f2041b.get(size);
                        int i4 = aVar.f2042e;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f2041b.remove(size);
                            } else {
                                aVar.f2042e = i4 - i2;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0429e implements Parcelable {
        public static final Parcelable.Creator<C0429e> CREATOR = new C0430a();

        /* renamed from: e */
        public int f2046e;

        /* renamed from: f */
        public int f2047f;

        /* renamed from: g */
        public int f2048g;

        /* renamed from: h */
        public int[] f2049h;

        /* renamed from: i */
        public int f2050i;

        /* renamed from: j */
        public int[] f2051j;

        /* renamed from: k */
        public List<C0426d.C0427a> f2052k;

        /* renamed from: l */
        public boolean f2053l;

        /* renamed from: m */
        public boolean f2054m;

        /* renamed from: n */
        public boolean f2055n;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class C0430a implements Parcelable.Creator<C0429e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0429e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0429e[i];
            }
        }

        public C0429e() {
        }

        public C0429e(Parcel parcel) {
            this.f2046e = parcel.readInt();
            this.f2047f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2048g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2049h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2050i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2051j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f2053l = parcel.readInt() == 1;
            this.f2054m = parcel.readInt() == 1;
            this.f2055n = parcel.readInt() == 1 ? true : z;
            this.f2052k = parcel.readArrayList(C0426d.C0427a.class.getClassLoader());
        }

        public C0429e(C0429e eVar) {
            this.f2048g = eVar.f2048g;
            this.f2046e = eVar.f2046e;
            this.f2047f = eVar.f2047f;
            this.f2049h = eVar.f2049h;
            this.f2050i = eVar.f2050i;
            this.f2051j = eVar.f2051j;
            this.f2053l = eVar.f2053l;
            this.f2054m = eVar.f2054m;
            this.f2055n = eVar.f2055n;
            this.f2052k = eVar.f2052k;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2046e);
            parcel.writeInt(this.f2047f);
            parcel.writeInt(this.f2048g);
            if (this.f2048g > 0) {
                parcel.writeIntArray(this.f2049h);
            }
            parcel.writeInt(this.f2050i);
            if (this.f2050i > 0) {
                parcel.writeIntArray(this.f2051j);
            }
            parcel.writeInt(this.f2053l ? 1 : 0);
            parcel.writeInt(this.f2054m ? 1 : 0);
            parcel.writeInt(this.f2055n ? 1 : 0);
            parcel.writeList(this.f2052k);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0431f {

        /* renamed from: a */
        public ArrayList<View> f2056a = new ArrayList<>();

        /* renamed from: b */
        public int f2057b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f2058c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f2059d = 0;

        /* renamed from: e */
        public final int f2060e;

        public C0431f(int i) {
            this.f2060e = i;
        }

        /* renamed from: a */
        public void mo2307a(View view) {
            C0425c j = mo2316j(view);
            j.f2039e = this;
            this.f2056a.add(view);
            this.f2058c = Integer.MIN_VALUE;
            if (this.f2056a.size() == 1) {
                this.f2057b = Integer.MIN_VALUE;
            }
            if (j.mo2199c() || j.mo2198b()) {
                this.f2059d = StaggeredGridLayoutManager.this.f2022r.mo2417c(view) + this.f2059d;
            }
        }

        /* renamed from: b */
        public void mo2308b() {
            ArrayList<View> arrayList = this.f2056a;
            View view = arrayList.get(arrayList.size() - 1);
            C0425c j = mo2316j(view);
            this.f2058c = StaggeredGridLayoutManager.this.f2022r.mo2416b(view);
            Objects.requireNonNull(j);
        }

        /* renamed from: c */
        public void mo2309c() {
            View view = this.f2056a.get(0);
            C0425c j = mo2316j(view);
            this.f2057b = StaggeredGridLayoutManager.this.f2022r.mo2419e(view);
            Objects.requireNonNull(j);
        }

        /* renamed from: d */
        public void mo2310d() {
            this.f2056a.clear();
            this.f2057b = Integer.MIN_VALUE;
            this.f2058c = Integer.MIN_VALUE;
            this.f2059d = 0;
        }

        /* renamed from: e */
        public int mo2311e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2027w) {
                i2 = this.f2056a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2056a.size();
            }
            return mo2313g(i2, i, true);
        }

        /* renamed from: f */
        public int mo2312f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2027w) {
                i2 = 0;
                i = this.f2056a.size();
            } else {
                i2 = this.f2056a.size() - 1;
                i = -1;
            }
            return mo2313g(i2, i, true);
        }

        /* renamed from: g */
        public int mo2313g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.f2022r.mo2425k();
            int g = StaggeredGridLayoutManager.this.f2022r.mo2421g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2056a.get(i);
                int e = StaggeredGridLayoutManager.this.f2022r.mo2419e(view);
                int b = StaggeredGridLayoutManager.this.f2022r.mo2416b(view);
                boolean z2 = false;
                boolean z3 = !z ? e < g : e <= g;
                if (!z ? b > k : b >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e < k || b > g)) {
                    return StaggeredGridLayoutManager.this.mo2170Q(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: h */
        public int mo2314h(int i) {
            int i2 = this.f2058c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2056a.size() == 0) {
                return i;
            }
            mo2308b();
            return this.f2058c;
        }

        /* renamed from: i */
        public View mo2315i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2056a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2056a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2027w && staggeredGridLayoutManager.mo2170Q(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2027w && staggeredGridLayoutManager2.mo2170Q(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2056a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2056a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2027w && staggeredGridLayoutManager3.mo2170Q(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2027w && staggeredGridLayoutManager4.mo2170Q(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: j */
        public C0425c mo2316j(View view) {
            return (C0425c) view.getLayoutParams();
        }

        /* renamed from: k */
        public int mo2317k(int i) {
            int i2 = this.f2057b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2056a.size() == 0) {
                return i;
            }
            mo2309c();
            return this.f2057b;
        }

        /* renamed from: l */
        public void mo2318l() {
            int size = this.f2056a.size();
            View remove = this.f2056a.remove(size - 1);
            C0425c j = mo2316j(remove);
            j.f2039e = null;
            if (j.mo2199c() || j.mo2198b()) {
                this.f2059d -= StaggeredGridLayoutManager.this.f2022r.mo2417c(remove);
            }
            if (size == 1) {
                this.f2057b = Integer.MIN_VALUE;
            }
            this.f2058c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public void mo2319m() {
            View remove = this.f2056a.remove(0);
            C0425c j = mo2316j(remove);
            j.f2039e = null;
            if (this.f2056a.size() == 0) {
                this.f2058c = Integer.MIN_VALUE;
            }
            if (j.mo2199c() || j.mo2198b()) {
                this.f2059d -= StaggeredGridLayoutManager.this.f2022r.mo2417c(remove);
            }
            this.f2057b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public void mo2320n(View view) {
            C0425c j = mo2316j(view);
            j.f2039e = this;
            this.f2056a.add(0, view);
            this.f2057b = Integer.MIN_VALUE;
            if (this.f2056a.size() == 1) {
                this.f2058c = Integer.MIN_VALUE;
            }
            if (j.mo2199c() || j.mo2198b()) {
                this.f2059d = StaggeredGridLayoutManager.this.f2022r.mo2417c(view) + this.f2059d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2027w = false;
        this.f2028x = false;
        this.f2030z = -1;
        this.f2009A = Integer.MIN_VALUE;
        this.f2010B = new C0426d();
        this.f2011C = 2;
        this.f2015G = new Rect();
        this.f2016H = new C0424b();
        this.f2017I = true;
        this.f2019K = new C0423a();
        RecyclerView.C0400l.C0404d R = RecyclerView.C0400l.m1290R(context, attributeSet, i, i2);
        int i3 = R.f1931a;
        if (i3 == 0 || i3 == 1) {
            mo1948d((String) null);
            if (i3 != this.f2024t) {
                this.f2024t = i3;
                C0474t tVar = this.f2022r;
                this.f2022r = this.f2023s;
                this.f2023s = tVar;
                mo2187u0();
            }
            int i4 = R.f1932b;
            mo1948d((String) null);
            if (i4 != this.f2020p) {
                this.f2010B.mo2292a();
                mo2187u0();
                this.f2020p = i4;
                this.f2029y = new BitSet(this.f2020p);
                this.f2021q = new C0431f[this.f2020p];
                for (int i5 = 0; i5 < this.f2020p; i5++) {
                    this.f2021q[i5] = new C0431f(i5);
                }
                mo2187u0();
            }
            boolean z = R.f1933c;
            mo1948d((String) null);
            C0429e eVar = this.f2014F;
            if (!(eVar == null || eVar.f2053l == z)) {
                eVar.f2053l = z;
            }
            this.f2027w = z;
            mo2187u0();
            this.f2026v = new C0468o();
            this.f2022r = C0474t.m1652a(this, this.f2024t);
            this.f2023s = C0474t.m1652a(this, 1 - this.f2024t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: A0 */
    public void mo1885A0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int O = mo2168O() + mo2167N();
        int M = mo2166M() + mo2169P();
        if (this.f2024t == 1) {
            i4 = RecyclerView.C0400l.m1292h(i2, rect.height() + M, mo2164K());
            i3 = RecyclerView.C0400l.m1292h(i, (this.f2025u * this.f2020p) + O, mo2165L());
        } else {
            i3 = RecyclerView.C0400l.m1292h(i, rect.width() + O, mo2165L());
            i4 = RecyclerView.C0400l.m1292h(i2, (this.f2025u * this.f2020p) + M, mo2164K());
        }
        this.f1915b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: G0 */
    public void mo1925G0(RecyclerView recyclerView, RecyclerView.C0419w wVar, int i) {
        C0469p pVar = new C0469p(recyclerView.getContext());
        pVar.f1955a = i;
        mo2161H0(pVar);
    }

    /* renamed from: I0 */
    public boolean mo1887I0() {
        return this.f2014F == null;
    }

    /* renamed from: J0 */
    public final int mo2258J0(int i) {
        if (mo2189x() == 0) {
            return this.f2028x ? 1 : -1;
        }
        return (i < mo2268T0()) != this.f2028x ? -1 : 1;
    }

    /* renamed from: K0 */
    public boolean mo2259K0() {
        int i;
        if (!(mo2189x() == 0 || this.f2011C == 0 || !this.f1920g)) {
            if (this.f2028x) {
                i = mo2269U0();
                mo2268T0();
            } else {
                i = mo2268T0();
                mo2269U0();
            }
            if (i == 0 && mo2273Y0() != null) {
                this.f2010B.mo2292a();
                this.f1919f = true;
                mo2187u0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public final int mo2260L0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        return C0481z.m1697a(wVar, this.f2022r, mo2265Q0(!this.f2017I), mo2264P0(!this.f2017I), this, this.f2017I);
    }

    /* renamed from: M0 */
    public final int mo2261M0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        return C0481z.m1698b(wVar, this.f2022r, mo2265Q0(!this.f2017I), mo2264P0(!this.f2017I), this, this.f2017I, this.f2028x);
    }

    /* renamed from: N0 */
    public final int mo2262N0(RecyclerView.C0419w wVar) {
        if (mo2189x() == 0) {
            return 0;
        }
        return C0481z.m1699c(wVar, this.f2022r, mo2265Q0(!this.f2017I), mo2264P0(!this.f2017I), this, this.f2017I);
    }

    /* renamed from: O0 */
    public final int mo2263O0(RecyclerView.C0411r rVar, C0468o oVar, RecyclerView.C0419w wVar) {
        int i;
        C0431f fVar;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        RecyclerView.C0411r rVar2 = rVar;
        C0468o oVar2 = oVar;
        boolean z4 = false;
        this.f2029y.set(0, this.f2020p, true);
        if (this.f2026v.f2204i) {
            i = oVar2.f2200e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = oVar2.f2200e == 1 ? oVar2.f2202g + oVar2.f2197b : oVar2.f2201f - oVar2.f2197b;
        }
        mo2285k1(oVar2.f2200e, i);
        int g = this.f2028x ? this.f2022r.mo2421g() : this.f2022r.mo2425k();
        boolean z5 = false;
        while (true) {
            int i14 = oVar2.f2198c;
            if (!((i14 < 0 || i14 >= wVar.mo2229b()) ? z4 : true) || (!this.f2026v.f2204i && this.f2029y.isEmpty())) {
                boolean z6 = z4;
            } else {
                View view = rVar2.mo2216j(oVar2.f2198c, z4, Long.MAX_VALUE).f1991a;
                oVar2.f2198c += oVar2.f2199d;
                C0425c cVar = (C0425c) view.getLayoutParams();
                int a = cVar.mo2197a();
                int[] iArr = this.f2010B.f2040a;
                int i15 = (iArr == null || a >= iArr.length) ? -1 : iArr[a];
                if (i15 == -1 ? true : z4) {
                    if (mo2277c1(oVar2.f2200e)) {
                        i13 = this.f2020p - 1;
                        i12 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.f2020p;
                        i13 = z4;
                        i11 = 1;
                    }
                    C0431f fVar2 = null;
                    if (oVar2.f2200e == 1) {
                        int k = this.f2022r.mo2425k();
                        int i16 = Integer.MAX_VALUE;
                        while (i13 != i12) {
                            C0431f fVar3 = this.f2021q[i13];
                            int h = fVar3.mo2314h(k);
                            if (h < i16) {
                                fVar2 = fVar3;
                                i16 = h;
                            }
                            i13 += i11;
                        }
                    } else {
                        int g2 = this.f2022r.mo2421g();
                        int i17 = Integer.MIN_VALUE;
                        while (i13 != i12) {
                            C0431f fVar4 = this.f2021q[i13];
                            int k2 = fVar4.mo2317k(g2);
                            if (k2 > i17) {
                                fVar2 = fVar4;
                                i17 = k2;
                            }
                            i13 += i11;
                        }
                    }
                    fVar = fVar2;
                    C0426d dVar = this.f2010B;
                    dVar.mo2293b(a);
                    dVar.f2040a[a] = fVar.f2060e;
                } else {
                    fVar = this.f2021q[i15];
                }
                C0431f fVar5 = fVar;
                cVar.f2039e = fVar5;
                if (oVar2.f2200e == 1) {
                    z = false;
                    mo2176c(view, -1, false);
                } else {
                    z = false;
                    mo2176c(view, 0, false);
                }
                if (this.f2024t == 1) {
                    i3 = RecyclerView.C0400l.m1293y(this.f2025u, this.f1925l, z ? 1 : 0, cVar.width, z);
                    i2 = RecyclerView.C0400l.m1293y(this.f1928o, this.f1926m, mo2166M() + mo2169P(), cVar.height, true);
                    z2 = false;
                } else {
                    i3 = RecyclerView.C0400l.m1293y(this.f1927n, this.f1925l, mo2168O() + mo2167N(), cVar.width, true);
                    z2 = false;
                    i2 = RecyclerView.C0400l.m1293y(this.f2025u, this.f1926m, 0, cVar.height, false);
                }
                mo2275a1(view, i3, i2, z2);
                if (oVar2.f2200e == 1) {
                    i5 = fVar5.mo2314h(g);
                    i4 = this.f2022r.mo2417c(view) + i5;
                } else {
                    i4 = fVar5.mo2317k(g);
                    i5 = i4 - this.f2022r.mo2417c(view);
                }
                int i18 = oVar2.f2200e;
                C0431f fVar6 = cVar.f2039e;
                if (i18 == 1) {
                    fVar6.mo2307a(view);
                } else {
                    fVar6.mo2320n(view);
                }
                if (!mo2274Z0() || this.f2024t != 1) {
                    i6 = this.f2023s.mo2425k() + (fVar5.f2060e * this.f2025u);
                    i7 = this.f2023s.mo2417c(view) + i6;
                } else {
                    i7 = this.f2023s.mo2421g() - (((this.f2020p - 1) - fVar5.f2060e) * this.f2025u);
                    i6 = i7 - this.f2023s.mo2417c(view);
                }
                if (this.f2024t == 1) {
                    i9 = i7;
                    i8 = i4;
                    i10 = i6;
                    i6 = i5;
                } else {
                    i8 = i7;
                    i9 = i4;
                    i10 = i5;
                }
                mo2172W(view, i10, i6, i9, i8);
                mo2287m1(fVar5, this.f2026v.f2200e, i);
                mo2279e1(rVar2, this.f2026v);
                if (!this.f2026v.f2203h || !view.hasFocusable()) {
                    z3 = false;
                } else {
                    z3 = false;
                    this.f2029y.set(fVar5.f2060e, false);
                }
                z4 = z3;
                z5 = true;
            }
        }
        boolean z62 = z4;
        if (!z5) {
            mo2279e1(rVar2, this.f2026v);
        }
        int k3 = this.f2026v.f2200e == -1 ? this.f2022r.mo2425k() - mo2271W0(this.f2022r.mo2425k()) : mo2270V0(this.f2022r.mo2421g()) - this.f2022r.mo2421g();
        if (k3 > 0) {
            return Math.min(oVar2.f2197b, k3);
        }
        return z62 ? 1 : 0;
    }

    /* renamed from: P0 */
    public View mo2264P0(boolean z) {
        int k = this.f2022r.mo2425k();
        int g = this.f2022r.mo2421g();
        View view = null;
        for (int x = mo2189x() - 1; x >= 0; x--) {
            View w = mo2188w(x);
            int e = this.f2022r.mo2419e(w);
            int b = this.f2022r.mo2416b(w);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return w;
                }
                if (view == null) {
                    view = w;
                }
            }
        }
        return view;
    }

    /* renamed from: Q0 */
    public View mo2265Q0(boolean z) {
        int k = this.f2022r.mo2425k();
        int g = this.f2022r.mo2421g();
        int x = mo2189x();
        View view = null;
        for (int i = 0; i < x; i++) {
            View w = mo2188w(i);
            int e = this.f2022r.mo2419e(w);
            if (this.f2022r.mo2416b(w) > k && e < g) {
                if (e >= k || !z) {
                    return w;
                }
                if (view == null) {
                    view = w;
                }
            }
        }
        return view;
    }

    /* renamed from: R0 */
    public final void mo2266R0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, boolean z) {
        int g;
        int V0 = mo2270V0(Integer.MIN_VALUE);
        if (V0 != Integer.MIN_VALUE && (g = this.f2022r.mo2421g() - V0) > 0) {
            int i = g - (-mo2283i1(-g, rVar, wVar));
            if (z && i > 0) {
                this.f2022r.mo2429p(i);
            }
        }
    }

    /* renamed from: S */
    public int mo1889S(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return this.f2024t == 0 ? this.f2020p : super.mo1889S(rVar, wVar);
    }

    /* renamed from: S0 */
    public final void mo2267S0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, boolean z) {
        int k;
        int W0 = mo2271W0(Integer.MAX_VALUE);
        if (W0 != Integer.MAX_VALUE && (k = W0 - this.f2022r.mo2425k()) > 0) {
            int i1 = k - mo2283i1(k, rVar, wVar);
            if (z && i1 > 0) {
                this.f2022r.mo2429p(-i1);
            }
        }
    }

    /* renamed from: T0 */
    public int mo2268T0() {
        if (mo2189x() == 0) {
            return 0;
        }
        return mo2170Q(mo2188w(0));
    }

    /* renamed from: U */
    public boolean mo1936U() {
        return this.f2011C != 0;
    }

    /* renamed from: U0 */
    public int mo2269U0() {
        int x = mo2189x();
        if (x == 0) {
            return 0;
        }
        return mo2170Q(mo2188w(x - 1));
    }

    /* renamed from: V0 */
    public final int mo2270V0(int i) {
        int h = this.f2021q[0].mo2314h(i);
        for (int i2 = 1; i2 < this.f2020p; i2++) {
            int h2 = this.f2021q[i2].mo2314h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: W0 */
    public final int mo2271W0(int i) {
        int k = this.f2021q[0].mo2317k(i);
        for (int i2 = 1; i2 < this.f2020p; i2++) {
            int k2 = this.f2021q[i2].mo2317k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* renamed from: X */
    public void mo2173X(int i) {
        super.mo2173X(i);
        for (int i2 = 0; i2 < this.f2020p; i2++) {
            C0431f fVar = this.f2021q[i2];
            int i3 = fVar.f2057b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f2057b = i3 + i;
            }
            int i4 = fVar.f2058c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f2058c = i4 + i;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2272X0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2028x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo2269U0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo2268T0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2010B
            r4.mo2295d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2010B
            r9.mo2297f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2010B
            r7.mo2296e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2010B
            r9.mo2297f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2010B
            r9.mo2296e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2028x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo2268T0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo2269U0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo2187u0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2272X0(int, int, int):void");
    }

    /* renamed from: Y */
    public void mo2174Y(int i) {
        super.mo2174Y(i);
        for (int i2 = 0; i2 < this.f2020p; i2++) {
            C0431f fVar = this.f2021q[i2];
            int i3 = fVar.f2057b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f2057b = i3 + i;
            }
            int i4 = fVar.f2058c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f2058c = i4 + i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo2273Y0() {
        /*
            r12 = this;
            int r0 = r12.mo2189x()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2020p
            r2.<init>(r3)
            int r3 = r12.f2020p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2024t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo2274Z0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f2028x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00eb
            android.view.View r7 = r12.mo2188w(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0425c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2039e
            int r9 = r9.f2060e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2039e
            boolean r10 = r12.f2028x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f2058c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.mo2308b()
            int r10 = r9.f2058c
        L_0x0056:
            androidx.recyclerview.widget.t r11 = r12.f2022r
            int r11 = r11.mo2421g()
            if (r10 >= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f2056a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0082
        L_0x006a:
            int r10 = r9.f2057b
            if (r10 == r11) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r9.mo2309c()
            int r10 = r9.f2057b
        L_0x0074:
            androidx.recyclerview.widget.t r11 = r12.f2022r
            int r11 = r11.mo2425k()
            if (r10 <= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f2056a
            java.lang.Object r10 = r10.get(r4)
        L_0x0082:
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.mo2316j(r10)
            java.util.Objects.requireNonNull(r9)
            r9 = r1
            goto L_0x008e
        L_0x008d:
            r9 = r4
        L_0x008e:
            if (r9 == 0) goto L_0x0091
            return r7
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2039e
            int r9 = r9.f2060e
            r2.clear(r9)
        L_0x0098:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00e8
            android.view.View r9 = r12.mo2188w(r9)
            boolean r10 = r12.f2028x
            if (r10 == 0) goto L_0x00b6
            androidx.recyclerview.widget.t r10 = r12.f2022r
            int r10 = r10.mo2416b(r7)
            androidx.recyclerview.widget.t r11 = r12.f2022r
            int r11 = r11.mo2416b(r9)
            if (r10 >= r11) goto L_0x00b3
            return r7
        L_0x00b3:
            if (r10 != r11) goto L_0x00c9
            goto L_0x00c7
        L_0x00b6:
            androidx.recyclerview.widget.t r10 = r12.f2022r
            int r10 = r10.mo2419e(r7)
            androidx.recyclerview.widget.t r11 = r12.f2022r
            int r11 = r11.mo2419e(r9)
            if (r10 <= r11) goto L_0x00c5
            return r7
        L_0x00c5:
            if (r10 != r11) goto L_0x00c9
        L_0x00c7:
            r10 = r1
            goto L_0x00ca
        L_0x00c9:
            r10 = r4
        L_0x00ca:
            if (r10 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0425c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2039e
            int r8 = r8.f2060e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2039e
            int r9 = r9.f2060e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00df
            r8 = r1
            goto L_0x00e0
        L_0x00df:
            r8 = r4
        L_0x00e0:
            if (r3 >= 0) goto L_0x00e4
            r9 = r1
            goto L_0x00e5
        L_0x00e4:
            r9 = r4
        L_0x00e5:
            if (r8 == r9) goto L_0x00e8
            return r7
        L_0x00e8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2273Y0():android.view.View");
    }

    /* renamed from: Z */
    public void mo1942Z(RecyclerView recyclerView, RecyclerView.C0411r rVar) {
        Runnable runnable = this.f2019K;
        RecyclerView recyclerView2 = this.f1915b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f2020p; i++) {
            this.f2021q[i].mo2310d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Z0 */
    public boolean mo2274Z0() {
        return mo2163J() == 1;
    }

    /* renamed from: a */
    public PointF mo1943a(int i) {
        int J0 = mo2258J0(i);
        PointF pointF = new PointF();
        if (J0 == 0) {
            return null;
        }
        if (this.f2024t == 0) {
            pointF.x = (float) J0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) J0;
        }
        return pointF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f2024t == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f2024t == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (mo2274Z0() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        if (mo2274Z0() == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1891a0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0411r r11, androidx.recyclerview.widget.RecyclerView.C0419w r12) {
        /*
            r8 = this;
            int r0 = r8.mo2189x()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.mo2183r(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.mo2282h1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r10 == r2) goto L_0x004e
            r4 = 2
            if (r10 == r4) goto L_0x0042
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f2024t
            if (r10 != r2) goto L_0x0040
            goto L_0x0059
        L_0x0031:
            int r10 = r8.f2024t
            if (r10 != 0) goto L_0x0040
            goto L_0x0059
        L_0x0036:
            int r10 = r8.f2024t
            if (r10 != r2) goto L_0x0040
            goto L_0x005b
        L_0x003b:
            int r10 = r8.f2024t
            if (r10 != 0) goto L_0x0040
            goto L_0x005b
        L_0x0040:
            r10 = r0
            goto L_0x005c
        L_0x0042:
            int r10 = r8.f2024t
            if (r10 != r2) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            boolean r10 = r8.mo2274Z0()
            if (r10 == 0) goto L_0x0059
            goto L_0x005b
        L_0x004e:
            int r10 = r8.f2024t
            if (r10 != r2) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            boolean r10 = r8.mo2274Z0()
            if (r10 == 0) goto L_0x005b
        L_0x0059:
            r10 = r2
            goto L_0x005c
        L_0x005b:
            r10 = r3
        L_0x005c:
            if (r10 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0425c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f2039e
            if (r10 != r2) goto L_0x0071
            int r4 = r8.mo2269U0()
            goto L_0x0075
        L_0x0071:
            int r4 = r8.mo2268T0()
        L_0x0075:
            r8.mo2286l1(r4, r12)
            r8.mo2284j1(r10)
            androidx.recyclerview.widget.o r5 = r8.f2026v
            int r6 = r5.f2199d
            int r6 = r6 + r4
            r5.f2198c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.t r7 = r8.f2022r
            int r7 = r7.mo2426l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f2197b = r6
            androidx.recyclerview.widget.o r5 = r8.f2026v
            r5.f2203h = r2
            r6 = 0
            r5.f2196a = r6
            r8.mo2263O0(r11, r5, r12)
            boolean r11 = r8.f2028x
            r8.f2012D = r11
            android.view.View r11 = r0.mo2315i(r4, r10)
            if (r11 == 0) goto L_0x00a7
            if (r11 == r9) goto L_0x00a7
            return r11
        L_0x00a7:
            boolean r11 = r8.mo2277c1(r10)
            if (r11 == 0) goto L_0x00c2
            int r11 = r8.f2020p
            int r11 = r11 - r2
        L_0x00b0:
            if (r11 < 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2021q
            r12 = r12[r11]
            android.view.View r12 = r12.mo2315i(r4, r10)
            if (r12 == 0) goto L_0x00bf
            if (r12 == r9) goto L_0x00bf
            return r12
        L_0x00bf:
            int r11 = r11 + -1
            goto L_0x00b0
        L_0x00c2:
            r11 = r6
        L_0x00c3:
            int r12 = r8.f2020p
            if (r11 >= r12) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2021q
            r12 = r12[r11]
            android.view.View r12 = r12.mo2315i(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r11 = r8.f2027w
            r11 = r11 ^ r2
            if (r10 != r3) goto L_0x00de
            r12 = r2
            goto L_0x00df
        L_0x00de:
            r12 = r6
        L_0x00df:
            if (r11 != r12) goto L_0x00e3
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            if (r11 == 0) goto L_0x00eb
            int r12 = r0.mo2311e()
            goto L_0x00ef
        L_0x00eb:
            int r12 = r0.mo2312f()
        L_0x00ef:
            android.view.View r12 = r8.mo1968s(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 == r9) goto L_0x00f8
            return r12
        L_0x00f8:
            boolean r10 = r8.mo2277c1(r10)
            if (r10 == 0) goto L_0x0125
            int r10 = r8.f2020p
            int r10 = r10 - r2
        L_0x0101:
            if (r10 < 0) goto L_0x0146
            int r12 = r0.f2060e
            if (r10 != r12) goto L_0x0108
            goto L_0x0122
        L_0x0108:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2021q
            if (r11 == 0) goto L_0x0113
            r12 = r12[r10]
            int r12 = r12.mo2311e()
            goto L_0x0119
        L_0x0113:
            r12 = r12[r10]
            int r12 = r12.mo2312f()
        L_0x0119:
            android.view.View r12 = r8.mo1968s(r12)
            if (r12 == 0) goto L_0x0122
            if (r12 == r9) goto L_0x0122
            return r12
        L_0x0122:
            int r10 = r10 + -1
            goto L_0x0101
        L_0x0125:
            int r10 = r8.f2020p
            if (r6 >= r10) goto L_0x0146
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2021q
            if (r11 == 0) goto L_0x0134
            r10 = r10[r6]
            int r10 = r10.mo2311e()
            goto L_0x013a
        L_0x0134:
            r10 = r10[r6]
            int r10 = r10.mo2312f()
        L_0x013a:
            android.view.View r10 = r8.mo1968s(r10)
            if (r10 == 0) goto L_0x0143
            if (r10 == r9) goto L_0x0143
            return r10
        L_0x0143:
            int r6 = r6 + 1
            goto L_0x0125
        L_0x0146:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1891a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* renamed from: a1 */
    public final void mo2275a1(View view, int i, int i2, boolean z) {
        Rect rect = this.f2015G;
        RecyclerView recyclerView = this.f1915b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.mo1993M(view));
        }
        C0425c cVar = (C0425c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect2 = this.f2015G;
        int n1 = mo2288n1(i, i3 + rect2.left, cVar.rightMargin + rect2.right);
        int i4 = cVar.topMargin;
        Rect rect3 = this.f2015G;
        int n12 = mo2288n1(i2, i4 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z ? mo2158F0(view, n1, n12, cVar) : mo2155D0(view, n1, n12, cVar)) {
            view.measure(n1, n12);
        }
    }

    /* renamed from: b0 */
    public void mo1945b0(AccessibilityEvent accessibilityEvent) {
        super.mo1945b0(accessibilityEvent);
        if (mo2189x() > 0) {
            View Q0 = mo2265Q0(false);
            View P0 = mo2264P0(false);
            if (Q0 != null && P0 != null) {
                int Q = mo2170Q(Q0);
                int Q2 = mo2170Q(P0);
                if (Q < Q2) {
                    accessibilityEvent.setFromIndex(Q);
                    accessibilityEvent.setToIndex(Q2);
                    return;
                }
                accessibilityEvent.setFromIndex(Q2);
                accessibilityEvent.setToIndex(Q);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03ee, code lost:
        if (mo2259K0() != false) goto L_0x03f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2276b1(androidx.recyclerview.widget.RecyclerView.C0411r r12, androidx.recyclerview.widget.RecyclerView.C0419w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f2016H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f2014F
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f2030z
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo2229b()
            if (r1 != 0) goto L_0x0018
            r11.mo2179o0(r12)
            r0.mo2291b()
            return
        L_0x0018:
            boolean r1 = r0.f2036e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f2030z
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f2014F
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e7
            r0.mo2291b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            if (r6 == 0) goto L_0x00b8
            int r7 = r6.f2048g
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f2020p
            if (r7 != r9) goto L_0x006f
            r6 = r3
        L_0x003f:
            int r7 = r11.f2020p
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2021q
            r7 = r7[r6]
            r7.mo2310d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f2014F
            int[] r9 = r7.f2049h
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f2054m
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2421g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2425k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2021q
            r7 = r7[r6]
            r7.f2057b = r9
            r7.f2058c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f2049h = r8
            r6.f2048g = r3
            r6.f2050i = r3
            r6.f2051j = r8
            r6.f2052k = r8
            int r7 = r6.f2047f
            r6.f2046e = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            boolean r7 = r6.f2055n
            r11.f2013E = r7
            boolean r6 = r6.f2053l
            r11.mo1948d(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f2014F
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f2053l
            if (r8 == r6) goto L_0x0092
            r7.f2053l = r6
        L_0x0092:
            r11.f2027w = r6
            r11.mo2187u0()
            r11.mo2282h1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            int r7 = r6.f2046e
            if (r7 == r2) goto L_0x00a5
            r11.f2030z = r7
            boolean r7 = r6.f2054m
            goto L_0x00a7
        L_0x00a5:
            boolean r7 = r11.f2028x
        L_0x00a7:
            r0.f2034c = r7
            int r7 = r6.f2050i
            if (r7 <= r4) goto L_0x00bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.f2010B
            int[] r8 = r6.f2051j
            r7.f2040a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f2052k
            r7.f2041b = r6
            goto L_0x00bf
        L_0x00b8:
            r11.mo2282h1()
            boolean r6 = r11.f2028x
            r0.f2034c = r6
        L_0x00bf:
            boolean r6 = r13.f1975g
            if (r6 != 0) goto L_0x01a8
            int r6 = r11.f2030z
            if (r6 != r2) goto L_0x00c9
            goto L_0x01a8
        L_0x00c9:
            if (r6 < 0) goto L_0x01a4
            int r7 = r13.mo2229b()
            if (r6 < r7) goto L_0x00d3
            goto L_0x01a4
        L_0x00d3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            if (r6 == 0) goto L_0x00e8
            int r7 = r6.f2046e
            if (r7 == r2) goto L_0x00e8
            int r6 = r6.f2048g
            if (r6 >= r4) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r0.f2033b = r5
            int r6 = r11.f2030z
            r0.f2032a = r6
            goto L_0x01a2
        L_0x00e8:
            int r6 = r11.f2030z
            android.view.View r6 = r11.mo1968s(r6)
            if (r6 == 0) goto L_0x0170
            boolean r7 = r11.f2028x
            if (r7 == 0) goto L_0x00f9
            int r7 = r11.mo2269U0()
            goto L_0x00fd
        L_0x00f9:
            int r7 = r11.mo2268T0()
        L_0x00fd:
            r0.f2032a = r7
            int r7 = r11.f2009A
            if (r7 == r5) goto L_0x0128
            boolean r7 = r0.f2034c
            if (r7 == 0) goto L_0x0117
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2421g()
            int r8 = r11.f2009A
            int r7 = r7 - r8
            androidx.recyclerview.widget.t r8 = r11.f2022r
            int r6 = r8.mo2416b(r6)
            goto L_0x0126
        L_0x0117:
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2425k()
            int r8 = r11.f2009A
            int r7 = r7 + r8
            androidx.recyclerview.widget.t r8 = r11.f2022r
            int r6 = r8.mo2419e(r6)
        L_0x0126:
            int r7 = r7 - r6
            goto L_0x016a
        L_0x0128:
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2417c(r6)
            androidx.recyclerview.widget.t r8 = r11.f2022r
            int r8 = r8.mo2426l()
            if (r7 <= r8) goto L_0x0148
            boolean r6 = r0.f2034c
            if (r6 == 0) goto L_0x0141
            androidx.recyclerview.widget.t r6 = r11.f2022r
            int r6 = r6.mo2421g()
            goto L_0x0158
        L_0x0141:
            androidx.recyclerview.widget.t r6 = r11.f2022r
            int r6 = r6.mo2425k()
            goto L_0x0158
        L_0x0148:
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2419e(r6)
            androidx.recyclerview.widget.t r8 = r11.f2022r
            int r8 = r8.mo2425k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x015b
            int r6 = -r7
        L_0x0158:
            r0.f2033b = r6
            goto L_0x01a2
        L_0x015b:
            androidx.recyclerview.widget.t r7 = r11.f2022r
            int r7 = r7.mo2421g()
            androidx.recyclerview.widget.t r8 = r11.f2022r
            int r6 = r8.mo2416b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x016d
        L_0x016a:
            r0.f2033b = r7
            goto L_0x01a2
        L_0x016d:
            r0.f2033b = r5
            goto L_0x01a2
        L_0x0170:
            int r6 = r11.f2030z
            r0.f2032a = r6
            int r7 = r11.f2009A
            if (r7 != r5) goto L_0x0187
            int r6 = r11.mo2258J0(r6)
            if (r6 != r4) goto L_0x0180
            r6 = r4
            goto L_0x0181
        L_0x0180:
            r6 = r3
        L_0x0181:
            r0.f2034c = r6
            r0.mo2290a()
            goto L_0x01a0
        L_0x0187:
            boolean r6 = r0.f2034c
            if (r6 == 0) goto L_0x0195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r6 = r6.f2022r
            int r6 = r6.mo2421g()
            int r6 = r6 - r7
            goto L_0x019e
        L_0x0195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r6 = r6.f2022r
            int r6 = r6.mo2425k()
            int r6 = r6 + r7
        L_0x019e:
            r0.f2033b = r6
        L_0x01a0:
            r0.f2035d = r4
        L_0x01a2:
            r6 = r4
            goto L_0x01a9
        L_0x01a4:
            r11.f2030z = r2
            r11.f2009A = r5
        L_0x01a8:
            r6 = r3
        L_0x01a9:
            if (r6 == 0) goto L_0x01ac
            goto L_0x01e5
        L_0x01ac:
            boolean r6 = r11.f2012D
            int r7 = r13.mo2229b()
            if (r6 == 0) goto L_0x01c8
            int r6 = r11.mo2189x()
        L_0x01b8:
            int r6 = r6 + r2
            if (r6 < 0) goto L_0x01e0
            android.view.View r8 = r11.mo2188w(r6)
            int r8 = r11.mo2170Q(r8)
            if (r8 < 0) goto L_0x01b8
            if (r8 >= r7) goto L_0x01b8
            goto L_0x01e1
        L_0x01c8:
            int r6 = r11.mo2189x()
            r8 = r3
        L_0x01cd:
            if (r8 >= r6) goto L_0x01e0
            android.view.View r9 = r11.mo2188w(r8)
            int r9 = r11.mo2170Q(r9)
            if (r9 < 0) goto L_0x01dd
            if (r9 >= r7) goto L_0x01dd
            r8 = r9
            goto L_0x01e1
        L_0x01dd:
            int r8 = r8 + 1
            goto L_0x01cd
        L_0x01e0:
            r8 = r3
        L_0x01e1:
            r0.f2032a = r8
            r0.f2033b = r5
        L_0x01e5:
            r0.f2036e = r4
        L_0x01e7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            if (r6 != 0) goto L_0x0204
            int r6 = r11.f2030z
            if (r6 != r2) goto L_0x0204
            boolean r6 = r0.f2034c
            boolean r7 = r11.f2012D
            if (r6 != r7) goto L_0x01fd
            boolean r6 = r11.mo2274Z0()
            boolean r7 = r11.f2013E
            if (r6 == r7) goto L_0x0204
        L_0x01fd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.f2010B
            r6.mo2292a()
            r0.f2035d = r4
        L_0x0204:
            int r6 = r11.mo2189x()
            if (r6 <= 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f2014F
            if (r6 == 0) goto L_0x0212
            int r6 = r6.f2048g
            if (r6 >= r4) goto L_0x02bc
        L_0x0212:
            boolean r6 = r0.f2035d
            if (r6 == 0) goto L_0x0231
            r1 = r3
        L_0x0217:
            int r6 = r11.f2020p
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2021q
            r6 = r6[r1]
            r6.mo2310d()
            int r6 = r0.f2033b
            if (r6 == r5) goto L_0x022e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2021q
            r7 = r7[r1]
            r7.f2057b = r6
            r7.f2058c = r6
        L_0x022e:
            int r1 = r1 + 1
            goto L_0x0217
        L_0x0231:
            if (r1 != 0) goto L_0x0253
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f2016H
            int[] r1 = r1.f2037f
            if (r1 != 0) goto L_0x023a
            goto L_0x0253
        L_0x023a:
            r1 = r3
        L_0x023b:
            int r6 = r11.f2020p
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2021q
            r6 = r6[r1]
            r6.mo2310d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f2016H
            int[] r7 = r7.f2037f
            r7 = r7[r1]
            r6.f2057b = r7
            r6.f2058c = r7
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0253:
            r1 = r3
        L_0x0254:
            int r6 = r11.f2020p
            if (r1 >= r6) goto L_0x0294
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2021q
            r6 = r6[r1]
            boolean r7 = r11.f2028x
            int r8 = r0.f2033b
            if (r7 == 0) goto L_0x0267
            int r9 = r6.mo2314h(r5)
            goto L_0x026b
        L_0x0267:
            int r9 = r6.mo2317k(r5)
        L_0x026b:
            r6.mo2310d()
            if (r9 != r5) goto L_0x0271
            goto L_0x0291
        L_0x0271:
            if (r7 == 0) goto L_0x027d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r10 = r10.f2022r
            int r10 = r10.mo2421g()
            if (r9 < r10) goto L_0x0291
        L_0x027d:
            if (r7 != 0) goto L_0x028a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r7 = r7.f2022r
            int r7 = r7.mo2425k()
            if (r9 <= r7) goto L_0x028a
            goto L_0x0291
        L_0x028a:
            if (r8 == r5) goto L_0x028d
            int r9 = r9 + r8
        L_0x028d:
            r6.f2058c = r9
            r6.f2057b = r9
        L_0x0291:
            int r1 = r1 + 1
            goto L_0x0254
        L_0x0294:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f2016H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2021q
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f2037f
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02ac
        L_0x02a3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f2021q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f2037f = r8
        L_0x02ac:
            r8 = r3
        L_0x02ad:
            if (r8 >= r7) goto L_0x02bc
            int[] r9 = r1.f2037f
            r10 = r6[r8]
            int r10 = r10.mo2317k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02ad
        L_0x02bc:
            r11.mo2181q(r12)
            androidx.recyclerview.widget.o r1 = r11.f2026v
            r1.f2196a = r3
            androidx.recyclerview.widget.t r1 = r11.f2023s
            int r1 = r1.mo2426l()
            int r6 = r11.f2020p
            int r6 = r1 / r6
            r11.f2025u = r6
            androidx.recyclerview.widget.t r6 = r11.f2023s
            int r6 = r6.mo2423i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f2032a
            r11.mo2286l1(r1, r13)
            boolean r1 = r0.f2034c
            if (r1 == 0) goto L_0x02ed
            r11.mo2284j1(r2)
            androidx.recyclerview.widget.o r1 = r11.f2026v
            r11.mo2263O0(r12, r1, r13)
            r11.mo2284j1(r4)
            goto L_0x02f8
        L_0x02ed:
            r11.mo2284j1(r4)
            androidx.recyclerview.widget.o r1 = r11.f2026v
            r11.mo2263O0(r12, r1, r13)
            r11.mo2284j1(r2)
        L_0x02f8:
            androidx.recyclerview.widget.o r1 = r11.f2026v
            int r2 = r0.f2032a
            int r6 = r1.f2199d
            int r2 = r2 + r6
            r1.f2198c = r2
            r11.mo2263O0(r12, r1, r13)
            androidx.recyclerview.widget.t r1 = r11.f2023s
            int r1 = r1.mo2423i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0310
            goto L_0x03af
        L_0x0310:
            r1 = 0
            int r2 = r11.mo2189x()
            r6 = r3
        L_0x0316:
            if (r6 >= r2) goto L_0x0338
            android.view.View r7 = r11.mo2188w(r6)
            androidx.recyclerview.widget.t r8 = r11.f2023s
            int r8 = r8.mo2417c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0328
            goto L_0x0335
        L_0x0328:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0425c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0335:
            int r6 = r6 + 1
            goto L_0x0316
        L_0x0338:
            int r6 = r11.f2025u
            int r7 = r11.f2020p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.t r7 = r11.f2023s
            int r7 = r7.mo2423i()
            if (r7 != r5) goto L_0x0354
            androidx.recyclerview.widget.t r5 = r11.f2023s
            int r5 = r5.mo2426l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0354:
            int r5 = r11.f2020p
            int r5 = r1 / r5
            r11.f2025u = r5
            androidx.recyclerview.widget.t r5 = r11.f2023s
            int r5 = r5.mo2423i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f2025u
            if (r1 != r6) goto L_0x0368
            goto L_0x03af
        L_0x0368:
            r1 = r3
        L_0x0369:
            if (r1 >= r2) goto L_0x03af
            android.view.View r5 = r11.mo2188w(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0425c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.mo2274Z0()
            if (r8 == 0) goto L_0x0398
            int r8 = r11.f2024t
            if (r8 != r4) goto L_0x0398
            int r8 = r11.f2020p
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2039e
            int r7 = r7.f2060e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f2025u
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03ac
        L_0x0398:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2039e
            int r7 = r7.f2060e
            int r8 = r11.f2025u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f2024t
            int r8 = r8 - r7
            if (r9 != r4) goto L_0x03a9
            r5.offsetLeftAndRight(r8)
            goto L_0x03ac
        L_0x03a9:
            r5.offsetTopAndBottom(r8)
        L_0x03ac:
            int r1 = r1 + 1
            goto L_0x0369
        L_0x03af:
            int r1 = r11.mo2189x()
            if (r1 <= 0) goto L_0x03c6
            boolean r1 = r11.f2028x
            if (r1 == 0) goto L_0x03c0
            r11.mo2266R0(r12, r13, r4)
            r11.mo2267S0(r12, r13, r3)
            goto L_0x03c6
        L_0x03c0:
            r11.mo2267S0(r12, r13, r4)
            r11.mo2266R0(r12, r13, r3)
        L_0x03c6:
            if (r14 == 0) goto L_0x03f1
            boolean r14 = r13.f1975g
            if (r14 != 0) goto L_0x03f1
            int r14 = r11.f2011C
            if (r14 == 0) goto L_0x03de
            int r14 = r11.mo2189x()
            if (r14 <= 0) goto L_0x03de
            android.view.View r14 = r11.mo2273Y0()
            if (r14 == 0) goto L_0x03de
            r14 = r4
            goto L_0x03df
        L_0x03de:
            r14 = r3
        L_0x03df:
            if (r14 == 0) goto L_0x03f1
            java.lang.Runnable r14 = r11.f2019K
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1915b
            if (r1 == 0) goto L_0x03ea
            r1.removeCallbacks(r14)
        L_0x03ea:
            boolean r14 = r11.mo2259K0()
            if (r14 == 0) goto L_0x03f1
            goto L_0x03f2
        L_0x03f1:
            r4 = r3
        L_0x03f2:
            boolean r14 = r13.f1975g
            if (r14 == 0) goto L_0x03fb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f2016H
            r14.mo2291b()
        L_0x03fb:
            boolean r14 = r0.f2034c
            r11.f2012D = r14
            boolean r14 = r11.mo2274Z0()
            r11.f2013E = r14
            if (r4 == 0) goto L_0x040f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f2016H
            r14.mo2291b()
            r11.mo2276b1(r12, r13, r3)
        L_0x040f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2276b1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    /* renamed from: c1 */
    public final boolean mo2277c1(int i) {
        if (this.f2024t == 0) {
            return (i == -1) != this.f2028x;
        }
        return ((i == -1) == this.f2028x) == mo2274Z0();
    }

    /* renamed from: d */
    public void mo1948d(String str) {
        RecyclerView recyclerView;
        if (this.f2014F == null && (recyclerView = this.f1915b) != null) {
            recyclerView.mo2057i(str);
        }
    }

    /* renamed from: d0 */
    public void mo1892d0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar, View view, C1150b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0425c)) {
            mo2177c0(view, bVar);
            return;
        }
        C0425c cVar = (C0425c) layoutParams;
        if (this.f2024t == 0) {
            C0431f fVar = cVar.f2039e;
            i4 = fVar == null ? -1 : fVar.f2060e;
            i3 = 1;
            i2 = -1;
            i = -1;
        } else {
            C0431f fVar2 = cVar.f2039e;
            i2 = fVar2 == null ? -1 : fVar2.f2060e;
            i = 1;
            i4 = -1;
            i3 = -1;
        }
        bVar.f4005a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1150b.C1153c.m3389a(i4, i3, i2, i, false, false).f4021a);
    }

    /* renamed from: d1 */
    public void mo2278d1(int i, RecyclerView.C0419w wVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo2269U0();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo2268T0();
        }
        this.f2026v.f2196a = true;
        mo2286l1(i3, wVar);
        mo2284j1(i2);
        C0468o oVar = this.f2026v;
        oVar.f2198c = i3 + oVar.f2199d;
        oVar.f2197b = Math.abs(i);
    }

    /* renamed from: e */
    public boolean mo1950e() {
        return this.f2024t == 0;
    }

    /* renamed from: e0 */
    public void mo1893e0(RecyclerView recyclerView, int i, int i2) {
        mo2272X0(i, i2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f2200e == -1) goto L_0x0013;
     */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2279e1(androidx.recyclerview.widget.RecyclerView.C0411r r5, androidx.recyclerview.widget.C0468o r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2196a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f2204i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f2197b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f2200e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f2202g
        L_0x0015:
            r4.mo2280f1(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f2201f
        L_0x001b:
            r4.mo2281g1(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f2200e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f2201f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2021q
            r1 = r1[r2]
            int r1 = r1.mo2317k(r0)
        L_0x002f:
            int r2 = r4.f2020p
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2021q
            r2 = r2[r3]
            int r2 = r2.mo2317k(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f2202g
            int r6 = r6.f2197b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f2202g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2021q
            r1 = r1[r2]
            int r1 = r1.mo2314h(r0)
        L_0x005a:
            int r2 = r4.f2020p
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2021q
            r2 = r2[r3]
            int r2 = r2.mo2314h(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f2202g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f2201f
            int r6 = r6.f2197b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2279e1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.o):void");
    }

    /* renamed from: f */
    public boolean mo1952f() {
        return this.f2024t == 1;
    }

    /* renamed from: f0 */
    public void mo1894f0(RecyclerView recyclerView) {
        this.f2010B.mo2292a();
        mo2187u0();
    }

    /* renamed from: f1 */
    public final void mo2280f1(RecyclerView.C0411r rVar, int i) {
        int x = mo2189x() - 1;
        while (x >= 0) {
            View w = mo2188w(x);
            if (this.f2022r.mo2419e(w) >= i && this.f2022r.mo2428o(w) >= i) {
                C0425c cVar = (C0425c) w.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f2039e.f2056a.size() != 1) {
                    cVar.f2039e.mo2318l();
                    mo2182q0(w, rVar);
                    x--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public boolean mo1896g(RecyclerView.C0405m mVar) {
        return mVar instanceof C0425c;
    }

    /* renamed from: g0 */
    public void mo1897g0(RecyclerView recyclerView, int i, int i2, int i3) {
        mo2272X0(i, i2, 8);
    }

    /* renamed from: g1 */
    public final void mo2281g1(RecyclerView.C0411r rVar, int i) {
        while (mo2189x() > 0) {
            View w = mo2188w(0);
            if (this.f2022r.mo2416b(w) <= i && this.f2022r.mo2427n(w) <= i) {
                C0425c cVar = (C0425c) w.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f2039e.f2056a.size() != 1) {
                    cVar.f2039e.mo2319m();
                    mo2182q0(w, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h0 */
    public void mo1899h0(RecyclerView recyclerView, int i, int i2) {
        mo2272X0(i, i2, 2);
    }

    /* renamed from: h1 */
    public final void mo2282h1() {
        this.f2028x = (this.f2024t == 1 || !mo2274Z0()) ? this.f2027w : !this.f2027w;
    }

    /* renamed from: i */
    public void mo1954i(int i, int i2, RecyclerView.C0419w wVar, RecyclerView.C0400l.C0403c cVar) {
        int i3;
        int i4;
        if (this.f2024t != 0) {
            i = i2;
        }
        if (mo2189x() != 0 && i != 0) {
            mo2278d1(i, wVar);
            int[] iArr = this.f2018J;
            if (iArr == null || iArr.length < this.f2020p) {
                this.f2018J = new int[this.f2020p];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2020p; i6++) {
                C0468o oVar = this.f2026v;
                if (oVar.f2199d == -1) {
                    i4 = oVar.f2201f;
                    i3 = this.f2021q[i6].mo2317k(i4);
                } else {
                    i4 = this.f2021q[i6].mo2314h(oVar.f2202g);
                    i3 = this.f2026v.f2202g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2018J[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2018J, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f2026v.f2198c;
                if (i9 >= 0 && i9 < wVar.mo2229b()) {
                    ((C0464n.C0466b) cVar).mo2409a(this.f2026v.f2198c, this.f2018J[i8]);
                    C0468o oVar2 = this.f2026v;
                    oVar2.f2198c += oVar2.f2199d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i0 */
    public void mo1900i0(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo2272X0(i, i2, 4);
    }

    /* renamed from: i1 */
    public int mo2283i1(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        if (mo2189x() == 0 || i == 0) {
            return 0;
        }
        mo2278d1(i, wVar);
        int O0 = mo2263O0(rVar, this.f2026v, wVar);
        if (this.f2026v.f2197b >= O0) {
            i = i < 0 ? -O0 : O0;
        }
        this.f2022r.mo2429p(-i);
        this.f2012D = this.f2028x;
        C0468o oVar = this.f2026v;
        oVar.f2197b = 0;
        mo2279e1(rVar, oVar);
        return i;
    }

    /* renamed from: j0 */
    public void mo1901j0(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        mo2276b1(rVar, wVar, true);
    }

    /* renamed from: j1 */
    public final void mo2284j1(int i) {
        C0468o oVar = this.f2026v;
        oVar.f2200e = i;
        int i2 = 1;
        if (this.f2028x != (i == -1)) {
            i2 = -1;
        }
        oVar.f2199d = i2;
    }

    /* renamed from: k */
    public int mo1958k(RecyclerView.C0419w wVar) {
        return mo2260L0(wVar);
    }

    /* renamed from: k0 */
    public void mo1902k0(RecyclerView.C0419w wVar) {
        this.f2030z = -1;
        this.f2009A = Integer.MIN_VALUE;
        this.f2014F = null;
        this.f2016H.mo2291b();
    }

    /* renamed from: k1 */
    public final void mo2285k1(int i, int i2) {
        for (int i3 = 0; i3 < this.f2020p; i3++) {
            if (!this.f2021q[i3].f2056a.isEmpty()) {
                mo2287m1(this.f2021q[i3], i, i2);
            }
        }
    }

    /* renamed from: l */
    public int mo1903l(RecyclerView.C0419w wVar) {
        return mo2261M0(wVar);
    }

    /* renamed from: l0 */
    public void mo1960l0(Parcelable parcelable) {
        if (parcelable instanceof C0429e) {
            this.f2014F = (C0429e) parcelable;
            mo2187u0();
        }
    }

    /* renamed from: l1 */
    public final void mo2286l1(int i, RecyclerView.C0419w wVar) {
        int i2;
        int i3;
        int i4;
        C0468o oVar = this.f2026v;
        boolean z = false;
        oVar.f2197b = 0;
        oVar.f2198c = i;
        RecyclerView.C0416v vVar = this.f1918e;
        if (!(vVar != null && vVar.f1959e) || (i4 = wVar.f1969a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f2028x == (i4 < i)) {
                i3 = this.f2022r.mo2426l();
                i2 = 0;
            } else {
                i2 = this.f2022r.mo2426l();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.f1915b;
        if (recyclerView != null && recyclerView.f1871k) {
            this.f2026v.f2201f = this.f2022r.mo2425k() - i2;
            this.f2026v.f2202g = this.f2022r.mo2421g() + i3;
        } else {
            this.f2026v.f2202g = this.f2022r.mo2420f() + i3;
            this.f2026v.f2201f = -i2;
        }
        C0468o oVar2 = this.f2026v;
        oVar2.f2203h = false;
        oVar2.f2196a = true;
        if (this.f2022r.mo2423i() == 0 && this.f2022r.mo2420f() == 0) {
            z = true;
        }
        oVar2.f2204i = z;
    }

    /* renamed from: m */
    public int mo1904m(RecyclerView.C0419w wVar) {
        return mo2262N0(wVar);
    }

    /* renamed from: m0 */
    public Parcelable mo1962m0() {
        int i;
        int i2;
        int[] iArr;
        C0429e eVar = this.f2014F;
        if (eVar != null) {
            return new C0429e(eVar);
        }
        C0429e eVar2 = new C0429e();
        eVar2.f2053l = this.f2027w;
        eVar2.f2054m = this.f2012D;
        eVar2.f2055n = this.f2013E;
        C0426d dVar = this.f2010B;
        if (dVar == null || (iArr = dVar.f2040a) == null) {
            eVar2.f2050i = 0;
        } else {
            eVar2.f2051j = iArr;
            eVar2.f2050i = iArr.length;
            eVar2.f2052k = dVar.f2041b;
        }
        int i3 = -1;
        if (mo2189x() > 0) {
            eVar2.f2046e = this.f2012D ? mo2269U0() : mo2268T0();
            View P0 = this.f2028x ? mo2264P0(true) : mo2265Q0(true);
            if (P0 != null) {
                i3 = mo2170Q(P0);
            }
            eVar2.f2047f = i3;
            int i4 = this.f2020p;
            eVar2.f2048g = i4;
            eVar2.f2049h = new int[i4];
            for (int i5 = 0; i5 < this.f2020p; i5++) {
                if (this.f2012D) {
                    i = this.f2021q[i5].mo2314h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2022r.mo2421g();
                    } else {
                        eVar2.f2049h[i5] = i;
                    }
                } else {
                    i = this.f2021q[i5].mo2317k(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2022r.mo2425k();
                    } else {
                        eVar2.f2049h[i5] = i;
                    }
                }
                i -= i2;
                eVar2.f2049h[i5] = i;
            }
        } else {
            eVar2.f2046e = -1;
            eVar2.f2047f = -1;
            eVar2.f2048g = 0;
        }
        return eVar2;
    }

    /* renamed from: m1 */
    public final void mo2287m1(C0431f fVar, int i, int i2) {
        int i3 = fVar.f2059d;
        if (i == -1) {
            int i4 = fVar.f2057b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.mo2309c();
                i4 = fVar.f2057b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f2058c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.mo2308b();
                i5 = fVar.f2058c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f2029y.set(fVar.f2060e, false);
    }

    /* renamed from: n */
    public int mo1964n(RecyclerView.C0419w wVar) {
        return mo2260L0(wVar);
    }

    /* renamed from: n0 */
    public void mo2178n0(int i) {
        if (i == 0) {
            mo2259K0();
        }
    }

    /* renamed from: n1 */
    public final int mo2288n1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: o */
    public int mo1906o(RecyclerView.C0419w wVar) {
        return mo2261M0(wVar);
    }

    /* renamed from: p */
    public int mo1907p(RecyclerView.C0419w wVar) {
        return mo2262N0(wVar);
    }

    /* renamed from: t */
    public RecyclerView.C0405m mo1910t() {
        return this.f2024t == 0 ? new C0425c(-2, -1) : new C0425c(-1, -2);
    }

    /* renamed from: u */
    public RecyclerView.C0405m mo1912u(Context context, AttributeSet attributeSet) {
        return new C0425c(context, attributeSet);
    }

    /* renamed from: v */
    public RecyclerView.C0405m mo1914v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0425c((ViewGroup.MarginLayoutParams) layoutParams) : new C0425c(layoutParams);
    }

    /* renamed from: v0 */
    public int mo1915v0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return mo2283i1(i, rVar, wVar);
    }

    /* renamed from: w0 */
    public void mo1969w0(int i) {
        C0429e eVar = this.f2014F;
        if (!(eVar == null || eVar.f2046e == i)) {
            eVar.f2049h = null;
            eVar.f2048g = 0;
            eVar.f2046e = -1;
            eVar.f2047f = -1;
        }
        this.f2030z = i;
        this.f2009A = Integer.MIN_VALUE;
        mo2187u0();
    }

    /* renamed from: x0 */
    public int mo1918x0(int i, RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return mo2283i1(i, rVar, wVar);
    }

    /* renamed from: z */
    public int mo1921z(RecyclerView.C0411r rVar, RecyclerView.C0419w wVar) {
        return this.f2024t == 1 ? this.f2020p : super.mo1921z(rVar, wVar);
    }
}
