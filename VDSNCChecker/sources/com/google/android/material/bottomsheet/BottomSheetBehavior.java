package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.C0131a0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p018c2.C0624a;
import p036f2.C0904l;
import p036f2.C0905m;
import p036f2.C0906n;
import p039g.C0933a;
import p054i2.C1030c;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p064k0.C1158d;
import p072l2.C1242f;
import p072l2.C1247i;
import p083n1.C1455a;
import p088o0.C1491a;
import p094p0.C1568c;
import p113s1.C1707a;
import p113s1.C1708b;
import p113s1.C1709c;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0249c<V> {

    /* renamed from: A */
    public int f2605A;

    /* renamed from: B */
    public float f2606B = -1.0f;

    /* renamed from: C */
    public boolean f2607C;

    /* renamed from: D */
    public boolean f2608D;

    /* renamed from: E */
    public boolean f2609E = true;

    /* renamed from: F */
    public int f2610F = 4;

    /* renamed from: G */
    public C1568c f2611G;

    /* renamed from: H */
    public boolean f2612H;

    /* renamed from: I */
    public int f2613I;

    /* renamed from: J */
    public boolean f2614J;

    /* renamed from: K */
    public int f2615K;

    /* renamed from: L */
    public int f2616L;

    /* renamed from: M */
    public int f2617M;

    /* renamed from: N */
    public WeakReference<V> f2618N;

    /* renamed from: O */
    public WeakReference<View> f2619O;

    /* renamed from: P */
    public final ArrayList<C0701d> f2620P = new ArrayList<>();

    /* renamed from: Q */
    public VelocityTracker f2621Q;

    /* renamed from: R */
    public int f2622R;

    /* renamed from: S */
    public int f2623S;

    /* renamed from: T */
    public boolean f2624T;

    /* renamed from: U */
    public Map<View, Integer> f2625U;

    /* renamed from: V */
    public int f2626V = -1;

    /* renamed from: W */
    public final C1568c.C1571c f2627W = new C0700c();

    /* renamed from: a */
    public int f2628a = 0;

    /* renamed from: b */
    public boolean f2629b = true;

    /* renamed from: c */
    public float f2630c;

    /* renamed from: d */
    public int f2631d;

    /* renamed from: e */
    public boolean f2632e;

    /* renamed from: f */
    public int f2633f;

    /* renamed from: g */
    public int f2634g;

    /* renamed from: h */
    public boolean f2635h;

    /* renamed from: i */
    public C1242f f2636i;

    /* renamed from: j */
    public int f2637j = -1;

    /* renamed from: k */
    public int f2638k;

    /* renamed from: l */
    public boolean f2639l;

    /* renamed from: m */
    public boolean f2640m;

    /* renamed from: n */
    public boolean f2641n;

    /* renamed from: o */
    public boolean f2642o;

    /* renamed from: p */
    public boolean f2643p;

    /* renamed from: q */
    public int f2644q;

    /* renamed from: r */
    public int f2645r;

    /* renamed from: s */
    public C1247i f2646s;

    /* renamed from: t */
    public boolean f2647t;

    /* renamed from: u */
    public BottomSheetBehavior<V>.f f2648u = null;

    /* renamed from: v */
    public ValueAnimator f2649v;

    /* renamed from: w */
    public int f2650w;

    /* renamed from: x */
    public int f2651x;

    /* renamed from: y */
    public int f2652y;

    /* renamed from: z */
    public float f2653z = 0.5f;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C0698a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ View f2654e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup.LayoutParams f2655f;

        public C0698a(BottomSheetBehavior bottomSheetBehavior, View view, ViewGroup.LayoutParams layoutParams) {
            this.f2654e = view;
            this.f2655f = layoutParams;
        }

        public void run() {
            this.f2654e.setLayoutParams(this.f2655f);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C0699b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ View f2656e;

        /* renamed from: f */
        public final /* synthetic */ int f2657f;

        public C0699b(View view, int i) {
            this.f2656e = view;
            this.f2657f = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo3211C(this.f2656e, this.f2657f);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C0700c extends C1568c.C1571c {
        public C0700c() {
        }

        /* renamed from: a */
        public int mo3173a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo3174b(View view, int i, int i2) {
            int x = BottomSheetBehavior.this.mo3224x();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0933a.m2711e(i, x, bottomSheetBehavior.f2607C ? bottomSheetBehavior.f2617M : bottomSheetBehavior.f2605A);
        }

        /* renamed from: d */
        public int mo3229d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f2607C ? bottomSheetBehavior.f2617M : bottomSheetBehavior.f2605A;
        }

        /* renamed from: f */
        public void mo3177f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f2609E) {
                    bottomSheetBehavior.mo3210B(1);
                }
            }
        }

        /* renamed from: g */
        public void mo3178g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo3222v(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f2659a.mo3224x()) < java.lang.Math.abs(r8.getTop() - r7.f2659a.f2652y)) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
            if (java.lang.Math.abs(r9 - r7.f2659a.f2652y) < java.lang.Math.abs(r9 - r7.f2659a.f2605A)) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.f2605A)) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - r7.f2659a.f2605A)) goto L_0x00c0;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3179h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                r3 = 4
                r4 = 6
                r5 = 3
                if (r1 >= 0) goto L_0x0026
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f2629b
                if (r10 == 0) goto L_0x0014
            L_0x000f:
                int r9 = r9.f2651x
            L_0x0011:
                r3 = r5
                goto L_0x010b
            L_0x0014:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f2652y
                if (r9 <= r0) goto L_0x0021
                r9 = r0
                goto L_0x00c4
            L_0x0021:
                int r9 = r10.mo3224x()
                goto L_0x0011
            L_0x0026:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r1.f2607C
                if (r6 == 0) goto L_0x008d
                boolean r1 = r1.mo3213E(r8, r10)
                if (r1 == 0) goto L_0x008d
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0044
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x005a
            L_0x0044:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f2617M
                int r10 = r10.mo3224x()
                int r10 = r10 + r0
                int r10 = r10 / 2
                if (r9 <= r10) goto L_0x0057
                r9 = r2
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                if (r9 == 0) goto L_0x0061
            L_0x005a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f2617M
                r3 = 5
                goto L_0x010b
            L_0x0061:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f2629b
                if (r10 == 0) goto L_0x0068
                goto L_0x000f
            L_0x0068:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.mo3224x()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f2652y
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00c0
            L_0x0086:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.mo3224x()
                goto L_0x0011
            L_0x008d:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00c9
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x009e
                goto L_0x00c9
            L_0x009e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f2629b
                if (r10 == 0) goto L_0x00a7
            L_0x00a4:
                int r9 = r9.f2605A
                goto L_0x010b
            L_0x00a7:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f2652y
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f2605A
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c6
            L_0x00c0:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f2652y
            L_0x00c4:
                r3 = r4
                goto L_0x010b
            L_0x00c6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x00a4
            L_0x00c9:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r10.f2629b
                if (r0 == 0) goto L_0x00ea
                int r10 = r10.f2651x
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f2605A
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x000f
            L_0x00ea:
                int r0 = r10.f2652y
                if (r9 >= r0) goto L_0x00f9
                int r10 = r10.f2605A
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00c0
                goto L_0x0086
            L_0x00f9:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f2605A
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c6
                goto L_0x00c0
            L_0x010b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10.mo3214F(r8, r3, r9, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0700c.mo3179h(android.view.View, float, float):void");
        }

        /* renamed from: i */
        public boolean mo3180i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f2610F;
            if (i2 == 1 || bottomSheetBehavior.f2624T) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f2622R == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f2619O;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f2618N;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class C0701d {
        /* renamed from: a */
        public abstract void mo3230a(View view, float f);

        /* renamed from: b */
        public abstract void mo3231b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C0702e extends C1491a {
        public static final Parcelable.Creator<C0702e> CREATOR = new C0703a();

        /* renamed from: g */
        public final int f2660g;

        /* renamed from: h */
        public int f2661h;

        /* renamed from: i */
        public boolean f2662i;

        /* renamed from: j */
        public boolean f2663j;

        /* renamed from: k */
        public boolean f2664k;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class C0703a implements Parcelable.ClassLoaderCreator<C0702e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0702e(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0702e[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0702e(parcel, classLoader);
            }
        }

        public C0702e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2660g = parcel.readInt();
            this.f2661h = parcel.readInt();
            boolean z = false;
            this.f2662i = parcel.readInt() == 1;
            this.f2663j = parcel.readInt() == 1;
            this.f2664k = parcel.readInt() == 1 ? true : z;
        }

        public C0702e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f2660g = bottomSheetBehavior.f2610F;
            this.f2661h = bottomSheetBehavior.f2631d;
            this.f2662i = bottomSheetBehavior.f2629b;
            this.f2663j = bottomSheetBehavior.f2607C;
            this.f2664k = bottomSheetBehavior.f2608D;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeInt(this.f2660g);
            parcel.writeInt(this.f2661h);
            parcel.writeInt(this.f2662i ? 1 : 0);
            parcel.writeInt(this.f2663j ? 1 : 0);
            parcel.writeInt(this.f2664k ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C0704f implements Runnable {

        /* renamed from: e */
        public final View f2665e;

        /* renamed from: f */
        public boolean f2666f;

        /* renamed from: g */
        public int f2667g;

        public C0704f(View view, int i) {
            this.f2665e = view;
            this.f2667g = i;
        }

        public void run() {
            C1568c cVar = BottomSheetBehavior.this.f2611G;
            if (cVar == null || !cVar.mo5656i(true)) {
                BottomSheetBehavior.this.mo3210B(this.f2667g);
            } else {
                View view = this.f2665e;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view.postOnAnimation(this);
            }
            this.f2666f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        this.f2634g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4564b);
        this.f2635h = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            mo3221u(context, attributeSet, hasValue, C1030c.m2956a(context, obtainStyledAttributes, 2));
        } else {
            mo3221u(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2649v = ofFloat;
        ofFloat.setDuration(500);
        this.f2649v.addUpdateListener(new C1707a(this));
        this.f2606B = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2637j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            mo3226z(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            mo3226z(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(7, false);
        if (this.f2607C != z) {
            this.f2607C = z;
            if (!z && this.f2610F == 5) {
                mo3209A(4);
            }
            mo3215G();
        }
        this.f2639l = obtainStyledAttributes.getBoolean(11, false);
        boolean z2 = obtainStyledAttributes.getBoolean(5, true);
        if (this.f2629b != z2) {
            this.f2629b = z2;
            if (this.f2618N != null) {
                mo3219s();
            }
            mo3210B((!this.f2629b || this.f2610F != 6) ? this.f2610F : 3);
            mo3215G();
        }
        this.f2608D = obtainStyledAttributes.getBoolean(10, false);
        this.f2609E = obtainStyledAttributes.getBoolean(3, true);
        this.f2628a = obtainStyledAttributes.getInt(9, 0);
        float f = obtainStyledAttributes.getFloat(6, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f2653z = f;
        if (this.f2618N != null) {
            this.f2652y = (int) ((1.0f - f) * ((float) this.f2617M));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        if (peekValue2 == null || peekValue2.type != 16) {
            i = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            i = peekValue2.data;
            if (i < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f2650w = i;
        this.f2640m = obtainStyledAttributes.getBoolean(12, false);
        this.f2641n = obtainStyledAttributes.getBoolean(13, false);
        this.f2642o = obtainStyledAttributes.getBoolean(14, false);
        this.f2643p = obtainStyledAttributes.getBoolean(15, true);
        obtainStyledAttributes.recycle();
        this.f2630c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: A */
    public void mo3209A(int i) {
        if (i != this.f2610F) {
            if (this.f2618N != null) {
                mo3212D(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f2607C && i == 5)) {
                this.f2610F = i;
            }
        }
    }

    /* renamed from: B */
    public void mo3210B(int i) {
        View view;
        if (this.f2610F != i) {
            this.f2610F = i;
            WeakReference<V> weakReference = this.f2618N;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo3217I(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo3217I(false);
                }
                mo3216H(i);
                for (int i2 = 0; i2 < this.f2620P.size(); i2++) {
                    this.f2620P.get(i2).mo3231b(view, i);
                }
                mo3215G();
            }
        }
    }

    /* renamed from: C */
    public void mo3211C(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f2605A;
        } else if (i == 6) {
            int i4 = this.f2652y;
            if (!this.f2629b || i4 > (i3 = this.f2651x)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = mo3224x();
        } else if (!this.f2607C || i != 5) {
            throw new IllegalArgumentException(C0131a0.m344a("Illegal state argument: ", i));
        } else {
            i2 = this.f2617M;
        }
        mo3214F(view, i, i2, false);
    }

    /* renamed from: D */
    public final void mo3212D(int i) {
        View view = (View) this.f2618N.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (view.isAttachedToWindow()) {
                    view.post(new C0699b(view, i));
                    return;
                }
            }
            mo3211C(view, i);
        }
    }

    /* renamed from: E */
    public boolean mo3213E(View view, float f) {
        if (this.f2608D) {
            return true;
        }
        if (view.getTop() < this.f2605A) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f2605A)) / ((float) mo3220t()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0.mo5667t(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3214F(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            p0.c r0 = r4.f2611G
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.mo5667t(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.f4882r = r5
            r3 = -1
            r0.f4867c = r3
            boolean r7 = r0.mo5659l(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.f4865a
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.f4882r
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.f4882r = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0056
            r7 = 2
            r4.mo3210B(r7)
            r4.mo3216H(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f2648u
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$f r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$f
            r7.<init>(r5, r6)
            r4.f2648u = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.f2648u
            boolean r8 = r7.f2666f
            r7.f2667g = r6
            if (r8 != 0) goto L_0x0059
            java.util.WeakHashMap<android.view.View, j0.q> r6 = p058j0.C1061o.f3808a
            r5.postOnAnimation(r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r5 = r4.f2648u
            r5.f2666f = r1
            goto L_0x0059
        L_0x0056:
            r4.mo3210B(r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3214F(android.view.View, int, int, boolean):void");
    }

    /* renamed from: G */
    public final void mo3215G() {
        View view;
        C1150b.C1151a aVar;
        int i;
        WeakReference<V> weakReference = this.f2618N;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1061o.m3031l(EnumBarcodeFormat.BF_MICRO_PDF417, view);
            C1061o.m3028i(view, 0);
            C1061o.m3031l(EnumBarcodeFormat.BF_PATCHCODE, view);
            C1061o.m3028i(view, 0);
            C1061o.m3031l(1048576, view);
            C1061o.m3028i(view, 0);
            int i2 = this.f2626V;
            if (i2 != -1) {
                C1061o.m3031l(i2, view);
                C1061o.m3028i(view, 0);
            }
            int i3 = 6;
            if (!this.f2629b && this.f2610F != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C1709c cVar = new C1709c(this, 6);
                List<C1150b.C1151a> h = C1061o.m3027h(view);
                int i4 = 0;
                while (true) {
                    if (i4 >= h.size()) {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = C1061o.f3811d;
                            if (i5 >= iArr.length || i6 != -1) {
                                i = i6;
                            } else {
                                int i7 = iArr[i5];
                                boolean z = true;
                                for (int i8 = 0; i8 < h.size(); i8++) {
                                    z &= h.get(i8).mo4772a() != i7;
                                }
                                if (z) {
                                    i6 = i7;
                                }
                                i5++;
                            }
                        }
                        i = i6;
                    } else if (TextUtils.equals(string, h.get(i4).mo4773b())) {
                        i = h.get(i4).mo4772a();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    C1061o.m3020a(view, new C1150b.C1151a((Object) null, i, string, cVar, (Class<? extends C1158d.C1159a>) null));
                }
                this.f2626V = i;
            }
            if (this.f2607C && this.f2610F != 5) {
                mo3225y(view, C1150b.C1151a.f4013j, 5);
            }
            int i9 = this.f2610F;
            if (i9 == 3) {
                if (this.f2629b) {
                    i3 = 4;
                }
                aVar = C1150b.C1151a.f4012i;
            } else if (i9 == 4) {
                if (this.f2629b) {
                    i3 = 3;
                }
                aVar = C1150b.C1151a.f4011h;
            } else if (i9 == 6) {
                mo3225y(view, C1150b.C1151a.f4012i, 4);
                mo3225y(view, C1150b.C1151a.f4011h, 3);
                return;
            } else {
                return;
            }
            mo3225y(view, aVar, i3);
        }
    }

    /* renamed from: H */
    public final void mo3216H(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f2647t != z) {
                this.f2647t = z;
                if (this.f2636i != null && (valueAnimator = this.f2649v) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f2649v.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f2649v.setFloatValues(new float[]{1.0f - f, f});
                    this.f2649v.start();
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo3217I(boolean z) {
        WeakReference<V> weakReference = this.f2618N;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f2625U == null) {
                        this.f2625U = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f2618N.get() && z) {
                        this.f2625U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f2625U = null;
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo3218J(boolean z) {
        View view;
        if (this.f2618N != null) {
            mo3219s();
            if (this.f2610F == 4 && (view = (View) this.f2618N.get()) != null) {
                if (z) {
                    mo3212D(this.f2610F);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1396c(CoordinatorLayout.C0252f fVar) {
        this.f2618N = null;
        this.f2611G = null;
    }

    /* renamed from: f */
    public void mo1399f() {
        this.f2618N = null;
        this.f2611G = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1400g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.f2609E
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.f2622R = r4
            android.view.VelocityTracker r5 = r9.f2621Q
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.f2621Q = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.f2621Q
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f2621Q = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.f2621Q
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.f2624T = r1
            r9.f2622R = r4
            boolean r11 = r9.f2612H
            if (r11 == 0) goto L_0x0087
            r9.f2612H = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f2623S = r7
            int r7 = r9.f2610F
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f2619O
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.f2623S
            boolean r7 = r10.mo1373p(r7, r6, r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f2622R = r7
            r9.f2624T = r2
        L_0x0076:
            int r7 = r9.f2622R
            if (r7 != r4) goto L_0x0084
            int r4 = r9.f2623S
            boolean r11 = r10.mo1373p(r11, r6, r4)
            if (r11 != 0) goto L_0x0084
            r11 = r2
            goto L_0x0085
        L_0x0084:
            r11 = r1
        L_0x0085:
            r9.f2612H = r11
        L_0x0087:
            boolean r11 = r9.f2612H
            if (r11 != 0) goto L_0x0096
            p0.c r11 = r9.f2611G
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.mo5668u(r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f2619O
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.f2612H
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.f2610F
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo1373p(r3, r11, r0)
            if (r10 != 0) goto L_0x00d7
            p0.c r10 = r9.f2611G
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.f2623S
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            p0.c r11 = r9.f2611G
            int r11 = r11.f4866b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = r2
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.f2612H = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1400g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    public boolean mo1401h(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C1242f fVar;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.f2618N == null) {
            this.f2633f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = Build.VERSION.SDK_INT >= 29 && !this.f2639l && !this.f2632e;
            if (this.f2640m || this.f2641n || this.f2642o || z) {
                C1061o.C1063b.m3038c(v, new C0904l(new C1708b(this, z), new C0906n.C0908b(v.getPaddingStart(), v.getPaddingTop(), v.getPaddingEnd(), v.getPaddingBottom())));
                if (v.isAttachedToWindow()) {
                    v.requestApplyInsets();
                } else {
                    v.addOnAttachStateChangeListener(new C0905m());
                }
            }
            this.f2618N = new WeakReference<>(v);
            if (this.f2635h && (fVar = this.f2636i) != null) {
                v.setBackground(fVar);
            }
            C1242f fVar2 = this.f2636i;
            if (fVar2 != null) {
                float f = this.f2606B;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                fVar2.mo4974o(f);
                boolean z2 = this.f2610F == 3;
                this.f2647t = z2;
                this.f2636i.mo4977q(z2 ? 0.0f : 1.0f);
            }
            mo3215G();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i3 = this.f2637j;
            if (measuredWidth > i3 && i3 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.f2637j;
                v.post(new C0698a(this, v, layoutParams));
            }
        }
        if (this.f2611G == null) {
            this.f2611G = new C1568c(coordinatorLayout.getContext(), coordinatorLayout, this.f2627W);
        }
        int top = v.getTop();
        coordinatorLayout.mo1375r(v, i);
        this.f2616L = coordinatorLayout.getWidth();
        this.f2617M = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f2615K = height;
        int i4 = this.f2617M;
        int i5 = i4 - height;
        int i6 = this.f2645r;
        if (i5 < i6) {
            if (this.f2643p) {
                this.f2615K = i4;
            } else {
                this.f2615K = i4 - i6;
            }
        }
        this.f2651x = Math.max(0, i4 - this.f2615K);
        this.f2652y = (int) ((1.0f - this.f2653z) * ((float) this.f2617M));
        mo3219s();
        int i7 = this.f2610F;
        if (i7 == 3) {
            i2 = mo3224x();
        } else if (i7 == 6) {
            i2 = this.f2652y;
        } else if (this.f2607C && i7 == 5) {
            i2 = this.f2617M;
        } else if (i7 == 4) {
            i2 = this.f2605A;
        } else {
            if (i7 == 1 || i7 == 2) {
                v.offsetTopAndBottom(top - v.getTop());
            }
            this.f2619O = new WeakReference<>(mo3223w(v));
            return true;
        }
        v.offsetTopAndBottom(i2);
        this.f2619O = new WeakReference<>(mo3223w(v));
        return true;
    }

    /* renamed from: j */
    public boolean mo1403j(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f2619O;
        return (weakReference == null || view != weakReference.get() || this.f2610F == 3) ? false : true;
    }

    /* renamed from: k */
    public void mo1404k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f2619O;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f2605A;
                        if (i5 > i6 && !this.f2607C) {
                            iArr[1] = top - i6;
                            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                            v.offsetTopAndBottom(-iArr[1]);
                            i4 = 4;
                            mo3210B(i4);
                        } else if (this.f2609E) {
                            iArr[1] = i2;
                        } else {
                            return;
                        }
                    }
                    mo3222v(v.getTop());
                    this.f2613I = i2;
                    this.f2614J = true;
                } else if (i5 < mo3224x()) {
                    iArr[1] = top - mo3224x();
                    WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                    v.offsetTopAndBottom(-iArr[1]);
                    i4 = 3;
                    mo3210B(i4);
                    mo3222v(v.getTop());
                    this.f2613I = i2;
                    this.f2614J = true;
                } else if (this.f2609E) {
                    iArr[1] = i2;
                } else {
                    return;
                }
                int i7 = -i2;
                WeakHashMap<View, C1070q> weakHashMap3 = C1061o.f3808a;
                v.offsetTopAndBottom(i7);
                mo3210B(1);
                mo3222v(v.getTop());
                this.f2613I = i2;
                this.f2614J = true;
            }
        }
    }

    /* renamed from: l */
    public void mo1405l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: n */
    public void mo1407n(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0702e eVar = (C0702e) parcelable;
        int i = this.f2628a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2631d = eVar.f2661h;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2629b = eVar.f2662i;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2607C = eVar.f2663j;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2608D = eVar.f2664k;
            }
        }
        int i2 = eVar.f2660g;
        if (i2 == 1 || i2 == 2) {
            this.f2610F = 4;
        } else {
            this.f2610F = i2;
        }
    }

    /* renamed from: o */
    public Parcelable mo1408o(CoordinatorLayout coordinatorLayout, V v) {
        return new C0702e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    /* renamed from: p */
    public boolean mo1409p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f2613I = 0;
        this.f2614J = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4 > r6) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (java.lang.Math.abs(r4 - r3.f2651x) < java.lang.Math.abs(r4 - r3.f2605A)) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.f2605A)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        r4 = mo3224x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f2605A)) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (java.lang.Math.abs(r4 - r3.f2652y) < java.lang.Math.abs(r4 - r3.f2605A)) goto L_0x00b5;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1410q(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.mo3224x()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.mo3210B(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f2619O
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00c3
            boolean r4 = r3.f2614J
            if (r4 != 0) goto L_0x001f
            goto L_0x00c3
        L_0x001f:
            int r4 = r3.f2613I
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0034
            boolean r4 = r3.f2629b
            if (r4 == 0) goto L_0x002a
            goto L_0x0075
        L_0x002a:
            int r4 = r5.getTop()
            int r6 = r3.f2652y
            if (r4 <= r6) goto L_0x0086
            goto L_0x00b7
        L_0x0034:
            boolean r4 = r3.f2607C
            if (r4 == 0) goto L_0x0058
            android.view.VelocityTracker r4 = r3.f2621Q
            if (r4 != 0) goto L_0x003e
            r4 = 0
            goto L_0x004d
        L_0x003e:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f2630c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f2621Q
            int r1 = r3.f2622R
            float r4 = r4.getYVelocity(r1)
        L_0x004d:
            boolean r4 = r3.mo3213E(r5, r4)
            if (r4 == 0) goto L_0x0058
            int r4 = r3.f2617M
            r0 = 5
            goto L_0x00bd
        L_0x0058:
            int r4 = r3.f2613I
            if (r4 != 0) goto L_0x009b
            int r4 = r5.getTop()
            boolean r1 = r3.f2629b
            if (r1 == 0) goto L_0x0078
            int r7 = r3.f2651x
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.f2605A
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00ba
        L_0x0075:
            int r4 = r3.f2651x
            goto L_0x00bd
        L_0x0078:
            int r1 = r3.f2652y
            if (r4 >= r1) goto L_0x008b
            int r6 = r3.f2605A
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00b5
        L_0x0086:
            int r4 = r3.mo3224x()
            goto L_0x00bd
        L_0x008b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f2605A
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00ba
            goto L_0x00b5
        L_0x009b:
            boolean r4 = r3.f2629b
            if (r4 == 0) goto L_0x00a0
            goto L_0x00ba
        L_0x00a0:
            int r4 = r5.getTop()
            int r0 = r3.f2652y
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f2605A
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00ba
        L_0x00b5:
            int r6 = r3.f2652y
        L_0x00b7:
            r4 = r6
            r0 = r7
            goto L_0x00bd
        L_0x00ba:
            int r4 = r3.f2605A
            r0 = r6
        L_0x00bd:
            r6 = 0
            r3.mo3214F(r5, r0, r4, r6)
            r3.f2614J = r6
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1410q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: r */
    public boolean mo1411r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2610F == 1 && actionMasked == 0) {
            return true;
        }
        C1568c cVar = this.f2611G;
        if (cVar != null) {
            cVar.mo5661n(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2622R = -1;
            VelocityTracker velocityTracker = this.f2621Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2621Q = null;
            }
        }
        if (this.f2621Q == null) {
            this.f2621Q = VelocityTracker.obtain();
        }
        this.f2621Q.addMovement(motionEvent);
        if (this.f2611G != null && actionMasked == 2 && !this.f2612H) {
            float abs = Math.abs(((float) this.f2623S) - motionEvent.getY());
            C1568c cVar2 = this.f2611G;
            if (abs > ((float) cVar2.f4866b)) {
                cVar2.mo5649b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2612H;
    }

    /* renamed from: s */
    public final void mo3219s() {
        int t = mo3220t();
        if (this.f2629b) {
            this.f2605A = Math.max(this.f2617M - t, this.f2651x);
        } else {
            this.f2605A = this.f2617M - t;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f2638k;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3220t() {
        /*
            r3 = this;
            boolean r0 = r3.f2632e
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f2633f
            int r1 = r3.f2617M
            int r2 = r3.f2616L
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f2615K
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f2644q
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f2639l
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f2640m
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f2638k
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f2631d
            int r2 = r3.f2634g
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f2631d
            int r1 = r3.f2644q
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3220t():int");
    }

    /* renamed from: u */
    public final void mo3221u(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f2635h) {
            this.f2646s = C1247i.m3551b(context, attributeSet, R.attr.bottomSheetStyle, 2131952247).mo4991a();
            C1242f fVar = new C1242f(this.f2646s);
            this.f2636i = fVar;
            fVar.f4164e.f4188b = new C0624a(context);
            fVar.mo4984w();
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2636i.setTint(typedValue.data);
                return;
            }
            this.f2636i.mo4976p(colorStateList);
        }
    }

    /* renamed from: v */
    public void mo3222v(int i) {
        float f;
        float f2;
        View view = (View) this.f2618N.get();
        if (view != null && !this.f2620P.isEmpty()) {
            int i2 = this.f2605A;
            if (i > i2 || i2 == mo3224x()) {
                int i3 = this.f2605A;
                f = (float) (i3 - i);
                f2 = (float) (this.f2617M - i3);
            } else {
                int i4 = this.f2605A;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo3224x());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f2620P.size(); i5++) {
                this.f2620P.get(i5).mo3230a(view, f3);
            }
        }
    }

    /* renamed from: w */
    public View mo3223w(View view) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View w = mo3223w(viewGroup.getChildAt(i));
            if (w != null) {
                return w;
            }
        }
        return null;
    }

    /* renamed from: x */
    public int mo3224x() {
        if (this.f2629b) {
            return this.f2651x;
        }
        return Math.max(this.f2650w, this.f2643p ? 0 : this.f2645r);
    }

    /* renamed from: y */
    public final void mo3225y(V v, C1150b.C1151a aVar, int i) {
        C1061o.m3032m(v, aVar, (CharSequence) null, new C1709c(this, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3226z(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f2632e
            if (r4 != 0) goto L_0x0015
            r3.f2632e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f2632e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f2631d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.f2632e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f2631d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.mo3218J(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3226z(int):void");
    }
}
