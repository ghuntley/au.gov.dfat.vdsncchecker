package p014b4;

import java.net.ProtocolException;
import p063k.C1142f;
import p067k3.C1205h;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: b4.j */
public final class C0551j {

    /* renamed from: a */
    public final C2061c0 f2351a;

    /* renamed from: b */
    public final int f2352b;

    /* renamed from: c */
    public final String f2353c;

    public C0551j(C2061c0 c0Var, int i, String str) {
        this.f2351a = c0Var;
        this.f2352b = i;
        this.f2353c = str;
    }

    /* renamed from: a */
    public static final C0551j m1811a(String str) {
        String str2;
        C2061c0 c0Var = C2061c0.HTTP_1_0;
        C1241e.m3517j(str, "statusLine");
        int i = 9;
        if (C1205h.m3434R(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    c0Var = C2061c0.HTTP_1_1;
                } else {
                    throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
                }
            }
        } else if (C1205h.m3434R(str, "ICY ", false, 2)) {
            i = 4;
        } else {
            throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                    C1241e.m3516f(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
                }
                return new C0551j(c0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(C1142f.m3365a("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2351a == C2061c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f2352b);
        sb.append(' ');
        sb.append(this.f2353c);
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
