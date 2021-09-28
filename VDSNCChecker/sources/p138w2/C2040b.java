package p138w2;

import p019c3.C0636l;
import p072l2.C1241e;
import p138w2.C2046f;
import p138w2.C2046f.C2047a;

/* renamed from: w2.b */
public abstract class C2040b<B extends C2046f.C2047a, E extends B> implements C2046f.C2049b<E> {

    /* renamed from: e */
    public final C2046f.C2049b<?> f5880e;

    /* renamed from: f */
    public final C0636l<C2046f.C2047a, E> f5881f;

    public C2040b(C2046f.C2049b<B> bVar, C0636l<? super C2046f.C2047a, ? extends E> lVar) {
        C1241e.m3517j(bVar, "baseKey");
        this.f5881f = lVar;
        this.f5880e = bVar instanceof C2040b ? ((C2040b) bVar).f5880e : bVar;
    }

    /* renamed from: a */
    public final E mo6525a(C2046f.C2047a aVar) {
        return (C2046f.C2047a) this.f5881f.mo2828m(aVar);
    }
}
