package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0302r;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import androidx.savedstate.C0483a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0001b;
import p002a1.C0006a;
import p002a1.C0007b;
import p007au.gov.dfat.vdsncchecker.R;
import p106r0.C1640c;
import p106r0.C1643f;
import p106r0.C1645g;
import p106r0.C1647i;
import p106r0.C1650k;
import p106r0.C1651l;
import p106r0.C1669v;
import p106r0.C1673z;
import p118t0.C1773g;
import p118t0.C1776j;
import p118t0.C1781o;
import p118t0.C1784r;
import p118t0.C1785s;
import p124u0.C1829a;
import p124u0.C1830b;

/* renamed from: androidx.fragment.app.k */
public class C0286k implements ComponentCallbacks, View.OnCreateContextMenuListener, C1773g, C1785s, C0007b {

    /* renamed from: Y */
    public static final Object f1431Y = new Object();

    /* renamed from: A */
    public int f1432A;

    /* renamed from: B */
    public String f1433B;

    /* renamed from: C */
    public boolean f1434C;

    /* renamed from: D */
    public boolean f1435D;

    /* renamed from: E */
    public boolean f1436E;

    /* renamed from: F */
    public boolean f1437F;

    /* renamed from: G */
    public boolean f1438G;

    /* renamed from: H */
    public boolean f1439H;

    /* renamed from: I */
    public ViewGroup f1440I;

    /* renamed from: J */
    public View f1441J;

    /* renamed from: K */
    public boolean f1442K;

    /* renamed from: L */
    public boolean f1443L;

    /* renamed from: M */
    public C0288b f1444M;

    /* renamed from: N */
    public boolean f1445N;

    /* renamed from: O */
    public float f1446O;

    /* renamed from: P */
    public boolean f1447P;

    /* renamed from: Q */
    public C0342c.C0345c f1448Q;

    /* renamed from: R */
    public C0347e f1449R;

    /* renamed from: S */
    public C1669v f1450S;

    /* renamed from: T */
    public C1776j<C1773g> f1451T;

    /* renamed from: U */
    public C1781o f1452U;

    /* renamed from: V */
    public C0006a f1453V;

    /* renamed from: W */
    public int f1454W;

    /* renamed from: X */
    public final ArrayList<C0290d> f1455X;

    /* renamed from: e */
    public int f1456e;

    /* renamed from: f */
    public Bundle f1457f;

    /* renamed from: g */
    public SparseArray<Parcelable> f1458g;

    /* renamed from: h */
    public Bundle f1459h;

    /* renamed from: i */
    public String f1460i;

    /* renamed from: j */
    public Bundle f1461j;

    /* renamed from: k */
    public C0286k f1462k;

    /* renamed from: l */
    public String f1463l;

    /* renamed from: m */
    public int f1464m;

    /* renamed from: n */
    public Boolean f1465n;

    /* renamed from: o */
    public boolean f1466o;

    /* renamed from: p */
    public boolean f1467p;

    /* renamed from: q */
    public boolean f1468q;

    /* renamed from: r */
    public boolean f1469r;

    /* renamed from: s */
    public boolean f1470s;

    /* renamed from: t */
    public boolean f1471t;

    /* renamed from: u */
    public int f1472u;

    /* renamed from: v */
    public C0302r f1473v;

    /* renamed from: w */
    public C1647i<?> f1474w;

    /* renamed from: x */
    public C0302r f1475x;

    /* renamed from: y */
    public C0286k f1476y;

    /* renamed from: z */
    public int f1477z;

    /* renamed from: androidx.fragment.app.k$a */
    public class C0287a extends C1645g {
        public C0287a() {
        }

        /* renamed from: b */
        public View mo1648b(int i) {
            View view = C0286k.this.f1441J;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder a = C0001b.m0a("Fragment ");
            a.append(C0286k.this);
            a.append(" does not have a view");
            throw new IllegalStateException(a.toString());
        }

        /* renamed from: f */
        public boolean mo1649f() {
            return C0286k.this.f1441J != null;
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    public static class C0288b {

        /* renamed from: a */
        public View f1479a;

        /* renamed from: b */
        public Animator f1480b;

        /* renamed from: c */
        public boolean f1481c;

        /* renamed from: d */
        public int f1482d;

        /* renamed from: e */
        public int f1483e;

        /* renamed from: f */
        public int f1484f;

        /* renamed from: g */
        public int f1485g;

        /* renamed from: h */
        public int f1486h;

        /* renamed from: i */
        public ArrayList<String> f1487i;

        /* renamed from: j */
        public ArrayList<String> f1488j;

        /* renamed from: k */
        public Object f1489k;

        /* renamed from: l */
        public Object f1490l;

        /* renamed from: m */
        public Object f1491m;

        /* renamed from: n */
        public float f1492n = 1.0f;

        /* renamed from: o */
        public View f1493o = null;

        /* renamed from: p */
        public C0291e f1494p;

        /* renamed from: q */
        public boolean f1495q;

        public C0288b() {
            Object obj = C0286k.f1431Y;
            this.f1489k = obj;
            this.f1490l = obj;
            this.f1491m = obj;
        }
    }

    /* renamed from: androidx.fragment.app.k$c */
    public static class C0289c extends RuntimeException {
        public C0289c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.k$d */
    public static abstract class C0290d {
        /* renamed from: a */
        public abstract void mo1650a();
    }

    /* renamed from: androidx.fragment.app.k$e */
    public interface C0291e {
    }

    public C0286k() {
        this.f1456e = -1;
        this.f1460i = UUID.randomUUID().toString();
        this.f1463l = null;
        this.f1465n = null;
        this.f1475x = new C1650k();
        this.f1438G = true;
        this.f1443L = true;
        this.f1448Q = C0342c.C0345c.RESUMED;
        this.f1451T = new C1776j<>();
        new AtomicInteger();
        this.f1455X = new ArrayList<>();
        this.f1449R = new C0347e(this);
        this.f1453V = new C0006a(this);
        this.f1452U = null;
    }

    public C0286k(int i) {
        this();
        this.f1454W = i;
    }

    /* renamed from: A */
    public final String mo1582A(int i) {
        return mo1644w().getString(i);
    }

    /* renamed from: B */
    public final boolean mo1583B() {
        return this.f1472u > 0;
    }

    /* renamed from: C */
    public boolean mo1584C() {
        return false;
    }

    /* renamed from: D */
    public final boolean mo1585D() {
        C0286k kVar = this.f1476y;
        return kVar != null && (kVar.f1467p || kVar.mo1585D());
    }

    @Deprecated
    /* renamed from: E */
    public void mo1586E(int i, int i2, Intent intent) {
        if (C0302r.m864N(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    /* renamed from: F */
    public void mo1587F(Context context) {
        this.f1439H = true;
        C1647i<?> iVar = this.f1474w;
        if ((iVar == null ? null : iVar.f5042e) != null) {
            this.f1439H = false;
            this.f1439H = true;
        }
    }

    @Deprecated
    /* renamed from: G */
    public void mo1588G(C0286k kVar) {
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        Parcelable parcelable;
        boolean z = true;
        this.f1439H = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f1475x.mo1698Z(parcelable);
            this.f1475x.mo1720m();
        }
        C0302r rVar = this.f1475x;
        if (rVar.f1545p < 1) {
            z = false;
        }
        if (!z) {
            rVar.mo1720m();
        }
    }

    /* renamed from: I */
    public void mo1590I(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f1454W;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: K */
    public void mo1592K() {
        this.f1439H = true;
    }

    /* renamed from: L */
    public void mo1593L() {
        this.f1439H = true;
    }

    /* renamed from: M */
    public LayoutInflater mo1594M(Bundle bundle) {
        C1647i<?> iVar = this.f1474w;
        if (iVar != null) {
            LayoutInflater i = iVar.mo5801i();
            i.setFactory2(this.f1475x.f1535f);
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: N */
    public void mo1595N(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1439H = true;
        C1647i<?> iVar = this.f1474w;
        if ((iVar == null ? null : iVar.f5042e) != null) {
            this.f1439H = false;
            this.f1439H = true;
        }
    }

    /* renamed from: O */
    public boolean mo1596O(MenuItem menuItem) {
        return false;
    }

    /* renamed from: P */
    public void mo1597P(Menu menu) {
    }

    /* renamed from: Q */
    public void mo1598Q(boolean z) {
    }

    /* renamed from: R */
    public void mo1599R(Bundle bundle) {
    }

    /* renamed from: S */
    public void mo1600S() {
        this.f1439H = true;
    }

    /* renamed from: T */
    public void mo1601T() {
        this.f1439H = true;
    }

    /* renamed from: U */
    public void mo1602U(View view, Bundle bundle) {
    }

    /* renamed from: V */
    public void mo1603V(Bundle bundle) {
        this.f1439H = true;
    }

    /* renamed from: W */
    public void mo1604W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1475x.mo1693U();
        boolean z = true;
        this.f1471t = true;
        this.f1450S = new C1669v(this, mo116j());
        View J = mo1591J(layoutInflater, viewGroup, bundle);
        this.f1441J = J;
        if (J != null) {
            this.f1450S.mo5861b();
            this.f1441J.setTag(R.id.view_tree_lifecycle_owner, this.f1450S);
            this.f1441J.setTag(R.id.view_tree_view_model_store_owner, this.f1450S);
            this.f1441J.setTag(R.id.view_tree_saved_state_registry_owner, this.f1450S);
            this.f1451T.mo6061h(this.f1450S);
            return;
        }
        if (this.f1450S.f5104f == null) {
            z = false;
        }
        if (!z) {
            this.f1450S = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* renamed from: X */
    public void mo1605X() {
        this.f1475x.mo1731w(1);
        if (this.f1441J != null) {
            C1669v vVar = this.f1450S;
            vVar.mo5861b();
            if (vVar.f5104f.f1689b.compareTo(C0342c.C0345c.CREATED) >= 0) {
                this.f1450S.mo5860a(C0342c.C0344b.ON_DESTROY);
            }
        }
        this.f1456e = 1;
        this.f1439H = false;
        mo1592K();
        if (this.f1439H) {
            C1830b.C1832b bVar = ((C1830b) C1829a.m5026b(this)).f5525b;
            int m = bVar.f5527c.mo5635m();
            for (int i = 0; i < m; i++) {
                Objects.requireNonNull(bVar.f5527c.mo5636n(i));
            }
            this.f1471t = false;
            return;
        }
        throw new C1673z(C1640c.m4558a("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    /* renamed from: Y */
    public void mo1606Y() {
        onLowMemory();
        this.f1475x.mo1723p();
    }

    /* renamed from: Z */
    public boolean mo1607Z(Menu menu) {
        boolean z = false;
        if (this.f1434C) {
            return false;
        }
        if (this.f1437F && this.f1438G) {
            z = true;
            mo1597P(menu);
        }
        return z | this.f1475x.mo1730v(menu);
    }

    /* renamed from: a */
    public C1645g mo1608a() {
        return new C0287a();
    }

    /* renamed from: a0 */
    public final C1643f mo1609a0() {
        C1643f fVar;
        C1647i<?> iVar = this.f1474w;
        if (iVar == null) {
            fVar = null;
        } else {
            fVar = (C1643f) iVar.f5042e;
        }
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", this, " not attached to an activity."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0137, code lost:
        r1 = r2.f1463l;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1610b(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.f1477z
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.f1432A
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.f1433B
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f1456e
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f1460i
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.f1472u
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f1466o
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f1467p
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f1468q
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.f1469r
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.f1434C
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.f1435D
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.f1438G
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.f1437F
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.f1436E
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.f1443L
            r5.println(r0)
            androidx.fragment.app.r r0 = r2.f1473v
            if (r0 == 0) goto L_0x00c8
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.r r0 = r2.f1473v
            r5.println(r0)
        L_0x00c8:
            r0.i<?> r0 = r2.f1474w
            if (r0 == 0) goto L_0x00d9
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            r0.i<?> r0 = r2.f1474w
            r5.println(r0)
        L_0x00d9:
            androidx.fragment.app.k r0 = r2.f1476y
            if (r0 == 0) goto L_0x00ea
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.k r0 = r2.f1476y
            r5.println(r0)
        L_0x00ea:
            android.os.Bundle r0 = r2.f1461j
            if (r0 == 0) goto L_0x00fb
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1461j
            r5.println(r0)
        L_0x00fb:
            android.os.Bundle r0 = r2.f1457f
            if (r0 == 0) goto L_0x010c
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1457f
            r5.println(r0)
        L_0x010c:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1458g
            if (r0 == 0) goto L_0x011d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1458g
            r5.println(r0)
        L_0x011d:
            android.os.Bundle r0 = r2.f1459h
            if (r0 == 0) goto L_0x012e
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1459h
            r5.println(r0)
        L_0x012e:
            androidx.fragment.app.k r0 = r2.f1462k
            if (r0 == 0) goto L_0x0133
            goto L_0x0143
        L_0x0133:
            androidx.fragment.app.r r0 = r2.f1473v
            if (r0 == 0) goto L_0x0142
            java.lang.String r1 = r2.f1463l
            if (r1 == 0) goto L_0x0142
            r0.o r0 = r0.f1532c
            androidx.fragment.app.k r0 = r0.mo5823d(r1)
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x015a
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f1464m
            r5.println(r0)
        L_0x015a:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            boolean r0 = r2.mo1639s()
            r5.println(r0)
            int r0 = r2.mo1626k()
            if (r0 == 0) goto L_0x017e
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.mo1626k()
            r5.println(r0)
        L_0x017e:
            int r0 = r2.mo1631n()
            if (r0 == 0) goto L_0x0193
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.mo1631n()
            r5.println(r0)
        L_0x0193:
            int r0 = r2.mo1640t()
            if (r0 == 0) goto L_0x01a8
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.mo1640t()
            r5.println(r0)
        L_0x01a8:
            int r0 = r2.mo1642u()
            if (r0 == 0) goto L_0x01bd
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.mo1642u()
            r5.println(r0)
        L_0x01bd:
            android.view.ViewGroup r0 = r2.f1440I
            if (r0 == 0) goto L_0x01ce
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.f1440I
            r5.println(r0)
        L_0x01ce:
            android.view.View r0 = r2.f1441J
            if (r0 == 0) goto L_0x01df
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.f1441J
            r5.println(r0)
        L_0x01df:
            android.view.View r0 = r2.mo1618g()
            if (r0 == 0) goto L_0x01f4
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.mo1618g()
            r5.println(r0)
        L_0x01f4:
            android.content.Context r0 = r2.mo1623i()
            if (r0 == 0) goto L_0x0201
            u0.a r0 = p124u0.C1829a.m5026b(r2)
            r0.mo6206a(r3, r4, r5, r6)
        L_0x0201:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.r r1 = r2.f1475x
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.r r0 = r2.f1475x
            java.lang.String r1 = "  "
            java.lang.String r3 = p063k.C1142f.m3365a(r3, r1)
            r0.mo1733y(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0286k.mo1610b(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* renamed from: b0 */
    public final Context mo1611b0() {
        Context i = mo1623i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: c */
    public C0342c mo113c() {
        return this.f1449R;
    }

    /* renamed from: c0 */
    public final View mo1612c0() {
        View view = this.f1441J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: d0 */
    public void mo1613d0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1475x.mo1698Z(parcelable);
            this.f1475x.mo1720m();
        }
    }

    /* renamed from: e */
    public final C0483a mo3e() {
        return this.f1453V.f2b;
    }

    /* renamed from: e0 */
    public void mo1614e0(View view) {
        mo1616f().f1479a = view;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C0288b mo1616f() {
        if (this.f1444M == null) {
            this.f1444M = new C0288b();
        }
        return this.f1444M;
    }

    /* renamed from: f0 */
    public void mo1617f0(int i, int i2, int i3, int i4) {
        if (this.f1444M != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            mo1616f().f1482d = i;
            mo1616f().f1483e = i2;
            mo1616f().f1484f = i3;
            mo1616f().f1485g = i4;
        }
    }

    /* renamed from: g */
    public View mo1618g() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        return bVar.f1479a;
    }

    /* renamed from: g0 */
    public void mo1619g0(Animator animator) {
        mo1616f().f1480b = animator;
    }

    /* renamed from: h */
    public final C0302r mo1620h() {
        if (this.f1474w != null) {
            return this.f1475x;
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: h0 */
    public void mo1621h0(Bundle bundle) {
        C0302r rVar = this.f1473v;
        if (rVar != null) {
            if (rVar == null ? false : rVar.mo1690R()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1461j = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public Context mo1623i() {
        C1647i<?> iVar = this.f1474w;
        if (iVar == null) {
            return null;
        }
        return iVar.f5043f;
    }

    /* renamed from: i0 */
    public void mo1624i0(View view) {
        mo1616f().f1493o = null;
    }

    /* renamed from: j */
    public C1784r mo116j() {
        if (this.f1473v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (mo1637q() != 1) {
            C1651l lVar = this.f1473v.f1528J;
            C1784r rVar = lVar.f5052e.get(this.f1460i);
            if (rVar != null) {
                return rVar;
            }
            C1784r rVar2 = new C1784r();
            lVar.f5052e.put(this.f1460i, rVar2);
            return rVar2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* renamed from: j0 */
    public void mo1625j0(boolean z) {
        mo1616f().f1495q = z;
    }

    /* renamed from: k */
    public int mo1626k() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1482d;
    }

    /* renamed from: k0 */
    public void mo1627k0(C0291e eVar) {
        mo1616f();
        C0291e eVar2 = this.f1444M.f1494p;
        if (eVar != eVar2) {
            if (eVar != null && eVar2 != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            } else if (eVar != null) {
                ((C0302r.C0318o) eVar).f1572c++;
            }
        }
    }

    /* renamed from: l */
    public Object mo1628l() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* renamed from: l0 */
    public void mo1629l0(boolean z) {
        if (this.f1444M != null) {
            mo1616f().f1481c = z;
        }
    }

    /* renamed from: m */
    public void mo1630m() {
        C0288b bVar = this.f1444M;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    /* renamed from: n */
    public int mo1631n() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1483e;
    }

    /* renamed from: o */
    public Object mo1632o() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1439H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo1609a0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1439H = true;
    }

    /* renamed from: p */
    public void mo1636p() {
        C0288b bVar = this.f1444M;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    /* renamed from: q */
    public final int mo1637q() {
        C0342c.C0345c cVar = this.f1448Q;
        return (cVar == C0342c.C0345c.INITIALIZED || this.f1476y == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f1476y.mo1637q());
    }

    /* renamed from: r */
    public final C0302r mo1638r() {
        C0302r rVar = this.f1473v;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", this, " not associated with a fragment manager."));
    }

    /* renamed from: s */
    public boolean mo1639s() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return false;
        }
        return bVar.f1481c;
    }

    /* renamed from: t */
    public int mo1640t() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1484f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1460i);
        if (this.f1477z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1477z));
        }
        if (this.f1433B != null) {
            sb.append(" tag=");
            sb.append(this.f1433B);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo1642u() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1485g;
    }

    /* renamed from: v */
    public Object mo1643v() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1490l;
        if (obj != f1431Y) {
            return obj;
        }
        mo1632o();
        return null;
    }

    /* renamed from: w */
    public final Resources mo1644w() {
        return mo1611b0().getResources();
    }

    /* renamed from: x */
    public Object mo1645x() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1489k;
        if (obj != f1431Y) {
            return obj;
        }
        mo1628l();
        return null;
    }

    /* renamed from: y */
    public Object mo1646y() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* renamed from: z */
    public Object mo1647z() {
        C0288b bVar = this.f1444M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1491m;
        if (obj != f1431Y) {
            return obj;
        }
        mo1646y();
        return null;
    }
}
