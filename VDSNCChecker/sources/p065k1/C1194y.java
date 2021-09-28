package p065k1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0060b;
import androidx.fragment.app.C0302r;
import java.util.Objects;
import p003a2.C0009b;
import p007au.gov.dfat.vdsncchecker.R;
import p106r0.C1634b;

/* renamed from: k1.y */
public final class C1194y extends C1634b {

    /* renamed from: p0 */
    public static final /* synthetic */ int f4085p0 = 0;

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        if (C0302r.m864N(2)) {
            toString();
        }
        this.f5015d0 = 2;
        this.f5016e0 = 16973913;
        this.f5016e0 = 2131952113;
    }

    /* renamed from: S */
    public void mo1600S() {
        super.mo1600S();
        Window window = mo5782o0().getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
    }

    /* renamed from: n0 */
    public Dialog mo4802n0(Bundle bundle) {
        C0009b bVar = new C0009b(mo1611b0());
        AlertController.C0056b bVar2 = bVar.f264a;
        Objects.requireNonNull(bVar2);
        bVar2.f257q = R.layout.dialog_fragment_terms_of_use;
        bVar.mo6b(R.string.acceptButton, new C1192w(this, 0));
        C1192w wVar = new C1192w(this, 1);
        AlertController.C0056b bVar3 = bVar.f264a;
        bVar3.f251k = bVar3.f241a.getText(R.string.viewTermsButton);
        bVar.f264a.f252l = wVar;
        C0060b a = bVar.mo5a();
        a.requestWindowFeature(1);
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
        a.setOnKeyListener(new C1193x(this));
        return a;
    }
}
