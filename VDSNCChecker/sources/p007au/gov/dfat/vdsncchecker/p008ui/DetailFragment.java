package p007au.gov.dfat.vdsncchecker.p008ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0286k;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.vds.VdsParcel;
import p019c3.C0625a;
import p025d3.C0802f;
import p025d3.C0806j;
import p025d3.C0810n;
import p065k1.C1169c;
import p065k1.C1173g;
import p065k1.C1176i;
import p065k1.C1177j;
import p065k1.C1178k;
import p071l1.C1234a;
import p072l2.C1241e;
import p077m1.C1427b;
import p106r0.C1669v;
import p106r0.C1670w;
import p118t0.C1776j;
import p118t0.C1781o;
import p118t0.C1784r;
import p120t2.C1790d;
import p136w0.C2036r;
import p155j$.time.LocalDate;
import p155j$.time.format.DateTimeFormatter;

/* renamed from: au.gov.dfat.vdsncchecker.ui.DetailFragment */
public final class DetailFragment extends C1173g {

    /* renamed from: f0 */
    public static final /* synthetic */ int f2240f0 = 0;

    /* renamed from: c0 */
    public final C1790d f2241c0 = C1670w.m4648a(this, C0810n.m2403a(C1169c.class), new C0489b(this), C0488a.f2244f);

    /* renamed from: d0 */
    public VdsParcel f2242d0;

    /* renamed from: e0 */
    public TextView f2243e0;

    /* renamed from: au.gov.dfat.vdsncchecker.ui.DetailFragment$a */
    public static final class C0488a extends C0806j implements C0625a<C1781o> {

        /* renamed from: f */
        public static final C0488a f2244f = new C0488a();

        public C0488a() {
            super(0);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1234a.m3507a();
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.DetailFragment$b */
    public static final class C0489b extends C0806j implements C0625a<C1784r> {

        /* renamed from: f */
        public final /* synthetic */ C0286k f2245f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0489b(C0286k kVar) {
            super(0);
            this.f2245f = kVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1784r j = this.f2245f.mo1609a0().mo116j();
            C1241e.m3516f(j, "requireActivity().viewModelStore");
            return j;
        }
    }

    public DetailFragment() {
        super(false, false, false, 1, (C0802f) null);
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        Bundle bundle2 = this.f1461j;
        if (bundle2 != null) {
            VdsParcel vdsParcel = (VdsParcel) bundle2.getParcelable("vds");
            C1241e.m3515e(vdsParcel);
            this.f2242d0 = vdsParcel;
            return;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C1241e.m3517j(layoutInflater, "inflater");
        super.mo1591J(layoutInflater, viewGroup, bundle);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_detail, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.specimenBanner);
        C1241e.m3516f(findViewById, "view.findViewById<TextView>(R.id.specimenBanner)");
        this.f2243e0 = (TextView) findViewById;
        VdsParcel vdsParcel = this.f2242d0;
        if (vdsParcel != null) {
            ((TextView) inflate.findViewById(R.id.name)).setText(vdsParcel.getMsg().getPid().getN());
            TextView textView = (TextView) inflate.findViewById(R.id.dob);
            LocalDate dob = vdsParcel.getMsg().getPid().getDob();
            if (dob == null || (str = dob.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))) == null) {
                str = "";
            }
            textView.setText(str);
            ((TextView) inflate.findViewById(R.id.sex)).setText(vdsParcel.getMsg().getPid().getSex());
            ((TextView) inflate.findViewById(R.id.passportNo)).setText(vdsParcel.getMsg().getPid().getI());
            ((TextView) inflate.findViewById(R.id.uvci)).setText(vdsParcel.getMsg().getUvci());
            ((TextView) inflate.findViewById(R.id.issuedBy)).setText(vdsParcel.getHdr().getHdrIs());
            ((TextView) inflate.findViewById(R.id.version)).setText(String.valueOf(vdsParcel.getHdr().getV()));
            TextView textView2 = this.f2243e0;
            if (textView2 != null) {
                if (C2036r.m5370h(vdsParcel.getMsg().getUvci()) != C1427b.SPECIMEN) {
                    i = 8;
                }
                textView2.setVisibility(i);
                C1776j<Boolean> jVar = ((C1169c) this.f2241c0.getValue()).f4032f;
                C1669v vVar = this.f1450S;
                if (vVar != null) {
                    jVar.mo1780d(vVar, new C1177j(inflate, this));
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.events);
                    recyclerView.setLayoutManager(new DetailFragment$onCreateView$3$1(recyclerView.getContext()));
                    recyclerView.mo2032g(new C1176i(C2036r.m5369g(12), 1));
                    Context context = recyclerView.getContext();
                    C1241e.m3516f(context, "context");
                    VdsParcel vdsParcel2 = this.f2242d0;
                    if (vdsParcel2 != null) {
                        recyclerView.setAdapter(new C1178k(context, vdsParcel2.getMsg().getVe()));
                        return inflate;
                    }
                    C1241e.m3524r("vds");
                    throw null;
                }
                throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
            }
            C1241e.m3524r("specimenBanner");
            throw null;
        }
        C1241e.m3524r("vds");
        throw null;
    }

    /* renamed from: O */
    public boolean mo1596O(MenuItem menuItem) {
        C1241e.m3517j(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        NavController m0 = NavHostFragment.m1076m0(this);
        C1241e.m3514d(m0, "NavHostFragment.findNavController(this)");
        m0.mo1856e();
        return true;
    }
}
