package p127u3;

import p025d3.C0802f;
import p072l2.C1241e;
import p103q3.C1615c;
import p121t3.C1799a;
import p121t3.C1801b;
import p121t3.C1804e;

/* renamed from: u3.h */
public final class C1868h extends C1858a {

    /* renamed from: e */
    public final C1801b f5560e;

    /* renamed from: f */
    public final int f5561f;

    /* renamed from: g */
    public int f5562g = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1868h(C1799a aVar, C1801b bVar) {
        super(aVar, bVar, (C0802f) null);
        C1241e.m3517j(aVar, "json");
        C1241e.m3517j(bVar, "value");
        this.f5560e = bVar;
        this.f5561f = bVar.size();
    }

    /* renamed from: B */
    public C1804e mo6368B() {
        return this.f5560e;
    }

    /* renamed from: n */
    public int mo5885n(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        int i = this.f5562g;
        if (i >= this.f5561f - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f5562g = i2;
        return i2;
    }

    /* renamed from: w */
    public C1804e mo6369w(String str) {
        C1801b bVar = this.f5560e;
        return bVar.f5451e.get(Integer.parseInt(str));
    }

    /* renamed from: y */
    public String mo6371y(C1615c cVar, int i) {
        return String.valueOf(i);
    }
}
