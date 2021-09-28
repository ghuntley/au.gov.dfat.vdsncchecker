package p065k1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p072l2.C1241e;

/* renamed from: k1.i */
public final class C1176i extends RecyclerView.C0399k {

    /* renamed from: a */
    public final /* synthetic */ int f4049a;

    /* renamed from: b */
    public final int f4050b;

    public C1176i(int i, int i2) {
        this.f4049a = i2;
        if (i2 == 1) {
            this.f4050b = i;
        } else if (i2 != 2) {
            this.f4050b = i;
        } else {
            this.f4050b = i;
        }
    }

    /* renamed from: d */
    public void mo2146d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0419w wVar) {
        int i = 0;
        switch (this.f4049a) {
            case 0:
                C1241e.m3517j(rect, "outRect");
                C1241e.m3517j(wVar, "state");
                int J = recyclerView.mo1991J(view);
                RecyclerView.C0389d adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    i = adapter.mo2129a();
                }
                if (J != i - 1) {
                    rect.bottom = this.f4050b;
                    return;
                }
                return;
            case 1:
                C1241e.m3517j(rect, "outRect");
                C1241e.m3517j(wVar, "state");
                int J2 = recyclerView.mo1991J(view);
                RecyclerView.C0389d adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    i = adapter2.mo2129a();
                }
                if (J2 != i - 1) {
                    rect.bottom = this.f4050b;
                    return;
                }
                return;
            default:
                C1241e.m3517j(rect, "outRect");
                C1241e.m3517j(wVar, "state");
                int J3 = recyclerView.mo1991J(view);
                RecyclerView.C0389d adapter3 = recyclerView.getAdapter();
                if (adapter3 != null) {
                    i = adapter3.mo2129a();
                }
                if (J3 != i - 1) {
                    rect.bottom = this.f4050b;
                    return;
                }
                return;
        }
    }
}
