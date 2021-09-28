package p139w3;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p014b4.C0543c;
import p025d3.C0802f;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p077m1.C1428c;
import p144x3.C2129c;

/* renamed from: w3.m */
public final class C2089m {

    /* renamed from: j */
    public static final Pattern f6078j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f6079k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f6080l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f6081m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C2089m f6082n = null;

    /* renamed from: a */
    public final String f6083a;

    /* renamed from: b */
    public final String f6084b;

    /* renamed from: c */
    public final long f6085c;

    /* renamed from: d */
    public final String f6086d;

    /* renamed from: e */
    public final String f6087e;

    /* renamed from: f */
    public final boolean f6088f;

    /* renamed from: g */
    public final boolean f6089g;

    /* renamed from: h */
    public final boolean f6090h;

    /* renamed from: i */
    public final boolean f6091i;

    public C2089m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C0802f fVar) {
        this.f6083a = str;
        this.f6084b = str2;
        this.f6085c = j;
        this.f6086d = str3;
        this.f6087e = str4;
        this.f6088f = z;
        this.f6089g = z2;
        this.f6090h = z3;
        this.f6091i = z4;
    }

    /* renamed from: a */
    public static final int m5449a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            boolean z2 = true;
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static final long m5450b(String str, int i, int i2) {
        int a = m5449a(str, i, i2, false);
        Matcher matcher = f6081m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m5449a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f6081m).matches()) {
                String group = matcher.group(1);
                C1241e.m3516f(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                C1241e.m3516f(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                C1241e.m3516f(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 != -1 || !matcher.usePattern(f6080l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f6079k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        C1241e.m3516f(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        C1241e.m3516f(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        C1241e.m3516f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        C1241e.m3516f(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = C1209l.m3445Z(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f6078j).matches()) {
                    String group5 = matcher.group(1);
                    C1241e.m3516f(group5, "matcher.group(1)");
                    i3 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                C1241e.m3516f(group6, "matcher.group(1)");
                i5 = Integer.parseInt(group6);
            }
            a = m5449a(str, a2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (1 <= i5 && 31 >= i5) {
                    if (i4 >= 0 && 23 >= i4) {
                        if (i7 >= 0 && 59 >= i7) {
                            if (i8 >= 0 && 59 >= i8) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(C2129c.f6172d);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i3);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i5);
                                gregorianCalendar.set(11, i4);
                                gregorianCalendar.set(12, i7);
                                gregorianCalendar.set(13, i8);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final long m5451c(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            Pattern compile = Pattern.compile("-?\\d+");
            C1241e.m3516f(compile, "Pattern.compile(pattern)");
            if (!compile.matcher(str).matches()) {
                throw e;
            } else if (C1205h.m3434R(str, "-", false, 2)) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2089m) {
            C2089m mVar = (C2089m) obj;
            return C1241e.m3513b(mVar.f6083a, this.f6083a) && C1241e.m3513b(mVar.f6084b, this.f6084b) && mVar.f6085c == this.f6085c && C1241e.m3513b(mVar.f6086d, this.f6086d) && C1241e.m3513b(mVar.f6087e, this.f6087e) && mVar.f6088f == this.f6088f && mVar.f6089g == this.f6089g && mVar.f6090h == this.f6090h && mVar.f6091i == this.f6091i;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int a = C1428c.m4090a(this.f6084b, C1428c.m4090a(this.f6083a, 527, 31), 31);
        int a2 = C1428c.m4090a(this.f6087e, C1428c.m4090a(this.f6086d, (Long.hashCode(this.f6085c) + a) * 31, 31), 31);
        int hashCode = Boolean.hashCode(this.f6089g);
        int hashCode2 = Boolean.hashCode(this.f6090h);
        return Boolean.hashCode(this.f6091i) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.f6088f) + a2) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6083a);
        sb.append('=');
        sb.append(this.f6084b);
        if (this.f6090h) {
            if (this.f6085c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                Date date = new Date(this.f6085c);
                C0543c.C0544a aVar = C0543c.f2333a;
                C1241e.m3517j(date, "$this$toHttpDateString");
                str = ((DateFormat) C0543c.f2333a.get()).format(date);
                C1241e.m3516f(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.f6091i) {
            sb.append("; domain=");
            sb.append(this.f6086d);
        }
        sb.append("; path=");
        sb.append(this.f6087e);
        if (this.f6088f) {
            sb.append("; secure");
        }
        if (this.f6089g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "toString()");
        return sb2;
    }
}
