package p065k1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Arrays;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p007au.gov.dfat.vdsncchecker.p008ui.TermsOfUseActivity;
import p072l2.C1241e;
import p136w0.C2036r;

/* renamed from: k1.w */
public final /* synthetic */ class C1192w implements DialogInterface.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f4082e;

    /* renamed from: f */
    public final /* synthetic */ C1194y f4083f;

    public /* synthetic */ C1192w(C1194y yVar, int i) {
        this.f4082e = i;
        this.f4083f = yVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4082e) {
            case 0:
                C1194y yVar = this.f4083f;
                int i2 = C1194y.f4085p0;
                C1241e.m3517j(yVar, "this$0");
                TermsOfUseActivity termsOfUseActivity = (TermsOfUseActivity) yVar.mo1609a0();
                SharedPreferences.Editor edit = C2036r.m5367e(termsOfUseActivity).edit();
                edit.putBoolean("PREF_TERMS_OF_USE_ACCEPTED", true);
                edit.apply();
                termsOfUseActivity.startActivity(new Intent(termsOfUseActivity, ScanActivity.class));
                termsOfUseActivity.finish();
                return;
            default:
                C1194y yVar2 = this.f4083f;
                int i3 = C1194y.f4085p0;
                C1241e.m3517j(yVar2, "this$0");
                try {
                    ((TermsOfUseActivity) yVar2.mo1609a0()).startActivity(C2036r.m5363a("https://www.passports.gov.au/vds-nc-checker-terms-use-android"));
                    return;
                } catch (ActivityNotFoundException unused) {
                    C1241e.m3516f(String.format("Unable to launch URL", Arrays.copyOf(new Object[]{new Object[0]}, 1)), "java.lang.String.format(format, *args)");
                    return;
                }
        }
    }
}
