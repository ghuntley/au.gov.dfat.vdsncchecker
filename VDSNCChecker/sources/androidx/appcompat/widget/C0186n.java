package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p039g.C0934b;
import p051i.C1021a;
import p058j0.C1061o;

/* renamed from: androidx.appcompat.widget.n */
public class C0186n {

    /* renamed from: a */
    public final ImageView f864a;

    /* renamed from: b */
    public C0232z0 f865b;

    public C0186n(ImageView imageView) {
        this.f864a = imageView;
    }

    /* renamed from: a */
    public void mo1052a() {
        C0232z0 z0Var;
        Drawable drawable = this.f864a.getDrawable();
        if (drawable != null) {
            int[] iArr = C0169i0.f799a;
        }
        if (drawable != null && (z0Var = this.f865b) != null) {
            C0176k.m499f(drawable, z0Var, this.f864a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo1053b(AttributeSet attributeSet, int i) {
        int l;
        Context context = this.f864a.getContext();
        int[] iArr = C0934b.f3464f;
        C0136b1 q = C0136b1.m361q(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f864a;
        C1061o.m3033n(imageView, imageView.getContext(), iArr, attributeSet, q.f692b, i, 0);
        try {
            Drawable drawable = this.f864a.getDrawable();
            if (!(drawable != null || (l = q.mo772l(1, -1)) == -1 || (drawable = C1021a.m2945a(this.f864a.getContext(), l)) == null)) {
                this.f864a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = C0169i0.f799a;
            }
            if (q.mo775o(2)) {
                this.f864a.setImageTintList(q.mo763c(2));
            }
            if (q.mo775o(3)) {
                this.f864a.setImageTintMode(C0169i0.m488b(q.mo770j(3, -1), (PorterDuff.Mode) null));
            }
            q.f692b.recycle();
        } catch (Throwable th) {
            q.f692b.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public void mo1054c(int i) {
        if (i != 0) {
            Drawable a = C1021a.m2945a(this.f864a.getContext(), i);
            if (a != null) {
                int[] iArr = C0169i0.f799a;
            }
            this.f864a.setImageDrawable(a);
        } else {
            this.f864a.setImageDrawable((Drawable) null);
        }
        mo1052a();
    }

    /* renamed from: d */
    public void mo1055d(ColorStateList colorStateList) {
        if (this.f865b == null) {
            this.f865b = new C0232z0();
        }
        C0232z0 z0Var = this.f865b;
        z0Var.f1004a = colorStateList;
        z0Var.f1007d = true;
        mo1052a();
    }

    /* renamed from: e */
    public void mo1056e(PorterDuff.Mode mode) {
        if (this.f865b == null) {
            this.f865b = new C0232z0();
        }
        C0232z0 z0Var = this.f865b;
        z0Var.f1005b = mode;
        z0Var.f1006c = true;
        mo1052a();
    }
}
