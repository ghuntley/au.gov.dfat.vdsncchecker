package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p093p.C1550e;
import p093p.C1558h;
import p099q.C1595f;

/* renamed from: androidx.recyclerview.widget.d0 */
public class C0446d0 {

    /* renamed from: a */
    public final C1558h<RecyclerView.C0422z, C0447a> f2090a = new C1558h<>();

    /* renamed from: b */
    public final C1550e<RecyclerView.C0422z> f2091b = new C1550e<>();

    /* renamed from: androidx.recyclerview.widget.d0$a */
    public static class C0447a {

        /* renamed from: d */
        public static C1595f<C0447a> f2092d = new C1595f<>(20, 1);

        /* renamed from: a */
        public int f2093a;

        /* renamed from: b */
        public RecyclerView.C0394i.C0397c f2094b;

        /* renamed from: c */
        public RecyclerView.C0394i.C0397c f2095c;

        /* renamed from: a */
        public static C0447a m1592a() {
            C0447a aVar = (C0447a) f2092d.mo4463a();
            return aVar == null ? new C0447a() : aVar;
        }

        /* renamed from: b */
        public static void m1593b(C0447a aVar) {
            aVar.f2093a = 0;
            aVar.f2094b = null;
            aVar.f2095c = null;
            f2092d.mo4464c(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d0$b */
    public interface C0448b {
    }

    /* renamed from: a */
    public void mo2367a(RecyclerView.C0422z zVar) {
        C0447a orDefault = this.f2090a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = C0447a.m1592a();
            this.f2090a.put(zVar, orDefault);
        }
        orDefault.f2093a |= 1;
    }

    /* renamed from: b */
    public void mo2368b(RecyclerView.C0422z zVar, RecyclerView.C0394i.C0397c cVar) {
        C0447a orDefault = this.f2090a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = C0447a.m1592a();
            this.f2090a.put(zVar, orDefault);
        }
        orDefault.f2095c = cVar;
        orDefault.f2093a |= 8;
    }

    /* renamed from: c */
    public void mo2369c(RecyclerView.C0422z zVar, RecyclerView.C0394i.C0397c cVar) {
        C0447a orDefault = this.f2090a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = C0447a.m1592a();
            this.f2090a.put(zVar, orDefault);
        }
        orDefault.f2094b = cVar;
        orDefault.f2093a |= 4;
    }

    /* renamed from: d */
    public boolean mo2370d(RecyclerView.C0422z zVar) {
        C0447a orDefault = this.f2090a.getOrDefault(zVar, null);
        return (orDefault == null || (orDefault.f2093a & 1) == 0) ? false : true;
    }

    /* renamed from: e */
    public final RecyclerView.C0394i.C0397c mo2371e(RecyclerView.C0422z zVar, int i) {
        C0447a l;
        RecyclerView.C0394i.C0397c cVar;
        int f = this.f2090a.mo5608f(zVar);
        if (f >= 0 && (l = this.f2090a.mo5618l(f)) != null) {
            int i2 = l.f2093a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                l.f2093a = i3;
                if (i == 4) {
                    cVar = l.f2094b;
                } else if (i == 8) {
                    cVar = l.f2095c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f2090a.mo5616j(f);
                    C0447a.m1593b(l);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void mo2372f(RecyclerView.C0422z zVar) {
        C0447a orDefault = this.f2090a.getOrDefault(zVar, null);
        if (orDefault != null) {
            orDefault.f2093a &= -2;
        }
    }

    /* renamed from: g */
    public void mo2373g(RecyclerView.C0422z zVar) {
        int l = this.f2091b.mo5538l() - 1;
        while (true) {
            if (l < 0) {
                break;
            } else if (zVar == this.f2091b.mo5539m(l)) {
                C1550e<RecyclerView.C0422z> eVar = this.f2091b;
                Object[] objArr = eVar.f4810g;
                Object obj = objArr[l];
                Object obj2 = C1550e.f4807i;
                if (obj != obj2) {
                    objArr[l] = obj2;
                    eVar.f4808e = true;
                }
            } else {
                l--;
            }
        }
        C0447a remove = this.f2090a.remove(zVar);
        if (remove != null) {
            C0447a.m1593b(remove);
        }
    }
}
