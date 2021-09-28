package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0263a0;
import androidx.fragment.app.C0286k;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import com.dynamsoft.dce.HardwareUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import p000a.C0001b;
import p002a1.C0006a;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p099q.C1589b;
import p106r0.C1640c;
import p106r0.C1647i;
import p106r0.C1650k;
import p106r0.C1651l;
import p106r0.C1653m;
import p106r0.C1654n;
import p106r0.C1656o;
import p106r0.C1669v;
import p106r0.C1673z;
import p118t0.C1784r;
import p118t0.C1785s;

/* renamed from: androidx.fragment.app.t */
public class C0321t {

    /* renamed from: a */
    public final C0300q f1581a;

    /* renamed from: b */
    public final C1656o f1582b;

    /* renamed from: c */
    public final C0286k f1583c;

    /* renamed from: d */
    public boolean f1584d = false;

    /* renamed from: e */
    public int f1585e = -1;

    /* renamed from: androidx.fragment.app.t$a */
    public class C0322a implements View.OnAttachStateChangeListener {

        /* renamed from: e */
        public final /* synthetic */ View f1586e;

        public C0322a(C0321t tVar, View view) {
            this.f1586e = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f1586e.removeOnAttachStateChangeListener(this);
            View view2 = this.f1586e;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view2.requestApplyInsets();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C0321t(C0300q qVar, C1656o oVar, C0286k kVar) {
        this.f1581a = qVar;
        this.f1582b = oVar;
        this.f1583c = kVar;
    }

    public C0321t(C0300q qVar, C1656o oVar, C0286k kVar, C1654n nVar) {
        this.f1581a = qVar;
        this.f1582b = oVar;
        this.f1583c = kVar;
        kVar.f1458g = null;
        kVar.f1459h = null;
        kVar.f1472u = 0;
        kVar.f1469r = false;
        kVar.f1466o = false;
        C0286k kVar2 = kVar.f1462k;
        kVar.f1463l = kVar2 != null ? kVar2.f1460i : null;
        kVar.f1462k = null;
        Bundle bundle = nVar.f5068q;
        kVar.f1457f = bundle == null ? new Bundle() : bundle;
    }

    public C0321t(C0300q qVar, C1656o oVar, ClassLoader classLoader, C0299p pVar, C1654n nVar) {
        this.f1581a = qVar;
        this.f1582b = oVar;
        C0286k a = pVar.mo1659a(classLoader, nVar.f5056e);
        this.f1583c = a;
        Bundle bundle = nVar.f5065n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo1621h0(nVar.f5065n);
        a.f1460i = nVar.f5057f;
        a.f1468q = nVar.f5058g;
        a.f1470s = true;
        a.f1477z = nVar.f5059h;
        a.f1432A = nVar.f5060i;
        a.f1433B = nVar.f5061j;
        a.f1436E = nVar.f5062k;
        a.f1467p = nVar.f5063l;
        a.f1435D = nVar.f5064m;
        a.f1434C = nVar.f5066o;
        a.f1448Q = C0342c.C0345c.values()[nVar.f5067p];
        Bundle bundle2 = nVar.f5068q;
        a.f1457f = bundle2 == null ? new Bundle() : bundle2;
        if (C0302r.m864N(2)) {
            a.toString();
        }
    }

    /* renamed from: a */
    public void mo1753a() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("moveto ACTIVITY_CREATED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        Bundle bundle = kVar.f1457f;
        kVar.f1475x.mo1693U();
        kVar.f1456e = 3;
        kVar.f1439H = false;
        kVar.f1439H = true;
        if (C0302r.m864N(3)) {
            kVar.toString();
        }
        View view = kVar.f1441J;
        if (view != null) {
            Bundle bundle2 = kVar.f1457f;
            SparseArray<Parcelable> sparseArray = kVar.f1458g;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                kVar.f1458g = null;
            }
            if (kVar.f1441J != null) {
                C1669v vVar = kVar.f1450S;
                vVar.f5105g.mo1a(kVar.f1459h);
                kVar.f1459h = null;
            }
            kVar.f1439H = false;
            kVar.mo1603V(bundle2);
            if (!kVar.f1439H) {
                throw new C1673z(C1640c.m4558a("Fragment ", kVar, " did not call through to super.onViewStateRestored()"));
            } else if (kVar.f1441J != null) {
                kVar.f1450S.mo5860a(C0342c.C0344b.ON_CREATE);
            }
        }
        kVar.f1457f = null;
        C0302r rVar = kVar.f1475x;
        rVar.f1520B = false;
        rVar.f1521C = false;
        rVar.f1528J.f5055h = false;
        rVar.mo1731w(4);
        C0300q qVar = this.f1581a;
        C0286k kVar2 = this.f1583c;
        qVar.mo1660a(kVar2, kVar2.f1457f, false);
    }

    /* renamed from: b */
    public void mo1754b() {
        View view;
        View view2;
        C1656o oVar = this.f1582b;
        C0286k kVar = this.f1583c;
        Objects.requireNonNull(oVar);
        ViewGroup viewGroup = kVar.f1440I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = oVar.f5070b.indexOf(kVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= oVar.f5070b.size()) {
                            break;
                        }
                        C0286k kVar2 = (C0286k) oVar.f5070b.get(indexOf);
                        if (kVar2.f1440I == viewGroup && (view = kVar2.f1441J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C0286k kVar3 = (C0286k) oVar.f5070b.get(i2);
                    if (kVar3.f1440I == viewGroup && (view2 = kVar3.f1441J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        C0286k kVar4 = this.f1583c;
        kVar4.f1440I.addView(kVar4.f1441J, i);
    }

    /* renamed from: c */
    public void mo1755c() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("moveto ATTACHED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        C0286k kVar2 = kVar.f1462k;
        C0321t tVar = null;
        if (kVar2 != null) {
            C0321t h = this.f1582b.mo5827h(kVar2.f1460i);
            if (h != null) {
                C0286k kVar3 = this.f1583c;
                kVar3.f1463l = kVar3.f1462k.f1460i;
                kVar3.f1462k = null;
                tVar = h;
            } else {
                StringBuilder a = C0001b.m0a("Fragment ");
                a.append(this.f1583c);
                a.append(" declared target fragment ");
                a.append(this.f1583c.f1462k);
                a.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(a.toString());
            }
        } else {
            String str = kVar.f1463l;
            if (str != null && (tVar = this.f1582b.mo5827h(str)) == null) {
                StringBuilder a2 = C0001b.m0a("Fragment ");
                a2.append(this.f1583c);
                a2.append(" declared target fragment ");
                throw new IllegalStateException(C1589b.m4444a(a2, this.f1583c.f1463l, " that does not belong to this FragmentManager!"));
            }
        }
        if (tVar != null) {
            tVar.mo1763k();
        }
        C0286k kVar4 = this.f1583c;
        C0302r rVar = kVar4.f1473v;
        kVar4.f1474w = rVar.f1546q;
        kVar4.f1476y = rVar.f1548s;
        this.f1581a.mo1666g(kVar4, false);
        C0286k kVar5 = this.f1583c;
        Iterator<C0286k.C0290d> it = kVar5.f1455X.iterator();
        while (it.hasNext()) {
            it.next().mo1650a();
        }
        kVar5.f1455X.clear();
        kVar5.f1475x.mo1701b(kVar5.f1474w, kVar5.mo1608a(), kVar5);
        kVar5.f1456e = 0;
        kVar5.f1439H = false;
        kVar5.mo1587F(kVar5.f1474w.f5043f);
        if (kVar5.f1439H) {
            C0302r rVar2 = kVar5.f1473v;
            Iterator<C1653m> it2 = rVar2.f1544o.iterator();
            while (it2.hasNext()) {
                it2.next().mo1740a(rVar2, kVar5);
            }
            C0302r rVar3 = kVar5.f1475x;
            rVar3.f1520B = false;
            rVar3.f1521C = false;
            rVar3.f1528J.f5055h = false;
            rVar3.mo1731w(0);
            this.f1581a.mo1661b(this.f1583c, false);
            return;
        }
        throw new C1673z(C1640c.m4558a("Fragment ", kVar5, " did not call through to super.onAttach()"));
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [androidx.fragment.app.a0$d$b] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.a0$d$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1756d() {
        /*
            r13 = this;
            androidx.fragment.app.k r0 = r13.f1583c
            androidx.fragment.app.r r1 = r0.f1473v
            if (r1 != 0) goto L_0x0009
            int r0 = r0.f1456e
            return r0
        L_0x0009:
            int r1 = r13.f1585e
            androidx.lifecycle.c$c r0 = r0.f1448Q
            int r0 = r0.ordinal()
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x002e
            if (r0 == r6) goto L_0x0029
            if (r0 == r4) goto L_0x0024
            if (r0 == r5) goto L_0x0033
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0033
        L_0x0024:
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x0033
        L_0x0029:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0033
        L_0x002e:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0033:
            androidx.fragment.app.k r0 = r13.f1583c
            boolean r8 = r0.f1468q
            if (r8 == 0) goto L_0x0063
            boolean r8 = r0.f1469r
            if (r8 == 0) goto L_0x0054
            int r0 = r13.f1585e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.k r0 = r13.f1583c
            android.view.View r0 = r0.f1441J
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0063
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0063
        L_0x0054:
            int r8 = r13.f1585e
            if (r8 >= r5) goto L_0x005f
            int r0 = r0.f1456e
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0063
        L_0x005f:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0063:
            androidx.fragment.app.k r0 = r13.f1583c
            boolean r0 = r0.f1466o
            if (r0 != 0) goto L_0x006d
            int r1 = java.lang.Math.min(r1, r7)
        L_0x006d:
            androidx.fragment.app.k r0 = r13.f1583c
            android.view.ViewGroup r8 = r0.f1440I
            r9 = 0
            if (r8 == 0) goto L_0x00bd
            androidx.fragment.app.r r0 = r0.mo1638r()
            r0.y r0 = r0.mo1685L()
            androidx.fragment.app.a0 r0 = androidx.fragment.app.C0263a0.m752g(r8, r0)
            java.util.Objects.requireNonNull(r0)
            androidx.fragment.app.k r8 = r13.f1583c
            androidx.fragment.app.a0$d r8 = r0.mo1548d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.a0$d$b r8 = r8.f1369b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.k r10 = r13.f1583c
            java.util.ArrayList<androidx.fragment.app.a0$d> r0 = r0.f1360c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.a0$d r11 = (androidx.fragment.app.C0263a0.C0267d) r11
            androidx.fragment.app.k r12 = r11.f1370c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f1373f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.a0$d$b r0 = androidx.fragment.app.C0263a0.C0267d.C0269b.NONE
            if (r8 != r0) goto L_0x00bc
        L_0x00b8:
            androidx.fragment.app.a0$d$b r0 = r9.f1369b
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = r8
        L_0x00bd:
            androidx.fragment.app.a0$d$b r0 = androidx.fragment.app.C0263a0.C0267d.C0269b.ADDING
            if (r9 != r0) goto L_0x00c7
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e5
        L_0x00c7:
            androidx.fragment.app.a0$d$b r0 = androidx.fragment.app.C0263a0.C0267d.C0269b.REMOVING
            if (r9 != r0) goto L_0x00d0
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e5
        L_0x00d0:
            androidx.fragment.app.k r0 = r13.f1583c
            boolean r4 = r0.f1467p
            if (r4 == 0) goto L_0x00e5
            boolean r0 = r0.mo1583B()
            if (r0 == 0) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e5
        L_0x00e1:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e5:
            androidx.fragment.app.k r0 = r13.f1583c
            boolean r2 = r0.f1442K
            if (r2 == 0) goto L_0x00f3
            int r0 = r0.f1456e
            if (r0 >= r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f3:
            boolean r0 = androidx.fragment.app.C0302r.m864N(r6)
            if (r0 == 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "computeExpectedState() of "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " for "
            r0.append(r2)
            androidx.fragment.app.k r2 = r13.f1583c
            r0.append(r2)
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0321t.mo1756d():int");
    }

    /* renamed from: e */
    public void mo1757e() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("moveto CREATED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        if (!kVar.f1447P) {
            this.f1581a.mo1667h(kVar, kVar.f1457f, false);
            C0286k kVar2 = this.f1583c;
            Bundle bundle = kVar2.f1457f;
            kVar2.f1475x.mo1693U();
            kVar2.f1456e = 1;
            kVar2.f1439H = false;
            kVar2.f1449R.mo1802a(new Fragment$5(kVar2));
            kVar2.f1453V.mo1a(bundle);
            kVar2.mo1589H(bundle);
            kVar2.f1447P = true;
            if (kVar2.f1439H) {
                kVar2.f1449R.mo1807e(C0342c.C0344b.ON_CREATE);
                C0300q qVar = this.f1581a;
                C0286k kVar3 = this.f1583c;
                qVar.mo1662c(kVar3, kVar3.f1457f, false);
                return;
            }
            throw new C1673z(C1640c.m4558a("Fragment ", kVar2, " did not call through to super.onCreate()"));
        }
        kVar.mo1613d0(kVar.f1457f);
        this.f1583c.f1456e = 1;
    }

    /* renamed from: f */
    public void mo1758f() {
        String str;
        if (!this.f1583c.f1468q) {
            if (C0302r.m864N(3)) {
                Objects.toString(this.f1583c);
            }
            C0286k kVar = this.f1583c;
            LayoutInflater M = kVar.mo1594M(kVar.f1457f);
            ViewGroup viewGroup = null;
            C0286k kVar2 = this.f1583c;
            ViewGroup viewGroup2 = kVar2.f1440I;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = kVar2.f1432A;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) kVar2.f1473v.f1547r.mo1648b(i);
                        if (viewGroup == null) {
                            C0286k kVar3 = this.f1583c;
                            if (!kVar3.f1470s) {
                                try {
                                    str = kVar3.mo1644w().getResourceName(this.f1583c.f1432A);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder a = C0001b.m0a("No view found for id 0x");
                                a.append(Integer.toHexString(this.f1583c.f1432A));
                                a.append(" (");
                                a.append(str);
                                a.append(") for fragment ");
                                a.append(this.f1583c);
                                throw new IllegalArgumentException(a.toString());
                            }
                        }
                    } else {
                        StringBuilder a2 = C0001b.m0a("Cannot create fragment ");
                        a2.append(this.f1583c);
                        a2.append(" for a container view with no id");
                        throw new IllegalArgumentException(a2.toString());
                    }
                }
            }
            C0286k kVar4 = this.f1583c;
            kVar4.f1440I = viewGroup;
            kVar4.mo1604W(M, viewGroup, kVar4.f1457f);
            View view = this.f1583c.f1441J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C0286k kVar5 = this.f1583c;
                kVar5.f1441J.setTag(R.id.fragment_container_view_tag, kVar5);
                if (viewGroup != null) {
                    mo1754b();
                }
                C0286k kVar6 = this.f1583c;
                if (kVar6.f1434C) {
                    kVar6.f1441J.setVisibility(8);
                }
                View view2 = this.f1583c.f1441J;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (view2.isAttachedToWindow()) {
                    this.f1583c.f1441J.requestApplyInsets();
                } else {
                    View view3 = this.f1583c.f1441J;
                    view3.addOnAttachStateChangeListener(new C0322a(this, view3));
                }
                C0286k kVar7 = this.f1583c;
                kVar7.mo1602U(kVar7.f1441J, kVar7.f1457f);
                kVar7.f1475x.mo1731w(2);
                C0300q qVar = this.f1581a;
                C0286k kVar8 = this.f1583c;
                qVar.mo1672m(kVar8, kVar8.f1441J, kVar8.f1457f, false);
                int visibility = this.f1583c.f1441J.getVisibility();
                this.f1583c.mo1616f().f1492n = this.f1583c.f1441J.getAlpha();
                C0286k kVar9 = this.f1583c;
                if (kVar9.f1440I != null && visibility == 0) {
                    View findFocus = kVar9.f1441J.findFocus();
                    if (findFocus != null) {
                        this.f1583c.mo1616f().f1493o = findFocus;
                        if (C0302r.m864N(2)) {
                            findFocus.toString();
                            Objects.toString(this.f1583c);
                        }
                    }
                    this.f1583c.f1441J.setAlpha(0.0f);
                }
            }
            this.f1583c.f1456e = 2;
        }
    }

    /* renamed from: g */
    public void mo1759g() {
        C0286k d;
        boolean z;
        if (C0302r.m864N(3)) {
            C0001b.m0a("movefrom CREATED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        boolean z2 = kVar.f1467p && !kVar.mo1583B();
        if (z2 || ((C1651l) this.f1582b.f5072d).mo5811e(this.f1583c)) {
            C1647i<?> iVar = this.f1583c.f1474w;
            if (iVar instanceof C1785s) {
                z = ((C1651l) this.f1582b.f5072d).f5054g;
            } else {
                Context context = iVar.f5043f;
                z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
            }
            if (z2 || z) {
                C1651l lVar = (C1651l) this.f1582b.f5072d;
                C0286k kVar2 = this.f1583c;
                Objects.requireNonNull(lVar);
                if (C0302r.m864N(3)) {
                    Objects.toString(kVar2);
                }
                C1651l lVar2 = lVar.f5051d.get(kVar2.f1460i);
                if (lVar2 != null) {
                    lVar2.mo5809b();
                    lVar.f5051d.remove(kVar2.f1460i);
                }
                C1784r rVar = lVar.f5052e.get(kVar2.f1460i);
                if (rVar != null) {
                    rVar.mo6067a();
                    lVar.f5052e.remove(kVar2.f1460i);
                }
            }
            C0286k kVar3 = this.f1583c;
            kVar3.f1475x.mo1722o();
            kVar3.f1449R.mo1807e(C0342c.C0344b.ON_DESTROY);
            kVar3.f1456e = 0;
            kVar3.f1439H = false;
            kVar3.f1447P = false;
            kVar3.f1439H = true;
            this.f1581a.mo1663d(this.f1583c, false);
            Iterator it = ((ArrayList) this.f1582b.mo5825f()).iterator();
            while (it.hasNext()) {
                C0321t tVar = (C0321t) it.next();
                if (tVar != null) {
                    C0286k kVar4 = tVar.f1583c;
                    if (this.f1583c.f1460i.equals(kVar4.f1463l)) {
                        kVar4.f1462k = this.f1583c;
                        kVar4.f1463l = null;
                    }
                }
            }
            C0286k kVar5 = this.f1583c;
            String str = kVar5.f1463l;
            if (str != null) {
                kVar5.f1462k = this.f1582b.mo5823d(str);
            }
            this.f1582b.mo5830k(this);
            return;
        }
        String str2 = this.f1583c.f1463l;
        if (!(str2 == null || (d = this.f1582b.mo5823d(str2)) == null || !d.f1436E)) {
            this.f1583c.f1462k = d;
        }
        this.f1583c.f1456e = 0;
    }

    /* renamed from: h */
    public void mo1760h() {
        View view;
        if (C0302r.m864N(3)) {
            C0001b.m0a("movefrom CREATE_VIEW: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        ViewGroup viewGroup = kVar.f1440I;
        if (!(viewGroup == null || (view = kVar.f1441J) == null)) {
            viewGroup.removeView(view);
        }
        this.f1583c.mo1605X();
        this.f1581a.mo1673n(this.f1583c, false);
        C0286k kVar2 = this.f1583c;
        kVar2.f1440I = null;
        kVar2.f1441J = null;
        kVar2.f1450S = null;
        kVar2.f1451T.mo6061h(null);
        this.f1583c.f1469r = false;
    }

    /* renamed from: i */
    public void mo1761i() {
        if (C0302r.m864N(3)) {
            Objects.toString(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        kVar.f1456e = -1;
        kVar.f1439H = false;
        kVar.mo1593L();
        if (kVar.f1439H) {
            C0302r rVar = kVar.f1475x;
            if (!rVar.f1522D) {
                rVar.mo1722o();
                kVar.f1475x = new C1650k();
            }
            this.f1581a.mo1664e(this.f1583c, false);
            C0286k kVar2 = this.f1583c;
            kVar2.f1456e = -1;
            kVar2.f1474w = null;
            kVar2.f1476y = null;
            kVar2.f1473v = null;
            if ((kVar2.f1467p && !kVar2.mo1583B()) || ((C1651l) this.f1582b.f5072d).mo5811e(this.f1583c)) {
                if (C0302r.m864N(3)) {
                    Objects.toString(this.f1583c);
                }
                C0286k kVar3 = this.f1583c;
                Objects.requireNonNull(kVar3);
                kVar3.f1449R = new C0347e(kVar3);
                kVar3.f1453V = new C0006a(kVar3);
                kVar3.f1452U = null;
                kVar3.f1460i = UUID.randomUUID().toString();
                kVar3.f1466o = false;
                kVar3.f1467p = false;
                kVar3.f1468q = false;
                kVar3.f1469r = false;
                kVar3.f1470s = false;
                kVar3.f1472u = 0;
                kVar3.f1473v = null;
                kVar3.f1475x = new C1650k();
                kVar3.f1474w = null;
                kVar3.f1477z = 0;
                kVar3.f1432A = 0;
                kVar3.f1433B = null;
                kVar3.f1434C = false;
                kVar3.f1435D = false;
                return;
            }
            return;
        }
        throw new C1673z(C1640c.m4558a("Fragment ", kVar, " did not call through to super.onDetach()"));
    }

    /* renamed from: j */
    public void mo1762j() {
        C0286k kVar = this.f1583c;
        if (kVar.f1468q && kVar.f1469r && !kVar.f1471t) {
            if (C0302r.m864N(3)) {
                Objects.toString(this.f1583c);
            }
            C0286k kVar2 = this.f1583c;
            kVar2.mo1604W(kVar2.mo1594M(kVar2.f1457f), (ViewGroup) null, this.f1583c.f1457f);
            View view = this.f1583c.f1441J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C0286k kVar3 = this.f1583c;
                kVar3.f1441J.setTag(R.id.fragment_container_view_tag, kVar3);
                C0286k kVar4 = this.f1583c;
                if (kVar4.f1434C) {
                    kVar4.f1441J.setVisibility(8);
                }
                C0286k kVar5 = this.f1583c;
                kVar5.mo1602U(kVar5.f1441J, kVar5.f1457f);
                kVar5.f1475x.mo1731w(2);
                C0300q qVar = this.f1581a;
                C0286k kVar6 = this.f1583c;
                qVar.mo1672m(kVar6, kVar6.f1441J, kVar6.f1457f, false);
                this.f1583c.f1456e = 2;
            }
        }
    }

    /* renamed from: k */
    public void mo1763k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0263a0.C0267d.C0269b bVar = C0263a0.C0267d.C0269b.NONE;
        if (!this.f1584d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d = mo1756d();
                    C0286k kVar = this.f1583c;
                    int i = kVar.f1456e;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case HardwareUtil.DEVICEINFO_UNKNOWN /*-1*/:
                                    mo1761i();
                                    break;
                                case 0:
                                    mo1759g();
                                    break;
                                case 1:
                                    mo1760h();
                                    this.f1583c.f1456e = z ? 1 : 0;
                                    break;
                                case 2:
                                    kVar.f1469r = z;
                                    kVar.f1456e = 2;
                                    break;
                                case 3:
                                    if (C0302r.m864N(3)) {
                                        Objects.toString(this.f1583c);
                                    }
                                    C0286k kVar2 = this.f1583c;
                                    if (kVar2.f1441J != null && kVar2.f1458g == null) {
                                        mo1767o();
                                    }
                                    C0286k kVar3 = this.f1583c;
                                    if (!(kVar3.f1441J == null || (viewGroup2 = kVar3.f1440I) == null)) {
                                        C0263a0 g = C0263a0.m752g(viewGroup2, kVar3.mo1638r().mo1685L());
                                        Objects.requireNonNull(g);
                                        if (C0302r.m864N(2)) {
                                            Objects.toString(this.f1583c);
                                        }
                                        g.mo1545a(C0263a0.C0267d.C0270c.REMOVED, C0263a0.C0267d.C0269b.REMOVING, this);
                                    }
                                    this.f1583c.f1456e = 3;
                                    break;
                                case 4:
                                    mo1769q();
                                    break;
                                case 5:
                                    kVar.f1456e = 5;
                                    break;
                                case 6:
                                    mo1764l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo1755c();
                                    break;
                                case 1:
                                    mo1757e();
                                    break;
                                case 2:
                                    mo1762j();
                                    mo1758f();
                                    break;
                                case 3:
                                    mo1753a();
                                    break;
                                case 4:
                                    if (!(kVar.f1441J == null || (viewGroup3 = kVar.f1440I) == null)) {
                                        C0263a0 g2 = C0263a0.m752g(viewGroup3, kVar.mo1638r().mo1685L());
                                        C0263a0.C0267d.C0270c b = C0263a0.C0267d.C0270c.m767b(this.f1583c.f1441J.getVisibility());
                                        Objects.requireNonNull(g2);
                                        if (C0302r.m864N(2)) {
                                            Objects.toString(this.f1583c);
                                        }
                                        g2.mo1545a(b, C0263a0.C0267d.C0269b.ADDING, this);
                                    }
                                    this.f1583c.f1456e = 4;
                                    break;
                                case 5:
                                    mo1768p();
                                    break;
                                case 6:
                                    kVar.f1456e = 6;
                                    break;
                                case 7:
                                    mo1766n();
                                    break;
                            }
                        }
                    } else {
                        if (kVar.f1445N) {
                            if (!(kVar.f1441J == null || (viewGroup = kVar.f1440I) == null)) {
                                C0263a0 g3 = C0263a0.m752g(viewGroup, kVar.mo1638r().mo1685L());
                                if (this.f1583c.f1434C) {
                                    Objects.requireNonNull(g3);
                                    if (C0302r.m864N(2)) {
                                        Objects.toString(this.f1583c);
                                    }
                                    g3.mo1545a(C0263a0.C0267d.C0270c.GONE, bVar, this);
                                } else {
                                    Objects.requireNonNull(g3);
                                    if (C0302r.m864N(2)) {
                                        Objects.toString(this.f1583c);
                                    }
                                    g3.mo1545a(C0263a0.C0267d.C0270c.VISIBLE, bVar, this);
                                }
                            }
                            C0286k kVar4 = this.f1583c;
                            C0302r rVar = kVar4.f1473v;
                            if (rVar != null && kVar4.f1466o && rVar.mo1687O(kVar4)) {
                                rVar.f1519A = z;
                            }
                            this.f1583c.f1445N = z;
                        }
                        this.f1584d = z;
                        return;
                    }
                }
            } finally {
                this.f1584d = z;
            }
        } else if (C0302r.m864N(2)) {
            Objects.toString(this.f1583c);
        }
    }

    /* renamed from: l */
    public void mo1764l() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("movefrom RESUMED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        kVar.f1475x.mo1731w(5);
        if (kVar.f1441J != null) {
            kVar.f1450S.mo5860a(C0342c.C0344b.ON_PAUSE);
        }
        kVar.f1449R.mo1807e(C0342c.C0344b.ON_PAUSE);
        kVar.f1456e = 6;
        kVar.f1439H = false;
        kVar.f1439H = true;
        this.f1581a.mo1665f(this.f1583c, false);
    }

    /* renamed from: m */
    public void mo1765m(ClassLoader classLoader) {
        Bundle bundle = this.f1583c.f1457f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            C0286k kVar = this.f1583c;
            kVar.f1458g = kVar.f1457f.getSparseParcelableArray("android:view_state");
            C0286k kVar2 = this.f1583c;
            kVar2.f1459h = kVar2.f1457f.getBundle("android:view_registry_state");
            C0286k kVar3 = this.f1583c;
            kVar3.f1463l = kVar3.f1457f.getString("android:target_state");
            C0286k kVar4 = this.f1583c;
            if (kVar4.f1463l != null) {
                kVar4.f1464m = kVar4.f1457f.getInt("android:target_req_state", 0);
            }
            C0286k kVar5 = this.f1583c;
            Objects.requireNonNull(kVar5);
            kVar5.f1443L = kVar5.f1457f.getBoolean("android:user_visible_hint", true);
            C0286k kVar6 = this.f1583c;
            if (!kVar6.f1443L) {
                kVar6.f1442K = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1766n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.C0302r.m864N(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            androidx.fragment.app.k r1 = r7.f1583c
            r0.append(r1)
        L_0x0012:
            androidx.fragment.app.k r0 = r7.f1583c
            androidx.fragment.app.k$b r1 = r0.f1444M
            r2 = 0
            if (r1 != 0) goto L_0x001b
            r1 = r2
            goto L_0x001d
        L_0x001b:
            android.view.View r1 = r1.f1493o
        L_0x001d:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x007d
            android.view.View r0 = r0.f1441J
            if (r1 != r0) goto L_0x0026
            goto L_0x0032
        L_0x0026:
            android.view.ViewParent r0 = r1.getParent()
        L_0x002a:
            if (r0 == 0) goto L_0x0039
            androidx.fragment.app.k r5 = r7.f1583c
            android.view.View r5 = r5.f1441J
            if (r0 != r5) goto L_0x0034
        L_0x0032:
            r0 = r3
            goto L_0x003a
        L_0x0034:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002a
        L_0x0039:
            r0 = r4
        L_0x003a:
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.C0302r.m864N(r5)
            if (r5 == 0) goto L_0x007d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "succeeded"
            goto L_0x0060
        L_0x005e:
            java.lang.String r0 = "failed"
        L_0x0060:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            androidx.fragment.app.k r0 = r7.f1583c
            r5.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            androidx.fragment.app.k r0 = r7.f1583c
            android.view.View r0 = r0.f1441J
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
        L_0x007d:
            androidx.fragment.app.k r0 = r7.f1583c
            r0.mo1624i0(r2)
            androidx.fragment.app.k r0 = r7.f1583c
            androidx.fragment.app.r r1 = r0.f1475x
            r1.mo1693U()
            androidx.fragment.app.r r1 = r0.f1475x
            r1.mo1676C(r3)
            r1 = 7
            r0.f1456e = r1
            r0.f1439H = r4
            r0.f1439H = r3
            androidx.lifecycle.e r3 = r0.f1449R
            androidx.lifecycle.c$b r5 = androidx.lifecycle.C0342c.C0344b.ON_RESUME
            r3.mo1807e(r5)
            android.view.View r3 = r0.f1441J
            if (r3 == 0) goto L_0x00a5
            r0.v r3 = r0.f1450S
            r3.mo5860a(r5)
        L_0x00a5:
            androidx.fragment.app.r r0 = r0.f1475x
            r0.f1520B = r4
            r0.f1521C = r4
            r0.l r3 = r0.f1528J
            r3.f5055h = r4
            r0.mo1731w(r1)
            androidx.fragment.app.q r0 = r7.f1581a
            androidx.fragment.app.k r1 = r7.f1583c
            r0.mo1668i(r1, r4)
            androidx.fragment.app.k r0 = r7.f1583c
            r0.f1457f = r2
            r0.f1458g = r2
            r0.f1459h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0321t.mo1766n():void");
    }

    /* renamed from: o */
    public void mo1767o() {
        if (this.f1583c.f1441J != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1583c.f1441J.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1583c.f1458g = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1583c.f1450S.f5105g.mo2b(bundle);
            if (!bundle.isEmpty()) {
                this.f1583c.f1459h = bundle;
            }
        }
    }

    /* renamed from: p */
    public void mo1768p() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("moveto STARTED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        kVar.f1475x.mo1693U();
        kVar.f1475x.mo1676C(true);
        kVar.f1456e = 5;
        kVar.f1439H = false;
        kVar.mo1600S();
        if (kVar.f1439H) {
            C0347e eVar = kVar.f1449R;
            C0342c.C0344b bVar = C0342c.C0344b.ON_START;
            eVar.mo1807e(bVar);
            if (kVar.f1441J != null) {
                kVar.f1450S.mo5860a(bVar);
            }
            C0302r rVar = kVar.f1475x;
            rVar.f1520B = false;
            rVar.f1521C = false;
            rVar.f1528J.f5055h = false;
            rVar.mo1731w(5);
            this.f1581a.mo1670k(this.f1583c, false);
            return;
        }
        throw new C1673z(C1640c.m4558a("Fragment ", kVar, " did not call through to super.onStart()"));
    }

    /* renamed from: q */
    public void mo1769q() {
        if (C0302r.m864N(3)) {
            C0001b.m0a("movefrom STARTED: ").append(this.f1583c);
        }
        C0286k kVar = this.f1583c;
        C0302r rVar = kVar.f1475x;
        rVar.f1521C = true;
        rVar.f1528J.f5055h = true;
        rVar.mo1731w(4);
        if (kVar.f1441J != null) {
            kVar.f1450S.mo5860a(C0342c.C0344b.ON_STOP);
        }
        kVar.f1449R.mo1807e(C0342c.C0344b.ON_STOP);
        kVar.f1456e = 4;
        kVar.f1439H = false;
        kVar.mo1601T();
        if (kVar.f1439H) {
            this.f1581a.mo1671l(this.f1583c, false);
            return;
        }
        throw new C1673z(C1640c.m4558a("Fragment ", kVar, " did not call through to super.onStop()"));
    }
}
