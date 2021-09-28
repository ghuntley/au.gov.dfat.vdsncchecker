package p148y2;

import p138w2.C2043d;
import p138w2.C2046f;
import p138w2.C2051h;

/* renamed from: y2.g */
public abstract class C2140g extends C2133a {
    public C2140g(C2043d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.mo5012d() == C2051h.f5888e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: d */
    public C2046f mo5012d() {
        return C2051h.f5888e;
    }
}
