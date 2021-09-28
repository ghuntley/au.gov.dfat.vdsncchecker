package p067k3;

import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: k3.g */
public class C1204g extends C1203f {
    /* renamed from: I */
    public static final Integer m3425I(String str) {
        boolean z;
        int i;
        C0955a.m2729c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        int i4 = 1;
        if (C1241e.m3519l(charAt, 48) >= 0) {
            z = false;
            i4 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i3 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i5 = -59652323;
        while (i4 < length) {
            int digit = Character.digit(str.charAt(i4), 10);
            if (digit < 0) {
                return null;
            }
            if ((i2 < i5 && (i5 != -59652323 || i2 < (i5 = i3 / 10))) || (i = i2 * 10) < i3 + digit) {
                return null;
            }
            i2 = i - digit;
            i4++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }
}
