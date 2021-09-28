package p155j$.time.format;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p155j$.time.C2230d;
import p155j$.time.ZoneId;
import p155j$.time.ZoneOffset;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2309y;
import p155j$.time.zone.C2317g;

/* renamed from: j$.time.format.v */
class C2264v implements C2250h {

    /* renamed from: c */
    private static volatile Map.Entry f6470c;

    /* renamed from: d */
    private static volatile Map.Entry f6471d;

    /* renamed from: a */
    private final C2309y f6472a;

    /* renamed from: b */
    private final String f6473b;

    C2264v(C2309y yVar, String str) {
        this.f6472a = yVar;
        this.f6473b = str;
    }

    /* renamed from: b */
    private int m5897b(C2266x xVar, CharSequence charSequence, int i, int i2, C2255m mVar) {
        String upperCase = charSequence.toString().substring(i, i2).toUpperCase();
        if (i2 < charSequence.length() && charSequence.charAt(i2) != '0' && !xVar.mo6948b(charSequence.charAt(i2), 'Z')) {
            C2266x d = xVar.mo6949d();
            int c = mVar.mo6897c(d, charSequence, i2);
            if (c < 0) {
                try {
                    if (mVar == C2255m.f6443d) {
                        return ~i;
                    }
                    xVar.mo6958n(ZoneId.m5729n(upperCase));
                    return i2;
                } catch (C2230d unused) {
                    return ~i;
                }
            } else {
                xVar.mo6958n(ZoneId.m5730o(upperCase, ZoneOffset.m5736t((int) d.mo6954j(C2285a.OFFSET_SECONDS).longValue())));
                return c;
            }
        } else {
            xVar.mo6958n(ZoneId.m5729n(upperCase));
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2258p mo6945a(C2266x xVar) {
        Set a = C2317g.m6146a();
        int size = ((HashSet) a).size();
        Map.Entry entry = xVar.mo6955k() ? f6470c : f6471d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                Map.Entry entry2 = xVar.mo6955k() ? f6470c : f6471d;
                if (entry2 == null || ((Integer) entry2.getKey()).intValue() != size) {
                    entry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), C2258p.m5878g(a, xVar));
                    if (xVar.mo6955k()) {
                        f6470c = entry2;
                    } else {
                        f6471d = entry2;
                    }
                }
            }
        }
        return (C2258p) entry.getValue();
    }

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        } else if (i == length) {
            return ~i;
        } else {
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                return m5897b(xVar, charSequence, i, i, C2255m.f6443d);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char charAt2 = charSequence.charAt(i + 1);
                if (xVar.mo6948b(charAt, 'U') && xVar.mo6948b(charAt2, 'T')) {
                    int i4 = i + 3;
                    if (length < i4 || !xVar.mo6948b(charSequence.charAt(i3), 'C')) {
                        return m5897b(xVar, charSequence, i, i3, C2255m.f6444e);
                    }
                    return m5897b(xVar, charSequence, i, i4, C2255m.f6444e);
                } else if (xVar.mo6948b(charAt, 'G') && length >= (i2 = i + 3) && xVar.mo6948b(charAt2, 'M') && xVar.mo6948b(charSequence.charAt(i3), 'T')) {
                    return m5897b(xVar, charSequence, i, i2, C2255m.f6444e);
                }
            }
            C2258p a = mo6945a(xVar);
            ParsePosition parsePosition = new ParsePosition(i);
            String d = a.mo6940d(charSequence, parsePosition);
            if (d != null) {
                xVar.mo6958n(ZoneId.m5729n(d));
                return parsePosition.getIndex();
            } else if (!xVar.mo6948b(charAt, 'Z')) {
                return ~i;
            } else {
                xVar.mo6958n(ZoneOffset.UTC);
                return i + 1;
            }
        }
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) a.mo6867f(this.f6472a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.mo6833l());
        return true;
    }

    public String toString() {
        return this.f6473b;
    }
}
