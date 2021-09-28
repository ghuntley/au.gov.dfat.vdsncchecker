package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import p106r0.C1665s;

/* renamed from: androidx.fragment.app.h */
public class C0283h implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1665s f1426e;

    /* renamed from: f */
    public final /* synthetic */ View f1427f;

    /* renamed from: g */
    public final /* synthetic */ Rect f1428g;

    public C0283h(C0273c cVar, C1665s sVar, View view, Rect rect) {
        this.f1426e = sVar;
        this.f1427f = view;
        this.f1428g = rect;
    }

    public void run() {
        this.f1426e.mo5854j(this.f1427f, this.f1428g);
    }
}
