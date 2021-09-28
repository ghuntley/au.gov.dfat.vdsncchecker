package p065k1;

import android.content.ActivityNotFoundException;
import android.view.View;
import java.util.Arrays;
import p007au.gov.dfat.vdsncchecker.p008ui.AboutActivity;
import p072l2.C1241e;
import p136w0.C2036r;

/* renamed from: k1.a */
public final /* synthetic */ class C1167a implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f4024e;

    /* renamed from: f */
    public final /* synthetic */ AboutActivity f4025f;

    public /* synthetic */ C1167a(AboutActivity aboutActivity, int i) {
        this.f4024e = i;
        this.f4025f = aboutActivity;
    }

    public final void onClick(View view) {
        switch (this.f4024e) {
            case 0:
                AboutActivity aboutActivity = this.f4025f;
                int i = AboutActivity.f2239v;
                C1241e.m3517j(aboutActivity, "this$0");
                try {
                    aboutActivity.startActivity(C2036r.m5363a("https://www.passports.gov.au/vds-nc-checker#about"));
                    return;
                } catch (ActivityNotFoundException unused) {
                    C1241e.m3516f(String.format("Unable to launch URL", Arrays.copyOf(new Object[]{new Object[0]}, 1)), "java.lang.String.format(format, *args)");
                    return;
                }
            default:
                AboutActivity aboutActivity2 = this.f4025f;
                int i2 = AboutActivity.f2239v;
                C1241e.m3517j(aboutActivity2, "this$0");
                try {
                    aboutActivity2.startActivity(C2036r.m5363a("https://www.passports.gov.au/vds-nc-checker-terms-use-android"));
                    return;
                } catch (ActivityNotFoundException unused2) {
                    C1241e.m3516f(String.format("Unable to launch URL", Arrays.copyOf(new Object[]{new Object[0]}, 1)), "java.lang.String.format(format, *args)");
                    return;
                }
        }
    }
}
