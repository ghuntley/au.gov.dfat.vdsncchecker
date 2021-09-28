package p065k1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C0350g;
import p007au.gov.dfat.vdsncchecker.R;
import p045h.C0958a;
import p045h.C0965e;
import p045h.C0995s;
import p072l2.C1241e;

/* renamed from: k1.f */
public abstract class C1172f extends C0965e {

    /* renamed from: s */
    public boolean f4036s;

    /* renamed from: t */
    public boolean f4037t;

    /* renamed from: u */
    public boolean f4038u;

    public C1172f() {
        this(false, false, false, 7);
    }

    public C1172f(boolean z, boolean z2, boolean z3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        this.f4036s = z;
        this.f4037t = z2;
        this.f4038u = z3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0958a s = mo4293s();
        if (s != null) {
            s.mo4266c(this.f4036s);
        }
        getWindow().setFlags(8192, 8192);
        C0958a s2 = mo4293s();
        C1241e.m3515e(s2);
        ((C0995s) s2).f3669d.setPrimaryBackground(new ColorDrawable(Color.parseColor(getString(R.color.blue_500))));
        C0350g.f1698m.f1704j.mo1802a(new C1171e(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu == null ? null : menu.findItem(R.id.action_info);
        if (findItem != null) {
            findItem.setVisible(this.f4037t);
        }
        super.onPrepareOptionsMenu(menu);
        return true;
    }
}
