package p123u;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import p123u.C1822d;
import p129v.C1961e;

/* renamed from: u.c */
public class C1821c extends C0236a implements C1822d.C1825c {

    /* renamed from: m */
    public boolean f5487m;

    /* renamed from: n */
    public boolean f5488n;

    /* renamed from: o */
    public float f5489o;

    /* renamed from: p */
    public View[] f5490p;

    /* renamed from: a */
    public void mo6159a(C1822d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public void mo6160b(C1822d dVar, int i, int i2, float f) {
    }

    public float getProgress() {
        return this.f5489o;
    }

    /* renamed from: i */
    public void mo1239i(AttributeSet attributeSet) {
        super.mo1239i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1961e.f5790h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f5487m = obtainStyledAttributes.getBoolean(index, this.f5487m);
                } else if (index == 0) {
                    this.f5488n = obtainStyledAttributes.getBoolean(index, this.f5488n);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f5489o = f;
        int i = 0;
        if (this.f1107f > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f1112k;
            if (viewArr == null || viewArr.length != this.f1107f) {
                this.f1112k = new View[this.f1107f];
            }
            for (int i2 = 0; i2 < this.f1107f; i2++) {
                this.f1112k[i2] = constraintLayout.mo1249e(this.f1106e[i2]);
            }
            this.f5490p = this.f1112k;
            while (i < this.f1107f) {
                View view = this.f5490p[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof C1821c;
            i++;
        }
    }
}
