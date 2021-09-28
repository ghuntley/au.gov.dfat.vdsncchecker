package p005a4;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p042g2.C0955a;
import p045h.C0990o;
import p072l2.C1241e;
import p126u2.C1852m;
import p139w3.C2052a;
import p139w3.C2068f;
import p139w3.C2083j0;
import p139w3.C2095s;
import p139w3.C2106x;
import p144x3.C2129c;

/* renamed from: a4.l */
public final class C0028l {

    /* renamed from: a */
    public List<? extends Proxy> f93a;

    /* renamed from: b */
    public int f94b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f95c;

    /* renamed from: d */
    public final List<C2083j0> f96d = new ArrayList();

    /* renamed from: e */
    public final C2052a f97e;

    /* renamed from: f */
    public final C0990o f98f;

    /* renamed from: g */
    public final C2068f f99g;

    /* renamed from: h */
    public final C2095s f100h;

    /* renamed from: a4.l$a */
    public static final class C0029a {

        /* renamed from: a */
        public int f101a;

        /* renamed from: b */
        public final List<C2083j0> f102b;

        public C0029a(List<C2083j0> list) {
            this.f102b = list;
        }

        /* renamed from: a */
        public final boolean mo60a() {
            return this.f101a < this.f102b.size();
        }

        /* renamed from: b */
        public final C2083j0 mo61b() {
            if (mo60a()) {
                List<C2083j0> list = this.f102b;
                int i = this.f101a;
                this.f101a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C0028l(C2052a aVar, C0990o oVar, C2068f fVar, C2095s sVar) {
        List<? extends Proxy> list;
        C1241e.m3517j(aVar, "address");
        C1241e.m3517j(oVar, "routeDatabase");
        C1241e.m3517j(fVar, "call");
        C1241e.m3517j(sVar, "eventListener");
        this.f97e = aVar;
        this.f98f = oVar;
        this.f99g = fVar;
        this.f100h = sVar;
        C1852m mVar = C1852m.f5542e;
        this.f93a = mVar;
        this.f95c = mVar;
        C2106x xVar = aVar.f5889a;
        Proxy proxy = aVar.f5898j;
        C1241e.m3517j(xVar, "url");
        if (proxy != null) {
            list = C0955a.m2747u(proxy);
        } else {
            URI h = xVar.mo6635h();
            if (h.getHost() == null) {
                list = C2129c.m5523k(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f5899k.select(h);
                list = select == null || select.isEmpty() ? C2129c.m5523k(Proxy.NO_PROXY) : C2129c.m5533u(select);
            }
        }
        this.f93a = list;
        this.f94b = 0;
    }

    /* renamed from: a */
    public final boolean mo58a() {
        return mo59b() || (this.f96d.isEmpty() ^ true);
    }

    /* renamed from: b */
    public final boolean mo59b() {
        return this.f94b < this.f93a.size();
    }
}
