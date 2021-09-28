package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import p010b0.C0533b;
import p051i.C1021a;

/* renamed from: androidx.appcompat.widget.b1 */
public class C0136b1 {

    /* renamed from: a */
    public final Context f691a;

    /* renamed from: b */
    public final TypedArray f692b;

    /* renamed from: c */
    public TypedValue f693c;

    public C0136b1(Context context, TypedArray typedArray) {
        this.f691a = context;
        this.f692b = typedArray;
    }

    /* renamed from: p */
    public static C0136b1 m360p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0136b1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: q */
    public static C0136b1 m361q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0136b1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo761a(int i, boolean z) {
        return this.f692b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo762b(int i, int i2) {
        return this.f692b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo763c(int i) {
        int resourceId;
        if (this.f692b.hasValue(i) && (resourceId = this.f692b.getResourceId(i, 0)) != 0) {
            Context context = this.f691a;
            ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.f692b.getColorStateList(i);
    }

    /* renamed from: d */
    public float mo764d(int i, float f) {
        return this.f692b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo765e(int i, int i2) {
        return this.f692b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo766f(int i, int i2) {
        return this.f692b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f692b.getResourceId(r3, 0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo767g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f692b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f692b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f691a
            android.graphics.drawable.Drawable r3 = p051i.C1021a.m2945a(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f692b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0136b1.mo767g(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: h */
    public Drawable mo768h(int i) {
        int resourceId;
        Drawable f;
        if (!this.f692b.hasValue(i) || (resourceId = this.f692b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0176k a = C0176k.m496a();
        Context context = this.f691a;
        synchronized (a) {
            f = a.f825a.mo1113f(context, resourceId, true);
        }
        return f;
    }

    /* renamed from: i */
    public Typeface mo769i(int i, int i2, C0533b.C0534a aVar) {
        int resourceId = this.f692b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f693c == null) {
            this.f693c = new TypedValue();
        }
        Context context = this.f691a;
        TypedValue typedValue = this.f693c;
        ThreadLocal<TypedValue> threadLocal = C0533b.f2319a;
        if (context.isRestricted()) {
            return null;
        }
        return C0533b.m1779b(context, resourceId, typedValue, i2, aVar, (Handler) null, true, false);
    }

    /* renamed from: j */
    public int mo770j(int i, int i2) {
        return this.f692b.getInt(i, i2);
    }

    /* renamed from: k */
    public int mo771k(int i, int i2) {
        return this.f692b.getLayoutDimension(i, i2);
    }

    /* renamed from: l */
    public int mo772l(int i, int i2) {
        return this.f692b.getResourceId(i, i2);
    }

    /* renamed from: m */
    public String mo773m(int i) {
        return this.f692b.getString(i);
    }

    /* renamed from: n */
    public CharSequence mo774n(int i) {
        return this.f692b.getText(i);
    }

    /* renamed from: o */
    public boolean mo775o(int i) {
        return this.f692b.hasValue(i);
    }
}
