package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.widget.f */
public class C0157f {

    /* renamed from: a */
    public final View f763a;

    /* renamed from: b */
    public final C0176k f764b;

    /* renamed from: c */
    public int f765c = -1;

    /* renamed from: d */
    public C0232z0 f766d;

    /* renamed from: e */
    public C0232z0 f767e;

    /* renamed from: f */
    public C0232z0 f768f;

    public C0157f(View view) {
        this.f763a = view;
        this.f764b = C0176k.m496a();
    }

    /* renamed from: a */
    public void mo883a() {
        Drawable background = this.f763a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f766d != null) {
                if (this.f768f == null) {
                    this.f768f = new C0232z0();
                }
                C0232z0 z0Var = this.f768f;
                z0Var.f1004a = null;
                z0Var.f1007d = false;
                z0Var.f1005b = null;
                z0Var.f1006c = false;
                View view = this.f763a;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    z0Var.f1007d = true;
                    z0Var.f1004a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f763a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    z0Var.f1006c = true;
                    z0Var.f1005b = backgroundTintMode;
                }
                if (z0Var.f1007d || z0Var.f1006c) {
                    C0176k.m499f(background, z0Var, this.f763a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0232z0 z0Var2 = this.f767e;
            if (z0Var2 != null) {
                C0176k.m499f(background, z0Var2, this.f763a.getDrawableState());
                return;
            }
            C0232z0 z0Var3 = this.f766d;
            if (z0Var3 != null) {
                C0176k.m499f(background, z0Var3, this.f763a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList mo884b() {
        C0232z0 z0Var = this.f767e;
        if (z0Var != null) {
            return z0Var.f1004a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo885c() {
        C0232z0 z0Var = this.f767e;
        if (z0Var != null) {
            return z0Var.f1005b;
        }
        return null;
    }

    /* renamed from: d */
    public void mo886d(AttributeSet attributeSet, int i) {
        Context context = this.f763a.getContext();
        int[] iArr = C0934b.f3483y;
        C0136b1 q = C0136b1.m361q(context, attributeSet, iArr, i, 0);
        View view = this.f763a;
        C1061o.m3033n(view, view.getContext(), iArr, attributeSet, q.f692b, i, 0);
        try {
            if (q.mo775o(0)) {
                this.f765c = q.mo772l(0, -1);
                ColorStateList d = this.f764b.mo979d(this.f763a.getContext(), this.f765c);
                if (d != null) {
                    mo889g(d);
                }
            }
            if (q.mo775o(1)) {
                this.f763a.setBackgroundTintList(q.mo763c(1));
            }
            if (q.mo775o(2)) {
                this.f763a.setBackgroundTintMode(C0169i0.m488b(q.mo770j(2, -1), (PorterDuff.Mode) null));
            }
            q.f692b.recycle();
        } catch (Throwable th) {
            q.f692b.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    public void mo887e() {
        this.f765c = -1;
        mo889g((ColorStateList) null);
        mo883a();
    }

    /* renamed from: f */
    public void mo888f(int i) {
        this.f765c = i;
        C0176k kVar = this.f764b;
        mo889g(kVar != null ? kVar.mo979d(this.f763a.getContext(), i) : null);
        mo883a();
    }

    /* renamed from: g */
    public void mo889g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f766d == null) {
                this.f766d = new C0232z0();
            }
            C0232z0 z0Var = this.f766d;
            z0Var.f1004a = colorStateList;
            z0Var.f1007d = true;
        } else {
            this.f766d = null;
        }
        mo883a();
    }

    /* renamed from: h */
    public void mo890h(ColorStateList colorStateList) {
        if (this.f767e == null) {
            this.f767e = new C0232z0();
        }
        C0232z0 z0Var = this.f767e;
        z0Var.f1004a = colorStateList;
        z0Var.f1007d = true;
        mo883a();
    }

    /* renamed from: i */
    public void mo891i(PorterDuff.Mode mode) {
        if (this.f767e == null) {
            this.f767e = new C0232z0();
        }
        C0232z0 z0Var = this.f767e;
        z0Var.f1005b = mode;
        z0Var.f1006c = true;
        mo883a();
    }
}
