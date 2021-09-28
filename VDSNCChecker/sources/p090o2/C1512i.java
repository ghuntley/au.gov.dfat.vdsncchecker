package p090o2;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.C0762b;

/* renamed from: o2.i */
public class C1512i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C0762b f4681a;

    public C1512i(C0762b bVar) {
        this.f4681a = bVar;
    }

    public void onDismiss() {
        C0762b bVar = this.f4681a;
        bVar.f3007i = true;
        bVar.f3009k = System.currentTimeMillis();
        C0762b.m2338f(this.f4681a, false);
    }
}
