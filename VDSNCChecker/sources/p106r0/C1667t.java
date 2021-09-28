package p106r0;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: r0.t */
public class C1667t implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f5099e;

    /* renamed from: f */
    public final /* synthetic */ Map f5100f;

    public C1667t(C1665s sVar, ArrayList arrayList, Map map) {
        this.f5099e = arrayList;
        this.f5100f = map;
    }

    public void run() {
        String str;
        int size = this.f5099e.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f5099e.get(i);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f5100f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
