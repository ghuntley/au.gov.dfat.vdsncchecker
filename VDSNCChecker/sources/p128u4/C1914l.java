package p128u4;

import p019c3.C0636l;
import p025d3.C0806j;
import p120t2.C1798k;

/* renamed from: u4.l */
public final class C1914l extends C0806j implements C0636l<Throwable, C1798k> {

    /* renamed from: f */
    public final /* synthetic */ C1882b f5637f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1914l(C1882b bVar) {
        super(1);
        this.f5637f = bVar;
    }

    /* renamed from: m */
    public Object mo2828m(Object obj) {
        Throwable th = (Throwable) obj;
        this.f5637f.cancel();
        return C1798k.f5446a;
    }
}
