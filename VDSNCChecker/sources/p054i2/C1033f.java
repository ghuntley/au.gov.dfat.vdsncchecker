package p054i2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.TypedValue;
import p010b0.C0533b;
import p075m.C1417c;
import p083n1.C1455a;

/* renamed from: i2.f */
public class C1033f {

    /* renamed from: a */
    public final ColorStateList f3755a;

    /* renamed from: b */
    public final ColorStateList f3756b;

    /* renamed from: c */
    public final String f3757c;

    /* renamed from: d */
    public final int f3758d;

    /* renamed from: e */
    public final int f3759e;

    /* renamed from: f */
    public final float f3760f;

    /* renamed from: g */
    public final float f3761g;

    /* renamed from: h */
    public final float f3762h;

    /* renamed from: i */
    public final boolean f3763i;

    /* renamed from: j */
    public final float f3764j;

    /* renamed from: k */
    public float f3765k;

    /* renamed from: l */
    public final int f3766l;

    /* renamed from: m */
    public boolean f3767m = false;

    /* renamed from: n */
    public Typeface f3768n;

    public C1033f(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1455a.f4559A);
        this.f3765k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3755a = C1030c.m2956a(context, obtainStyledAttributes, 3);
        C1030c.m2956a(context, obtainStyledAttributes, 4);
        C1030c.m2956a(context, obtainStyledAttributes, 5);
        this.f3758d = obtainStyledAttributes.getInt(2, 0);
        this.f3759e = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f3766l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f3757c = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3756b = C1030c.m2956a(context, obtainStyledAttributes, 6);
        this.f3760f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3761g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f3762h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C1455a.f4582t);
        this.f3763i = obtainStyledAttributes2.hasValue(0);
        this.f3764j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo4467a() {
        String str;
        if (this.f3768n == null && (str = this.f3757c) != null) {
            this.f3768n = Typeface.create(str, this.f3758d);
        }
        if (this.f3768n == null) {
            int i = this.f3759e;
            this.f3768n = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f3768n = Typeface.create(this.f3768n, this.f3758d);
        }
    }

    /* renamed from: b */
    public Typeface mo4468b(Context context) {
        if (this.f3767m) {
            return this.f3768n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = C0533b.m1778a(context, this.f3766l);
                this.f3768n = a;
                if (a != null) {
                    this.f3768n = Typeface.create(a, this.f3758d);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        mo4467a();
        this.f3767m = true;
        return this.f3768n;
    }

    /* renamed from: c */
    public void mo4469c(Context context, C1417c cVar) {
        if (mo4470d(context)) {
            mo4468b(context);
        } else {
            mo4467a();
        }
        int i = this.f3766l;
        if (i == 0) {
            this.f3767m = true;
        }
        if (this.f3767m) {
            cVar.mo3468h(this.f3768n, true);
            return;
        }
        try {
            C1031d dVar = new C1031d(this, cVar);
            ThreadLocal<TypedValue> threadLocal = C0533b.f2319a;
            if (context.isRestricted()) {
                dVar.mo2676a(-4, (Handler) null);
                return;
            }
            C0533b.m1779b(context, i, new TypedValue(), 0, dVar, (Handler) null, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f3767m = true;
            cVar.mo3467g(1);
        } catch (Exception unused2) {
            this.f3767m = true;
            cVar.mo3467g(-3);
        }
    }

    /* renamed from: d */
    public final boolean mo4470d(Context context) {
        int i = this.f3766l;
        Typeface typeface = null;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = C0533b.f2319a;
            if (!context.isRestricted()) {
                typeface = C0533b.m1779b(context, i, new TypedValue(), 0, (C0533b.C0534a) null, (Handler) null, false, true);
            }
        }
        return typeface != null;
    }

    /* renamed from: e */
    public void mo4471e(Context context, TextPaint textPaint, C1417c cVar) {
        mo4472f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f3755a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f3762h;
        float f2 = this.f3760f;
        float f3 = this.f3761g;
        ColorStateList colorStateList2 = this.f3756b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public void mo4472f(Context context, TextPaint textPaint, C1417c cVar) {
        if (mo4470d(context)) {
            mo4473g(textPaint, mo4468b(context));
            return;
        }
        mo4467a();
        mo4473g(textPaint, this.f3768n);
        mo4469c(context, new C1032e(this, textPaint, cVar));
    }

    /* renamed from: g */
    public void mo4473g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3758d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3765k);
        if (this.f3763i) {
            textPaint.setLetterSpacing(this.f3764j);
        }
    }
}
