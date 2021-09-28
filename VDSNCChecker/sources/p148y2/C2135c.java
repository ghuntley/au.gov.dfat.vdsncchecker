package p148y2;

import p072l2.C1241e;
import p138w2.C2043d;
import p138w2.C2044e;
import p138w2.C2046f;

/* renamed from: y2.c */
public abstract class C2135c extends C2133a {

    /* renamed from: f */
    public transient C2043d<Object> f6185f;

    /* renamed from: g */
    public final C2046f f6186g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2135c(C2043d<Object> dVar) {
        super(dVar);
        C2046f d = dVar != null ? dVar.mo5012d() : null;
        this.f6186g = d;
    }

    public C2135c(C2043d<Object> dVar, C2046f fVar) {
        super(dVar);
        this.f6186g = fVar;
    }

    /* renamed from: d */
    public C2046f mo5012d() {
        C2046f fVar = this.f6186g;
        C1241e.m3515e(fVar);
        return fVar;
    }

    /* renamed from: h */
    public void mo6672h() {
        C2043d<Object> dVar = this.f6185f;
        if (!(dVar == null || dVar == this)) {
            C2046f fVar = this.f6186g;
            C1241e.m3515e(fVar);
            int i = C2044e.f5885d;
            C2046f.C2047a aVar = fVar.get(C2044e.C2045a.f5886e);
            C1241e.m3515e(aVar);
            ((C2044e) aVar).mo5119h(dVar);
        }
        this.f6185f = C2134b.f6184e;
    }
}
