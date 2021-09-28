package p152z1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: z1.j */
public class C2178j extends RecyclerView.C0408p {

    /* renamed from: a */
    public final /* synthetic */ C2195v f6271a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f6272b;

    /* renamed from: c */
    public final /* synthetic */ C2170g f6273c;

    public C2178j(C2170g gVar, C2195v vVar, MaterialButton materialButton) {
        this.f6273c = gVar;
        this.f6271a = vVar;
        this.f6272b = materialButton;
    }

    /* renamed from: a */
    public void mo2203a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f6272b.getText());
        }
    }

    /* renamed from: b */
    public void mo2204b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager n0 = this.f6273c.mo6722n0();
        int U0 = i < 0 ? n0.mo1937U0() : n0.mo1939W0();
        this.f6273c.f6257d0 = this.f6271a.mo6762e(U0);
        MaterialButton materialButton = this.f6272b;
        C2195v vVar = this.f6271a;
        materialButton.setText(vVar.f6321d.f6218e.mo6745o(U0).mo6744n(vVar.f6320c));
    }
}
