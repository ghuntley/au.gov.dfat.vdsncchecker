package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C0439c;

/* renamed from: androidx.recyclerview.widget.w */
public class C0477w implements C0439c.C0441b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2220a;

    public C0477w(RecyclerView recyclerView) {
        this.f2220a = recyclerView;
    }

    /* renamed from: a */
    public View mo2435a(int i) {
        return this.f2220a.getChildAt(i);
    }

    /* renamed from: b */
    public int mo2436b() {
        return this.f2220a.getChildCount();
    }

    /* renamed from: c */
    public void mo2437c(int i) {
        View childAt = this.f2220a.getChildAt(i);
        if (childAt != null) {
            this.f2220a.mo2083p(childAt);
            childAt.clearAnimation();
        }
        this.f2220a.removeViewAt(i);
    }
}
