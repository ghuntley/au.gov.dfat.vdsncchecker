package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.widget.C0172j0;
import androidx.appcompat.widget.C0198q0;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p069l.C1222d;

/* renamed from: androidx.appcompat.view.menu.k */
public final class C0086k extends C1222d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: f */
    public final Context f427f;

    /* renamed from: g */
    public final C0074e f428g;

    /* renamed from: h */
    public final C0073d f429h;

    /* renamed from: i */
    public final boolean f430i;

    /* renamed from: j */
    public final int f431j;

    /* renamed from: k */
    public final int f432k;

    /* renamed from: l */
    public final int f433l;

    /* renamed from: m */
    public final C0198q0 f434m;

    /* renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener f435n = new C0087a();

    /* renamed from: o */
    public final View.OnAttachStateChangeListener f436o = new C0088b();

    /* renamed from: p */
    public PopupWindow.OnDismissListener f437p;

    /* renamed from: q */
    public View f438q;

    /* renamed from: r */
    public View f439r;

    /* renamed from: s */
    public C0082i.C0083a f440s;

    /* renamed from: t */
    public ViewTreeObserver f441t;

    /* renamed from: u */
    public boolean f442u;

    /* renamed from: v */
    public boolean f443v;

    /* renamed from: w */
    public int f444w;

    /* renamed from: x */
    public int f445x = 0;

    /* renamed from: y */
    public boolean f446y;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class C0087a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0087a() {
        }

        public void onGlobalLayout() {
            if (C0086k.this.mo202b()) {
                C0086k kVar = C0086k.this;
                if (!kVar.f434m.f872B) {
                    View view = kVar.f439r;
                    if (view == null || !view.isShown()) {
                        C0086k.this.dismiss();
                    } else {
                        C0086k.this.f434m.mo205f();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    public class C0088b implements View.OnAttachStateChangeListener {
        public C0088b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0086k.this.f441t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0086k.this.f441t = view.getViewTreeObserver();
                }
                C0086k kVar = C0086k.this;
                kVar.f441t.removeGlobalOnLayoutListener(kVar.f435n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0086k(Context context, C0074e eVar, View view, int i, int i2, boolean z) {
        this.f427f = context;
        this.f428g = eVar;
        this.f430i = z;
        this.f429h = new C0073d(eVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f432k = i;
        this.f433l = i2;
        Resources resources = context.getResources();
        this.f431j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f438q = view;
        this.f434m = new C0198q0(context, (AttributeSet) null, i, i2);
        eVar.mo253b(this, context);
    }

    /* renamed from: a */
    public void mo201a(C0074e eVar, boolean z) {
        if (eVar == this.f428g) {
            dismiss();
            C0082i.C0083a aVar = this.f440s;
            if (aVar != null) {
                aVar.mo296a(eVar, z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo202b() {
        return !this.f442u && this.f434m.mo202b();
    }

    /* renamed from: c */
    public boolean mo203c() {
        return false;
    }

    public void dismiss() {
        if (mo202b()) {
            this.f434m.dismiss();
        }
    }

    /* renamed from: f */
    public void mo205f() {
        View view;
        boolean z = true;
        if (!mo202b()) {
            if (this.f442u || (view = this.f438q) == null) {
                z = false;
            } else {
                this.f439r = view;
                this.f434m.f873C.setOnDismissListener(this);
                C0198q0 q0Var = this.f434m;
                q0Var.f889t = this;
                q0Var.mo1084s(true);
                View view2 = this.f439r;
                boolean z2 = this.f441t == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f441t = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f435n);
                }
                view2.addOnAttachStateChangeListener(this.f436o);
                C0198q0 q0Var2 = this.f434m;
                q0Var2.f888s = view2;
                q0Var2.f885p = this.f445x;
                if (!this.f443v) {
                    this.f444w = C1222d.m3474m(this.f429h, (ViewGroup) null, this.f427f, this.f431j);
                    this.f443v = true;
                }
                this.f434m.mo1083r(this.f444w);
                this.f434m.f873C.setInputMethodMode(2);
                C0198q0 q0Var3 = this.f434m;
                Rect rect = this.f4148e;
                Objects.requireNonNull(q0Var3);
                q0Var3.f871A = rect != null ? new Rect(rect) : null;
                this.f434m.mo205f();
                C0172j0 j0Var = this.f434m.f876g;
                j0Var.setOnKeyListener(this);
                if (this.f446y && this.f428g.f368m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f427f).inflate(R.layout.abc_popup_menu_header_item_layout, j0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f428g.f368m);
                    }
                    frameLayout.setEnabled(false);
                    j0Var.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f434m.mo1081o(this.f429h);
                this.f434m.mo205f();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: h */
    public void mo200h(C0082i.C0083a aVar) {
        this.f440s = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo206i(androidx.appcompat.view.menu.C0089l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f427f
            android.view.View r5 = r9.f439r
            boolean r6 = r9.f430i
            int r7 = r9.f432k
            int r8 = r9.f433l
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f440s
            r0.mo371d(r2)
            boolean r2 = p069l.C1222d.m3475u(r10)
            r0.f421h = r2
            l.d r3 = r0.f423j
            if (r3 == 0) goto L_0x002a
            r3.mo211o(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f437p
            r0.f424k = r2
            r2 = 0
            r9.f437p = r2
            androidx.appcompat.view.menu.e r2 = r9.f428g
            r2.mo254c(r1)
            androidx.appcompat.widget.q0 r2 = r9.f434m
            int r3 = r2.f879j
            boolean r4 = r2.f882m
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f880k
        L_0x0042:
            int r4 = r9.f445x
            android.view.View r5 = r9.f438q
            java.util.WeakHashMap<android.view.View, j0.q> r6 = p058j0.C1061o.f3808a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.f438q
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.mo369b()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.f419f
            if (r4 != 0) goto L_0x006a
            r0 = r1
            goto L_0x006e
        L_0x006a:
            r0.mo372e(r3, r2, r5, r5)
        L_0x006d:
            r0 = r5
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.i$a r0 = r9.f440s
            if (r0 == 0) goto L_0x0077
            r0.mo297b(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0086k.mo206i(androidx.appcompat.view.menu.l):boolean");
    }

    /* renamed from: j */
    public void mo207j(boolean z) {
        this.f443v = false;
        C0073d dVar = this.f429h;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public ListView mo208k() {
        return this.f434m.f876g;
    }

    /* renamed from: l */
    public void mo209l(C0074e eVar) {
    }

    /* renamed from: n */
    public void mo210n(View view) {
        this.f438q = view;
    }

    /* renamed from: o */
    public void mo211o(boolean z) {
        this.f429h.f351g = z;
    }

    public void onDismiss() {
        this.f442u = true;
        this.f428g.mo254c(true);
        ViewTreeObserver viewTreeObserver = this.f441t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f441t = this.f439r.getViewTreeObserver();
            }
            this.f441t.removeGlobalOnLayoutListener(this.f435n);
            this.f441t = null;
        }
        this.f439r.removeOnAttachStateChangeListener(this.f436o);
        PopupWindow.OnDismissListener onDismissListener = this.f437p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo214p(int i) {
        this.f445x = i;
    }

    /* renamed from: q */
    public void mo215q(int i) {
        this.f434m.f879j = i;
    }

    /* renamed from: r */
    public void mo216r(PopupWindow.OnDismissListener onDismissListener) {
        this.f437p = onDismissListener;
    }

    /* renamed from: s */
    public void mo217s(boolean z) {
        this.f446y = z;
    }

    /* renamed from: t */
    public void mo218t(int i) {
        C0198q0 q0Var = this.f434m;
        q0Var.f880k = i;
        q0Var.f882m = true;
    }
}
