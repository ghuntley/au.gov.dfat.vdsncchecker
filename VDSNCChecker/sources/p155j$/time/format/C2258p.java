package p155j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j$.time.format.p */
class C2258p {

    /* renamed from: a */
    protected String f6450a;

    /* renamed from: b */
    protected String f6451b;

    /* renamed from: c */
    protected char f6452c;

    /* renamed from: d */
    protected C2258p f6453d;

    /* renamed from: e */
    protected C2258p f6454e;

    private C2258p(String str, String str2, C2258p pVar) {
        this.f6450a = str;
        this.f6451b = str2;
        this.f6453d = pVar;
        this.f6452c = str.length() == 0 ? 65535 : this.f6450a.charAt(0);
    }

    /* synthetic */ C2258p(String str, String str2, C2258p pVar, C2244c cVar) {
        this(str, str2, pVar);
    }

    /* renamed from: b */
    private boolean m5876b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f6450a.length() && mo6936c(str.charAt(i), this.f6450a.charAt(i))) {
            i++;
        }
        if (i != this.f6450a.length()) {
            C2258p e = mo6937e(this.f6450a.substring(i), this.f6451b, this.f6453d);
            this.f6450a = str.substring(0, i);
            this.f6453d = e;
            if (i < str.length()) {
                this.f6453d.f6454e = mo6937e(str.substring(i), str2, (C2258p) null);
                this.f6451b = null;
            } else {
                this.f6451b = str2;
            }
            return true;
        } else if (i < str.length()) {
            String substring = str.substring(i);
            for (C2258p pVar = this.f6453d; pVar != null; pVar = pVar.f6454e) {
                if (mo6936c(pVar.f6452c, substring.charAt(0))) {
                    return pVar.m5876b(substring, str2);
                }
            }
            C2258p e2 = mo6937e(substring, str2, (C2258p) null);
            e2.f6454e = this.f6453d;
            this.f6453d = e2;
            return true;
        } else {
            this.f6451b = str2;
            return true;
        }
    }

    /* renamed from: f */
    public static C2258p m5877f(C2266x xVar) {
        return xVar.mo6955k() ? new C2258p("", (String) null, (C2258p) null) : new C2257o("", (String) null, (C2258p) null, (C2244c) null);
    }

    /* renamed from: g */
    public static C2258p m5878g(Set set, C2266x xVar) {
        C2258p f = m5877f(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.m5876b(str, str);
        }
        return f;
    }

    /* renamed from: a */
    public boolean mo6939a(String str, String str2) {
        return m5876b(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6936c(char c, char c2) {
        return c == c2;
    }

    /* renamed from: d */
    public String mo6940d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo6938h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f6450a.length() + index;
        C2258p pVar = this.f6453d;
        if (pVar != null && length2 != length) {
            while (true) {
                if (!mo6936c(pVar.f6452c, charSequence.charAt(length2))) {
                    pVar = pVar.f6454e;
                    if (pVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d = pVar.mo6940d(charSequence, parsePosition);
                    if (d != null) {
                        return d;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f6451b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2258p mo6937e(String str, String str2, C2258p pVar) {
        return new C2258p(str, str2, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo6938h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f6450a, i);
        }
        int length = this.f6450a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo6936c(this.f6450a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
