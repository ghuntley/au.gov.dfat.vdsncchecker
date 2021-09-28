package p073l3;

import p085n3.C1470k;

/* renamed from: l3.a1 */
public abstract class C1264a1 extends C1326x {
    /* renamed from: T */
    public abstract C1264a1 mo5016T();

    /* renamed from: U */
    public final String mo5017U() {
        C1264a1 a1Var;
        C1278f0 f0Var = C1278f0.f4285a;
        C1264a1 a1Var2 = C1470k.f4617a;
        if (this == a1Var2) {
            return "Dispatchers.Main";
        }
        try {
            a1Var = a1Var2.mo5016T();
        } catch (UnsupportedOperationException unused) {
            a1Var = null;
        }
        if (this == a1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String U = mo5017U();
        if (U != null) {
            return U;
        }
        return getClass().getSimpleName() + '@' + C1320u.m3710n(this);
    }
}
