package p155j$.time.format;

/* renamed from: j$.time.format.o */
class C2257o extends C2258p {
    private C2257o(String str, String str2, C2258p pVar) {
        super(str, str2, pVar, (C2244c) null);
    }

    C2257o(String str, String str2, C2258p pVar, C2244c cVar) {
        super(str, (String) null, (C2258p) null, (C2244c) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6936c(char c, char c2) {
        return C2266x.m5903c(c, c2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2258p mo6937e(String str, String str2, C2258p pVar) {
        return new C2257o(str, str2, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo6938h(CharSequence charSequence, int i, int i2) {
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
            if (!C2266x.m5903c(this.f6450a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
