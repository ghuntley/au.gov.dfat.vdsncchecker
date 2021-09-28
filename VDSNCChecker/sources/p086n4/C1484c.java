package p086n4;

import java.util.Enumeration;
import java.util.Objects;
import p074l4.C1345d;
import p074l4.C1347d1;
import p074l4.C1348e;
import p074l4.C1377n;
import p074l4.C1393s;
import p074l4.C1399u;
import p074l4.C1408x;
import p075m.C1417c;
import p092o4.C1536b;

/* renamed from: n4.c */
public class C1484c extends C1377n implements C1345d {

    /* renamed from: j */
    public static C1417c f4632j = C1536b.f4771d;

    /* renamed from: e */
    public boolean f4633e;

    /* renamed from: f */
    public int f4634f;

    /* renamed from: g */
    public C1417c f4635g = f4632j;

    /* renamed from: h */
    public C1483b[] f4636h;

    /* renamed from: i */
    public C1347d1 f4637i;

    public C1484c(C1399u uVar) {
        C1347d1 d1Var;
        this.f4636h = new C1483b[uVar.size()];
        Enumeration t = uVar.mo5230t();
        int i = 0;
        boolean z = true;
        while (t.hasMoreElements()) {
            Object nextElement = t.nextElement();
            C1483b bVar = nextElement instanceof C1483b ? (C1483b) nextElement : nextElement != null ? new C1483b(C1408x.m4038r(nextElement)) : null;
            z &= bVar == nextElement;
            this.f4636h[i] = bVar;
            i++;
        }
        if (z) {
            d1Var = (C1347d1) uVar.mo5159o();
        } else {
            d1Var = new C1347d1((C1348e[]) this.f4636h);
        }
        this.f4637i = d1Var;
    }

    /* renamed from: i */
    public static C1484c m4177i(Object obj) {
        if (obj instanceof C1484c) {
            return (C1484c) obj;
        }
        if (obj != null) {
            return new C1484c(C1399u.m4010q(obj));
        }
        return null;
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        return this.f4637i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1484c) && !(obj instanceof C1399u)) {
            return false;
        }
        if (this.f4637i.mo5222l(((C1348e) obj).mo5171c())) {
            return true;
        }
        try {
            return this.f4635g.mo5249a(this, new C1484c(C1399u.m4010q(((C1348e) obj).mo5171c())));
        } catch (Exception unused) {
            return false;
        }
    }

    public int hashCode() {
        if (this.f4633e) {
            return this.f4634f;
        }
        this.f4633e = true;
        C1417c cVar = this.f4635g;
        Objects.requireNonNull(cVar);
        C1483b[] j = mo5354j();
        int i = 0;
        for (int i2 = 0; i2 != j.length; i2++) {
            if (j[i2].f4631e.f4456e.length > 1) {
                C1482a[] j2 = j[i2].mo5353j();
                for (int i3 = 0; i3 != j2.length; i3++) {
                    i = (i ^ j2[i3].f4629e.hashCode()) ^ cVar.mo5250b(j2[i3].f4630f);
                }
            } else {
                i = (i ^ j[i2].mo5352i().f4629e.hashCode()) ^ cVar.mo5250b(j[i2].mo5352i().f4630f);
            }
        }
        this.f4634f = i;
        return i;
    }

    /* renamed from: j */
    public C1483b[] mo5354j() {
        return (C1483b[]) this.f4636h.clone();
    }

    public String toString() {
        return this.f4635g.mo5253j(this);
    }
}
