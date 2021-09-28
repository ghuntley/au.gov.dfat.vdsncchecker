package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0456l;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a0 */
public abstract class C0435a0 extends RecyclerView.C0394i {

    /* renamed from: g */
    public boolean f2071g = true;

    /* renamed from: a */
    public boolean mo2138a(RecyclerView.C0422z zVar, RecyclerView.C0422z zVar2, RecyclerView.C0394i.C0397c cVar, RecyclerView.C0394i.C0397c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1911a;
        int i4 = cVar.f1912b;
        if (zVar2.mo2256u()) {
            int i5 = cVar.f1911a;
            i = cVar.f1912b;
            i2 = i5;
        } else {
            i2 = cVar2.f1911a;
            i = cVar2.f1912b;
        }
        C0456l lVar = (C0456l) this;
        if (zVar == zVar2) {
            return lVar.mo2337i(zVar, i3, i4, i2, i);
        }
        float translationX = zVar.f1991a.getTranslationX();
        float translationY = zVar.f1991a.getTranslationY();
        float alpha = zVar.f1991a.getAlpha();
        lVar.mo2392n(zVar);
        zVar.f1991a.setTranslationX(translationX);
        zVar.f1991a.setTranslationY(translationY);
        zVar.f1991a.setAlpha(alpha);
        lVar.mo2392n(zVar2);
        zVar2.f1991a.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        zVar2.f1991a.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        zVar2.f1991a.setAlpha(0.0f);
        lVar.f2126k.add(new C0456l.C0457a(zVar, zVar2, i3, i4, i2, i));
        return true;
    }

    /* renamed from: i */
    public abstract boolean mo2337i(RecyclerView.C0422z zVar, int i, int i2, int i3, int i4);
}
