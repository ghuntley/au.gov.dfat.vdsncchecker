package p053i1;

import android.content.DialogInterface;
import p019c3.C0640p;
import p072l2.C1241e;

/* renamed from: i1.a */
public final /* synthetic */ class C1025a implements DialogInterface.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f3744e;

    /* renamed from: f */
    public final /* synthetic */ C0640p f3745f;

    public /* synthetic */ C1025a(C0640p pVar, int i) {
        this.f3744e = i;
        this.f3745f = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f3744e) {
            case 0:
                C0640p pVar = this.f3745f;
                C1241e.m3517j(pVar, "$okCallback");
                C1241e.m3516f(dialogInterface, "dialog");
                pVar.mo2829k(dialogInterface, Integer.valueOf(i));
                return;
            case 1:
                C0640p pVar2 = this.f3745f;
                C1241e.m3517j(pVar2, "$okCallback");
                C1241e.m3516f(dialogInterface, "dialog");
                pVar2.mo2829k(dialogInterface, Integer.valueOf(i));
                return;
            default:
                C0640p pVar3 = this.f3745f;
                C1241e.m3517j(pVar3, "$cancelCallback");
                C1241e.m3516f(dialogInterface, "dialog");
                pVar3.mo2829k(dialogInterface, Integer.valueOf(i));
                return;
        }
    }
}
