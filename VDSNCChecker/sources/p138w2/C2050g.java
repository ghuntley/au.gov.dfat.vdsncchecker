package p138w2;

import p019c3.C0640p;
import p025d3.C0806j;
import p072l2.C1241e;
import p138w2.C2044e;
import p138w2.C2046f;

/* renamed from: w2.g */
public final class C2050g extends C0806j implements C0640p<C2046f, C2046f.C2047a, C2046f> {

    /* renamed from: f */
    public static final C2050g f5887f = new C2050g();

    public C2050g() {
        super(2);
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        C2041c cVar;
        C2046f fVar = (C2046f) obj;
        C2046f.C2047a aVar = (C2046f.C2047a) obj2;
        C1241e.m3517j(fVar, "acc");
        C1241e.m3517j(aVar, "element");
        C2046f minusKey = fVar.minusKey(aVar.getKey());
        C2051h hVar = C2051h.f5888e;
        if (minusKey == hVar) {
            return aVar;
        }
        int i = C2044e.f5885d;
        C2044e.C2045a aVar2 = C2044e.C2045a.f5886e;
        C2044e eVar = (C2044e) minusKey.get(aVar2);
        if (eVar == null) {
            cVar = new C2041c(minusKey, aVar);
        } else {
            C2046f minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == hVar) {
                return new C2041c(aVar, eVar);
            }
            cVar = new C2041c(new C2041c(minusKey2, aVar), eVar);
        }
        return cVar;
    }
}
