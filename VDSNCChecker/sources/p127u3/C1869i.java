package p127u3;

import java.util.List;
import p072l2.C1241e;
import p103q3.C1615c;
import p121t3.C1799a;
import p121t3.C1804e;
import p121t3.C1805f;
import p121t3.C1808i;
import p126u2.C1850k;
import p126u2.C1857r;

/* renamed from: u3.i */
public final class C1869i extends C1866g {

    /* renamed from: i */
    public final C1808i f5563i;

    /* renamed from: j */
    public final List<String> f5564j;

    /* renamed from: k */
    public final int f5565k;

    /* renamed from: l */
    public int f5566l = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1869i(C1799a aVar, C1808i iVar) {
        super(aVar, iVar, (String) null, (C1615c) null, 12);
        C1241e.m3517j(aVar, "json");
        C1241e.m3517j(iVar, "value");
        this.f5563i = iVar;
        List<String> P = C1850k.m5054P(iVar.keySet());
        this.f5564j = P;
        this.f5565k = P.size() * 2;
    }

    /* renamed from: B */
    public C1804e mo6368B() {
        return this.f5563i;
    }

    /* renamed from: C */
    public C1808i mo6393C() {
        return this.f5563i;
    }

    /* renamed from: l */
    public void mo5884l(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
    }

    /* renamed from: n */
    public int mo5885n(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        int i = this.f5566l;
        if (i >= this.f5565k - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f5566l = i2;
        return i2;
    }

    /* renamed from: w */
    public C1804e mo6369w(String str) {
        C1241e.m3517j(str, "tag");
        if (this.f5566l % 2 == 0) {
            return new C1805f(str, true);
        }
        return (C1804e) C1857r.m5060H(this.f5563i, str);
    }

    /* renamed from: y */
    public String mo6371y(C1615c cVar, int i) {
        return this.f5564j.get(i / 2);
    }
}
