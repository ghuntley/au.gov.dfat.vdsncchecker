package p117t;

import java.util.ArrayList;
import p111s.C1693d;
import p111s.C1695e;
import p111s.C1697g;
import p111s.C1699i;

/* renamed from: t.j */
public class C1757j {
    /* renamed from: a */
    public static C1763p m4894a(C1695e eVar, int i, ArrayList<C1763p> arrayList, C1763p pVar) {
        C1693d dVar;
        int i2;
        int i3 = i == 0 ? eVar.f5227o0 : eVar.f5229p0;
        int i4 = 0;
        if (i3 != -1 && (pVar == null || i3 != pVar.f5394b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C1763p pVar2 = arrayList.get(i5);
                if (pVar2.f5394b == i3) {
                    if (pVar != null) {
                        pVar.mo6042d(i, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if (eVar instanceof C1699i) {
                C1699i iVar = (C1699i) eVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= iVar.f5268r0) {
                        i2 = -1;
                        break;
                    }
                    C1695e eVar2 = iVar.f5267q0[i6];
                    if ((i == 0 && (i2 = eVar2.f5227o0) != -1) || (i == 1 && (i2 = eVar2.f5229p0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i2 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C1763p pVar3 = arrayList.get(i7);
                        if (pVar3.f5394b == i2) {
                            pVar = pVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (pVar == null) {
                pVar = new C1763p(i);
            }
            arrayList.add(pVar);
        }
        if (pVar.mo6039a(eVar)) {
            if (eVar instanceof C1697g) {
                C1697g gVar = (C1697g) eVar;
                C1693d dVar2 = gVar.f5264t0;
                if (gVar.f5265u0 == 0) {
                    i4 = 1;
                }
                dVar2.mo5897b(i4, arrayList, pVar);
            }
            if (i == 0) {
                eVar.f5227o0 = pVar.f5394b;
                eVar.f5180I.mo5897b(i, arrayList, pVar);
                dVar = eVar.f5182K;
            } else {
                eVar.f5229p0 = pVar.f5394b;
                eVar.f5181J.mo5897b(i, arrayList, pVar);
                eVar.f5184M.mo5897b(i, arrayList, pVar);
                dVar = eVar.f5183L;
            }
            dVar.mo5897b(i, arrayList, pVar);
            eVar.f5187P.mo5897b(i, arrayList, pVar);
        }
        return pVar;
    }

    /* renamed from: b */
    public static C1763p m4895b(ArrayList<C1763p> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1763p pVar = arrayList.get(i2);
            if (i == pVar.f5394b) {
                return pVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m4896c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
