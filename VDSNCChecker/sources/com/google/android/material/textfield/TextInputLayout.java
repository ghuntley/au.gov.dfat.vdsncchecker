package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0148d0;
import androidx.appcompat.widget.C0169i0;
import androidx.appcompat.widget.C0176k;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0890b;
import p036f2.C0891c;
import p046h0.C1000a;
import p046h0.C1004c;
import p051i.C1021a;
import p054i2.C1027a;
import p054i2.C1033f;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;
import p072l2.C1247i;
import p088o0.C1491a;
import p089o1.C1494a;
import p090o2.C1509f;
import p090o2.C1514k;
import p090o2.C1515l;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    public CharSequence f2892A;

    /* renamed from: A0 */
    public int f2893A0;

    /* renamed from: B */
    public final TextView f2894B;

    /* renamed from: B0 */
    public int f2895B0;

    /* renamed from: C */
    public CharSequence f2896C;

    /* renamed from: C0 */
    public int f2897C0;

    /* renamed from: D */
    public final TextView f2898D;

    /* renamed from: D0 */
    public ColorStateList f2899D0;

    /* renamed from: E */
    public boolean f2900E;

    /* renamed from: E0 */
    public int f2901E0;

    /* renamed from: F */
    public CharSequence f2902F;

    /* renamed from: F0 */
    public int f2903F0;

    /* renamed from: G */
    public boolean f2904G;

    /* renamed from: G0 */
    public int f2905G0;

    /* renamed from: H */
    public C1242f f2906H;

    /* renamed from: H0 */
    public int f2907H0;

    /* renamed from: I */
    public C1242f f2908I;

    /* renamed from: I0 */
    public int f2909I0;

    /* renamed from: J */
    public C1247i f2910J;

    /* renamed from: J0 */
    public boolean f2911J0;

    /* renamed from: K */
    public final int f2912K;

    /* renamed from: K0 */
    public final C0891c f2913K0;

    /* renamed from: L */
    public int f2914L;

    /* renamed from: L0 */
    public boolean f2915L0;

    /* renamed from: M */
    public int f2916M;

    /* renamed from: M0 */
    public boolean f2917M0;

    /* renamed from: N */
    public int f2918N;

    /* renamed from: N0 */
    public ValueAnimator f2919N0;

    /* renamed from: O */
    public int f2920O;

    /* renamed from: O0 */
    public boolean f2921O0;

    /* renamed from: P */
    public int f2922P;

    /* renamed from: P0 */
    public boolean f2923P0;

    /* renamed from: Q */
    public int f2924Q;

    /* renamed from: R */
    public int f2925R;

    /* renamed from: S */
    public int f2926S;

    /* renamed from: T */
    public final Rect f2927T = new Rect();

    /* renamed from: U */
    public final Rect f2928U = new Rect();

    /* renamed from: V */
    public final RectF f2929V = new RectF();

    /* renamed from: W */
    public Typeface f2930W;

    /* renamed from: a0 */
    public final CheckableImageButton f2931a0;

    /* renamed from: b0 */
    public ColorStateList f2932b0;

    /* renamed from: c0 */
    public boolean f2933c0;

    /* renamed from: d0 */
    public PorterDuff.Mode f2934d0;

    /* renamed from: e */
    public final FrameLayout f2935e;

    /* renamed from: e0 */
    public boolean f2936e0;

    /* renamed from: f */
    public final LinearLayout f2937f;

    /* renamed from: f0 */
    public Drawable f2938f0;

    /* renamed from: g */
    public final LinearLayout f2939g;

    /* renamed from: g0 */
    public int f2940g0;

    /* renamed from: h */
    public final FrameLayout f2941h;

    /* renamed from: h0 */
    public View.OnLongClickListener f2942h0;

    /* renamed from: i */
    public EditText f2943i;

    /* renamed from: i0 */
    public final LinkedHashSet<C0751f> f2944i0 = new LinkedHashSet<>();

    /* renamed from: j */
    public CharSequence f2945j;

    /* renamed from: j0 */
    public int f2946j0 = 0;

    /* renamed from: k */
    public int f2947k = -1;

    /* renamed from: k0 */
    public final SparseArray<C1514k> f2948k0;

    /* renamed from: l */
    public int f2949l = -1;

    /* renamed from: l0 */
    public final CheckableImageButton f2950l0;

    /* renamed from: m */
    public final C1515l f2951m = new C1515l(this);

    /* renamed from: m0 */
    public final LinkedHashSet<C0752g> f2952m0;

    /* renamed from: n */
    public boolean f2953n;

    /* renamed from: n0 */
    public ColorStateList f2954n0;

    /* renamed from: o */
    public int f2955o;

    /* renamed from: o0 */
    public boolean f2956o0;

    /* renamed from: p */
    public boolean f2957p;

    /* renamed from: p0 */
    public PorterDuff.Mode f2958p0;

    /* renamed from: q */
    public TextView f2959q;

    /* renamed from: q0 */
    public boolean f2960q0;

    /* renamed from: r */
    public int f2961r;

    /* renamed from: r0 */
    public Drawable f2962r0;

    /* renamed from: s */
    public int f2963s;

    /* renamed from: s0 */
    public int f2964s0;

    /* renamed from: t */
    public CharSequence f2965t;

    /* renamed from: t0 */
    public Drawable f2966t0;

    /* renamed from: u */
    public boolean f2967u;

    /* renamed from: u0 */
    public View.OnLongClickListener f2968u0;

    /* renamed from: v */
    public TextView f2969v;

    /* renamed from: v0 */
    public View.OnLongClickListener f2970v0;

    /* renamed from: w */
    public ColorStateList f2971w;

    /* renamed from: w0 */
    public final CheckableImageButton f2972w0;

    /* renamed from: x */
    public int f2973x;

    /* renamed from: x0 */
    public ColorStateList f2974x0;

    /* renamed from: y */
    public ColorStateList f2975y;

    /* renamed from: y0 */
    public ColorStateList f2976y0;

    /* renamed from: z */
    public ColorStateList f2977z;

    /* renamed from: z0 */
    public ColorStateList f2978z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C0746a implements TextWatcher {
        public C0746a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo3948y(!textInputLayout.f2923P0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f2953n) {
                textInputLayout2.mo3943t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f2967u) {
                textInputLayout3.mo3949z(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C0747b implements Runnable {
        public C0747b() {
        }

        public void run() {
            TextInputLayout.this.f2950l0.performClick();
            TextInputLayout.this.f2950l0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C0748c implements Runnable {
        public C0748c() {
        }

        public void run() {
            TextInputLayout.this.f2943i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C0749d implements ValueAnimator.AnimatorUpdateListener {
        public C0749d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f2913K0.mo4204o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C0750e extends C1043a {

        /* renamed from: d */
        public final TextInputLayout f2983d;

        public C0750e(TextInputLayout textInputLayout) {
            this.f2983d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
            if (r3 != null) goto L_0x0088;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1508d(android.view.View r14, p064k0.C1150b r15) {
            /*
                r13 = this;
                android.view.View$AccessibilityDelegate r0 = r13.f3779a
                android.view.accessibility.AccessibilityNodeInfo r1 = r15.f4005a
                r0.onInitializeAccessibilityNodeInfo(r14, r1)
                com.google.android.material.textfield.TextInputLayout r14 = r13.f2983d
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L_0x0014
                android.text.Editable r0 = r14.getText()
                goto L_0x0015
            L_0x0014:
                r0 = 0
            L_0x0015:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f2983d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f2983d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f2983d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f2983d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f2983d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.f2983d
                boolean r9 = r9.f2911J0
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L_0x0053
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r11 = 0
                goto L_0x0054
            L_0x0053:
                r11 = r7
            L_0x0054:
                if (r8 == 0) goto L_0x005b
                java.lang.String r1 = r1.toString()
                goto L_0x005d
            L_0x005b:
                java.lang.String r1 = ""
            L_0x005d:
                java.lang.String r8 = ", "
                if (r6 == 0) goto L_0x0067
                android.view.accessibility.AccessibilityNodeInfo r3 = r15.f4005a
                r3.setText(r0)
                goto L_0x0091
            L_0x0067:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x008e
                android.view.accessibility.AccessibilityNodeInfo r12 = r15.f4005a
                r12.setText(r1)
                if (r9 == 0) goto L_0x0091
                if (r3 == 0) goto L_0x0091
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
            L_0x0088:
                android.view.accessibility.AccessibilityNodeInfo r9 = r15.f4005a
                r9.setText(r3)
                goto L_0x0091
            L_0x008e:
                if (r3 == 0) goto L_0x0091
                goto L_0x0088
            L_0x0091:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00c8
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L_0x00a1
                r15.mo4770k(r1)
                goto L_0x00ba
            L_0x00a1:
                if (r6 == 0) goto L_0x00b5
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r0)
                r12.append(r8)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
            L_0x00b5:
                android.view.accessibility.AccessibilityNodeInfo r8 = r15.f4005a
                r8.setText(r1)
            L_0x00ba:
                r1 = r6 ^ 1
                if (r3 < r9) goto L_0x00c4
                android.view.accessibility.AccessibilityNodeInfo r3 = r15.f4005a
                r3.setShowingHintText(r1)
                goto L_0x00c8
            L_0x00c4:
                r3 = 4
                r15.mo4766h(r3, r1)
            L_0x00c8:
                if (r0 == 0) goto L_0x00d1
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00d1
                goto L_0x00d2
            L_0x00d1:
                r4 = -1
            L_0x00d2:
                android.view.accessibility.AccessibilityNodeInfo r0 = r15.f4005a
                r0.setMaxTextLength(r4)
                if (r11 == 0) goto L_0x00e2
                if (r10 == 0) goto L_0x00dc
                goto L_0x00dd
            L_0x00dc:
                r2 = r5
            L_0x00dd:
                android.view.accessibility.AccessibilityNodeInfo r15 = r15.f4005a
                r15.setError(r2)
            L_0x00e2:
                if (r14 == 0) goto L_0x00ea
                r15 = 2131296745(0x7f0901e9, float:1.8211415E38)
                r14.setLabelFor(r15)
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C0750e.mo1508d(android.view.View, k0.b):void");
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C0751f {
        /* renamed from: a */
        void mo3956a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C0752g {
        /* renamed from: a */
        void mo3957a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C0753h extends C1491a {
        public static final Parcelable.Creator<C0753h> CREATOR = new C0754a();

        /* renamed from: g */
        public CharSequence f2984g;

        /* renamed from: h */
        public boolean f2985h;

        /* renamed from: i */
        public CharSequence f2986i;

        /* renamed from: j */
        public CharSequence f2987j;

        /* renamed from: k */
        public CharSequence f2988k;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class C0754a implements Parcelable.ClassLoaderCreator<C0753h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0753h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0753h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0753h(parcel, classLoader);
            }
        }

        public C0753h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2984g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2985h = parcel.readInt() != 1 ? false : true;
            this.f2986i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2987j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2988k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public C0753h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("TextInputLayout.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" error=");
            a.append(this.f2984g);
            a.append(" hint=");
            a.append(this.f2986i);
            a.append(" helperText=");
            a.append(this.f2987j);
            a.append(" placeholderText=");
            a.append(this.f2988k);
            a.append("}");
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            TextUtils.writeToParcel(this.f2984g, parcel, i);
            parcel.writeInt(this.f2985h ? 1 : 0);
            TextUtils.writeToParcel(this.f2986i, parcel, i);
            TextUtils.writeToParcel(this.f2987j, parcel, i);
            TextUtils.writeToParcel(this.f2988k, parcel, i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0597  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            r30 = this;
            r0 = r30
            r7 = r32
            r8 = 2131952255(0x7f13027f, float:1.9540948E38)
            r9 = 2130903957(0x7f030395, float:1.7414747E38)
            r1 = r31
            android.content.Context r1 = p096p2.C1578a.m4424a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            r10 = -1
            r0.f2947k = r10
            r0.f2949l = r10
            o2.l r1 = new o2.l
            r1.<init>(r0)
            r0.f2951m = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2927T = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2928U = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2929V = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2944i0 = r1
            r11 = 0
            r0.f2946j0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f2948k0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2952m0 = r1
            f2.c r1 = new f2.c
            r1.<init>(r0)
            r0.f2913K0 = r1
            android.content.Context r13 = r30.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.f2935e = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.f2937f = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r6 = -2
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f2939g = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.f2941h = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = p089o1.C1494a.f4652a
            r1.f3363I = r2
            r1.mo4201k()
            r1.f3362H = r2
            r1.mo4201k()
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo4203n(r2)
            int[] r3 = p083n1.C1455a.f4561C
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {20, 18, 33, 38, 42} // fill-array
            p036f2.C0903k.m2659a(r13, r7, r9, r8)
            r16 = 2131952255(0x7f13027f, float:1.9540948E38)
            r17 = 2130903957(0x7f030395, float:1.7414747E38)
            r18 = r1
            r1 = r13
            r2 = r32
            r31 = r3
            r19 = r4
            r4 = r17
            r20 = r5
            r5 = r16
            r6 = r18
            p036f2.C0903k.m2660b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.b1 r1 = new androidx.appcompat.widget.b1
            r2 = r31
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r7, r2, r9, r8)
            r1.<init>(r13, r2)
            r3 = 41
            boolean r3 = r1.mo761a(r3, r14)
            r0.f2900E = r3
            r3 = 4
            java.lang.CharSequence r3 = r1.mo774n(r3)
            r0.setHint((java.lang.CharSequence) r3)
            r3 = 40
            boolean r3 = r1.mo761a(r3, r14)
            r0.f2917M0 = r3
            r3 = 35
            boolean r3 = r1.mo761a(r3, r14)
            r0.f2915L0 = r3
            r3 = 3
            boolean r4 = r1.mo775o(r3)
            if (r4 == 0) goto L_0x011e
            int r4 = r1.mo766f(r3, r10)
            r0.setMinWidth(r4)
        L_0x011e:
            r4 = 2
            boolean r5 = r1.mo775o(r4)
            if (r5 == 0) goto L_0x012c
            int r5 = r1.mo766f(r4, r10)
            r0.setMaxWidth(r5)
        L_0x012c:
            l2.i$b r5 = p072l2.C1247i.m3551b(r13, r7, r9, r8)
            l2.i r5 = r5.mo4991a()
            r0.f2910J = r5
            android.content.res.Resources r5 = r13.getResources()
            r6 = 2131100031(0x7f06017f, float:1.7812432E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            r0.f2912K = r5
            r5 = 7
            int r5 = r1.mo765e(r5, r11)
            r0.f2918N = r5
            r5 = 14
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131100032(0x7f060180, float:1.7812434E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r1.mo766f(r5, r6)
            r0.f2922P = r5
            r5 = 15
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131100033(0x7f060181, float:1.7812436E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r1.mo766f(r5, r6)
            r0.f2924Q = r5
            int r5 = r0.f2922P
            r0.f2920O = r5
            r5 = 11
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.mo764d(r5, r6)
            r7 = 10
            float r7 = r1.mo764d(r7, r6)
            r8 = 8
            float r9 = r1.mo764d(r8, r6)
            r3 = 9
            float r3 = r1.mo764d(r3, r6)
            l2.i r6 = r0.f2910J
            java.util.Objects.requireNonNull(r6)
            l2.i$b r8 = new l2.i$b
            r8.<init>(r6)
            r6 = 0
            int r16 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r16 < 0) goto L_0x01a0
            r8.mo4995f(r5)
        L_0x01a0:
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x01a7
            r8.mo4996g(r7)
        L_0x01a7:
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x01ae
            r8.mo4994e(r9)
        L_0x01ae:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x01b5
            r8.mo4993d(r3)
        L_0x01b5:
            l2.i r3 = r8.mo4991a()
            r0.f2910J = r3
            r3 = 5
            android.content.res.ColorStateList r3 = p054i2.C1030c.m2957b(r13, r1, r3)
            if (r3 == 0) goto L_0x0217
            int r5 = r3.getDefaultColor()
            r0.f2901E0 = r5
            r0.f2926S = r5
            boolean r5 = r3.isStateful()
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01f2
            int[] r5 = new int[r14]
            r5[r11] = r6
            int r5 = r3.getColorForState(r5, r10)
            r0.f2903F0 = r5
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.f2905G0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            goto L_0x0214
        L_0x01f2:
            int r3 = r0.f2901E0
            r0.f2905G0 = r3
            r3 = 2131034283(0x7f0500ab, float:1.767908E38)
            java.lang.ThreadLocal<android.util.TypedValue> r5 = p051i.C1021a.f3740a
            android.content.res.ColorStateList r3 = r13.getColorStateList(r3)
            int[] r5 = new int[r14]
            r5[r11] = r6
            int r5 = r3.getColorForState(r5, r10)
            r0.f2903F0 = r5
            int[] r5 = new int[r14]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r11] = r6
            int r3 = r3.getColorForState(r5, r10)
        L_0x0214:
            r0.f2907H0 = r3
            goto L_0x0221
        L_0x0217:
            r0.f2926S = r11
            r0.f2901E0 = r11
            r0.f2903F0 = r11
            r0.f2905G0 = r11
            r0.f2907H0 = r11
        L_0x0221:
            boolean r3 = r1.mo775o(r14)
            if (r3 == 0) goto L_0x022f
            android.content.res.ColorStateList r3 = r1.mo763c(r14)
            r0.f2978z0 = r3
            r0.f2976y0 = r3
        L_0x022f:
            r3 = 12
            android.content.res.ColorStateList r5 = p054i2.C1030c.m2957b(r13, r1, r3)
            int r3 = r1.mo762b(r3, r11)
            r0.f2897C0 = r3
            r3 = 2131034306(0x7f0500c2, float:1.7679126E38)
            java.lang.Object r6 = p001a0.C0002a.f0a
            int r3 = p001a0.C0002a.C0005c.m7a(r13, r3)
            r0.f2893A0 = r3
            r3 = 2131034307(0x7f0500c3, float:1.7679128E38)
            int r3 = p001a0.C0002a.C0005c.m7a(r13, r3)
            r0.f2909I0 = r3
            r3 = 2131034310(0x7f0500c6, float:1.7679134E38)
            int r3 = p001a0.C0002a.C0005c.m7a(r13, r3)
            r0.f2895B0 = r3
            if (r5 == 0) goto L_0x025d
            r0.setBoxStrokeColorStateList(r5)
        L_0x025d:
            r3 = 13
            boolean r5 = r1.mo775o(r3)
            if (r5 == 0) goto L_0x026c
            android.content.res.ColorStateList r3 = p054i2.C1030c.m2957b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x026c:
            r3 = 42
            int r5 = r1.mo772l(r3, r10)
            if (r5 == r10) goto L_0x027b
            int r3 = r1.mo772l(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x027b:
            r3 = 33
            int r3 = r1.mo772l(r3, r11)
            r5 = 28
            java.lang.CharSequence r5 = r1.mo774n(r5)
            r6 = 29
            boolean r6 = r1.mo761a(r6, r11)
            android.content.Context r7 = r30.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r8 = 2131492911(0x7f0c002f, float:1.8609287E38)
            r9 = r20
            android.view.View r7 = r7.inflate(r8, r9, r11)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.f2972w0 = r7
            r8 = 2131296741(0x7f0901e5, float:1.8211407E38)
            r7.setId(r8)
            r8 = 8
            r7.setVisibility(r8)
            boolean r8 = p054i2.C1030c.m2959d(r13)
            if (r8 == 0) goto L_0x02bc
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            r8.setMarginStart(r11)
        L_0x02bc:
            r8 = 30
            boolean r17 = r1.mo775o(r8)
            if (r17 == 0) goto L_0x02cb
            android.graphics.drawable.Drawable r8 = r1.mo767g(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x02cb:
            r8 = 31
            boolean r17 = r1.mo775o(r8)
            if (r17 == 0) goto L_0x02da
            android.content.res.ColorStateList r8 = p054i2.C1030c.m2957b(r13, r1, r8)
            r0.setErrorIconTintList(r8)
        L_0x02da:
            r8 = 32
            boolean r17 = r1.mo775o(r8)
            r14 = 0
            if (r17 == 0) goto L_0x02ee
            int r8 = r1.mo770j(r8, r10)
            android.graphics.PorterDuff$Mode r8 = p036f2.C0906n.m2665b(r8, r14)
            r0.setErrorIconTintMode(r8)
        L_0x02ee:
            android.content.res.Resources r8 = r30.getResources()
            r14 = 2131886138(0x7f12003a, float:1.9406846E38)
            java.lang.CharSequence r8 = r8.getText(r14)
            r7.setContentDescription(r8)
            java.util.WeakHashMap<android.view.View, j0.q> r8 = p058j0.C1061o.f3808a
            r7.setImportantForAccessibility(r4)
            r7.setClickable(r11)
            r7.setPressable(r11)
            r7.setFocusable(r11)
            r8 = 38
            int r8 = r1.mo772l(r8, r11)
            r14 = 37
            boolean r14 = r1.mo761a(r14, r11)
            r4 = 36
            java.lang.CharSequence r4 = r1.mo774n(r4)
            r10 = 50
            int r10 = r1.mo772l(r10, r11)
            r11 = 49
            java.lang.CharSequence r11 = r1.mo774n(r11)
            r21 = r2
            r2 = 53
            r22 = r10
            r10 = 0
            int r2 = r1.mo772l(r2, r10)
            r10 = 52
            java.lang.CharSequence r10 = r1.mo774n(r10)
            r23 = r2
            r2 = 63
            r24 = r10
            r10 = 0
            int r2 = r1.mo772l(r2, r10)
            r10 = 62
            java.lang.CharSequence r10 = r1.mo774n(r10)
            r25 = r2
            r2 = 16
            r26 = r10
            r10 = 0
            boolean r2 = r1.mo761a(r2, r10)
            r10 = 17
            r27 = r2
            r2 = -1
            int r10 = r1.mo770j(r10, r2)
            r0.setCounterMaxLength(r10)
            r2 = 20
            r10 = 0
            int r2 = r1.mo772l(r2, r10)
            r0.f2963s = r2
            r2 = 18
            int r2 = r1.mo772l(r2, r10)
            r0.f2961r = r2
            android.content.Context r2 = r30.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r28 = r11
            r11 = 2131492912(0x7f0c0030, float:1.860929E38)
            android.view.View r2 = r2.inflate(r11, r15, r10)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f2931a0 = r2
            r11 = 8
            r2.setVisibility(r11)
            boolean r11 = p054i2.C1030c.m2959d(r13)
            if (r11 == 0) goto L_0x039b
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            r11.setMarginEnd(r10)
        L_0x039b:
            r10 = 0
            r0.setStartIconOnClickListener(r10)
            r0.setStartIconOnLongClickListener(r10)
            r10 = 59
            boolean r11 = r1.mo775o(r10)
            if (r11 == 0) goto L_0x03ca
            android.graphics.drawable.Drawable r10 = r1.mo767g(r10)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r10)
            r10 = 58
            boolean r11 = r1.mo775o(r10)
            if (r11 == 0) goto L_0x03c0
            java.lang.CharSequence r10 = r1.mo774n(r10)
            r0.setStartIconContentDescription((java.lang.CharSequence) r10)
        L_0x03c0:
            r10 = 57
            r11 = 1
            boolean r10 = r1.mo761a(r10, r11)
            r0.setStartIconCheckable(r10)
        L_0x03ca:
            r10 = 60
            boolean r11 = r1.mo775o(r10)
            if (r11 == 0) goto L_0x03d9
            android.content.res.ColorStateList r10 = p054i2.C1030c.m2957b(r13, r1, r10)
            r0.setStartIconTintList(r10)
        L_0x03d9:
            r10 = 61
            boolean r11 = r1.mo775o(r10)
            if (r11 == 0) goto L_0x03ee
            r11 = -1
            int r10 = r1.mo770j(r10, r11)
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = p036f2.C0906n.m2665b(r10, r11)
            r0.setStartIconTintMode(r10)
        L_0x03ee:
            r10 = 6
            r11 = 0
            int r10 = r1.mo770j(r10, r11)
            r0.setBoxBackgroundMode(r10)
            android.content.Context r10 = r30.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r16 = r3
            r29 = r5
            r5 = r19
            r3 = 2131492911(0x7f0c002f, float:1.8609287E38)
            android.view.View r3 = r10.inflate(r3, r5, r11)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f2950l0 = r3
            r5.addView(r3)
            r10 = 8
            r3.setVisibility(r10)
            boolean r10 = p054i2.C1030c.m2959d(r13)
            if (r10 == 0) goto L_0x0427
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.setMarginStart(r11)
        L_0x0427:
            o2.e r3 = new o2.e
            r3.<init>(r0)
            r10 = -1
            r12.append(r10, r3)
            o2.o r3 = new o2.o
            r3.<init>(r0)
            r12.append(r11, r3)
            com.google.android.material.textfield.c r3 = new com.google.android.material.textfield.c
            r3.<init>(r0)
            r10 = 1
            r12.append(r10, r3)
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0)
            r10 = 2
            r12.append(r10, r3)
            com.google.android.material.textfield.b r3 = new com.google.android.material.textfield.b
            r3.<init>(r0)
            r10 = 3
            r12.append(r10, r3)
            r3 = 25
            boolean r10 = r1.mo775o(r3)
            r11 = 46
            if (r10 == 0) goto L_0x048e
            r10 = 0
            int r3 = r1.mo770j(r3, r10)
            r0.setEndIconMode(r3)
            r3 = 24
            boolean r10 = r1.mo775o(r3)
            if (r10 == 0) goto L_0x0474
            android.graphics.drawable.Drawable r3 = r1.mo767g(r3)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r3)
        L_0x0474:
            r3 = 23
            boolean r10 = r1.mo775o(r3)
            if (r10 == 0) goto L_0x0483
            java.lang.CharSequence r3 = r1.mo774n(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x0483:
            r3 = 22
            r10 = 1
            boolean r3 = r1.mo761a(r3, r10)
            r0.setEndIconCheckable(r3)
            goto L_0x04d2
        L_0x048e:
            boolean r3 = r1.mo775o(r11)
            if (r3 == 0) goto L_0x04d2
            r3 = 0
            boolean r10 = r1.mo761a(r11, r3)
            r0.setEndIconMode(r10)
            r3 = 45
            android.graphics.drawable.Drawable r3 = r1.mo767g(r3)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r3)
            r3 = 44
            java.lang.CharSequence r3 = r1.mo774n(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
            r3 = 47
            boolean r10 = r1.mo775o(r3)
            if (r10 == 0) goto L_0x04bd
            android.content.res.ColorStateList r3 = p054i2.C1030c.m2957b(r13, r1, r3)
            r0.setEndIconTintList(r3)
        L_0x04bd:
            r3 = 48
            boolean r10 = r1.mo775o(r3)
            if (r10 == 0) goto L_0x04d2
            r10 = -1
            int r3 = r1.mo770j(r3, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r3 = p036f2.C0906n.m2665b(r3, r10)
            r0.setEndIconTintMode(r3)
        L_0x04d2:
            boolean r3 = r1.mo775o(r11)
            r10 = 26
            if (r3 != 0) goto L_0x04fd
            boolean r3 = r1.mo775o(r10)
            if (r3 == 0) goto L_0x04e7
            android.content.res.ColorStateList r3 = p054i2.C1030c.m2957b(r13, r1, r10)
            r0.setEndIconTintList(r3)
        L_0x04e7:
            r3 = 27
            boolean r11 = r1.mo775o(r3)
            if (r11 == 0) goto L_0x04fd
            r11 = -1
            int r3 = r1.mo770j(r3, r11)
            r11 = 0
            android.graphics.PorterDuff$Mode r3 = p036f2.C0906n.m2665b(r3, r11)
            r0.setEndIconTintMode(r3)
            goto L_0x04fe
        L_0x04fd:
            r11 = 0
        L_0x04fe:
            androidx.appcompat.widget.d0 r3 = new androidx.appcompat.widget.d0
            r3.<init>(r13, r11)
            r0.f2894B = r3
            r12 = 2131296747(0x7f0901eb, float:1.821142E38)
            r3.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r12.<init>(r10, r10)
            r3.setLayoutParams(r12)
            r12 = 1
            r3.setAccessibilityLiveRegion(r12)
            r15.addView(r2)
            r15.addView(r3)
            androidx.appcompat.widget.d0 r2 = new androidx.appcompat.widget.d0
            r2.<init>(r13, r11)
            r0.f2898D = r2
            r3 = 2131296748(0x7f0901ec, float:1.8211421E38)
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r11 = 80
            r3.<init>(r10, r10, r11)
            r2.setLayoutParams(r3)
            r3 = 1
            r2.setAccessibilityLiveRegion(r3)
            r9.addView(r2)
            r9.addView(r7)
            r9.addView(r5)
            r0.setHelperTextEnabled(r14)
            r0.setHelperText(r4)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorEnabled(r6)
            r2 = r16
            r0.setErrorTextAppearance(r2)
            r2 = r29
            r0.setErrorContentDescription(r2)
            int r2 = r0.f2963s
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f2961r
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r28
            r0.setPlaceholderText(r2)
            r2 = r22
            r0.setPlaceholderTextAppearance(r2)
            r2 = r24
            r0.setPrefixText(r2)
            r2 = r23
            r0.setPrefixTextAppearance(r2)
            r2 = r26
            r0.setSuffixText(r2)
            r2 = r25
            r0.setSuffixTextAppearance(r2)
            r2 = 34
            boolean r3 = r1.mo775o(r2)
            if (r3 == 0) goto L_0x058f
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setErrorTextColor(r2)
        L_0x058f:
            r2 = 39
            boolean r3 = r1.mo775o(r2)
            if (r3 == 0) goto L_0x059e
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setHelperTextColor(r2)
        L_0x059e:
            r2 = 43
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x05af
            r2 = 43
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setHintTextColor(r2)
        L_0x05af:
            r2 = 21
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x05c0
            r2 = 21
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setCounterTextColor(r2)
        L_0x05c0:
            r2 = 19
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x05d1
            r2 = 19
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05d1:
            r2 = 51
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x05e2
            r2 = 51
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05e2:
            r2 = 54
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x05f3
            r2 = 54
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05f3:
            r2 = 64
            boolean r2 = r1.mo775o(r2)
            if (r2 == 0) goto L_0x0604
            r2 = 64
            android.content.res.ColorStateList r2 = r1.mo763c(r2)
            r0.setSuffixTextColor(r2)
        L_0x0604:
            r2 = r27
            r0.setCounterEnabled(r2)
            r2 = 1
            r3 = 0
            boolean r1 = r1.mo761a(r3, r2)
            r0.setEnabled(r1)
            r21.recycle()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0624
            if (r1 < r3) goto L_0x0624
            r0.setImportantForAutofill(r2)
        L_0x0624:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1514k getEndIconDelegate() {
        C1514k kVar = this.f2948k0.get(this.f2946j0);
        return kVar != null ? kVar : this.f2948k0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f2972w0.getVisibility() == 0) {
            return this.f2972w0;
        }
        if (!mo3846j() || !mo3847k()) {
            return null;
        }
        return this.f2950l0;
    }

    /* renamed from: n */
    public static void m2296n(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m2296n((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: q */
    public static void m2297q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    private void setEditText(EditText editText) {
        if (this.f2943i == null) {
            if (this.f2946j0 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f2943i = editText;
            setMinWidth(this.f2947k);
            setMaxWidth(this.f2949l);
            mo3848l();
            setTextInputAccessibilityDelegate(new C0750e(this));
            this.f2913K0.mo4206q(this.f2943i.getTypeface());
            C0891c cVar = this.f2913K0;
            float textSize = this.f2943i.getTextSize();
            if (cVar.f3382j != textSize) {
                cVar.f3382j = textSize;
                cVar.mo4201k();
            }
            int gravity = this.f2943i.getGravity();
            this.f2913K0.mo4203n((gravity & -113) | 48);
            C0891c cVar2 = this.f2913K0;
            if (cVar2.f3380h != gravity) {
                cVar2.f3380h = gravity;
                cVar2.mo4201k();
            }
            this.f2943i.addTextChangedListener(new C0746a());
            if (this.f2976y0 == null) {
                this.f2976y0 = this.f2943i.getHintTextColors();
            }
            if (this.f2900E) {
                if (TextUtils.isEmpty(this.f2902F)) {
                    CharSequence hint = this.f2943i.getHint();
                    this.f2945j = hint;
                    setHint(hint);
                    this.f2943i.setHint((CharSequence) null);
                }
                this.f2904G = true;
            }
            if (this.f2959q != null) {
                mo3943t(this.f2943i.getText().length());
            }
            mo3946w();
            this.f2951m.mo5431b();
            this.f2937f.bringToFront();
            this.f2939g.bringToFront();
            this.f2941h.bringToFront();
            this.f2972w0.bringToFront();
            Iterator it = this.f2944i0.iterator();
            while (it.hasNext()) {
                ((C0751f) it.next()).mo3956a(this);
            }
            mo3777A();
            mo3780D();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo3948y(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f2972w0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f2941h;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        mo3780D();
        if (!mo3846j()) {
            mo3945v();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f2902F)) {
            this.f2902F = charSequence;
            C0891c cVar = this.f2913K0;
            if (charSequence == null || !TextUtils.equals(cVar.f3396x, charSequence)) {
                cVar.f3396x = charSequence;
                cVar.f3397y = null;
                Bitmap bitmap = cVar.f3355A;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.f3355A = null;
                }
                cVar.mo4201k();
            }
            if (!this.f2911J0) {
                mo3849m();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f2967u != z) {
            if (z) {
                C0148d0 d0Var = new C0148d0(getContext(), (AttributeSet) null);
                this.f2969v = d0Var;
                d0Var.setId(R.id.textinput_placeholder);
                TextView textView = this.f2969v;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                textView.setAccessibilityLiveRegion(1);
                setPlaceholderTextAppearance(this.f2973x);
                setPlaceholderTextColor(this.f2971w);
                TextView textView2 = this.f2969v;
                if (textView2 != null) {
                    this.f2935e.addView(textView2);
                    this.f2969v.setVisibility(0);
                }
            } else {
                TextView textView3 = this.f2969v;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                this.f2969v = null;
            }
            this.f2967u = z;
        }
    }

    /* renamed from: A */
    public final void mo3777A() {
        if (this.f2943i != null) {
            int i = 0;
            if (!(this.f2931a0.getVisibility() == 0)) {
                EditText editText = this.f2943i;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                i = editText.getPaddingStart();
            }
            TextView textView = this.f2894B;
            int compoundPaddingTop = this.f2943i.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.f2943i.getCompoundPaddingBottom();
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            textView.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    /* renamed from: B */
    public final void mo3778B() {
        this.f2894B.setVisibility((this.f2892A == null || this.f2911J0) ? 8 : 0);
        mo3945v();
    }

    /* renamed from: C */
    public final void mo3779C(boolean z, boolean z2) {
        int defaultColor = this.f2899D0.getDefaultColor();
        int colorForState = this.f2899D0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f2899D0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f2925R = colorForState2;
        } else if (z2) {
            this.f2925R = colorForState;
        } else {
            this.f2925R = defaultColor;
        }
    }

    /* renamed from: D */
    public final void mo3780D() {
        if (this.f2943i != null) {
            int i = 0;
            if (!mo3847k()) {
                if (!(this.f2972w0.getVisibility() == 0)) {
                    EditText editText = this.f2943i;
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    i = editText.getPaddingEnd();
                }
            }
            TextView textView = this.f2898D;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f2943i.getPaddingTop();
            int paddingBottom = this.f2943i.getPaddingBottom();
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            textView.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    /* renamed from: E */
    public final void mo3781E() {
        int visibility = this.f2898D.getVisibility();
        int i = 0;
        boolean z = this.f2896C != null && !this.f2911J0;
        TextView textView = this.f2898D;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f2898D.getVisibility()) {
            getEndIconDelegate().mo3963c(z);
        }
        mo3945v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f2943i;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3782F() {
        /*
            r6 = this;
            l2.f r0 = r6.f2906H
            if (r0 == 0) goto L_0x0123
            int r0 = r6.f2916M
            if (r0 != 0) goto L_0x000a
            goto L_0x0123
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f2943i
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f2943i
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003d
            int r4 = r6.f2909I0
            goto L_0x0072
        L_0x003d:
            o2.l r4 = r6.f2951m
            boolean r4 = r4.mo5434e()
            if (r4 == 0) goto L_0x0051
            android.content.res.ColorStateList r4 = r6.f2899D0
            if (r4 == 0) goto L_0x004a
            goto L_0x005d
        L_0x004a:
            o2.l r4 = r6.f2951m
            int r4 = r4.mo5436g()
            goto L_0x0072
        L_0x0051:
            boolean r4 = r6.f2957p
            if (r4 == 0) goto L_0x0066
            android.widget.TextView r4 = r6.f2959q
            if (r4 == 0) goto L_0x0066
            android.content.res.ColorStateList r5 = r6.f2899D0
            if (r5 == 0) goto L_0x0061
        L_0x005d:
            r6.mo3779C(r0, r3)
            goto L_0x0074
        L_0x0061:
            int r4 = r4.getCurrentTextColor()
            goto L_0x0072
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            int r4 = r6.f2897C0
            goto L_0x0072
        L_0x006b:
            if (r3 == 0) goto L_0x0070
            int r4 = r6.f2895B0
            goto L_0x0072
        L_0x0070:
            int r4 = r6.f2893A0
        L_0x0072:
            r6.f2925R = r4
        L_0x0074:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0087
            o2.l r4 = r6.f2951m
            boolean r5 = r4.f4696k
            if (r5 == 0) goto L_0x0087
            boolean r4 = r4.mo5434e()
            if (r4 == 0) goto L_0x0087
            r1 = r2
        L_0x0087:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f2972w0
            android.content.res.ColorStateList r4 = r6.f2974x0
            r6.mo3855p(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f2931a0
            android.content.res.ColorStateList r4 = r6.f2932b0
            r6.mo3855p(r1, r4)
            r6.mo3850o()
            o2.k r1 = r6.getEndIconDelegate()
            java.util.Objects.requireNonNull(r1)
            boolean r1 = r1 instanceof com.google.android.material.textfield.C0762b
            if (r1 == 0) goto L_0x00ce
            o2.l r1 = r6.f2951m
            boolean r1 = r1.mo5434e()
            if (r1 == 0) goto L_0x00cb
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            if (r1 == 0) goto L_0x00cb
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            o2.l r4 = r6.f2951m
            int r4 = r4.mo5436g()
            r1.setTint(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.f2950l0
            r4.setImageDrawable(r1)
            goto L_0x00ce
        L_0x00cb:
            r6.mo3787d()
        L_0x00ce:
            if (r0 == 0) goto L_0x00d9
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00d9
            int r1 = r6.f2924Q
            goto L_0x00db
        L_0x00d9:
            int r1 = r6.f2922P
        L_0x00db:
            r6.f2920O = r1
            int r1 = r6.f2916M
            r4 = 2
            if (r1 != r4) goto L_0x0103
            boolean r1 = r6.mo3794g()
            if (r1 == 0) goto L_0x0103
            boolean r1 = r6.f2911J0
            if (r1 != 0) goto L_0x0103
            int r1 = r6.f2914L
            int r4 = r6.f2920O
            if (r1 == r4) goto L_0x0103
            boolean r1 = r6.mo3794g()
            if (r1 == 0) goto L_0x0100
            l2.f r1 = r6.f2906H
            o2.f r1 = (p090o2.C1509f) r1
            r4 = 0
            r1.mo5425x(r4, r4, r4, r4)
        L_0x0100:
            r6.mo3849m()
        L_0x0103:
            int r1 = r6.f2916M
            if (r1 != r2) goto L_0x0120
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x0110
            int r0 = r6.f2903F0
            goto L_0x011e
        L_0x0110:
            if (r3 == 0) goto L_0x0117
            if (r0 != 0) goto L_0x0117
            int r0 = r6.f2907H0
            goto L_0x011e
        L_0x0117:
            if (r0 == 0) goto L_0x011c
            int r0 = r6.f2905G0
            goto L_0x011e
        L_0x011c:
            int r0 = r6.f2901E0
        L_0x011e:
            r6.f2926S = r0
        L_0x0120:
            r6.mo3786c()
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo3782F():void");
    }

    /* renamed from: a */
    public void mo3783a(C0751f fVar) {
        this.f2944i0.add(fVar);
        if (this.f2943i != null) {
            fVar.mo3956a(this);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f2935e.addView(view, layoutParams2);
            this.f2935e.setLayoutParams(layoutParams);
            mo3947x();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo3785b(float f) {
        if (this.f2913K0.f3375c != f) {
            if (this.f2919N0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f2919N0 = valueAnimator;
                valueAnimator.setInterpolator(C1494a.f4653b);
                this.f2919N0.setDuration(167);
                this.f2919N0.addUpdateListener(new C0749d());
            }
            this.f2919N0.setFloatValues(new float[]{this.f2913K0.f3375c, f});
            this.f2919N0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3786c() {
        /*
            r6 = this;
            l2.f r0 = r6.f2906H
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            l2.i r1 = r6.f2910J
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.f2916M
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.f2920O
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.f2925R
            if (r0 == 0) goto L_0x001c
            r0 = r4
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r0 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            l2.f r0 = r6.f2906H
            int r1 = r6.f2920O
            float r1 = (float) r1
            int r5 = r6.f2925R
            r0.mo4978r(r1, r5)
        L_0x002e:
            int r0 = r6.f2926S
            int r1 = r6.f2916M
            if (r1 != r4) goto L_0x0045
            r0 = 2130903273(0x7f0300e9, float:1.741336E38)
            android.content.Context r1 = r6.getContext()
            int r0 = p136w0.C2036r.m5364b(r1, r0, r3)
            int r1 = r6.f2926S
            int r0 = p016c0.C0557a.m1817a(r1, r0)
        L_0x0045:
            r6.f2926S = r0
            l2.f r1 = r6.f2906H
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.mo4976p(r0)
            int r0 = r6.f2946j0
            r1 = 3
            if (r0 != r1) goto L_0x005e
            android.widget.EditText r0 = r6.f2943i
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005e:
            l2.f r0 = r6.f2908I
            if (r0 != 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            int r1 = r6.f2920O
            if (r1 <= r2) goto L_0x006c
            int r1 = r6.f2925R
            if (r1 == 0) goto L_0x006c
            r3 = r4
        L_0x006c:
            if (r3 == 0) goto L_0x0077
            int r1 = r6.f2925R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mo4976p(r1)
        L_0x0077:
            r6.invalidate()
        L_0x007a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo3786c():void");
    }

    /* renamed from: d */
    public final void mo3787d() {
        mo3792e(this.f2950l0, this.f2956o0, this.f2954n0, this.f2960q0, this.f2958p0);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2943i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2945j != null) {
            boolean z = this.f2904G;
            this.f2904G = false;
            CharSequence hint = editText.getHint();
            this.f2943i.setHint(this.f2945j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f2943i.setHint(hint);
                this.f2904G = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f2935e.getChildCount());
            for (int i2 = 0; i2 < this.f2935e.getChildCount(); i2++) {
                View childAt = this.f2935e.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f2943i) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f2923P0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2923P0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2900E) {
            C0891c cVar = this.f2913K0;
            Objects.requireNonNull(cVar);
            int save = canvas.save();
            if (cVar.f3397y != null && cVar.f3374b) {
                cVar.f3369O.getLineLeft(0);
                cVar.f3360F.setTextSize(cVar.f3357C);
                float f = cVar.f3390r;
                float f2 = cVar.f3391s;
                float f3 = cVar.f3356B;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                cVar.f3369O.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        C1242f fVar = this.f2908I;
        if (fVar != null) {
            Rect bounds = fVar.getBounds();
            bounds.top = bounds.bottom - this.f2920O;
            this.f2908I.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f3384l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f2921O0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.f2921O0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            f2.c r2 = r4.f2913K0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.f3358D = r1
            android.content.res.ColorStateList r1 = r2.f3385m
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f3384l
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.mo4201k()
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            android.widget.EditText r2 = r4.f2943i
            if (r2 == 0) goto L_0x004f
            java.util.WeakHashMap<android.view.View, j0.q> r2 = p058j0.C1061o.f3808a
            boolean r2 = r4.isLaidOut()
            if (r2 == 0) goto L_0x004b
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r3
        L_0x004c:
            r4.mo3948y(r0, r3)
        L_0x004f:
            r4.mo3946w()
            r4.mo3782F()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.f2921O0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final void mo3792e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: f */
    public final int mo3793f() {
        float f;
        if (!this.f2900E) {
            return 0;
        }
        int i = this.f2916M;
        if (i == 0 || i == 1) {
            f = this.f2913K0.mo4197f();
        } else if (i != 2) {
            return 0;
        } else {
            f = this.f2913K0.mo4197f() / 2.0f;
        }
        return (int) f;
    }

    /* renamed from: g */
    public final boolean mo3794g() {
        return this.f2900E && !TextUtils.isEmpty(this.f2902F) && (this.f2906H instanceof C1509f);
    }

    public int getBaseline() {
        EditText editText = this.f2943i;
        if (editText == null) {
            return super.getBaseline();
        }
        return mo3793f() + getPaddingTop() + editText.getBaseline();
    }

    public C1242f getBoxBackground() {
        int i = this.f2916M;
        if (i == 1 || i == 2) {
            return this.f2906H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2926S;
    }

    public int getBoxBackgroundMode() {
        return this.f2916M;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C1242f fVar = this.f2906H;
        return fVar.f4164e.f4187a.f4217h.mo4949a(fVar.mo4965h());
    }

    public float getBoxCornerRadiusBottomStart() {
        C1242f fVar = this.f2906H;
        return fVar.f4164e.f4187a.f4216g.mo4949a(fVar.mo4965h());
    }

    public float getBoxCornerRadiusTopEnd() {
        C1242f fVar = this.f2906H;
        return fVar.f4164e.f4187a.f4215f.mo4949a(fVar.mo4965h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f2906H.mo4970l();
    }

    public int getBoxStrokeColor() {
        return this.f2897C0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2899D0;
    }

    public int getBoxStrokeWidth() {
        return this.f2922P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2924Q;
    }

    public int getCounterMaxLength() {
        return this.f2955o;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f2953n || !this.f2957p || (textView = this.f2959q) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2975y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2975y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2976y0;
    }

    public EditText getEditText() {
        return this.f2943i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2950l0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2950l0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f2946j0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2950l0;
    }

    public CharSequence getError() {
        C1515l lVar = this.f2951m;
        if (lVar.f4696k) {
            return lVar.f4695j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2951m.f4698m;
    }

    public int getErrorCurrentTextColors() {
        return this.f2951m.mo5436g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f2972w0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f2951m.mo5436g();
    }

    public CharSequence getHelperText() {
        C1515l lVar = this.f2951m;
        if (lVar.f4702q) {
            return lVar.f4701p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f2951m.f4703r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2900E) {
            return this.f2902F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2913K0.mo4197f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f2913K0.mo4198g();
    }

    public ColorStateList getHintTextColor() {
        return this.f2978z0;
    }

    public int getMaxWidth() {
        return this.f2949l;
    }

    public int getMinWidth() {
        return this.f2947k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2950l0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2950l0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2967u) {
            return this.f2965t;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2973x;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2971w;
    }

    public CharSequence getPrefixText() {
        return this.f2892A;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2894B.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2894B;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2931a0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2931a0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f2896C;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2898D.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2898D;
    }

    public Typeface getTypeface() {
        return this.f2930W;
    }

    /* renamed from: h */
    public final int mo3844h(int i, boolean z) {
        int compoundPaddingLeft = this.f2943i.getCompoundPaddingLeft() + i;
        return (this.f2892A == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f2894B.getMeasuredWidth()) + this.f2894B.getPaddingLeft();
    }

    /* renamed from: i */
    public final int mo3845i(int i, boolean z) {
        int compoundPaddingRight = i - this.f2943i.getCompoundPaddingRight();
        return (this.f2892A == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f2894B.getMeasuredWidth() - this.f2894B.getPaddingRight());
    }

    /* renamed from: j */
    public final boolean mo3846j() {
        return this.f2946j0 != 0;
    }

    /* renamed from: k */
    public boolean mo3847k() {
        return this.f2941h.getVisibility() == 0 && this.f2950l0.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3848l() {
        /*
            r6 = this;
            int r0 = r6.f2916M
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 == r2) goto L_0x0040
            r3 = 2
            if (r0 != r3) goto L_0x0027
            boolean r0 = r6.f2900E
            if (r0 == 0) goto L_0x001d
            l2.f r0 = r6.f2906H
            boolean r0 = r0 instanceof p090o2.C1509f
            if (r0 != 0) goto L_0x001d
            o2.f r0 = new o2.f
            l2.i r3 = r6.f2910J
            r0.<init>(r3)
            goto L_0x0024
        L_0x001d:
            l2.f r0 = new l2.f
            l2.i r3 = r6.f2910J
            r0.<init>((p072l2.C1247i) r3)
        L_0x0024:
            r6.f2906H = r0
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r6.f2916M
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0040:
            l2.f r0 = new l2.f
            l2.i r1 = r6.f2910J
            r0.<init>((p072l2.C1247i) r1)
            r6.f2906H = r0
            l2.f r0 = new l2.f
            r0.<init>()
            r6.f2908I = r0
            goto L_0x0055
        L_0x0051:
            r6.f2906H = r1
        L_0x0053:
            r6.f2908I = r1
        L_0x0055:
            android.widget.EditText r0 = r6.f2943i
            if (r0 == 0) goto L_0x0069
            l2.f r1 = r6.f2906H
            if (r1 == 0) goto L_0x0069
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0069
            int r0 = r6.f2916M
            if (r0 == 0) goto L_0x0069
            r0 = r2
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 == 0) goto L_0x0075
            android.widget.EditText r0 = r6.f2943i
            l2.f r1 = r6.f2906H
            java.util.WeakHashMap<android.view.View, j0.q> r3 = p058j0.C1061o.f3808a
            r0.setBackground(r1)
        L_0x0075:
            r6.mo3782F()
            int r0 = r6.f2916M
            if (r0 != r2) goto L_0x00a5
            android.content.Context r0 = r6.getContext()
            boolean r0 = p054i2.C1030c.m2960e(r0)
            if (r0 == 0) goto L_0x008e
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131099837(0x7f0600bd, float:1.7812038E38)
            goto L_0x009f
        L_0x008e:
            android.content.Context r0 = r6.getContext()
            boolean r0 = p054i2.C1030c.m2959d(r0)
            if (r0 == 0) goto L_0x00a5
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131099836(0x7f0600bc, float:1.7812036E38)
        L_0x009f:
            int r0 = r0.getDimensionPixelSize(r1)
            r6.f2918N = r0
        L_0x00a5:
            android.widget.EditText r0 = r6.f2943i
            if (r0 == 0) goto L_0x010a
            int r0 = r6.f2916M
            if (r0 == r2) goto L_0x00ae
            goto L_0x010a
        L_0x00ae:
            android.content.Context r0 = r6.getContext()
            boolean r0 = p054i2.C1030c.m2960e(r0)
            if (r0 == 0) goto L_0x00d9
            android.widget.EditText r0 = r6.f2943i
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            int r1 = r0.getPaddingStart()
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131099835(0x7f0600bb, float:1.7812034E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f2943i
            int r3 = r3.getPaddingEnd()
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131099834(0x7f0600ba, float:1.7812032E38)
            goto L_0x0103
        L_0x00d9:
            android.content.Context r0 = r6.getContext()
            boolean r0 = p054i2.C1030c.m2959d(r0)
            if (r0 == 0) goto L_0x010a
            android.widget.EditText r0 = r6.f2943i
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            int r1 = r0.getPaddingStart()
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131099833(0x7f0600b9, float:1.781203E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f2943i
            int r3 = r3.getPaddingEnd()
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131099832(0x7f0600b8, float:1.7812028E38)
        L_0x0103:
            int r4 = r4.getDimensionPixelSize(r5)
            r0.setPaddingRelative(r1, r2, r3, r4)
        L_0x010a:
            int r0 = r6.f2916M
            if (r0 == 0) goto L_0x0111
            r6.mo3947x()
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo3848l():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3849m() {
        /*
            r12 = this;
            boolean r0 = r12.mo3794g()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.f2929V
            f2.c r1 = r12.f2913K0
            android.widget.EditText r2 = r12.f2943i
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.f2943i
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.f3396x
            boolean r4 = r1.mo4194c(r4)
            r1.f3398z = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 17
            r9 = 5
            if (r3 == r8) goto L_0x004d
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x003b
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003b:
            if (r4 == 0) goto L_0x0043
        L_0x003d:
            android.graphics.Rect r4 = r1.f3378f
            int r4 = r4.left
            float r4 = (float) r4
            goto L_0x0055
        L_0x0043:
            android.graphics.Rect r4 = r1.f3378f
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.mo4193b()
            goto L_0x0054
        L_0x004d:
            float r4 = (float) r2
            float r4 = r4 / r7
            float r10 = r1.mo4193b()
            float r10 = r10 / r7
        L_0x0054:
            float r4 = r4 - r10
        L_0x0055:
            r0.left = r4
            android.graphics.Rect r10 = r1.f3378f
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r8) goto L_0x0081
            r8 = r3 & 7
            if (r8 != r6) goto L_0x0065
            goto L_0x0081
        L_0x0065:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x0073
            r2 = r3 & 5
            if (r2 != r9) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            boolean r2 = r1.f3398z
            if (r2 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0073:
            boolean r2 = r1.f3398z
            if (r2 == 0) goto L_0x007d
        L_0x0077:
            float r2 = r1.mo4193b()
            float r2 = r2 + r4
            goto L_0x0089
        L_0x007d:
            int r2 = r10.right
            float r2 = (float) r2
            goto L_0x0089
        L_0x0081:
            float r2 = (float) r2
            float r2 = r2 / r7
            float r3 = r1.mo4193b()
            float r3 = r3 / r7
            float r2 = r2 + r3
        L_0x0089:
            r0.right = r2
            android.graphics.Rect r2 = r1.f3378f
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.mo4197f()
            float r1 = r1 + r2
            r0.bottom = r1
            float r1 = r0.left
            int r2 = r12.f2912K
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r12.f2920O
            r12.f2914L = r1
            r2 = 0
            r0.top = r2
            float r1 = (float) r1
            r0.bottom = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            r0.offset(r1, r2)
            l2.f r1 = r12.f2906H
            o2.f r1 = (p090o2.C1509f) r1
            java.util.Objects.requireNonNull(r1)
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.mo5425x(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo3849m():void");
    }

    /* renamed from: o */
    public void mo3850o() {
        mo3855p(this.f2950l0, this.f2954n0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.widget.EditText r5 = r4.f2943i
            if (r5 == 0) goto L_0x0181
            android.graphics.Rect r6 = r4.f2927T
            p036f2.C0892d.m2651a(r4, r5, r6)
            l2.f r5 = r4.f2908I
            if (r5 == 0) goto L_0x001d
            int r7 = r6.bottom
            int r8 = r4.f2924Q
            int r8 = r7 - r8
            int r9 = r6.left
            int r0 = r6.right
            r5.setBounds(r9, r8, r0, r7)
        L_0x001d:
            boolean r5 = r4.f2900E
            if (r5 == 0) goto L_0x0181
            f2.c r5 = r4.f2913K0
            android.widget.EditText r7 = r4.f2943i
            float r7 = r7.getTextSize()
            float r8 = r5.f3382j
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0034
            r5.f3382j = r7
            r5.mo4201k()
        L_0x0034:
            android.widget.EditText r5 = r4.f2943i
            int r5 = r5.getGravity()
            f2.c r7 = r4.f2913K0
            r8 = r5 & -113(0xffffffffffffff8f, float:NaN)
            r8 = r8 | 48
            r7.mo4203n(r8)
            f2.c r7 = r4.f2913K0
            int r8 = r7.f3380h
            if (r8 == r5) goto L_0x004e
            r7.f3380h = r5
            r7.mo4201k()
        L_0x004e:
            f2.c r5 = r4.f2913K0
            android.widget.EditText r7 = r4.f2943i
            if (r7 == 0) goto L_0x017b
            android.graphics.Rect r7 = r4.f2928U
            java.util.WeakHashMap<android.view.View, j0.q> r8 = p058j0.C1061o.f3808a
            int r8 = r4.getLayoutDirection()
            r9 = 0
            r0 = 1
            if (r8 != r0) goto L_0x0062
            r8 = r0
            goto L_0x0063
        L_0x0062:
            r8 = r9
        L_0x0063:
            int r1 = r6.bottom
            r7.bottom = r1
            int r1 = r4.f2916M
            if (r1 == r0) goto L_0x0099
            r2 = 2
            if (r1 == r2) goto L_0x007b
            int r1 = r6.left
            int r1 = r4.mo3844h(r1, r8)
            r7.left = r1
            int r1 = r4.getPaddingTop()
            goto L_0x00a6
        L_0x007b:
            int r8 = r6.left
            android.widget.EditText r1 = r4.f2943i
            int r1 = r1.getPaddingLeft()
            int r1 = r1 + r8
            r7.left = r1
            int r8 = r6.top
            int r1 = r4.mo3793f()
            int r8 = r8 - r1
            r7.top = r8
            int r8 = r6.right
            android.widget.EditText r1 = r4.f2943i
            int r1 = r1.getPaddingRight()
            int r8 = r8 - r1
            goto L_0x00ae
        L_0x0099:
            int r1 = r6.left
            int r1 = r4.mo3844h(r1, r8)
            r7.left = r1
            int r1 = r6.top
            int r2 = r4.f2918N
            int r1 = r1 + r2
        L_0x00a6:
            r7.top = r1
            int r1 = r6.right
            int r8 = r4.mo3845i(r1, r8)
        L_0x00ae:
            r7.right = r8
            java.util.Objects.requireNonNull(r5)
            int r8 = r7.left
            int r1 = r7.top
            int r2 = r7.right
            int r7 = r7.bottom
            android.graphics.Rect r3 = r5.f3378f
            boolean r3 = p036f2.C0891c.m2636l(r3, r8, r1, r2, r7)
            if (r3 != 0) goto L_0x00cd
            android.graphics.Rect r3 = r5.f3378f
            r3.set(r8, r1, r2, r7)
            r5.f3359E = r0
            r5.mo4200j()
        L_0x00cd:
            f2.c r5 = r4.f2913K0
            android.widget.EditText r7 = r4.f2943i
            if (r7 == 0) goto L_0x0175
            android.graphics.Rect r7 = r4.f2928U
            android.text.TextPaint r8 = r5.f3361G
            float r1 = r5.f3382j
            r8.setTextSize(r1)
            android.graphics.Typeface r1 = r5.f3393u
            r8.setTypeface(r1)
            r1 = 0
            r8.setLetterSpacing(r1)
            android.text.TextPaint r8 = r5.f3361G
            float r8 = r8.ascent()
            float r8 = -r8
            int r1 = r6.left
            android.widget.EditText r2 = r4.f2943i
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r4.f2916M
            if (r1 != r0) goto L_0x0105
            android.widget.EditText r1 = r4.f2943i
            int r1 = r1.getMinLines()
            if (r1 > r0) goto L_0x0105
            r1 = r0
            goto L_0x0106
        L_0x0105:
            r1 = r9
        L_0x0106:
            if (r1 == 0) goto L_0x0114
            int r1 = r6.centerY()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r8 / r2
            float r1 = r1 - r2
            int r1 = (int) r1
            goto L_0x011d
        L_0x0114:
            int r1 = r6.top
            android.widget.EditText r2 = r4.f2943i
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 + r2
        L_0x011d:
            r7.top = r1
            int r1 = r6.right
            android.widget.EditText r2 = r4.f2943i
            int r2 = r2.getCompoundPaddingRight()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r4.f2916M
            if (r1 != r0) goto L_0x0137
            android.widget.EditText r1 = r4.f2943i
            int r1 = r1.getMinLines()
            if (r1 > r0) goto L_0x0137
            r9 = r0
        L_0x0137:
            if (r9 == 0) goto L_0x013f
            int r6 = r7.top
            float r6 = (float) r6
            float r6 = r6 + r8
            int r6 = (int) r6
            goto L_0x0148
        L_0x013f:
            int r6 = r6.bottom
            android.widget.EditText r8 = r4.f2943i
            int r8 = r8.getCompoundPaddingBottom()
            int r6 = r6 - r8
        L_0x0148:
            r7.bottom = r6
            int r8 = r7.left
            int r9 = r7.top
            int r7 = r7.right
            android.graphics.Rect r1 = r5.f3377e
            boolean r1 = p036f2.C0891c.m2636l(r1, r8, r9, r7, r6)
            if (r1 != 0) goto L_0x0162
            android.graphics.Rect r1 = r5.f3377e
            r1.set(r8, r9, r7, r6)
            r5.f3359E = r0
            r5.mo4200j()
        L_0x0162:
            f2.c r5 = r4.f2913K0
            r5.mo4201k()
            boolean r5 = r4.mo3794g()
            if (r5 == 0) goto L_0x0181
            boolean r5 = r4.f2911J0
            if (r5 != 0) goto L_0x0181
            r4.mo3849m()
            goto L_0x0181
        L_0x0175:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x017b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f2943i != null && this.f2943i.getMeasuredHeight() < (max = Math.max(this.f2939g.getMeasuredHeight(), this.f2937f.getMeasuredHeight()))) {
            this.f2943i.setMinimumHeight(max);
            z = true;
        }
        boolean v = mo3945v();
        if (z || v) {
            this.f2943i.post(new C0748c());
        }
        if (!(this.f2969v == null || (editText = this.f2943i) == null)) {
            this.f2969v.setGravity(editText.getGravity());
            this.f2969v.setPadding(this.f2943i.getCompoundPaddingLeft(), this.f2943i.getCompoundPaddingTop(), this.f2943i.getCompoundPaddingRight(), this.f2943i.getCompoundPaddingBottom());
        }
        mo3777A();
        mo3780D();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0753h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0753h hVar = (C0753h) parcelable;
        super.onRestoreInstanceState(hVar.f4651e);
        setError(hVar.f2984g);
        if (hVar.f2985h) {
            this.f2950l0.post(new C0747b());
        }
        setHint(hVar.f2986i);
        setHelperText(hVar.f2987j);
        setPlaceholderText(hVar.f2988k);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0753h hVar = new C0753h(super.onSaveInstanceState());
        if (this.f2951m.mo5434e()) {
            hVar.f2984g = getError();
        }
        hVar.f2985h = mo3846j() && this.f2950l0.isChecked();
        hVar.f2986i = getHint();
        hVar.f2987j = getHelperText();
        hVar.f2988k = getPlaceholderText();
        return hVar;
    }

    /* renamed from: p */
    public final void mo3855p(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: r */
    public void mo3856r(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131951925);
            Context context = getContext();
            Object obj = C0002a.f0a;
            textView.setTextColor(C0002a.C0005c.m7a(context, R.color.design_error));
        }
    }

    /* renamed from: s */
    public final void mo3857s() {
        if (this.f2959q != null) {
            EditText editText = this.f2943i;
            mo3943t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2926S != i) {
            this.f2926S = i;
            this.f2901E0 = i;
            this.f2905G0 = i;
            this.f2907H0 = i;
            mo3786c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = C0002a.f0a;
        setBoxBackgroundColor(C0002a.C0005c.m7a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2901E0 = defaultColor;
        this.f2926S = defaultColor;
        this.f2903F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2905G0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f2907H0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo3786c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f2916M) {
            this.f2916M = i;
            if (this.f2943i != null) {
                mo3848l();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2897C0 != i) {
            this.f2897C0 = i;
            mo3782F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f2893A0 = colorStateList.getDefaultColor();
            this.f2909I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2895B0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f2897C0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo3782F();
        }
        this.f2897C0 = defaultColor;
        mo3782F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2899D0 != colorStateList) {
            this.f2899D0 = colorStateList;
            mo3782F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2922P = i;
        mo3782F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2924Q = i;
        mo3782F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f2953n != z) {
            if (z) {
                C0148d0 d0Var = new C0148d0(getContext(), (AttributeSet) null);
                this.f2959q = d0Var;
                d0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f2930W;
                if (typeface != null) {
                    this.f2959q.setTypeface(typeface);
                }
                this.f2959q.setMaxLines(1);
                this.f2951m.mo5430a(this.f2959q, 2);
                ((ViewGroup.MarginLayoutParams) this.f2959q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                mo3944u();
                mo3857s();
            } else {
                this.f2951m.mo5439j(this.f2959q, 2);
                this.f2959q = null;
            }
            this.f2953n = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2955o != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f2955o = i;
            if (this.f2953n) {
                mo3857s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2961r != i) {
            this.f2961r = i;
            mo3944u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2977z != colorStateList) {
            this.f2977z = colorStateList;
            mo3944u();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2963s != i) {
            this.f2963s = i;
            mo3944u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2975y != colorStateList) {
            this.f2975y = colorStateList;
            mo3944u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2976y0 = colorStateList;
        this.f2978z0 = colorStateList;
        if (this.f2943i != null) {
            mo3948y(false, false);
        }
    }

    public void setEnabled(boolean z) {
        m2296n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f2950l0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f2950l0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f2950l0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C1021a.m2945a(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f2950l0.setImageDrawable(drawable);
        mo3850o();
    }

    public void setEndIconMode(int i) {
        int i2 = this.f2946j0;
        this.f2946j0 = i;
        Iterator it = this.f2952m0.iterator();
        while (it.hasNext()) {
            ((C0752g) it.next()).mo3957a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo3971b(this.f2916M)) {
            getEndIconDelegate().mo3962a();
            mo3787d();
            return;
        }
        StringBuilder a = C0001b.m0a("The current box background mode ");
        a.append(this.f2916M);
        a.append(" is not supported by the end icon mode ");
        a.append(i);
        throw new IllegalStateException(a.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2950l0;
        View.OnLongClickListener onLongClickListener = this.f2968u0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2968u0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2950l0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f2954n0 != colorStateList) {
            this.f2954n0 = colorStateList;
            this.f2956o0 = true;
            mo3787d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f2958p0 != mode) {
            this.f2958p0 = mode;
            this.f2960q0 = true;
            mo3787d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo3847k() != z) {
            this.f2950l0.setVisibility(z ? 0 : 8);
            mo3780D();
            mo3945v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f2951m.f4696k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C1515l lVar = this.f2951m;
            lVar.mo5432c();
            lVar.f4695j = charSequence;
            lVar.f4697l.setText(charSequence);
            int i = lVar.f4693h;
            if (i != 1) {
                lVar.f4694i = 1;
            }
            lVar.mo5441l(i, lVar.f4694i, lVar.mo5440k(lVar.f4697l, charSequence));
            return;
        }
        this.f2951m.mo5438i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1515l lVar = this.f2951m;
        lVar.f4698m = charSequence;
        TextView textView = lVar.f4697l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1515l lVar = this.f2951m;
        if (lVar.f4696k != z) {
            lVar.mo5432c();
            if (z) {
                C0148d0 d0Var = new C0148d0(lVar.f4686a, (AttributeSet) null);
                lVar.f4697l = d0Var;
                d0Var.setId(R.id.textinput_error);
                lVar.f4697l.setTextAlignment(5);
                Typeface typeface = lVar.f4706u;
                if (typeface != null) {
                    lVar.f4697l.setTypeface(typeface);
                }
                int i = lVar.f4699n;
                lVar.f4699n = i;
                TextView textView = lVar.f4697l;
                if (textView != null) {
                    lVar.f4687b.mo3856r(textView, i);
                }
                ColorStateList colorStateList = lVar.f4700o;
                lVar.f4700o = colorStateList;
                TextView textView2 = lVar.f4697l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = lVar.f4698m;
                lVar.f4698m = charSequence;
                TextView textView3 = lVar.f4697l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                lVar.f4697l.setVisibility(4);
                TextView textView4 = lVar.f4697l;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                textView4.setAccessibilityLiveRegion(1);
                lVar.mo5430a(lVar.f4697l, 0);
            } else {
                lVar.mo5438i();
                lVar.mo5439j(lVar.f4697l, 0);
                lVar.f4697l = null;
                lVar.f4687b.mo3946w();
                lVar.f4687b.mo3782F();
            }
            lVar.f4696k = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C1021a.m2945a(getContext(), i) : null);
        mo3855p(this.f2972w0, this.f2974x0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2972w0;
        View.OnLongClickListener onLongClickListener = this.f2970v0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2970v0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2972w0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f2974x0 = colorStateList;
        Drawable drawable = this.f2972w0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.f2972w0.getDrawable() != drawable) {
            this.f2972w0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2972w0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.f2972w0.getDrawable() != drawable) {
            this.f2972w0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1515l lVar = this.f2951m;
        lVar.f4699n = i;
        TextView textView = lVar.f4697l;
        if (textView != null) {
            lVar.f4687b.mo3856r(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1515l lVar = this.f2951m;
        lVar.f4700o = colorStateList;
        TextView textView = lVar.f4697l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f2915L0 != z) {
            this.f2915L0 = z;
            mo3948y(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f2951m.f4702q) {
                setHelperTextEnabled(true);
            }
            C1515l lVar = this.f2951m;
            lVar.mo5432c();
            lVar.f4701p = charSequence;
            lVar.f4703r.setText(charSequence);
            int i = lVar.f4693h;
            if (i != 2) {
                lVar.f4694i = 2;
            }
            lVar.mo5441l(i, lVar.f4694i, lVar.mo5440k(lVar.f4703r, charSequence));
        } else if (this.f2951m.f4702q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1515l lVar = this.f2951m;
        lVar.f4705t = colorStateList;
        TextView textView = lVar.f4703r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C1515l lVar = this.f2951m;
        if (lVar.f4702q != z) {
            lVar.mo5432c();
            if (z) {
                C0148d0 d0Var = new C0148d0(lVar.f4686a, (AttributeSet) null);
                lVar.f4703r = d0Var;
                d0Var.setId(R.id.textinput_helper_text);
                lVar.f4703r.setTextAlignment(5);
                Typeface typeface = lVar.f4706u;
                if (typeface != null) {
                    lVar.f4703r.setTypeface(typeface);
                }
                lVar.f4703r.setVisibility(4);
                TextView textView = lVar.f4703r;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                textView.setAccessibilityLiveRegion(1);
                int i = lVar.f4704s;
                lVar.f4704s = i;
                TextView textView2 = lVar.f4703r;
                if (textView2 != null) {
                    textView2.setTextAppearance(i);
                }
                ColorStateList colorStateList = lVar.f4705t;
                lVar.f4705t = colorStateList;
                TextView textView3 = lVar.f4703r;
                if (!(textView3 == null || colorStateList == null)) {
                    textView3.setTextColor(colorStateList);
                }
                lVar.mo5430a(lVar.f4703r, 1);
            } else {
                lVar.mo5432c();
                int i2 = lVar.f4693h;
                if (i2 == 2) {
                    lVar.f4694i = 0;
                }
                lVar.mo5441l(i2, lVar.f4694i, lVar.mo5440k(lVar.f4703r, (CharSequence) null));
                lVar.mo5439j(lVar.f4703r, 1);
                lVar.f4703r = null;
                lVar.f4687b.mo3946w();
                lVar.f4687b.mo3782F();
            }
            lVar.f4702q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C1515l lVar = this.f2951m;
        lVar.f4704s = i;
        TextView textView = lVar.f4703r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2900E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f2917M0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f2900E) {
            this.f2900E = z;
            if (!z) {
                this.f2904G = false;
                if (!TextUtils.isEmpty(this.f2902F) && TextUtils.isEmpty(this.f2943i.getHint())) {
                    this.f2943i.setHint(this.f2902F);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f2943i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2902F)) {
                        setHint(hint);
                    }
                    this.f2943i.setHint((CharSequence) null);
                }
                this.f2904G = true;
            }
            if (this.f2943i != null) {
                mo3947x();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0891c cVar = this.f2913K0;
        C1033f fVar = new C1033f(cVar.f3373a.getContext(), i);
        ColorStateList colorStateList = fVar.f3755a;
        if (colorStateList != null) {
            cVar.f3385m = colorStateList;
        }
        float f = fVar.f3765k;
        if (f != 0.0f) {
            cVar.f3383k = f;
        }
        ColorStateList colorStateList2 = fVar.f3756b;
        if (colorStateList2 != null) {
            cVar.f3367M = colorStateList2;
        }
        cVar.f3365K = fVar.f3760f;
        cVar.f3366L = fVar.f3761g;
        cVar.f3364J = fVar.f3762h;
        cVar.f3368N = fVar.f3764j;
        C1027a aVar = cVar.f3395w;
        if (aVar != null) {
            aVar.f3749c = true;
        }
        C0890b bVar = new C0890b(cVar);
        fVar.mo4467a();
        cVar.f3395w = new C1027a(bVar, fVar.f3768n);
        fVar.mo4469c(cVar.f3373a.getContext(), cVar.f3395w);
        cVar.mo4201k();
        this.f2978z0 = this.f2913K0.f3385m;
        if (this.f2943i != null) {
            mo3948y(false, false);
            mo3947x();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2978z0 != colorStateList) {
            if (this.f2976y0 == null) {
                C0891c cVar = this.f2913K0;
                if (cVar.f3385m != colorStateList) {
                    cVar.f3385m = colorStateList;
                    cVar.mo4201k();
                }
            }
            this.f2978z0 = colorStateList;
            if (this.f2943i != null) {
                mo3948y(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f2949l = i;
        EditText editText = this.f2943i;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.f2947k = i;
        EditText editText = this.f2943i;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2950l0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C1021a.m2945a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2950l0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f2946j0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f2954n0 = colorStateList;
        this.f2956o0 = true;
        mo3787d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f2958p0 = mode;
        this.f2960q0 = true;
        mo3787d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (!this.f2967u || !TextUtils.isEmpty(charSequence)) {
            if (!this.f2967u) {
                setPlaceholderTextEnabled(true);
            }
            this.f2965t = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.f2943i;
        if (editText != null) {
            i = editText.getText().length();
        }
        mo3949z(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2973x = i;
        TextView textView = this.f2969v;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2971w != colorStateList) {
            this.f2971w = colorStateList;
            TextView textView = this.f2969v;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f2892A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f2894B.setText(charSequence);
        mo3778B();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2894B.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2894B.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f2931a0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f2931a0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C1021a.m2945a(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2931a0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo3855p(this.f2931a0, this.f2932b0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2931a0;
        View.OnLongClickListener onLongClickListener = this.f2942h0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2942h0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2931a0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2297q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f2932b0 != colorStateList) {
            this.f2932b0 = colorStateList;
            this.f2933c0 = true;
            mo3792e(this.f2931a0, true, colorStateList, this.f2936e0, this.f2934d0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f2934d0 != mode) {
            this.f2934d0 = mode;
            this.f2936e0 = true;
            mo3792e(this.f2931a0, this.f2933c0, this.f2932b0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.f2931a0.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.f2931a0;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo3777A();
            mo3945v();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f2896C = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f2898D.setText(charSequence);
        mo3781E();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2898D.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2898D.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0750e eVar) {
        EditText editText = this.f2943i;
        if (editText != null) {
            C1061o.m3034o(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2930W) {
            this.f2930W = typeface;
            this.f2913K0.mo4206q(typeface);
            C1515l lVar = this.f2951m;
            if (typeface != lVar.f4706u) {
                lVar.f4706u = typeface;
                TextView textView = lVar.f4697l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = lVar.f4703r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f2959q;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public void mo3943t(int i) {
        boolean z = this.f2957p;
        int i2 = this.f2955o;
        String str = null;
        if (i2 == -1) {
            this.f2959q.setText(String.valueOf(i));
            this.f2959q.setContentDescription((CharSequence) null);
            this.f2957p = false;
        } else {
            this.f2957p = i > i2;
            Context context = getContext();
            this.f2959q.setContentDescription(context.getString(this.f2957p ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f2955o)}));
            if (z != this.f2957p) {
                mo3944u();
            }
            C1000a c = C1000a.m2928c();
            TextView textView = this.f2959q;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f2955o)});
            C1004c cVar = c.f3706c;
            if (string != null) {
                str = c.mo4422d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.f2943i != null && z != this.f2957p) {
            mo3948y(false, false);
            mo3782F();
            mo3946w();
        }
    }

    /* renamed from: u */
    public final void mo3944u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f2959q;
        if (textView != null) {
            mo3856r(textView, this.f2957p ? this.f2961r : this.f2963s);
            if (!this.f2957p && (colorStateList2 = this.f2975y) != null) {
                this.f2959q.setTextColor(colorStateList2);
            }
            if (this.f2957p && (colorStateList = this.f2977z) != null) {
                this.f2959q.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3945v() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f2943i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x0011
            java.lang.CharSequence r0 = r10.f2892A
            if (r0 == 0) goto L_0x001b
        L_0x0011:
            android.widget.LinearLayout r0 = r10.f2937f
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001b
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x005d
            android.widget.LinearLayout r0 = r10.f2937f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f2943i
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f2938f0
            if (r6 == 0) goto L_0x0036
            int r6 = r10.f2940g0
            if (r6 == r0) goto L_0x0042
        L_0x0036:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2938f0 = r6
            r10.f2940g0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x0042:
            android.widget.EditText r0 = r10.f2943i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f2938f0
            if (r6 == r7) goto L_0x005b
            android.widget.EditText r6 = r10.f2943i
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
        L_0x0059:
            r0 = r2
            goto L_0x0075
        L_0x005b:
            r0 = r1
            goto L_0x0075
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r10.f2938f0
            if (r0 == 0) goto L_0x005b
            android.widget.EditText r0 = r10.f2943i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f2943i
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r3, r7, r8, r0)
            r10.f2938f0 = r3
            goto L_0x0059
        L_0x0075:
            com.google.android.material.internal.CheckableImageButton r6 = r10.f2972w0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x008d
            boolean r6 = r10.mo3846j()
            if (r6 == 0) goto L_0x0089
            boolean r6 = r10.mo3847k()
            if (r6 != 0) goto L_0x008d
        L_0x0089:
            java.lang.CharSequence r6 = r10.f2896C
            if (r6 == 0) goto L_0x0097
        L_0x008d:
            android.widget.LinearLayout r6 = r10.f2939g
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x0097
            r6 = r2
            goto L_0x0098
        L_0x0097:
            r6 = r1
        L_0x0098:
            if (r6 == 0) goto L_0x0104
            android.widget.TextView r3 = r10.f2898D
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f2943i
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00bd
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.getMarginStart()
            int r3 = r3 + r7
        L_0x00bd:
            android.widget.EditText r6 = r10.f2943i
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r7 = r10.f2962r0
            if (r7 == 0) goto L_0x00de
            int r8 = r10.f2964s0
            if (r8 == r3) goto L_0x00de
            r10.f2964s0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f2943i
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.f2962r0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r5, r4)
            goto L_0x0125
        L_0x00de:
            if (r7 != 0) goto L_0x00ec
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f2962r0 = r7
            r10.f2964s0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00ec:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f2962r0
            if (r3 == r7) goto L_0x0102
            r0 = r6[r5]
            r10.f2966t0 = r0
            android.widget.EditText r0 = r10.f2943i
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x0125
        L_0x0102:
            r2 = r0
            goto L_0x0125
        L_0x0104:
            android.graphics.drawable.Drawable r6 = r10.f2962r0
            if (r6 == 0) goto L_0x0126
            android.widget.EditText r6 = r10.f2943i
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f2962r0
            if (r5 != r7) goto L_0x0122
            android.widget.EditText r0 = r10.f2943i
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f2966t0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r4)
            goto L_0x0123
        L_0x0122:
            r2 = r0
        L_0x0123:
            r10.f2962r0 = r3
        L_0x0125:
            r0 = r2
        L_0x0126:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo3945v():boolean");
    }

    /* renamed from: w */
    public void mo3946w() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f2943i;
        if (editText != null && this.f2916M == 0 && (background = editText.getBackground()) != null) {
            if (C0169i0.m487a(background)) {
                background = background.mutate();
            }
            if (this.f2951m.mo5434e()) {
                currentTextColor = this.f2951m.mo5436g();
            } else if (!this.f2957p || (textView = this.f2959q) == null) {
                background.clearColorFilter();
                this.f2943i.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0176k.m497c(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* renamed from: x */
    public final void mo3947x() {
        if (this.f2916M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2935e.getLayoutParams();
            int f = mo3793f();
            if (f != layoutParams.topMargin) {
                layoutParams.topMargin = f;
                this.f2935e.requestLayout();
            }
        }
    }

    /* renamed from: y */
    public final void mo3948y(boolean z, boolean z2) {
        C0891c cVar;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2943i;
        int i = 0;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f2943i;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e = this.f2951m.mo5434e();
        ColorStateList colorStateList2 = this.f2976y0;
        if (colorStateList2 != null) {
            C0891c cVar2 = this.f2913K0;
            if (cVar2.f3385m != colorStateList2) {
                cVar2.f3385m = colorStateList2;
                cVar2.mo4201k();
            }
            C0891c cVar3 = this.f2913K0;
            ColorStateList colorStateList3 = this.f2976y0;
            if (cVar3.f3384l != colorStateList3) {
                cVar3.f3384l = colorStateList3;
                cVar3.mo4201k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2976y0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f2909I0) : this.f2909I0;
            this.f2913K0.mo4202m(ColorStateList.valueOf(colorForState));
            C0891c cVar4 = this.f2913K0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cVar4.f3384l != valueOf) {
                cVar4.f3384l = valueOf;
                cVar4.mo4201k();
            }
        } else if (e) {
            C0891c cVar5 = this.f2913K0;
            TextView textView2 = this.f2951m.f4697l;
            cVar5.mo4202m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f2957p && (textView = this.f2959q) != null) {
                cVar = this.f2913K0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f2978z0) != null) {
                cVar = this.f2913K0;
            }
            cVar.mo4202m(colorStateList);
        }
        if (z3 || !this.f2915L0 || (isEnabled() && z4)) {
            if (z2 || this.f2911J0) {
                ValueAnimator valueAnimator = this.f2919N0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2919N0.cancel();
                }
                if (!z || !this.f2917M0) {
                    this.f2913K0.mo4204o(1.0f);
                } else {
                    mo3785b(1.0f);
                }
                this.f2911J0 = false;
                if (mo3794g()) {
                    mo3849m();
                }
                EditText editText3 = this.f2943i;
                if (editText3 != null) {
                    i = editText3.getText().length();
                }
                mo3949z(i);
                mo3778B();
                mo3781E();
            }
        } else if (z2 || !this.f2911J0) {
            ValueAnimator valueAnimator2 = this.f2919N0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2919N0.cancel();
            }
            if (!z || !this.f2917M0) {
                this.f2913K0.mo4204o(0.0f);
            } else {
                mo3785b(0.0f);
            }
            if (mo3794g() && (!((C1509f) this.f2906H).f4676C.isEmpty()) && mo3794g()) {
                ((C1509f) this.f2906H).mo5425x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2911J0 = true;
            TextView textView3 = this.f2969v;
            if (textView3 != null && this.f2967u) {
                textView3.setText((CharSequence) null);
                this.f2969v.setVisibility(4);
            }
            mo3778B();
            mo3781E();
        }
    }

    /* renamed from: z */
    public final void mo3949z(int i) {
        if (i != 0 || this.f2911J0) {
            TextView textView = this.f2969v;
            if (textView != null && this.f2967u) {
                textView.setText((CharSequence) null);
                this.f2969v.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.f2969v;
        if (textView2 != null && this.f2967u) {
            textView2.setText(this.f2965t);
            this.f2969v.setVisibility(0);
            this.f2969v.bringToFront();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2972w0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f2951m.f4696k);
    }
}
