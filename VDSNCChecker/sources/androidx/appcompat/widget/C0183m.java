package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: androidx.appcompat.widget.m */
public class C0183m extends ImageButton {

    /* renamed from: e */
    public final C0157f f847e;

    /* renamed from: f */
    public final C0186n f848f;

    public C0183m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0183m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0157f fVar = new C0157f(this);
        this.f847e = fVar;
        fVar.mo886d(attributeSet, i);
        C0186n nVar = new C0186n(this);
        this.f848f = nVar;
        nVar.mo1053b(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f847e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1052a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f847e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f847e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0232z0 z0Var;
        C0186n nVar = this.f848f;
        if (nVar == null || (z0Var = nVar.f865b) == null) {
            return null;
        }
        return z0Var.f1004a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0232z0 z0Var;
        C0186n nVar = this.f848f;
        if (nVar == null || (z0Var = nVar.f865b) == null) {
            return null;
        }
        return z0Var.f1005b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f848f.f864a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f847e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f847e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1052a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1052a();
        }
    }

    public void setImageResource(int i) {
        this.f848f.mo1054c(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1052a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f847e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f847e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1055d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0186n nVar = this.f848f;
        if (nVar != null) {
            nVar.mo1056e(mode);
        }
    }
}
