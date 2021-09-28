package p067k3;

import p072l2.C1241e;
import p130v0.C1964a;

/* renamed from: k3.m */
public class C1210m extends C1209l {
    /* renamed from: k0 */
    public static final String m3456k0(String str, int i) {
        C1241e.m3517j(str, "$this$take");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(C1964a.m5271a("Requested character count ", i, " is less than zero.").toString());
    }
}
