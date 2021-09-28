package p155j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: j$.time.zone.f */
final class C2316f extends C2317g {

    /* renamed from: c */
    private final Set f6578c;

    C2316f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f6578c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2313c mo7072c(String str, boolean z) {
        if (this.f6578c.contains(str)) {
            return new C2313c(TimeZone.getTimeZone(str));
        }
        throw new C2314d("Not a built-in time zone: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Set mo7073d() {
        return this.f6578c;
    }
}
