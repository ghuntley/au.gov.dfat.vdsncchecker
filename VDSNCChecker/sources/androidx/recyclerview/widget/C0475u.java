package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
public class C0475u extends C0469p {

    /* renamed from: p */
    public final /* synthetic */ C0476v f2217p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0475u(C0476v vVar, Context context) {
        super(context);
        this.f2217p = vVar;
    }

    /* renamed from: b */
    public void mo2224b(View view, RecyclerView.C0419w wVar, RecyclerView.C0416v.C0417a aVar) {
        C0476v vVar = this.f2217p;
        int[] a = vVar.mo2338a(vVar.f2072a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(((double) mo2415f(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (ceil > 0) {
            aVar.mo2227b(i, i2, ceil, this.f2206i);
        }
    }

    /* renamed from: e */
    public float mo2414e(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: f */
    public int mo2415f(int i) {
        return Math.min(100, super.mo2415f(i));
    }
}
