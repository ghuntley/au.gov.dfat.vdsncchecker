package p067k3;

import java.util.Collection;
import java.util.Iterator;
import p042g2.C0955a;
import p049h3.C1014b;
import p049h3.C1015c;
import p072l2.C1241e;
import p126u2.C1855p;

/* renamed from: k3.h */
public class C1205h extends C1204g {
    /* renamed from: J */
    public static boolean m3426J(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        C1241e.m3517j(str, "$this$endsWith");
        C1241e.m3517j(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m3429M(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: K */
    public static final boolean m3427K(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: L */
    public static final boolean m3428L(CharSequence charSequence) {
        boolean z;
        C1241e.m3517j(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            C1015c cVar = new C1015c(0, charSequence.length() - 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (true) {
                    if (((C1014b) it).f3732f) {
                        if (!C0955a.m2744r(charSequence.charAt(((C1855p) it).mo4450b()))) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public static final boolean m3429M(String str, int i, String str2, int i2, int i3, boolean z) {
        C1241e.m3517j(str, "$this$regionMatches");
        C1241e.m3517j(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: N */
    public static String m3430N(String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        C1241e.m3517j(str, "$this$replace");
        int V = C1209l.m3441V(str, str2, 0, z);
        if (V < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = 1;
        if (length >= 1) {
            i3 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, V);
                sb.append(str3);
                i2 = V + length;
                if (V >= str.length() || (V = C1209l.m3441V(str, str2, V + i3, z)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    C1241e.m3516f(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i2, V);
                sb.append(str3);
                i2 = V + length;
                break;
            } while ((V = C1209l.m3441V(str, str2, V + i3, z)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            C1241e.m3516f(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: O */
    public static final boolean m3431O(String str, String str2, int i, boolean z) {
        C1241e.m3517j(str, "$this$startsWith");
        C1241e.m3517j(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m3429M(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: P */
    public static final boolean m3432P(String str, String str2, boolean z) {
        C1241e.m3517j(str, "$this$startsWith");
        C1241e.m3517j(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m3429M(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m3433Q(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m3431O(str, str2, i, z);
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m3434R(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m3432P(str, str2, z);
    }
}
