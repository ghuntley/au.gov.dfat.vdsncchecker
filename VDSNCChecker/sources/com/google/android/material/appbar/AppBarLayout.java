package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0933a;
import p042g2.C0955a;
import p051i.C1021a;
import p058j0.C1052f;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p072l2.C1242f;
import p083n1.C1455a;
import p088o0.C1491a;
import p089o1.C1494a;
import p095p1.C1572a;
import p095p1.C1573b;
import p095p1.C1575c;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0248b {

    /* renamed from: e */
    public int f2531e;

    /* renamed from: f */
    public int f2532f;

    /* renamed from: g */
    public int f2533g;

    /* renamed from: h */
    public int f2534h;

    /* renamed from: i */
    public boolean f2535i;

    /* renamed from: j */
    public int f2536j;

    /* renamed from: k */
    public boolean f2537k;

    /* renamed from: l */
    public boolean f2538l;

    /* renamed from: m */
    public boolean f2539m;

    /* renamed from: n */
    public int f2540n;

    /* renamed from: o */
    public WeakReference<View> f2541o;

    /* renamed from: p */
    public ValueAnimator f2542p;

    /* renamed from: q */
    public int[] f2543q;

    /* renamed from: r */
    public Drawable f2544r;

    public static class BaseBehavior<T extends AppBarLayout> extends C1573b<T> {

        /* renamed from: j */
        public int f2545j;

        /* renamed from: k */
        public int f2546k;

        /* renamed from: l */
        public ValueAnimator f2547l;

        /* renamed from: m */
        public int f2548m = -1;

        /* renamed from: n */
        public boolean f2549n;

        /* renamed from: o */
        public float f2550o;

        /* renamed from: p */
        public WeakReference<View> f2551p;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C0686a extends C1491a {
            public static final Parcelable.Creator<C0686a> CREATOR = new C0687a();

            /* renamed from: g */
            public int f2552g;

            /* renamed from: h */
            public float f2553h;

            /* renamed from: i */
            public boolean f2554i;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class C0687a implements Parcelable.ClassLoaderCreator<C0686a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0686a(parcel, (ClassLoader) null);
                }

                public Object[] newArray(int i) {
                    return new C0686a[i];
                }

                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0686a(parcel, classLoader);
                }
            }

            public C0686a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f2552g = parcel.readInt();
                this.f2553h = parcel.readFloat();
                this.f2554i = parcel.readByte() != 0;
            }

            public C0686a(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f4651e, i);
                parcel.writeInt(this.f2552g);
                parcel.writeFloat(this.f2553h);
                parcel.writeByte(this.f2554i ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: A */
        public static boolean m2051A(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: B */
        public final View mo3150B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1052f) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: C */
        public void mo3151C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                int i4 = i3;
                int i5 = i2;
                if (i4 != i5) {
                    iArr[1] = mo5673w(coordinatorLayout, appBarLayout, i, i4, i5);
                }
            }
            if (appBarLayout.f2539m) {
                appBarLayout.mo3115c(appBarLayout.mo3117d(view));
            }
        }

        /* renamed from: D */
        public final void mo3152D(CoordinatorLayout coordinatorLayout, T t) {
            int v = mo3155v();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0688a aVar = (C0688a) childAt.getLayoutParams();
                if (m2051A(aVar.f2555a, 32)) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i2 = -v;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C0688a aVar2 = (C0688a) childAt2.getLayoutParams();
                int i3 = aVar2.f2555a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (m2051A(i3, 2)) {
                        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                        i5 += childAt2.getMinimumHeight();
                    } else if (m2051A(i3, 5)) {
                        WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (v < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (m2051A(i3, 32)) {
                        i4 += aVar2.topMargin;
                        i5 -= aVar2.bottomMargin;
                    }
                    if (v < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    mo3157z(coordinatorLayout, t, C0933a.m2711e(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: E */
        public final void mo3153E(CoordinatorLayout coordinatorLayout, T t) {
            C1150b.C1151a aVar = C1150b.C1151a.f4009f;
            C1061o.m3031l(aVar.mo4772a(), coordinatorLayout);
            C1061o.m3028i(coordinatorLayout, 0);
            C1150b.C1151a aVar2 = C1150b.C1151a.f4010g;
            C1061o.m3031l(aVar2.mo4772a(), coordinatorLayout);
            C1061o.m3028i(coordinatorLayout, 0);
            View B = mo3150B(coordinatorLayout);
            if (B != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0252f) B.getLayoutParams()).f1285a instanceof ScrollingViewBehavior)) {
                if (mo3155v() != (-t.getTotalScrollRange()) && B.canScrollVertically(1)) {
                    C1061o.m3032m(coordinatorLayout, aVar, (CharSequence) null, new C0691c(this, t, false));
                }
                if (mo3155v() == 0) {
                    return;
                }
                if (B.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C1061o.m3032m(coordinatorLayout, aVar2, (CharSequence) null, new C0690b(this, coordinatorLayout, t, B, i));
                        return;
                    }
                    return;
                }
                C1061o.m3032m(coordinatorLayout, aVar2, (CharSequence) null, new C0691c(this, t, true));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* renamed from: F */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3154F(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x009f
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.C0688a) r0
                int r0 = r0.f2555a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005d
                java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
                int r1 = r4.getMinimumHeight()
                if (r10 <= 0) goto L_0x004a
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005d
                goto L_0x005b
            L_0x004a:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005d
            L_0x005b:
                r9 = r3
                goto L_0x005e
            L_0x005d:
                r9 = r2
            L_0x005e:
                boolean r10 = r8.f2539m
                if (r10 == 0) goto L_0x006a
                android.view.View r9 = r6.mo3150B(r7)
                boolean r9 = r8.mo3117d(r9)
            L_0x006a:
                boolean r9 = r8.mo3115c(r9)
                if (r11 != 0) goto L_0x009c
                if (r9 == 0) goto L_0x009f
                java.util.List r7 = r7.mo1343f(r8)
                int r9 = r7.size()
                r10 = r2
            L_0x007b:
                if (r10 >= r9) goto L_0x009a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0252f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1285a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x0097
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f4901f
                if (r7 == 0) goto L_0x009a
                r2 = r3
                goto L_0x009a
            L_0x0097:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x009a:
                if (r2 == 0) goto L_0x009f
            L_0x009c:
                r8.jumpDrawablesToCurrentState()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo3154F(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: h */
        public boolean mo1401h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo1401h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i3 = this.f2548m;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f2549n) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    i2 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f2550o) + i4;
                }
                mo5674x(coordinatorLayout, appBarLayout, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        mo3157z(coordinatorLayout, appBarLayout, i5, 0.0f);
                    } else {
                        mo5674x(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        mo3157z(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo5674x(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f2536j = 0;
            this.f2548m = -1;
            mo5679u(C0933a.m2711e(mo5678s(), -appBarLayout.getTotalScrollRange(), 0));
            mo3154F(coordinatorLayout, appBarLayout, mo5678s(), 0, true);
            appBarLayout.f2531e = mo5678s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                appBarLayout.postInvalidateOnAnimation();
            }
            mo3153E(coordinatorLayout, appBarLayout);
            return true;
        }

        /* renamed from: i */
        public boolean mo1402i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.C0252f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo1378s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ void mo1404k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            mo3151C(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        /* renamed from: l */
        public void mo1405l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = mo5673w(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo3153E(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: n */
        public void mo1407n(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof C0686a) {
                C0686a aVar = (C0686a) parcelable;
                this.f2548m = aVar.f2552g;
                this.f2550o = aVar.f2553h;
                this.f2549n = aVar.f2554i;
                return;
            }
            this.f2548m = -1;
        }

        /* renamed from: o */
        public Parcelable mo1408o(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int s = mo5678s();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + s;
                if (childAt.getTop() + s > 0 || bottom < 0) {
                    i++;
                } else {
                    C0686a aVar = new C0686a(absSavedState);
                    aVar.f2552g = i;
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z = true;
                    }
                    aVar.f2554i = z;
                    aVar.f2553h = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002d;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1409p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f2539m
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r6
                goto L_0x0015
            L_0x0014:
                r5 = r0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r6
                goto L_0x0029
            L_0x0028:
                r2 = r0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f2547l
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f2551p = r2
                r1.f2546k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1409p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: q */
        public void mo1410q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2546k == 0 || i == 1) {
                mo3152D(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2539m) {
                    appBarLayout.mo3115c(appBarLayout.mo3117d(view2));
                }
            }
            this.f2551p = new WeakReference<>(view2);
        }

        /* renamed from: v */
        public int mo3155v() {
            return mo5678s() + this.f2545j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3156y(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.mo3155v()
                r1 = 0
                if (r11 == 0) goto L_0x00ea
                if (r0 < r11) goto L_0x00ea
                if (r0 > r12) goto L_0x00ea
                int r3 = p039g.C0933a.m2711e(r10, r11, r12)
                if (r0 == r3) goto L_0x00ec
                boolean r10 = r9.f2535i
                if (r10 == 0) goto L_0x0088
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = r1
            L_0x0020:
                if (r12 >= r11) goto L_0x0088
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.C0688a) r4
                android.view.animation.Interpolator r5 = r4.f2556b
                int r6 = r2.getTop()
                if (r10 < r6) goto L_0x0085
                int r6 = r2.getBottom()
                if (r10 > r6) goto L_0x0085
                if (r5 == 0) goto L_0x0088
                int r11 = r4.f2555a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0059
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r12 = r12 + r1
                r11 = r11 & 2
                if (r11 == 0) goto L_0x005a
                java.util.WeakHashMap<android.view.View, j0.q> r11 = p058j0.C1061o.f3808a
                int r11 = r2.getMinimumHeight()
                int r12 = r12 - r11
                goto L_0x005a
            L_0x0059:
                r12 = r1
            L_0x005a:
                java.util.WeakHashMap<android.view.View, j0.q> r11 = p058j0.C1061o.f3808a
                boolean r11 = r2.getFitsSystemWindows()
                if (r11 == 0) goto L_0x0067
                int r11 = r9.getTopInset()
                int r12 = r12 - r11
            L_0x0067:
                if (r12 <= 0) goto L_0x0088
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r12
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0089
            L_0x0085:
                int r12 = r12 + 1
                goto L_0x0020
            L_0x0088:
                r12 = r3
            L_0x0089:
                boolean r10 = r7.mo5679u(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.f2545j = r12
                if (r10 != 0) goto L_0x00ca
                boolean r10 = r9.f2535i
                if (r10 == 0) goto L_0x00ca
                q.d r10 = r8.f1265f
                q.f r10 = r10.f4937b
                p.h r10 = (p093p.C1558h) r10
                r12 = 0
                java.lang.Object r10 = r10.getOrDefault(r9, r12)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x00ca
                boolean r12 = r10.isEmpty()
                if (r12 != 0) goto L_0x00ca
            L_0x00ae:
                int r12 = r10.size()
                if (r1 >= r12) goto L_0x00ca
                java.lang.Object r12 = r10.get(r1)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r2 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0252f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f1285a
                if (r2 == 0) goto L_0x00c7
                r2.mo1397d(r8, r12, r9)
            L_0x00c7:
                int r1 = r1 + 1
                goto L_0x00ae
            L_0x00ca:
                int r10 = r7.mo5678s()
                r9.f2531e = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto L_0x00db
                java.util.WeakHashMap<android.view.View, j0.q> r10 = p058j0.C1061o.f3808a
                r9.postInvalidateOnAnimation()
            L_0x00db:
                if (r3 >= r0) goto L_0x00df
                r10 = -1
                goto L_0x00e0
            L_0x00df:
                r10 = 1
            L_0x00e0:
                r4 = r10
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.mo3154F(r1, r2, r3, r4, r5)
                r1 = r11
                goto L_0x00ec
            L_0x00ea:
                r7.f2545j = r1
            L_0x00ec:
                r7.mo3153E(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo3156y(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: z */
        public final void mo3157z(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo3155v() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int v = mo3155v();
            if (v == i) {
                ValueAnimator valueAnimator = this.f2547l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2547l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f2547l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2547l = valueAnimator3;
                valueAnimator3.setInterpolator(C1494a.f4656e);
                this.f2547l.addUpdateListener(new C0689a(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f2547l.setDuration((long) Math.min(round, 600));
            this.f2547l.setIntValues(new int[]{v, i});
            this.f2547l.start();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C1575c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4586x);
            this.f4901f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public boolean mo1395b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: d */
        public boolean mo1397d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.C0249c cVar = ((CoordinatorLayout.C0252f) view2.getLayoutParams()).f1285a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f2545j) + this.f4900e) - mo5677v(view2);
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f2539m) {
                return false;
            }
            appBarLayout.mo3115c(appBarLayout.mo3117d(view));
            return false;
        }

        /* renamed from: e */
        public void mo1398e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1061o.m3031l(C1150b.C1151a.f4009f.mo4772a(), coordinatorLayout);
                C1061o.m3028i(coordinatorLayout, 0);
                C1061o.m3031l(C1150b.C1151a.f4010g.mo4772a(), coordinatorLayout);
                C1061o.m3028i(coordinatorLayout, 0);
            }
        }

        /* renamed from: m */
        public boolean mo1406m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = mo3161w(coordinatorLayout.mo1342e(view));
            if (w != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f4898c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w.mo3114b(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: w */
        public AppBarLayout mo3161w(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C0688a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f2555a = 1;

        /* renamed from: b */
        public Interpolator f2556b;

        public C0688a(int i, int i2) {
            super(i, i2);
        }

        public C0688a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4563a);
            this.f2555a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f2556b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0688a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0688a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0688a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    public C0688a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C0688a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0688a((ViewGroup.MarginLayoutParams) layoutParams) : new C0688a(layoutParams);
    }

    /* renamed from: b */
    public void mo3114b(boolean z, boolean z2) {
        int i = z ? 1 : 2;
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        this.f2536j = i | i2 | 8;
        requestLayout();
    }

    /* renamed from: c */
    public boolean mo3115c(boolean z) {
        if (this.f2538l == z) {
            return false;
        }
        this.f2538l = z;
        refreshDrawableState();
        if (this.f2539m && (getBackground() instanceof C1242f)) {
            C1242f fVar = (C1242f) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f2542p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.f2542p = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f2542p.setInterpolator(C1494a.f4652a);
            this.f2542p.addUpdateListener(new C1572a(this, fVar));
            this.f2542p.start();
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0688a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3117d(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2541o
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f2540n
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f2540n
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f2541o = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2541o
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.mo3117d(android.view.View):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2544r != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f2531e));
            this.f2544r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2544r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final boolean mo3120e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return !childAt.getFitsSystemWindows();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0688a(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0688a(getContext(), attributeSet);
    }

    public CoordinatorLayout.C0249c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f2533g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0688a aVar = (C0688a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f2555a;
            if ((i4 & 5) == 5) {
                int i5 = aVar.topMargin + aVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    i = i5 + childAt.getMinimumHeight();
                } else if ((i4 & 2) != 0) {
                    WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                    i = i5 + (measuredHeight - childAt.getMinimumHeight());
                } else {
                    i = i5 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, C1070q> weakHashMap3 = C1061o.f3808a;
                    if (childAt.getFitsSystemWindows()) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f2533g = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f2534h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0688a aVar = (C0688a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i4 = aVar.f2555a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f2534h = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f2540n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2536j;
    }

    public Drawable getStatusBarForeground() {
        return this.f2544r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f2532f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0688a aVar = (C0688a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f2555a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i3;
            if (i2 == 0) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f2532f = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1242f) {
            C0955a.m2721B(this, (C1242f) background);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f2543q == null) {
            this.f2543q = new int[4];
        }
        int[] iArr = this.f2543q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f2537k;
        iArr[0] = z ? R.attr.state_liftable : -2130903870;
        iArr[1] = (!z || !this.f2538l) ? -2130903871 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130903868;
        iArr[3] = (!z || !this.f2538l) ? -2130903867 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2541o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2541o = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z3 = true;
        if (getFitsSystemWindows() && mo3120e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.f2532f = -1;
        this.f2533g = -1;
        this.f2534h = -1;
        this.f2535i = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C0688a) getChildAt(i5).getLayoutParams()).f2556b != null) {
                this.f2535i = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f2544r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2539m) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C0688a) getChildAt(i6).getLayoutParams()).f2555a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f2537k != z3) {
            this.f2537k = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (getFitsSystemWindows() && mo3120e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C0933a.m2711e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f2532f = -1;
        this.f2533g = -1;
        this.f2534h = -1;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C0955a.m2720A(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        mo3114b(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.f2539m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f2540n = i;
        WeakReference<View> weakReference = this.f2541o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2541o = null;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f2544r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2544r = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2544r.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2544r;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f2544r.setVisible(getVisibility() == 0, false);
                this.f2544r.setCallback(this);
            }
            if (this.f2544r != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C1021a.m2945a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130903871}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2544r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2544r;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m6153generateDefaultLayoutParams() {
        return new C0688a(-1, -2);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m6154generateLayoutParams(AttributeSet attributeSet) {
        return new C0688a(getContext(), attributeSet);
    }
}
