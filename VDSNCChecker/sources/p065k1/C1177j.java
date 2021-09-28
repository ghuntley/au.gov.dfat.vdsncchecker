package p065k1;

import android.view.View;
import android.widget.TextView;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.p008ui.DetailFragment;
import p007au.gov.dfat.vdsncchecker.p008ui.SummaryFragment;
import p072l2.C1241e;
import p118t0.C1777k;

/* renamed from: k1.j */
public final /* synthetic */ class C1177j implements C1777k {

    /* renamed from: a */
    public final /* synthetic */ int f4051a = 0;

    /* renamed from: b */
    public final /* synthetic */ View f4052b;

    /* renamed from: c */
    public final /* synthetic */ Object f4053c;

    public /* synthetic */ C1177j(View view, DetailFragment detailFragment) {
        this.f4052b = view;
        this.f4053c = detailFragment;
    }

    public /* synthetic */ C1177j(View view, SummaryFragment summaryFragment) {
        this.f4052b = view;
        this.f4053c = summaryFragment;
    }

    /* renamed from: b */
    public final void mo4788b(Object obj) {
        int i = 8;
        switch (this.f4051a) {
            case 0:
                View view = this.f4052b;
                DetailFragment detailFragment = (DetailFragment) this.f4053c;
                Boolean bool = (Boolean) obj;
                int i2 = DetailFragment.f2240f0;
                C1241e.m3517j(detailFragment, "this$0");
                TextView textView = (TextView) view.findViewById(R.id.warningBanner);
                C1241e.m3516f(bool, "it");
                textView.setVisibility(bool.booleanValue() ? 0 : 8);
                View findViewById = view.findViewById(R.id.bannerDivider);
                if (bool.booleanValue()) {
                    TextView textView2 = detailFragment.f2243e0;
                    if (textView2 == null) {
                        C1241e.m3524r("specimenBanner");
                        throw null;
                    } else if (textView2.getVisibility() == 0) {
                        i = 0;
                    }
                }
                findViewById.setVisibility(i);
                return;
            default:
                View view2 = this.f4052b;
                SummaryFragment summaryFragment = (SummaryFragment) this.f4053c;
                Boolean bool2 = (Boolean) obj;
                int i3 = SummaryFragment.f2262f0;
                C1241e.m3517j(summaryFragment, "this$0");
                TextView textView3 = (TextView) view2.findViewById(R.id.warningBanner);
                C1241e.m3516f(bool2, "it");
                textView3.setVisibility(bool2.booleanValue() ? 0 : 8);
                View findViewById2 = view2.findViewById(R.id.bannerDivider);
                if (bool2.booleanValue()) {
                    TextView textView4 = summaryFragment.f2265e0;
                    if (textView4 == null) {
                        C1241e.m3524r("specimenBanner");
                        throw null;
                    } else if (textView4.getVisibility() == 0) {
                        i = 0;
                    }
                }
                findViewById2.setVisibility(i);
                return;
        }
    }
}
