package p065k1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.p008ui.C0490xc3e224bb;
import p007au.gov.dfat.vdsncchecker.vds.VdsVeParcel;
import p072l2.C1241e;
import p136w0.C2036r;

/* renamed from: k1.k */
public final class C1178k extends RecyclerView.C0389d<C1179a> {

    /* renamed from: c */
    public final Context f4054c;

    /* renamed from: d */
    public final List<VdsVeParcel> f4055d;

    /* renamed from: k1.k$a */
    public final class C1179a extends RecyclerView.C0422z {

        /* renamed from: t */
        public final TextView f4056t;

        /* renamed from: u */
        public final TextView f4057u;

        /* renamed from: v */
        public final TextView f4058v;

        /* renamed from: w */
        public final RecyclerView f4059w;

        public C1179a(C1178k kVar, View view) {
            super(view);
            View findViewById = view.findViewById(R.id.brand);
            C1241e.m3516f(findViewById, "view.findViewById(R.id.brand)");
            this.f4056t = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.vaccineCode);
            C1241e.m3516f(findViewById2, "view.findViewById(R.id.vaccineCode)");
            this.f4057u = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.agent);
            C1241e.m3516f(findViewById3, "view.findViewById(R.id.agent)");
            this.f4058v = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.details);
            C1241e.m3516f(findViewById4, "view.findViewById(R.id.details)");
            this.f4059w = (RecyclerView) findViewById4;
        }
    }

    public C1178k(Context context, List<VdsVeParcel> list) {
        C1241e.m3517j(list, "items");
        this.f4054c = context;
        this.f4055d = list;
    }

    /* renamed from: a */
    public int mo2129a() {
        return this.f4055d.size();
    }

    /* renamed from: c */
    public void mo2131c(RecyclerView.C0422z zVar, int i) {
        C1179a aVar = (C1179a) zVar;
        C1241e.m3517j(aVar, "holder");
        VdsVeParcel vdsVeParcel = this.f4055d.get(i);
        aVar.f4056t.setText(vdsVeParcel.getNam());
        aVar.f4057u.setText(this.f4054c.getResources().getString(R.string.vaccineCodeValue, new Object[]{vdsVeParcel.getDes()}));
        aVar.f4058v.setText(this.f4054c.getResources().getString(R.string.agentValue, new Object[]{vdsVeParcel.getDis()}));
        C0490xc3e224bb detailHeadingRecyclerViewAdapter$onBindViewHolder$detailsLayoutManager$1 = new C0490xc3e224bb(aVar.f4059w.getContext());
        detailHeadingRecyclerViewAdapter$onBindViewHolder$detailsLayoutManager$1.f1792C = vdsVeParcel.getVd().size();
        RecyclerView recyclerView = aVar.f4059w;
        recyclerView.setLayoutManager(detailHeadingRecyclerViewAdapter$onBindViewHolder$detailsLayoutManager$1);
        recyclerView.mo2032g(new C1176i(C2036r.m5369g(1), 0));
        recyclerView.setAdapter(new C1174h(vdsVeParcel.getVd()));
        recyclerView.setRecycledViewPool(new RecyclerView.C0409q());
    }

    /* renamed from: d */
    public RecyclerView.C0422z mo2132d(ViewGroup viewGroup, int i) {
        C1241e.m3517j(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_heading_item, viewGroup, false);
        C1241e.m3516f(inflate, "view");
        return new C1179a(this, inflate);
    }
}
