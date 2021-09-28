package p126u2;

import java.util.RandomAccess;
import p072l2.C1241e;

/* renamed from: u2.e */
public final class C1844e extends C1838b<Byte> implements RandomAccess {

    /* renamed from: e */
    public final /* synthetic */ byte[] f5539e;

    public C1844e(byte[] bArr) {
        this.f5539e = bArr;
    }

    /* renamed from: b */
    public int mo6251b() {
        return this.f5539e.length;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        byte byteValue = ((Number) obj).byteValue();
        byte[] bArr = this.f5539e;
        C1241e.m3517j(bArr, "$this$contains");
        if (C1843d.m5038M(bArr, byteValue) >= 0) {
            return true;
        }
        return false;
    }

    public Object get(int i) {
        return Byte.valueOf(this.f5539e[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        return C1843d.m5038M(this.f5539e, ((Number) obj).byteValue());
    }

    public boolean isEmpty() {
        return this.f5539e.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte byteValue = ((Number) obj).byteValue();
        byte[] bArr = this.f5539e;
        C1241e.m3517j(bArr, "$this$lastIndexOf");
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (byteValue == bArr[length]) {
                return length;
            }
        }
        return -1;
    }
}
