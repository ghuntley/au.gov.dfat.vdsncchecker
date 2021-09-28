package p065k1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.vds.VdsVdParcel;
import p072l2.C1241e;
import p155j$.time.format.DateTimeFormatter;

/* renamed from: k1.h */
public final class C1174h extends RecyclerView.C0389d<C1175a> {

    /* renamed from: c */
    public final List<VdsVdParcel> f4042c;

    /* renamed from: k1.h$a */
    public final class C1175a extends RecyclerView.C0422z {

        /* renamed from: t */
        public final View f4043t;

        /* renamed from: u */
        public final TextView f4044u;

        /* renamed from: v */
        public final TextView f4045v;

        /* renamed from: w */
        public final TextView f4046w;

        /* renamed from: x */
        public final TextView f4047x;

        /* renamed from: y */
        public final TextView f4048y;

        public C1175a(C1174h hVar, View view) {
            super(view);
            this.f4043t = view;
            View findViewById = view.findViewById(R.id.doseNo);
            C1241e.m3516f(findViewById, "view.findViewById(R.id.doseNo)");
            this.f4044u = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.country);
            C1241e.m3516f(findViewById2, "view.findViewById(R.id.country)");
            this.f4045v = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.date);
            C1241e.m3516f(findViewById3, "view.findViewById(R.id.date)");
            this.f4046w = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.adminCentre);
            C1241e.m3516f(findViewById4, "view.findViewById(R.id.adminCentre)");
            this.f4047x = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.batchNo);
            C1241e.m3516f(findViewById5, "view.findViewById(R.id.batchNo)");
            this.f4048y = (TextView) findViewById5;
        }
    }

    public C1174h(List<VdsVdParcel> list) {
        C1241e.m3517j(list, "items");
        this.f4042c = list;
    }

    /* renamed from: a */
    public int mo2129a() {
        return this.f4042c.size();
    }

    /* renamed from: c */
    public void mo2131c(RecyclerView.C0422z zVar, int i) {
        C1175a aVar = (C1175a) zVar;
        C1241e.m3517j(aVar, "holder");
        VdsVdParcel vdsVdParcel = this.f4042c.get(i);
        aVar.f4044u.setText(String.valueOf(vdsVdParcel.getSeq()));
        aVar.f4045v.setText(vdsVdParcel.getCtr());
        aVar.f4046w.setText(vdsVdParcel.getDvc().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        aVar.f4047x.setText(vdsVdParcel.getAdm());
        aVar.f4048y.setText(vdsVdParcel.getLot());
        aVar.f4043t.setBackgroundResource(i == mo2129a() + -1 ? R.drawable.detail_content_last_panel : R.drawable.detail_content_panel);
    }

    /* renamed from: d */
    public RecyclerView.C0422z mo2132d(ViewGroup viewGroup, int i) {
        C1241e.m3517j(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_content_item, viewGroup, false);
        C1241e.m3516f(inflate, "view");
        return new C1175a(this, inflate);
    }
}
