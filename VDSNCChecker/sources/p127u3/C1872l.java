package p127u3;

import p072l2.C1241e;

/* renamed from: u3.l */
public final class C1872l {

    /* renamed from: a */
    public static final String[] f5575a;

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            strArr[i2] = "\\u" + m5132b(i2 >> 12) + m5132b(i2 >> 8) + m5132b(i2 >> 4) + m5132b(i2);
            if (i3 > 31) {
                break;
            }
            i2 = i3;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f5575a = strArr;
        byte[] bArr = new byte[93];
        while (true) {
            int i4 = i + 1;
            bArr[i] = 1;
            if (i4 <= 31) {
                i = i4;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static final void m5131a(StringBuilder sb, String str) {
        C1241e.m3517j(str, "value");
        sb.append('\"');
        int length = str.length() - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                String[] strArr = f5575a;
                if (charAt < strArr.length && strArr[charAt] != null) {
                    sb.append(str, i2, i);
                    sb.append(strArr[charAt]);
                    i2 = i3;
                }
                if (i3 > length) {
                    break;
                }
                i = i3;
            }
            i = i2;
        }
        if (i != 0) {
            sb.append(str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    /* renamed from: b */
    public static final char m5132b(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
