package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p010b0.C0533b;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;
import p070l0.C1226a;

/* renamed from: androidx.appcompat.widget.b0 */
public class C0134b0 {

    /* renamed from: a */
    public final TextView f674a;

    /* renamed from: b */
    public C0232z0 f675b;

    /* renamed from: c */
    public C0232z0 f676c;

    /* renamed from: d */
    public C0232z0 f677d;

    /* renamed from: e */
    public C0232z0 f678e;

    /* renamed from: f */
    public C0232z0 f679f;

    /* renamed from: g */
    public C0232z0 f680g;

    /* renamed from: h */
    public C0232z0 f681h;

    /* renamed from: i */
    public final C0152e0 f682i;

    /* renamed from: j */
    public int f683j = 0;

    /* renamed from: k */
    public int f684k = -1;

    /* renamed from: l */
    public Typeface f685l;

    /* renamed from: m */
    public boolean f686m;

    /* renamed from: androidx.appcompat.widget.b0$a */
    public class C0135a extends C0533b.C0534a {

        /* renamed from: a */
        public final /* synthetic */ int f687a;

        /* renamed from: b */
        public final /* synthetic */ int f688b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f689c;

        public C0135a(int i, int i2, WeakReference weakReference) {
            this.f687a = i;
            this.f688b = i2;
            this.f689c = weakReference;
        }

        /* renamed from: d */
        public void mo759d(int i) {
        }

        /* renamed from: e */
        public void mo760e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f687a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f688b & 2) != 0);
            }
            C0134b0 b0Var = C0134b0.this;
            WeakReference weakReference = this.f689c;
            if (b0Var.f686m) {
                b0Var.f685l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new C0145c0(b0Var, textView, typeface, b0Var.f683j));
                    } else {
                        textView.setTypeface(typeface, b0Var.f683j);
                    }
                }
            }
        }
    }

    public C0134b0(TextView textView) {
        this.f674a = textView;
        this.f682i = new C0152e0(textView);
    }

    /* renamed from: c */
    public static C0232z0 m345c(Context context, C0176k kVar, int i) {
        ColorStateList d = kVar.mo979d(context, i);
        if (d == null) {
            return null;
        }
        C0232z0 z0Var = new C0232z0();
        z0Var.f1007d = true;
        z0Var.f1004a = d;
        return z0Var;
    }

    /* renamed from: a */
    public final void mo747a(Drawable drawable, C0232z0 z0Var) {
        if (drawable != null && z0Var != null) {
            C0176k.m499f(drawable, z0Var, this.f674a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo748b() {
        if (!(this.f675b == null && this.f676c == null && this.f677d == null && this.f678e == null)) {
            Drawable[] compoundDrawables = this.f674a.getCompoundDrawables();
            mo747a(compoundDrawables[0], this.f675b);
            mo747a(compoundDrawables[1], this.f676c);
            mo747a(compoundDrawables[2], this.f677d);
            mo747a(compoundDrawables[3], this.f678e);
        }
        if (this.f679f != null || this.f680g != null) {
            Drawable[] compoundDrawablesRelative = this.f674a.getCompoundDrawablesRelative();
            mo747a(compoundDrawablesRelative[0], this.f679f);
            mo747a(compoundDrawablesRelative[2], this.f680g);
        }
    }

    /* renamed from: d */
    public boolean mo749d() {
        C0152e0 e0Var = this.f682i;
        return e0Var.mo879i() && e0Var.f752a != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:194:0x036e, code lost:
        if (r3 != null) goto L_0x0375;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo750e(android.util.AttributeSet r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            r9 = r24
            android.widget.TextView r1 = r0.f674a
            android.content.Context r10 = r1.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C0176k.m496a()
            int[] r3 = p039g.C0934b.f3466h
            r12 = 0
            androidx.appcompat.widget.b1 r13 = androidx.appcompat.widget.C0136b1.m361q(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.f674a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.f692b
            r7 = 0
            r4 = r23
            r6 = r24
            p058j0.C1061o.m3033n(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.mo772l(r12, r14)
            r15 = 3
            boolean r2 = r13.mo775o(r15)
            if (r2 == 0) goto L_0x003d
            int r2 = r13.mo772l(r15, r12)
            androidx.appcompat.widget.z0 r2 = m345c(r10, r11, r2)
            r0.f675b = r2
        L_0x003d:
            r7 = 1
            boolean r2 = r13.mo775o(r7)
            if (r2 == 0) goto L_0x004e
            int r2 = r13.mo772l(r7, r12)
            androidx.appcompat.widget.z0 r2 = m345c(r10, r11, r2)
            r0.f676c = r2
        L_0x004e:
            r6 = 4
            boolean r2 = r13.mo775o(r6)
            if (r2 == 0) goto L_0x005f
            int r2 = r13.mo772l(r6, r12)
            androidx.appcompat.widget.z0 r2 = m345c(r10, r11, r2)
            r0.f677d = r2
        L_0x005f:
            r5 = 2
            boolean r2 = r13.mo775o(r5)
            if (r2 == 0) goto L_0x0070
            int r2 = r13.mo772l(r5, r12)
            androidx.appcompat.widget.z0 r2 = m345c(r10, r11, r2)
            r0.f678e = r2
        L_0x0070:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 5
            boolean r3 = r13.mo775o(r4)
            if (r3 == 0) goto L_0x0083
            int r3 = r13.mo772l(r4, r12)
            androidx.appcompat.widget.z0 r3 = m345c(r10, r11, r3)
            r0.f679f = r3
        L_0x0083:
            r3 = 6
            boolean r16 = r13.mo775o(r3)
            if (r16 == 0) goto L_0x0094
            int r4 = r13.mo772l(r3, r12)
            androidx.appcompat.widget.z0 r4 = m345c(r10, r11, r4)
            r0.f680g = r4
        L_0x0094:
            android.content.res.TypedArray r4 = r13.f692b
            r4.recycle()
            android.widget.TextView r4 = r0.f674a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r13 = 26
            r3 = 15
            r15 = 14
            if (r1 == r14) goto L_0x00ea
            int[] r5 = p039g.C0934b.f3480v
            androidx.appcompat.widget.b1 r6 = new androidx.appcompat.widget.b1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r5)
            r6.<init>(r10, r1)
            if (r4 != 0) goto L_0x00c3
            boolean r5 = r6.mo775o(r15)
            if (r5 == 0) goto L_0x00c3
            boolean r5 = r6.mo761a(r15, r12)
            r19 = 1
            goto L_0x00c6
        L_0x00c3:
            r5 = r12
            r19 = r5
        L_0x00c6:
            r0.mo758m(r10, r6)
            boolean r20 = r6.mo775o(r3)
            if (r20 == 0) goto L_0x00d4
            java.lang.String r20 = r6.mo773m(r3)
            goto L_0x00d6
        L_0x00d4:
            r20 = 0
        L_0x00d6:
            if (r2 < r13) goto L_0x00e5
            r7 = 13
            boolean r18 = r6.mo775o(r7)
            if (r18 == 0) goto L_0x00e5
            java.lang.String r6 = r6.mo773m(r7)
            goto L_0x00e6
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            r1.recycle()
            goto L_0x00f0
        L_0x00ea:
            r5 = r12
            r19 = r5
            r6 = 0
            r20 = 0
        L_0x00f0:
            int[] r1 = p039g.C0934b.f3480v
            androidx.appcompat.widget.b1 r7 = new androidx.appcompat.widget.b1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1, r9, r12)
            r7.<init>(r10, r1)
            if (r4 != 0) goto L_0x0109
            boolean r21 = r7.mo775o(r15)
            if (r21 == 0) goto L_0x0109
            boolean r5 = r7.mo761a(r15, r12)
            r19 = 1
        L_0x0109:
            boolean r21 = r7.mo775o(r3)
            if (r21 == 0) goto L_0x0113
            java.lang.String r20 = r7.mo773m(r3)
        L_0x0113:
            if (r2 < r13) goto L_0x0122
            r13 = 13
            boolean r3 = r7.mo775o(r13)
            if (r3 == 0) goto L_0x0124
            java.lang.String r6 = r7.mo773m(r13)
            goto L_0x0124
        L_0x0122:
            r13 = 13
        L_0x0124:
            r3 = 28
            if (r2 < r3) goto L_0x013a
            boolean r2 = r7.mo775o(r12)
            if (r2 == 0) goto L_0x013a
            int r2 = r7.mo766f(r12, r14)
            if (r2 != 0) goto L_0x013a
            android.widget.TextView r2 = r0.f674a
            r3 = 0
            r2.setTextSize(r12, r3)
        L_0x013a:
            r0.mo758m(r10, r7)
            r1.recycle()
            if (r4 != 0) goto L_0x0149
            if (r19 == 0) goto L_0x0149
            android.widget.TextView r1 = r0.f674a
            r1.setAllCaps(r5)
        L_0x0149:
            android.graphics.Typeface r1 = r0.f685l
            if (r1 == 0) goto L_0x015e
            int r2 = r0.f684k
            if (r2 != r14) goto L_0x0159
            android.widget.TextView r2 = r0.f674a
            int r3 = r0.f683j
            r2.setTypeface(r1, r3)
            goto L_0x015e
        L_0x0159:
            android.widget.TextView r2 = r0.f674a
            r2.setTypeface(r1)
        L_0x015e:
            if (r6 == 0) goto L_0x0165
            android.widget.TextView r1 = r0.f674a
            r1.setFontVariationSettings(r6)
        L_0x0165:
            if (r20 == 0) goto L_0x0170
            android.widget.TextView r1 = r0.f674a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r20)
            r1.setTextLocales(r2)
        L_0x0170:
            androidx.appcompat.widget.e0 r7 = r0.f682i
            android.content.Context r1 = r7.f761j
            int[] r3 = p039g.C0934b.f3467i
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r8, r3, r9, r12)
            android.widget.TextView r1 = r7.f760i
            android.content.Context r2 = r1.getContext()
            r18 = 0
            r5 = 6
            r13 = 5
            r4 = r23
            r15 = 2
            r5 = r6
            r14 = r6
            r15 = 4
            r6 = r24
            r9 = r7
            r7 = r18
            p058j0.C1061o.m3033n(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r14.hasValue(r13)
            if (r1 == 0) goto L_0x019e
            int r1 = r14.getInt(r13, r12)
            r9.f752a = r1
        L_0x019e:
            boolean r1 = r14.hasValue(r15)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x01ab
            float r1 = r14.getDimension(r15, r2)
            goto L_0x01ac
        L_0x01ab:
            r1 = r2
        L_0x01ac:
            r3 = 2
            boolean r4 = r14.hasValue(r3)
            if (r4 == 0) goto L_0x01b8
            float r4 = r14.getDimension(r3, r2)
            goto L_0x01b9
        L_0x01b8:
            r4 = r2
        L_0x01b9:
            r3 = 1
            boolean r5 = r14.hasValue(r3)
            if (r5 == 0) goto L_0x01c5
            float r5 = r14.getDimension(r3, r2)
            goto L_0x01c6
        L_0x01c5:
            r5 = r2
        L_0x01c6:
            r6 = 3
            boolean r7 = r14.hasValue(r6)
            if (r7 == 0) goto L_0x01fd
            int r7 = r14.getResourceId(r6, r12)
            if (r7 <= 0) goto L_0x01fd
            android.content.res.Resources r6 = r14.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r7)
            int r7 = r6.length()
            int[] r13 = new int[r7]
            if (r7 <= 0) goto L_0x01fa
            r15 = r12
        L_0x01e4:
            if (r15 >= r7) goto L_0x01f1
            r12 = -1
            int r17 = r6.getDimensionPixelSize(r15, r12)
            r13[r15] = r17
            int r15 = r15 + 1
            r12 = 0
            goto L_0x01e4
        L_0x01f1:
            int[] r7 = r9.mo874b(r13)
            r9.f757f = r7
            r9.mo878h()
        L_0x01fa:
            r6.recycle()
        L_0x01fd:
            r14.recycle()
            boolean r6 = r9.mo879i()
            if (r6 == 0) goto L_0x023c
            int r6 = r9.f752a
            if (r6 != r3) goto L_0x023f
            boolean r6 = r9.f758g
            if (r6 != 0) goto L_0x0238
            android.content.Context r6 = r9.f761j
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0224
            r4 = 1094713344(0x41400000, float:12.0)
            r7 = 2
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r6)
            goto L_0x0225
        L_0x0224:
            r7 = 2
        L_0x0225:
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x022f
            r5 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r7, r5, r6)
        L_0x022f:
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0235
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0235:
            r9.mo880j(r4, r5, r1)
        L_0x0238:
            r9.mo877g()
            goto L_0x023f
        L_0x023c:
            r1 = 0
            r9.f752a = r1
        L_0x023f:
            boolean r1 = p076m0.C1421b.f4499c
            if (r1 == 0) goto L_0x027e
            androidx.appcompat.widget.e0 r1 = r0.f682i
            int r4 = r1.f752a
            if (r4 == 0) goto L_0x027e
            int[] r1 = r1.f757f
            int r4 = r1.length
            if (r4 <= 0) goto L_0x027e
            android.widget.TextView r4 = r0.f674a
            int r4 = r4.getAutoSizeStepGranularity()
            float r4 = (float) r4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0278
            android.widget.TextView r1 = r0.f674a
            androidx.appcompat.widget.e0 r2 = r0.f682i
            float r2 = r2.f755d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.e0 r4 = r0.f682i
            float r4 = r4.f756e
            int r4 = java.lang.Math.round(r4)
            androidx.appcompat.widget.e0 r5 = r0.f682i
            float r5 = r5.f754c
            int r5 = java.lang.Math.round(r5)
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r4, r5, r6)
            goto L_0x027e
        L_0x0278:
            r6 = 0
            android.widget.TextView r2 = r0.f674a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x027e:
            int[] r1 = p039g.C0934b.f3467i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1)
            r2 = 8
            r4 = -1
            int r2 = r1.getResourceId(r2, r4)
            if (r2 == r4) goto L_0x0294
            android.graphics.drawable.Drawable r7 = r11.mo978b(r10, r2)
            r2 = 13
            goto L_0x0297
        L_0x0294:
            r2 = 13
            r7 = 0
        L_0x0297:
            int r2 = r1.getResourceId(r2, r4)
            if (r2 == r4) goto L_0x02a2
            android.graphics.drawable.Drawable r2 = r11.mo978b(r10, r2)
            goto L_0x02a3
        L_0x02a2:
            r2 = 0
        L_0x02a3:
            r5 = 9
            int r5 = r1.getResourceId(r5, r4)
            if (r5 == r4) goto L_0x02b0
            android.graphics.drawable.Drawable r5 = r11.mo978b(r10, r5)
            goto L_0x02b1
        L_0x02b0:
            r5 = 0
        L_0x02b1:
            r6 = 6
            int r6 = r1.getResourceId(r6, r4)
            if (r6 == r4) goto L_0x02bd
            android.graphics.drawable.Drawable r6 = r11.mo978b(r10, r6)
            goto L_0x02be
        L_0x02bd:
            r6 = 0
        L_0x02be:
            r8 = 10
            int r8 = r1.getResourceId(r8, r4)
            if (r8 == r4) goto L_0x02cb
            android.graphics.drawable.Drawable r8 = r11.mo978b(r10, r8)
            goto L_0x02cc
        L_0x02cb:
            r8 = 0
        L_0x02cc:
            r9 = 7
            int r9 = r1.getResourceId(r9, r4)
            if (r9 == r4) goto L_0x02d8
            android.graphics.drawable.Drawable r4 = r11.mo978b(r10, r9)
            goto L_0x02d9
        L_0x02d8:
            r4 = 0
        L_0x02d9:
            if (r8 != 0) goto L_0x0330
            if (r4 == 0) goto L_0x02de
            goto L_0x0330
        L_0x02de:
            if (r7 != 0) goto L_0x02e6
            if (r2 != 0) goto L_0x02e6
            if (r5 != 0) goto L_0x02e6
            if (r6 == 0) goto L_0x0353
        L_0x02e6:
            android.widget.TextView r4 = r0.f674a
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            r8 = 0
            r9 = r4[r8]
            if (r9 != 0) goto L_0x0319
            r9 = 2
            r11 = r4[r9]
            if (r11 == 0) goto L_0x02f7
            goto L_0x0319
        L_0x02f7:
            android.widget.TextView r4 = r0.f674a
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawables()
            android.widget.TextView r9 = r0.f674a
            if (r7 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r7 = r4[r8]
        L_0x0304:
            if (r2 == 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r2 = r4[r3]
        L_0x0309:
            if (r5 == 0) goto L_0x030c
            goto L_0x030f
        L_0x030c:
            r3 = 2
            r5 = r4[r3]
        L_0x030f:
            if (r6 == 0) goto L_0x0312
            goto L_0x0315
        L_0x0312:
            r3 = 3
            r6 = r4[r3]
        L_0x0315:
            r9.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
            goto L_0x0353
        L_0x0319:
            android.widget.TextView r5 = r0.f674a
            r7 = 0
            r8 = r4[r7]
            if (r2 == 0) goto L_0x0321
            goto L_0x0323
        L_0x0321:
            r2 = r4[r3]
        L_0x0323:
            r3 = 2
            r3 = r4[r3]
            if (r6 == 0) goto L_0x0329
            goto L_0x032c
        L_0x0329:
            r6 = 3
            r6 = r4[r6]
        L_0x032c:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r3, r6)
            goto L_0x0353
        L_0x0330:
            android.widget.TextView r5 = r0.f674a
            android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawablesRelative()
            android.widget.TextView r7 = r0.f674a
            if (r8 == 0) goto L_0x033b
            goto L_0x033f
        L_0x033b:
            r8 = 0
            r9 = r5[r8]
            r8 = r9
        L_0x033f:
            if (r2 == 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r2 = r5[r3]
        L_0x0344:
            if (r4 == 0) goto L_0x0347
            goto L_0x034a
        L_0x0347:
            r3 = 2
            r4 = r5[r3]
        L_0x034a:
            if (r6 == 0) goto L_0x034d
            goto L_0x0350
        L_0x034d:
            r3 = 3
            r6 = r5[r3]
        L_0x0350:
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r4, r6)
        L_0x0353:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x037d
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0371
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x0371
            java.lang.ThreadLocal<android.util.TypedValue> r4 = p051i.C1021a.f3740a
            android.content.res.ColorStateList r3 = r10.getColorStateList(r3)
            if (r3 == 0) goto L_0x0371
            goto L_0x0375
        L_0x0371:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x0375:
            android.widget.TextView r2 = r0.f674a
            java.util.Objects.requireNonNull(r2)
            r2.setCompoundDrawableTintList(r3)
        L_0x037d:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0398
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r4 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0169i0.m488b(r2, r4)
            android.widget.TextView r4 = r0.f674a
            java.util.Objects.requireNonNull(r4)
            r4.setCompoundDrawableTintMode(r2)
            goto L_0x0399
        L_0x0398:
            r3 = -1
        L_0x0399:
            r2 = 14
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r4 = 17
            int r4 = r1.getDimensionPixelSize(r4, r3)
            r5 = 18
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x03b5
            android.widget.TextView r1 = r0.f674a
            p076m0.C1423d.m4082b(r1, r2)
        L_0x03b5:
            if (r4 == r3) goto L_0x03bc
            android.widget.TextView r1 = r0.f674a
            p076m0.C1423d.m4083c(r1, r4)
        L_0x03bc:
            if (r5 == r3) goto L_0x03c3
            android.widget.TextView r1 = r0.f674a
            p076m0.C1423d.m4084d(r1, r5)
        L_0x03c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0134b0.mo750e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void mo751f(Context context, int i) {
        String m;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0934b.f3480v);
        C0136b1 b1Var = new C0136b1(context, obtainStyledAttributes);
        if (b1Var.mo775o(14)) {
            this.f674a.setAllCaps(b1Var.mo761a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (b1Var.mo775o(0) && b1Var.mo766f(0, -1) == 0) {
            this.f674a.setTextSize(0, 0.0f);
        }
        mo758m(context, b1Var);
        if (i2 >= 26 && b1Var.mo775o(13) && (m = b1Var.mo773m(13)) != null) {
            this.f674a.setFontVariationSettings(m);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f685l;
        if (typeface != null) {
            this.f674a.setTypeface(typeface, this.f683j);
        }
    }

    /* renamed from: g */
    public void mo752g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            Objects.requireNonNull(text);
            if (i >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i2 = editorInfo.initialSelStart;
            int i3 = editorInfo.initialSelEnd;
            int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
            int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
            int length = text.length();
            if (i4 >= 0 && i5 <= length) {
                int i6 = editorInfo.inputType & 4095;
                if (!(i6 == 129 || i6 == 225 || i6 == 18)) {
                    if (length <= 2048) {
                        C1226a.m3491b(editorInfo, text, i4, i5);
                        return;
                    }
                    int i7 = i5 - i4;
                    int i8 = i7 > 1024 ? 0 : i7;
                    int i9 = 2048 - i8;
                    int min = Math.min(text.length() - i5, i9 - Math.min(i4, (int) (((double) i9) * 0.8d)));
                    int min2 = Math.min(i4, i9 - min);
                    int i10 = i4 - min2;
                    if (C1226a.m3490a(text, i10, 0)) {
                        i10++;
                        min2--;
                    }
                    if (C1226a.m3490a(text, (i5 + min) - 1, 1)) {
                        min--;
                    }
                    CharSequence concat = i8 != i7 ? TextUtils.concat(new CharSequence[]{text.subSequence(i10, i10 + min2), text.subSequence(i5, min + i5)}) : text.subSequence(i10, min2 + i8 + min + i10);
                    int i11 = min2 + 0;
                    C1226a.m3491b(editorInfo, concat, i11, i8 + i11);
                    return;
                }
            }
            C1226a.m3491b(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    /* renamed from: h */
    public void mo753h(int i, int i2, int i3, int i4) {
        C0152e0 e0Var = this.f682i;
        if (e0Var.mo879i()) {
            DisplayMetrics displayMetrics = e0Var.f761j.getResources().getDisplayMetrics();
            e0Var.mo880j(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (e0Var.mo877g()) {
                e0Var.mo873a();
            }
        }
    }

    /* renamed from: i */
    public void mo754i(int[] iArr, int i) {
        C0152e0 e0Var = this.f682i;
        if (e0Var.mo879i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e0Var.f761j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                e0Var.f757f = e0Var.mo874b(iArr2);
                if (!e0Var.mo878h()) {
                    StringBuilder a = C0001b.m0a("None of the preset sizes is valid: ");
                    a.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a.toString());
                }
            } else {
                e0Var.f758g = false;
            }
            if (e0Var.mo877g()) {
                e0Var.mo873a();
            }
        }
    }

    /* renamed from: j */
    public void mo755j(int i) {
        C0152e0 e0Var = this.f682i;
        if (!e0Var.mo879i()) {
            return;
        }
        if (i == 0) {
            e0Var.f752a = 0;
            e0Var.f755d = -1.0f;
            e0Var.f756e = -1.0f;
            e0Var.f754c = -1.0f;
            e0Var.f757f = new int[0];
            e0Var.f753b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = e0Var.f761j.getResources().getDisplayMetrics();
            e0Var.mo880j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e0Var.mo877g()) {
                e0Var.mo873a();
            }
        } else {
            throw new IllegalArgumentException(C0131a0.m344a("Unknown auto-size text type: ", i));
        }
    }

    /* renamed from: k */
    public void mo756k(ColorStateList colorStateList) {
        if (this.f681h == null) {
            this.f681h = new C0232z0();
        }
        C0232z0 z0Var = this.f681h;
        z0Var.f1004a = colorStateList;
        z0Var.f1007d = colorStateList != null;
        this.f675b = z0Var;
        this.f676c = z0Var;
        this.f677d = z0Var;
        this.f678e = z0Var;
        this.f679f = z0Var;
        this.f680g = z0Var;
    }

    /* renamed from: l */
    public void mo757l(PorterDuff.Mode mode) {
        if (this.f681h == null) {
            this.f681h = new C0232z0();
        }
        C0232z0 z0Var = this.f681h;
        z0Var.f1005b = mode;
        z0Var.f1006c = mode != null;
        this.f675b = z0Var;
        this.f676c = z0Var;
        this.f677d = z0Var;
        this.f678e = z0Var;
        this.f679f = z0Var;
        this.f680g = z0Var;
    }

    /* renamed from: m */
    public final void mo758m(Context context, C0136b1 b1Var) {
        String m;
        Typeface typeface;
        Typeface typeface2;
        this.f683j = b1Var.mo770j(2, this.f683j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int j = b1Var.mo770j(11, -1);
            this.f684k = j;
            if (j != -1) {
                this.f683j = (this.f683j & 2) | 0;
            }
        }
        int i2 = 10;
        if (b1Var.mo775o(10) || b1Var.mo775o(12)) {
            this.f685l = null;
            if (b1Var.mo775o(12)) {
                i2 = 12;
            }
            int i3 = this.f684k;
            int i4 = this.f683j;
            if (!context.isRestricted()) {
                try {
                    Typeface i5 = b1Var.mo769i(i2, this.f683j, new C0135a(i3, i4, new WeakReference(this.f674a)));
                    if (i5 != null) {
                        if (i >= 28 && this.f684k != -1) {
                            i5 = Typeface.create(Typeface.create(i5, 0), this.f684k, (this.f683j & 2) != 0);
                        }
                        this.f685l = i5;
                    }
                    this.f686m = this.f685l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f685l == null && (m = b1Var.mo773m(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f684k == -1) {
                    typeface = Typeface.create(m, this.f683j);
                } else {
                    Typeface create = Typeface.create(m, 0);
                    int i6 = this.f684k;
                    if ((this.f683j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.f685l = typeface;
            }
        } else if (b1Var.mo775o(1)) {
            this.f686m = false;
            int j2 = b1Var.mo770j(1, 1);
            if (j2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f685l = typeface2;
        }
    }
}
