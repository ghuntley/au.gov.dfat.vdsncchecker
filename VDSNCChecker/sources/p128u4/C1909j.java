package p128u4;

import javax.annotation.Nullable;
import p042g2.C0955a;
import p073l3.C1277f;
import p138w2.C2043d;
import p139w3.C2068f;
import p139w3.C2079i0;

/* renamed from: u4.j */
public abstract class C1909j<ResponseT, ReturnT> extends C1888d0<ReturnT> {

    /* renamed from: a */
    public final C1953z f5629a;

    /* renamed from: b */
    public final C2068f.C2069a f5630b;

    /* renamed from: c */
    public final C1896f<C2079i0, ResponseT> f5631c;

    /* renamed from: u4.j$a */
    public static final class C1910a<ResponseT, ReturnT> extends C1909j<ResponseT, ReturnT> {

        /* renamed from: d */
        public final C1884c<ResponseT, ReturnT> f5632d;

        public C1910a(C1953z zVar, C2068f.C2069a aVar, C1896f<C2079i0, ResponseT> fVar, C1884c<ResponseT, ReturnT> cVar) {
            super(zVar, aVar, fVar);
            this.f5632d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [u4.b, u4.b<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo6430c(p128u4.C1882b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                u4.c<ResponseT, ReturnT> r2 = r0.f5632d
                java.lang.Object r1 = r2.mo5964b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p128u4.C1909j.C1910a.mo6430c(u4.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: u4.j$b */
    public static final class C1911b<ResponseT> extends C1909j<ResponseT, Object> {

        /* renamed from: d */
        public final C1884c<ResponseT, C1882b<ResponseT>> f5633d;

        public C1911b(C1953z zVar, C2068f.C2069a aVar, C1896f<C2079i0, ResponseT> fVar, C1884c<ResponseT, C1882b<ResponseT>> cVar, boolean z) {
            super(zVar, aVar, fVar);
            this.f5633d = cVar;
        }

        /* renamed from: c */
        public Object mo6430c(C1882b<ResponseT> bVar, Object[] objArr) {
            C1882b bVar2 = (C1882b) this.f5633d.mo5964b(bVar);
            C2043d dVar = objArr[objArr.length - 1];
            try {
                C1277f fVar = new C1277f(C0955a.m2743q(dVar), 1);
                fVar.mo5049r(new C1914l(bVar2));
                bVar2.mo5983i(new C1915m(fVar));
                return fVar.mo5048q();
            } catch (Exception e) {
                return C1918p.m5208a(e, dVar);
            }
        }
    }

    /* renamed from: u4.j$c */
    public static final class C1912c<ResponseT> extends C1909j<ResponseT, Object> {

        /* renamed from: d */
        public final C1884c<ResponseT, C1882b<ResponseT>> f5634d;

        public C1912c(C1953z zVar, C2068f.C2069a aVar, C1896f<C2079i0, ResponseT> fVar, C1884c<ResponseT, C1882b<ResponseT>> cVar) {
            super(zVar, aVar, fVar);
            this.f5634d = cVar;
        }

        /* renamed from: c */
        public Object mo6430c(C1882b<ResponseT> bVar, Object[] objArr) {
            C1882b bVar2 = (C1882b) this.f5634d.mo5964b(bVar);
            C2043d dVar = objArr[objArr.length - 1];
            try {
                C1277f fVar = new C1277f(C0955a.m2743q(dVar), 1);
                fVar.mo5049r(new C1916n(bVar2));
                bVar2.mo5983i(new C1917o(fVar));
                return fVar.mo5048q();
            } catch (Exception e) {
                return C1918p.m5208a(e, dVar);
            }
        }
    }

    public C1909j(C1953z zVar, C2068f.C2069a aVar, C1896f<C2079i0, ResponseT> fVar) {
        this.f5629a = zVar;
        this.f5630b = aVar;
        this.f5631c = fVar;
    }

    @Nullable
    /* renamed from: a */
    public final ReturnT mo6407a(Object[] objArr) {
        return mo6430c(new C1921q(this.f5629a, objArr, this.f5630b, this.f5631c), objArr);
    }

    @Nullable
    /* renamed from: c */
    public abstract ReturnT mo6430c(C1882b<ResponseT> bVar, Object[] objArr);
}
