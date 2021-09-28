package p065k1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p007au.gov.dfat.vdsncchecker.R;
import p072l2.C1241e;
import p155j$.time.format.DateTimeFormatter;

/* renamed from: k1.v */
public final class C1190v extends RecyclerView.C0389d<C1191a> {

    /* renamed from: c */
    public final Context f4077c;

    /* renamed from: d */
    public final List<C1188t> f4078d;

    /* renamed from: k1.v$a */
    public final class C1191a extends RecyclerView.C0422z {

        /* renamed from: t */
        public final TextView f4079t;

        /* renamed from: u */
        public final TextView f4080u;

        /* renamed from: v */
        public final TextView f4081v;

        public C1191a(C1190v vVar, View view) {
            super(view);
            View findViewById = view.findViewById(R.id.name);
            C1241e.m3516f(findViewById, "view.findViewById(R.id.name)");
            this.f4079t = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.date);
            C1241e.m3516f(findViewById2, "view.findViewById(R.id.date)");
            this.f4080u = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.batchNo);
            C1241e.m3516f(findViewById3, "view.findViewById(R.id.batchNo)");
            this.f4081v = (TextView) findViewById3;
        }
    }

    public C1190v(Context context, List<C1188t> list) {
        this.f4077c = context;
        this.f4078d = list;
    }

    /* renamed from: a */
    public int mo2129a() {
        return this.f4078d.size();
    }

    /* renamed from: c */
    public void mo2131c(RecyclerView.C0422z zVar, int i) {
        C1191a aVar = (C1191a) zVar;
        C1241e.m3517j(aVar, "holder");
        C1188t tVar = this.f4078d.get(i);
        aVar.f4079t.setText(tVar.f4074a);
        aVar.f4080u.setText(tVar.f4075b.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        TextView textView = aVar.f4081v;
        String str = tVar.f4076c;
        if (str == null) {
            str = this.f4077c.getResources().getString(R.string.batchNoNotRecorded);
        }
        textView.setText(str);
    }

    /* renamed from: d */
    public RecyclerView.C0422z mo2132d(ViewGroup viewGroup, int i) {
        C1241e.m3517j(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.summary_item, viewGroup, false);
        C1241e.m3516f(inflate, "view");
        return new C1191a(this, inflate);
    }
}
