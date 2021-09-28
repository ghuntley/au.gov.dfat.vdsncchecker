package p152z1;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p052i0.C1023b;

/* renamed from: z1.h */
public class C2176h extends RecyclerView.C0399k {

    /* renamed from: a */
    public final /* synthetic */ C2170g f6269a;

    public C2176h(C2170g gVar) {
        this.f6269a = gVar;
        C2160a0.m5574e();
        C2160a0.m5574e();
    }

    /* renamed from: e */
    public void mo2147e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0419w wVar) {
        if ((recyclerView.getAdapter() instanceof C2164c0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C2164c0 c0Var = (C2164c0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C1023b<Long, Long> requireNonNull : this.f6269a.f6255b0.mo6707e()) {
                Objects.requireNonNull(requireNonNull);
            }
        }
    }
}
