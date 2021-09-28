package p155j$.time.chrono;

import java.util.Objects;
import p155j$.time.C2280r;
import p155j$.time.LocalDate;
import p155j$.time.LocalDateTime;
import p155j$.time.temporal.C2281A;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.chrono.e */
public interface C2227e extends C2295k, Comparable {
    /* renamed from: a */
    C2228f mo6850a() {
        Objects.requireNonNull((LocalDate) ((C2280r) this).mo7006s());
        return C2229g.f6372a;
    }

    /* renamed from: b */
    int mo6789b(C2300p pVar) {
        if (!(pVar instanceof C2285a)) {
            return super.mo6789b(pVar);
        }
        int i = C2226d.f6371a[((C2285a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? ((LocalDateTime) ((C2280r) this).mo7007t()).mo6789b(pVar) : ((C2280r) this).mo7004m().mo6837q();
        }
        throw new C2281A("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    int compareTo(Object obj) {
        C2227e eVar = (C2227e) obj;
        int compare = Long.compare(mo6852h(), eVar.mo6852h());
        if (compare != 0) {
            return compare;
        }
        C2280r rVar = (C2280r) this;
        C2280r rVar2 = (C2280r) eVar;
        int o = rVar.mo7009u().mo6981o() - rVar2.mo7009u().mo6981o();
        if (o != 0 || (o = ((LocalDateTime) rVar.mo7007t()).compareTo(rVar2.mo7007t())) != 0) {
            return o;
        }
        int compareTo = rVar.mo7005n().mo6833l().compareTo(rVar2.mo7005n().mo6833l());
        if (compareTo != 0) {
            return compareTo;
        }
        mo6850a();
        C2229g gVar = C2229g.f6372a;
        eVar.mo6850a();
        return 0;
    }

    /* renamed from: h */
    long mo6852h() {
        C2280r rVar = (C2280r) this;
        return ((((LocalDate) rVar.mo7006s()).mo6784E() * 86400) + ((long) rVar.mo7009u().mo6989y())) - ((long) rVar.mo7004m().mo6837q());
    }
}
