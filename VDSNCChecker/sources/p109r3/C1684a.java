package p109r3;

import java.util.Objects;
import p072l2.C1241e;
import p097p3.C1579a;
import p103q3.C1615c;
import p115s3.C1739m;
import p115s3.C1742p;
import p127u3.C1871k;

/* renamed from: r3.a */
public abstract class C1684a implements C1687c, C1685b {
    /* renamed from: b */
    public final <T> T mo5874b(C1615c cVar, int i, C1579a<T> aVar, T t) {
        C1241e.m3517j(cVar, "descriptor");
        C1241e.m3517j(aVar, "deserializer");
        return mo5875c(aVar);
    }

    /* renamed from: c */
    public abstract <T> T mo5875c(C1579a<T> aVar);

    /* renamed from: d */
    public abstract long mo5876d();

    /* renamed from: f */
    public final <T> T mo5877f(C1615c cVar, int i, C1579a<T> aVar, T t) {
        C1241e.m3517j(cVar, "descriptor");
        C1739m mVar = (C1739m) C1742p.f5335b;
        Objects.requireNonNull(mVar);
        C1615c.C1616a.m4533b(mVar);
        if (((C1871k) this).f5571c.mo6390p()) {
            return mo5875c(aVar);
        }
        return null;
    }

    /* renamed from: g */
    public int mo5878g(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        return -1;
    }

    /* renamed from: k */
    public final String mo5879k(C1615c cVar, int i) {
        C1241e.m3517j(cVar, "descriptor");
        return mo5881p();
    }

    /* renamed from: o */
    public boolean mo5880o() {
        return false;
    }

    /* renamed from: p */
    public abstract String mo5881p();

    /* renamed from: q */
    public final long mo5882q(C1615c cVar, int i) {
        C1241e.m3517j(cVar, "descriptor");
        return mo5876d();
    }
}
