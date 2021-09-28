package p065k1;

import android.content.DialogInterface;
import android.view.KeyEvent;
import p072l2.C1241e;

/* renamed from: k1.x */
public final /* synthetic */ class C1193x implements DialogInterface.OnKeyListener {

    /* renamed from: e */
    public final /* synthetic */ C1194y f4084e;

    public /* synthetic */ C1193x(C1194y yVar) {
        this.f4084e = yVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C1194y yVar = this.f4084e;
        int i2 = C1194y.f4085p0;
        C1241e.m3517j(yVar, "this$0");
        if (i != 4) {
            return false;
        }
        yVar.mo1609a0().finish();
        return false;
    }
}
