package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0263a0;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0296o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p034f0.C0885a;
import p058j0.C1060n;
import p058j0.C1061o;
import p058j0.C1070q;
import p093p.C1545a;
import p093p.C1552g;
import p106r0.C1633a;
import p106r0.C1665s;

/* renamed from: androidx.fragment.app.c */
public class C0273c extends C0263a0 {

    /* renamed from: androidx.fragment.app.c$a */
    public class C0274a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ List f1399e;

        /* renamed from: f */
        public final /* synthetic */ C0263a0.C0267d f1400f;

        public C0274a(List list, C0263a0.C0267d dVar) {
            this.f1399e = list;
            this.f1400f = dVar;
        }

        public void run() {
            if (this.f1399e.contains(this.f1400f)) {
                this.f1399e.remove(this.f1400f);
                C0273c cVar = C0273c.this;
                C0263a0.C0267d dVar = this.f1400f;
                Objects.requireNonNull(cVar);
                dVar.f1368a.mo1560a(dVar.f1370c.f1441J);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public static class C0275b extends C0276c {

        /* renamed from: c */
        public boolean f1402c;

        /* renamed from: d */
        public boolean f1403d = false;

        /* renamed from: e */
        public C0296o.C0297a f1404e;

        public C0275b(C0263a0.C0267d dVar, C0885a aVar, boolean z) {
            super(dVar, aVar);
            this.f1402c = z;
        }

        /* renamed from: c */
        public C0296o.C0297a mo1569c(Context context) {
            if (this.f1403d) {
                return this.f1404e;
            }
            C0263a0.C0267d dVar = this.f1405a;
            C0296o.C0297a a = C0296o.m846a(context, dVar.f1370c, dVar.f1368a == C0263a0.C0267d.C0270c.VISIBLE, this.f1402c);
            this.f1404e = a;
            this.f1403d = true;
            return a;
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    public static class C0276c {

        /* renamed from: a */
        public final C0263a0.C0267d f1405a;

        /* renamed from: b */
        public final C0885a f1406b;

        public C0276c(C0263a0.C0267d dVar, C0885a aVar) {
            this.f1405a = dVar;
            this.f1406b = aVar;
        }

        /* renamed from: a */
        public void mo1570a() {
            C0263a0.C0267d dVar = this.f1405a;
            if (dVar.f1372e.remove(this.f1406b) && dVar.f1372e.isEmpty()) {
                dVar.mo1554b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.C0263a0.C0267d.C0270c.VISIBLE;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1571b() {
            /*
                r3 = this;
                androidx.fragment.app.a0$d r0 = r3.f1405a
                androidx.fragment.app.k r0 = r0.f1370c
                android.view.View r0 = r0.f1441J
                androidx.fragment.app.a0$d$c r0 = androidx.fragment.app.C0263a0.C0267d.C0270c.m768c(r0)
                androidx.fragment.app.a0$d r1 = r3.f1405a
                androidx.fragment.app.a0$d$c r1 = r1.f1368a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.a0$d$c r2 = androidx.fragment.app.C0263a0.C0267d.C0270c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0273c.C0276c.mo1571b():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    public static class C0277d extends C0276c {

        /* renamed from: c */
        public final Object f1407c;

        /* renamed from: d */
        public final boolean f1408d;

        /* renamed from: e */
        public final Object f1409e;

        public C0277d(C0263a0.C0267d dVar, C0885a aVar, boolean z, boolean z2) {
            super(dVar, aVar);
            Object obj;
            Object obj2;
            if (dVar.f1368a == C0263a0.C0267d.C0270c.VISIBLE) {
                if (z) {
                    obj2 = dVar.f1370c.mo1643v();
                } else {
                    dVar.f1370c.mo1628l();
                    obj2 = null;
                }
                this.f1407c = obj2;
                if (z) {
                    C0286k.C0288b bVar = dVar.f1370c.f1444M;
                } else {
                    C0286k.C0288b bVar2 = dVar.f1370c.f1444M;
                }
            } else {
                if (z) {
                    obj = dVar.f1370c.mo1645x();
                } else {
                    dVar.f1370c.mo1632o();
                    obj = null;
                }
                this.f1407c = obj;
            }
            this.f1408d = true;
            if (z2) {
                if (z) {
                    this.f1409e = dVar.f1370c.mo1647z();
                    return;
                }
                dVar.f1370c.mo1646y();
            }
            this.f1409e = null;
        }

        /* renamed from: c */
        public final C1665s mo1572c(Object obj) {
            if (obj == null) {
                return null;
            }
            C1665s sVar = C0329z.f1637b;
            if (obj instanceof Transition) {
                return sVar;
            }
            C1665s sVar2 = C0329z.f1638c;
            if (sVar2 != null && sVar2.mo2747e(obj)) {
                return sVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1405a.f1370c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C0273c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: b */
    public void mo1546b(List<C0263a0.C0267d> list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0263a0.C0267d.C0270c cVar;
        boolean z2;
        HashMap hashMap;
        boolean z3;
        String str;
        StringBuilder sb;
        boolean z4;
        boolean z5;
        C0296o.C0297a c;
        Iterator it;
        C0263a0.C0267d dVar;
        Object obj;
        View view;
        C0263a0.C0267d.C0270c cVar2;
        Object obj2;
        C0263a0.C0267d dVar2;
        C0263a0.C0267d.C0270c cVar3;
        View view2;
        Object obj3;
        C1545a aVar;
        ArrayList arrayList3;
        C0263a0.C0267d.C0270c cVar4;
        ArrayList arrayList4;
        C0263a0.C0267d dVar3;
        ArrayList arrayList5;
        C0263a0.C0267d dVar4;
        C1665s sVar;
        HashMap hashMap2;
        ArrayList arrayList6;
        Rect rect;
        C0263a0.C0267d dVar5;
        View view3;
        View view4;
        Rect rect2;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        View view5;
        int i;
        View view6;
        boolean z6 = z;
        C0263a0.C0267d.C0270c cVar5 = C0263a0.C0267d.C0270c.GONE;
        C0263a0.C0267d.C0270c cVar6 = C0263a0.C0267d.C0270c.VISIBLE;
        C0263a0.C0267d dVar6 = null;
        C0263a0.C0267d dVar7 = null;
        for (C0263a0.C0267d next : list) {
            C0263a0.C0267d.C0270c c2 = C0263a0.C0267d.C0270c.m768c(next.f1370c.f1441J);
            int ordinal = next.f1368a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (!(ordinal == 2 || ordinal == 3)) {
                    }
                } else if (c2 != cVar6) {
                    dVar7 = next;
                }
            }
            if (c2 == cVar6 && dVar6 == null) {
                dVar6 = next;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<C0263a0.C0267d> it2 = list.iterator();
        while (it2.hasNext()) {
            C0263a0.C0267d next2 = it2.next();
            C0885a aVar2 = new C0885a();
            next2.mo1555d();
            next2.f1372e.add(aVar2);
            arrayList11.add(new C0275b(next2, aVar2, z6));
            C0885a aVar3 = new C0885a();
            next2.mo1555d();
            next2.f1372e.add(aVar3);
            arrayList12.add(new C0277d(next2, aVar3, z6, !z6 ? next2 == dVar7 : next2 == dVar6));
            next2.f1371d.add(new C0274a(arrayList13, next2));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList12.iterator();
        C1665s sVar2 = null;
        while (it3.hasNext()) {
            C0277d dVar8 = (C0277d) it3.next();
            if (!dVar8.mo1571b()) {
                C1665s c3 = dVar8.mo1572c(dVar8.f1407c);
                C1665s c4 = dVar8.mo1572c(dVar8.f1409e);
                if (c3 == null || c4 == null || c3 == c4) {
                    if (c3 == null) {
                        c3 = c4;
                    }
                    if (sVar2 == null) {
                        sVar2 = c3;
                    } else if (!(c3 == null || sVar2 == c3)) {
                        StringBuilder a = C0001b.m0a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        a.append(dVar8.f1405a.f1370c);
                        a.append(" returned Transition ");
                        a.append(dVar8.f1407c);
                        a.append(" which uses a different Transition  type than other Fragments.");
                        throw new IllegalArgumentException(a.toString());
                    }
                } else {
                    StringBuilder a2 = C0001b.m0a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    a2.append(dVar8.f1405a.f1370c);
                    a2.append(" returned Transition ");
                    a2.append(dVar8.f1407c);
                    a2.append(" which uses a different Transition  type than its shared element transition ");
                    a2.append(dVar8.f1409e);
                    throw new IllegalArgumentException(a2.toString());
                }
            }
        }
        if (sVar2 == null) {
            Iterator it4 = arrayList12.iterator();
            while (it4.hasNext()) {
                C0277d dVar9 = (C0277d) it4.next();
                hashMap3.put(dVar9.f1405a, Boolean.FALSE);
                dVar9.mo1570a();
            }
            z3 = false;
            z2 = true;
            arrayList2 = arrayList11;
            arrayList = arrayList13;
            cVar = cVar5;
            hashMap = hashMap3;
        } else {
            View view7 = new View(this.f1358a.getContext());
            Rect rect3 = new Rect();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            C1545a aVar4 = new C1545a();
            Iterator it5 = arrayList12.iterator();
            Rect rect4 = rect3;
            arrayList2 = arrayList11;
            Object obj4 = null;
            View view8 = null;
            boolean z7 = false;
            View view9 = view7;
            C0263a0.C0267d dVar10 = dVar6;
            C0263a0.C0267d dVar11 = dVar7;
            while (it5.hasNext()) {
                C0263a0.C0267d.C0270c cVar7 = cVar6;
                Object obj5 = ((C0277d) it5.next()).f1409e;
                if (!(obj5 != null) || dVar10 == null || dVar11 == null) {
                    aVar = aVar4;
                    arrayList6 = arrayList14;
                    cVar4 = cVar5;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    hashMap2 = hashMap3;
                    view4 = view9;
                    dVar3 = dVar7;
                    dVar4 = dVar6;
                    sVar = sVar2;
                    rect2 = rect4;
                } else {
                    Object y = sVar2.mo2760y(sVar2.mo2748g(obj5));
                    C0286k.C0288b bVar = dVar11.f1370c.f1444M;
                    if (bVar == null || (arrayList7 = bVar.f1487i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    C1665s sVar3 = sVar2;
                    C0286k.C0288b bVar2 = dVar10.f1370c.f1444M;
                    if (bVar2 == null || (arrayList8 = bVar2.f1487i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList4 = arrayList13;
                    C0286k.C0288b bVar3 = dVar10.f1370c.f1444M;
                    if (bVar3 == null || (arrayList9 = bVar3.f1488j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    cVar4 = cVar5;
                    arrayList3 = arrayList12;
                    int i2 = 0;
                    while (i2 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i2));
                        ArrayList<String> arrayList16 = arrayList9;
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i2));
                        }
                        i2++;
                        arrayList9 = arrayList16;
                    }
                    C0286k.C0288b bVar4 = dVar11.f1370c.f1444M;
                    if (bVar4 == null || (arrayList10 = bVar4.f1488j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList10;
                    if (!z6) {
                        dVar10.f1370c.mo1636p();
                        dVar11.f1370c.mo1630m();
                    } else {
                        dVar10.f1370c.mo1630m();
                        dVar11.f1370c.mo1636p();
                    }
                    int i3 = 0;
                    for (int size = arrayList7.size(); i3 < size; size = size) {
                        aVar4.put(arrayList7.get(i3), arrayList17.get(i3));
                        i3++;
                    }
                    C1545a aVar5 = new C1545a();
                    mo1566k(aVar5, dVar10.f1370c.f1441J);
                    C1552g.m4322k(aVar5, arrayList7);
                    C1552g.m4322k(aVar4, aVar5.keySet());
                    C1545a aVar6 = new C1545a();
                    mo1566k(aVar6, dVar11.f1370c.f1441J);
                    C1552g.m4322k(aVar6, arrayList17);
                    C1552g.m4322k(aVar6, aVar4.values());
                    C0329z.m970m(aVar4, aVar6);
                    mo1567l(aVar5, aVar4.keySet());
                    mo1567l(aVar6, aVar4.values());
                    if (aVar4.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj4 = null;
                        rect2 = rect4;
                        aVar = aVar4;
                        arrayList6 = arrayList14;
                        dVar3 = dVar7;
                        hashMap2 = hashMap3;
                        view4 = view9;
                        dVar4 = dVar6;
                        sVar = sVar3;
                    } else {
                        C0329z.m960c(dVar11.f1370c, dVar10.f1370c, z6, aVar5, true);
                        aVar = aVar4;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList14;
                        C0263a0.C0267d dVar12 = dVar7;
                        C0263a0.C0267d dVar13 = dVar7;
                        Rect rect5 = rect4;
                        ArrayList<String> arrayList18 = arrayList7;
                        C0263a0.C0267d dVar14 = dVar6;
                        C0263a0.C0267d dVar15 = dVar6;
                        HashMap hashMap4 = hashMap3;
                        C0282g gVar = r0;
                        View view10 = view9;
                        Rect rect6 = rect5;
                        sVar = sVar3;
                        ViewGroup viewGroup = this.f1358a;
                        C0282g gVar2 = new C0282g(this, dVar12, dVar14, z, aVar6);
                        C1060n.m3018a(viewGroup, gVar);
                        arrayList6.addAll(aVar5.values());
                        if (!arrayList18.isEmpty()) {
                            i = 0;
                            view5 = (View) aVar5.get(arrayList18.get(0));
                            sVar.mo2756t(y, view5);
                        } else {
                            i = 0;
                            view5 = view8;
                        }
                        arrayList5.addAll(aVar6.values());
                        if (arrayList17.isEmpty() || (view6 = (View) aVar6.get(arrayList17.get(i))) == null) {
                            rect = rect6;
                            view3 = view10;
                        } else {
                            rect = rect6;
                            C1060n.m3018a(this.f1358a, new C0283h(this, sVar, view6, rect));
                            view3 = view10;
                            z7 = true;
                        }
                        sVar.mo2758w(y, view3, arrayList6);
                        sVar.mo2754r(y, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, y, arrayList5);
                        Boolean bool = Boolean.TRUE;
                        dVar4 = dVar15;
                        hashMap2 = hashMap4;
                        hashMap2.put(dVar4, bool);
                        dVar3 = dVar13;
                        hashMap2.put(dVar3, bool);
                        view8 = view5;
                        obj4 = y;
                        dVar10 = dVar4;
                        dVar5 = dVar3;
                        view9 = view3;
                        rect4 = rect;
                        arrayList14 = arrayList6;
                        hashMap3 = hashMap2;
                        sVar2 = sVar;
                        dVar6 = dVar4;
                        dVar7 = dVar3;
                        cVar6 = cVar7;
                        arrayList13 = arrayList4;
                        cVar5 = cVar4;
                        arrayList12 = arrayList3;
                        aVar4 = aVar;
                        z6 = z;
                        ArrayList arrayList19 = arrayList5;
                        dVar11 = dVar5;
                        arrayList15 = arrayList19;
                    }
                }
                C0263a0.C0267d dVar16 = dVar11;
                arrayList5 = arrayList15;
                dVar5 = dVar16;
                view9 = view3;
                rect4 = rect;
                arrayList14 = arrayList6;
                hashMap3 = hashMap2;
                sVar2 = sVar;
                dVar6 = dVar4;
                dVar7 = dVar3;
                cVar6 = cVar7;
                arrayList13 = arrayList4;
                cVar5 = cVar4;
                arrayList12 = arrayList3;
                aVar4 = aVar;
                z6 = z;
                ArrayList arrayList192 = arrayList5;
                dVar11 = dVar5;
                arrayList15 = arrayList192;
            }
            C1545a aVar7 = aVar4;
            ArrayList arrayList20 = arrayList14;
            C1665s sVar4 = sVar2;
            C0263a0.C0267d.C0270c cVar8 = cVar5;
            C0263a0.C0267d.C0270c cVar9 = cVar6;
            ArrayList arrayList21 = arrayList12;
            arrayList = arrayList13;
            hashMap = hashMap3;
            View view11 = view9;
            Rect rect7 = rect4;
            C0263a0.C0267d dVar17 = dVar7;
            C0263a0.C0267d dVar18 = dVar11;
            ArrayList arrayList22 = arrayList15;
            C0263a0.C0267d dVar19 = dVar18;
            ArrayList arrayList23 = new ArrayList();
            Iterator it6 = arrayList21.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (it6.hasNext()) {
                C0277d dVar20 = (C0277d) it6.next();
                if (dVar20.mo1571b()) {
                    it = it6;
                    dVar = dVar17;
                    hashMap.put(dVar20.f1405a, Boolean.FALSE);
                    dVar20.mo1570a();
                    view = view11;
                    dVar2 = dVar19;
                    obj = obj4;
                    obj2 = obj6;
                    view2 = view8;
                    cVar3 = cVar9;
                    cVar2 = cVar8;
                } else {
                    it = it6;
                    dVar = dVar17;
                    Object g = sVar4.mo2748g(dVar20.f1407c);
                    C0263a0.C0267d dVar21 = dVar20.f1405a;
                    boolean z8 = obj4 != null && (dVar21 == dVar10 || dVar21 == dVar19);
                    if (g == null) {
                        if (!z8) {
                            hashMap.put(dVar21, Boolean.FALSE);
                            dVar20.mo1570a();
                        }
                        view = view11;
                        obj = obj4;
                        obj3 = obj6;
                        view2 = view8;
                        cVar3 = cVar9;
                        cVar2 = cVar8;
                    } else {
                        obj = obj4;
                        ArrayList arrayList24 = new ArrayList();
                        Object obj8 = obj6;
                        mo1565j(arrayList24, dVar21.f1370c.f1441J);
                        if (z8) {
                            if (dVar21 == dVar10) {
                                arrayList24.removeAll(arrayList20);
                            } else {
                                arrayList24.removeAll(arrayList22);
                            }
                        }
                        if (arrayList24.isEmpty()) {
                            sVar4.mo2744a(g, view11);
                            view = view11;
                            cVar2 = cVar8;
                        } else {
                            sVar4.mo2745b(g, arrayList24);
                            sVar4.mo2754r(g, g, arrayList24, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                            cVar2 = cVar8;
                            if (dVar21.f1368a == cVar2) {
                                arrayList.remove(dVar21);
                                view = view11;
                                ArrayList arrayList25 = new ArrayList(arrayList24);
                                arrayList25.remove(dVar21.f1370c.f1441J);
                                sVar4.mo2753q(g, dVar21.f1370c.f1441J, arrayList25);
                                C1060n.m3018a(this.f1358a, new C0284i(this, arrayList24));
                            } else {
                                view = view11;
                            }
                        }
                        cVar3 = cVar9;
                        if (dVar21.f1368a == cVar3) {
                            arrayList23.addAll(arrayList24);
                            if (z7) {
                                sVar4.mo2755s(g, rect7);
                            }
                            view2 = view8;
                        } else {
                            view2 = view8;
                            sVar4.mo2756t(g, view2);
                        }
                        hashMap.put(dVar21, Boolean.TRUE);
                        if (dVar20.f1408d) {
                            obj7 = sVar4.mo2750m(obj7, g, (Object) null);
                            obj3 = obj8;
                        } else {
                            obj3 = sVar4.mo2750m(obj8, g, (Object) null);
                        }
                    }
                    obj2 = obj3;
                    dVar2 = dVar;
                }
                it6 = it;
                view8 = view2;
                cVar9 = cVar3;
                dVar19 = dVar2;
                cVar8 = cVar2;
                view11 = view;
                dVar17 = dVar;
                obj6 = obj2;
                obj4 = obj;
            }
            Object obj9 = obj4;
            C0263a0.C0267d dVar22 = dVar17;
            Object obj10 = obj6;
            cVar = cVar8;
            Object l = sVar4.mo2749l(obj7, obj10, obj9);
            Iterator it7 = arrayList21.iterator();
            while (it7.hasNext()) {
                C0277d dVar23 = (C0277d) it7.next();
                if (!dVar23.mo1571b()) {
                    Object obj11 = dVar23.f1407c;
                    C0263a0.C0267d dVar24 = dVar23.f1405a;
                    C0263a0.C0267d dVar25 = dVar22;
                    boolean z9 = obj9 != null && (dVar24 == dVar10 || dVar24 == dVar25);
                    if (obj11 != null || z9) {
                        ViewGroup viewGroup2 = this.f1358a;
                        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                        if (!viewGroup2.isLaidOut()) {
                            if (C0302r.m864N(2)) {
                                Objects.toString(this.f1358a);
                                Objects.toString(dVar24);
                            }
                            dVar23.mo1570a();
                        } else {
                            sVar4.mo2757u(dVar23.f1405a.f1370c, l, dVar23.f1406b, new C0285j(this, dVar23));
                        }
                    }
                    dVar22 = dVar25;
                }
            }
            ViewGroup viewGroup3 = this.f1358a;
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            if (!viewGroup3.isLaidOut()) {
                z3 = false;
            } else {
                C0329z.m972o(arrayList23, 4);
                ArrayList<String> n = sVar4.mo5855n(arrayList22);
                sVar4.mo2746c(this.f1358a, l);
                sVar4.mo5856v(this.f1358a, arrayList20, arrayList22, n, aVar7);
                z3 = false;
                C0329z.m972o(arrayList23, 0);
                sVar4.mo2759x(obj9, arrayList20, arrayList22);
            }
            z2 = true;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup4 = this.f1358a;
        Context context = viewGroup4.getContext();
        ArrayList arrayList26 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        boolean z10 = z3;
        while (it8.hasNext()) {
            C0275b bVar5 = (C0275b) it8.next();
            if (!bVar5.mo1571b() && (c = bVar5.mo1569c(context)) != null) {
                Animator animator = c.f1508b;
                if (animator == null) {
                    arrayList26.add(bVar5);
                    z4 = z3;
                    z5 = z4;
                } else {
                    C0263a0.C0267d dVar26 = bVar5.f1405a;
                    C0286k kVar = dVar26.f1370c;
                    z4 = z3;
                    if (!Boolean.TRUE.equals(hashMap.get(dVar26))) {
                        boolean z11 = dVar26.f1368a == cVar ? z2 : z4;
                        ArrayList arrayList27 = arrayList;
                        if (z11) {
                            arrayList27.remove(dVar26);
                        }
                        View view12 = kVar.f1441J;
                        viewGroup4.startViewTransition(view12);
                        ArrayList arrayList28 = arrayList27;
                        HashMap hashMap5 = hashMap;
                        C0278d dVar27 = r0;
                        boolean z12 = z2;
                        Animator animator2 = animator;
                        C0278d dVar28 = new C0278d(this, viewGroup4, view12, z11, dVar26, bVar5);
                        animator2.addListener(dVar27);
                        animator2.setTarget(view12);
                        animator2.start();
                        bVar5.f1406b.mo4191b(new C1633a(this, animator2));
                        z5 = false;
                        z10 = z12;
                        z2 = z10;
                        arrayList = arrayList28;
                        hashMap = hashMap5;
                    } else if (C0302r.m864N(2)) {
                        Objects.toString(kVar);
                    }
                }
            } else {
                z4 = z3;
            }
            bVar5.mo1570a();
            z5 = z4;
        }
        ArrayList arrayList29 = arrayList;
        Iterator it9 = arrayList26.iterator();
        while (it9.hasNext()) {
            C0275b bVar6 = (C0275b) it9.next();
            C0263a0.C0267d dVar29 = bVar6.f1405a;
            C0286k kVar2 = dVar29.f1370c;
            if (containsValue) {
                if (C0302r.m864N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(kVar2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                bVar6.mo1570a();
            } else if (z10) {
                if (C0302r.m864N(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(kVar2);
                    str = " as Animations cannot run alongside Animators.";
                }
                bVar6.mo1570a();
            } else {
                View view13 = kVar2.f1441J;
                C0296o.C0297a c5 = bVar6.mo1569c(context);
                Objects.requireNonNull(c5);
                Animation animation = c5.f1507a;
                Objects.requireNonNull(animation);
                if (dVar29.f1368a != C0263a0.C0267d.C0270c.REMOVED) {
                    view13.startAnimation(animation);
                    bVar6.mo1570a();
                } else {
                    viewGroup4.startViewTransition(view13);
                    C0296o.C0298b bVar7 = new C0296o.C0298b(animation, viewGroup4, view13);
                    bVar7.setAnimationListener(new C0279e(this, viewGroup4, view13, bVar6));
                    view13.startAnimation(bVar7);
                }
                bVar6.f1406b.mo4191b(new C0281f(this, view13, viewGroup4, bVar6));
            }
            sb.append(str);
            bVar6.mo1570a();
        }
        Iterator it10 = arrayList29.iterator();
        while (it10.hasNext()) {
            C0263a0.C0267d dVar30 = (C0263a0.C0267d) it10.next();
            dVar30.f1368a.mo1560a(dVar30.f1370c.f1441J);
        }
        arrayList29.clear();
    }

    /* renamed from: j */
    public void mo1565j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo1565j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: k */
    public void mo1566k(Map<String, View> map, View view) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo1566k(map, childAt);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo1567l(C1545a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((C1552g.C1554b) aVar.entrySet()).iterator();
        while (true) {
            C1552g.C1556d dVar = (C1552g.C1556d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (!collection.contains(((View) dVar.getValue()).getTransitionName())) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
