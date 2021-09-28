package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: androidx.recyclerview.widget.d */
public class C0445d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f2088e;

    /* renamed from: f */
    public final /* synthetic */ C0456l f2089f;

    public C0445d(C0456l lVar, ArrayList arrayList) {
        this.f2089f = lVar;
        this.f2088e = arrayList;
    }

    public void run() {
        Iterator it = this.f2088e.iterator();
        while (it.hasNext()) {
            C0456l.C0458b bVar = (C0456l.C0458b) it.next();
            C0456l lVar = this.f2089f;
            RecyclerView.C0422z zVar = bVar.f2140a;
            int i = bVar.f2141b;
            int i2 = bVar.f2142c;
            int i3 = bVar.f2143d;
            int i4 = bVar.f2144e;
            Objects.requireNonNull(lVar);
            View view = zVar.f1991a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            lVar.f2131p.add(zVar);
            animate.setDuration(lVar.f1909e).setListener(new C0453i(lVar, zVar, i5, view, i6, animate)).start();
        }
        this.f2088e.clear();
        this.f2089f.f2128m.remove(this.f2088e);
    }
}
