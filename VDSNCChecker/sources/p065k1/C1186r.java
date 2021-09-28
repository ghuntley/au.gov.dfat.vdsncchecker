package p065k1;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p019c3.C0640p;
import p025d3.C0806j;
import p072l2.C1241e;
import p120t2.C1798k;

/* renamed from: k1.r */
public final class C1186r extends C0806j implements C0640p<DialogInterface, Integer, C1798k> {

    /* renamed from: f */
    public final /* synthetic */ ScanActivity f4072f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1186r(ScanActivity scanActivity) {
        super(2);
        this.f4072f = scanActivity;
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1241e.m3517j((DialogInterface) obj, "$noName_0");
        ScanActivity scanActivity = this.f4072f;
        C1241e.m3517j(scanActivity, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", scanActivity.getPackageName(), (String) null));
        scanActivity.startActivity(intent);
        return C1798k.f5446a;
    }
}
