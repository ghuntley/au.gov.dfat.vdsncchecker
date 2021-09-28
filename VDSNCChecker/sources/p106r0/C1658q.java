package p106r0;

import android.view.View;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0329z;
import java.util.ArrayList;

/* renamed from: r0.q */
public class C1658q implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Object f5074e;

    /* renamed from: f */
    public final /* synthetic */ C1665s f5075f;

    /* renamed from: g */
    public final /* synthetic */ View f5076g;

    /* renamed from: h */
    public final /* synthetic */ C0286k f5077h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f5078i;

    /* renamed from: j */
    public final /* synthetic */ ArrayList f5079j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f5080k;

    /* renamed from: l */
    public final /* synthetic */ Object f5081l;

    public C1658q(Object obj, C1665s sVar, View view, C0286k kVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f5074e = obj;
        this.f5075f = sVar;
        this.f5076g = view;
        this.f5077h = kVar;
        this.f5078i = arrayList;
        this.f5079j = arrayList2;
        this.f5080k = arrayList3;
        this.f5081l = obj2;
    }

    public void run() {
        Object obj = this.f5074e;
        if (obj != null) {
            this.f5075f.mo2751o(obj, this.f5076g);
            this.f5079j.addAll(C0329z.m965h(this.f5075f, this.f5074e, this.f5077h, this.f5078i, this.f5076g));
        }
        if (this.f5080k != null) {
            if (this.f5081l != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f5076g);
                this.f5075f.mo2752p(this.f5081l, this.f5080k, arrayList);
            }
            this.f5080k.clear();
            this.f5080k.add(this.f5076g);
        }
    }
}
