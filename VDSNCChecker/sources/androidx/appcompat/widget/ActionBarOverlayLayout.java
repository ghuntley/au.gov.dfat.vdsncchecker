package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0082i;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p016c0.C0558b;
import p045h.C0995s;
import p058j0.C1054h;
import p058j0.C1055i;
import p058j0.C1056j;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1076u;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0163g0, C1054h, C1055i {

    /* renamed from: F */
    public static final int[] f474F = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public ViewPropertyAnimator f475A;

    /* renamed from: B */
    public final AnimatorListenerAdapter f476B;

    /* renamed from: C */
    public final Runnable f477C;

    /* renamed from: D */
    public final Runnable f478D;

    /* renamed from: E */
    public final C1056j f479E;

    /* renamed from: e */
    public int f480e;

    /* renamed from: f */
    public int f481f = 0;

    /* renamed from: g */
    public ContentFrameLayout f482g;

    /* renamed from: h */
    public ActionBarContainer f483h;

    /* renamed from: i */
    public C0166h0 f484i;

    /* renamed from: j */
    public Drawable f485j;

    /* renamed from: k */
    public boolean f486k;

    /* renamed from: l */
    public boolean f487l;

    /* renamed from: m */
    public boolean f488m;

    /* renamed from: n */
    public boolean f489n;

    /* renamed from: o */
    public boolean f490o;

    /* renamed from: p */
    public int f491p;

    /* renamed from: q */
    public int f492q;

    /* renamed from: r */
    public final Rect f493r = new Rect();

    /* renamed from: s */
    public final Rect f494s = new Rect();

    /* renamed from: t */
    public final Rect f495t = new Rect();

    /* renamed from: u */
    public C1076u f496u;

    /* renamed from: v */
    public C1076u f497v;

    /* renamed from: w */
    public C1076u f498w;

    /* renamed from: x */
    public C1076u f499x;

    /* renamed from: y */
    public C0094d f500y;

    /* renamed from: z */
    public OverScroller f501z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0091a extends AnimatorListenerAdapter {
        public C0091a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f475A = null;
            actionBarOverlayLayout.f490o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f475A = null;
            actionBarOverlayLayout.f490o = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0092b implements Runnable {
        public C0092b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo468q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f475A = actionBarOverlayLayout.f483h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f476B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0093c implements Runnable {
        public C0093c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo468q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f475A = actionBarOverlayLayout.f483h.animate().translationY((float) (-ActionBarOverlayLayout.this.f483h.getHeight())).setListener(ActionBarOverlayLayout.this.f476B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0094d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0095e extends ViewGroup.MarginLayoutParams {
        public C0095e(int i, int i2) {
            super(i, i2);
        }

        public C0095e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0095e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1076u uVar = C1076u.f3825b;
        this.f496u = uVar;
        this.f497v = uVar;
        this.f498w = uVar;
        this.f499x = uVar;
        this.f476B = new C0091a();
        this.f477C = new C0092b();
        this.f478D = new C0093c();
        mo469r(context);
        this.f479E = new C1056j();
    }

    /* renamed from: a */
    public void mo429a(Menu menu, C0082i.C0083a aVar) {
        mo470s();
        this.f484i.mo832a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo430b() {
        mo470s();
        return this.f484i.mo833b();
    }

    /* renamed from: c */
    public boolean mo431c() {
        mo470s();
        return this.f484i.mo834c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0095e;
    }

    /* renamed from: d */
    public void mo433d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f485j != null && !this.f486k) {
            if (this.f483h.getVisibility() == 0) {
                i = (int) (this.f483h.getTranslationY() + ((float) this.f483h.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f485j.setBounds(0, i, getWidth(), this.f485j.getIntrinsicHeight() + i);
            this.f485j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo435e() {
        mo470s();
        return this.f484i.mo837e();
    }

    /* renamed from: f */
    public boolean mo436f() {
        mo470s();
        return this.f484i.mo838f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public void mo438g() {
        mo470s();
        this.f484i.mo839g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0095e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0095e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0095e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f483h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f479E.mo4535a();
    }

    public CharSequence getTitle() {
        mo470s();
        return this.f484i.getTitle();
    }

    /* renamed from: h */
    public boolean mo445h() {
        mo470s();
        return this.f484i.mo841h();
    }

    /* renamed from: i */
    public void mo446i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo447j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo448k(int i) {
        mo470s();
        if (i == 2) {
            this.f484i.mo851r();
        } else if (i == 5) {
            this.f484i.mo857t();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo449l() {
        mo470s();
        this.f484i.mo842i();
    }

    /* renamed from: m */
    public void mo450m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: n */
    public void mo451n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo452o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo470s();
        C1076u i = C1076u.m3059i(windowInsets, this);
        boolean p = mo467p(this.f483h, new Rect(i.mo4557b(), i.mo4559d(), i.mo4558c(), i.mo4556a()), true, true, false, true);
        Rect rect = this.f493r;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        C1061o.C1063b.m3037b(this, i, rect);
        Rect rect2 = this.f493r;
        C1076u i2 = i.f3826a.mo4571i(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f496u = i2;
        boolean z = true;
        if (!this.f497v.equals(i2)) {
            this.f497v = this.f496u;
            p = true;
        }
        if (!this.f494s.equals(this.f493r)) {
            this.f494s.set(this.f493r);
        } else {
            z = p;
        }
        if (z) {
            requestLayout();
        }
        return i.f3826a.mo4582a().f3826a.mo4578c().f3826a.mo4577b().mo4562g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo469r(getContext());
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo468q();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0095e eVar = (C0095e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        C1076u uVar;
        mo470s();
        measureChildWithMargins(this.f483h, i, 0, i2, 0);
        C0095e eVar = (C0095e) this.f483h.getLayoutParams();
        int max = Math.max(0, this.f483h.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f483h.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f483h.getMeasuredState());
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i3 = this.f480e;
            if (this.f488m && this.f483h.getTabContainer() != null) {
                i3 += this.f480e;
            }
        } else {
            i3 = this.f483h.getVisibility() != 8 ? this.f483h.getMeasuredHeight() : 0;
        }
        this.f495t.set(this.f493r);
        C1076u uVar2 = this.f496u;
        this.f498w = uVar2;
        if (this.f487l || z) {
            C0558b a = C0558b.m1820a(uVar2.mo4557b(), this.f498w.mo4559d() + i3, this.f498w.mo4558c(), this.f498w.mo4556a() + 0);
            C1076u uVar3 = this.f498w;
            int i4 = Build.VERSION.SDK_INT;
            C1076u.C1080d cVar = i4 >= 30 ? new C1076u.C1079c(uVar3) : i4 >= 29 ? new C1076u.C1078b(uVar3) : new C1076u.C1077a(uVar3);
            cVar.mo4566d(a);
            uVar = cVar.mo4564b();
        } else {
            Rect rect = this.f495t;
            rect.top += i3;
            rect.bottom += 0;
            uVar = uVar2.f3826a.mo4571i(0, i3, 0, 0);
        }
        this.f498w = uVar;
        mo467p(this.f482g, this.f495t, true, true, true, true);
        if (!this.f499x.equals(this.f498w)) {
            C1076u uVar4 = this.f498w;
            this.f499x = uVar4;
            C1061o.m3022c(this.f482g, uVar4);
        }
        measureChildWithMargins(this.f482g, i, 0, i2, 0);
        C0095e eVar2 = (C0095e) this.f482g.getLayoutParams();
        int max3 = Math.max(max, this.f482g.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f482g.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f482g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f489n || !z) {
            return false;
        }
        this.f501z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f501z.getFinalY() > this.f483h.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo468q();
            this.f478D.run();
        } else {
            mo468q();
            this.f477C.run();
        }
        this.f490o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f491p + i2;
        this.f491p = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (p045h.C0995s) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            j0.j r1 = r0.f479E
            r1.f3803a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f491p = r1
            r0.mo468q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f500y
            if (r1 == 0) goto L_0x001d
            h.s r1 = (p045h.C0995s) r1
            k.h r2 = r1.f3685t
            if (r2 == 0) goto L_0x001d
            r2.mo4742a()
            r2 = 0
            r1.f3685t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f483h.getVisibility() != 0) {
            return false;
        }
        return this.f489n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f489n && !this.f490o) {
            if (this.f491p <= this.f483h.getHeight()) {
                mo468q();
                postDelayed(this.f477C, 600);
            } else {
                mo468q();
                postDelayed(this.f478D, 600);
            }
        }
        C0094d dVar = this.f500y;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo470s();
        int i2 = this.f492q ^ i;
        this.f492q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C0094d dVar = this.f500y;
        if (dVar != null) {
            ((C0995s) dVar).f3681p = !z2;
            if (z || !z2) {
                C0995s sVar = (C0995s) dVar;
                if (sVar.f3682q) {
                    sVar.f3682q = false;
                    sVar.mo4407h(true);
                }
            } else {
                C0995s sVar2 = (C0995s) dVar;
                if (!sVar2.f3682q) {
                    sVar2.f3682q = true;
                    sVar2.mo4407h(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f500y != null) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            requestApplyInsets();
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f481f = i;
        C0094d dVar = this.f500y;
        if (dVar != null) {
            ((C0995s) dVar).f3680o = i;
        }
    }

    /* renamed from: p */
    public final boolean mo467p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0095e eVar = (C0095e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: q */
    public void mo468q() {
        removeCallbacks(this.f477C);
        removeCallbacks(this.f478D);
        ViewPropertyAnimator viewPropertyAnimator = this.f475A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void mo469r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f474F);
        boolean z = false;
        this.f480e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f485j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f486k = z;
        this.f501z = new OverScroller(context);
    }

    /* renamed from: s */
    public void mo470s() {
        C0166h0 h0Var;
        if (this.f482g == null) {
            this.f482g = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f483h = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0166h0) {
                h0Var = (C0166h0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                h0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a = C0001b.m0a("Can't make a decor toolbar out of ");
                a.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a.toString());
            }
            this.f484i = h0Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo468q();
        this.f483h.setTranslationY((float) (-Math.max(0, Math.min(i, this.f483h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0094d dVar) {
        this.f500y = dVar;
        if (getWindowToken() != null) {
            ((C0995s) this.f500y).f3680o = this.f481f;
            int i = this.f492q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f488m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f489n) {
            this.f489n = z;
            if (!z) {
                mo468q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo470s();
        this.f484i.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo470s();
        this.f484i.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo470s();
        this.f484i.mo845l(i);
    }

    public void setOverlayMode(boolean z) {
        this.f487l = z;
        this.f486k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo470s();
        this.f484i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo470s();
        this.f484i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
