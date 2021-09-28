package p036f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p007au.gov.dfat.vdsncchecker.R;
import p016c0.C0559c;
import p083n1.C1455a;

/* renamed from: f2.k */
public final class C0903k {

    /* renamed from: a */
    public static final int[] f3425a = {R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f3426b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m2659a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4562D, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2661c(context, f3426b, "Theme.MaterialComponents");
            }
        }
        m2661c(context, f3425a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x003a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2660b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = p083n1.C1455a.f4562D
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = -1
            if (r9 == 0) goto L_0x0034
            int r3 = r9.length
            if (r3 != 0) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x001f:
            if (r6 >= r5) goto L_0x0030
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x002d
            r4.recycle()
            goto L_0x003b
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0030:
            r4.recycle()
            goto L_0x003a
        L_0x0034:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            r0.recycle()
            if (r2 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p036f2.C0903k.m2660b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m2661c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C0559c.m1823a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m2662d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2659a(context, attributeSet, i, i2);
        m2660b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
