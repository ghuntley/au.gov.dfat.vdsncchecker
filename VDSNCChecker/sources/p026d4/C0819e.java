package p026d4;

import p062j4.C1115i;
import p067k3.C1205h;
import p072l2.C1241e;
import p099q.C1589b;
import p144x3.C2129c;

/* renamed from: d4.e */
public final class C0819e {

    /* renamed from: a */
    public static final C1115i f3159a = C1115i.f3890i.mo4683b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f3160b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f3161c = new String[64];

    /* renamed from: d */
    public static final String[] f3162d;

    /* renamed from: e */
    public static final C0819e f3163e = new C0819e();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C1241e.m3516f(binaryString, "Integer.toBinaryString(it)");
            String h = C2129c.m5520h("%8s", binaryString);
            C1241e.m3517j(h, "$this$replace");
            String replace = h.replace(' ', '0');
            C1241e.m3516f(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i] = replace;
        }
        f3162d = strArr;
        String[] strArr2 = f3161c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f3161c;
            strArr3[i3 | 8] = C1241e.m3522p(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f3161c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f3161c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = C1589b.m4444a(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = f3161c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f3161c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f3162d[i9];
            }
        }
    }

    /* renamed from: a */
    public final String mo4069a(int i) {
        String[] strArr = f3160b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return C2129c.m5520h("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final String mo4070b(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        String str4;
        String a = mo4069a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : f3162d[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr = f3161c;
                    if (i4 < strArr.length) {
                        str2 = strArr[i4];
                        C1241e.m3515e(str2);
                    } else {
                        str2 = f3162d[i4];
                    }
                    if (i3 == 5 && (i4 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i3 != 0 || (i4 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = C1205h.m3430N(str2, str4, str3, false, 4);
                }
            }
            str = f3162d[i4];
        }
        return C2129c.m5520h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a, str);
    }
}
