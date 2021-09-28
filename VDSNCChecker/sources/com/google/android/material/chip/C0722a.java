package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p012b2.C0539a;
import p016c0.C0557a;
import p018c2.C0624a;
import p022d0.C0793a;
import p036f2.C0899i;
import p054i2.C1033f;
import p060j2.C1091a;
import p072l2.C1242f;
import p072l2.C1247i;
import p089o1.C1500g;

/* renamed from: com.google.android.material.chip.a */
public class C0722a extends C1242f implements Drawable.Callback, C0899i.C0901b {

    /* renamed from: K0 */
    public static final int[] f2738K0 = {16842910};

    /* renamed from: L0 */
    public static final ShapeDrawable f2739L0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    public ColorStateList f2740A0;

    /* renamed from: B */
    public ColorStateList f2741B;

    /* renamed from: B0 */
    public PorterDuff.Mode f2742B0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: C */
    public ColorStateList f2743C;

    /* renamed from: C0 */
    public int[] f2744C0;

    /* renamed from: D */
    public float f2745D;

    /* renamed from: D0 */
    public boolean f2746D0;

    /* renamed from: E */
    public float f2747E = -1.0f;

    /* renamed from: E0 */
    public ColorStateList f2748E0;

    /* renamed from: F */
    public ColorStateList f2749F;

    /* renamed from: F0 */
    public WeakReference<C0723a> f2750F0 = new WeakReference<>((Object) null);

    /* renamed from: G */
    public float f2751G;

    /* renamed from: G0 */
    public TextUtils.TruncateAt f2752G0;

    /* renamed from: H */
    public ColorStateList f2753H;

    /* renamed from: H0 */
    public boolean f2754H0;

    /* renamed from: I */
    public CharSequence f2755I;

    /* renamed from: I0 */
    public int f2756I0;

    /* renamed from: J */
    public boolean f2757J;

    /* renamed from: J0 */
    public boolean f2758J0;

    /* renamed from: K */
    public Drawable f2759K;

    /* renamed from: L */
    public ColorStateList f2760L;

    /* renamed from: M */
    public float f2761M;

    /* renamed from: N */
    public boolean f2762N;

    /* renamed from: O */
    public boolean f2763O;

    /* renamed from: P */
    public Drawable f2764P;

    /* renamed from: Q */
    public Drawable f2765Q;

    /* renamed from: R */
    public ColorStateList f2766R;

    /* renamed from: S */
    public float f2767S;

    /* renamed from: T */
    public CharSequence f2768T;

    /* renamed from: U */
    public boolean f2769U;

    /* renamed from: V */
    public boolean f2770V;

    /* renamed from: W */
    public Drawable f2771W;

    /* renamed from: X */
    public ColorStateList f2772X;

    /* renamed from: Y */
    public C1500g f2773Y;

    /* renamed from: Z */
    public C1500g f2774Z;

    /* renamed from: a0 */
    public float f2775a0;

    /* renamed from: b0 */
    public float f2776b0;

    /* renamed from: c0 */
    public float f2777c0;

    /* renamed from: d0 */
    public float f2778d0;

    /* renamed from: e0 */
    public float f2779e0;

    /* renamed from: f0 */
    public float f2780f0;

    /* renamed from: g0 */
    public float f2781g0;

    /* renamed from: h0 */
    public float f2782h0;

    /* renamed from: i0 */
    public final Context f2783i0;

    /* renamed from: j0 */
    public final Paint f2784j0 = new Paint(1);

    /* renamed from: k0 */
    public final Paint.FontMetrics f2785k0 = new Paint.FontMetrics();

    /* renamed from: l0 */
    public final RectF f2786l0 = new RectF();

    /* renamed from: m0 */
    public final PointF f2787m0 = new PointF();

    /* renamed from: n0 */
    public final Path f2788n0 = new Path();

    /* renamed from: o0 */
    public final C0899i f2789o0;

    /* renamed from: p0 */
    public int f2790p0;

    /* renamed from: q0 */
    public int f2791q0;

    /* renamed from: r0 */
    public int f2792r0;

    /* renamed from: s0 */
    public int f2793s0;

    /* renamed from: t0 */
    public int f2794t0;

    /* renamed from: u0 */
    public int f2795u0;

    /* renamed from: v0 */
    public boolean f2796v0;

    /* renamed from: w0 */
    public int f2797w0;

    /* renamed from: x0 */
    public int f2798x0 = 255;

    /* renamed from: y0 */
    public ColorFilter f2799y0;

    /* renamed from: z0 */
    public PorterDuffColorFilter f2800z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C0723a {
        /* renamed from: a */
        void mo3323a();
    }

    public C0722a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C1247i.m3551b(context, attributeSet, i, i2).mo4991a());
        this.f4164e.f4188b = new C0624a(context);
        mo4984w();
        this.f2783i0 = context;
        C0899i iVar = new C0899i(this);
        this.f2789o0 = iVar;
        this.f2755I = "";
        iVar.f3418a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2738K0;
        setState(iArr);
        mo3539d0(iArr);
        this.f2754H0 = true;
        int[] iArr2 = C1091a.f3859a;
        f2739L0.setTint(-1);
    }

    /* renamed from: G */
    public static boolean m2184G(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: H */
    public static boolean m2185H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void mo3511A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo3564q0()) {
            float f = this.f2782h0 + this.f2781g0;
            if (getLayoutDirection() == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f2767S;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f2767S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f2767S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: B */
    public final void mo3512B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo3564q0()) {
            float f = this.f2782h0 + this.f2781g0 + this.f2767S + this.f2780f0 + this.f2779e0;
            if (getLayoutDirection() == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: C */
    public float mo3513C() {
        if (mo3564q0()) {
            return this.f2780f0 + this.f2767S + this.f2781g0;
        }
        return 0.0f;
    }

    /* renamed from: D */
    public float mo3514D() {
        return this.f2758J0 ? mo4970l() : this.f2747E;
    }

    /* renamed from: E */
    public Drawable mo3515E() {
        Drawable drawable = this.f2764P;
        if (drawable != null) {
            return drawable instanceof C0793a ? ((C0793a) drawable).mo4030a() : drawable;
        }
        return null;
    }

    /* renamed from: F */
    public final float mo3516F() {
        Drawable drawable = this.f2796v0 ? this.f2771W : this.f2759K;
        float f = this.f2761M;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: I */
    public void mo3517I() {
        C0723a aVar = (C0723a) this.f2750F0.get();
        if (aVar != null) {
            aVar.mo3323a();
        }
    }

    /* renamed from: J */
    public final boolean mo3518J(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f2741B;
        int e = mo4959e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2790p0) : 0);
        boolean z3 = true;
        if (this.f2790p0 != e) {
            this.f2790p0 = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2743C;
        int e2 = mo4959e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2791q0) : 0);
        if (this.f2791q0 != e2) {
            this.f2791q0 = e2;
            onStateChange = true;
        }
        int a = C0557a.m1817a(e2, e);
        if ((this.f2792r0 != a) || (this.f4164e.f4190d == null)) {
            this.f2792r0 = a;
            mo4976p(ColorStateList.valueOf(a));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f2749F;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2793s0) : 0;
        if (this.f2793s0 != colorForState) {
            this.f2793s0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f2748E0 == null || !C1091a.m3115b(iArr)) ? 0 : this.f2748E0.getColorForState(iArr, this.f2794t0);
        if (this.f2794t0 != colorForState2) {
            this.f2794t0 = colorForState2;
            if (this.f2746D0) {
                onStateChange = true;
            }
        }
        C1033f fVar = this.f2789o0.f3423f;
        int colorForState3 = (fVar == null || (colorStateList = fVar.f3755a) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2795u0);
        if (this.f2795u0 != colorForState3) {
            this.f2795u0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] == 16842912) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        boolean z4 = z && this.f2769U;
        if (this.f2796v0 == z4 || this.f2771W == null) {
            z2 = false;
        } else {
            float z5 = mo3575z();
            this.f2796v0 = z4;
            if (z5 != mo3575z()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f2740A0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f2797w0) : 0;
        if (this.f2797w0 != colorForState4) {
            this.f2797w0 = colorForState4;
            this.f2800z0 = C0539a.m1786a(this, this.f2740A0, this.f2742B0);
        } else {
            z3 = onStateChange;
        }
        if (m2185H(this.f2759K)) {
            z3 |= this.f2759K.setState(iArr);
        }
        if (m2185H(this.f2771W)) {
            z3 |= this.f2771W.setState(iArr);
        }
        if (m2185H(this.f2764P)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.f2764P.setState(iArr3);
        }
        int[] iArr4 = C1091a.f3859a;
        if (m2185H(this.f2765Q)) {
            z3 |= this.f2765Q.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            mo3517I();
        }
        return z3;
    }

    /* renamed from: K */
    public void mo3519K(boolean z) {
        if (this.f2769U != z) {
            this.f2769U = z;
            float z2 = mo3575z();
            if (!z && this.f2796v0) {
                this.f2796v0 = false;
            }
            float z3 = mo3575z();
            invalidateSelf();
            if (z2 != z3) {
                mo3517I();
            }
        }
    }

    /* renamed from: L */
    public void mo3520L(Drawable drawable) {
        if (this.f2771W != drawable) {
            float z = mo3575z();
            this.f2771W = drawable;
            float z2 = mo3575z();
            mo3565r0(this.f2771W);
            mo3573x(this.f2771W);
            invalidateSelf();
            if (z != z2) {
                mo3517I();
            }
        }
    }

    /* renamed from: M */
    public void mo3521M(ColorStateList colorStateList) {
        if (this.f2772X != colorStateList) {
            this.f2772X = colorStateList;
            if (this.f2770V && this.f2771W != null && this.f2769U) {
                this.f2771W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public void mo3522N(boolean z) {
        if (this.f2770V != z) {
            boolean o0 = mo3559o0();
            this.f2770V = z;
            boolean o02 = mo3559o0();
            if (o0 != o02) {
                if (o02) {
                    mo3573x(this.f2771W);
                } else {
                    mo3565r0(this.f2771W);
                }
                invalidateSelf();
                mo3517I();
            }
        }
    }

    /* renamed from: O */
    public void mo3523O(ColorStateList colorStateList) {
        if (this.f2743C != colorStateList) {
            this.f2743C = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: P */
    public void mo3524P(float f) {
        if (this.f2747E != f) {
            this.f2747E = f;
            this.f4164e.f4187a = this.f4164e.f4187a.mo4990e(f);
            invalidateSelf();
        }
    }

    /* renamed from: Q */
    public void mo3525Q(float f) {
        if (this.f2782h0 != f) {
            this.f2782h0 = f;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: R */
    public void mo3526R(Drawable drawable) {
        Drawable drawable2 = this.f2759K;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C0793a) {
            drawable2 = ((C0793a) drawable2).mo4030a();
        }
        if (drawable2 != drawable) {
            float z = mo3575z();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2759K = drawable3;
            float z2 = mo3575z();
            mo3565r0(drawable2);
            if (mo3563p0()) {
                mo3573x(this.f2759K);
            }
            invalidateSelf();
            if (z != z2) {
                mo3517I();
            }
        }
    }

    /* renamed from: S */
    public void mo3527S(float f) {
        if (this.f2761M != f) {
            float z = mo3575z();
            this.f2761M = f;
            float z2 = mo3575z();
            invalidateSelf();
            if (z != z2) {
                mo3517I();
            }
        }
    }

    /* renamed from: T */
    public void mo3528T(ColorStateList colorStateList) {
        this.f2762N = true;
        if (this.f2760L != colorStateList) {
            this.f2760L = colorStateList;
            if (mo3563p0()) {
                this.f2759K.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: U */
    public void mo3529U(boolean z) {
        if (this.f2757J != z) {
            boolean p0 = mo3563p0();
            this.f2757J = z;
            boolean p02 = mo3563p0();
            if (p0 != p02) {
                if (p02) {
                    mo3573x(this.f2759K);
                } else {
                    mo3565r0(this.f2759K);
                }
                invalidateSelf();
                mo3517I();
            }
        }
    }

    /* renamed from: V */
    public void mo3530V(float f) {
        if (this.f2745D != f) {
            this.f2745D = f;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: W */
    public void mo3531W(float f) {
        if (this.f2775a0 != f) {
            this.f2775a0 = f;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: X */
    public void mo3532X(ColorStateList colorStateList) {
        if (this.f2749F != colorStateList) {
            this.f2749F = colorStateList;
            if (this.f2758J0) {
                mo4981t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void mo3533Y(float f) {
        if (this.f2751G != f) {
            this.f2751G = f;
            this.f2784j0.setStrokeWidth(f);
            if (this.f2758J0) {
                this.f4164e.f4198l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void mo3534Z(Drawable drawable) {
        Drawable E = mo3515E();
        if (E != drawable) {
            float C = mo3513C();
            this.f2764P = drawable != null ? drawable.mutate() : null;
            int[] iArr = C1091a.f3859a;
            this.f2765Q = new RippleDrawable(C1091a.m3114a(this.f2753H), this.f2764P, f2739L0);
            float C2 = mo3513C();
            mo3565r0(E);
            if (mo3564q0()) {
                mo3573x(this.f2764P);
            }
            invalidateSelf();
            if (C != C2) {
                mo3517I();
            }
        }
    }

    /* renamed from: a */
    public void mo3535a() {
        mo3517I();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo3536a0(float f) {
        if (this.f2781g0 != f) {
            this.f2781g0 = f;
            invalidateSelf();
            if (mo3564q0()) {
                mo3517I();
            }
        }
    }

    /* renamed from: b0 */
    public void mo3537b0(float f) {
        if (this.f2767S != f) {
            this.f2767S = f;
            invalidateSelf();
            if (mo3564q0()) {
                mo3517I();
            }
        }
    }

    /* renamed from: c0 */
    public void mo3538c0(float f) {
        if (this.f2780f0 != f) {
            this.f2780f0 = f;
            invalidateSelf();
            if (mo3564q0()) {
                mo3517I();
            }
        }
    }

    /* renamed from: d0 */
    public boolean mo3539d0(int[] iArr) {
        if (Arrays.equals(this.f2744C0, iArr)) {
            return false;
        }
        this.f2744C0 = iArr;
        if (mo3564q0()) {
            return mo3518J(getState(), iArr);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f2798x0) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            if (!this.f2758J0) {
                this.f2784j0.setColor(this.f2790p0);
                this.f2784j0.setStyle(Paint.Style.FILL);
                this.f2786l0.set(bounds);
                canvas2.drawRoundRect(this.f2786l0, mo3514D(), mo3514D(), this.f2784j0);
            }
            if (!this.f2758J0) {
                this.f2784j0.setColor(this.f2791q0);
                this.f2784j0.setStyle(Paint.Style.FILL);
                Paint paint = this.f2784j0;
                ColorFilter colorFilter = this.f2799y0;
                if (colorFilter == null) {
                    colorFilter = this.f2800z0;
                }
                paint.setColorFilter(colorFilter);
                this.f2786l0.set(bounds);
                canvas2.drawRoundRect(this.f2786l0, mo3514D(), mo3514D(), this.f2784j0);
            }
            if (this.f2758J0) {
                super.draw(canvas);
            }
            if (this.f2751G > 0.0f && !this.f2758J0) {
                this.f2784j0.setColor(this.f2793s0);
                this.f2784j0.setStyle(Paint.Style.STROKE);
                if (!this.f2758J0) {
                    Paint paint2 = this.f2784j0;
                    ColorFilter colorFilter2 = this.f2799y0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f2800z0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f2786l0;
                float f2 = this.f2751G / 2.0f;
                rectF.set(((float) bounds.left) + f2, ((float) bounds.top) + f2, ((float) bounds.right) - f2, ((float) bounds.bottom) - f2);
                float f3 = this.f2747E - (this.f2751G / 2.0f);
                canvas2.drawRoundRect(this.f2786l0, f3, f3, this.f2784j0);
            }
            this.f2784j0.setColor(this.f2794t0);
            this.f2784j0.setStyle(Paint.Style.FILL);
            this.f2786l0.set(bounds);
            if (!this.f2758J0) {
                canvas2.drawRoundRect(this.f2786l0, mo3514D(), mo3514D(), this.f2784j0);
            } else {
                mo4957c(new RectF(bounds), this.f2788n0);
                mo4961g(canvas, this.f2784j0, this.f2788n0, this.f4164e.f4187a, mo4965h());
            }
            if (mo3563p0()) {
                mo3574y(bounds, this.f2786l0);
                RectF rectF2 = this.f2786l0;
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                canvas2.translate(f4, f5);
                this.f2759K.setBounds(0, 0, (int) this.f2786l0.width(), (int) this.f2786l0.height());
                this.f2759K.draw(canvas2);
                canvas2.translate(-f4, -f5);
            }
            if (mo3559o0()) {
                mo3574y(bounds, this.f2786l0);
                RectF rectF3 = this.f2786l0;
                float f6 = rectF3.left;
                float f7 = rectF3.top;
                canvas2.translate(f6, f7);
                this.f2771W.setBounds(0, 0, (int) this.f2786l0.width(), (int) this.f2786l0.height());
                this.f2771W.draw(canvas2);
                canvas2.translate(-f6, -f7);
            }
            if (!this.f2754H0 || this.f2755I == null) {
                i2 = saveLayerAlpha;
                i3 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.f2787m0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f2755I != null) {
                    float z = mo3575z() + this.f2775a0 + this.f2778d0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + z;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - z;
                        align = Paint.Align.RIGHT;
                    }
                    this.f2789o0.f3418a.getFontMetrics(this.f2785k0);
                    Paint.FontMetrics fontMetrics = this.f2785k0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.f2786l0;
                rectF4.setEmpty();
                if (this.f2755I != null) {
                    float z2 = mo3575z() + this.f2775a0 + this.f2778d0;
                    float C = mo3513C() + this.f2782h0 + this.f2779e0;
                    if (getLayoutDirection() == 0) {
                        rectF4.left = ((float) bounds.left) + z2;
                        f = ((float) bounds.right) - C;
                    } else {
                        rectF4.left = ((float) bounds.left) + C;
                        f = ((float) bounds.right) - z2;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                C0899i iVar = this.f2789o0;
                if (iVar.f3423f != null) {
                    iVar.f3418a.drawableState = getState();
                    C0899i iVar2 = this.f2789o0;
                    iVar2.f3423f.mo4471e(this.f2783i0, iVar2.f3418a, iVar2.f3419b);
                }
                this.f2789o0.f3418a.setTextAlign(align);
                boolean z3 = Math.round(this.f2789o0.mo4226a(this.f2755I.toString())) > Math.round(this.f2786l0.width());
                if (z3) {
                    i5 = canvas.save();
                    canvas2.clipRect(this.f2786l0);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence = this.f2755I;
                if (z3 && this.f2752G0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f2789o0.f3418a, this.f2786l0.width(), this.f2752G0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f2787m0;
                i2 = saveLayerAlpha;
                float f8 = pointF2.x;
                i3 = 0;
                float f9 = pointF2.y;
                i4 = 255;
                canvas.drawText(charSequence2, 0, length, f8, f9, this.f2789o0.f3418a);
                if (z3) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (mo3564q0()) {
                mo3511A(bounds, this.f2786l0);
                RectF rectF5 = this.f2786l0;
                float f10 = rectF5.left;
                float f11 = rectF5.top;
                canvas2.translate(f10, f11);
                this.f2764P.setBounds(i3, i3, (int) this.f2786l0.width(), (int) this.f2786l0.height());
                int[] iArr = C1091a.f3859a;
                this.f2765Q.setBounds(this.f2764P.getBounds());
                this.f2765Q.jumpToCurrentState();
                this.f2765Q.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (this.f2798x0 < i4) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    /* renamed from: e0 */
    public void mo3541e0(ColorStateList colorStateList) {
        if (this.f2766R != colorStateList) {
            this.f2766R = colorStateList;
            if (mo3564q0()) {
                this.f2764P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f0 */
    public void mo3542f0(boolean z) {
        if (this.f2763O != z) {
            boolean q0 = mo3564q0();
            this.f2763O = z;
            boolean q02 = mo3564q0();
            if (q0 != q02) {
                if (q02) {
                    mo3573x(this.f2764P);
                } else {
                    mo3565r0(this.f2764P);
                }
                invalidateSelf();
                mo3517I();
            }
        }
    }

    /* renamed from: g0 */
    public void mo3543g0(float f) {
        if (this.f2777c0 != f) {
            float z = mo3575z();
            this.f2777c0 = f;
            float z2 = mo3575z();
            invalidateSelf();
            if (z != z2) {
                mo3517I();
            }
        }
    }

    public int getAlpha() {
        return this.f2798x0;
    }

    public ColorFilter getColorFilter() {
        return this.f2799y0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f2745D;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(mo3513C() + this.f2789o0.mo4226a(this.f2755I.toString()) + mo3575z() + this.f2775a0 + this.f2778d0 + this.f2779e0 + this.f2782h0), this.f2756I0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f2758J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f2747E);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2745D, this.f2747E);
        }
        outline.setAlpha(((float) this.f2798x0) / 255.0f);
    }

    /* renamed from: h0 */
    public void mo3550h0(float f) {
        if (this.f2776b0 != f) {
            float z = mo3575z();
            this.f2776b0 = f;
            float z2 = mo3575z();
            invalidateSelf();
            if (z != z2) {
                mo3517I();
            }
        }
    }

    /* renamed from: i0 */
    public void mo3551i0(ColorStateList colorStateList) {
        if (this.f2753H != colorStateList) {
            this.f2753H = colorStateList;
            this.f2748E0 = this.f2746D0 ? C1091a.m3114a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f3755a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f2741B
            boolean r0 = m2184G(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f2743C
            boolean r0 = m2184G(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f2749F
            boolean r0 = m2184G(r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.f2746D0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.f2748E0
            boolean r0 = m2184G(r0)
            if (r0 != 0) goto L_0x0064
        L_0x0026:
            f2.i r0 = r3.f2789o0
            i2.f r0 = r0.f3423f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f3755a
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.f2770V
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f2771W
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f2769U
            if (r0 == 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.f2759K
            boolean r0 = m2185H(r0)
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.f2771W
            boolean r0 = m2185H(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f2740A0
            boolean r0 = m2184G(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C0722a.isStateful():boolean");
    }

    /* renamed from: j0 */
    public void mo3554j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f2755I, charSequence)) {
            this.f2755I = charSequence;
            this.f2789o0.f3421d = true;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: k0 */
    public void mo3555k0(C1033f fVar) {
        C0899i iVar = this.f2789o0;
        Context context = this.f2783i0;
        if (iVar.f3423f != fVar) {
            iVar.f3423f = fVar;
            if (fVar != null) {
                fVar.mo4472f(context, iVar.f3418a, iVar.f3419b);
                C0899i.C0901b bVar = (C0899i.C0901b) iVar.f3422e.get();
                if (bVar != null) {
                    iVar.f3418a.drawableState = bVar.getState();
                }
                fVar.mo4471e(context, iVar.f3418a, iVar.f3419b);
                iVar.f3421d = true;
            }
            C0899i.C0901b bVar2 = (C0899i.C0901b) iVar.f3422e.get();
            if (bVar2 != null) {
                bVar2.mo3535a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: l0 */
    public void mo3556l0(float f) {
        if (this.f2779e0 != f) {
            this.f2779e0 = f;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: m0 */
    public void mo3557m0(float f) {
        if (this.f2778d0 != f) {
            this.f2778d0 = f;
            invalidateSelf();
            mo3517I();
        }
    }

    /* renamed from: n0 */
    public void mo3558n0(boolean z) {
        if (this.f2746D0 != z) {
            this.f2746D0 = z;
            this.f2748E0 = z ? C1091a.m3114a(this.f2753H) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: o0 */
    public final boolean mo3559o0() {
        return this.f2770V && this.f2771W != null && this.f2796v0;
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo3563p0()) {
            onLayoutDirectionChanged |= this.f2759K.setLayoutDirection(i);
        }
        if (mo3559o0()) {
            onLayoutDirectionChanged |= this.f2771W.setLayoutDirection(i);
        }
        if (mo3564q0()) {
            onLayoutDirectionChanged |= this.f2764P.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo3563p0()) {
            onLevelChange |= this.f2759K.setLevel(i);
        }
        if (mo3559o0()) {
            onLevelChange |= this.f2771W.setLevel(i);
        }
        if (mo3564q0()) {
            onLevelChange |= this.f2764P.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f2758J0) {
            super.onStateChange(iArr);
        }
        return mo3518J(iArr, this.f2744C0);
    }

    /* renamed from: p0 */
    public final boolean mo3563p0() {
        return this.f2757J && this.f2759K != null;
    }

    /* renamed from: q0 */
    public final boolean mo3564q0() {
        return this.f2763O && this.f2764P != null;
    }

    /* renamed from: r0 */
    public final void mo3565r0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f2798x0 != i) {
            this.f2798x0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f2799y0 != colorFilter) {
            this.f2799y0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f2740A0 != colorStateList) {
            this.f2740A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f2742B0 != mode) {
            this.f2742B0 = mode;
            this.f2800z0 = C0539a.m1786a(this, this.f2740A0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo3563p0()) {
            visible |= this.f2759K.setVisible(z, z2);
        }
        if (mo3559o0()) {
            visible |= this.f2771W.setVisible(z, z2);
        }
        if (mo3564q0()) {
            visible |= this.f2764P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: x */
    public final void mo3573x(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f2764P) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f2744C0);
                }
                drawable.setTintList(this.f2766R);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f2759K;
            if (drawable == drawable2 && this.f2762N) {
                drawable2.setTintList(this.f2760L);
            }
        }
    }

    /* renamed from: y */
    public final void mo3574y(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        if (mo3563p0() || mo3559o0()) {
            float f2 = this.f2775a0 + this.f2776b0;
            float F = mo3516F();
            if (getLayoutDirection() == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + F;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - F;
            }
            Drawable drawable = this.f2796v0 ? this.f2771W : this.f2759K;
            float f5 = this.f2761M;
            if (f5 <= 0.0f && drawable != null) {
                f5 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f2783i0.getResources().getDisplayMetrics()));
                if (((float) drawable.getIntrinsicHeight()) <= f5) {
                    f = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f5;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    /* renamed from: z */
    public float mo3575z() {
        if (!mo3563p0() && !mo3559o0()) {
            return 0.0f;
        }
        return mo3516F() + this.f2776b0 + this.f2777c0;
    }
}
