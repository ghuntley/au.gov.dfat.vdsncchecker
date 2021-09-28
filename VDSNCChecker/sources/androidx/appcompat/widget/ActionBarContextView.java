package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import p007au.gov.dfat.vdsncchecker.R;
import p063k.C1135a;

public class ActionBarContextView extends C0129a {

    /* renamed from: m */
    public CharSequence f461m;

    /* renamed from: n */
    public CharSequence f462n;

    /* renamed from: o */
    public View f463o;

    /* renamed from: p */
    public View f464p;

    /* renamed from: q */
    public View f465q;

    /* renamed from: r */
    public LinearLayout f466r;

    /* renamed from: s */
    public TextView f467s;

    /* renamed from: t */
    public TextView f468t;

    /* renamed from: u */
    public int f469u;

    /* renamed from: v */
    public int f470v;

    /* renamed from: w */
    public boolean f471w;

    /* renamed from: x */
    public int f472x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0090a implements View.OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C1135a f473e;

        public C0090a(ActionBarContextView actionBarContextView, C1135a aVar) {
            this.f473e = aVar;
        }

        public void onClick(View view) {
            this.f473e.mo4408c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903072(0x7f030020, float:1.7412952E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = p039g.C0934b.f3462d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = p051i.C1021a.m2945a(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.util.WeakHashMap<android.view.View, j0.q> r0 = p058j0.C1061o.f3808a
            r3.setBackground(r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f469u = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f470v = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f666i = r4
            r4 = 2
            r0 = 2131492869(0x7f0c0005, float:1.8609202E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.f472x = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo408f(p063k.C1135a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f463o
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f472x
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f463o = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f463o
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f463o
            r2 = 2131296324(0x7f090044, float:1.8210561E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f464p = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo4410e()
            androidx.appcompat.view.menu.e r7 = (androidx.appcompat.view.menu.C0074e) r7
            androidx.appcompat.widget.c r0 = r6.f665h
            if (r0 == 0) goto L_0x0041
            r0.mo776b()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f665h = r0
            r2 = 1
            r0.f698p = r2
            r0.f699q = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.c r3 = r6.f665h
            android.content.Context r4 = r6.f663f
            r7.mo253b(r3, r4)
            androidx.appcompat.widget.c r7 = r6.f665h
            androidx.appcompat.view.menu.j r3 = r7.f304l
            if (r3 != 0) goto L_0x0079
            android.view.LayoutInflater r4 = r7.f300h
            int r5 = r7.f302j
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.j r1 = (androidx.appcompat.view.menu.C0084j) r1
            r7.f304l = r1
            androidx.appcompat.view.menu.e r4 = r7.f299g
            r1.mo183b(r4)
            r7.mo207j(r2)
        L_0x0079:
            androidx.appcompat.view.menu.j r1 = r7.f304l
            if (r3 == r1) goto L_0x0083
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f664g = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, j0.q> r2 = p058j0.C1061o.f3808a
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f664g
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo408f(k.a):void");
    }

    /* renamed from: g */
    public final void mo409g() {
        if (this.f466r == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f466r = linearLayout;
            this.f467s = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f468t = (TextView) this.f466r.findViewById(R.id.action_bar_subtitle);
            if (this.f469u != 0) {
                this.f467s.setTextAppearance(getContext(), this.f469u);
            }
            if (this.f470v != 0) {
                this.f468t.setTextAppearance(getContext(), this.f470v);
            }
        }
        this.f467s.setText(this.f461m);
        this.f468t.setText(this.f462n);
        boolean z = !TextUtils.isEmpty(this.f461m);
        boolean z2 = !TextUtils.isEmpty(this.f462n);
        int i = 0;
        this.f468t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f466r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f466r.getParent() == null) {
            addView(this.f466r);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f462n;
    }

    public CharSequence getTitle() {
        return this.f461m;
    }

    /* renamed from: h */
    public void mo416h() {
        removeAllViews();
        this.f465q = null;
        this.f664g = null;
        this.f665h = null;
        View view = this.f464p;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0137c cVar = this.f665h;
        if (cVar != null) {
            cVar.mo778k();
            this.f665h.mo779l();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f461m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0170i1.m489a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f463o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f463o.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a ? paddingRight - i5 : paddingRight + i5;
            int d = i7 + mo734d(this.f463o, i7, paddingTop, paddingTop2, a);
            paddingRight = a ? d - i6 : d + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f466r;
        if (!(linearLayout == null || this.f465q != null || linearLayout.getVisibility() == 8)) {
            i8 += mo734d(this.f466r, i8, paddingTop, paddingTop2, a);
        }
        int i9 = i8;
        View view2 = this.f465q;
        if (view2 != null) {
            mo734d(view2, i9, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f664g;
        if (actionMenuView != null) {
            mo734d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = EnumBarcodeFormat.BF_MICRO_QR;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f666i;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f463o;
            if (view != null) {
                int c = mo733c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f463o.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f664g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo733c(this.f664g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f466r;
            if (linearLayout != null && this.f465q == null) {
                if (this.f471w) {
                    this.f466r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f466r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f466r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo733c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f465q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f465q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f666i <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f666i = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f465q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f465q = view;
        if (!(view == null || (linearLayout = this.f466r) == null)) {
            removeView(linearLayout);
            this.f466r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f462n = charSequence;
        mo409g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f461m = charSequence;
        mo409g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f471w) {
            requestLayout();
        }
        this.f471w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
