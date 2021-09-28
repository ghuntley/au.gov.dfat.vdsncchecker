package p017c1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0286k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p017c1.C0592g;
import p017c1.C0600k;
import p034f0.C0885a;
import p058j0.C1061o;
import p058j0.C1070q;
import p106r0.C1665s;

@SuppressLint({"RestrictedApi"})
/* renamed from: c1.d */
public class C0583d extends C1665s {

    /* renamed from: c1.d$a */
    public class C0584a extends C0592g.C0595c {
        public C0584a(C0583d dVar, Rect rect) {
        }
    }

    /* renamed from: c1.d$b */
    public class C0585b implements C0592g.C0596d {

        /* renamed from: a */
        public final /* synthetic */ View f2402a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2403b;

        public C0585b(C0583d dVar, View view, ArrayList arrayList) {
            this.f2402a = view;
            this.f2403b = arrayList;
        }

        /* renamed from: a */
        public void mo2761a(C0592g gVar) {
            gVar.mo2762A(this);
            gVar.mo2774b(this);
        }

        /* renamed from: b */
        public void mo2736b(C0592g gVar) {
        }

        /* renamed from: c */
        public void mo2737c(C0592g gVar) {
        }

        /* renamed from: d */
        public void mo2738d(C0592g gVar) {
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            gVar.mo2762A(this);
            this.f2402a.setVisibility(8);
            int size = this.f2403b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2403b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: c1.d$c */
    public class C0586c extends C0599j {

        /* renamed from: a */
        public final /* synthetic */ Object f2404a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2405b;

        /* renamed from: c */
        public final /* synthetic */ Object f2406c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2407d;

        /* renamed from: e */
        public final /* synthetic */ Object f2408e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2409f;

        public C0586c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2404a = obj;
            this.f2405b = arrayList;
            this.f2406c = obj2;
            this.f2407d = arrayList2;
            this.f2408e = obj3;
            this.f2409f = arrayList3;
        }

        /* renamed from: a */
        public void mo2761a(C0592g gVar) {
            Object obj = this.f2404a;
            if (obj != null) {
                C0583d.this.mo2752p(obj, this.f2405b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2406c;
            if (obj2 != null) {
                C0583d.this.mo2752p(obj2, this.f2407d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2408e;
            if (obj3 != null) {
                C0583d.this.mo2752p(obj3, this.f2409f, (ArrayList<View>) null);
            }
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            gVar.mo2762A(this);
        }
    }

    /* renamed from: c1.d$d */
    public class C0587d implements C0885a.C0886a {

        /* renamed from: a */
        public final /* synthetic */ C0592g f2411a;

        public C0587d(C0583d dVar, C0592g gVar) {
            this.f2411a = gVar;
        }

        /* renamed from: a */
        public void mo1559a() {
            this.f2411a.cancel();
        }
    }

    /* renamed from: c1.d$e */
    public class C0588e implements C0592g.C0596d {

        /* renamed from: a */
        public final /* synthetic */ Runnable f2412a;

        public C0588e(C0583d dVar, Runnable runnable) {
            this.f2412a = runnable;
        }

        /* renamed from: a */
        public void mo2761a(C0592g gVar) {
        }

        /* renamed from: b */
        public void mo2736b(C0592g gVar) {
        }

        /* renamed from: c */
        public void mo2737c(C0592g gVar) {
        }

        /* renamed from: d */
        public void mo2738d(C0592g gVar) {
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            this.f2412a.run();
        }
    }

    /* renamed from: c1.d$f */
    public class C0589f extends C0592g.C0595c {
        public C0589f(C0583d dVar, Rect rect) {
        }
    }

    /* renamed from: z */
    public static boolean m1876z(C0592g gVar) {
        return !C1665s.m4620k(gVar.f2420i) || !C1665s.m4620k((List) null) || !C1665s.m4620k((List) null);
    }

    /* renamed from: a */
    public void mo2744a(Object obj, View view) {
        if (obj != null) {
            ((C0592g) obj).mo2777d(view);
        }
    }

    /* renamed from: b */
    public void mo2745b(Object obj, ArrayList<View> arrayList) {
        C0592g gVar = (C0592g) obj;
        if (gVar != null) {
            int i = 0;
            if (gVar instanceof C0603l) {
                C0603l lVar = (C0603l) gVar;
                int size = lVar.f2451B.size();
                while (i < size) {
                    mo2745b(lVar.mo2799N(i), arrayList);
                    i++;
                }
            } else if (!m1876z(gVar) && C1665s.m4620k(gVar.f2421j)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    gVar.mo2777d(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2746c(ViewGroup viewGroup, Object obj) {
        C0592g gVar = (C0592g) obj;
        if (!C0600k.f2446c.contains(viewGroup)) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (viewGroup.isLaidOut()) {
                C0600k.f2446c.add(viewGroup);
                if (gVar == null) {
                    gVar = C0600k.f2444a;
                }
                C0592g o = gVar.clone();
                ArrayList orDefault = C0600k.m1951a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((C0592g) it.next()).mo2790z(viewGroup);
                    }
                }
                if (o != null) {
                    o.mo2780m(viewGroup, true);
                }
                if (((C0591f) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (o != null) {
                        C0600k.C0601a aVar = new C0600k.C0601a(o, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: e */
    public boolean mo2747e(Object obj) {
        return obj instanceof C0592g;
    }

    /* renamed from: g */
    public Object mo2748g(Object obj) {
        if (obj != null) {
            return ((C0592g) obj).clone();
        }
        return null;
    }

    /* renamed from: l */
    public Object mo2749l(Object obj, Object obj2, Object obj3) {
        C0592g gVar = (C0592g) obj;
        C0592g gVar2 = (C0592g) obj2;
        C0592g gVar3 = (C0592g) obj3;
        if (gVar != null && gVar2 != null) {
            C0603l lVar = new C0603l();
            lVar.mo2798M(gVar);
            lVar.mo2798M(gVar2);
            lVar.mo2800O(1);
            gVar = lVar;
        } else if (gVar == null) {
            gVar = gVar2 != null ? gVar2 : null;
        }
        if (gVar3 == null) {
            return gVar;
        }
        C0603l lVar2 = new C0603l();
        if (gVar != null) {
            lVar2.mo2798M(gVar);
        }
        lVar2.mo2798M(gVar3);
        return lVar2;
    }

    /* renamed from: m */
    public Object mo2750m(Object obj, Object obj2, Object obj3) {
        C0603l lVar = new C0603l();
        if (obj != null) {
            lVar.mo2798M((C0592g) obj);
        }
        if (obj2 != null) {
            lVar.mo2798M((C0592g) obj2);
        }
        if (obj3 != null) {
            lVar.mo2798M((C0592g) obj3);
        }
        return lVar;
    }

    /* renamed from: o */
    public void mo2751o(Object obj, View view) {
        if (obj != null) {
            ((C0592g) obj).mo2763B(view);
        }
    }

    /* renamed from: p */
    public void mo2752p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0592g gVar = (C0592g) obj;
        int i = 0;
        if (gVar instanceof C0603l) {
            C0603l lVar = (C0603l) gVar;
            int size = lVar.f2451B.size();
            while (i < size) {
                mo2752p(lVar.mo2799N(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m1876z(gVar)) {
            ArrayList<View> arrayList3 = gVar.f2421j;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    gVar.mo2777d(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        gVar.mo2763B(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo2753q(Object obj, View view, ArrayList<View> arrayList) {
        ((C0592g) obj).mo2774b(new C0585b(this, view, arrayList));
    }

    /* renamed from: r */
    public void mo2754r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C0592g) obj).mo2774b(new C0586c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: s */
    public void mo2755s(Object obj, Rect rect) {
        if (obj != null) {
            ((C0592g) obj).mo2767F(new C0589f(this, rect));
        }
    }

    /* renamed from: t */
    public void mo2756t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo5854j(view, rect);
            ((C0592g) obj).mo2767F(new C0584a(this, rect));
        }
    }

    /* renamed from: u */
    public void mo2757u(C0286k kVar, Object obj, C0885a aVar, Runnable runnable) {
        C0592g gVar = (C0592g) obj;
        aVar.mo4191b(new C0587d(this, gVar));
        gVar.mo2774b(new C0588e(this, runnable));
    }

    /* renamed from: w */
    public void mo2758w(Object obj, View view, ArrayList<View> arrayList) {
        C0603l lVar = (C0603l) obj;
        ArrayList<View> arrayList2 = lVar.f2421j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1665s.m4618d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo2745b(lVar, arrayList);
    }

    /* renamed from: x */
    public void mo2759x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0603l lVar = (C0603l) obj;
        if (lVar != null) {
            lVar.f2421j.clear();
            lVar.f2421j.addAll(arrayList2);
            mo2752p(lVar, arrayList, arrayList2);
        }
    }

    /* renamed from: y */
    public Object mo2760y(Object obj) {
        if (obj == null) {
            return null;
        }
        C0603l lVar = new C0603l();
        lVar.mo2798M((C0592g) obj);
        return lVar;
    }
}
