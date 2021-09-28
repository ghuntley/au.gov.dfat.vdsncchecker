package p036f2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p083n1.C1455a;

/* renamed from: f2.e */
public class C0893e extends ViewGroup {

    /* renamed from: e */
    public int f3401e;

    /* renamed from: f */
    public int f3402f;

    /* renamed from: g */
    public boolean f3403g;

    /* renamed from: h */
    public int f3404h;

    public C0893e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0893e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3403g = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1455a.f4571i, 0, 0);
        this.f3401e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3402f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo3475a() {
        return this.f3403g;
    }

    public int getItemSpacing() {
        return this.f3402f;
    }

    public int getLineSpacing() {
        return this.f3401e;
    }

    public int getRowCount() {
        return this.f3404h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f3404h = 0;
            return;
        }
        this.f3404h = 1;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.getMarginStart();
                    i6 = marginLayoutParams.getMarginEnd();
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i5;
                if (!this.f3403g && measuredWidth > i7) {
                    i9 = this.f3401e + paddingTop;
                    this.f3404h++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f3404h - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i5;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += childAt.getMeasuredWidth() + i5 + i6 + this.f3402f;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i4 > paddingRight && !mo3475a()) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.f3401e;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i4;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i4 + i5 + this.f3402f + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = EnumBarcodeFormat.BF_MICRO_QR;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = EnumBarcodeFormat.BF_MICRO_QR;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f3402f = i;
    }

    public void setLineSpacing(int i) {
        this.f3401e = i;
    }

    public void setSingleLine(boolean z) {
        this.f3403g = z;
    }
}
