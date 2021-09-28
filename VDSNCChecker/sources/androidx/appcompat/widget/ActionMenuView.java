package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.view.menu.C0084j;
import androidx.appcompat.widget.C0137c;
import androidx.appcompat.widget.C0184m0;
import androidx.appcompat.widget.Toolbar;
import com.dynamsoft.dbr.EnumBarcodeFormat;

public class ActionMenuView extends C0184m0 implements C0074e.C0076b, C0084j {

    /* renamed from: A */
    public boolean f505A;

    /* renamed from: B */
    public int f506B;

    /* renamed from: C */
    public int f507C;

    /* renamed from: D */
    public int f508D;

    /* renamed from: E */
    public C0100e f509E;

    /* renamed from: t */
    public C0074e f510t;

    /* renamed from: u */
    public Context f511u;

    /* renamed from: v */
    public int f512v = 0;

    /* renamed from: w */
    public boolean f513w;

    /* renamed from: x */
    public C0137c f514x;

    /* renamed from: y */
    public C0082i.C0083a f515y;

    /* renamed from: z */
    public C0074e.C0075a f516z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0096a {
        /* renamed from: a */
        boolean mo160a();

        /* renamed from: b */
        boolean mo161b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0097b implements C0082i.C0083a {
        /* renamed from: a */
        public void mo296a(C0074e eVar, boolean z) {
        }

        /* renamed from: b */
        public boolean mo297b(C0074e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0098c extends C0184m0.C0185a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f517a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f518b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f519c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f520d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f521e;

        /* renamed from: f */
        public boolean f522f;

        public C0098c(int i, int i2) {
            super(i, i2);
            this.f517a = false;
        }

        public C0098c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0098c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0098c(C0098c cVar) {
            super(cVar);
            this.f517a = cVar.f517a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0099d implements C0074e.C0075a {
        public C0099d() {
        }

        /* renamed from: a */
        public boolean mo294a(C0074e eVar, MenuItem menuItem) {
            C0100e eVar2 = ActionMenuView.this.f509E;
            if (eVar2 == null) {
                return false;
            }
            Toolbar.C0125f fVar = Toolbar.this.f619K;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }

        /* renamed from: b */
        public void mo295b(C0074e eVar) {
            C0074e.C0075a aVar = ActionMenuView.this.f516z;
            if (aVar != null) {
                aVar.mo295b(eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0100e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f507C = (int) (56.0f * f);
        this.f508D = (int) (f * 4.0f);
        this.f511u = context;
    }

    /* renamed from: o */
    public static int m260o(View view, int i, int i2, int i3, int i4) {
        C0098c cVar = (C0098c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo162c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f517a && z2) {
            z = true;
        }
        cVar.f520d = z;
        cVar.f518b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, EnumBarcodeFormat.BF_MICRO_QR), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public boolean mo182a(C0078g gVar) {
        return this.f510t.mo278r(gVar, (C0082i) null, 0);
    }

    /* renamed from: b */
    public void mo183b(C0074e eVar) {
        this.f510t = eVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0098c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0098c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f510t == null) {
            Context context = getContext();
            C0074e eVar = new C0074e(context);
            this.f510t = eVar;
            eVar.f360e = new C0099d();
            C0137c cVar = new C0137c(context);
            this.f514x = cVar;
            cVar.f698p = true;
            cVar.f699q = true;
            C0082i.C0083a aVar = this.f515y;
            if (aVar == null) {
                aVar = new C0097b();
            }
            cVar.f301i = aVar;
            this.f510t.mo253b(cVar, this.f511u);
            C0137c cVar2 = this.f514x;
            cVar2.f304l = this;
            this.f510t = cVar2.f299g;
        }
        return this.f510t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0137c cVar = this.f514x;
        C0137c.C0141d dVar = cVar.f695m;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f697o) {
            return cVar.f696n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f512v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: i */
    public C0184m0.C0185a mo498i(AttributeSet attributeSet) {
        return new C0098c(getContext(), attributeSet);
    }

    /* renamed from: l */
    public C0098c mo497h() {
        C0098c cVar = new C0098c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: m */
    public C0098c mo499j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo497h();
        }
        C0098c cVar = layoutParams instanceof C0098c ? new C0098c((C0098c) layoutParams) : new C0098c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: n */
    public boolean mo502n(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0096a)) {
            z = false | ((C0096a) childAt).mo160a();
        }
        return (i <= 0 || !(childAt2 instanceof C0096a)) ? z : z | ((C0096a) childAt2).mo161b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0137c cVar = this.f514x;
        if (cVar != null) {
            cVar.mo207j(false);
            if (this.f514x.mo780m()) {
                this.f514x.mo778k();
                this.f514x.mo781n();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0137c cVar = this.f514x;
        if (cVar != null) {
            cVar.mo776b();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f505A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0170i1.m489a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0098c cVar = (C0098c) childAt.getLayoutParams();
                if (cVar.f517a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo502n(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo502n(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int i16 = 0;
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                C0098c cVar2 = (C0098c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f517a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i16++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i16 < childCount) {
            View childAt4 = getChildAt(i16);
            C0098c cVar3 = (C0098c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f517a) {
                int i19 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = C0147d.m397a(measuredWidth4, cVar3.rightMargin, max, i19);
            }
            i16++;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        C0074e eVar;
        boolean z4 = this.f505A;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f505A = z5;
        if (z4 != z5) {
            this.f506B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f505A || (eVar = this.f510t) == null || size == this.f506B)) {
            this.f506B = size;
            eVar.mo274p(true);
        }
        int childCount = getChildCount();
        if (!this.f505A || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                C0098c cVar = (C0098c) getChildAt(i8).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f507C;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.f508D;
                    i6 = i21;
                    z3 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z3 = false;
                }
                C0098c cVar2 = (C0098c) childAt.getLayoutParams();
                cVar2.f522f = z3;
                cVar2.f519c = z3 ? 1 : 0;
                cVar2.f518b = z3;
                cVar2.f520d = z3;
                cVar2.leftMargin = z3;
                cVar2.rightMargin = z3;
                cVar2.f521e = z7 && ((ActionMenuItemView) childAt).mo162c();
                int o = m260o(childAt, i13, cVar2.f517a ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, o);
                if (cVar2.f520d) {
                    i17++;
                }
                if (cVar2.f517a) {
                    z6 = true;
                }
                i11 -= o;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (o == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i11 <= 0) {
                i3 = i15;
                z = z9;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    C0098c cVar3 = (C0098c) getChildAt(i26).getLayoutParams();
                    boolean z10 = z9;
                    if (cVar3.f520d) {
                        int i29 = cVar3.f518b;
                        if (i29 < i25) {
                            j2 = 1 << i26;
                            i25 = i29;
                            i27 = 1;
                        } else if (i29 == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z9 = z10;
                    i15 = i28;
                }
                i3 = i15;
                z = z9;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    C0098c cVar4 = (C0098c) childAt2.getLayoutParams();
                    int i32 = i17;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar4.f518b == i30) {
                            j |= j3;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !cVar4.f521e || i11 != 1) {
                            z2 = z8;
                        } else {
                            int i33 = this.f508D;
                            z2 = z8;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        cVar4.f518b++;
                        cVar4.f522f = true;
                        i11--;
                    }
                    i31++;
                    i17 = i32;
                    z8 = z2;
                }
                i15 = i3;
                z9 = true;
            }
        }
        i3 = i15;
        z = z9;
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C0098c) getChildAt(0).getLayoutParams()).f521e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((C0098c) getChildAt(i34).getLayoutParams()).f521e) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0098c cVar5 = (C0098c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f519c = i35;
                        cVar5.f522f = true;
                        if (i36 == 0 && !cVar5.f521e) {
                            cVar5.leftMargin = (-i35) / 2;
                        }
                        z = true;
                    } else if (cVar5.f517a) {
                        cVar5.f519c = i35;
                        cVar5.f522f = true;
                        cVar5.rightMargin = (-i35) / 2;
                        z = true;
                    } else {
                        if (i36 != 0) {
                            cVar5.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            cVar5.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0098c cVar6 = (C0098c) childAt4.getLayoutParams();
                if (cVar6.f522f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f518b * i13) + cVar6.f519c, EnumBarcodeFormat.BF_MICRO_QR), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f514x.f703u = z;
    }

    public void setOnMenuItemClickListener(C0100e eVar) {
        this.f509E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0137c cVar = this.f514x;
        C0137c.C0141d dVar = cVar.f695m;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f697o = true;
        cVar.f696n = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f513w = z;
    }

    public void setPopupTheme(int i) {
        if (this.f512v != i) {
            this.f512v = i;
            if (i == 0) {
                this.f511u = getContext();
            } else {
                this.f511u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0137c cVar) {
        this.f514x = cVar;
        cVar.f304l = this;
        this.f510t = cVar.f299g;
    }
}
