package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0064a;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0080h;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.view.menu.C0084j;
import androidx.appcompat.view.menu.C0089l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1045b;
import p069l.C1222d;
import p069l.C1224f;

/* renamed from: androidx.appcompat.widget.c */
public class C0137c extends C0064a {

    /* renamed from: A */
    public final C0144f f694A = new C0144f();

    /* renamed from: m */
    public C0141d f695m;

    /* renamed from: n */
    public Drawable f696n;

    /* renamed from: o */
    public boolean f697o;

    /* renamed from: p */
    public boolean f698p;

    /* renamed from: q */
    public boolean f699q;

    /* renamed from: r */
    public int f700r;

    /* renamed from: s */
    public int f701s;

    /* renamed from: t */
    public int f702t;

    /* renamed from: u */
    public boolean f703u;

    /* renamed from: v */
    public final SparseBooleanArray f704v = new SparseBooleanArray();

    /* renamed from: w */
    public C0143e f705w;

    /* renamed from: x */
    public C0138a f706x;

    /* renamed from: y */
    public C0140c f707y;

    /* renamed from: z */
    public C0139b f708z;

    /* renamed from: androidx.appcompat.widget.c$a */
    public class C0138a extends C0080h {
        public C0138a(Context context, C0089l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.f449A.mo308g()) {
                View view2 = C0137c.this.f695m;
                this.f419f = view2 == null ? (View) C0137c.this.f304l : view2;
            }
            mo371d(C0137c.this.f694A);
        }

        /* renamed from: c */
        public void mo370c() {
            C0137c cVar = C0137c.this;
            cVar.f706x = null;
            Objects.requireNonNull(cVar);
            super.mo370c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    public class C0139b extends ActionMenuItemView.C0063b {
        public C0139b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    public class C0140c implements Runnable {

        /* renamed from: e */
        public C0143e f711e;

        public C0140c(C0143e eVar) {
            this.f711e = eVar;
        }

        public void run() {
            C0074e.C0075a aVar;
            C0074e eVar = C0137c.this.f299g;
            if (!(eVar == null || (aVar = eVar.f360e) == null)) {
                aVar.mo295b(eVar);
            }
            View view = (View) C0137c.this.f304l;
            if (!(view == null || view.getWindowToken() == null || !this.f711e.mo373f())) {
                C0137c.this.f705w = this.f711e;
            }
            C0137c.this.f707y = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public class C0141d extends C0188o implements ActionMenuView.C0096a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        public class C0142a extends C0180l0 {
            public C0142a(View view, C0137c cVar) {
                super(view);
            }

            /* renamed from: b */
            public C1224f mo180b() {
                C0143e eVar = C0137c.this.f705w;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo368a();
            }

            /* renamed from: c */
            public boolean mo181c() {
                C0137c.this.mo781n();
                return true;
            }

            /* renamed from: d */
            public boolean mo785d() {
                C0137c cVar = C0137c.this;
                if (cVar.f707y != null) {
                    return false;
                }
                cVar.mo778k();
                return true;
            }
        }

        public C0141d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0156e1.m441a(this, getContentDescription());
            setOnTouchListener(new C0142a(this, C0137c.this));
        }

        /* renamed from: a */
        public boolean mo160a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo161b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0137c.this.mo781n();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public class C0143e extends C0080h {
        public C0143e(Context context, C0074e eVar, View view, boolean z) {
            super(context, eVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.f420g = 8388613;
            mo371d(C0137c.this.f694A);
        }

        /* renamed from: c */
        public void mo370c() {
            C0074e eVar = C0137c.this.f299g;
            if (eVar != null) {
                eVar.mo254c(true);
            }
            C0137c.this.f705w = null;
            super.mo370c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    public class C0144f implements C0082i.C0083a {
        public C0144f() {
        }

        /* renamed from: a */
        public void mo296a(C0074e eVar, boolean z) {
            if (eVar instanceof C0089l) {
                eVar.mo269k().mo254c(false);
            }
            C0082i.C0083a aVar = C0137c.this.f301i;
            if (aVar != null) {
                aVar.mo296a(eVar, z);
            }
        }

        /* renamed from: b */
        public boolean mo297b(C0074e eVar) {
            if (eVar == C0137c.this.f299g) {
                return false;
            }
            Objects.requireNonNull(((C0089l) eVar).f449A);
            C0082i.C0083a aVar = C0137c.this.f301i;
            if (aVar != null) {
                return aVar.mo297b(eVar);
            }
            return false;
        }
    }

    public C0137c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public void mo201a(C0074e eVar, boolean z) {
        mo776b();
        C0082i.C0083a aVar = this.f301i;
        if (aVar != null) {
            aVar.mo296a(eVar, z);
        }
    }

    /* renamed from: b */
    public boolean mo776b() {
        return mo778k() | mo779l();
    }

    /* renamed from: c */
    public boolean mo203c() {
        int i;
        ArrayList<C0078g> arrayList;
        int i2;
        boolean z;
        C0074e eVar = this.f299g;
        if (eVar != null) {
            arrayList = eVar.mo270l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f702t;
        int i4 = this.f701s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f304l;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0078g gVar = arrayList.get(i5);
            int i8 = gVar.f411y;
            if ((i8 & 2) == 2) {
                i7++;
            } else {
                if ((i8 & 1) == 1) {
                    i6++;
                } else {
                    z2 = true;
                }
            }
            if (this.f703u && gVar.f385C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f698p && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.f704v;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0078g gVar2 = arrayList.get(i10);
            int i12 = gVar2.f411y;
            if ((i12 & 2) == i2 ? z : false) {
                View f = mo777f(gVar2, (View) null, viewGroup);
                f.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = f.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = gVar2.f388b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                gVar2.mo337k(z);
            } else {
                if ((i12 & true) == z ? z : false) {
                    int i14 = gVar2.f388b;
                    boolean z3 = sparseBooleanArray.get(i14);
                    boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                    if (z4) {
                        View f2 = mo777f(gVar2, (View) null, viewGroup);
                        f2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = f2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        z4 &= i4 + i11 > 0;
                    }
                    if (z4 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i10; i15++) {
                            C0078g gVar3 = arrayList.get(i15);
                            if (gVar3.f388b == i14) {
                                if (gVar3.mo308g()) {
                                    i9++;
                                }
                                gVar3.mo337k(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    gVar2.mo337k(z4);
                } else {
                    gVar2.mo337k(false);
                    i10++;
                    i2 = 2;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public void mo227d(Context context, C0074e eVar) {
        this.f298f = context;
        LayoutInflater.from(context);
        this.f299g = eVar;
        Resources resources = context.getResources();
        if (!this.f699q) {
            this.f698p = true;
        }
        int i = 2;
        this.f700r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f702t = i;
        int i4 = this.f700r;
        if (this.f698p) {
            if (this.f695m == null) {
                C0141d dVar = new C0141d(this.f297e);
                this.f695m = dVar;
                if (this.f697o) {
                    dVar.setImageDrawable(this.f696n);
                    this.f696n = null;
                    this.f697o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f695m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f695m.getMeasuredWidth();
        } else {
            this.f695m = null;
        }
        this.f701s = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: f */
    public View mo777f(C0078g gVar, View view, ViewGroup viewGroup) {
        C0084j.C0085a aVar;
        View actionView = gVar.getActionView();
        int i = 0;
        if (actionView == null || gVar.mo307f()) {
            if (view instanceof C0084j.C0085a) {
                aVar = (C0084j.C0085a) view;
            } else {
                aVar = (C0084j.C0085a) this.f300h.inflate(this.f303k, viewGroup, false);
            }
            aVar.mo163d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f304l);
            if (this.f708z == null) {
                this.f708z = new C0139b();
            }
            actionMenuItemView.setPopupCallback(this.f708z);
            actionView = (View) aVar;
        }
        if (gVar.f385C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo499j(layoutParams));
        }
        return actionView;
    }

    /* renamed from: i */
    public boolean mo206i(C0089l lVar) {
        boolean z = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        C0089l lVar2 = lVar;
        while (true) {
            C0074e eVar = lVar2.f450z;
            if (eVar == this.f299g) {
                break;
            }
            lVar2 = eVar;
        }
        C0078g gVar = lVar2.f449A;
        ViewGroup viewGroup = (ViewGroup) this.f304l;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C0084j.C0085a) && ((C0084j.C0085a) childAt).getItemData() == gVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        Objects.requireNonNull(lVar.f449A);
        int size = lVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0138a aVar = new C0138a(this.f298f, lVar, view);
        this.f706x = aVar;
        aVar.f421h = z;
        C1222d dVar = aVar.f423j;
        if (dVar != null) {
            dVar.mo211o(z);
        }
        if (this.f706x.mo373f()) {
            C0082i.C0083a aVar2 = this.f301i;
            if (aVar2 != null) {
                aVar2.mo297b(lVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: j */
    public void mo207j(boolean z) {
        C0084j jVar;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f304l;
        ArrayList<C0078g> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C0074e eVar = this.f299g;
            if (eVar != null) {
                eVar.mo266i();
                ArrayList<C0078g> l = this.f299g.mo270l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0078g gVar = l.get(i2);
                    if (gVar.mo308g()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0078g itemData = childAt instanceof C0084j.C0085a ? ((C0084j.C0085a) childAt).getItemData() : null;
                        View f = mo777f(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            f.setPressed(false);
                            f.jumpDrawablesToCurrentState();
                        }
                        if (f != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) f.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(f);
                            }
                            ((ViewGroup) this.f304l).addView(f, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f695m) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f304l).requestLayout();
        C0074e eVar2 = this.f299g;
        if (eVar2 != null) {
            eVar2.mo266i();
            ArrayList<C0078g> arrayList2 = eVar2.f364i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C1045b bVar = arrayList2.get(i3).f383A;
            }
        }
        C0074e eVar3 = this.f299g;
        if (eVar3 != null) {
            eVar3.mo266i();
            arrayList = eVar3.f365j;
        }
        if (this.f698p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f385C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0141d dVar = this.f695m;
        if (z3) {
            if (dVar == null) {
                this.f695m = new C0141d(this.f297e);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f695m.getParent();
            if (viewGroup3 != this.f304l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f695m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f304l;
                C0141d dVar2 = this.f695m;
                ActionMenuView.C0098c l2 = actionMenuView.mo497h();
                l2.f517a = true;
                actionMenuView.addView(dVar2, l2);
            }
        } else if (dVar != null && dVar.getParent() == (jVar = this.f304l)) {
            ((ViewGroup) jVar).removeView(this.f695m);
        }
        ((ActionMenuView) this.f304l).setOverflowReserved(this.f698p);
    }

    /* renamed from: k */
    public boolean mo778k() {
        C0084j jVar;
        C0140c cVar = this.f707y;
        if (cVar == null || (jVar = this.f304l) == null) {
            C0143e eVar = this.f705w;
            if (eVar == null) {
                return false;
            }
            if (eVar.mo369b()) {
                eVar.f423j.dismiss();
            }
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.f707y = null;
        return true;
    }

    /* renamed from: l */
    public boolean mo779l() {
        C0138a aVar = this.f706x;
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo369b()) {
            return true;
        }
        aVar.f423j.dismiss();
        return true;
    }

    /* renamed from: m */
    public boolean mo780m() {
        C0143e eVar = this.f705w;
        return eVar != null && eVar.mo369b();
    }

    /* renamed from: n */
    public boolean mo781n() {
        C0074e eVar;
        if (!this.f698p || mo780m() || (eVar = this.f299g) == null || this.f304l == null || this.f707y != null) {
            return false;
        }
        eVar.mo266i();
        if (eVar.f365j.isEmpty()) {
            return false;
        }
        C0140c cVar = new C0140c(new C0143e(this.f298f, this.f299g, this.f695m, true));
        this.f707y = cVar;
        ((View) this.f304l).post(cVar);
        return true;
    }
}
