package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: e */
    public boolean f451e;

    /* renamed from: f */
    public View f452f;

    /* renamed from: g */
    public View f453g;

    /* renamed from: h */
    public View f454h;

    /* renamed from: i */
    public Drawable f455i;

    /* renamed from: j */
    public Drawable f456j;

    /* renamed from: k */
    public Drawable f457k;

    /* renamed from: l */
    public boolean f458l;

    /* renamed from: m */
    public boolean f459m;

    /* renamed from: n */
    public int f460n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0133b bVar = new C0133b(this);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3459a);
        boolean z = false;
        this.f455i = obtainStyledAttributes.getDrawable(0);
        this.f456j = obtainStyledAttributes.getDrawable(2);
        this.f460n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f458l = true;
            this.f457k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f458l ? this.f455i == null && this.f456j == null : this.f457k == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo388a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo389b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f455i;
        if (drawable != null && drawable.isStateful()) {
            this.f455i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f456j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f456j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f457k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f457k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f452f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f455i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f456j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f457k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f453g = findViewById(R.id.action_bar);
        this.f454h = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f451e || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f452f
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f458l
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f457k
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f455i
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f453g
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.f455i
            android.view.View r7 = r4.f453g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f453g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f453g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f453g
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f454h
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f455i
            android.view.View r7 = r4.f454h
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f454h
            int r8 = r8.getTop()
            android.view.View r0 = r4.f454h
            int r0 = r0.getRight()
            android.view.View r2 = r4.f454h
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f455i
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f459m = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f456j
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f453g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f460n
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f453g
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f452f
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f453g
            boolean r0 = r3.mo389b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f453g
        L_0x0042:
            int r0 = r3.mo388a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f454h
            boolean r0 = r3.mo389b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f454h
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f452f
            int r1 = r3.mo388a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f455i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f455i);
        }
        this.f455i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f453g;
            if (view != null) {
                this.f455i.setBounds(view.getLeft(), this.f453g.getTop(), this.f453g.getRight(), this.f453g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f458l ? !(this.f455i == null && this.f456j == null) : this.f457k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f457k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f457k);
        }
        this.f457k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f458l && (drawable2 = this.f457k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f458l ? this.f455i == null && this.f456j == null : this.f457k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f456j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f456j);
        }
        this.f456j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f459m && (drawable2 = this.f456j) != null) {
                drawable2.setBounds(this.f452f.getLeft(), this.f452f.getTop(), this.f452f.getRight(), this.f452f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f458l ? !(this.f455i == null && this.f456j == null) : this.f457k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0210u0 u0Var) {
        View view = this.f452f;
        if (view != null) {
            removeView(view);
        }
        this.f452f = u0Var;
        if (u0Var != null) {
            addView(u0Var);
            ViewGroup.LayoutParams layoutParams = u0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            u0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f451e = z;
        setDescendantFocusability(z ? 393216 : EnumBarcodeFormat.BF_PATCHCODE);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f455i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f456j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f457k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f455i && !this.f458l) || (drawable == this.f456j && this.f459m) || ((drawable == this.f457k && this.f458l) || super.verifyDrawable(drawable));
    }
}
