package p111s;

import p099q.C1593e;

/* renamed from: s.j */
public class C1700j {

    /* renamed from: a */
    public static boolean[] f5269a = new boolean[3];

    /* renamed from: a */
    public static void m4763a(C1696f fVar, C1593e eVar, C1695e eVar2) {
        eVar2.f5224n = -1;
        eVar2.f5226o = -1;
        if (fVar.f5191T[0] != 2 && eVar2.f5191T[0] == 4) {
            int i = eVar2.f5180I.f5160g;
            int r = fVar.mo5935r() - eVar2.f5182K.f5160g;
            C1693d dVar = eVar2.f5180I;
            dVar.f5162i = eVar.mo5727l(dVar);
            C1693d dVar2 = eVar2.f5182K;
            dVar2.f5162i = eVar.mo5727l(dVar2);
            eVar.mo5720e(eVar2.f5180I.f5162i, i);
            eVar.mo5720e(eVar2.f5182K.f5162i, r);
            eVar2.f5224n = 2;
            eVar2.f5197Z = i;
            int i2 = r - i;
            eVar2.f5193V = i2;
            int i3 = eVar2.f5203c0;
            if (i2 < i3) {
                eVar2.f5193V = i3;
            }
        }
        if (fVar.f5191T[1] != 2 && eVar2.f5191T[1] == 4) {
            int i4 = eVar2.f5181J.f5160g;
            int l = fVar.mo5929l() - eVar2.f5183L.f5160g;
            C1693d dVar3 = eVar2.f5181J;
            dVar3.f5162i = eVar.mo5727l(dVar3);
            C1693d dVar4 = eVar2.f5183L;
            dVar4.f5162i = eVar.mo5727l(dVar4);
            eVar.mo5720e(eVar2.f5181J.f5162i, i4);
            eVar.mo5720e(eVar2.f5183L.f5162i, l);
            if (eVar2.f5201b0 > 0 || eVar2.f5213h0 == 8) {
                C1693d dVar5 = eVar2.f5184M;
                dVar5.f5162i = eVar.mo5727l(dVar5);
                eVar.mo5720e(eVar2.f5184M.f5162i, eVar2.f5201b0 + i4);
            }
            eVar2.f5226o = 2;
            eVar2.f5199a0 = i4;
            int i5 = l - i4;
            eVar2.f5194W = i5;
            int i6 = eVar2.f5205d0;
            if (i5 < i6) {
                eVar2.f5194W = i6;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m4764b(int i, int i2) {
        return (i & i2) == i2;
    }
}
