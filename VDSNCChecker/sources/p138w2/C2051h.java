package p138w2;

import java.io.Serializable;
import p019c3.C0640p;
import p072l2.C1241e;
import p138w2.C2046f;

/* renamed from: w2.h */
public final class C2051h implements C2046f, Serializable {

    /* renamed from: e */
    public static final C2051h f5888e = new C2051h();

    public <R> R fold(R r, C0640p<? super R, ? super C2046f.C2047a, ? extends R> pVar) {
        C1241e.m3517j(pVar, "operation");
        return r;
    }

    public <E extends C2046f.C2047a> E get(C2046f.C2049b<E> bVar) {
        C1241e.m3517j(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C2046f minusKey(C2046f.C2049b<?> bVar) {
        C1241e.m3517j(bVar, "key");
        return this;
    }

    public C2046f plus(C2046f fVar) {
        C1241e.m3517j(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
