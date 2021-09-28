package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.lang.reflect.Field;
import p007au.gov.dfat.vdsncchecker.R;
import p057j.C1042a;
import p076m0.C1422c;

/* renamed from: androidx.appcompat.widget.j0 */
public class C0172j0 extends ListView {

    /* renamed from: e */
    public final Rect f808e = new Rect();

    /* renamed from: f */
    public int f809f = 0;

    /* renamed from: g */
    public int f810g = 0;

    /* renamed from: h */
    public int f811h = 0;

    /* renamed from: i */
    public int f812i = 0;

    /* renamed from: j */
    public int f813j;

    /* renamed from: k */
    public Field f814k;

    /* renamed from: l */
    public C0173a f815l;

    /* renamed from: m */
    public boolean f816m;

    /* renamed from: n */
    public boolean f817n;

    /* renamed from: o */
    public boolean f818o;

    /* renamed from: p */
    public C1422c f819p;

    /* renamed from: q */
    public C0174b f820q;

    /* renamed from: androidx.appcompat.widget.j0$a */
    public static class C0173a extends C1042a {

        /* renamed from: f */
        public boolean f821f = true;

        public C0173a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f821f) {
                this.f3777e.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f821f) {
                this.f3777e.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f821f) {
                this.f3777e.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f821f) {
                return this.f3777e.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f821f) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    public class C0174b implements Runnable {
        public C0174b() {
        }

        public void run() {
            C0172j0 j0Var = C0172j0.this;
            j0Var.f820q = null;
            j0Var.drawableStateChanged();
        }
    }

    public C0172j0(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f817n = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f814k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0173a aVar = this.f815l;
        if (aVar != null) {
            aVar.f821f = z;
        }
    }

    /* renamed from: a */
    public int mo957a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        View view = null;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, EnumBarcodeFormat.BF_MICRO_QR) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return (i3 < 0 || i5 <= i3 || i7 <= 0 || i4 == i2) ? i2 : i7;
            }
            if (i3 >= 0 && i5 >= i3) {
                i7 = i4;
            }
            i5++;
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo958b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r0 = 2
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 == r0) goto L_0x001f
            r0 = r4
            r4 = r5
            goto L_0x0126
        L_0x0016:
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r0 = r5
        L_0x0019:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0023
        L_0x001f:
            r0 = r5
            r4 = r0
            goto L_0x0126
        L_0x0023:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            goto L_0x0126
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f818o = r4
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.f813j
            if (r0 == r9) goto L_0x006d
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006d
            if (r0 == r10) goto L_0x006d
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006d
            r0.setPressed(r5)
        L_0x006d:
            r1.f813j = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0089
            r10.setPressed(r4)
        L_0x0089:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0093
            if (r8 == r9) goto L_0x0093
            r12 = r4
            goto L_0x0094
        L_0x0093:
            r12 = r5
        L_0x0094:
            if (r12 == 0) goto L_0x0099
            r11.setVisible(r5, r5)
        L_0x0099:
            android.graphics.Rect r0 = r1.f808e
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.f809f
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.f810g
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.f811h
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.f812i
            int r4 = r4 + r13
            r0.bottom = r4
            java.lang.reflect.Field r0 = r1.f814k     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r4 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r4 == r0) goto L_0x00ee
            java.lang.reflect.Field r4 = r1.f814k     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r0 != 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = r5
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r8 == r9) goto L_0x00ee
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ee:
            if (r12 == 0) goto L_0x0109
            android.graphics.Rect r0 = r1.f808e
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = r5
        L_0x0103:
            r11.setVisible(r12, r5)
            r11.setHotspot(r4, r0)
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0114
            if (r8 == r9) goto L_0x0114
            r0.setHotspot(r7, r6)
        L_0x0114:
            r1.setSelectorEnabled(r5)
            r16.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0124
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0124:
            r4 = r5
            r0 = 1
        L_0x0126:
            if (r0 == 0) goto L_0x012a
            if (r4 == 0) goto L_0x0142
        L_0x012a:
            r1.f818o = r5
            r1.setPressed(r5)
            r16.drawableStateChanged()
            int r3 = r1.f813j
            int r4 = r16.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0142
            r3.setPressed(r5)
        L_0x0142:
            if (r0 == 0) goto L_0x015a
            m0.c r3 = r1.f819p
            if (r3 != 0) goto L_0x014f
            m0.c r3 = new m0.c
            r3.<init>(r1)
            r1.f819p = r3
        L_0x014f:
            m0.c r3 = r1.f819p
            boolean r4 = r3.f4486t
            r4 = 1
            r3.f4486t = r4
            r3.onTouch(r1, r2)
            goto L_0x0167
        L_0x015a:
            m0.c r2 = r1.f819p
            if (r2 == 0) goto L_0x0167
            boolean r3 = r2.f4486t
            if (r3 == 0) goto L_0x0165
            r2.mo5256d()
        L_0x0165:
            r2.f4486t = r5
        L_0x0167:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0172j0.mo958b(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: c */
    public final void mo959c() {
        Drawable selector = getSelector();
        if (selector != null && this.f818o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f808e.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f808e);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f820q == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            mo959c();
        }
    }

    public boolean hasFocus() {
        return this.f817n || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f817n || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f817n || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f817n && this.f816m) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f820q = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f820q == null) {
            C0174b bVar = new C0174b();
            this.f820q = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                mo959c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f813j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0174b bVar = this.f820q;
        if (bVar != null) {
            C0172j0 j0Var = C0172j0.this;
            j0Var.f820q = null;
            j0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f816m = z;
    }

    public void setSelector(Drawable drawable) {
        C0173a aVar = drawable != null ? new C0173a(drawable) : null;
        this.f815l = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f809f = rect.left;
        this.f810g = rect.top;
        this.f811h = rect.right;
        this.f812i = rect.bottom;
    }
}
