package p127u3;

import java.util.Objects;
import p000a.C0001b;
import p067k3.C1209l;
import p072l2.C1241e;
import p073l3.C1320u;

/* renamed from: u3.e */
public final class C1863e {

    /* renamed from: a */
    public final String f5551a;

    /* renamed from: b */
    public int f5552b;

    /* renamed from: c */
    public String f5553c;

    /* renamed from: d */
    public StringBuilder f5554d = new StringBuilder();

    public C1863e(String str) {
        this.f5551a = str;
    }

    /* renamed from: k */
    public static /* synthetic */ Void m5080k(C1863e eVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = eVar.f5552b;
        }
        eVar.mo6384i(str, i);
        throw null;
    }

    /* renamed from: a */
    public final boolean mo6376a() {
        int i = this.f5552b;
        while (true) {
            boolean z = false;
            if (i < this.f5551a.length()) {
                char charAt = this.f5551a.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i++;
                } else {
                    this.f5552b = i;
                    if (((charAt == '}' || charAt == ']') || charAt == ':') || charAt == ',') {
                        z = true;
                    }
                    return !z;
                }
            } else {
                this.f5552b = i;
                return false;
            }
        }
    }

    /* renamed from: b */
    public final String mo6377b() {
        int i;
        String str;
        mo6380e('\"');
        int i2 = this.f5552b;
        int Y = C1209l.m3444Y(this.f5551a, '\"', i2, false, 4);
        if (Y != -1) {
            if (i2 < Y) {
                int i3 = i2;
                while (true) {
                    int i4 = i + 1;
                    if (this.f5551a.charAt(i) == '\\') {
                        int i5 = this.f5552b;
                        String str2 = this.f5551a;
                        char charAt = str2.charAt(i);
                        int i6 = i5;
                        while (charAt != '\"') {
                            if (charAt == '\\') {
                                this.f5554d.append(this.f5551a, i6, i);
                                int i7 = i + 1;
                                i6 = i7 + 1;
                                char charAt2 = this.f5551a.charAt(i7);
                                if (charAt2 == 'u') {
                                    String str3 = this.f5551a;
                                    int i8 = i6 + 4;
                                    if (i8 < str3.length()) {
                                        this.f5554d.append((char) (mo6386l(str3, i6 + 3) + (mo6386l(str3, i6) << 12) + (mo6386l(str3, i6 + 1) << 8) + (mo6386l(str3, i6 + 2) << 4)));
                                        i6 = i8;
                                    } else {
                                        mo6384i("Unexpected EOF during unicode escape", this.f5552b);
                                        throw null;
                                    }
                                } else {
                                    char c = charAt2 < 'u' ? C1859b.f5548b[charAt2] : 0;
                                    if (c != 0) {
                                        this.f5554d.append(c);
                                    } else {
                                        mo6384i("Invalid escaped char '" + charAt2 + '\'', this.f5552b);
                                        throw null;
                                    }
                                }
                                i = i6;
                            } else {
                                i++;
                                if (i >= str2.length()) {
                                    mo6384i("EOF", i);
                                    throw null;
                                }
                            }
                            charAt = str2.charAt(i);
                        }
                        if (i6 == i5) {
                            str = str2.substring(i6, i);
                            C1241e.m3516f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            this.f5554d.append(this.f5551a, i6, i);
                            str = this.f5554d.toString();
                            C1241e.m3516f(str, "escapedString.toString()");
                            this.f5554d.setLength(0);
                        }
                        this.f5552b = i + 1;
                        return str;
                    } else if (i4 >= Y) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.f5552b = Y + 1;
            String str4 = this.f5551a;
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            String substring = str4.substring(i2, Y);
            C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        mo6385j((byte) 1);
        throw null;
    }

    /* renamed from: c */
    public final byte mo6378c() {
        String str = this.f5551a;
        while (this.f5552b < str.length()) {
            int i = this.f5552b;
            this.f5552b = i + 1;
            byte g = C1320u.m3703g(str.charAt(i));
            if (g != 3) {
                return g;
            }
        }
        return 10;
    }

    /* renamed from: d */
    public final byte mo6379d(byte b) {
        byte c = mo6378c();
        if (c == b) {
            return c;
        }
        mo6385j(b);
        throw null;
    }

    /* renamed from: e */
    public final void mo6380e(char c) {
        String str = this.f5551a;
        while (this.f5552b < str.length()) {
            int i = this.f5552b;
            this.f5552b = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 10 && charAt != 13 && charAt != 9) {
                if (charAt != c) {
                    mo6391q(c);
                    throw null;
                }
                return;
            }
        }
        mo6391q(c);
        throw null;
    }

    /* renamed from: f */
    public final String mo6381f() {
        String str = this.f5553c;
        if (str == null) {
            return mo6377b();
        }
        this.f5553c = null;
        return str;
    }

    /* renamed from: g */
    public final String mo6382g() {
        String str = this.f5553c;
        if (str != null) {
            this.f5553c = null;
            return str;
        }
        int n = mo6388n();
        if (n < this.f5551a.length()) {
            byte g = C1320u.m3703g(this.f5551a.charAt(n));
            if (g == 1) {
                return mo6381f();
            }
            if (g == 0) {
                while (n < this.f5551a.length() && C1320u.m3703g(this.f5551a.charAt(n)) == 0) {
                    n++;
                }
                String str2 = this.f5551a;
                int i = this.f5552b;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String substring = str2.substring(i, n);
                C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                this.f5552b = n;
                return substring;
            }
            mo6384i(C1241e.m3522p("Expected beginning of the string, but got ", Character.valueOf(this.f5551a.charAt(n))), this.f5552b);
            throw null;
        }
        mo6384i("EOF", n);
        throw null;
    }

    /* renamed from: h */
    public final String mo6383h() {
        String g = mo6382g();
        if (!C1241e.m3513b(g, "null")) {
            return g;
        }
        mo6384i("Unexpected 'null' value instead of string literal", this.f5552b);
        throw null;
    }

    /* renamed from: i */
    public final Void mo6384i(String str, int i) {
        C1241e.m3517j(str, "message");
        throw C1320u.m3699c(i, str, this.f5551a);
    }

    /* renamed from: j */
    public final void mo6385j(byte b) {
        int i;
        String str = b == 1 ? "quotation mark '\"'" : b == 4 ? "comma ','" : b == 5 ? "semicolon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : "valid token";
        String valueOf = (this.f5552b == this.f5551a.length() || (i = this.f5552b) <= 0) ? "EOF" : String.valueOf(this.f5551a.charAt(i - 1));
        mo6384i("Expected " + str + ", but had '" + valueOf + "' instead", this.f5552b - 1);
        throw null;
    }

    /* renamed from: l */
    public final int mo6386l(String str, int i) {
        char charAt = str.charAt(i);
        boolean z = true;
        if ('0' <= charAt && charAt <= '9') {
            return charAt - '0';
        }
        char c = 'a';
        if (!('a' <= charAt && charAt <= 'f')) {
            c = 'A';
            if ('A' > charAt || charAt > 'F') {
                z = false;
            }
            if (!z) {
                mo6384i("Invalid toHexChar char '" + charAt + "' in unicode escape", this.f5552b);
                throw null;
            }
        }
        return (charAt - c) + 10;
    }

    /* renamed from: m */
    public final byte mo6387m() {
        String str = this.f5551a;
        while (this.f5552b < str.length()) {
            char charAt = str.charAt(this.f5552b);
            if (charAt != ' ' && charAt != 10 && charAt != 13 && charAt != 9) {
                return C1320u.m3703g(charAt);
            }
            this.f5552b++;
        }
        return 10;
    }

    /* renamed from: n */
    public final int mo6388n() {
        int i = this.f5552b;
        while (i < this.f5551a.length() && ((r1 = this.f5551a.charAt(i)) == ' ' || r1 == 10 || r1 == 13 || r1 == 9)) {
            i++;
        }
        this.f5552b = i;
        return i;
    }

    /* renamed from: o */
    public final boolean mo6389o() {
        int n = mo6388n();
        if (n == this.f5551a.length() || this.f5551a.charAt(n) != ',') {
            return false;
        }
        this.f5552b++;
        return true;
    }

    /* renamed from: p */
    public final boolean mo6390p() {
        int n = mo6388n();
        int length = this.f5551a.length() - n;
        if (length < 4) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if ("null".charAt(i) != this.f5551a.charAt(i + n)) {
                return true;
            }
            if (i2 <= 3) {
                i = i2;
            } else if (length > 4 && C1320u.m3703g(this.f5551a.charAt(n + 4)) == 0) {
                return true;
            } else {
                this.f5552b = n + 4;
                return false;
            }
        }
    }

    /* renamed from: q */
    public final void mo6391q(char c) {
        this.f5552b--;
        if (c != '\"' || !C1241e.m3513b(mo6382g(), "null")) {
            mo6385j(C1320u.m3703g(c));
            throw null;
        } else {
            mo6384i("Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.f5552b - 4);
            throw null;
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("JsonReader(source='");
        a.append(this.f5551a);
        a.append("', currentPosition=");
        a.append(this.f5552b);
        a.append(')');
        return a.toString();
    }
}
