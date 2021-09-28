package p106r0;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0286k;
import java.util.ArrayList;
import java.util.List;
import p034f0.C0885a;

/* renamed from: r0.r */
public class C1659r extends C1665s {

    /* renamed from: r0.r$a */
    public class C1660a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f5082a;

        public C1660a(C1659r rVar, Rect rect) {
            this.f5082a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f5082a;
        }
    }

    /* renamed from: r0.r$b */
    public class C1661b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f5083a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5084b;

        public C1661b(C1659r rVar, View view, ArrayList arrayList) {
            this.f5083a = view;
            this.f5084b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f5083a.setVisibility(8);
            int size = this.f5084b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5084b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: r0.r$c */
    public class C1662c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f5085a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5086b;

        /* renamed from: c */
        public final /* synthetic */ Object f5087c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f5088d;

        /* renamed from: e */
        public final /* synthetic */ Object f5089e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f5090f;

        public C1662c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5085a = obj;
            this.f5086b = arrayList;
            this.f5087c = obj2;
            this.f5088d = arrayList2;
            this.f5089e = obj3;
            this.f5090f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f5085a;
            if (obj != null) {
                C1659r.this.mo2752p(obj, this.f5086b, (ArrayList<View>) null);
            }
            Object obj2 = this.f5087c;
            if (obj2 != null) {
                C1659r.this.mo2752p(obj2, this.f5088d, (ArrayList<View>) null);
            }
            Object obj3 = this.f5089e;
            if (obj3 != null) {
                C1659r.this.mo2752p(obj3, this.f5090f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: r0.r$d */
    public class C1663d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f5092a;

        public C1663d(C1659r rVar, Runnable runnable) {
            this.f5092a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f5092a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: r0.r$e */
    public class C1664e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f5093a;

        public C1664e(C1659r rVar, Rect rect) {
            this.f5093a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f5093a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5093a;
        }
    }

    /* renamed from: z */
    public static boolean m4600z(Transition transition) {
        return !C1665s.m4620k(transition.getTargetIds()) || !C1665s.m4620k(transition.getTargetNames()) || !C1665s.m4620k(transition.getTargetTypes());
    }

    /* renamed from: a */
    public void mo2744a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo2745b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2745b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m4600z(transition) && C1665s.m4620k(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2746c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo2747e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo2748g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: l */
    public Object mo2749l(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: m */
    public Object mo2750m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: o */
    public void mo2751o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: p */
    public void mo2752p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2752p(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m4600z(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: q */
    public void mo2753q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1661b(this, view, arrayList));
    }

    /* renamed from: r */
    public void mo2754r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1662c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: s */
    public void mo2755s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1664e(this, rect));
        }
    }

    /* renamed from: t */
    public void mo2756t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo5854j(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1660a(this, rect));
        }
    }

    /* renamed from: u */
    public void mo2757u(C0286k kVar, Object obj, C0885a aVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1663d(this, runnable));
    }

    /* renamed from: w */
    public void mo2758w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1665s.m4618d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2745b(transitionSet, arrayList);
    }

    /* renamed from: x */
    public void mo2759x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2752p(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: y */
    public Object mo2760y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
