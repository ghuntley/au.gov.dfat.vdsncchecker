package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p045h.C0962b;
import p058j0.C1043a;
import p058j0.C1052f;
import p058j0.C1053g;
import p058j0.C1055i;
import p058j0.C1056j;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;

public class NestedScrollView extends FrameLayout implements C1055i, C1052f {

    /* renamed from: E */
    public static final C0258a f1321E = new C0258a();

    /* renamed from: F */
    public static final int[] f1322F = {16843130};

    /* renamed from: A */
    public final C1056j f1323A;

    /* renamed from: B */
    public final C1053g f1324B;

    /* renamed from: C */
    public float f1325C;

    /* renamed from: D */
    public C0259b f1326D;

    /* renamed from: e */
    public long f1327e;

    /* renamed from: f */
    public final Rect f1328f = new Rect();

    /* renamed from: g */
    public OverScroller f1329g = new OverScroller(getContext());

    /* renamed from: h */
    public EdgeEffect f1330h;

    /* renamed from: i */
    public EdgeEffect f1331i;

    /* renamed from: j */
    public int f1332j;

    /* renamed from: k */
    public boolean f1333k = true;

    /* renamed from: l */
    public boolean f1334l = false;

    /* renamed from: m */
    public View f1335m = null;

    /* renamed from: n */
    public boolean f1336n = false;

    /* renamed from: o */
    public VelocityTracker f1337o;

    /* renamed from: p */
    public boolean f1338p;

    /* renamed from: q */
    public boolean f1339q = true;

    /* renamed from: r */
    public int f1340r;

    /* renamed from: s */
    public int f1341s;

    /* renamed from: t */
    public int f1342t;

    /* renamed from: u */
    public int f1343u = -1;

    /* renamed from: v */
    public final int[] f1344v = new int[2];

    /* renamed from: w */
    public final int[] f1345w = new int[2];

    /* renamed from: x */
    public int f1346x;

    /* renamed from: y */
    public int f1347y;

    /* renamed from: z */
    public C0260c f1348z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0258a extends C1043a {
        /* renamed from: c */
        public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
            this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            int scrollRange;
            this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f4005a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.f4005a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.mo4760a(C1150b.C1151a.f4010g);
                    bVar.mo4760a(C1150b.C1151a.f4014k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.mo4760a(C1150b.C1151a.f4009f);
                    bVar.mo4760a(C1150b.C1151a.f4015l);
                }
            }
        }

        /* renamed from: g */
        public boolean mo1509g(View view, int i, Bundle bundle) {
            int min;
            if (super.mo1509g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo1430B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo1430B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0259b {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0260c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0260c> CREATOR = new C0261a();

        /* renamed from: e */
        public int f1349e;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class C0261a implements Parcelable.Creator<C0260c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0260c(parcel);
            }

            public Object[] newArray(int i) {
                return new C0260c[i];
            }
        }

        public C0260c(Parcel parcel) {
            super(parcel);
            this.f1349e = parcel.readInt();
        }

        public C0260c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("HorizontalScrollView.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" scrollPosition=");
            a.append(this.f1349e);
            a.append("}");
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1349e);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        setFocusable(true);
        setDescendantFocusability(EnumBarcodeFormat.BF_PATCHCODE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1340r = viewConfiguration.getScaledTouchSlop();
        this.f1341s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1342t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1322F, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1323A = new C1056j();
        this.f1324B = new C1053g(this);
        setNestedScrollingEnabled(true);
        C1061o.m3034o(this, f1321E);
    }

    /* renamed from: c */
    public static int m705c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1325C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1325C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1325C;
    }

    /* renamed from: s */
    public static boolean m706s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m706s((View) parent, view2);
    }

    /* renamed from: A */
    public final void mo1429A(View view) {
        view.getDrawingRect(this.f1328f);
        offsetDescendantRectToMyCoords(view, this.f1328f);
        int e = mo1451e(this.f1328f);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    /* renamed from: B */
    public final void mo1430B(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1327e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1329g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo1505y(z);
            } else {
                if (!this.f1329g.isFinished()) {
                    mo1432a();
                }
                scrollBy(i, i2);
            }
            this.f1327e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: C */
    public boolean mo1431C(int i, int i2) {
        return this.f1324B.mo4533i(i, i2);
    }

    /* renamed from: a */
    public final void mo1432a() {
        this.f1329g.abortAnimation();
        this.f1324B.mo4534j(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo1437b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo1500t(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo1453g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1328f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1328f);
            mo1453g(mo1451e(this.f1328f));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo1500t(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1329g.isFinished()) {
            this.f1329g.computeScrollOffset();
            int currY = this.f1329g.getCurrY();
            int i = currY - this.f1347y;
            this.f1347y = currY;
            int[] iArr = this.f1345w;
            boolean z = false;
            iArr[1] = 0;
            mo1452f(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f1345w[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo1503w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f1345w;
                iArr2[1] = 0;
                this.f1324B.mo4530f(0, scrollY2, 0, i3, this.f1344v, 1, iArr2);
                i2 = i3 - this.f1345w[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    mo1462k();
                    if (i2 < 0) {
                        if (this.f1330h.isFinished()) {
                            edgeEffect = this.f1330h;
                        }
                    } else if (this.f1331i.isFinished()) {
                        edgeEffect = this.f1331i;
                    }
                    edgeEffect.onAbsorb((int) this.f1329g.getCurrVelocity());
                }
                mo1432a();
            }
            if (!this.f1329g.isFinished()) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                postInvalidateOnAnimation();
                return;
            }
            this.f1324B.mo4534j(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public void mo433d(View view, View view2, int i, int i2) {
        C1056j jVar = this.f1323A;
        if (i2 == 1) {
            jVar.f3804b = i;
        } else {
            jVar.f3803a = i;
        }
        mo1431C(2, i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1463l(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1324B.mo4525a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1324B.mo4526b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1452f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1324B.mo4529e(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1330h != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1330h.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1330h.setSize(width, height);
                if (this.f1330h.draw(canvas)) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1331i.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i2 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1331i.setSize(width2, height2);
                if (this.f1331i.draw(canvas)) {
                    WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public int mo1451e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: f */
    public boolean mo1452f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1324B.mo4527c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public final void mo1453g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1339q) {
            mo1430B(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1323A.mo4535a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final void mo1459h() {
        this.f1336n = false;
        mo1504x();
        this.f1324B.mo4534j(0);
        EdgeEffect edgeEffect = this.f1330h;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1331i.onRelease();
        }
    }

    public boolean hasNestedScrollingParent() {
        return mo1487r(0);
    }

    /* renamed from: i */
    public void mo446i(View view, int i) {
        C1056j jVar = this.f1323A;
        if (i == 1) {
            jVar.f3804b = 0;
        } else {
            jVar.f3803a = 0;
        }
        this.f1324B.mo4534j(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1324B.f3801d;
    }

    /* renamed from: j */
    public void mo447j(View view, int i, int i2, int[] iArr, int i3) {
        mo1452f(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: k */
    public final void mo1462k() {
        if (getOverScrollMode() == 2) {
            this.f1330h = null;
            this.f1331i = null;
        } else if (this.f1330h == null) {
            Context context = getContext();
            this.f1330h = new EdgeEffect(context);
            this.f1331i = new EdgeEffect(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1463l(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f1328f
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fa
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00eb
            r4 = 20
            if (r0 == r4) goto L_0x00db
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fa
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00be
            android.graphics.Rect r7 = r6.f1328f
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d0
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1328f
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d0
            int r1 = r1 - r0
            goto L_0x00ce
        L_0x00be:
            android.graphics.Rect r7 = r6.f1328f
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1328f
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d0
            r1 = r2
        L_0x00ce:
            r7.top = r1
        L_0x00d0:
            android.graphics.Rect r7 = r6.f1328f
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo1506z(r5, r1, r0)
            goto L_0x00fa
        L_0x00db:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e6
            boolean r2 = r6.mo1437b(r3)
            goto L_0x00fa
        L_0x00e6:
            boolean r2 = r6.mo1486q(r3)
            goto L_0x00fa
        L_0x00eb:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f6
            boolean r2 = r6.mo1437b(r5)
            goto L_0x00fa
        L_0x00f6:
            boolean r2 = r6.mo1486q(r5)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo1463l(android.view.KeyEvent):boolean");
    }

    /* renamed from: m */
    public void mo450m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1501u(i4, i5, iArr);
    }

    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo451n(View view, int i, int i2, int i3, int i4, int i5) {
        mo1501u(i4, i5, (int[]) null);
    }

    /* renamed from: o */
    public boolean mo452o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1334l = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1336n) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.f1336n
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x0093
            r4 = -1
            if (r0 == r2) goto L_0x006a
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x00fc
        L_0x001f:
            r11.mo1502v(r12)
            goto L_0x00fc
        L_0x0024:
            int r0 = r11.f1343u
            if (r0 != r4) goto L_0x002a
            goto L_0x00fc
        L_0x002a:
            int r0 = r12.findPointerIndex(r0)
            if (r0 != r4) goto L_0x0032
            goto L_0x00fc
        L_0x0032:
            float r0 = r12.getY(r0)
            int r0 = (int) r0
            int r4 = r11.f1332j
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f1340r
            if (r4 <= r5) goto L_0x00fc
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x00fc
            r11.f1336n = r2
            r11.f1332j = r0
            android.view.VelocityTracker r0 = r11.f1337o
            if (r0 != 0) goto L_0x0058
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1337o = r0
        L_0x0058:
            android.view.VelocityTracker r0 = r11.f1337o
            r0.addMovement(r12)
            r11.f1346x = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x00fc
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x00fc
        L_0x006a:
            r11.f1336n = r3
            r11.f1343u = r4
            r11.mo1504x()
            android.widget.OverScroller r4 = r11.f1329g
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x008d
            java.util.WeakHashMap<android.view.View, j0.q> r12 = p058j0.C1061o.f3808a
            r11.postInvalidateOnAnimation()
        L_0x008d:
            j0.g r12 = r11.f1324B
            r12.mo4534j(r3)
            goto L_0x00fc
        L_0x0093:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00c7
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00c7
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00c7
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00c7
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00c7
            r4 = r2
            goto L_0x00c8
        L_0x00c7:
            r4 = r3
        L_0x00c8:
            if (r4 != 0) goto L_0x00d0
            r11.f1336n = r3
            r11.mo1504x()
            goto L_0x00fc
        L_0x00d0:
            r11.f1332j = r0
            int r0 = r12.getPointerId(r3)
            r11.f1343u = r0
            android.view.VelocityTracker r0 = r11.f1337o
            if (r0 != 0) goto L_0x00e3
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1337o = r0
            goto L_0x00e6
        L_0x00e3:
            r0.clear()
        L_0x00e6:
            android.view.VelocityTracker r0 = r11.f1337o
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f1329g
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f1329g
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.f1336n = r12
            r11.mo1431C(r1, r3)
        L_0x00fc:
            boolean r12 = r11.f1336n
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1333k = false;
        View view = this.f1335m;
        if (view != null && m706s(view, this)) {
            mo1429A(this.f1335m);
        }
        this.f1335m = null;
        if (!this.f1334l) {
            if (this.f1348z != null) {
                scrollTo(getScrollX(), this.f1348z.f1349e);
                this.f1348z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c = m705c(scrollY, paddingTop, i5);
            if (c != scrollY) {
                scrollTo(getScrollX(), c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1334l = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1338p && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, EnumBarcodeFormat.BF_MICRO_QR));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo1485p((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1452f(i, i2, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1501u(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1323A.f3803a = i;
        mo1431C(2, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ mo1500t(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0260c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0260c cVar = (C0260c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1348z = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0260c cVar = new C0260c(super.onSaveInstanceState());
        cVar.f1349e = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0259b bVar = this.f1326D;
        if (bVar != null) {
            C0962b bVar2 = (C0962b) bVar;
            AlertController.m97c(this, bVar2.f3536a, bVar2.f3537b);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo1500t(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1328f);
            offsetDescendantRectToMyCoords(findFocus, this.f1328f);
            mo1453g(mo1451e(this.f1328f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1323A.f3803a = 0;
        this.f1324B.mo4534j(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r9.f1329g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ee, code lost:
        if (r9.f1329g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            android.view.VelocityTracker r0 = r9.f1337o
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f1337o = r0
        L_0x000e:
            int r0 = r23.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.f1346x = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int r1 = r9.f1346x
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x01fb
            r3 = -1
            if (r0 == r13) goto L_0x01ae
            if (r0 == r1) goto L_0x0081
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x0231
        L_0x0036:
            r22.mo1502v(r23)
            int r0 = r9.f1343u
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f1332j = r0
            goto L_0x0231
        L_0x0048:
            int r0 = r23.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f1332j = r1
            int r0 = r10.getPointerId(r0)
            r9.f1343u = r0
            goto L_0x0231
        L_0x005b:
            boolean r0 = r9.f1336n
            if (r0 == 0) goto L_0x01f5
            int r0 = r22.getChildCount()
            if (r0 <= 0) goto L_0x01f5
            android.widget.OverScroller r14 = r9.f1329g
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x01f5
            goto L_0x01f0
        L_0x0081:
            int r0 = r9.f1343u
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x008b
            goto L_0x0231
        L_0x008b:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f1332j
            int r0 = r0 - r6
            boolean r1 = r9.f1336n
            if (r1 != 0) goto L_0x00b1
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f1340r
            if (r1 <= r2) goto L_0x00b1
            android.view.ViewParent r1 = r22.getParent()
            if (r1 == 0) goto L_0x00a8
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x00a8:
            r9.f1336n = r13
            int r1 = r9.f1340r
            if (r0 <= 0) goto L_0x00b0
            int r0 = r0 - r1
            goto L_0x00b1
        L_0x00b0:
            int r0 = r0 + r1
        L_0x00b1:
            r7 = r0
            boolean r0 = r9.f1336n
            if (r0 == 0) goto L_0x0231
            r1 = 0
            int[] r3 = r9.f1345w
            int[] r4 = r9.f1344v
            r5 = 0
            r0 = r22
            r2 = r7
            boolean r0 = r0.mo1452f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d3
            int[] r0 = r9.f1345w
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f1346x
            int[] r1 = r9.f1344v
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f1346x = r0
        L_0x00d3:
            r15 = r7
            int[] r0 = r9.f1344v
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f1332j = r6
            int r16 = r22.getScrollY()
            int r8 = r22.getScrollRange()
            int r0 = r22.getOverScrollMode()
            if (r0 == 0) goto L_0x00f1
            if (r0 != r13) goto L_0x00ee
            if (r8 <= 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r17 = r11
            goto L_0x00f3
        L_0x00f1:
            r17 = r13
        L_0x00f3:
            r1 = 0
            r3 = 0
            int r4 = r22.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r22
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.mo1503w(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0116
            boolean r0 = r9.mo1487r(r11)
            if (r0 != 0) goto L_0x0116
            android.view.VelocityTracker r0 = r9.f1337o
            r0.clear()
        L_0x0116:
            int r0 = r22.getScrollY()
            int r3 = r0 - r16
            int r5 = r15 - r3
            int[] r8 = r9.f1345w
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.f1344v
            r7 = 0
            j0.g r1 = r9.f1324B
            r1.mo4530f(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.f1332j
            int[] r1 = r9.f1344v
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.f1332j = r0
            int r0 = r9.f1346x
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f1346x = r0
            if (r17 == 0) goto L_0x0231
            int[] r0 = r9.f1345w
            r0 = r0[r13]
            int r15 = r15 - r0
            r22.mo1462k()
            int r0 = r16 + r15
            if (r0 >= 0) goto L_0x016b
            android.widget.EdgeEffect r0 = r9.f1330h
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r10.getX(r14)
            int r3 = r22.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f1331i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0195
            android.widget.EdgeEffect r0 = r9.f1331i
            goto L_0x0192
        L_0x016b:
            r1 = r21
            if (r0 <= r1) goto L_0x0195
            android.widget.EdgeEffect r0 = r9.f1331i
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.getX(r14)
            int r4 = r22.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f1330h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0195
            android.widget.EdgeEffect r0 = r9.f1330h
        L_0x0192:
            r0.onRelease()
        L_0x0195:
            android.widget.EdgeEffect r0 = r9.f1330h
            if (r0 == 0) goto L_0x0231
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01a7
            android.widget.EdgeEffect r0 = r9.f1331i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0231
        L_0x01a7:
            java.util.WeakHashMap<android.view.View, j0.q> r0 = p058j0.C1061o.f3808a
            r22.postInvalidateOnAnimation()
            goto L_0x0231
        L_0x01ae:
            android.view.VelocityTracker r0 = r9.f1337o
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f1342t
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f1343u
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f1341s
            if (r1 < r4) goto L_0x01d6
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x01f5
            r9.dispatchNestedFling(r2, r1, r13)
            r9.mo1485p(r0)
            goto L_0x01f5
        L_0x01d6:
            android.widget.OverScroller r14 = r9.f1329g
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x01f5
        L_0x01f0:
            java.util.WeakHashMap<android.view.View, j0.q> r0 = p058j0.C1061o.f3808a
            r22.postInvalidateOnAnimation()
        L_0x01f5:
            r9.f1343u = r3
            r22.mo1459h()
            goto L_0x0231
        L_0x01fb:
            int r0 = r22.getChildCount()
            if (r0 != 0) goto L_0x0202
            return r11
        L_0x0202:
            android.widget.OverScroller r0 = r9.f1329g
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.f1336n = r0
            if (r0 == 0) goto L_0x0216
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x0216
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x0216:
            android.widget.OverScroller r0 = r9.f1329g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0221
            r22.mo1432a()
        L_0x0221:
            float r0 = r23.getY()
            int r0 = (int) r0
            r9.f1332j = r0
            int r0 = r10.getPointerId(r11)
            r9.f1343u = r0
            r9.mo1431C(r1, r11)
        L_0x0231:
            android.view.VelocityTracker r0 = r9.f1337o
            if (r0 == 0) goto L_0x0238
            r0.addMovement(r12)
        L_0x0238:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo1485p(int i) {
        if (getChildCount() > 0) {
            this.f1329g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo1505y(true);
        }
    }

    /* renamed from: q */
    public boolean mo1486q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1328f;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1328f.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1328f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1328f;
        return mo1506z(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean mo1487r(int i) {
        return this.f1324B.mo4531g(i) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1333k) {
            mo1429A(view2);
        } else {
            this.f1335m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e = mo1451e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                mo1430B(0, e, 250, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo1504x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1333k = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c = m705c(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c2 = m705c(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c != getScrollX() || c2 != getScrollY()) {
                super.scrollTo(c, c2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1338p) {
            this.f1338p = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1053g gVar = this.f1324B;
        if (gVar.f3801d) {
            View view = gVar.f3800c;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.stopNestedScroll();
        }
        gVar.f3801d = z;
    }

    public void setOnScrollChangeListener(C0259b bVar) {
        this.f1326D = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1339q = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f1324B.mo4533i(i, 0);
    }

    public void stopNestedScroll() {
        this.f1324B.mo4534j(0);
    }

    /* renamed from: t */
    public final boolean mo1500t(View view, int i, int i2) {
        view.getDrawingRect(this.f1328f);
        offsetDescendantRectToMyCoords(view, this.f1328f);
        return this.f1328f.bottom + i >= getScrollY() && this.f1328f.top - i <= getScrollY() + i2;
    }

    /* renamed from: u */
    public final void mo1501u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1324B.mo4528d(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: v */
    public final void mo1502v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1343u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1332j = (int) motionEvent.getY(i);
            this.f1343u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1337o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: w */
    public boolean mo1503w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !mo1487r(1)) {
            this.f1329g.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    /* renamed from: x */
    public final void mo1504x() {
        VelocityTracker velocityTracker = this.f1337o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1337o = null;
        }
    }

    /* renamed from: y */
    public final void mo1505y(boolean z) {
        if (z) {
            mo1431C(2, 1);
        } else {
            this.f1324B.mo4534j(1);
        }
        this.f1347y = getScrollY();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        postInvalidateOnAnimation();
    }

    /* renamed from: z */
    public final boolean mo1506z(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            mo1453g(z2 ? i5 - scrollY : i6 - i7);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }
}
