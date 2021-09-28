package p155j$.time.chrono;

import java.util.Objects;
import p155j$.time.LocalDate;
import p155j$.time.LocalDateTime;
import p155j$.time.ZoneOffset;
import p155j$.time.temporal.C2295k;
import p155j$.time.temporal.C2297m;

/* renamed from: j$.time.chrono.c */
public interface C2225c extends C2295k, C2297m, Comparable {
    /* renamed from: a */
    C2228f mo6849a() {
        Objects.requireNonNull((LocalDate) ((LocalDateTime) this).mo6813C());
        return C2229g.f6372a;
    }

    long toEpochSecond(ZoneOffset zoneOffset);
}
