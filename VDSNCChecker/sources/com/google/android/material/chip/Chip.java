package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0165h;
import com.google.android.material.chip.C0722a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p022d0.C0793a;
import p042g2.C0955a;
import p046h0.C1000a;
import p051i.C1021a;
import p054i2.C1033f;
import p058j0.C1061o;
import p058j0.C1070q;
import p060j2.C1091a;
import p064k0.C1150b;
import p072l2.C1242f;
import p072l2.C1247i;
import p072l2.C1261m;
import p075m.C1417c;
import p089o1.C1500g;
import p094p0.C1560a;

public class Chip extends C0165h implements C0722a.C0723a, C1261m {

    /* renamed from: x */
    public static final Rect f2705x = new Rect();

    /* renamed from: y */
    public static final int[] f2706y = {16842913};

    /* renamed from: z */
    public static final int[] f2707z = {16842911};

    /* renamed from: h */
    public C0722a f2708h;

    /* renamed from: i */
    public InsetDrawable f2709i;

    /* renamed from: j */
    public RippleDrawable f2710j;

    /* renamed from: k */
    public View.OnClickListener f2711k;

    /* renamed from: l */
    public CompoundButton.OnCheckedChangeListener f2712l;

    /* renamed from: m */
    public boolean f2713m;

    /* renamed from: n */
    public boolean f2714n;

    /* renamed from: o */
    public boolean f2715o;

    /* renamed from: p */
    public boolean f2716p;

    /* renamed from: q */
    public boolean f2717q;

    /* renamed from: r */
    public int f2718r;

    /* renamed from: s */
    public int f2719s;

    /* renamed from: t */
    public final C0716b f2720t;

    /* renamed from: u */
    public final Rect f2721u = new Rect();

    /* renamed from: v */
    public final RectF f2722v = new RectF();

    /* renamed from: w */
    public final C1417c f2723w = new C0715a();

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C0715a extends C1417c {
        public C0715a() {
            super(2);
        }

        /* renamed from: g */
        public void mo3467g(int i) {
        }

        /* renamed from: h */
        public void mo3468h(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            C0722a aVar = chip.f2708h;
            if (aVar.f2754H0) {
                charSequence = aVar.f2755I;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C0716b extends C1560a {
        public C0716b(Chip chip) {
            super(chip);
        }

        /* renamed from: m */
        public void mo3469m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f2705x;
            if (chip.mo3327e()) {
                Chip chip2 = Chip.this;
                C0722a aVar = chip2.f2708h;
                if (aVar != null && aVar.f2763O) {
                    z = true;
                }
                if (z && chip2.f2711k != null) {
                    list.add(1);
                }
            }
        }

        /* renamed from: p */
        public boolean mo3470p(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f2711k;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f2720t.mo5644u(1, 1);
                }
            }
            return z;
        }

        /* renamed from: q */
        public void mo3471q(C1150b bVar) {
            bVar.f4005a.setCheckable(Chip.this.mo3328f());
            bVar.f4005a.setClickable(Chip.this.isClickable());
            if (Chip.this.mo3328f() || Chip.this.isClickable()) {
                bVar.f4005a.setClassName(Chip.this.mo3328f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                bVar.f4005a.setClassName("android.view.View");
            }
            bVar.f4005a.setText(Chip.this.getText());
        }

        /* renamed from: r */
        public void mo3472r(int i, C1150b bVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                bVar.f4005a.setContentDescription(closeIconContentDescription);
                bVar.f4005a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                bVar.mo4760a(C1150b.C1151a.f4008e);
                bVar.f4005a.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.f4005a.setContentDescription(charSequence);
            bVar.f4005a.setBoundsInParent(Chip.f2705x);
        }

        /* renamed from: s */
        public void mo3473s(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f2716p = z;
                chip.refreshDrawableState();
            }
        }

        /* renamed from: w */
        public int mo3474w(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.f2705x;
            return (!chip.mo3327e() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010a, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x032b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2131952290(0x7f1302a2, float:1.9541019E38)
            r9 = 2130903224(0x7f0300b8, float:1.741326E38)
            r1 = r19
            android.content.Context r1 = p096p2.C1578a.m4424a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2721u = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2722v = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f2723w = r1
            android.content.Context r10 = r18.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0033
            goto L_0x0081
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0353
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x034b
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0345
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x033f
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0337
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0337
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0337
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0337
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r12)
        L_0x0081:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r9, r8)
            android.content.Context r1 = r13.f2783i0
            int[] r14 = p083n1.C1455a.f4565c
            r15 = 0
            int[] r6 = new int[r15]
            r5 = 2131952290(0x7f1302a2, float:1.9541019E38)
            r4 = 2130903224(0x7f0300b8, float:1.741326E38)
            r2 = r20
            r3 = r14
            android.content.res.TypedArray r1 = p036f2.C0903k.m2662d(r1, r2, r3, r4, r5, r6)
            r6 = 37
            boolean r2 = r1.hasValue(r6)
            r13.f2758J0 = r2
            android.content.Context r2 = r13.f2783i0
            r3 = 24
            android.content.res.ColorStateList r2 = p054i2.C1030c.m2956a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.f2741B
            if (r3 == r2) goto L_0x00b7
            r13.f2741B = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00b7:
            android.content.Context r2 = r13.f2783i0
            r3 = 11
            android.content.res.ColorStateList r2 = p054i2.C1030c.m2956a(r2, r1, r3)
            r13.mo3523O(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.mo3530V(r2)
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00db
            float r2 = r1.getDimension(r2, r3)
            r13.mo3524P(r2)
        L_0x00db:
            android.content.Context r2 = r13.f2783i0
            r4 = 22
            android.content.res.ColorStateList r2 = p054i2.C1030c.m2956a(r2, r1, r4)
            r13.mo3532X(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r3)
            r13.mo3533Y(r2)
            android.content.Context r2 = r13.f2783i0
            r4 = 36
            android.content.res.ColorStateList r2 = p054i2.C1030c.m2956a(r2, r1, r4)
            r13.mo3551i0(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.mo3554j0(r2)
            android.content.Context r2 = r13.f2783i0
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L_0x0116
            int r4 = r1.getResourceId(r15, r15)
            if (r4 == 0) goto L_0x0116
            i2.f r5 = new i2.f
            r5.<init>(r2, r4)
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            float r2 = r5.f3765k
            float r2 = r1.getDimension(r11, r2)
            r5.f3765k = r2
            r13.mo3555k0(r5)
            r2 = 3
            int r4 = r1.getInt(r2, r15)
            if (r4 == r11) goto L_0x0135
            r5 = 2
            if (r4 == r5) goto L_0x0132
            if (r4 == r2) goto L_0x012f
            goto L_0x0139
        L_0x012f:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x0137
        L_0x0132:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0137
        L_0x0135:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x0137:
            r13.f2752G0 = r2
        L_0x0139:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo3529U(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x015f
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x015f
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x015f
            r4 = 15
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo3529U(r4)
        L_0x015f:
            android.content.Context r4 = r13.f2783i0
            r5 = 14
            android.graphics.drawable.Drawable r4 = p054i2.C1030c.m2958c(r4, r1, r5)
            r13.mo3526R(r4)
            r4 = 17
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x017b
            android.content.Context r5 = r13.f2783i0
            android.content.res.ColorStateList r4 = p054i2.C1030c.m2956a(r5, r1, r4)
            r13.mo3528T(r4)
        L_0x017b:
            r4 = 16
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r13.mo3527S(r4)
            r4 = 31
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo3542f0(r4)
            if (r7 == 0) goto L_0x01aa
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01aa
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01aa
            r4 = 26
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo3542f0(r4)
        L_0x01aa:
            android.content.Context r4 = r13.f2783i0
            r5 = 25
            android.graphics.drawable.Drawable r4 = p054i2.C1030c.m2958c(r4, r1, r5)
            r13.mo3534Z(r4)
            android.content.Context r4 = r13.f2783i0
            r5 = 30
            android.content.res.ColorStateList r4 = p054i2.C1030c.m2956a(r4, r1, r5)
            r13.mo3541e0(r4)
            r4 = 28
            float r4 = r1.getDimension(r4, r3)
            r13.mo3537b0(r4)
            r4 = 6
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo3519K(r4)
            r4 = 10
            boolean r4 = r1.getBoolean(r4, r15)
            r13.mo3522N(r4)
            if (r7 == 0) goto L_0x01f5
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01f5
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x01f5
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo3522N(r2)
        L_0x01f5:
            android.content.Context r2 = r13.f2783i0
            r4 = 7
            android.graphics.drawable.Drawable r2 = p054i2.C1030c.m2958c(r2, r1, r4)
            r13.mo3520L(r2)
            r2 = 9
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0210
            android.content.Context r4 = r13.f2783i0
            android.content.res.ColorStateList r2 = p054i2.C1030c.m2956a(r4, r1, r2)
            r13.mo3521M(r2)
        L_0x0210:
            android.content.Context r2 = r13.f2783i0
            r4 = 39
            o1.g r2 = p089o1.C1500g.m4194a(r2, r1, r4)
            r13.f2773Y = r2
            android.content.Context r2 = r13.f2783i0
            r4 = 33
            o1.g r2 = p089o1.C1500g.m4194a(r2, r1, r4)
            r13.f2774Z = r2
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            r13.mo3531W(r2)
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r13.mo3550h0(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r13.mo3543g0(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            r13.mo3557m0(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r13.mo3556l0(r2)
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r13.mo3538c0(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r13.mo3536a0(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            r13.mo3525Q(r2)
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.f2756I0 = r2
            r1.recycle()
            int[] r5 = new int[r15]
            p036f2.C0903k.m2659a(r10, r7, r9, r8)
            r16 = 2131952290(0x7f1302a2, float:1.9541019E38)
            r4 = 2130903224(0x7f0300b8, float:1.741326E38)
            r1 = r10
            r2 = r20
            r3 = r14
            r17 = r5
            r5 = r16
            r12 = r6
            r6 = r17
            p036f2.C0903k.m2660b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f2717q = r2
            android.content.Context r2 = r18.getContext()
            r3 = 48
            android.content.res.Resources r2 = r2.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r11, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f2719s = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = r18.getElevation()
            r13.mo4974o(r1)
            int[] r6 = new int[r15]
            p036f2.C0903k.m2659a(r10, r7, r9, r8)
            r5 = 2131952290(0x7f1302a2, float:1.9541019E38)
            r1 = r10
            r2 = r20
            r3 = r14
            p036f2.C0903k.m2660b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            boolean r2 = r1.hasValue(r12)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f2720t = r1
            r18.mo3361h()
            if (r2 != 0) goto L_0x0300
            w1.a r1 = new w1.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0300:
            boolean r1 = r0.f2713m
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.f2755I
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.f2752G0
            r0.setEllipsize(r1)
            r18.mo3364k()
            com.google.android.material.chip.a r1 = r0.f2708h
            boolean r1 = r1.f2754H0
            if (r1 != 0) goto L_0x031e
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x031e:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r18.mo3363j()
            boolean r1 = r0.f2717q
            if (r1 == 0) goto L_0x0330
            int r1 = r0.f2719s
            r0.setMinHeight(r1)
        L_0x0330:
            int r1 = r18.getLayoutDirection()
            r0.f2718r = r1
            return
        L_0x0337:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x033f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x0345:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x034b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0353:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f2722v.setEmpty();
        if (mo3327e() && this.f2711k != null) {
            C0722a aVar = this.f2708h;
            aVar.mo3512B(aVar.getBounds(), this.f2722v);
        }
        return this.f2722v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f2721u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f2721u;
    }

    private C1033f getTextAppearance() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2789o0.f3423f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f2715o != z) {
            this.f2715o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f2714n != z) {
            this.f2714n = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void mo3323a() {
        mo3324d(this.f2719s);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r0.right == r7) goto L_0x0069;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3324d(int r10) {
        /*
            r9 = this;
            r9.f2719s = r10
            boolean r0 = r9.f2717q
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r10 = r9.f2709i
            if (r10 == 0) goto L_0x000f
            r9.mo3329g()
            goto L_0x0014
        L_0x000f:
            int[] r10 = p060j2.C1091a.f3859a
            r9.mo3362i()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.a r0 = r9.f2708h
            float r0 = r0.f2745D
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r9.f2708h
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003e
            if (r0 > 0) goto L_0x003e
            android.graphics.drawable.InsetDrawable r10 = r9.f2709i
            if (r10 == 0) goto L_0x0038
            r9.mo3329g()
            goto L_0x003d
        L_0x0038:
            int[] r10 = p060j2.C1091a.f3859a
            r9.mo3362i()
        L_0x003d:
            return r1
        L_0x003e:
            if (r2 <= 0) goto L_0x0044
            int r2 = r2 / 2
            r7 = r2
            goto L_0x0045
        L_0x0044:
            r7 = r1
        L_0x0045:
            if (r0 <= 0) goto L_0x0049
            int r1 = r0 / 2
        L_0x0049:
            r8 = r1
            android.graphics.drawable.InsetDrawable r0 = r9.f2709i
            r1 = 1
            if (r0 == 0) goto L_0x006f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f2709i
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L_0x006f
            int r2 = r0.bottom
            if (r2 != r8) goto L_0x006f
            int r2 = r0.left
            if (r2 != r7) goto L_0x006f
            int r0 = r0.right
            if (r0 != r7) goto L_0x006f
        L_0x0069:
            int[] r10 = p060j2.C1091a.f3859a
            r9.mo3362i()
            return r1
        L_0x006f:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L_0x0078
            r9.setMinHeight(r10)
        L_0x0078:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L_0x0081
            r9.setMinWidth(r10)
        L_0x0081:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.a r4 = r9.f2708h
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f2709i = r10
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo3324d(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.Class<p0.a> r0 = p094p0.C1560a.class
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 10
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x0043
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r1.setAccessible(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r6 = r9.f2720t     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            if (r1 == r2) goto L_0x0043
            java.lang.String r1 = "v"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r6)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.setAccessible(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r1 = r9.f2720t     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.invoke(r1, r6)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0 = r4
            goto L_0x0044
        L_0x0043:
            r0 = r5
        L_0x0044:
            if (r0 != 0) goto L_0x00a3
            com.google.android.material.chip.Chip$b r0 = r9.f2720t
            android.view.accessibility.AccessibilityManager r1 = r0.f4853h
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x0098
            android.view.accessibility.AccessibilityManager r1 = r0.f4853h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x0059
            goto L_0x0098
        L_0x0059:
            int r1 = r10.getAction()
            r6 = 7
            r7 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r1 == r6) goto L_0x007b
            r6 = 9
            if (r1 == r6) goto L_0x007b
            if (r1 == r3) goto L_0x006b
            goto L_0x0098
        L_0x006b:
            int r1 = r0.f4858m
            if (r1 == r2) goto L_0x0098
            if (r1 != r2) goto L_0x0072
            goto L_0x0096
        L_0x0072:
            r0.f4858m = r2
            r0.mo5644u(r2, r8)
            r0.mo5644u(r1, r7)
            goto L_0x0096
        L_0x007b:
            float r1 = r10.getX()
            float r3 = r10.getY()
            int r1 = r0.mo3474w(r1, r3)
            int r3 = r0.f4858m
            if (r3 != r1) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            r0.f4858m = r1
            r0.mo5644u(r1, r8)
            r0.mo5644u(r3, r7)
        L_0x0094:
            if (r1 == r2) goto L_0x0098
        L_0x0096:
            r0 = r4
            goto L_0x0099
        L_0x0098:
            r0 = r5
        L_0x0099:
            if (r0 != 0) goto L_0x00a3
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r4 = r5
        L_0x00a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0716b bVar = this.f2720t;
        Objects.requireNonNull(bVar);
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && bVar.mo5641n(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = bVar.f4857l;
                    if (i4 != Integer.MIN_VALUE) {
                        bVar.mo3470p(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = bVar.mo5641n(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = bVar.mo5641n(1, (Rect) null);
            }
        }
        if (i == 0 || this.f2720t.f4857l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0722a aVar = this.f2708h;
        int i = 0;
        if (aVar != null && C0722a.m2185H(aVar.f2764P)) {
            C0722a aVar2 = this.f2708h;
            int isEnabled = isEnabled();
            if (this.f2716p) {
                isEnabled++;
            }
            if (this.f2715o) {
                isEnabled++;
            }
            if (this.f2714n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f2716p) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f2715o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f2714n) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = aVar2.mo3539d0(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean mo3327e() {
        C0722a aVar = this.f2708h;
        return (aVar == null || aVar.mo3515E() == null) ? false : true;
    }

    /* renamed from: f */
    public boolean mo3328f() {
        C0722a aVar = this.f2708h;
        return aVar != null && aVar.f2769U;
    }

    /* renamed from: g */
    public final void mo3329g() {
        if (this.f2709i != null) {
            this.f2709i = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = C1091a.f3859a;
            mo3362i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2709i;
        return insetDrawable == null ? this.f2708h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2771W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2772X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2743C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo3514D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2708h;
    }

    public float getChipEndPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2782h0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C0722a aVar = this.f2708h;
        if (aVar == null || (drawable = aVar.f2759K) == null) {
            return null;
        }
        return drawable instanceof C0793a ? ((C0793a) drawable).mo4030a() : drawable;
    }

    public float getChipIconSize() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2761M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2760L;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2745D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2775a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2749F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2751G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.mo3515E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2768T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2781g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2767S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2780f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2766R;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2752G0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        C0716b bVar = this.f2720t;
        if (bVar.f4857l == 1 || bVar.f4856k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1500g getHideMotionSpec() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2774Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2777c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2776b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2753H;
        }
        return null;
    }

    public C1247i getShapeAppearanceModel() {
        return this.f2708h.f4164e.f4187a;
    }

    public C1500g getShowMotionSpec() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2773Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2779e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            return aVar.f2778d0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void mo3361h() {
        C0716b bVar;
        if (mo3327e()) {
            C0722a aVar = this.f2708h;
            if ((aVar != null && aVar.f2763O) && this.f2711k != null) {
                bVar = this.f2720t;
                C1061o.m3034o(this, bVar);
            }
        }
        bVar = null;
        C1061o.m3034o(this, bVar);
    }

    /* renamed from: i */
    public final void mo3362i() {
        this.f2710j = new RippleDrawable(C1091a.m3114a(this.f2708h.f2753H), getBackgroundDrawable(), (Drawable) null);
        this.f2708h.mo3558n0(false);
        RippleDrawable rippleDrawable = this.f2710j;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setBackground(rippleDrawable);
        mo3363j();
    }

    /* renamed from: j */
    public final void mo3363j() {
        C0722a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f2708h) != null) {
            int C = (int) (aVar.mo3513C() + aVar.f2782h0 + aVar.f2779e0);
            C0722a aVar2 = this.f2708h;
            int z = (int) (aVar2.mo3575z() + aVar2.f2775a0 + aVar2.f2778d0);
            if (this.f2709i != null) {
                Rect rect = new Rect();
                this.f2709i.getPadding(rect);
                z += rect.left;
                C += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            setPaddingRelative(z, paddingTop, C, paddingBottom);
        }
    }

    /* renamed from: k */
    public final void mo3364k() {
        TextPaint paint = getPaint();
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C1033f textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo4471e(getContext(), paint, this.f2723w);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0955a.m2721B(this, this.f2708h);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f2706y);
        }
        if (mo3328f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f2707z);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0716b bVar = this.f2720t;
        int i2 = bVar.f4857l;
        if (i2 != Integer.MIN_VALUE) {
            bVar.mo5639k(i2);
        }
        if (z) {
            bVar.mo5641n(i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo3328f() || isClickable()) ? mo3328f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo3328f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.f3403g) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i = i4;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1150b.C1153c.m3389a(i2, 1, i, 1, false, isChecked()).f4021a);
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2718r != i) {
            this.f2718r = i;
            mo3363j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f2714n
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f2714n
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f2711k
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.f2720t
            r0.mo5644u(r3, r3)
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = r3
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2710j) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2710j) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3519K(z);
        }
    }

    public void setCheckableResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3519K(aVar.f2783i0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C0722a aVar = this.f2708h;
        if (aVar == null) {
            this.f2713m = z;
        } else if (aVar.f2769U) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f2712l) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3520L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3520L(C1021a.m2945a(aVar.f2783i0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3521M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3521M(context.getColorStateList(i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3522N(aVar.f2783i0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3522N(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2743C != colorStateList) {
            aVar.f2743C = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3523O(context.getColorStateList(i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3524P(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3524P(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0722a aVar) {
        C0722a aVar2 = this.f2708h;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f2750F0 = new WeakReference<>((Object) null);
            }
            this.f2708h = aVar;
            aVar.f2754H0 = false;
            Objects.requireNonNull(aVar);
            aVar.f2750F0 = new WeakReference<>(this);
            mo3324d(this.f2719s);
        }
    }

    public void setChipEndPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2782h0 != f) {
            aVar.f2782h0 = f;
            aVar.invalidateSelf();
            aVar.mo3517I();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3525Q(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3526R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3526R(C1021a.m2945a(aVar.f2783i0, i));
        }
    }

    public void setChipIconSize(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3527S(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3527S(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3528T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3528T(context.getColorStateList(i));
        }
    }

    public void setChipIconVisible(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3529U(aVar.f2783i0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3529U(z);
        }
    }

    public void setChipMinHeight(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2745D != f) {
            aVar.f2745D = f;
            aVar.invalidateSelf();
            aVar.mo3517I();
        }
    }

    public void setChipMinHeightResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3530V(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2775a0 != f) {
            aVar.f2775a0 = f;
            aVar.invalidateSelf();
            aVar.mo3517I();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3531W(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3532X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3532X(context.getColorStateList(i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3533Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3533Y(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3534Z(drawable);
        }
        mo3361h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2768T != charSequence) {
            C1000a c = C1000a.m2928c();
            aVar.f2768T = c.mo4422d(charSequence, c.f3706c, true);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3536a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3536a0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3534Z(C1021a.m2945a(aVar.f2783i0, i));
        }
        mo3361h();
    }

    public void setCloseIconSize(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3537b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3537b0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3538c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3538c0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3541e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3541e0(context.getColorStateList(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3542f0(z);
        }
        mo3361h();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            C1242f.C1244b bVar = aVar.f4164e;
            if (bVar.f4201o != f) {
                bVar.f4201o = f;
                aVar.mo4984w();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2708h != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C0722a aVar = this.f2708h;
                if (aVar != null) {
                    aVar.f2752G0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f2717q = z;
        mo3324d(this.f2719s);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1500g gVar) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.f2774Z = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.f2774Z = C1500g.m4195b(aVar.f2783i0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3543g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3543g0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3550h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3550h0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f2708h != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.f2756I0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2712l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2711k = onClickListener;
        mo3361h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3551i0(colorStateList);
        }
        if (!this.f2708h.f2746D0) {
            mo3362i();
        }
    }

    public void setRippleColorResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            Context context = aVar.f2783i0;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            aVar.mo3551i0(context.getColorStateList(i));
            if (!this.f2708h.f2746D0) {
                mo3362i();
            }
        }
    }

    public void setShapeAppearanceModel(C1247i iVar) {
        C0722a aVar = this.f2708h;
        aVar.f4164e.f4187a = iVar;
        aVar.invalidateSelf();
    }

    public void setShowMotionSpec(C1500g gVar) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.f2773Y = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.f2773Y = C1500g.m4195b(aVar.f2783i0, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.f2754H0 ? null : charSequence, bufferType);
            C0722a aVar2 = this.f2708h;
            if (aVar2 != null) {
                aVar2.mo3554j0(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3555k0(new C1033f(aVar.f2783i0, i));
        }
        mo3364k();
    }

    public void setTextAppearance(C1033f fVar) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3555k0(fVar);
        }
        mo3364k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2779e0 != f) {
            aVar.f2779e0 = f;
            aVar.invalidateSelf();
            aVar.mo3517I();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3556l0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C0722a aVar = this.f2708h;
        if (aVar != null && aVar.f2778d0 != f) {
            aVar.f2778d0 = f;
            aVar.invalidateSelf();
            aVar.mo3517I();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3557m0(aVar.f2783i0.getResources().getDimension(i));
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0722a aVar = this.f2708h;
        if (aVar != null) {
            aVar.mo3555k0(new C1033f(aVar.f2783i0, i));
        }
        mo3364k();
    }
}
