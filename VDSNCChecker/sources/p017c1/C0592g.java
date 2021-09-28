package p017c1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.C0000a;
import p000a.C0001b;
import p058j0.C1061o;
import p058j0.C1070q;
import p063k.C1142f;
import p075m.C1417c;
import p093p.C1545a;
import p093p.C1549d;
import p093p.C1550e;
import p099q.C1592d;
import p099q.C1599h;

/* renamed from: c1.g */
public abstract class C0592g implements Cloneable {

    /* renamed from: A */
    public static ThreadLocal<C1545a<Animator, C0594b>> f2413A = new ThreadLocal<>();

    /* renamed from: y */
    public static final int[] f2414y = {2, 1, 3, 4};

    /* renamed from: z */
    public static final C1417c f2415z = new C0593a();

    /* renamed from: e */
    public String f2416e = getClass().getName();

    /* renamed from: f */
    public long f2417f = -1;

    /* renamed from: g */
    public long f2418g = -1;

    /* renamed from: h */
    public TimeInterpolator f2419h = null;

    /* renamed from: i */
    public ArrayList<Integer> f2420i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<View> f2421j = new ArrayList<>();

    /* renamed from: k */
    public C1592d f2422k = new C1592d(2);

    /* renamed from: l */
    public C1592d f2423l = new C1592d(2);

    /* renamed from: m */
    public C0603l f2424m = null;

    /* renamed from: n */
    public int[] f2425n = f2414y;

    /* renamed from: o */
    public ArrayList<C0607n> f2426o;

    /* renamed from: p */
    public ArrayList<C0607n> f2427p;

    /* renamed from: q */
    public ArrayList<Animator> f2428q = new ArrayList<>();

    /* renamed from: r */
    public int f2429r = 0;

    /* renamed from: s */
    public boolean f2430s = false;

    /* renamed from: t */
    public boolean f2431t = false;

    /* renamed from: u */
    public ArrayList<C0596d> f2432u = null;

    /* renamed from: v */
    public ArrayList<Animator> f2433v = new ArrayList<>();

    /* renamed from: w */
    public C0595c f2434w;

    /* renamed from: x */
    public C1417c f2435x = f2415z;

    /* renamed from: c1.g$a */
    public static class C0593a extends C1417c {
        public C0593a() {
            super(1);
        }

        /* renamed from: e */
        public Path mo2791e(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: c1.g$b */
    public static class C0594b {

        /* renamed from: a */
        public View f2436a;

        /* renamed from: b */
        public String f2437b;

        /* renamed from: c */
        public C0607n f2438c;

        /* renamed from: d */
        public C0623z f2439d;

        /* renamed from: e */
        public C0592g f2440e;

        public C0594b(View view, String str, C0592g gVar, C0623z zVar, C0607n nVar) {
            this.f2436a = view;
            this.f2437b = str;
            this.f2438c = nVar;
            this.f2439d = zVar;
            this.f2440e = gVar;
        }
    }

    /* renamed from: c1.g$c */
    public static abstract class C0595c {
    }

    /* renamed from: c1.g$d */
    public interface C0596d {
        /* renamed from: a */
        void mo2761a(C0592g gVar);

        /* renamed from: b */
        void mo2736b(C0592g gVar);

        /* renamed from: c */
        void mo2737c(C0592g gVar);

        /* renamed from: d */
        void mo2738d(C0592g gVar);

        /* renamed from: e */
        void mo2739e(C0592g gVar);
    }

    /* renamed from: e */
    public static void m1908e(C1592d dVar, View view, C0607n nVar) {
        ((C1545a) dVar.f4936a).put(view, nVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) dVar.f4937b).indexOfKey(id) >= 0) {
                ((SparseArray) dVar.f4937b).put(id, (Object) null);
            } else {
                ((SparseArray) dVar.f4937b).put(id, view);
            }
        }
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (((C1545a) dVar.f4939d).mo5608f(transitionName) >= 0) {
                ((C1545a) dVar.f4939d).put(transitionName, null);
            } else {
                ((C1545a) dVar.f4939d).put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1550e eVar = (C1550e) dVar.f4938c;
                if (eVar.f4808e) {
                    eVar.mo5534e();
                }
                if (C1549d.m4305b(eVar.f4809f, eVar.f4811h, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((C1550e) dVar.f4938c).mo5535f(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((C1550e) dVar.f4938c).mo5537k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((C1550e) dVar.f4938c).mo5537k(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: t */
    public static C1545a<Animator, C0594b> m1909t() {
        C1545a<Animator, C0594b> aVar = f2413A.get();
        if (aVar != null) {
            return aVar;
        }
        C1545a<Animator, C0594b> aVar2 = new C1545a<>();
        f2413A.set(aVar2);
        return aVar2;
    }

    /* renamed from: y */
    public static boolean m1910y(C0607n nVar, C0607n nVar2, String str) {
        Object obj = nVar.f2461a.get(str);
        Object obj2 = nVar2.f2461a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public C0592g mo2762A(C0596d dVar) {
        ArrayList<C0596d> arrayList = this.f2432u;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f2432u.size() == 0) {
            this.f2432u = null;
        }
        return this;
    }

    /* renamed from: B */
    public C0592g mo2763B(View view) {
        this.f2421j.remove(view);
        return this;
    }

    /* renamed from: C */
    public void mo2764C(View view) {
        if (this.f2430s) {
            if (!this.f2431t) {
                C1545a<Animator, C0594b> t = m1909t();
                int i = t.f4840g;
                C0617v vVar = C0609p.f2465a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C0594b l = t.mo5618l(i2);
                    if (l.f2436a != null) {
                        C0623z zVar = l.f2439d;
                        if ((zVar instanceof C0622y) && ((C0622y) zVar).f2492a.equals(windowId)) {
                            t.mo5614i(i2).resume();
                        }
                    }
                }
                ArrayList<C0596d> arrayList = this.f2432u;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2432u.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C0596d) arrayList2.get(i3)).mo2736b(this);
                    }
                }
            }
            this.f2430s = false;
        }
    }

    /* renamed from: D */
    public void mo2765D() {
        mo2772K();
        C1545a<Animator, C0594b> t = m1909t();
        Iterator<Animator> it = this.f2433v.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t.containsKey(next)) {
                mo2772K();
                if (next != null) {
                    next.addListener(new C0597h(this, t));
                    long j = this.f2418g;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f2417f;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f2419h;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C0598i(this));
                    next.start();
                }
            }
        }
        this.f2433v.clear();
        mo2784r();
    }

    /* renamed from: E */
    public C0592g mo2766E(long j) {
        this.f2418g = j;
        return this;
    }

    /* renamed from: F */
    public void mo2767F(C0595c cVar) {
        this.f2434w = cVar;
    }

    /* renamed from: G */
    public C0592g mo2768G(TimeInterpolator timeInterpolator) {
        this.f2419h = timeInterpolator;
        return this;
    }

    /* renamed from: H */
    public void mo2769H(C1417c cVar) {
        if (cVar == null) {
            cVar = f2415z;
        }
        this.f2435x = cVar;
    }

    /* renamed from: I */
    public void mo2770I(C0000a aVar) {
    }

    /* renamed from: J */
    public C0592g mo2771J(long j) {
        this.f2417f = j;
        return this;
    }

    /* renamed from: K */
    public void mo2772K() {
        if (this.f2429r == 0) {
            ArrayList<C0596d> arrayList = this.f2432u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2432u.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0596d) arrayList2.get(i)).mo2761a(this);
                }
            }
            this.f2431t = false;
        }
        this.f2429r++;
    }

    /* renamed from: L */
    public String mo2773L(String str) {
        StringBuilder a = C0001b.m0a(str);
        a.append(getClass().getSimpleName());
        a.append("@");
        a.append(Integer.toHexString(hashCode()));
        a.append(": ");
        String sb = a.toString();
        if (this.f2418g != -1) {
            StringBuilder a2 = C1599h.m4503a(sb, "dur(");
            a2.append(this.f2418g);
            a2.append(") ");
            sb = a2.toString();
        }
        if (this.f2417f != -1) {
            StringBuilder a3 = C1599h.m4503a(sb, "dly(");
            a3.append(this.f2417f);
            a3.append(") ");
            sb = a3.toString();
        }
        if (this.f2419h != null) {
            StringBuilder a4 = C1599h.m4503a(sb, "interp(");
            a4.append(this.f2419h);
            a4.append(") ");
            sb = a4.toString();
        }
        if (this.f2420i.size() <= 0 && this.f2421j.size() <= 0) {
            return sb;
        }
        String a5 = C1142f.m3365a(sb, "tgts(");
        if (this.f2420i.size() > 0) {
            for (int i = 0; i < this.f2420i.size(); i++) {
                if (i > 0) {
                    a5 = C1142f.m3365a(a5, ", ");
                }
                StringBuilder a6 = C0001b.m0a(a5);
                a6.append(this.f2420i.get(i));
                a5 = a6.toString();
            }
        }
        if (this.f2421j.size() > 0) {
            for (int i2 = 0; i2 < this.f2421j.size(); i2++) {
                if (i2 > 0) {
                    a5 = C1142f.m3365a(a5, ", ");
                }
                StringBuilder a7 = C0001b.m0a(a5);
                a7.append(this.f2421j.get(i2));
                a5 = a7.toString();
            }
        }
        return C1142f.m3365a(a5, ")");
    }

    /* renamed from: b */
    public C0592g mo2774b(C0596d dVar) {
        if (this.f2432u == null) {
            this.f2432u = new ArrayList<>();
        }
        this.f2432u.add(dVar);
        return this;
    }

    public void cancel() {
        for (int size = this.f2428q.size() - 1; size >= 0; size--) {
            this.f2428q.get(size).cancel();
        }
        ArrayList<C0596d> arrayList = this.f2432u;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2432u.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C0596d) arrayList2.get(i)).mo2738d(this);
            }
        }
    }

    /* renamed from: d */
    public C0592g mo2777d(View view) {
        this.f2421j.add(view);
        return this;
    }

    /* renamed from: f */
    public abstract void mo2720f(C0607n nVar);

    /* renamed from: j */
    public final void mo2778j(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C0607n nVar = new C0607n(view);
                if (z) {
                    mo2721l(nVar);
                } else {
                    mo2720f(nVar);
                }
                nVar.f2463c.add(this);
                mo2779k(nVar);
                m1908e(z ? this.f2422k : this.f2423l, view, nVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    mo2778j(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo2779k(C0607n nVar) {
    }

    /* renamed from: l */
    public abstract void mo2721l(C0607n nVar);

    /* renamed from: m */
    public void mo2780m(ViewGroup viewGroup, boolean z) {
        mo2781n(z);
        if (this.f2420i.size() > 0 || this.f2421j.size() > 0) {
            for (int i = 0; i < this.f2420i.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f2420i.get(i).intValue());
                if (findViewById != null) {
                    C0607n nVar = new C0607n(findViewById);
                    if (z) {
                        mo2721l(nVar);
                    } else {
                        mo2720f(nVar);
                    }
                    nVar.f2463c.add(this);
                    mo2779k(nVar);
                    m1908e(z ? this.f2422k : this.f2423l, findViewById, nVar);
                }
            }
            for (int i2 = 0; i2 < this.f2421j.size(); i2++) {
                View view = this.f2421j.get(i2);
                C0607n nVar2 = new C0607n(view);
                if (z) {
                    mo2721l(nVar2);
                } else {
                    mo2720f(nVar2);
                }
                nVar2.f2463c.add(this);
                mo2779k(nVar2);
                m1908e(z ? this.f2422k : this.f2423l, view, nVar2);
            }
            return;
        }
        mo2778j(viewGroup, z);
    }

    /* renamed from: n */
    public void mo2781n(boolean z) {
        C1592d dVar;
        if (z) {
            ((C1545a) this.f2422k.f4936a).clear();
            ((SparseArray) this.f2422k.f4937b).clear();
            dVar = this.f2422k;
        } else {
            ((C1545a) this.f2423l.f4936a).clear();
            ((SparseArray) this.f2423l.f4937b).clear();
            dVar = this.f2423l;
        }
        ((C1550e) dVar.f4938c).mo5531b();
    }

    /* renamed from: o */
    public C0592g clone() {
        try {
            C0592g gVar = (C0592g) super.clone();
            gVar.f2433v = new ArrayList<>();
            gVar.f2422k = new C1592d(2);
            gVar.f2423l = new C1592d(2);
            gVar.f2426o = null;
            gVar.f2427p = null;
            return gVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public Animator mo2722p(ViewGroup viewGroup, C0607n nVar, C0607n nVar2) {
        return null;
    }

    /* renamed from: q */
    public void mo2783q(ViewGroup viewGroup, C1592d dVar, C1592d dVar2, ArrayList<C0607n> arrayList, ArrayList<C0607n> arrayList2) {
        int i;
        Animator p;
        Animator animator;
        C0607n nVar;
        View view;
        C0607n nVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C1545a<Animator, C0594b> t = m1909t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C0607n nVar3 = arrayList.get(i2);
            C0607n nVar4 = arrayList2.get(i2);
            if (nVar3 != null && !nVar3.f2463c.contains(this)) {
                nVar3 = null;
            }
            if (nVar4 != null && !nVar4.f2463c.contains(this)) {
                nVar4 = null;
            }
            if (!(nVar3 == null && nVar4 == null)) {
                if ((nVar3 == null || nVar4 == null || mo2788w(nVar3, nVar4)) && (p = mo2722p(viewGroup2, nVar3, nVar4)) != null) {
                    if (nVar4 != null) {
                        View view2 = nVar4.f2462b;
                        String[] u = mo2723u();
                        if (u != null && u.length > 0) {
                            nVar2 = new C0607n(view2);
                            C0607n nVar5 = (C0607n) ((C1545a) dVar2.f4936a).get(view2);
                            if (nVar5 != null) {
                                int i3 = 0;
                                while (i3 < u.length) {
                                    nVar2.f2461a.put(u[i3], nVar5.f2461a.get(u[i3]));
                                    i3++;
                                    p = p;
                                    size = size;
                                    nVar5 = nVar5;
                                }
                            }
                            Animator animator3 = p;
                            i = size;
                            int i4 = t.f4840g;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator2 = animator3;
                                    break;
                                }
                                C0594b bVar = t.get(t.mo5614i(i5));
                                if (bVar.f2438c != null && bVar.f2436a == view2 && bVar.f2437b.equals(this.f2416e) && bVar.f2438c.equals(nVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            C1592d dVar3 = dVar2;
                            i = size;
                            animator2 = p;
                            nVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        nVar = nVar2;
                    } else {
                        C1592d dVar4 = dVar2;
                        i = size;
                        view = nVar3.f2462b;
                        animator = p;
                        nVar = null;
                    }
                    if (animator != null) {
                        String str = this.f2416e;
                        C0617v vVar = C0609p.f2465a;
                        t.put(animator, new C0594b(view, str, this, new C0622y(viewGroup2), nVar));
                        this.f2433v.add(animator);
                    }
                    i2++;
                    size = i;
                }
            }
            C1592d dVar5 = dVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f2433v.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: r */
    public void mo2784r() {
        int i = this.f2429r - 1;
        this.f2429r = i;
        if (i == 0) {
            ArrayList<C0596d> arrayList = this.f2432u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2432u.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0596d) arrayList2.get(i2)).mo2739e(this);
                }
            }
            for (int i3 = 0; i3 < ((C1550e) this.f2422k.f4938c).mo5538l(); i3++) {
                View view = (View) ((C1550e) this.f2422k.f4938c).mo5539m(i3);
                if (view != null) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C1550e) this.f2423l.f4938c).mo5538l(); i4++) {
                View view2 = (View) ((C1550e) this.f2423l.f4938c).mo5539m(i4);
                if (view2 != null) {
                    WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                    view2.setHasTransientState(false);
                }
            }
            this.f2431t = true;
        }
    }

    /* renamed from: s */
    public C0607n mo2785s(View view, boolean z) {
        C0603l lVar = this.f2424m;
        if (lVar != null) {
            return lVar.mo2785s(view, z);
        }
        ArrayList<C0607n> arrayList = z ? this.f2426o : this.f2427p;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0607n nVar = arrayList.get(i2);
            if (nVar == null) {
                return null;
            }
            if (nVar.f2462b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f2427p : this.f2426o).get(i);
    }

    public String toString() {
        return mo2773L("");
    }

    /* renamed from: u */
    public String[] mo2723u() {
        return null;
    }

    /* renamed from: v */
    public C0607n mo2787v(View view, boolean z) {
        C0603l lVar = this.f2424m;
        if (lVar != null) {
            return lVar.mo2787v(view, z);
        }
        return (C0607n) ((C1545a) (z ? this.f2422k : this.f2423l).f4936a).getOrDefault(view, null);
    }

    /* renamed from: w */
    public boolean mo2788w(C0607n nVar, C0607n nVar2) {
        if (nVar == null || nVar2 == null) {
            return false;
        }
        String[] u = mo2723u();
        if (u != null) {
            int length = u.length;
            int i = 0;
            while (i < length) {
                if (!m1910y(nVar, nVar2, u[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String y : nVar.f2461a.keySet()) {
            if (m1910y(nVar, nVar2, y)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: x */
    public boolean mo2789x(View view) {
        return (this.f2420i.size() == 0 && this.f2421j.size() == 0) || this.f2420i.contains(Integer.valueOf(view.getId())) || this.f2421j.contains(view);
    }

    /* renamed from: z */
    public void mo2790z(View view) {
        int i;
        if (!this.f2431t) {
            C1545a<Animator, C0594b> t = m1909t();
            int i2 = t.f4840g;
            C0617v vVar = C0609p.f2465a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C0594b l = t.mo5618l(i3);
                if (l.f2436a != null) {
                    C0623z zVar = l.f2439d;
                    if ((zVar instanceof C0622y) && ((C0622y) zVar).f2492a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        t.mo5614i(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<C0596d> arrayList = this.f2432u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2432u.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((C0596d) arrayList2.get(i)).mo2737c(this);
                    i++;
                }
            }
            this.f2430s = true;
        }
    }
}
