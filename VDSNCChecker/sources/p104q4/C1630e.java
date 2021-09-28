package p104q4;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: q4.e */
public final class C1630e {

    /* renamed from: a */
    public static String f5006a;

    /* renamed from: q4.e$a */
    public static class C1631a implements PrivilegedAction<String> {
        public Object run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f5006a = (String) AccessController.doPrivileged(new C1631a());
        } catch (Exception unused) {
            try {
                f5006a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f5006a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static String m4537a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static byte[] m4538b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m4539c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
