package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.C0001b;

/* renamed from: androidx.recyclerview.widget.l */
public class C0456l extends C0435a0 {

    /* renamed from: s */
    public static TimeInterpolator f2122s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C0422z> f2123h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C0422z> f2124i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0458b> f2125j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C0457a> f2126k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C0422z>> f2127l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C0458b>> f2128m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C0457a>> f2129n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C0422z> f2130o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C0422z> f2131p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C0422z> f2132q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C0422z> f2133r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.l$a */
    public static class C0457a {

        /* renamed from: a */
        public RecyclerView.C0422z f2134a;

        /* renamed from: b */
        public RecyclerView.C0422z f2135b;

        /* renamed from: c */
        public int f2136c;

        /* renamed from: d */
        public int f2137d;

        /* renamed from: e */
        public int f2138e;

        /* renamed from: f */
        public int f2139f;

        public C0457a(RecyclerView.C0422z zVar, RecyclerView.C0422z zVar2, int i, int i2, int i3, int i4) {
            this.f2134a = zVar;
            this.f2135b = zVar2;
            this.f2136c = i;
            this.f2137d = i2;
            this.f2138e = i3;
            this.f2139f = i4;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("ChangeInfo{oldHolder=");
            a.append(this.f2134a);
            a.append(", newHolder=");
            a.append(this.f2135b);
            a.append(", fromX=");
            a.append(this.f2136c);
            a.append(", fromY=");
            a.append(this.f2137d);
            a.append(", toX=");
            a.append(this.f2138e);
            a.append(", toY=");
            a.append(this.f2139f);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    public static class C0458b {

        /* renamed from: a */
        public RecyclerView.C0422z f2140a;

        /* renamed from: b */
        public int f2141b;

        /* renamed from: c */
        public int f2142c;

        /* renamed from: d */
        public int f2143d;

        /* renamed from: e */
        public int f2144e;

        public C0458b(RecyclerView.C0422z zVar, int i, int i2, int i3, int i4) {
            this.f2140a = zVar;
            this.f2141b = i;
            this.f2142c = i2;
            this.f2143d = i3;
            this.f2144e = i4;
        }
    }

    /* renamed from: e */
    public void mo2141e(RecyclerView.C0422z zVar) {
        View view = zVar.f1991a;
        view.animate().cancel();
        int size = this.f2125j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2125j.get(size).f2140a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo2139c(zVar);
                this.f2125j.remove(size);
            }
        }
        mo2390l(this.f2126k, zVar);
        if (this.f2123h.remove(zVar)) {
            view.setAlpha(1.0f);
            mo2139c(zVar);
        }
        if (this.f2124i.remove(zVar)) {
            view.setAlpha(1.0f);
            mo2139c(zVar);
        }
        int size2 = this.f2129n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f2129n.get(size2);
            mo2390l(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f2129n.remove(size2);
            }
        }
        int size3 = this.f2128m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f2128m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C0458b) arrayList2.get(size4)).f2140a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo2139c(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2128m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2127l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f2127l.get(size5);
                if (arrayList3.remove(zVar)) {
                    view.setAlpha(1.0f);
                    mo2139c(zVar);
                    if (arrayList3.isEmpty()) {
                        this.f2127l.remove(size5);
                    }
                }
            } else {
                this.f2132q.remove(zVar);
                this.f2130o.remove(zVar);
                this.f2133r.remove(zVar);
                this.f2131p.remove(zVar);
                mo2389k();
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo2142f() {
        int size = this.f2125j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0458b bVar = this.f2125j.get(size);
            View view = bVar.f2140a.f1991a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo2139c(bVar.f2140a);
            this.f2125j.remove(size);
        }
        int size2 = this.f2123h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo2139c(this.f2123h.get(size2));
            this.f2123h.remove(size2);
        }
        int size3 = this.f2124i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0422z zVar = this.f2124i.get(size3);
            zVar.f1991a.setAlpha(1.0f);
            mo2139c(zVar);
            this.f2124i.remove(size3);
        }
        int size4 = this.f2126k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C0457a aVar = this.f2126k.get(size4);
            RecyclerView.C0422z zVar2 = aVar.f2134a;
            if (zVar2 != null) {
                mo2391m(aVar, zVar2);
            }
            RecyclerView.C0422z zVar3 = aVar.f2135b;
            if (zVar3 != null) {
                mo2391m(aVar, zVar3);
            }
        }
        this.f2126k.clear();
        if (mo2143g()) {
            int size5 = this.f2128m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f2128m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C0458b bVar2 = (C0458b) arrayList.get(size6);
                        View view2 = bVar2.f2140a.f1991a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo2139c(bVar2.f2140a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2128m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2127l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f2127l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.C0422z zVar4 = (RecyclerView.C0422z) arrayList2.get(size8);
                        zVar4.f1991a.setAlpha(1.0f);
                        mo2139c(zVar4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2127l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2129n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f2129n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C0457a aVar2 = (C0457a) arrayList3.get(size10);
                            RecyclerView.C0422z zVar5 = aVar2.f2134a;
                            if (zVar5 != null) {
                                mo2391m(aVar2, zVar5);
                            }
                            RecyclerView.C0422z zVar6 = aVar2.f2135b;
                            if (zVar6 != null) {
                                mo2391m(aVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f2129n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo2388j(this.f2132q);
                    mo2388j(this.f2131p);
                    mo2388j(this.f2130o);
                    mo2388j(this.f2133r);
                    mo2140d();
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo2143g() {
        return !this.f2124i.isEmpty() || !this.f2126k.isEmpty() || !this.f2125j.isEmpty() || !this.f2123h.isEmpty() || !this.f2131p.isEmpty() || !this.f2132q.isEmpty() || !this.f2130o.isEmpty() || !this.f2133r.isEmpty() || !this.f2128m.isEmpty() || !this.f2127l.isEmpty() || !this.f2129n.isEmpty();
    }

    /* renamed from: i */
    public boolean mo2337i(RecyclerView.C0422z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f1991a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f1991a.getTranslationY());
        mo2392n(zVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo2139c(zVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f2125j.add(new C0458b(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: j */
    public void mo2388j(List<RecyclerView.C0422z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f1991a.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo2389k() {
        if (!mo2143g()) {
            mo2140d();
        }
    }

    /* renamed from: l */
    public final void mo2390l(List<C0457a> list, RecyclerView.C0422z zVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0457a aVar = list.get(size);
                if (mo2391m(aVar, zVar) && aVar.f2134a == null && aVar.f2135b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo2391m(C0457a aVar, RecyclerView.C0422z zVar) {
        if (aVar.f2135b == zVar) {
            aVar.f2135b = null;
        } else if (aVar.f2134a != zVar) {
            return false;
        } else {
            aVar.f2134a = null;
        }
        zVar.f1991a.setAlpha(1.0f);
        zVar.f1991a.setTranslationX(0.0f);
        zVar.f1991a.setTranslationY(0.0f);
        mo2139c(zVar);
        return true;
    }

    /* renamed from: n */
    public final void mo2392n(RecyclerView.C0422z zVar) {
        if (f2122s == null) {
            f2122s = new ValueAnimator().getInterpolator();
        }
        zVar.f1991a.animate().setInterpolator(f2122s);
        mo2141e(zVar);
    }
}
