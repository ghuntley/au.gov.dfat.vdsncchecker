package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.widget.Toolbar;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p051i.C1021a;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1074s;

/* renamed from: androidx.appcompat.widget.d1 */
public class C0149d1 implements C0166h0 {

    /* renamed from: a */
    public Toolbar f727a;

    /* renamed from: b */
    public int f728b;

    /* renamed from: c */
    public View f729c;

    /* renamed from: d */
    public View f730d;

    /* renamed from: e */
    public Drawable f731e;

    /* renamed from: f */
    public Drawable f732f;

    /* renamed from: g */
    public Drawable f733g;

    /* renamed from: h */
    public boolean f734h;

    /* renamed from: i */
    public CharSequence f735i;

    /* renamed from: j */
    public CharSequence f736j;

    /* renamed from: k */
    public CharSequence f737k;

    /* renamed from: l */
    public Window.Callback f738l;

    /* renamed from: m */
    public boolean f739m;

    /* renamed from: n */
    public C0137c f740n;

    /* renamed from: o */
    public int f741o = 0;

    /* renamed from: p */
    public Drawable f742p;

    /* renamed from: androidx.appcompat.widget.d1$a */
    public class C0150a extends C1074s {

        /* renamed from: a */
        public boolean f743a = false;

        /* renamed from: b */
        public final /* synthetic */ int f744b;

        public C0150a(int i) {
            this.f744b = i;
        }

        /* renamed from: a */
        public void mo739a(View view) {
            if (!this.f743a) {
                C0149d1.this.f727a.setVisibility(this.f744b);
            }
        }

        /* renamed from: b */
        public void mo740b(View view) {
            C0149d1.this.f727a.setVisibility(0);
        }

        /* renamed from: c */
        public void mo741c(View view) {
            this.f743a = true;
        }
    }

    public C0149d1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f727a = toolbar;
        this.f735i = toolbar.getTitle();
        this.f736j = toolbar.getSubtitle();
        this.f734h = this.f735i != null;
        this.f733g = toolbar.getNavigationIcon();
        String str = null;
        C0136b1 q = C0136b1.m361q(toolbar.getContext(), (AttributeSet) null, C0934b.f3459a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.f742p = q.mo767g(15);
        if (z) {
            CharSequence n = q.mo774n(27);
            if (!TextUtils.isEmpty(n)) {
                this.f734h = true;
                this.f735i = n;
                if ((this.f728b & 8) != 0) {
                    this.f727a.setTitle(n);
                }
            }
            CharSequence n2 = q.mo774n(25);
            if (!TextUtils.isEmpty(n2)) {
                this.f736j = n2;
                if ((this.f728b & 8) != 0) {
                    this.f727a.setSubtitle(n2);
                }
            }
            Drawable g = q.mo767g(20);
            if (g != null) {
                this.f732f = g;
                mo862y();
            }
            Drawable g2 = q.mo767g(17);
            if (g2 != null) {
                this.f731e = g2;
                mo862y();
            }
            if (this.f733g == null && (drawable = this.f742p) != null) {
                this.f733g = drawable;
                mo861x();
            }
            mo859v(q.mo770j(10, 0));
            int l = q.mo772l(9, 0);
            if (l != 0) {
                View inflate = LayoutInflater.from(this.f727a.getContext()).inflate(l, this.f727a, false);
                View view = this.f730d;
                if (!(view == null || (this.f728b & 16) == 0)) {
                    this.f727a.removeView(view);
                }
                this.f730d = inflate;
                if (!(inflate == null || (this.f728b & 16) == 0)) {
                    this.f727a.addView(inflate);
                }
                mo859v(this.f728b | 16);
            }
            int k = q.mo771k(13, 0);
            if (k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f727a.getLayoutParams();
                layoutParams.height = k;
                this.f727a.setLayoutParams(layoutParams);
            }
            int e = q.mo765e(7, -1);
            int e2 = q.mo765e(3, -1);
            if (e >= 0 || e2 >= 0) {
                Toolbar toolbar2 = this.f727a;
                int max = Math.max(e, 0);
                int max2 = Math.max(e2, 0);
                toolbar2.mo623d();
                toolbar2.f645x.mo1134a(max, max2);
            }
            int l2 = q.mo772l(28, 0);
            if (l2 != 0) {
                Toolbar toolbar3 = this.f727a;
                Context context = toolbar3.getContext();
                toolbar3.f637p = l2;
                TextView textView = toolbar3.f627f;
                if (textView != null) {
                    textView.setTextAppearance(context, l2);
                }
            }
            int l3 = q.mo772l(26, 0);
            if (l3 != 0) {
                Toolbar toolbar4 = this.f727a;
                Context context2 = toolbar4.getContext();
                toolbar4.f638q = l3;
                TextView textView2 = toolbar4.f628g;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l3);
                }
            }
            int l4 = q.mo772l(22, 0);
            if (l4 != 0) {
                this.f727a.setPopupTheme(l4);
            }
        } else {
            if (this.f727a.getNavigationIcon() != null) {
                this.f742p = this.f727a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f728b = i;
        }
        q.f692b.recycle();
        if (R.string.abc_action_bar_up_description != this.f741o) {
            this.f741o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f727a.getNavigationContentDescription())) {
                int i2 = this.f741o;
                this.f737k = i2 != 0 ? mo836d().getString(i2) : str;
                mo860w();
            }
        }
        this.f737k = this.f727a.getNavigationContentDescription();
        this.f727a.setNavigationOnClickListener(new C0146c1(this));
    }

    /* renamed from: a */
    public void mo832a(Menu menu, C0082i.C0083a aVar) {
        C0078g gVar;
        if (this.f740n == null) {
            C0137c cVar = new C0137c(this.f727a.getContext());
            this.f740n = cVar;
            Objects.requireNonNull(cVar);
        }
        C0137c cVar2 = this.f740n;
        cVar2.f301i = aVar;
        Toolbar toolbar = this.f727a;
        C0074e eVar = (C0074e) menu;
        if (eVar != null || toolbar.f626e != null) {
            toolbar.mo625f();
            C0074e eVar2 = toolbar.f626e.f510t;
            if (eVar2 != eVar) {
                if (eVar2 != null) {
                    eVar2.mo288t(toolbar.f622N);
                    eVar2.mo288t(toolbar.f623O);
                }
                if (toolbar.f623O == null) {
                    toolbar.f623O = new Toolbar.C0123d();
                }
                cVar2.f703u = true;
                if (eVar != null) {
                    eVar.mo253b(cVar2, toolbar.f635n);
                    eVar.mo253b(toolbar.f623O, toolbar.f635n);
                } else {
                    cVar2.mo227d(toolbar.f635n, (C0074e) null);
                    Toolbar.C0123d dVar = toolbar.f623O;
                    C0074e eVar3 = dVar.f651e;
                    if (!(eVar3 == null || (gVar = dVar.f652f) == null)) {
                        eVar3.mo258d(gVar);
                    }
                    dVar.f651e = null;
                    cVar2.mo207j(true);
                    toolbar.f623O.mo207j(true);
                }
                toolbar.f626e.setPopupTheme(toolbar.f636o);
                toolbar.f626e.setPresenter(cVar2);
                toolbar.f622N = cVar2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo833b() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f727a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f626e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.f514x
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.f707y
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.mo780m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0149d1.mo833b():boolean");
    }

    /* renamed from: c */
    public boolean mo834c() {
        return this.f727a.mo676p();
    }

    public void collapseActionView() {
        Toolbar.C0123d dVar = this.f727a.f623O;
        C0078g gVar = dVar == null ? null : dVar.f652f;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* renamed from: d */
    public Context mo836d() {
        return this.f727a.getContext();
    }

    /* renamed from: e */
    public boolean mo837e() {
        ActionMenuView actionMenuView = this.f727a.f626e;
        if (actionMenuView != null) {
            C0137c cVar = actionMenuView.f514x;
            if (cVar != null && cVar.mo778k()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo838f() {
        return this.f727a.mo713v();
    }

    /* renamed from: g */
    public void mo839g() {
        this.f739m = true;
    }

    public CharSequence getTitle() {
        return this.f727a.getTitle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f626e;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo841h() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f727a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f626e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f513w
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0149d1.mo841h():boolean");
    }

    /* renamed from: i */
    public void mo842i() {
        C0137c cVar;
        ActionMenuView actionMenuView = this.f727a.f626e;
        if (actionMenuView != null && (cVar = actionMenuView.f514x) != null) {
            cVar.mo776b();
        }
    }

    /* renamed from: j */
    public int mo843j() {
        return this.f728b;
    }

    /* renamed from: k */
    public void mo844k(int i) {
        this.f727a.setVisibility(i);
    }

    /* renamed from: l */
    public void mo845l(int i) {
        this.f732f = i != 0 ? C1021a.m2945a(mo836d(), i) : null;
        mo862y();
    }

    /* renamed from: m */
    public void mo846m(C0210u0 u0Var) {
        Toolbar toolbar;
        View view = this.f729c;
        if (view != null && view.getParent() == (toolbar = this.f727a)) {
            toolbar.removeView(this.f729c);
        }
        this.f729c = null;
    }

    /* renamed from: n */
    public ViewGroup mo847n() {
        return this.f727a;
    }

    /* renamed from: o */
    public void mo848o(boolean z) {
    }

    /* renamed from: p */
    public int mo849p() {
        return 0;
    }

    /* renamed from: q */
    public C1070q mo850q(int i, long j) {
        C1070q b = C1061o.m3021b(this.f727a);
        b.mo4545a(i == 0 ? 1.0f : 0.0f);
        b.mo4547c(j);
        C0150a aVar = new C0150a(i);
        View view = (View) b.f3821a.get();
        if (view != null) {
            b.mo4549e(view, aVar);
        }
        return b;
    }

    /* renamed from: r */
    public void mo851r() {
    }

    /* renamed from: s */
    public boolean mo852s() {
        Toolbar.C0123d dVar = this.f727a.f623O;
        return (dVar == null || dVar.f652f == null) ? false : true;
    }

    public void setIcon(int i) {
        this.f731e = i != 0 ? C1021a.m2945a(mo836d(), i) : null;
        mo862y();
    }

    public void setIcon(Drawable drawable) {
        this.f731e = drawable;
        mo862y();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f738l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f734h) {
            this.f735i = charSequence;
            if ((this.f728b & 8) != 0) {
                this.f727a.setTitle(charSequence);
            }
        }
    }

    /* renamed from: t */
    public void mo857t() {
    }

    /* renamed from: u */
    public void mo858u(boolean z) {
        this.f727a.setCollapsible(z);
    }

    /* renamed from: v */
    public void mo859v(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f728b ^ i;
        this.f728b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo860w();
                }
                mo861x();
            }
            if ((i2 & 3) != 0) {
                mo862y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f727a.setTitle(this.f735i);
                    toolbar = this.f727a;
                    charSequence = this.f736j;
                } else {
                    charSequence = null;
                    this.f727a.setTitle((CharSequence) null);
                    toolbar = this.f727a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f730d) != null) {
                if ((i & 16) != 0) {
                    this.f727a.addView(view);
                } else {
                    this.f727a.removeView(view);
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo860w() {
        if ((this.f728b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f737k)) {
            this.f727a.setNavigationContentDescription(this.f741o);
        } else {
            this.f727a.setNavigationContentDescription(this.f737k);
        }
    }

    /* renamed from: x */
    public final void mo861x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f728b & 4) != 0) {
            toolbar = this.f727a;
            drawable = this.f733g;
            if (drawable == null) {
                drawable = this.f742p;
            }
        } else {
            toolbar = this.f727a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: y */
    public final void mo862y() {
        Drawable drawable;
        int i = this.f728b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f732f) == null) {
            drawable = this.f731e;
        }
        this.f727a.setLogo(drawable);
    }
}
