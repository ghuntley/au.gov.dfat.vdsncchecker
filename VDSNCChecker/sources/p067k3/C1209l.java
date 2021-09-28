package p067k3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p042g2.C0955a;
import p049h3.C1013a;
import p049h3.C1015c;
import p061j3.C1100h;
import p072l2.C1241e;
import p126u2.C1843d;
import p126u2.C1846g;

/* renamed from: k3.l */
public class C1209l extends C1205h {
    /* renamed from: S */
    public static boolean m3438S(CharSequence charSequence, char c, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C1241e.m3517j(charSequence, "$this$contains");
        return m3444Y(charSequence, c, 0, z, 2) >= 0;
    }

    /* renamed from: T */
    public static boolean m3439T(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C1241e.m3517j(charSequence, "$this$contains");
        return m3445Z(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    /* renamed from: U */
    public static final int m3440U(CharSequence charSequence) {
        C1241e.m3517j(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: V */
    public static final int m3441V(CharSequence charSequence, String str, int i, boolean z) {
        C1241e.m3517j(charSequence, "$this$indexOf");
        C1241e.m3517j(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m3443X(charSequence, str, i, charSequence.length(), z, false, 16);
    }

    /* renamed from: W */
    public static final int m3442W(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1013a aVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new C1015c(i, i2);
        } else {
            int U = m3440U(charSequence);
            if (i > U) {
                i = U;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = C0955a.m2738l(i, i2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f3728e;
            int i4 = aVar.f3729f;
            int i5 = aVar.f3730g;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return -1;
                }
            } else if (i3 < i4) {
                return -1;
            }
            while (true) {
                if (m3449d0(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    return i3;
                }
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
        } else {
            int i6 = aVar.f3728e;
            int i7 = aVar.f3729f;
            int i8 = aVar.f3730g;
            if (i8 >= 0) {
                if (i6 > i7) {
                    return -1;
                }
            } else if (i6 < i7) {
                return -1;
            }
            while (true) {
                if (C1205h.m3429M((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    return i6;
                }
                if (i6 == i7) {
                    return -1;
                }
                i6 += i8;
            }
        }
    }

    /* renamed from: X */
    public static /* synthetic */ int m3443X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m3442W(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: Y */
    public static int m3444Y(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C1241e.m3517j(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m3446a0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m3445Z(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m3441V(charSequence, str, i, z);
    }

    /* renamed from: a0 */
    public static final int m3446a0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C1241e.m3517j(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int U = m3440U(charSequence);
            if (i > U) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C0955a.m2739m(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == U) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(C1843d.m5039N(cArr), i);
        }
    }

    /* renamed from: b0 */
    public static int m3447b0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = m3440U(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (!z) {
            return ((String) charSequence).lastIndexOf(C1843d.m5039N(cArr), i);
        }
        int U = m3440U(charSequence);
        if (i > U) {
            i = U;
        }
        while (i >= 0) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z2 = false;
                    break;
                } else if (C0955a.m2739m(cArr[i3], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: c0 */
    public static int m3448c0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = m3440U(charSequence);
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        C1241e.m3517j(charSequence, "$this$lastIndexOf");
        C1241e.m3517j(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m3442W(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* renamed from: d0 */
    public static final boolean m3449d0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C1241e.m3517j(charSequence, "$this$regionMatchesImpl");
        C1241e.m3517j(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C0955a.m2739m(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e0 */
    public static final String m3450e0(String str, CharSequence charSequence) {
        if (!C1205h.m3434R(str, (String) charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C1241e.m3516f(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: f0 */
    public static List m3451f0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        int i3 = 0;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C1241e.m3517j(charSequence, "$this$split");
        int i4 = 10;
        boolean z2 = true;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            if (i >= 0) {
                int V = m3441V(charSequence, valueOf, 0, z);
                if (V == -1 || i == 1) {
                    return C0955a.m2747u(charSequence.toString());
                }
                if (i <= 0) {
                    z2 = false;
                }
                if (z2 && i <= 10) {
                    i4 = i;
                }
                ArrayList arrayList = new ArrayList(i4);
                do {
                    arrayList.add(charSequence.subSequence(i3, V).toString());
                    i3 = valueOf.length() + V;
                    if ((z2 && arrayList.size() == i - 1) || (V = m3441V(charSequence, valueOf, i3, z)) == -1) {
                        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                    }
                    arrayList.add(charSequence.subSequence(i3, V).toString());
                    i3 = valueOf.length() + V;
                    break;
                } while ((V = m3441V(charSequence, valueOf, i3, z)) == -1);
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                return arrayList;
            }
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
        }
        if (i < 0) {
            z2 = false;
        }
        if (z2) {
            C1100h hVar = new C1100h(new C1198b(charSequence, 0, i, new C1206i(cArr, z)));
            ArrayList arrayList2 = new ArrayList(C1846g.m5046H(hVar, 10));
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(m3452g0(charSequence, (C1015c) it.next()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    /* renamed from: g0 */
    public static final String m3452g0(CharSequence charSequence, C1015c cVar) {
        C1241e.m3517j(charSequence, "$this$substring");
        C1241e.m3517j(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f3728e).intValue(), Integer.valueOf(cVar.f3729f).intValue() + 1).toString();
    }

    /* renamed from: h0 */
    public static String m3453h0(String str, String str2, String str3, int i) {
        String str4 = (i & 2) != 0 ? str : null;
        C1241e.m3517j(str, "$this$substringAfter");
        C1241e.m3517j(str2, "delimiter");
        C1241e.m3517j(str4, "missingDelimiterValue");
        int Z = m3445Z(str, str2, 0, false, 6);
        if (Z == -1) {
            return str4;
        }
        String substring = str.substring(str2.length() + Z, str.length());
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: i0 */
    public static String m3454i0(String str, char c, String str2, int i) {
        String str3 = (i & 2) != 0 ? str : null;
        C1241e.m3517j(str, "$this$substringAfterLast");
        C1241e.m3517j(str3, "missingDelimiterValue");
        int b0 = m3447b0(str, c, 0, false, 6);
        if (b0 == -1) {
            return str3;
        }
        String substring = str.substring(b0 + 1, str.length());
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: j0 */
    public static final CharSequence m3455j0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean r = C0955a.m2744r(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!r) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!r) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
