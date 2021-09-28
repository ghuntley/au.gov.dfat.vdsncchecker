package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p018c2.C0624a;
import p036f2.C0902j;
import p051i.C1021a;
import p054i2.C1029b;
import p064k0.C1150b;
import p072l2.C1237a;
import p072l2.C1242f;
import p072l2.C1247i;
import p089o1.C1494a;
import p090o2.C1510g;
import p090o2.C1513j;
import p090o2.C1514k;

/* renamed from: com.google.android.material.textfield.b */
public class C0762b extends C1514k {

    /* renamed from: d */
    public final TextWatcher f3002d = new C0763a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f3003e = new C0765b();

    /* renamed from: f */
    public final TextInputLayout.C0750e f3004f = new C0766c(this.f4683a);

    /* renamed from: g */
    public final TextInputLayout.C0751f f3005g = new C0767d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    public final TextInputLayout.C0752g f3006h = new C0768e();

    /* renamed from: i */
    public boolean f3007i = false;

    /* renamed from: j */
    public boolean f3008j = false;

    /* renamed from: k */
    public long f3009k = Long.MAX_VALUE;

    /* renamed from: l */
    public StateListDrawable f3010l;

    /* renamed from: m */
    public C1242f f3011m;

    /* renamed from: n */
    public AccessibilityManager f3012n;

    /* renamed from: o */
    public ValueAnimator f3013o;

    /* renamed from: p */
    public ValueAnimator f3014p;

    /* renamed from: com.google.android.material.textfield.b$a */
    public class C0763a extends C0902j {

        /* renamed from: com.google.android.material.textfield.b$a$a */
        public class C0764a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ AutoCompleteTextView f3016e;

            public C0764a(AutoCompleteTextView autoCompleteTextView) {
                this.f3016e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f3016e.isPopupShowing();
                C0762b.m2338f(C0762b.this, isPopupShowing);
                C0762b.this.f3007i = isPopupShowing;
            }
        }

        public C0763a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d = C0762b.m2336d(C0762b.this.f4683a.getEditText());
            if (C0762b.this.f3012n.isTouchExplorationEnabled() && C0762b.m2337e(d) && !C0762b.this.f4685c.hasFocus()) {
                d.dismissDropDown();
            }
            d.post(new C0764a(d));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    public class C0765b implements View.OnFocusChangeListener {
        public C0765b() {
        }

        public void onFocusChange(View view, boolean z) {
            C0762b.this.f4683a.setEndIconActivated(z);
            if (!z) {
                C0762b.m2338f(C0762b.this, false);
                C0762b.this.f3007i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$c */
    public class C0766c extends TextInputLayout.C0750e {
        public C0766c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            boolean z;
            super.mo1508d(view, bVar);
            if (!C0762b.m2337e(C0762b.this.f4683a.getEditText())) {
                bVar.f4005a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = bVar.f4005a.isShowingHintText();
            } else {
                Bundle f = bVar.mo4764f();
                z = f != null && (f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                bVar.mo4770k((CharSequence) null);
            }
        }

        /* renamed from: e */
        public void mo2446e(View view, AccessibilityEvent accessibilityEvent) {
            this.f3779a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d = C0762b.m2336d(C0762b.this.f4683a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C0762b.this.f3012n.isTouchExplorationEnabled() && !C0762b.m2337e(C0762b.this.f4683a.getEditText())) {
                C0762b.m2339g(C0762b.this, d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$d */
    public class C0767d implements TextInputLayout.C0751f {
        public C0767d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3956a(com.google.android.material.textfield.TextInputLayout r12) {
            /*
                r11 = this;
                android.widget.EditText r0 = r12.getEditText()
                android.widget.AutoCompleteTextView r0 = com.google.android.material.textfield.C0762b.m2336d(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.C0762b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f4683a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L_0x0017
                l2.f r1 = r1.f3011m
                goto L_0x001b
            L_0x0017:
                if (r2 != r4) goto L_0x001e
                android.graphics.drawable.StateListDrawable r1 = r1.f3010l
            L_0x001b:
                r0.setDropDownBackgroundDrawable(r1)
            L_0x001e:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.C0762b.this
                java.util.Objects.requireNonNull(r1)
                android.text.method.KeyListener r2 = r0.getKeyListener()
                r5 = 0
                if (r2 == 0) goto L_0x002c
                r2 = r4
                goto L_0x002d
            L_0x002c:
                r2 = r5
            L_0x002d:
                if (r2 == 0) goto L_0x0031
                goto L_0x00cc
            L_0x0031:
                com.google.android.material.textfield.TextInputLayout r2 = r1.f4683a
                int r2 = r2.getBoxBackgroundMode()
                com.google.android.material.textfield.TextInputLayout r6 = r1.f4683a
                l2.f r6 = r6.getBoxBackground()
                r7 = 2130903258(0x7f0300da, float:1.7413329E38)
                int r7 = p136w0.C2036r.m5365c(r0, r7)
                int[][] r8 = new int[r3][]
                int[] r9 = new int[r4]
                r10 = 16842919(0x10100a7, float:2.3694026E-38)
                r9[r5] = r10
                r8[r5] = r9
                int[] r9 = new int[r5]
                r8[r4] = r9
                r9 = 1036831949(0x3dcccccd, float:0.1)
                if (r2 != r3) goto L_0x00ab
                r1 = 2130903273(0x7f0300e9, float:1.741336E38)
                int r1 = p136w0.C2036r.m5365c(r0, r1)
                l2.f r2 = new l2.f
                l2.f$b r10 = r6.f4164e
                l2.i r10 = r10.f4187a
                r2.<init>((p072l2.C1247i) r10)
                int r7 = p136w0.C2036r.m5371i(r7, r1, r9)
                int[] r9 = new int[r3]
                r9[r5] = r7
                r9[r4] = r5
                android.content.res.ColorStateList r10 = new android.content.res.ColorStateList
                r10.<init>(r8, r9)
                r2.mo4976p(r10)
                r2.setTint(r1)
                int[] r9 = new int[r3]
                r9[r5] = r7
                r9[r4] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r9)
                l2.f r7 = new l2.f
                l2.f$b r8 = r6.f4164e
                l2.i r8 = r8.f4187a
                r7.<init>((p072l2.C1247i) r8)
                r8 = -1
                r7.setTint(r8)
                android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
                r8.<init>(r1, r2, r7)
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r3]
                r1[r5] = r8
                r1[r4] = r6
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r2.<init>(r1)
                java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
                r0.setBackground(r2)
                goto L_0x00cc
            L_0x00ab:
                if (r2 != r4) goto L_0x00cc
                com.google.android.material.textfield.TextInputLayout r1 = r1.f4683a
                int r1 = r1.getBoxBackgroundColor()
                int r2 = p136w0.C2036r.m5371i(r7, r1, r9)
                int[] r7 = new int[r3]
                r7[r5] = r2
                r7[r4] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r7)
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                r2.<init>(r1, r6, r6)
                java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
                r0.setBackground(r2)
            L_0x00cc:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.C0762b.this
                java.util.Objects.requireNonNull(r1)
                o2.h r2 = new o2.h
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                android.view.View$OnFocusChangeListener r2 = r1.f3003e
                r0.setOnFocusChangeListener(r2)
                o2.i r2 = new o2.i
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r0.setThreshold(r5)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.C0762b.this
                android.text.TextWatcher r1 = r1.f3002d
                r0.removeTextChangedListener(r1)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.C0762b.this
                android.text.TextWatcher r1 = r1.f3002d
                r0.addTextChangedListener(r1)
                r12.setEndIconCheckable(r4)
                r1 = 0
                r12.setErrorIconDrawable((android.graphics.drawable.Drawable) r1)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L_0x0105
                r5 = r4
            L_0x0105:
                if (r5 != 0) goto L_0x0110
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.C0762b.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f4685c
                java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
                r0.setImportantForAccessibility(r3)
            L_0x0110:
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.C0762b.this
                com.google.android.material.textfield.TextInputLayout$e r0 = r0.f3004f
                r12.setTextInputAccessibilityDelegate(r0)
                r12.setEndIconVisible(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.C0762b.C0767d.mo3956a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: com.google.android.material.textfield.b$e */
    public class C0768e implements TextInputLayout.C0752g {

        /* renamed from: com.google.android.material.textfield.b$e$a */
        public class C0769a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ AutoCompleteTextView f3022e;

            public C0769a(AutoCompleteTextView autoCompleteTextView) {
                this.f3022e = autoCompleteTextView;
            }

            public void run() {
                this.f3022e.removeTextChangedListener(C0762b.this.f3002d);
            }
        }

        public C0768e() {
        }

        /* renamed from: a */
        public void mo3957a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C0769a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C0762b.this.f3003e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$f */
    public class C0770f implements View.OnClickListener {
        public C0770f() {
        }

        public void onClick(View view) {
            C0762b.m2339g(C0762b.this, (AutoCompleteTextView) C0762b.this.f4683a.getEditText());
        }
    }

    public C0762b(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: d */
    public static AutoCompleteTextView m2336d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: e */
    public static boolean m2337e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* renamed from: f */
    public static void m2338f(C0762b bVar, boolean z) {
        if (bVar.f3008j != z) {
            bVar.f3008j = z;
            bVar.f3014p.cancel();
            bVar.f3013o.start();
        }
    }

    /* renamed from: g */
    public static void m2339g(C0762b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView != null) {
            if (bVar.mo3973i()) {
                bVar.f3007i = false;
            }
            if (!bVar.f3007i) {
                boolean z = bVar.f3008j;
                boolean z2 = !z;
                if (z != z2) {
                    bVar.f3008j = z2;
                    bVar.f3014p.cancel();
                    bVar.f3013o.start();
                }
                if (bVar.f3008j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            bVar.f3007i = false;
        }
    }

    /* renamed from: a */
    public void mo3962a() {
        float dimensionPixelOffset = (float) this.f4684b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f4684b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4684b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1242f h = mo3972h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1242f h2 = mo3972h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3011m = h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3010l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, h);
        this.f3010l.addState(new int[0], h2);
        this.f4683a.setEndIconDrawable(C1021a.m2945a(this.f4684b, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f4683a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f4683a.setEndIconOnClickListener(new C0770f());
        this.f4683a.mo3783a(this.f3005g);
        TextInputLayout textInputLayout2 = this.f4683a;
        textInputLayout2.f2952m0.add(this.f3006h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = C1494a.f4652a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new C1510g(this));
        this.f3014p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new C1510g(this));
        this.f3013o = ofFloat2;
        ofFloat2.addListener(new C1513j(this));
        this.f3012n = (AccessibilityManager) this.f4684b.getSystemService("accessibility");
    }

    /* renamed from: b */
    public boolean mo3971b(int i) {
        return i != 0;
    }

    /* renamed from: h */
    public final C1242f mo3972h(float f, float f2, float f3, int i) {
        C1247i.C1249b bVar = new C1247i.C1249b();
        bVar.f4226e = new C1237a(f);
        bVar.f4227f = new C1237a(f);
        bVar.f4229h = new C1237a(f2);
        bVar.f4228g = new C1237a(f2);
        C1247i a = bVar.mo4991a();
        Context context = this.f4684b;
        Paint paint = C1242f.f4163A;
        int c = C1029b.m2955c(context, R.attr.colorSurface, C1242f.class.getSimpleName());
        C1242f fVar = new C1242f();
        fVar.f4164e.f4188b = new C0624a(context);
        fVar.mo4984w();
        fVar.mo4976p(ColorStateList.valueOf(c));
        C1242f.C1244b bVar2 = fVar.f4164e;
        if (bVar2.f4201o != f3) {
            bVar2.f4201o = f3;
            fVar.mo4984w();
        }
        fVar.f4164e.f4187a = a;
        fVar.invalidateSelf();
        C1242f.C1244b bVar3 = fVar.f4164e;
        if (bVar3.f4195i == null) {
            bVar3.f4195i = new Rect();
        }
        fVar.f4164e.f4195i.set(0, i, 0, i);
        fVar.invalidateSelf();
        return fVar;
    }

    /* renamed from: i */
    public final boolean mo3973i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f3009k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
