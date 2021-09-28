package p139w3;

import androidx.appcompat.widget.C0131a0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p000a.C0001b;
import p063k.C1142f;
import p067k3.C1205h;
import p072l2.C1241e;
import p073l3.C1320u;
import p139w3.C2106x;
import p144x3.C2129c;

/* renamed from: w3.a */
public final class C2052a {

    /* renamed from: a */
    public final C2106x f5889a;

    /* renamed from: b */
    public final List<C2061c0> f5890b;

    /* renamed from: c */
    public final List<C2087l> f5891c;

    /* renamed from: d */
    public final C2094r f5892d;

    /* renamed from: e */
    public final SocketFactory f5893e;

    /* renamed from: f */
    public final SSLSocketFactory f5894f;

    /* renamed from: g */
    public final HostnameVerifier f5895g;

    /* renamed from: h */
    public final C2074h f5896h;

    /* renamed from: i */
    public final C2060c f5897i;

    /* renamed from: j */
    public final Proxy f5898j = null;

    /* renamed from: k */
    public final ProxySelector f5899k;

    public C2052a(String str, int i, C2094r rVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2074h hVar, C2060c cVar, Proxy proxy, List<? extends C2061c0> list, List<C2087l> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C2060c cVar2 = cVar;
        ProxySelector proxySelector2 = proxySelector;
        C1241e.m3517j(str, "uriHost");
        C1241e.m3517j(rVar, "dns");
        C1241e.m3517j(socketFactory2, "socketFactory");
        C1241e.m3517j(cVar2, "proxyAuthenticator");
        C1241e.m3517j(list, "protocols");
        C1241e.m3517j(list2, "connectionSpecs");
        C1241e.m3517j(proxySelector2, "proxySelector");
        this.f5892d = rVar;
        this.f5893e = socketFactory2;
        this.f5894f = sSLSocketFactory2;
        this.f5895g = hostnameVerifier;
        this.f5896h = hVar;
        this.f5897i = cVar2;
        this.f5899k = proxySelector2;
        C2106x.C2107a aVar = new C2106x.C2107a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        boolean z = true;
        if (C1205h.m3427K(str4, "http", true)) {
            str3 = "http";
        } else if (!C1205h.m3427K(str4, str3, true)) {
            throw new IllegalArgumentException(C1142f.m3365a("unexpected scheme: ", str4));
        }
        aVar.f6126a = str3;
        String A = C1320u.m3694A(C2106x.C2108b.m5497d(C2106x.f6115l, str, 0, 0, false, 7));
        if (A != null) {
            aVar.f6129d = A;
            if ((1 > i2 || 65535 < i2) ? false : z) {
                aVar.f6130e = i2;
                this.f5889a = aVar.mo6638a();
                this.f5890b = C2129c.m5533u(list);
                this.f5891c = C2129c.m5533u(list2);
                return;
            }
            throw new IllegalArgumentException(C0131a0.m344a("unexpected port: ", i).toString());
        }
        throw new IllegalArgumentException(C1142f.m3365a("unexpected host: ", str));
    }

    /* renamed from: a */
    public final boolean mo6532a(C2052a aVar) {
        C1241e.m3517j(aVar, "that");
        return C1241e.m3513b(this.f5892d, aVar.f5892d) && C1241e.m3513b(this.f5897i, aVar.f5897i) && C1241e.m3513b(this.f5890b, aVar.f5890b) && C1241e.m3513b(this.f5891c, aVar.f5891c) && C1241e.m3513b(this.f5899k, aVar.f5899k) && C1241e.m3513b(this.f5898j, aVar.f5898j) && C1241e.m3513b(this.f5894f, aVar.f5894f) && C1241e.m3513b(this.f5895g, aVar.f5895g) && C1241e.m3513b(this.f5896h, aVar.f5896h) && this.f5889a.f6121f == aVar.f5889a.f6121f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2052a) {
            C2052a aVar = (C2052a) obj;
            return C1241e.m3513b(this.f5889a, aVar.f5889a) && mo6532a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.f5892d.hashCode();
        int hashCode2 = this.f5897i.hashCode();
        int hashCode3 = this.f5890b.hashCode();
        int hashCode4 = this.f5891c.hashCode();
        int hashCode5 = this.f5899k.hashCode();
        int hashCode6 = Objects.hashCode(this.f5898j);
        int hashCode7 = Objects.hashCode(this.f5894f);
        int hashCode8 = Objects.hashCode(this.f5895g);
        return Objects.hashCode(this.f5896h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f5889a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder a = C0001b.m0a("Address{");
        a.append(this.f5889a.f6120e);
        a.append(':');
        a.append(this.f5889a.f6121f);
        a.append(", ");
        if (this.f5898j != null) {
            sb = C0001b.m0a("proxy=");
            obj = this.f5898j;
        } else {
            sb = C0001b.m0a("proxySelector=");
            obj = this.f5899k;
        }
        sb.append(obj);
        a.append(sb.toString());
        a.append("}");
        return a.toString();
    }
}
