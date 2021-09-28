package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.a */
public class C0059a implements AdapterView.OnItemClickListener {

    /* renamed from: e */
    public final /* synthetic */ AlertController f261e;

    /* renamed from: f */
    public final /* synthetic */ AlertController.C0056b f262f;

    public C0059a(AlertController.C0056b bVar, AlertController alertController) {
        this.f262f = bVar;
        this.f261e = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f262f.f256p.onClick(this.f261e.f213b, i);
        if (!this.f262f.f258r) {
            this.f261e.f213b.dismiss();
        }
    }
}
