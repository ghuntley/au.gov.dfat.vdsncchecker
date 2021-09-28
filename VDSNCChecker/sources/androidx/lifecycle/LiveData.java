package androidx.lifecycle;

import androidx.lifecycle.C0342c;
import java.util.Map;
import p016c0.C0559c;
import p075m.C1414a;
import p081n.C1442b;
import p118t0.C1773g;
import p118t0.C1777k;

public abstract class LiveData<T> {

    /* renamed from: j */
    public static final Object f1649j = new Object();

    /* renamed from: a */
    public final Object f1650a = new Object();

    /* renamed from: b */
    public C1442b<C1777k<? super T>, LiveData<T>.b> f1651b = new C1442b<>();

    /* renamed from: c */
    public int f1652c = 0;

    /* renamed from: d */
    public boolean f1653d;

    /* renamed from: e */
    public volatile Object f1654e;

    /* renamed from: f */
    public volatile Object f1655f;

    /* renamed from: g */
    public int f1656g;

    /* renamed from: h */
    public boolean f1657h;

    /* renamed from: i */
    public boolean f1658i;

    public class LifecycleBoundObserver extends LiveData<T>.b implements C0346d {

        /* renamed from: i */
        public final C1773g f1659i;

        public LifecycleBoundObserver(C1773g gVar, C1777k<? super T> kVar) {
            super(kVar);
            this.f1659i = gVar;
        }

        /* renamed from: g */
        public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
            C0342c.C0345c cVar = ((C0347e) this.f1659i.mo113c()).f1689b;
            if (cVar == C0342c.C0345c.DESTROYED) {
                LiveData.this.mo1783g(this.f1661e);
                return;
            }
            C0342c.C0345c cVar2 = null;
            while (cVar2 != cVar) {
                mo1787h(mo1786k());
                cVar2 = cVar;
                cVar = ((C0347e) this.f1659i.mo113c()).f1689b;
            }
        }

        /* renamed from: i */
        public void mo1784i() {
            C0347e eVar = (C0347e) this.f1659i.mo113c();
            eVar.mo1806d("removeObserver");
            eVar.f1688a.mo5284e(this);
        }

        /* renamed from: j */
        public boolean mo1785j(C1773g gVar) {
            return this.f1659i == gVar;
        }

        /* renamed from: k */
        public boolean mo1786k() {
            return ((C0347e) this.f1659i.mo113c()).f1689b.compareTo(C0342c.C0345c.STARTED) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0333a extends LiveData<T>.b {
        public C0333a(LiveData liveData, C1777k<? super T> kVar) {
            super(kVar);
        }

        /* renamed from: k */
        public boolean mo1786k() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class C0334b {

        /* renamed from: e */
        public final C1777k<? super T> f1661e;

        /* renamed from: f */
        public boolean f1662f;

        /* renamed from: g */
        public int f1663g = -1;

        public C0334b(C1777k<? super T> kVar) {
            this.f1661e = kVar;
        }

        /* renamed from: h */
        public void mo1787h(boolean z) {
            if (z != this.f1662f) {
                this.f1662f = z;
                LiveData liveData = LiveData.this;
                int i = z ? 1 : -1;
                int i2 = liveData.f1652c;
                liveData.f1652c = i + i2;
                if (!liveData.f1653d) {
                    liveData.f1653d = true;
                    while (true) {
                        try {
                            int i3 = liveData.f1652c;
                            if (i2 == i3) {
                                break;
                            }
                            boolean z2 = i2 == 0 && i3 > 0;
                            boolean z3 = i2 > 0 && i3 == 0;
                            if (z2) {
                                liveData.mo1781e();
                            } else if (z3) {
                                liveData.mo1782f();
                            }
                            i2 = i3;
                        } finally {
                            liveData.f1653d = false;
                        }
                    }
                }
                if (this.f1662f) {
                    LiveData.this.mo1779c(this);
                }
            }
        }

        /* renamed from: i */
        public void mo1784i() {
        }

        /* renamed from: j */
        public boolean mo1785j(C1773g gVar) {
            return false;
        }

        /* renamed from: k */
        public abstract boolean mo1786k();
    }

    public LiveData() {
        Object obj = f1649j;
        this.f1655f = obj;
        this.f1654e = obj;
        this.f1656g = -1;
    }

    /* renamed from: a */
    public static void m980a(String str) {
        if (!C1414a.m4062k().mo5247f()) {
            throw new IllegalStateException(C0559c.m1823a("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void mo1778b(LiveData<T>.b bVar) {
        if (bVar.f1662f) {
            if (!bVar.mo1786k()) {
                bVar.mo1787h(false);
                return;
            }
            int i = bVar.f1663g;
            int i2 = this.f1656g;
            if (i < i2) {
                bVar.f1663g = i2;
                bVar.f1661e.mo4788b(this.f1654e);
            }
        }
    }

    /* renamed from: c */
    public void mo1779c(LiveData<T>.b bVar) {
        if (this.f1657h) {
            this.f1658i = true;
            return;
        }
        this.f1657h = true;
        do {
            this.f1658i = false;
            if (bVar == null) {
                C1442b<K, V>.d b = this.f1651b.mo5285b();
                while (b.hasNext()) {
                    mo1778b((C0334b) ((Map.Entry) b.next()).getValue());
                    if (this.f1658i) {
                        break;
                    }
                }
            } else {
                mo1778b(bVar);
                bVar = null;
            }
        } while (this.f1658i);
        this.f1657h = false;
    }

    /* renamed from: d */
    public void mo1780d(C1773g gVar, C1777k<? super T> kVar) {
        m980a("observe");
        if (((C0347e) gVar.mo113c()).f1689b != C0342c.C0345c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, kVar);
            C0334b d = this.f1651b.mo5283d(kVar, lifecycleBoundObserver);
            if (d != null && !d.mo1785j(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (d == null) {
                gVar.mo113c().mo1802a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: e */
    public void mo1781e() {
    }

    /* renamed from: f */
    public void mo1782f() {
    }

    /* renamed from: g */
    public void mo1783g(C1777k<? super T> kVar) {
        m980a("removeObserver");
        C0334b e = this.f1651b.mo5284e(kVar);
        if (e != null) {
            e.mo1784i();
            e.mo1787h(false);
        }
    }
}
