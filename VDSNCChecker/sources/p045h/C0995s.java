package p045h;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0137c;
import androidx.appcompat.widget.C0166h0;
import androidx.appcompat.widget.C0210u0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p045h.C0958a;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1073r;
import p058j0.C1074s;
import p058j0.C1075t;
import p063k.C1135a;
import p063k.C1143g;
import p063k.C1146h;

/* renamed from: h.s */
public class C0995s extends C0958a implements ActionBarOverlayLayout.C0094d {

    /* renamed from: A */
    public static final Interpolator f3664A = new DecelerateInterpolator();

    /* renamed from: z */
    public static final Interpolator f3665z = new AccelerateInterpolator();

    /* renamed from: a */
    public Context f3666a;

    /* renamed from: b */
    public Context f3667b;

    /* renamed from: c */
    public ActionBarOverlayLayout f3668c;

    /* renamed from: d */
    public ActionBarContainer f3669d;

    /* renamed from: e */
    public C0166h0 f3670e;

    /* renamed from: f */
    public ActionBarContextView f3671f;

    /* renamed from: g */
    public View f3672g;

    /* renamed from: h */
    public boolean f3673h;

    /* renamed from: i */
    public C0999d f3674i;

    /* renamed from: j */
    public C1135a f3675j;

    /* renamed from: k */
    public C1135a.C1136a f3676k;

    /* renamed from: l */
    public boolean f3677l;

    /* renamed from: m */
    public ArrayList<C0958a.C0960b> f3678m = new ArrayList<>();

    /* renamed from: n */
    public boolean f3679n;

    /* renamed from: o */
    public int f3680o = 0;

    /* renamed from: p */
    public boolean f3681p = true;

    /* renamed from: q */
    public boolean f3682q;

    /* renamed from: r */
    public boolean f3683r;

    /* renamed from: s */
    public boolean f3684s = true;

    /* renamed from: t */
    public C1146h f3685t;

    /* renamed from: u */
    public boolean f3686u;

    /* renamed from: v */
    public boolean f3687v;

    /* renamed from: w */
    public final C1073r f3688w = new C0996a();

    /* renamed from: x */
    public final C1073r f3689x = new C0997b();

    /* renamed from: y */
    public final C1075t f3690y = new C0998c();

    /* renamed from: h.s$a */
    public class C0996a extends C1074s {
        public C0996a() {
        }

        /* renamed from: a */
        public void mo739a(View view) {
            View view2;
            C0995s sVar = C0995s.this;
            if (sVar.f3681p && (view2 = sVar.f3672g) != null) {
                view2.setTranslationY(0.0f);
                C0995s.this.f3669d.setTranslationY(0.0f);
            }
            C0995s.this.f3669d.setVisibility(8);
            C0995s.this.f3669d.setTransitioning(false);
            C0995s sVar2 = C0995s.this;
            sVar2.f3685t = null;
            C1135a.C1136a aVar = sVar2.f3676k;
            if (aVar != null) {
                aVar.mo4349d(sVar2.f3675j);
                sVar2.f3675j = null;
                sVar2.f3676k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0995s.this.f3668c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* renamed from: h.s$b */
    public class C0997b extends C1074s {
        public C0997b() {
        }

        /* renamed from: a */
        public void mo739a(View view) {
            C0995s sVar = C0995s.this;
            sVar.f3685t = null;
            sVar.f3669d.requestLayout();
        }
    }

    /* renamed from: h.s$c */
    public class C0998c implements C1075t {
        public C0998c() {
        }
    }

    /* renamed from: h.s$d */
    public class C0999d extends C1135a implements C0074e.C0075a {

        /* renamed from: g */
        public final Context f3694g;

        /* renamed from: h */
        public final C0074e f3695h;

        /* renamed from: i */
        public C1135a.C1136a f3696i;

        /* renamed from: j */
        public WeakReference<View> f3697j;

        public C0999d(Context context, C1135a.C1136a aVar) {
            this.f3694g = context;
            this.f3696i = aVar;
            C0074e eVar = new C0074e(context);
            eVar.f367l = 1;
            this.f3695h = eVar;
            eVar.f360e = this;
        }

        /* renamed from: a */
        public boolean mo294a(C0074e eVar, MenuItem menuItem) {
            C1135a.C1136a aVar = this.f3696i;
            if (aVar != null) {
                return aVar.mo4346a(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo295b(C0074e eVar) {
            if (this.f3696i != null) {
                mo4414i();
                C0137c cVar = C0995s.this.f3671f.f665h;
                if (cVar != null) {
                    cVar.mo781n();
                }
            }
        }

        /* renamed from: c */
        public void mo4408c() {
            C0995s sVar = C0995s.this;
            if (sVar.f3674i == this) {
                if (!(!sVar.f3682q)) {
                    sVar.f3675j = this;
                    sVar.f3676k = this.f3696i;
                } else {
                    this.f3696i.mo4349d(this);
                }
                this.f3696i = null;
                C0995s.this.mo4403d(false);
                ActionBarContextView actionBarContextView = C0995s.this.f3671f;
                if (actionBarContextView.f463o == null) {
                    actionBarContextView.mo416h();
                }
                C0995s.this.f3670e.mo847n().sendAccessibilityEvent(32);
                C0995s sVar2 = C0995s.this;
                sVar2.f3668c.setHideOnContentScrollEnabled(sVar2.f3687v);
                C0995s.this.f3674i = null;
            }
        }

        /* renamed from: d */
        public View mo4409d() {
            WeakReference<View> weakReference = this.f3697j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo4410e() {
            return this.f3695h;
        }

        /* renamed from: f */
        public MenuInflater mo4411f() {
            return new C1143g(this.f3694g);
        }

        /* renamed from: g */
        public CharSequence mo4412g() {
            return C0995s.this.f3671f.getSubtitle();
        }

        /* renamed from: h */
        public CharSequence mo4413h() {
            return C0995s.this.f3671f.getTitle();
        }

        /* renamed from: i */
        public void mo4414i() {
            if (C0995s.this.f3674i == this) {
                this.f3695h.mo293y();
                try {
                    this.f3696i.mo4347b(this, this.f3695h);
                } finally {
                    this.f3695h.mo292x();
                }
            }
        }

        /* renamed from: j */
        public boolean mo4415j() {
            return C0995s.this.f3671f.f471w;
        }

        /* renamed from: k */
        public void mo4416k(View view) {
            C0995s.this.f3671f.setCustomView(view);
            this.f3697j = new WeakReference<>(view);
        }

        /* renamed from: l */
        public void mo4417l(int i) {
            C0995s.this.f3671f.setSubtitle(C0995s.this.f3666a.getResources().getString(i));
        }

        /* renamed from: m */
        public void mo4418m(CharSequence charSequence) {
            C0995s.this.f3671f.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public void mo4419n(int i) {
            C0995s.this.f3671f.setTitle(C0995s.this.f3666a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo4420o(CharSequence charSequence) {
            C0995s.this.f3671f.setTitle(charSequence);
        }

        /* renamed from: p */
        public void mo4421p(boolean z) {
            this.f3933f = z;
            C0995s.this.f3671f.setTitleOptional(z);
        }
    }

    public C0995s(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        mo4404e(decorView);
        if (!z) {
            this.f3672g = decorView.findViewById(16908290);
        }
    }

    public C0995s(Dialog dialog) {
        new ArrayList();
        mo4404e(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public void mo4264a(boolean z) {
        if (z != this.f3677l) {
            this.f3677l = z;
            int size = this.f3678m.size();
            for (int i = 0; i < size; i++) {
                this.f3678m.get(i).mo4267a(z);
            }
        }
    }

    /* renamed from: b */
    public Context mo4265b() {
        if (this.f3667b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3666a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3667b = new ContextThemeWrapper(this.f3666a, i);
            } else {
                this.f3667b = this.f3666a;
            }
        }
        return this.f3667b;
    }

    /* renamed from: c */
    public void mo4266c(boolean z) {
        mo4405f(z ? 4 : 0, 4);
    }

    /* renamed from: d */
    public void mo4403d(boolean z) {
        C1070q qVar;
        C1070q qVar2;
        if (z) {
            if (!this.f3683r) {
                this.f3683r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3668c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo4407h(false);
            }
        } else if (this.f3683r) {
            this.f3683r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3668c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo4407h(false);
        }
        ActionBarContainer actionBarContainer = this.f3669d;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (actionBarContainer.isLaidOut()) {
            if (z) {
                qVar = this.f3670e.mo850q(4, 100);
                qVar2 = this.f3671f.mo735e(0, 200);
            } else {
                qVar2 = this.f3670e.mo850q(0, 200);
                qVar = this.f3671f.mo735e(8, 100);
            }
            C1146h hVar = new C1146h();
            hVar.f3991a.add(qVar);
            View view = (View) qVar.f3821a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) qVar2.f3821a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            hVar.f3991a.add(qVar2);
            hVar.mo4743b();
        } else if (z) {
            this.f3670e.mo844k(4);
            this.f3671f.setVisibility(0);
        } else {
            this.f3670e.mo844k(0);
            this.f3671f.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo4404e(View view) {
        C0166h0 h0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f3668c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C0166h0) {
            h0Var = (C0166h0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            h0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a = C0001b.m0a("Can't make a decor toolbar out of ");
            a.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a.toString());
        }
        this.f3670e = h0Var;
        this.f3671f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f3669d = actionBarContainer;
        C0166h0 h0Var2 = this.f3670e;
        if (h0Var2 == null || this.f3671f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0995s.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f3666a = h0Var2.mo836d();
        boolean z = (this.f3670e.mo843j() & 4) != 0;
        if (z) {
            this.f3673h = true;
        }
        Context context = this.f3666a;
        this.f3670e.mo848o((context.getApplicationInfo().targetSdkVersion < 14) || z);
        mo4406g(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f3666a.obtainStyledAttributes((AttributeSet) null, C0934b.f3459a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3668c;
            if (actionBarOverlayLayout2.f487l) {
                this.f3687v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3669d;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            actionBarContainer2.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public void mo4405f(int i, int i2) {
        int j = this.f3670e.mo843j();
        if ((i2 & 4) != 0) {
            this.f3673h = true;
        }
        this.f3670e.mo859v((i & i2) | ((~i2) & j));
    }

    /* renamed from: g */
    public final void mo4406g(boolean z) {
        this.f3679n = z;
        if (!z) {
            this.f3670e.mo846m((C0210u0) null);
            this.f3669d.setTabContainer((C0210u0) null);
        } else {
            this.f3669d.setTabContainer((C0210u0) null);
            this.f3670e.mo846m((C0210u0) null);
        }
        boolean z2 = true;
        boolean z3 = this.f3670e.mo849p() == 2;
        this.f3670e.mo858u(!this.f3679n && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3668c;
        if (this.f3679n || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: h */
    public final void mo4407h(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.f3683r || !this.f3682q) {
            if (!this.f3684s) {
                this.f3684s = true;
                C1146h hVar = this.f3685t;
                if (hVar != null) {
                    hVar.mo4742a();
                }
                this.f3669d.setVisibility(0);
                if (this.f3680o != 0 || (!this.f3686u && !z)) {
                    this.f3669d.setAlpha(1.0f);
                    this.f3669d.setTranslationY(0.0f);
                    if (this.f3681p && (view2 = this.f3672g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f3689x.mo739a((View) null);
                } else {
                    this.f3669d.setTranslationY(0.0f);
                    float f = (float) (-this.f3669d.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f3669d.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f3669d.setTranslationY(f);
                    C1146h hVar2 = new C1146h();
                    C1070q b = C1061o.m3021b(this.f3669d);
                    b.mo4551g(0.0f);
                    b.mo4550f(this.f3690y);
                    if (!hVar2.f3995e) {
                        hVar2.f3991a.add(b);
                    }
                    if (this.f3681p && (view3 = this.f3672g) != null) {
                        view3.setTranslationY(f);
                        C1070q b2 = C1061o.m3021b(this.f3672g);
                        b2.mo4551g(0.0f);
                        if (!hVar2.f3995e) {
                            hVar2.f3991a.add(b2);
                        }
                    }
                    Interpolator interpolator = f3664A;
                    boolean z2 = hVar2.f3995e;
                    if (!z2) {
                        hVar2.f3993c = interpolator;
                    }
                    if (!z2) {
                        hVar2.f3992b = 250;
                    }
                    C1073r rVar = this.f3689x;
                    if (!z2) {
                        hVar2.f3994d = rVar;
                    }
                    this.f3685t = hVar2;
                    hVar2.mo4743b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3668c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (this.f3684s) {
            this.f3684s = false;
            C1146h hVar3 = this.f3685t;
            if (hVar3 != null) {
                hVar3.mo4742a();
            }
            if (this.f3680o != 0 || (!this.f3686u && !z)) {
                this.f3688w.mo739a((View) null);
                return;
            }
            this.f3669d.setAlpha(1.0f);
            this.f3669d.setTransitioning(true);
            C1146h hVar4 = new C1146h();
            float f2 = (float) (-this.f3669d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f3669d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C1070q b3 = C1061o.m3021b(this.f3669d);
            b3.mo4551g(f2);
            b3.mo4550f(this.f3690y);
            if (!hVar4.f3995e) {
                hVar4.f3991a.add(b3);
            }
            if (this.f3681p && (view = this.f3672g) != null) {
                C1070q b4 = C1061o.m3021b(view);
                b4.mo4551g(f2);
                if (!hVar4.f3995e) {
                    hVar4.f3991a.add(b4);
                }
            }
            Interpolator interpolator2 = f3665z;
            boolean z3 = hVar4.f3995e;
            if (!z3) {
                hVar4.f3993c = interpolator2;
            }
            if (!z3) {
                hVar4.f3992b = 250;
            }
            C1073r rVar2 = this.f3688w;
            if (!z3) {
                hVar4.f3994d = rVar2;
            }
            this.f3685t = hVar4;
            hVar4.mo4743b();
        }
    }
}
