package p073l3;

import p000a.C0001b;
import p019c3.C0636l;
import p072l2.C1241e;
import p120t2.C1798k;

/* renamed from: l3.s */
public final class C1314s {

    /* renamed from: a */
    public final Object f4325a;

    /* renamed from: b */
    public final C0636l<Throwable, C1798k> f4326b;

    public C1314s(Object obj, C0636l<? super Throwable, C1798k> lVar) {
        this.f4325a = obj;
        this.f4326b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1314s)) {
            return false;
        }
        C1314s sVar = (C1314s) obj;
        return C1241e.m3513b(this.f4325a, sVar.f4325a) && C1241e.m3513b(this.f4326b, sVar.f4326b);
    }

    public int hashCode() {
        Object obj = this.f4325a;
        return this.f4326b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("CompletedWithCancellation(result=");
        a.append(this.f4325a);
        a.append(", onCancellation=");
        a.append(this.f4326b);
        a.append(')');
        return a.toString();
    }
}
