package p111s;

import p099q.C1590c;
import p099q.C1593e;
import p099q.C1601j;
import p111s.C1693d;

/* renamed from: s.g */
public class C1697g extends C1695e {

    /* renamed from: q0 */
    public float f5261q0 = -1.0f;

    /* renamed from: r0 */
    public int f5262r0 = -1;

    /* renamed from: s0 */
    public int f5263s0 = -1;

    /* renamed from: t0 */
    public C1693d f5264t0 = this.f5181J;

    /* renamed from: u0 */
    public int f5265u0;

    /* renamed from: v0 */
    public boolean f5266v0;

    public C1697g() {
        this.f5265u0 = 0;
        this.f5189R.clear();
        this.f5189R.add(this.f5264t0);
        int length = this.f5188Q.length;
        for (int i = 0; i < length; i++) {
            this.f5188Q[i] = this.f5264t0;
        }
    }

    /* renamed from: A */
    public boolean mo5889A() {
        return this.f5266v0;
    }

    /* renamed from: B */
    public boolean mo5890B() {
        return this.f5266v0;
    }

    /* renamed from: P */
    public void mo5920P(C1593e eVar, boolean z) {
        if (this.f5192U != null) {
            int o = eVar.mo5730o(this.f5264t0);
            if (this.f5265u0 == 1) {
                this.f5197Z = o;
                this.f5199a0 = 0;
                mo5913I(this.f5192U.mo5929l());
                mo5918N(0);
                return;
            }
            this.f5197Z = 0;
            this.f5199a0 = o;
            mo5918N(this.f5192U.mo5935r());
            mo5913I(0);
        }
    }

    /* renamed from: Q */
    public void mo5955Q(int i) {
        C1693d dVar = this.f5264t0;
        dVar.f5155b = i;
        dVar.f5156c = true;
        this.f5266v0 = true;
    }

    /* renamed from: R */
    public void mo5956R(int i) {
        if (this.f5265u0 != i) {
            this.f5265u0 = i;
            this.f5189R.clear();
            this.f5264t0 = this.f5265u0 == 1 ? this.f5180I : this.f5181J;
            this.f5189R.add(this.f5264t0);
            int length = this.f5188Q.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f5188Q[i2] = this.f5264t0;
            }
        }
    }

    /* renamed from: d */
    public void mo5893d(C1593e eVar, boolean z) {
        C1601j jVar;
        C1601j jVar2;
        C1601j jVar3;
        C1696f fVar = (C1696f) this.f5192U;
        if (fVar != null) {
            C1693d i = fVar.mo5926i(C1693d.C1694a.LEFT);
            C1693d i2 = fVar.mo5926i(C1693d.C1694a.RIGHT);
            C1695e eVar2 = this.f5192U;
            boolean z2 = true;
            boolean z3 = eVar2 != null && eVar2.f5191T[0] == 2;
            if (this.f5265u0 == 0) {
                i = fVar.mo5926i(C1693d.C1694a.TOP);
                i2 = fVar.mo5926i(C1693d.C1694a.BOTTOM);
                C1695e eVar3 = this.f5192U;
                if (eVar3 == null || eVar3.f5191T[1] != 2) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f5266v0) {
                C1693d dVar = this.f5264t0;
                if (dVar.f5156c) {
                    C1601j l = eVar.mo5727l(dVar);
                    eVar.mo5720e(l, this.f5264t0.mo5898c());
                    if (this.f5262r0 != -1) {
                        if (z3) {
                            jVar3 = eVar.mo5727l(i2);
                        }
                        this.f5266v0 = false;
                        return;
                    }
                    if (this.f5263s0 != -1 && z3) {
                        C1601j l2 = eVar.mo5727l(i2);
                        eVar.mo5721f(l, eVar.mo5727l(i), 0, 5);
                        jVar3 = l2;
                    }
                    this.f5266v0 = false;
                    return;
                    eVar.mo5721f(jVar3, l, 0, 5);
                    this.f5266v0 = false;
                    return;
                }
            }
            if (this.f5262r0 != -1) {
                jVar = eVar.mo5727l(this.f5264t0);
                eVar.mo5719d(jVar, eVar.mo5727l(i), this.f5262r0, 8);
                if (z3) {
                    jVar2 = eVar.mo5727l(i2);
                } else {
                    return;
                }
            } else if (this.f5263s0 != -1) {
                jVar = eVar.mo5727l(this.f5264t0);
                C1601j l3 = eVar.mo5727l(i2);
                eVar.mo5719d(jVar, l3, -this.f5263s0, 8);
                if (z3) {
                    eVar.mo5721f(jVar, eVar.mo5727l(i), 0, 5);
                    jVar2 = l3;
                } else {
                    return;
                }
            } else if (this.f5261q0 != -1.0f) {
                C1601j l4 = eVar.mo5727l(this.f5264t0);
                C1601j l5 = eVar.mo5727l(i2);
                float f = this.f5261q0;
                C1590c m = eVar.mo5728m();
                m.f4934d.mo5693i(l4, -1.0f);
                m.f4934d.mo5693i(l5, f);
                eVar.mo5718c(m);
                return;
            } else {
                return;
            }
            eVar.mo5721f(jVar2, jVar, 0, 5);
        }
    }

    /* renamed from: e */
    public boolean mo5894e() {
        return true;
    }

    /* renamed from: i */
    public C1693d mo5926i(C1693d.C1694a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f5265u0 == 0) {
                return this.f5264t0;
            }
            return null;
        }
        if (this.f5265u0 == 1) {
            return this.f5264t0;
        }
        return null;
    }
}
