package p155j$.time.format;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import p155j$.time.ZoneId;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.x */
final class C2266x {

    /* renamed from: a */
    private DateTimeFormatter f6479a;

    /* renamed from: b */
    private boolean f6480b = true;

    /* renamed from: c */
    private boolean f6481c = true;

    /* renamed from: d */
    private final ArrayList f6482d;

    /* renamed from: e */
    private ArrayList f6483e;

    C2266x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f6482d = arrayList;
        this.f6483e = null;
        this.f6479a = dateTimeFormatter;
        arrayList.add(new C2237E());
    }

    /* renamed from: c */
    static boolean m5903c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: e */
    private C2237E m5904e() {
        ArrayList arrayList = this.f6482d;
        return (C2237E) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6947a(Consumer consumer) {
        if (this.f6483e == null) {
            this.f6483e = new ArrayList();
        }
        this.f6483e.add(consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6948b(char c, char c2) {
        if (this.f6480b) {
            return c == c2;
        }
        return m5903c(c, c2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2266x mo6949d() {
        C2266x xVar = new C2266x(this.f6479a);
        xVar.f6480b = this.f6480b;
        xVar.f6481c = this.f6481c;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6950f(boolean z) {
        ArrayList arrayList;
        int i;
        if (z) {
            arrayList = this.f6482d;
            i = arrayList.size() - 2;
        } else {
            arrayList = this.f6482d;
            i = arrayList.size() - 1;
        }
        arrayList.remove(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2236D mo6951g() {
        return this.f6479a.mo6885c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2228f mo6952h() {
        C2228f fVar = m5904e().f6398c;
        if (fVar != null) {
            return fVar;
        }
        C2228f b = this.f6479a.mo6884b();
        return b == null ? C2229g.f6372a : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Locale mo6953i() {
        return this.f6479a.mo6886d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Long mo6954j(C2300p pVar) {
        return (Long) m5904e().f6396a.get(pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo6955k() {
        return this.f6480b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo6956l() {
        return this.f6481c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6957m(boolean z) {
        this.f6480b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6958n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m5904e().f6397b = zoneId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo6959o(C2300p pVar, long j, int i, int i2) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) m5904e().f6396a.put(pVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6960p() {
        m5904e().f6399d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6961q(boolean z) {
        this.f6481c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6962r() {
        ArrayList arrayList = this.f6482d;
        C2237E e = m5904e();
        Objects.requireNonNull(e);
        C2237E e2 = new C2237E();
        e2.f6396a.putAll(e.f6396a);
        e2.f6397b = e.f6397b;
        e2.f6398c = e.f6398c;
        e2.f6399d = e.f6399d;
        arrayList.add(e2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo6963s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.f6480b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C2296l mo6964t(C2238F f, Set set) {
        C2237E e = m5904e();
        e.f6398c = mo6952h();
        ZoneId zoneId = e.f6397b;
        if (zoneId == null) {
            zoneId = this.f6479a.mo6887e();
        }
        e.f6397b = zoneId;
        e.mo6891l(f, set);
        return e;
    }

    public String toString() {
        return m5904e().toString();
    }
}
