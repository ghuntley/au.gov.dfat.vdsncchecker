package p065k1;

import android.os.CountDownTimer;
import android.widget.TextView;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p072l2.C1241e;

/* renamed from: k1.q */
public final class C1185q extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ ScanActivity f4071a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1185q(ScanActivity scanActivity) {
        super(2000, 2000);
        this.f4071a = scanActivity;
    }

    public void onFinish() {
        TextView textView = this.f4071a.f2247A;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            C1241e.m3524r("invalidCode");
            throw null;
        }
    }

    public void onTick(long j) {
    }
}
