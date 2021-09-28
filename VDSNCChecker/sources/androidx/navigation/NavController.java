package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p015c.C0555d;
import p118t0.C1772f;
import p118t0.C1773g;
import p118t0.C1784r;
import p136w0.C2004g;
import p136w0.C2008i;
import p136w0.C2014l;

public class NavController {

    /* renamed from: a */
    public final Context f1719a;

    /* renamed from: b */
    public Activity f1720b;

    /* renamed from: c */
    public C2014l f1721c;

    /* renamed from: d */
    public C0366c f1722d;

    /* renamed from: e */
    public Bundle f1723e;

    /* renamed from: f */
    public Parcelable[] f1724f;

    /* renamed from: g */
    public boolean f1725g;

    /* renamed from: h */
    public final Deque<C2004g> f1726h = new ArrayDeque();

    /* renamed from: i */
    public C1773g f1727i;

    /* renamed from: j */
    public C2008i f1728j;

    /* renamed from: k */
    public C0372f f1729k = new C0372f();

    /* renamed from: l */
    public final CopyOnWriteArrayList<C0360b> f1730l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    public final C1772f f1731m = new C0346d() {
        /* renamed from: g */
        public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
            C0342c.C0345c cVar;
            NavController navController = NavController.this;
            if (navController.f1722d != null) {
                for (C2004g next : navController.f1726h) {
                    Objects.requireNonNull(next);
                    switch (C2004g.C2005a.f5829a[bVar.ordinal()]) {
                        case 1:
                        case 2:
                            cVar = C0342c.C0345c.CREATED;
                            break;
                        case 3:
                        case 4:
                            cVar = C0342c.C0345c.STARTED;
                            break;
                        case 5:
                            cVar = C0342c.C0345c.RESUMED;
                            break;
                        case 6:
                            cVar = C0342c.C0345c.DESTROYED;
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected event value " + bVar);
                    }
                    next.f5826j = cVar;
                    next.mo6494a();
                }
            }
        }
    };

    /* renamed from: n */
    public final C0555d f1732n = new C0359a(false);

    /* renamed from: o */
    public boolean f1733o = true;

    /* renamed from: androidx.navigation.NavController$a */
    public class C0359a extends C0555d {
        public C0359a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo1736a() {
            NavController.this.mo1856e();
        }
    }

    /* renamed from: androidx.navigation.NavController$b */
    public interface C0360b {
        /* renamed from: a */
        void mo1860a(NavController navController, C0364b bVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f1719a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f1720b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C0372f fVar = this.f1729k;
        fVar.mo1881a(new C0368d(fVar));
        this.f1729k.mo1881a(new C0361a(this.f1719a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0004 A[LOOP:0: B:1:0x0004->B:6:0x002b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1852a() {
        /*
            r12 = this;
            androidx.lifecycle.c$c r0 = androidx.lifecycle.C0342c.C0345c.STARTED
            androidx.lifecycle.c$c r1 = androidx.lifecycle.C0342c.C0345c.RESUMED
        L_0x0004:
            java.util.Deque<w0.g> r2 = r12.f1726h
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 != 0) goto L_0x002e
            java.util.Deque<w0.g> r2 = r12.f1726h
            java.lang.Object r2 = r2.peekLast()
            w0.g r2 = (p136w0.C2004g) r2
            androidx.navigation.b r2 = r2.f5821e
            boolean r2 = r2 instanceof androidx.navigation.C0366c
            if (r2 == 0) goto L_0x002e
            java.util.Deque<w0.g> r2 = r12.f1726h
            java.lang.Object r2 = r2.peekLast()
            w0.g r2 = (p136w0.C2004g) r2
            androidx.navigation.b r2 = r2.f5821e
            int r2 = r2.f1742g
            boolean r2 = r12.mo1857f(r2, r3)
            if (r2 == 0) goto L_0x002e
            goto L_0x0004
        L_0x002e:
            java.util.Deque<w0.g> r2 = r12.f1726h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00f4
            java.util.Deque<w0.g> r2 = r12.f1726h
            java.lang.Object r2 = r2.peekLast()
            w0.g r2 = (p136w0.C2004g) r2
            androidx.navigation.b r2 = r2.f5821e
            r4 = 0
            boolean r5 = r2 instanceof p136w0.C1998a
            if (r5 == 0) goto L_0x0062
            java.util.Deque<w0.g> r5 = r12.f1726h
            java.util.Iterator r5 = r5.descendingIterator()
        L_0x004b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r5.next()
            w0.g r6 = (p136w0.C2004g) r6
            androidx.navigation.b r6 = r6.f5821e
            boolean r7 = r6 instanceof androidx.navigation.C0366c
            if (r7 != 0) goto L_0x004b
            boolean r7 = r6 instanceof p136w0.C1998a
            if (r7 != 0) goto L_0x004b
            r4 = r6
        L_0x0062:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Deque<w0.g> r6 = r12.f1726h
            java.util.Iterator r6 = r6.descendingIterator()
        L_0x006d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ad
            java.lang.Object r7 = r6.next()
            w0.g r7 = (p136w0.C2004g) r7
            androidx.lifecycle.c$c r8 = r7.f5827k
            androidx.navigation.b r9 = r7.f5821e
            if (r2 == 0) goto L_0x008d
            int r10 = r9.f1742g
            int r11 = r2.f1742g
            if (r10 != r11) goto L_0x008d
            if (r8 == r1) goto L_0x008a
            r5.put(r7, r1)
        L_0x008a:
            androidx.navigation.c r2 = r2.f1741f
            goto L_0x006d
        L_0x008d:
            if (r4 == 0) goto L_0x00a5
            int r9 = r9.f1742g
            int r10 = r4.f1742g
            if (r9 != r10) goto L_0x00a5
            if (r8 != r1) goto L_0x009d
            r7.f5827k = r0
            r7.mo6494a()
            goto L_0x00a2
        L_0x009d:
            if (r8 == r0) goto L_0x00a2
            r5.put(r7, r0)
        L_0x00a2:
            androidx.navigation.c r4 = r4.f1741f
            goto L_0x006d
        L_0x00a5:
            androidx.lifecycle.c$c r8 = androidx.lifecycle.C0342c.C0345c.CREATED
            r7.f5827k = r8
            r7.mo6494a()
            goto L_0x006d
        L_0x00ad:
            java.util.Deque<w0.g> r0 = r12.f1726h
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d1
            java.lang.Object r1 = r0.next()
            w0.g r1 = (p136w0.C2004g) r1
            java.lang.Object r2 = r5.get(r1)
            androidx.lifecycle.c$c r2 = (androidx.lifecycle.C0342c.C0345c) r2
            if (r2 == 0) goto L_0x00cd
            r1.f5827k = r2
            r1.mo6494a()
            goto L_0x00b3
        L_0x00cd:
            r1.mo6494a()
            goto L_0x00b3
        L_0x00d1:
            java.util.Deque<w0.g> r0 = r12.f1726h
            java.lang.Object r0 = r0.peekLast()
            w0.g r0 = (p136w0.C2004g) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r1 = r12.f1730l
            java.util.Iterator r1 = r1.iterator()
        L_0x00df:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavController$b r2 = (androidx.navigation.NavController.C0360b) r2
            androidx.navigation.b r4 = r0.f5821e
            android.os.Bundle r5 = r0.f5822f
            r2.mo1860a(r12, r4, r5)
            goto L_0x00df
        L_0x00f3:
            return r3
        L_0x00f4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo1852a():boolean");
    }

    /* renamed from: b */
    public C0364b mo1853b(int i) {
        C0364b bVar;
        C0366c cVar;
        C0366c cVar2 = this.f1722d;
        if (cVar2 == null) {
            return null;
        }
        if (cVar2.f1742g == i) {
            return cVar2;
        }
        if (this.f1726h.isEmpty()) {
            bVar = this.f1722d;
        } else {
            bVar = this.f1726h.getLast().f5821e;
        }
        if (bVar instanceof C0366c) {
            cVar = (C0366c) bVar;
        } else {
            cVar = bVar.f1741f;
        }
        return cVar.mo1873h(i, true);
    }

    /* renamed from: c */
    public C0364b mo1854c() {
        C2004g last = this.f1726h.isEmpty() ? null : this.f1726h.getLast();
        if (last != null) {
            return last.f5821e;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r14.f5853b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[LOOP:0: B:10:0x0027->B:15:0x004d, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf A[LOOP:3: B:43:0x00cf->B:50:0x0109, LOOP_START] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1855d(androidx.navigation.C0364b r12, android.os.Bundle r13, p136w0.C2015m r14, androidx.navigation.C0369e.C0370a r15) {
        /*
            r11 = this;
            r0 = 0
            if (r14 == 0) goto L_0x000f
            int r1 = r14.f5853b
            r2 = -1
            if (r1 == r2) goto L_0x000f
            boolean r2 = r14.f5854c
            boolean r1 = r11.mo1857f(r1, r2)
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            androidx.navigation.f r2 = r11.f1729k
            java.lang.String r3 = r12.f1740e
            androidx.navigation.e r2 = r2.mo1882c(r3)
            android.os.Bundle r13 = r12.mo1866a(r13)
            androidx.navigation.b r15 = r2.mo1862b(r12, r13, r14, r15)
            r2 = 1
            if (r15 == 0) goto L_0x0152
            boolean r14 = r15 instanceof p136w0.C1998a
            if (r14 != 0) goto L_0x0050
        L_0x0027:
            java.util.Deque<w0.g> r14 = r11.f1726h
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0050
            java.util.Deque<w0.g> r14 = r11.f1726h
            java.lang.Object r14 = r14.peekLast()
            w0.g r14 = (p136w0.C2004g) r14
            androidx.navigation.b r14 = r14.f5821e
            boolean r14 = r14 instanceof p136w0.C1998a
            if (r14 == 0) goto L_0x0050
            java.util.Deque<w0.g> r14 = r11.f1726h
            java.lang.Object r14 = r14.peekLast()
            w0.g r14 = (p136w0.C2004g) r14
            androidx.navigation.b r14 = r14.f5821e
            int r14 = r14.f1742g
            boolean r14 = r11.mo1857f(r14, r2)
            if (r14 == 0) goto L_0x0050
            goto L_0x0027
        L_0x0050:
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r14.<init>()
            boolean r3 = r12 instanceof androidx.navigation.C0366c
            if (r3 == 0) goto L_0x008f
            r3 = r15
        L_0x005a:
            androidx.navigation.c r9 = r3.f1741f
            if (r9 == 0) goto L_0x0088
            w0.g r10 = new w0.g
            android.content.Context r4 = r11.f1719a
            t0.g r7 = r11.f1727i
            w0.i r8 = r11.f1728j
            r3 = r10
            r5 = r9
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r10)
            java.util.Deque<w0.g> r3 = r11.f1726h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0088
            java.util.Deque<w0.g> r3 = r11.f1726h
            java.lang.Object r3 = r3.getLast()
            w0.g r3 = (p136w0.C2004g) r3
            androidx.navigation.b r3 = r3.f5821e
            if (r3 != r9) goto L_0x0088
            int r3 = r9.f1742g
            r11.mo1857f(r3, r2)
        L_0x0088:
            if (r9 == 0) goto L_0x008f
            if (r9 != r12) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r3 = r9
            goto L_0x005a
        L_0x008f:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L_0x0097
            r12 = r15
            goto L_0x009f
        L_0x0097:
            java.lang.Object r12 = r14.getFirst()
            w0.g r12 = (p136w0.C2004g) r12
            androidx.navigation.b r12 = r12.f5821e
        L_0x009f:
            if (r12 == 0) goto L_0x00bf
            int r3 = r12.f1742g
            androidx.navigation.b r3 = r11.mo1853b(r3)
            if (r3 != 0) goto L_0x00bf
            androidx.navigation.c r12 = r12.f1741f
            if (r12 == 0) goto L_0x009f
            w0.g r9 = new w0.g
            android.content.Context r4 = r11.f1719a
            t0.g r7 = r11.f1727i
            w0.i r8 = r11.f1728j
            r3 = r9
            r5 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r9)
            goto L_0x009f
        L_0x00bf:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L_0x00c7
            r12 = r15
            goto L_0x00cf
        L_0x00c7:
            java.lang.Object r12 = r14.getLast()
            w0.g r12 = (p136w0.C2004g) r12
            androidx.navigation.b r12 = r12.f5821e
        L_0x00cf:
            java.util.Deque<w0.g> r3 = r11.f1726h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x010c
            java.util.Deque<w0.g> r3 = r11.f1726h
            java.lang.Object r3 = r3.getLast()
            w0.g r3 = (p136w0.C2004g) r3
            androidx.navigation.b r3 = r3.f5821e
            boolean r3 = r3 instanceof androidx.navigation.C0366c
            if (r3 == 0) goto L_0x010c
            java.util.Deque<w0.g> r3 = r11.f1726h
            java.lang.Object r3 = r3.getLast()
            w0.g r3 = (p136w0.C2004g) r3
            androidx.navigation.b r3 = r3.f5821e
            androidx.navigation.c r3 = (androidx.navigation.C0366c) r3
            int r4 = r12.f1742g
            androidx.navigation.b r3 = r3.mo1873h(r4, r0)
            if (r3 != 0) goto L_0x010c
            java.util.Deque<w0.g> r3 = r11.f1726h
            java.lang.Object r3 = r3.getLast()
            w0.g r3 = (p136w0.C2004g) r3
            androidx.navigation.b r3 = r3.f5821e
            int r3 = r3.f1742g
            boolean r3 = r11.mo1857f(r3, r2)
            if (r3 == 0) goto L_0x010c
            goto L_0x00cf
        L_0x010c:
            java.util.Deque<w0.g> r12 = r11.f1726h
            r12.addAll(r14)
            java.util.Deque<w0.g> r12 = r11.f1726h
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0127
            java.util.Deque<w0.g> r12 = r11.f1726h
            java.lang.Object r12 = r12.getFirst()
            w0.g r12 = (p136w0.C2004g) r12
            androidx.navigation.b r12 = r12.f5821e
            androidx.navigation.c r14 = r11.f1722d
            if (r12 == r14) goto L_0x013b
        L_0x0127:
            w0.g r12 = new w0.g
            android.content.Context r4 = r11.f1719a
            androidx.navigation.c r5 = r11.f1722d
            t0.g r7 = r11.f1727i
            w0.i r8 = r11.f1728j
            r3 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<w0.g> r14 = r11.f1726h
            r14.addFirst(r12)
        L_0x013b:
            w0.g r12 = new w0.g
            android.content.Context r4 = r11.f1719a
            android.os.Bundle r6 = r15.mo1866a(r13)
            t0.g r7 = r11.f1727i
            w0.i r8 = r11.f1728j
            r3 = r12
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<w0.g> r13 = r11.f1726h
            r13.add(r12)
            goto L_0x0165
        L_0x0152:
            if (r14 == 0) goto L_0x0165
            boolean r12 = r14.f5852a
            if (r12 == 0) goto L_0x0165
            java.util.Deque<w0.g> r12 = r11.f1726h
            java.lang.Object r12 = r12.peekLast()
            w0.g r12 = (p136w0.C2004g) r12
            if (r12 == 0) goto L_0x0164
            r12.f5822f = r13
        L_0x0164:
            r0 = r2
        L_0x0165:
            r11.mo1859h()
            if (r1 != 0) goto L_0x016e
            if (r15 != 0) goto L_0x016e
            if (r0 == 0) goto L_0x0171
        L_0x016e:
            r11.mo1852a()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo1855d(androidx.navigation.b, android.os.Bundle, w0.m, androidx.navigation.e$a):void");
    }

    /* renamed from: e */
    public boolean mo1856e() {
        if (!this.f1726h.isEmpty() && mo1857f(mo1854c().f1742g, true) && mo1852a()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo1857f(int i, boolean z) {
        boolean z2;
        C1784r remove;
        if (this.f1726h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C2004g> descendingIterator = this.f1726h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            C0364b bVar = descendingIterator.next().f5821e;
            C0369e c = this.f1729k.mo1882c(bVar.f1740e);
            if (z || bVar.f1742g != i) {
                arrayList.add(c);
            }
            if (bVar.f1742g == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            C0364b.m1046c(this.f1719a, i);
            return false;
        }
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (it.hasNext() && ((C0369e) it.next()).mo1863e()) {
            C2004g removeLast = this.f1726h.removeLast();
            if (removeLast.f5823g.f1689b.compareTo(C0342c.C0345c.CREATED) >= 0) {
                removeLast.f5827k = C0342c.C0345c.DESTROYED;
                removeLast.mo6494a();
            }
            C2008i iVar = this.f1728j;
            if (!(iVar == null || (remove = iVar.f5835c.remove(removeLast.f5825i)) == null)) {
                remove.mo6067a();
            }
            z3 = true;
        }
        mo1859h();
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ef, code lost:
        if (r0 == false) goto L_0x02f2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1858g(int r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r1 = r19
            w0.l r0 = r1.f1721c
            if (r0 != 0) goto L_0x0011
            w0.l r0 = new w0.l
            android.content.Context r2 = r1.f1719a
            androidx.navigation.f r3 = r1.f1729k
            r0.<init>(r2, r3)
            r1.f1721c = r0
        L_0x0011:
            w0.l r0 = r1.f1721c
            r2 = r20
            androidx.navigation.c r0 = r0.mo6505c(r2)
            androidx.navigation.c r2 = r1.f1722d
            r3 = 1
            if (r2 == 0) goto L_0x0023
            int r2 = r2.f1742g
            r1.mo1857f(r2, r3)
        L_0x0023:
            r1.f1722d = r0
            android.os.Bundle r0 = r1.f1723e
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r0 = r0.getStringArrayList(r2)
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r0 = r0.iterator()
        L_0x0035:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.navigation.f r4 = r1.f1729k
            androidx.navigation.e r4 = r4.mo1882c(r2)
            android.os.Bundle r5 = r1.f1723e
            android.os.Bundle r2 = r5.getBundle(r2)
            if (r2 == 0) goto L_0x0035
            r4.mo1878c(r2)
            goto L_0x0035
        L_0x0053:
            android.os.Parcelable[] r0 = r1.f1724f
            java.lang.String r2 = " cannot be found from the current destination "
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x00b8
            int r6 = r0.length
            r7 = r4
        L_0x005d:
            if (r7 >= r6) goto L_0x00b3
            r8 = r0[r7]
            w0.h r8 = (p136w0.C2006h) r8
            int r9 = r8.f5831f
            androidx.navigation.b r12 = r1.mo1853b(r9)
            if (r12 == 0) goto L_0x0094
            android.os.Bundle r13 = r8.f5832g
            if (r13 == 0) goto L_0x0078
            android.content.Context r9 = r1.f1719a
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r13.setClassLoader(r9)
        L_0x0078:
            w0.g r9 = new w0.g
            android.content.Context r11 = r1.f1719a
            t0.g r14 = r1.f1727i
            w0.i r15 = r1.f1728j
            java.util.UUID r10 = r8.f5830e
            android.os.Bundle r8 = r8.f5833h
            r16 = r10
            r10 = r9
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Deque<w0.g> r8 = r1.f1726h
            r8.add(r9)
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0094:
            android.content.Context r0 = r1.f1719a
            int r3 = r8.f5831f
            java.lang.String r0 = androidx.navigation.C0364b.m1046c(r0, r3)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Restoring the Navigation back stack failed: destination "
            java.lang.StringBuilder r0 = p027e.C0856d.m2530a(r4, r0, r2)
            androidx.navigation.b r2 = r19.mo1854c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x00b3:
            r19.mo1859h()
            r1.f1724f = r5
        L_0x00b8:
            androidx.navigation.c r0 = r1.f1722d
            if (r0 == 0) goto L_0x02fd
            java.util.Deque<w0.g> r0 = r1.f1726h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02fd
            boolean r0 = r1.f1725g
            if (r0 != 0) goto L_0x02f2
            android.app.Activity r0 = r1.f1720b
            if (r0 == 0) goto L_0x02f2
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x00d4
            goto L_0x02ee
        L_0x00d4:
            android.os.Bundle r6 = r0.getExtras()
            if (r6 == 0) goto L_0x00e1
            java.lang.String r7 = "android-support-nav:controller:deepLinkIds"
            int[] r7 = r6.getIntArray(r7)
            goto L_0x00e2
        L_0x00e1:
            r7 = r5
        L_0x00e2:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            if (r6 == 0) goto L_0x00f0
            java.lang.String r9 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r6 = r6.getBundle(r9)
            goto L_0x00f1
        L_0x00f0:
            r6 = r5
        L_0x00f1:
            if (r6 == 0) goto L_0x00f6
            r8.putAll(r6)
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            int r6 = r7.length
            if (r6 != 0) goto L_0x0153
        L_0x00fb:
            android.net.Uri r6 = r0.getData()
            if (r6 == 0) goto L_0x0153
            androidx.navigation.c r6 = r1.f1722d
            r0.o r9 = new r0.o
            r9.<init>(r0)
            androidx.navigation.b$a r6 = r6.mo1868d(r9)
            if (r6 == 0) goto L_0x0153
            androidx.navigation.b r9 = r6.f1748e
            java.util.Objects.requireNonNull(r9)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r7 = r9
        L_0x0119:
            androidx.navigation.c r11 = r7.f1741f
            if (r11 == 0) goto L_0x0123
            int r12 = r11.f1754n
            int r13 = r7.f1742g
            if (r12 == r13) goto L_0x0126
        L_0x0123:
            r10.addFirst(r7)
        L_0x0126:
            if (r11 != 0) goto L_0x0151
            int r7 = r10.size()
            int[] r7 = new int[r7]
            java.util.Iterator r10 = r10.iterator()
            r11 = r4
        L_0x0133:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0147
            java.lang.Object r12 = r10.next()
            androidx.navigation.b r12 = (androidx.navigation.C0364b) r12
            int r13 = r11 + 1
            int r12 = r12.f1742g
            r7[r11] = r12
            r11 = r13
            goto L_0x0133
        L_0x0147:
            android.os.Bundle r6 = r6.f1749f
            android.os.Bundle r6 = r9.mo1866a(r6)
            r8.putAll(r6)
            goto L_0x0153
        L_0x0151:
            r7 = r11
            goto L_0x0119
        L_0x0153:
            if (r7 == 0) goto L_0x02ee
            int r6 = r7.length
            if (r6 != 0) goto L_0x015a
            goto L_0x02ee
        L_0x015a:
            androidx.navigation.c r6 = r1.f1722d
            r9 = r4
        L_0x015d:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x0199
            r10 = r7[r9]
            if (r9 != 0) goto L_0x016d
            androidx.navigation.c r11 = r1.f1722d
            int r12 = r11.f1742g
            if (r12 != r10) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            r11 = r5
            goto L_0x0171
        L_0x016d:
            androidx.navigation.b r11 = r6.mo1872g(r10)
        L_0x0171:
            if (r11 != 0) goto L_0x017a
            android.content.Context r6 = r1.f1719a
            java.lang.String r6 = androidx.navigation.C0364b.m1046c(r6, r10)
            goto L_0x019a
        L_0x017a:
            int r10 = r7.length
            int r10 = r10 + -1
            if (r9 == r10) goto L_0x0196
            androidx.navigation.c r11 = (androidx.navigation.C0366c) r11
        L_0x0181:
            int r6 = r11.f1754n
            androidx.navigation.b r6 = r11.mo1872g(r6)
            boolean r6 = r6 instanceof androidx.navigation.C0366c
            if (r6 == 0) goto L_0x0195
            int r6 = r11.f1754n
            androidx.navigation.b r6 = r11.mo1872g(r6)
            r11 = r6
            androidx.navigation.c r11 = (androidx.navigation.C0366c) r11
            goto L_0x0181
        L_0x0195:
            r6 = r11
        L_0x0196:
            int r9 = r9 + 1
            goto L_0x015d
        L_0x0199:
            r6 = r5
        L_0x019a:
            if (r6 == 0) goto L_0x01a1
            r0.toString()
            goto L_0x02ee
        L_0x01a1:
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            r8.putParcelable(r6, r0)
            int r6 = r0.getFlags()
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0228
            r10 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x0228
            r0.addFlags(r10)
            android.content.Context r2 = r1.f1719a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.ComponentName r7 = r0.getComponent()
            if (r7 != 0) goto L_0x01cd
            android.content.pm.PackageManager r7 = r2.getPackageManager()
            android.content.ComponentName r7 = r0.resolveActivity(r7)
        L_0x01cd:
            if (r7 == 0) goto L_0x01e8
            int r8 = r6.size()
        L_0x01d3:
            android.content.Intent r7 = p150z.C2154f.m5567b(r2, r7)     // Catch:{ NameNotFoundException -> 0x01e1 }
            if (r7 == 0) goto L_0x01e8
            r6.add(r8, r7)     // Catch:{ NameNotFoundException -> 0x01e1 }
            android.content.ComponentName r7 = r7.getComponent()     // Catch:{ NameNotFoundException -> 0x01e1 }
            goto L_0x01d3
        L_0x01e1:
            r0 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            throw r2
        L_0x01e8:
            r6.add(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0220
            int r0 = r6.size()
            android.content.Intent[] r0 = new android.content.Intent[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r6 = new android.content.Intent
            r7 = r0[r4]
            r6.<init>(r7)
            r7 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r6 = r6.addFlags(r7)
            r0[r4] = r6
            java.lang.Object r6 = p001a0.C0002a.f0a
            p001a0.C0002a.C0003a.m2a(r2, r0, r5)
            android.app.Activity r0 = r1.f1720b
            if (r0 == 0) goto L_0x02ec
            r0.finish()
            android.app.Activity r0 = r1.f1720b
            r0.overridePendingTransition(r4, r4)
            goto L_0x02ec
        L_0x0220:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No intents added to TaskStackBuilder; cannot startActivities"
            r0.<init>(r2)
            throw r0
        L_0x0228:
            java.lang.String r0 = "Deep Linking failed: destination "
            if (r9 == 0) goto L_0x027a
            java.util.Deque<w0.g> r6 = r1.f1726h
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x023b
            androidx.navigation.c r6 = r1.f1722d
            int r6 = r6.f1742g
            r1.mo1857f(r6, r3)
        L_0x023b:
            r6 = r4
        L_0x023c:
            int r9 = r7.length
            if (r6 >= r9) goto L_0x02ec
            int r9 = r6 + 1
            r6 = r7[r6]
            androidx.navigation.b r10 = r1.mo1853b(r6)
            if (r10 == 0) goto L_0x025f
            r14 = 0
            r12 = 0
            r18 = -1
            r15 = 0
            r16 = 0
            w0.m r6 = new w0.m
            r11 = r6
            r13 = r18
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1.mo1855d(r10, r8, r6, r5)
            r6 = r9
            goto L_0x023c
        L_0x025f:
            android.content.Context r3 = r1.f1719a
            java.lang.String r3 = androidx.navigation.C0364b.m1046c(r3, r6)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = p027e.C0856d.m2530a(r0, r3, r2)
            androidx.navigation.b r2 = r19.mo1854c()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x027a:
            androidx.navigation.c r2 = r1.f1722d
            r6 = r4
        L_0x027d:
            int r9 = r7.length
            if (r6 >= r9) goto L_0x02ea
            r9 = r7[r6]
            if (r6 != 0) goto L_0x0287
            androidx.navigation.c r10 = r1.f1722d
            goto L_0x028b
        L_0x0287:
            androidx.navigation.b r10 = r2.mo1872g(r9)
        L_0x028b:
            if (r10 == 0) goto L_0x02c7
            int r9 = r7.length
            int r9 = r9 - r3
            if (r6 == r9) goto L_0x02a9
            androidx.navigation.c r10 = (androidx.navigation.C0366c) r10
        L_0x0293:
            int r2 = r10.f1754n
            androidx.navigation.b r2 = r10.mo1872g(r2)
            boolean r2 = r2 instanceof androidx.navigation.C0366c
            if (r2 == 0) goto L_0x02a7
            int r2 = r10.f1754n
            androidx.navigation.b r2 = r10.mo1872g(r2)
            r10 = r2
            androidx.navigation.c r10 = (androidx.navigation.C0366c) r10
            goto L_0x0293
        L_0x02a7:
            r2 = r10
            goto L_0x02c4
        L_0x02a9:
            android.os.Bundle r9 = r10.mo1866a(r8)
            r12 = 0
            r18 = -1
            androidx.navigation.c r11 = r1.f1722d
            int r13 = r11.f1742g
            r14 = 1
            r15 = 0
            r16 = 0
            w0.m r11 = new w0.m
            r20 = r11
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1.mo1855d(r10, r9, r11, r5)
        L_0x02c4:
            int r6 = r6 + 1
            goto L_0x027d
        L_0x02c7:
            android.content.Context r3 = r1.f1719a
            java.lang.String r3 = androidx.navigation.C0364b.m1046c(r3, r9)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = " cannot be found in graph "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
        L_0x02ea:
            r1.f1725g = r3
        L_0x02ec:
            r0 = r3
            goto L_0x02ef
        L_0x02ee:
            r0 = r4
        L_0x02ef:
            if (r0 == 0) goto L_0x02f2
            goto L_0x02f3
        L_0x02f2:
            r3 = r4
        L_0x02f3:
            if (r3 != 0) goto L_0x0300
            androidx.navigation.c r0 = r1.f1722d
            r2 = r21
            r1.mo1855d(r0, r2, r5, r5)
            goto L_0x0300
        L_0x02fd:
            r19.mo1852a()
        L_0x0300:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo1858g(int, android.os.Bundle):void");
    }

    /* renamed from: h */
    public final void mo1859h() {
        C0555d dVar = this.f1732n;
        boolean z = false;
        if (this.f1733o) {
            int i = 0;
            for (C2004g gVar : this.f1726h) {
                if (!(gVar.f5821e instanceof C0366c)) {
                    i++;
                }
            }
            if (i > 1) {
                z = true;
            }
        }
        dVar.f2356a = z;
    }
}
