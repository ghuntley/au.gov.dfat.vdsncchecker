package p061j3;

import java.util.Iterator;
import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: j3.g */
public class C1099g extends C0955a {
    /* renamed from: H */
    public static final <T> C1096d<T> m3120H(Iterator<? extends T> it) {
        C1241e.m3517j(it, "$this$asSequence");
        C1098f fVar = new C1098f(it);
        C1241e.m3517j(fVar, "$this$constrainOnce");
        return fVar instanceof C1092a ? fVar : new C1092a(fVar);
    }
}
