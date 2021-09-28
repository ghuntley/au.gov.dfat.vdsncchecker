package p065k1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0286k;
import p007au.gov.dfat.vdsncchecker.R;
import p025d3.C0802f;
import p045h.C0958a;
import p045h.C0965e;
import p045h.C0995s;
import p072l2.C1241e;
import p106r0.C1647i;

/* renamed from: k1.g */
public abstract class C1173g extends C0286k {

    /* renamed from: Z */
    public boolean f4039Z;

    /* renamed from: a0 */
    public boolean f4040a0;

    /* renamed from: b0 */
    public boolean f4041b0;

    public C1173g() {
        this(false, false, false, 7, (C0802f) null);
    }

    public C1173g(boolean z, boolean z2, boolean z3) {
        this.f4039Z = z;
        this.f4040a0 = z2;
        this.f4041b0 = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1173g(boolean z, boolean z2, boolean z3, int i, C0802f fVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    /* renamed from: I */
    public void mo1590I(Menu menu, MenuInflater menuInflater) {
        C1241e.m3517j(menu, "menu");
        C1241e.m3517j(menuInflater, "inflater");
        menuInflater.inflate(R.menu.action_menu, menu);
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1241e.m3517j(layoutInflater, "inflater");
        C0958a s = ((C0965e) mo1609a0()).mo4293s();
        if (s != null) {
            s.mo4266c(this.f4039Z);
            ((C0995s) s).mo4405f(this.f4040a0 ? 8 : 0, 8);
        }
        int i = this.f1454W;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: P */
    public void mo1597P(Menu menu) {
        C1241e.m3517j(menu, "menu");
        menu.findItem(R.id.action_info).setVisible(this.f4041b0);
    }

    /* renamed from: S */
    public void mo1600S() {
        boolean z = true;
        this.f1439H = true;
        boolean z2 = this.f4039Z || this.f4041b0;
        if (this.f1437F != z2) {
            this.f1437F = z2;
            C1647i<?> iVar = this.f1474w;
            if (iVar == null || !this.f1466o) {
                z = false;
            }
            if (z && !this.f1434C) {
                iVar.mo5803l();
            }
        }
    }
}
