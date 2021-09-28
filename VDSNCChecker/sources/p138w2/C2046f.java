package p138w2;

import p019c3.C0640p;
import p072l2.C1241e;

/* renamed from: w2.f */
public interface C2046f {

    /* renamed from: w2.f$a */
    public interface C2047a extends C2046f {

        /* renamed from: w2.f$a$a */
        public static final class C2048a {
            /* renamed from: a */
            public static <R> R m5382a(C2047a aVar, R r, C0640p<? super R, ? super C2047a, ? extends R> pVar) {
                C1241e.m3517j(pVar, "operation");
                return pVar.mo2829k(r, aVar);
            }

            /* renamed from: b */
            public static <E extends C2047a> E m5383b(C2047a aVar, C2049b<E> bVar) {
                C1241e.m3517j(bVar, "key");
                if (C1241e.m3513b(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            /* renamed from: c */
            public static C2046f m5384c(C2047a aVar, C2049b<?> bVar) {
                C1241e.m3517j(bVar, "key");
                return C1241e.m3513b(aVar.getKey(), bVar) ? C2051h.f5888e : aVar;
            }

            /* renamed from: d */
            public static C2046f m5385d(C2047a aVar, C2046f fVar) {
                C1241e.m3517j(fVar, "context");
                return fVar == C2051h.f5888e ? aVar : (C2046f) fVar.fold(aVar, C2050g.f5887f);
            }
        }

        <E extends C2047a> E get(C2049b<E> bVar);

        C2049b<?> getKey();
    }

    /* renamed from: w2.f$b */
    public interface C2049b<E extends C2047a> {
    }

    <R> R fold(R r, C0640p<? super R, ? super C2047a, ? extends R> pVar);

    <E extends C2047a> E get(C2049b<E> bVar);

    C2046f minusKey(C2049b<?> bVar);

    C2046f plus(C2046f fVar);
}
