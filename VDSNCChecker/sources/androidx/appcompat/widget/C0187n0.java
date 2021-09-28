package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.n0 */
public class C0187n0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: e */
    public final /* synthetic */ C0189o0 f866e;

    public C0187n0(C0189o0 o0Var) {
        this.f866e = o0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0172j0 j0Var;
        if (i != -1 && (j0Var = this.f866e.f876g) != null) {
            j0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
