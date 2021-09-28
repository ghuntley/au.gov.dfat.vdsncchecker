package p007au.gov.dfat.vdsncchecker.p008ui;

import android.content.Intent;
import android.os.Bundle;
import p045h.C0965e;
import p072l2.C1241e;
import p136w0.C2036r;

/* renamed from: au.gov.dfat.vdsncchecker.ui.SplashActivity */
public final class SplashActivity extends C0965e {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1241e.m3517j(this, "context");
        startActivity(new Intent(this, C2036r.m5367e(this).getBoolean("PREF_TERMS_OF_USE_ACCEPTED", false) ? ScanActivity.class : TermsOfUseActivity.class));
        finish();
    }
}
