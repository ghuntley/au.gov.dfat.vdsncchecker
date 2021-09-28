package p152z1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: z1.c0 */
public class C2164c0 extends RecyclerView.C0389d<C2165a> {

    /* renamed from: c */
    public final C2170g<?> f6246c;

    /* renamed from: z1.c0$a */
    public static class C2165a extends RecyclerView.C0422z {

        /* renamed from: t */
        public final TextView f6247t;

        public C2165a(TextView textView) {
            super(textView);
            this.f6247t = textView;
        }
    }

    public C2164c0(C2170g<?> gVar) {
        this.f6246c = gVar;
    }

    /* renamed from: a */
    public int mo2129a() {
        return this.f6246c.f6256c0.f6222i;
    }

    /* renamed from: c */
    public void mo2131c(RecyclerView.C0422z zVar, int i) {
        C2165a aVar = (C2165a) zVar;
        int i2 = this.f6246c.f6256c0.f6218e.f6307g + i;
        String string = aVar.f6247t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f6247t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar.f6247t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C2163c cVar = this.f6246c.f6259f0;
        Calendar d = C2160a0.m5573d();
        C2161b bVar = d.get(1) == i2 ? cVar.f6244f : cVar.f6242d;
        for (Long longValue : this.f6246c.f6255b0.mo6710i()) {
            d.setTimeInMillis(longValue.longValue());
            if (d.get(1) == i2) {
                bVar = cVar.f6243e;
            }
        }
        bVar.mo6700b(aVar.f6247t);
        aVar.f6247t.setOnClickListener(new C2162b0(this, i2));
    }

    /* renamed from: d */
    public RecyclerView.C0422z mo2132d(ViewGroup viewGroup, int i) {
        return new C2165a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: e */
    public int mo6702e(int i) {
        return i - this.f6246c.f6256c0.f6218e.f6307g;
    }
}
