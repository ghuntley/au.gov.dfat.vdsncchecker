package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0082i;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;
import p069l.C1222d;

/* renamed from: androidx.appcompat.view.menu.h */
public class C0080h {

    /* renamed from: a */
    public final Context f414a;

    /* renamed from: b */
    public final C0074e f415b;

    /* renamed from: c */
    public final boolean f416c;

    /* renamed from: d */
    public final int f417d;

    /* renamed from: e */
    public final int f418e;

    /* renamed from: f */
    public View f419f;

    /* renamed from: g */
    public int f420g = 8388611;

    /* renamed from: h */
    public boolean f421h;

    /* renamed from: i */
    public C0082i.C0083a f422i;

    /* renamed from: j */
    public C1222d f423j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f424k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f425l = new C0081a();

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class C0081a implements PopupWindow.OnDismissListener {
        public C0081a() {
        }

        public void onDismiss() {
            C0080h.this.mo370c();
        }
    }

    public C0080h(Context context, C0074e eVar, View view, boolean z, int i, int i2) {
        this.f414a = context;
        this.f415b = eVar;
        this.f419f = view;
        this.f416c = z;
        this.f417d = i;
        this.f418e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.i, l.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p069l.C1222d mo368a() {
        /*
            r14 = this;
            l.d r0 = r14.f423j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f414a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f414a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f414a
            android.view.View r3 = r14.f419f
            int r4 = r14.f417d
            int r5 = r14.f418e
            boolean r6 = r14.f416c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f414a
            androidx.appcompat.view.menu.e r9 = r14.f415b
            android.view.View r10 = r14.f419f
            int r11 = r14.f417d
            int r12 = r14.f418e
            boolean r13 = r14.f416c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.e r1 = r14.f415b
            r0.mo209l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f425l
            r0.mo216r(r1)
            android.view.View r1 = r14.f419f
            r0.mo210n(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f422i
            r0.mo200h(r1)
            boolean r1 = r14.f421h
            r0.mo211o(r1)
            int r1 = r14.f420g
            r0.mo214p(r1)
            r14.f423j = r0
        L_0x0079:
            l.d r0 = r14.f423j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0080h.mo368a():l.d");
    }

    /* renamed from: b */
    public boolean mo369b() {
        C1222d dVar = this.f423j;
        return dVar != null && dVar.mo202b();
    }

    /* renamed from: c */
    public void mo370c() {
        this.f423j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f424k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public void mo371d(C0082i.C0083a aVar) {
        this.f422i = aVar;
        C1222d dVar = this.f423j;
        if (dVar != null) {
            dVar.mo200h(aVar);
        }
    }

    /* renamed from: e */
    public final void mo372e(int i, int i2, boolean z, boolean z2) {
        C1222d a = mo368a();
        a.mo217s(z2);
        if (z) {
            int i3 = this.f420g;
            View view = this.f419f;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f419f.getWidth();
            }
            a.mo215q(i);
            a.mo218t(i2);
            int i4 = (int) ((this.f414a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f4148e = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.mo205f();
    }

    /* renamed from: f */
    public boolean mo373f() {
        if (mo369b()) {
            return true;
        }
        if (this.f419f == null) {
            return false;
        }
        mo372e(0, 0, false, false);
        return true;
    }
}
