package p155j$.time;

import p155j$.time.zone.C2313c;
import p155j$.time.zone.C2314d;
import p155j$.time.zone.C2317g;

/* renamed from: j$.time.p */
final class C2278p extends ZoneId {

    /* renamed from: a */
    private final String f6512a;

    /* renamed from: b */
    private final transient C2313c f6513b;

    C2278p(String str, C2313c cVar) {
        this.f6512a = str;
        this.f6513b = cVar;
    }

    /* renamed from: q */
    static C2278p m5987q(String str, boolean z) {
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new C2230d("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            C2313c cVar = null;
            try {
                cVar = C2317g.m6147b(str, true);
            } catch (C2314d e) {
                if (z) {
                    throw e;
                }
            }
            return new C2278p(str, cVar);
        }
        throw new C2230d("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    /* renamed from: l */
    public String mo6833l() {
        return this.f6512a;
    }

    /* renamed from: m */
    public C2313c mo6834m() {
        C2313c cVar = this.f6513b;
        return cVar != null ? cVar : C2317g.m6147b(this.f6512a, false);
    }
}
