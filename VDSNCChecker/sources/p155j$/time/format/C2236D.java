package p155j$.time.format;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.D */
public final class C2236D {

    /* renamed from: a */
    public static final C2236D f6386a = new C2236D('0', '+', '-', '.');

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C2236D(char c, char c2, char c3, char c4) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo6874a(String str) {
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6875b(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    /* renamed from: c */
    public char mo6876c() {
        return '.';
    }

    /* renamed from: d */
    public char mo6877d() {
        return '-';
    }

    /* renamed from: e */
    public char mo6878e() {
        return '+';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2236D)) {
            return false;
        }
        Objects.requireNonNull((C2236D) obj);
        return true;
    }

    /* renamed from: f */
    public char mo6880f() {
        return '0';
    }

    public int hashCode() {
        return 182;
    }

    public String toString() {
        return "DecimalStyle[0+-.]";
    }
}
