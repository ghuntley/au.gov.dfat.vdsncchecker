package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0323u;
import androidx.fragment.app.C0329z;
import androidx.lifecycle.C0342c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p015c.C0555d;
import p016c0.C0559c;
import p027e.C0852a;
import p027e.C0854b;
import p027e.C0855c;
import p027e.C0859g;
import p033f.C0881a;
import p034f0.C0885a;
import p063k.C1142f;
import p106r0.C1645g;
import p106r0.C1647i;
import p106r0.C1648j;
import p106r0.C1651l;
import p106r0.C1653m;
import p106r0.C1654n;
import p106r0.C1656o;
import p106r0.C1671x;
import p106r0.C1672y;

/* renamed from: androidx.fragment.app.r */
public abstract class C0302r {

    /* renamed from: A */
    public boolean f1519A;

    /* renamed from: B */
    public boolean f1520B;

    /* renamed from: C */
    public boolean f1521C;

    /* renamed from: D */
    public boolean f1522D;

    /* renamed from: E */
    public boolean f1523E;

    /* renamed from: F */
    public ArrayList<C0262a> f1524F;

    /* renamed from: G */
    public ArrayList<Boolean> f1525G;

    /* renamed from: H */
    public ArrayList<C0286k> f1526H;

    /* renamed from: I */
    public ArrayList<C0318o> f1527I;

    /* renamed from: J */
    public C1651l f1528J;

    /* renamed from: K */
    public Runnable f1529K = new C0309g();

    /* renamed from: a */
    public final ArrayList<C0316m> f1530a = new ArrayList<>();

    /* renamed from: b */
    public boolean f1531b;

    /* renamed from: c */
    public final C1656o f1532c = new C1656o();

    /* renamed from: d */
    public ArrayList<C0262a> f1533d;

    /* renamed from: e */
    public ArrayList<C0286k> f1534e;

    /* renamed from: f */
    public final C1648j f1535f = new C1648j(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f1536g;

    /* renamed from: h */
    public final C0555d f1537h = new C0305c(false);

    /* renamed from: i */
    public final AtomicInteger f1538i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, Bundle> f1539j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Object> f1540k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public Map<C0286k, HashSet<C0885a>> f1541l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final C0329z.C0330a f1542m = new C0306d();

    /* renamed from: n */
    public final C0300q f1543n = new C0300q(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<C1653m> f1544o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public int f1545p = -1;

    /* renamed from: q */
    public C1647i<?> f1546q;

    /* renamed from: r */
    public C1645g f1547r;

    /* renamed from: s */
    public C0286k f1548s;

    /* renamed from: t */
    public C0286k f1549t;

    /* renamed from: u */
    public C0299p f1550u = new C0307e();

    /* renamed from: v */
    public C1672y f1551v = new C0308f(this);

    /* renamed from: w */
    public C0855c<Intent> f1552w;

    /* renamed from: x */
    public C0855c<C0859g> f1553x;

    /* renamed from: y */
    public C0855c<String[]> f1554y;

    /* renamed from: z */
    public ArrayDeque<C0314l> f1555z = new ArrayDeque<>();

    /* renamed from: androidx.fragment.app.r$a */
    public class C0303a implements C0854b<C0852a> {
        public C0303a() {
        }

        /* renamed from: a */
        public void mo1735a(Object obj) {
            C0852a aVar = (C0852a) obj;
            C0314l pollFirst = C0302r.this.f1555z.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f1564e;
                int i = pollFirst.f1565f;
                C0286k e = C0302r.this.f1532c.mo5824e(str);
                if (e != null) {
                    e.mo1586E(i, aVar.f3303e, aVar.f3304f);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    public class C0304b implements C0854b<Map<String, Boolean>> {
        public C0304b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo1735a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C0314l pollFirst = C0302r.this.f1555z.pollFirst();
            if (pollFirst != null) {
                C0302r.this.f1532c.mo5824e(pollFirst.f1564e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$c */
    public class C0305c extends C0555d {
        public C0305c(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo1736a() {
            C0302r rVar = C0302r.this;
            rVar.mo1676C(true);
            if (rVar.f1537h.f2356a) {
                rVar.mo1694V();
            } else {
                rVar.f1536g.mo140b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$d */
    public class C0306d implements C0329z.C0330a {
        public C0306d() {
        }

        /* renamed from: a */
        public void mo1737a(C0286k kVar, C0885a aVar) {
            boolean z;
            synchronized (aVar) {
                z = aVar.f3349a;
            }
            if (!z) {
                C0302r rVar = C0302r.this;
                HashSet hashSet = rVar.f1541l.get(kVar);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    rVar.f1541l.remove(kVar);
                    if (kVar.f1456e < 5) {
                        rVar.mo1715i(kVar);
                        rVar.mo1692T(kVar, rVar.f1545p);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo1738b(C0286k kVar, C0885a aVar) {
            C0302r rVar = C0302r.this;
            if (rVar.f1541l.get(kVar) == null) {
                rVar.f1541l.put(kVar, new HashSet());
            }
            rVar.f1541l.get(kVar).add(aVar);
        }
    }

    /* renamed from: androidx.fragment.app.r$e */
    public class C0307e extends C0299p {
        public C0307e() {
        }

        /* renamed from: a */
        public C0286k mo1659a(ClassLoader classLoader, String str) {
            C1647i<?> iVar = C0302r.this.f1546q;
            Context context = iVar.f5043f;
            Objects.requireNonNull(iVar);
            Object obj = C0286k.f1431Y;
            try {
                return (C0286k) C0299p.m848c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new C0286k.C0289c(C0559c.m1823a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$f */
    public class C0308f implements C1672y {
        public C0308f(C0302r rVar) {
        }
    }

    /* renamed from: androidx.fragment.app.r$g */
    public class C0309g implements Runnable {
        public C0309g() {
        }

        public void run() {
            C0302r.this.mo1676C(true);
        }
    }

    /* renamed from: androidx.fragment.app.r$h */
    public class C0310h implements C1653m {

        /* renamed from: e */
        public final /* synthetic */ C0286k f1562e;

        public C0310h(C0302r rVar, C0286k kVar) {
            this.f1562e = kVar;
        }

        /* renamed from: a */
        public void mo1740a(C0302r rVar, C0286k kVar) {
            this.f1562e.mo1588G(kVar);
        }
    }

    /* renamed from: androidx.fragment.app.r$i */
    public class C0311i implements C0854b<C0852a> {
        public C0311i() {
        }

        /* renamed from: a */
        public void mo1735a(Object obj) {
            C0852a aVar = (C0852a) obj;
            C0314l pollFirst = C0302r.this.f1555z.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f1564e;
                int i = pollFirst.f1565f;
                C0286k e = C0302r.this.f1532c.mo5824e(str);
                if (e != null) {
                    e.mo1586E(i, aVar.f3303e, aVar.f3304f);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$j */
    public static class C0312j extends C0881a<C0859g, C0852a> {
        /* renamed from: a */
        public Intent mo1741a(Context context, Object obj) {
            Bundle bundleExtra;
            C0859g gVar = (C0859g) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = gVar.f3310f;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new C0859g(gVar.f3309e, (Intent) null, gVar.f3311g, gVar.f3312h);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (C0302r.m864N(2)) {
                intent.toString();
            }
            return intent;
        }

        /* renamed from: c */
        public Object mo1742c(int i, Intent intent) {
            return new C0852a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.r$k */
    public static abstract class C0313k {
        /* renamed from: a */
        public abstract void mo1743a(C0302r rVar, C0286k kVar);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.r$l */
    public static class C0314l implements Parcelable {
        public static final Parcelable.Creator<C0314l> CREATOR = new C0315a();

        /* renamed from: e */
        public String f1564e;

        /* renamed from: f */
        public int f1565f;

        /* renamed from: androidx.fragment.app.r$l$a */
        public class C0315a implements Parcelable.Creator<C0314l> {
            public Object createFromParcel(Parcel parcel) {
                return new C0314l(parcel);
            }

            public Object[] newArray(int i) {
                return new C0314l[i];
            }
        }

        public C0314l(Parcel parcel) {
            this.f1564e = parcel.readString();
            this.f1565f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1564e);
            parcel.writeInt(this.f1565f);
        }
    }

    /* renamed from: androidx.fragment.app.r$m */
    public interface C0316m {
        /* renamed from: a */
        boolean mo1533a(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.r$n */
    public class C0317n implements C0316m {

        /* renamed from: a */
        public final String f1566a;

        /* renamed from: b */
        public final int f1567b;

        /* renamed from: c */
        public final int f1568c;

        public C0317n(String str, int i, int i2) {
            this.f1566a = str;
            this.f1567b = i;
            this.f1568c = i2;
        }

        /* renamed from: a */
        public boolean mo1533a(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2) {
            C0286k kVar = C0302r.this.f1549t;
            if (kVar != null && this.f1567b < 0 && this.f1566a == null && kVar.mo1620h().mo1694V()) {
                return false;
            }
            return C0302r.this.mo1695W(arrayList, arrayList2, this.f1566a, this.f1567b, this.f1568c);
        }
    }

    /* renamed from: androidx.fragment.app.r$o */
    public static class C0318o implements C0286k.C0291e {

        /* renamed from: a */
        public final boolean f1570a;

        /* renamed from: b */
        public final C0262a f1571b;

        /* renamed from: c */
        public int f1572c;

        /* renamed from: a */
        public void mo1748a() {
            boolean z = this.f1572c > 0;
            for (C0286k k0 : this.f1571b.f1355q.f1532c.mo5828i()) {
                k0.mo1627k0((C0286k.C0291e) null);
            }
            C0262a aVar = this.f1571b;
            aVar.f1355q.mo1711g(aVar, this.f1570a, !z, true);
        }
    }

    /* renamed from: N */
    public static boolean m864N(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: A */
    public void mo1674A(C0316m mVar, boolean z) {
        if (!z) {
            if (this.f1546q == null) {
                if (this.f1522D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (mo1690R()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1530a) {
            if (this.f1546q != null) {
                this.f1530a.add(mVar);
                mo1702b0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: B */
    public final void mo1675B(boolean z) {
        if (this.f1531b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1546q == null) {
            if (this.f1522D) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1546q.f5044g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z || !mo1690R()) {
            if (this.f1524F == null) {
                this.f1524F = new ArrayList<>();
                this.f1525G = new ArrayList<>();
            }
            this.f1531b = true;
            try {
                mo1679F((ArrayList<C0262a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1531b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public boolean mo1676C(boolean z) {
        boolean z2;
        mo1675B(z);
        boolean z3 = false;
        while (true) {
            ArrayList<C0262a> arrayList = this.f1524F;
            ArrayList<Boolean> arrayList2 = this.f1525G;
            synchronized (this.f1530a) {
                if (this.f1530a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f1530a.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= this.f1530a.get(i).mo1533a(arrayList, arrayList2);
                    }
                    this.f1530a.clear();
                    this.f1546q.f5044g.removeCallbacks(this.f1529K);
                }
            }
            if (z2) {
                this.f1531b = true;
                try {
                    mo1697Y(this.f1524F, this.f1525G);
                    mo1707e();
                    z3 = true;
                } catch (Throwable th) {
                    mo1707e();
                    throw th;
                }
            } else {
                mo1716i0();
                mo1732x();
                this.f1532c.mo5821b();
                return z3;
            }
        }
        while (true) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: D */
    public void mo1677D(C0316m mVar, boolean z) {
        if (!z || (this.f1546q != null && !this.f1522D)) {
            mo1675B(z);
            ((C0262a) mVar).mo1533a(this.f1524F, this.f1525G);
            this.f1531b = true;
            try {
                mo1697Y(this.f1524F, this.f1525G);
                mo1707e();
                mo1716i0();
                mo1732x();
                this.f1532c.mo5821b();
            } catch (Throwable th) {
                mo1707e();
                throw th;
            }
        }
    }

    /* renamed from: E */
    public final void mo1678E(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        int i4;
        ArrayList<C0262a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = arrayList3.get(i5).f1602p;
        ArrayList<C0286k> arrayList5 = this.f1526H;
        if (arrayList5 == null) {
            this.f1526H = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1526H.addAll(this.f1532c.mo5828i());
        C0286k kVar = this.f1549t;
        int i7 = i5;
        boolean z2 = false;
        while (true) {
            int i8 = 1;
            if (i7 < i6) {
                C0262a aVar = arrayList3.get(i7);
                int i9 = 3;
                if (!arrayList4.get(i7).booleanValue()) {
                    ArrayList<C0286k> arrayList6 = this.f1526H;
                    int i10 = 0;
                    while (i10 < aVar.f1587a.size()) {
                        C0323u.C0324a aVar2 = aVar.f1587a.get(i10);
                        int i11 = aVar2.f1603a;
                        if (i11 != i8) {
                            if (i11 == 2) {
                                C0286k kVar2 = aVar2.f1604b;
                                int i12 = kVar2.f1432A;
                                int size = arrayList6.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    C0286k kVar3 = arrayList6.get(size);
                                    if (kVar3.f1432A != i12) {
                                        i4 = i12;
                                    } else if (kVar3 == kVar2) {
                                        i4 = i12;
                                        z3 = true;
                                    } else {
                                        if (kVar3 == kVar) {
                                            i4 = i12;
                                            aVar.f1587a.add(i10, new C0323u.C0324a(9, kVar3));
                                            i10++;
                                            kVar = null;
                                        } else {
                                            i4 = i12;
                                        }
                                        C0323u.C0324a aVar3 = new C0323u.C0324a(3, kVar3);
                                        aVar3.f1605c = aVar2.f1605c;
                                        aVar3.f1607e = aVar2.f1607e;
                                        aVar3.f1606d = aVar2.f1606d;
                                        aVar3.f1608f = aVar2.f1608f;
                                        aVar.f1587a.add(i10, aVar3);
                                        arrayList6.remove(kVar3);
                                        i10++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i12 = i4;
                                }
                                if (z3) {
                                    aVar.f1587a.remove(i10);
                                    i10--;
                                } else {
                                    i3 = 1;
                                    aVar2.f1603a = 1;
                                    arrayList6.add(kVar2);
                                    i10 += i3;
                                    int i13 = i;
                                    i8 = i3;
                                    i9 = 3;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                }
                            } else if (i11 == i9 || i11 == 6) {
                                arrayList6.remove(aVar2.f1604b);
                                C0286k kVar4 = aVar2.f1604b;
                                if (kVar4 == kVar) {
                                    aVar.f1587a.add(i10, new C0323u.C0324a(9, kVar4));
                                    i10++;
                                    i3 = 1;
                                    kVar = null;
                                    i10 += i3;
                                    int i132 = i;
                                    i8 = i3;
                                    i9 = 3;
                                    ArrayList<Boolean> arrayList82 = arrayList2;
                                }
                            } else if (i11 == 7) {
                                i3 = 1;
                            } else if (i11 == 8) {
                                aVar.f1587a.add(i10, new C0323u.C0324a(9, kVar));
                                i10++;
                                kVar = aVar2.f1604b;
                            }
                            i3 = 1;
                            i10 += i3;
                            int i1322 = i;
                            i8 = i3;
                            i9 = 3;
                            ArrayList<Boolean> arrayList822 = arrayList2;
                        } else {
                            i3 = i8;
                        }
                        arrayList6.add(aVar2.f1604b);
                        i10 += i3;
                        int i13222 = i;
                        i8 = i3;
                        i9 = 3;
                        ArrayList<Boolean> arrayList8222 = arrayList2;
                    }
                } else {
                    int i14 = 1;
                    ArrayList<C0286k> arrayList9 = this.f1526H;
                    int size2 = aVar.f1587a.size() - 1;
                    while (size2 >= 0) {
                        C0323u.C0324a aVar4 = aVar.f1587a.get(size2);
                        int i15 = aVar4.f1603a;
                        if (i15 != i14) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        kVar = null;
                                        break;
                                    case 9:
                                        kVar = aVar4.f1604b;
                                        break;
                                    case 10:
                                        aVar4.f1610h = aVar4.f1609g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.f1604b);
                            size2--;
                            i14 = 1;
                        }
                        arrayList9.remove(aVar4.f1604b);
                        size2--;
                        i14 = 1;
                    }
                }
                z2 = z2 || aVar.f1593g;
                i7++;
                arrayList4 = arrayList2;
                int i16 = i;
            } else {
                this.f1526H.clear();
                if (!z && this.f1545p >= 1) {
                    for (int i17 = i; i17 < i6; i17++) {
                        Iterator<C0323u.C0324a> it = arrayList3.get(i17).f1587a.iterator();
                        while (it.hasNext()) {
                            C0286k kVar5 = it.next().f1604b;
                            if (!(kVar5 == null || kVar5.f1473v == null)) {
                                this.f1532c.mo5829j(mo1713h(kVar5));
                            }
                        }
                    }
                }
                int i18 = i;
                while (i18 < i6) {
                    C0262a aVar5 = arrayList3.get(i18);
                    if (arrayList2.get(i18).booleanValue()) {
                        aVar5.mo1535d(-1);
                        aVar5.mo1540i(i18 == i6 + -1);
                    } else {
                        aVar5.mo1535d(1);
                        aVar5.mo1539h();
                    }
                    i18++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                boolean booleanValue = arrayList10.get(i6 - 1).booleanValue();
                for (int i19 = i; i19 < i6; i19++) {
                    C0262a aVar6 = arrayList3.get(i19);
                    if (booleanValue) {
                        for (int size3 = aVar6.f1587a.size() - 1; size3 >= 0; size3--) {
                            C0286k kVar6 = aVar6.f1587a.get(size3).f1604b;
                            if (kVar6 != null) {
                                mo1713h(kVar6).mo1763k();
                            }
                        }
                    } else {
                        Iterator<C0323u.C0324a> it2 = aVar6.f1587a.iterator();
                        while (it2.hasNext()) {
                            C0286k kVar7 = it2.next().f1604b;
                            if (kVar7 != null) {
                                mo1713h(kVar7).mo1763k();
                            }
                        }
                    }
                }
                mo1691S(this.f1545p, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i6; i20++) {
                    Iterator<C0323u.C0324a> it3 = arrayList3.get(i20).f1587a.iterator();
                    while (it3.hasNext()) {
                        C0286k kVar8 = it3.next().f1604b;
                        if (!(kVar8 == null || (viewGroup = kVar8.f1440I) == null)) {
                            hashSet.add(C0263a0.m752g(viewGroup, mo1685L()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0263a0 a0Var = (C0263a0) it4.next();
                    a0Var.f1361d = booleanValue;
                    a0Var.mo1550h();
                    a0Var.mo1547c();
                }
                for (int i21 = i; i21 < i6; i21++) {
                    C0262a aVar7 = arrayList3.get(i21);
                    if (arrayList10.get(i21).booleanValue() && aVar7.f1357s >= 0) {
                        aVar7.f1357s = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    /* renamed from: F */
    public final void mo1679F(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0318o> arrayList3 = this.f1527I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0318o oVar = this.f1527I.get(i);
            if (arrayList == null || oVar.f1570a || (indexOf2 = arrayList.indexOf(oVar.f1571b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((oVar.f1572c == 0) || (arrayList != null && oVar.f1571b.mo1542k(arrayList, 0, arrayList.size()))) {
                    this.f1527I.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || oVar.f1570a || (indexOf = arrayList.indexOf(oVar.f1571b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        oVar.mo1748a();
                    }
                }
                i++;
            } else {
                this.f1527I.remove(i);
                i--;
                size--;
            }
            C0262a aVar = oVar.f1571b;
            aVar.f1355q.mo1711g(aVar, oVar.f1570a, false, false);
            i++;
        }
    }

    /* renamed from: G */
    public C0286k mo1680G(String str) {
        return this.f1532c.mo5823d(str);
    }

    /* renamed from: H */
    public C0286k mo1681H(int i) {
        C1656o oVar = this.f1532c;
        int size = oVar.f5070b.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0286k kVar = (C0286k) oVar.f5070b.get(size);
                if (kVar != null && kVar.f1477z == i) {
                    return kVar;
                }
            } else {
                for (C0321t tVar : oVar.f5071c.values()) {
                    if (tVar != null) {
                        C0286k kVar2 = tVar.f1583c;
                        if (kVar2.f1477z == i) {
                            return kVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: I */
    public C0286k mo1682I(String str) {
        C1656o oVar = this.f1532c;
        Objects.requireNonNull(oVar);
        if (str != null) {
            int size = oVar.f5070b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0286k kVar = (C0286k) oVar.f5070b.get(size);
                if (kVar != null && str.equals(kVar.f1433B)) {
                    return kVar;
                }
            }
        }
        if (str != null) {
            for (C0321t tVar : oVar.f5071c.values()) {
                if (tVar != null) {
                    C0286k kVar2 = tVar.f1583c;
                    if (str.equals(kVar2.f1433B)) {
                        return kVar2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: J */
    public final ViewGroup mo1683J(C0286k kVar) {
        ViewGroup viewGroup = kVar.f1440I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (kVar.f1432A > 0 && this.f1547r.mo1649f()) {
            View b = this.f1547r.mo1648b(kVar.f1432A);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    /* renamed from: K */
    public C0299p mo1684K() {
        C0286k kVar = this.f1548s;
        return kVar != null ? kVar.f1473v.mo1684K() : this.f1550u;
    }

    /* renamed from: L */
    public C1672y mo1685L() {
        C0286k kVar = this.f1548s;
        return kVar != null ? kVar.f1473v.mo1685L() : this.f1551v;
    }

    /* renamed from: M */
    public void mo1686M(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        if (!kVar.f1434C) {
            kVar.f1434C = true;
            kVar.f1445N = true ^ kVar.f1445N;
            mo1710f0(kVar);
        }
    }

    /* renamed from: O */
    public final boolean mo1687O(C0286k kVar) {
        boolean z;
        if (kVar.f1437F && kVar.f1438G) {
            return true;
        }
        C0302r rVar = kVar.f1475x;
        Iterator it = ((ArrayList) rVar.f1532c.mo5826g()).iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C0286k kVar2 = (C0286k) it.next();
            if (kVar2 != null) {
                z2 = rVar.mo1687O(kVar2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = r3.f1473v;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1688P(androidx.fragment.app.C0286k r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r3.f1438G
            if (r1 == 0) goto L_0x0015
            androidx.fragment.app.r r1 = r3.f1473v
            if (r1 == 0) goto L_0x0016
            androidx.fragment.app.k r3 = r3.f1476y
            boolean r3 = r1.mo1688P(r3)
            if (r3 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0302r.mo1688P(androidx.fragment.app.k):boolean");
    }

    /* renamed from: Q */
    public boolean mo1689Q(C0286k kVar) {
        if (kVar == null) {
            return true;
        }
        C0302r rVar = kVar.f1473v;
        if (!kVar.equals(rVar.f1549t) || !mo1689Q(rVar.f1548s)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public boolean mo1690R() {
        return this.f1520B || this.f1521C;
    }

    /* renamed from: S */
    public void mo1691S(int i, boolean z) {
        C1647i<?> iVar;
        if (this.f1546q == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1545p) {
            this.f1545p = i;
            C1656o oVar = this.f1532c;
            Iterator it = oVar.f5070b.iterator();
            while (it.hasNext()) {
                C0321t tVar = (C0321t) oVar.f5071c.get(((C0286k) it.next()).f1460i);
                if (tVar != null) {
                    tVar.mo1763k();
                }
            }
            Iterator it2 = oVar.f5071c.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C0321t tVar2 = (C0321t) it2.next();
                if (tVar2 != null) {
                    tVar2.mo1763k();
                    C0286k kVar = tVar2.f1583c;
                    if (kVar.f1467p && !kVar.mo1583B()) {
                        z2 = true;
                    }
                    if (z2) {
                        oVar.mo5830k(tVar2);
                    }
                }
            }
            mo1714h0();
            if (this.f1519A && (iVar = this.f1546q) != null && this.f1545p == 7) {
                iVar.mo5803l();
                this.f1519A = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 != 5) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a3  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1692T(androidx.fragment.app.C0286k r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            r0.o r1 = r0.f1532c
            java.lang.String r2 = r7.f1460i
            androidx.fragment.app.t r1 = r1.mo5827h(r2)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            androidx.fragment.app.t r1 = new androidx.fragment.app.t
            androidx.fragment.app.q r2 = r0.f1543n
            r0.o r3 = r0.f1532c
            r1.<init>(r2, r3, r7)
            r1.f1585e = r8
        L_0x001a:
            r9 = r1
            boolean r1 = r7.f1468q
            r10 = 2
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7.f1469r
            if (r1 == 0) goto L_0x002f
            int r1 = r7.f1456e
            if (r1 != r10) goto L_0x002f
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0031
        L_0x002f:
            r1 = r18
        L_0x0031:
            int r2 = r9.mo1756d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.f1456e
            r12 = 3
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L_0x0083
            if (r1 >= r11) goto L_0x004e
            java.util.Map<androidx.fragment.app.k, java.util.HashSet<f0.a>> r1 = r0.f1541l
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004e
            r16.mo1705d(r17)
        L_0x004e:
            int r1 = r7.f1456e
            if (r1 == r2) goto L_0x005e
            if (r1 == 0) goto L_0x0063
            if (r1 == r8) goto L_0x0068
            if (r1 == r10) goto L_0x0072
            if (r1 == r4) goto L_0x0077
            if (r1 == r3) goto L_0x007c
            goto L_0x01a7
        L_0x005e:
            if (r11 <= r2) goto L_0x0063
            r9.mo1755c()
        L_0x0063:
            if (r11 <= 0) goto L_0x0068
            r9.mo1757e()
        L_0x0068:
            if (r11 <= r2) goto L_0x006d
            r9.mo1762j()
        L_0x006d:
            if (r11 <= r8) goto L_0x0072
            r9.mo1758f()
        L_0x0072:
            if (r11 <= r10) goto L_0x0077
            r9.mo1753a()
        L_0x0077:
            if (r11 <= r4) goto L_0x007c
            r9.mo1768p()
        L_0x007c:
            if (r11 <= r3) goto L_0x01a7
            r9.mo1766n()
            goto L_0x01a7
        L_0x0083:
            if (r1 <= r11) goto L_0x01a7
            if (r1 == 0) goto L_0x01a0
            if (r1 == r8) goto L_0x0192
            if (r1 == r10) goto L_0x00c6
            if (r1 == r4) goto L_0x009e
            if (r1 == r3) goto L_0x0099
            r5 = 7
            if (r1 == r5) goto L_0x0094
            goto L_0x01a7
        L_0x0094:
            if (r11 >= r5) goto L_0x0099
            r9.mo1764l()
        L_0x0099:
            if (r11 >= r3) goto L_0x009e
            r9.mo1769q()
        L_0x009e:
            if (r11 >= r4) goto L_0x00c6
            boolean r1 = m864N(r12)
            if (r1 == 0) goto L_0x00b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
        L_0x00b3:
            android.view.View r1 = r7.f1441J
            if (r1 == 0) goto L_0x00c6
            r0.i<?> r1 = r0.f1546q
            boolean r1 = r1.mo5802k(r7)
            if (r1 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r1 = r7.f1458g
            if (r1 != 0) goto L_0x00c6
            r9.mo1767o()
        L_0x00c6:
            if (r11 >= r10) goto L_0x0192
            r1 = 0
            android.view.View r3 = r7.f1441J
            if (r3 == 0) goto L_0x0187
            android.view.ViewGroup r4 = r7.f1440I
            if (r4 == 0) goto L_0x0187
            r4.endViewTransition(r3)
            android.view.View r3 = r7.f1441J
            r3.clearAnimation()
            boolean r3 = r17.mo1585D()
            if (r3 != 0) goto L_0x0187
            int r3 = r0.f1545p
            r4 = 0
            if (r3 <= r2) goto L_0x0103
            boolean r2 = r0.f1522D
            if (r2 != 0) goto L_0x0103
            android.view.View r2 = r7.f1441J
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0103
            float r2 = r7.f1446O
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0103
            r0.i<?> r1 = r0.f1546q
            android.content.Context r1 = r1.f5043f
            r2 = 0
            boolean r3 = r17.mo1639s()
            androidx.fragment.app.o$a r1 = androidx.fragment.app.C0296o.m846a(r1, r7, r2, r3)
        L_0x0103:
            r7.f1446O = r4
            android.view.ViewGroup r13 = r7.f1440I
            android.view.View r14 = r7.f1441J
            if (r1 == 0) goto L_0x015c
            androidx.fragment.app.z$a r2 = r0.f1542m
            r13.startViewTransition(r14)
            f0.a r6 = new f0.a
            r6.<init>()
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r3.<init>(r7)
            r6.mo4191b(r3)
            r5 = r2
            androidx.fragment.app.r$d r5 = (androidx.fragment.app.C0302r.C0306d) r5
            r5.mo1738b(r7, r6)
            android.view.animation.Animation r2 = r1.f1507a
            if (r2 == 0) goto L_0x0141
            androidx.fragment.app.o$b r2 = new androidx.fragment.app.o$b
            android.view.animation.Animation r1 = r1.f1507a
            r2.<init>(r1, r13, r14)
            android.view.View r1 = r7.f1441J
            r7.mo1614e0(r1)
            androidx.fragment.app.m r1 = new androidx.fragment.app.m
            r1.<init>(r13, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.f1441J
            r1.startAnimation(r2)
            goto L_0x015c
        L_0x0141:
            android.animation.Animator r15 = r1.f1508b
            r7.mo1619g0(r15)
            androidx.fragment.app.n r4 = new androidx.fragment.app.n
            r1 = r4
            r2 = r13
            r3 = r14
            r12 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r15.addListener(r12)
            android.view.View r1 = r7.f1441J
            r15.setTarget(r1)
            r15.start()
        L_0x015c:
            r13.removeView(r14)
            boolean r1 = m864N(r10)
            if (r1 == 0) goto L_0x0182
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r13)
        L_0x0182:
            android.view.ViewGroup r1 = r7.f1440I
            if (r13 == r1) goto L_0x0187
            return
        L_0x0187:
            java.util.Map<androidx.fragment.app.k, java.util.HashSet<f0.a>> r1 = r0.f1541l
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x0192
            r9.mo1760h()
        L_0x0192:
            if (r11 >= r8) goto L_0x01a0
            java.util.Map<androidx.fragment.app.k, java.util.HashSet<f0.a>> r1 = r0.f1541l
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x019d
            goto L_0x01a1
        L_0x019d:
            r9.mo1759g()
        L_0x01a0:
            r8 = r11
        L_0x01a1:
            if (r8 >= 0) goto L_0x01a6
            r9.mo1761i()
        L_0x01a6:
            r11 = r8
        L_0x01a7:
            int r1 = r7.f1456e
            if (r1 == r11) goto L_0x01d3
            r1 = 3
            boolean r1 = m864N(r1)
            if (r1 == 0) goto L_0x01d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f1456e
            r1.append(r2)
        L_0x01d1:
            r7.f1456e = r11
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0302r.mo1692T(androidx.fragment.app.k, int):void");
    }

    /* renamed from: U */
    public void mo1693U() {
        if (this.f1546q != null) {
            this.f1520B = false;
            this.f1521C = false;
            this.f1528J.f5055h = false;
            for (C0286k next : this.f1532c.mo5828i()) {
                if (next != null) {
                    next.f1475x.mo1693U();
                }
            }
        }
    }

    /* renamed from: V */
    public boolean mo1694V() {
        mo1676C(false);
        mo1675B(true);
        C0286k kVar = this.f1549t;
        if (kVar != null && kVar.mo1620h().mo1694V()) {
            return true;
        }
        boolean W = mo1695W(this.f1524F, this.f1525G, (String) null, -1, 0);
        if (W) {
            this.f1531b = true;
            try {
                mo1697Y(this.f1524F, this.f1525G);
            } finally {
                mo1707e();
            }
        }
        mo1716i0();
        mo1732x();
        this.f1532c.mo5821b();
        return W;
    }

    /* renamed from: W */
    public boolean mo1695W(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        ArrayList<C0262a> arrayList3 = this.f1533d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1533d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0262a aVar = this.f1533d.get(size2);
                    if ((str != null && str.equals(aVar.f1595i)) || (i >= 0 && i == aVar.f1357s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0262a aVar2 = this.f1533d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1595i)) && (i < 0 || i != aVar2.f1357s)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f1533d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1533d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1533d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: X */
    public void mo1696X(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        boolean z = !kVar.mo1583B();
        if (!kVar.f1435D || z) {
            this.f1532c.mo5831l(kVar);
            if (mo1687O(kVar)) {
                this.f1519A = true;
            }
            kVar.f1467p = true;
            mo1710f0(kVar);
        }
    }

    /* renamed from: Y */
    public final void mo1697Y(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                mo1679F(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f1602p) {
                        if (i2 != i) {
                            mo1678E(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f1602p) {
                                i2++;
                            }
                        }
                        mo1678E(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo1678E(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: Z */
    public void mo1698Z(Parcelable parcelable) {
        C0321t tVar;
        if (parcelable != null) {
            C0319s sVar = (C0319s) parcelable;
            if (sVar.f1573e != null) {
                this.f1532c.f5071c.clear();
                Iterator<C1654n> it = sVar.f1573e.iterator();
                while (it.hasNext()) {
                    C1654n next = it.next();
                    if (next != null) {
                        C0286k kVar = this.f1528J.f5050c.get(next.f5057f);
                        if (kVar != null) {
                            if (m864N(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(kVar);
                            }
                            tVar = new C0321t(this.f1543n, this.f1532c, kVar, next);
                        } else {
                            tVar = new C0321t(this.f1543n, this.f1532c, this.f1546q.f5043f.getClassLoader(), mo1684K(), next);
                        }
                        C0286k kVar2 = tVar.f1583c;
                        kVar2.f1473v = this;
                        if (m864N(2)) {
                            StringBuilder a = C0001b.m0a("restoreSaveState: active (");
                            a.append(kVar2.f1460i);
                            a.append("): ");
                            a.append(kVar2);
                        }
                        tVar.mo1765m(this.f1546q.f5043f.getClassLoader());
                        this.f1532c.mo5829j(tVar);
                        tVar.f1585e = this.f1545p;
                    }
                }
                C1651l lVar = this.f1528J;
                Objects.requireNonNull(lVar);
                Iterator it2 = new ArrayList(lVar.f5050c.values()).iterator();
                while (it2.hasNext()) {
                    C0286k kVar3 = (C0286k) it2.next();
                    if (!this.f1532c.mo5822c(kVar3.f1460i)) {
                        if (m864N(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Discarding retained Fragment ");
                            sb2.append(kVar3);
                            sb2.append(" that was not found in the set of active Fragments ");
                            sb2.append(sVar.f1573e);
                        }
                        this.f1528J.mo5810d(kVar3);
                        kVar3.f1473v = this;
                        C0321t tVar2 = new C0321t(this.f1543n, this.f1532c, kVar3);
                        tVar2.f1585e = 1;
                        tVar2.mo1763k();
                        kVar3.f1467p = true;
                        tVar2.mo1763k();
                    }
                }
                C1656o oVar = this.f1532c;
                ArrayList<String> arrayList = sVar.f1574f;
                oVar.f5070b.clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        C0286k d = oVar.mo5823d(next2);
                        if (d != null) {
                            if (m864N(2)) {
                                d.toString();
                            }
                            oVar.mo5820a(d);
                        } else {
                            throw new IllegalStateException(C0559c.m1823a("No instantiated fragment for (", next2, ")"));
                        }
                    }
                }
                if (sVar.f1575g != null) {
                    this.f1533d = new ArrayList<>(sVar.f1575g.length);
                    int i = 0;
                    while (true) {
                        C0271b[] bVarArr = sVar.f1575g;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0271b bVar = bVarArr[i];
                        Objects.requireNonNull(bVar);
                        C0262a aVar = new C0262a(this);
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int[] iArr = bVar.f1385e;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            C0323u.C0324a aVar2 = new C0323u.C0324a();
                            int i4 = i2 + 1;
                            aVar2.f1603a = iArr[i2];
                            if (m864N(2)) {
                                aVar.toString();
                                int i5 = bVar.f1385e[i4];
                            }
                            String str = bVar.f1386f.get(i3);
                            aVar2.f1604b = str != null ? this.f1532c.mo5823d(str) : null;
                            aVar2.f1609g = C0342c.C0345c.values()[bVar.f1387g[i3]];
                            aVar2.f1610h = C0342c.C0345c.values()[bVar.f1388h[i3]];
                            int[] iArr2 = bVar.f1385e;
                            int i6 = i4 + 1;
                            int i7 = iArr2[i4];
                            aVar2.f1605c = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr2[i6];
                            aVar2.f1606d = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.f1607e = i11;
                            int i12 = iArr2[i10];
                            aVar2.f1608f = i12;
                            aVar.f1588b = i7;
                            aVar.f1589c = i9;
                            aVar.f1590d = i11;
                            aVar.f1591e = i12;
                            aVar.mo1772b(aVar2);
                            i3++;
                            i2 = i10 + 1;
                        }
                        aVar.f1592f = bVar.f1389i;
                        aVar.f1595i = bVar.f1390j;
                        aVar.f1357s = bVar.f1391k;
                        aVar.f1593g = true;
                        aVar.f1596j = bVar.f1392l;
                        aVar.f1597k = bVar.f1393m;
                        aVar.f1598l = bVar.f1394n;
                        aVar.f1599m = bVar.f1395o;
                        aVar.f1600n = bVar.f1396p;
                        aVar.f1601o = bVar.f1397q;
                        aVar.f1602p = bVar.f1398r;
                        aVar.mo1535d(1);
                        if (m864N(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreAllState: back stack #");
                            sb3.append(i);
                            sb3.append(" (index ");
                            sb3.append(aVar.f1357s);
                            sb3.append("): ");
                            sb3.append(aVar);
                            PrintWriter printWriter = new PrintWriter(new C1671x("FragmentManager"));
                            aVar.mo1538g("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1533d.add(aVar);
                        i++;
                    }
                } else {
                    this.f1533d = null;
                }
                this.f1538i.set(sVar.f1576h);
                String str2 = sVar.f1577i;
                if (str2 != null) {
                    C0286k G = mo1680G(str2);
                    this.f1549t = G;
                    mo1727t(G);
                }
                ArrayList<String> arrayList2 = sVar.f1578j;
                if (arrayList2 != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        Bundle bundle = sVar.f1579k.get(i13);
                        bundle.setClassLoader(this.f1546q.f5043f.getClassLoader());
                        this.f1539j.put(arrayList2.get(i13), bundle);
                    }
                }
                this.f1555z = new ArrayDeque<>(sVar.f1580l);
            }
        }
    }

    /* renamed from: a */
    public C0321t mo1699a(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        C0321t h = mo1713h(kVar);
        kVar.f1473v = this;
        this.f1532c.mo5829j(h);
        if (!kVar.f1435D) {
            this.f1532c.mo5820a(kVar);
            kVar.f1467p = false;
            if (kVar.f1441J == null) {
                kVar.f1445N = false;
            }
            if (mo1687O(kVar)) {
                this.f1519A = true;
            }
        }
        return h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo1700a0() {
        /*
            r11 = this;
            java.util.Set r0 = r11.mo1709f()
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.a0 r1 = (androidx.fragment.app.C0263a0) r1
            boolean r3 = r1.f1362e
            if (r3 == 0) goto L_0x000a
            r1.f1362e = r2
            r1.mo1547c()
            goto L_0x000a
        L_0x0021:
            r11.mo1734z()
            r0 = 1
            r11.mo1676C(r0)
            r11.f1520B = r0
            r0.l r1 = r11.f1528J
            r1.f5055h = r0
            r0.o r0 = r11.f1532c
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.t> r3 = r0.f5071c
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            r1.<init>(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.t> r0 = r0.f5071c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r3 = r0.hasNext()
            r4 = 2
            r5 = 0
            if (r3 == 0) goto L_0x0125
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.t r3 = (androidx.fragment.app.C0321t) r3
            if (r3 == 0) goto L_0x004c
            androidx.fragment.app.k r6 = r3.f1583c
            r0.n r7 = new r0.n
            r7.<init>((androidx.fragment.app.C0286k) r6)
            androidx.fragment.app.k r8 = r3.f1583c
            int r9 = r8.f1456e
            r10 = -1
            if (r9 <= r10) goto L_0x010e
            android.os.Bundle r9 = r7.f5068q
            if (r9 != 0) goto L_0x010e
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.k r9 = r3.f1583c
            r9.mo1599R(r8)
            a1.a r10 = r9.f1453V
            r10.mo2b(r8)
            androidx.fragment.app.r r9 = r9.f1475x
            android.os.Parcelable r9 = r9.mo1700a0()
            if (r9 == 0) goto L_0x008a
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L_0x008a:
            androidx.fragment.app.q r9 = r3.f1581a
            androidx.fragment.app.k r10 = r3.f1583c
            r9.mo1669j(r10, r8, r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r5 = r8
        L_0x0099:
            androidx.fragment.app.k r8 = r3.f1583c
            android.view.View r8 = r8.f1441J
            if (r8 == 0) goto L_0x00a2
            r3.mo1767o()
        L_0x00a2:
            androidx.fragment.app.k r8 = r3.f1583c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f1458g
            if (r8 == 0) goto L_0x00b8
            if (r5 != 0) goto L_0x00af
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x00af:
            androidx.fragment.app.k r8 = r3.f1583c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f1458g
            java.lang.String r9 = "android:view_state"
            r5.putSparseParcelableArray(r9, r8)
        L_0x00b8:
            androidx.fragment.app.k r8 = r3.f1583c
            android.os.Bundle r8 = r8.f1459h
            if (r8 == 0) goto L_0x00ce
            if (r5 != 0) goto L_0x00c5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x00c5:
            androidx.fragment.app.k r8 = r3.f1583c
            android.os.Bundle r8 = r8.f1459h
            java.lang.String r9 = "android:view_registry_state"
            r5.putBundle(r9, r8)
        L_0x00ce:
            androidx.fragment.app.k r8 = r3.f1583c
            boolean r8 = r8.f1443L
            if (r8 != 0) goto L_0x00e4
            if (r5 != 0) goto L_0x00db
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x00db:
            androidx.fragment.app.k r8 = r3.f1583c
            boolean r8 = r8.f1443L
            java.lang.String r9 = "android:user_visible_hint"
            r5.putBoolean(r9, r8)
        L_0x00e4:
            r7.f5068q = r5
            androidx.fragment.app.k r8 = r3.f1583c
            java.lang.String r8 = r8.f1463l
            if (r8 == 0) goto L_0x0112
            if (r5 != 0) goto L_0x00f5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r7.f5068q = r5
        L_0x00f5:
            android.os.Bundle r5 = r7.f5068q
            androidx.fragment.app.k r8 = r3.f1583c
            java.lang.String r8 = r8.f1463l
            java.lang.String r9 = "android:target_state"
            r5.putString(r9, r8)
            androidx.fragment.app.k r3 = r3.f1583c
            int r3 = r3.f1464m
            if (r3 == 0) goto L_0x0112
            android.os.Bundle r5 = r7.f5068q
            java.lang.String r8 = "android:target_req_state"
            r5.putInt(r8, r3)
            goto L_0x0112
        L_0x010e:
            android.os.Bundle r3 = r8.f1457f
            r7.f5068q = r3
        L_0x0112:
            r1.add(r7)
            boolean r3 = m864N(r4)
            if (r3 == 0) goto L_0x004c
            r6.toString()
            android.os.Bundle r3 = r7.f5068q
            java.util.Objects.toString(r3)
            goto L_0x004c
        L_0x0125:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x012c
            return r5
        L_0x012c:
            r0.o r0 = r11.f1532c
            java.util.ArrayList<androidx.fragment.app.k> r3 = r0.f5070b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            monitor-enter(r3)
            java.util.ArrayList<androidx.fragment.app.k> r6 = r0.f5070b     // Catch:{ all -> 0x01ed }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x01ed }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x01ed }
            if (r6 == 0) goto L_0x0140
            monitor-exit(r3)     // Catch:{ all -> 0x01ed }
            r6 = r5
            goto L_0x0171
        L_0x0140:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01ed }
            java.util.ArrayList<androidx.fragment.app.k> r7 = r0.f5070b     // Catch:{ all -> 0x01ed }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x01ed }
            int r7 = r7.size()     // Catch:{ all -> 0x01ed }
            r6.<init>(r7)     // Catch:{ all -> 0x01ed }
            java.util.ArrayList<androidx.fragment.app.k> r0 = r0.f5070b     // Catch:{ all -> 0x01ed }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x01ed }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01ed }
        L_0x0155:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x01ed }
            if (r7 == 0) goto L_0x0170
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x01ed }
            androidx.fragment.app.k r7 = (androidx.fragment.app.C0286k) r7     // Catch:{ all -> 0x01ed }
            java.lang.String r8 = r7.f1460i     // Catch:{ all -> 0x01ed }
            r6.add(r8)     // Catch:{ all -> 0x01ed }
            boolean r8 = m864N(r4)     // Catch:{ all -> 0x01ed }
            if (r8 == 0) goto L_0x0155
            r7.toString()     // Catch:{ all -> 0x01ed }
            goto L_0x0155
        L_0x0170:
            monitor-exit(r3)     // Catch:{ all -> 0x01ed }
        L_0x0171:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r11.f1533d
            if (r0 == 0) goto L_0x01b2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01b2
            androidx.fragment.app.b[] r5 = new androidx.fragment.app.C0271b[r0]
        L_0x017d:
            if (r2 >= r0) goto L_0x01b2
            androidx.fragment.app.b r3 = new androidx.fragment.app.b
            java.util.ArrayList<androidx.fragment.app.a> r7 = r11.f1533d
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0262a) r7
            r3.<init>((androidx.fragment.app.C0262a) r7)
            r5[r2] = r3
            boolean r3 = m864N(r4)
            if (r3 == 0) goto L_0x01af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "saveAllState: adding back stack #"
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = ": "
            r3.append(r7)
            java.util.ArrayList<androidx.fragment.app.a> r7 = r11.f1533d
            java.lang.Object r7 = r7.get(r2)
            r3.append(r7)
        L_0x01af:
            int r2 = r2 + 1
            goto L_0x017d
        L_0x01b2:
            androidx.fragment.app.s r0 = new androidx.fragment.app.s
            r0.<init>()
            r0.f1573e = r1
            r0.f1574f = r6
            r0.f1575g = r5
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f1538i
            int r1 = r1.get()
            r0.f1576h = r1
            androidx.fragment.app.k r1 = r11.f1549t
            if (r1 == 0) goto L_0x01cd
            java.lang.String r1 = r1.f1460i
            r0.f1577i = r1
        L_0x01cd:
            java.util.ArrayList<java.lang.String> r1 = r0.f1578j
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1539j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.f1579k
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1539j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.r$l> r2 = r11.f1555z
            r1.<init>(r2)
            r0.f1580l = r1
            return r0
        L_0x01ed:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ed }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0302r.mo1700a0():android.os.Parcelable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: c.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: androidx.fragment.app.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: androidx.fragment.app.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: androidx.fragment.app.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1701b(p106r0.C1647i<?> r5, p106r0.C1645g r6, androidx.fragment.app.C0286k r7) {
        /*
            r4 = this;
            r0.i<?> r0 = r4.f1546q
            if (r0 != 0) goto L_0x0138
            r4.f1546q = r5
            r4.f1547r = r6
            r4.f1548s = r7
            if (r7 == 0) goto L_0x0012
            androidx.fragment.app.r$h r6 = new androidx.fragment.app.r$h
            r6.<init>(r4, r7)
            goto L_0x0019
        L_0x0012:
            boolean r6 = r5 instanceof p106r0.C1653m
            if (r6 == 0) goto L_0x001e
            r6 = r5
            r0.m r6 = (p106r0.C1653m) r6
        L_0x0019:
            java.util.concurrent.CopyOnWriteArrayList<r0.m> r0 = r4.f1544o
            r0.add(r6)
        L_0x001e:
            androidx.fragment.app.k r6 = r4.f1548s
            if (r6 == 0) goto L_0x0025
            r4.mo1716i0()
        L_0x0025:
            boolean r6 = r5 instanceof p015c.C0556e
            if (r6 == 0) goto L_0x003a
            r6 = r5
            c.e r6 = (p015c.C0556e) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.mo114d()
            r4.f1536g = r0
            if (r7 == 0) goto L_0x0035
            r6 = r7
        L_0x0035:
            c.d r1 = r4.f1537h
            r0.mo139a(r6, r1)
        L_0x003a:
            if (r7 == 0) goto L_0x005d
            androidx.fragment.app.r r5 = r7.f1473v
            r0.l r5 = r5.f1528J
            java.util.HashMap<java.lang.String, r0.l> r6 = r5.f5051d
            java.lang.String r0 = r7.f1460i
            java.lang.Object r6 = r6.get(r0)
            r0.l r6 = (p106r0.C1651l) r6
            if (r6 != 0) goto L_0x005a
            r0.l r6 = new r0.l
            boolean r0 = r5.f5053f
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, r0.l> r5 = r5.f5051d
            java.lang.String r0 = r7.f1460i
            r5.put(r0, r6)
        L_0x005a:
            r4.f1528J = r6
            goto L_0x00c3
        L_0x005d:
            boolean r6 = r5 instanceof p118t0.C1785s
            if (r6 == 0) goto L_0x00bb
            t0.s r5 = (p118t0.C1785s) r5
            t0.r r5 = r5.mo116j()
            t0.o r6 = p106r0.C1651l.f5049i
            java.lang.Class<r0.l> r0 = p106r0.C1651l.class
            java.lang.String r1 = r0.getCanonicalName()
            if (r1 == 0) goto L_0x00b3
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = p063k.C1142f.m3365a(r2, r1)
            java.util.HashMap<java.lang.String, t0.m> r2 = r5.f5419a
            java.lang.Object r2 = r2.get(r1)
            t0.m r2 = (p118t0.C1779m) r2
            boolean r3 = r0.isInstance(r2)
            if (r3 == 0) goto L_0x008f
            boolean r5 = r6 instanceof p118t0.C1783q
            if (r5 == 0) goto L_0x00ae
            t0.q r6 = (p118t0.C1783q) r6
            r6.mo6066b(r2)
            goto L_0x00ae
        L_0x008f:
            boolean r2 = r6 instanceof p118t0.C1782p
            if (r2 == 0) goto L_0x009a
            t0.p r6 = (p118t0.C1782p) r6
            t0.m r6 = r6.mo6065c(r1, r0)
            goto L_0x00a0
        L_0x009a:
            r0.l$a r6 = (p106r0.C1651l.C1652a) r6
            t0.m r6 = r6.mo4786a(r0)
        L_0x00a0:
            r2 = r6
            java.util.HashMap<java.lang.String, t0.m> r5 = r5.f5419a
            java.lang.Object r5 = r5.put(r1, r2)
            t0.m r5 = (p118t0.C1779m) r5
            if (r5 == 0) goto L_0x00ae
            r5.mo5809b()
        L_0x00ae:
            r0.l r2 = (p106r0.C1651l) r2
            r4.f1528J = r2
            goto L_0x00c3
        L_0x00b3:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00bb:
            r0.l r5 = new r0.l
            r6 = 0
            r5.<init>(r6)
            r4.f1528J = r5
        L_0x00c3:
            r0.l r5 = r4.f1528J
            boolean r6 = r4.mo1690R()
            r5.f5055h = r6
            r0.o r5 = r4.f1532c
            r0.l r6 = r4.f1528J
            r5.f5072d = r6
            r0.i<?> r5 = r4.f1546q
            boolean r6 = r5 instanceof p027e.C0858f
            if (r6 == 0) goto L_0x0137
            e.f r5 = (p027e.C0858f) r5
            androidx.activity.result.a r5 = r5.mo115g()
            if (r7 == 0) goto L_0x00ed
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.f1460i
            java.lang.String r0 = ":"
            java.lang.String r6 = p099q.C1589b.m4444a(r6, r7, r0)
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r6 = ""
        L_0x00ef:
            java.lang.String r7 = "FragmentManager:"
            java.lang.String r6 = p063k.C1142f.m3365a(r7, r6)
            java.lang.String r7 = "StartActivityForResult"
            java.lang.String r7 = p063k.C1142f.m3365a(r6, r7)
            f.c r0 = new f.c
            r0.<init>()
            androidx.fragment.app.r$i r1 = new androidx.fragment.app.r$i
            r1.<init>()
            e.c r7 = r5.mo143c(r7, r0, r1)
            r4.f1552w = r7
            java.lang.String r7 = "StartIntentSenderForResult"
            java.lang.String r7 = p063k.C1142f.m3365a(r6, r7)
            androidx.fragment.app.r$j r0 = new androidx.fragment.app.r$j
            r0.<init>()
            androidx.fragment.app.r$a r1 = new androidx.fragment.app.r$a
            r1.<init>()
            e.c r7 = r5.mo143c(r7, r0, r1)
            r4.f1553x = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r6 = p063k.C1142f.m3365a(r6, r7)
            f.b r7 = new f.b
            r7.<init>()
            androidx.fragment.app.r$b r0 = new androidx.fragment.app.r$b
            r0.<init>()
            e.c r5 = r5.mo143c(r6, r7, r0)
            r4.f1554y = r5
        L_0x0137:
            return
        L_0x0138:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0302r.mo1701b(r0.i, r0.g, androidx.fragment.app.k):void");
    }

    /* renamed from: b0 */
    public void mo1702b0() {
        synchronized (this.f1530a) {
            ArrayList<C0318o> arrayList = this.f1527I;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f1530a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1546q.f5044g.removeCallbacks(this.f1529K);
                this.f1546q.f5044g.post(this.f1529K);
                mo1716i0();
            }
        }
    }

    /* renamed from: c */
    public void mo1703c(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        if (kVar.f1435D) {
            kVar.f1435D = false;
            if (!kVar.f1466o) {
                this.f1532c.mo5820a(kVar);
                if (m864N(2)) {
                    kVar.toString();
                }
                if (mo1687O(kVar)) {
                    this.f1519A = true;
                }
            }
        }
    }

    /* renamed from: c0 */
    public void mo1704c0(C0286k kVar, boolean z) {
        ViewGroup J = mo1683J(kVar);
        if (J != null && (J instanceof FragmentContainerView)) {
            ((FragmentContainerView) J).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: d */
    public final void mo1705d(C0286k kVar) {
        HashSet hashSet = this.f1541l.get(kVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C0885a) it.next()).mo4190a();
            }
            hashSet.clear();
            mo1715i(kVar);
            this.f1541l.remove(kVar);
        }
    }

    /* renamed from: d0 */
    public void mo1706d0(C0286k kVar, C0342c.C0345c cVar) {
        if (!kVar.equals(mo1680G(kVar.f1460i)) || !(kVar.f1474w == null || kVar.f1473v == this)) {
            throw new IllegalArgumentException("Fragment " + kVar + " is not an active fragment of FragmentManager " + this);
        }
        kVar.f1448Q = cVar;
    }

    /* renamed from: e */
    public final void mo1707e() {
        this.f1531b = false;
        this.f1525G.clear();
        this.f1524F.clear();
    }

    /* renamed from: e0 */
    public void mo1708e0(C0286k kVar) {
        if (kVar == null || (kVar.equals(mo1680G(kVar.f1460i)) && (kVar.f1474w == null || kVar.f1473v == this))) {
            C0286k kVar2 = this.f1549t;
            this.f1549t = kVar;
            mo1727t(kVar2);
            mo1727t(this.f1549t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + kVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: f */
    public final Set<C0263a0> mo1709f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1532c.mo5825f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0321t) it.next()).f1583c.f1440I;
            if (viewGroup != null) {
                hashSet.add(C0263a0.m752g(viewGroup, mo1685L()));
            }
        }
        return hashSet;
    }

    /* renamed from: f0 */
    public final void mo1710f0(C0286k kVar) {
        ViewGroup J = mo1683J(kVar);
        if (J != null) {
            if (kVar.mo1642u() + kVar.mo1640t() + kVar.mo1631n() + kVar.mo1626k() > 0) {
                if (J.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    J.setTag(R.id.visible_removing_fragment_view_tag, kVar);
                }
                ((C0286k) J.getTag(R.id.visible_removing_fragment_view_tag)).mo1629l0(kVar.mo1639s());
            }
        }
    }

    /* renamed from: g */
    public void mo1711g(C0262a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo1540i(z3);
        } else {
            aVar.mo1539h();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f1545p >= 1) {
            C0329z.m973p(this.f1546q.f5043f, this.f1547r, arrayList, arrayList2, 0, 1, true, this.f1542m);
        }
        if (z3) {
            mo1691S(this.f1545p, true);
        }
        Iterator it = ((ArrayList) this.f1532c.mo5826g()).iterator();
        while (it.hasNext()) {
            C0286k kVar = (C0286k) it.next();
            if (kVar != null) {
                View view = kVar.f1441J;
            }
        }
    }

    /* renamed from: g0 */
    public void mo1712g0(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        if (kVar.f1434C) {
            kVar.f1434C = false;
            kVar.f1445N = !kVar.f1445N;
        }
    }

    /* renamed from: h */
    public C0321t mo1713h(C0286k kVar) {
        C0321t h = this.f1532c.mo5827h(kVar.f1460i);
        if (h != null) {
            return h;
        }
        C0321t tVar = new C0321t(this.f1543n, this.f1532c, kVar);
        tVar.mo1765m(this.f1546q.f5043f.getClassLoader());
        tVar.f1585e = this.f1545p;
        return tVar;
    }

    /* renamed from: h0 */
    public final void mo1714h0() {
        Iterator it = ((ArrayList) this.f1532c.mo5825f()).iterator();
        while (it.hasNext()) {
            C0321t tVar = (C0321t) it.next();
            C0286k kVar = tVar.f1583c;
            if (kVar.f1442K) {
                if (this.f1531b) {
                    this.f1523E = true;
                } else {
                    kVar.f1442K = false;
                    tVar.mo1763k();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo1715i(C0286k kVar) {
        kVar.mo1605X();
        this.f1543n.mo1673n(kVar, false);
        kVar.f1440I = null;
        kVar.f1441J = null;
        kVar.f1450S = null;
        kVar.f1451T.mo6061h(null);
        kVar.f1469r = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (mo1689Q(r4.f1548s) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f2356a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f1537h;
        r1 = r4.f1533d;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1716i0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.r$m> r0 = r4.f1530a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.r$m> r1 = r4.f1530a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            c.d r1 = r4.f1537h     // Catch:{ all -> 0x002f }
            r1.f2356a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            c.d r0 = r4.f1537h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1533d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.k r1 = r4.f1548s
            boolean r1 = r4.mo1689Q(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.f2356a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0302r.mo1716i0():void");
    }

    /* renamed from: j */
    public void mo1717j(C0286k kVar) {
        if (m864N(2)) {
            kVar.toString();
        }
        if (!kVar.f1435D) {
            kVar.f1435D = true;
            if (kVar.f1466o) {
                if (m864N(2)) {
                    kVar.toString();
                }
                this.f1532c.mo5831l(kVar);
                if (mo1687O(kVar)) {
                    this.f1519A = true;
                }
                mo1710f0(kVar);
            }
        }
    }

    /* renamed from: k */
    public void mo1718k(Configuration configuration) {
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                next.onConfigurationChanged(configuration);
                next.f1475x.mo1718k(configuration);
            }
        }
    }

    /* renamed from: l */
    public boolean mo1719l(MenuItem menuItem) {
        if (this.f1545p < 1) {
            return false;
        }
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                if (!next.f1434C ? next.f1475x.mo1719l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo1720m() {
        this.f1520B = false;
        this.f1521C = false;
        this.f1528J.f5055h = false;
        mo1731w(1);
    }

    /* renamed from: n */
    public boolean mo1721n(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        if (this.f1545p < 1) {
            return false;
        }
        ArrayList<C0286k> arrayList = null;
        boolean z3 = false;
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null && mo1688P(next)) {
                if (!next.f1434C) {
                    if (!next.f1437F || !next.f1438G) {
                        z2 = false;
                    } else {
                        next.mo1590I(menu, menuInflater);
                        z2 = true;
                    }
                    z = z2 | next.f1475x.mo1721n(menu, menuInflater);
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z3 = true;
                }
            }
        }
        if (this.f1534e != null) {
            for (int i = 0; i < this.f1534e.size(); i++) {
                C0286k kVar = this.f1534e.get(i);
                if (arrayList == null || !arrayList.contains(kVar)) {
                    Objects.requireNonNull(kVar);
                }
            }
        }
        this.f1534e = arrayList;
        return z3;
    }

    /* renamed from: o */
    public void mo1722o() {
        this.f1522D = true;
        mo1676C(true);
        mo1734z();
        mo1731w(-1);
        this.f1546q = null;
        this.f1547r = null;
        this.f1548s = null;
        if (this.f1536g != null) {
            this.f1537h.mo2701b();
            this.f1536g = null;
        }
        C0855c<Intent> cVar = this.f1552w;
        if (cVar != null) {
            cVar.mo147b();
            this.f1553x.mo147b();
            this.f1554y.mo147b();
        }
    }

    /* renamed from: p */
    public void mo1723p() {
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                next.mo1606Y();
            }
        }
    }

    /* renamed from: q */
    public void mo1724q(boolean z) {
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                next.f1475x.mo1724q(z);
            }
        }
    }

    /* renamed from: r */
    public boolean mo1725r(MenuItem menuItem) {
        if (this.f1545p < 1) {
            return false;
        }
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                if (!next.f1434C ? (!next.f1437F || !next.f1438G || !next.mo1596O(menuItem)) ? next.f1475x.mo1725r(menuItem) : true : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public void mo1726s(Menu menu) {
        if (this.f1545p >= 1) {
            for (C0286k next : this.f1532c.mo5828i()) {
                if (next != null && !next.f1434C) {
                    next.f1475x.mo1726s(menu);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo1727t(C0286k kVar) {
        if (kVar != null && kVar.equals(mo1680G(kVar.f1460i))) {
            boolean Q = kVar.f1473v.mo1689Q(kVar);
            Boolean bool = kVar.f1465n;
            if (bool == null || bool.booleanValue() != Q) {
                kVar.f1465n = Boolean.valueOf(Q);
                kVar.mo1598Q(Q);
                C0302r rVar = kVar.f1475x;
                rVar.mo1716i0();
                rVar.mo1727t(rVar.f1549t);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0286k kVar = this.f1548s;
        if (kVar != null) {
            sb.append(kVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1548s;
        } else {
            C1647i<?> iVar = this.f1546q;
            if (iVar != null) {
                sb.append(iVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1546q;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1729u(boolean z) {
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null) {
                next.f1475x.mo1729u(z);
            }
        }
    }

    /* renamed from: v */
    public boolean mo1730v(Menu menu) {
        boolean z = false;
        if (this.f1545p < 1) {
            return false;
        }
        for (C0286k next : this.f1532c.mo5828i()) {
            if (next != null && mo1688P(next) && next.mo1607Z(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w */
    public final void mo1731w(int i) {
        try {
            this.f1531b = true;
            for (C0321t tVar : this.f1532c.f5071c.values()) {
                if (tVar != null) {
                    tVar.f1585e = i;
                }
            }
            mo1691S(i, false);
            Iterator it = ((HashSet) mo1709f()).iterator();
            while (it.hasNext()) {
                ((C0263a0) it.next()).mo1549e();
            }
            this.f1531b = false;
            mo1676C(true);
        } catch (Throwable th) {
            this.f1531b = false;
            throw th;
        }
    }

    /* renamed from: x */
    public final void mo1732x() {
        if (this.f1523E) {
            this.f1523E = false;
            mo1714h0();
        }
    }

    /* renamed from: y */
    public void mo1733y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String a = C1142f.m3365a(str, "    ");
        C1656o oVar = this.f1532c;
        Objects.requireNonNull(oVar);
        String str2 = str + "    ";
        if (!oVar.f5071c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0321t tVar : oVar.f5071c.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    C0286k kVar = tVar.f1583c;
                    printWriter.println(kVar);
                    kVar.mo1610b(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = oVar.f5070b.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((C0286k) oVar.f5070b.get(i)).toString());
            }
        }
        ArrayList<C0286k> arrayList = this.f1534e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1534e.get(i2).toString());
            }
        }
        ArrayList<C0262a> arrayList2 = this.f1533d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0262a aVar = this.f1533d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo1538g(a, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1538i.get());
        synchronized (this.f1530a) {
            int size4 = this.f1530a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f1530a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1546q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1547r);
        if (this.f1548s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1548s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1545p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1520B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1521C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1522D);
        if (this.f1519A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1519A);
        }
    }

    /* renamed from: z */
    public final void mo1734z() {
        Iterator it = ((HashSet) mo1709f()).iterator();
        while (it.hasNext()) {
            ((C0263a0) it.next()).mo1549e();
        }
    }
}
