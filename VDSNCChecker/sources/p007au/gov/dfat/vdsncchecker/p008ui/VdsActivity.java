package p007au.gov.dfat.vdsncchecker.p008ui;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0300q;
import androidx.fragment.app.C0302r;
import androidx.lifecycle.C0350g;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p019c3.C0625a;
import p025d3.C0806j;
import p025d3.C0810n;
import p045h.C0958a;
import p045h.C0965e;
import p045h.C0995s;
import p065k1.C1169c;
import p065k1.C1171e;
import p065k1.C1183o;
import p071l1.C1234a;
import p072l2.C1241e;
import p077m1.C1426a;
import p118t0.C1780n;
import p118t0.C1781o;
import p118t0.C1784r;
import p120t2.C1790d;

/* renamed from: au.gov.dfat.vdsncchecker.ui.VdsActivity */
public final class VdsActivity extends C0965e {

    /* renamed from: t */
    public static final /* synthetic */ int f2269t = 0;

    /* renamed from: s */
    public final C1790d f2270s = new C1780n(C0810n.m2403a(C1169c.class), new C0499c(this), C0497a.f2271f);

    /* renamed from: au.gov.dfat.vdsncchecker.ui.VdsActivity$a */
    public static final class C0497a extends C0806j implements C0625a<C1781o> {

        /* renamed from: f */
        public static final C0497a f2271f = new C0497a();

        public C0497a() {
            super(0);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1234a.m3507a();
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.VdsActivity$b */
    public static final class C0498b extends C0302r.C0313k {

        /* renamed from: a */
        public final /* synthetic */ VdsActivity f2272a;

        public C0498b(VdsActivity vdsActivity) {
            this.f2272a = vdsActivity;
        }

        /* renamed from: a */
        public void mo1743a(C0302r rVar, C0286k kVar) {
            C1241e.m3517j(rVar, "fm");
            C1241e.m3517j(kVar, "f");
            VdsActivity vdsActivity = this.f2272a;
            int i = VdsActivity.f2269t;
            C1426a.m4088a(vdsActivity, vdsActivity.mo2479u());
            VdsActivity vdsActivity2 = this.f2272a;
            C1426a.m4089b(vdsActivity2, vdsActivity2.mo2479u());
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.VdsActivity$c */
    public static final class C0499c extends C0806j implements C0625a<C1784r> {

        /* renamed from: f */
        public final /* synthetic */ ComponentActivity f2273f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0499c(ComponentActivity componentActivity) {
            super(0);
            this.f2273f = componentActivity;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1784r j = this.f2273f.mo116j();
            C1241e.m3516f(j, "viewModelStore");
            return j;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setContentView((int) R.layout.activity_app);
        C0958a s = mo4293s();
        C1241e.m3515e(s);
        ((C0995s) s).f3669d.setPrimaryBackground(new ColorDrawable(Color.parseColor(getString(R.color.blue_500))));
        C0286k H = mo5790o().mo1681H(R.id.nav_host_fragment);
        Objects.requireNonNull(H, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) H;
        NavController n0 = navHostFragment.mo1883n0();
        C1241e.m3516f(n0, "navHostFragment.navController");
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("vds", getIntent().getParcelableExtra("VDS_DATA"));
        n0.mo1858g(R.navigation.vds_graph, bundle2);
        navHostFragment.mo1620h().f1543n.f1515a.add(new C0300q.C0301a(new C0498b(this), false));
        mo2479u().f4031e.mo1780d(this, new C1183o(this));
        C0350g.f1698m.f1704j.mo1802a(new C1171e(this));
    }

    /* renamed from: u */
    public final C1169c mo2479u() {
        return (C1169c) this.f2270s.getValue();
    }
}
