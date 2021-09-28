package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.view.menu.C0089l;
import androidx.appcompat.widget.ActionMenuView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p045h.C0958a;
import p051i.C1021a;
import p058j0.C1061o;
import p058j0.C1070q;
import p063k.C1137b;
import p063k.C1143g;
import p088o0.C1491a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f609A;

    /* renamed from: B */
    public CharSequence f610B;

    /* renamed from: C */
    public CharSequence f611C;

    /* renamed from: D */
    public ColorStateList f612D;

    /* renamed from: E */
    public ColorStateList f613E;

    /* renamed from: F */
    public boolean f614F;

    /* renamed from: G */
    public boolean f615G;

    /* renamed from: H */
    public final ArrayList<View> f616H;

    /* renamed from: I */
    public final ArrayList<View> f617I;

    /* renamed from: J */
    public final int[] f618J;

    /* renamed from: K */
    public C0125f f619K;

    /* renamed from: L */
    public final ActionMenuView.C0100e f620L;

    /* renamed from: M */
    public C0149d1 f621M;

    /* renamed from: N */
    public C0137c f622N;

    /* renamed from: O */
    public C0123d f623O;

    /* renamed from: P */
    public boolean f624P;

    /* renamed from: Q */
    public final Runnable f625Q;

    /* renamed from: e */
    public ActionMenuView f626e;

    /* renamed from: f */
    public TextView f627f;

    /* renamed from: g */
    public TextView f628g;

    /* renamed from: h */
    public ImageButton f629h;

    /* renamed from: i */
    public ImageView f630i;

    /* renamed from: j */
    public Drawable f631j;

    /* renamed from: k */
    public CharSequence f632k;

    /* renamed from: l */
    public ImageButton f633l;

    /* renamed from: m */
    public View f634m;

    /* renamed from: n */
    public Context f635n;

    /* renamed from: o */
    public int f636o;

    /* renamed from: p */
    public int f637p;

    /* renamed from: q */
    public int f638q;

    /* renamed from: r */
    public int f639r;

    /* renamed from: s */
    public int f640s;

    /* renamed from: t */
    public int f641t;

    /* renamed from: u */
    public int f642u;

    /* renamed from: v */
    public int f643v;

    /* renamed from: w */
    public int f644w;

    /* renamed from: x */
    public C0208t0 f645x;

    /* renamed from: y */
    public int f646y;

    /* renamed from: z */
    public int f647z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0120a implements ActionMenuView.C0100e {
        public C0120a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0121b implements Runnable {
        public C0121b() {
        }

        public void run() {
            Toolbar.this.mo713v();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0122c implements View.OnClickListener {
        public C0122c() {
        }

        public void onClick(View view) {
            C0123d dVar = Toolbar.this.f623O;
            C0078g gVar = dVar == null ? null : dVar.f652f;
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0123d implements C0082i {

        /* renamed from: e */
        public C0074e f651e;

        /* renamed from: f */
        public C0078g f652f;

        public C0123d() {
        }

        /* renamed from: a */
        public void mo201a(C0074e eVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo203c() {
            return false;
        }

        /* renamed from: d */
        public void mo227d(Context context, C0074e eVar) {
            C0078g gVar;
            C0074e eVar2 = this.f651e;
            if (!(eVar2 == null || (gVar = this.f652f) == null)) {
                eVar2.mo258d(gVar);
            }
            this.f651e = eVar;
        }

        /* renamed from: e */
        public boolean mo198e(C0074e eVar, C0078g gVar) {
            View view = Toolbar.this.f634m;
            if (view instanceof C1137b) {
                ((C1137b) view).mo536e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f634m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f633l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f634m = null;
            int size = toolbar3.f617I.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.f617I.get(size));
                } else {
                    toolbar3.f617I.clear();
                    this.f652f = null;
                    Toolbar.this.requestLayout();
                    gVar.f385C = false;
                    gVar.f400n.mo274p(false);
                    return true;
                }
            }
        }

        /* renamed from: g */
        public boolean mo199g(C0074e eVar, C0078g gVar) {
            Toolbar.this.mo621c();
            ViewParent parent = Toolbar.this.f633l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f633l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f633l);
            }
            Toolbar.this.f634m = gVar.getActionView();
            this.f652f = gVar;
            ViewParent parent2 = Toolbar.this.f634m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f634m);
                }
                C0124e h = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h.f3535a = 8388611 | (toolbar4.f639r & 112);
                h.f654b = 2;
                toolbar4.f634m.setLayoutParams(h);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f634m);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((C0124e) childAt.getLayoutParams()).f654b == 2 || childAt == toolbar6.f626e)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f617I.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.f385C = true;
            gVar.f400n.mo274p(false);
            View view = Toolbar.this.f634m;
            if (view instanceof C1137b) {
                ((C1137b) view).mo534c();
            }
            return true;
        }

        /* renamed from: i */
        public boolean mo206i(C0089l lVar) {
            return false;
        }

        /* renamed from: j */
        public void mo207j(boolean z) {
            if (this.f652f != null) {
                C0074e eVar = this.f651e;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f651e.getItem(i) == this.f652f) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo198e(this.f651e, this.f652f);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0124e extends C0958a.C0959a {

        /* renamed from: b */
        public int f654b = 0;

        public C0124e(int i, int i2) {
            super(i, i2);
            this.f3535a = 8388627;
        }

        public C0124e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0124e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0124e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0124e(C0124e eVar) {
            super((C0958a.C0959a) eVar);
            this.f654b = eVar.f654b;
        }

        public C0124e(C0958a.C0959a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0125f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0126g extends C1491a {
        public static final Parcelable.Creator<C0126g> CREATOR = new C0127a();

        /* renamed from: g */
        public int f655g;

        /* renamed from: h */
        public boolean f656h;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class C0127a implements Parcelable.ClassLoaderCreator<C0126g> {
            public Object createFromParcel(Parcel parcel) {
                return new C0126g(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0126g[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0126g(parcel, classLoader);
            }
        }

        public C0126g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f655g = parcel.readInt();
            this.f656h = parcel.readInt() != 0;
        }

        public C0126g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeInt(this.f655g);
            parcel.writeInt(this.f656h ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f609A = 8388627;
        this.f616H = new ArrayList<>();
        this.f617I = new ArrayList<>();
        this.f618J = new int[2];
        this.f620L = new C0120a();
        this.f625Q = new C0121b();
        Context context2 = getContext();
        int[] iArr = C0934b.f3481w;
        C0136b1 q = C0136b1.m361q(context2, attributeSet, iArr, i, 0);
        C1061o.m3033n(this, context, iArr, attributeSet, q.f692b, i, 0);
        this.f637p = q.mo772l(28, 0);
        this.f638q = q.mo772l(19, 0);
        this.f609A = q.f692b.getInteger(0, this.f609A);
        this.f639r = q.f692b.getInteger(2, 48);
        int e = q.mo765e(22, 0);
        e = q.mo775o(27) ? q.mo765e(27, e) : e;
        this.f644w = e;
        this.f643v = e;
        this.f642u = e;
        this.f641t = e;
        int e2 = q.mo765e(25, -1);
        if (e2 >= 0) {
            this.f641t = e2;
        }
        int e3 = q.mo765e(24, -1);
        if (e3 >= 0) {
            this.f642u = e3;
        }
        int e4 = q.mo765e(26, -1);
        if (e4 >= 0) {
            this.f643v = e4;
        }
        int e5 = q.mo765e(23, -1);
        if (e5 >= 0) {
            this.f644w = e5;
        }
        this.f640s = q.mo766f(13, -1);
        int e6 = q.mo765e(9, Integer.MIN_VALUE);
        int e7 = q.mo765e(5, Integer.MIN_VALUE);
        int f = q.mo766f(7, 0);
        int f2 = q.mo766f(8, 0);
        mo623d();
        C0208t0 t0Var = this.f645x;
        t0Var.f934h = false;
        if (f != Integer.MIN_VALUE) {
            t0Var.f931e = f;
            t0Var.f927a = f;
        }
        if (f2 != Integer.MIN_VALUE) {
            t0Var.f932f = f2;
            t0Var.f928b = f2;
        }
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            t0Var.mo1134a(e6, e7);
        }
        this.f646y = q.mo765e(10, Integer.MIN_VALUE);
        this.f647z = q.mo765e(6, Integer.MIN_VALUE);
        this.f631j = q.mo767g(4);
        this.f632k = q.mo774n(3);
        CharSequence n = q.mo774n(21);
        if (!TextUtils.isEmpty(n)) {
            setTitle(n);
        }
        CharSequence n2 = q.mo774n(18);
        if (!TextUtils.isEmpty(n2)) {
            setSubtitle(n2);
        }
        this.f635n = getContext();
        setPopupTheme(q.mo772l(17, 0));
        Drawable g = q.mo767g(16);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence n3 = q.mo774n(15);
        if (!TextUtils.isEmpty(n3)) {
            setNavigationContentDescription(n3);
        }
        Drawable g2 = q.mo767g(11);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence n4 = q.mo774n(12);
        if (!TextUtils.isEmpty(n4)) {
            setLogoDescription(n4);
        }
        if (q.mo775o(29)) {
            setTitleTextColor(q.mo763c(29));
        }
        if (q.mo775o(20)) {
            setSubtitleTextColor(q.mo763c(20));
        }
        if (q.mo775o(14)) {
            getMenuInflater().inflate(q.mo772l(14, 0), getMenu());
        }
        q.f692b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C1143g(getContext());
    }

    /* renamed from: a */
    public final void mo619a(List<View> list, int i) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0124e eVar = (C0124e) childAt.getLayoutParams();
                if (eVar.f654b == 0 && mo712u(childAt) && mo662j(eVar.f3535a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0124e eVar2 = (C0124e) childAt2.getLayoutParams();
            if (eVar2.f654b == 0 && mo712u(childAt2) && mo662j(eVar2.f3535a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void mo620b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0124e h = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0124e) layoutParams;
        h.f654b = 1;
        if (!z || this.f634m == null) {
            addView(view, h);
            return;
        }
        view.setLayoutParams(h);
        this.f617I.add(view);
    }

    /* renamed from: c */
    public void mo621c() {
        if (this.f633l == null) {
            C0183m mVar = new C0183m(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f633l = mVar;
            mVar.setImageDrawable(this.f631j);
            this.f633l.setContentDescription(this.f632k);
            C0124e h = generateDefaultLayoutParams();
            h.f3535a = 8388611 | (this.f639r & 112);
            h.f654b = 2;
            this.f633l.setLayoutParams(h);
            this.f633l.setOnClickListener(new C0122c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0124e);
    }

    /* renamed from: d */
    public final void mo623d() {
        if (this.f645x == null) {
            this.f645x = new C0208t0();
        }
    }

    /* renamed from: e */
    public final void mo624e() {
        mo625f();
        ActionMenuView actionMenuView = this.f626e;
        if (actionMenuView.f510t == null) {
            C0074e eVar = (C0074e) actionMenuView.getMenu();
            if (this.f623O == null) {
                this.f623O = new C0123d();
            }
            this.f626e.setExpandedActionViewsExclusive(true);
            eVar.mo253b(this.f623O, this.f635n);
        }
    }

    /* renamed from: f */
    public final void mo625f() {
        if (this.f626e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f626e = actionMenuView;
            actionMenuView.setPopupTheme(this.f636o);
            this.f626e.setOnMenuItemClickListener(this.f620L);
            ActionMenuView actionMenuView2 = this.f626e;
            actionMenuView2.f515y = null;
            actionMenuView2.f516z = null;
            C0124e h = generateDefaultLayoutParams();
            h.f3535a = 8388613 | (this.f639r & 112);
            this.f626e.setLayoutParams(h);
            mo620b(this.f626e, false);
        }
    }

    /* renamed from: g */
    public final void mo626g() {
        if (this.f629h == null) {
            this.f629h = new C0183m(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            C0124e h = generateDefaultLayoutParams();
            h.f3535a = 8388611 | (this.f639r & 112);
            this.f629h.setLayoutParams(h);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0124e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f633l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f633l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0208t0 t0Var = this.f645x;
        if (t0Var != null) {
            return t0Var.f933g ? t0Var.f927a : t0Var.f928b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f647z;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0208t0 t0Var = this.f645x;
        if (t0Var != null) {
            return t0Var.f927a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0208t0 t0Var = this.f645x;
        if (t0Var != null) {
            return t0Var.f928b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0208t0 t0Var = this.f645x;
        if (t0Var != null) {
            return t0Var.f933g ? t0Var.f928b : t0Var.f927a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f646y;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f510t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f626e
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.e r0 = r0.f510t
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f647z
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f646y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f630i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f630i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo624e();
        return this.f626e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f629h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f629h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0137c getOuterActionMenuPresenter() {
        return this.f622N;
    }

    public Drawable getOverflowIcon() {
        mo624e();
        return this.f626e.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f635n;
    }

    public int getPopupTheme() {
        return this.f636o;
    }

    public CharSequence getSubtitle() {
        return this.f611C;
    }

    public final TextView getSubtitleTextView() {
        return this.f628g;
    }

    public CharSequence getTitle() {
        return this.f610B;
    }

    public int getTitleMarginBottom() {
        return this.f644w;
    }

    public int getTitleMarginEnd() {
        return this.f642u;
    }

    public int getTitleMarginStart() {
        return this.f641t;
    }

    public int getTitleMarginTop() {
        return this.f643v;
    }

    public final TextView getTitleTextView() {
        return this.f627f;
    }

    public C0166h0 getWrapper() {
        if (this.f621M == null) {
            this.f621M = new C0149d1(this, true);
        }
        return this.f621M;
    }

    /* renamed from: h */
    public C0124e generateDefaultLayoutParams() {
        return new C0124e(-2, -2);
    }

    /* renamed from: i */
    public C0124e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0124e ? new C0124e((C0124e) layoutParams) : layoutParams instanceof C0958a.C0959a ? new C0124e((C0958a.C0959a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0124e((ViewGroup.MarginLayoutParams) layoutParams) : new C0124e(layoutParams);
    }

    /* renamed from: j */
    public final int mo662j(int i) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int mo663k(View view, int i) {
        C0124e eVar = (C0124e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f3535a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f609A & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: l */
    public final int mo664l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* renamed from: m */
    public final int mo665m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public void mo666n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: o */
    public final boolean mo667o(View view) {
        return view.getParent() == this || this.f617I.contains(view);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f625Q);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f615G = false;
        }
        if (!this.f615G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f615G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f615G = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0333 A[LOOP:3: B:120:0x0331->B:121:0x0333, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            int r1 = r20.getLayoutDirection()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f618J
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r20.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            android.widget.ImageButton r13 = r0.f629h
            boolean r13 = r0.mo712u(r13)
            if (r13 == 0) goto L_0x0055
            android.widget.ImageButton r13 = r0.f629h
            if (r1 == 0) goto L_0x0050
            int r13 = r0.mo678r(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.mo677q(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f633l
            boolean r15 = r0.mo712u(r15)
            if (r15 == 0) goto L_0x006c
            android.widget.ImageButton r15 = r0.f633l
            if (r1 == 0) goto L_0x0068
            int r14 = r0.mo678r(r15, r14, r11, r12)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.mo677q(r15, r13, r11, r12)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f626e
            boolean r15 = r0.mo712u(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f626e
            if (r1 == 0) goto L_0x007d
            int r13 = r0.mo677q(r15, r13, r11, r12)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.mo678r(r15, r14, r11, r12)
        L_0x0081:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f634m
            boolean r13 = r0.mo712u(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f634m
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.mo678r(r13, r10, r11, r12)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.mo677q(r13, r2, r11, r12)
        L_0x00bc:
            android.widget.ImageView r13 = r0.f630i
            boolean r13 = r0.mo712u(r13)
            if (r13 == 0) goto L_0x00d1
            android.widget.ImageView r13 = r0.f630i
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.mo678r(r13, r10, r11, r12)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.mo677q(r13, r2, r11, r12)
        L_0x00d1:
            android.widget.TextView r13 = r0.f627f
            boolean r13 = r0.mo712u(r13)
            android.widget.TextView r14 = r0.f628g
            boolean r14 = r0.mo712u(r14)
            if (r13 == 0) goto L_0x00f8
            android.widget.TextView r15 = r0.f627f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0124e) r15
            int r3 = r15.topMargin
            r24 = r7
            android.widget.TextView r7 = r0.f627f
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r24 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            android.widget.TextView r3 = r0.f628g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0124e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f628g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r23 = r12
            goto L_0x0287
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            android.widget.TextView r3 = r0.f627f
            goto L_0x0129
        L_0x0127:
            android.widget.TextView r3 = r0.f628g
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            android.widget.TextView r4 = r0.f628g
            goto L_0x0130
        L_0x012e:
            android.widget.TextView r4 = r0.f627f
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0124e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0124e) r4
            if (r13 == 0) goto L_0x0146
            android.widget.TextView r15 = r0.f627f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f628g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.f609A
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019d
            r6 = 80
            if (r15 == r6) goto L_0x018f
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.f643v
            r25 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0178
            int r6 = r15 + r12
            goto L_0x018d
        L_0x0178:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f644w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018d
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018d:
            int r8 = r8 + r6
            goto L_0x01ac
        L_0x018f:
            r25 = r2
            r23 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f644w
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01ac
        L_0x019d:
            r25 = r2
            r23 = r12
            int r2 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f643v
            int r8 = r2 + r3
        L_0x01ac:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b3
            int r1 = r0.f641t
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01eb
            android.widget.TextView r1 = r0.f627f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0124e) r1
            android.widget.TextView r2 = r0.f627f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f627f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f627f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f642u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ec
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            if (r14 == 0) goto L_0x0212
            android.widget.TextView r1 = r0.f628g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0124e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f628g
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f628g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f628g
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f642u
            int r1 = r10 - r1
            goto L_0x0213
        L_0x0212:
            r1 = r10
        L_0x0213:
            if (r17 == 0) goto L_0x021a
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021a:
            r2 = r25
            goto L_0x0287
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.f641t
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r25
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0259
            android.widget.TextView r1 = r0.f627f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0124e) r1
            android.widget.TextView r2 = r0.f627f
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f627f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f627f
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f642u
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r14 == 0) goto L_0x027e
            android.widget.TextView r1 = r0.f628g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0124e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f628g
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f628g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f628g
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f642u
            int r1 = r1 + r4
            goto L_0x027f
        L_0x027e:
            r1 = r3
        L_0x027f:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0287
        L_0x0286:
            r2 = r3
        L_0x0287:
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            r3 = 3
            r0.mo619a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0295:
            if (r2 >= r1) goto L_0x02a8
            java.util.ArrayList<android.view.View> r4 = r0.f616H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.mo677q(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0295
        L_0x02a8:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            r2 = 5
            r0.mo619a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            int r1 = r1.size()
            r2 = 0
        L_0x02b7:
            if (r2 >= r1) goto L_0x02c8
            java.util.ArrayList<android.view.View> r4 = r0.f616H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo678r(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02c8:
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            r2 = 1
            r0.mo619a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02dc:
            if (r5 >= r4) goto L_0x030f
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.C0124e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02dc
        L_0x030f:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031f
            goto L_0x0326
        L_0x031f:
            if (r6 <= r10) goto L_0x0325
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0326
        L_0x0325:
            r3 = r4
        L_0x0326:
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x0331:
            if (r3 >= r1) goto L_0x0342
            java.util.ArrayList<android.view.View> r4 = r0.f616H
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo677q(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x0331
        L_0x0342:
            java.util.ArrayList<android.view.View> r1 = r0.f616H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f618J;
        char a = C0170i1.m489a(this);
        boolean z = true;
        int i10 = 0;
        char c = a ^ 1;
        if (mo712u(this.f629h)) {
            mo711t(this.f629h, i, 0, i2, 0, this.f640s);
            i5 = mo664l(this.f629h) + this.f629h.getMeasuredWidth();
            i4 = Math.max(0, mo665m(this.f629h) + this.f629h.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.f629h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo712u(this.f633l)) {
            mo711t(this.f633l, i, 0, i2, 0, this.f640s);
            i5 = mo664l(this.f633l) + this.f633l.getMeasuredWidth();
            i4 = Math.max(i4, mo665m(this.f633l) + this.f633l.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f633l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[a] = Math.max(0, currentContentInsetStart - i5);
        if (mo712u(this.f626e)) {
            mo711t(this.f626e, i, max, i2, 0, this.f640s);
            i6 = mo664l(this.f626e) + this.f626e.getMeasuredWidth();
            i4 = Math.max(i4, mo665m(this.f626e) + this.f626e.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f626e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo712u(this.f634m)) {
            max2 += mo679s(this.f634m, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo665m(this.f634m) + this.f634m.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f634m.getMeasuredState());
        }
        if (mo712u(this.f630i)) {
            max2 += mo679s(this.f630i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, mo665m(this.f630i) + this.f630i.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f630i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0124e) childAt.getLayoutParams()).f654b == 0 && mo712u(childAt)) {
                View view = childAt;
                max2 += mo679s(childAt, i, max2, i2, 0, iArr);
                View view2 = view;
                i4 = Math.max(i4, mo665m(view2) + view.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
            }
        }
        int i12 = this.f643v + this.f644w;
        int i13 = this.f641t + this.f642u;
        if (mo712u(this.f627f)) {
            mo679s(this.f627f, i, max2 + i13, i2, i12, iArr);
            int l = mo664l(this.f627f) + this.f627f.getMeasuredWidth();
            i7 = mo665m(this.f627f) + this.f627f.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.f627f.getMeasuredState());
            i8 = l;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (mo712u(this.f628g)) {
            i8 = Math.max(i8, mo679s(this.f628g, i, max2 + i13, i2, i7 + i12, iArr));
            i7 = mo665m(this.f628g) + this.f628g.getMeasuredHeight() + i7;
            i9 = View.combineMeasuredStates(i9, this.f628g.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f624P) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (mo712u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        z = false;
        if (!z) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0126g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0126g gVar = (C0126g) parcelable;
        super.onRestoreInstanceState(gVar.f4651e);
        ActionMenuView actionMenuView = this.f626e;
        C0074e eVar = actionMenuView != null ? actionMenuView.f510t : null;
        int i = gVar.f655g;
        if (!(i == 0 || this.f623O == null || eVar == null || (findItem = eVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f656h) {
            removeCallbacks(this.f625Q);
            post(this.f625Q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.mo623d()
            androidx.appcompat.widget.t0 r0 = r2.f645x
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f933g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f933g = r1
            boolean r3 = r0.f934h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f930d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f931e
        L_0x0023:
            r0.f927a = r1
            int r1 = r0.f929c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f929c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f931e
        L_0x0031:
            r0.f927a = r1
            int r1 = r0.f930d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f931e
            r0.f927a = r3
        L_0x003c:
            int r1 = r0.f932f
        L_0x003e:
            r0.f928b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        C0078g gVar;
        C0126g gVar2 = new C0126g(super.onSaveInstanceState());
        C0123d dVar = this.f623O;
        if (!(dVar == null || (gVar = dVar.f652f) == null)) {
            gVar2.f655g = gVar.f387a;
        }
        gVar2.f656h = mo676p();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f614F = false;
        }
        if (!this.f614F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f614F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f614F = false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo676p() {
        ActionMenuView actionMenuView = this.f626e;
        if (actionMenuView != null) {
            C0137c cVar = actionMenuView.f514x;
            if (cVar != null && cVar.mo780m()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final int mo677q(View view, int i, int[] iArr, int i2) {
        C0124e eVar = (C0124e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = mo663k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + eVar.rightMargin + max;
    }

    /* renamed from: r */
    public final int mo678r(View view, int i, int[] iArr, int i2) {
        C0124e eVar = (C0124e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = mo663k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: s */
    public final int mo679s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo621c();
        }
        ImageButton imageButton = this.f633l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1021a.m2945a(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo621c();
            this.f633l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f633l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f631j);
        }
    }

    public void setCollapsible(boolean z) {
        this.f624P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f647z) {
            this.f647z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f646y) {
            this.f646y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1021a.m2945a(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f630i == null) {
                this.f630i = new C0188o(getContext(), (AttributeSet) null, 0);
            }
            if (!mo667o(this.f630i)) {
                mo620b(this.f630i, true);
            }
        } else {
            ImageView imageView = this.f630i;
            if (imageView != null && mo667o(imageView)) {
                removeView(this.f630i);
                this.f617I.remove(this.f630i);
            }
        }
        ImageView imageView2 = this.f630i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f630i == null) {
            this.f630i = new C0188o(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.f630i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo626g();
        }
        ImageButton imageButton = this.f629h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1021a.m2945a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo626g();
            if (!mo667o(this.f629h)) {
                mo620b(this.f629h, true);
            }
        } else {
            ImageButton imageButton = this.f629h;
            if (imageButton != null && mo667o(imageButton)) {
                removeView(this.f629h);
                this.f617I.remove(this.f629h);
            }
        }
        ImageButton imageButton2 = this.f629h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo626g();
        this.f629h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0125f fVar) {
        this.f619K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo624e();
        this.f626e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f636o != i) {
            this.f636o = i;
            if (i == 0) {
                this.f635n = getContext();
            } else {
                this.f635n = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f628g == null) {
                Context context = getContext();
                C0148d0 d0Var = new C0148d0(context, (AttributeSet) null);
                this.f628g = d0Var;
                d0Var.setSingleLine();
                this.f628g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f638q;
                if (i != 0) {
                    this.f628g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f613E;
                if (colorStateList != null) {
                    this.f628g.setTextColor(colorStateList);
                }
            }
            if (!mo667o(this.f628g)) {
                mo620b(this.f628g, true);
            }
        } else {
            TextView textView = this.f628g;
            if (textView != null && mo667o(textView)) {
                removeView(this.f628g);
                this.f617I.remove(this.f628g);
            }
        }
        TextView textView2 = this.f628g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f611C = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f613E = colorStateList;
        TextView textView = this.f628g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f627f == null) {
                Context context = getContext();
                C0148d0 d0Var = new C0148d0(context, (AttributeSet) null);
                this.f627f = d0Var;
                d0Var.setSingleLine();
                this.f627f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f637p;
                if (i != 0) {
                    this.f627f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f612D;
                if (colorStateList != null) {
                    this.f627f.setTextColor(colorStateList);
                }
            }
            if (!mo667o(this.f627f)) {
                mo620b(this.f627f, true);
            }
        } else {
            TextView textView = this.f627f;
            if (textView != null && mo667o(textView)) {
                removeView(this.f627f);
                this.f617I.remove(this.f627f);
            }
        }
        TextView textView2 = this.f627f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f610B = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f644w = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f642u = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f641t = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f643v = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f612D = colorStateList;
        TextView textView = this.f627f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final void mo711t(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, EnumBarcodeFormat.BF_MICRO_QR);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: u */
    public final boolean mo712u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: v */
    public boolean mo713v() {
        ActionMenuView actionMenuView = this.f626e;
        if (actionMenuView != null) {
            C0137c cVar = actionMenuView.f514x;
            if (cVar != null && cVar.mo781n()) {
                return true;
            }
        }
        return false;
    }
}
