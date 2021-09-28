package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p039g.C0934b;

public final class ViewStubCompat extends View {

    /* renamed from: e */
    public int f657e = 0;

    /* renamed from: f */
    public int f658f;

    /* renamed from: g */
    public WeakReference<View> f659g;

    /* renamed from: h */
    public LayoutInflater f660h;

    /* renamed from: i */
    public C0128a f661i;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0128a {
        /* renamed from: a */
        void mo732a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3484z, 0, 0);
        this.f658f = obtainStyledAttributes.getResourceId(2, -1);
        this.f657e = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo720a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f657e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f660h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f657e, viewGroup, false);
            int i = this.f658f;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f659g = new WeakReference<>(inflate);
            C0128a aVar = this.f661i;
            if (aVar != null) {
                aVar.mo732a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f658f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f660h;
    }

    public int getLayoutResource() {
        return this.f657e;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f658f = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f660h = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f657e = i;
    }

    public void setOnInflateListener(C0128a aVar) {
        this.f661i = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f659g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo720a();
        }
    }
}
