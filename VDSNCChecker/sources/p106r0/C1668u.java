package p106r0;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: r0.u */
public class C1668u implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f5101e;

    /* renamed from: f */
    public final /* synthetic */ Map f5102f;

    public C1668u(C1665s sVar, ArrayList arrayList, Map map) {
        this.f5101e = arrayList;
        this.f5102f = map;
    }

    public void run() {
        int size = this.f5101e.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f5101e.get(i);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.setTransitionName((String) this.f5102f.get(view.getTransitionName()));
        }
    }
}
