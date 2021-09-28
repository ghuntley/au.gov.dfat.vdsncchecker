package p117t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p063k.C1142f;
import p099q.C1593e;
import p099q.C1599h;
import p111s.C1691b;
import p111s.C1693d;
import p111s.C1695e;
import p111s.C1696f;

/* renamed from: t.p */
public class C1763p {

    /* renamed from: f */
    public static int f5392f;

    /* renamed from: a */
    public ArrayList<C1695e> f5393a = new ArrayList<>();

    /* renamed from: b */
    public int f5394b = -1;

    /* renamed from: c */
    public int f5395c = 0;

    /* renamed from: d */
    public ArrayList<C1764a> f5396d = null;

    /* renamed from: e */
    public int f5397e = -1;

    /* renamed from: t.p$a */
    public class C1764a {
        public C1764a(C1763p pVar, C1695e eVar, C1593e eVar2, int i) {
            new WeakReference(eVar);
            eVar2.mo5730o(eVar.f5180I);
            eVar2.mo5730o(eVar.f5181J);
            eVar2.mo5730o(eVar.f5182K);
            eVar2.mo5730o(eVar.f5183L);
            eVar2.mo5730o(eVar.f5184M);
        }
    }

    public C1763p(int i) {
        int i2 = f5392f;
        f5392f = i2 + 1;
        this.f5394b = i2;
        this.f5395c = i;
    }

    /* renamed from: a */
    public boolean mo6039a(C1695e eVar) {
        if (this.f5393a.contains(eVar)) {
            return false;
        }
        this.f5393a.add(eVar);
        return true;
    }

    /* renamed from: b */
    public void mo6040b(ArrayList<C1763p> arrayList) {
        int size = this.f5393a.size();
        if (this.f5397e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1763p pVar = arrayList.get(i);
                if (this.f5397e == pVar.f5394b) {
                    mo6042d(this.f5395c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo6041c(C1593e eVar, int i) {
        int i2;
        C1693d dVar;
        if (this.f5393a.size() == 0) {
            return 0;
        }
        ArrayList<C1695e> arrayList = this.f5393a;
        C1696f fVar = (C1696f) arrayList.get(0).f5192U;
        eVar.mo5736u();
        fVar.mo5893d(eVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).mo5893d(eVar, false);
        }
        if (i == 0 && fVar.f5260z0 > 0) {
            C1691b.m4686a(fVar, eVar, arrayList, 0);
        }
        if (i == 1 && fVar.f5240A0 > 0) {
            C1691b.m4686a(fVar, eVar, arrayList, 1);
        }
        try {
            eVar.mo5732q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f5396d = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f5396d.add(new C1764a(this, arrayList.get(i4), eVar, i));
        }
        if (i == 0) {
            i2 = eVar.mo5730o(fVar.f5180I);
            dVar = fVar.f5182K;
        } else {
            i2 = eVar.mo5730o(fVar.f5181J);
            dVar = fVar.f5183L;
        }
        int o = eVar.mo5730o(dVar);
        eVar.mo5736u();
        return o - i2;
    }

    /* renamed from: d */
    public void mo6042d(int i, C1763p pVar) {
        Iterator<C1695e> it = this.f5393a.iterator();
        while (it.hasNext()) {
            C1695e next = it.next();
            pVar.mo6039a(next);
            if (i == 0) {
                next.f5227o0 = pVar.f5394b;
            } else {
                next.f5229p0 = pVar.f5394b;
            }
        }
        this.f5397e = pVar.f5394b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f5395c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f5394b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<C1695e> it = this.f5393a.iterator();
        while (it.hasNext()) {
            StringBuilder a = C1599h.m4503a(sb2, " ");
            a.append(it.next().f5215i0);
            sb2 = a.toString();
        }
        return C1142f.m3365a(sb2, " >");
    }
}
