package p065k1;

import p000a.C0001b;
import p072l2.C1241e;
import p155j$.time.LocalDate;

/* renamed from: k1.t */
public final class C1188t {

    /* renamed from: a */
    public final String f4074a;

    /* renamed from: b */
    public final LocalDate f4075b;

    /* renamed from: c */
    public final String f4076c;

    public C1188t(String str, LocalDate localDate, String str2) {
        C1241e.m3517j(str, "name");
        C1241e.m3517j(localDate, "date");
        this.f4074a = str;
        this.f4075b = localDate;
        this.f4076c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188t)) {
            return false;
        }
        C1188t tVar = (C1188t) obj;
        return C1241e.m3513b(this.f4074a, tVar.f4074a) && C1241e.m3513b(this.f4075b, tVar.f4075b) && C1241e.m3513b(this.f4076c, tVar.f4076c);
    }

    public int hashCode() {
        int hashCode = (this.f4075b.hashCode() + (this.f4074a.hashCode() * 31)) * 31;
        String str = this.f4076c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("SummaryItemModel(name=");
        a.append(this.f4074a);
        a.append(", date=");
        a.append(this.f4075b);
        a.append(", batchNo=");
        a.append(this.f4076c);
        a.append(')');
        return a.toString();
    }
}
