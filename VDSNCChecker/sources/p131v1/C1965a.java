package p131v1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0165h;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0903k;
import p054i2.C1030c;
import p083n1.C1455a;
import p096p2.C1578a;
import p136w0.C2036r;

/* renamed from: v1.a */
public class C1965a extends C0165h {

    /* renamed from: j */
    public static final int[][] f5797j = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    public ColorStateList f5798h;

    /* renamed from: i */
    public boolean f5799i;

    public C1965a(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.checkboxStyle, 2131952300), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d = C0903k.m2662d(context2, attributeSet, C1455a.f4579q, R.attr.checkboxStyle, 2131952300, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(C1030c.m2956a(context2, d, 0));
        }
        this.f5799i = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5798h == null) {
            int[][] iArr = f5797j;
            int[] iArr2 = new int[iArr.length];
            int c = C2036r.m5365c(this, R.attr.colorControlActivated);
            int c2 = C2036r.m5365c(this, R.attr.colorSurface);
            int c3 = C2036r.m5365c(this, R.attr.colorOnSurface);
            iArr2[0] = C2036r.m5371i(c2, c, 1.0f);
            iArr2[1] = C2036r.m5371i(c2, c3, 0.54f);
            iArr2[2] = C2036r.m5371i(c2, c3, 0.38f);
            iArr2[3] = C2036r.m5371i(c2, c3, 0.38f);
            this.f5798h = new ColorStateList(iArr, iArr2);
        }
        return this.f5798h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5799i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5799i = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
