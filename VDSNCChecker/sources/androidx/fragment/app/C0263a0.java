package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0131a0;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p034f0.C0885a;
import p058j0.C1061o;
import p058j0.C1070q;
import p099q.C1599h;
import p106r0.C1672y;

/* renamed from: androidx.fragment.app.a0 */
public abstract class C0263a0 {

    /* renamed from: a */
    public final ViewGroup f1358a;

    /* renamed from: b */
    public final ArrayList<C0267d> f1359b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C0267d> f1360c = new ArrayList<>();

    /* renamed from: d */
    public boolean f1361d = false;

    /* renamed from: e */
    public boolean f1362e = false;

    /* renamed from: androidx.fragment.app.a0$a */
    public class C0264a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C0266c f1363e;

        public C0264a(C0266c cVar) {
            this.f1363e = cVar;
        }

        public void run() {
            if (C0263a0.this.f1359b.contains(this.f1363e)) {
                C0266c cVar = this.f1363e;
                cVar.f1368a.mo1560a(cVar.f1370c.f1441J);
            }
        }
    }

    /* renamed from: androidx.fragment.app.a0$b */
    public class C0265b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C0266c f1365e;

        public C0265b(C0266c cVar) {
            this.f1365e = cVar;
        }

        public void run() {
            C0263a0.this.f1359b.remove(this.f1365e);
            C0263a0.this.f1360c.remove(this.f1365e);
        }
    }

    /* renamed from: androidx.fragment.app.a0$c */
    public static class C0266c extends C0267d {

        /* renamed from: h */
        public final C0321t f1367h;

        public C0266c(C0267d.C0270c cVar, C0267d.C0269b bVar, C0321t tVar, C0885a aVar) {
            super(cVar, bVar, tVar.f1583c, aVar);
            this.f1367h = tVar;
        }

        /* renamed from: b */
        public void mo1554b() {
            super.mo1554b();
            this.f1367h.mo1763k();
        }

        /* renamed from: d */
        public void mo1555d() {
            if (this.f1369b == C0267d.C0269b.ADDING) {
                C0286k kVar = this.f1367h.f1583c;
                View findFocus = kVar.f1441J.findFocus();
                if (findFocus != null) {
                    kVar.mo1616f().f1493o = findFocus;
                    if (C0302r.m864N(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(kVar);
                    }
                }
                View c0 = this.f1370c.mo1612c0();
                if (c0.getParent() == null) {
                    this.f1367h.mo1754b();
                    c0.setAlpha(0.0f);
                }
                if (c0.getAlpha() == 0.0f && c0.getVisibility() == 0) {
                    c0.setVisibility(4);
                }
                C0286k.C0288b bVar = kVar.f1444M;
                c0.setAlpha(bVar == null ? 1.0f : bVar.f1492n);
            }
        }
    }

    /* renamed from: androidx.fragment.app.a0$d */
    public static class C0267d {

        /* renamed from: a */
        public C0270c f1368a;

        /* renamed from: b */
        public C0269b f1369b;

        /* renamed from: c */
        public final C0286k f1370c;

        /* renamed from: d */
        public final List<Runnable> f1371d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C0885a> f1372e = new HashSet<>();

        /* renamed from: f */
        public boolean f1373f = false;

        /* renamed from: g */
        public boolean f1374g = false;

        /* renamed from: androidx.fragment.app.a0$d$a */
        public class C0268a implements C0885a.C0886a {
            public C0268a() {
            }

            /* renamed from: a */
            public void mo1559a() {
                C0267d.this.mo1556a();
            }
        }

        /* renamed from: androidx.fragment.app.a0$d$b */
        public enum C0269b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.a0$d$c */
        public enum C0270c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static C0270c m767b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(C0131a0.m344a("Unknown visibility ", i));
            }

            /* renamed from: c */
            public static C0270c m768c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m767b(view.getVisibility());
            }

            /* renamed from: a */
            public void mo1560a(View view) {
                int i;
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (C0302r.m864N(2)) {
                            Objects.toString(view);
                        }
                        i = 0;
                    } else if (ordinal == 2) {
                        if (C0302r.m864N(2)) {
                            Objects.toString(view);
                        }
                        i = 8;
                    } else if (ordinal == 3) {
                        if (C0302r.m864N(2)) {
                            Objects.toString(view);
                        }
                        i = 4;
                    } else {
                        return;
                    }
                    view.setVisibility(i);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (C0302r.m864N(2)) {
                        view.toString();
                        viewGroup.toString();
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public C0267d(C0270c cVar, C0269b bVar, C0286k kVar, C0885a aVar) {
            this.f1368a = cVar;
            this.f1369b = bVar;
            this.f1370c = kVar;
            aVar.mo4191b(new C0268a());
        }

        /* renamed from: a */
        public final void mo1556a() {
            if (!this.f1373f) {
                this.f1373f = true;
                if (this.f1372e.isEmpty()) {
                    mo1554b();
                    return;
                }
                Iterator it = new ArrayList(this.f1372e).iterator();
                while (it.hasNext()) {
                    ((C0885a) it.next()).mo4190a();
                }
            }
        }

        /* renamed from: b */
        public void mo1554b() {
            if (!this.f1374g) {
                if (C0302r.m864N(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.f1374g = true;
                for (Runnable run : this.f1371d) {
                    run.run();
                }
            }
        }

        /* renamed from: c */
        public final void mo1557c(C0270c cVar, C0269b bVar) {
            C0269b bVar2;
            C0270c cVar2 = C0270c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (C0302r.m864N(2)) {
                            Objects.toString(this.f1370c);
                            Objects.toString(this.f1368a);
                            Objects.toString(this.f1369b);
                        }
                        this.f1368a = cVar2;
                        bVar2 = C0269b.REMOVING;
                    } else {
                        return;
                    }
                } else if (this.f1368a == cVar2) {
                    if (C0302r.m864N(2)) {
                        Objects.toString(this.f1370c);
                        Objects.toString(this.f1369b);
                    }
                    this.f1368a = C0270c.VISIBLE;
                    bVar2 = C0269b.ADDING;
                } else {
                    return;
                }
                this.f1369b = bVar2;
            } else if (this.f1368a != cVar2) {
                if (C0302r.m864N(2)) {
                    Objects.toString(this.f1370c);
                    Objects.toString(this.f1368a);
                    Objects.toString(cVar);
                }
                this.f1368a = cVar;
            }
        }

        /* renamed from: d */
        public void mo1555d() {
        }

        public String toString() {
            StringBuilder a = C1599h.m4503a("Operation ", "{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append("} ");
            a.append("{");
            a.append("mFinalState = ");
            a.append(this.f1368a);
            a.append("} ");
            a.append("{");
            a.append("mLifecycleImpact = ");
            a.append(this.f1369b);
            a.append("} ");
            a.append("{");
            a.append("mFragment = ");
            a.append(this.f1370c);
            a.append("}");
            return a.toString();
        }
    }

    public C0263a0(ViewGroup viewGroup) {
        this.f1358a = viewGroup;
    }

    /* renamed from: f */
    public static C0263a0 m751f(ViewGroup viewGroup, C0302r rVar) {
        return m752g(viewGroup, rVar.mo1685L());
    }

    /* renamed from: g */
    public static C0263a0 m752g(ViewGroup viewGroup, C1672y yVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0263a0) {
            return (C0263a0) tag;
        }
        Objects.requireNonNull((C0302r.C0308f) yVar);
        C0273c cVar = new C0273c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    /* renamed from: a */
    public final void mo1545a(C0267d.C0270c cVar, C0267d.C0269b bVar, C0321t tVar) {
        synchronized (this.f1359b) {
            C0885a aVar = new C0885a();
            C0267d d = mo1548d(tVar.f1583c);
            if (d != null) {
                d.mo1557c(cVar, bVar);
                return;
            }
            C0266c cVar2 = new C0266c(cVar, bVar, tVar, aVar);
            this.f1359b.add(cVar2);
            cVar2.f1371d.add(new C0264a(cVar2));
            cVar2.f1371d.add(new C0265b(cVar2));
        }
    }

    /* renamed from: b */
    public abstract void mo1546b(List<C0267d> list, boolean z);

    /* renamed from: c */
    public void mo1547c() {
        if (!this.f1362e) {
            ViewGroup viewGroup = this.f1358a;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (!viewGroup.isAttachedToWindow()) {
                mo1549e();
                this.f1361d = false;
                return;
            }
            synchronized (this.f1359b) {
                if (!this.f1359b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1360c);
                    this.f1360c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0267d dVar = (C0267d) it.next();
                        if (C0302r.m864N(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(dVar);
                        }
                        dVar.mo1556a();
                        if (!dVar.f1374g) {
                            this.f1360c.add(dVar);
                        }
                    }
                    mo1551i();
                    ArrayList arrayList2 = new ArrayList(this.f1359b);
                    this.f1359b.clear();
                    this.f1360c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0267d) it2.next()).mo1555d();
                    }
                    mo1546b(arrayList2, this.f1361d);
                    this.f1361d = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final C0267d mo1548d(C0286k kVar) {
        Iterator<C0267d> it = this.f1359b.iterator();
        while (it.hasNext()) {
            C0267d next = it.next();
            if (next.f1370c.equals(kVar) && !next.f1373f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo1549e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1358a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1359b) {
            mo1551i();
            Iterator<C0267d> it = this.f1359b.iterator();
            while (it.hasNext()) {
                it.next().mo1555d();
            }
            Iterator it2 = new ArrayList(this.f1360c).iterator();
            while (it2.hasNext()) {
                C0267d dVar = (C0267d) it2.next();
                if (C0302r.m864N(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1358a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                }
                dVar.mo1556a();
            }
            Iterator it3 = new ArrayList(this.f1359b).iterator();
            while (it3.hasNext()) {
                C0267d dVar2 = (C0267d) it3.next();
                if (C0302r.m864N(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.f1358a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                }
                dVar2.mo1556a();
            }
        }
    }

    /* renamed from: h */
    public void mo1550h() {
        synchronized (this.f1359b) {
            mo1551i();
            this.f1362e = false;
            int size = this.f1359b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0267d dVar = this.f1359b.get(size);
                C0267d.C0270c c = C0267d.C0270c.m768c(dVar.f1370c.f1441J);
                C0267d.C0270c cVar = dVar.f1368a;
                C0267d.C0270c cVar2 = C0267d.C0270c.VISIBLE;
                if (cVar == cVar2 && c != cVar2) {
                    this.f1362e = dVar.f1370c.mo1584C();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void mo1551i() {
        Iterator<C0267d> it = this.f1359b.iterator();
        while (it.hasNext()) {
            C0267d next = it.next();
            if (next.f1369b == C0267d.C0269b.ADDING) {
                next.mo1557c(C0267d.C0270c.m767b(next.f1370c.mo1612c0().getVisibility()), C0267d.C0269b.NONE);
            }
        }
    }
}
