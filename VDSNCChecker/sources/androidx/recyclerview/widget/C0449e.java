package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.e */
public class C0449e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f2096e;

    /* renamed from: f */
    public final /* synthetic */ C0456l f2097f;

    public C0449e(C0456l lVar, ArrayList arrayList) {
        this.f2097f = lVar;
        this.f2096e = arrayList;
    }

    public void run() {
        Iterator it = this.f2096e.iterator();
        while (it.hasNext()) {
            C0456l.C0457a aVar = (C0456l.C0457a) it.next();
            C0456l lVar = this.f2097f;
            Objects.requireNonNull(lVar);
            RecyclerView.C0422z zVar = aVar.f2134a;
            View view = null;
            View view2 = zVar == null ? null : zVar.f1991a;
            RecyclerView.C0422z zVar2 = aVar.f2135b;
            if (zVar2 != null) {
                view = zVar2.f1991a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(lVar.f1910f);
                lVar.f2133r.add(aVar.f2134a);
                duration.translationX((float) (aVar.f2138e - aVar.f2136c));
                duration.translationY((float) (aVar.f2139f - aVar.f2137d));
                duration.alpha(0.0f).setListener(new C0454j(lVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                lVar.f2133r.add(aVar.f2135b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f1910f).alpha(1.0f).setListener(new C0455k(lVar, aVar, animate, view)).start();
            }
        }
        this.f2096e.clear();
        this.f2097f.f2129n.remove(this.f2096e);
    }
}
