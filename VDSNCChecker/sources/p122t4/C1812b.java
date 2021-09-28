package p122t4;

import java.io.IOException;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;
import p000a.C0001b;
import p063k.C1142f;

/* renamed from: t4.b */
public class C1812b {

    /* renamed from: e */
    public static final Pattern f5469e = Pattern.compile("true|false");

    /* renamed from: f */
    public static final Pattern f5470f = Pattern.compile("-?[0-9]+(\\.[0-9]+)?([eE][-+]?[0-9]+)?");

    /* renamed from: a */
    public int f5471a;

    /* renamed from: b */
    public int f5472b;

    /* renamed from: c */
    public String f5473c;

    /* renamed from: d */
    public Object f5474d;

    public C1812b(String str) {
        Object obj;
        int i;
        String str2;
        this.f5473c = str;
        this.f5472b = str.length();
        if (mo6156i() == '[') {
            mo6154g();
            obj = mo6150c();
        } else {
            mo6155h('{');
            obj = mo6152e();
        }
        this.f5474d = obj;
        do {
            i = this.f5471a;
            if (i < this.f5472b) {
                str2 = this.f5473c;
                this.f5471a = i + 1;
            } else {
                return;
            }
        } while (mo6148a(str2.charAt(i)));
        throw new IOException("Improperly terminated JSON object");
    }

    /* renamed from: a */
    public boolean mo6148a(char c) {
        return c == ' ' || c == 10 || c == 13 || c == 9;
    }

    /* renamed from: b */
    public char mo6149b() {
        int i = this.f5471a;
        if (i < this.f5472b) {
            String str = this.f5473c;
            this.f5471a = i + 1;
            return str.charAt(i);
        }
        throw new IOException("Unexpected EOF reached");
    }

    /* renamed from: c */
    public Object mo6150c() {
        Vector vector = new Vector();
        boolean z = false;
        while (mo6156i() != ']') {
            if (z) {
                mo6155h(',');
            } else {
                z = true;
            }
            vector.add(mo6151d());
        }
        mo6154g();
        return vector;
    }

    /* renamed from: d */
    public Object mo6151d() {
        char g = mo6154g();
        if (g == '\"') {
            return mo6153f();
        }
        if (g == '[') {
            return mo6150c();
        }
        if (g == '{') {
            return mo6152e();
        }
        this.f5471a--;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char i = mo6156i();
            if (i == ',' || i == ']' || i == '}') {
                break;
            }
            char b = mo6149b();
            if (mo6148a(b)) {
                break;
            }
            sb.append(b);
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            throw new IOException("Missing argument");
        } else if (f5470f.matcher(sb2).matches()) {
            return Double.valueOf(sb2);
        } else {
            if (f5469e.matcher(sb2).matches()) {
                return new Boolean(sb2);
            }
            if (sb2.equals("null")) {
                return null;
            }
            throw new IOException(C1142f.m3365a("Unrecognized or malformed JSON token: ", sb2));
        }
    }

    /* renamed from: e */
    public Object mo6152e() {
        TreeMap treeMap = new TreeMap();
        boolean z = false;
        while (mo6156i() != '}') {
            if (z) {
                mo6155h(',');
            }
            z = true;
            mo6155h('\"');
            String f = mo6153f();
            mo6155h(':');
            if (treeMap.put(f, mo6151d()) != null) {
                throw new IOException(C1142f.m3365a("Duplicate property: ", f));
            }
        }
        mo6154g();
        return treeMap;
    }

    /* renamed from: f */
    public String mo6153f() {
        String str;
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char b = mo6149b();
            if (b < ' ') {
                if (b == 10) {
                    str = "Unterminated string literal";
                } else {
                    StringBuilder a = C0001b.m0a("Unescaped control character: 0x");
                    a.append(Integer.toString(b, 16));
                    str = a.toString();
                }
                throw new IOException(str);
            } else if (b == '\"') {
                return sb.toString();
            } else {
                if (!(b != '\\' || (b = mo6149b()) == '\"' || b == '/' || b == '\\')) {
                    if (b == 'b') {
                        b = 8;
                    } else if (b == 'f') {
                        b = 12;
                    } else if (b == 'n') {
                        b = 10;
                    } else if (b == 'r') {
                        b = 13;
                    } else if (b == 't') {
                        b = 9;
                    } else if (b == 'u') {
                        char c = 0;
                        for (int i3 = 0; i3 < 4; i3++) {
                            int i4 = c << 4;
                            char b2 = mo6149b();
                            switch (b2) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i = b2 - '0';
                                    break;
                                default:
                                    switch (b2) {
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                            i2 = b2 - 'A';
                                            break;
                                        default:
                                            switch (b2) {
                                                case 'a':
                                                case 'b':
                                                case 'c':
                                                case 'd':
                                                case 'e':
                                                case 'f':
                                                    i2 = b2 - 'a';
                                                    break;
                                                default:
                                                    throw new IOException("Bad hex in \\u escape: " + b2);
                                            }
                                    }
                                    i = i2 + 10;
                                    break;
                            }
                            c = (char) (i4 + ((char) i));
                        }
                        b = c;
                    } else {
                        throw new IOException("Unsupported escape:" + b);
                    }
                }
                sb.append(b);
            }
        }
    }

    /* renamed from: g */
    public char mo6154g() {
        char b;
        do {
            b = mo6149b();
        } while (mo6148a(b));
        return b;
    }

    /* renamed from: h */
    public void mo6155h(char c) {
        char g = mo6154g();
        if (g != c) {
            throw new IOException("Expected '" + c + "' but got '" + g + "'");
        }
    }

    /* renamed from: i */
    public char mo6156i() {
        int i = this.f5471a;
        char g = mo6154g();
        this.f5471a = i;
        return g;
    }
}
