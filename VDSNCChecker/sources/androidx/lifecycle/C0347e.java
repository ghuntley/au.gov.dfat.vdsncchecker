package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0342c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.C0001b;
import p016c0.C0559c;
import p075m.C1414a;
import p081n.C1441a;
import p081n.C1442b;
import p118t0.C1768c;
import p118t0.C1772f;
import p118t0.C1773g;
import p118t0.C1775i;

/* renamed from: androidx.lifecycle.e */
public class C0347e extends C0342c {

    /* renamed from: a */
    public C1441a<C1772f, C0348a> f1688a = new C1441a<>();

    /* renamed from: b */
    public C0342c.C0345c f1689b;

    /* renamed from: c */
    public final WeakReference<C1773g> f1690c;

    /* renamed from: d */
    public int f1691d = 0;

    /* renamed from: e */
    public boolean f1692e = false;

    /* renamed from: f */
    public boolean f1693f = false;

    /* renamed from: g */
    public ArrayList<C0342c.C0345c> f1694g = new ArrayList<>();

    /* renamed from: h */
    public final boolean f1695h;

    /* renamed from: androidx.lifecycle.e$a */
    public static class C0348a {

        /* renamed from: a */
        public C0342c.C0345c f1696a;

        /* renamed from: b */
        public C0346d f1697b;

        public C0348a(C1772f fVar, C0342c.C0345c cVar) {
            C0346d dVar;
            Map<Class<?>, Integer> map = C1775i.f5410a;
            boolean z = fVar instanceof C0346d;
            boolean z2 = fVar instanceof C1768c;
            if (z && z2) {
                dVar = new FullLifecycleObserverAdapter((C1768c) fVar, (C0346d) fVar);
            } else if (z2) {
                dVar = new FullLifecycleObserverAdapter((C1768c) fVar, (C0346d) null);
            } else if (z) {
                dVar = (C0346d) fVar;
            } else {
                Class<?> cls = fVar.getClass();
                if (C1775i.m4951c(cls) == 2) {
                    List list = (List) ((HashMap) C1775i.f5411b).get(cls);
                    if (list.size() == 1) {
                        dVar = new SingleGeneratedAdapterObserver(C1775i.m4949a((Constructor) list.get(0), fVar));
                    } else {
                        C0341b[] bVarArr = new C0341b[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            bVarArr[i] = C1775i.m4949a((Constructor) list.get(i), fVar);
                        }
                        dVar = new CompositeGeneratedAdaptersObserver(bVarArr);
                    }
                } else {
                    dVar = new ReflectiveGenericLifecycleObserver(fVar);
                }
            }
            this.f1697b = dVar;
            this.f1696a = cVar;
        }

        /* renamed from: a */
        public void mo1812a(C1773g gVar, C0342c.C0344b bVar) {
            C0342c.C0345c a = bVar.mo1804a();
            this.f1696a = C0347e.m1014f(this.f1696a, a);
            this.f1697b.mo134g(gVar, bVar);
            this.f1696a = a;
        }
    }

    public C0347e(C1773g gVar) {
        this.f1690c = new WeakReference<>(gVar);
        this.f1689b = C0342c.C0345c.INITIALIZED;
        this.f1695h = true;
    }

    /* renamed from: f */
    public static C0342c.C0345c m1014f(C0342c.C0345c cVar, C0342c.C0345c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: a */
    public void mo1802a(C1772f fVar) {
        C1773g gVar;
        mo1806d("addObserver");
        C0342c.C0345c cVar = this.f1689b;
        C0342c.C0345c cVar2 = C0342c.C0345c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C0342c.C0345c.INITIALIZED;
        }
        C0348a aVar = new C0348a(fVar, cVar2);
        if (this.f1688a.mo5283d(fVar, aVar) == null && (gVar = (C1773g) this.f1690c.get()) != null) {
            boolean z = this.f1691d != 0 || this.f1692e;
            C0342c.C0345c c = mo1805c(fVar);
            this.f1691d++;
            while (aVar.f1696a.compareTo(c) < 0 && this.f1688a.f4531i.containsKey(fVar)) {
                this.f1694g.add(aVar.f1696a);
                C0342c.C0344b b = C0342c.C0344b.m1011b(aVar.f1696a);
                if (b != null) {
                    aVar.mo1812a(gVar, b);
                    mo1809h();
                    c = mo1805c(fVar);
                } else {
                    StringBuilder a = C0001b.m0a("no event up from ");
                    a.append(aVar.f1696a);
                    throw new IllegalStateException(a.toString());
                }
            }
            if (!z) {
                mo1811j();
            }
            this.f1691d--;
        }
    }

    /* renamed from: b */
    public void mo1803b(C1772f fVar) {
        mo1806d("removeObserver");
        this.f1688a.mo5284e(fVar);
    }

    /* renamed from: c */
    public final C0342c.C0345c mo1805c(C1772f fVar) {
        C1441a<C1772f, C0348a> aVar = this.f1688a;
        C0342c.C0345c cVar = null;
        C1442b.C1445c<K, V> cVar2 = aVar.f4531i.containsKey(fVar) ? aVar.f4531i.get(fVar).f4539h : null;
        C0342c.C0345c cVar3 = cVar2 != null ? ((C0348a) cVar2.f4537f).f1696a : null;
        if (!this.f1694g.isEmpty()) {
            ArrayList<C0342c.C0345c> arrayList = this.f1694g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m1014f(m1014f(this.f1689b, cVar3), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public final void mo1806d(String str) {
        if (this.f1695h && !C1414a.m4062k().mo5247f()) {
            throw new IllegalStateException(C0559c.m1823a("Method ", str, " must be called on the main thread"));
        }
    }

    /* renamed from: e */
    public void mo1807e(C0342c.C0344b bVar) {
        mo1806d("handleLifecycleEvent");
        mo1808g(bVar.mo1804a());
    }

    /* renamed from: g */
    public final void mo1808g(C0342c.C0345c cVar) {
        if (this.f1689b != cVar) {
            this.f1689b = cVar;
            if (this.f1692e || this.f1691d != 0) {
                this.f1693f = true;
                return;
            }
            this.f1692e = true;
            mo1811j();
            this.f1692e = false;
        }
    }

    /* renamed from: h */
    public final void mo1809h() {
        ArrayList<C0342c.C0345c> arrayList = this.f1694g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: i */
    public void mo1810i(C0342c.C0345c cVar) {
        mo1806d("setCurrentState");
        mo1808g(cVar);
    }

    /* renamed from: j */
    public final void mo1811j() {
        C0342c.C0345c cVar;
        C1773g gVar = (C1773g) this.f1690c.get();
        if (gVar != null) {
            while (true) {
                C1441a<C1772f, C0348a> aVar = this.f1688a;
                boolean z = true;
                if (!(aVar.f4535h == 0 || (((C0348a) aVar.f4532e.f4537f).f1696a == (cVar = ((C0348a) aVar.f4533f.f4537f).f1696a) && this.f1689b == cVar))) {
                    z = false;
                }
                this.f1693f = false;
                if (!z) {
                    if (this.f1689b.compareTo(((C0348a) aVar.f4532e.f4537f).f1696a) < 0) {
                        C1441a<C1772f, C0348a> aVar2 = this.f1688a;
                        C1442b.C1444b bVar = new C1442b.C1444b(aVar2.f4533f, aVar2.f4532e);
                        aVar2.f4534g.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f1693f) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            C0348a aVar3 = (C0348a) entry.getValue();
                            while (aVar3.f1696a.compareTo(this.f1689b) > 0 && !this.f1693f && this.f1688a.contains(entry.getKey())) {
                                int ordinal = aVar3.f1696a.ordinal();
                                C0342c.C0344b bVar2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : C0342c.C0344b.ON_PAUSE : C0342c.C0344b.ON_STOP : C0342c.C0344b.ON_DESTROY;
                                if (bVar2 != null) {
                                    this.f1694g.add(bVar2.mo1804a());
                                    aVar3.mo1812a(gVar, bVar2);
                                    mo1809h();
                                } else {
                                    StringBuilder a = C0001b.m0a("no event down from ");
                                    a.append(aVar3.f1696a);
                                    throw new IllegalStateException(a.toString());
                                }
                            }
                        }
                    }
                    C1442b.C1445c<K, V> cVar2 = this.f1688a.f4533f;
                    if (!this.f1693f && cVar2 != null && this.f1689b.compareTo(((C0348a) cVar2.f4537f).f1696a) > 0) {
                        C1442b<K, V>.d b = this.f1688a.mo5285b();
                        while (b.hasNext() && !this.f1693f) {
                            Map.Entry entry2 = (Map.Entry) b.next();
                            C0348a aVar4 = (C0348a) entry2.getValue();
                            while (aVar4.f1696a.compareTo(this.f1689b) < 0 && !this.f1693f && this.f1688a.contains(entry2.getKey())) {
                                this.f1694g.add(aVar4.f1696a);
                                C0342c.C0344b b2 = C0342c.C0344b.m1011b(aVar4.f1696a);
                                if (b2 != null) {
                                    aVar4.mo1812a(gVar, b2);
                                    mo1809h();
                                } else {
                                    StringBuilder a2 = C0001b.m0a("no event up from ");
                                    a2.append(aVar4.f1696a);
                                    throw new IllegalStateException(a2.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
