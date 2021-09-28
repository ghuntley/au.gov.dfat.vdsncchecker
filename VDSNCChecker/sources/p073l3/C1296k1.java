package p073l3;

import p085n3.C1473n;
import p085n3.C1475p;
import p138w2.C2043d;
import p138w2.C2046f;

/* renamed from: l3.k1 */
public final class C1296k1<T> extends C1473n<T> {

    /* renamed from: g */
    public C2046f f4303g;

    /* renamed from: h */
    public Object f4304h;

    /* renamed from: V */
    public void mo5010V(Object obj) {
        C2046f fVar = this.f4303g;
        if (fVar != null) {
            C1475p.m4156a(fVar, this.f4304h);
            this.f4303g = null;
            this.f4304h = null;
        }
        C1320u.m3716t(obj, (C2043d) null);
        throw null;
    }

    /* renamed from: W */
    public final boolean mo5081W() {
        if (this.f4303g == null) {
            return false;
        }
        this.f4303g = null;
        this.f4304h = null;
        return true;
    }
}
