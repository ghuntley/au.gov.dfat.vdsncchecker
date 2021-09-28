package p139w3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: w3.j0 */
public final class C2083j0 {

    /* renamed from: a */
    public final C2052a f6057a;

    /* renamed from: b */
    public final Proxy f6058b;

    /* renamed from: c */
    public final InetSocketAddress f6059c;

    public C2083j0(C2052a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C1241e.m3517j(aVar, "address");
        C1241e.m3517j(inetSocketAddress, "socketAddress");
        this.f6057a = aVar;
        this.f6058b = proxy;
        this.f6059c = inetSocketAddress;
    }

    /* renamed from: a */
    public final boolean mo6576a() {
        return this.f6057a.f5894f != null && this.f6058b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2083j0) {
            C2083j0 j0Var = (C2083j0) obj;
            return C1241e.m3513b(j0Var.f6057a, this.f6057a) && C1241e.m3513b(j0Var.f6058b, this.f6058b) && C1241e.m3513b(j0Var.f6059c, this.f6059c);
        }
    }

    public int hashCode() {
        int hashCode = this.f6058b.hashCode();
        return this.f6059c.hashCode() + ((hashCode + ((this.f6057a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Route{");
        a.append(this.f6059c);
        a.append('}');
        return a.toString();
    }
}
