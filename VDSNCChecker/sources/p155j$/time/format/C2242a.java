package p155j$.time.format;

import p155j$.time.ZoneId;
import p155j$.time.ZoneOffset;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2301q;
import p155j$.time.temporal.C2308x;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.format.a */
public final /* synthetic */ class C2242a implements C2309y {

    /* renamed from: a */
    public static final /* synthetic */ C2242a f6415a = new C2242a();

    private /* synthetic */ C2242a() {
    }

    /* renamed from: a */
    public final Object mo6895a(C2296l lVar) {
        int i = C2248g.f6420i;
        int i2 = C2308x.f6561a;
        ZoneId zoneId = (ZoneId) lVar.mo6793e(C2301q.f6554a);
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
