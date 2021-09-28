package p007au.gov.dfat.vdsncchecker.p008ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0286k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p000a.C0001b;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.vds.VdsParcel;
import p007au.gov.dfat.vdsncchecker.vds.VdsVdParcel;
import p007au.gov.dfat.vdsncchecker.vds.VdsVeParcel;
import p019c3.C0625a;
import p025d3.C0802f;
import p025d3.C0806j;
import p025d3.C0810n;
import p065k1.C1169c;
import p065k1.C1173g;
import p065k1.C1176i;
import p065k1.C1177j;
import p065k1.C1180l;
import p065k1.C1187s;
import p065k1.C1188t;
import p065k1.C1189u;
import p065k1.C1190v;
import p071l1.C1234a;
import p072l2.C1241e;
import p077m1.C1427b;
import p106r0.C1647i;
import p106r0.C1669v;
import p106r0.C1670w;
import p118t0.C1776j;
import p118t0.C1781o;
import p118t0.C1784r;
import p120t2.C1790d;
import p126u2.C1845f;
import p126u2.C1850k;
import p136w0.C2001d;
import p136w0.C2036r;
import p155j$.time.LocalDate;
import p155j$.time.format.DateTimeFormatter;

/* renamed from: au.gov.dfat.vdsncchecker.ui.SummaryFragment */
public final class SummaryFragment extends C1173g {

    /* renamed from: f0 */
    public static final /* synthetic */ int f2262f0 = 0;

    /* renamed from: c0 */
    public final C1790d f2263c0 = C1670w.m4648a(this, C0810n.m2403a(C1169c.class), new C0495b(this), C0494a.f2266f);

    /* renamed from: d0 */
    public final C2001d f2264d0 = new C2001d(C0810n.m2403a(C1187s.class), new C0496c(this));

    /* renamed from: e0 */
    public TextView f2265e0;

    /* renamed from: au.gov.dfat.vdsncchecker.ui.SummaryFragment$a */
    public static final class C0494a extends C0806j implements C0625a<C1781o> {

        /* renamed from: f */
        public static final C0494a f2266f = new C0494a();

        public C0494a() {
            super(0);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1234a.m3507a();
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.SummaryFragment$b */
    public static final class C0495b extends C0806j implements C0625a<C1784r> {

        /* renamed from: f */
        public final /* synthetic */ C0286k f2267f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0495b(C0286k kVar) {
            super(0);
            this.f2267f = kVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1784r j = this.f2267f.mo1609a0().mo116j();
            C1241e.m3516f(j, "requireActivity().viewModelStore");
            return j;
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.SummaryFragment$c */
    public static final class C0496c extends C0806j implements C0625a<Bundle> {

        /* renamed from: f */
        public final /* synthetic */ C0286k f2268f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0496c(C0286k kVar) {
            super(0);
            this.f2268f = kVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            Bundle bundle = this.f2268f.f1461j;
            if (bundle != null) {
                return bundle;
            }
            StringBuilder a = C0001b.m0a("Fragment ");
            a.append(this.f2268f);
            a.append(" has null arguments");
            throw new IllegalStateException(a.toString());
        }
    }

    public SummaryFragment() {
        super(false, false, false, 7, (C0802f) null);
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        List list;
        C1241e.m3517j(layoutInflater, "inflater");
        super.mo1591J(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_summary, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.specimenBanner);
        C1241e.m3516f(findViewById, "view.findViewById(R.id.specimenBanner)");
        this.f2265e0 = (TextView) findViewById;
        VdsParcel vdsParcel = mo2478m0().f4073a;
        ((TextView) inflate.findViewById(R.id.name)).setText(vdsParcel.getMsg().getPid().getN());
        TextView textView = (TextView) inflate.findViewById(R.id.dob);
        LocalDate dob = vdsParcel.getMsg().getPid().getDob();
        if (dob == null || (str = dob.format(DateTimeFormatter.ofPattern("dd MMM yyyy"))) == null) {
            str = "";
        }
        textView.setText(str);
        ((TextView) inflate.findViewById(R.id.sex)).setText(vdsParcel.getMsg().getPid().getSex());
        ((TextView) inflate.findViewById(R.id.passportNo)).setText(vdsParcel.getMsg().getPid().getI());
        ((TextView) inflate.findViewById(R.id.uvci)).setText(mo1644w().getString(R.string.uvci, new Object[]{vdsParcel.getMsg().getUvci()}));
        TextView textView2 = (TextView) inflate.findViewById(R.id.issuedBy);
        Resources w = mo1644w();
        Object[] objArr = new Object[1];
        objArr[0] = C1241e.m3513b(vdsParcel.getHdr().getHdrIs(), "AUS") ? mo1644w().getString(R.string.country_australia) : vdsParcel.getHdr().getHdrIs();
        textView2.setText(w.getString(R.string.issuedBy, objArr));
        TextView textView3 = this.f2265e0;
        if (textView3 != null) {
            textView3.setVisibility(C2036r.m5370h(vdsParcel.getMsg().getUvci()) == C1427b.SPECIMEN ? 0 : 8);
            C1776j<Boolean> jVar = ((C1169c) this.f2263c0.getValue()).f4032f;
            C1669v vVar = this.f1450S;
            if (vVar != null) {
                jVar.mo1780d(vVar, new C1177j(inflate, this));
                VdsParcel vdsParcel2 = mo2478m0().f4073a;
                C1241e.m3517j(vdsParcel2, "<this>");
                ArrayList arrayList = new ArrayList();
                for (VdsVeParcel next : vdsParcel2.getMsg().getVe()) {
                    for (VdsVdParcel next2 : next.getVd()) {
                        String nam = next.getNam();
                        LocalDate dvc = next2.getDvc();
                        String lot = next2.getLot();
                        Objects.requireNonNull(lot, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = lot.toLowerCase(Locale.ROOT);
                        C1241e.m3516f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        arrayList.add(new C1188t(nam, dvc, !C1241e.m3513b(lowerCase, "not recorded") ? next2.getLot() : null));
                    }
                }
                C1189u uVar = new C1189u();
                if (arrayList.size() <= 1) {
                    list = C1850k.m5054P(arrayList);
                } else {
                    Object[] array = arrayList.toArray(new Object[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    if (array.length > 1) {
                        Arrays.sort(array, uVar);
                    }
                    list = C1845f.m5041H(array);
                }
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vaccineData);
                recyclerView.setLayoutManager(new SummaryFragment$onCreateView$3$1(recyclerView.getContext()));
                recyclerView.mo2032g(new C1176i(C2036r.m5369g(12), 2));
                recyclerView.setAdapter(new C1190v(mo1611b0(), list));
                ((Button) inflate.findViewById(R.id.viewDetailsButton)).setOnClickListener(new C1180l(this));
                return inflate;
            }
            throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        C1241e.m3524r("specimenBanner");
        throw null;
    }

    /* renamed from: O */
    public boolean mo1596O(MenuItem menuItem) {
        C1241e.m3517j(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            mo1609a0().finish();
            return true;
        } else if (itemId != R.id.action_info) {
            return false;
        } else {
            Intent intent = new Intent(mo1609a0(), AboutActivity.class);
            C1647i<?> iVar = this.f1474w;
            if (iVar != null) {
                Context context = iVar.f5043f;
                Object obj = C0002a.f0a;
                C0002a.C0003a.m3b(context, intent, (Bundle) null);
                return true;
            }
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
    }

    /* renamed from: m0 */
    public final C1187s mo2478m0() {
        return (C1187s) this.f2264d0.getValue();
    }
}
