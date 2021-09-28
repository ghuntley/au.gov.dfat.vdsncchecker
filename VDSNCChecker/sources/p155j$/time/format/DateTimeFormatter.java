package p155j$.time.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p155j$.time.C2230d;
import p155j$.time.ZoneId;
import p155j$.time.chrono.C2228f;
import p155j$.time.chrono.C2229g;
import p155j$.time.format.C2248g;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2294j;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.format.DateTimeFormatter */
public final class DateTimeFormatter {

    /* renamed from: h */
    public static final DateTimeFormatter f6387h;

    /* renamed from: i */
    public static final DateTimeFormatter f6388i;

    /* renamed from: a */
    private final C2248g.C2249a f6389a;

    /* renamed from: b */
    private final Locale f6390b;

    /* renamed from: c */
    private final C2236D f6391c;

    /* renamed from: d */
    private final C2238F f6392d;

    /* renamed from: e */
    private final Set f6393e = null;

    /* renamed from: f */
    private final C2228f f6394f;

    /* renamed from: g */
    private final ZoneId f6395g;

    static {
        C2248g gVar = new C2248g();
        C2285a aVar = C2285a.YEAR;
        C2239G g = C2239G.EXCEEDS_PAD;
        C2248g p = gVar.mo6913p(aVar, 4, 10, g);
        p.mo6903e('-');
        C2285a aVar2 = C2285a.MONTH_OF_YEAR;
        p.mo6912o(aVar2, 2);
        p.mo6903e('-');
        C2285a aVar3 = C2285a.DAY_OF_MONTH;
        p.mo6912o(aVar3, 2);
        C2238F f = C2238F.STRICT;
        C2229g gVar2 = C2229g.f6372a;
        DateTimeFormatter x = p.mo6921x(f, gVar2);
        f6387h = x;
        C2248g gVar3 = new C2248g();
        gVar3.mo6917t();
        gVar3.mo6900a(x);
        gVar3.mo6907i();
        gVar3.mo6921x(f, gVar2);
        C2248g gVar4 = new C2248g();
        gVar4.mo6917t();
        gVar4.mo6900a(x);
        gVar4.mo6916s();
        gVar4.mo6907i();
        gVar4.mo6921x(f, gVar2);
        C2248g gVar5 = new C2248g();
        C2285a aVar4 = C2285a.HOUR_OF_DAY;
        gVar5.mo6912o(aVar4, 2);
        gVar5.mo6903e(':');
        C2285a aVar5 = C2285a.MINUTE_OF_HOUR;
        gVar5.mo6912o(aVar5, 2);
        gVar5.mo6916s();
        gVar5.mo6903e(':');
        C2285a aVar6 = C2285a.SECOND_OF_MINUTE;
        gVar5.mo6912o(aVar6, 2);
        gVar5.mo6916s();
        gVar5.mo6901b(C2285a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter x2 = gVar5.mo6921x(f, (C2228f) null);
        C2248g gVar6 = new C2248g();
        gVar6.mo6917t();
        gVar6.mo6900a(x2);
        gVar6.mo6907i();
        gVar6.mo6921x(f, (C2228f) null);
        C2248g gVar7 = new C2248g();
        gVar7.mo6917t();
        gVar7.mo6900a(x2);
        gVar7.mo6916s();
        gVar7.mo6907i();
        gVar7.mo6921x(f, (C2228f) null);
        C2248g gVar8 = new C2248g();
        gVar8.mo6917t();
        gVar8.mo6900a(x);
        gVar8.mo6903e('T');
        gVar8.mo6900a(x2);
        DateTimeFormatter x3 = gVar8.mo6921x(f, gVar2);
        C2248g gVar9 = new C2248g();
        gVar9.mo6917t();
        gVar9.mo6900a(x3);
        gVar9.mo6907i();
        DateTimeFormatter x4 = gVar9.mo6921x(f, gVar2);
        C2248g gVar10 = new C2248g();
        gVar10.mo6900a(x4);
        gVar10.mo6916s();
        gVar10.mo6903e('[');
        gVar10.mo6918u();
        gVar10.mo6914q();
        gVar10.mo6903e(']');
        gVar10.mo6921x(f, gVar2);
        C2248g gVar11 = new C2248g();
        gVar11.mo6900a(x3);
        gVar11.mo6916s();
        gVar11.mo6907i();
        gVar11.mo6916s();
        gVar11.mo6903e('[');
        gVar11.mo6918u();
        gVar11.mo6914q();
        gVar11.mo6903e(']');
        gVar11.mo6921x(f, gVar2);
        C2248g gVar12 = new C2248g();
        gVar12.mo6917t();
        C2248g p2 = gVar12.mo6913p(aVar, 4, 10, g);
        p2.mo6903e('-');
        p2.mo6912o(C2285a.DAY_OF_YEAR, 3);
        p2.mo6916s();
        p2.mo6907i();
        p2.mo6921x(f, gVar2);
        C2248g gVar13 = new C2248g();
        gVar13.mo6917t();
        C2248g p3 = gVar13.mo6913p(C2294j.f6551c, 4, 10, g);
        p3.mo6904f("-W");
        p3.mo6912o(C2294j.f6550b, 2);
        p3.mo6903e('-');
        C2285a aVar7 = C2285a.DAY_OF_WEEK;
        p3.mo6912o(aVar7, 1);
        p3.mo6916s();
        p3.mo6907i();
        p3.mo6921x(f, gVar2);
        C2248g gVar14 = new C2248g();
        gVar14.mo6917t();
        gVar14.mo6902c();
        f6388i = gVar14.mo6921x(f, (C2228f) null);
        C2248g gVar15 = new C2248g();
        gVar15.mo6917t();
        gVar15.mo6912o(aVar, 4);
        gVar15.mo6912o(aVar2, 2);
        gVar15.mo6912o(aVar3, 2);
        gVar15.mo6916s();
        gVar15.mo6906h("+HHMMss", "Z");
        gVar15.mo6921x(f, gVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C2229g gVar16 = gVar2;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C2248g gVar17 = new C2248g();
        gVar17.mo6917t();
        gVar17.mo6919v();
        gVar17.mo6916s();
        gVar17.mo6910l(aVar7, hashMap);
        gVar17.mo6904f(", ");
        gVar17.mo6915r();
        C2248g p4 = gVar17.mo6913p(aVar3, 1, 2, C2239G.NOT_NEGATIVE);
        p4.mo6903e(' ');
        p4.mo6910l(aVar2, hashMap2);
        p4.mo6903e(' ');
        p4.mo6912o(aVar, 4);
        p4.mo6903e(' ');
        p4.mo6912o(aVar4, 2);
        p4.mo6903e(':');
        p4.mo6912o(aVar5, 2);
        p4.mo6916s();
        p4.mo6903e(':');
        p4.mo6912o(aVar6, 2);
        p4.mo6915r();
        p4.mo6903e(' ');
        p4.mo6906h("+HHMM", "GMT");
        p4.mo6921x(C2238F.SMART, gVar16);
    }

    DateTimeFormatter(C2248g.C2249a aVar, Locale locale, C2236D d, C2238F f, Set set, C2228f fVar, ZoneId zoneId) {
        this.f6389a = aVar;
        this.f6390b = locale;
        this.f6391c = d;
        Objects.requireNonNull(f, "resolverStyle");
        this.f6392d = f;
        this.f6394f = fVar;
        this.f6395g = null;
    }

    /* renamed from: g */
    private C2296l m5793g(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = new ParsePosition(0);
        C2266x xVar = new C2266x(this);
        int c = this.f6389a.mo6897c(xVar, charSequence, parsePosition2.getIndex());
        if (c < 0) {
            parsePosition2.setErrorIndex(~c);
            xVar = null;
        } else {
            parsePosition2.setIndex(c);
        }
        if (xVar != null && parsePosition2.getErrorIndex() < 0 && parsePosition2.getIndex() >= charSequence.length()) {
            return xVar.mo6964t(this.f6392d, this.f6393e);
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new C2267y("Text '" + str + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new C2267y("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    public static DateTimeFormatter ofPattern(String str) {
        C2248g gVar = new C2248g();
        gVar.mo6908j(str);
        return gVar.mo6920w();
    }

    /* renamed from: a */
    public String mo6883a(C2296l lVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f6389a.mo6898d(new C2233A(lVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C2230d(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public C2228f mo6884b() {
        return this.f6394f;
    }

    /* renamed from: c */
    public C2236D mo6885c() {
        return this.f6391c;
    }

    /* renamed from: d */
    public Locale mo6886d() {
        return this.f6390b;
    }

    /* renamed from: e */
    public ZoneId mo6887e() {
        return this.f6395g;
    }

    /* renamed from: f */
    public Object mo6888f(CharSequence charSequence, C2309y yVar) {
        String str;
        Objects.requireNonNull(charSequence, "text");
        try {
            return ((C2237E) m5793g(charSequence, (ParsePosition) null)).mo6793e(yVar);
        } catch (C2267y e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            throw new C2267y("Text '" + str + "' could not be parsed: " + e2.getMessage(), charSequence, 0, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2248g.C2249a mo6889h(boolean z) {
        return this.f6389a.mo6922a(z);
    }

    public String toString() {
        String aVar = this.f6389a.toString();
        return aVar.startsWith("[") ? aVar : aVar.substring(1, aVar.length() - 1);
    }
}
