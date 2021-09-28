package p036f2;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
import p046h0.C1005d;
import p054i2.C1027a;
import p058j0.C1061o;
import p058j0.C1070q;
import p089o1.C1494a;

/* renamed from: f2.c */
public final class C0891c {

    /* renamed from: A */
    public Bitmap f3355A;

    /* renamed from: B */
    public float f3356B;

    /* renamed from: C */
    public float f3357C;

    /* renamed from: D */
    public int[] f3358D;

    /* renamed from: E */
    public boolean f3359E;

    /* renamed from: F */
    public final TextPaint f3360F;

    /* renamed from: G */
    public final TextPaint f3361G;

    /* renamed from: H */
    public TimeInterpolator f3362H;

    /* renamed from: I */
    public TimeInterpolator f3363I;

    /* renamed from: J */
    public float f3364J;

    /* renamed from: K */
    public float f3365K;

    /* renamed from: L */
    public float f3366L;

    /* renamed from: M */
    public ColorStateList f3367M;

    /* renamed from: N */
    public float f3368N;

    /* renamed from: O */
    public StaticLayout f3369O;

    /* renamed from: P */
    public float f3370P;

    /* renamed from: Q */
    public float f3371Q;

    /* renamed from: R */
    public CharSequence f3372R;

    /* renamed from: a */
    public final View f3373a;

    /* renamed from: b */
    public boolean f3374b;

    /* renamed from: c */
    public float f3375c;

    /* renamed from: d */
    public float f3376d;

    /* renamed from: e */
    public final Rect f3377e;

    /* renamed from: f */
    public final Rect f3378f;

    /* renamed from: g */
    public final RectF f3379g;

    /* renamed from: h */
    public int f3380h = 16;

    /* renamed from: i */
    public int f3381i = 16;

    /* renamed from: j */
    public float f3382j = 15.0f;

    /* renamed from: k */
    public float f3383k = 15.0f;

    /* renamed from: l */
    public ColorStateList f3384l;

    /* renamed from: m */
    public ColorStateList f3385m;

    /* renamed from: n */
    public float f3386n;

    /* renamed from: o */
    public float f3387o;

    /* renamed from: p */
    public float f3388p;

    /* renamed from: q */
    public float f3389q;

    /* renamed from: r */
    public float f3390r;

    /* renamed from: s */
    public float f3391s;

    /* renamed from: t */
    public Typeface f3392t;

    /* renamed from: u */
    public Typeface f3393u;

    /* renamed from: v */
    public Typeface f3394v;

    /* renamed from: w */
    public C1027a f3395w;

    /* renamed from: x */
    public CharSequence f3396x;

    /* renamed from: y */
    public CharSequence f3397y;

    /* renamed from: z */
    public boolean f3398z;

    public C0891c(View view) {
        this.f3373a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f3360F = textPaint;
        this.f3361G = new TextPaint(textPaint);
        this.f3378f = new Rect();
        this.f3377e = new Rect();
        this.f3379g = new RectF();
        this.f3376d = 0.5f;
    }

    /* renamed from: a */
    public static int m2634a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    /* renamed from: i */
    public static float m2635i(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1494a.m4193a(f, f2, f3);
    }

    /* renamed from: l */
    public static boolean m2636l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    public float mo4193b() {
        if (this.f3396x == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f3361G;
        textPaint.setTextSize(this.f3383k);
        textPaint.setTypeface(this.f3392t);
        textPaint.setLetterSpacing(this.f3368N);
        TextPaint textPaint2 = this.f3361G;
        CharSequence charSequence = this.f3396x;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final boolean mo4194c(CharSequence charSequence) {
        View view = this.f3373a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z = true;
        if (view.getLayoutDirection() != 1) {
            z = false;
        }
        return ((C1005d.C1008c) (z ? C1005d.f3719d : C1005d.f3718c)).mo4441b(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public final void mo4195d(float f) {
        int i;
        TextPaint textPaint;
        TextPaint textPaint2;
        this.f3379g.left = m2635i((float) this.f3377e.left, (float) this.f3378f.left, f, this.f3362H);
        this.f3379g.top = m2635i(this.f3386n, this.f3387o, f, this.f3362H);
        this.f3379g.right = m2635i((float) this.f3377e.right, (float) this.f3378f.right, f, this.f3362H);
        this.f3379g.bottom = m2635i((float) this.f3377e.bottom, (float) this.f3378f.bottom, f, this.f3362H);
        this.f3390r = m2635i(this.f3388p, this.f3389q, f, this.f3362H);
        this.f3391s = m2635i(this.f3386n, this.f3387o, f, this.f3362H);
        mo4205p(m2635i(this.f3382j, this.f3383k, f, this.f3363I));
        TimeInterpolator timeInterpolator = C1494a.f4653b;
        this.f3370P = 1.0f - m2635i(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        View view = this.f3373a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.postInvalidateOnAnimation();
        this.f3371Q = m2635i(1.0f, 0.0f, f, timeInterpolator);
        this.f3373a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f3385m;
        ColorStateList colorStateList2 = this.f3384l;
        if (colorStateList != colorStateList2) {
            textPaint = this.f3360F;
            i = m2634a(mo4199h(colorStateList2), mo4198g(), f);
        } else {
            textPaint = this.f3360F;
            i = mo4198g();
        }
        textPaint.setColor(i);
        float f2 = this.f3368N;
        if (f2 != 0.0f) {
            textPaint2 = this.f3360F;
            f2 = m2635i(0.0f, f2, f, timeInterpolator);
        } else {
            textPaint2 = this.f3360F;
        }
        textPaint2.setLetterSpacing(f2);
        this.f3360F.setShadowLayer(m2635i(0.0f, this.f3364J, f, (TimeInterpolator) null), m2635i(0.0f, this.f3365K, f, (TimeInterpolator) null), m2635i(0.0f, this.f3366L, f, (TimeInterpolator) null), m2634a(mo4199h((ColorStateList) null), mo4199h(this.f3367M), f));
        this.f3373a.postInvalidateOnAnimation();
    }

    /* renamed from: e */
    public final void mo4196e(float f, boolean z) {
        float f2;
        boolean z2;
        StaticLayout staticLayout;
        if (this.f3396x != null) {
            float width = (float) this.f3378f.width();
            float width2 = (float) this.f3377e.width();
            if (Math.abs(f - this.f3383k) < 0.001f) {
                f2 = this.f3383k;
                this.f3356B = 1.0f;
                Typeface typeface = this.f3394v;
                Typeface typeface2 = this.f3392t;
                if (typeface != typeface2) {
                    this.f3394v = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f3382j;
                Typeface typeface3 = this.f3394v;
                Typeface typeface4 = this.f3393u;
                if (typeface3 != typeface4) {
                    this.f3394v = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f - f3) < 0.001f) {
                    this.f3356B = 1.0f;
                } else {
                    this.f3356B = f / this.f3382j;
                }
                float f4 = this.f3383k / this.f3382j;
                width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z2 = this.f3357C != f2 || this.f3359E || z2;
                this.f3357C = f2;
                this.f3359E = false;
            }
            if (this.f3397y == null || z2) {
                this.f3360F.setTextSize(this.f3357C);
                this.f3360F.setTypeface(this.f3394v);
                this.f3360F.setLinearText(this.f3356B != 1.0f);
                boolean c = mo4194c(this.f3396x);
                this.f3398z = c;
                try {
                    CharSequence charSequence = this.f3396x;
                    TextPaint textPaint = this.f3360F;
                    int length = charSequence.length();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    int max = Math.max(0, (int) width);
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, (float) max, truncateAt);
                    int min = Math.min(ellipsize.length(), length);
                    if (c) {
                        alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
                    obtain.setAlignment(alignment2);
                    obtain.setIncludePad(false);
                    obtain.setTextDirection(c ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                    if (truncateAt != null) {
                        obtain.setEllipsize(truncateAt);
                    }
                    obtain.setMaxLines(1);
                    staticLayout = obtain.build();
                } catch (C0898h e) {
                    e.getCause().getMessage();
                    staticLayout = null;
                }
                Objects.requireNonNull(staticLayout);
                this.f3369O = staticLayout;
                this.f3397y = staticLayout.getText();
            }
        }
    }

    /* renamed from: f */
    public float mo4197f() {
        TextPaint textPaint = this.f3361G;
        textPaint.setTextSize(this.f3383k);
        textPaint.setTypeface(this.f3392t);
        textPaint.setLetterSpacing(this.f3368N);
        return -this.f3361G.ascent();
    }

    /* renamed from: g */
    public int mo4198g() {
        return mo4199h(this.f3385m);
    }

    /* renamed from: h */
    public final int mo4199h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f3358D;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: j */
    public void mo4200j() {
        this.f3374b = this.f3378f.width() > 0 && this.f3378f.height() > 0 && this.f3377e.width() > 0 && this.f3377e.height() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4201k() {
        /*
            r12 = this;
            android.view.View r0 = r12.f3373a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0129
            android.view.View r0 = r12.f3373a
            int r0 = r0.getWidth()
            if (r0 > 0) goto L_0x0012
            goto L_0x0129
        L_0x0012:
            float r0 = r12.f3357C
            float r1 = r12.f3383k
            r2 = 0
            r12.mo4196e(r1, r2)
            java.lang.CharSequence r1 = r12.f3397y
            if (r1 == 0) goto L_0x0031
            android.text.StaticLayout r3 = r12.f3369O
            if (r3 == 0) goto L_0x0031
            android.text.TextPaint r4 = r12.f3360F
            int r3 = r3.getWidth()
            float r3 = (float) r3
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r4, r3, r5)
            r12.f3372R = r1
        L_0x0031:
            java.lang.CharSequence r1 = r12.f3372R
            r3 = 0
            if (r1 == 0) goto L_0x0041
            android.text.TextPaint r4 = r12.f3360F
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            int r4 = r12.f3381i
            boolean r5 = r12.f3398z
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x007c
            if (r5 == r6) goto L_0x006d
            android.text.TextPaint r5 = r12.f3360F
            float r5 = r5.descent()
            android.text.TextPaint r9 = r12.f3360F
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r12.f3378f
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            goto L_0x0079
        L_0x006d:
            android.graphics.Rect r5 = r12.f3378f
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r12.f3360F
            float r9 = r9.ascent()
            float r9 = r9 + r5
        L_0x0079:
            r12.f3387o = r9
            goto L_0x0083
        L_0x007c:
            android.graphics.Rect r5 = r12.f3378f
            int r5 = r5.top
            float r5 = (float) r5
            r12.f3387o = r5
        L_0x0083:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x009b
            if (r4 == r9) goto L_0x0095
            android.graphics.Rect r1 = r12.f3378f
            int r1 = r1.left
            float r1 = (float) r1
            r12.f3389q = r1
            goto L_0x00a6
        L_0x0095:
            android.graphics.Rect r4 = r12.f3378f
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x00a3
        L_0x009b:
            android.graphics.Rect r4 = r12.f3378f
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x00a3:
            float r4 = r4 - r1
            r12.f3389q = r4
        L_0x00a6:
            float r1 = r12.f3382j
            r12.mo4196e(r1, r2)
            android.text.StaticLayout r1 = r12.f3369O
            if (r1 == 0) goto L_0x00b5
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00b6
        L_0x00b5:
            r1 = r3
        L_0x00b6:
            java.lang.CharSequence r4 = r12.f3397y
            if (r4 == 0) goto L_0x00c4
            android.text.TextPaint r3 = r12.f3360F
            int r11 = r4.length()
            float r3 = r3.measureText(r4, r2, r11)
        L_0x00c4:
            android.text.StaticLayout r4 = r12.f3369O
            if (r4 == 0) goto L_0x00cb
            r4.getLineLeft(r2)
        L_0x00cb:
            int r2 = r12.f3380h
            boolean r4 = r12.f3398z
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r4)
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 == r7) goto L_0x00f3
            if (r4 == r6) goto L_0x00e5
            float r1 = r1 / r8
            android.graphics.Rect r4 = r12.f3377e
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 - r1
            r12.f3386n = r4
            goto L_0x00fa
        L_0x00e5:
            android.graphics.Rect r4 = r12.f3377e
            int r4 = r4.bottom
            float r4 = (float) r4
            float r4 = r4 - r1
            android.text.TextPaint r1 = r12.f3360F
            float r1 = r1.descent()
            float r1 = r1 + r4
            goto L_0x00f8
        L_0x00f3:
            android.graphics.Rect r1 = r12.f3377e
            int r1 = r1.top
            float r1 = (float) r1
        L_0x00f8:
            r12.f3386n = r1
        L_0x00fa:
            r1 = r2 & r5
            if (r1 == r10) goto L_0x010c
            if (r1 == r9) goto L_0x0106
            android.graphics.Rect r1 = r12.f3377e
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0115
        L_0x0106:
            android.graphics.Rect r1 = r12.f3377e
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0114
        L_0x010c:
            android.graphics.Rect r1 = r12.f3377e
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x0114:
            float r1 = r1 - r3
        L_0x0115:
            r12.f3388p = r1
            android.graphics.Bitmap r1 = r12.f3355A
            if (r1 == 0) goto L_0x0121
            r1.recycle()
            r1 = 0
            r12.f3355A = r1
        L_0x0121:
            r12.mo4205p(r0)
            float r0 = r12.f3375c
            r12.mo4195d(r0)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036f2.C0891c.mo4201k():void");
    }

    /* renamed from: m */
    public void mo4202m(ColorStateList colorStateList) {
        if (this.f3385m != colorStateList) {
            this.f3385m = colorStateList;
            mo4201k();
        }
    }

    /* renamed from: n */
    public void mo4203n(int i) {
        if (this.f3381i != i) {
            this.f3381i = i;
            mo4201k();
        }
    }

    /* renamed from: o */
    public void mo4204o(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f3375c) {
            this.f3375c = f;
            mo4195d(f);
        }
    }

    /* renamed from: p */
    public final void mo4205p(float f) {
        mo4196e(f, false);
        View view = this.f3373a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: q */
    public void mo4206q(Typeface typeface) {
        boolean z;
        C1027a aVar = this.f3395w;
        boolean z2 = true;
        if (aVar != null) {
            aVar.f3749c = true;
        }
        if (this.f3392t != typeface) {
            this.f3392t = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f3393u != typeface) {
            this.f3393u = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            mo4201k();
        }
    }
}
