package p104q4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000a.C0001b;

/* renamed from: q4.a */
public final class C1625a {

    /* renamed from: q4.a$a */
    public static class C1626a<T> implements Iterator<T> {

        /* renamed from: e */
        public final T[] f5001e;

        /* renamed from: f */
        public int f5002f = 0;

        public C1626a(T[] tArr) {
            this.f5001e = tArr;
        }

        public boolean hasNext() {
            return this.f5002f < this.f5001e.length;
        }

        public T next() {
            int i = this.f5002f;
            T[] tArr = this.f5001e;
            if (i != tArr.length) {
                this.f5002f = i + 1;
                return tArr[i];
            }
            StringBuilder a = C0001b.m0a("Out of elements: ");
            a.append(this.f5002f);
            throw new NoSuchElementException(a.toString());
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    /* renamed from: a */
    public static byte[] m4534a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: b */
    public static byte[] m4535b(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: c */
    public static int m4536c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }
}
