package p048h2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0205s;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0903k;
import p054i2.C1030c;
import p083n1.C1455a;
import p096p2.C1578a;
import p136w0.C2036r;

/* renamed from: h2.a */
public class C1012a extends C0205s {

    /* renamed from: j */
    public static final int[][] f3725j = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    public ColorStateList f3726h;

    /* renamed from: i */
    public boolean f3727i;

    public C1012a(Context context, AttributeSet attributeSet) {
        super(C1578a.m4424a(context, attributeSet, R.attr.radioButtonStyle, 2131952301), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d = C0903k.m2662d(context2, attributeSet, C1455a.f4580r, R.attr.radioButtonStyle, 2131952301, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(C1030c.m2956a(context2, d, 0));
        }
        this.f3727i = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3726h == null) {
            int c = C2036r.m5365c(this, R.attr.colorControlActivated);
            int c2 = C2036r.m5365c(this, R.attr.colorOnSurface);
            int c3 = C2036r.m5365c(this, R.attr.colorSurface);
            int[][] iArr = f3725j;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C2036r.m5371i(c3, c, 1.0f);
            iArr2[1] = C2036r.m5371i(c3, c2, 0.54f);
            iArr2[2] = C2036r.m5371i(c3, c2, 0.38f);
            iArr2[3] = C2036r.m5371i(c3, c2, 0.38f);
            this.f3726h = new ColorStateList(iArr, iArr2);
        }
        return this.f3726h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3727i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3727i = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
