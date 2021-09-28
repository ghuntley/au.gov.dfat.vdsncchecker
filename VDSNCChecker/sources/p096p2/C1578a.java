package p096p2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p007au.gov.dfat.vdsncchecker.R;
import p063k.C1138c;

/* renamed from: p2.a */
public class C1578a {

    /* renamed from: a */
    public static final int[] f4909a = {16842752, R.attr.theme};

    /* renamed from: b */
    public static final int[] f4910b = {R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m4424a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4910b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C1138c) && ((C1138c) context).f3934a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C1138c cVar = new C1138c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4909a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
