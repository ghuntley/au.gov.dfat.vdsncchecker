package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p000a.C0001b;

/* renamed from: androidx.appcompat.widget.m0 */
public class C0184m0 extends ViewGroup {

    /* renamed from: e */
    public boolean f849e;

    /* renamed from: f */
    public int f850f;

    /* renamed from: g */
    public int f851g;

    /* renamed from: h */
    public int f852h;

    /* renamed from: i */
    public int f853i;

    /* renamed from: j */
    public int f854j;

    /* renamed from: k */
    public float f855k;

    /* renamed from: l */
    public boolean f856l;

    /* renamed from: m */
    public int[] f857m;

    /* renamed from: n */
    public int[] f858n;

    /* renamed from: o */
    public Drawable f859o;

    /* renamed from: p */
    public int f860p;

    /* renamed from: q */
    public int f861q;

    /* renamed from: r */
    public int f862r;

    /* renamed from: s */
    public int f863s;

    /* renamed from: androidx.appcompat.widget.m0$a */
    public static class C0185a extends LinearLayout.LayoutParams {
        public C0185a(int i, int i2) {
            super(i, i2);
        }

        public C0185a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0185a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0184m0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0184m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r14 = r3.getResourceId(5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0184m0(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.f849e = r0
            r1 = -1
            r11.f850f = r1
            r2 = 0
            r11.f851g = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f853i = r3
            int[] r6 = p039g.C0934b.f3471m
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            p058j0.C1061o.m3033n(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L_0x0029
            r11.setOrientation(r13)
        L_0x0029:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L_0x0032
            r11.setGravity(r13)
        L_0x0032:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L_0x003c
            r11.setBaselineAligned(r13)
        L_0x003c:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f855k = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.f850f = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f856l = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L_0x0065
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r12 = p051i.C1021a.m2945a(r12, r14)
            goto L_0x0069
        L_0x0065:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L_0x0069:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.f862r = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.f863s = r12
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0184m0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0185a;
    }

    /* renamed from: f */
    public void mo1024f(Canvas canvas, int i) {
        this.f859o.setBounds(getPaddingLeft() + this.f863s, i, (getWidth() - getPaddingRight()) - this.f863s, this.f861q + i);
        this.f859o.draw(canvas);
    }

    /* renamed from: g */
    public void mo1025g(Canvas canvas, int i) {
        this.f859o.setBounds(i, getPaddingTop() + this.f863s, this.f860p + i, (getHeight() - getPaddingBottom()) - this.f863s);
        this.f859o.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.f850f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f850f;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f851g;
                if (this.f852h == 1 && (i = this.f853i & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f854j) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f854j;
                    }
                }
                return i3 + ((C0185a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f850f == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f850f;
    }

    public Drawable getDividerDrawable() {
        return this.f859o;
    }

    public int getDividerPadding() {
        return this.f863s;
    }

    public int getDividerWidth() {
        return this.f860p;
    }

    public int getGravity() {
        return this.f853i;
    }

    public int getOrientation() {
        return this.f852h;
    }

    public int getShowDividers() {
        return this.f862r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f855k;
    }

    /* renamed from: h */
    public C0185a generateDefaultLayoutParams() {
        int i = this.f852h;
        if (i == 0) {
            return new C0185a(-2, -2);
        }
        if (i == 1) {
            return new C0185a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public C0185a generateLayoutParams(AttributeSet attributeSet) {
        return new C0185a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public C0185a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0185a(layoutParams);
    }

    /* renamed from: k */
    public boolean mo1036k(int i) {
        if (i == 0) {
            return (this.f862r & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f862r & 4) != 0;
        }
        if ((this.f862r & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f859o != null) {
            int i4 = 0;
            if (this.f852h == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo1036k(i4))) {
                        mo1024f(canvas, (childAt.getTop() - ((C0185a) childAt.getLayoutParams()).topMargin) - this.f861q);
                    }
                    i4++;
                }
                if (mo1036k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    mo1024f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f861q : childAt2.getBottom() + ((C0185a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C0170i1.m489a(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo1036k(i4))) {
                    C0185a aVar = (C0185a) childAt3.getLayoutParams();
                    mo1025g(canvas, a ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f860p);
                }
                i4++;
            }
            if (mo1036k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0185a aVar2 = (C0185a) childAt4.getLayoutParams();
                    if (a) {
                        i3 = childAt4.getLeft();
                        i2 = aVar2.leftMargin;
                    } else {
                        i = childAt4.getRight() + aVar2.rightMargin;
                        mo1025g(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    mo1025g(canvas, i);
                } else {
                    i3 = getWidth();
                    i2 = getPaddingRight();
                }
                i = (i3 - i2) - this.f860p;
                mo1025g(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f852h
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 1
            if (r1 != r7) goto L_0x00b6
            int r1 = r17.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r17.getPaddingRight()
            int r9 = r8 - r9
            int r8 = r8 - r1
            int r10 = r17.getPaddingRight()
            int r8 = r8 - r10
            int r10 = r17.getVirtualChildCount()
            int r11 = r0.f853i
            r12 = r11 & 112(0x70, float:1.57E-43)
            r6 = r6 & r11
            if (r12 == r3) goto L_0x0041
            if (r12 == r2) goto L_0x0035
            int r2 = r17.getPaddingTop()
            goto L_0x004d
        L_0x0035:
            int r2 = r17.getPaddingTop()
            int r2 = r2 + r22
            int r2 = r2 - r20
            int r3 = r0.f854j
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0041:
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r11 = r0.f854j
            int r3 = r3 - r11
            int r3 = r3 / 2
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r10) goto L_0x01c9
            android.view.View r11 = r0.getChildAt(r3)
            if (r11 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b1
        L_0x0059:
            int r12 = r11.getVisibility()
            if (r12 == r4) goto L_0x00b1
            int r4 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.m0$a r13 = (androidx.appcompat.widget.C0184m0.C0185a) r13
            int r14 = r13.gravity
            if (r14 >= 0) goto L_0x0072
            r14 = r6
        L_0x0072:
            java.util.WeakHashMap<android.view.View, j0.q> r15 = p058j0.C1061o.f3808a
            int r15 = r17.getLayoutDirection()
            int r14 = android.view.Gravity.getAbsoluteGravity(r14, r15)
            r14 = r14 & 7
            if (r14 == r7) goto L_0x0089
            if (r14 == r5) goto L_0x0086
            int r5 = r13.leftMargin
            int r5 = r5 + r1
            goto L_0x0094
        L_0x0086:
            int r5 = r9 - r4
            goto L_0x0091
        L_0x0089:
            int r5 = r8 - r4
            int r5 = r5 / 2
            int r5 = r5 + r1
            int r14 = r13.leftMargin
            int r5 = r5 + r14
        L_0x0091:
            int r14 = r13.rightMargin
            int r5 = r5 - r14
        L_0x0094:
            boolean r14 = r0.mo1036k(r3)
            if (r14 == 0) goto L_0x009d
            int r14 = r0.f861q
            int r2 = r2 + r14
        L_0x009d:
            int r14 = r13.topMargin
            int r2 = r2 + r14
            int r14 = r2 + 0
            int r4 = r4 + r5
            int r15 = r12 + r14
            r11.layout(r5, r14, r4, r15)
            int r4 = r13.bottomMargin
            r5 = 0
            int r2 = androidx.appcompat.widget.C0147d.m397a(r12, r4, r5, r2)
            int r3 = r3 + 0
        L_0x00b1:
            int r3 = r3 + r7
            r4 = 8
            r5 = 5
            goto L_0x004e
        L_0x00b6:
            boolean r1 = androidx.appcompat.widget.C0170i1.m489a(r17)
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r4 = r17.getPaddingBottom()
            int r4 = r3 - r4
            int r3 = r3 - r2
            int r5 = r17.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r17.getVirtualChildCount()
            int r8 = r0.f853i
            r6 = r6 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r9 = r0.f849e
            int[] r10 = r0.f857m
            int[] r11 = r0.f858n
            java.util.WeakHashMap<android.view.View, j0.q> r12 = p058j0.C1061o.f3808a
            int r12 = r17.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r12)
            if (r6 == r7) goto L_0x00fb
            r12 = 5
            if (r6 == r12) goto L_0x00ef
            int r6 = r17.getPaddingLeft()
            goto L_0x0107
        L_0x00ef:
            int r6 = r17.getPaddingLeft()
            int r6 = r6 + r21
            int r6 = r6 - r19
            int r12 = r0.f854j
            int r6 = r6 - r12
            goto L_0x0107
        L_0x00fb:
            int r6 = r17.getPaddingLeft()
            int r12 = r21 - r19
            int r13 = r0.f854j
            int r12 = r12 - r13
            int r12 = r12 / 2
            int r6 = r6 + r12
        L_0x0107:
            if (r1 == 0) goto L_0x010d
            int r1 = r5 + -1
            r7 = -1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            r12 = 0
        L_0x010f:
            if (r12 >= r5) goto L_0x01c9
            int r13 = r7 * r12
            int r13 = r13 + r1
            android.view.View r14 = r0.getChildAt(r13)
            if (r14 != 0) goto L_0x0120
            int r6 = r6 + 0
            r18 = r1
            goto L_0x01b3
        L_0x0120:
            int r15 = r14.getVisibility()
            r18 = r1
            r1 = 8
            if (r15 == r1) goto L_0x01b3
            int r1 = r14.getMeasuredWidth()
            int r15 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r20 = r5
            r5 = r16
            androidx.appcompat.widget.m0$a r5 = (androidx.appcompat.widget.C0184m0.C0185a) r5
            r19 = r7
            if (r9 == 0) goto L_0x014c
            int r7 = r5.height
            r22 = r8
            r8 = -1
            if (r7 == r8) goto L_0x014e
            int r7 = r14.getBaseline()
            goto L_0x014f
        L_0x014c:
            r22 = r8
        L_0x014e:
            r7 = -1
        L_0x014f:
            int r8 = r5.gravity
            if (r8 >= 0) goto L_0x0155
            r8 = r22
        L_0x0155:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r16 = r9
            r9 = 16
            if (r8 == r9) goto L_0x0188
            r9 = 48
            if (r8 == r9) goto L_0x017a
            r9 = 80
            if (r8 == r9) goto L_0x0167
            r8 = r2
            goto L_0x0194
        L_0x0167:
            int r8 = r4 - r15
            int r9 = r5.bottomMargin
            int r8 = r8 - r9
            r9 = -1
            if (r7 == r9) goto L_0x0194
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 - r7
            r7 = 2
            r7 = r11[r7]
            int r7 = r7 - r9
            int r8 = r8 - r7
            goto L_0x0194
        L_0x017a:
            r8 = -1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            if (r7 == r8) goto L_0x0186
            r8 = 1
            r8 = r10[r8]
            int r8 = r8 - r7
            int r8 = r8 + r9
            goto L_0x0194
        L_0x0186:
            r8 = r9
            goto L_0x0194
        L_0x0188:
            int r7 = r3 - r15
            int r7 = r7 / 2
            int r7 = r7 + r2
            int r8 = r5.topMargin
            int r7 = r7 + r8
            int r8 = r5.bottomMargin
            int r8 = r7 - r8
        L_0x0194:
            boolean r7 = r0.mo1036k(r13)
            if (r7 == 0) goto L_0x019d
            int r7 = r0.f860p
            int r6 = r6 + r7
        L_0x019d:
            int r7 = r5.leftMargin
            int r6 = r6 + r7
            int r7 = r6 + 0
            int r9 = r1 + r7
            int r15 = r15 + r8
            r14.layout(r7, r8, r9, r15)
            int r5 = r5.rightMargin
            r7 = 0
            int r1 = androidx.appcompat.widget.C0147d.m397a(r1, r5, r7, r6)
            int r12 = r12 + 0
            r6 = r1
            goto L_0x01bb
        L_0x01b3:
            r20 = r5
            r19 = r7
            r22 = r8
            r16 = r9
        L_0x01bb:
            int r12 = r12 + 1
            r1 = r18
            r7 = r19
            r5 = r20
            r8 = r22
            r9 = r16
            goto L_0x010f
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0184m0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0679 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x06f0  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0892  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            r8 = r36
            int r0 = r6.f852h
            r1 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 0
            if (r0 != r9) goto L_0x0396
            r6.f854j = r10
            int r11 = r34.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r35)
            int r13 = android.view.View.MeasureSpec.getMode(r36)
            int r14 = r6.f850f
            boolean r15 = r6.f856l
            r0 = r4
            r16 = r9
            r7 = r10
            r8 = r7
            r17 = r8
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r9 = r2
            r2 = r16
        L_0x003a:
            if (r7 >= r11) goto L_0x016b
            android.view.View r23 = r6.getChildAt(r7)
            if (r23 != 0) goto L_0x0049
            int r0 = r6.f854j
            int r0 = r0 + r20
            r6.f854j = r0
            goto L_0x0051
        L_0x0049:
            int r2 = r23.getVisibility()
            if (r2 != r3) goto L_0x0059
            int r7 = r7 + 0
        L_0x0051:
            r0 = 1
            r2 = r0
            r27 = r11
            r26 = r13
            goto L_0x0159
        L_0x0059:
            boolean r2 = r6.mo1036k(r7)
            if (r2 == 0) goto L_0x0066
            int r2 = r6.f854j
            int r3 = r6.f861q
            int r2 = r2 + r3
            r6.f854j = r2
        L_0x0066:
            android.view.ViewGroup$LayoutParams r2 = r23.getLayoutParams()
            r3 = r2
            androidx.appcompat.widget.m0$a r3 = (androidx.appcompat.widget.C0184m0.C0185a) r3
            float r2 = r3.weight
            float r20 = r4 + r2
            if (r13 != r5) goto L_0x0092
            int r4 = r3.height
            if (r4 != 0) goto L_0x0092
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0092
            int r0 = r6.f854j
            int r1 = r3.topMargin
            int r1 = r1 + r0
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f854j = r0
            r21 = 1
            r0 = 1
            r27 = r11
            r26 = r13
            r13 = r3
            goto L_0x00e3
        L_0x0092:
            int r4 = r3.height
            if (r4 != 0) goto L_0x009f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            r3.height = r1
            r1 = 0
            r5 = r1
            goto L_0x00a0
        L_0x009f:
            r5 = r9
        L_0x00a0:
            r4 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            int r0 = r6.f854j
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            r24 = r0
            r25 = 1
            r0 = r34
            r1 = r23
            r2 = r35
            r26 = r13
            r13 = r3
            r3 = r4
            r4 = r36
            r27 = r11
            r11 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r9) goto L_0x00c5
            r13.height = r11
        L_0x00c5:
            int r0 = r23.getMeasuredHeight()
            int r1 = r6.f854j
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + 0
            int r1 = java.lang.Math.max(r1, r2)
            r6.f854j = r1
            if (r15 == 0) goto L_0x00e1
            int r10 = java.lang.Math.max(r0, r10)
        L_0x00e1:
            r0 = r25
        L_0x00e3:
            if (r14 < 0) goto L_0x00ed
            int r1 = r7 + 1
            if (r14 != r1) goto L_0x00ed
            int r1 = r6.f854j
            r6.f851g = r1
        L_0x00ed:
            if (r7 >= r14) goto L_0x00ff
            float r1 = r13.weight
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x010c
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x010c
            r1 = r0
            r22 = r1
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r23.getMeasuredWidth()
            int r3 = r3 + r2
            int r4 = java.lang.Math.max(r8, r3)
            int r5 = r23.getMeasuredState()
            r9 = r19
            int r5 = android.view.View.combineMeasuredStates(r9, r5)
            if (r16 == 0) goto L_0x012e
            int r8 = r13.width
            r9 = -1
            if (r8 != r9) goto L_0x012e
            r8 = r0
            goto L_0x012f
        L_0x012e:
            r8 = 0
        L_0x012f:
            float r9 = r13.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0141
            if (r1 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r2 = r3
        L_0x013a:
            r11 = r18
            int r18 = java.lang.Math.max(r11, r2)
            goto L_0x014f
        L_0x0141:
            r11 = r18
            if (r1 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r2 = r3
        L_0x0147:
            r1 = r17
            int r17 = java.lang.Math.max(r1, r2)
            r18 = r11
        L_0x014f:
            int r7 = r7 + 0
            r2 = r0
            r19 = r5
            r16 = r8
            r8 = r4
            r4 = r20
        L_0x0159:
            int r7 = r7 + 1
            r20 = 0
            r1 = -2
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r0 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r13 = r26
            r11 = r27
            goto L_0x003a
        L_0x016b:
            r27 = r11
            r26 = r13
            r1 = r17
            r11 = r18
            r9 = r19
            int r0 = r6.f854j
            r7 = r27
            if (r0 <= 0) goto L_0x0188
            boolean r0 = r6.mo1036k(r7)
            if (r0 == 0) goto L_0x0188
            int r0 = r6.f854j
            int r3 = r6.f861q
            int r0 = r0 + r3
            r6.f854j = r0
        L_0x0188:
            if (r15 == 0) goto L_0x01d1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r26
            if (r3 == r0) goto L_0x0192
            if (r3 != 0) goto L_0x01d3
        L_0x0192:
            r0 = 0
            r6.f854j = r0
            r5 = r0
        L_0x0196:
            if (r0 >= r7) goto L_0x01d3
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x01a6
            int r13 = r6.f854j
            int r13 = r13 + r5
            r6.f854j = r13
            r17 = r0
            goto L_0x01cb
        L_0x01a6:
            int r5 = r13.getVisibility()
            r14 = 8
            if (r5 != r14) goto L_0x01b1
            int r0 = r0 + 0
            goto L_0x01cd
        L_0x01b1:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            androidx.appcompat.widget.m0$a r5 = (androidx.appcompat.widget.C0184m0.C0185a) r5
            int r13 = r6.f854j
            int r14 = r13 + r10
            r17 = r0
            int r0 = r5.topMargin
            int r14 = r14 + r0
            int r0 = r5.bottomMargin
            int r14 = r14 + r0
            int r14 = r14 + 0
            int r0 = java.lang.Math.max(r13, r14)
            r6.f854j = r0
        L_0x01cb:
            r0 = r17
        L_0x01cd:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x0196
        L_0x01d1:
            r3 = r26
        L_0x01d3:
            int r0 = r6.f854j
            int r5 = r34.getPaddingTop()
            int r13 = r34.getPaddingBottom()
            int r13 = r13 + r5
            int r13 = r13 + r0
            r6.f854j = r13
            int r0 = r34.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r5 = 0
            r13 = r36
            int r0 = android.view.View.resolveSizeAndState(r0, r13, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r0
            int r14 = r6.f854j
            int r5 = r5 - r14
            if (r21 != 0) goto L_0x0244
            if (r5 == 0) goto L_0x0201
            r14 = 0
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0201
            goto L_0x0244
        L_0x0201:
            int r1 = java.lang.Math.max(r1, r11)
            if (r15 == 0) goto L_0x023e
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 == r2) goto L_0x023e
            r2 = 0
        L_0x020c:
            if (r2 >= r7) goto L_0x023e
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x023b
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x021d
            goto L_0x023b
        L_0x021d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.m0$a r4 = (androidx.appcompat.widget.C0184m0.C0185a) r4
            float r4 = r4.weight
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x023b
            int r4 = r3.getMeasuredWidth()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            r3.measure(r4, r5)
        L_0x023b:
            int r2 = r2 + 1
            goto L_0x020c
        L_0x023e:
            r5 = r35
        L_0x0240:
            r10 = r16
            goto L_0x0336
        L_0x0244:
            float r10 = r6.f855k
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x024c
            r4 = r10
        L_0x024c:
            r10 = 0
            r6.f854j = r10
        L_0x024f:
            if (r10 >= r7) goto L_0x0324
            android.view.View r11 = r6.getChildAt(r10)
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0267
            r17 = r2
            r26 = r3
            r18 = r5
            r5 = r35
            goto L_0x031a
        L_0x0267:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.m0$a r14 = (androidx.appcompat.widget.C0184m0.C0185a) r14
            float r15 = r14.weight
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto L_0x02c7
            r17 = r2
            float r2 = (float) r5
            float r2 = r2 * r15
            float r2 = r2 / r4
            int r2 = (int) r2
            float r4 = r4 - r15
            int r5 = r5 - r2
            int r15 = r34.getPaddingLeft()
            int r18 = r34.getPaddingRight()
            int r18 = r18 + r15
            int r15 = r14.leftMargin
            int r18 = r18 + r15
            int r15 = r14.rightMargin
            int r15 = r18 + r15
            r18 = r4
            int r4 = r14.width
            r19 = r5
            r5 = r35
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r5, r15, r4)
            int r15 = r14.height
            if (r15 != 0) goto L_0x02a7
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x02a4
            goto L_0x02a7
        L_0x02a4:
            if (r2 <= 0) goto L_0x02ae
            goto L_0x02af
        L_0x02a7:
            int r15 = r11.getMeasuredHeight()
            int r2 = r2 + r15
            if (r2 >= 0) goto L_0x02af
        L_0x02ae:
            r2 = 0
        L_0x02af:
            r15 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11.measure(r4, r2)
            int r2 = r11.getMeasuredState()
            r2 = r2 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r4 = r18
            r2 = r19
            goto L_0x02cc
        L_0x02c7:
            r17 = r2
            r2 = r5
            r5 = r35
        L_0x02cc:
            int r15 = r14.leftMargin
            r18 = r2
            int r2 = r14.rightMargin
            int r15 = r15 + r2
            int r2 = r11.getMeasuredWidth()
            int r2 = r2 + r15
            int r8 = java.lang.Math.max(r8, r2)
            r19 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x02ec
            int r2 = r14.width
            r26 = r3
            r3 = -1
            if (r2 != r3) goto L_0x02ef
            r2 = r17
            goto L_0x02f0
        L_0x02ec:
            r26 = r3
            r3 = -1
        L_0x02ef:
            r2 = 0
        L_0x02f0:
            if (r2 == 0) goto L_0x02f3
            goto L_0x02f5
        L_0x02f3:
            r15 = r19
        L_0x02f5:
            int r1 = java.lang.Math.max(r1, r15)
            if (r16 == 0) goto L_0x0302
            int r2 = r14.width
            if (r2 != r3) goto L_0x0302
            r2 = r17
            goto L_0x0303
        L_0x0302:
            r2 = 0
        L_0x0303:
            int r3 = r6.f854j
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r3
            int r15 = r14.topMargin
            int r11 = r11 + r15
            int r14 = r14.bottomMargin
            int r11 = r11 + r14
            int r11 = r11 + 0
            int r3 = java.lang.Math.max(r3, r11)
            r6.f854j = r3
            r16 = r2
        L_0x031a:
            int r10 = r10 + 1
            r2 = r17
            r5 = r18
            r3 = r26
            goto L_0x024f
        L_0x0324:
            r5 = r35
            int r2 = r6.f854j
            int r3 = r34.getPaddingTop()
            int r4 = r34.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f854j = r4
            goto L_0x0240
        L_0x0336:
            if (r10 != 0) goto L_0x033d
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x033d
            goto L_0x033e
        L_0x033d:
            r1 = r8
        L_0x033e:
            int r2 = r34.getPaddingLeft()
            int r3 = r34.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r34.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r5, r9)
            r6.setMeasuredDimension(r1, r0)
            if (r22 == 0) goto L_0x08ce
            int r0 = r34.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r9 = r0
        L_0x0365:
            if (r9 >= r7) goto L_0x08ce
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0393
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.m0$a r10 = (androidx.appcompat.widget.C0184m0.C0185a) r10
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x0393
            int r11 = r10.height
            int r0 = r1.getMeasuredHeight()
            r10.height = r0
            r3 = 0
            r5 = 0
            r0 = r34
            r2 = r8
            r4 = r36
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.height = r11
        L_0x0393:
            int r9 = r9 + 1
            goto L_0x0365
        L_0x0396:
            r5 = r7
            r13 = r8
            r6.f854j = r10
            int r7 = r34.getVirtualChildCount()
            int r8 = android.view.View.MeasureSpec.getMode(r35)
            int r10 = android.view.View.MeasureSpec.getMode(r36)
            int[] r0 = r6.f857m
            r1 = 4
            if (r0 == 0) goto L_0x03af
            int[] r0 = r6.f858n
            if (r0 != 0) goto L_0x03b7
        L_0x03af:
            int[] r0 = new int[r1]
            r6.f857m = r0
            int[] r0 = new int[r1]
            r6.f858n = r0
        L_0x03b7:
            int[] r11 = r6.f857m
            int[] r12 = r6.f858n
            r0 = 3
            r1 = -1
            r11[r0] = r1
            r14 = 2
            r11[r14] = r1
            r11[r9] = r1
            r2 = 0
            r11[r2] = r1
            r12[r0] = r1
            r12[r14] = r1
            r12[r9] = r1
            r12[r2] = r1
            boolean r15 = r6.f849e
            boolean r4 = r6.f856l
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 != r0) goto L_0x03da
            r16 = r9
            goto L_0x03dd
        L_0x03da:
            r0 = 0
            r16 = r0
        L_0x03dd:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r17
            r28 = r19
            r19 = r9
            r9 = r18
            r33 = r3
            r3 = r0
            r0 = r33
        L_0x03f8:
            if (r0 >= r7) goto L_0x0595
            android.view.View r5 = r6.getChildAt(r0)
            if (r5 != 0) goto L_0x040b
            int r5 = r6.f854j
            int r5 = r5 + 0
            r6.f854j = r5
            r22 = r2
            r23 = r3
            goto L_0x0419
        L_0x040b:
            r22 = r2
            int r2 = r5.getVisibility()
            r23 = r3
            r3 = 8
            if (r2 != r3) goto L_0x0423
            int r0 = r0 + 0
        L_0x0419:
            r13 = r35
            r2 = r22
            r3 = r23
            r22 = r4
            goto L_0x058c
        L_0x0423:
            boolean r2 = r6.mo1036k(r0)
            if (r2 == 0) goto L_0x0430
            int r2 = r6.f854j
            int r3 = r6.f860p
            int r2 = r2 + r3
            r6.f854j = r2
        L_0x0430:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            r3 = r2
            androidx.appcompat.widget.m0$a r3 = (androidx.appcompat.widget.C0184m0.C0185a) r3
            float r2 = r3.weight
            float r24 = r1 + r2
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x048f
            int r1 = r3.width
            if (r1 != 0) goto L_0x048f
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x048f
            if (r16 == 0) goto L_0x0457
            int r1 = r6.f854j
            int r2 = r3.leftMargin
            r25 = r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            r6.f854j = r2
            goto L_0x0467
        L_0x0457:
            r25 = r0
            int r0 = r6.f854j
            int r1 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f854j = r0
        L_0x0467:
            if (r15 == 0) goto L_0x047e
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r0, r0)
            r13 = r35
            r2 = r3
            r29 = r22
            r31 = r23
            r22 = r4
            r23 = r5
            goto L_0x0503
        L_0x047e:
            r0 = 1073741824(0x40000000, float:2.0)
            r13 = r35
            r2 = r3
            r29 = r22
            r31 = r23
            r20 = 1
            r22 = r4
            r23 = r5
            goto L_0x0505
        L_0x048f:
            r25 = r0
            int r0 = r3.width
            if (r0 != 0) goto L_0x049f
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x04a0
            r1 = -2
            r3.width = r1
            r1 = 0
            goto L_0x04a2
        L_0x049f:
            r0 = 0
        L_0x04a0:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04a2:
            r2 = r1
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x04aa
            int r0 = r6.f854j
            goto L_0x04ab
        L_0x04aa:
            r0 = 0
        L_0x04ab:
            r26 = r0
            r27 = 0
            r0 = r34
            r1 = r5
            r30 = r2
            r29 = r22
            r2 = r35
            r32 = r3
            r31 = r23
            r3 = r26
            r22 = r4
            r4 = r36
            r13 = r35
            r23 = r5
            r5 = r27
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r30
            if (r1 == r0) goto L_0x04d6
            r2 = r32
            r2.width = r1
            goto L_0x04d8
        L_0x04d6:
            r2 = r32
        L_0x04d8:
            int r0 = r23.getMeasuredWidth()
            if (r16 == 0) goto L_0x04eb
            int r1 = r6.f854j
            int r3 = r2.leftMargin
            int r3 = r3 + r0
            int r4 = r2.rightMargin
            r5 = 0
            int r1 = androidx.appcompat.widget.C0147d.m397a(r3, r4, r5, r1)
            goto L_0x04fb
        L_0x04eb:
            int r1 = r6.f854j
            int r3 = r1 + r0
            int r4 = r2.leftMargin
            int r3 = r3 + r4
            int r4 = r2.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + 0
            int r1 = java.lang.Math.max(r1, r3)
        L_0x04fb:
            r6.f854j = r1
            if (r22 == 0) goto L_0x0503
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0503:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0505:
            if (r10 == r0) goto L_0x0510
            int r0 = r2.height
            r1 = -1
            if (r0 != r1) goto L_0x0510
            r0 = 1
            r21 = 1
            goto L_0x0511
        L_0x0510:
            r0 = 0
        L_0x0511:
            int r1 = r2.topMargin
            int r3 = r2.bottomMargin
            int r1 = r1 + r3
            int r3 = r23.getMeasuredHeight()
            int r3 = r3 + r1
            int r4 = r23.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r9, r4)
            if (r15 == 0) goto L_0x054f
            int r5 = r23.getBaseline()
            r9 = -1
            if (r5 == r9) goto L_0x054f
            int r9 = r2.gravity
            if (r9 >= 0) goto L_0x0532
            int r9 = r6.f853i
        L_0x0532:
            r9 = r9 & 112(0x70, float:1.57E-43)
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r23 = r1
            r1 = r11[r9]
            int r1 = java.lang.Math.max(r1, r5)
            r11[r9] = r1
            r1 = r12[r9]
            int r5 = r3 - r5
            int r1 = java.lang.Math.max(r1, r5)
            r12[r9] = r1
            goto L_0x0551
        L_0x054f:
            r23 = r1
        L_0x0551:
            r5 = r28
            int r1 = java.lang.Math.max(r5, r3)
            if (r19 == 0) goto L_0x0560
            int r5 = r2.height
            r9 = -1
            if (r5 != r9) goto L_0x0560
            r5 = 1
            goto L_0x0561
        L_0x0560:
            r5 = 0
        L_0x0561:
            float r2 = r2.weight
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0575
            if (r0 == 0) goto L_0x056c
            r3 = r23
        L_0x056c:
            r2 = r31
            int r3 = java.lang.Math.max(r2, r3)
            r2 = r29
            goto L_0x0583
        L_0x0575:
            r2 = r31
            if (r0 == 0) goto L_0x057b
            r3 = r23
        L_0x057b:
            r0 = r29
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r2
            r2 = r0
        L_0x0583:
            int r0 = r25 + 0
            r28 = r1
            r9 = r4
            r19 = r5
            r1 = r24
        L_0x058c:
            int r0 = r0 + 1
            r5 = r13
            r4 = r22
            r13 = r36
            goto L_0x03f8
        L_0x0595:
            r0 = r2
            r2 = r3
            r22 = r4
            r13 = r5
            r5 = r28
            int r3 = r6.f854j
            if (r3 <= 0) goto L_0x05ad
            boolean r3 = r6.mo1036k(r7)
            if (r3 == 0) goto L_0x05ad
            int r3 = r6.f854j
            int r4 = r6.f860p
            int r3 = r3 + r4
            r6.f854j = r3
        L_0x05ad:
            r3 = 1
            r4 = r11[r3]
            r3 = -1
            if (r4 != r3) goto L_0x05cc
            r4 = 0
            r4 = r11[r4]
            if (r4 != r3) goto L_0x05cc
            r23 = r9
            r4 = 2
            r9 = r11[r4]
            if (r9 != r3) goto L_0x05ce
            r4 = 3
            r9 = r11[r4]
            if (r9 == r3) goto L_0x05c5
            goto L_0x05cf
        L_0x05c5:
            r28 = r5
            r25 = r10
            r24 = r15
            goto L_0x0607
        L_0x05cc:
            r23 = r9
        L_0x05ce:
            r4 = 3
        L_0x05cf:
            r3 = r11[r4]
            r4 = 0
            r4 = r11[r4]
            r24 = r15
            r9 = 1
            r15 = r11[r9]
            r17 = 2
            r9 = r11[r17]
            int r9 = java.lang.Math.max(r15, r9)
            int r4 = java.lang.Math.max(r4, r9)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 3
            r4 = r12[r4]
            r9 = 0
            r9 = r12[r9]
            r25 = r10
            r15 = 1
            r10 = r12[r15]
            r15 = r12[r17]
            int r10 = java.lang.Math.max(r10, r15)
            int r9 = java.lang.Math.max(r9, r10)
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = r4 + r3
            int r28 = java.lang.Math.max(r5, r4)
        L_0x0607:
            if (r22 == 0) goto L_0x0655
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r3) goto L_0x060f
            if (r8 != 0) goto L_0x0655
        L_0x060f:
            r3 = 0
            r6.f854j = r3
            r4 = r3
        L_0x0613:
            if (r3 >= r7) goto L_0x0655
            android.view.View r5 = r6.getChildAt(r3)
            if (r5 != 0) goto L_0x0621
            int r5 = r6.f854j
            int r5 = r5 + r4
            r6.f854j = r5
            goto L_0x0651
        L_0x0621:
            int r4 = r5.getVisibility()
            r9 = 8
            if (r4 != r9) goto L_0x062c
            int r3 = r3 + 0
            goto L_0x0651
        L_0x062c:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            androidx.appcompat.widget.m0$a r4 = (androidx.appcompat.widget.C0184m0.C0185a) r4
            int r5 = r6.f854j
            if (r16 == 0) goto L_0x0641
            int r9 = r4.leftMargin
            int r9 = r9 + r14
            int r4 = r4.rightMargin
            r10 = 0
            int r4 = androidx.appcompat.widget.C0147d.m397a(r9, r4, r10, r5)
            goto L_0x064f
        L_0x0641:
            int r9 = r5 + r14
            int r10 = r4.leftMargin
            int r9 = r9 + r10
            int r4 = r4.rightMargin
            int r9 = r9 + r4
            int r9 = r9 + 0
            int r4 = java.lang.Math.max(r5, r9)
        L_0x064f:
            r6.f854j = r4
        L_0x0651:
            int r3 = r3 + 1
            r4 = 0
            goto L_0x0613
        L_0x0655:
            int r3 = r6.f854j
            int r4 = r34.getPaddingLeft()
            int r5 = r34.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f854j = r5
            int r3 = r34.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r13, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f854j
            int r4 = r4 - r5
            if (r20 != 0) goto L_0x06c6
            if (r4 == 0) goto L_0x0681
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0681
            goto L_0x06c6
        L_0x0681:
            int r0 = java.lang.Math.max(r0, r2)
            if (r22 == 0) goto L_0x06be
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L_0x06be
            r1 = 0
        L_0x068c:
            if (r1 >= r7) goto L_0x06be
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 == 0) goto L_0x06bb
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x069d
            goto L_0x06bb
        L_0x069d:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.m0$a r4 = (androidx.appcompat.widget.C0184m0.C0185a) r4
            float r4 = r4.weight
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x06bb
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r8 = r2.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r2.measure(r5, r4)
        L_0x06bb:
            int r1 = r1 + 1
            goto L_0x068c
        L_0x06be:
            r4 = r36
            r9 = r23
            r8 = r25
            goto L_0x0832
        L_0x06c6:
            float r2 = r6.f855k
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x06ce
            r1 = r2
        L_0x06ce:
            r2 = 3
            r5 = -1
            r11[r2] = r5
            r9 = 2
            r11[r9] = r5
            r10 = 1
            r11[r10] = r5
            r14 = 0
            r11[r14] = r5
            r12[r2] = r5
            r12[r9] = r5
            r12[r10] = r5
            r12[r14] = r5
            r6.f854j = r14
            r2 = -1
            r5 = 0
            r9 = r23
            r33 = r2
            r2 = r0
            r0 = r33
        L_0x06ee:
            if (r5 >= r7) goto L_0x0807
            android.view.View r10 = r6.getChildAt(r5)
            if (r10 == 0) goto L_0x07f5
            int r14 = r10.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0700
            goto L_0x07f5
        L_0x0700:
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            androidx.appcompat.widget.m0$a r14 = (androidx.appcompat.widget.C0184m0.C0185a) r14
            float r15 = r14.weight
            r20 = 0
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 <= 0) goto L_0x075f
            float r13 = (float) r4
            float r13 = r13 * r15
            float r13 = r13 / r1
            int r13 = (int) r13
            float r1 = r1 - r15
            int r4 = r4 - r13
            int r15 = r34.getPaddingTop()
            int r20 = r34.getPaddingBottom()
            int r20 = r20 + r15
            int r15 = r14.topMargin
            int r20 = r20 + r15
            int r15 = r14.bottomMargin
            int r15 = r20 + r15
            r20 = r1
            int r1 = r14.height
            r22 = r4
            r4 = r36
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L_0x073e
            r15 = 1073741824(0x40000000, float:2.0)
            if (r8 == r15) goto L_0x073b
            goto L_0x073e
        L_0x073b:
            if (r13 <= 0) goto L_0x0745
            goto L_0x0746
        L_0x073e:
            int r15 = r10.getMeasuredWidth()
            int r13 = r13 + r15
            if (r13 >= 0) goto L_0x0746
        L_0x0745:
            r13 = 0
        L_0x0746:
            r15 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r10.measure(r13, r1)
            int r1 = r10.getMeasuredState()
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r13
            int r9 = android.view.View.combineMeasuredStates(r9, r1)
            r1 = r20
            r13 = r22
            goto L_0x0762
        L_0x075f:
            r13 = r4
            r4 = r36
        L_0x0762:
            if (r16 == 0) goto L_0x077c
            int r15 = r6.f854j
            int r20 = r10.getMeasuredWidth()
            r22 = r1
            int r1 = r14.leftMargin
            int r1 = r20 + r1
            r20 = r8
            int r8 = r14.rightMargin
            r23 = r9
            r9 = 0
            int r1 = androidx.appcompat.widget.C0147d.m397a(r1, r8, r9, r15)
            goto L_0x0795
        L_0x077c:
            r22 = r1
            r20 = r8
            r23 = r9
            int r1 = r6.f854j
            int r8 = r10.getMeasuredWidth()
            int r8 = r8 + r1
            int r9 = r14.leftMargin
            int r8 = r8 + r9
            int r9 = r14.rightMargin
            int r8 = r8 + r9
            int r8 = r8 + 0
            int r1 = java.lang.Math.max(r1, r8)
        L_0x0795:
            r6.f854j = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r8 = r25
            if (r8 == r1) goto L_0x07a4
            int r1 = r14.height
            r9 = -1
            if (r1 != r9) goto L_0x07a4
            r1 = 1
            goto L_0x07a5
        L_0x07a4:
            r1 = 0
        L_0x07a5:
            int r9 = r14.topMargin
            int r15 = r14.bottomMargin
            int r9 = r9 + r15
            int r15 = r10.getMeasuredHeight()
            int r15 = r15 + r9
            int r0 = java.lang.Math.max(r0, r15)
            if (r1 == 0) goto L_0x07b6
            goto L_0x07b7
        L_0x07b6:
            r9 = r15
        L_0x07b7:
            int r1 = java.lang.Math.max(r2, r9)
            if (r19 == 0) goto L_0x07c4
            int r2 = r14.height
            r9 = -1
            if (r2 != r9) goto L_0x07c5
            r2 = 1
            goto L_0x07c6
        L_0x07c4:
            r9 = -1
        L_0x07c5:
            r2 = 0
        L_0x07c6:
            if (r24 == 0) goto L_0x07ed
            int r10 = r10.getBaseline()
            if (r10 == r9) goto L_0x07ed
            int r9 = r14.gravity
            if (r9 >= 0) goto L_0x07d4
            int r9 = r6.f853i
        L_0x07d4:
            r9 = r9 & 112(0x70, float:1.57E-43)
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r14 = r11[r9]
            int r14 = java.lang.Math.max(r14, r10)
            r11[r9] = r14
            r14 = r12[r9]
            int r15 = r15 - r10
            int r10 = java.lang.Math.max(r14, r15)
            r12[r9] = r10
        L_0x07ed:
            r19 = r2
            r9 = r23
            r2 = r1
            r1 = r22
            goto L_0x07fc
        L_0x07f5:
            r13 = r4
            r20 = r8
            r8 = r25
            r4 = r36
        L_0x07fc:
            int r5 = r5 + 1
            r25 = r8
            r4 = r13
            r8 = r20
            r13 = r35
            goto L_0x06ee
        L_0x0807:
            r4 = r36
            r8 = r25
            int r1 = r6.f854j
            int r5 = r34.getPaddingLeft()
            int r10 = r34.getPaddingRight()
            int r10 = r10 + r5
            int r10 = r10 + r1
            r6.f854j = r10
            r1 = 1
            r5 = r11[r1]
            r1 = -1
            if (r5 != r1) goto L_0x0835
            r5 = 0
            r5 = r11[r5]
            if (r5 != r1) goto L_0x0835
            r5 = 2
            r10 = r11[r5]
            if (r10 != r1) goto L_0x0835
            r5 = 3
            r10 = r11[r5]
            if (r10 == r1) goto L_0x082f
            goto L_0x0836
        L_0x082f:
            r28 = r0
            r0 = r2
        L_0x0832:
            r1 = 0
            r2 = r0
            goto L_0x0868
        L_0x0835:
            r5 = 3
        L_0x0836:
            r1 = r11[r5]
            r10 = 0
            r13 = r11[r10]
            r14 = 1
            r15 = r11[r14]
            r16 = 2
            r11 = r11[r16]
            int r11 = java.lang.Math.max(r15, r11)
            int r11 = java.lang.Math.max(r13, r11)
            int r1 = java.lang.Math.max(r1, r11)
            r5 = r12[r5]
            r11 = r12[r10]
            r13 = r12[r14]
            r12 = r12[r16]
            int r12 = java.lang.Math.max(r13, r12)
            int r11 = java.lang.Math.max(r11, r12)
            int r5 = java.lang.Math.max(r5, r11)
            int r5 = r5 + r1
            int r28 = java.lang.Math.max(r0, r5)
            r1 = r10
        L_0x0868:
            if (r19 != 0) goto L_0x086f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x086f
            goto L_0x0871
        L_0x086f:
            r2 = r28
        L_0x0871:
            int r0 = r34.getPaddingTop()
            int r5 = r34.getPaddingBottom()
            int r5 = r5 + r0
            int r5 = r5 + r2
            int r0 = r34.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r9
            r2 = r2 | r3
            int r3 = r9 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r3)
            r6.setMeasuredDimension(r2, r0)
            if (r21 == 0) goto L_0x08ce
            int r0 = r34.getMeasuredHeight()
            r2 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r9 = r1
        L_0x089d:
            if (r9 >= r7) goto L_0x08ce
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x08cb
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.m0$a r10 = (androidx.appcompat.widget.C0184m0.C0185a) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x08cb
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r5 = 0
            r0 = r34
            r2 = r35
            r4 = r8
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
        L_0x08cb:
            int r9 = r9 + 1
            goto L_0x089d
        L_0x08ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0184m0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f849e = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder a = C0001b.m0a("base aligned child index out of range (0, ");
            a.append(getChildCount());
            a.append(")");
            throw new IllegalArgumentException(a.toString());
        }
        this.f850f = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f859o) {
            this.f859o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f860p = drawable.getIntrinsicWidth();
                this.f861q = drawable.getIntrinsicHeight();
            } else {
                this.f860p = 0;
                this.f861q = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f863s = i;
    }

    public void setGravity(int i) {
        if (this.f853i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f853i = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f853i;
        if ((8388615 & i3) != i2) {
            this.f853i = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f856l = z;
    }

    public void setOrientation(int i) {
        if (this.f852h != i) {
            this.f852h = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f862r) {
            requestLayout();
        }
        this.f862r = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f853i;
        if ((i3 & 112) != i2) {
            this.f853i = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f855k = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
