package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import p017c1.C0583d;
import p058j0.C1061o;
import p058j0.C1070q;
import p093p.C1545a;
import p093p.C1552g;
import p106r0.C1659r;
import p106r0.C1665s;

/* renamed from: androidx.fragment.app.z */
public class C0329z {

    /* renamed from: a */
    public static final int[] f1636a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final C1665s f1637b = new C1659r();

    /* renamed from: c */
    public static final C1665s f1638c;

    /* renamed from: androidx.fragment.app.z$a */
    public interface C0330a {
    }

    /* renamed from: androidx.fragment.app.z$b */
    public static class C0331b {

        /* renamed from: a */
        public C0286k f1639a;

        /* renamed from: b */
        public boolean f1640b;

        /* renamed from: c */
        public C0262a f1641c;

        /* renamed from: d */
        public C0286k f1642d;

        /* renamed from: e */
        public boolean f1643e;

        /* renamed from: f */
        public C0262a f1644f;
    }

    static {
        C1665s sVar;
        try {
            sVar = C0583d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            sVar = null;
        }
        f1638c = sVar;
    }

    /* renamed from: a */
    public static void m958a(ArrayList<View> arrayList, C1545a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f4840g - 1; i >= 0; i--) {
            View l = aVar.mo5618l(i);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (collection.contains(l.getTransitionName())) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r0.f1466o != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0087, code lost:
        if (r0.f1434C != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m959b(androidx.fragment.app.C0262a r8, androidx.fragment.app.C0323u.C0324a r9, android.util.SparseArray<androidx.fragment.app.C0329z.C0331b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.k r0 = r9.f1604b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f1432A
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f1636a
            int r9 = r9.f1603a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f1603a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = r3
            r2 = r9
            r4 = r2
            goto L_0x008b
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f1445N
            if (r9 == 0) goto L_0x007f
            boolean r9 = r0.f1434C
            if (r9 != 0) goto L_0x007f
            boolean r9 = r0.f1466o
            if (r9 == 0) goto L_0x007f
            goto L_0x0089
        L_0x003c:
            boolean r9 = r0.f1434C
            goto L_0x008a
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f1445N
            if (r9 == 0) goto L_0x0077
            boolean r9 = r0.f1466o
            if (r9 == 0) goto L_0x0077
            boolean r9 = r0.f1434C
            if (r9 == 0) goto L_0x0077
            goto L_0x0075
        L_0x004e:
            boolean r9 = r0.f1466o
            if (r9 == 0) goto L_0x0077
            boolean r9 = r0.f1434C
            if (r9 != 0) goto L_0x0077
            goto L_0x0075
        L_0x0057:
            boolean r9 = r0.f1466o
            if (r12 == 0) goto L_0x006f
            if (r9 != 0) goto L_0x0077
            android.view.View r9 = r0.f1441J
            if (r9 == 0) goto L_0x0077
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0077
            float r9 = r0.f1446O
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0077
            goto L_0x0075
        L_0x006f:
            if (r9 == 0) goto L_0x0077
            boolean r9 = r0.f1434C
            if (r9 != 0) goto L_0x0077
        L_0x0075:
            r9 = r2
            goto L_0x0078
        L_0x0077:
            r9 = r3
        L_0x0078:
            r4 = r9
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x008b
        L_0x007d:
            if (r12 == 0) goto L_0x0081
        L_0x007f:
            r9 = r3
            goto L_0x008a
        L_0x0081:
            boolean r9 = r0.f1466o
            if (r9 != 0) goto L_0x007f
            boolean r9 = r0.f1434C
            if (r9 != 0) goto L_0x007f
        L_0x0089:
            r9 = r2
        L_0x008a:
            r4 = r3
        L_0x008b:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.z$b r5 = (androidx.fragment.app.C0329z.C0331b) r5
            if (r9 == 0) goto L_0x00a4
            if (r5 != 0) goto L_0x009e
            androidx.fragment.app.z$b r9 = new androidx.fragment.app.z$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        L_0x009e:
            r5.f1639a = r0
            r5.f1640b = r11
            r5.f1641c = r8
        L_0x00a4:
            r9 = 0
            if (r12 != 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.k r2 = r5.f1642d
            if (r2 != r0) goto L_0x00b1
            r5.f1642d = r9
        L_0x00b1:
            boolean r2 = r8.f1602p
            if (r2 != 0) goto L_0x00c5
            androidx.fragment.app.r r2 = r8.f1355q
            androidx.fragment.app.t r6 = r2.mo1713h(r0)
            r0.o r7 = r2.f1532c
            r7.mo5829j(r6)
            int r6 = r2.f1545p
            r2.mo1692T(r0, r6)
        L_0x00c5:
            if (r4 == 0) goto L_0x00de
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.k r2 = r5.f1642d
            if (r2 != 0) goto L_0x00de
        L_0x00cd:
            if (r5 != 0) goto L_0x00d8
            androidx.fragment.app.z$b r2 = new androidx.fragment.app.z$b
            r2.<init>()
            r10.put(r1, r2)
            r5 = r2
        L_0x00d8:
            r5.f1642d = r0
            r5.f1643e = r11
            r5.f1644f = r8
        L_0x00de:
            if (r12 != 0) goto L_0x00ea
            if (r3 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00ea
            androidx.fragment.app.k r8 = r5.f1639a
            if (r8 != r0) goto L_0x00ea
            r5.f1639a = r9
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0329z.m959b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m960c(C0286k kVar, C0286k kVar2, boolean z, C1545a<String, View> aVar, boolean z2) {
        if (z) {
            kVar2.mo1630m();
        } else {
            kVar.mo1630m();
        }
    }

    /* renamed from: d */
    public static boolean m961d(C1665s sVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sVar.mo2747e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C1545a<String, View> m962e(C1665s sVar, C1545a<String, String> aVar, Object obj, C0331b bVar) {
        ArrayList<String> arrayList;
        C0286k kVar = bVar.f1639a;
        View view = kVar.f1441J;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C1545a<String, View> aVar2 = new C1545a<>();
        sVar.mo5853i(aVar2, view);
        C0262a aVar3 = bVar.f1641c;
        if (bVar.f1640b) {
            kVar.mo1636p();
            arrayList = aVar3.f1600n;
        } else {
            kVar.mo1630m();
            arrayList = aVar3.f1601o;
        }
        if (arrayList != null) {
            C1552g.m4322k(aVar2, arrayList);
            C1552g.m4322k(aVar2, aVar.values());
        }
        m970m(aVar, aVar2);
        return aVar2;
    }

    /* renamed from: f */
    public static C1545a<String, View> m963f(C1665s sVar, C1545a<String, String> aVar, Object obj, C0331b bVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        C0286k kVar = bVar.f1642d;
        C1545a<String, View> aVar2 = new C1545a<>();
        sVar.mo5853i(aVar2, kVar.mo1612c0());
        C0262a aVar3 = bVar.f1644f;
        if (bVar.f1643e) {
            kVar.mo1630m();
            arrayList = aVar3.f1601o;
        } else {
            kVar.mo1636p();
            arrayList = aVar3.f1600n;
        }
        if (arrayList != null) {
            C1552g.m4322k(aVar2, arrayList);
        }
        C1552g.m4322k(aVar, aVar2.keySet());
        return aVar2;
    }

    /* renamed from: g */
    public static C1665s m964g(C0286k kVar, C0286k kVar2) {
        ArrayList arrayList = new ArrayList();
        if (kVar != null) {
            kVar.mo1632o();
            Object x = kVar.mo1645x();
            if (x != null) {
                arrayList.add(x);
            }
            Object z = kVar.mo1647z();
            if (z != null) {
                arrayList.add(z);
            }
        }
        if (kVar2 != null) {
            kVar2.mo1628l();
            Object v = kVar2.mo1643v();
            if (v != null) {
                arrayList.add(v);
            }
            kVar2.mo1646y();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1665s sVar = f1637b;
        if (m961d(sVar, arrayList)) {
            return sVar;
        }
        C1665s sVar2 = f1638c;
        if (sVar2 != null && m961d(sVar2, arrayList)) {
            return sVar2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: h */
    public static ArrayList<View> m965h(C1665s sVar, Object obj, C0286k kVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = kVar.f1441J;
        if (view2 != null) {
            sVar.mo5852f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        sVar.mo2745b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: i */
    public static Object m966i(C1665s sVar, C0286k kVar, boolean z) {
        Object obj = null;
        if (kVar == null) {
            return null;
        }
        if (z) {
            obj = kVar.mo1643v();
        } else {
            kVar.mo1628l();
        }
        return sVar.mo2748g(obj);
    }

    /* renamed from: j */
    public static Object m967j(C1665s sVar, C0286k kVar, boolean z) {
        Object obj = null;
        if (kVar == null) {
            return null;
        }
        if (z) {
            obj = kVar.mo1645x();
        } else {
            kVar.mo1632o();
        }
        return sVar.mo2748g(obj);
    }

    /* renamed from: k */
    public static View m968k(C1545a<String, View> aVar, C0331b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0262a aVar2 = bVar.f1641c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1600n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f1600n : aVar2.f1601o).get(0));
    }

    /* renamed from: l */
    public static Object m969l(C1665s sVar, C0286k kVar, C0286k kVar2, boolean z) {
        Object obj;
        if (z) {
            obj = kVar2.mo1647z();
        } else {
            kVar.mo1646y();
            obj = null;
        }
        return sVar.mo2760y(sVar.mo2748g(obj));
    }

    /* renamed from: m */
    public static void m970m(C1545a<String, String> aVar, C1545a<String, View> aVar2) {
        int i = aVar.f4840g;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.mo5618l(i))) {
                aVar.mo5616j(i);
            }
        }
    }

    /* renamed from: n */
    public static void m971n(C1665s sVar, Object obj, Object obj2, C1545a<String, View> aVar, boolean z, C0262a aVar2) {
        ArrayList<String> arrayList = aVar2.f1600n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f1601o : aVar2.f1600n).get(0));
            sVar.mo2756t(obj, view);
            if (obj2 != null) {
                sVar.mo2756t(obj2, view);
            }
        }
    }

    /* renamed from: o */
    public static void m972o(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0230 A[ADDED_TO_REGION] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m973p(android.content.Context r37, p106r0.C1645g r38, java.util.ArrayList<androidx.fragment.app.C0262a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, androidx.fragment.app.C0329z.C0330a r44) {
        /*
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r41
        L_0x000f:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L_0x0061
            java.lang.Object r8 = r0.get(r5)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0262a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0047
            androidx.fragment.app.r r6 = r8.f1355q
            r0.g r6 = r6.f1547r
            boolean r6 = r6.mo1649f()
            if (r6 != 0) goto L_0x0030
            goto L_0x005e
        L_0x0030:
            java.util.ArrayList<androidx.fragment.app.u$a> r6 = r8.f1587a
            int r6 = r6.size()
            int r6 = r6 - r7
        L_0x0037:
            if (r6 < 0) goto L_0x005e
            java.util.ArrayList<androidx.fragment.app.u$a> r9 = r8.f1587a
            java.lang.Object r9 = r9.get(r6)
            androidx.fragment.app.u$a r9 = (androidx.fragment.app.C0323u.C0324a) r9
            m959b(r8, r9, r4, r7, r3)
            int r6 = r6 + -1
            goto L_0x0037
        L_0x0047:
            java.util.ArrayList<androidx.fragment.app.u$a> r7 = r8.f1587a
            int r7 = r7.size()
            r9 = r6
        L_0x004e:
            if (r9 >= r7) goto L_0x005e
            java.util.ArrayList<androidx.fragment.app.u$a> r10 = r8.f1587a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.u$a r10 = (androidx.fragment.app.C0323u.C0324a) r10
            m959b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L_0x004e
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0061:
            int r5 = r4.size()
            if (r5 == 0) goto L_0x0407
            android.view.View r5 = new android.view.View
            r8 = r37
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = r6
        L_0x0073:
            if (r14 >= r15) goto L_0x0407
            int r8 = r4.keyAt(r14)
            p.a r13 = new p.a
            r13.<init>()
            int r9 = r2 + -1
            r12 = r41
        L_0x0082:
            if (r9 < r12) goto L_0x00ea
            java.lang.Object r10 = r0.get(r9)
            androidx.fragment.app.a r10 = (androidx.fragment.app.C0262a) r10
            boolean r11 = r10.mo1541j(r8)
            if (r11 != 0) goto L_0x0091
            goto L_0x00df
        L_0x0091:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.f1600n
            if (r7 == 0) goto L_0x00df
            int r7 = r7.size()
            if (r11 == 0) goto L_0x00aa
            java.util.ArrayList<java.lang.String> r11 = r10.f1600n
            java.util.ArrayList<java.lang.String> r10 = r10.f1601o
            goto L_0x00b3
        L_0x00aa:
            java.util.ArrayList<java.lang.String> r11 = r10.f1600n
            java.util.ArrayList<java.lang.String> r10 = r10.f1601o
            r36 = r11
            r11 = r10
            r10 = r36
        L_0x00b3:
            if (r6 >= r7) goto L_0x00df
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d3
            r13.put(r0, r2)
            goto L_0x00d6
        L_0x00d3:
            r13.put(r0, r1)
        L_0x00d6:
            int r6 = r6 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            goto L_0x00b3
        L_0x00df:
            int r9 = r9 + -1
            r0 = r39
            r1 = r40
            r2 = r42
            r6 = 0
            r7 = 1
            goto L_0x0082
        L_0x00ea:
            java.lang.Object r0 = r4.valueAt(r14)
            androidx.fragment.app.z$b r0 = (androidx.fragment.app.C0329z.C0331b) r0
            boolean r1 = r38.mo1649f()
            if (r1 == 0) goto L_0x03ef
            r1 = r38
            android.view.View r2 = r1.mo1648b(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0102
            goto L_0x03ef
        L_0x0102:
            if (r3 == 0) goto L_0x0282
            androidx.fragment.app.k r7 = r0.f1639a
            androidx.fragment.app.k r8 = r0.f1642d
            r0.s r9 = m964g(r8, r7)
            if (r9 != 0) goto L_0x0117
            r30 = r4
            r31 = r14
            r32 = r15
        L_0x0114:
            r7 = 0
            goto L_0x0295
        L_0x0117:
            boolean r10 = r0.f1640b
            boolean r11 = r0.f1643e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r10 = m966i(r9, r7, r10)
            java.lang.Object r11 = m967j(r9, r8, r11)
            androidx.fragment.app.k r3 = r0.f1639a
            r30 = r4
            androidx.fragment.app.k r4 = r0.f1642d
            if (r3 == 0) goto L_0x0140
            android.view.View r12 = r3.mo1612c0()
            r31 = r14
            r14 = 0
            r12.setVisibility(r14)
            goto L_0x0142
        L_0x0140:
            r31 = r14
        L_0x0142:
            if (r3 == 0) goto L_0x01e5
            if (r4 != 0) goto L_0x0148
            goto L_0x01e5
        L_0x0148:
            boolean r12 = r0.f1640b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x0154
            r32 = r15
            r14 = 0
            goto L_0x015a
        L_0x0154:
            java.lang.Object r14 = m969l(r9, r3, r4, r12)
            r32 = r15
        L_0x015a:
            p.a r15 = m963f(r9, r13, r14, r0)
            r33 = r7
            p.a r7 = m962e(r9, r13, r14, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0176
            if (r15 == 0) goto L_0x016f
            r15.clear()
        L_0x016f:
            if (r7 == 0) goto L_0x0174
            r7.clear()
        L_0x0174:
            r14 = 0
            goto L_0x0188
        L_0x0176:
            r16 = r14
            java.util.Set r14 = r13.keySet()
            m958a(r1, r15, r14)
            java.util.Collection r14 = r13.values()
            m958a(r6, r7, r14)
            r14 = r16
        L_0x0188:
            if (r10 != 0) goto L_0x0193
            if (r11 != 0) goto L_0x0193
            if (r14 != 0) goto L_0x0193
            r35 = r6
            r34 = r13
            goto L_0x01ed
        L_0x0193:
            r34 = r13
            r13 = 1
            m960c(r3, r4, r12, r15, r13)
            if (r14 == 0) goto L_0x01c9
            r6.add(r5)
            r9.mo2758w(r14, r5, r1)
            boolean r13 = r0.f1643e
            r35 = r6
            androidx.fragment.app.a r6 = r0.f1644f
            r16 = r9
            r17 = r14
            r18 = r11
            r19 = r15
            r20 = r13
            r21 = r6
            m971n(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = m968k(r7, r0, r10, r12)
            if (r0 == 0) goto L_0x01c4
            r9.mo2755s(r10, r6)
        L_0x01c4:
            r27 = r0
            r29 = r6
            goto L_0x01cf
        L_0x01c9:
            r35 = r6
            r27 = 0
            r29 = 0
        L_0x01cf:
            androidx.fragment.app.x r0 = new androidx.fragment.app.x
            r22 = r0
            r23 = r3
            r24 = r4
            r25 = r12
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            p058j0.C1060n.m3018a(r2, r0)
            r6 = r14
            goto L_0x01ee
        L_0x01e5:
            r35 = r6
            r33 = r7
            r34 = r13
            r32 = r15
        L_0x01ed:
            r6 = 0
        L_0x01ee:
            if (r10 != 0) goto L_0x01f6
            if (r6 != 0) goto L_0x01f6
            if (r11 != 0) goto L_0x01f6
            goto L_0x0114
        L_0x01f6:
            java.util.ArrayList r0 = m965h(r9, r11, r8, r1, r5)
            r3 = r33
            r4 = r35
            java.util.ArrayList r3 = m965h(r9, r10, r3, r4, r5)
            r7 = 4
            m972o(r3, r7)
            java.lang.Object r7 = r9.mo2750m(r11, r10, r6)
            if (r8 == 0) goto L_0x022e
            if (r0 == 0) goto L_0x022e
            int r12 = r0.size()
            if (r12 > 0) goto L_0x021a
            int r12 = r1.size()
            if (r12 <= 0) goto L_0x022e
        L_0x021a:
            f0.a r12 = new f0.a
            r12.<init>()
            r13 = r44
            androidx.fragment.app.r$d r13 = (androidx.fragment.app.C0302r.C0306d) r13
            r13.mo1738b(r8, r12)
            androidx.fragment.app.v r14 = new androidx.fragment.app.v
            r14.<init>(r13, r8, r12)
            r9.mo2757u(r8, r7, r12, r14)
        L_0x022e:
            if (r7 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0253
            if (r11 == 0) goto L_0x0253
            boolean r12 = r8.f1466o
            if (r12 == 0) goto L_0x0253
            boolean r12 = r8.f1434C
            if (r12 == 0) goto L_0x0253
            boolean r12 = r8.f1445N
            if (r12 == 0) goto L_0x0253
            r12 = 1
            r8.mo1625j0(r12)
            android.view.View r12 = r8.f1441J
            r9.mo2753q(r11, r12, r0)
            android.view.ViewGroup r8 = r8.f1440I
            r0.p r12 = new r0.p
            r12.<init>(r0)
            p058j0.C1060n.m3018a(r8, r12)
        L_0x0253:
            java.util.ArrayList r20 = r9.mo5855n(r4)
            r22 = r9
            r23 = r7
            r24 = r10
            r25 = r3
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r4
            r22.mo2754r(r23, r24, r25, r26, r27, r28, r29)
            r9.mo2746c(r2, r7)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r4
            r21 = r34
            r16.mo5856v(r17, r18, r19, r20, r21)
            r7 = 0
            m972o(r3, r7)
            r9.mo2759x(r6, r1, r4)
            goto L_0x0295
        L_0x0282:
            r30 = r4
            r34 = r13
            r31 = r14
            r32 = r15
            r7 = 0
            androidx.fragment.app.k r1 = r0.f1639a
            androidx.fragment.app.k r3 = r0.f1642d
            r0.s r4 = m964g(r3, r1)
            if (r4 != 0) goto L_0x029b
        L_0x0295:
            r24 = r31
            r26 = r32
            goto L_0x03f5
        L_0x029b:
            boolean r6 = r0.f1640b
            boolean r8 = r0.f1643e
            java.lang.Object r6 = m966i(r4, r1, r6)
            java.lang.Object r15 = m967j(r4, r3, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            androidx.fragment.app.k r12 = r0.f1639a
            androidx.fragment.app.k r11 = r0.f1642d
            if (r12 == 0) goto L_0x0365
            if (r11 != 0) goto L_0x02bb
            goto L_0x0365
        L_0x02bb:
            boolean r10 = r0.f1640b
            boolean r8 = r34.isEmpty()
            if (r8 == 0) goto L_0x02c7
            r9 = r34
            r8 = 0
            goto L_0x02cd
        L_0x02c7:
            java.lang.Object r8 = m969l(r4, r12, r11, r10)
            r9 = r34
        L_0x02cd:
            p.a r7 = m963f(r4, r9, r8, r0)
            boolean r16 = r9.isEmpty()
            if (r16 == 0) goto L_0x02d9
            r8 = 0
            goto L_0x02e4
        L_0x02d9:
            r16 = r8
            java.util.Collection r8 = r7.values()
            r14.addAll(r8)
            r8 = r16
        L_0x02e4:
            if (r6 != 0) goto L_0x02fb
            if (r15 != 0) goto L_0x02fb
            if (r8 != 0) goto L_0x02fb
            r21 = r1
            r27 = r3
            r34 = r9
        L_0x02f0:
            r23 = r13
            r25 = r14
            r3 = r15
            r24 = r31
            r26 = r32
            goto L_0x036a
        L_0x02fb:
            r21 = r1
            r1 = 1
            m960c(r12, r11, r10, r7, r1)
            if (r8 == 0) goto L_0x032d
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.mo2758w(r8, r5, r14)
            r16 = r12
            boolean r12 = r0.f1643e
            r17 = r13
            androidx.fragment.app.a r13 = r0.f1644f
            r22 = r8
            r8 = r4
            r18 = r9
            r9 = r22
            r19 = r10
            r10 = r15
            r20 = r11
            r11 = r7
            r7 = r16
            r23 = r17
            m971n(r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x0339
            r4.mo2755s(r6, r1)
            goto L_0x0339
        L_0x032d:
            r22 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r7 = r12
            r23 = r13
            r1 = 0
        L_0x0339:
            androidx.fragment.app.y r13 = new androidx.fragment.app.y
            r8 = r13
            r9 = r4
            r10 = r18
            r11 = r22
            r12 = r0
            r0 = r13
            r34 = r18
            r13 = r23
            r25 = r14
            r24 = r31
            r14 = r5
            r27 = r3
            r3 = r15
            r26 = r32
            r15 = r7
            r16 = r20
            r17 = r19
            r18 = r25
            r19 = r6
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p058j0.C1060n.m3018a(r2, r0)
            r14 = r22
            goto L_0x036b
        L_0x0365:
            r21 = r1
            r27 = r3
            goto L_0x02f0
        L_0x036a:
            r14 = 0
        L_0x036b:
            if (r6 != 0) goto L_0x0373
            if (r14 != 0) goto L_0x0373
            if (r3 != 0) goto L_0x0373
            goto L_0x03f5
        L_0x0373:
            r1 = r25
            r0 = r27
            java.util.ArrayList r7 = m965h(r4, r3, r0, r1, r5)
            if (r7 == 0) goto L_0x0383
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0384
        L_0x0383:
            r3 = 0
        L_0x0384:
            r4.mo2744a(r6, r5)
            java.lang.Object r15 = r4.mo2750m(r3, r6, r14)
            if (r0 == 0) goto L_0x03af
            if (r7 == 0) goto L_0x03af
            int r8 = r7.size()
            if (r8 > 0) goto L_0x039b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03af
        L_0x039b:
            f0.a r1 = new f0.a
            r1.<init>()
            r8 = r44
            androidx.fragment.app.r$d r8 = (androidx.fragment.app.C0302r.C0306d) r8
            r8.mo1738b(r0, r1)
            androidx.fragment.app.w r9 = new androidx.fragment.app.w
            r9.<init>(r8, r0, r1)
            r4.mo2757u(r0, r15, r1, r9)
        L_0x03af:
            if (r15 == 0) goto L_0x03f5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r4
            r9 = r15
            r10 = r6
            r11 = r0
            r12 = r3
            r13 = r7
            r1 = r15
            r15 = r23
            r8.mo2754r(r9, r10, r11, r12, r13, r14, r15)
            r0.q r15 = new r0.q
            r8 = r15
            r9 = r6
            r10 = r4
            r11 = r5
            r12 = r21
            r13 = r23
            r14 = r0
            r0 = r15
            r15 = r7
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            p058j0.C1060n.m3018a(r2, r0)
            r0.t r0 = new r0.t
            r6 = r23
            r3 = r34
            r0.<init>(r4, r6, r3)
            p058j0.C1060n.m3018a(r2, r0)
            r4.mo2746c(r2, r1)
            r0.u r0 = new r0.u
            r0.<init>(r4, r6, r3)
            p058j0.C1060n.m3018a(r2, r0)
            goto L_0x03f5
        L_0x03ef:
            r30 = r4
            r24 = r14
            r26 = r15
        L_0x03f5:
            int r14 = r24 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            r15 = r26
            r4 = r30
            r6 = 0
            r7 = 1
            goto L_0x0073
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0329z.m973p(android.content.Context, r0.g, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.z$a):void");
    }
}
