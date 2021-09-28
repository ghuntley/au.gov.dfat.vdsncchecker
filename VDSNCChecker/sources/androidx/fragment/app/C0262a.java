package androidx.fragment.app;

import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0323u;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.C0001b;
import p106r0.C1671x;

/* renamed from: androidx.fragment.app.a */
public final class C0262a extends C0323u implements C0302r.C0316m {

    /* renamed from: q */
    public final C0302r f1355q;

    /* renamed from: r */
    public boolean f1356r;

    /* renamed from: s */
    public int f1357s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0262a(androidx.fragment.app.C0302r r3) {
        /*
            r2 = this;
            androidx.fragment.app.p r0 = r3.mo1684K()
            r0.i<?> r1 = r3.f1546q
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f5043f
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f1357s = r0
            r2.f1355q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0262a.<init>(androidx.fragment.app.r):void");
    }

    /* renamed from: a */
    public boolean mo1533a(ArrayList<C0262a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0302r.m864N(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1593g) {
            return true;
        }
        C0302r rVar = this.f1355q;
        if (rVar.f1533d == null) {
            rVar.f1533d = new ArrayList<>();
        }
        rVar.f1533d.add(this);
        return true;
    }

    /* renamed from: c */
    public int mo1534c() {
        return mo1536e(false);
    }

    /* renamed from: d */
    public void mo1535d(int i) {
        if (this.f1593g) {
            if (C0302r.m864N(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f1587a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0323u.C0324a aVar = this.f1587a.get(i2);
                C0286k kVar = aVar.f1604b;
                if (kVar != null) {
                    kVar.f1472u += i;
                    if (C0302r.m864N(2)) {
                        StringBuilder a = C0001b.m0a("Bump nesting of ");
                        a.append(aVar.f1604b);
                        a.append(" to ");
                        a.append(aVar.f1604b.f1472u);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public int mo1536e(boolean z) {
        if (!this.f1356r) {
            if (C0302r.m864N(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new C1671x("FragmentManager"));
                mo1538g("  ", printWriter, true);
                printWriter.close();
            }
            this.f1356r = true;
            this.f1357s = this.f1593g ? this.f1355q.f1538i.getAndIncrement() : -1;
            this.f1355q.mo1674A(this, z);
            return this.f1357s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: f */
    public void mo1537f(int i, C0286k kVar, String str, int i2) {
        Class<?> cls = kVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a = C0001b.m0a("Fragment ");
            a.append(cls.getCanonicalName());
            a.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a.toString());
        }
        if (str != null) {
            String str2 = kVar.f1433B;
            if (str2 == null || str.equals(str2)) {
                kVar.f1433B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + kVar + ": was " + kVar.f1433B + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = kVar.f1477z;
                if (i3 == 0 || i3 == i) {
                    kVar.f1477z = i;
                    kVar.f1432A = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + kVar + ": was " + kVar.f1477z + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + kVar + " with tag " + str + " to container view with no id");
            }
        }
        mo1772b(new C0323u.C0324a(i2, kVar));
        kVar.f1473v = this.f1355q;
    }

    /* renamed from: g */
    public void mo1538g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1595i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1357s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1356r);
            if (this.f1592f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1592f));
            }
            if (!(this.f1588b == 0 && this.f1589c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1588b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1589c));
            }
            if (!(this.f1590d == 0 && this.f1591e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1590d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1591e));
            }
            if (!(this.f1596j == 0 && this.f1597k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1596j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1597k);
            }
            if (!(this.f1598l == 0 && this.f1599m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1598l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1599m);
            }
        }
        if (!this.f1587a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1587a.size();
            for (int i = 0; i < size; i++) {
                C0323u.C0324a aVar = this.f1587a.get(i);
                switch (aVar.f1603a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a = C0001b.m0a("cmd=");
                        a.append(aVar.f1603a);
                        str2 = a.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1604b);
                if (z) {
                    if (!(aVar.f1605c == 0 && aVar.f1606d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1605c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1606d));
                    }
                    if (aVar.f1607e != 0 || aVar.f1608f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1607e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1608f));
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo1539h() {
        C0302r rVar;
        int size = this.f1587a.size();
        for (int i = 0; i < size; i++) {
            C0323u.C0324a aVar = this.f1587a.get(i);
            C0286k kVar = aVar.f1604b;
            if (kVar != null) {
                kVar.mo1629l0(false);
                int i2 = this.f1592f;
                if (!(kVar.f1444M == null && i2 == 0)) {
                    kVar.mo1616f();
                    kVar.f1444M.f1486h = i2;
                }
                ArrayList<String> arrayList = this.f1600n;
                ArrayList<String> arrayList2 = this.f1601o;
                kVar.mo1616f();
                C0286k.C0288b bVar = kVar.f1444M;
                bVar.f1487i = arrayList;
                bVar.f1488j = arrayList2;
            }
            switch (aVar.f1603a) {
                case 1:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, false);
                    this.f1355q.mo1699a(kVar);
                    continue;
                case 3:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1696X(kVar);
                    continue;
                case 4:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1686M(kVar);
                    continue;
                case 5:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, false);
                    this.f1355q.mo1712g0(kVar);
                    continue;
                case 6:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1717j(kVar);
                    continue;
                case 7:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, false);
                    this.f1355q.mo1703c(kVar);
                    continue;
                case 8:
                    rVar = this.f1355q;
                    break;
                case 9:
                    rVar = this.f1355q;
                    kVar = null;
                    break;
                case 10:
                    this.f1355q.mo1706d0(kVar, aVar.f1610h);
                    continue;
                default:
                    StringBuilder a = C0001b.m0a("Unknown cmd: ");
                    a.append(aVar.f1603a);
                    throw new IllegalArgumentException(a.toString());
            }
            rVar.mo1708e0(kVar);
        }
    }

    /* renamed from: i */
    public void mo1540i(boolean z) {
        C0302r rVar;
        for (int size = this.f1587a.size() - 1; size >= 0; size--) {
            C0323u.C0324a aVar = this.f1587a.get(size);
            C0286k kVar = aVar.f1604b;
            if (kVar != null) {
                kVar.mo1629l0(true);
                int i = this.f1592f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (!(kVar.f1444M == null && i2 == 0)) {
                    kVar.mo1616f();
                    kVar.f1444M.f1486h = i2;
                }
                ArrayList<String> arrayList = this.f1601o;
                ArrayList<String> arrayList2 = this.f1600n;
                kVar.mo1616f();
                C0286k.C0288b bVar = kVar.f1444M;
                bVar.f1487i = arrayList;
                bVar.f1488j = arrayList2;
            }
            switch (aVar.f1603a) {
                case 1:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, true);
                    this.f1355q.mo1696X(kVar);
                    continue;
                case 3:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1699a(kVar);
                    continue;
                case 4:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1712g0(kVar);
                    continue;
                case 5:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, true);
                    this.f1355q.mo1686M(kVar);
                    continue;
                case 6:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1703c(kVar);
                    continue;
                case 7:
                    kVar.mo1617f0(aVar.f1605c, aVar.f1606d, aVar.f1607e, aVar.f1608f);
                    this.f1355q.mo1704c0(kVar, true);
                    this.f1355q.mo1717j(kVar);
                    continue;
                case 8:
                    rVar = this.f1355q;
                    kVar = null;
                    break;
                case 9:
                    rVar = this.f1355q;
                    break;
                case 10:
                    this.f1355q.mo1706d0(kVar, aVar.f1609g);
                    continue;
                default:
                    StringBuilder a = C0001b.m0a("Unknown cmd: ");
                    a.append(aVar.f1603a);
                    throw new IllegalArgumentException(a.toString());
            }
            rVar.mo1708e0(kVar);
        }
    }

    /* renamed from: j */
    public boolean mo1541j(int i) {
        int size = this.f1587a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0286k kVar = this.f1587a.get(i2).f1604b;
            int i3 = kVar != null ? kVar.f1432A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1542k(ArrayList<C0262a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1587a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0286k kVar = this.f1587a.get(i4).f1604b;
            int i5 = kVar != null ? kVar.f1432A : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0262a aVar = arrayList.get(i6);
                    int size2 = aVar.f1587a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0286k kVar2 = aVar.f1587a.get(i7).f1604b;
                        if ((kVar2 != null ? kVar2.f1432A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: l */
    public C0323u mo1543l(C0286k kVar) {
        C0302r rVar = kVar.f1473v;
        if (rVar == null || rVar == this.f1355q) {
            mo1772b(new C0323u.C0324a(8, kVar));
            return this;
        }
        StringBuilder a = C0001b.m0a("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        a.append(kVar.toString());
        a.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1357s >= 0) {
            sb.append(" #");
            sb.append(this.f1357s);
        }
        if (this.f1595i != null) {
            sb.append(" ");
            sb.append(this.f1595i);
        }
        sb.append("}");
        return sb.toString();
    }
}
