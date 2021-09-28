package p126u2;

import java.util.NoSuchElementException;
import p072l2.C1241e;

/* renamed from: u2.d */
public final class C1843d extends C1845f {
    /* renamed from: M */
    public static final int m5038M(byte[] bArr, byte b) {
        C1241e.m3517j(bArr, "$this$indexOf");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static final char m5039N(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
