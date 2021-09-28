package p114s2;

import p019c3.C0636l;
import p025d3.C0806j;
import p073l3.C1306o;
import p120t2.C1798k;
import p128u4.C1882b;

/* renamed from: s2.a */
public final class C1710a extends C0806j implements C0636l<Throwable, C1798k> {

    /* renamed from: f */
    public final /* synthetic */ C1306o<C1713d<Object, Object>> f5281f;

    /* renamed from: g */
    public final /* synthetic */ C1882b<Object> f5282g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1710a(C1306o<C1713d<Object, Object>> oVar, C1882b<Object> bVar) {
        super(1);
        this.f5281f = oVar;
        this.f5282g = bVar;
    }

    /* renamed from: m */
    public Object mo2828m(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.f5281f.isCancelled()) {
            this.f5282g.cancel();
        }
        return C1798k.f5446a;
    }
}
