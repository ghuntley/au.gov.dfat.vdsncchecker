package p017c1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0131a0;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0000a;
import p017c1.C0592g;
import p075m.C1417c;
import p099q.C1592d;
import p099q.C1599h;

/* renamed from: c1.l */
public class C0603l extends C0592g {

    /* renamed from: B */
    public ArrayList<C0592g> f2451B = new ArrayList<>();

    /* renamed from: C */
    public boolean f2452C = true;

    /* renamed from: D */
    public int f2453D;

    /* renamed from: E */
    public boolean f2454E = false;

    /* renamed from: F */
    public int f2455F = 0;

    /* renamed from: c1.l$a */
    public class C0604a extends C0599j {

        /* renamed from: a */
        public final /* synthetic */ C0592g f2456a;

        public C0604a(C0603l lVar, C0592g gVar) {
            this.f2456a = gVar;
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            this.f2456a.mo2765D();
            gVar.mo2762A(this);
        }
    }

    /* renamed from: c1.l$b */
    public static class C0605b extends C0599j {

        /* renamed from: a */
        public C0603l f2457a;

        public C0605b(C0603l lVar) {
            this.f2457a = lVar;
        }

        /* renamed from: a */
        public void mo2761a(C0592g gVar) {
            C0603l lVar = this.f2457a;
            if (!lVar.f2454E) {
                lVar.mo2772K();
                this.f2457a.f2454E = true;
            }
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            C0603l lVar = this.f2457a;
            int i = lVar.f2453D - 1;
            lVar.f2453D = i;
            if (i == 0) {
                lVar.f2454E = false;
                lVar.mo2784r();
            }
            gVar.mo2762A(this);
        }
    }

    /* renamed from: A */
    public C0592g mo2762A(C0592g.C0596d dVar) {
        super.mo2762A(dVar);
        return this;
    }

    /* renamed from: B */
    public C0592g mo2763B(View view) {
        for (int i = 0; i < this.f2451B.size(); i++) {
            this.f2451B.get(i).mo2763B(view);
        }
        this.f2421j.remove(view);
        return this;
    }

    /* renamed from: C */
    public void mo2764C(View view) {
        super.mo2764C(view);
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).mo2764C(view);
        }
    }

    /* renamed from: D */
    public void mo2765D() {
        if (this.f2451B.isEmpty()) {
            mo2772K();
            mo2784r();
            return;
        }
        C0605b bVar = new C0605b(this);
        Iterator<C0592g> it = this.f2451B.iterator();
        while (it.hasNext()) {
            it.next().mo2774b(bVar);
        }
        this.f2453D = this.f2451B.size();
        if (!this.f2452C) {
            for (int i = 1; i < this.f2451B.size(); i++) {
                this.f2451B.get(i - 1).mo2774b(new C0604a(this, this.f2451B.get(i)));
            }
            C0592g gVar = this.f2451B.get(0);
            if (gVar != null) {
                gVar.mo2765D();
                return;
            }
            return;
        }
        Iterator<C0592g> it2 = this.f2451B.iterator();
        while (it2.hasNext()) {
            it2.next().mo2765D();
        }
    }

    /* renamed from: E */
    public C0592g mo2766E(long j) {
        ArrayList<C0592g> arrayList;
        this.f2418g = j;
        if (j >= 0 && (arrayList = this.f2451B) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2451B.get(i).mo2766E(j);
            }
        }
        return this;
    }

    /* renamed from: F */
    public void mo2767F(C0592g.C0595c cVar) {
        this.f2434w = cVar;
        this.f2455F |= 8;
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).mo2767F(cVar);
        }
    }

    /* renamed from: G */
    public C0592g mo2768G(TimeInterpolator timeInterpolator) {
        this.f2455F |= 1;
        ArrayList<C0592g> arrayList = this.f2451B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2451B.get(i).mo2768G(timeInterpolator);
            }
        }
        this.f2419h = timeInterpolator;
        return this;
    }

    /* renamed from: H */
    public void mo2769H(C1417c cVar) {
        this.f2435x = cVar == null ? C0592g.f2415z : cVar;
        this.f2455F |= 4;
        if (this.f2451B != null) {
            for (int i = 0; i < this.f2451B.size(); i++) {
                this.f2451B.get(i).mo2769H(cVar);
            }
        }
    }

    /* renamed from: I */
    public void mo2770I(C0000a aVar) {
        this.f2455F |= 2;
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).mo2770I(aVar);
        }
    }

    /* renamed from: J */
    public C0592g mo2771J(long j) {
        this.f2417f = j;
        return this;
    }

    /* renamed from: L */
    public String mo2773L(String str) {
        String L = super.mo2773L(str);
        for (int i = 0; i < this.f2451B.size(); i++) {
            StringBuilder a = C1599h.m4503a(L, "\n");
            a.append(this.f2451B.get(i).mo2773L(str + "  "));
            L = a.toString();
        }
        return L;
    }

    /* renamed from: M */
    public C0603l mo2798M(C0592g gVar) {
        this.f2451B.add(gVar);
        gVar.f2424m = this;
        long j = this.f2418g;
        if (j >= 0) {
            gVar.mo2766E(j);
        }
        if ((this.f2455F & 1) != 0) {
            gVar.mo2768G(this.f2419h);
        }
        if ((this.f2455F & 2) != 0) {
            gVar.mo2770I((C0000a) null);
        }
        if ((this.f2455F & 4) != 0) {
            gVar.mo2769H(this.f2435x);
        }
        if ((this.f2455F & 8) != 0) {
            gVar.mo2767F(this.f2434w);
        }
        return this;
    }

    /* renamed from: N */
    public C0592g mo2799N(int i) {
        if (i < 0 || i >= this.f2451B.size()) {
            return null;
        }
        return this.f2451B.get(i);
    }

    /* renamed from: O */
    public C0603l mo2800O(int i) {
        if (i == 0) {
            this.f2452C = true;
        } else if (i == 1) {
            this.f2452C = false;
        } else {
            throw new AndroidRuntimeException(C0131a0.m344a("Invalid parameter for TransitionSet ordering: ", i));
        }
        return this;
    }

    /* renamed from: b */
    public C0592g mo2774b(C0592g.C0596d dVar) {
        super.mo2774b(dVar);
        return this;
    }

    public void cancel() {
        super.cancel();
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).cancel();
        }
    }

    /* renamed from: d */
    public C0592g mo2777d(View view) {
        for (int i = 0; i < this.f2451B.size(); i++) {
            this.f2451B.get(i).mo2777d(view);
        }
        this.f2421j.add(view);
        return this;
    }

    /* renamed from: f */
    public void mo2720f(C0607n nVar) {
        if (mo2789x(nVar.f2462b)) {
            Iterator<C0592g> it = this.f2451B.iterator();
            while (it.hasNext()) {
                C0592g next = it.next();
                if (next.mo2789x(nVar.f2462b)) {
                    next.mo2720f(nVar);
                    nVar.f2463c.add(next);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo2779k(C0607n nVar) {
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).mo2779k(nVar);
        }
    }

    /* renamed from: l */
    public void mo2721l(C0607n nVar) {
        if (mo2789x(nVar.f2462b)) {
            Iterator<C0592g> it = this.f2451B.iterator();
            while (it.hasNext()) {
                C0592g next = it.next();
                if (next.mo2789x(nVar.f2462b)) {
                    next.mo2721l(nVar);
                    nVar.f2463c.add(next);
                }
            }
        }
    }

    /* renamed from: o */
    public C0592g clone() {
        C0603l lVar = (C0603l) super.clone();
        lVar.f2451B = new ArrayList<>();
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            C0592g o = this.f2451B.get(i).clone();
            lVar.f2451B.add(o);
            o.f2424m = lVar;
        }
        return lVar;
    }

    /* renamed from: q */
    public void mo2783q(ViewGroup viewGroup, C1592d dVar, C1592d dVar2, ArrayList<C0607n> arrayList, ArrayList<C0607n> arrayList2) {
        long j = this.f2417f;
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            C0592g gVar = this.f2451B.get(i);
            if (j > 0 && (this.f2452C || i == 0)) {
                long j2 = gVar.f2417f;
                if (j2 > 0) {
                    gVar.mo2771J(j2 + j);
                } else {
                    gVar.mo2771J(j);
                }
            }
            gVar.mo2783q(viewGroup, dVar, dVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: z */
    public void mo2790z(View view) {
        super.mo2790z(view);
        int size = this.f2451B.size();
        for (int i = 0; i < size; i++) {
            this.f2451B.get(i).mo2790z(view);
        }
    }
}
