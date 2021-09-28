package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.appcompat.widget.z */
public class C0231z {

    /* renamed from: a */
    public Object f1002a;

    /* renamed from: b */
    public Object f1003b;

    public C0231z() {
        this.f1002a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.f1003b = new byte[128];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f1003b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.f1002a;
            if (i < bArr2.length) {
                ((byte[]) this.f1003b)[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = (byte[]) this.f1003b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    /* renamed from: a */
    public byte[] mo1234a(String str, int i, int i2) {
        Objects.requireNonNull(str, "'str' cannot be null");
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        } else if ((i2 & 1) == 0) {
            int i3 = i2 >>> 1;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i + 1;
                int i6 = i5 + 1;
                byte b = (((byte[]) this.f1003b)[str.charAt(i)] << 4) | ((byte[]) this.f1003b)[str.charAt(i5)];
                if (b >= 0) {
                    bArr[i4] = (byte) b;
                    i4++;
                    i = i6;
                } else {
                    throw new IOException("invalid characters encountered in Hex string");
                }
            }
            return bArr;
        } else {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
    }

    /* renamed from: b */
    public TextClassifier mo1235b() {
        Object obj = this.f1003b;
        if (((TextClassifier) obj) != null) {
            return (TextClassifier) obj;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) this.f1002a).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C0231z(TextView textView) {
        this.f1002a = textView;
    }
}
