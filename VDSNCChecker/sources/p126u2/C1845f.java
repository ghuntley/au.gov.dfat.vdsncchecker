package p126u2;

import java.util.Arrays;
import java.util.List;
import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: u2.f */
public class C1845f extends C0955a {
    /* renamed from: H */
    public static final <T> List<T> m5041H(T[] tArr) {
        C1241e.m3517j(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        C1241e.m3516f(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    /* renamed from: I */
    public static final byte[] m5042I(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C1241e.m3517j(bArr, "$this$copyInto");
        C1241e.m3517j(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: J */
    public static /* synthetic */ byte[] m5043J(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m5042I(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* renamed from: K */
    public static Object[] m5044K(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C1241e.m3517j(objArr, "$this$copyInto");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* renamed from: L */
    public static final byte[] m5045L(byte[] bArr, int i, int i2) {
        C1241e.m3517j(bArr, "$this$copyOfRangeImpl");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            C1241e.m3516f(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }
}
