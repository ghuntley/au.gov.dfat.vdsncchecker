package p073l3;

import java.util.Objects;
import p000a.C0001b;
import p019c3.C0636l;
import p072l2.C1241e;
import p120t2.C1798k;

/* renamed from: l3.q */
public final class C1310q {

    /* renamed from: a */
    public final Object f4315a;

    /* renamed from: b */
    public final C1271d f4316b;

    /* renamed from: c */
    public final C0636l<Throwable, C1798k> f4317c;

    /* renamed from: d */
    public final Object f4318d;

    /* renamed from: e */
    public final Throwable f4319e;

    public C1310q(Object obj, C1271d dVar, C0636l<? super Throwable, C1798k> lVar, Object obj2, Throwable th) {
        this.f4315a = obj;
        this.f4316b = dVar;
        this.f4317c = lVar;
        this.f4318d = obj2;
        this.f4319e = th;
    }

    public C1310q(Object obj, C1271d dVar, C0636l<Throwable, C1798k> lVar, Object obj2, Throwable th, int i) {
        dVar = (i & 2) != 0 ? null : dVar;
        lVar = (i & 4) != 0 ? null : lVar;
        obj2 = (i & 8) != 0 ? null : obj2;
        th = (i & 16) != 0 ? null : th;
        this.f4315a = obj;
        this.f4316b = dVar;
        this.f4317c = lVar;
        this.f4318d = obj2;
        this.f4319e = th;
    }

    /* renamed from: a */
    public static C1310q m3678a(C1310q qVar, Object obj, C1271d dVar, C0636l lVar, Object obj2, Throwable th, int i) {
        Object obj3 = null;
        Object obj4 = (i & 1) != 0 ? qVar.f4315a : null;
        if ((i & 2) != 0) {
            dVar = qVar.f4316b;
        }
        C1271d dVar2 = dVar;
        C0636l<Throwable, C1798k> lVar2 = (i & 4) != 0 ? qVar.f4317c : null;
        if ((i & 8) != 0) {
            obj3 = qVar.f4318d;
        }
        Object obj5 = obj3;
        if ((i & 16) != 0) {
            th = qVar.f4319e;
        }
        Objects.requireNonNull(qVar);
        return new C1310q(obj4, dVar2, lVar2, obj5, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1310q)) {
            return false;
        }
        C1310q qVar = (C1310q) obj;
        return C1241e.m3513b(this.f4315a, qVar.f4315a) && C1241e.m3513b(this.f4316b, qVar.f4316b) && C1241e.m3513b(this.f4317c, qVar.f4317c) && C1241e.m3513b(this.f4318d, qVar.f4318d) && C1241e.m3513b(this.f4319e, qVar.f4319e);
    }

    public int hashCode() {
        Object obj = this.f4315a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C1271d dVar = this.f4316b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0636l<Throwable, C1798k> lVar = this.f4317c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f4318d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4319e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("CompletedContinuation(result=");
        a.append(this.f4315a);
        a.append(", cancelHandler=");
        a.append(this.f4316b);
        a.append(", onCancellation=");
        a.append(this.f4317c);
        a.append(", idempotentResume=");
        a.append(this.f4318d);
        a.append(", cancelCause=");
        a.append(this.f4319e);
        a.append(')');
        return a.toString();
    }
}
