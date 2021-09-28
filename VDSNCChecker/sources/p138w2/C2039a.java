package p138w2;

import p019c3.C0640p;
import p072l2.C1241e;
import p138w2.C2046f;

/* renamed from: w2.a */
public abstract class C2039a implements C2046f.C2047a {
    private final C2046f.C2049b<?> key;

    public C2039a(C2046f.C2049b<?> bVar) {
        C1241e.m3517j(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r, C0640p<? super R, ? super C2046f.C2047a, ? extends R> pVar) {
        C1241e.m3517j(pVar, "operation");
        return C2046f.C2047a.C2048a.m5382a(this, r, pVar);
    }

    public <E extends C2046f.C2047a> E get(C2046f.C2049b<E> bVar) {
        C1241e.m3517j(bVar, "key");
        return C2046f.C2047a.C2048a.m5383b(this, bVar);
    }

    public C2046f.C2049b<?> getKey() {
        return this.key;
    }

    public C2046f minusKey(C2046f.C2049b<?> bVar) {
        C1241e.m3517j(bVar, "key");
        return C2046f.C2047a.C2048a.m5384c(this, bVar);
    }

    public C2046f plus(C2046f fVar) {
        C1241e.m3517j(fVar, "context");
        return C2046f.C2047a.C2048a.m5385d(this, fVar);
    }
}
