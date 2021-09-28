package p152z1;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0469p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z1.y */
public class C2199y extends LinearLayoutManager {

    /* renamed from: z1.y$a */
    public class C2200a extends C0469p {
        public C2200a(C2199y yVar, Context context) {
            super(context);
        }

        /* renamed from: e */
        public float mo2414e(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public C2199y(Context context, int i, boolean z) {
        super(i, z);
    }

    /* renamed from: G0 */
    public void mo1925G0(RecyclerView recyclerView, RecyclerView.C0419w wVar, int i) {
        C2200a aVar = new C2200a(this, recyclerView.getContext());
        aVar.f1955a = i;
        mo2161H0(aVar);
    }
}
