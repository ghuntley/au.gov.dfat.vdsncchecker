package p062j4;

import androidx.appcompat.widget.C0231z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Hashtable;
import java.util.logging.Logger;
import p067k3.C1209l;
import p068k4.C1212b;
import p072l2.C1241e;
import p074l4.C1337a0;
import p074l4.C1348e;
import p074l4.C1364i1;
import p074l4.C1390r;
import p074l4.C1393s;
import p086n4.C1482a;
import p104q4.C1630e;
import p110r4.C1688a;

/* renamed from: j4.b */
public class C1106b {
    /* renamed from: a */
    public static void m3131a(StringBuffer stringBuffer, C1482a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.f4629e);
        if (str == null) {
            str = aVar.f4629e.f4416e;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(m3142l(aVar.f4630f));
    }

    /* renamed from: b */
    public static final boolean m3132b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C1241e.m3517j(bArr, "a");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final C1113g m3133c(C1132x xVar) {
        C1241e.m3517j(xVar, "$this$buffer");
        return new C1127s(xVar);
    }

    /* renamed from: d */
    public static final C1114h m3134d(C1134z zVar) {
        return new C1128t(zVar);
    }

    /* renamed from: e */
    public static String m3135e(C1348e eVar) {
        String l = m3142l(eVar);
        if (l.length() > 0 && l.charAt(0) == '#') {
            try {
                int length = l.length() - 1;
                C0231z zVar = C1688a.f5127a;
                C1393s m = C1393s.m3981m(C1688a.f5127a.mo1234a(l, 1, length));
                if (m instanceof C1337a0) {
                    l = ((C1337a0) m).mo5158d();
                }
            } catch (Exception e) {
                throw new C1390r("exception decoding Hex string: " + e.getMessage(), e, 1);
            } catch (IOException e2) {
                throw new IllegalStateException("unknown encoding in name: " + e2);
            }
        }
        String c = C1630e.m4539c(l);
        int length2 = c.length();
        if (length2 < 2) {
            return c;
        }
        int i = length2 - 1;
        int i2 = 0;
        while (i2 < i && c.charAt(i2) == '\\' && c.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && c.charAt(i4 - 1) == '\\' && c.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            c = c.substring(i2, i4 + 1);
        }
        if (c.indexOf("  ") < 0) {
            return c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = c.charAt(0);
        stringBuffer.append(charAt);
        for (int i5 = 1; i5 < c.length(); i5++) {
            char charAt2 = c.charAt(i5);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static final void m3136f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: g */
    public static final boolean m3137g(AssertionError assertionError) {
        Logger logger = C1123p.f3908a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C1209l.m3439T(message, "getsockname failed", false, 2) : false;
    }

    /* renamed from: h */
    public static final int m3138h(C1131w wVar, int i) {
        int i2;
        int[] iArr = wVar.f3930k;
        int i3 = i + 1;
        int i4 = 0;
        int length = wVar.f3929j.length;
        C1241e.m3517j(iArr, "$this$binarySearch");
        int i5 = length - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* renamed from: i */
    public static final C1132x m3139i(Socket socket) {
        Logger logger = C1123p.f3908a;
        C1133y yVar = new C1133y(socket);
        OutputStream outputStream = socket.getOutputStream();
        C1241e.m3516f(outputStream, "getOutputStream()");
        return new C1110d(yVar, new C1126r(outputStream, yVar));
    }

    /* renamed from: j */
    public static final C1134z m3140j(Socket socket) {
        Logger logger = C1123p.f3908a;
        C1133y yVar = new C1133y(socket);
        InputStream inputStream = socket.getInputStream();
        C1241e.m3516f(inputStream, "getInputStream()");
        return new C1111e(yVar, new C1122o(inputStream, yVar));
    }

    /* renamed from: k */
    public static final String m3141k(byte b) {
        char[] cArr = C1212b.f4116a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* renamed from: l */
    public static String m3142l(C1348e eVar) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (!(eVar instanceof C1337a0) || (eVar instanceof C1364i1)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(C1688a.m4678b(eVar.mo5171c().mo5199h("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String d = ((C1337a0) eVar).mo5158d();
            if (d.length() > 0 && d.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(d);
        }
        int length = stringBuffer.length();
        int i3 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                stringBuffer.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }
}
