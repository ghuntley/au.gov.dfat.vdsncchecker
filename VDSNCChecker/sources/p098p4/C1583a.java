package p098p4;

import java.util.Enumeration;
import p016c0.C0559c;
import p074l4.C1340b0;
import p074l4.C1347d1;
import p074l4.C1351f;
import p074l4.C1358g1;
import p074l4.C1371l;
import p074l4.C1377n;
import p074l4.C1384p;
import p074l4.C1393s;
import p074l4.C1399u;
import p110r4.C1688a;

/* renamed from: p4.a */
public class C1583a extends C1377n {

    /* renamed from: e */
    public C1384p f4911e = null;

    /* renamed from: f */
    public C1586d f4912f = null;

    /* renamed from: g */
    public C1371l f4913g = null;

    public C1583a(C1399u uVar) {
        Enumeration t = uVar.mo5230t();
        while (t.hasMoreElements()) {
            C1340b0 q = C1340b0.m3801q(t.nextElement());
            int i = q.f4358e;
            if (i == 0) {
                this.f4911e = C1384p.m3960r(q, false);
            } else if (i == 1) {
                this.f4912f = new C1586d(C1399u.m4011r(q, false));
            } else if (i == 2) {
                this.f4913g = C1371l.m3913r(q, false);
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    /* renamed from: i */
    public static C1583a m4428i(Object obj) {
        if (obj instanceof C1583a) {
            return (C1583a) obj;
        }
        if (obj != null) {
            return new C1583a(C1399u.m4010q(obj));
        }
        return null;
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        C1351f fVar = new C1351f(3);
        C1384p pVar = this.f4911e;
        if (pVar != null) {
            fVar.mo5173a(new C1358g1(false, 0, pVar, 0));
        }
        C1586d dVar = this.f4912f;
        if (dVar != null) {
            fVar.mo5173a(new C1358g1(false, 1, dVar, 0));
        }
        C1371l lVar = this.f4913g;
        if (lVar != null) {
            fVar.mo5173a(new C1358g1(false, 2, lVar, 0));
        }
        return new C1347d1(fVar);
    }

    public String toString() {
        C1384p pVar = this.f4911e;
        return C0559c.m1823a("AuthorityKeyIdentifier: KeyID(", pVar != null ? C1688a.m4678b(pVar.f4424e) : "null", ")");
    }
}
