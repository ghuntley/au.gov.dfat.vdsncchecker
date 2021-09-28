package p139w3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0001b;
import p025d3.C0802f;
import p042g2.C0955a;
import p049h3.C1013a;
import p049h3.C1015c;
import p067k3.C1205h;
import p072l2.C1241e;

/* renamed from: w3.z */
public final class C2111z {

    /* renamed from: d */
    public static final Pattern f6134d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f6135e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f */
    public static final C2112a f6136f = null;

    /* renamed from: a */
    public final String f6137a;

    /* renamed from: b */
    public final String f6138b;

    /* renamed from: c */
    public final String[] f6139c;

    /* renamed from: w3.z$a */
    public static final class C2112a {
        /* renamed from: a */
        public static final C2111z m5503a(String str) {
            C1241e.m3517j(str, "$this$toMediaType");
            Matcher matcher = C2111z.f6134d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C1241e.m3516f(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C1241e.m3516f(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                C1241e.m3516f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C1241e.m3516f(group2, "typeSubtype.group(2)");
                C1241e.m3516f(locale, "Locale.US");
                String lowerCase2 = group2.toLowerCase(locale);
                C1241e.m3516f(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = C2111z.f6135e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 != null) {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C1205h.m3434R(group4, "'", false, 2) && C1205h.m3426J(group4, "'", false, 2) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C1241e.m3516f(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                        }
                        end = matcher2.end();
                    } else {
                        StringBuilder a = C0001b.m0a("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C1241e.m3516f(substring, "(this as java.lang.String).substring(startIndex)");
                        a.append(substring);
                        a.append("\" for: \"");
                        a.append(str);
                        a.append('\"');
                        throw new IllegalArgumentException(a.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new C2111z(str, lowerCase, lowerCase2, (String[]) array, (C0802f) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
    }

    public C2111z(String str, String str2, String str3, String[] strArr, C0802f fVar) {
        this.f6137a = str;
        this.f6138b = str2;
        this.f6139c = strArr;
    }

    /* renamed from: a */
    public final Charset mo6646a(Charset charset) {
        String str;
        C1241e.m3517j("charset", "name");
        String[] strArr = this.f6139c;
        C1241e.m3517j(strArr, "$this$indices");
        C1241e.m3517j(strArr, "$this$lastIndex");
        C1013a C = C0955a.m2722C(new C1015c(0, strArr.length - 1), 2);
        int i = C.f3728e;
        int i2 = C.f3729f;
        int i3 = C.f3730g;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (!C1205h.m3427K(this.f6139c[i], "charset", true)) {
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    str = this.f6139c[i + 1];
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2111z) && C1241e.m3513b(((C2111z) obj).f6137a, this.f6137a);
    }

    public int hashCode() {
        return this.f6137a.hashCode();
    }

    public String toString() {
        return this.f6137a;
    }
}
