package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.widget.C0196p0;
import androidx.appcompat.widget.C0198q0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p069l.C1222d;

/* renamed from: androidx.appcompat.view.menu.b */
public final class C0065b extends C1222d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public boolean f305A;

    /* renamed from: B */
    public C0082i.C0083a f306B;

    /* renamed from: C */
    public ViewTreeObserver f307C;

    /* renamed from: D */
    public PopupWindow.OnDismissListener f308D;

    /* renamed from: E */
    public boolean f309E;

    /* renamed from: f */
    public final Context f310f;

    /* renamed from: g */
    public final int f311g;

    /* renamed from: h */
    public final int f312h;

    /* renamed from: i */
    public final int f313i;

    /* renamed from: j */
    public final boolean f314j;

    /* renamed from: k */
    public final Handler f315k;

    /* renamed from: l */
    public final List<C0074e> f316l = new ArrayList();

    /* renamed from: m */
    public final List<C0070d> f317m = new ArrayList();

    /* renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener f318n = new C0066a();

    /* renamed from: o */
    public final View.OnAttachStateChangeListener f319o = new C0067b();

    /* renamed from: p */
    public final C0196p0 f320p = new C0068c();

    /* renamed from: q */
    public int f321q;

    /* renamed from: r */
    public int f322r;

    /* renamed from: s */
    public View f323s;

    /* renamed from: t */
    public View f324t;

    /* renamed from: u */
    public int f325u;

    /* renamed from: v */
    public boolean f326v;

    /* renamed from: w */
    public boolean f327w;

    /* renamed from: x */
    public int f328x;

    /* renamed from: y */
    public int f329y;

    /* renamed from: z */
    public boolean f330z;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class C0066a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0066a() {
        }

        public void onGlobalLayout() {
            if (C0065b.this.mo202b() && C0065b.this.f317m.size() > 0 && !C0065b.this.f317m.get(0).f338a.f872B) {
                View view = C0065b.this.f324t;
                if (view == null || !view.isShown()) {
                    C0065b.this.dismiss();
                    return;
                }
                for (C0070d dVar : C0065b.this.f317m) {
                    dVar.f338a.mo205f();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class C0067b implements View.OnAttachStateChangeListener {
        public C0067b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0065b.this.f307C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0065b.this.f307C = view.getViewTreeObserver();
                }
                C0065b bVar = C0065b.this;
                bVar.f307C.removeGlobalOnLayoutListener(bVar.f318n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class C0068c implements C0196p0 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class C0069a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C0070d f334e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f335f;

            /* renamed from: g */
            public final /* synthetic */ C0074e f336g;

            public C0069a(C0070d dVar, MenuItem menuItem, C0074e eVar) {
                this.f334e = dVar;
                this.f335f = menuItem;
                this.f336g = eVar;
            }

            public void run() {
                C0070d dVar = this.f334e;
                if (dVar != null) {
                    C0065b.this.f309E = true;
                    dVar.f339b.mo254c(false);
                    C0065b.this.f309E = false;
                }
                if (this.f335f.isEnabled() && this.f335f.hasSubMenu()) {
                    this.f336g.mo277q(this.f335f, 4);
                }
            }
        }

        public C0068c() {
        }

        /* renamed from: a */
        public void mo223a(C0074e eVar, MenuItem menuItem) {
            C0070d dVar = null;
            C0065b.this.f315k.removeCallbacksAndMessages((Object) null);
            int size = C0065b.this.f317m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == C0065b.this.f317m.get(i).f339b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0065b.this.f317m.size()) {
                    dVar = C0065b.this.f317m.get(i2);
                }
                C0065b.this.f315k.postAtTime(new C0069a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: h */
        public void mo224h(C0074e eVar, MenuItem menuItem) {
            C0065b.this.f315k.removeCallbacksAndMessages(eVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class C0070d {

        /* renamed from: a */
        public final C0198q0 f338a;

        /* renamed from: b */
        public final C0074e f339b;

        /* renamed from: c */
        public final int f340c;

        public C0070d(C0198q0 q0Var, C0074e eVar, int i) {
            this.f338a = q0Var;
            this.f339b = eVar;
            this.f340c = i;
        }
    }

    public C0065b(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f321q = 0;
        this.f322r = 0;
        this.f310f = context;
        this.f323s = view;
        this.f312h = i;
        this.f313i = i2;
        this.f314j = z;
        this.f330z = false;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        this.f325u = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f311g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f315k = new Handler();
    }

    /* renamed from: a */
    public void mo201a(C0074e eVar, boolean z) {
        int i;
        int size = this.f317m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (eVar == this.f317m.get(i2).f339b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.f317m.size()) {
                this.f317m.get(i3).f339b.mo254c(false);
            }
            C0070d remove = this.f317m.remove(i2);
            remove.f339b.mo288t(this);
            if (this.f309E) {
                remove.f338a.f873C.setExitTransition((Transition) null);
                remove.f338a.f873C.setAnimationStyle(0);
            }
            remove.f338a.dismiss();
            int size2 = this.f317m.size();
            if (size2 > 0) {
                i = this.f317m.get(size2 - 1).f340c;
            } else {
                View view = this.f323s;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                i = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            this.f325u = i;
            if (size2 == 0) {
                dismiss();
                C0082i.C0083a aVar = this.f306B;
                if (aVar != null) {
                    aVar.mo296a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f307C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f307C.removeGlobalOnLayoutListener(this.f318n);
                    }
                    this.f307C = null;
                }
                this.f324t.removeOnAttachStateChangeListener(this.f319o);
                this.f308D.onDismiss();
            } else if (z) {
                this.f317m.get(0).f339b.mo254c(false);
            }
        }
    }

    /* renamed from: b */
    public boolean mo202b() {
        return this.f317m.size() > 0 && this.f317m.get(0).f338a.mo202b();
    }

    /* renamed from: c */
    public boolean mo203c() {
        return false;
    }

    public void dismiss() {
        int size = this.f317m.size();
        if (size > 0) {
            C0070d[] dVarArr = (C0070d[]) this.f317m.toArray(new C0070d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0070d dVar = dVarArr[i];
                if (dVar.f338a.mo202b()) {
                    dVar.f338a.dismiss();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo205f() {
        if (!mo202b()) {
            for (C0074e v : this.f316l) {
                mo219v(v);
            }
            this.f316l.clear();
            View view = this.f323s;
            this.f324t = view;
            if (view != null) {
                boolean z = this.f307C == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f307C = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f318n);
                }
                this.f324t.addOnAttachStateChangeListener(this.f319o);
            }
        }
    }

    /* renamed from: h */
    public void mo200h(C0082i.C0083a aVar) {
        this.f306B = aVar;
    }

    /* renamed from: i */
    public boolean mo206i(C0089l lVar) {
        for (C0070d next : this.f317m) {
            if (lVar == next.f339b) {
                next.f338a.f876g.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        lVar.mo253b(this, this.f310f);
        if (mo202b()) {
            mo219v(lVar);
        } else {
            this.f316l.add(lVar);
        }
        C0082i.C0083a aVar = this.f306B;
        if (aVar != null) {
            aVar.mo297b(lVar);
        }
        return true;
    }

    /* renamed from: j */
    public void mo207j(boolean z) {
        for (C0070d dVar : this.f317m) {
            ListAdapter adapter = dVar.f338a.f876g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0073d) adapter).notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public ListView mo208k() {
        if (this.f317m.isEmpty()) {
            return null;
        }
        List<C0070d> list = this.f317m;
        return list.get(list.size() - 1).f338a.f876g;
    }

    /* renamed from: l */
    public void mo209l(C0074e eVar) {
        eVar.mo253b(this, this.f310f);
        if (mo202b()) {
            mo219v(eVar);
        } else {
            this.f316l.add(eVar);
        }
    }

    /* renamed from: n */
    public void mo210n(View view) {
        if (this.f323s != view) {
            this.f323s = view;
            int i = this.f321q;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            this.f322r = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    /* renamed from: o */
    public void mo211o(boolean z) {
        this.f330z = z;
    }

    public void onDismiss() {
        C0070d dVar;
        int size = this.f317m.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f317m.get(i);
            if (!dVar.f338a.mo202b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f339b.mo254c(false);
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
        if (this.f321q != i) {
            this.f321q = i;
            View view = this.f323s;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            this.f322r = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    /* renamed from: q */
    public void mo215q(int i) {
        this.f326v = true;
        this.f328x = i;
    }

    /* renamed from: r */
    public void mo216r(PopupWindow.OnDismissListener onDismissListener) {
        this.f308D = onDismissListener;
    }

    /* renamed from: s */
    public void mo217s(boolean z) {
        this.f305A = z;
    }

    /* renamed from: t */
    public void mo218t(int i) {
        this.f327w = true;
        this.f329y = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013a, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        if ((r11[0] - r4) < 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e5  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo219v(androidx.appcompat.view.menu.C0074e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f310f
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f314j
            r5 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo202b()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.f330z
            if (r4 == 0) goto L_0x0022
            r3.f351g = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.mo202b()
            if (r4 == 0) goto L_0x002e
            boolean r4 = p069l.C1222d.m3475u(r17)
            r3.f351g = r4
        L_0x002e:
            android.content.Context r4 = r0.f310f
            int r6 = r0.f311g
            r7 = 0
            int r4 = p069l.C1222d.m3474m(r3, r7, r4, r6)
            androidx.appcompat.widget.q0 r6 = new androidx.appcompat.widget.q0
            android.content.Context r8 = r0.f310f
            int r9 = r0.f312h
            int r10 = r0.f313i
            r6.<init>(r8, r7, r9, r10)
            androidx.appcompat.widget.p0 r8 = r0.f320p
            r6.f905F = r8
            r6.f889t = r0
            android.widget.PopupWindow r8 = r6.f873C
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f323s
            r6.f888s = r8
            int r8 = r0.f322r
            r6.f885p = r8
            r6.mo1084s(r5)
            android.widget.PopupWindow r8 = r6.f873C
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.mo1081o(r3)
            r6.mo1083r(r4)
            int r3 = r0.f322r
            r6.f885p = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f317m
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e6
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f317m
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.C0065b.C0070d) r3
            androidx.appcompat.view.menu.e r10 = r3.f339b
            int r11 = r10.size()
            r12 = r8
        L_0x0085:
            if (r12 >= r11) goto L_0x009b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0098
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0085
        L_0x009b:
            r13 = r7
        L_0x009c:
            if (r13 != 0) goto L_0x009f
            goto L_0x00e8
        L_0x009f:
            androidx.appcompat.widget.q0 r10 = r3.f338a
            androidx.appcompat.widget.j0 r10 = r10.f876g
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C0073d) r11
            goto L_0x00bb
        L_0x00b8:
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C0073d) r11
            r12 = r8
        L_0x00bb:
            int r14 = r11.getCount()
            r15 = r8
        L_0x00c0:
            r9 = -1
            if (r15 >= r14) goto L_0x00ce
            androidx.appcompat.view.menu.g r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00c0
        L_0x00ce:
            r15 = r9
        L_0x00cf:
            if (r15 != r9) goto L_0x00d2
            goto L_0x00e7
        L_0x00d2:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e7
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e8
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 == 0) goto L_0x01a9
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0100
            java.lang.reflect.Method r9 = androidx.appcompat.widget.C0198q0.f904G
            if (r9 == 0) goto L_0x0105
            android.widget.PopupWindow r10 = r6.f873C     // Catch:{ Exception -> 0x0105 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0105 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0105 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0105 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0105 }
            goto L_0x0105
        L_0x0100:
            android.widget.PopupWindow r9 = r6.f873C
            r9.setTouchModal(r8)
        L_0x0105:
            android.widget.PopupWindow r9 = r6.f873C
            r10 = 0
            r9.setEnterTransition(r10)
            java.util.List<androidx.appcompat.view.menu.b$d> r9 = r0.f317m
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.C0065b.C0070d) r9
            androidx.appcompat.widget.q0 r9 = r9.f338a
            androidx.appcompat.widget.j0 r9 = r9.f876g
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f324t
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f325u
            if (r12 != r5) goto L_0x013d
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x0142
            goto L_0x0144
        L_0x013d:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0144
        L_0x0142:
            r9 = r5
            goto L_0x0145
        L_0x0144:
            r9 = r8
        L_0x0145:
            if (r9 != r5) goto L_0x0149
            r10 = r5
            goto L_0x014a
        L_0x0149:
            r10 = r8
        L_0x014a:
            r0.f325u = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0158
            r6.f888s = r7
            r9 = r8
            r13 = r9
            goto L_0x0189
        L_0x0158:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.f323s
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f322r
            r13 = r13 & 7
            if (r13 != r12) goto L_0x017f
            r13 = r11[r8]
            android.view.View r14 = r0.f323s
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x017f:
            r13 = r9[r8]
            r14 = r11[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0189:
            int r11 = r0.f322r
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0196
            if (r10 == 0) goto L_0x0191
            goto L_0x019c
        L_0x0191:
            int r4 = r7.getWidth()
            goto L_0x019e
        L_0x0196:
            if (r10 == 0) goto L_0x019e
            int r4 = r7.getWidth()
        L_0x019c:
            int r13 = r13 + r4
            goto L_0x019f
        L_0x019e:
            int r13 = r13 - r4
        L_0x019f:
            r6.f879j = r13
            r6.f884o = r5
            r6.f883n = r5
            r6.mo1080n(r9)
            goto L_0x01c7
        L_0x01a9:
            boolean r4 = r0.f326v
            if (r4 == 0) goto L_0x01b1
            int r4 = r0.f328x
            r6.f879j = r4
        L_0x01b1:
            boolean r4 = r0.f327w
            if (r4 == 0) goto L_0x01ba
            int r4 = r0.f329y
            r6.mo1080n(r4)
        L_0x01ba:
            android.graphics.Rect r4 = r0.f4148e
            if (r4 == 0) goto L_0x01c4
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01c5
        L_0x01c4:
            r10 = 0
        L_0x01c5:
            r6.f871A = r10
        L_0x01c7:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f325u
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f317m
            r5.add(r4)
            r6.mo205f()
            androidx.appcompat.widget.j0 r4 = r6.f876g
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0206
            boolean r3 = r0.f305A
            if (r3 == 0) goto L_0x0206
            java.lang.CharSequence r3 = r1.f368m
            if (r3 == 0) goto L_0x0206
            r3 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f368m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.mo205f()
        L_0x0206:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0065b.mo219v(androidx.appcompat.view.menu.e):void");
    }
}
