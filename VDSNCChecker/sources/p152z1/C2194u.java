package p152z1;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import p152z1.C2170g;

/* renamed from: z1.u */
public class C2194u implements AdapterView.OnItemClickListener {

    /* renamed from: e */
    public final /* synthetic */ MaterialCalendarGridView f6318e;

    /* renamed from: f */
    public final /* synthetic */ C2195v f6319f;

    public C2194u(C2195v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6319f = vVar;
        this.f6318e = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2193t a = this.f6318e.getAdapter();
        if (i >= a.mo6751b() && i <= a.mo6753d()) {
            C2170g.C2175e eVar = this.f6319f.f6323f;
            long longValue = this.f6318e.getAdapter().getItem(i).longValue();
            C2170g.C2174d dVar = (C2170g.C2174d) eVar;
            if (C2170g.this.f6256c0.f6220g.mo6699f(longValue)) {
                C2170g.this.f6255b0.mo6709h(longValue);
                Iterator it = C2170g.this.f6327Z.iterator();
                while (it.hasNext()) {
                    ((C2197w) it.next()).mo6735a(C2170g.this.f6255b0.mo6703a());
                }
                C2170g.this.f6261h0.getAdapter().f1903a.mo2134b();
                RecyclerView recyclerView = C2170g.this.f6260g0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1903a.mo2134b();
                }
            }
        }
    }
}
