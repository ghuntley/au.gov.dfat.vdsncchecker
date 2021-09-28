package p067k3;

import java.util.ArrayList;
import java.util.List;
import p019c3.C0636l;
import p042g2.C0955a;
import p061j3.C1097e;
import p061j3.C1101i;
import p072l2.C1241e;
import p126u2.C1845f;
import p126u2.C1850k;

/* renamed from: k3.d */
public class C1201d extends C0955a {
    /* renamed from: H */
    public static String m3424H(String str, String str2, int i) {
        String str3;
        String str4 = (i & 1) != 0 ? "|" : null;
        C1241e.m3517j(str, "$this$trimMargin");
        C1241e.m3517j(str4, "marginPrefix");
        if (!C1205h.m3428L(str4)) {
            List I = C1097e.m3119I(new C1101i(new C1198b(str, 0, 0, new C1207j(C1845f.m5041H(new String[]{"\r\n", "\n", "\r"}), false)), new C1208k(str)));
            int size = (I.size() * 0) + str.length();
            int p = C0955a.m2742p(I);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : I) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str5 = (String) next;
                    if ((i2 == 0 || i2 == p) && C1205h.m3428L(str5)) {
                        str5 = null;
                    } else {
                        int length = str5.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i4 = -1;
                                break;
                            } else if (!C0955a.m2744r(str5.charAt(i4))) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 != -1 && C1205h.m3433Q(str5, str4, i4, false, 4)) {
                            str3 = str5.substring(str4.length() + i4);
                            C1241e.m3516f(str3, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            str5 = str3;
                        }
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                    i2 = i3;
                } else {
                    C0955a.m2723D();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            C1850k.m5050L(arrayList, sb, "\n", "", "", -1, "...", (C0636l) null);
            String sb2 = sb.toString();
            C1241e.m3516f(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
