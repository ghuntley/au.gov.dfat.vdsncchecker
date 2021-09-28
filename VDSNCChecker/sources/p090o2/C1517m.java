package p090o2;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0189o0;

/* renamed from: o2.m */
public class C1517m implements AdapterView.OnItemClickListener {

    /* renamed from: e */
    public final /* synthetic */ C1518n f4712e;

    public C1517m(C1518n nVar) {
        this.f4712e = nVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj;
        C1518n nVar = this.f4712e;
        if (i < 0) {
            C0189o0 o0Var = nVar.f4713h;
            obj = !o0Var.mo202b() ? null : o0Var.f876g.getSelectedItem();
        } else {
            obj = nVar.getAdapter().getItem(i);
        }
        C1518n.m4219a(this.f4712e, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f4712e.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C0189o0 o0Var2 = this.f4712e.f4713h;
                view = !o0Var2.mo202b() ? null : o0Var2.f876g.getSelectedView();
                C0189o0 o0Var3 = this.f4712e.f4713h;
                i = !o0Var3.mo202b() ? -1 : o0Var3.f876g.getSelectedItemPosition();
                C0189o0 o0Var4 = this.f4712e.f4713h;
                j = !o0Var4.mo202b() ? Long.MIN_VALUE : o0Var4.f876g.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f4712e.f4713h.f876g, view, i, j);
        }
        this.f4712e.f4713h.dismiss();
    }
}
