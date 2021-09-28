package p111s;

import p000a.C0001b;
import p063k.C1142f;
import p099q.C1589b;
import p099q.C1590c;
import p099q.C1593e;
import p099q.C1601j;
import p111s.C1693d;

/* renamed from: s.a */
public class C1690a extends C1699i {

    /* renamed from: s0 */
    public int f5130s0 = 0;

    /* renamed from: t0 */
    public boolean f5131t0 = true;

    /* renamed from: u0 */
    public int f5132u0 = 0;

    /* renamed from: v0 */
    public boolean f5133v0 = false;

    /* renamed from: A */
    public boolean mo5889A() {
        return this.f5133v0;
    }

    /* renamed from: B */
    public boolean mo5890B() {
        return this.f5133v0;
    }

    /* renamed from: R */
    public boolean mo5891R() {
        int i;
        C1693d i2;
        C1693d i3;
        C1693d i4;
        int i5;
        int i6;
        C1693d.C1694a aVar = C1693d.C1694a.BOTTOM;
        C1693d.C1694a aVar2 = C1693d.C1694a.TOP;
        C1693d.C1694a aVar3 = C1693d.C1694a.RIGHT;
        C1693d.C1694a aVar4 = C1693d.C1694a.LEFT;
        int i7 = 0;
        boolean z = true;
        while (true) {
            i = this.f5268r0;
            if (i7 >= i) {
                break;
            }
            C1695e eVar = this.f5267q0[i7];
            if ((this.f5131t0 || eVar.mo5894e()) && ((((i5 = this.f5130s0) == 0 || i5 == 1) && !eVar.mo5889A()) || (((i6 = this.f5130s0) == 2 || i6 == 3) && !eVar.mo5890B()))) {
                z = false;
            }
            i7++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z2 = false;
        for (int i9 = 0; i9 < this.f5268r0; i9++) {
            C1695e eVar2 = this.f5267q0[i9];
            if (this.f5131t0 || eVar2.mo5894e()) {
                if (!z2) {
                    int i10 = this.f5130s0;
                    if (i10 == 0) {
                        i4 = eVar2.mo5926i(aVar4);
                    } else if (i10 == 1) {
                        i4 = eVar2.mo5926i(aVar3);
                    } else if (i10 == 2) {
                        i4 = eVar2.mo5926i(aVar2);
                    } else {
                        if (i10 == 3) {
                            i4 = eVar2.mo5926i(aVar);
                        }
                        z2 = true;
                    }
                    i8 = i4.mo5898c();
                    z2 = true;
                }
                int i11 = this.f5130s0;
                if (i11 == 0) {
                    i3 = eVar2.mo5926i(aVar4);
                } else {
                    if (i11 == 1) {
                        i2 = eVar2.mo5926i(aVar3);
                    } else if (i11 == 2) {
                        i3 = eVar2.mo5926i(aVar2);
                    } else if (i11 == 3) {
                        i2 = eVar2.mo5926i(aVar);
                    }
                    i8 = Math.max(i8, i2.mo5898c());
                }
                i8 = Math.min(i8, i3.mo5898c());
            }
        }
        int i12 = i8 + this.f5132u0;
        int i13 = this.f5130s0;
        if (i13 == 0 || i13 == 1) {
            mo5911G(i12, i12);
        } else {
            mo5912H(i12, i12);
        }
        this.f5133v0 = true;
        return true;
    }

    /* renamed from: S */
    public int mo5892S() {
        int i = this.f5130s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: d */
    public void mo5893d(C1593e eVar, boolean z) {
        C1693d[] dVarArr;
        boolean z2;
        C1601j jVar;
        C1693d dVar;
        int i;
        int i2;
        int i3;
        C1601j jVar2;
        int i4;
        C1693d[] dVarArr2 = this.f5188Q;
        dVarArr2[0] = this.f5180I;
        dVarArr2[2] = this.f5181J;
        dVarArr2[1] = this.f5182K;
        dVarArr2[3] = this.f5183L;
        int i5 = 0;
        while (true) {
            dVarArr = this.f5188Q;
            if (i5 >= dVarArr.length) {
                break;
            }
            dVarArr[i5].f5162i = eVar.mo5727l(dVarArr[i5]);
            i5++;
        }
        int i6 = this.f5130s0;
        if (i6 >= 0 && i6 < 4) {
            C1693d dVar2 = dVarArr[i6];
            if (!this.f5133v0) {
                mo5891R();
            }
            if (this.f5133v0) {
                this.f5133v0 = false;
                int i7 = this.f5130s0;
                if (i7 == 0 || i7 == 1) {
                    eVar.mo5720e(this.f5180I.f5162i, this.f5197Z);
                    jVar2 = this.f5182K.f5162i;
                    i4 = this.f5197Z;
                } else if (i7 == 2 || i7 == 3) {
                    eVar.mo5720e(this.f5181J.f5162i, this.f5199a0);
                    jVar2 = this.f5183L.f5162i;
                    i4 = this.f5199a0;
                } else {
                    return;
                }
                eVar.mo5720e(jVar2, i4);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.f5268r0) {
                    z2 = false;
                    break;
                }
                C1695e eVar2 = this.f5267q0[i8];
                if ((this.f5131t0 || eVar2.mo5894e()) && ((((i2 = this.f5130s0) == 0 || i2 == 1) && eVar2.mo5930m() == 3 && eVar2.f5180I.f5159f != null && eVar2.f5182K.f5159f != null) || (((i3 = this.f5130s0) == 2 || i3 == 3) && eVar2.mo5934q() == 3 && eVar2.f5181J.f5159f != null && eVar2.f5183L.f5159f != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            z2 = true;
            boolean z3 = this.f5180I.mo5900e() || this.f5182K.mo5900e();
            boolean z4 = this.f5181J.mo5900e() || this.f5183L.mo5900e();
            boolean z5 = !z2 && (((i = this.f5130s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.f5268r0; i10++) {
                C1695e eVar3 = this.f5267q0[i10];
                if (this.f5131t0 || eVar3.mo5894e()) {
                    C1601j l = eVar.mo5727l(eVar3.f5188Q[this.f5130s0]);
                    C1693d[] dVarArr3 = eVar3.f5188Q;
                    int i11 = this.f5130s0;
                    dVarArr3[i11].f5162i = l;
                    int i12 = (dVarArr3[i11].f5159f == null || dVarArr3[i11].f5159f.f5157d != this) ? 0 : dVarArr3[i11].f5160g + 0;
                    if (i11 == 0 || i11 == 2) {
                        C1590c m = eVar.mo5728m();
                        C1601j n = eVar.mo5729n();
                        n.f4971h = 0;
                        m.mo5703f(dVar2.f5162i, l, n, this.f5132u0 - i12);
                        eVar.mo5718c(m);
                    } else {
                        C1590c m2 = eVar.mo5728m();
                        C1601j n2 = eVar.mo5729n();
                        n2.f4971h = 0;
                        m2.mo5702e(dVar2.f5162i, l, n2, this.f5132u0 + i12);
                        eVar.mo5718c(m2);
                    }
                    eVar.mo5719d(dVar2.f5162i, l, this.f5132u0 + i12, i9);
                }
            }
            int i13 = this.f5130s0;
            if (i13 == 0) {
                eVar.mo5719d(this.f5182K.f5162i, this.f5180I.f5162i, 0, 8);
                eVar.mo5719d(this.f5180I.f5162i, this.f5192U.f5182K.f5162i, 0, 4);
                jVar = this.f5180I.f5162i;
                dVar = this.f5192U.f5180I;
            } else if (i13 == 1) {
                eVar.mo5719d(this.f5180I.f5162i, this.f5182K.f5162i, 0, 8);
                eVar.mo5719d(this.f5180I.f5162i, this.f5192U.f5180I.f5162i, 0, 4);
                jVar = this.f5180I.f5162i;
                dVar = this.f5192U.f5182K;
            } else if (i13 == 2) {
                eVar.mo5719d(this.f5183L.f5162i, this.f5181J.f5162i, 0, 8);
                eVar.mo5719d(this.f5181J.f5162i, this.f5192U.f5183L.f5162i, 0, 4);
                jVar = this.f5181J.f5162i;
                dVar = this.f5192U.f5181J;
            } else if (i13 == 3) {
                eVar.mo5719d(this.f5181J.f5162i, this.f5183L.f5162i, 0, 8);
                eVar.mo5719d(this.f5181J.f5162i, this.f5192U.f5181J.f5162i, 0, 4);
                jVar = this.f5181J.f5162i;
                dVar = this.f5192U.f5183L;
            } else {
                return;
            }
            eVar.mo5719d(jVar, dVar.f5162i, 0, 0);
        }
    }

    /* renamed from: e */
    public boolean mo5894e() {
        return true;
    }

    public String toString() {
        String a = C1589b.m4444a(C0001b.m0a("[Barrier] "), this.f5215i0, " {");
        for (int i = 0; i < this.f5268r0; i++) {
            C1695e eVar = this.f5267q0[i];
            if (i > 0) {
                a = C1142f.m3365a(a, ", ");
            }
            StringBuilder a2 = C0001b.m0a(a);
            a2.append(eVar.f5215i0);
            a = a2.toString();
        }
        return C1142f.m3365a(a, "}");
    }
}
