package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import p069l.C1214a;

/* renamed from: androidx.appcompat.widget.c1 */
public class C0146c1 implements View.OnClickListener {

    /* renamed from: e */
    public final C1214a f720e;

    /* renamed from: f */
    public final /* synthetic */ C0149d1 f721f;

    public C0146c1(C0149d1 d1Var) {
        this.f721f = d1Var;
        this.f720e = new C1214a(d1Var.f727a.getContext(), 0, 16908332, 0, d1Var.f735i);
    }

    public void onClick(View view) {
        C0149d1 d1Var = this.f721f;
        Window.Callback callback = d1Var.f738l;
        if (callback != null && d1Var.f739m) {
            callback.onMenuItemSelected(0, this.f720e);
        }
    }
}
