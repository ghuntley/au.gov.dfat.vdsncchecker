package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
public class C0481z {
    /* renamed from: a */
    public static int m1697a(RecyclerView.C0419w wVar, C0474t tVar, View view, View view2, RecyclerView.C0400l lVar, boolean z) {
        if (lVar.mo2189x() == 0 || wVar.mo2229b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(lVar.mo2170Q(view) - lVar.mo2170Q(view2)) + 1;
        }
        return Math.min(tVar.mo2426l(), tVar.mo2416b(view2) - tVar.mo2419e(view));
    }

    /* renamed from: b */
    public static int m1698b(RecyclerView.C0419w wVar, C0474t tVar, View view, View view2, RecyclerView.C0400l lVar, boolean z, boolean z2) {
        if (lVar.mo2189x() == 0 || wVar.mo2229b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (wVar.mo2229b() - Math.max(lVar.mo2170Q(view), lVar.mo2170Q(view2))) - 1) : Math.max(0, Math.min(lVar.mo2170Q(view), lVar.mo2170Q(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.mo2416b(view2) - tVar.mo2419e(view))) / ((float) (Math.abs(lVar.mo2170Q(view) - lVar.mo2170Q(view2)) + 1)))) + ((float) (tVar.mo2425k() - tVar.mo2419e(view))));
    }

    /* renamed from: c */
    public static int m1699c(RecyclerView.C0419w wVar, C0474t tVar, View view, View view2, RecyclerView.C0400l lVar, boolean z) {
        if (lVar.mo2189x() == 0 || wVar.mo2229b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wVar.mo2229b();
        }
        return (int) ((((float) (tVar.mo2416b(view2) - tVar.mo2419e(view))) / ((float) (Math.abs(lVar.mo2170Q(view) - lVar.mo2170Q(view2)) + 1))) * ((float) wVar.mo2229b()));
    }
}
