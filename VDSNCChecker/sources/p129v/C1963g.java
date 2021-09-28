package p129v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0236a;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g */
public abstract class C1963g extends C0236a {

    /* renamed from: m */
    public boolean f5795m;

    /* renamed from: n */
    public boolean f5796n;

    /* renamed from: g */
    public void mo1295g(ConstraintLayout constraintLayout) {
        mo1294f(constraintLayout);
    }

    /* renamed from: i */
    public void mo1239i(AttributeSet attributeSet) {
        super.mo1239i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1961e.f5784b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f5795m = true;
                } else if (index == 22) {
                    this.f5796n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5795m || this.f5796n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f1107f; i++) {
                    View e = constraintLayout.mo1249e(this.f1106e[i]);
                    if (e != null) {
                        if (this.f5795m) {
                            e.setVisibility(visibility);
                        }
                        if (this.f5796n && elevation > 0.0f) {
                            e.setTranslationZ(e.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo1294f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo1294f((ConstraintLayout) parent);
        }
    }
}
