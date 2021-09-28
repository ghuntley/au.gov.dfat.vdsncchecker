package p045h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p039g.C0934b;

/* renamed from: h.a */
public abstract class C0958a {

    /* renamed from: h.a$a */
    public static class C0959a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3535a;

        public C0959a(int i, int i2) {
            super(i, i2);
            this.f3535a = 0;
            this.f3535a = 8388627;
        }

        public C0959a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3535a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3460b);
            this.f3535a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0959a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3535a = 0;
        }

        public C0959a(C0959a aVar) {
            super(aVar);
            this.f3535a = 0;
            this.f3535a = aVar.f3535a;
        }
    }

    /* renamed from: h.a$b */
    public interface C0960b {
        /* renamed from: a */
        void mo4267a(boolean z);
    }

    @Deprecated
    /* renamed from: h.a$c */
    public static abstract class C0961c {
        /* renamed from: a */
        public abstract void mo4268a();
    }

    /* renamed from: a */
    public abstract void mo4264a(boolean z);

    /* renamed from: b */
    public abstract Context mo4265b();

    /* renamed from: c */
    public abstract void mo4266c(boolean z);
}
