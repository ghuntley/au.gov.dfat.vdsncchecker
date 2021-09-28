package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.f */
public class C0450f implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f2098e;

    /* renamed from: f */
    public final /* synthetic */ C0456l f2099f;

    public C0450f(C0456l lVar, ArrayList arrayList) {
        this.f2099f = lVar;
        this.f2098e = arrayList;
    }

    public void run() {
        Iterator it = this.f2098e.iterator();
        while (it.hasNext()) {
            RecyclerView.C0422z zVar = (RecyclerView.C0422z) it.next();
            C0456l lVar = this.f2099f;
            Objects.requireNonNull(lVar);
            View view = zVar.f1991a;
            ViewPropertyAnimator animate = view.animate();
            lVar.f2130o.add(zVar);
            animate.alpha(1.0f).setDuration(lVar.f1907c).setListener(new C0452h(lVar, zVar, view, animate)).start();
        }
        this.f2098e.clear();
        this.f2099f.f2127l.remove(this.f2098e);
    }
}
